package K70;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final char[] f15327a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Map<Character, Integer> f15328b;

    static {
        char[] charArray = "0123456789abcdef".toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
        f15327a = charArray;
        ArrayList arrayList = new ArrayList(charArray.length);
        int length = charArray.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            arrayList.add(new Pair(Character.valueOf(charArray[i11]), Integer.valueOf(i12)));
            i11++;
            i12++;
        }
        f15328b = U.s(arrayList);
    }

    @NotNull
    public static final String a(@NotNull byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (bytes.length == 0) {
            return "";
        }
        char[] cArr = new char[bytes.length * 2];
        int length = bytes.length;
        for (int i11 = 0; i11 < length; i11++) {
            byte b11 = bytes[i11];
            int i12 = i11 * 2;
            char[] cArr2 = f15327a;
            cArr[i12] = cArr2[(b11 & 255) >>> 4];
            cArr[i12 + 1] = cArr2[b11 & 15];
        }
        return new String(cArr);
    }

    @NotNull
    public static final byte[] b(@NotNull String base32) {
        Intrinsics.checkNotNullParameter(base32, "base32");
        String X9 = kotlin.text.h.X(base32, "=", "", false);
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String upperCase = X9.toUpperCase(US);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        if (upperCase.length() == 0) {
            return new byte[0];
        }
        int length = upperCase.length();
        ArrayList arrayList = new ArrayList(32);
        int i11 = 0;
        int i12 = 0;
        while (i11 < 32) {
            arrayList.add(new Pair(Character.valueOf("ABCDEFGHIJKLMNOPQRSTUVWXYZ234567".charAt(i11)), Integer.valueOf(i12)));
            i11++;
            i12++;
        }
        Map s11 = U.s(arrayList);
        byte[] bArr = new byte[(length * 5) / 8];
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < length; i16++) {
            char charAt = upperCase.charAt(i16);
            Integer num = (Integer) s11.get(Character.valueOf(charAt));
            if (num == null) {
                throw new IllegalArgumentException(Pk0.i.a("Invalid Base32 character: ", charAt));
            }
            i13 = (i13 << 5) | num.intValue();
            int i17 = i14 + 5;
            if (i17 >= 8) {
                i14 -= 3;
                bArr[i15] = (byte) (i13 >> i14);
                i15++;
            } else {
                i14 = i17;
            }
        }
        return bArr;
    }
}
