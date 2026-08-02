package Ob;

import Sc.C;
import Sc.y;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Ob.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C3678a {
    public static final long a(int i11, @NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        byte b11 = bArr[i11];
        y.Companion companion = y.INSTANCE;
        long j11 = ((bArr[i11 + 7] & 255) << 56) | (b11 & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16) | ((bArr[i11 + 3] & 255) << 24) | ((bArr[i11 + 4] & 255) << 32) | ((bArr[i11 + 5] & 255) << 40) | ((bArr[i11 + 6] & 255) << 48);
        C.Companion companion2 = C.INSTANCE;
        return j11;
    }

    private static final int b(char c11) {
        if ('0' <= c11 && c11 < ':') {
            return c11 - '0';
        }
        if ('A' <= c11 && c11 < 'G') {
            return c11 - '7';
        }
        if ('a' <= c11 && c11 < 'g') {
            return c11 - 'W';
        }
        throw new IllegalArgumentException("'" + c11 + "' is not a valid hex character");
    }

    @NotNull
    public static final byte[] c(@NotNull String hexString) {
        Intrinsics.checkNotNullParameter(hexString, "hexString");
        if (hexString.length() % 2 != 0) {
            throw new IllegalArgumentException(hexString.toString());
        }
        byte[] bArr = new byte[hexString.length() / 2];
        for (int i11 = 0; i11 < hexString.length(); i11 += 2) {
            bArr[i11 / 2] = (byte) ((b(hexString.charAt(i11)) << 4) + b(hexString.charAt(i11 + 1)));
        }
        return bArr;
    }
}
