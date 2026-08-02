package Uc;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class a extends c {
    public static boolean a() {
        return Arrays.equals((short[]) null, (short[]) null);
    }

    public static boolean b() {
        return Arrays.equals((int[]) null, (int[]) null);
    }

    public static boolean c(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            bArr = null;
        }
        if (bArr2 == null) {
            bArr2 = null;
        }
        return Arrays.equals(bArr, bArr2);
    }

    public static boolean d() {
        return Arrays.equals((long[]) null, (long[]) null);
    }

    public static void e(int i11, long j11, long[] fill) {
        int i12 = (i11 & 2) != 0 ? 0 : 1;
        int length = fill.length;
        Intrinsics.checkNotNullParameter(fill, "$this$fill");
        Intrinsics.checkNotNullParameter(fill, "<this>");
        Arrays.fill(fill, i12, length, j11);
    }
}
