package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;

/* loaded from: classes4.dex */
public final class zzaiy implements Parcelable.Creator<zzaiz> {
    @Override // android.os.Parcelable.Creator
    public final zzaiz createFromParcel(Parcel parcel) {
        int z = b.z(parcel);
        while (parcel.dataPosition() < z) {
            b.y(parcel, parcel.readInt());
        }
        b.l(parcel, z);
        return new zzaiz();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaiz[] newArray(int i) {
        return new zzaiz[i];
    }
}
