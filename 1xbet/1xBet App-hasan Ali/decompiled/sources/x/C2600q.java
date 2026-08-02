package x;

import P.AbstractC0329z;
import P.C0305m0;
import b4.EnumC0510a;
import c4.AbstractC0542c;
import p4.AbstractC2282w;

/* renamed from: x.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2600q implements InterfaceC2591l0 {

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.internal.m f20848a;

    /* renamed from: b, reason: collision with root package name */
    public final C2598p f20849b = new C2598p(this);

    /* renamed from: c, reason: collision with root package name */
    public final v.g0 f20850c = new v.g0();

    /* renamed from: d, reason: collision with root package name */
    public final C0305m0 f20851d;

    /* renamed from: e, reason: collision with root package name */
    public final C0305m0 f20852e;
    public final C0305m0 f;

    /* JADX WARN: Multi-variable type inference failed */
    public C2600q(i4.c cVar) {
        this.f20848a = (kotlin.jvm.internal.m) cVar;
        Boolean bool = Boolean.FALSE;
        this.f20851d = AbstractC0329z.t(bool);
        this.f20852e = AbstractC0329z.t(bool);
        this.f = AbstractC0329z.t(bool);
    }

    @Override // x.InterfaceC2591l0
    public final /* synthetic */ boolean a() {
        return true;
    }

    @Override // x.InterfaceC2591l0
    public final boolean b() {
        return ((Boolean) this.f20851d.getValue()).booleanValue();
    }

    @Override // x.InterfaceC2591l0
    public final /* synthetic */ boolean c() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [i4.c, kotlin.jvm.internal.m] */
    @Override // x.InterfaceC2591l0
    public final float d(float f) {
        return ((Number) this.f20848a.c(Float.valueOf(f))).floatValue();
    }

    @Override // x.InterfaceC2591l0
    public final Object e(v.d0 d0Var, i4.e eVar, AbstractC0542c abstractC0542c) {
        Object e3 = AbstractC2282w.e(new C2596o(this, d0Var, eVar, null), abstractC0542c);
        return e3 == EnumC0510a.f7289k ? e3 : W3.o.f6046a;
    }
}
