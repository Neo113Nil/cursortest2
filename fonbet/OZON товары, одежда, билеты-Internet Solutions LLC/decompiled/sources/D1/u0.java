package D1;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class u0 implements Comparator<H> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final u0 f5555a = new u0();

    @Override // java.util.Comparator
    public final int compare(H h11, H h12) {
        H h13 = h11;
        H h14 = h12;
        int i11 = Intrinsics.i(h14.F(), h13.F());
        return i11 != 0 ? i11 : Intrinsics.i(h13.hashCode(), h14.hashCode());
    }
}
