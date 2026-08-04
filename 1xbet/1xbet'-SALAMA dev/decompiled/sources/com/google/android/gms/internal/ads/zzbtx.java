package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class zzbtx implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iA0 = Q0.a.a0(parcel);
        ArrayList arrayListP = null;
        boolean zK = false;
        while (parcel.dataPosition() < iA0) {
            int i7 = parcel.readInt();
            char c3 = (char) i7;
            if (c3 == 2) {
                zK = Q0.a.K(i7, parcel);
            } else if (c3 != 3) {
                Q0.a.X(i7, parcel);
            } else {
                arrayListP = Q0.a.p(i7, parcel);
            }
        }
        Q0.a.y(iA0, parcel);
        return new zzbtw(zK, arrayListP);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzbtw[i7];
    }
}
