package com.google.android.gms.internal.p002firebaseauthapi;

import Q0.a;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zzahs implements Parcelable.Creator<zzahp> {
    @Override // android.os.Parcelable.Creator
    public final zzahp createFromParcel(Parcel parcel) {
        int a02 = a.a0(parcel);
        while (parcel.dataPosition() < a02) {
            a.X(parcel.readInt(), parcel);
        }
        a.y(a02, parcel);
        return new zzahp();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzahp[] newArray(int i7) {
        return new zzahp[i7];
    }
}
