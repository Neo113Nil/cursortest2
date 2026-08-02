package Q40;

import Ae.O0;
import Ae.x0;
import E30.i;
import P40.d;
import android.graphics.Rect;
import android.os.Parcelable;
import com.detmir.recycli.adapters.RecyclerItem;
import com.detmir.recycli.adapters.ScrollKeeper;
import d40.InterfaceC6083a;
import g30.InterfaceC6618a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.cbottombase.models.cbottom.v2.Cbottom2ModalDTO;
import ru.ozon.fintech.ui.ActionResult2UI;
import x40.C10656a;

/* loaded from: classes3.dex */
public final class a extends G40.a<Cbottom2ModalDTO> implements ScrollKeeper.a {

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ ScrollKeeper.b f22956d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC6083a f22957e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C10656a f22958f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final P40.a f22959g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f22960h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final ru.ozon.fintech.settings.domain.a f22961i;

    /* renamed from: j, reason: collision with root package name */
    private Cbottom2ModalDTO f22962j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final x0<List<RecyclerItem>> f22963k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final x0<d> f22964l;

    /* renamed from: Q40.a$a, reason: collision with other inner class name */
    /* synthetic */ class C0449a extends C7735q implements Function1<ActionResult2UI, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ActionResult2UI actionResult2UI) {
            ActionResult2UI p02 = actionResult2UI;
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((a) this.receiver).d0(p02);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull InterfaceC6083a exchanger, @NotNull C10656a cbottomMapper2, @NotNull P40.a modalDisplay, @NotNull InterfaceC6618a fintechAnalyticInteractor, @NotNull ru.ozon.fintech.settings.domain.a fintechSettings) {
        super(exchanger);
        Intrinsics.checkNotNullParameter(exchanger, "exchanger");
        Intrinsics.checkNotNullParameter(cbottomMapper2, "cbottomMapper2");
        Intrinsics.checkNotNullParameter(modalDisplay, "modalDisplay");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        this.f22956d = new ScrollKeeper.b();
        this.f22957e = exchanger;
        this.f22958f = cbottomMapper2;
        this.f22959g = modalDisplay;
        this.f22960h = fintechAnalyticInteractor;
        this.f22961i = fintechSettings;
        this.f22963k = O0.a(K.f71697a);
        this.f22964l = O0.a(null);
    }

    @Override // com.detmir.recycli.adapters.ScrollKeeper.a
    @NotNull
    public final ScrollKeeper L(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return this.f22956d.L(id2);
    }

    @Override // G40.a
    public final Cbottom2ModalDTO f0() {
        return this.f22962j;
    }

    @Override // G40.a
    public final void g0() {
        super.g0();
        this.f22960h.a(i0());
    }

    @Override // G40.a
    protected final void handleState() {
        a aVar;
        List<Integer> mainPaddings;
        List<Integer> margins;
        List<F40.a> main;
        String str;
        ArrayList arrayList = new ArrayList();
        Cbottom2ModalDTO cbottom2ModalDTO = this.f22962j;
        if (cbottom2ModalDTO == null || (main = cbottom2ModalDTO.getMain()) == null) {
            aVar = this;
        } else {
            Cbottom2ModalDTO cbottom2ModalDTO2 = this.f22962j;
            if (cbottom2ModalDTO2 == null || (str = cbottom2ModalDTO2.getId()) == null) {
                str = "";
            }
            aVar = this;
            C0449a c0449a = new C0449a(1, aVar, a.class, "actionListenerV2", "actionListenerV2(Lru/ozon/fintech/ui/ActionResult2UI;)V", 0);
            aVar.f22958f.getClass();
            arrayList.addAll(C10656a.b(str, main, c0449a, this));
        }
        x0<d> x0Var = aVar.f22964l;
        Cbottom2ModalDTO cbottom2ModalDTO3 = aVar.f22962j;
        boolean d11 = cbottom2ModalDTO3 != null ? Intrinsics.d(cbottom2ModalDTO3.getCanClose(), Boolean.TRUE) : false;
        Cbottom2ModalDTO cbottom2ModalDTO4 = aVar.f22962j;
        Integer width = cbottom2ModalDTO4 != null ? cbottom2ModalDTO4.getWidth() : null;
        Cbottom2ModalDTO cbottom2ModalDTO5 = aVar.f22962j;
        Integer height = cbottom2ModalDTO5 != null ? cbottom2ModalDTO5.getHeight() : null;
        Cbottom2ModalDTO cbottom2ModalDTO6 = aVar.f22962j;
        Rect b11 = (cbottom2ModalDTO6 == null || (margins = cbottom2ModalDTO6.getMargins()) == null) ? null : i.b(margins);
        Cbottom2ModalDTO cbottom2ModalDTO7 = aVar.f22962j;
        Rect b12 = (cbottom2ModalDTO7 == null || (mainPaddings = cbottom2ModalDTO7.getMainPaddings()) == null) ? null : i.b(mainPaddings);
        Cbottom2ModalDTO cbottom2ModalDTO8 = aVar.f22962j;
        List<Integer> backgroundRadius = cbottom2ModalDTO8 != null ? cbottom2ModalDTO8.getBackgroundRadius() : null;
        Cbottom2ModalDTO cbottom2ModalDTO9 = aVar.f22962j;
        x0Var.setValue(new d(d11, width, height, b11, b12, backgroundRadius, cbottom2ModalDTO9 != null ? cbottom2ModalDTO9.getBackgroundColor() : null));
        aVar.f22963k.setValue(arrayList);
    }

    @Override // G40.a
    @NotNull
    public final String i0() {
        String id2;
        Cbottom2ModalDTO cbottom2ModalDTO = this.f22962j;
        return (cbottom2ModalDTO == null || (id2 = cbottom2ModalDTO.getId()) == null) ? "" : id2;
    }

    @Override // G40.a
    public final void j0(String str, Parcelable parcelable, Integer num, @NotNull String uuid, Boolean bool) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        super.j0(str, parcelable, num, uuid, null);
        if (num != null && num.intValue() == 2 && parcelable != null && (parcelable instanceof Cbottom2ModalDTO)) {
            this.f22962j = (Cbottom2ModalDTO) parcelable;
        } else if (num != null && num.intValue() == 2 && str != null) {
            this.f22962j = (Cbottom2ModalDTO) this.f22958f.d(str);
        }
        handleState();
    }

    @NotNull
    public final x0<List<RecyclerItem>> k0() {
        return this.f22963k;
    }

    @NotNull
    public final x0<d> l0() {
        return this.f22964l;
    }

    public final boolean m0() {
        return this.f22961i.isStandAloneIntegration();
    }

    @Override // G40.a
    public final void onBackPressed() {
        super.onBackPressed();
        d value = this.f22964l.getValue();
        if (value == null || !value.f()) {
            return;
        }
        this.f22959g.c(i0(), getUuid());
    }
}
