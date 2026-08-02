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

/* loaded from: classes.dex */
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
        boolean booleanValue;
        synchronized (zza) {
            try {
                if (zzb == null) {
                    if (((Boolean) zzbdr.zzb.zze()).booleanValue()) {
                        zzb = Boolean.valueOf(Math.random() < ((Double) zzbdr.zza.zze()).doubleValue());
                    } else {
                        zzb = Boolean.FALSE;
                    }
                }
                booleanValue = zzb.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
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
                        int intValue = ((Integer) c0254t.f2726c.zzb(zzbbpVar)).intValue();
                        if (((Boolean) c0254t.f2726c.zzb(zzbby.zzlR)).booleanValue()) {
                            long j = intValue;
                            zzbza.zzd.scheduleWithFixedDelay(zzfgbVar, j, j, TimeUnit.MILLISECONDS);
                        } else {
                            long j3 = intValue;
                            zzbza.zzd.scheduleAtFixedRate(zzfgbVar, j3, j3, TimeUnit.MILLISECONDS);
                        }
                    }
                }
            } finally {
            }
        }
        if (zza() && zzffrVar != null) {
            synchronized (zzc) {
                try {
                    int zza2 = zzfgbVar.zzg.zza();
                    zzbbp zzbbpVar2 = zzbby.zziM;
                    C0254t c0254t2 = C0254t.f2723d;
                    if (zza2 >= ((Integer) c0254t2.f2726c.zzb(zzbbpVar2)).intValue()) {
                        return;
                    }
                    zzfgc zza3 = zzfgf.zza();
                    zza3.zzu(zzffrVar.zzm());
                    zza3.zzq(zzffrVar.zzl());
                    zza3.zzg(zzffrVar.zzb());
                    zza3.zzw(3);
                    zza3.zzn(zzfgbVar.zzf.f10834a);
                    zza3.zzb(zzfgbVar.zzh);
                    zza3.zzk(Build.VERSION.RELEASE);
                    zza3.zzr(Build.VERSION.SDK_INT);
                    zza3.zzv(zzffrVar.zzo());
                    zza3.zzj(zzffrVar.zza());
                    zza3.zze(zzfgbVar.zzi);
                    zza3.zzt(zzffrVar.zzn());
                    zza3.zzc(zzffrVar.zze());
                    zza3.zzf(zzffrVar.zzg());
                    zza3.zzh(zzffrVar.zzh());
                    zza3.zzi(zzfgbVar.zzj.zzb(zzffrVar.zzh()));
                    zza3.zzl(zzffrVar.zzi());
                    zza3.zzm(zzffrVar.zzd());
                    zza3.zzd(zzffrVar.zzf());
                    zza3.zzs(zzffrVar.zzk());
                    zza3.zzo(zzffrVar.zzj());
                    zza3.zzp(zzffrVar.zzc());
                    if (((Boolean) c0254t2.f2726c.zzb(zzbby.zziQ)).booleanValue()) {
                        zza3.zza(zzfgbVar.zzk);
                    }
                    zzfgg zzfggVar = zzfgbVar.zzg;
                    zzfgh zza4 = zzfgi.zza();
                    zza4.zza(zza3);
                    zzfggVar.zzb(zza4);
                } finally {
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] zzaV;
        if (zza()) {
            Object obj = zzc;
            synchronized (obj) {
                try {
                    if (this.zzg.zza() == 0) {
                        return;
                    }
                    try {
                        synchronized (obj) {
                            zzaV = ((zzfgk) this.zzg.zzbr()).zzaV();
                            this.zzg.zzc();
                        }
                        new zzdyk(this.zze, this.zzf.f10834a, this.zzm, Binder.getCallingUid()).zza(new zzdyi((String) C0254t.f2723d.f2726c.zzb(zzbby.zziK), 60000, new HashMap(), zzaV, "application/x-protobuf", false));
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
                zzfgb.zzb(zzfgb.this, zzffrVar);
            }
        });
    }
}
