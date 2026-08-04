package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class zzbfl extends zzaxn implements zzbfn {
    public zzbfl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final p105o3.a zzb(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        return p150v0.a.h(zzcZ(2, parcelZza));
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzc() {
        zzda(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzd(p105o3.a aVar) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        zzda(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzdt(String str, p105o3.a aVar) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzaxp.zzf(parcelZza, aVar);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzdu(p105o3.a aVar) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        zzda(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzdv(zzbfg zzbfgVar) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, zzbfgVar);
        zzda(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzdw(p105o3.a aVar) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        zzda(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzdx(p105o3.a aVar) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        zzda(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zze(p105o3.a aVar, int i7) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        parcelZza.writeInt(i7);
        zzda(5, parcelZza);
    }
}
