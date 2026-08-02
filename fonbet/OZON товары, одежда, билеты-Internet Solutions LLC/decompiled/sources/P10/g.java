package P10;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.K;
import ru.ozon.composer.ui.widget.l;

/* loaded from: classes3.dex */
final class g extends AbstractC7737t implements Function1<l, CharSequence> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ K f21650b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(K k11) {
        super(1);
        this.f21650b = k11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(l lVar) {
        l it = lVar;
        Intrinsics.checkNotNullParameter(it, "it");
        K k11 = this.f21650b;
        int i11 = k11.f71785a;
        k11.f71785a = i11 + 1;
        return "(position = " + i11 + ", item = " + it + ")";
    }
}
