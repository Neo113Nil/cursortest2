package com.google.android.gms.internal.ads;

import F2.E0;
import F2.F0;
import F2.H0;
import F2.I0;
import F2.InterfaceC0244n0;
import F2.InterfaceC0250q0;
import F2.InterfaceC0265y0;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import o3.InterfaceC1506a;
import v0.AbstractC1663a;

/* loaded from: classes.dex */
public final class zzbhb extends zzaxn implements zzbhd {
    public zzbhb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final void zzA() {
        zzda(28, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final void zzB(Bundle bundle) {
        Parcel zza = zza();
        zzaxp.zzd(zza, bundle);
        zzda(33, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final void zzC(Bundle bundle) {
        Parcel zza = zza();
        zzaxp.zzd(zza, bundle);
        zzda(17, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final void zzD() {
        zzda(27, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final void zzE(InterfaceC0244n0 interfaceC0244n0) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC0244n0);
        zzda(26, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final void zzF(InterfaceC0265y0 interfaceC0265y0) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC0265y0);
        zzda(32, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final void zzG(zzbha zzbhaVar) {
        Parcel zza = zza();
        zzaxp.zzf(zza, zzbhaVar);
        zzda(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final boolean zzH() {
        Parcel zzcZ = zzcZ(30, zza());
        boolean zzg = zzaxp.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final boolean zzI() {
        Parcel zzcZ = zzcZ(24, zza());
        boolean zzg = zzaxp.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final boolean zzJ(Bundle bundle) {
        Parcel zza = zza();
        zzaxp.zzd(zza, bundle);
        Parcel zzcZ = zzcZ(16, zza);
        boolean zzg = zzaxp.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final double zze() {
        Parcel zzcZ = zzcZ(8, zza());
        double readDouble = zzcZ.readDouble();
        zzcZ.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final Bundle zzf() {
        Parcel zzcZ = zzcZ(20, zza());
        Bundle bundle = (Bundle) zzaxp.zza(zzcZ, Bundle.CREATOR);
        zzcZ.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final F0 zzg() {
        Parcel zzcZ = zzcZ(31, zza());
        F0 zzb = E0.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final I0 zzh() {
        Parcel zzcZ = zzcZ(11, zza());
        I0 zzb = H0.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final zzbfc zzi() {
        zzbfc zzbfaVar;
        Parcel zzcZ = zzcZ(14, zza());
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbfaVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            zzbfaVar = queryLocalInterface instanceof zzbfc ? (zzbfc) queryLocalInterface : new zzbfa(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbfaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final zzbfg zzj() {
        zzbfg zzbfeVar;
        Parcel zzcZ = zzcZ(29, zza());
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbfeVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            zzbfeVar = queryLocalInterface instanceof zzbfg ? (zzbfg) queryLocalInterface : new zzbfe(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbfeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final zzbfj zzk() {
        zzbfj zzbfhVar;
        Parcel zzcZ = zzcZ(5, zza());
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbfhVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            zzbfhVar = queryLocalInterface instanceof zzbfj ? (zzbfj) queryLocalInterface : new zzbfh(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbfhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final InterfaceC1506a zzl() {
        return AbstractC1663a.h(zzcZ(19, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final InterfaceC1506a zzm() {
        return AbstractC1663a.h(zzcZ(18, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final String zzn() {
        Parcel zzcZ = zzcZ(7, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final String zzo() {
        Parcel zzcZ = zzcZ(4, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final String zzp() {
        Parcel zzcZ = zzcZ(6, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final String zzq() {
        Parcel zzcZ = zzcZ(2, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final String zzr() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final String zzs() {
        Parcel zzcZ = zzcZ(10, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final String zzt() {
        Parcel zzcZ = zzcZ(9, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final List zzu() {
        Parcel zzcZ = zzcZ(3, zza());
        ArrayList zzb = zzaxp.zzb(zzcZ);
        zzcZ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final List zzv() {
        Parcel zzcZ = zzcZ(23, zza());
        ArrayList zzb = zzaxp.zzb(zzcZ);
        zzcZ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final void zzw() {
        zzda(22, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final void zzx() {
        zzda(13, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final void zzy(InterfaceC0250q0 interfaceC0250q0) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC0250q0);
        zzda(25, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final void zzz(Bundle bundle) {
        Parcel zza = zza();
        zzaxp.zzd(zza, bundle);
        zzda(15, zza);
    }
}
