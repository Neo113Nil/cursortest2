package A0;

import P.C0307n0;
import P.InterfaceC0281a0;
import android.view.Choreographer;
import b4.EnumC0510a;
import java.util.ArrayList;
import p4.C2268h;
import r0.AbstractC2346c;

/* renamed from: A0.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0059t0 implements InterfaceC0281a0 {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f577k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f578l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f579m;

    public C0059t0(Choreographer choreographer, C0055r0 c0055r0) {
        this.f577k = 0;
        this.f578l = choreographer;
        this.f579m = c0055r0;
    }

    private final Object a(i4.c cVar, a4.c cVar2) {
        C0055r0 c0055r0 = (C0055r0) this.f579m;
        if (c0055r0 == null) {
            a4.f l5 = cVar2.getContext().l(a4.d.f6648k);
            c0055r0 = l5 instanceof C0055r0 ? (C0055r0) l5 : null;
        }
        C2268h c2268h = new C2268h(1, AbstractC2346c.v(cVar2));
        c2268h.r();
        ChoreographerFrameCallbackC0057s0 choreographerFrameCallbackC0057s0 = new ChoreographerFrameCallbackC0057s0(c2268h, this, cVar);
        if (c0055r0 == null || !kotlin.jvm.internal.l.a(c0055r0.f556m, (Choreographer) this.f578l)) {
            ((Choreographer) this.f578l).postFrameCallback(choreographerFrameCallbackC0057s0);
            c2268h.t(new C0028g0(5, this, choreographerFrameCallbackC0057s0));
        } else {
            synchronized (c0055r0.f558o) {
                c0055r0.f560q.add(choreographerFrameCallbackC0057s0);
                if (!c0055r0.f563t) {
                    c0055r0.f563t = true;
                    c0055r0.f556m.postFrameCallback(c0055r0.f564u);
                }
            }
            c2268h.t(new C0028g0(4, c0055r0, choreographerFrameCallbackC0057s0));
        }
        return c2268h.q();
    }

    @Override // a4.h
    public final Object A(i4.e eVar, Object obj) {
        switch (this.f577k) {
        }
        return eVar.invoke(obj, this);
    }

    @Override // a4.f
    public final a4.g getKey() {
        switch (this.f577k) {
        }
        return P.Z.f4430l;
    }

    @Override // a4.h
    public final a4.f l(a4.g gVar) {
        switch (this.f577k) {
        }
        return G4.l.y(this, gVar);
    }

    @Override // a4.h
    public final a4.h m(a4.h hVar) {
        switch (this.f577k) {
        }
        return G4.l.H(this, hVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007a, code lost:
    
        if (r8 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    @Override // P.InterfaceC0281a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(i4.c cVar, a4.c cVar2) {
        C0307n0 c0307n0;
        EnumC0510a enumC0510a;
        int i;
        Object q5;
        Object n5;
        switch (this.f577k) {
            case 0:
                return a(cVar, cVar2);
            default:
                if (cVar2 instanceof C0307n0) {
                    c0307n0 = (C0307n0) cVar2;
                    int i5 = c0307n0.f4492n;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        c0307n0.f4492n = i5 - Integer.MIN_VALUE;
                        Object obj = c0307n0.f4490l;
                        enumC0510a = EnumC0510a.f7289k;
                        i = c0307n0.f4492n;
                        if (i != 0) {
                            G4.l.N(obj);
                            P.W w5 = (P.W) this.f579m;
                            c0307n0.f4489k = cVar;
                            c0307n0.f4492n = 1;
                            if (!w5.e()) {
                                C2268h c2268h = new C2268h(1, AbstractC2346c.v(c0307n0));
                                c2268h.r();
                                synchronized (w5.f4412l) {
                                    ((ArrayList) w5.f4413m).add(c2268h);
                                }
                                c2268h.t(new H2.f(1, w5, c2268h));
                                q5 = c2268h.q();
                                if (q5 != enumC0510a) {
                                    q5 = W3.o.f6046a;
                                    break;
                                }
                            } else {
                                q5 = W3.o.f6046a;
                                break;
                            }
                        } else {
                            if (i != 1) {
                                if (i != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                G4.l.N(obj);
                                return obj;
                            }
                            cVar = c0307n0.f4489k;
                            G4.l.N(obj);
                        }
                        InterfaceC0281a0 interfaceC0281a0 = (InterfaceC0281a0) this.f578l;
                        c0307n0.f4489k = null;
                        c0307n0.f4492n = 2;
                        n5 = interfaceC0281a0.n(cVar, c0307n0);
                        if (n5 != enumC0510a) {
                            return n5;
                        }
                        return enumC0510a;
                    }
                }
                c0307n0 = new C0307n0(this, cVar2);
                Object obj2 = c0307n0.f4490l;
                enumC0510a = EnumC0510a.f7289k;
                i = c0307n0.f4492n;
                if (i != 0) {
                }
                InterfaceC0281a0 interfaceC0281a02 = (InterfaceC0281a0) this.f578l;
                c0307n0.f4489k = null;
                c0307n0.f4492n = 2;
                n5 = interfaceC0281a02.n(cVar, c0307n0);
                if (n5 != enumC0510a) {
                }
                return enumC0510a;
        }
    }

    @Override // a4.h
    public final a4.h r(a4.g gVar) {
        switch (this.f577k) {
        }
        return G4.l.F(this, gVar);
    }

    public C0059t0(InterfaceC0281a0 interfaceC0281a0) {
        this.f577k = 1;
        this.f578l = interfaceC0281a0;
        this.f579m = new P.W(0);
    }
}
