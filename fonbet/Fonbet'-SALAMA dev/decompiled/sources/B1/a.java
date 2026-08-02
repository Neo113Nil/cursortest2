package B1;

import A1.R0;
import c2.D;
import java.util.Arrays;
import n3.AbstractC1464a;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f968a;

    /* renamed from: b, reason: collision with root package name */
    public final R0 f969b;

    /* renamed from: c, reason: collision with root package name */
    public final int f970c;

    /* renamed from: d, reason: collision with root package name */
    public final D f971d;

    /* renamed from: e, reason: collision with root package name */
    public final long f972e;

    /* renamed from: f, reason: collision with root package name */
    public final R0 f973f;

    /* renamed from: g, reason: collision with root package name */
    public final int f974g;

    /* renamed from: h, reason: collision with root package name */
    public final D f975h;

    /* renamed from: i, reason: collision with root package name */
    public final long f976i;
    public final long j;

    public a(long j, R0 r02, int i7, D d7, long j3, R0 r03, int i8, D d8, long j7, long j8) {
        this.f968a = j;
        this.f969b = r02;
        this.f970c = i7;
        this.f971d = d7;
        this.f972e = j3;
        this.f973f = r03;
        this.f974g = i8;
        this.f975h = d8;
        this.f976i = j7;
        this.j = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f968a == aVar.f968a && this.f970c == aVar.f970c && this.f972e == aVar.f972e && this.f974g == aVar.f974g && this.f976i == aVar.f976i && this.j == aVar.j && AbstractC1464a.t(this.f969b, aVar.f969b) && AbstractC1464a.t(this.f971d, aVar.f971d) && AbstractC1464a.t(this.f973f, aVar.f973f) && AbstractC1464a.t(this.f975h, aVar.f975h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f968a), this.f969b, Integer.valueOf(this.f970c), this.f971d, Long.valueOf(this.f972e), this.f973f, Integer.valueOf(this.f974g), this.f975h, Long.valueOf(this.f976i), Long.valueOf(this.j)});
    }
}
