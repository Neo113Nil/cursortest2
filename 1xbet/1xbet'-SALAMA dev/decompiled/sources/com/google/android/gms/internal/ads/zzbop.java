package com.google.android.gms.internal.ads;

import F2.H0;
import F2.I0;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzbop extends zzaxn implements zzbor {
    public zzbop(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzA(p105o3.a aVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbou zzbouVar) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        zzaxp.zzd(parcelZza, zzmVar);
        parcelZza.writeString(str);
        zzaxp.zzf(parcelZza, zzbouVar);
        zzda(28, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzB(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzC(p105o3.a aVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbou zzbouVar) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        zzaxp.zzd(parcelZza, zzmVar);
        parcelZza.writeString(str);
        zzaxp.zzf(parcelZza, zzbouVar);
        zzda(32, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzD(p105o3.a aVar) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        zzda(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzE() {
        zzda(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzF() {
        zzda(9, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzG(boolean z4) {
        Parcel parcelZza = zza();
        int i7 = zzaxp.zza;
        parcelZza.writeInt(z4 ? 1 : 0);
        zzda(25, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzH(p105o3.a aVar) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        zzda(39, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzI() {
        zzda(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzJ(p105o3.a aVar) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        zzda(37, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzK(p105o3.a aVar) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        zzda(30, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzL() {
        zzda(12, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final boolean zzM() {
        Parcel parcelZzcZ = zzcZ(22, zza());
        boolean zZzg = zzaxp.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final boolean zzN() {
        Parcel parcelZzcZ = zzcZ(13, zza());
        boolean zZzg = zzaxp.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final zzboz zzO() {
        zzboz zzbozVar;
        Parcel parcelZzcZ = zzcZ(15, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbozVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            zzbozVar = iInterfaceQueryLocalInterface instanceof zzboz ? (zzboz) iInterfaceQueryLocalInterface : new zzboz(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbozVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final zzbpa zzP() {
        zzbpa zzbpaVar;
        Parcel parcelZzcZ = zzcZ(16, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbpaVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            zzbpaVar = iInterfaceQueryLocalInterface instanceof zzbpa ? (zzbpa) iInterfaceQueryLocalInterface : new zzbpa(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbpaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final Bundle zze() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final Bundle zzf() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final Bundle zzg() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final I0 zzh() {
        Parcel parcelZzcZ = zzcZ(26, zza());
        I0 i0Zzb = H0.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return i0Zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final zzbgd zzi() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final zzbox zzj() {
        zzbox zzbovVar;
        Parcel parcelZzcZ = zzcZ(36, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbovVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            zzbovVar = iInterfaceQueryLocalInterface instanceof zzbox ? (zzbox) iInterfaceQueryLocalInterface : new zzbov(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbovVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final zzbpd zzk() {
        zzbpd zzbpbVar;
        Parcel parcelZzcZ = zzcZ(27, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbpbVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            zzbpbVar = iInterfaceQueryLocalInterface instanceof zzbpd ? (zzbpd) iInterfaceQueryLocalInterface : new zzbpb(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbpbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final zzbrc zzl() {
        Parcel parcelZzcZ = zzcZ(33, zza());
        zzbrc zzbrcVar = (zzbrc) zzaxp.zza(parcelZzcZ, zzbrc.CREATOR);
        parcelZzcZ.recycle();
        return zzbrcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final zzbrc zzm() {
        Parcel parcelZzcZ = zzcZ(34, zza());
        zzbrc zzbrcVar = (zzbrc) zzaxp.zza(parcelZzcZ, zzbrc.CREATOR);
        parcelZzcZ.recycle();
        return zzbrcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final p105o3.a zzn() {
        return p150v0.a.h(zzcZ(2, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzo() {
        zzda(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzp(p105o3.a aVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbvl zzbvlVar, String str2) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        zzaxp.zzd(parcelZza, zzmVar);
        parcelZza.writeString(null);
        zzaxp.zzf(parcelZza, zzbvlVar);
        parcelZza.writeString(str2);
        zzda(10, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzq(p105o3.a aVar, zzblb zzblbVar, List list) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        zzaxp.zzf(parcelZza, zzblbVar);
        parcelZza.writeTypedList(list);
        zzda(31, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzr(p105o3.a aVar, zzbvl zzbvlVar, List list) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        zzaxp.zzf(parcelZza, zzbvlVar);
        parcelZza.writeStringList(list);
        zzda(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzs(com.google.android.gms.ads.internal.client.zzm zzmVar, String str) {
        Parcel parcelZza = zza();
        zzaxp.zzd(parcelZza, zzmVar);
        parcelZza.writeString(str);
        zzda(11, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzt(p105o3.a aVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbou zzbouVar) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        zzaxp.zzd(parcelZza, zzmVar);
        parcelZza.writeString(str);
        zzaxp.zzf(parcelZza, zzbouVar);
        zzda(38, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzu(p105o3.a aVar, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbou zzbouVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzv(p105o3.a aVar, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbou zzbouVar) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        zzaxp.zzd(parcelZza, zzrVar);
        zzaxp.zzd(parcelZza, zzmVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzaxp.zzf(parcelZza, zzbouVar);
        zzda(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzw(p105o3.a aVar, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbou zzbouVar) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        zzaxp.zzd(parcelZza, zzrVar);
        zzaxp.zzd(parcelZza, zzmVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzaxp.zzf(parcelZza, zzbouVar);
        zzda(35, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzx(p105o3.a aVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbou zzbouVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzy(p105o3.a aVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbou zzbouVar) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        zzaxp.zzd(parcelZza, zzmVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzaxp.zzf(parcelZza, zzbouVar);
        zzda(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzz(p105o3.a aVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbou zzbouVar, zzbey zzbeyVar, List list) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        zzaxp.zzd(parcelZza, zzmVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzaxp.zzf(parcelZza, zzbouVar);
        zzaxp.zzd(parcelZza, zzbeyVar);
        parcelZza.writeStringList(list);
        zzda(14, parcelZza);
    }
}
