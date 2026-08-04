package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class zzbsm extends zzaxn implements zzbso {
    public zzbsm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // com.google.android.gms.internal.ads.zzbso
    public final boolean zzH() {
        Parcel parcelZzcZ = zzcZ(11, zza());
        boolean zZzg = zzaxp.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbso
    public final void zzh(int i7, int i8, Intent intent) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i7);
        parcelZza.writeInt(i8);
        zzaxp.zzd(parcelZza, intent);
        zzda(12, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbso
    public final void zzi() {
        zzda(10, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbso
    public final void zzk(p105o3.a aVar) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        zzda(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbso
    public final void zzl(Bundle bundle) {
        Parcel parcelZza = zza();
        zzaxp.zzd(parcelZza, bundle);
        zzda(1, parcelZza);
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
        Parcel parcelZza = zza();
        parcelZza.writeInt(i7);
        parcelZza.writeStringArray(strArr);
        parcelZza.writeIntArray(iArr);
        zzda(15, parcelZza);
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
        Parcel parcelZza = zza();
        zzaxp.zzd(parcelZza, bundle);
        Parcel parcelZzcZ = zzcZ(6, parcelZza);
        if (parcelZzcZ.readInt() != 0) {
            bundle.readFromParcel(parcelZzcZ);
        }
        parcelZzcZ.recycle();
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
