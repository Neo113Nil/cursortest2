package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzbth implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iA0 = Q0.a.a0(parcel);
        IBinder iBinderM = null;
        IBinder iBinderM2 = null;
        while (parcel.dataPosition() < iA0) {
            int i7 = parcel.readInt();
            char c3 = (char) i7;
            if (c3 == 1) {
                iBinderM = Q0.a.M(i7, parcel);
            } else if (c3 != 2) {
                Q0.a.X(i7, parcel);
            } else {
                iBinderM2 = Q0.a.M(i7, parcel);
            }
        }
        Q0.a.y(iA0, parcel);
        return new zzbtg(iBinderM, iBinderM2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzbtg[i7];
    }
}
