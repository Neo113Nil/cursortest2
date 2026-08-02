package J0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class K1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ float f12888b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f12889c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ long f12890d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ long f12891e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f12892f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    K1(float f7, androidx.compose.ui.e eVar, long j11, long j12, int i11, int i12) {
        super(2);
        this.f12888b = f7;
        this.f12889c = eVar;
        this.f12890d = j11;
        this.f12891e = j12;
        this.f12892f = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(1);
        androidx.compose.ui.e eVar = this.f12889c;
        long j11 = this.f12890d;
        I1.b(this.f12888b, eVar, j11, this.f12891e, interfaceC3967k, this.f12892f, e11);
        return Unit.f71690a;
    }
}
