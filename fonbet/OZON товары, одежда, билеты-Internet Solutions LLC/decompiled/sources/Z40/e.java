package Z40;

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
import ru.ozon.fintech.features.cbottombase.models.cbottom.v2.Cbottom2OnboardingDTO;
import ru.ozon.fintech.ui.ActionResult2UI;
import x40.C10656a;
import ze.EnumC11113a;

/* loaded from: classes3.dex */
public final class e extends G40.a<Cbottom2OnboardingDTO> {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C10656a f35478d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final U40.a f35479e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f35480f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final ru.ozon.fintech.settings.domain.a f35481g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final V40.b f35482h;

    /* renamed from: i, reason: collision with root package name */
    private Cbottom2OnboardingDTO f35483i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final x0<Y40.c> f35484j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final C0 f35485k;

    /* synthetic */ class a extends C7735q implements Function1<ActionResult2UI, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ActionResult2UI actionResult2UI) {
            ActionResult2UI p02 = actionResult2UI;
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((e) this.receiver).d0(p02);
            return Unit.f71690a;
        }
    }

    /* synthetic */ class b extends C7735q implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((e) this.receiver).onBackPressed();
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@NotNull C10656a cbottomMapper2, @NotNull U40.a onboardingSlidesDisplay, @NotNull InterfaceC6618a fintechAnalyticInteractor, @NotNull ru.ozon.fintech.settings.domain.a fintechSettings, @NotNull InterfaceC6083a exchanger) {
        super(exchanger);
        Intrinsics.checkNotNullParameter(cbottomMapper2, "cbottomMapper2");
        Intrinsics.checkNotNullParameter(onboardingSlidesDisplay, "onboardingSlidesDisplay");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        Intrinsics.checkNotNullParameter(exchanger, "exchanger");
        this.f35478d = cbottomMapper2;
        this.f35479e = onboardingSlidesDisplay;
        this.f35480f = fintechAnalyticInteractor;
        this.f35481g = fintechSettings;
        V40.b bVar = new V40.b(cbottomMapper2);
        a aVar = new a(1, this, e.class, "actionListenerV2", "actionListenerV2(Lru/ozon/fintech/ui/ActionResult2UI;)V", 0);
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        bVar.f28088g = aVar;
        C6788a a11 = androidx.lifecycle.x0.a(this);
        Intrinsics.checkNotNullParameter(a11, "<set-?>");
        bVar.f28086e = a11;
        b bVar2 = new b(0, this, e.class, "onBackPressed", "onBackPressed()V", 0);
        Intrinsics.checkNotNullParameter(bVar2, "<set-?>");
        bVar.f28087f = bVar2;
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "<set-?>");
        bVar.f28089h = fintechAnalyticInteractor;
        this.f35482h = bVar;
        this.f35484j = O0.a(null);
        this.f35485k = E0.a(0, 1, EnumC11113a.DROP_OLDEST);
    }

    @Override // G40.a
    public final void e0(@NotNull ActionResult2UI actionResult2UI) {
        Intrinsics.checkNotNullParameter(actionResult2UI, "actionResult2UI");
        L80.a.a("OnboardingSlidesViewModel", "ActionResult actionResult2UI=" + actionResult2UI + " bottomId=" + i0());
        String widgetId = actionResult2UI.getWidgetId();
        if (widgetId == null) {
            widgetId = "";
        }
        this.f35482h.p(widgetId);
    }

    @Override // G40.a
    public final Cbottom2OnboardingDTO f0() {
        return this.f35483i;
    }

    @Override // G40.a
    public final void g0() {
        U40.c.b(this.f35481g.isQa());
        super.g0();
    }

    @Override // G40.a
    protected final void handleState() {
        this.f35484j.setValue(this.f35482h.g());
    }

    @Override // G40.a
    @NotNull
    public final String i0() {
        String b11;
        Y40.c g10 = this.f35482h.g();
        return (g10 == null || (b11 = g10.b()) == null) ? "" : b11;
    }

    @Override // G40.a
    public final void j0(String str, Parcelable parcelable, Integer num, @NotNull String uuid, Boolean bool) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        super.j0(str, parcelable, num, uuid, bool);
        if (num != null && num.intValue() == 2 && parcelable != null && (parcelable instanceof Cbottom2OnboardingDTO)) {
            this.f35483i = (Cbottom2OnboardingDTO) parcelable;
        } else if (num != null && num.intValue() == 2 && str != null) {
            this.f35483i = (Cbottom2OnboardingDTO) this.f35478d.d(str);
        }
        boolean d11 = Intrinsics.d(bool, Boolean.TRUE);
        V40.b bVar = this.f35482h;
        if (d11) {
            bVar.s(this.f35483i);
            handleState();
        } else {
            Cbottom2OnboardingDTO cbottom2OnboardingDTO = this.f35483i;
            bVar.q(cbottom2OnboardingDTO != null ? cbottom2OnboardingDTO.getSelectedFrame() : 0);
        }
    }

    @NotNull
    public final V40.b k0() {
        return this.f35482h;
    }

    @NotNull
    public final x0<Y40.c> l0() {
        return this.f35484j;
    }

    @NotNull
    public final C0 m0() {
        return this.f35485k;
    }

    public final boolean n0() {
        return this.f35481g.isStandAloneIntegration();
    }

    @Override // G40.a
    public final void onBackPressed() {
        super.onBackPressed();
        this.f35479e.c(i0(), getUuid());
    }

    public final void p0() {
        Cbottom2OnboardingDTO cbottom2OnboardingDTO = this.f35483i;
        if (cbottom2OnboardingDTO != null) {
            String id2 = cbottom2OnboardingDTO.getId();
            if (id2 == null) {
                id2 = "";
            }
            h0(id2);
        }
    }
}
