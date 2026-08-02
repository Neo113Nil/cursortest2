package Ve;

import java.util.Base64;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* renamed from: Ve.p, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4515p {
    public static String a(String encoded) {
        Intrinsics.checkNotNullParameter(encoded, "encoded");
        Intrinsics.checkNotNullParameter("MAX", "secret");
        byte[] outerDecoded = Base64.getDecoder().decode(encoded);
        Intrinsics.checkNotNullExpressionValue(outerDecoded, "outerDecoded");
        byte[] v11 = C7705l.v(2, outerDecoded.length - 2, outerDecoded);
        Intrinsics.checkNotNullParameter(v11, "<this>");
        if (v11.length != 0) {
            byte[] bArr = new byte[v11.length];
            Intrinsics.checkNotNullParameter(v11, "<this>");
            int length = v11.length - 1;
            if (length >= 0) {
                int i11 = 0;
                while (true) {
                    bArr[length - i11] = v11[i11];
                    if (i11 == length) {
                        break;
                    }
                    i11++;
                }
            }
            v11 = bArr;
        }
        byte[] bytes = "MAX".getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] bArr2 = new byte[v11.length];
        int length2 = v11.length;
        for (int i12 = 0; i12 < length2; i12++) {
            bArr2[i12] = (byte) (v11[i12] ^ bytes[i12 % bytes.length]);
        }
        byte[] originalBytes = Base64.getDecoder().decode(bArr2);
        Intrinsics.checkNotNullExpressionValue(originalBytes, "originalBytes");
        return new String(originalBytes, Charsets.UTF_8);
    }
}
