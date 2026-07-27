package com.fyber.inneractive.sdk.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class o1 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f5867a;

    public o1(Iterator it) {
        this.f5867a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5867a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f5867a.next();
        entry.getValue();
        return entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f5867a.remove();
    }
}
