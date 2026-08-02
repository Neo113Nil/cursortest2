package G0;

import G4.l;
import P.C0305m0;
import W3.o;
import b4.EnumC0510a;
import c4.AbstractC0548i;
import e2.C1930k;
import p4.InterfaceC2280u;

/* loaded from: classes.dex */
public final class a extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f1774k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f1775l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Runnable f1776m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f fVar, Runnable runnable, a4.c cVar) {
        super(2, cVar);
        this.f1775l = fVar;
        this.f1776m = runnable;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new a(this.f1775l, this.f1776m, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f1774k;
        f fVar = this.f1775l;
        o oVar = o.f6046a;
        if (i == 0) {
            l.N(obj);
            i iVar = fVar.f;
            this.f1774k = 1;
            Object b3 = iVar.b(0.0f - iVar.f1806b, this);
            if (b3 != enumC0510a) {
                b3 = oVar;
            }
            if (b3 == enumC0510a) {
                return enumC0510a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l.N(obj);
        }
        C1930k c1930k = fVar.f1798c;
        ((C0305m0) c1930k.f16910l).setValue(Boolean.FALSE);
        this.f1776m.run();
        return oVar;
    }
}
