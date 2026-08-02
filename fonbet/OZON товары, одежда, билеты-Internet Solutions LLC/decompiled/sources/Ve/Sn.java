package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import spay.sdk.domain.model.response.SPaySdkConfig;

/* loaded from: classes10.dex */
public final class Sn extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Vl f29992d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Sn(Vl vl, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f29992d = vl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new Sn(this.f29992d, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Sn(this.f29992d, (kotlin.coroutines.d) obj2).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        SPaySdkConfig sPaySdkConfig = ((C4712vn) this.f29992d).f32313c;
        if (sPaySdkConfig != null) {
            return sPaySdkConfig.getLocalization().getPayLoading();
        }
        throw C4317i3.f31235a;
    }
}
