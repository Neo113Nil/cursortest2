package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class zzbld extends zzaxo implements zzble {
    public zzbld() {
        super("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    public static zzble zzc(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
        return queryLocalInterface instanceof zzble ? (zzble) queryLocalInterface : new zzblc(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 1) {
            return false;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(zzbkx.CREATOR);
        zzaxp.zzc(parcel);
        zzb(createTypedArrayList);
        parcel2.writeNoException();
        return true;
    }
}
