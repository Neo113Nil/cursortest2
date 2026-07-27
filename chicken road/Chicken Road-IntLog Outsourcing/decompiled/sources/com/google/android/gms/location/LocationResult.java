package com.google.android.gms.location;

import B1.c;
import a.AbstractC0169a;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p1.AbstractC1380a;

/* loaded from: classes.dex */
public final class LocationResult extends AbstractC1380a implements ReflectedParcelable {

    /* renamed from: a, reason: collision with root package name */
    public final List f5311a;

    /* renamed from: b, reason: collision with root package name */
    public static final List f5310b = Collections.emptyList();
    public static final Parcelable.Creator<LocationResult> CREATOR = new c(4);

    public LocationResult(List list) {
        this.f5311a = list;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        LocationResult locationResult = (LocationResult) obj;
        int size = locationResult.f5311a.size();
        List list = this.f5311a;
        if (size != list.size()) {
            return false;
        }
        Iterator it = locationResult.f5311a.iterator();
        Iterator it2 = list.iterator();
        while (it.hasNext()) {
            if (((Location) it2.next()).getTime() != ((Location) it.next()).getTime()) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        Iterator it = this.f5311a.iterator();
        int i2 = 17;
        while (it.hasNext()) {
            long time = ((Location) it.next()).getTime();
            i2 = (i2 * 31) + ((int) (time ^ (time >>> 32)));
        }
        return i2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f5311a);
        StringBuilder sb = new StringBuilder(valueOf.length() + 27);
        sb.append("LocationResult[locations: ");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int R5 = AbstractC0169a.R(parcel, 20293);
        AbstractC0169a.Q(parcel, 1, this.f5311a);
        AbstractC0169a.S(parcel, R5);
    }
}
