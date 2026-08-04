package com.google.android.gms.internal.ads;

import F2.H0;
import F2.I0;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzbpa extends zzaxn implements IInterface {
    public zzbpa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    public final Bundle zze() {
        Parcel parcelZzcZ = zzcZ(13, zza());
        Bundle bundle = (Bundle) zzaxp.zza(parcelZzcZ, Bundle.CREATOR);
        parcelZzcZ.recycle();
        return bundle;
    }

    public final I0 zzf() {
        Parcel parcelZzcZ = zzcZ(16, zza());
        I0 i0Zzb = H0.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return i0Zzb;
    }

    public final zzbfc zzg() {
        Parcel parcelZzcZ = zzcZ(19, zza());
        zzbfc zzbfcVarZzj = zzbfb.zzj(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbfcVarZzj;
    }

    public final zzbfj zzh() {
        Parcel parcelZzcZ = zzcZ(5, zza());
        zzbfj zzbfjVarZzg = zzbfi.zzg(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbfjVarZzg;
    }

    public final p105o3.a zzi() {
        return p150v0.a.h(zzcZ(15, zza()));
    }

    public final p105o3.a zzj() {
        return p150v0.a.h(zzcZ(20, zza()));
    }

    public final p105o3.a zzk() {
        return p150v0.a.h(zzcZ(21, zza()));
    }

    public final String zzl() {
        Parcel parcelZzcZ = zzcZ(7, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    public final String zzm() {
        Parcel parcelZzcZ = zzcZ(4, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    public final String zzn() {
        Parcel parcelZzcZ = zzcZ(6, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    public final String zzo() {
        Parcel parcelZzcZ = zzcZ(2, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    public final List zzp() {
        Parcel parcelZzcZ = zzcZ(3, zza());
        ArrayList arrayListZzb = zzaxp.zzb(parcelZzcZ);
        parcelZzcZ.recycle();
        return arrayListZzb;
    }

    public final void zzq(p105o3.a aVar) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        zzda(9, parcelZza);
    }

    public final void zzr() {
        zzda(8, zza());
    }

    public final void zzs(p105o3.a aVar) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        zzda(10, parcelZza);
    }

    public final void zzt(p105o3.a aVar, p105o3.a aVar2, p105o3.a aVar3) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        zzaxp.zzf(parcelZza, aVar2);
        zzaxp.zzf(parcelZza, aVar3);
        zzda(22, parcelZza);
    }

    public final void zzu(p105o3.a aVar) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        zzda(14, parcelZza);
    }

    public final boolean zzv() {
        Parcel parcelZzcZ = zzcZ(12, zza());
        boolean zZzg = zzaxp.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }

    public final boolean zzw() {
        Parcel parcelZzcZ = zzcZ(11, zza());
        boolean zZzg = zzaxp.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }
}
