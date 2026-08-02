package kotlinx.serialization.internal;

import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.l;

/* loaded from: classes5.dex */
public final class E {
    public static final long[] e = new long[0];
    public final kotlinx.serialization.descriptors.f a;
    public final l.a b;
    public long c;
    public final long[] d;

    public E(kotlinx.serialization.descriptors.f descriptor, l.a readIfAbsent) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(readIfAbsent, "readIfAbsent");
        this.a = descriptor;
        this.b = readIfAbsent;
        int d = descriptor.d();
        if (d <= 64) {
            this.c = d != 64 ? (-1) << d : 0L;
            this.d = e;
            return;
        }
        this.c = 0L;
        long[] jArr = new long[(d - 1) >>> 6];
        if ((d & 63) != 0) {
            jArr[ArraysKt.getLastIndex(jArr)] = (-1) << d;
        }
        this.d = jArr;
    }
}
