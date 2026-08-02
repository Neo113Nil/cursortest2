package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.HelperScenario;
import spay.sdk.domain.model.PayStrategy;

/* renamed from: Ve.z4, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4805z4 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f32622d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4261g5 f32623e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4805z4(C4261g5 c4261g5, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f32623e = c4261g5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4805z4(this.f32623e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4805z4(this.f32623e, (kotlin.coroutines.d) obj2).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Ki oc2;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f32622d;
        if (i11 == 0) {
            Sc.s.b(obj);
            this.f32622d = 1;
            if (xe.Y.b(350L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        C4261g5 c4261g5 = this.f32623e;
        Y9 y92 = c4261g5.f31080e;
        C4654tn c4654tn = (C4654tn) c4261g5.f30498b;
        if (Intrinsics.d(c4654tn.j(), PayStrategy.PayWithPartsOnly.INSTANCE)) {
            oc2 = Hb.f29136a;
        } else if (c4654tn.f32155x == HelperScenario.BNPL) {
            PayStrategy.PartsStartPay status = PayStrategy.PartsStartPay.INSTANCE;
            Intrinsics.checkNotNullParameter(status, "status");
            c4654tn.f32128E.setValue(status);
            oc2 = Hb.f29136a;
        } else {
            oc2 = new Oc((InterfaceC4733wg) c4261g5.f31082g.getValue(c4261g5, C4261g5.f31078l[0]), false);
        }
        ((C4238fb) y92).b(oc2);
        return Unit.f71690a;
    }
}
