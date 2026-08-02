package androidx.compose.material;

import J0.C3326o1;
import J0.EnumC3337r1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class L extends AbstractC7737t implements Function1<J0.N<EnumC3337r1>, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ float f39922b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f39923c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    L(float f7, C3326o1 c3326o1, long j11) {
        super(1);
        this.f39922b = f7;
        this.f39923c = j11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(J0.N<EnumC3337r1> n11) {
        J0.N<EnumC3337r1> n12 = n11;
        EnumC3337r1 enumC3337r1 = EnumC3337r1.Hidden;
        float f7 = this.f39922b;
        n12.a(enumC3337r1, f7);
        float f11 = f7 / 2.0f;
        long j11 = this.f39923c;
        if (((int) (j11 & 4294967295L)) > f11) {
            n12.a(EnumC3337r1.HalfExpanded, f11);
        }
        int i11 = (int) (j11 & 4294967295L);
        if (i11 != 0) {
            n12.a(EnumC3337r1.Expanded, Math.max(0.0f, f7 - i11));
        }
        return Unit.f71690a;
    }
}
