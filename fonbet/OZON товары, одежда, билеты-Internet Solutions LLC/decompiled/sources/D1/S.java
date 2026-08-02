package D1;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
final class S extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ L f5375b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f5376c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    S(L l11, long j11) {
        super(0);
        this.f5375b = l11;
        this.f5376c = j11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Y c22 = this.f5375b.K().c2();
        Intrinsics.f(c22);
        c22.a0(this.f5376c);
        return Unit.f71690a;
    }
}
