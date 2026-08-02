package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@PublishedApi
/* loaded from: classes5.dex */
public final class P0 extends G0<short[]> {
    public short[] a;
    public int b;

    @Override // kotlinx.serialization.internal.G0
    public final short[] a() {
        short[] copyOf = Arrays.copyOf(this.a, this.b);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // kotlinx.serialization.internal.G0
    public final void b(int i) {
        short[] sArr = this.a;
        if (sArr.length < i) {
            short[] copyOf = Arrays.copyOf(sArr, RangesKt.coerceAtLeast(i, sArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.a = copyOf;
        }
    }

    @Override // kotlinx.serialization.internal.G0
    public final int d() {
        return this.b;
    }
}
