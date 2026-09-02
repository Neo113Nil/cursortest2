package d;

import java.util.Iterator;

/* renamed from: d.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0047b extends AbstractC0050e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public C0048c f874a;

    /* renamed from: b, reason: collision with root package name */
    public C0048c f875b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f876c;

    public C0047b(C0048c c0048c, C0048c c0048c2, int i2) {
        this.f876c = i2;
        this.f874a = c0048c2;
        this.f875b = c0048c;
    }

    @Override // d.AbstractC0050e
    public final void a(C0048c c0048c) {
        C0048c c0048c2;
        C0048c c0048c3 = null;
        if (this.f874a == c0048c && c0048c == this.f875b) {
            this.f875b = null;
            this.f874a = null;
        }
        C0048c c0048c4 = this.f874a;
        if (c0048c4 == c0048c) {
            switch (this.f876c) {
                case 0:
                    c0048c2 = c0048c4.f880d;
                    break;
                default:
                    c0048c2 = c0048c4.f879c;
                    break;
            }
            this.f874a = c0048c2;
        }
        C0048c c0048c5 = this.f875b;
        if (c0048c5 == c0048c) {
            C0048c c0048c6 = this.f874a;
            if (c0048c5 != c0048c6 && c0048c6 != null) {
                c0048c3 = b(c0048c5);
            }
            this.f875b = c0048c3;
        }
    }

    public final C0048c b(C0048c c0048c) {
        switch (this.f876c) {
            case 0:
                return c0048c.f879c;
            default:
                return c0048c.f880d;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f875b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C0048c c0048c = this.f875b;
        C0048c c0048c2 = this.f874a;
        this.f875b = (c0048c == c0048c2 || c0048c2 == null) ? null : b(c0048c);
        return c0048c;
    }
}
