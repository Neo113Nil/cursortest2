package p;

import java.util.Iterator;

/* renamed from: p.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2236b extends AbstractC2239e implements Iterator {

    /* renamed from: k, reason: collision with root package name */
    public C2237c f18674k;

    /* renamed from: l, reason: collision with root package name */
    public C2237c f18675l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f18676m;

    public C2236b(C2237c c2237c, C2237c c2237c2, int i) {
        this.f18676m = i;
        this.f18674k = c2237c2;
        this.f18675l = c2237c;
    }

    @Override // p.AbstractC2239e
    public final void a(C2237c c2237c) {
        C2237c c2237c2;
        C2237c c2237c3 = null;
        if (this.f18674k == c2237c && c2237c == this.f18675l) {
            this.f18675l = null;
            this.f18674k = null;
        }
        C2237c c2237c4 = this.f18674k;
        if (c2237c4 == c2237c) {
            switch (this.f18676m) {
                case 0:
                    c2237c2 = c2237c4.f18680n;
                    break;
                default:
                    c2237c2 = c2237c4.f18679m;
                    break;
            }
            this.f18674k = c2237c2;
        }
        C2237c c2237c5 = this.f18675l;
        if (c2237c5 == c2237c) {
            C2237c c2237c6 = this.f18674k;
            if (c2237c5 != c2237c6 && c2237c6 != null) {
                c2237c3 = b(c2237c5);
            }
            this.f18675l = c2237c3;
        }
    }

    public final C2237c b(C2237c c2237c) {
        switch (this.f18676m) {
            case 0:
                return c2237c.f18679m;
            default:
                return c2237c.f18680n;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18675l != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C2237c c2237c = this.f18675l;
        C2237c c2237c2 = this.f18674k;
        this.f18675l = (c2237c == c2237c2 || c2237c2 == null) ? null : b(c2237c);
        return c2237c;
    }
}
