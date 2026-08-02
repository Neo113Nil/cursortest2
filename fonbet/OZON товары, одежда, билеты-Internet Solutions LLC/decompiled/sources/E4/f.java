package E4;

import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
final class f extends AbstractC7737t implements Function1<Pair<? extends String, ? extends Boolean>, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f7459b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(String str) {
        super(1);
        this.f7459b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Pair<? extends String, ? extends Boolean> pair) {
        Pair<? extends String, ? extends Boolean> it = pair;
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(Intrinsics.d(it.e(), this.f7459b));
    }
}
