package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class zzbqo extends zzaxn implements zzbqq {
    public zzbqo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbqq
    public final void zze(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqq
    public final void zzf(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzda(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqq
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) {
        Parcel zza = zza();
        zzaxp.zzd(zza, zzeVar);
        zzda(3, zza);
    }
}
