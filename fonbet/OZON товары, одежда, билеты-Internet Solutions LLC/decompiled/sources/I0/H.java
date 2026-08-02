package I0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class H extends AbstractC7737t implements Function0<Integer> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3218y f11321b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f11322c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    H(C3218y c3218y, int i11) {
        super(0);
        this.f11321b = c3218y;
        this.f11322c = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf(this.f11321b.i().p(this.f11322c));
    }
}
