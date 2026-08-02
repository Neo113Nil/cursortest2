package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import spay.sdk.domain.model.request.PayBindingRequestBody;

/* loaded from: classes10.dex */
public final class Z5 extends kotlin.coroutines.jvm.internal.j implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public int f30566d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4177d7 f30567e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ PayBindingRequestBody f30568f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xe.I f30569g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z5(C4177d7 c4177d7, PayBindingRequestBody payBindingRequestBody, xe.I i11, kotlin.coroutines.d dVar) {
        super(1, dVar);
        this.f30567e = c4177d7;
        this.f30568f = payBindingRequestBody;
        this.f30569g = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(kotlin.coroutines.d dVar) {
        return new Z5(this.f30567e, this.f30568f, this.f30569g, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((Z5) create((kotlin.coroutines.d) obj)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f30566d;
        if (i11 == 0) {
            Sc.s.b(obj);
            this.f30566d = 1;
            if (this.f30567e.k(this.f30568f, this.f30569g, this) == aVar) {
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
