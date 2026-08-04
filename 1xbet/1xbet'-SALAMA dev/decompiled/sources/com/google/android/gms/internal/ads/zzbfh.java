package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class zzbfh extends zzaxn implements zzbfj {
    public zzbfh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // com.google.android.gms.internal.ads.zzbfj
    public final double zzb() {
        Parcel parcelZzcZ = zzcZ(3, zza());
        double d7 = parcelZzcZ.readDouble();
        parcelZzcZ.recycle();
        return d7;
    }

    @Override // com.google.android.gms.internal.ads.zzbfj
    public final int zzc() {
        Parcel parcelZzcZ = zzcZ(5, zza());
        int i7 = parcelZzcZ.readInt();
        parcelZzcZ.recycle();
        return i7;
    }

    @Override // com.google.android.gms.internal.ads.zzbfj
    public final int zzd() {
        Parcel parcelZzcZ = zzcZ(4, zza());
        int i7 = parcelZzcZ.readInt();
        parcelZzcZ.recycle();
        return i7;
    }

    @Override // com.google.android.gms.internal.ads.zzbfj
    public final Uri zze() {
        Parcel parcelZzcZ = zzcZ(2, zza());
        Uri uri = (Uri) zzaxp.zza(parcelZzcZ, Uri.CREATOR);
        parcelZzcZ.recycle();
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.zzbfj
    public final p105o3.a zzf() {
        return p150v0.a.h(zzcZ(1, zza()));
    }
}
