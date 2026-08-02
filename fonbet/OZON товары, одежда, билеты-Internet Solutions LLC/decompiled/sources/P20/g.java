package P20;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class g extends AbstractC7737t implements Function2<Integer, b, Object> {

    /* renamed from: b, reason: collision with root package name */
    public static final g f21707b = new g(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Integer num, b bVar) {
        num.intValue();
        b pkg = bVar;
        Intrinsics.checkNotNullParameter(pkg, "pkg");
        return pkg.a();
    }
}
