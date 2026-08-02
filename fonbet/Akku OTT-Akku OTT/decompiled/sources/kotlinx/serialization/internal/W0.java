package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.PublishedApi;
import kotlin.UByteArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@PublishedApi
@ExperimentalUnsignedTypes
/* loaded from: classes5.dex */
public final class W0 extends G0<UByteArray> {
    public byte[] a;
    public int b;

    @Override // kotlinx.serialization.internal.G0
    public final UByteArray a() {
        byte[] copyOf = Arrays.copyOf(this.a, this.b);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return UByteArray.m1785boximpl(UByteArray.m1787constructorimpl(copyOf));
    }

    @Override // kotlinx.serialization.internal.G0
    public final void b(int i) {
        if (UByteArray.m1793getSizeimpl(this.a) < i) {
            byte[] bArr = this.a;
            byte[] copyOf = Arrays.copyOf(bArr, RangesKt.coerceAtLeast(i, UByteArray.m1793getSizeimpl(bArr) * 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.a = UByteArray.m1787constructorimpl(copyOf);
        }
    }

    @Override // kotlinx.serialization.internal.G0
    public final int d() {
        return this.b;
    }
}
