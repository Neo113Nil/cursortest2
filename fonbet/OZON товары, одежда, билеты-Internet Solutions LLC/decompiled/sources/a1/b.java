package a1;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.videomoleculecompose.slots.timebar.SlimTimeBarBehavior;
import ru.ozon.app.android.videomoleculecompose.slots.timebar.SlimTimeBarState;
import ru.ozon.app.android.videomoleculecompose.slots.timebar.SlimTimeBarStyle;

/* loaded from: classes8.dex */
final class b extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C4912a f36170b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ SlimTimeBarState f36171c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f36172d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ SlimTimeBarStyle f36173e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ SlimTimeBarBehavior f36174f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Function1 f36175g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ Function1 f36176h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ Function2 f36177i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ int f36178j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(C4912a c4912a, SlimTimeBarState slimTimeBarState, androidx.compose.ui.e eVar, SlimTimeBarStyle slimTimeBarStyle, SlimTimeBarBehavior slimTimeBarBehavior, Function1 function1, Function1 function12, Function2 function2, int i11) {
        super(2);
        this.f36170b = c4912a;
        this.f36171c = slimTimeBarState;
        this.f36172d = eVar;
        this.f36173e = slimTimeBarStyle;
        this.f36174f = slimTimeBarBehavior;
        this.f36175g = function1;
        this.f36176h = function12;
        this.f36177i = function2;
        this.f36178j = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f36178j) | 1;
        C4912a c4912a = this.f36170b;
        Function1 function1 = this.f36175g;
        Function1 function12 = this.f36176h;
        c4912a.f(this.f36171c, this.f36172d, this.f36173e, this.f36174f, function1, function12, this.f36177i, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
