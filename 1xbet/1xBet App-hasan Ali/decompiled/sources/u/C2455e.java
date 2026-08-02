package u;

import P.InterfaceC0289e0;
import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.InterfaceC2280u;

/* renamed from: u.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2455e extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f19797k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f19798l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C2451c f19799m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0289e0 f19800n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0289e0 f19801o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2455e(Object obj, C2451c c2451c, InterfaceC0289e0 interfaceC0289e0, InterfaceC0289e0 interfaceC0289e02, a4.c cVar) {
        super(2, cVar);
        this.f19798l = obj;
        this.f19799m = c2451c;
        this.f19800n = interfaceC0289e0;
        this.f19801o = interfaceC0289e02;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new C2455e(this.f19798l, this.f19799m, this.f19800n, this.f19801o, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2455e) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        C2455e c2455e;
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f19797k;
        C2451c c2451c = this.f19799m;
        if (i == 0) {
            G4.l.N(obj);
            if (kotlin.jvm.internal.l.a(this.f19798l, c2451c.f19764e.getValue())) {
                return W3.o.f6046a;
            }
            int i5 = AbstractC2459g.f19814a;
            InterfaceC2464k interfaceC2464k = (InterfaceC2464k) this.f19800n.getValue();
            this.f19797k = 1;
            c2455e = this;
            if (C2451c.c(this.f19799m, this.f19798l, interfaceC2464k, null, c2455e, 12) == enumC0510a) {
                return enumC0510a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            G4.l.N(obj);
            c2455e = this;
        }
        int i6 = AbstractC2459g.f19814a;
        i4.c cVar = (i4.c) c2455e.f19801o.getValue();
        if (cVar != null) {
            cVar.c(c2451c.d());
        }
        return W3.o.f6046a;
    }
}
