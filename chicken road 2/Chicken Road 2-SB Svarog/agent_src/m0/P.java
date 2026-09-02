package m0;

/* loaded from: classes.dex */
public final class P extends O {

    /* renamed from: f, reason: collision with root package name */
    public final T f900f;

    /* renamed from: g, reason: collision with root package name */
    public final Q f901g;

    /* renamed from: h, reason: collision with root package name */
    public final C0052i f902h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f903i;

    public P(T t2, Q q2, C0052i c0052i, Object obj) {
        this.f900f = t2;
        this.f901g = q2;
        this.f902h = c0052i;
        this.f903i = obj;
    }

    @Override // f0.l
    public final /* bridge */ /* synthetic */ Object i(Object obj) {
        o((Throwable) obj);
        return W.g.f394a;
    }

    @Override // m0.O
    public final void o(Throwable th) {
        C0052i D2 = T.D(this.f902h);
        T t2 = this.f900f;
        Q q2 = this.f901g;
        Object obj = this.f903i;
        if (D2 != null) {
            while (AbstractC0062t.d(D2.f928f, new P(t2, q2, D2, obj), 1) == V.f914b) {
                D2 = T.D(D2);
                if (D2 == null) {
                }
            }
            return;
        }
        t2.m(t2.u(q2, obj));
    }
}
