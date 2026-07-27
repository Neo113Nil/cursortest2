package L3;

import B0.o;
import java.util.HashMap;
import n2.AbstractC1341c;

/* loaded from: classes.dex */
public final class g extends HashMap implements R2.b {

    /* renamed from: a, reason: collision with root package name */
    public final long f1496a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1497b;

    /* renamed from: c, reason: collision with root package name */
    public int f1498c = 0;

    public g(int i2, long j2) {
        this.f1496a = j2;
        this.f1497b = i2;
    }

    public final R2.a a() {
        j jVar = new j(2);
        super.forEach(new D3.a(2, jVar));
        return jVar.c();
    }

    @Override // R2.b
    public final Q2.c c() {
        j jVar = new j(2);
        super.forEach(new D3.a(2, jVar));
        return jVar.c().c();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Object put(S2.a aVar, Object obj) {
        if (obj == null) {
            return null;
        }
        this.f1498c++;
        if (size() < this.f1496a || containsKey(aVar)) {
            return super.put(aVar, AbstractC1341c.b(this.f1497b, obj));
        }
        return null;
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        StringBuilder sb = new StringBuilder("ExtendedAttributesMap{data=");
        sb.append(super.toString());
        sb.append(", capacity=");
        sb.append(this.f1496a);
        sb.append(", totalAddedValues=");
        return o.k(sb, this.f1498c, '}');
    }
}
