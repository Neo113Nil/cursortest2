package J0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import q1.AbstractC8972b;

/* loaded from: classes.dex */
final class R0 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC8972b f12961b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f12962c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f12963d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ long f12964e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f12965f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    R0(AbstractC8972b abstractC8972b, String str, androidx.compose.ui.e eVar, long j11, int i11) {
        super(2);
        this.f12961b = abstractC8972b;
        this.f12962c = str;
        this.f12963d = eVar;
        this.f12964e = j11;
        this.f12965f = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        T0.a(this.f12961b, this.f12962c, this.f12963d, this.f12964e, interfaceC3967k, C2652m.e(this.f12965f | 1));
        return Unit.f71690a;
    }
}
