package x;

import E.C0091c;
import P.AbstractC0329z;
import b4.EnumC0510a;
import c4.AbstractC0542c;
import i4.InterfaceC2015a;
import u.C2466m;
import u.InterfaceC2464k;

/* loaded from: classes.dex */
public final class S0 {
    public static final C2466m f = new C2466m(0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final u.C0 f20718a;

    /* renamed from: b, reason: collision with root package name */
    public long f20719b = Long.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public C2466m f20720c = f;

    /* renamed from: d, reason: collision with root package name */
    public boolean f20721d;

    /* renamed from: e, reason: collision with root package name */
    public float f20722e;

    public S0(InterfaceC2464k interfaceC2464k) {
        this.f20718a = interfaceC2464k.a(u.B0.f19645a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b1, code lost:
    
        if (r13 != 0.0f) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00db, code lost:
    
        if (P.AbstractC0329z.q(r2.getContext()).n(r0, r2) == r1) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r14v0, types: [A.n] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v2, types: [x.S0] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r2v7, types: [i4.c] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00a9 -> B:24:0x00ac). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(A.s sVar, A.n nVar, AbstractC0542c abstractC0542c) {
        R0 r02;
        int i;
        R0 r03;
        InterfaceC2015a interfaceC2015a;
        A.s sVar2;
        float f5;
        S0 s02;
        InterfaceC2015a interfaceC2015a2;
        S0 s03;
        try {
            if (abstractC0542c instanceof R0) {
                r02 = (R0) abstractC0542c;
                int i5 = r02.f20713q;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    r02.f20713q = i5 - Integer.MIN_VALUE;
                    Object obj = r02.f20711o;
                    EnumC0510a enumC0510a = EnumC0510a.f7289k;
                    i = r02.f20713q;
                    C2466m c2466m = f;
                    if (i != 0) {
                        G4.l.N(obj);
                        if (this.f20721d) {
                            throw new IllegalStateException("animateToZero called while previous animation is running");
                        }
                        b0.r rVar = (b0.r) r02.getContext().l(b0.c.f7150x);
                        float v4 = rVar != null ? rVar.v() : 1.0f;
                        this.f20721d = true;
                        r03 = r02;
                        interfaceC2015a = nVar;
                        sVar2 = sVar;
                        f5 = v4;
                        s02 = this;
                        if (Math.abs(s02.f20722e) >= 0.01f) {
                            C0091c c0091c = new C0091c(s02, f5, sVar2);
                            r03.f20707k = s02;
                            r03.f20708l = sVar2;
                            r03.f20709m = interfaceC2015a;
                            r03.f20710n = f5;
                            r03.f20713q = 1;
                            if (AbstractC0329z.q(r03.getContext()).n(c0091c, r03) == enumC0510a) {
                                return enumC0510a;
                            }
                            interfaceC2015a.invoke();
                        }
                        S0 s04 = s02;
                        A.s sVar3 = sVar2;
                        S0 s05 = s04;
                        interfaceC2015a2 = interfaceC2015a;
                        if (Math.abs(s05.f20722e) == 0.0f) {
                            s03 = s05;
                            s03.f20719b = Long.MIN_VALUE;
                            s03.f20720c = c2466m;
                            s03.f20721d = false;
                            return W3.o.f6046a;
                        }
                        i0.K k5 = new i0.K(15, s05, sVar3);
                        r03.f20707k = s05;
                        r03.f20708l = interfaceC2015a2;
                        r03.f20709m = null;
                        r03.f20713q = 2;
                        nVar = s05;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            interfaceC2015a2 = (InterfaceC2015a) r02.f20708l;
                            S0 s06 = r02.f20707k;
                            G4.l.N(obj);
                            nVar = s06;
                            interfaceC2015a2.invoke();
                            s03 = nVar;
                            s03.f20719b = Long.MIN_VALUE;
                            s03.f20720c = c2466m;
                            s03.f20721d = false;
                            return W3.o.f6046a;
                        }
                        f5 = r02.f20710n;
                        InterfaceC2015a interfaceC2015a3 = r02.f20709m;
                        ?? r22 = (i4.c) r02.f20708l;
                        S0 s07 = r02.f20707k;
                        try {
                            G4.l.N(obj);
                            R0 r04 = r02;
                            interfaceC2015a = interfaceC2015a3;
                            sVar2 = r22;
                            r03 = r04;
                            s02 = s07;
                        } catch (Throwable th) {
                            th = th;
                            nVar = s07;
                            nVar.f20719b = Long.MIN_VALUE;
                            nVar.f20720c = c2466m;
                            nVar.f20721d = false;
                            throw th;
                        }
                        try {
                            interfaceC2015a.invoke();
                        } catch (Throwable th2) {
                            th = th2;
                            nVar = s02;
                            nVar.f20719b = Long.MIN_VALUE;
                            nVar.f20720c = c2466m;
                            nVar.f20721d = false;
                            throw th;
                        }
                    }
                }
            }
            if (i != 0) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
        r02 = new R0(this, abstractC0542c);
        Object obj2 = r02.f20711o;
        EnumC0510a enumC0510a2 = EnumC0510a.f7289k;
        i = r02.f20713q;
        C2466m c2466m2 = f;
    }
}
