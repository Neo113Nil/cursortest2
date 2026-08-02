package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.PublishedApi;
import kotlin.UShortArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@PublishedApi
@ExperimentalUnsignedTypes
/* loaded from: classes5.dex */
public final class f1 extends G0<UShortArray> {
    public short[] a;
    public int b;

    @Override // kotlinx.serialization.internal.G0
    public final UShortArray a() {
        short[] copyOf = Arrays.copyOf(this.a, this.b);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return UShortArray.m2048boximpl(UShortArray.m2050constructorimpl(copyOf));
    }

    @Override // kotlinx.serialization.internal.G0
    public final void b(int i) {
        if (UShortArray.m2056getSizeimpl(this.a) < i) {
            short[] sArr = this.a;
            short[] copyOf = Arrays.copyOf(sArr, RangesKt.coerceAtLeast(i, UShortArray.m2056getSizeimpl(sArr) * 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.a = UShortArray.m2050constructorimpl(copyOf);
        }
    }

    @Override // kotlinx.serialization.internal.G0
    public final int d() {
        return this.b;
    }
}
