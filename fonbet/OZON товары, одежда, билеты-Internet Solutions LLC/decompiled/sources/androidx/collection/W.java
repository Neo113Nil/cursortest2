package androidx.collection;

import Gl.C3124a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class W {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final long[] f38661a = {-9187201950435737345L, -1};

    static {
        new L(0);
    }

    public static final void a(@NotNull long[] metadata, int i11) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        int i12 = (i11 + 7) >> 3;
        for (int i13 = 0; i13 < i12; i13++) {
            long j11 = metadata[i13] & (-9187201950435737472L);
            metadata[i13] = (-72340172838076674L) & ((~j11) + (j11 >>> 7));
        }
        Intrinsics.checkNotNullParameter(metadata, "<this>");
        int length = metadata.length;
        int i14 = length - 1;
        int i15 = length - 2;
        metadata[i15] = (metadata[i15] & 72057594037927935L) | (-72057594037927936L);
        metadata[i14] = metadata[0];
    }

    public static final int b(@NotNull long[] metadata, int i11, int i12) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        while (i11 < i12) {
            if (((metadata[i11 >> 3] >> ((i11 & 7) << 3)) & 255) == 128) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public static final int c(int i11) {
        if (i11 == 7) {
            return 6;
        }
        return i11 - (i11 / 8);
    }

    public static final int d(int i11) {
        if (i11 == 0) {
            return 6;
        }
        return (i11 * 2) + 1;
    }

    public static final int e(int i11) {
        if (i11 > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i11);
        }
        return 0;
    }

    public static final int f(int i11) {
        if (i11 == 7) {
            return 8;
        }
        return C3124a.a(i11, 1, 7, i11);
    }
}
