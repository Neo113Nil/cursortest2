package o;

import java.util.Iterator;

/* renamed from: o.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1484b extends e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public C1485c f15516a;

    /* renamed from: b, reason: collision with root package name */
    public C1485c f15517b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f15518c;

    public C1484b(C1485c c1485c, C1485c c1485c2, int i7) {
        this.f15518c = i7;
        this.f15516a = c1485c2;
        this.f15517b = c1485c;
    }

    @Override // o.e
    public final void a(C1485c c1485c) {
        C1485c c1485c2;
        C1485c c1485c3 = null;
        if (this.f15516a == c1485c && c1485c == this.f15517b) {
            this.f15517b = null;
            this.f15516a = null;
        }
        C1485c c1485c4 = this.f15516a;
        if (c1485c4 == c1485c) {
            switch (this.f15518c) {
                case 0:
                    c1485c2 = c1485c4.f15522d;
                    break;
                default:
                    c1485c2 = c1485c4.f15521c;
                    break;
            }
            this.f15516a = c1485c2;
        }
        C1485c c1485c5 = this.f15517b;
        if (c1485c5 == c1485c) {
            C1485c c1485c6 = this.f15516a;
            if (c1485c5 != c1485c6 && c1485c6 != null) {
                c1485c3 = b(c1485c5);
            }
            this.f15517b = c1485c3;
        }
    }

    public final C1485c b(C1485c c1485c) {
        switch (this.f15518c) {
            case 0:
                return c1485c.f15521c;
            default:
                return c1485c.f15522d;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15517b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C1485c c1485c = this.f15517b;
        C1485c c1485c2 = this.f15516a;
        this.f15517b = (c1485c == c1485c2 || c1485c2 == null) ? null : b(c1485c);
        return c1485c;
    }
}
