package K;

import d2.C0279i;
import g2.InterfaceC0319c;
import h2.EnumC0326a;

/* renamed from: K.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0057z implements z2.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f914a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f915b;

    public /* synthetic */ C0057z(int i3, Object obj) {
        this.f914a = i3;
        this.f915b = obj;
    }

    @Override // z2.e
    public final Object a(Object obj, InterfaceC0319c interfaceC0319c) {
        Object e3;
        switch (this.f914a) {
            case 0:
                O o3 = (O) this.f915b;
                boolean z3 = o3.f786h.u() instanceof a0;
                C0279i c0279i = C0279i.f4852a;
                return (z3 || (e3 = O.e(o3, true, interfaceC0319c)) != EnumC0326a.f4994a) ? c0279i : e3;
            case 1:
                ((I1.n) this.f915b).accept(obj);
                return C0279i.f4852a;
            default:
                ((kotlin.jvm.internal.q) this.f915b).f9672a = obj;
                throw new A2.a(this);
        }
    }
}
