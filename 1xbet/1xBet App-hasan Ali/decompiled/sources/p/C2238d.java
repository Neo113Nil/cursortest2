package p;

import java.util.Iterator;

/* renamed from: p.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2238d extends AbstractC2239e implements Iterator {

    /* renamed from: k, reason: collision with root package name */
    public C2237c f18681k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f18682l = true;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C2240f f18683m;

    public C2238d(C2240f c2240f) {
        this.f18683m = c2240f;
    }

    @Override // p.AbstractC2239e
    public final void a(C2237c c2237c) {
        C2237c c2237c2 = this.f18681k;
        if (c2237c == c2237c2) {
            C2237c c2237c3 = c2237c2.f18680n;
            this.f18681k = c2237c3;
            this.f18682l = c2237c3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f18682l) {
            return this.f18683m.f18684k != null;
        }
        C2237c c2237c = this.f18681k;
        return (c2237c == null || c2237c.f18679m == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f18682l) {
            this.f18682l = false;
            this.f18681k = this.f18683m.f18684k;
        } else {
            C2237c c2237c = this.f18681k;
            this.f18681k = c2237c != null ? c2237c.f18679m : null;
        }
        return this.f18681k;
    }
}
