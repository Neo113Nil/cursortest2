package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public abstract class J1 {

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0737a0 f9664b;

    /* renamed from: c, reason: collision with root package name */
    public HG f9665c;

    /* renamed from: d, reason: collision with root package name */
    public H1 f9666d;

    /* renamed from: e, reason: collision with root package name */
    public long f9667e;
    public long f;

    /* renamed from: g, reason: collision with root package name */
    public long f9668g;

    /* renamed from: h, reason: collision with root package name */
    public int f9669h;
    public int i;

    /* renamed from: k, reason: collision with root package name */
    public long f9671k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f9672l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f9673m;

    /* renamed from: a, reason: collision with root package name */
    public final F1 f9663a = new F1();

    /* renamed from: j, reason: collision with root package name */
    public C0709Wb f9670j = new C0709Wb();

    public abstract long a(C1617tm c1617tm);

    public void b(boolean z3) {
        int i;
        if (z3) {
            this.f9670j = new C0709Wb();
            this.f = 0L;
            i = 0;
        } else {
            i = 1;
        }
        this.f9669h = i;
        this.f9667e = -1L;
        this.f9668g = 0L;
    }

    public abstract boolean c(C1617tm c1617tm, long j5, C0709Wb c0709Wb);

    public void d(long j5) {
        this.f9668g = j5;
    }
}
