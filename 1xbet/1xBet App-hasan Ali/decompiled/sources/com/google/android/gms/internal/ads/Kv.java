package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class Kv implements Iterator {

    /* renamed from: k, reason: collision with root package name */
    public final Iterator f10280k;

    public Kv(Iterator it) {
        it.getClass();
        this.f10280k = it;
    }

    public abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f10280k.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.f10280k.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f10280k.remove();
    }
}
