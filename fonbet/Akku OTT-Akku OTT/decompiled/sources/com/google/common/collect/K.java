package com.google.common.collect;

import com.google.common.collect.P;

/* loaded from: classes4.dex */
public final class K extends y0<Object> {
    public final y0 a;
    public y0 b = P.a.d;

    public K(L l) {
        this.a = l.e.values().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext() || this.a.hasNext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Iterator
    public final Object next() {
        if (!this.b.hasNext()) {
            this.b = ((E) this.a.next()).iterator();
        }
        return this.b.next();
    }
}
