package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class J implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f2642a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2643b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2644c;

    public J(Iterator it) {
        it.getClass();
        this.f2642a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2643b || this.f2642a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f2643b) {
            return this.f2642a.next();
        }
        Object obj = this.f2644c;
        this.f2643b = false;
        this.f2644c = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f2643b) {
            throw new IllegalStateException("Can't remove after you've peeked at next");
        }
        this.f2642a.remove();
    }
}
