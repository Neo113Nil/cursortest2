package P9;

import androidx.compose.ui.e;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a {
    public static final long a(float f7, float f11) {
        return (Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f7) << 32);
    }

    public static void b(e eVar, String id2) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(id2, "id");
    }

    public static final boolean c(long j11) {
        long j12 = (j11 & 9187343241974906880L) ^ 9187343241974906880L;
        return (((~j12) & (j12 - 4294967297L)) & (-9223372034707292160L)) == 0;
    }

    public static final boolean d(long j11) {
        return (j11 & 9223372034707292159L) != 9205357640488583168L;
    }

    public static final boolean e(long j11) {
        return (j11 & 9223372034707292159L) == 9205357640488583168L;
    }
}
