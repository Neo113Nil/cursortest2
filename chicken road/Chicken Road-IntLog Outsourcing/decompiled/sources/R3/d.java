package R3;

import java.util.StringJoiner;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final b f2623a;

    /* renamed from: b, reason: collision with root package name */
    public final Z3.g f2624b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2625c;

    public d(b bVar, Z3.g gVar, int i2) {
        if (bVar == null) {
            throw new NullPointerException("Null aggregation");
        }
        this.f2623a = bVar;
        if (gVar == null) {
            throw new NullPointerException("Null attributesProcessor");
        }
        this.f2624b = gVar;
        this.f2625c = i2;
    }

    public static B3.d a() {
        B3.d dVar = new B3.d(3, (byte) 0);
        dVar.f277c = Z3.c.f3780a;
        dVar.f278d = Z3.g.f3786a;
        dVar.f276b = 2000;
        return dVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        dVar.getClass();
        dVar.getClass();
        return this.f2623a.equals(dVar.f2623a) && this.f2624b.equals(dVar.f2624b) && this.f2625c == dVar.f2625c;
    }

    public final int hashCode() {
        return this.f2625c ^ ((((((1000003 * 1000003) * 1000003) ^ this.f2623a.hashCode()) * 1000003) ^ this.f2624b.hashCode()) * 1000003);
    }

    public final String toString() {
        StringJoiner stringJoiner = new StringJoiner(", ", "View{", "}");
        stringJoiner.add("aggregation=" + this.f2623a);
        stringJoiner.add("attributesProcessor=" + this.f2624b);
        stringJoiner.add("cardinalityLimit=" + this.f2625c);
        return stringJoiner.toString();
    }
}
