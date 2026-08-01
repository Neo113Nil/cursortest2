package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.common.util.concurrent.ListenableFuture;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzggp implements zzggk, zzggg, zzggv {
    private static final zzbdy zza;
    private final Context zzb;
    private final zzgfo zzc;
    private final ExecutorService zzd;
    private final zzgfh zze;
    private final boolean zzf;
    private final String zzg;
    private final long zzh;
    private final long zzi;
    private final double zzj;
    private final String zzk;
    private final long zzl;
    private final AtomicBoolean zzm = new AtomicBoolean(false);
    private final Object zzn = new Object();
    private final Object zzo = new Object();
    private final Object zzp = new Object();
    private final zzaxd zzq = zzaxe.zza();
    private final List zzr = new ArrayList();
    private boolean zzs = false;
    private final HashMap zzt = new HashMap();
    private final int zzu;

    static {
        zzbdx zza2 = zzbdy.zza();
        zza2.zza(17);
        zza = (zzbdy) zza2.zzbu();
    }

    public zzggp(Context context, zzgfo zzgfoVar, ExecutorService executorService, zzgfh zzgfhVar, Random random, String str, long j, long j2, double d, String str2, int i, long j3) {
        this.zzb = context;
        this.zzc = zzgfoVar;
        this.zzd = executorService;
        this.zze = zzgfhVar;
        this.zzg = str;
        this.zzh = j;
        this.zzi = j2;
        this.zzj = d;
        this.zzk = str2;
        this.zzu = i;
        this.zzl = j3;
        this.zzf = random.nextDouble() < d;
    }

    @Override // com.google.android.gms.internal.ads.zzggg
    public final ListenableFuture zza() {
        return zzhcy.zze(new Runnable() { // from class: com.google.android.gms.internal.ads.zzggn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzggp.this.zzg();
            }
        }, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzggk
    public final void zzb(int i, long j, Throwable th, String str) {
        Long valueOf;
        if (this.zzf) {
            synchronized (this.zzo) {
                List list = this.zzr;
                synchronized (this.zzp) {
                    HashMap hashMap = this.zzt;
                    Integer valueOf2 = Integer.valueOf(i);
                    Long l = (Long) hashMap.get(valueOf2);
                    if (l == null) {
                        l = 0L;
                    }
                    valueOf = Long.valueOf(l.longValue() + 1);
                    hashMap.put(valueOf2, valueOf);
                }
                list.add(new zzggm(i, j, th, str, valueOf.longValue()));
                if (!this.zzs) {
                    this.zzs = true;
                    this.zzc.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzggo
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzggp.this.zze();
                        }
                    }, this.zzi);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzggv
    public final void zzc(zzggu zzgguVar) {
        synchronized (this.zzn) {
            this.zzq.zzj(zzgguVar.zza());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzggv
    public final void zzd(List list) {
        synchronized (this.zzn) {
            this.zzq.zzm(list);
        }
    }

    final void zze() {
        zzaxd zzaxdVar;
        zzgxm zzq;
        String str;
        synchronized (this.zzn) {
            zzaxdVar = (zzaxd) this.zzq.clone();
        }
        synchronized (this.zzo) {
            List list = this.zzr;
            zzq = zzgxm.zzq(list);
            list.clear();
            this.zzs = false;
        }
        int size = zzq.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            zzggm zzggmVar = (zzggm) zzq.get(i);
            if (i2 >= this.zzh) {
                zzf((zzaxe) zzaxdVar.zzbu());
                zzaxdVar.zzb();
                i2 = 0;
            }
            zzaxv zza2 = zzaxw.zza();
            zza2.zza(zzggmVar.zza);
            zza2.zzb(zzggmVar.zzb);
            zza2.zze(zzggmVar.zze);
            String str2 = zzggmVar.zzd;
            if (str2 != null) {
                zza2.zzf(str2);
            }
            Throwable th = zzggmVar.zzc;
            zza2.zzg(th == null ? 2 : 3);
            if (th != null) {
                zza2.zzc(th.getClass().getName());
                try {
                    StringWriter stringWriter = new StringWriter();
                    try {
                        PrintWriter printWriter = new PrintWriter(stringWriter);
                        try {
                            th.printStackTrace(printWriter);
                            str = stringWriter.toString();
                            printWriter.close();
                            stringWriter.close();
                        } catch (Throwable th2) {
                            try {
                                printWriter.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        try {
                            stringWriter.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                } catch (IOException unused) {
                    str = "";
                }
                zza2.zzd(str);
            }
            zzaxdVar.zza((zzaxw) zza2.zzbu());
            i++;
            i2++;
        }
        if (i2 > 0) {
            zzf((zzaxe) zzaxdVar.zzbu());
            zzaxdVar.zzb();
        }
    }

    protected final void zzf(zzaxe zzaxeVar) {
        try {
            zzbef zza2 = zzbeg.zza();
            zza2.zzb(zza);
            zzbed zza3 = zzbee.zza();
            zza3.zza(zzaxeVar);
            zza2.zza((zzbee) zza3.zzbu());
            this.zze.zzb(this.zzg, ((zzbeg) zza2.zzbu()).zzaN(), CommonGatewayClient.HEADER_PROTOBUF);
        } catch (RuntimeException unused) {
        }
    }

    final /* synthetic */ void zzg() {
        int i;
        if (!this.zzf || this.zzm.getAndSet(true)) {
            return;
        }
        Context context = this.zzb;
        String str = this.zzk;
        int i2 = this.zzu;
        double d = this.zzj;
        long j = this.zzl;
        Locale locale = Locale.getDefault();
        int zzb = zzbel.zzb(zzgeh.zza(i2));
        zzaxd zza2 = zzaxe.zza();
        zza2.zzc(Build.VERSION.SDK_INT);
        zza2.zzd(Build.MODEL);
        zza2.zze(locale.getLanguage());
        zza2.zzf(locale.getCountry());
        zza2.zzi(str);
        zza2.zzo(zzb);
        zza2.zzp(3);
        zza2.zzg(context.getPackageName());
        zza2.zzl(j);
        if (d > 0.0d) {
            zza2.zzk((int) (1.0d / d));
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            zza2.zzh(packageManager.getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (Exception unused) {
        }
        try {
            if (packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                i = 5;
            } else if (packageManager.hasSystemFeature("android.hardware.type.watch")) {
                i = 4;
            } else if (packageManager.hasSystemFeature("android.hardware.type.pc")) {
                i = 7;
            } else {
                UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
                i = (uiModeManager == null || uiModeManager.getCurrentModeType() != 4) ? 2 : 6;
            }
            zza2.zzn(i);
        } catch (RuntimeException unused2) {
        }
        zzaxe zzaxeVar = (zzaxe) zza2.zzbu();
        synchronized (this.zzn) {
            this.zzq.zzbo(zzaxeVar);
        }
    }
}
