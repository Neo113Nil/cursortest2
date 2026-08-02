package K20;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class h extends AbstractC7737t implements Function1<L20.a, Object> {

    /* renamed from: b, reason: collision with root package name */
    public static final h f15141b = new h(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(L20.a aVar) {
        L20.a it = aVar;
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getId();
    }
}
