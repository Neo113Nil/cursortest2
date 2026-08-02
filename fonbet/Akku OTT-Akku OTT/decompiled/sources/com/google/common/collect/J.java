package com.google.common.collect;

import com.google.common.collect.P;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class J extends y0<Map.Entry<Object, Object>> {
    public final y0 a;
    public Object b = null;
    public y0 c = P.a.d;

    public J(L l) {
        this.a = l.e.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c.hasNext() || this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.c.hasNext()) {
            Map.Entry entry = (Map.Entry) this.a.next();
            this.b = entry.getKey();
            this.c = ((E) entry.getValue()).iterator();
        }
        Object obj = this.b;
        Objects.requireNonNull(obj);
        return new F(obj, this.c.next());
    }
}
