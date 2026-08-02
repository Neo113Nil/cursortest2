package x;

import E.C0110o;
import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.InterfaceC2280u;

/* loaded from: classes.dex */
public final class O0 extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f20690k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f20691l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ t0.v f20692m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i4.f f20693n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0110o f20694o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0(t0.v vVar, i4.f fVar, C0110o c0110o, a4.c cVar) {
        super(2, cVar);
        this.f20692m = vVar;
        this.f20693n = fVar;
        this.f20694o = c0110o;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        O0 o02 = new O0(this.f20692m, this.f20693n, this.f20694o, cVar);
        o02.f20691l = obj;
        return o02;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((O0) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f20690k;
        if (i == 0) {
            G4.l.N(obj);
            InterfaceC2280u interfaceC2280u = (InterfaceC2280u) this.f20691l;
            t0.v vVar = this.f20692m;
            T t5 = new T(vVar);
            N0 n02 = new N0(interfaceC2280u, this.f20693n, this.f20694o, t5, null);
            this.f20690k = 1;
            if (v.r.b(vVar, n02, this) == enumC0510a) {
                return enumC0510a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            G4.l.N(obj);
        }
        return W3.o.f6046a;
    }
}
