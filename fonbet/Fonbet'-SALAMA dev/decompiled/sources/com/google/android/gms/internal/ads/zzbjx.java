package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class zzbjx extends zzaxo implements zzbjy {
    public zzbjx() {
        super("com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
    }

    public static zzbjy zzc(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
        return queryLocalInterface instanceof zzbjy ? (zzbjy) queryLocalInterface : new zzbjw(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 1) {
            return false;
        }
        String readString = parcel.readString();
        zzaxp.zzc(parcel);
        zzb(readString);
        parcel2.writeNoException();
        return true;
    }
}
