package com.google.android.gms.location;

import F2.b;
import H.j;
import T0.a;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class LocationResult extends a implements ReflectedParcelable {

    /* renamed from: a, reason: collision with root package name */
    public final List f2873a;

    /* renamed from: b, reason: collision with root package name */
    public static final List f2872b = Collections.EMPTY_LIST;
    public static final Parcelable.Creator<LocationResult> CREATOR = new j(23);

    public LocationResult(List list) {
        this.f2873a = list;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        LocationResult locationResult = (LocationResult) obj;
        int size = locationResult.f2873a.size();
        List list = this.f2873a;
        if (size != list.size()) {
            return false;
        }
        Iterator it = locationResult.f2873a.iterator();
        Iterator it2 = list.iterator();
        while (it.hasNext()) {
            if (((Location) it2.next()).getTime() != ((Location) it.next()).getTime()) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        Iterator it = this.f2873a.iterator();
        int i3 = 17;
        while (it.hasNext()) {
            long time = ((Location) it.next()).getTime();
            i3 = (i3 * 31) + ((int) (time ^ (time >>> 32)));
        }
        return i3;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f2873a);
        StringBuilder sb = new StringBuilder(valueOf.length() + 27);
        sb.append("LocationResult[locations: ");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Q2 = b.Q(parcel, 20293);
        b.P(parcel, 1, this.f2873a);
        b.R(parcel, Q2);
    }
}
