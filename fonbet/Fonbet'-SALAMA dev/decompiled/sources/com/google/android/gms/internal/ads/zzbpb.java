package com.google.android.gms.internal.ads;

import F2.H0;
import F2.I0;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import o3.InterfaceC1506a;
import v0.AbstractC1663a;

/* loaded from: classes.dex */
public final class zzbpb extends zzaxn implements zzbpd {
    public zzbpb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final boolean zzA() {
        Parcel zzcZ = zzcZ(18, zza());
        boolean zzg = zzaxp.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final boolean zzB() {
        Parcel zzcZ = zzcZ(17, zza());
        boolean zzg = zzaxp.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final double zze() {
        Parcel zzcZ = zzcZ(8, zza());
        double readDouble = zzcZ.readDouble();
        zzcZ.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final float zzf() {
        Parcel zzcZ = zzcZ(23, zza());
        float readFloat = zzcZ.readFloat();
        zzcZ.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final float zzg() {
        Parcel zzcZ = zzcZ(25, zza());
        float readFloat = zzcZ.readFloat();
        zzcZ.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final float zzh() {
        Parcel zzcZ = zzcZ(24, zza());
        float readFloat = zzcZ.readFloat();
        zzcZ.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final Bundle zzi() {
        Parcel zzcZ = zzcZ(16, zza());
        Bundle bundle = (Bundle) zzaxp.zza(zzcZ, Bundle.CREATOR);
        zzcZ.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final I0 zzj() {
        Parcel zzcZ = zzcZ(11, zza());
        I0 zzb = H0.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final zzbfc zzk() {
        Parcel zzcZ = zzcZ(12, zza());
        zzbfc zzj = zzbfb.zzj(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final zzbfj zzl() {
        Parcel zzcZ = zzcZ(5, zza());
        zzbfj zzg = zzbfi.zzg(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final InterfaceC1506a zzm() {
        return AbstractC1663a.h(zzcZ(13, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final InterfaceC1506a zzn() {
        return AbstractC1663a.h(zzcZ(14, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final InterfaceC1506a zzo() {
        return AbstractC1663a.h(zzcZ(15, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final String zzp() {
        Parcel zzcZ = zzcZ(7, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final String zzq() {
        Parcel zzcZ = zzcZ(4, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final String zzr() {
        Parcel zzcZ = zzcZ(6, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final String zzs() {
        Parcel zzcZ = zzcZ(2, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final String zzt() {
        Parcel zzcZ = zzcZ(10, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final String zzu() {
        Parcel zzcZ = zzcZ(9, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final List zzv() {
        Parcel zzcZ = zzcZ(3, zza());
        ArrayList zzb = zzaxp.zzb(zzcZ);
        zzcZ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzw(InterfaceC1506a interfaceC1506a) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zzda(20, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzx() {
        zzda(19, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzy(InterfaceC1506a interfaceC1506a, InterfaceC1506a interfaceC1506a2, InterfaceC1506a interfaceC1506a3) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zzaxp.zzf(zza, interfaceC1506a2);
        zzaxp.zzf(zza, interfaceC1506a3);
        zzda(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzz(InterfaceC1506a interfaceC1506a) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zzda(22, zza);
    }
}
