package v;

import m4.InterfaceC2105h;
import z0.C2733I;

/* renamed from: v.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2522q extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: m, reason: collision with root package name */
    public static final C2522q f20291m = new C2522q(1, 0);

    /* renamed from: n, reason: collision with root package name */
    public static final C2522q f20292n = new C2522q(1, 1);

    /* renamed from: o, reason: collision with root package name */
    public static final C2522q f20293o = new C2522q(1, 2);

    /* renamed from: p, reason: collision with root package name */
    public static final C2522q f20294p = new C2522q(1, 3);

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f20295l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2522q(int i, int i5) {
        super(i);
        this.f20295l = i5;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        W3.o oVar = W3.o.f6046a;
        switch (this.f20295l) {
            case 0:
                ((C2733I) obj).a();
                return oVar;
            case 1:
                ((Number) obj).longValue();
                return oVar;
            case 2:
                H0.f fVar = H0.f.f2072b;
                InterfaceC2105h[] interfaceC2105hArr = H0.u.f2183a;
                H0.v vVar = H0.s.f2159c;
                InterfaceC2105h interfaceC2105h = H0.u.f2183a[1];
                vVar.a((H0.j) obj, fVar);
                return oVar;
            default:
                return new v0(((Number) obj).intValue());
        }
    }
}
