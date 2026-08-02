package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import spay.sdk.domain.model.PayStrategy;
import spay.sdk.domain.model.request.SdkAuthRequestBody;

/* loaded from: classes10.dex */
public final class Zf extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f30587d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4744x f30588e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ V8 f30589f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ SdkAuthRequestBody.AuthMethod f30590g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Zf(C4744x c4744x, V8 v82, SdkAuthRequestBody.AuthMethod authMethod, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f30588e = c4744x;
        this.f30589f = v82;
        this.f30590g = authMethod;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new Zf(this.f30588e, this.f30589f, this.f30590g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Zf) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f30587d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4744x c4744x = this.f30588e;
            if (!(((C4654tn) c4744x.f32413b).j() instanceof PayStrategy.PayWithBinding)) {
                this.f30587d = 1;
                if (C4744x.d0(c4744x, this.f30589f, this.f30590g, this) == aVar) {
                    return aVar;
                }
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
