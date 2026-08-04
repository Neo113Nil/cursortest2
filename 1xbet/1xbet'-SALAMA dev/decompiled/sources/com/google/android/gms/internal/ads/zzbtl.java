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
import io.sentry.protocol.Device;
import io.sentry.protocol.OperatingSystem;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import p031e1.k;
import p097n3.c;

/* JADX INFO: loaded from: classes.dex */
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

    /* JADX WARN: Code duplicated, block: B:11:0x0050  */
    public zzbtl(Context context, VersionInfoParcel versionInfoParcel) {
        PackageInfo packageInfoT;
        String country;
        this.zzf = new Object();
        this.zzh = new WeakHashMap();
        zzfpp.zza();
        this.zzi = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        this.zzn = new AtomicBoolean();
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzg = context;
        this.zzj = versionInfoParcel;
        String string = null;
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzhN)).booleanValue()) {
            zzfpq zzfpqVar = d.f3805b;
            if (context == null || context.getApplicationInfo() == null) {
                packageInfoT = null;
            } else {
                try {
                    packageInfoT = c.a(context).t(0, context.getApplicationInfo().packageName);
                } catch (PackageManager.NameNotFoundException unused) {
                    packageInfoT = null;
                }
            }
        } else {
            packageInfoT = null;
        }
        this.zzk = packageInfoT;
        zzbbp zzbbpVar = zzbby.zzhL;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
            zzfpq zzfpqVar2 = d.f3805b;
            country = Locale.getDefault().getCountry();
        } else {
            country = "unknown";
        }
        this.zzl = country;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
            Context context2 = this.zzg;
            zzfpq zzfpqVar3 = d.f3805b;
            if (context2 != null) {
                try {
                    PackageInfo packageInfoT2 = c.a(context2).t(128, "com.android.vending");
                    if (packageInfoT2 != null) {
                        string = Integer.toString(packageInfoT2.versionCode);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                }
            }
        } else {
            string = "unknown";
        }
        this.zzm = string;
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

    /* JADX WARN: Code duplicated, block: B:13:0x0037 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0019, B:10:0x0029, B:13:0x0037, B:14:0x003e), top: B:19:0x0003 }] */
    public static zzbtn zzc(Context context) {
        synchronized (zze) {
            try {
                if (zzb == null) {
                    zzbbp zzbbpVar = zzbby.zzhH;
                    C0254t c0254t = C0254t.f2723d;
                    if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
                        if (((Boolean) c0254t.f2726c.zzb(zzbby.zzhG)).booleanValue()) {
                            zzb = new zzbtm();
                        } else {
                            zzb = new zzbtl(context, VersionInfoParcel.j());
                        }
                    } else {
                        zzb = new zzbtm();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzb;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0033 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0019, B:10:0x0029, B:13:0x0033, B:14:0x003a), top: B:19:0x0003 }] */
    public static zzbtn zzd(Context context, VersionInfoParcel versionInfoParcel) {
        synchronized (zze) {
            try {
                if (zzb == null) {
                    zzbbp zzbbpVar = zzbby.zzhH;
                    C0254t c0254t = C0254t.f2723d;
                    if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
                        if (((Boolean) c0254t.f2726c.zzb(zzbby.zzhG)).booleanValue()) {
                            zzb = new zzbtm();
                        } else {
                            zzb = new zzbtl(context, versionInfoParcel);
                        }
                    } else {
                        zzb = new zzbtm();
                    }
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
            boolean zL = false;
            boolean zEquals = false;
            for (Throwable cause = th; cause != null; cause = cause.getCause()) {
                for (StackTraceElement stackTraceElement : cause.getStackTrace()) {
                    zL |= d.l(stackTraceElement.getClassName());
                    zEquals |= zzbtl.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            if (!zL || zEquals) {
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
        String packageName;
        PackageInfo packageInfoT;
        ActivityManager activityManager;
        ActivityManager.MemoryInfo memoryInfo;
        if (this.zzo) {
            return;
        }
        zzfpq zzfpqVar = d.f3805b;
        boolean zV = false;
        if (((Boolean) zzbeh.zze.zze()).booleanValue()) {
            th2 = th;
        } else {
            LinkedList linkedList = new LinkedList();
            for (Throwable cause = th; cause != null; cause = cause.getCause()) {
                linkedList.push(cause);
            }
            th2 = null;
            while (!linkedList.isEmpty()) {
                Throwable th3 = (Throwable) linkedList.pop();
                StackTraceElement[] stackTrace = th3.getStackTrace();
                boolean z4 = ((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzcw)).booleanValue() && stackTrace != null && stackTrace.length == 0 && d.l(th3.getClass().getName());
                ArrayList arrayList = new ArrayList();
                arrayList.add(new StackTraceElement(th3.getClass().getName(), "<filtered>", "<filtered>", 1));
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (d.l(stackTraceElement.getClassName())) {
                        arrayList.add(stackTraceElement);
                        z4 = true;
                    } else {
                        String className = stackTraceElement.getClassName();
                        if (!TextUtils.isEmpty(className) && (className.startsWith("android.") || className.startsWith("java."))) {
                            arrayList.add(stackTraceElement);
                        } else {
                            arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                        }
                    }
                }
                if (z4) {
                    th2 = th2 == null ? new Throwable(th3.getMessage()) : new Throwable(th3.getMessage(), th2);
                    th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                }
            }
        }
        if (th2 != null) {
            String name = th.getClass().getName();
            String strZze = zze(th);
            String strZzf = ((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zziP)).booleanValue() ? zzf(th) : "";
            double d7 = f7;
            double dRandom = Math.random();
            int i7 = f7 > 0.0f ? (int) (1.0f / f7) : 1;
            if (dRandom < d7) {
                ArrayList<String> arrayList2 = new ArrayList();
                try {
                    zV = c.a(this.zzg).v();
                } catch (Throwable th4) {
                    j.e("Error fetching instant app info", th4);
                }
                try {
                    packageName = this.zzg.getPackageName();
                } catch (Throwable unused) {
                    j.g("Cannot obtain package name, proceeding.");
                    packageName = "unknown";
                }
                Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(zV)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter(OperatingSystem.TYPE, Build.VERSION.RELEASE);
                int i8 = Build.VERSION.SDK_INT;
                Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("api", String.valueOf(i8));
                String str2 = Build.MANUFACTURER;
                String strF = Build.MODEL;
                if (!strF.startsWith(str2)) {
                    strF = k.f(str2, " ", strF);
                }
                Uri.Builder builderAppendQueryParameter3 = builderAppendQueryParameter2.appendQueryParameter(Device.TYPE, strF).appendQueryParameter("js", this.zzj.f10834a).appendQueryParameter("appid", packageName).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", strZze);
                C0254t c0254t = C0254t.f2723d;
                Uri.Builder builderAppendQueryParameter4 = builderAppendQueryParameter3.appendQueryParameter("eids", TextUtils.join(",", c0254t.f2724a.zza())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "730675337").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i7)).appendQueryParameter("pb_tm", String.valueOf(zzbeh.zzc.zze()));
                Context context = this.zzg;
                com.google.android.gms.common.d.f11217b.getClass();
                Uri.Builder builderAppendQueryParameter5 = builderAppendQueryParameter4.appendQueryParameter("gmscv", String.valueOf(g.getApkVersion(context))).appendQueryParameter("lite", true != this.zzj.f10838e ? "0" : "1");
                if (!TextUtils.isEmpty(strZzf)) {
                    builderAppendQueryParameter5.appendQueryParameter("hash", strZzf);
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
                        builderAppendQueryParameter5.appendQueryParameter("available_memory", Long.toString(memoryInfo.availMem));
                        builderAppendQueryParameter5.appendQueryParameter("total_memory", Long.toString(memoryInfo.totalMem));
                        builderAppendQueryParameter5.appendQueryParameter("is_low_memory", true != memoryInfo.lowMemory ? "0" : "1");
                    }
                }
                if (((Boolean) zzbbwVar.zzb(zzbby.zzhL)).booleanValue()) {
                    if (!TextUtils.isEmpty(this.zzl)) {
                        builderAppendQueryParameter5.appendQueryParameter("countrycode", this.zzl);
                    }
                    if (!TextUtils.isEmpty(this.zzm)) {
                        builderAppendQueryParameter5.appendQueryParameter("psv", this.zzm);
                    }
                    Context context3 = this.zzg;
                    if (i8 >= 26) {
                        packageInfoT = WebView.getCurrentWebViewPackage();
                    } else if (context3 == null) {
                        packageInfoT = null;
                    } else {
                        try {
                            packageInfoT = c.a(context3).t(128, "com.android.webview");
                        } catch (PackageManager.NameNotFoundException unused3) {
                            packageInfoT = null;
                        }
                    }
                    if (packageInfoT != null) {
                        builderAppendQueryParameter5.appendQueryParameter("wvvc", Integer.toString(packageInfoT.versionCode));
                        builderAppendQueryParameter5.appendQueryParameter("wvvn", packageInfoT.versionName);
                        builderAppendQueryParameter5.appendQueryParameter("wvpn", packageInfoT.packageName);
                    }
                }
                PackageInfo packageInfo = this.zzk;
                if (packageInfo != null) {
                    builderAppendQueryParameter5.appendQueryParameter("appvc", String.valueOf(packageInfo.versionCode));
                    builderAppendQueryParameter5.appendQueryParameter("appvn", this.zzk.versionName);
                }
                arrayList2.add(builderAppendQueryParameter5.toString());
                for (final String str3 : arrayList2) {
                    final n nVar = new n(null);
                    this.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbti
                        @Override // java.lang.Runnable
                        public final void run() {
                            nVar.zza(str3);
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
