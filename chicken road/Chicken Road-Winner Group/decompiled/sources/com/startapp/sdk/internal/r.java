package com.startapp.sdk.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.startapp.sdk.adsbase.model.AdDetails;

/* loaded from: classes.dex */
public final class r implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new AdDetails(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i3) {
        return new AdDetails[i3];
    }
}
