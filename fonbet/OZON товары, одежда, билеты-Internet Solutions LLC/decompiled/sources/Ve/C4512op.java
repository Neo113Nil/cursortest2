package Ve;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* renamed from: Ve.op, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4512op {
    public static String a(String source) {
        MessageDigest messageDigest;
        Intrinsics.checkNotNullParameter(source, "source");
        try {
            try {
                messageDigest = MessageDigest.getInstance("SHA-256");
            } catch (NoSuchAlgorithmException e11) {
                e11.printStackTrace();
                messageDigest = null;
            }
            Intrinsics.f(messageDigest);
            messageDigest.reset();
            byte[] bytes = source.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            byte[] digest = messageDigest.digest(bytes);
            Intrinsics.checkNotNullExpressionValue(digest, "digest.digest(source.toByteArray())");
            return b(digest);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String b(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b11 : bArr) {
            String format = String.format("%02x", Arrays.copyOf(new Object[]{Integer.valueOf(b11 & 255)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            sb2.append(format);
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "hex.toString()");
        return sb3;
    }
}
