package com.google.android.gms.location;

import F2.b;
import H.j;
import T0.a;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class LocationRequest extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new j(22);

    /* renamed from: a, reason: collision with root package name */
    public int f2864a = 102;

    /* renamed from: b, reason: collision with root package name */
    public long f2865b = 3600000;

    /* renamed from: c, reason: collision with root package name */
    public long f2866c = 600000;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2867d = false;

    /* renamed from: e, reason: collision with root package name */
    public long f2868e = Long.MAX_VALUE;
    public int f = Integer.MAX_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public float f2869g = 0.0f;

    /* renamed from: h, reason: collision with root package name */
    public long f2870h = 0;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2871i = false;

    @Deprecated
    public LocationRequest() {
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationRequest)) {
            return false;
        }
        LocationRequest locationRequest = (LocationRequest) obj;
        if (this.f2864a != locationRequest.f2864a) {
            return false;
        }
        long j3 = this.f2865b;
        long j4 = locationRequest.f2865b;
        if (j3 != j4 || this.f2866c != locationRequest.f2866c || this.f2867d != locationRequest.f2867d || this.f2868e != locationRequest.f2868e || this.f != locationRequest.f || this.f2869g != locationRequest.f2869g) {
            return false;
        }
        long j5 = this.f2870h;
        if (j5 >= j3) {
            j3 = j5;
        }
        long j6 = locationRequest.f2870h;
        if (j6 >= j4) {
            j4 = j6;
        }
        return j3 == j4 && this.f2871i == locationRequest.f2871i;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2864a), Long.valueOf(this.f2865b), Float.valueOf(this.f2869g), Long.valueOf(this.f2870h)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request[");
        int i3 = this.f2864a;
        sb.append(i3 != 100 ? i3 != 102 ? i3 != 104 ? i3 != 105 ? "???" : "PRIORITY_NO_POWER" : "PRIORITY_LOW_POWER" : "PRIORITY_BALANCED_POWER_ACCURACY" : "PRIORITY_HIGH_ACCURACY");
        if (this.f2864a != 105) {
            sb.append(" requested=");
            sb.append(this.f2865b);
            sb.append("ms");
        }
        sb.append(" fastest=");
        sb.append(this.f2866c);
        sb.append("ms");
        long j3 = this.f2865b;
        long j4 = this.f2870h;
        if (j4 > j3) {
            sb.append(" maxWait=");
            sb.append(j4);
            sb.append("ms");
        }
        float f = this.f2869g;
        if (f > 0.0f) {
            sb.append(" smallestDisplacement=");
            sb.append(f);
            sb.append("m");
        }
        long j5 = this.f2868e;
        if (j5 != Long.MAX_VALUE) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(j5 - elapsedRealtime);
            sb.append("ms");
        }
        int i4 = this.f;
        if (i4 != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(i4);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Q2 = b.Q(parcel, 20293);
        int i4 = this.f2864a;
        b.S(parcel, 1, 4);
        parcel.writeInt(i4);
        long j3 = this.f2865b;
        b.S(parcel, 2, 8);
        parcel.writeLong(j3);
        long j4 = this.f2866c;
        b.S(parcel, 3, 8);
        parcel.writeLong(j4);
        b.S(parcel, 4, 4);
        parcel.writeInt(this.f2867d ? 1 : 0);
        b.S(parcel, 5, 8);
        parcel.writeLong(this.f2868e);
        b.S(parcel, 6, 4);
        parcel.writeInt(this.f);
        b.S(parcel, 7, 4);
        parcel.writeFloat(this.f2869g);
        b.S(parcel, 8, 8);
        parcel.writeLong(this.f2870h);
        boolean z3 = this.f2871i;
        b.S(parcel, 9, 4);
        parcel.writeInt(z3 ? 1 : 0);
        b.R(parcel, Q2);
    }
}
