package H6;

import D6.C;
import D6.E;
import G6.x;
import a.AbstractC0603a;
import f6.C1116i;
import i6.InterfaceC1287d;
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class d extends AbstractC1362i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f3427a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3428b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ G6.h f3429c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f3430d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(G6.h hVar, f fVar, InterfaceC1287d interfaceC1287d) {
        super(2, interfaceC1287d);
        this.f3429c = hVar;
        this.f3430d = fVar;
    }

    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(Object obj, InterfaceC1287d interfaceC1287d) {
        d dVar = new d(this.f3429c, this.f3430d, interfaceC1287d);
        dVar.f3428b = obj;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((C) obj, (InterfaceC1287d) obj2)).invokeSuspend(C1116i.f13008a);
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        j6.a aVar = j6.a.f14642a;
        int i7 = this.f3427a;
        C1116i c1116i = C1116i.f13008a;
        if (i7 == 0) {
            AbstractC0603a.p0(obj);
            C c3 = (C) this.f3428b;
            f fVar = this.f3430d;
            int i8 = fVar.f3435b;
            if (i8 == -3) {
                i8 = -2;
            }
            Function2 eVar = new e(fVar, null);
            F6.o oVar = new F6.o(E.q(c3, fVar.f3434a), F6.i.a(i8, fVar.f3436c, 4));
            oVar.Q(3, oVar, eVar);
            this.f3427a = 1;
            Object b7 = x.b(this.f3429c, oVar, true, this);
            if (b7 != aVar) {
                b7 = c1116i;
            }
            if (b7 == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0603a.p0(obj);
        }
        return c1116i;
    }
}
