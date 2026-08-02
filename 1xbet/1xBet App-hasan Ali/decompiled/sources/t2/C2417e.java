package t2;

import G4.l;
import W3.o;
import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.InterfaceC2280u;

/* renamed from: t2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2417e extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f19546k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C2421i f19547l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ E2.i f19548m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2417e(C2421i c2421i, E2.i iVar, a4.c cVar) {
        super(2, cVar);
        this.f19547l = c2421i;
        this.f19548m = iVar;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new C2417e(this.f19547l, this.f19548m, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2417e) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f19546k;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l.N(obj);
            return obj;
        }
        l.N(obj);
        this.f19546k = 1;
        Object a5 = C2421i.a(this.f19547l, this.f19548m, 1, this);
        return a5 == enumC0510a ? enumC0510a : a5;
    }
}
