package com.google.android.gms.internal.ads;

import F2.H0;
import F2.I0;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import o3.InterfaceC1506a;
import v0.AbstractC1663a;

/* loaded from: classes.dex */
public final class zzboz extends zzaxn implements IInterface {
    public zzboz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    public final double zze() {
        Parcel zzcZ = zzcZ(7, zza());
        double readDouble = zzcZ.readDouble();
        zzcZ.recycle();
        return readDouble;
    }

    public final Bundle zzf() {
        Parcel zzcZ = zzcZ(15, zza());
        Bundle bundle = (Bundle) zzaxp.zza(zzcZ, Bundle.CREATOR);
        zzcZ.recycle();
        return bundle;
    }

    public final I0 zzg() {
        Parcel zzcZ = zzcZ(17, zza());
        I0 zzb = H0.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    public final zzbfc zzh() {
        Parcel zzcZ = zzcZ(19, zza());
        zzbfc zzj = zzbfb.zzj(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzj;
    }

    public final zzbfj zzi() {
        Parcel zzcZ = zzcZ(5, zza());
        zzbfj zzg = zzbfi.zzg(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzg;
    }

    public final InterfaceC1506a zzj() {
        return AbstractC1663a.h(zzcZ(18, zza()));
    }

    public final InterfaceC1506a zzk() {
        return AbstractC1663a.h(zzcZ(20, zza()));
    }

    public final InterfaceC1506a zzl() {
        return AbstractC1663a.h(zzcZ(21, zza()));
    }

    public final String zzm() {
        Parcel zzcZ = zzcZ(4, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    public final String zzn() {
        Parcel zzcZ = zzcZ(6, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    public final String zzo() {
        Parcel zzcZ = zzcZ(2, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    public final String zzp() {
        Parcel zzcZ = zzcZ(9, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    public final String zzq() {
        Parcel zzcZ = zzcZ(8, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    public final List zzr() {
        Parcel zzcZ = zzcZ(3, zza());
        ArrayList zzb = zzaxp.zzb(zzcZ);
        zzcZ.recycle();
        return zzb;
    }

    public final void zzs(InterfaceC1506a interfaceC1506a) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zzda(11, zza);
    }

    public final void zzt() {
        zzda(10, zza());
    }

    public final void zzu(InterfaceC1506a interfaceC1506a) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zzda(12, zza);
    }

    public final void zzv(InterfaceC1506a interfaceC1506a, InterfaceC1506a interfaceC1506a2, InterfaceC1506a interfaceC1506a3) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zzaxp.zzf(zza, interfaceC1506a2);
        zzaxp.zzf(zza, interfaceC1506a3);
        zzda(22, zza);
    }

    public final void zzw(InterfaceC1506a interfaceC1506a) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zzda(16, zza);
    }

    public final boolean zzx() {
        Parcel zzcZ = zzcZ(14, zza());
        boolean zzg = zzaxp.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }

    public final boolean zzy() {
        Parcel zzcZ = zzcZ(13, zza());
        boolean zzg = zzaxp.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }
}
