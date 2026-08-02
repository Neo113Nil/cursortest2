package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class zzbgm extends zzaxo implements zzbgn {
    public zzbgm() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    public static zzbgn zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
        return queryLocalInterface instanceof zzbgn ? (zzbgn) queryLocalInterface : new zzbgl(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        zzbgd zzbgbVar;
        if (i7 != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            zzbgbVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
            zzbgbVar = queryLocalInterface instanceof zzbgd ? (zzbgd) queryLocalInterface : new zzbgb(readStrongBinder);
        }
        String readString = parcel.readString();
        zzaxp.zzc(parcel);
        zze(zzbgbVar, readString);
        parcel2.writeNoException();
        return true;
    }
}
