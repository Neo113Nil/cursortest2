package a1;

import P.AbstractC0329z;
import P.C0315s;
import i4.InterfaceC2015a;

/* loaded from: classes.dex */
public final class k extends kotlin.jvm.internal.m implements i4.e {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ z f6409l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2015a f6410m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0453A f6411n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ X.d f6412o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f6413p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f6414q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(z zVar, InterfaceC2015a interfaceC2015a, C0453A c0453a, X.d dVar, int i, int i5) {
        super(2);
        this.f6409l = zVar;
        this.f6410m = interfaceC2015a;
        this.f6411n = c0453a;
        this.f6412o = dVar;
        this.f6413p = i;
        this.f6414q = i5;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int B5 = AbstractC0329z.B(this.f6413p | 1);
        X.d dVar = this.f6412o;
        InterfaceC2015a interfaceC2015a = this.f6410m;
        l.a(this.f6409l, interfaceC2015a, this.f6411n, dVar, (C0315s) obj, B5, this.f6414q);
        return W3.o.f6046a;
    }
}
