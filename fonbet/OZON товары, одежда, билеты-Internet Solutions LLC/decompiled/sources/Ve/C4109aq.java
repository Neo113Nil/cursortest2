package Ve;

import Ae.C2406m0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.aq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4109aq extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f30688d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f30689e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4699va f30690f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4109aq(C2406m0 c2406m0, kotlin.coroutines.d dVar, C4699va c4699va) {
        super(2, dVar);
        this.f30689e = c2406m0;
        this.f30690f = c4699va;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4109aq(this.f30689e, dVar, this.f30690f);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4109aq(this.f30689e, (kotlin.coroutines.d) obj2, this.f30690f).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f30688d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4714vp c4714vp = new C4714vp(this.f30690f);
            this.f30688d = 1;
            if (this.f30689e.collect(c4714vp, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        return Unit.f71690a;
    }
}
