package p;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: p.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1157g implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final int f10207a;

    /* renamed from: b, reason: collision with root package name */
    public int f10208b;

    /* renamed from: c, reason: collision with root package name */
    public int f10209c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10210d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1151a f10211e;

    public C1157g(C1151a c1151a, int i3) {
        this.f10211e = c1151a;
        this.f10207a = i3;
        this.f10208b = c1151a.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f10209c < this.f10208b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object b3 = this.f10211e.b(this.f10209c, this.f10207a);
        this.f10209c++;
        this.f10210d = true;
        return b3;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f10210d) {
            throw new IllegalStateException();
        }
        int i3 = this.f10209c - 1;
        this.f10209c = i3;
        this.f10208b--;
        this.f10210d = false;
        this.f10211e.g(i3);
    }
}
