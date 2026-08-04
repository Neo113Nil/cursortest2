package D6;

import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: D6.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0109a extends s0 implements p065i6.d, C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p065i6.i f1816c;

    public AbstractC0109a(p065i6.i iVar, boolean z4) {
        super(z4);
        A((InterfaceC0118e0) iVar.get(B.f1775b));
        this.f1816c = iVar.plus(this);
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
        int iE = p136t.e.e(i7);
        if (iE == 0) {
            p097n3.a.T(function2, abstractC0109a, this);
            return;
        }
        if (iE != 1) {
            if (iE == 2) {
                t6.h.e(function2, "<this>");
                P6.b.v(P6.b.i(abstractC0109a, this, function2)).resumeWith(p044f6.i.f13014a);
                return;
            }
            if (iE != 3) {
                throw new A1.W();
            }
            try {
                p065i6.i iVar = this.f1816c;
                Object objM = I6.a.m(iVar, null);
                try {
                    t6.s.a(2, function2);
                    Object objInvoke = function2.invoke(abstractC0109a, this);
                    I6.a.g(iVar, objM);
                    if (objInvoke != j6.a.f14648a) {
                        resumeWith(objInvoke);
                    }
                } catch (Throwable th) {
                    I6.a.g(iVar, objM);
                    throw th;
                }
            } catch (Throwable th2) {
                resumeWith(p003a.a.h(th2));
            }
        }
    }

    @Override // D6.C
    public final p065i6.i c() {
        return this.f1816c;
    }

    @Override // p065i6.d
    public final p065i6.i getContext() {
        return this.f1816c;
    }

    @Override // D6.s0
    public final String n() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // p065i6.d
    public final void resumeWith(Object obj) {
        Throwable thA = p044f6.f.a(obj);
        if (thA != null) {
            obj = new C0138v(false, thA);
        }
        Object objD = D(obj);
        if (objD == E.f1782e) {
            return;
        }
        i(objD);
    }

    @Override // D6.s0
    public final void z(A1.W w7) throws IllegalAccessException, InvocationTargetException {
        E.k(this.f1816c, w7);
    }

    public void P(Object obj) {
    }

    public void O(boolean z4, Throwable th) {
    }
}
