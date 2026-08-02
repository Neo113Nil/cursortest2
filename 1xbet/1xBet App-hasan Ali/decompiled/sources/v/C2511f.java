package v;

import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.InterfaceC2280u;
import y.C2654j;

/* renamed from: v.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2511f extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f20230k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C2503A f20231l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ y.l f20232m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2511f(C2503A c2503a, y.l lVar, a4.c cVar) {
        super(2, cVar);
        this.f20231l = c2503a;
        this.f20232m = lVar;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new C2511f(this.f20231l, this.f20232m, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2511f) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f20230k;
        if (i == 0) {
            G4.l.N(obj);
            C2654j c2654j = this.f20231l.f20121A;
            if (c2654j != null) {
                y.m mVar = new y.m(this.f20232m);
                this.f20230k = 1;
                if (c2654j.a(mVar, this) == enumC0510a) {
                    return enumC0510a;
                }
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
