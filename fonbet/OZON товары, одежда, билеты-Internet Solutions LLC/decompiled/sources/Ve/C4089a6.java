package Ve;

import kotlin.jvm.internal.Intrinsics;
import spay.sdk.RedirectActivity;
import spay.sdk.domain.model.AuthMethod;
import xe.C10737n;

/* renamed from: Ve.a6, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4089a6 implements InterfaceC4228f1 {

    /* renamed from: a, reason: collision with root package name */
    public final C4248fl f30637a;

    /* renamed from: b, reason: collision with root package name */
    public final Y9 f30638b;

    /* renamed from: c, reason: collision with root package name */
    public final Vm f30639c;

    public C4089a6(C4248fl featuresHandler, InterfaceC4686uq authHandler, Y9 reducer, Vm sPayDataContract) {
        Intrinsics.checkNotNullParameter(featuresHandler, "featuresHandler");
        Intrinsics.checkNotNullParameter(authHandler, "authHandler");
        Intrinsics.checkNotNullParameter(reducer, "reducer");
        Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
        this.f30637a = featuresHandler;
        this.f30638b = reducer;
        this.f30639c = sPayDataContract;
    }

    @Override // Ve.InterfaceC4228f1
    public final Object a(RedirectActivity redirectActivity, kotlin.coroutines.d dVar) {
        boolean z11;
        if (((C4654tn) this.f30639c).j() instanceof AuthMethod.ByPhoneNumber) {
            if (Lf.a.r0(this.f30637a, EnumC4290h5.PHONE_NUMBER_AUTH, null)) {
                z11 = true;
                return Boolean.valueOf(z11);
            }
        }
        z11 = false;
        return Boolean.valueOf(z11);
    }

    @Override // Ve.InterfaceC4228f1
    public final Object b(RedirectActivity redirectActivity, EnumC4801z0 enumC4801z0, kotlin.coroutines.d frame) {
        EnumC4801z0 enumC4801z02 = EnumC4801z0.f32616b;
        C10737n c10737n = new C10737n(1, Wc.b.b(frame));
        c10737n.o();
        ((C4238fb) this.f30638b).b(new C4644td(enumC4801z02));
        Object n11 = c10737n.n();
        if (n11 == Wc.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return n11;
    }
}
