package B1;

import A1.R0;
import java.util.Arrays;
import p018c2.D;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final R0 f969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final D f971d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f972e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final R0 f973f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f974g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final D f975h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f976i;
    public final long j;

    public a(long j, R0 r7, int i7, D d7, long j3, R0 r8, int i8, D d8, long j7, long j8) {
        this.f968a = j;
        this.f969b = r7;
        this.f970c = i7;
        this.f971d = d7;
        this.f972e = j3;
        this.f973f = r8;
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
        return this.f968a == aVar.f968a && this.f970c == aVar.f970c && this.f972e == aVar.f972e && this.f974g == aVar.f974g && this.f976i == aVar.f976i && this.j == aVar.j && p097n3.a.t(this.f969b, aVar.f969b) && p097n3.a.t(this.f971d, aVar.f971d) && p097n3.a.t(this.f973f, aVar.f973f) && p097n3.a.t(this.f975h, aVar.f975h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f968a), this.f969b, Integer.valueOf(this.f970c), this.f971d, Long.valueOf(this.f972e), this.f973f, Integer.valueOf(this.f974g), this.f975h, Long.valueOf(this.f976i), Long.valueOf(this.j)});
    }
}
