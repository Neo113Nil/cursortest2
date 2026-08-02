package A0;

import P.AbstractC0329z;
import android.view.View;
import androidx.lifecycle.InterfaceC0491u;
import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.AbstractC2282w;
import p4.C2285z;
import p4.InterfaceC2280u;

/* loaded from: classes.dex */
public final class C1 extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f161k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f162l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.w f163m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ P.F0 f164n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0491u f165o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ D1 f166p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ View f167q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1(kotlin.jvm.internal.w wVar, P.F0 f02, InterfaceC0491u interfaceC0491u, D1 d12, View view, a4.c cVar) {
        super(2, cVar);
        this.f163m = wVar;
        this.f164n = f02;
        this.f165o = interfaceC0491u;
        this.f166p = d12;
        this.f167q = view;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        C1 c12 = new C1(this.f163m, this.f164n, this.f165o, this.f166p, this.f167q, cVar);
        c12.f162l = obj;
        return c12;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009e  */
    @Override // c4.AbstractC0540a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        p4.U u5;
        C2285z c2285z;
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f161k;
        InterfaceC0491u interfaceC0491u = this.f165o;
        W3.o oVar = W3.o.f6046a;
        D1 d12 = this.f166p;
        if (i == 0) {
            G4.l.N(obj);
            InterfaceC2280u interfaceC2280u = (InterfaceC2280u) this.f162l;
            try {
                C0017c1 c0017c1 = (C0017c1) this.f163m.f17624k;
                if (c0017c1 != null) {
                    s4.K a5 = G1.a(this.f167q.getContext().getApplicationContext());
                    c0017c1.f478k.i(((Number) a5.getValue()).floatValue());
                    c2285z = AbstractC2282w.p(interfaceC2280u, null, new B1(a5, c0017c1, null), 3);
                } else {
                    c2285z = null;
                }
                try {
                    P.F0 f02 = this.f164n;
                    this.f162l = c2285z;
                    this.f161k = 1;
                    Object w5 = AbstractC2282w.w(f02.f4290a, new P.C0(f02, new P.E0(f02, null), AbstractC0329z.q(getContext()), null), this);
                    if (w5 != enumC0510a) {
                        w5 = oVar;
                    }
                    if (w5 != enumC0510a) {
                        w5 = oVar;
                    }
                    if (w5 == enumC0510a) {
                        return enumC0510a;
                    }
                    u5 = c2285z;
                } catch (Throwable th) {
                    u5 = c2285z;
                    th = th;
                    if (u5 != null) {
                    }
                    interfaceC0491u.g().k(d12);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                u5 = null;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u5 = (p4.U) this.f162l;
            try {
                G4.l.N(obj);
            } catch (Throwable th3) {
                th = th3;
                if (u5 != null) {
                    u5.d(null);
                }
                interfaceC0491u.g().k(d12);
                throw th;
            }
        }
        if (u5 != null) {
            u5.d(null);
        }
        interfaceC0491u.g().k(d12);
        return oVar;
    }
}
