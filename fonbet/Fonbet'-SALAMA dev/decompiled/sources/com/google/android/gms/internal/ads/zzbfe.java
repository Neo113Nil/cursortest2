package com.google.android.gms.internal.ads;

import F2.H0;
import F2.I0;
import android.os.IBinder;
import android.os.Parcel;
import o3.InterfaceC1506a;
import v0.AbstractC1663a;

/* loaded from: classes.dex */
public final class zzbfe extends zzaxn implements zzbfg {
    public zzbfe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final float zze() {
        Parcel zzcZ = zzcZ(2, zza());
        float readFloat = zzcZ.readFloat();
        zzcZ.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final float zzf() {
        Parcel zzcZ = zzcZ(6, zza());
        float readFloat = zzcZ.readFloat();
        zzcZ.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final float zzg() {
        Parcel zzcZ = zzcZ(5, zza());
        float readFloat = zzcZ.readFloat();
        zzcZ.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final I0 zzh() {
        Parcel zzcZ = zzcZ(7, zza());
        I0 zzb = H0.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final InterfaceC1506a zzi() {
        return AbstractC1663a.h(zzcZ(4, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final void zzj(InterfaceC1506a interfaceC1506a) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zzda(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final boolean zzk() {
        Parcel zzcZ = zzcZ(10, zza());
        boolean zzg = zzaxp.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final boolean zzl() {
        Parcel zzcZ = zzcZ(8, zza());
        boolean zzg = zzaxp.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final void zzm(zzbgr zzbgrVar) {
        throw null;
    }
}
