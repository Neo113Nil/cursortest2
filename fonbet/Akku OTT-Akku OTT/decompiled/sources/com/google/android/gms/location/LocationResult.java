package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class LocationResult extends com.google.android.gms.common.internal.safeparcel.a implements ReflectedParcelable {
    public final List<Location> a;
    public static final List<Location> b = Collections.EMPTY_LIST;

    @NonNull
    public static final Parcelable.Creator<LocationResult> CREATOR = new A();

    public LocationResult(List<Location> list) {
        this.a = list;
    }

    public final boolean equals(@NonNull Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        LocationResult locationResult = (LocationResult) obj;
        int size = locationResult.a.size();
        List<Location> list = this.a;
        if (size != list.size()) {
            return false;
        }
        Iterator<Location> it = locationResult.a.iterator();
        Iterator<Location> it2 = list.iterator();
        while (it.hasNext()) {
            if (it2.next().getTime() != it.next().getTime()) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        Iterator<Location> it = this.a.iterator();
        int i = 17;
        while (it.hasNext()) {
            long time = it.next().getTime();
            i = (i * 31) + ((int) (time ^ (time >>> 32)));
        }
        return i;
    }

    @NonNull
    public final String toString() {
        String valueOf = String.valueOf(this.a);
        return androidx.fragment.app.v.a(new StringBuilder(valueOf.length() + 27), "LocationResult[locations: ", valueOf, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.p(parcel, 1, this.a, false);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
