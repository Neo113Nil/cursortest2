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
public final class zzboz extends zzaxn implements IInterface {
    public zzboz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    public final double zze() {
        Parcel parcelZzcZ = zzcZ(7, zza());
        double d7 = parcelZzcZ.readDouble();
        parcelZzcZ.recycle();
        return d7;
    }

    public final Bundle zzf() {
        Parcel parcelZzcZ = zzcZ(15, zza());
        Bundle bundle = (Bundle) zzaxp.zza(parcelZzcZ, Bundle.CREATOR);
        parcelZzcZ.recycle();
        return bundle;
    }

    public final I0 zzg() {
        Parcel parcelZzcZ = zzcZ(17, zza());
        I0 i0Zzb = H0.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return i0Zzb;
    }

    public final zzbfc zzh() {
        Parcel parcelZzcZ = zzcZ(19, zza());
        zzbfc zzbfcVarZzj = zzbfb.zzj(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbfcVarZzj;
    }

    public final zzbfj zzi() {
        Parcel parcelZzcZ = zzcZ(5, zza());
        zzbfj zzbfjVarZzg = zzbfi.zzg(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbfjVarZzg;
    }

    public final p105o3.a zzj() {
        return p150v0.a.h(zzcZ(18, zza()));
    }

    public final p105o3.a zzk() {
        return p150v0.a.h(zzcZ(20, zza()));
    }

    public final p105o3.a zzl() {
        return p150v0.a.h(zzcZ(21, zza()));
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

    public final String zzp() {
        Parcel parcelZzcZ = zzcZ(9, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    public final String zzq() {
        Parcel parcelZzcZ = zzcZ(8, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    public final List zzr() {
        Parcel parcelZzcZ = zzcZ(3, zza());
        ArrayList arrayListZzb = zzaxp.zzb(parcelZzcZ);
        parcelZzcZ.recycle();
        return arrayListZzb;
    }

    public final void zzs(p105o3.a aVar) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        zzda(11, parcelZza);
    }

    public final void zzt() {
        zzda(10, zza());
    }

    public final void zzu(p105o3.a aVar) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        zzda(12, parcelZza);
    }

    public final void zzv(p105o3.a aVar, p105o3.a aVar2, p105o3.a aVar3) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        zzaxp.zzf(parcelZza, aVar2);
        zzaxp.zzf(parcelZza, aVar3);
        zzda(22, parcelZza);
    }

    public final void zzw(p105o3.a aVar) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        zzda(16, parcelZza);
    }

    public final boolean zzx() {
        Parcel parcelZzcZ = zzcZ(14, zza());
        boolean zZzg = zzaxp.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }

    public final boolean zzy() {
        Parcel parcelZzcZ = zzcZ(13, zza());
        boolean zZzg = zzaxp.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }
}
