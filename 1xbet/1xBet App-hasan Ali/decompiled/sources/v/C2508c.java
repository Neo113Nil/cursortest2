package v;

import android.view.ViewGroup;
import android.view.ViewParent;
import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.InterfaceC2280u;
import w0.AbstractC2540a;
import x.C2568a;
import y.C2654j;
import z0.A0;
import z0.AbstractC2749f;
import z0.AbstractC2756m;
import z0.C2731G;

/* renamed from: v.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2508c extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public y.l f20209k;

    /* renamed from: l, reason: collision with root package name */
    public int f20210l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C2503A f20211m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f20212n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C2654j f20213o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2508c(C2503A c2503a, long j5, C2654j c2654j, a4.c cVar) {
        super(2, cVar);
        this.f20211m = c2503a;
        this.f20212n = j5;
        this.f20213o = c2654j;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new C2508c(this.f20211m, this.f20212n, this.f20213o, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2508c) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x010d, code lost:
    
        if (r16.f20213o.a(r1, r16) == r2) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x010f, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00f9, code lost:
    
        if (p4.AbstractC2282w.f(r6, r16) == r2) goto L83;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f1  */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14, types: [b0.o] */
    /* JADX WARN: Type inference failed for: r10v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [b0.o] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [R.e] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [R.e] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    @Override // c4.AbstractC0540a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z3;
        boolean z5;
        z0.c0 c0Var;
        boolean z6;
        y.l lVar;
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f20210l;
        C2503A c2503a = this.f20211m;
        if (i == 0) {
            G4.l.N(obj);
            C2568a c2568a = x.V.f20727z;
            if (!c2503a.f7162k.f7175x) {
                AbstractC2540a.b("visitAncestors called on an unattached node");
            }
            b0.o oVar = c2503a.f7162k.f7166o;
            C2731G v4 = AbstractC2749f.v(c2503a);
            boolean z7 = false;
            loop0: while (v4 != null) {
                if ((v4.f21612O.f.f7165n & 262144) != 0) {
                    while (oVar != null) {
                        if ((oVar.f7164m & 262144) != 0) {
                            AbstractC2756m abstractC2756m = oVar;
                            ?? r13 = 0;
                            while (abstractC2756m != 0) {
                                if (abstractC2756m instanceof A0) {
                                    A0 a02 = (A0) abstractC2756m;
                                    if (c2568a.equals(a02.o())) {
                                        z7 = z7 || ((x.V) a02).f20728y;
                                        z6 = !z7;
                                    } else {
                                        z6 = true;
                                    }
                                    if (!z6) {
                                        break loop0;
                                    }
                                } else if ((abstractC2756m.f7164m & 262144) != 0 && (abstractC2756m instanceof AbstractC2756m)) {
                                    b0.o oVar2 = abstractC2756m.f21839z;
                                    int i5 = 0;
                                    abstractC2756m = abstractC2756m;
                                    r13 = r13;
                                    while (oVar2 != null) {
                                        if ((oVar2.f7164m & 262144) != 0) {
                                            i5++;
                                            r13 = r13;
                                            if (i5 == 1) {
                                                abstractC2756m = oVar2;
                                            } else {
                                                if (r13 == 0) {
                                                    r13 = new R.e(new b0.o[16]);
                                                }
                                                if (abstractC2756m != 0) {
                                                    r13.c(abstractC2756m);
                                                    abstractC2756m = 0;
                                                }
                                                r13.c(oVar2);
                                            }
                                        }
                                        oVar2 = oVar2.f7167p;
                                        abstractC2756m = abstractC2756m;
                                        r13 = r13;
                                    }
                                    if (i5 == 1) {
                                    }
                                }
                                abstractC2756m = AbstractC2749f.f(r13);
                            }
                        }
                        oVar = oVar.f7166o;
                    }
                }
                v4 = v4.u();
                oVar = (v4 == null || (c0Var = v4.f21612O) == null) ? null : c0Var.f21770e;
            }
            if (!z7) {
                int i6 = AbstractC2504B.f20137b;
                ViewParent parent = AbstractC2749f.x(c2503a).getParent();
                while (parent != null && (parent instanceof ViewGroup)) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    if (viewGroup.shouldDelayChildPressedState()) {
                        z5 = true;
                        break;
                    }
                    parent = viewGroup.getParent();
                }
                z5 = false;
                if (!z5) {
                    z3 = false;
                    if (z3) {
                        long j5 = AbstractC2504B.f20136a;
                        this.f20210l = 1;
                    }
                }
            }
            z3 = true;
            if (z3) {
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lVar = this.f20209k;
                G4.l.N(obj);
                c2503a.K = lVar;
                return W3.o.f6046a;
            }
            G4.l.N(obj);
        }
        lVar = new y.l(this.f20212n);
        this.f20209k = lVar;
        this.f20210l = 2;
    }
}
