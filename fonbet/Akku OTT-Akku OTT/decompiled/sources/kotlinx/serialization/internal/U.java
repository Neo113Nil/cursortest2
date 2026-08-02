package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@PublishedApi
/* loaded from: classes5.dex */
public final class U extends G0<int[]> {
    public int[] a;
    public int b;

    @Override // kotlinx.serialization.internal.G0
    public final int[] a() {
        int[] copyOf = Arrays.copyOf(this.a, this.b);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // kotlinx.serialization.internal.G0
    public final void b(int i) {
        int[] iArr = this.a;
        if (iArr.length < i) {
            int[] copyOf = Arrays.copyOf(iArr, RangesKt.coerceAtLeast(i, iArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.a = copyOf;
        }
    }

    @Override // kotlinx.serialization.internal.G0
    public final int d() {
        return this.b;
    }
}
