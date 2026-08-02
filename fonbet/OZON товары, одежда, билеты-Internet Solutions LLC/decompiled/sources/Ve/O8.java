package Ve;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.request.PayBindingRequestBody;
import xe.C10727i;

/* loaded from: classes10.dex */
public final class O8 extends M1.b {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4524p8 f29598a;

    /* renamed from: b, reason: collision with root package name */
    public final Y9 f29599b;

    public O8(InterfaceC4524p8 sPayRepository, Y9 sPaySdkReducer) {
        Intrinsics.checkNotNullParameter(sPayRepository, "sPayRepository");
        Intrinsics.checkNotNullParameter(sPaySdkReducer, "sPaySdkReducer");
        this.f29598a = sPayRepository;
        this.f29599b = sPaySdkReducer;
    }

    @Override // M1.b
    public final Object f(Object obj, xe.I i11, kotlin.coroutines.d dVar) {
        Object f7 = C10727i.f(i11.plus(xe.X0.b()), new C4408l8(this, (PayBindingRequestBody) obj, i11, null), dVar);
        return f7 == Wc.a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }
}
