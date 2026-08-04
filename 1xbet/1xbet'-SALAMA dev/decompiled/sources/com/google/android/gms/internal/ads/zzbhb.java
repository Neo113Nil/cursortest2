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

/* JADX INFO: loaded from: classes.dex */
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
        Parcel parcelZza = zza();
        zzaxp.zzd(parcelZza, bundle);
        zzda(33, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final void zzC(Bundle bundle) {
        Parcel parcelZza = zza();
        zzaxp.zzd(parcelZza, bundle);
        zzda(17, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final void zzD() {
        zzda(27, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final void zzE(InterfaceC0244n0 interfaceC0244n0) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, interfaceC0244n0);
        zzda(26, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final void zzF(InterfaceC0265y0 interfaceC0265y0) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, interfaceC0265y0);
        zzda(32, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final void zzG(zzbha zzbhaVar) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, zzbhaVar);
        zzda(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final boolean zzH() {
        Parcel parcelZzcZ = zzcZ(30, zza());
        boolean zZzg = zzaxp.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final boolean zzI() {
        Parcel parcelZzcZ = zzcZ(24, zza());
        boolean zZzg = zzaxp.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final boolean zzJ(Bundle bundle) {
        Parcel parcelZza = zza();
        zzaxp.zzd(parcelZza, bundle);
        Parcel parcelZzcZ = zzcZ(16, parcelZza);
        boolean zZzg = zzaxp.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final double zze() {
        Parcel parcelZzcZ = zzcZ(8, zza());
        double d7 = parcelZzcZ.readDouble();
        parcelZzcZ.recycle();
        return d7;
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final Bundle zzf() {
        Parcel parcelZzcZ = zzcZ(20, zza());
        Bundle bundle = (Bundle) zzaxp.zza(parcelZzcZ, Bundle.CREATOR);
        parcelZzcZ.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final F0 zzg() {
        Parcel parcelZzcZ = zzcZ(31, zza());
        F0 f0Zzb = E0.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return f0Zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final I0 zzh() {
        Parcel parcelZzcZ = zzcZ(11, zza());
        I0 i0Zzb = H0.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return i0Zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final zzbfc zzi() {
        zzbfc zzbfaVar;
        Parcel parcelZzcZ = zzcZ(14, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbfaVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            zzbfaVar = iInterfaceQueryLocalInterface instanceof zzbfc ? (zzbfc) iInterfaceQueryLocalInterface : new zzbfa(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbfaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final zzbfg zzj() {
        zzbfg zzbfeVar;
        Parcel parcelZzcZ = zzcZ(29, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbfeVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            zzbfeVar = iInterfaceQueryLocalInterface instanceof zzbfg ? (zzbfg) iInterfaceQueryLocalInterface : new zzbfe(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbfeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final zzbfj zzk() {
        zzbfj zzbfhVar;
        Parcel parcelZzcZ = zzcZ(5, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbfhVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            zzbfhVar = iInterfaceQueryLocalInterface instanceof zzbfj ? (zzbfj) iInterfaceQueryLocalInterface : new zzbfh(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbfhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final p105o3.a zzl() {
        return p150v0.a.h(zzcZ(19, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final p105o3.a zzm() {
        return p150v0.a.h(zzcZ(18, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final String zzn() {
        Parcel parcelZzcZ = zzcZ(7, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final String zzo() {
        Parcel parcelZzcZ = zzcZ(4, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final String zzp() {
        Parcel parcelZzcZ = zzcZ(6, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final String zzq() {
        Parcel parcelZzcZ = zzcZ(2, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final String zzr() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final String zzs() {
        Parcel parcelZzcZ = zzcZ(10, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final String zzt() {
        Parcel parcelZzcZ = zzcZ(9, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final List zzu() {
        Parcel parcelZzcZ = zzcZ(3, zza());
        ArrayList arrayListZzb = zzaxp.zzb(parcelZzcZ);
        parcelZzcZ.recycle();
        return arrayListZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final List zzv() {
        Parcel parcelZzcZ = zzcZ(23, zza());
        ArrayList arrayListZzb = zzaxp.zzb(parcelZzcZ);
        parcelZzcZ.recycle();
        return arrayListZzb;
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
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, interfaceC0250q0);
        zzda(25, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final void zzz(Bundle bundle) {
        Parcel parcelZza = zza();
        zzaxp.zzd(parcelZza, bundle);
        zzda(15, parcelZza);
    }
}
