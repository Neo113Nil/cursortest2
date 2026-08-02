package B4;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
final class K extends AbstractC7737t implements Function1<H, H> {

    /* renamed from: b, reason: collision with root package name */
    public static final K f2534b = new K(1);

    @Override // kotlin.jvm.functions.Function1
    public final H invoke(H h11) {
        H it = h11;
        Intrinsics.checkNotNullParameter(it, "it");
        if (!(it instanceof L)) {
            return null;
        }
        L l11 = (L) it;
        return l11.C(l11.F(), l11, false);
    }
}
