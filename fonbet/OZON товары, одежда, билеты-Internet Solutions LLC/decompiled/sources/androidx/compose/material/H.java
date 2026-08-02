package androidx.compose.material;

import Bl0.C2652m;
import J0.C3326o1;
import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.framework.presentation.ai.R0;

/* loaded from: classes8.dex */
final class H extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C4912a f39894b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f39895c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C3326o1 f39896d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f39897e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ A0.a f39898f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ float f39899g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ long f39900h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ long f39901i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ long f39902j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ int f39903k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    H(C4912a c4912a, androidx.compose.ui.e eVar, C3326o1 c3326o1, boolean z11, A0.a aVar, float f7, long j11, long j12, long j13, int i11) {
        super(2);
        C4912a c4912a2 = R0.f89339a;
        this.f39894b = c4912a;
        this.f39895c = eVar;
        this.f39896d = c3326o1;
        this.f39897e = z11;
        this.f39898f = aVar;
        this.f39899g = f7;
        this.f39900h = j11;
        this.f39901i = j12;
        this.f39902j = j13;
        this.f39903k = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        num.intValue();
        int e11 = C2652m.e(this.f39903k | 1);
        C4912a c4912a = R0.f89339a;
        I.a(this.f39894b, this.f39895c, this.f39896d, this.f39897e, this.f39898f, this.f39899g, this.f39900h, this.f39901i, this.f39902j, interfaceC3967k2, e11);
        return Unit.f71690a;
    }
}
