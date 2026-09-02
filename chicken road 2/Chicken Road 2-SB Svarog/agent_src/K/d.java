package K;

import F.J;
import G.f;
import G.g;
import a.AbstractC0018a;
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
    public boolean f275a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f276b;

    /* renamed from: c, reason: collision with root package name */
    public C.b f277c;

    /* renamed from: d, reason: collision with root package name */
    public long f278d;

    /* renamed from: e, reason: collision with root package name */
    public a f279e;

    /* renamed from: f, reason: collision with root package name */
    public FlutterJNI f280f;

    /* renamed from: g, reason: collision with root package name */
    public ExecutorService f281g;

    /* renamed from: h, reason: collision with root package name */
    public Future f282h;

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
            arrayList.add(0, g.f190a.f187a + str2);
            return;
        }
        Log.e("FlutterLoader", "Skipping unsafe AOT shared library name flag: " + str + ". Please ensure that the library is vetted and placed in your application's internal storage.");
    }

    public final void a(Context context, String[] strArr) {
        boolean z2;
        boolean z3;
        Iterator it;
        if (this.f276b) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
        }
        if (this.f277c == null) {
            throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
        }
        try {
            V.a.b("FlutterLoader#ensureInitializationComplete");
            try {
                c cVar = (c) this.f282h.get();
                ArrayList arrayList = new ArrayList();
                arrayList.add("--icu-symbol-prefix=_binary_icudtl_dat");
                arrayList.add("--icu-native-lib-path=" + this.f279e.f269d + File.separator + "libflutter.so");
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                if (bundle != null) {
                    z2 = false;
                    z3 = false;
                    for (Iterator it2 = g.f200k.iterator(); it2.hasNext(); it2 = it) {
                        f fVar = (f) it2.next();
                        String str = fVar.f188b;
                        if (bundle.containsKey(str)) {
                            if (fVar == g.f198i) {
                                Log.w("FlutterLoader", "For testing purposes only: test flag specified in the manifest was loaded by the FlutterLoader.");
                            } else {
                                if (g.f201l.contains(fVar)) {
                                    throw new IllegalArgumentException(str + " is disabled and no longer allowed. Please remove this flag from your application manifest.");
                                }
                                J j2 = g.f202m;
                                if (((f) j2.get(fVar)) != null) {
                                    StringBuilder sb = new StringBuilder();
                                    it = it2;
                                    sb.append("If you are trying to specify ");
                                    sb.append(str);
                                    sb.append(" in your application manifest, please make sure to use the new metadata key name: ");
                                    sb.append(((f) j2.get(fVar)).f188b);
                                    Log.w("FlutterLoader", sb.toString());
                                } else {
                                    it = it2;
                                    if (!fVar.f189c) {
                                        Log.e("FlutterLoader", "Flag with metadata key " + str + " is not allowed in release builds and will be ignored if specified in the application manifest or via the command line.");
                                    }
                                }
                                if (fVar == g.f194e) {
                                    z2 = true;
                                } else if (fVar == g.f199j) {
                                    z3 = true;
                                } else {
                                    f fVar2 = g.f197h;
                                    if (fVar == fVar2) {
                                        this.f275a = bundle.getBoolean(fVar2.f188b, false);
                                    } else {
                                        if (fVar != g.f190a) {
                                            if (fVar == g.f191b) {
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
                                String str2 = fVar.f187a;
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
                        f a2 = g.a(str3);
                        if (a2 == null) {
                            arrayList.add(str3);
                        } else if (a2.equals(g.f198i)) {
                            Log.w("FlutterLoader", "For testing purposes only: test flag specified on the command line was loaded by the FlutterLoader.");
                        } else {
                            f fVar3 = g.f190a;
                            if (!a2.equals(fVar3) && !a2.equals(g.f191b)) {
                                if (a2.f189c) {
                                    arrayList.add(str3);
                                } else {
                                    Log.e("FlutterLoader", "Command line argument " + str3 + " is not allowed in release builds and will be ignored if specified in the application manifest or via the command line.");
                                }
                            }
                            c(context, str3.substring(fVar3.f187a.length()), arrayList);
                        }
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                f fVar4 = g.f190a;
                sb2.append(fVar4.f187a);
                sb2.append(this.f279e.f266a);
                arrayList.add(sb2.toString());
                arrayList.add(fVar4.f187a + this.f279e.f269d + File.separator + this.f279e.f266a);
                StringBuilder sb3 = new StringBuilder();
                sb3.append("--cache-dir-path=");
                sb3.append(cVar.f274b);
                arrayList.add(sb3.toString());
                String str4 = this.f279e.f268c;
                arrayList.add("--domain-network-policy=" + this.f279e.f268c);
                this.f277c.getClass();
                if (!z2) {
                    ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(new ActivityManager.MemoryInfo());
                    arrayList.add(g.f194e.f187a + String.valueOf((int) ((r2.totalMem / 1000000.0d) / 2.0d)));
                }
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                arrayList.add("--resource-cache-max-bytes-threshold=" + (displayMetrics.widthPixels * displayMetrics.heightPixels * 48));
                arrayList.add("--prefetched-default-font-manager");
                if (!z3) {
                    arrayList.add(g.f199j.f187a + "true");
                }
                this.f280f.init(context, (String[]) arrayList.toArray(new String[0]), null, cVar.f273a, cVar.f274b, SystemClock.uptimeMillis() - this.f278d, Build.VERSION.SDK_INT);
                this.f276b = true;
                Trace.endSection();
            } finally {
            }
        } catch (Exception e2) {
            Log.e("FlutterLoader", "Flutter initialization failed.", e2);
            throw new RuntimeException(e2);
        }
    }

    public final void d(Context context) {
        C.b bVar = new C.b(5);
        if (this.f277c != null) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("startInitialization must be called on the main thread");
        }
        V.a.b("FlutterLoader#startInitialization");
        try {
            Context applicationContext = context.getApplicationContext();
            this.f277c = bVar;
            this.f278d = SystemClock.uptimeMillis();
            this.f279e = AbstractC0018a.p(applicationContext);
            t a2 = t.a((DisplayManager) applicationContext.getSystemService("display"), this.f280f);
            a2.f849b.setAsyncWaitForVsyncDelegate(a2.f851d);
            this.f282h = this.f281g.submit(new b(this, applicationContext));
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
