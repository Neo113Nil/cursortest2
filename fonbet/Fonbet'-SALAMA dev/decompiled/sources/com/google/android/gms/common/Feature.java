package com.google.android.gms.common;

import Y4.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.E;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import w1.V0;

/* loaded from: classes.dex */
public class Feature extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Feature> CREATOR = new E(5);

    /* renamed from: a, reason: collision with root package name */
    public final String f11064a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11065b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11066c;

    public Feature(int i7, long j, String str) {
        this.f11064a = str;
        this.f11065b = i7;
        this.f11066c = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            String str = this.f11064a;
            if (((str != null && str.equals(feature.f11064a)) || (str == null && feature.f11064a == null)) && j() == feature.j()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11064a, Long.valueOf(j())});
    }

    public final long j() {
        long j = this.f11066c;
        return j == -1 ? this.f11065b : j;
    }

    public final String toString() {
        V0 v02 = new V0(this);
        v02.j(this.f11064a, "name");
        v02.j(Long.valueOf(j()), "version");
        return v02.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = D.x0(20293, parcel);
        D.s0(parcel, 1, this.f11064a, false);
        D.B0(parcel, 2, 4);
        parcel.writeInt(this.f11065b);
        long j = j();
        D.B0(parcel, 3, 8);
        parcel.writeLong(j);
        D.z0(x02, parcel);
    }

    public Feature(String str, long j) {
        this.f11064a = str;
        this.f11066c = j;
        this.f11065b = -1;
    }
}
