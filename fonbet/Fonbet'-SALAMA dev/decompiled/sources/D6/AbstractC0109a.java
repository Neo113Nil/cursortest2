package D6;

import a.AbstractC0603a;
import f6.C1113f;
import f6.C1116i;
import i6.InterfaceC1287d;
import i6.InterfaceC1292i;
import kotlin.jvm.functions.Function2;
import n3.AbstractC1464a;

/* renamed from: D6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0109a extends s0 implements InterfaceC1287d, C {

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1292i f1816c;

    public AbstractC0109a(InterfaceC1292i interfaceC1292i, boolean z4) {
        super(z4);
        A((InterfaceC0118e0) interfaceC1292i.get(B.f1775b));
        this.f1816c = interfaceC1292i.plus(this);
    }

    @Override // D6.s0
    public final void H(Object obj) {
        if (!(obj instanceof C0138v)) {
            P(obj);
            return;
        }
        C0138v c0138v = (C0138v) obj;
        O(C0138v.f1881b.get(c0138v) != 0, c0138v.f1882a);
    }

    public final void Q(int i7, AbstractC0109a abstractC0109a, Function2 function2) {
        int e7 = t.e.e(i7);
        if (e7 == 0) {
            AbstractC1464a.T(function2, abstractC0109a, this);
            return;
        }
        if (e7 != 1) {
            if (e7 == 2) {
                t6.h.e(function2, "<this>");
                P6.b.v(P6.b.i(abstractC0109a, this, function2)).resumeWith(C1116i.f13008a);
                return;
            }
            if (e7 != 3) {
                throw new A1.W();
            }
            try {
                InterfaceC1292i interfaceC1292i = this.f1816c;
                Object m7 = I6.a.m(interfaceC1292i, null);
                try {
                    t6.s.a(2, function2);
                    Object invoke = function2.invoke(abstractC0109a, this);
                    if (invoke != j6.a.f14642a) {
                        resumeWith(invoke);
                    }
                } finally {
                    I6.a.g(interfaceC1292i, m7);
                }
            } catch (Throwable th) {
                resumeWith(AbstractC0603a.h(th));
            }
        }
    }

    @Override // D6.C
    public final InterfaceC1292i c() {
        return this.f1816c;
    }

    @Override // i6.InterfaceC1287d
    public final InterfaceC1292i getContext() {
        return this.f1816c;
    }

    @Override // D6.s0
    public final String n() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // i6.InterfaceC1287d
    public final void resumeWith(Object obj) {
        Throwable a2 = C1113f.a(obj);
        if (a2 != null) {
            obj = new C0138v(false, a2);
        }
        Object D7 = D(obj);
        if (D7 == E.f1782e) {
            return;
        }
        i(D7);
    }

    @Override // D6.s0
    public final void z(A1.W w7) {
        E.k(this.f1816c, w7);
    }

    public void P(Object obj) {
    }

    public void O(boolean z4, Throwable th) {
    }
}
