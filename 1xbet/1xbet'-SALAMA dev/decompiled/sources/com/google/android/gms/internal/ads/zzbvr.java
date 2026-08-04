package com.google.android.gms.internal.ads;

import F2.E0;
import F2.F0;
import F2.InterfaceC0261w0;
import F2.InterfaceC0265y0;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class zzbvr extends zzaxn implements zzbvt {
    public zzbvr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final Bundle zzb() {
        Parcel parcelZzcZ = zzcZ(9, zza());
        Bundle bundle = (Bundle) zzaxp.zza(parcelZzcZ, Bundle.CREATOR);
        parcelZzcZ.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final F0 zzc() {
        Parcel parcelZzcZ = zzcZ(12, zza());
        F0 f0Zzb = E0.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return f0Zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final zzbvq zzd() {
        zzbvq zzbvoVar;
        Parcel parcelZzcZ = zzcZ(11, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbvoVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            zzbvoVar = iInterfaceQueryLocalInterface instanceof zzbvq ? (zzbvq) iInterfaceQueryLocalInterface : new zzbvo(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbvoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final String zze() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final void zzf(com.google.android.gms.ads.internal.client.zzm zzmVar, zzbwa zzbwaVar) {
        Parcel parcelZza = zza();
        zzaxp.zzd(parcelZza, zzmVar);
        zzaxp.zzf(parcelZza, zzbwaVar);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final void zzg(com.google.android.gms.ads.internal.client.zzm zzmVar, zzbwa zzbwaVar) {
        Parcel parcelZza = zza();
        zzaxp.zzd(parcelZza, zzmVar);
        zzaxp.zzf(parcelZza, zzbwaVar);
        zzda(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final void zzh(boolean z4) {
        Parcel parcelZza = zza();
        int i7 = zzaxp.zza;
        parcelZza.writeInt(z4 ? 1 : 0);
        zzda(15, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final void zzi(InterfaceC0261w0 interfaceC0261w0) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, interfaceC0261w0);
        zzda(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final void zzj(InterfaceC0265y0 interfaceC0265y0) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, interfaceC0265y0);
        zzda(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final void zzk(zzbvw zzbvwVar) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, zzbvwVar);
        zzda(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final void zzl(zzbwh zzbwhVar) {
        Parcel parcelZza = zza();
        zzaxp.zzd(parcelZza, zzbwhVar);
        zzda(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final void zzm(p105o3.a aVar) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        zzda(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final void zzn(p105o3.a aVar, boolean z4) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final boolean zzo() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final void zzp(zzbwb zzbwbVar) {
        throw null;
    }
}
