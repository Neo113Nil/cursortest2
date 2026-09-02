package j;

/* renamed from: j.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0911b extends j.AbstractC0914e implements java.util.Iterator {

    /* renamed from: a, reason: collision with root package name */
    public j.C0912c f7923a;

    /* renamed from: b, reason: collision with root package name */
    public j.C0912c f7924b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7925c;

    public C0911b(j.C0912c c0912c, j.C0912c c0912c2, int i2) {
        this.f7925c = i2;
        this.f7923a = c0912c2;
        this.f7924b = c0912c;
    }

    @Override // j.AbstractC0914e
    public final void a(j.C0912c c0912c) {
        j.C0912c c0912c2;
        j.C0912c c0912c3 = null;
        if (this.f7923a == c0912c && c0912c == this.f7924b) {
            this.f7924b = null;
            this.f7923a = null;
        }
        j.C0912c c0912c4 = this.f7923a;
        if (c0912c4 == c0912c) {
            switch (this.f7925c) {
                case 0:
                    c0912c2 = c0912c4.f7929d;
                    break;
                default:
                    c0912c2 = c0912c4.f7928c;
                    break;
            }
            this.f7923a = c0912c2;
        }
        j.C0912c c0912c5 = this.f7924b;
        if (c0912c5 == c0912c) {
            j.C0912c c0912c6 = this.f7923a;
            if (c0912c5 != c0912c6 && c0912c6 != null) {
                c0912c3 = b(c0912c5);
            }
            this.f7924b = c0912c3;
        }
    }

    public final j.C0912c b(j.C0912c c0912c) {
        switch (this.f7925c) {
            case 0:
                return c0912c.f7928c;
            default:
                return c0912c.f7929d;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7924b != null;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        j.C0912c c0912c = this.f7924b;
        j.C0912c c0912c2 = this.f7923a;
        this.f7924b = (c0912c == c0912c2 || c0912c2 == null) ? null : b(c0912c);
        return c0912c;
    }
}
