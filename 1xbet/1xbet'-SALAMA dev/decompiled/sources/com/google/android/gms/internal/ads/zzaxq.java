package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class zzaxq extends zzaxn implements zzaxs {
    public zzaxq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    @Override // com.google.android.gms.internal.ads.zzaxs
    public final void zze(p105o3.a aVar, String str) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        parcelZza.writeString("GMA_SDK");
        zzda(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzaxs
    public final void zzf() {
        zzda(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzaxs
    public final void zzg(int i7) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i7);
        zzda(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzaxs
    public final void zzh(int[] iArr) {
        Parcel parcelZza = zza();
        parcelZza.writeIntArray(null);
        zzda(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzaxs
    public final void zzi(int i7) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(0);
        zzda(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzaxs
    public final void zzj(byte[] bArr) {
        Parcel parcelZza = zza();
        parcelZza.writeByteArray(bArr);
        zzda(5, parcelZza);
    }
}
