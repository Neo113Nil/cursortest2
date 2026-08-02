package y;

import I.E;
import P.InterfaceC0289e0;
import W3.o;
import b4.EnumC0510a;
import c4.AbstractC0548i;
import java.util.ArrayList;
import p4.InterfaceC2280u;
import s4.B;

/* renamed from: y.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2650f extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f21119k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C2654j f21120l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0289e0 f21121m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2650f(C2654j c2654j, InterfaceC0289e0 interfaceC0289e0, a4.c cVar) {
        super(2, cVar);
        this.f21120l = c2654j;
        this.f21121m = interfaceC0289e0;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new C2650f(this.f21120l, this.f21121m, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2650f) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f21119k;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            G4.l.N(obj);
            return o.f6046a;
        }
        G4.l.N(obj);
        ArrayList arrayList = new ArrayList();
        B b3 = this.f21120l.f21123a;
        E e3 = new E(4, arrayList, this.f21121m);
        this.f21119k = 1;
        b3.getClass();
        B.k(b3, e3, this);
        return enumC0510a;
    }
}
