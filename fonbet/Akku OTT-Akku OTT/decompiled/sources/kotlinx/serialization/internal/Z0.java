package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.PublishedApi;
import kotlin.UIntArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@PublishedApi
@ExperimentalUnsignedTypes
/* loaded from: classes5.dex */
public final class Z0 extends G0<UIntArray> {
    public int[] a;
    public int b;

    @Override // kotlinx.serialization.internal.G0
    public final UIntArray a() {
        int[] copyOf = Arrays.copyOf(this.a, this.b);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return UIntArray.m1864boximpl(UIntArray.m1866constructorimpl(copyOf));
    }

    @Override // kotlinx.serialization.internal.G0
    public final void b(int i) {
        if (UIntArray.m1872getSizeimpl(this.a) < i) {
            int[] iArr = this.a;
            int[] copyOf = Arrays.copyOf(iArr, RangesKt.coerceAtLeast(i, UIntArray.m1872getSizeimpl(iArr) * 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.a = UIntArray.m1866constructorimpl(copyOf);
        }
    }

    @Override // kotlinx.serialization.internal.G0
    public final int d() {
        return this.b;
    }
}
