package com.google.android.gms.internal.ads;

import F2.E0;
import F2.F0;
import F2.InterfaceC0261w0;
import F2.InterfaceC0265y0;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import o3.InterfaceC1506a;

/* loaded from: classes.dex */
public final class zzbvr extends zzaxn implements zzbvt {
    public zzbvr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final Bundle zzb() {
        Parcel zzcZ = zzcZ(9, zza());
        Bundle bundle = (Bundle) zzaxp.zza(zzcZ, Bundle.CREATOR);
        zzcZ.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final F0 zzc() {
        Parcel zzcZ = zzcZ(12, zza());
        F0 zzb = E0.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final zzbvq zzd() {
        zzbvq zzbvoVar;
        Parcel zzcZ = zzcZ(11, zza());
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbvoVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            zzbvoVar = queryLocalInterface instanceof zzbvq ? (zzbvq) queryLocalInterface : new zzbvo(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbvoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final String zze() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final void zzf(com.google.android.gms.ads.internal.client.zzm zzmVar, zzbwa zzbwaVar) {
        Parcel zza = zza();
        zzaxp.zzd(zza, zzmVar);
        zzaxp.zzf(zza, zzbwaVar);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final void zzg(com.google.android.gms.ads.internal.client.zzm zzmVar, zzbwa zzbwaVar) {
        Parcel zza = zza();
        zzaxp.zzd(zza, zzmVar);
        zzaxp.zzf(zza, zzbwaVar);
        zzda(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final void zzh(boolean z4) {
        Parcel zza = zza();
        int i7 = zzaxp.zza;
        zza.writeInt(z4 ? 1 : 0);
        zzda(15, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final void zzi(InterfaceC0261w0 interfaceC0261w0) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC0261w0);
        zzda(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final void zzj(InterfaceC0265y0 interfaceC0265y0) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC0265y0);
        zzda(13, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final void zzk(zzbvw zzbvwVar) {
        Parcel zza = zza();
        zzaxp.zzf(zza, zzbvwVar);
        zzda(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final void zzl(zzbwh zzbwhVar) {
        Parcel zza = zza();
        zzaxp.zzd(zza, zzbwhVar);
        zzda(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final void zzm(InterfaceC1506a interfaceC1506a) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zzda(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final void zzn(InterfaceC1506a interfaceC1506a, boolean z4) {
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
