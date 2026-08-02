package P0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: P0.i0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3742i0 extends AbstractC7737t implements Function1<Q0.d<EnumC3790y1>, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ float f21079b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f21080c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C3787x1 f21081d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3742i0(float f7, long j11, C3787x1 c3787x1) {
        super(1);
        this.f21079b = f7;
        this.f21080c = j11;
        this.f21081d = c3787x1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Q0.d<EnumC3790y1> dVar) {
        Q0.d<EnumC3790y1> dVar2 = dVar;
        EnumC3790y1 enumC3790y1 = EnumC3790y1.Hidden;
        float f7 = this.f21079b;
        dVar2.a(enumC3790y1, f7);
        int i11 = (int) (this.f21080c & 4294967295L);
        float f11 = i11;
        if (f11 > f7 / 2 && !this.f21081d.g()) {
            dVar2.a(EnumC3790y1.PartiallyExpanded, f7 / 2.0f);
        }
        if (i11 != 0) {
            dVar2.a(EnumC3790y1.Expanded, Math.max(0.0f, f7 - f11));
        }
        return Unit.f71690a;
    }
}
