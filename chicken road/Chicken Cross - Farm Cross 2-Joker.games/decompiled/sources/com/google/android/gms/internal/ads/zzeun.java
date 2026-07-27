package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzeun {
    private final zzdrb zza;
    private final zzeua zzb;
    private final zzdds zzc;

    public zzeun(zzdrb zzdrbVar, zzeaj zzeajVar) {
        this.zza = zzdrbVar;
        final zzeua zzeuaVar = new zzeua(zzeajVar);
        this.zzb = zzeuaVar;
        final zzbtc zze = zzdrbVar.zze();
        this.zzc = new zzdds() { // from class: com.google.android.gms.internal.ads.zzeum
            @Override // com.google.android.gms.internal.ads.zzdds
            public final /* synthetic */ void zzdJ(com.google.android.gms.ads.internal.client.zze zzeVar) {
                zzeua.this.zzdJ(zzeVar);
                zzbtc zzbtcVar = zze;
                if (zzbtcVar != null) {
                    try {
                        zzbtcVar.zzg(zzeVar);
                    } catch (RemoteException e) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
                    }
                }
                if (zzbtcVar != null) {
                    try {
                        zzbtcVar.zzf(zzeVar.zza);
                    } catch (RemoteException e2) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e2);
                    }
                }
            }
        };
    }

    public final void zza(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        this.zzb.zzl(zzbhVar);
    }

    public final zzdov zzb() {
        return new zzdov(this.zza, this.zzb.zzi());
    }

    public final zzeua zzc() {
        return this.zzb;
    }

    public final zzdfd zzd() {
        return this.zzb;
    }

    public final zzdds zze() {
        return this.zzc;
    }
}
