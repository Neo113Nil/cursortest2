package V3;

import O.j;
import R3.n;
import java.util.Locale;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int f3244a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3245b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3246c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3247d;

    /* renamed from: e, reason: collision with root package name */
    public final n f3248e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3249f;

    /* renamed from: g, reason: collision with root package name */
    public final a f3250g;

    public b(String str, String str2, String str3, n nVar, int i2, a aVar) {
        if (U3.a.f3170a) {
            Thread.currentThread().getStackTrace();
        }
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.f3245b = str;
        if (str2 == null) {
            throw new NullPointerException("Null description");
        }
        this.f3246c = str2;
        if (str3 == null) {
            throw new NullPointerException("Null unit");
        }
        this.f3247d = str3;
        this.f3248e = nVar;
        if (i2 == 0) {
            throw new NullPointerException("Null valueType");
        }
        this.f3249f = i2;
        this.f3250g = aVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f3245b.equalsIgnoreCase(bVar.f3245b) && this.f3246c.equals(bVar.f3246c) && this.f3247d.equals(bVar.f3247d) && this.f3248e.equals(bVar.f3248e) && j.a(this.f3249f, bVar.f3249f);
    }

    public final int hashCode() {
        int i2 = this.f3244a;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = ((((((((this.f3245b.toLowerCase(Locale.ROOT).hashCode() ^ 1000003) * 1000003) ^ this.f3246c.hashCode()) * 1000003) ^ this.f3247d.hashCode()) * 1000003) ^ this.f3248e.hashCode()) * 1000003) ^ j.b(this.f3249f);
        this.f3244a = hashCode;
        return hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstrumentDescriptor{name=");
        sb.append(this.f3245b);
        sb.append(", description=");
        sb.append(this.f3246c);
        sb.append(", unit=");
        sb.append(this.f3247d);
        sb.append(", type=");
        sb.append(this.f3248e);
        sb.append(", valueType=");
        int i2 = this.f3249f;
        sb.append(i2 != 1 ? i2 != 2 ? "null" : "DOUBLE" : "LONG");
        sb.append(", advice=");
        sb.append(this.f3250g);
        sb.append("}");
        return sb.toString();
    }
}
