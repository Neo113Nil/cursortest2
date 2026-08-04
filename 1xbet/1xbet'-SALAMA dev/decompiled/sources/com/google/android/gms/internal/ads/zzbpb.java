package com.google.android.gms.internal.ads;

import F2.H0;
import F2.I0;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzbpb extends zzaxn implements zzbpd {
    public zzbpb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final boolean zzA() {
        Parcel parcelZzcZ = zzcZ(18, zza());
        boolean zZzg = zzaxp.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final boolean zzB() {
        Parcel parcelZzcZ = zzcZ(17, zza());
        boolean zZzg = zzaxp.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final double zze() {
        Parcel parcelZzcZ = zzcZ(8, zza());
        double d7 = parcelZzcZ.readDouble();
        parcelZzcZ.recycle();
        return d7;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final float zzf() {
        Parcel parcelZzcZ = zzcZ(23, zza());
        float f7 = parcelZzcZ.readFloat();
        parcelZzcZ.recycle();
        return f7;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final float zzg() {
        Parcel parcelZzcZ = zzcZ(25, zza());
        float f7 = parcelZzcZ.readFloat();
        parcelZzcZ.recycle();
        return f7;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final float zzh() {
        Parcel parcelZzcZ = zzcZ(24, zza());
        float f7 = parcelZzcZ.readFloat();
        parcelZzcZ.recycle();
        return f7;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final Bundle zzi() {
        Parcel parcelZzcZ = zzcZ(16, zza());
        Bundle bundle = (Bundle) zzaxp.zza(parcelZzcZ, Bundle.CREATOR);
        parcelZzcZ.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final I0 zzj() {
        Parcel parcelZzcZ = zzcZ(11, zza());
        I0 i0Zzb = H0.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return i0Zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final zzbfc zzk() {
        Parcel parcelZzcZ = zzcZ(12, zza());
        zzbfc zzbfcVarZzj = zzbfb.zzj(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbfcVarZzj;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final zzbfj zzl() {
        Parcel parcelZzcZ = zzcZ(5, zza());
        zzbfj zzbfjVarZzg = zzbfi.zzg(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbfjVarZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final p105o3.a zzm() {
        return p150v0.a.h(zzcZ(13, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final p105o3.a zzn() {
        return p150v0.a.h(zzcZ(14, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final p105o3.a zzo() {
        return p150v0.a.h(zzcZ(15, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final String zzp() {
        Parcel parcelZzcZ = zzcZ(7, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final String zzq() {
        Parcel parcelZzcZ = zzcZ(4, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final String zzr() {
        Parcel parcelZzcZ = zzcZ(6, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final String zzs() {
        Parcel parcelZzcZ = zzcZ(2, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final String zzt() {
        Parcel parcelZzcZ = zzcZ(10, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final String zzu() {
        Parcel parcelZzcZ = zzcZ(9, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final List zzv() {
        Parcel parcelZzcZ = zzcZ(3, zza());
        ArrayList arrayListZzb = zzaxp.zzb(parcelZzcZ);
        parcelZzcZ.recycle();
        return arrayListZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzw(p105o3.a aVar) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        zzda(20, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzx() {
        zzda(19, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzy(p105o3.a aVar, p105o3.a aVar2, p105o3.a aVar3) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        zzaxp.zzf(parcelZza, aVar2);
        zzaxp.zzf(parcelZza, aVar3);
        zzda(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzz(p105o3.a aVar) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        zzda(22, parcelZza);
    }
}
