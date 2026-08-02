package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.PublishedApi;
import kotlin.ULongArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@PublishedApi
@ExperimentalUnsignedTypes
/* loaded from: classes5.dex */
public final class c1 extends G0<ULongArray> {
    public long[] a;
    public int b;

    @Override // kotlinx.serialization.internal.G0
    public final ULongArray a() {
        long[] copyOf = Arrays.copyOf(this.a, this.b);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return ULongArray.m1943boximpl(ULongArray.m1945constructorimpl(copyOf));
    }

    @Override // kotlinx.serialization.internal.G0
    public final void b(int i) {
        if (ULongArray.m1951getSizeimpl(this.a) < i) {
            long[] jArr = this.a;
            long[] copyOf = Arrays.copyOf(jArr, RangesKt.coerceAtLeast(i, ULongArray.m1951getSizeimpl(jArr) * 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.a = ULongArray.m1945constructorimpl(copyOf);
        }
    }

    @Override // kotlinx.serialization.internal.G0
    public final int d() {
        return this.b;
    }
}
