package D3;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final p f5620a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5621b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5622c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5623d;

    /* renamed from: e, reason: collision with root package name */
    public final long f5624e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5625f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5626g;

    /* renamed from: h, reason: collision with root package name */
    final o f5627h;

    public c(p pVar, int i11, long j11, long j12, int i12) {
        this(pVar, i11, j11, j12, -1L, i12, 0, new o());
    }

    public c(p pVar, int i11, long j11, long j12, long j13, int i12, int i13, o oVar) {
        oVar.getClass();
        boolean z11 = false;
        G10.a.c((i13 == 0) == (i11 != 4));
        if (i12 != 0) {
            if (i11 != 2 && i11 != 0) {
                z11 = true;
            }
            G10.a.c(z11);
        }
        this.f5620a = pVar;
        this.f5621b = i11;
        this.f5622c = j11;
        this.f5623d = j12;
        this.f5624e = j13;
        this.f5625f = i12;
        this.f5626g = i13;
        this.f5627h = oVar;
    }
}
