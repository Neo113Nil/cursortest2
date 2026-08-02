package u;

/* loaded from: classes.dex */
public final class m0 implements InterfaceC2461h {

    /* renamed from: a, reason: collision with root package name */
    public final C0 f19874a;

    /* renamed from: b, reason: collision with root package name */
    public final A0 f19875b;

    /* renamed from: c, reason: collision with root package name */
    public Object f19876c;

    /* renamed from: d, reason: collision with root package name */
    public Object f19877d;

    /* renamed from: e, reason: collision with root package name */
    public AbstractC2470q f19878e;
    public AbstractC2470q f;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC2470q f19879g;

    /* renamed from: h, reason: collision with root package name */
    public long f19880h;
    public AbstractC2470q i;

    public m0(InterfaceC2464k interfaceC2464k, A0 a02, Object obj, Object obj2, AbstractC2470q abstractC2470q) {
        this.f19874a = interfaceC2464k.a(a02);
        this.f19875b = a02;
        this.f19876c = obj2;
        this.f19877d = obj;
        this.f19878e = (AbstractC2470q) a02.f19643a.c(obj);
        i4.c cVar = a02.f19643a;
        this.f = (AbstractC2470q) cVar.c(obj2);
        this.f19879g = abstractC2470q != null ? AbstractC2453d.g(abstractC2470q) : ((AbstractC2470q) cVar.c(obj)).c();
        this.f19880h = -1L;
    }

    public final void a(Object obj) {
        if (kotlin.jvm.internal.l.a(obj, this.f19877d)) {
            return;
        }
        this.f19877d = obj;
        this.f19878e = (AbstractC2470q) this.f19875b.f19643a.c(obj);
        this.i = null;
        this.f19880h = -1L;
    }

    @Override // u.InterfaceC2461h
    public final boolean b() {
        return this.f19874a.b();
    }

    @Override // u.InterfaceC2461h
    public final Object c(long j5) {
        if (AbstractC2462i.a(this, j5)) {
            return this.f19876c;
        }
        AbstractC2470q g5 = this.f19874a.g(j5, this.f19878e, this.f, this.f19879g);
        int b3 = g5.b();
        for (int i = 0; i < b3; i++) {
            if (Float.isNaN(g5.a(i))) {
                AbstractC2445P.b("AnimationVector cannot contain a NaN. " + g5 + ". Animation: " + this + ", playTimeNanos: " + j5);
            }
        }
        return this.f19875b.f19644b.c(g5);
    }

    @Override // u.InterfaceC2461h
    public final long d() {
        if (this.f19880h < 0) {
            this.f19880h = this.f19874a.m(this.f19878e, this.f, this.f19879g);
        }
        return this.f19880h;
    }

    @Override // u.InterfaceC2461h
    public final A0 e() {
        return this.f19875b;
    }

    @Override // u.InterfaceC2461h
    public final Object f() {
        return this.f19876c;
    }

    @Override // u.InterfaceC2461h
    public final AbstractC2470q g(long j5) {
        if (!AbstractC2462i.a(this, j5)) {
            return this.f19874a.p(j5, this.f19878e, this.f, this.f19879g);
        }
        AbstractC2470q abstractC2470q = this.i;
        if (abstractC2470q != null) {
            return abstractC2470q;
        }
        AbstractC2470q r5 = this.f19874a.r(this.f19878e, this.f, this.f19879g);
        this.i = r5;
        return r5;
    }

    @Override // u.InterfaceC2461h
    public final /* synthetic */ boolean h(long j5) {
        return AbstractC2462i.a(this, j5);
    }

    public final void i(Object obj) {
        if (kotlin.jvm.internal.l.a(this.f19876c, obj)) {
            return;
        }
        this.f19876c = obj;
        this.f = (AbstractC2470q) this.f19875b.f19643a.c(obj);
        this.i = null;
        this.f19880h = -1L;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.f19877d + " -> " + this.f19876c + ",initial velocity: " + this.f19879g + ", duration: " + (d() / 1000000) + " ms,animationSpec: " + this.f19874a;
    }
}
