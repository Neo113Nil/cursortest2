package Ve;

import Ae.C2399j;
import Ae.C2406m0;
import Ae.I0;
import h3.C6788a;
import id.C7048a;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.response.SPaySdkConfig;
import xe.C10727i;

/* renamed from: Ve.vk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4709vk extends Yk {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.m[] f32296i = {I1.w.c(C4709vk.class, "screenMode", "getScreenMode()Lspay/sdk/domain/ReturnScreenType;", 0)};

    /* renamed from: c, reason: collision with root package name */
    public final Y9 f32297c;

    /* renamed from: d, reason: collision with root package name */
    public final C4187dh f32298d;

    /* renamed from: e, reason: collision with root package name */
    public final Y4 f32299e;

    /* renamed from: f, reason: collision with root package name */
    public final id.f f32300f;

    /* renamed from: g, reason: collision with root package name */
    public final Ae.M0 f32301g;

    /* renamed from: h, reason: collision with root package name */
    public final Ae.M0 f32302h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4709vk(Te metricFacade, Vm sPayDataContract, Y9 sPaySdkReducer, Ib sPayStorage, InterfaceC4686uq authHandler, C4187dh revokeRefreshTokenUseCase, Y4 setCookieHandler, Vl sPaySdkConfigRepository) {
        super(metricFacade, sPayDataContract, sPaySdkReducer);
        Intrinsics.checkNotNullParameter(metricFacade, "metricFacade");
        Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
        Intrinsics.checkNotNullParameter(sPaySdkReducer, "sPaySdkReducer");
        Intrinsics.checkNotNullParameter(sPayStorage, "sPayStorage");
        Intrinsics.checkNotNullParameter(authHandler, "authHandler");
        Intrinsics.checkNotNullParameter(revokeRefreshTokenUseCase, "revokeRefreshTokenUseCase");
        Intrinsics.checkNotNullParameter(setCookieHandler, "setCookieHandler");
        Intrinsics.checkNotNullParameter(sPaySdkConfigRepository, "sPaySdkConfigRepository");
        this.f32297c = sPaySdkReducer;
        this.f32298d = revokeRefreshTokenUseCase;
        this.f32299e = setCookieHandler;
        C7048a.f66242a.getClass();
        id.f a11 = C7048a.a();
        this.f32300f = a11;
        Be.m D11 = C2399j.D(new C2406m0(C2399j.b(((C4654tn) sPayDataContract).f32137f)), new Uj());
        C6788a a12 = androidx.lifecycle.x0.a(this);
        int i11 = Ae.I0.f818a;
        this.f32301g = C2399j.M(D11, a12, I0.a.b(3), null);
        Ae.x0 a13 = Ae.O0.a(null);
        this.f32302h = C2399j.b(a13);
        C4673ud c4673ud = (C4673ud) sPayStorage;
        if (!(c4673ud.a().f29004a instanceof Gh)) {
            throw new C4581r8(c4673ud.a().toString());
        }
        AbstractC4245fi abstractC4245fi = c4673ud.a().f29004a;
        Intrinsics.g(abstractC4245fi, "null cannot be cast to non-null type spay.sdk.domain.OutcomeState.UserProfile");
        a11.setValue(this, f32296i[0], ((Gh) abstractC4245fi).f29078a);
        SPaySdkConfig sPaySdkConfig = ((C4712vn) sPaySdkConfigRepository).f32313c;
        if (sPaySdkConfig == null) {
            throw C4317i3.f31235a;
        }
        a13.setValue(sPaySdkConfig.getLocalization().getUserProfileInfo());
    }

    public final void e0(M1.b userProfileFragmentEvent) {
        Intrinsics.checkNotNullParameter(userProfileFragmentEvent, "userProfileFragmentEvent");
        boolean equals = userProfileFragmentEvent.equals(Ig.f29233a);
        Te te2 = this.f30497a;
        if (equals) {
            te2.b(new Bi(Ap.LC_PROFILE_VIEW_APPEARED, Ur.PROFILE_VIEW, Pe.LC, null, null, null, null, 120));
            return;
        }
        if (userProfileFragmentEvent.equals(C4446mh.f31591a)) {
            te2.b(new Bi(Ap.LC_PROFILE_VIEW_DISAPPEARED, Ur.PROFILE_VIEW, Pe.LC, null, null, null, null, 120));
            return;
        }
        if (!userProfileFragmentEvent.equals(Jf.f29290a)) {
            if (userProfileFragmentEvent.equals(C4272gg.f31112a)) {
                te2.b(new Bi(Ap.TOUCH_LOG_OUT, Ur.PROFILE_VIEW, Pe.TOUCH, null, null, null, null, 120));
                C10727i.c(androidx.lifecycle.x0.a(this), null, null, new C4621sj(this, null), 3);
                return;
            }
            return;
        }
        Bi event = new Bi(Ap.TOUCH_BACK, Ur.PROFILE_VIEW, Pe.TOUCH, null, null, null, null, 120);
        Intrinsics.checkNotNullParameter(event, "event");
        te2.b(event);
        id.f fVar = this.f32300f;
        kotlin.reflect.m<?>[] mVarArr = f32296i;
        InterfaceC4586rd interfaceC4586rd = (InterfaceC4586rd) fVar.getValue(this, mVarArr[0]);
        boolean z11 = interfaceC4586rd instanceof C4383kc;
        Y9 y92 = this.f32297c;
        if (z11) {
            InterfaceC4586rd interfaceC4586rd2 = (InterfaceC4586rd) fVar.getValue(this, mVarArr[0]);
            Intrinsics.g(interfaceC4586rd2, "null cannot be cast to non-null type spay.sdk.domain.ReturnScreenType.ReturnHelpersScreenType");
            ((C4238fb) y92).b(new Ca(((C4383kc) interfaceC4586rd2).f31436a));
            return;
        }
        if (interfaceC4586rd instanceof Mc) {
            InterfaceC4586rd interfaceC4586rd3 = (InterfaceC4586rd) fVar.getValue(this, mVarArr[0]);
            Intrinsics.g(interfaceC4586rd3, "null cannot be cast to non-null type spay.sdk.domain.ReturnScreenType.ReturnOrderScreenType");
            ((C4238fb) y92).b(new Oc(Vf.f30201a, false));
        }
    }
}
