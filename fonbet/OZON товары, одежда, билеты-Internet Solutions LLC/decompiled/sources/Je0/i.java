package Je0;

import Qj0.C3902w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class i extends AbstractC7737t implements Function1<C3902w, C3902w> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f f14675b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Long f14676c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(f fVar, Long l11) {
        super(1);
        this.f14675b = fVar;
        this.f14676c = l11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C3902w invoke(C3902w c3902w) {
        C3902w it = c3902w;
        Intrinsics.checkNotNullParameter(it, "it");
        return f.b(this.f14675b, it, null, null, null, null, null, null, Integer.valueOf((int) this.f14676c.longValue()), null, null, null, null, null, 522239);
    }
}
