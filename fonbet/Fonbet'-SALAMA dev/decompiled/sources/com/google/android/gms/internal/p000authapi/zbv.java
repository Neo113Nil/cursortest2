package com.google.android.gms.internal.p000authapi;

import Q0.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;

/* loaded from: classes.dex */
public final class zbv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int a02 = a.a0(parcel);
        Credential credential = null;
        while (parcel.dataPosition() < a02) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                a.X(readInt, parcel);
            } else {
                credential = (Credential) a.m(parcel, readInt, Credential.CREATOR);
            }
        }
        a.y(a02, parcel);
        return new zbu(credential);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zbu[i7];
    }
}
