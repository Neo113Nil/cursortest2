package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class zzazv extends zzaxn implements zzazx {
    public zzazv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzazx
    public final void zzb() {
        zzda(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzazx
    public final void zzc() {
        zzda(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzazx
    public final void zzd(com.google.android.gms.ads.internal.client.zze zzeVar) {
        Parcel zza = zza();
        zzaxp.zzd(zza, zzeVar);
        zzda(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzazx
    public final void zze() {
        zzda(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzazx
    public final void zzf() {
        zzda(1, zza());
    }
}
