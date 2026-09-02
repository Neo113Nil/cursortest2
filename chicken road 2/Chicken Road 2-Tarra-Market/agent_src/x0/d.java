package x0;

import N.i;
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
import io.flutter.view.t;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f6787a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6788b;

    /* renamed from: c, reason: collision with root package name */
    public i f6789c;

    /* renamed from: d, reason: collision with root package name */
    public long f6790d;

    /* renamed from: e, reason: collision with root package name */
    public C0860a f6791e;

    /* renamed from: f, reason: collision with root package name */
    public FlutterJNI f6792f;

    /* renamed from: g, reason: collision with root package name */
    public ExecutorService f6793g;

    /* renamed from: h, reason: collision with root package name */
    public Future f6794h;

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
        } catch (IOException e2) {
            Log.e("FlutterLoader", "Error while validating AOT shared library name flag: " + str, e2);
            str2 = null;
        }
        if (str2 != null) {
            arrayList.add(0, t0.d.f6667a.f6664a + str2);
            return;
        }
        Log.e("FlutterLoader", "Skipping unsafe AOT shared library name flag: " + str + ". Please ensure that the library is vetted and placed in your application's internal storage.");
    }

    public final void a(Context context, String[] strArr) {
        boolean z2;
        boolean z3;
        Iterator it;
        if (this.f6788b) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
        }
        if (this.f6789c == null) {
            throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
        }
        try {
            J0.a.b("FlutterLoader#ensureInitializationComplete");
            try {
                C0862c c0862c = (C0862c) this.f6794h.get();
                ArrayList arrayList = new ArrayList();
                arrayList.add("--icu-symbol-prefix=_binary_icudtl_dat");
                arrayList.add("--icu-native-lib-path=" + this.f6791e.f6781d + File.separator + "libflutter.so");
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                if (bundle != null) {
                    z2 = false;
                    z3 = false;
                    for (Iterator it2 = t0.d.f6677k.iterator(); it2.hasNext(); it2 = it) {
                        t0.c cVar = (t0.c) it2.next();
                        String str = cVar.f6665b;
                        if (bundle.containsKey(str)) {
                            if (cVar == t0.d.f6675i) {
                                Log.w("FlutterLoader", "For testing purposes only: test flag specified in the manifest was loaded by the FlutterLoader.");
                            } else {
                                if (t0.d.f6678l.contains(cVar)) {
                                    throw new IllegalArgumentException(str + " is disabled and no longer allowed. Please remove this flag from your application manifest.");
                                }
                                F0.a aVar = t0.d.f6679m;
                                if (((t0.c) aVar.get(cVar)) != null) {
                                    StringBuilder sb = new StringBuilder();
                                    it = it2;
                                    sb.append("If you are trying to specify ");
                                    sb.append(str);
                                    sb.append(" in your application manifest, please make sure to use the new metadata key name: ");
                                    sb.append(((t0.c) aVar.get(cVar)).f6665b);
                                    Log.w("FlutterLoader", sb.toString());
                                } else {
                                    it = it2;
                                    if (!cVar.f6666c) {
                                        Log.e("FlutterLoader", "Flag with metadata key " + str + " is not allowed in release builds and will be ignored if specified in the application manifest or via the command line.");
                                    }
                                }
                                if (cVar == t0.d.f6671e) {
                                    z2 = true;
                                } else if (cVar == t0.d.f6676j) {
                                    z3 = true;
                                } else {
                                    t0.c cVar2 = t0.d.f6674h;
                                    if (cVar == cVar2) {
                                        this.f6787a = bundle.getBoolean(cVar2.f6665b, false);
                                    } else {
                                        if (cVar != t0.d.f6667a) {
                                            if (cVar == t0.d.f6668b) {
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
                                String str2 = cVar.f6664a;
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
                    z2 = false;
                    z3 = false;
                }
                if (strArr != null) {
                    for (String str3 : strArr) {
                        t0.c a2 = t0.d.a(str3);
                        if (a2 == null) {
                            arrayList.add(str3);
                        } else if (a2.equals(t0.d.f6675i)) {
                            Log.w("FlutterLoader", "For testing purposes only: test flag specified on the command line was loaded by the FlutterLoader.");
                        } else {
                            t0.c cVar3 = t0.d.f6667a;
                            if (!a2.equals(cVar3) && !a2.equals(t0.d.f6668b)) {
                                if (a2.f6666c) {
                                    arrayList.add(str3);
                                } else {
                                    Log.e("FlutterLoader", "Command line argument " + str3 + " is not allowed in release builds and will be ignored if specified in the application manifest or via the command line.");
                                }
                            }
                            c(context, str3.substring(cVar3.f6664a.length()), arrayList);
                        }
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                t0.c cVar4 = t0.d.f6667a;
                sb2.append(cVar4.f6664a);
                sb2.append(this.f6791e.f6778a);
                arrayList.add(sb2.toString());
                arrayList.add(cVar4.f6664a + this.f6791e.f6781d + File.separator + this.f6791e.f6778a);
                StringBuilder sb3 = new StringBuilder();
                sb3.append("--cache-dir-path=");
                sb3.append(c0862c.f6786b);
                arrayList.add(sb3.toString());
                String str4 = this.f6791e.f6780c;
                arrayList.add("--domain-network-policy=" + this.f6791e.f6780c);
                this.f6789c.getClass();
                if (!z2) {
                    ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(new ActivityManager.MemoryInfo());
                    arrayList.add(t0.d.f6671e.f6664a + String.valueOf((int) ((r3.totalMem / 1000000.0d) / 2.0d)));
                }
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                arrayList.add("--resource-cache-max-bytes-threshold=" + (displayMetrics.widthPixels * displayMetrics.heightPixels * 48));
                arrayList.add("--prefetched-default-font-manager");
                if (!z3) {
                    arrayList.add(t0.d.f6676j.f6664a + "true");
                }
                this.f6792f.init(context, (String[]) arrayList.toArray(new String[0]), null, c0862c.f6785a, c0862c.f6786b, SystemClock.uptimeMillis() - this.f6790d, Build.VERSION.SDK_INT);
                this.f6788b = true;
                Trace.endSection();
            } finally {
            }
        } catch (Exception e2) {
            Log.e("FlutterLoader", "Flutter initialization failed.", e2);
            throw new RuntimeException(e2);
        }
    }

    public final void d(Context context) {
        i iVar = new i(20);
        if (this.f6789c != null) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("startInitialization must be called on the main thread");
        }
        J0.a.b("FlutterLoader#startInitialization");
        try {
            Context applicationContext = context.getApplicationContext();
            this.f6789c = iVar;
            this.f6790d = SystemClock.uptimeMillis();
            this.f6791e = V.a.q(applicationContext);
            t a2 = t.a((DisplayManager) applicationContext.getSystemService("display"), this.f6792f);
            a2.f6041b.setAsyncWaitForVsyncDelegate(a2.f6043d);
            this.f6794h = this.f6793g.submit(new CallableC0861b(this, applicationContext));
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
