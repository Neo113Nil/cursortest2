package O4;

import b4.EnumC0510a;
import y4.InterfaceC2676d;

/* loaded from: classes.dex */
public final class r extends AbstractC0272s {

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0261g f4224d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4225e;

    public r(Q q5, InterfaceC2676d interfaceC2676d, InterfaceC0267m interfaceC0267m, InterfaceC0261g interfaceC0261g, boolean z3) {
        super(q5, interfaceC2676d, interfaceC0267m);
        this.f4224d = interfaceC0261g;
        this.f4225e = z3;
    }

    @Override // O4.AbstractC0272s
    public final Object a(A a5, Object[] objArr) {
        InterfaceC0259e interfaceC0259e = (InterfaceC0259e) this.f4224d.o(a5);
        a4.c cVar = (a4.c) objArr[objArr.length - 1];
        try {
            if (!this.f4225e) {
                return Z.b(interfaceC0259e, cVar);
            }
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type retrofit2.Call<kotlin.Unit?>", interfaceC0259e);
            return Z.c(interfaceC0259e, cVar);
        } catch (LinkageError e3) {
            throw e3;
        } catch (ThreadDeath e5) {
            throw e5;
        } catch (VirtualMachineError e6) {
            throw e6;
        } catch (Throwable th) {
            Z.r(th, cVar);
            return EnumC0510a.f7289k;
        }
    }
}
