package com.google.android.gms.internal.p002firebaseauthapi;

import Q0.a;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzahs implements Parcelable.Creator<zzahp> {
    @Override // android.os.Parcelable.Creator
    public final zzahp createFromParcel(Parcel parcel) {
        int iA0 = a.a0(parcel);
        while (parcel.dataPosition() < iA0) {
            a.X(parcel.readInt(), parcel);
        }
        a.y(iA0, parcel);
        return new zzahp();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzahp[] newArray(int i7) {
        return new zzahp[i7];
    }
}
