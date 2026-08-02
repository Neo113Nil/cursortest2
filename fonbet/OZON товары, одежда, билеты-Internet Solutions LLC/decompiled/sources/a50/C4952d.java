package a50;

import Ae.C0;
import Ae.E0;
import Ae.O0;
import Ae.x0;
import android.os.Parcelable;
import d40.InterfaceC6083a;
import g30.InterfaceC6618a;
import h3.C6788a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.cbottombase.models.cbottom.v2.Cbottom2OnboardingV2DTO;
import ru.ozon.fintech.ui.ActionResult2UI;
import x40.C10656a;
import ze.EnumC11113a;

/* renamed from: a50.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4952d extends G40.a<Cbottom2OnboardingV2DTO> {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C10656a f36345d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final U40.a f36346e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f36347f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final ru.ozon.fintech.settings.domain.a f36348g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final W40.a f36349h;

    /* renamed from: i, reason: collision with root package name */
    private Cbottom2OnboardingV2DTO f36350i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final x0<Y40.c> f36351j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final C0 f36352k;

    /* renamed from: a50.d$a */
    /* synthetic */ class a extends C7735q implements Function1<ActionResult2UI, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ActionResult2UI actionResult2UI) {
            ActionResult2UI p02 = actionResult2UI;
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((C4952d) this.receiver).d0(p02);
            return Unit.f71690a;
        }
    }

    /* renamed from: a50.d$b */
    /* synthetic */ class b extends C7735q implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((C4952d) this.receiver).onBackPressed();
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4952d(@NotNull C10656a cbottomMapper2, @NotNull U40.a onboardingSlidesDisplay, @NotNull InterfaceC6618a fintechAnalyticInteractor, @NotNull ru.ozon.fintech.settings.domain.a fintechSettings, @NotNull InterfaceC6083a exchanger) {
        super(exchanger);
        Intrinsics.checkNotNullParameter(cbottomMapper2, "cbottomMapper2");
        Intrinsics.checkNotNullParameter(onboardingSlidesDisplay, "onboardingSlidesDisplay");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        Intrinsics.checkNotNullParameter(exchanger, "exchanger");
        this.f36345d = cbottomMapper2;
        this.f36346e = onboardingSlidesDisplay;
        this.f36347f = fintechAnalyticInteractor;
        this.f36348g = fintechSettings;
        W40.a aVar = new W40.a(cbottomMapper2);
        a aVar2 = new a(1, this, C4952d.class, "actionListenerV2", "actionListenerV2(Lru/ozon/fintech/ui/ActionResult2UI;)V", 0);
        Intrinsics.checkNotNullParameter(aVar2, "<set-?>");
        aVar.f33233g = aVar2;
        C6788a a11 = androidx.lifecycle.x0.a(this);
        Intrinsics.checkNotNullParameter(a11, "<set-?>");
        aVar.f33231e = a11;
        b bVar = new b(0, this, C4952d.class, "onBackPressed", "onBackPressed()V", 0);
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        aVar.f33232f = bVar;
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "<set-?>");
        aVar.f33234h = fintechAnalyticInteractor;
        this.f36349h = aVar;
        this.f36351j = O0.a(null);
        this.f36352k = E0.a(0, 1, EnumC11113a.DROP_OLDEST);
    }

    @Override // G40.a
    public final void e0(@NotNull ActionResult2UI actionResult2UI) {
        Intrinsics.checkNotNullParameter(actionResult2UI, "actionResult2UI");
        L80.a.a("OnboardingSlidesV2ViewModel", "ActionResult actionResult2UI=" + actionResult2UI + " bottomId=" + i0());
        String widgetId = actionResult2UI.getWidgetId();
        if (widgetId == null) {
            widgetId = "";
        }
        this.f36349h.s(widgetId);
    }

    @Override // G40.a
    public final Cbottom2OnboardingV2DTO f0() {
        return this.f36350i;
    }

    @Override // G40.a
    public final void g0() {
        U40.c.b(this.f36348g.isQa());
        super.g0();
    }

    @Override // G40.a
    protected final void handleState() {
        this.f36351j.setValue(this.f36349h.i());
    }

    @Override // G40.a
    @NotNull
    public final String i0() {
        String b11;
        Y40.c i11 = this.f36349h.i();
        return (i11 == null || (b11 = i11.b()) == null) ? "" : b11;
    }

    @Override // G40.a
    public final void j0(String str, Parcelable parcelable, Integer num, @NotNull String uuid, Boolean bool) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        super.j0(str, parcelable, num, uuid, bool);
        if (num != null && num.intValue() == 2 && parcelable != null && (parcelable instanceof Cbottom2OnboardingV2DTO)) {
            this.f36350i = (Cbottom2OnboardingV2DTO) parcelable;
        } else if (num != null && num.intValue() == 2 && str != null) {
            this.f36350i = (Cbottom2OnboardingV2DTO) this.f36345d.d(str);
        }
        boolean d11 = Intrinsics.d(bool, Boolean.TRUE);
        W40.a aVar = this.f36349h;
        if (d11) {
            aVar.v(this.f36350i);
            handleState();
        } else {
            Cbottom2OnboardingV2DTO cbottom2OnboardingV2DTO = this.f36350i;
            aVar.t(cbottom2OnboardingV2DTO != null ? cbottom2OnboardingV2DTO.getSelectedFrame() : 0);
        }
    }

    @NotNull
    public final W40.a k0() {
        return this.f36349h;
    }

    @NotNull
    public final x0<Y40.c> l0() {
        return this.f36351j;
    }

    @NotNull
    public final C0 m0() {
        return this.f36352k;
    }

    public final boolean n0() {
        return this.f36348g.isStandAloneIntegration();
    }

    @Override // G40.a
    public final void onBackPressed() {
        super.onBackPressed();
        this.f36346e.c(i0(), getUuid());
    }

    public final void p0() {
        Cbottom2OnboardingV2DTO cbottom2OnboardingV2DTO = this.f36350i;
        if (cbottom2OnboardingV2DTO != null) {
            String id2 = cbottom2OnboardingV2DTO.getId();
            if (id2 == null) {
                id2 = "";
            }
            h0(id2);
        }
    }
}
