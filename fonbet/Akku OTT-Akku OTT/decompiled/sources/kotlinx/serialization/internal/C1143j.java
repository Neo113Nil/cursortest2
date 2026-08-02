package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@PublishedApi
/* renamed from: kotlinx.serialization.internal.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1143j extends G0<byte[]> {
    public byte[] a;
    public int b;

    @Override // kotlinx.serialization.internal.G0
    public final byte[] a() {
        byte[] copyOf = Arrays.copyOf(this.a, this.b);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // kotlinx.serialization.internal.G0
    public final void b(int i) {
        byte[] bArr = this.a;
        if (bArr.length < i) {
            byte[] copyOf = Arrays.copyOf(bArr, RangesKt.coerceAtLeast(i, bArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.a = copyOf;
        }
    }

    @Override // kotlinx.serialization.internal.G0
    public final int d() {
        return this.b;
    }
}
