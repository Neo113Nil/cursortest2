package H4;

import D4.InterfaceC0022w;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import t4.InterfaceC1445p;

/* loaded from: classes.dex */
public final class m extends m4.h implements InterfaceC1445p {

    /* renamed from: a, reason: collision with root package name */
    public int f1192a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f1193b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f1194c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ G4.e f1195d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, G4.e eVar, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.f1194c = nVar;
        this.f1195d = eVar;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        m mVar = new m(this.f1194c, this.f1195d, interfaceC1218d);
        mVar.f1193b = obj;
        return mVar;
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((InterfaceC0022w) obj, (InterfaceC1218d) obj2)).invokeSuspend(f4.v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.f1192a;
        if (i2 == 0) {
            e5.g.y(obj);
            InterfaceC0022w interfaceC0022w = (InterfaceC0022w) this.f1193b;
            kotlin.jvm.internal.s sVar = new kotlin.jvm.internal.s();
            n nVar = this.f1194c;
            G4.d dVar = nVar.f1178d;
            l lVar = new l(sVar, interfaceC0022w, nVar, this.f1195d);
            this.f1192a = 1;
            if (dVar.i(lVar, this) == enumC1260a) {
                return enumC1260a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e5.g.y(obj);
        }
        return f4.v.f5689a;
    }
}
