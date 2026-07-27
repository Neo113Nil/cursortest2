package P4;

import g4.AbstractC0476u;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class B extends AbstractC0122a {

    /* renamed from: a, reason: collision with root package name */
    public final A f2320a;

    public B() {
        T t5 = T.f2344a;
        Q4.p pVar = Q4.p.f2552a;
        this.f2320a = new A(T.f2345b, Q4.p.f2553b);
    }

    @Override // M4.a
    public final void b(R4.s sVar, Object obj) {
        g(obj);
        A descriptor = this.f2320a;
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        R4.s a6 = sVar.a(descriptor);
        Iterator f3 = f(obj);
        int i2 = 0;
        while (f3.hasNext()) {
            Map.Entry entry = (Map.Entry) f3.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i3 = i2 + 1;
            a6.l(descriptor, i2, T.f2344a, key);
            i2 += 2;
            a6.l(descriptor, i3, Q4.p.f2552a, value);
        }
        a6.p(descriptor);
    }

    @Override // M4.a
    public final N4.e c() {
        return this.f2320a;
    }

    @Override // P4.AbstractC0122a
    public final Object d() {
        return new LinkedHashMap();
    }

    @Override // P4.AbstractC0122a
    public final int e(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        kotlin.jvm.internal.i.e(linkedHashMap, "<this>");
        return linkedHashMap.size() * 2;
    }

    @Override // P4.AbstractC0122a
    public final Iterator f(Object obj) {
        Map map = (Map) obj;
        kotlin.jvm.internal.i.e(map, "<this>");
        return map.entrySet().iterator();
    }

    @Override // P4.AbstractC0122a
    public final int g(Object obj) {
        Map map = (Map) obj;
        kotlin.jvm.internal.i.e(map, "<this>");
        return map.size();
    }

    @Override // P4.AbstractC0122a
    public final void i(O4.a aVar, int i2, Object obj, boolean z) {
        int i3;
        Object b6;
        Map builder = (Map) obj;
        kotlin.jvm.internal.i.e(builder, "builder");
        T t5 = T.f2344a;
        A a6 = this.f2320a;
        Object b7 = aVar.b(a6, i2, t5, null);
        if (z) {
            i3 = aVar.g(a6);
            if (i3 != i2 + 1) {
                throw new IllegalArgumentException(B0.o.h("Value must follow key in a map, index for key: ", i2, i3, ", returned index for value: ").toString());
            }
        } else {
            i3 = i2 + 1;
        }
        if (builder.containsKey(b7)) {
            Q4.p pVar = Q4.p.f2552a;
            if (!(Q4.p.f2553b.f2175b instanceof N4.d)) {
                b6 = aVar.b(a6, i3, pVar, AbstractC0476u.U(builder, b7));
                builder.put(b7, b6);
            }
        }
        b6 = aVar.b(a6, i3, Q4.p.f2552a, null);
        builder.put(b7, b6);
    }

    @Override // P4.AbstractC0122a
    public final Object j(Object obj) {
        kotlin.jvm.internal.i.e(null, "<this>");
        return new LinkedHashMap((Map) null);
    }

    @Override // P4.AbstractC0122a
    public final Object k(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        kotlin.jvm.internal.i.e(linkedHashMap, "<this>");
        return linkedHashMap;
    }
}
