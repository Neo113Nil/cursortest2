package B20;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class b extends AbstractC7737t implements Function1<D20.a, Comparable<?>> {

    /* renamed from: b, reason: collision with root package name */
    public static final b f2196b = new b(1);

    @Override // kotlin.jvm.functions.Function1
    public final Comparable<?> invoke(D20.a aVar) {
        D20.a it = aVar;
        Intrinsics.checkNotNullParameter(it, "it");
        return it.b();
    }
}
