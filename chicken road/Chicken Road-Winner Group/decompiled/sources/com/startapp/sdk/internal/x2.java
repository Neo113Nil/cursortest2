package com.startapp.sdk.internal;

import java.lang.reflect.Array;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class x2 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4620a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4621b;

    /* renamed from: c, reason: collision with root package name */
    public int f4622c;

    public x2(int i3, Object obj) {
        this.f4620a = obj;
        this.f4621b = i3;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4622c < this.f4621b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.f4620a;
        int i3 = this.f4622c;
        this.f4622c = i3 + 1;
        return Array.get(obj, i3);
    }
}
