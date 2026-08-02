package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import o3.InterfaceC1506a;
import v0.AbstractC1663a;

/* loaded from: classes.dex */
public final class zzbfh extends zzaxn implements zzbfj {
    public zzbfh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // com.google.android.gms.internal.ads.zzbfj
    public final double zzb() {
        Parcel zzcZ = zzcZ(3, zza());
        double readDouble = zzcZ.readDouble();
        zzcZ.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.zzbfj
    public final int zzc() {
        Parcel zzcZ = zzcZ(5, zza());
        int readInt = zzcZ.readInt();
        zzcZ.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.zzbfj
    public final int zzd() {
        Parcel zzcZ = zzcZ(4, zza());
        int readInt = zzcZ.readInt();
        zzcZ.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.zzbfj
    public final Uri zze() {
        Parcel zzcZ = zzcZ(2, zza());
        Uri uri = (Uri) zzaxp.zza(zzcZ, Uri.CREATOR);
        zzcZ.recycle();
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.zzbfj
    public final InterfaceC1506a zzf() {
        return AbstractC1663a.h(zzcZ(1, zza()));
    }
}
