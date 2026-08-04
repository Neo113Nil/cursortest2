package com.google.android.gms.internal.ads;

import F2.H0;
import F2.I0;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class zzbfe extends zzaxn implements zzbfg {
    public zzbfe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final float zze() {
        Parcel parcelZzcZ = zzcZ(2, zza());
        float f7 = parcelZzcZ.readFloat();
        parcelZzcZ.recycle();
        return f7;
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final float zzf() {
        Parcel parcelZzcZ = zzcZ(6, zza());
        float f7 = parcelZzcZ.readFloat();
        parcelZzcZ.recycle();
        return f7;
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final float zzg() {
        Parcel parcelZzcZ = zzcZ(5, zza());
        float f7 = parcelZzcZ.readFloat();
        parcelZzcZ.recycle();
        return f7;
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final I0 zzh() {
        Parcel parcelZzcZ = zzcZ(7, zza());
        I0 i0Zzb = H0.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return i0Zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final p105o3.a zzi() {
        return p150v0.a.h(zzcZ(4, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final void zzj(p105o3.a aVar) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        zzda(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final boolean zzk() {
        Parcel parcelZzcZ = zzcZ(10, zza());
        boolean zZzg = zzaxp.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final boolean zzl() {
        Parcel parcelZzcZ = zzcZ(8, zza());
        boolean zZzg = zzaxp.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final void zzm(zzbgr zzbgrVar) {
        throw null;
    }
}
