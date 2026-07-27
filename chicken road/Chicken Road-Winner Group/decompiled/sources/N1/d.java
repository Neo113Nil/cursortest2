package N1;

import I1.B;
import J1.e;
import P0.j;
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
import b2.AbstractC0164a;
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
    public boolean f998a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f999b;

    /* renamed from: c, reason: collision with root package name */
    public j f1000c;

    /* renamed from: d, reason: collision with root package name */
    public long f1001d;

    /* renamed from: e, reason: collision with root package name */
    public a f1002e;
    public FlutterJNI f;

    /* renamed from: g, reason: collision with root package name */
    public ExecutorService f1003g;

    /* renamed from: h, reason: collision with root package name */
    public Future f1004h;

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
            arrayList.add(0, e.f706a.f703a + str2);
            return;
        }
        Log.e("FlutterLoader", "Skipping unsafe AOT shared library name flag: " + str + ". Please ensure that the library is vetted and placed in your application's internal storage.");
    }

    public final void a(Context context, String[] strArr) {
        boolean z3;
        boolean z4;
        Iterator it;
        if (this.f999b) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
        }
        if (this.f1000c == null) {
            throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
        }
        try {
            AbstractC0164a.b("FlutterLoader#ensureInitializationComplete");
            try {
                c cVar = (c) this.f1004h.get();
                ArrayList arrayList = new ArrayList();
                arrayList.add("--icu-symbol-prefix=_binary_icudtl_dat");
                arrayList.add("--icu-native-lib-path=" + this.f1002e.f991d + File.separator + "libflutter.so");
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                if (bundle != null) {
                    z3 = false;
                    z4 = false;
                    for (Iterator it2 = e.f715k.iterator(); it2.hasNext(); it2 = it) {
                        J1.d dVar = (J1.d) it2.next();
                        String str = dVar.f704b;
                        if (bundle.containsKey(str)) {
                            if (dVar == e.f713i) {
                                Log.w("FlutterLoader", "For testing purposes only: test flag specified in the manifest was loaded by the FlutterLoader.");
                            } else {
                                if (e.f716l.contains(dVar)) {
                                    throw new IllegalArgumentException(str + " is disabled and no longer allowed. Please remove this flag from your application manifest.");
                                }
                                B b3 = e.f717m;
                                if (((J1.d) b3.get(dVar)) != null) {
                                    StringBuilder sb = new StringBuilder();
                                    it = it2;
                                    sb.append("If you are trying to specify ");
                                    sb.append(str);
                                    sb.append(" in your application manifest, please make sure to use the new metadata key name: ");
                                    sb.append(((J1.d) b3.get(dVar)).f704b);
                                    Log.w("FlutterLoader", sb.toString());
                                } else {
                                    it = it2;
                                    if (!dVar.f705c) {
                                        Log.e("FlutterLoader", "Flag with metadata key " + str + " is not allowed in release builds and will be ignored if specified in the application manifest or via the command line.");
                                    }
                                }
                                if (dVar == e.f710e) {
                                    z3 = true;
                                } else if (dVar == e.f714j) {
                                    z4 = true;
                                } else {
                                    J1.d dVar2 = e.f712h;
                                    if (dVar == dVar2) {
                                        this.f998a = bundle.getBoolean(dVar2.f704b, false);
                                    } else {
                                        if (dVar != e.f706a) {
                                            if (dVar == e.f707b) {
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
                                String str2 = dVar.f703a;
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
                    z3 = false;
                    z4 = false;
                }
                if (strArr != null) {
                    for (String str3 : strArr) {
                        J1.d a3 = e.a(str3);
                        if (a3 == null) {
                            arrayList.add(str3);
                        } else if (a3.equals(e.f713i)) {
                            Log.w("FlutterLoader", "For testing purposes only: test flag specified on the command line was loaded by the FlutterLoader.");
                        } else {
                            J1.d dVar3 = e.f706a;
                            if (!a3.equals(dVar3) && !a3.equals(e.f707b)) {
                                if (a3.f705c) {
                                    arrayList.add(str3);
                                } else {
                                    Log.e("FlutterLoader", "Command line argument " + str3 + " is not allowed in release builds and will be ignored if specified in the application manifest or via the command line.");
                                }
                            }
                            c(context, str3.substring(dVar3.f703a.length()), arrayList);
                        }
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                J1.d dVar4 = e.f706a;
                sb2.append(dVar4.f703a);
                sb2.append(this.f1002e.f988a);
                arrayList.add(sb2.toString());
                arrayList.add(dVar4.f703a + this.f1002e.f991d + File.separator + this.f1002e.f988a);
                StringBuilder sb3 = new StringBuilder();
                sb3.append("--cache-dir-path=");
                sb3.append(cVar.f997b);
                arrayList.add(sb3.toString());
                String str4 = this.f1002e.f990c;
                arrayList.add("--domain-network-policy=" + this.f1002e.f990c);
                this.f1000c.getClass();
                if (!z3) {
                    ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(new ActivityManager.MemoryInfo());
                    arrayList.add(e.f710e.f703a + String.valueOf((int) ((r2.totalMem / 1000000.0d) / 2.0d)));
                }
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                arrayList.add("--resource-cache-max-bytes-threshold=" + (displayMetrics.widthPixels * displayMetrics.heightPixels * 48));
                arrayList.add("--prefetched-default-font-manager");
                if (!z4) {
                    arrayList.add(e.f714j.f703a + "true");
                }
                this.f.init(context, (String[]) arrayList.toArray(new String[0]), null, cVar.f996a, cVar.f997b, SystemClock.uptimeMillis() - this.f1001d, Build.VERSION.SDK_INT);
                this.f999b = true;
                Trace.endSection();
            } finally {
            }
        } catch (Exception e3) {
            Log.e("FlutterLoader", "Flutter initialization failed.", e3);
            throw new RuntimeException(e3);
        }
    }

    public final void d(Context context) {
        j jVar = new j(8);
        if (this.f1000c != null) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("startInitialization must be called on the main thread");
        }
        AbstractC0164a.b("FlutterLoader#startInitialization");
        try {
            Context applicationContext = context.getApplicationContext();
            this.f1000c = jVar;
            this.f1001d = SystemClock.uptimeMillis();
            this.f1002e = X0.a.A(applicationContext);
            t a3 = t.a((DisplayManager) applicationContext.getSystemService("display"), this.f);
            a3.f9467b.setAsyncWaitForVsyncDelegate(a3.f9469d);
            this.f1004h = this.f1003g.submit(new b(this, applicationContext));
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
