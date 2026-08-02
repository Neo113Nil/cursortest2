package com.bumptech.glide;

import android.app.ActivityManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.manager.C0108a;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p000.AbstractC0024an;
import p000.C0089c8;
import p000.C0263gv;
import p000.C0270h1;
import p000.C0884xo;
import p000.C0892xw;
import p000.InterfaceC0318ic;
import p000.ThreadFactoryC0862x2;
import p000.b90;
import p000.kd0;
import p000.kn0;
import p000.m81;
import p000.n11;
import p000.nc1;
import p000.nk0;
import p000.nu1;
import p000.ok0;
import p000.q80;
import p000.sk0;
import p000.t22;
import p000.v80;
import p000.w80;
import p000.wa0;
import p000.zg1;

/* JADX INFO: renamed from: com.bumptech.glide.a */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C0106a implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: q */
    public static volatile ComponentCallbacks2C0106a f1305q;

    /* JADX INFO: renamed from: r */
    public static volatile boolean f1306r;

    /* JADX INFO: renamed from: j */
    public final InterfaceC0318ic f1307j;

    /* JADX INFO: renamed from: k */
    public final sk0 f1308k;

    /* JADX INFO: renamed from: l */
    public final q80 f1309l;

    /* JADX INFO: renamed from: m */
    public final nk0 f1310m;

    /* JADX INFO: renamed from: n */
    public final C0108a f1311n;

    /* JADX INFO: renamed from: o */
    public final wa0 f1312o;

    /* JADX INFO: renamed from: p */
    public final ArrayList f1313p = new ArrayList();

    public ComponentCallbacks2C0106a(Context context, C0892xw c0892xw, sk0 sk0Var, InterfaceC0318ic interfaceC0318ic, nk0 nk0Var, C0108a c0108a, wa0 wa0Var, nc1 nc1Var, C0089c8 c0089c8, List list, ArrayList arrayList, t22 t22Var, b90 b90Var) {
        this.f1307j = interfaceC0318ic;
        this.f1310m = nk0Var;
        this.f1308k = sk0Var;
        this.f1311n = c0108a;
        this.f1312o = wa0Var;
        this.f1309l = new q80(context, nk0Var, new m81(this, arrayList, t22Var), nc1Var, c0089c8, list, c0892xw, b90Var);
    }

    /* JADX INFO: renamed from: a */
    public static ComponentCallbacks2C0106a m983a(Context context) {
        GeneratedAppGlideModule generatedAppGlideModule;
        if (f1305q == null) {
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
                generatedAppGlideModule = null;
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e);
            } catch (InstantiationException e2) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e2);
            } catch (NoSuchMethodException e3) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e3);
            } catch (InvocationTargetException e4) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e4);
            }
            synchronized (ComponentCallbacks2C0106a.class) {
                if (f1305q == null) {
                    if (f1306r) {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                    f1306r = true;
                    try {
                        m984b(context, generatedAppGlideModule);
                        f1306r = false;
                    } catch (Throwable th) {
                        f1306r = false;
                        throw th;
                    }
                }
            }
        }
        return f1305q;
    }

    /* JADX INFO: renamed from: b */
    public static void m984b(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        C0089c8 c0089c8 = new C0089c8(0);
        C0884xo c0884xo = new C0884xo(1);
        nc1 nc1Var = new nc1(29);
        Context applicationContext = context.getApplicationContext();
        List list = Collections.EMPTY_LIST;
        if (Log.isLoggable("ManifestParser", 3)) {
            Log.d("ManifestParser", "Loading Glide modules");
        }
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
            if (applicationInfo != null && applicationInfo.metaData != null) {
                if (Log.isLoggable("ManifestParser", 2)) {
                    Log.v("ManifestParser", "Got app info metadata: " + applicationInfo.metaData);
                }
                for (String str : applicationInfo.metaData.keySet()) {
                    if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                        kd0.m3012j(str);
                        throw null;
                    }
                }
                if (Log.isLoggable("ManifestParser", 3)) {
                    Log.d("ManifestParser", "Finished loading Glide modules");
                }
            } else if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Got null app info metadata");
            }
        } catch (PackageManager.NameNotFoundException e) {
            if (Log.isLoggable("ManifestParser", 6)) {
                Log.e("ManifestParser", "Failed to parse glide modules", e);
            }
        }
        if (generatedAppGlideModule != null && !new HashSet().isEmpty()) {
            new HashSet();
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                throw AbstractC0024an.m280c(it);
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                throw AbstractC0024an.m280c(it2);
            }
        }
        Iterator it3 = arrayList.iterator();
        if (it3.hasNext()) {
            throw AbstractC0024an.m280c(it3);
        }
        ThreadFactoryC0862x2 threadFactoryC0862x2 = new ThreadFactoryC0862x2(1);
        if (w80.f8456k == 0) {
            w80.f8456k = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        int i = w80.f8456k;
        if (TextUtils.isEmpty("source")) {
            C0270h1.m2190f("Name must be non-null and non-empty, but given: source");
            return;
        }
        PriorityBlockingQueue priorityBlockingQueue = new PriorityBlockingQueue();
        v80 v80Var = new v80(threadFactoryC0862x2, "source", false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        w80 w80Var = new w80(new ThreadPoolExecutor(i, i, 0L, timeUnit, priorityBlockingQueue, v80Var));
        ThreadFactoryC0862x2 threadFactoryC0862x3 = new ThreadFactoryC0862x2(1);
        if (TextUtils.isEmpty("disk-cache")) {
            C0270h1.m2190f("Name must be non-null and non-empty, but given: disk-cache");
            return;
        }
        w80 w80Var2 = new w80(new ThreadPoolExecutor(1, 1, 0L, timeUnit, new PriorityBlockingQueue(), new v80(threadFactoryC0862x3, "disk-cache", true)));
        if (w80.f8456k == 0) {
            w80.f8456k = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        int i2 = w80.f8456k >= 4 ? 2 : 1;
        ThreadFactoryC0862x2 threadFactoryC0862x4 = new ThreadFactoryC0862x2(1);
        if (TextUtils.isEmpty("animation")) {
            C0270h1.m2190f("Name must be non-null and non-empty, but given: animation");
            return;
        }
        w80 w80Var3 = new w80(new ThreadPoolExecutor(i2, i2, 0L, timeUnit, new PriorityBlockingQueue(), new v80(threadFactoryC0862x4, "animation", true)));
        kn0 kn0Var = new kn0(applicationContext);
        C0263gv c0263gv = new C0263gv();
        Context context2 = kn0Var.f4460a;
        float f = kn0Var.f4463d;
        ActivityManager activityManager = kn0Var.f4461b;
        int i3 = activityManager.isLowRamDevice() ? 2097152 : 4194304;
        c0263gv.f2943c = i3;
        int iRound = Math.round(activityManager.getMemoryClass() * 1048576 * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
        DisplayMetrics displayMetrics = (DisplayMetrics) kn0Var.f4462c.f254k;
        float f2 = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
        int iRound2 = Math.round(f2 * f);
        int iRound3 = Math.round(f2 * 2.0f);
        int i4 = iRound - i3;
        int i5 = iRound3 + iRound2;
        if (i5 <= i4) {
            c0263gv.f2942b = iRound3;
            c0263gv.f2941a = iRound2;
        } else {
            float f3 = i4 / (f + 2.0f);
            c0263gv.f2942b = Math.round(2.0f * f3);
            c0263gv.f2941a = Math.round(f3 * f);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder("Calculation complete, Calculated memory cache size: ");
            sb.append(Formatter.formatFileSize(context2, c0263gv.f2942b));
            sb.append(", pool size: ");
            sb.append(Formatter.formatFileSize(context2, c0263gv.f2941a));
            sb.append(", byte array size: ");
            sb.append(Formatter.formatFileSize(context2, i3));
            sb.append(", memory class limited? ");
            sb.append(i5 > iRound);
            sb.append(", max size: ");
            sb.append(Formatter.formatFileSize(context2, iRound));
            sb.append(", memoryClass: ");
            sb.append(activityManager.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(activityManager.isLowRamDevice());
            Log.d("MemorySizeCalculator", sb.toString());
        }
        wa0 wa0Var = new wa0(20);
        int i6 = c0263gv.f2941a;
        InterfaceC0318ic ok0Var = i6 > 0 ? new ok0(i6) : new wa0(12);
        nk0 nk0Var = new nk0(c0263gv.f2943c);
        sk0 sk0Var = new sk0(c0263gv.f2942b);
        ComponentCallbacks2C0106a componentCallbacks2C0106a = new ComponentCallbacks2C0106a(applicationContext, new C0892xw(sk0Var, new nu1(applicationContext), w80Var2, w80Var, new w80(new ThreadPoolExecutor(0, Integer.MAX_VALUE, 10000L, timeUnit, new SynchronousQueue(), new v80(new ThreadFactoryC0862x2(1), "source-unlimited", false))), w80Var3), sk0Var, ok0Var, nk0Var, new C0108a(), wa0Var, nc1Var, c0089c8, Collections.EMPTY_LIST, arrayList, generatedAppGlideModule, new b90(c0884xo));
        applicationContext.registerComponentCallbacks(componentCallbacks2C0106a);
        f1305q = componentCallbacks2C0106a;
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        zg1.m5891b();
        this.f1308k.m4109e(0L);
        this.f1307j.mo2593l();
        nk0 nk0Var = this.f1310m;
        synchronized (nk0Var) {
            nk0Var.m3542b(0);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        long j;
        zg1.m5891b();
        synchronized (this.f1313p) {
            try {
                ArrayList arrayList = this.f1313p;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((n11) obj).getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        sk0 sk0Var = this.f1308k;
        sk0Var.getClass();
        if (i >= 40) {
            sk0Var.m4109e(0L);
        } else if (i >= 20 || i == 15) {
            synchronized (sk0Var) {
                j = sk0Var.f6516b;
            }
            sk0Var.m4109e(j / 2);
        }
        this.f1307j.mo2592i(i);
        nk0 nk0Var = this.f1310m;
        synchronized (nk0Var) {
            try {
                if (i >= 40) {
                    synchronized (nk0Var) {
                        nk0Var.m3542b(0);
                    }
                } else if (i >= 20 || i == 15) {
                    nk0Var.m3542b(nk0Var.f5450e / 2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
