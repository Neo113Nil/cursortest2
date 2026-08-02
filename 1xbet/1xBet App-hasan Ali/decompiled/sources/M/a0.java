package M;

import k0.C2028h;
import k0.InterfaceC2025e;
import u.C2435F;

/* loaded from: classes.dex */
public final class a0 extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f3283l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C2028h f3284m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C2435F f3285n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C2435F f3286o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C2435F f3287p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C2435F f3288q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ float f3289r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f3290s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(long j5, C2028h c2028h, C2435F c2435f, C2435F c2435f2, C2435F c2435f3, C2435F c2435f4, float f, long j6) {
        super(1);
        this.f3283l = j5;
        this.f3284m = c2028h;
        this.f3285n = c2435f;
        this.f3286o = c2435f2;
        this.f3287p = c2435f3;
        this.f3288q = c2435f4;
        this.f3289r = f;
        this.f3290s = j6;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        float f;
        InterfaceC2025e interfaceC2025e = (InterfaceC2025e) obj;
        C2028h c2028h = this.f3284m;
        e0.d(interfaceC2025e, 0.0f, 360.0f, this.f3283l, c2028h);
        float floatValue = (((Number) this.f3285n.f19664n.getValue()).floatValue() * 216.0f) % 360.0f;
        float floatValue2 = ((Number) this.f3286o.f19664n.getValue()).floatValue();
        C2435F c2435f = this.f3287p;
        float abs = Math.abs(floatValue2 - ((Number) c2435f.f19664n.getValue()).floatValue());
        float floatValue3 = ((Number) c2435f.f19664n.getValue()).floatValue() + ((Number) this.f3288q.f19664n.getValue()).floatValue() + (floatValue - 90.0f);
        if (c2028h.f17550d == 0) {
            f = 0.0f;
        } else {
            f = ((this.f3289r / (e0.f3322e / 2)) * 57.29578f) / 2.0f;
        }
        e0.d(interfaceC2025e, floatValue3 + f, Math.max(abs, 0.1f), this.f3290s, c2028h);
        return W3.o.f6046a;
    }
}
