package h4;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import u4.InterfaceC1481a;

/* renamed from: h4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0486d implements Iterator, InterfaceC1481a {

    /* renamed from: a, reason: collision with root package name */
    public final C0488f f5798a;

    /* renamed from: b, reason: collision with root package name */
    public int f5799b;

    /* renamed from: c, reason: collision with root package name */
    public int f5800c;

    /* renamed from: d, reason: collision with root package name */
    public int f5801d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5802e;

    public C0486d(C0488f map, int i2) {
        this.f5802e = i2;
        kotlin.jvm.internal.i.e(map, "map");
        this.f5798a = map;
        this.f5800c = -1;
        this.f5801d = map.f5814h;
        c();
    }

    public final void a() {
        if (this.f5798a.f5814h != this.f5801d) {
            throw new ConcurrentModificationException();
        }
    }

    public final void c() {
        while (true) {
            int i2 = this.f5799b;
            C0488f c0488f = this.f5798a;
            if (i2 >= c0488f.f5812f || c0488f.f5809c[i2] >= 0) {
                return;
            } else {
                this.f5799b = i2 + 1;
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5799b < this.f5798a.f5812f;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f5802e) {
            case 0:
                a();
                int i2 = this.f5799b;
                C0488f c0488f = this.f5798a;
                if (i2 >= c0488f.f5812f) {
                    throw new NoSuchElementException();
                }
                this.f5799b = i2 + 1;
                this.f5800c = i2;
                C0487e c0487e = new C0487e(c0488f, i2);
                c();
                return c0487e;
            case 1:
                a();
                int i3 = this.f5799b;
                C0488f c0488f2 = this.f5798a;
                if (i3 >= c0488f2.f5812f) {
                    throw new NoSuchElementException();
                }
                this.f5799b = i3 + 1;
                this.f5800c = i3;
                Object obj = c0488f2.f5807a[i3];
                c();
                return obj;
            default:
                a();
                int i6 = this.f5799b;
                C0488f c0488f3 = this.f5798a;
                if (i6 >= c0488f3.f5812f) {
                    throw new NoSuchElementException();
                }
                this.f5799b = i6 + 1;
                this.f5800c = i6;
                Object[] objArr = c0488f3.f5808b;
                kotlin.jvm.internal.i.b(objArr);
                Object obj2 = objArr[this.f5800c];
                c();
                return obj2;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        a();
        if (this.f5800c == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        C0488f c0488f = this.f5798a;
        c0488f.d();
        c0488f.m(this.f5800c);
        this.f5800c = -1;
        this.f5801d = c0488f.f5814h;
    }
}
