package Je0;

import Qj0.C3902w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
final class h extends AbstractC7737t implements Function1<C3902w, C3902w> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f f14673b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Long f14674c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(f fVar, Long l11) {
        super(1);
        this.f14673b = fVar;
        this.f14674c = l11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C3902w invoke(C3902w c3902w) {
        C3902w it = c3902w;
        Intrinsics.checkNotNullParameter(it, "it");
        return f.b(this.f14673b, it, null, null, null, null, null, null, null, null, null, null, null, Integer.valueOf((int) this.f14674c.longValue()), 458751);
    }
}
