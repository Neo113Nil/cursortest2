package T2;

import java.util.Arrays;

/* renamed from: T2.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0439q {

    /* renamed from: a, reason: collision with root package name */
    public final String f5732a;

    /* renamed from: b, reason: collision with root package name */
    public final double f5733b;

    /* renamed from: c, reason: collision with root package name */
    public final double f5734c;

    /* renamed from: d, reason: collision with root package name */
    public final double f5735d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5736e;

    public C0439q(String str, double d5, double d6, double d7, int i) {
        this.f5732a = str;
        this.f5734c = d5;
        this.f5733b = d6;
        this.f5735d = d7;
        this.f5736e = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0439q)) {
            return false;
        }
        C0439q c0439q = (C0439q) obj;
        return m3.v.g(this.f5732a, c0439q.f5732a) && this.f5733b == c0439q.f5733b && this.f5734c == c0439q.f5734c && this.f5736e == c0439q.f5736e && Double.compare(this.f5735d, c0439q.f5735d) == 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5732a, Double.valueOf(this.f5733b), Double.valueOf(this.f5734c), Double.valueOf(this.f5735d), Integer.valueOf(this.f5736e)});
    }

    public final String toString() {
        v3.g gVar = new v3.g(this);
        gVar.s("name", this.f5732a);
        gVar.s("minBound", Double.valueOf(this.f5734c));
        gVar.s("maxBound", Double.valueOf(this.f5733b));
        gVar.s("percent", Double.valueOf(this.f5735d));
        gVar.s("count", Integer.valueOf(this.f5736e));
        return gVar.toString();
    }
}
