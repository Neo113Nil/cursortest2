package L3;

import B0.o;
import java.util.HashMap;
import n2.AbstractC1341c;

/* loaded from: classes.dex */
public final class b extends HashMap implements Q2.c {

    /* renamed from: a, reason: collision with root package name */
    public final long f1486a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1487b;

    /* renamed from: c, reason: collision with root package name */
    public int f1488c = 0;

    public b(int i2, long j2) {
        this.f1486a = j2;
        this.f1487b = i2;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object put(V2.e eVar, Object obj) {
        if (obj == null) {
            return null;
        }
        this.f1488c++;
        if (size() < this.f1486a || containsKey(eVar)) {
            return super.put(eVar, AbstractC1341c.b(this.f1487b, obj));
        }
        return null;
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        StringBuilder sb = new StringBuilder("AttributesMap{data=");
        sb.append(super.toString());
        sb.append(", capacity=");
        sb.append(this.f1486a);
        sb.append(", totalAddedValues=");
        return o.k(sb, this.f1488c, '}');
    }
}
