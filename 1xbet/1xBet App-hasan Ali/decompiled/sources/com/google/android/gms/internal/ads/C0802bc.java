package com.google.android.gms.internal.ads;

import Q2.C0379q;
import a3.AbstractC0467k;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import r3.C2350b;

/* renamed from: com.google.android.gms.internal.ads.bc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0802bc implements InterfaceC0846cc, InterfaceC1165jj {

    /* renamed from: u, reason: collision with root package name */
    public static final Object f12816u = new Object();

    /* renamed from: v, reason: collision with root package name */
    public static InterfaceC0846cc f12817v;

    /* renamed from: w, reason: collision with root package name */
    public static InterfaceC0846cc f12818w;

    /* renamed from: x, reason: collision with root package name */
    public static InterfaceC0846cc f12819x;

    /* renamed from: y, reason: collision with root package name */
    public static Boolean f12820y;

    /* renamed from: k, reason: collision with root package name */
    public final Object f12821k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f12822l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f12823m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f12824n;

    /* renamed from: o, reason: collision with root package name */
    public final Object f12825o;

    /* renamed from: p, reason: collision with root package name */
    public final Object f12826p;

    /* renamed from: q, reason: collision with root package name */
    public Object f12827q;

    /* renamed from: r, reason: collision with root package name */
    public Object f12828r;

    /* renamed from: s, reason: collision with root package name */
    public Object f12829s;

    /* renamed from: t, reason: collision with root package name */
    public Object f12830t;

    public C0802bc(Context context, U2.a aVar, C0634Ld c0634Ld, Lq lq, InterfaceC0677Re interfaceC0677Re, Wq wq, boolean z3, A9 a9, BinderC0857cn binderC0857cn, C1482ql c1482ql) {
        this.f12821k = context;
        this.f12822l = aVar;
        this.f12824n = c0634Ld;
        this.f12825o = lq;
        this.f12826p = interfaceC0677Re;
        this.f12827q = wq;
        this.f12828r = a9;
        this.f12823m = z3;
        this.f12829s = binderC0857cn;
        this.f12830t = c1482ql;
    }

    public static InterfaceC0846cc a(Context context) {
        synchronized (f12816u) {
            try {
                if (f12817v == null) {
                    if (k(context)) {
                        f12817v = new C0802bc(context, U2.a.a());
                    } else {
                        f12817v = new V9(13);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f12817v;
    }

    public static InterfaceC0846cc d(Context context, U2.a aVar) {
        synchronized (f12816u) {
            try {
                if (f12819x == null) {
                    boolean z3 = false;
                    if (((Boolean) AbstractC0790b8.f12767c.s()).booleanValue()) {
                        if (!((Boolean) Q2.r.f5053d.f5056c.a(F7.n7)).booleanValue() || ((Boolean) AbstractC0790b8.f12765a.s()).booleanValue()) {
                            z3 = true;
                        }
                    }
                    if (k(context)) {
                        C0802bc c0802bc = new C0802bc(context, aVar);
                        c0802bc.j();
                        Thread.setDefaultUncaughtExceptionHandler(new C0757ac(c0802bc, Thread.getDefaultUncaughtExceptionHandler(), 0));
                        f12819x = c0802bc;
                    } else if (!z3 || context == null) {
                        f12819x = new V9(13);
                    } else {
                        C0802bc c0802bc2 = new C0802bc(context, aVar);
                        c0802bc2.f12823m = true;
                        c0802bc2.j();
                        Thread.setDefaultUncaughtExceptionHandler(new C0757ac(c0802bc2, Thread.getDefaultUncaughtExceptionHandler(), 0));
                        f12819x = c0802bc2;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f12819x;
    }

    public static InterfaceC0846cc e(Context context) {
        synchronized (f12816u) {
            try {
                if (f12818w == null) {
                    A7 a7 = F7.o7;
                    Q2.r rVar = Q2.r.f5053d;
                    if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
                        if (!((Boolean) rVar.f5056c.a(F7.n7)).booleanValue()) {
                            f12818w = new C0802bc(context, U2.a.a());
                        }
                    }
                    f12818w = new V9(13);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f12818w;
    }

    public static String f(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x007d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean k(Context context) {
        if (context != null) {
            A7 a7 = F7.pc;
            Q2.r rVar = Q2.r.f5053d;
            if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
                synchronized (f12816u) {
                    try {
                        if (f12820y == null) {
                            f12820y = Boolean.valueOf(C0379q.f.f5052e.nextInt(100) < ((Integer) rVar.f5056c.a(F7.mc)).intValue());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (f12820y.booleanValue()) {
                    if (!((Boolean) rVar.f5056c.a(F7.n7)).booleanValue()) {
                    }
                }
            } else if (((Boolean) AbstractC1461q8.f15109e.s()).booleanValue()) {
                if (!((Boolean) rVar.f5056c.a(F7.n7)).booleanValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0846cc
    public void b(String str, Throwable th) {
        if (this.f12823m) {
            return;
        }
        c(th, str, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0846cc
    public void c(Throwable th, String str, float f) {
        Throwable th2;
        boolean z3;
        String str2;
        PackageInfo c5;
        ActivityManager activityManager;
        ActivityManager.MemoryInfo memoryInfo;
        String n5;
        Context context = (Context) this.f12821k;
        if (this.f12823m) {
            return;
        }
        Jt jt = U2.e.f5861b;
        if (((Boolean) AbstractC1461q8.f.s()).booleanValue()) {
            th2 = th;
        } else {
            LinkedList linkedList = new LinkedList();
            for (Throwable th3 = th; th3 != null; th3 = th3.getCause()) {
                linkedList.push(th3);
            }
            th2 = null;
            while (!linkedList.isEmpty()) {
                Throwable th4 = (Throwable) linkedList.pop();
                StackTraceElement[] stackTrace = th4.getStackTrace();
                boolean z5 = ((Boolean) Q2.r.f5053d.f5056c.a(F7.f8844j2)).booleanValue() && stackTrace != null && stackTrace.length == 0 && U2.e.h(th4.getClass().getName());
                ArrayList arrayList = new ArrayList();
                arrayList.add(new StackTraceElement(th4.getClass().getName(), "<filtered>", "<filtered>", 1));
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (U2.e.h(stackTraceElement.getClassName())) {
                        arrayList.add(stackTraceElement);
                        z5 = true;
                    } else {
                        String className = stackTraceElement.getClassName();
                        if (!TextUtils.isEmpty(className) && (className.startsWith("android.") || className.startsWith("java."))) {
                            arrayList.add(stackTraceElement);
                        } else {
                            arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                        }
                    }
                }
                if (z5) {
                    th2 = th2 == null ? new Throwable(th4.getMessage()) : new Throwable(th4.getMessage(), th2);
                    th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                }
            }
        }
        if (th2 != null) {
            String name = th.getClass().getName();
            String f5 = f(th);
            String str3 = "";
            if (((Boolean) Q2.r.f5053d.f5056c.a(F7.u8)).booleanValue() && (n5 = U2.e.n(f(th), "SHA-256")) != null) {
                str3 = n5;
            }
            double d5 = f;
            double random = Math.random();
            int i = f > 0.0f ? (int) (1.0f / f) : 1;
            if (random < d5) {
                ArrayList arrayList2 = new ArrayList();
                try {
                    z3 = C2350b.a(context).d();
                } catch (Throwable th5) {
                    U2.j.g("Error fetching instant app info", th5);
                    z3 = false;
                }
                try {
                    str2 = context.getPackageName();
                } catch (Throwable unused) {
                    U2.j.i("Cannot obtain package name, proceeding.");
                    str2 = "unknown";
                }
                Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z3)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE);
                int i5 = Build.VERSION.SDK_INT;
                Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("api", String.valueOf(i5));
                String str4 = Build.MANUFACTURER;
                String str5 = Build.MODEL;
                if (!str5.startsWith(str4)) {
                    str5 = AbstractC0467k.v(str4, " ", str5);
                }
                Uri.Builder appendQueryParameter3 = appendQueryParameter2.appendQueryParameter("device", str5);
                U2.a aVar = (U2.a) this.f12822l;
                Uri.Builder appendQueryParameter4 = appendQueryParameter3.appendQueryParameter("js", aVar.f5852k).appendQueryParameter("appid", str2).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", f5);
                Q2.r rVar = Q2.r.f5053d;
                Uri.Builder appendQueryParameter5 = appendQueryParameter4.appendQueryParameter("eids", TextUtils.join(",", rVar.f5054a.n())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "697668803").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i)).appendQueryParameter("pb_tm", String.valueOf(AbstractC1461q8.f15107c.s()));
                j3.f.f17514b.getClass();
                Uri.Builder appendQueryParameter6 = appendQueryParameter5.appendQueryParameter("gmscv", String.valueOf(j3.f.a(context))).appendQueryParameter("lite", true != aVar.f5856o ? "0" : "1");
                if (!TextUtils.isEmpty(str3)) {
                    appendQueryParameter6.appendQueryParameter("hash", str3);
                }
                A7 a7 = F7.t7;
                D7 d7 = rVar.f5056c;
                if (((Boolean) d7.a(a7)).booleanValue()) {
                    if (context == null || (activityManager = (ActivityManager) context.getSystemService("activity")) == null) {
                        memoryInfo = null;
                    } else {
                        memoryInfo = new ActivityManager.MemoryInfo();
                        try {
                            activityManager.getMemoryInfo(memoryInfo);
                        } catch (NullPointerException unused2) {
                            U2.j.i("Error retrieving the memory information.");
                        }
                    }
                    if (memoryInfo != null) {
                        appendQueryParameter6.appendQueryParameter("available_memory", Long.toString(memoryInfo.availMem));
                        appendQueryParameter6.appendQueryParameter("total_memory", Long.toString(memoryInfo.totalMem));
                        appendQueryParameter6.appendQueryParameter("is_low_memory", true != memoryInfo.lowMemory ? "0" : "1");
                    }
                }
                if (((Boolean) d7.a(F7.s7)).booleanValue()) {
                    String str6 = (String) this.f12828r;
                    if (!TextUtils.isEmpty(str6)) {
                        appendQueryParameter6.appendQueryParameter("countrycode", str6);
                    }
                    String str7 = (String) this.f12829s;
                    if (!TextUtils.isEmpty(str7)) {
                        appendQueryParameter6.appendQueryParameter("psv", str7);
                    }
                    if (i5 >= 26) {
                        c5 = WebView.getCurrentWebViewPackage();
                    } else {
                        if (context != null) {
                            try {
                                c5 = C2350b.a(context).c("com.android.webview", 128);
                            } catch (PackageManager.NameNotFoundException unused3) {
                            }
                        }
                        c5 = null;
                    }
                    if (c5 != null) {
                        appendQueryParameter6.appendQueryParameter("wvvc", Integer.toString(c5.versionCode));
                        appendQueryParameter6.appendQueryParameter("wvvn", c5.versionName);
                        appendQueryParameter6.appendQueryParameter("wvpn", c5.packageName);
                    }
                }
                PackageInfo packageInfo = (PackageInfo) this.f12827q;
                if (packageInfo != null) {
                    appendQueryParameter6.appendQueryParameter("appvc", String.valueOf(packageInfo.versionCode));
                    appendQueryParameter6.appendQueryParameter("appvn", packageInfo.versionName);
                }
                arrayList2.add(appendQueryParameter6.toString());
                int size = arrayList2.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj = arrayList2.get(i6);
                    i6++;
                    ((ExecutorService) this.f12826p).execute(new Kw(10, new U2.m(null), (String) obj));
                }
            }
        }
    }

    public void g(Throwable th) {
        Context context;
        SharedPreferences sharedPreferences;
        if (th != null) {
            boolean z3 = false;
            boolean z5 = false;
            for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                    z3 |= U2.e.h(stackTraceElement.getClassName());
                    z5 |= C0802bc.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            if (!z3 || z5) {
                return;
            }
            if (!this.f12823m) {
                b("", th);
            }
            if (((AtomicBoolean) this.f12830t).getAndSet(true) || !((Boolean) AbstractC0790b8.f12767c.s()).booleanValue() || (sharedPreferences = (context = (Context) this.f12821k).getSharedPreferences("admob", 0)) == null) {
                return;
            }
            sharedPreferences.edit().putInt("crash_without_write", AbstractC1668us.X(context, "crash_without_write") + 1).commit();
        }
    }

    public void h(AudioDeviceInfo audioDeviceInfo) {
        Dp dp = (Dp) this.f12828r;
        if (Objects.equals(audioDeviceInfo, dp == null ? null : (AudioDeviceInfo) dp.f8377l)) {
            return;
        }
        Dp dp2 = audioDeviceInfo != null ? new Dp(13, audioDeviceInfo) : null;
        this.f12828r = dp2;
        i(C0797bF.b((Context) this.f12821k, (Mm) this.f12829s, dp2));
    }

    public void i(C0797bF c0797bF) {
        C1112iH c1112iH;
        if (!this.f12823m || c0797bF.equals((C0797bF) this.f12827q)) {
            return;
        }
        this.f12827q = c0797bF;
        C1557sF c1557sF = (C1557sF) ((Ps) this.f12830t).f11130k;
        c1557sF.getClass();
        Looper myLooper = Looper.myLooper();
        Looper looper = c1557sF.f15449T;
        if (looper != myLooper) {
            String name = looper == null ? "null" : looper.getThread().getName();
            throw new IllegalStateException("Current looper (" + (myLooper == null ? "null" : myLooper.getThread().getName()) + ") is not the playback looper (" + name + ")");
        }
        if (c0797bF.equals(c1557sF.f15469q)) {
            return;
        }
        c1557sF.f15469q = c0797bF;
        Hq hq = c1557sF.f15464l;
        if (hq != null) {
            C1602tF c1602tF = (C1602tF) hq.f9491l;
            synchronized (c1602tF.f11388k) {
                c1112iH = c1602tF.f11349A;
            }
            if (c1112iH != null) {
                c1112iH.a();
            }
        }
    }

    public void j() {
        Thread thread = Looper.getMainLooper().getThread();
        if (thread == null) {
            return;
        }
        synchronized (this.f12824n) {
            ((WeakHashMap) this.f12825o).put(thread, Boolean.TRUE);
        }
        thread.setUncaughtExceptionHandler(new C0757ac(this, thread.getUncaughtExceptionHandler(), 1));
    }

    public void l(Runnable runnable) {
        ((Handler) ((InterfaceC1805xu) this.f12824n).mo12a()).post(new RunnableC1043gu(this, runnable, 0));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1165jj
    public void z(boolean z3, Context context, Sh sh) {
        C0608Hf c0608Hf = (C0608Hf) AbstractC1400ot.n0((C0634Ld) this.f12824n);
        InterfaceC0677Re interfaceC0677Re = (InterfaceC0677Re) this.f12826p;
        interfaceC0677Re.p0(true);
        A9 a9 = (A9) this.f12828r;
        boolean z5 = this.f12823m;
        boolean z6 = false;
        boolean c5 = z5 ? a9.c(false) : false;
        T2.L l5 = P2.o.f4767B.f4771c;
        boolean h3 = T2.L.h((Context) this.f12821k);
        if (z5) {
            synchronized (a9) {
                z6 = a9.f7540b;
            }
        }
        float a5 = z5 ? a9.a() : 0.0f;
        Lq lq = (Lq) this.f12825o;
        P2.h hVar = new P2.h(c5, h3, z6, a5, z3, lq.f10477O, false);
        if (sh != null) {
            sh.c();
        }
        C1077hj c1077hj = (C1077hj) c0608Hf.f9428P.d();
        int i = lq.f10479Q;
        Pq pq = lq.f10523s;
        Q1.j.g(context, new AdOverlayInfoParcel(c1077hj, (InterfaceC0677Re) this.f12826p, i, (U2.a) this.f12822l, lq.f10466B, hVar, pq.f11127b, pq.f11126a, ((Wq) this.f12827q).f, sh, lq.b() ? (BinderC0857cn) this.f12829s : null, interfaceC0677Re.t()), true, (C1482ql) this.f12830t);
    }

    public C0802bc() {
        this.f12824n = new HashMap();
        this.f12821k = new HashMap();
        this.f12826p = new HashMap();
        this.f12822l = new HashSet();
        this.f12827q = new HashSet();
        this.f12828r = new HashSet();
        this.f12829s = new HashMap();
        this.f12830t = new HashSet();
        this.f12825o = new WeakHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0802bc(Context context, U2.a aVar) {
        PackageInfo packageInfo;
        A7 a7;
        Q2.r rVar;
        this.f12824n = new Object();
        this.f12825o = new WeakHashMap();
        this.f12826p = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        this.f12830t = new AtomicBoolean();
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f12821k = context;
        this.f12822l = aVar;
        String str = null;
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.u7)).booleanValue()) {
            Jt jt = U2.e.f5861b;
            if (context != null && context.getApplicationInfo() != null) {
                try {
                    packageInfo = C2350b.a(context).c(context.getApplicationInfo().packageName, 0);
                } catch (PackageManager.NameNotFoundException unused) {
                }
                this.f12827q = packageInfo;
                a7 = F7.s7;
                rVar = Q2.r.f5053d;
                this.f12828r = !((Boolean) rVar.f5056c.a(a7)).booleanValue() ? Locale.getDefault().getCountry() : "unknown";
                if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
                    str = "unknown";
                } else {
                    Context context2 = (Context) this.f12821k;
                    Jt jt2 = U2.e.f5861b;
                    if (context2 != null) {
                        try {
                            PackageInfo c5 = C2350b.a(context2).c("com.android.vending", 128);
                            if (c5 != null) {
                                str = Integer.toString(c5.versionCode);
                            }
                        } catch (PackageManager.NameNotFoundException unused2) {
                        }
                    }
                }
                this.f12829s = str;
            }
        }
        packageInfo = null;
        this.f12827q = packageInfo;
        a7 = F7.s7;
        rVar = Q2.r.f5053d;
        this.f12828r = !((Boolean) rVar.f5056c.a(a7)).booleanValue() ? Locale.getDefault().getCountry() : "unknown";
        if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
        }
        this.f12829s = str;
    }

    public C0802bc(Context context, Ps ps, Mm mm, Dp dp) {
        Context applicationContext = context.getApplicationContext();
        this.f12821k = applicationContext;
        this.f12830t = ps;
        this.f12829s = mm;
        this.f12828r = dp;
        int i = AbstractC1260lo.f14419a;
        Looper myLooper = Looper.myLooper();
        Handler handler = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper, null);
        this.f12824n = handler;
        this.f12825o = AbstractC1260lo.f14419a >= 23 ? new C0841cF(this) : null;
        this.f12826p = new T2.E(5, this);
        C0797bF c0797bF = C0797bF.f12791c;
        String str = AbstractC1260lo.f14421c;
        Uri uriFor = ("Amazon".equals(str) || "Xiaomi".equals(str)) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.f12822l = uriFor != null ? new C0886dF(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    public C0802bc(Context context, C1091hx c1091hx, Intent intent) {
        this.f12826p = new ArrayList();
        this.f12821k = context;
        this.f12825o = c1091hx;
        this.f12828r = "OverlayDisplayService";
        this.f12822l = intent;
        this.f12824n = AbstractC1400ot.e(new Aq(5, (byte) 0));
        this.f12827q = new IBinder.DeathRecipient() { // from class: com.google.android.gms.internal.ads.fu
            @Override // android.os.IBinder.DeathRecipient
            public final void binderDied() {
                C0802bc c0802bc = C0802bc.this;
                ((C1091hx) c0802bc.f12825o).c("%s : Binder has died.", (String) c0802bc.f12828r);
                synchronized (((ArrayList) c0802bc.f12826p)) {
                    ((ArrayList) c0802bc.f12826p).clear();
                }
            }
        };
    }
}
