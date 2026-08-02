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
public class StreetViewPanoramaLink extends a {

    @NonNull
    public static final Parcelable.Creator<StreetViewPanoramaLink> CREATOR = new zzo();
    public final float bearing;

    @NonNull
    public final String panoId;

    public StreetViewPanoramaLink(@NonNull String str, float f) {
        this.panoId = str;
        this.bearing = (((double) f) <= 0.0d ? (f % 360.0f) + 360.0f : f) % 360.0f;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaLink)) {
            return false;
        }
        StreetViewPanoramaLink streetViewPanoramaLink = (StreetViewPanoramaLink) obj;
        return this.panoId.equals(streetViewPanoramaLink.panoId) && Float.floatToIntBits(this.bearing) == Float.floatToIntBits(streetViewPanoramaLink.bearing);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.panoId, Float.valueOf(this.bearing)});
    }

    @NonNull
    public String toString() {
        C0874p.a aVar = new C0874p.a(this);
        aVar.a(this.panoId, "panoId");
        aVar.a(Float.valueOf(this.bearing), "bearing");
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = c.q(parcel, 20293);
        c.l(parcel, 2, this.panoId, false);
        float f = this.bearing;
        c.s(parcel, 3, 4);
        parcel.writeFloat(f);
        c.r(parcel, q);
    }
}
