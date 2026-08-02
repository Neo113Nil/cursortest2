package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@PublishedApi
/* renamed from: kotlinx.serialization.internal.p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1155p extends G0<char[]> {
    public char[] a;
    public int b;

    @Override // kotlinx.serialization.internal.G0
    public final char[] a() {
        char[] copyOf = Arrays.copyOf(this.a, this.b);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // kotlinx.serialization.internal.G0
    public final void b(int i) {
        char[] cArr = this.a;
        if (cArr.length < i) {
            char[] copyOf = Arrays.copyOf(cArr, RangesKt.coerceAtLeast(i, cArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.a = copyOf;
        }
    }

    @Override // kotlinx.serialization.internal.G0
    public final int d() {
        return this.b;
    }
}
