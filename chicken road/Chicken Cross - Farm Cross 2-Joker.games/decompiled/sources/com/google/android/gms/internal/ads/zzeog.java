package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzeog extends zzccr implements zzdez {
    private zzccs zza;
    private zzdey zzb;
    private zzdmh zzc;

    @Override // com.google.android.gms.internal.ads.zzdez
    public final synchronized void zza(zzdey zzdeyVar) {
        this.zzb = zzdeyVar;
    }

    public final synchronized void zzb(zzccs zzccsVar) {
        this.zza = zzccsVar;
    }

    public final synchronized void zzc(zzdmh zzdmhVar) {
        this.zzc = zzdmhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final synchronized void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzdmh zzdmhVar = this.zzc;
        if (zzdmhVar != null) {
            final zzemt zzemtVar = ((zzerg) zzdmhVar).zzc;
            final zzfld zzfldVar = ((zzerg) zzdmhVar).zzb;
            final zzflo zzfloVar = ((zzerg) zzdmhVar).zza;
            final zzerg zzergVar = (zzerg) zzdmhVar;
            ((zzerg) zzdmhVar).zzd.zzc().execute(new Runnable(zzergVar, zzfloVar, zzfldVar, zzemtVar) { // from class: com.google.android.gms.internal.ads.zzerf
                private final /* synthetic */ zzflo zza;
                private final /* synthetic */ zzfld zzb;
                private final /* synthetic */ zzemt zzc;

                {
                    this.zza = zzfloVar;
                    this.zzb = zzfldVar;
                    this.zzc = zzemtVar;
                }

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzerj.zze(this.zza, this.zzb, this.zzc);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final synchronized void zzf(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        zzdmh zzdmhVar = this.zzc;
        if (zzdmhVar != null) {
            String str = ((zzerg) zzdmhVar).zzc.zza;
            String.valueOf(str);
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Fail to initialize adapter ".concat(String.valueOf(str)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final synchronized void zzg(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzdey zzdeyVar = this.zzb;
        if (zzdeyVar != null) {
            zzdeyVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final synchronized void zzh(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzccs zzccsVar = this.zza;
        if (zzccsVar != null) {
            ((zzeri) zzccsVar).zza.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final synchronized void zzi(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzccs zzccsVar = this.zza;
        if (zzccsVar != null) {
            ((zzeri) zzccsVar).zzd.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final synchronized void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzccs zzccsVar = this.zza;
        if (zzccsVar != null) {
            zzccsVar.zzj(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final synchronized void zzk(IObjectWrapper iObjectWrapper, zzcct zzcctVar) throws RemoteException {
        zzccs zzccsVar = this.zza;
        if (zzccsVar != null) {
            ((zzeri) zzccsVar).zzd.zzb(zzcctVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final synchronized void zzl(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzccs zzccsVar = this.zza;
        if (zzccsVar != null) {
            ((zzeri) zzccsVar).zzb.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final synchronized void zzm(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        zzdey zzdeyVar = this.zzb;
        if (zzdeyVar != null) {
            zzdeyVar.zzb(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final synchronized void zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzccs zzccsVar = this.zza;
        if (zzccsVar != null) {
            ((zzeri) zzccsVar).zzc.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final synchronized void zzo(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzccs zzccsVar = this.zza;
        if (zzccsVar != null) {
            ((zzeri) zzccsVar).zzc.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final synchronized void zzp(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzccs zzccsVar = this.zza;
        if (zzccsVar != null) {
            ((zzeri) zzccsVar).zzd.zzb(null);
        }
    }
}
