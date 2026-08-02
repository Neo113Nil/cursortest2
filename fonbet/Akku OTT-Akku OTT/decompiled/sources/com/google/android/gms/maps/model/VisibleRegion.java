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
public final class VisibleRegion extends a {

    @NonNull
    public static final Parcelable.Creator<VisibleRegion> CREATOR = new zzw();

    @NonNull
    public final LatLng farLeft;

    @NonNull
    public final LatLng farRight;

    @NonNull
    public final LatLngBounds latLngBounds;

    @NonNull
    public final LatLng nearLeft;

    @NonNull
    public final LatLng nearRight;

    public VisibleRegion(@NonNull LatLng latLng, @NonNull LatLng latLng2, @NonNull LatLng latLng3, @NonNull LatLng latLng4, @NonNull LatLngBounds latLngBounds) {
        this.nearLeft = latLng;
        this.nearRight = latLng2;
        this.farLeft = latLng3;
        this.farRight = latLng4;
        this.latLngBounds = latLngBounds;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VisibleRegion)) {
            return false;
        }
        VisibleRegion visibleRegion = (VisibleRegion) obj;
        return this.nearLeft.equals(visibleRegion.nearLeft) && this.nearRight.equals(visibleRegion.nearRight) && this.farLeft.equals(visibleRegion.farLeft) && this.farRight.equals(visibleRegion.farRight) && this.latLngBounds.equals(visibleRegion.latLngBounds);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.nearLeft, this.nearRight, this.farLeft, this.farRight, this.latLngBounds});
    }

    @NonNull
    public String toString() {
        C0874p.a aVar = new C0874p.a(this);
        aVar.a(this.nearLeft, "nearLeft");
        aVar.a(this.nearRight, "nearRight");
        aVar.a(this.farLeft, "farLeft");
        aVar.a(this.farRight, "farRight");
        aVar.a(this.latLngBounds, "latLngBounds");
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = c.q(parcel, 20293);
        c.k(parcel, 2, this.nearLeft, i, false);
        c.k(parcel, 3, this.nearRight, i, false);
        c.k(parcel, 4, this.farLeft, i, false);
        c.k(parcel, 5, this.farRight, i, false);
        c.k(parcel, 6, this.latLngBounds, i, false);
        c.r(parcel, q);
    }
}
