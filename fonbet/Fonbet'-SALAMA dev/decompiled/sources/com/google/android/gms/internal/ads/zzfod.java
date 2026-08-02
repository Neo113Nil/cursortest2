package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import o3.InterfaceC1506a;

/* loaded from: classes.dex */
public final class zzfod extends zzaxn implements zzfof {
    public zzfod(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.zzfof
    public final void zze(InterfaceC1506a interfaceC1506a, String str, String str2) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zza.writeString(str);
        zza.writeString(null);
        zzda(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfof
    public final void zzf() {
        zzda(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzfof
    public final void zzg(int i7) {
        Parcel zza = zza();
        zza.writeInt(i7);
        zzda(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfof
    public final void zzh(int[] iArr) {
        Parcel zza = zza();
        zza.writeIntArray(null);
        zzda(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfof
    public final void zzi(int i7) {
        Parcel zza = zza();
        zza.writeInt(i7);
        zzda(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfof
    public final void zzj(byte[] bArr) {
        Parcel zza = zza();
        zza.writeByteArray(bArr);
        zzda(5, zza);
    }
}
