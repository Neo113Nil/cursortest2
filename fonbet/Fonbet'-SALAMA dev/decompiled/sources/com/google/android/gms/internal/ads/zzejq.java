package com.google.android.gms.internal.ads;

import F2.InterfaceC0266z;
import J2.j;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzejq {
    private final zzdhn zza;
    private final zzejd zzb;
    private final zzcut zzc;

    public zzejq(zzdhn zzdhnVar, zzdqq zzdqqVar) {
        this.zza = zzdhnVar;
        final zzejd zzejdVar = new zzejd(zzdqqVar);
        this.zzb = zzejdVar;
        final zzbls zzg = zzdhnVar.zzg();
        this.zzc = new zzcut() { // from class: com.google.android.gms.internal.ads.zzejp
            @Override // com.google.android.gms.internal.ads.zzcut
            public final void zzdz(com.google.android.gms.ads.internal.client.zze zzeVar) {
                zzejd.this.zzdz(zzeVar);
                zzbls zzblsVar = zzg;
                if (zzblsVar != null) {
                    try {
                        zzblsVar.zzf(zzeVar);
                    } catch (RemoteException e7) {
                        j.i("#007 Could not call remote method.", e7);
                    }
                }
                if (zzblsVar != null) {
                    try {
                        zzblsVar.zze(zzeVar.f10720a);
                    } catch (RemoteException e8) {
                        j.i("#007 Could not call remote method.", e8);
                    }
                }
            }
        };
    }

    public final zzcut zza() {
        return this.zzc;
    }

    public final zzcwe zzb() {
        return this.zzb;
    }

    public final zzdfi zzc() {
        return new zzdfi(this.zza, this.zzb.zzg());
    }

    public final zzejd zzd() {
        return this.zzb;
    }

    public final void zze(InterfaceC0266z interfaceC0266z) {
        this.zzb.zzj(interfaceC0266z);
    }
}
