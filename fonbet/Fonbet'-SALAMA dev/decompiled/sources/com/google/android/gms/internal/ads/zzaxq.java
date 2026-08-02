package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import o3.InterfaceC1506a;

/* loaded from: classes.dex */
public final class zzaxq extends zzaxn implements zzaxs {
    public zzaxq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    @Override // com.google.android.gms.internal.ads.zzaxs
    public final void zze(InterfaceC1506a interfaceC1506a, String str) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zza.writeString("GMA_SDK");
        zzda(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzaxs
    public final void zzf() {
        zzda(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzaxs
    public final void zzg(int i7) {
        Parcel zza = zza();
        zza.writeInt(i7);
        zzda(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzaxs
    public final void zzh(int[] iArr) {
        Parcel zza = zza();
        zza.writeIntArray(null);
        zzda(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzaxs
    public final void zzi(int i7) {
        Parcel zza = zza();
        zza.writeInt(0);
        zzda(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzaxs
    public final void zzj(byte[] bArr) {
        Parcel zza = zza();
        zza.writeByteArray(bArr);
        zzda(5, zza);
    }
}
