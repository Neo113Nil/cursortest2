package P3;

import m3.C8050C;

/* loaded from: classes8.dex */
final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final int f21758a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21759b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21760c;

    private c(int i11, int i12, int i13) {
        this.f21758a = i11;
        this.f21759b = i12;
        this.f21760c = i13;
    }

    public static c b(C8050C c8050c) {
        int s11 = c8050c.s();
        c8050c.S(8);
        int s12 = c8050c.s();
        int s13 = c8050c.s();
        c8050c.S(4);
        c8050c.s();
        c8050c.S(12);
        return new c(s11, s12, s13);
    }

    public final boolean a() {
        return (this.f21759b & 16) == 16;
    }

    @Override // P3.a
    public final int getType() {
        return 1751742049;
    }
}
