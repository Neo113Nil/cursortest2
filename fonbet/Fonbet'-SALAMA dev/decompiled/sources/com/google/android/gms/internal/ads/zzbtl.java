package com.google.android.gms.internal.ads;

import F2.C0252s;
import F2.C0254t;
import J2.d;
import J2.j;
import J2.n;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.g;
import e1.k;
import io.sentry.protocol.Device;
import io.sentry.protocol.OperatingSystem;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import n3.c;

/* loaded from: classes.dex */
public final class zzbtl implements zzbtn {
    public static zzbtn zza;
    static zzbtn zzb;
    static zzbtn zzc;
    static Boolean zzd;
    private static final Object zze = new Object();
    private final Object zzf;
    private final Context zzg;
    private final WeakHashMap zzh;
    private final ExecutorService zzi;
    private final VersionInfoParcel zzj;
    private final PackageInfo zzk;
    private final String zzl;
    private final String zzm;
    private final AtomicBoolean zzn;
    private boolean zzo;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzbtl(Context context, VersionInfoParcel versionInfoParcel) {
        PackageInfo packageInfo;
        zzbbp zzbbpVar;
        C0254t c0254t;
        String str;
        this.zzf = new Object();
        this.zzh = new WeakHashMap();
        zzfpp.zza();
        this.zzi = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        this.zzn = new AtomicBoolean();
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzg = context;
        this.zzj = versionInfoParcel;
        String str2 = null;
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzhN)).booleanValue()) {
            zzfpq zzfpqVar = d.f3805b;
            if (context != null && context.getApplicationInfo() != null) {
                try {
                    packageInfo = c.a(context).t(0, context.getApplicationInfo().packageName);
                } catch (PackageManager.NameNotFoundException unused) {
                }
                this.zzk = packageInfo;
                zzbbpVar = zzbby.zzhL;
                c0254t = C0254t.f2723d;
                if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
                    str = "unknown";
                } else {
                    zzfpq zzfpqVar2 = d.f3805b;
                    str = Locale.getDefault().getCountry();
                }
                this.zzl = str;
                if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
                    str2 = "unknown";
                } else {
                    Context context2 = this.zzg;
                    zzfpq zzfpqVar3 = d.f3805b;
                    if (context2 != null) {
                        try {
                            PackageInfo t7 = c.a(context2).t(128, "com.android.vending");
                            if (t7 != null) {
                                str2 = Integer.toString(t7.versionCode);
                            }
                        } catch (PackageManager.NameNotFoundException unused2) {
                        }
                    }
                }
                this.zzm = str2;
            }
        }
        packageInfo = null;
        this.zzk = packageInfo;
        zzbbpVar = zzbby.zzhL;
        c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
        }
        this.zzl = str;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
        }
        this.zzm = str2;
    }

    public static zzbtn zza(Context context) {
        synchronized (zze) {
            try {
                if (zza == null) {
                    if (zzl(context)) {
                        zza = new zzbtl(context, VersionInfoParcel.j());
                    } else {
                        zza = new zzbtm();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zza;
    }

    public static zzbtn zzb(Context context, VersionInfoParcel versionInfoParcel) {
        synchronized (zze) {
            try {
                if (zzc == null) {
                    boolean z4 = false;
                    if (((Boolean) zzbdq.zzc.zze()).booleanValue()) {
                        if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzhG)).booleanValue() || ((Boolean) zzbdq.zza.zze()).booleanValue()) {
                            z4 = true;
                        }
                    }
                    if (zzl(context)) {
                        zzbtl zzbtlVar = new zzbtl(context, versionInfoParcel);
                        zzbtlVar.zzk();
                        zzbtlVar.zzj();
                        zzc = zzbtlVar;
                    } else if (!z4 || context == null) {
                        zzc = new zzbtm();
                    } else {
                        zzbtl zzbtlVar2 = new zzbtl(context, versionInfoParcel, true);
                        zzbtlVar2.zzk();
                        zzbtlVar2.zzj();
                        zzc = zzbtlVar2;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzc;
    }

    public static zzbtn zzc(Context context) {
        synchronized (zze) {
            try {
                if (zzb == null) {
                    zzbbp zzbbpVar = zzbby.zzhH;
                    C0254t c0254t = C0254t.f2723d;
                    if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
                        if (!((Boolean) c0254t.f2726c.zzb(zzbby.zzhG)).booleanValue()) {
                            zzb = new zzbtl(context, VersionInfoParcel.j());
                        }
                    }
                    zzb = new zzbtm();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzb;
    }

    public static zzbtn zzd(Context context, VersionInfoParcel versionInfoParcel) {
        synchronized (zze) {
            try {
                if (zzb == null) {
                    zzbbp zzbbpVar = zzbby.zzhH;
                    C0254t c0254t = C0254t.f2723d;
                    if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
                        if (!((Boolean) c0254t.f2726c.zzb(zzbby.zzhG)).booleanValue()) {
                            zzb = new zzbtl(context, versionInfoParcel);
                        }
                    }
                    zzb = new zzbtm();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzb;
    }

    public static String zze(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static String zzf(Throwable th) {
        return zzfty.zzc(d.a(zze(th), "SHA-256"));
    }

    private final void zzj() {
        Thread.setDefaultUncaughtExceptionHandler(new zzbtj(this, Thread.getDefaultUncaughtExceptionHandler()));
    }

    private final void zzk() {
        Thread thread = Looper.getMainLooper().getThread();
        if (thread == null) {
            return;
        }
        synchronized (this.zzf) {
            this.zzh.put(thread, Boolean.TRUE);
        }
        thread.setUncaughtExceptionHandler(new zzbtk(this, thread.getUncaughtExceptionHandler()));
    }

    private static boolean zzl(Context context) {
        if (context == null) {
            return false;
        }
        synchronized (zze) {
            try {
                if (zzd == null) {
                    zzd = Boolean.valueOf(C0252s.f2717f.f2722e.nextInt(100) < ((Integer) C0254t.f2723d.f2726c.zzb(zzbby.zzmH)).intValue());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zzd.booleanValue()) {
            if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzhG)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final void zzg(Thread thread, Throwable th) {
        if (th != null) {
            boolean z4 = false;
            boolean z7 = false;
            for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                    z4 |= d.l(stackTraceElement.getClassName());
                    z7 |= zzbtl.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            if (!z4 || z7) {
                return;
            }
            if (!this.zzo) {
                zzh(th, "");
            }
            if (this.zzn.getAndSet(true) || !((Boolean) zzbdq.zzc.zze()).booleanValue()) {
                return;
            }
            zzbbi.zzc(this.zzg);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtn
    public final void zzh(Throwable th, String str) {
        if (this.zzo) {
            return;
        }
        zzi(th, str, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.zzbtn
    public final void zzi(Throwable th, String str, float f7) {
        Throwable th2;
        String str2;
        PackageInfo t7;
        ActivityManager activityManager;
        ActivityManager.MemoryInfo memoryInfo;
        if (this.zzo) {
            return;
        }
        zzfpq zzfpqVar = d.f3805b;
        boolean z4 = false;
        if (((Boolean) zzbeh.zze.zze()).booleanValue()) {
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
                boolean z7 = ((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzcw)).booleanValue() && stackTrace != null && stackTrace.length == 0 && d.l(th4.getClass().getName());
                ArrayList arrayList = new ArrayList();
                arrayList.add(new StackTraceElement(th4.getClass().getName(), "<filtered>", "<filtered>", 1));
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (d.l(stackTraceElement.getClassName())) {
                        arrayList.add(stackTraceElement);
                        z7 = true;
                    } else {
                        String className = stackTraceElement.getClassName();
                        if (!TextUtils.isEmpty(className) && (className.startsWith("android.") || className.startsWith("java."))) {
                            arrayList.add(stackTraceElement);
                        } else {
                            arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                        }
                    }
                }
                if (z7) {
                    th2 = th2 == null ? new Throwable(th4.getMessage()) : new Throwable(th4.getMessage(), th2);
                    th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                }
            }
        }
        if (th2 != null) {
            String name = th.getClass().getName();
            String zze2 = zze(th);
            String zzf = ((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zziP)).booleanValue() ? zzf(th) : "";
            double d7 = f7;
            double random = Math.random();
            int i7 = f7 > 0.0f ? (int) (1.0f / f7) : 1;
            if (random < d7) {
                ArrayList arrayList2 = new ArrayList();
                try {
                    z4 = c.a(this.zzg).v();
                } catch (Throwable th5) {
                    j.e("Error fetching instant app info", th5);
                }
                try {
                    str2 = this.zzg.getPackageName();
                } catch (Throwable unused) {
                    j.g("Cannot obtain package name, proceeding.");
                    str2 = "unknown";
                }
                Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z4)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter(OperatingSystem.TYPE, Build.VERSION.RELEASE);
                int i8 = Build.VERSION.SDK_INT;
                Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("api", String.valueOf(i8));
                String str3 = Build.MANUFACTURER;
                String str4 = Build.MODEL;
                if (!str4.startsWith(str3)) {
                    str4 = k.f(str3, " ", str4);
                }
                Uri.Builder appendQueryParameter3 = appendQueryParameter2.appendQueryParameter(Device.TYPE, str4).appendQueryParameter("js", this.zzj.f10834a).appendQueryParameter("appid", str2).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", zze2);
                C0254t c0254t = C0254t.f2723d;
                Uri.Builder appendQueryParameter4 = appendQueryParameter3.appendQueryParameter("eids", TextUtils.join(",", c0254t.f2724a.zza())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "730675337").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i7)).appendQueryParameter("pb_tm", String.valueOf(zzbeh.zzc.zze()));
                Context context = this.zzg;
                com.google.android.gms.common.d.f11217b.getClass();
                Uri.Builder appendQueryParameter5 = appendQueryParameter4.appendQueryParameter("gmscv", String.valueOf(g.getApkVersion(context))).appendQueryParameter("lite", true != this.zzj.f10838e ? "0" : "1");
                if (!TextUtils.isEmpty(zzf)) {
                    appendQueryParameter5.appendQueryParameter("hash", zzf);
                }
                zzbbp zzbbpVar = zzbby.zzhM;
                zzbbw zzbbwVar = c0254t.f2726c;
                if (((Boolean) zzbbwVar.zzb(zzbbpVar)).booleanValue()) {
                    Context context2 = this.zzg;
                    if (context2 == null || (activityManager = (ActivityManager) context2.getSystemService("activity")) == null) {
                        memoryInfo = null;
                    } else {
                        memoryInfo = new ActivityManager.MemoryInfo();
                        try {
                            activityManager.getMemoryInfo(memoryInfo);
                        } catch (NullPointerException unused2) {
                            j.g("Error retrieving the memory information.");
                        }
                    }
                    if (memoryInfo != null) {
                        appendQueryParameter5.appendQueryParameter("available_memory", Long.toString(memoryInfo.availMem));
                        appendQueryParameter5.appendQueryParameter("total_memory", Long.toString(memoryInfo.totalMem));
                        appendQueryParameter5.appendQueryParameter("is_low_memory", true != memoryInfo.lowMemory ? "0" : "1");
                    }
                }
                if (((Boolean) zzbbwVar.zzb(zzbby.zzhL)).booleanValue()) {
                    if (!TextUtils.isEmpty(this.zzl)) {
                        appendQueryParameter5.appendQueryParameter("countrycode", this.zzl);
                    }
                    if (!TextUtils.isEmpty(this.zzm)) {
                        appendQueryParameter5.appendQueryParameter("psv", this.zzm);
                    }
                    Context context3 = this.zzg;
                    if (i8 >= 26) {
                        t7 = WebView.getCurrentWebViewPackage();
                    } else {
                        if (context3 != null) {
                            try {
                                t7 = c.a(context3).t(128, "com.android.webview");
                            } catch (PackageManager.NameNotFoundException unused3) {
                            }
                        }
                        t7 = null;
                    }
                    if (t7 != null) {
                        appendQueryParameter5.appendQueryParameter("wvvc", Integer.toString(t7.versionCode));
                        appendQueryParameter5.appendQueryParameter("wvvn", t7.versionName);
                        appendQueryParameter5.appendQueryParameter("wvpn", t7.packageName);
                    }
                }
                PackageInfo packageInfo = this.zzk;
                if (packageInfo != null) {
                    appendQueryParameter5.appendQueryParameter("appvc", String.valueOf(packageInfo.versionCode));
                    appendQueryParameter5.appendQueryParameter("appvn", this.zzk.versionName);
                }
                arrayList2.add(appendQueryParameter5.toString());
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    final String str5 = (String) it.next();
                    final n nVar = new n(null);
                    this.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbti
                        @Override // java.lang.Runnable
                        public final void run() {
                            n.this.zza(str5);
                        }
                    });
                }
            }
        }
    }

    public zzbtl(Context context, VersionInfoParcel versionInfoParcel, boolean z4) {
        this(context, versionInfoParcel);
        this.zzo = true;
    }
}
