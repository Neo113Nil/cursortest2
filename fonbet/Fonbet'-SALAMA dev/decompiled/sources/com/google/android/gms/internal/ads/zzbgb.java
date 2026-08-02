package com.google.android.gms.internal.ads;

import F2.I0;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import o3.InterfaceC1506a;
import v0.AbstractC1663a;

/* loaded from: classes.dex */
public final class zzbgb extends zzaxn implements zzbgd {
    public zzbgb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final I0 zze() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final zzbfg zzf() {
        zzbfg zzbfeVar;
        Parcel zzcZ = zzcZ(16, zza());
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

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final zzbfj zzg(String str) {
        zzbfj zzbfhVar;
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzcZ = zzcZ(2, zza);
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

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final InterfaceC1506a zzh() {
        return AbstractC1663a.h(zzcZ(9, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final String zzi() {
        Parcel zzcZ = zzcZ(4, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final String zzj(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzcZ = zzcZ(1, zza);
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final List zzk() {
        Parcel zzcZ = zzcZ(3, zza());
        ArrayList<String> createStringArrayList = zzcZ.createStringArrayList();
        zzcZ.recycle();
        return createStringArrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final void zzl() {
        zzda(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final void zzm() {
        zzda(15, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final void zzn(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzda(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final void zzo() {
        zzda(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final void zzp(InterfaceC1506a interfaceC1506a) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zzda(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final boolean zzq() {
        Parcel zzcZ = zzcZ(12, zza());
        boolean zzg = zzaxp.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final boolean zzr(InterfaceC1506a interfaceC1506a) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        Parcel zzcZ = zzcZ(17, zza);
        boolean zzg = zzaxp.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final boolean zzs(InterfaceC1506a interfaceC1506a) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        Parcel zzcZ = zzcZ(10, zza);
        boolean zzg = zzaxp.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final boolean zzt() {
        Parcel zzcZ = zzcZ(13, zza());
        boolean zzg = zzaxp.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }
}
