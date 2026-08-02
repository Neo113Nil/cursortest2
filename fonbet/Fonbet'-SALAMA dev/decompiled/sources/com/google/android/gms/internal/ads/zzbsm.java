package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import o3.InterfaceC1506a;

/* loaded from: classes.dex */
public final class zzbsm extends zzaxn implements zzbso {
    public zzbsm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // com.google.android.gms.internal.ads.zzbso
    public final boolean zzH() {
        Parcel zzcZ = zzcZ(11, zza());
        boolean zzg = zzaxp.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbso
    public final void zzh(int i7, int i8, Intent intent) {
        Parcel zza = zza();
        zza.writeInt(i7);
        zza.writeInt(i8);
        zzaxp.zzd(zza, intent);
        zzda(12, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbso
    public final void zzi() {
        zzda(10, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbso
    public final void zzk(InterfaceC1506a interfaceC1506a) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zzda(13, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbso
    public final void zzl(Bundle bundle) {
        Parcel zza = zza();
        zzaxp.zzd(zza, bundle);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbso
    public final void zzm() {
        zzda(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbso
    public final void zzo() {
        zzda(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbso
    public final void zzp(int i7, String[] strArr, int[] iArr) {
        Parcel zza = zza();
        zza.writeInt(i7);
        zza.writeStringArray(strArr);
        zza.writeIntArray(iArr);
        zzda(15, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbso
    public final void zzq() {
        zzda(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbso
    public final void zzr() {
        zzda(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbso
    public final void zzs(Bundle bundle) {
        Parcel zza = zza();
        zzaxp.zzd(zza, bundle);
        Parcel zzcZ = zzcZ(6, zza);
        if (zzcZ.readInt() != 0) {
            bundle.readFromParcel(zzcZ);
        }
        zzcZ.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzbso
    public final void zzt() {
        zzda(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbso
    public final void zzu() {
        zzda(7, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbso
    public final void zzv() {
        zzda(14, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbso
    public final void zzx() {
        zzda(9, zza());
    }
}
