package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class K extends AbstractC0174b0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2646a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2647b;

    public K(Object obj) {
        this.f2646a = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f2647b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f2647b) {
            throw new NoSuchElementException();
        }
        this.f2647b = true;
        return this.f2646a;
    }
}
