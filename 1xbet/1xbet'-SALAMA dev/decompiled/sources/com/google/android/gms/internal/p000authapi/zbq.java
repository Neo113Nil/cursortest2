package com.google.android.gms.internal.p000authapi;

import Q0.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;

/* JADX INFO: loaded from: classes.dex */
public final class zbq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iA0 = a.a0(parcel);
        Credential credential = null;
        while (parcel.dataPosition() < iA0) {
            int i7 = parcel.readInt();
            if (((char) i7) != 1) {
                a.X(i7, parcel);
            } else {
                credential = (Credential) a.m(parcel, i7, Credential.CREATOR);
            }
        }
        a.y(iA0, parcel);
        return new zbp(credential);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zbp[i7];
    }
}
