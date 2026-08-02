package w;

import A0.C0028g0;
import P.AbstractC0329z;
import P.C0315s;
import i4.InterfaceC2015a;
import v.w0;

/* renamed from: w.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2538a extends kotlin.jvm.internal.m implements i4.e {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ m f20441l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2015a f20442m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0028g0 f20443n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ b0.m f20444o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f20445p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ X.d f20446q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f20447r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2538a(m mVar, InterfaceC2015a interfaceC2015a, C0028g0 c0028g0, b0.m mVar2, boolean z3, X.d dVar, int i) {
        super(2);
        this.f20441l = mVar;
        this.f20442m = interfaceC2015a;
        this.f20443n = c0028g0;
        this.f20444o = mVar2;
        this.f20445p = z3;
        this.f20446q = dVar;
        this.f20447r = i;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int B5 = AbstractC0329z.B(this.f20447r | 1);
        X.d dVar = this.f20446q;
        C0028g0 c0028g0 = this.f20443n;
        b0.m mVar = this.f20444o;
        w0.b(this.f20441l, this.f20442m, c0028g0, mVar, this.f20445p, dVar, (C0315s) obj, B5);
        return W3.o.f6046a;
    }
}
