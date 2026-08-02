package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import o3.InterfaceC1506a;
import v0.AbstractC1663a;

/* loaded from: classes.dex */
public final class zzbfl extends zzaxn implements zzbfn {
    public zzbfl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final InterfaceC1506a zzb(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        return AbstractC1663a.h(zzcZ(2, zza));
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzc() {
        zzda(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzd(InterfaceC1506a interfaceC1506a) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zzda(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzdt(String str, InterfaceC1506a interfaceC1506a) {
        Parcel zza = zza();
        zza.writeString(str);
        zzaxp.zzf(zza, interfaceC1506a);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzdu(InterfaceC1506a interfaceC1506a) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zzda(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzdv(zzbfg zzbfgVar) {
        Parcel zza = zza();
        zzaxp.zzf(zza, zzbfgVar);
        zzda(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzdw(InterfaceC1506a interfaceC1506a) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zzda(9, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzdx(InterfaceC1506a interfaceC1506a) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zzda(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zze(InterfaceC1506a interfaceC1506a, int i7) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zza.writeInt(i7);
        zzda(5, zza);
    }
}
