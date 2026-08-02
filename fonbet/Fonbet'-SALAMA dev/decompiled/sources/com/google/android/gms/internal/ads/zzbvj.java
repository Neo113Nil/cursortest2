package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import o3.InterfaceC1506a;

/* loaded from: classes.dex */
public final class zzbvj extends zzaxn implements zzbvl {
    public zzbvj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final void zze(InterfaceC1506a interfaceC1506a) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zzda(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final void zzf(InterfaceC1506a interfaceC1506a) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zzda(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final void zzg(InterfaceC1506a interfaceC1506a, int i7) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zza.writeInt(i7);
        zzda(9, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final void zzh(InterfaceC1506a interfaceC1506a) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final void zzi(InterfaceC1506a interfaceC1506a) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zzda(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final void zzj(InterfaceC1506a interfaceC1506a) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zzda(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final void zzk(InterfaceC1506a interfaceC1506a, int i7) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final void zzl(InterfaceC1506a interfaceC1506a) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final void zzm(InterfaceC1506a interfaceC1506a, zzbvm zzbvmVar) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zzaxp.zzd(zza, zzbvmVar);
        zzda(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final void zzn(InterfaceC1506a interfaceC1506a) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zzda(13, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final void zzo(InterfaceC1506a interfaceC1506a) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zzda(11, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final void zzp(InterfaceC1506a interfaceC1506a) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zzda(5, zza);
    }
}
