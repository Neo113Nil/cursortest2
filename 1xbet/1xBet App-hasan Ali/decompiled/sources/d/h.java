package d;

import W3.o;
import b4.EnumC0510a;
import c4.AbstractC0548i;
import kotlin.jvm.internal.s;
import p4.InterfaceC2280u;
import s4.C2365b;
import s4.C2373j;

/* loaded from: classes.dex */
public final class h extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public s f16814k;

    /* renamed from: l, reason: collision with root package name */
    public int f16815l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i f16816m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, a4.c cVar) {
        super(2, cVar);
        this.f16816m = iVar;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new h(this.f16816m, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        s sVar;
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f16815l;
        boolean z3 = true;
        if (i == 0) {
            G4.l.N(obj);
            i iVar = this.f16816m;
            if (iVar.f()) {
                s sVar2 = new s();
                i4.e eVar = iVar.f16818d;
                r4.c cVar = iVar.f16819e;
                kotlin.jvm.internal.l.c(cVar);
                C2373j c2373j = new C2373j(new C2365b(cVar, z3), new g(sVar2, null));
                this.f16814k = sVar2;
                this.f16815l = 1;
                if (eVar.invoke(c2373j, this) == enumC0510a) {
                    return enumC0510a;
                }
                sVar = sVar2;
            }
            return o.f6046a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        sVar = this.f16814k;
        G4.l.N(obj);
        if (!sVar.f17620k) {
            throw new IllegalStateException("You must collect the progress flow");
        }
        return o.f6046a;
    }
}
