package B4;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
final class r extends AbstractC7737t implements Function1<H, H> {

    /* renamed from: b, reason: collision with root package name */
    public static final r f2707b = new r(1);

    @Override // kotlin.jvm.functions.Function1
    public final H invoke(H h11) {
        H destination = h11;
        Intrinsics.checkNotNullParameter(destination, "destination");
        L o11 = destination.o();
        if (o11 == null || o11.F() != destination.m()) {
            return null;
        }
        return destination.o();
    }
}
