package B2;

import android.app.ActivityManager;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.util.DisplayMetrics;
import android.util.Log;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.r;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import l1.j;
import x2.AbstractC1541d;
import x2.C1540c;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public boolean f251a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f252b;

    /* renamed from: c, reason: collision with root package name */
    public j f253c;

    /* renamed from: d, reason: collision with root package name */
    public long f254d;

    /* renamed from: e, reason: collision with root package name */
    public a f255e;

    /* renamed from: f, reason: collision with root package name */
    public FlutterJNI f256f;

    /* renamed from: g, reason: collision with root package name */
    public ExecutorService f257g;

    /* renamed from: h, reason: collision with root package name */
    public Future f258h;

    public static String b(Context context, String str) {
        File file = new File(str);
        try {
            String canonicalPath = file.getCanonicalPath();
            boolean startsWith = canonicalPath.startsWith(context.getApplicationContext().getFilesDir().getCanonicalPath() + File.separator);
            boolean endsWith = canonicalPath.endsWith(".so");
            if (startsWith && endsWith) {
                return canonicalPath;
            }
            Log.e("FlutterLoader", "External path " + canonicalPath + " rejected; not overriding aot-shared-library-name.");
            return null;
        } catch (IOException unused) {
            Log.e("FlutterLoader", "External path " + file.getPath() + " is not a valid path. Please ensure this shared AOT library exists.");
            return null;
        }
    }

    public static void c(Context context, String str, ArrayList arrayList) {
        String str2;
        try {
            str2 = b(context, str);
        } catch (IOException e3) {
            Log.e("FlutterLoader", "Error while validating AOT shared library name flag: " + str, e3);
            str2 = null;
        }
        if (str2 != null) {
            arrayList.add(0, AbstractC1541d.f12274a.f12271a + str2);
            return;
        }
        Log.e("FlutterLoader", "Skipping unsafe AOT shared library name flag: " + str + ". Please ensure that the library is vetted and placed in your application's internal storage.");
    }

    public final void a(Context context, String[] strArr) {
        boolean z;
        boolean z5;
        Iterator it;
        if (this.f252b) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
        }
        if (this.f253c == null) {
            throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
        }
        try {
            O2.a.b("FlutterLoader#ensureInitializationComplete");
            try {
                d dVar = (d) this.f258h.get();
                ArrayList arrayList = new ArrayList();
                arrayList.add("--icu-symbol-prefix=_binary_icudtl_dat");
                arrayList.add("--icu-native-lib-path=" + ((String) this.f255e.f243e) + File.separator + "libflutter.so");
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                if (bundle != null) {
                    z = false;
                    z5 = false;
                    for (Iterator it2 = AbstractC1541d.f12284k.iterator(); it2.hasNext(); it2 = it) {
                        C1540c c1540c = (C1540c) it2.next();
                        String str = c1540c.f12272b;
                        if (bundle.containsKey(str)) {
                            if (c1540c == AbstractC1541d.f12282i) {
                                Log.w("FlutterLoader", "For testing purposes only: test flag specified in the manifest was loaded by the FlutterLoader.");
                            } else {
                                if (AbstractC1541d.f12285l.contains(c1540c)) {
                                    throw new IllegalArgumentException(str + " is disabled and no longer allowed. Please remove this flag from your application manifest.");
                                }
                                J2.a aVar = AbstractC1541d.f12286m;
                                if (((C1540c) aVar.get(c1540c)) != null) {
                                    StringBuilder sb = new StringBuilder();
                                    it = it2;
                                    sb.append("If you are trying to specify ");
                                    sb.append(str);
                                    sb.append(" in your application manifest, please make sure to use the new metadata key name: ");
                                    sb.append(((C1540c) aVar.get(c1540c)).f12272b);
                                    Log.w("FlutterLoader", sb.toString());
                                } else {
                                    it = it2;
                                    if (!c1540c.f12273c) {
                                        Log.e("FlutterLoader", "Flag with metadata key " + str + " is not allowed in release builds and will be ignored if specified in the application manifest or via the command line.");
                                    }
                                }
                                if (c1540c == AbstractC1541d.f12278e) {
                                    z = true;
                                } else if (c1540c == AbstractC1541d.f12283j) {
                                    z5 = true;
                                } else {
                                    C1540c c1540c2 = AbstractC1541d.f12281h;
                                    if (c1540c == c1540c2) {
                                        this.f251a = bundle.getBoolean(c1540c2.f12272b, false);
                                    } else {
                                        if (c1540c != AbstractC1541d.f12274a) {
                                            if (c1540c == AbstractC1541d.f12275b) {
                                            }
                                        }
                                        String string = bundle.getString(str);
                                        if (string == null) {
                                            Log.e("FlutterLoader", "Flag " + str + " was specified with an empty path. Please specify a path to the desired AOT shared library.");
                                        } else {
                                            c(context, string, arrayList);
                                        }
                                    }
                                }
                                String str2 = c1540c.f12271a;
                                if (str2.endsWith("=")) {
                                    Object obj = bundle.get(str);
                                    String obj2 = obj != null ? obj.toString() : null;
                                    if (obj2 == null) {
                                        Log.e("FlutterLoader", "Flag with metadata key " + str + " requires a value, but no value was found. Please specify a value.");
                                    } else {
                                        arrayList.add(str2 + obj2);
                                    }
                                } else if (bundle.getBoolean(str, false)) {
                                    arrayList.add(str2);
                                }
                            }
                        }
                        it = it2;
                    }
                } else {
                    z = false;
                    z5 = false;
                }
                if (strArr != null) {
                    for (String str3 : strArr) {
                        C1540c a6 = AbstractC1541d.a(str3);
                        if (a6 == null) {
                            arrayList.add(str3);
                        } else if (a6.equals(AbstractC1541d.f12282i)) {
                            Log.w("FlutterLoader", "For testing purposes only: test flag specified on the command line was loaded by the FlutterLoader.");
                        } else {
                            C1540c c1540c3 = AbstractC1541d.f12274a;
                            if (!a6.equals(c1540c3) && !a6.equals(AbstractC1541d.f12275b)) {
                                if (a6.f12273c) {
                                    arrayList.add(str3);
                                } else {
                                    Log.e("FlutterLoader", "Command line argument " + str3 + " is not allowed in release builds and will be ignored if specified in the application manifest or via the command line.");
                                }
                            }
                            c(context, str3.substring(c1540c3.f12271a.length()), arrayList);
                        }
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                C1540c c1540c4 = AbstractC1541d.f12274a;
                sb2.append(c1540c4.f12271a);
                sb2.append((String) this.f255e.f240b);
                arrayList.add(sb2.toString());
                arrayList.add(c1540c4.f12271a + ((String) this.f255e.f243e) + File.separator + ((String) this.f255e.f240b));
                StringBuilder sb3 = new StringBuilder();
                sb3.append("--cache-dir-path=");
                sb3.append(dVar.f250b);
                arrayList.add(sb3.toString());
                Object obj3 = this.f255e.f242d;
                arrayList.add("--domain-network-policy=" + ((String) this.f255e.f242d));
                this.f253c.getClass();
                if (!z) {
                    ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(new ActivityManager.MemoryInfo());
                    arrayList.add(AbstractC1541d.f12278e.f12271a + String.valueOf((int) ((r3.totalMem / 1000000.0d) / 2.0d)));
                }
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                arrayList.add("--resource-cache-max-bytes-threshold=" + (displayMetrics.widthPixels * displayMetrics.heightPixels * 48));
                arrayList.add("--prefetched-default-font-manager");
                if (!z5) {
                    arrayList.add(AbstractC1541d.f12283j.f12271a + "true");
                }
                this.f256f.init(context, (String[]) arrayList.toArray(new String[0]), null, dVar.f249a, dVar.f250b, SystemClock.uptimeMillis() - this.f254d, Build.VERSION.SDK_INT);
                this.f252b = true;
                Trace.endSection();
            } finally {
            }
        } catch (Exception e3) {
            Log.e("FlutterLoader", "Flutter initialization failed.", e3);
            throw new RuntimeException(e3);
        }
    }

    public final void d(Context context) {
        j jVar = new j(1);
        if (this.f253c != null) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("startInitialization must be called on the main thread");
        }
        O2.a.b("FlutterLoader#startInitialization");
        try {
            Context applicationContext = context.getApplicationContext();
            this.f253c = jVar;
            this.f254d = SystemClock.uptimeMillis();
            this.f255e = K1.b.X(applicationContext);
            r a6 = r.a((DisplayManager) applicationContext.getSystemService("display"), this.f256f);
            a6.f10399b.setAsyncWaitForVsyncDelegate(a6.f10401d);
            this.f258h = this.f257g.submit(new c(this, applicationContext));
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
