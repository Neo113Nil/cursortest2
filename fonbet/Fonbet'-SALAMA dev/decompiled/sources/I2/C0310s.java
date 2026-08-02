package I2;

import io.sentry.profilemeasurements.ProfileMeasurement;
import java.util.Arrays;
import w1.V0;

/* renamed from: I2.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0310s {

    /* renamed from: a, reason: collision with root package name */
    public final String f3640a;

    /* renamed from: b, reason: collision with root package name */
    public final double f3641b;

    /* renamed from: c, reason: collision with root package name */
    public final double f3642c;

    /* renamed from: d, reason: collision with root package name */
    public final double f3643d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3644e;

    public C0310s(String str, double d7, double d8, double d9, int i7) {
        this.f3640a = str;
        this.f3642c = d7;
        this.f3641b = d8;
        this.f3643d = d9;
        this.f3644e = i7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0310s)) {
            return false;
        }
        C0310s c0310s = (C0310s) obj;
        return com.google.android.gms.common.internal.D.m(this.f3640a, c0310s.f3640a) && this.f3641b == c0310s.f3641b && this.f3642c == c0310s.f3642c && this.f3644e == c0310s.f3644e && Double.compare(this.f3643d, c0310s.f3643d) == 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3640a, Double.valueOf(this.f3641b), Double.valueOf(this.f3642c), Double.valueOf(this.f3643d), Integer.valueOf(this.f3644e)});
    }

    public final String toString() {
        V0 v02 = new V0(this);
        v02.j(this.f3640a, "name");
        v02.j(Double.valueOf(this.f3642c), "minBound");
        v02.j(Double.valueOf(this.f3641b), "maxBound");
        v02.j(Double.valueOf(this.f3643d), ProfileMeasurement.UNIT_PERCENT);
        v02.j(Integer.valueOf(this.f3644e), "count");
        return v02.toString();
    }
}
