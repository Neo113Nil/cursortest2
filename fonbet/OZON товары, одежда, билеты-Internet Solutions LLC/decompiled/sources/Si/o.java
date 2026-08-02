package Si;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
final class o extends AbstractC7737t implements Function0<Integer> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f26336b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(e eVar) {
        super(0);
        this.f26336b = eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf(this.f26336b.G0().size());
    }
}
