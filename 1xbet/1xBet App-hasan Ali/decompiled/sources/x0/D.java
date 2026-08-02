package x0;

import java.util.Map;

/* loaded from: classes.dex */
public final class D implements P {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20919a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20920b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f20921c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i0.K f20922d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ E f20923e;
    public final /* synthetic */ K f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i4.c f20924g;

    public D(int i, int i5, Map map, i0.K k5, E e3, K k6, i4.c cVar) {
        this.f20919a = i;
        this.f20920b = i5;
        this.f20921c = map;
        this.f20922d = k5;
        this.f20923e = e3;
        this.f = k6;
        this.f20924g = cVar;
    }

    @Override // x0.P
    public final Map a() {
        return this.f20921c;
    }

    @Override // x0.P
    public final void b() {
        z0.r rVar;
        boolean t5 = this.f20923e.t();
        i4.c cVar = this.f20924g;
        K k5 = this.f;
        if (!t5 || (rVar = k5.f20941k.f21612O.f21768c.f21857Z) == null) {
            cVar.c(k5.f20941k.f21612O.f21768c.f21684v);
        } else {
            cVar.c(rVar.f21684v);
        }
    }

    @Override // x0.P
    public final int c() {
        return this.f20920b;
    }

    @Override // x0.P
    public final i4.c d() {
        return this.f20922d;
    }

    @Override // x0.P
    public final int getWidth() {
        return this.f20919a;
    }
}
