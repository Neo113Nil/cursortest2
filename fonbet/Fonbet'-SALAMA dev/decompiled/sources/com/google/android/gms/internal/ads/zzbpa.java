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
public final class zzbpa extends zzaxn implements IInterface {
    public zzbpa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    public final Bundle zze() {
        Parcel zzcZ = zzcZ(13, zza());
        Bundle bundle = (Bundle) zzaxp.zza(zzcZ, Bundle.CREATOR);
        zzcZ.recycle();
        return bundle;
    }

    public final I0 zzf() {
        Parcel zzcZ = zzcZ(16, zza());
        I0 zzb = H0.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    public final zzbfc zzg() {
        Parcel zzcZ = zzcZ(19, zza());
        zzbfc zzj = zzbfb.zzj(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzj;
    }

    public final zzbfj zzh() {
        Parcel zzcZ = zzcZ(5, zza());
        zzbfj zzg = zzbfi.zzg(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzg;
    }

    public final InterfaceC1506a zzi() {
        return AbstractC1663a.h(zzcZ(15, zza()));
    }

    public final InterfaceC1506a zzj() {
        return AbstractC1663a.h(zzcZ(20, zza()));
    }

    public final InterfaceC1506a zzk() {
        return AbstractC1663a.h(zzcZ(21, zza()));
    }

    public final String zzl() {
        Parcel zzcZ = zzcZ(7, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
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

    public final List zzp() {
        Parcel zzcZ = zzcZ(3, zza());
        ArrayList zzb = zzaxp.zzb(zzcZ);
        zzcZ.recycle();
        return zzb;
    }

    public final void zzq(InterfaceC1506a interfaceC1506a) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zzda(9, zza);
    }

    public final void zzr() {
        zzda(8, zza());
    }

    public final void zzs(InterfaceC1506a interfaceC1506a) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zzda(10, zza);
    }

    public final void zzt(InterfaceC1506a interfaceC1506a, InterfaceC1506a interfaceC1506a2, InterfaceC1506a interfaceC1506a3) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zzaxp.zzf(zza, interfaceC1506a2);
        zzaxp.zzf(zza, interfaceC1506a3);
        zzda(22, zza);
    }

    public final void zzu(InterfaceC1506a interfaceC1506a) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zzda(14, zza);
    }

    public final boolean zzv() {
        Parcel zzcZ = zzcZ(12, zza());
        boolean zzg = zzaxp.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }

    public final boolean zzw() {
        Parcel zzcZ = zzcZ(11, zza());
        boolean zzg = zzaxp.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }
}
