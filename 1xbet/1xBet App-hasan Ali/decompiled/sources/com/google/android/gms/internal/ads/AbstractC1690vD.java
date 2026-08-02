package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.ads.vD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1690vD implements Iterator, Closeable, AutoCloseable {

    /* renamed from: q, reason: collision with root package name */
    public static final T3 f15980q = new T3("eof ", 1);

    /* renamed from: k, reason: collision with root package name */
    public N3 f15981k;

    /* renamed from: l, reason: collision with root package name */
    public C1205ke f15982l;

    /* renamed from: m, reason: collision with root package name */
    public P3 f15983m = null;

    /* renamed from: n, reason: collision with root package name */
    public long f15984n = 0;

    /* renamed from: o, reason: collision with root package name */
    public long f15985o = 0;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f15986p = new ArrayList();

    static {
        AbstractC1400ot.y(AbstractC1690vD.class);
    }

    public void close() {
    }

    @Override // java.util.Iterator
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final P3 next() {
        P3 a5;
        P3 p32 = this.f15983m;
        if (p32 != null && p32 != f15980q) {
            this.f15983m = null;
            return p32;
        }
        C1205ke c1205ke = this.f15982l;
        if (c1205ke == null || this.f15984n >= this.f15985o) {
            this.f15983m = f15980q;
            throw new NoSuchElementException();
        }
        try {
            synchronized (c1205ke) {
                this.f15982l.f14251k.position((int) this.f15984n);
                a5 = this.f15981k.a(this.f15982l, this);
                this.f15984n = this.f15982l.d();
            }
            return a5;
        } catch (EOFException unused) {
            throw new NoSuchElementException();
        } catch (IOException unused2) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        P3 p32 = this.f15983m;
        T3 t32 = f15980q;
        if (p32 == t32) {
            return false;
        }
        if (p32 != null) {
            return true;
        }
        try {
            this.f15983m = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.f15983m = t32;
            return false;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f15986p;
            if (i >= arrayList.size()) {
                sb.append("]");
                return sb.toString();
            }
            if (i > 0) {
                sb.append(";");
            }
            sb.append(((P3) arrayList.get(i)).toString());
            i++;
        }
    }
}
