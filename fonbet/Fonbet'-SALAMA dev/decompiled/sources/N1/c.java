package N1;

import C1.C0095a;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f4637a;

    /* renamed from: b, reason: collision with root package name */
    public int f4638b;

    /* renamed from: c, reason: collision with root package name */
    public int f4639c;

    /* renamed from: d, reason: collision with root package name */
    public long f4640d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4641e;

    /* renamed from: f, reason: collision with root package name */
    public final C0095a f4642f;

    /* renamed from: g, reason: collision with root package name */
    public final C0095a f4643g;

    /* renamed from: h, reason: collision with root package name */
    public int f4644h;

    /* renamed from: i, reason: collision with root package name */
    public int f4645i;

    public c(C0095a c0095a, C0095a c0095a2, boolean z4) {
        this.f4643g = c0095a;
        this.f4642f = c0095a2;
        this.f4641e = z4;
        c0095a2.D(12);
        this.f4637a = c0095a2.w();
        c0095a.D(12);
        this.f4645i = c0095a.w();
        Q0.a.f("first_chunk must be 1", c0095a.g() == 1);
        this.f4638b = -1;
    }

    public final boolean a() {
        int i7 = this.f4638b + 1;
        this.f4638b = i7;
        if (i7 == this.f4637a) {
            return false;
        }
        boolean z4 = this.f4641e;
        C0095a c0095a = this.f4642f;
        this.f4640d = z4 ? c0095a.x() : c0095a.u();
        if (this.f4638b == this.f4644h) {
            C0095a c0095a2 = this.f4643g;
            this.f4639c = c0095a2.w();
            c0095a2.E(4);
            int i8 = this.f4645i - 1;
            this.f4645i = i8;
            this.f4644h = i8 > 0 ? c0095a2.w() - 1 : -1;
        }
        return true;
    }
}
