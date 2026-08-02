package F0;

import B0.EnumC2526y0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class v extends AbstractC7737t implements Function0<String> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2990k f8357b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ EnumC2526y0 f8358c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v(C2990k c2990k, EnumC2526y0 enumC2526y0) {
        super(0);
        this.f8357b = c2990k;
        this.f8358c = enumC2526y0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return "Selection Handle drag cancelled for draggingHandle: " + this.f8357b.N() + " definedOn: " + this.f8358c;
    }
}
