package D1;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: D1.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2814n implements Comparator<H> {
    @Override // java.util.Comparator
    public final int compare(H h11, H h12) {
        H h13 = h11;
        H h14 = h12;
        int i11 = Intrinsics.i(h13.F(), h14.F());
        return i11 != 0 ? i11 : Intrinsics.i(h13.hashCode(), h14.hashCode());
    }
}
