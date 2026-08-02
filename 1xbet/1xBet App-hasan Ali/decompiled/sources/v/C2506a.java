package v;

import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.InterfaceC2280u;
import y.C2651g;
import y.C2654j;

/* renamed from: v.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2506a extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f20190k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C2654j f20191l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C2651g f20192m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2506a(C2654j c2654j, C2651g c2651g, a4.c cVar) {
        super(2, cVar);
        this.f20191l = c2654j;
        this.f20192m = c2651g;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new C2506a(this.f20191l, this.f20192m, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2506a) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f20190k;
        if (i == 0) {
            G4.l.N(obj);
            this.f20190k = 1;
            if (this.f20191l.a(this.f20192m, this) == enumC0510a) {
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
