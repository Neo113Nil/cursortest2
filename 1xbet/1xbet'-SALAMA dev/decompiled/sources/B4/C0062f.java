package B4;

import Y4.I0;
import java.util.Map;
import java.util.Objects;
import p155w1.P2;

/* JADX INFO: renamed from: B4.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0062f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0061e f1155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f1156b;

    public C0062f(C0061e c0061e, Map map) {
        c0061e.getClass();
        this.f1155a = c0061e;
        this.f1156b = map;
    }

    public final long a() {
        C0058b c0058b = new C0058b(null, "count");
        Number number = (Number) c(c0058b);
        Long lValueOf = number != null ? Long.valueOf(number.longValue()) : null;
        if (lValueOf != null) {
            return lValueOf.longValue();
        }
        throw new IllegalArgumentException(p031e1.k.i(new StringBuilder("RunAggregationQueryResponse alias "), c0058b.f1148c, " is null"));
    }

    public final Object b(AbstractC0060d abstractC0060d) {
        Map map = this.f1156b;
        String str = abstractC0060d.f1148c;
        if (map.containsKey(str)) {
            return new P2(3, this.f1155a.f1149a.f1136b, EnumC0071o.f1184d, false).f((I0) map.get(str));
        }
        throw new IllegalArgumentException("'" + abstractC0060d.f1147b + "(" + abstractC0060d.a() + ")' was not requested in the aggregation query.");
    }

    public final Object c(AbstractC0060d abstractC0060d) {
        Object objB = b(abstractC0060d);
        if (objB == null) {
            return null;
        }
        if (Number.class.isInstance(objB)) {
            return Number.class.cast(objB);
        }
        throw new RuntimeException("AggregateField '" + abstractC0060d.f1148c + "' is not a " + Number.class.getName());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0062f)) {
            return false;
        }
        C0062f c0062f = (C0062f) obj;
        return this.f1155a.equals(c0062f.f1155a) && this.f1156b.equals(c0062f.f1156b);
    }

    public final int hashCode() {
        return Objects.hash(this.f1155a, this.f1156b);
    }
}
