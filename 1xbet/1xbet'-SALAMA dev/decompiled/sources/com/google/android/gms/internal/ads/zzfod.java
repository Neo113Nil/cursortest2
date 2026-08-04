package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class zzfod extends zzaxn implements zzfof {
    public zzfod(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.zzfof
    public final void zze(p105o3.a aVar, String str, String str2) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        parcelZza.writeString(str);
        parcelZza.writeString(null);
        zzda(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzfof
    public final void zzf() {
        zzda(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzfof
    public final void zzg(int i7) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i7);
        zzda(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzfof
    public final void zzh(int[] iArr) {
        Parcel parcelZza = zza();
        parcelZza.writeIntArray(null);
        zzda(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzfof
    public final void zzi(int i7) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i7);
        zzda(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzfof
    public final void zzj(byte[] bArr) {
        Parcel parcelZza = zza();
        parcelZza.writeByteArray(bArr);
        zzda(5, parcelZza);
    }
}
