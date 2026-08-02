package D1;

import l1.N0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class A {

    /* renamed from: c, reason: collision with root package name */
    private float f5211c;

    /* renamed from: d, reason: collision with root package name */
    private float f5212d;

    /* renamed from: e, reason: collision with root package name */
    private float f5213e;

    /* renamed from: f, reason: collision with root package name */
    private float f5214f;

    /* renamed from: g, reason: collision with root package name */
    private float f5215g;

    /* renamed from: i, reason: collision with root package name */
    private long f5217i;

    /* renamed from: a, reason: collision with root package name */
    private float f5209a = 1.0f;

    /* renamed from: b, reason: collision with root package name */
    private float f5210b = 1.0f;

    /* renamed from: h, reason: collision with root package name */
    private float f5216h = 8.0f;

    public A() {
        long j11;
        int i11 = N0.f72233c;
        j11 = N0.f72232b;
        this.f5217i = j11;
    }

    public final void a(@NotNull A a11) {
        this.f5209a = a11.f5209a;
        this.f5210b = a11.f5210b;
        this.f5211c = a11.f5211c;
        this.f5212d = a11.f5212d;
        this.f5213e = a11.f5213e;
        this.f5214f = a11.f5214f;
        this.f5215g = a11.f5215g;
        this.f5216h = a11.f5216h;
        this.f5217i = a11.f5217i;
    }

    public final void b(@NotNull l1.E0 e02) {
        this.f5209a = e02.K();
        this.f5210b = e02.L();
        this.f5211c = e02.S();
        this.f5212d = e02.T();
        this.f5213e = e02.E();
        this.f5214f = e02.G();
        this.f5215g = e02.I();
        this.f5216h = e02.s();
        this.f5217i = e02.P();
    }

    public final boolean c(@NotNull A a11) {
        return this.f5209a == a11.f5209a && this.f5210b == a11.f5210b && this.f5211c == a11.f5211c && this.f5212d == a11.f5212d && this.f5213e == a11.f5213e && this.f5214f == a11.f5214f && this.f5215g == a11.f5215g && this.f5216h == a11.f5216h && N0.c(this.f5217i, a11.f5217i);
    }
}
