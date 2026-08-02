package F0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class t extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.L f8349b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C2990k f8350c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.L f8351d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(C2990k c2990k, kotlin.jvm.internal.L l11, kotlin.jvm.internal.L l12) {
        super(0);
        this.f8349b = l11;
        this.f8350c = c2990k;
        this.f8351d = l12;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        kotlin.jvm.internal.L l11 = this.f8351d;
        C2990k.G(this.f8350c, this.f8349b, l11);
        return Unit.f71690a;
    }
}
