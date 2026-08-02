package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@PublishedApi
/* renamed from: kotlinx.serialization.internal.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1137g extends G0<boolean[]> {
    public boolean[] a;
    public int b;

    @Override // kotlinx.serialization.internal.G0
    public final boolean[] a() {
        boolean[] copyOf = Arrays.copyOf(this.a, this.b);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // kotlinx.serialization.internal.G0
    public final void b(int i) {
        boolean[] zArr = this.a;
        if (zArr.length < i) {
            boolean[] copyOf = Arrays.copyOf(zArr, RangesKt.coerceAtLeast(i, zArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.a = copyOf;
        }
    }

    @Override // kotlinx.serialization.internal.G0
    public final int d() {
        return this.b;
    }
}
