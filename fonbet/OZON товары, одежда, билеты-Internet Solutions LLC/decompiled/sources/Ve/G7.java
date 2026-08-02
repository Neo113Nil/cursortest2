package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import spay.sdk.domain.model.request.PayBindingRequestBody;

/* loaded from: classes10.dex */
public final class G7 extends kotlin.coroutines.jvm.internal.j implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public int f29060d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ O8 f29061e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ PayBindingRequestBody f29062f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xe.I f29063g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G7(O8 o82, PayBindingRequestBody payBindingRequestBody, xe.I i11, kotlin.coroutines.d dVar) {
        super(1, dVar);
        this.f29061e = o82;
        this.f29062f = payBindingRequestBody;
        this.f29063g = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(kotlin.coroutines.d dVar) {
        return new G7(this.f29061e, this.f29062f, this.f29063g, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((G7) create((kotlin.coroutines.d) obj)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f29060d;
        if (i11 == 0) {
            Sc.s.b(obj);
            this.f29060d = 1;
            if (this.f29061e.k(this.f29062f, this.f29063g, this) == aVar) {
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
