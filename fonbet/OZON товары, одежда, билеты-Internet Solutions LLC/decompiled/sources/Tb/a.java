package Tb;

import Sc.A;
import Sc.C;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes9.dex */
public final class a {
    public static final int a(@NotNull byte[] bArr, @NotNull byte[] other) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (bArr.length != other.length) {
            return 0;
        }
        int length = bArr.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            i11 |= bArr[i12] ^ other[i12];
        }
        A.Companion companion = A.INSTANCE;
        C.Companion companion2 = C.INSTANCE;
        return (int) (((i11 & 4294967295L) - 1) >>> 63);
    }
}
