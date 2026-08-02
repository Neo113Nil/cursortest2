package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0874p;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.Arrays;

/* loaded from: classes4.dex */
public class StreetViewPanoramaLocation extends a {

    @NonNull
    public static final Parcelable.Creator<StreetViewPanoramaLocation> CREATOR = new zzp();

    @NonNull
    public final StreetViewPanoramaLink[] links;

    @NonNull
    public final String panoId;

    @NonNull
    public final LatLng position;

    public StreetViewPanoramaLocation(@NonNull StreetViewPanoramaLink[] streetViewPanoramaLinkArr, @NonNull LatLng latLng, @NonNull String str) {
        this.links = streetViewPanoramaLinkArr;
        this.position = latLng;
        this.panoId = str;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaLocation)) {
            return false;
        }
        StreetViewPanoramaLocation streetViewPanoramaLocation = (StreetViewPanoramaLocation) obj;
        return this.panoId.equals(streetViewPanoramaLocation.panoId) && this.position.equals(streetViewPanoramaLocation.position);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.position, this.panoId});
    }

    @NonNull
    public String toString() {
        C0874p.a aVar = new C0874p.a(this);
        aVar.a(this.panoId, "panoId");
        aVar.a(this.position.toString(), "position");
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = c.q(parcel, 20293);
        c.o(parcel, 2, this.links, i);
        c.k(parcel, 3, this.position, i, false);
        c.l(parcel, 4, this.panoId, false);
        c.r(parcel, q);
    }
}
