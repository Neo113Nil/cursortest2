package z0;

import java.util.Map;

/* renamed from: z0.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2738N implements x0.P {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21673a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21674b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f21675c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i0.K f21676d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i4.c f21677e;
    public final /* synthetic */ AbstractC2739O f;

    public C2738N(int i, int i5, Map map, i0.K k5, i4.c cVar, AbstractC2739O abstractC2739O) {
        this.f21673a = i;
        this.f21674b = i5;
        this.f21675c = map;
        this.f21676d = k5;
        this.f21677e = cVar;
        this.f = abstractC2739O;
    }

    @Override // x0.P
    public final Map a() {
        return this.f21675c;
    }

    @Override // x0.P
    public final void b() {
        this.f21677e.c(this.f.f21684v);
    }

    @Override // x0.P
    public final int c() {
        return this.f21674b;
    }

    @Override // x0.P
    public final i4.c d() {
        return this.f21676d;
    }

    @Override // x0.P
    public final int getWidth() {
        return this.f21673a;
    }
}
