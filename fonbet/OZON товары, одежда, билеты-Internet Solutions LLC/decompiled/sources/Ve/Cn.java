package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.BnplMethod;

/* loaded from: classes10.dex */
public final class Cn extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f28775d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f28776e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Cn(Object obj, kotlin.coroutines.d dVar, int i11) {
        super(2, dVar);
        this.f28775d = i11;
        this.f28776e = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.f28775d) {
            case 0:
                return new Cn((D1) this.f28776e, dVar, 0);
            default:
                return new Cn((Up) this.f28776e, dVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.f28775d) {
            case 0:
                return new Cn((D1) this.f28776e, dVar, 0).invokeSuspend(Unit.f71690a);
            default:
                return new Cn((Up) this.f28776e, dVar, 1).invokeSuspend(Unit.f71690a);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = this.f28776e;
        switch (this.f28775d) {
            case 0:
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                Sc.s.b(obj);
                Bi event = new Bi(M2.TOUCH_CANCEL, Ur.BNPL_PARTS_VIEW, Pe.TOUCH, null, null, null, null, 120);
                D1 d12 = (D1) obj2;
                d12.getClass();
                Intrinsics.checkNotNullParameter(event, "event");
                d12.f30497a.b(event);
                boolean z11 = ((C4654tn) d12.f30498b).f32129F.getValue() instanceof BnplMethod;
                ((C4238fb) d12.f31988c).b(C4825zo.f32678a);
                return Unit.f71690a;
            default:
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                Sc.s.b(obj);
                return String.valueOf(((C4654tn) ((Up) obj2).f30145a).f32144m);
        }
    }
}
