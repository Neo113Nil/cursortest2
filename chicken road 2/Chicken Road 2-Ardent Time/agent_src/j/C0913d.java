package j;

/* renamed from: j.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0913d extends j.AbstractC0914e implements java.util.Iterator {

    /* renamed from: a, reason: collision with root package name */
    public j.C0912c f7930a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7931b = true;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j.C0915f f7932c;

    public C0913d(j.C0915f c0915f) {
        this.f7932c = c0915f;
    }

    @Override // j.AbstractC0914e
    public final void a(j.C0912c c0912c) {
        j.C0912c c0912c2 = this.f7930a;
        if (c0912c == c0912c2) {
            j.C0912c c0912c3 = c0912c2.f7929d;
            this.f7930a = c0912c3;
            this.f7931b = c0912c3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f7931b) {
            return this.f7932c.f7933a != null;
        }
        j.C0912c c0912c = this.f7930a;
        return (c0912c == null || c0912c.f7928c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (this.f7931b) {
            this.f7931b = false;
            this.f7930a = this.f7932c.f7933a;
        } else {
            j.C0912c c0912c = this.f7930a;
            this.f7930a = c0912c != null ? c0912c.f7928c : null;
        }
        return this.f7930a;
    }
}
