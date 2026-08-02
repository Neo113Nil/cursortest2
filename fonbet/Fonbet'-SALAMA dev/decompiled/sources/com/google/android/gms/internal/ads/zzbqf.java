package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class zzbqf extends zzaxn implements zzbqh {
    public zzbqf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbqh
    public final void zze(String str) {
        Parcel zza = zza();
        zza.writeString("Adapter returned null.");
        zzda(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqh
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) {
        Parcel zza = zza();
        zzaxp.zzd(zza, zzeVar);
        zzda(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqh
    public final void zzg(zzbpd zzbpdVar) {
        Parcel zza = zza();
        zzaxp.zzf(zza, zzbpdVar);
        zzda(1, zza);
    }
}
