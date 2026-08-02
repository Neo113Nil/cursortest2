package I90;

import Ae.O0;
import Ae.x0;
import B30.o;
import Q90.n;
import android.app.Activity;
import android.app.Application;
import d40.InterfaceC6083a;
import g30.InterfaceC6618a;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.atoms.data.deprecated.CommonText;
import ru.ozon.fintech.exchanger.datapass.ActionResult2;
import ru.ozon.fintech.features.cbottombase.models.cbottom.CbottomType;
import ru.ozon.fintech.features.cbottombase.models.cbottom.v2.Cbottom2SheetDTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.FinButtonV22DTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.TextItemV20DTO;
import ru.ozon.fintech.ui.ActionResult2UI;
import ru.ozon.fintech.ui.button.radioV2.FinRadioButtonV2State;
import ru.ozon.fintech.ui.toggleatom.ToggleAtomWrapperState;
import ru.ozon.fintech.ui.toolbar.FinToolbarState;
import ru.ozon.fintech.ui.utils.Common;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.selectionControls.toggle.ToggleDTO;
import xe.B0;
import xe.C10727i;
import xe.H0;

/* loaded from: classes3.dex */
public final class f extends E30.d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.fintech.settings.domain.a f12060a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final S80.b f12061b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final K40.a f12062c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final n f12063d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC6083a f12064e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Application f12065f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final S80.b f12066g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f12067h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f12068i;

    /* renamed from: j, reason: collision with root package name */
    private B0 f12069j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f12070k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private x0<K90.a> f12071l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private x0<FinToolbarState> f12072m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final x0<ToggleAtomWrapperState> f12073n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private String f12074o;

    /* renamed from: p, reason: collision with root package name */
    private int f12075p;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a DARK;
        public static final a FOLLOW_SYSTEM;
        public static final a LIGHT;

        static {
            a aVar = new a("LIGHT", 0);
            LIGHT = aVar;
            a aVar2 = new a("DARK", 1);
            DARK = aVar2;
            a aVar3 = new a("FOLLOW_SYSTEM", 2);
            FOLLOW_SYSTEM = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            $VALUES = aVarArr;
            $ENTRIES = Xc.b.a(aVarArr);
        }

        private a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12076a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.DARK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.FOLLOW_SYSTEM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f12076a = iArr;
        }
    }

    /* synthetic */ class c extends C7735q implements Function1<Integer, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            f.i0((f) this.receiver, num);
            return Unit.f71690a;
        }
    }

    /* synthetic */ class d extends C7735q implements Function1<Integer, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            f.i0((f) this.receiver, num);
            return Unit.f71690a;
        }
    }

    /* synthetic */ class e extends C7735q implements Function1<Integer, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            f.i0((f) this.receiver, num);
            return Unit.f71690a;
        }
    }

    public f(@NotNull ru.ozon.fintech.settings.domain.a fintechSettings, @NotNull S80.b navigation, @NotNull K40.a cbottomDisplay, @NotNull n fintechUltraManager, @NotNull InterfaceC6083a exchanger, @NotNull Application application, @NotNull S80.b fintechNavigation, @NotNull InterfaceC6618a fintechAnalyticInteractor) {
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        Intrinsics.checkNotNullParameter(cbottomDisplay, "cbottomDisplay");
        Intrinsics.checkNotNullParameter(fintechUltraManager, "fintechUltraManager");
        Intrinsics.checkNotNullParameter(exchanger, "exchanger");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(fintechNavigation, "fintechNavigation");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        this.f12060a = fintechSettings;
        this.f12061b = navigation;
        this.f12062c = cbottomDisplay;
        this.f12063d = fintechUltraManager;
        this.f12064e = exchanger;
        this.f12065f = application;
        this.f12066g = fintechNavigation;
        this.f12067h = fintechAnalyticInteractor;
        this.f12068i = fintechUltraManager.d();
        this.f12070k = fintechUltraManager.i() && fintechUltraManager.f();
        this.f12071l = O0.a(null);
        this.f12072m = O0.a(new FinToolbarState(application.getString(R.string.fintech_preference_title_toolbar), null, null, null, null, null, null, null, null, Integer.valueOf(R.drawable.ic_m_disclosure_back_filled), "graphicTertiary", new o(this, 1), null, null, null, null, 17, 61950, null));
        this.f12073n = O0.a(null);
        this.f12074o = "";
        this.f12075p = fintechSettings.k();
    }

    public static Unit d0(f fVar, ActionResult2 result) {
        Intrinsics.checkNotNullParameter(result, "result");
        L80.a.a("FintechThemeViewModel", "ActionResult2UI: " + result);
        String type = result.getType();
        if (Intrinsics.d(type, "CLICK")) {
            Activity c11 = fVar.f12066g.c();
            if (c11 != null) {
                fVar.f12063d.c(c11, fVar.f12068i);
            }
        } else if (Intrinsics.d(type, "DISMISSED")) {
            Activity c12 = fVar.f12066g.c();
            n nVar = fVar.f12063d;
            if (c12 != null) {
                nVar.l(c12);
            }
            fVar.f12068i = nVar.d();
            fVar.handleState();
        }
        return Unit.f71690a;
    }

    public static Unit e0(f fVar) {
        fVar.f12061b.pop();
        return Unit.f71690a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Unit f0(f fVar, ActionResult2UI actionResult2UI) {
        Intrinsics.checkNotNullParameter(actionResult2UI, "<unused var>");
        boolean z11 = fVar.f12068i;
        boolean z12 = !z11;
        if (z12 != z11) {
            fVar.f12068i = z12;
            fVar.handleState();
            Activity c11 = fVar.f12066g.c();
            if (c11 != null) {
                fVar.f12063d.j(c11);
            }
            CbottomType cbottomType = CbottomType.SHEET;
            Application application = fVar.f12065f;
            Boolean bool = null;
            Boolean bool2 = null;
            Integer num = null;
            Integer num2 = null;
            Integer num3 = null;
            Integer num4 = null;
            Integer num5 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            TextItemV20DTO textItemV20DTO = new TextItemV20DTO(null, "text1", null, null, null, bool, bool2, null, null, num, num2, null, C7714v.b0(16, 12, 16, 2), null, null, null, null, null, null, null, null, null, num3, num4, num5, null, null, application.getString(R.string.fintech_ultra_cbottom_title), "tsHeadL", CommonText.TextMedium.DEFAULT_TEXT_COLOR, null, null, str, str2, str3, null, null, -939528195, 31, null);
            TextItemV20DTO textItemV20DTO2 = new TextItemV20DTO(null, "text2", null == true ? 1 : 0, null == true ? 1 : 0, bool, bool2, null == true ? 1 : 0, null == true ? 1 : 0, num, num2, null == true ? 1 : 0, null, C7714v.b0(16, 2, 16, 0), null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, num3, num4, num5, null == true ? 1 : 0, null == true ? 1 : 0, null, application.getString(R.string.fintech_ultra_cbottom_subtitle), "tsBodyL", "ozTextSecondary", null == true ? 1 : 0, str, str2, str3, null == true ? 1 : 0, null == true ? 1 : 0, null, -939528195, 31, null);
            String string = application.getString(R.string.fintech_ultra_cbottom_button);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            ButtonV3DTO.Sizes sizes = ButtonV3DTO.Sizes.SIZE_500;
            Object[] objArr = null == true ? 1 : 0;
            Object[] objArr2 = null == true ? 1 : 0;
            Object[] objArr3 = null == true ? 1 : 0;
            Object[] objArr4 = null == true ? 1 : 0;
            Object[] objArr5 = null == true ? 1 : 0;
            Object[] objArr6 = null == true ? 1 : 0;
            Object[] objArr7 = null == true ? 1 : 0;
            Object[] objArr8 = null == true ? 1 : 0;
            Object[] objArr9 = null == true ? 1 : 0;
            Object[] objArr10 = null == true ? 1 : 0;
            Object[] objArr11 = null == true ? 1 : 0;
            Object[] objArr12 = null == true ? 1 : 0;
            Object[] objArr13 = null == true ? 1 : 0;
            Object[] objArr14 = null == true ? 1 : 0;
            Object[] objArr15 = null == true ? 1 : 0;
            Object[] objArr16 = null == true ? 1 : 0;
            List b02 = C7714v.b0(textItemV20DTO, textItemV20DTO2, new FinButtonV22DTO(null, "reload_button", objArr, Boolean.TRUE, bool2, objArr2, objArr3, num, num2, objArr4, null == true ? 1 : 0, null, C7714v.b0(16, 24, 16, 24), objArr5, objArr6, objArr7, objArr8, objArr9, objArr10, objArr11, num3, num4, num5, objArr12, objArr13, null == true ? 1 : 0, null, null, string, sizes, str, str2, str3, objArr14, objArr15, null == true ? 1 : 0, null, null, objArr16, null, false, null, null, null, null, null, -805310475, 16383, null));
            Boolean bool3 = Boolean.FALSE;
            fVar.f12062c.g(new Cbottom2SheetDTO("ultra_bs", null == true ? 1 : 0, null, b02, null == true ? 1 : 0, null == true ? 1 : 0, bool3, bool3, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, 6, null == true ? 1 : 0), cbottomType, fVar.f12074o, null);
        }
        return Unit.f71690a;
    }

    public static final void i0(f fVar, Integer num) {
        B0 b02 = fVar.f12069j;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        int intValue = num != null ? num.intValue() : -1;
        fVar.f12075p = intValue;
        fVar.handleState();
        fVar.f12069j = C10727i.c(androidx.lifecycle.x0.a(fVar), null, null, new g(fVar, intValue, null), 3);
    }

    private final boolean n0(a aVar) {
        int i11 = b.f12076a[aVar.ordinal()];
        if (i11 == 1) {
            return this.f12075p == 1 && !this.f12068i;
        }
        if (i11 == 2) {
            return this.f12075p == 2 || this.f12068i;
        }
        if (i11 == 3) {
            return this.f12075p == -1 && !this.f12068i;
        }
        throw new Sc.o();
    }

    public final void handleState() {
        this.f12071l.setValue(new K90.a(new FinRadioButtonV2State(1, R.string.fintech_preference_title_light, n0(a.LIGHT), !this.f12068i, Integer.valueOf(R.drawable.fintech_light_with_line_main_tmp), new c(1, this, f.class, "handleOnClick", "handleOnClick(Ljava/lang/Integer;)V", 0)), new FinRadioButtonV2State(2, R.string.fintech_preference_title_night, n0(a.DARK), !this.f12068i, Integer.valueOf(R.drawable.fintech_dark_with_line_main_tmp), new d(1, this, f.class, "handleOnClick", "handleOnClick(Ljava/lang/Integer;)V", 0)), new FinRadioButtonV2State(-1, R.string.fintech_preference_title_system, n0(a.FOLLOW_SYSTEM), !this.f12068i, Integer.valueOf(R.drawable.fintech_system_with_line_main_tmp), new e(1, this, f.class, "handleOnClick", "handleOnClick(Ljava/lang/Integer;)V", 0))));
        if (this.f12070k) {
            this.f12073n.setValue(new ToggleAtomWrapperState(new Common(P4.f.b("toString(...)"), "ultra_toggle", null, Boolean.TRUE, null, null, null, new I90.d(this, 0), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -268435456, 1, null), new ToggleDTO(Boolean.valueOf(this.f12068i), null, null, null, null, null, 62, null)));
        }
    }

    @NotNull
    public final x0<K90.a> j0() {
        return this.f12071l;
    }

    @NotNull
    public final x0<FinToolbarState> k0() {
        return this.f12072m;
    }

    @NotNull
    public final x0<ToggleAtomWrapperState> l0() {
        return this.f12073n;
    }

    public final void m0(@NotNull String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        this.f12074o = uuid;
        this.f12067h.f();
    }

    public final void onStart() {
        if (this.f12070k) {
            ActionResult2.Companion companion = ActionResult2.INSTANCE;
            String str = this.f12074o;
            companion.getClass();
            this.f12064e.b(ActionResult2.Companion.a(str), androidx.lifecycle.x0.a(this), false, new I90.e(this, 0));
        }
    }

    public final void onStop() {
        if (this.f12070k) {
            ActionResult2.Companion companion = ActionResult2.INSTANCE;
            String str = this.f12074o;
            companion.getClass();
            this.f12064e.a(ActionResult2.Companion.a(str));
        }
    }
}
