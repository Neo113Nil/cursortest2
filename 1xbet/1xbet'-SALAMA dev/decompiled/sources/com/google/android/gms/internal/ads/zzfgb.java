package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.P;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.d;
import com.google.android.gms.common.g;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class zzfgb implements Runnable {
    public static Boolean zzb;
    private final Context zze;
    private final VersionInfoParcel zzf;
    private int zzi;
    private final zzdod zzj;
    private final List zzk;
    private final zzbuw zzm;
    public static final Object zza = new Object();
    private static final Object zzc = new Object();
    private static final Object zzd = new Object();
    private final zzfgg zzg = zzfgk.zzb();
    private String zzh = "";
    private boolean zzl = false;

    public zzfgb(Context context, VersionInfoParcel versionInfoParcel, zzdod zzdodVar, zzdyl zzdylVar, zzbuw zzbuwVar) {
        this.zze = context;
        this.zzf = versionInfoParcel;
        this.zzj = zzdodVar;
        this.zzm = zzbuwVar;
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zziQ)).booleanValue()) {
            this.zzk = P.y();
        } else {
            this.zzk = zzfwh.zzn();
        }
    }

    public static boolean zza() {
        boolean zBooleanValue;
        synchronized (zza) {
            try {
                if (zzb == null) {
                    if (((Boolean) zzbdr.zzb.zze()).booleanValue()) {
                        zzb = Boolean.valueOf(Math.random() < ((Double) zzbdr.zza.zze()).doubleValue());
                    } else {
                        zzb = Boolean.FALSE;
                    }
                }
                zBooleanValue = zzb.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    public static void zzb(zzfgb zzfgbVar, zzffr zzffrVar) {
        synchronized (zzd) {
            try {
                if (!zzfgbVar.zzl) {
                    zzfgbVar.zzl = true;
                    if (zza()) {
                        try {
                            P p5 = o.f1952C.f1957c;
                            zzfgbVar.zzh = P.F(zzfgbVar.zze);
                        } catch (RemoteException | RuntimeException e7) {
                            o.f1952C.f1961g.zzw(e7, "CuiMonitor.gettingAppIdFromManifest");
                        }
                        d dVar = d.f11217b;
                        Context context = zzfgbVar.zze;
                        dVar.getClass();
                        zzfgbVar.zzi = g.getApkVersion(context);
                        zzbbp zzbbpVar = zzbby.zziL;
                        C0254t c0254t = C0254t.f2723d;
                        int iIntValue = ((Integer) c0254t.f2726c.zzb(zzbbpVar)).intValue();
                        if (((Boolean) c0254t.f2726c.zzb(zzbby.zzlR)).booleanValue()) {
                            long j = iIntValue;
                            zzbza.zzd.scheduleWithFixedDelay(zzfgbVar, j, j, TimeUnit.MILLISECONDS);
                        } else {
                            long j3 = iIntValue;
                            zzbza.zzd.scheduleAtFixedRate(zzfgbVar, j3, j3, TimeUnit.MILLISECONDS);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zza() && zzffrVar != null) {
            synchronized (zzc) {
                try {
                    int iZza = zzfgbVar.zzg.zza();
                    zzbbp zzbbpVar2 = zzbby.zziM;
                    C0254t c0254t2 = C0254t.f2723d;
                    if (iZza >= ((Integer) c0254t2.f2726c.zzb(zzbbpVar2)).intValue()) {
                        return;
                    }
                    zzfgc zzfgcVarZza = zzfgf.zza();
                    zzfgcVarZza.zzu(zzffrVar.zzm());
                    zzfgcVarZza.zzq(zzffrVar.zzl());
                    zzfgcVarZza.zzg(zzffrVar.zzb());
                    zzfgcVarZza.zzw(3);
                    zzfgcVarZza.zzn(zzfgbVar.zzf.f10834a);
                    zzfgcVarZza.zzb(zzfgbVar.zzh);
                    zzfgcVarZza.zzk(Build.VERSION.RELEASE);
                    zzfgcVarZza.zzr(Build.VERSION.SDK_INT);
                    zzfgcVarZza.zzv(zzffrVar.zzo());
                    zzfgcVarZza.zzj(zzffrVar.zza());
                    zzfgcVarZza.zze(zzfgbVar.zzi);
                    zzfgcVarZza.zzt(zzffrVar.zzn());
                    zzfgcVarZza.zzc(zzffrVar.zze());
                    zzfgcVarZza.zzf(zzffrVar.zzg());
                    zzfgcVarZza.zzh(zzffrVar.zzh());
                    zzfgcVarZza.zzi(zzfgbVar.zzj.zzb(zzffrVar.zzh()));
                    zzfgcVarZza.zzl(zzffrVar.zzi());
                    zzfgcVarZza.zzm(zzffrVar.zzd());
                    zzfgcVarZza.zzd(zzffrVar.zzf());
                    zzfgcVarZza.zzs(zzffrVar.zzk());
                    zzfgcVarZza.zzo(zzffrVar.zzj());
                    zzfgcVarZza.zzp(zzffrVar.zzc());
                    if (((Boolean) c0254t2.f2726c.zzb(zzbby.zziQ)).booleanValue()) {
                        zzfgcVarZza.zza(zzfgbVar.zzk);
                    }
                    zzfgg zzfggVar = zzfgbVar.zzg;
                    zzfgh zzfghVarZza = zzfgi.zza();
                    zzfghVarZza.zza(zzfgcVarZza);
                    zzfggVar.zzb(zzfghVarZza);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArrZzaV;
        if (zza()) {
            Object obj = zzc;
            synchronized (obj) {
                try {
                    if (this.zzg.zza() == 0) {
                        return;
                    }
                    try {
                        synchronized (obj) {
                            bArrZzaV = ((zzfgk) this.zzg.zzbr()).zzaV();
                            this.zzg.zzc();
                        }
                        new zzdyk(this.zze, this.zzf.f10834a, this.zzm, Binder.getCallingUid()).zza(new zzdyi((String) C0254t.f2723d.f2726c.zzb(zzbby.zziK), 60000, new HashMap(), bArrZzaV, "application/x-protobuf", false));
                    } catch (Exception e7) {
                        if ((e7 instanceof zzdus) && ((zzdus) e7).zza() == 3) {
                            return;
                        }
                        o.f1952C.f1961g.zzv(e7, "CuiMonitor.sendCuiPing");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void zzc(final zzffr zzffrVar) {
        zzbza.zza.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfga
            @Override // java.lang.Runnable
            public final void run() {
                zzfgb.zzb(this.zza, zzffrVar);
            }
        });
    }
}
