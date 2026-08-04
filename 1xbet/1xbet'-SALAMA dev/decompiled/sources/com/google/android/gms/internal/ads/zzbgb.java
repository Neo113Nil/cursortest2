package com.google.android.gms.internal.ads;

import F2.I0;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
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
        Parcel parcelZzcZ = zzcZ(16, zza());
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

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final zzbfj zzg(String str) {
        zzbfj zzbfhVar;
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzcZ = zzcZ(2, parcelZza);
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

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final p105o3.a zzh() {
        return p150v0.a.h(zzcZ(9, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final String zzi() {
        Parcel parcelZzcZ = zzcZ(4, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final String zzj(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzcZ = zzcZ(1, parcelZza);
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final List zzk() {
        Parcel parcelZzcZ = zzcZ(3, zza());
        ArrayList<String> arrayListCreateStringArrayList = parcelZzcZ.createStringArrayList();
        parcelZzcZ.recycle();
        return arrayListCreateStringArrayList;
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
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzda(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final void zzo() {
        zzda(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final void zzp(p105o3.a aVar) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        zzda(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final boolean zzq() {
        Parcel parcelZzcZ = zzcZ(12, zza());
        boolean zZzg = zzaxp.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final boolean zzr(p105o3.a aVar) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        Parcel parcelZzcZ = zzcZ(17, parcelZza);
        boolean zZzg = zzaxp.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final boolean zzs(p105o3.a aVar) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        Parcel parcelZzcZ = zzcZ(10, parcelZza);
        boolean zZzg = zzaxp.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final boolean zzt() {
        Parcel parcelZzcZ = zzcZ(13, zza());
        boolean zZzg = zzaxp.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }
}
