package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class Ru implements Iterator {

    /* renamed from: k, reason: collision with root package name */
    public int f11465k;

    /* renamed from: l, reason: collision with root package name */
    public int f11466l;

    /* renamed from: m, reason: collision with root package name */
    public int f11467m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Uu f11468n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f11469o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Uu f11470p;

    public Ru(Uu uu, int i) {
        this.f11469o = i;
        this.f11470p = uu;
        this.f11468n = uu;
        this.f11465k = uu.f11837o;
        this.f11466l = uu.isEmpty() ? -1 : 0;
        this.f11467m = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f11466l >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj;
        Uu uu = this.f11470p;
        Uu uu2 = this.f11468n;
        if (uu2.f11837o != this.f11465k) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f11466l;
        this.f11467m = i;
        switch (this.f11469o) {
            case 0:
                Object obj2 = Uu.f11832t;
                obj = uu.b()[i];
                break;
            case 1:
                obj = new Tu(uu, i);
                break;
            default:
                Object obj3 = Uu.f11832t;
                obj = uu.c()[i];
                break;
        }
        int i5 = this.f11466l + 1;
        if (i5 >= uu2.f11838p) {
            i5 = -1;
        }
        this.f11466l = i5;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        Uu uu = this.f11468n;
        if (uu.f11837o != this.f11465k) {
            throw new ConcurrentModificationException();
        }
        AbstractC1400ot.i0("no calls to next() since the last call to remove()", this.f11467m >= 0);
        this.f11465k += 32;
        uu.remove(uu.b()[this.f11467m]);
        this.f11466l--;
        this.f11467m = -1;
    }
}
