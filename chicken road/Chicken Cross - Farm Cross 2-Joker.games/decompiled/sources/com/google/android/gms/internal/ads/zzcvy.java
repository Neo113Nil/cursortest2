package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Build;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzcvy extends zzbgy {
    private final zzcvx zza;
    private final com.google.android.gms.ads.internal.client.zzbu zzb;
    private final zzfhc zzc;
    private boolean zzd;
    private final zzeaj zze;

    public zzcvy(zzcvx zzcvxVar, com.google.android.gms.ads.internal.client.zzbu zzbuVar, zzfhc zzfhcVar, zzeaj zzeajVar) {
        this.zza = zzcvxVar;
        this.zzb = zzbuVar;
        this.zzc = zzfhcVar;
        this.zze = zzeajVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzbv)).booleanValue() && Build.VERSION.SDK_INT >= 35) {
            this.zzd = true;
        } else {
            this.zzd = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzbw)).booleanValue();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final com.google.android.gms.ads.internal.client.zzbu zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void zzf(IObjectWrapper iObjectWrapper, zzbhg zzbhgVar) {
        try {
            this.zzc.zzp(zzbhgVar);
            this.zza.zzb((Activity) ObjectWrapper.unwrap(iObjectWrapper), zzbhgVar, this.zzd);
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final com.google.android.gms.ads.internal.client.zzdx zzg() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhO)).booleanValue()) {
            return this.zza.zzn();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void zzh(boolean z) {
        this.zzd = z;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void zzi(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        if (this.zzc != null) {
            try {
                if (!zzdqVar.zzf()) {
                    this.zze.zzb();
                }
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zze("Error in making CSI ping for reporting paid event callback", e);
            }
            this.zzc.zzr(zzdqVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final String zzj() {
        try {
            return this.zzb.zzt();
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final long zzk() {
        zzcvx zzcvxVar = this.zza;
        if (zzcvxVar == null || zzcvxVar.zzo() == null) {
            return 0L;
        }
        return zzcvxVar.zzo().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void zzl(long j) {
        zzcvx zzcvxVar = this.zza;
        if (zzcvxVar == null || zzcvxVar.zzo() == null) {
            return;
        }
        zzcvxVar.zzo().zzb(j);
    }
}
