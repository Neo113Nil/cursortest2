package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;

/* loaded from: classes4.dex */
public final class PointOfInterest extends a {

    @NonNull
    public static final Parcelable.Creator<PointOfInterest> CREATOR = new zzk();

    @NonNull
    public final LatLng latLng;

    @NonNull
    public final String name;

    @NonNull
    public final String placeId;

    public PointOfInterest(@NonNull LatLng latLng, @NonNull String str, @NonNull String str2) {
        this.latLng = latLng;
        this.placeId = str;
        this.name = str2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = c.q(parcel, 20293);
        c.k(parcel, 2, this.latLng, i, false);
        c.l(parcel, 3, this.placeId, false);
        c.l(parcel, 4, this.name, false);
        c.r(parcel, q);
    }
}
