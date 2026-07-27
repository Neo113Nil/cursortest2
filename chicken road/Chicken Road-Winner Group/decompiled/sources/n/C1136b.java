package n;

import java.util.Iterator;

/* renamed from: n.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1136b extends AbstractC1139e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public C1137c f10114a;

    /* renamed from: b, reason: collision with root package name */
    public C1137c f10115b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f10116c;

    public C1136b(C1137c c1137c, C1137c c1137c2, int i3) {
        this.f10116c = i3;
        this.f10114a = c1137c2;
        this.f10115b = c1137c;
    }

    @Override // n.AbstractC1139e
    public final void a(C1137c c1137c) {
        C1137c c1137c2;
        C1137c c1137c3 = null;
        if (this.f10114a == c1137c && c1137c == this.f10115b) {
            this.f10115b = null;
            this.f10114a = null;
        }
        C1137c c1137c4 = this.f10114a;
        if (c1137c4 == c1137c) {
            switch (this.f10116c) {
                case 0:
                    c1137c2 = c1137c4.f10120d;
                    break;
                default:
                    c1137c2 = c1137c4.f10119c;
                    break;
            }
            this.f10114a = c1137c2;
        }
        C1137c c1137c5 = this.f10115b;
        if (c1137c5 == c1137c) {
            C1137c c1137c6 = this.f10114a;
            if (c1137c5 != c1137c6 && c1137c6 != null) {
                c1137c3 = b(c1137c5);
            }
            this.f10115b = c1137c3;
        }
    }

    public final C1137c b(C1137c c1137c) {
        switch (this.f10116c) {
            case 0:
                return c1137c.f10119c;
            default:
                return c1137c.f10120d;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f10115b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C1137c c1137c = this.f10115b;
        C1137c c1137c2 = this.f10114a;
        this.f10115b = (c1137c == c1137c2 || c1137c2 == null) ? null : b(c1137c);
        return c1137c;
    }
}
