package com.google.android.gms.internal.ads;

import F2.H0;
import F2.I0;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;
import o3.InterfaceC1506a;
import v0.AbstractC1663a;

/* loaded from: classes.dex */
public final class zzbop extends zzaxn implements zzbor {
    public zzbop(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzA(InterfaceC1506a interfaceC1506a, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbou zzbouVar) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zzaxp.zzd(zza, zzmVar);
        zza.writeString(str);
        zzaxp.zzf(zza, zzbouVar);
        zzda(28, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzB(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzC(InterfaceC1506a interfaceC1506a, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbou zzbouVar) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zzaxp.zzd(zza, zzmVar);
        zza.writeString(str);
        zzaxp.zzf(zza, zzbouVar);
        zzda(32, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzD(InterfaceC1506a interfaceC1506a) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zzda(21, zza);
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
        Parcel zza = zza();
        int i7 = zzaxp.zza;
        zza.writeInt(z4 ? 1 : 0);
        zzda(25, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzH(InterfaceC1506a interfaceC1506a) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zzda(39, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzI() {
        zzda(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzJ(InterfaceC1506a interfaceC1506a) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zzda(37, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzK(InterfaceC1506a interfaceC1506a) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zzda(30, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzL() {
        zzda(12, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final boolean zzM() {
        Parcel zzcZ = zzcZ(22, zza());
        boolean zzg = zzaxp.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final boolean zzN() {
        Parcel zzcZ = zzcZ(13, zza());
        boolean zzg = zzaxp.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final zzboz zzO() {
        zzboz zzbozVar;
        Parcel zzcZ = zzcZ(15, zza());
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbozVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            zzbozVar = queryLocalInterface instanceof zzboz ? (zzboz) queryLocalInterface : new zzboz(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbozVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final zzbpa zzP() {
        zzbpa zzbpaVar;
        Parcel zzcZ = zzcZ(16, zza());
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbpaVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            zzbpaVar = queryLocalInterface instanceof zzbpa ? (zzbpa) queryLocalInterface : new zzbpa(readStrongBinder);
        }
        zzcZ.recycle();
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
        Parcel zzcZ = zzcZ(26, zza());
        I0 zzb = H0.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final zzbgd zzi() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final zzbox zzj() {
        zzbox zzbovVar;
        Parcel zzcZ = zzcZ(36, zza());
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbovVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            zzbovVar = queryLocalInterface instanceof zzbox ? (zzbox) queryLocalInterface : new zzbov(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbovVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final zzbpd zzk() {
        zzbpd zzbpbVar;
        Parcel zzcZ = zzcZ(27, zza());
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbpbVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            zzbpbVar = queryLocalInterface instanceof zzbpd ? (zzbpd) queryLocalInterface : new zzbpb(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbpbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final zzbrc zzl() {
        Parcel zzcZ = zzcZ(33, zza());
        zzbrc zzbrcVar = (zzbrc) zzaxp.zza(zzcZ, zzbrc.CREATOR);
        zzcZ.recycle();
        return zzbrcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final zzbrc zzm() {
        Parcel zzcZ = zzcZ(34, zza());
        zzbrc zzbrcVar = (zzbrc) zzaxp.zza(zzcZ, zzbrc.CREATOR);
        zzcZ.recycle();
        return zzbrcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final InterfaceC1506a zzn() {
        return AbstractC1663a.h(zzcZ(2, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzo() {
        zzda(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzp(InterfaceC1506a interfaceC1506a, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbvl zzbvlVar, String str2) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zzaxp.zzd(zza, zzmVar);
        zza.writeString(null);
        zzaxp.zzf(zza, zzbvlVar);
        zza.writeString(str2);
        zzda(10, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzq(InterfaceC1506a interfaceC1506a, zzblb zzblbVar, List list) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zzaxp.zzf(zza, zzblbVar);
        zza.writeTypedList(list);
        zzda(31, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzr(InterfaceC1506a interfaceC1506a, zzbvl zzbvlVar, List list) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zzaxp.zzf(zza, zzbvlVar);
        zza.writeStringList(list);
        zzda(23, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzs(com.google.android.gms.ads.internal.client.zzm zzmVar, String str) {
        Parcel zza = zza();
        zzaxp.zzd(zza, zzmVar);
        zza.writeString(str);
        zzda(11, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzt(InterfaceC1506a interfaceC1506a, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbou zzbouVar) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zzaxp.zzd(zza, zzmVar);
        zza.writeString(str);
        zzaxp.zzf(zza, zzbouVar);
        zzda(38, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzu(InterfaceC1506a interfaceC1506a, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbou zzbouVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzv(InterfaceC1506a interfaceC1506a, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbou zzbouVar) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zzaxp.zzd(zza, zzrVar);
        zzaxp.zzd(zza, zzmVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzaxp.zzf(zza, zzbouVar);
        zzda(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzw(InterfaceC1506a interfaceC1506a, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbou zzbouVar) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zzaxp.zzd(zza, zzrVar);
        zzaxp.zzd(zza, zzmVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzaxp.zzf(zza, zzbouVar);
        zzda(35, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzx(InterfaceC1506a interfaceC1506a, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbou zzbouVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzy(InterfaceC1506a interfaceC1506a, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbou zzbouVar) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zzaxp.zzd(zza, zzmVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzaxp.zzf(zza, zzbouVar);
        zzda(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzz(InterfaceC1506a interfaceC1506a, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbou zzbouVar, zzbey zzbeyVar, List list) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zzaxp.zzd(zza, zzmVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzaxp.zzf(zza, zzbouVar);
        zzaxp.zzd(zza, zzbeyVar);
        zza.writeStringList(list);
        zzda(14, zza);
    }
}
