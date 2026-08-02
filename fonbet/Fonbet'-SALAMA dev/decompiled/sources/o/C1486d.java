package o;

import java.util.Iterator;

/* renamed from: o.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1486d extends e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public C1485c f15523a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f15524b = true;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f15525c;

    public C1486d(f fVar) {
        this.f15525c = fVar;
    }

    @Override // o.e
    public final void a(C1485c c1485c) {
        C1485c c1485c2 = this.f15523a;
        if (c1485c == c1485c2) {
            C1485c c1485c3 = c1485c2.f15522d;
            this.f15523a = c1485c3;
            this.f15524b = c1485c3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f15524b) {
            return this.f15525c.f15526a != null;
        }
        C1485c c1485c = this.f15523a;
        return (c1485c == null || c1485c.f15521c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f15524b) {
            this.f15524b = false;
            this.f15523a = this.f15525c.f15526a;
        } else {
            C1485c c1485c = this.f15523a;
            this.f15523a = c1485c != null ? c1485c.f15521c : null;
        }
        return this.f15523a;
    }
}
