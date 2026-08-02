package B50;

import Ae.O0;
import Ae.x0;
import android.graphics.Rect;
import android.os.Parcelable;
import d40.InterfaceC6083a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.cbottombase.models.cbottom.v2.Cbottom2FullDTO;
import ru.ozon.fintech.ui.ActionResult2UI;
import x40.C10656a;
import z50.InterfaceC10987a;

/* loaded from: classes3.dex */
public final class c extends G40.a<Cbottom2FullDTO> {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C10656a f2818d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC10987a f2819e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final ru.ozon.fintech.settings.domain.a f2820f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final x0<C50.c> f2821g;

    /* renamed from: h, reason: collision with root package name */
    private Cbottom2FullDTO f2822h;

    /* renamed from: i, reason: collision with root package name */
    private C50.c f2823i;

    /* synthetic */ class a extends C7735q implements Function1<ActionResult2UI, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ActionResult2UI actionResult2UI) {
            ActionResult2UI p02 = actionResult2UI;
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((c) this.receiver).d0(p02);
            return Unit.f71690a;
        }
    }

    /* synthetic */ class b extends C7735q implements Function1<ActionResult2UI, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ActionResult2UI actionResult2UI) {
            ActionResult2UI p02 = actionResult2UI;
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((c) this.receiver).d0(p02);
            return Unit.f71690a;
        }
    }

    /* renamed from: B50.c$c, reason: collision with other inner class name */
    /* synthetic */ class C0065c extends C7735q implements Function1<ActionResult2UI, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ActionResult2UI actionResult2UI) {
            ActionResult2UI p02 = actionResult2UI;
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((c) this.receiver).d0(p02);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@NotNull C10656a cbottomMapper2, @NotNull InterfaceC10987a fullDisplay, @NotNull ru.ozon.fintech.settings.domain.a fintechSettings, @NotNull InterfaceC6083a exchanger) {
        super(exchanger);
        Intrinsics.checkNotNullParameter(cbottomMapper2, "cbottomMapper2");
        Intrinsics.checkNotNullParameter(fullDisplay, "fullDisplay");
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        Intrinsics.checkNotNullParameter(exchanger, "exchanger");
        this.f2818d = cbottomMapper2;
        this.f2819e = fullDisplay;
        this.f2820f = fintechSettings;
        this.f2821g = O0.a(null);
    }

    @Override // G40.a
    public final void e0(@NotNull ActionResult2UI actionResult2UI) {
        String d11;
        Intrinsics.checkNotNullParameter(actionResult2UI, "actionResult2UI");
        C50.c cVar = this.f2823i;
        if (cVar == null || (d11 = cVar.d()) == null) {
            return;
        }
        C50.c cVar2 = this.f2823i;
        L80.a.a("FullViewModel", "ActionResult actionResult2UI=" + actionResult2UI + " bottomId=" + d11 + " dataDto?.id=" + (cVar2 != null ? cVar2.d() : null));
    }

    @Override // G40.a
    public final Cbottom2FullDTO f0() {
        return this.f2822h;
    }

    @Override // G40.a
    protected final void handleState() {
        C50.c cVar = this.f2823i;
        if (cVar != null) {
            this.f2821g.setValue(cVar);
        }
    }

    @Override // G40.a
    @NotNull
    public final String i0() {
        String d11;
        C50.c cVar = this.f2823i;
        return (cVar == null || (d11 = cVar.d()) == null) ? "" : d11;
    }

    @Override // G40.a
    public final void j0(String str, Parcelable parcelable, Integer num, @NotNull String uuid, Boolean bool) {
        Rect a11;
        Rect a12;
        Rect a13;
        List<Integer> footerPaddings;
        List<Integer> headerPaddings;
        List<Integer> mainPaddings;
        String id2;
        List<F40.a> main;
        String id3;
        List<F40.a> footer;
        String id4;
        List<F40.a> header;
        String id5;
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        super.j0(str, parcelable, num, uuid, null);
        C10656a c10656a = this.f2818d;
        if (num != null && num.intValue() == 2 && parcelable != null && (parcelable instanceof Cbottom2FullDTO)) {
            this.f2822h = (Cbottom2FullDTO) parcelable;
        } else if (num != null && num.intValue() == 2 && str != null) {
            this.f2822h = (Cbottom2FullDTO) c10656a.d(str);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Cbottom2FullDTO cbottom2FullDTO = this.f2822h;
        String str2 = "";
        if (cbottom2FullDTO != null && (header = cbottom2FullDTO.getHeader()) != null) {
            Cbottom2FullDTO cbottom2FullDTO2 = this.f2822h;
            String str3 = (cbottom2FullDTO2 == null || (id5 = cbottom2FullDTO2.getId()) == null) ? "" : id5;
            a aVar = new a(1, this, c.class, "actionListenerV2", "actionListenerV2(Lru/ozon/fintech/ui/ActionResult2UI;)V", 0);
            c10656a.getClass();
            arrayList2.addAll(C10656a.b(str3, header, aVar, null));
        }
        Cbottom2FullDTO cbottom2FullDTO3 = this.f2822h;
        if (cbottom2FullDTO3 != null && (footer = cbottom2FullDTO3.getFooter()) != null) {
            Cbottom2FullDTO cbottom2FullDTO4 = this.f2822h;
            String str4 = (cbottom2FullDTO4 == null || (id4 = cbottom2FullDTO4.getId()) == null) ? "" : id4;
            b bVar = new b(1, this, c.class, "actionListenerV2", "actionListenerV2(Lru/ozon/fintech/ui/ActionResult2UI;)V", 0);
            c10656a.getClass();
            arrayList3.addAll(C10656a.b(str4, footer, bVar, null));
        }
        Cbottom2FullDTO cbottom2FullDTO5 = this.f2822h;
        if (cbottom2FullDTO5 != null && (main = cbottom2FullDTO5.getMain()) != null) {
            Cbottom2FullDTO cbottom2FullDTO6 = this.f2822h;
            String str5 = (cbottom2FullDTO6 == null || (id3 = cbottom2FullDTO6.getId()) == null) ? "" : id3;
            C0065c c0065c = new C0065c(1, this, c.class, "actionListenerV2", "actionListenerV2(Lru/ozon/fintech/ui/ActionResult2UI;)V", 0);
            c10656a.getClass();
            arrayList.addAll(C10656a.b(str5, main, c0065c, null));
        }
        Cbottom2FullDTO cbottom2FullDTO7 = this.f2822h;
        if (cbottom2FullDTO7 != null && (id2 = cbottom2FullDTO7.getId()) != null) {
            str2 = id2;
        }
        Cbottom2FullDTO cbottom2FullDTO8 = this.f2822h;
        boolean d11 = cbottom2FullDTO8 != null ? Intrinsics.d(cbottom2FullDTO8.getScrollable(), Boolean.TRUE) : false;
        Cbottom2FullDTO cbottom2FullDTO9 = this.f2822h;
        String imageUrl = cbottom2FullDTO9 != null ? cbottom2FullDTO9.getImageUrl() : null;
        Cbottom2FullDTO cbottom2FullDTO10 = this.f2822h;
        String backgroundColor = cbottom2FullDTO10 != null ? cbottom2FullDTO10.getBackgroundColor() : null;
        Cbottom2FullDTO cbottom2FullDTO11 = this.f2822h;
        if (cbottom2FullDTO11 == null || (mainPaddings = cbottom2FullDTO11.getMainPaddings()) == null || (a11 = E30.i.b(mainPaddings)) == null) {
            a11 = E30.i.a();
        }
        Rect rect = a11;
        Cbottom2FullDTO cbottom2FullDTO12 = this.f2822h;
        if (cbottom2FullDTO12 == null || (headerPaddings = cbottom2FullDTO12.getHeaderPaddings()) == null || (a12 = E30.i.b(headerPaddings)) == null) {
            a12 = E30.i.a();
        }
        Rect rect2 = a12;
        Cbottom2FullDTO cbottom2FullDTO13 = this.f2822h;
        if (cbottom2FullDTO13 == null || (footerPaddings = cbottom2FullDTO13.getFooterPaddings()) == null || (a13 = E30.i.b(footerPaddings)) == null) {
            a13 = E30.i.a();
        }
        H40.a aVar2 = new H40.a(str2, arrayList2, arrayList3, arrayList, rect, a13, rect2, imageUrl, d11, backgroundColor);
        Cbottom2FullDTO cbottom2FullDTO14 = this.f2822h;
        String id6 = cbottom2FullDTO14 != null ? cbottom2FullDTO14.getId() : null;
        Cbottom2FullDTO cbottom2FullDTO15 = this.f2822h;
        Boolean disableNightMode = cbottom2FullDTO15 != null ? cbottom2FullDTO15.getDisableNightMode() : null;
        Cbottom2FullDTO cbottom2FullDTO16 = this.f2822h;
        Boolean lightStatusBar = cbottom2FullDTO16 != null ? cbottom2FullDTO16.getLightStatusBar() : null;
        Cbottom2FullDTO cbottom2FullDTO17 = this.f2822h;
        this.f2823i = new C50.c(id6, disableNightMode, lightStatusBar, cbottom2FullDTO17 != null ? cbottom2FullDTO17.getCanClose() : null, aVar2);
        handleState();
    }

    @NotNull
    public final x0<C50.c> k0() {
        return this.f2821g;
    }

    public final boolean l0() {
        return this.f2820f.isStandAloneIntegration();
    }

    public final void m0() {
        Cbottom2FullDTO cbottom2FullDTO = this.f2822h;
        if (cbottom2FullDTO != null) {
            String id2 = cbottom2FullDTO.getId();
            if (id2 == null) {
                id2 = "";
            }
            h0(id2);
        }
    }

    @Override // G40.a
    public final void onBackPressed() {
        super.onBackPressed();
        C50.c cVar = this.f2823i;
        Boolean a11 = cVar != null ? cVar.a() : null;
        if (a11 == null || a11.booleanValue()) {
            this.f2819e.c(i0(), getUuid());
        } else {
            L80.a.a("FullViewModel", "prevent close");
        }
    }
}
