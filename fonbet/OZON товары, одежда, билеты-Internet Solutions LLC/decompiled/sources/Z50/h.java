package Z50;

import H30.C3133b;
import android.util.Base64;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class h implements g {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final byte[] f35607b;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final SecureRandom f35608a;

    static {
        byte[] bytes = "x25519-hkdf-aesgcm-v1".getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        f35607b = bytes;
    }

    public h() {
        SecureRandom secureRandom = new SecureRandom();
        Intrinsics.checkNotNullParameter(secureRandom, "secureRandom");
        this.f35608a = secureRandom;
    }

    @Override // Z50.g
    @NotNull
    public final String a(@NotNull String remotePublicKeyB64, @NotNull String plainText) {
        int i11 = 32;
        Intrinsics.checkNotNullParameter(remotePublicKeyB64, "remotePublicKeyB64");
        Intrinsics.checkNotNullParameter(plainText, "plainText");
        Intrinsics.checkNotNullParameter(remotePublicKeyB64, "<this>");
        byte[] decode = Base64.decode(remotePublicKeyB64, 2);
        Intrinsics.checkNotNullExpressionValue(decode, "decode(...)");
        if (decode.length != 32) {
            throw new IllegalArgumentException(Ej.b.a(decode.length, "X25519 public key должен быть 32 байта, получили ").toString());
        }
        byte[] bArr = new byte[32];
        SecureRandom secureRandom = this.f35608a;
        secureRandom.nextBytes(bArr);
        byte[] copyOf = Arrays.copyOf(bArr, 32);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        byte[] b11 = Sb.a.b(14, copyOf, null);
        byte[] copyOf2 = Arrays.copyOf(bArr, 32);
        Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(...)");
        byte[] copyOf3 = Arrays.copyOf(decode, decode.length);
        Intrinsics.checkNotNullExpressionValue(copyOf3, "copyOf(...)");
        byte[] b12 = Sb.a.b(12, copyOf2, copyOf3);
        byte[] copyOf4 = Arrays.copyOf(b11, 32);
        Intrinsics.checkNotNullExpressionValue(copyOf4, "copyOf(...)");
        byte[] digest = MessageDigest.getInstance("SHA-256").digest(copyOf4);
        Intrinsics.checkNotNullExpressionValue(digest, "digest(...)");
        if (digest.length == 0) {
            digest = new byte[32];
        }
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(new SecretKeySpec(digest, "HmacSHA256"));
        byte[] doFinal = mac.doFinal(b12);
        Intrinsics.checkNotNullExpressionValue(doFinal, "doFinal(...)");
        byte[] bArr2 = new byte[32];
        byte[] bArr3 = new byte[0];
        int i12 = 0;
        byte b13 = 1;
        while (i12 < i11) {
            byte[] S11 = C7705l.S(C7705l.S(bArr3, f35607b), new byte[]{b13});
            Mac mac2 = Mac.getInstance("HmacSHA256");
            int i13 = i11;
            mac2.init(new SecretKeySpec(doFinal, "HmacSHA256"));
            bArr3 = mac2.doFinal(S11);
            Intrinsics.checkNotNullExpressionValue(bArr3, "doFinal(...)");
            int min = Math.min(bArr3.length, 32 - i12);
            System.arraycopy(bArr3, 0, bArr2, i12, min);
            i12 += min;
            b13 = (byte) (b13 + 1);
            i11 = i13;
        }
        byte[] bArr4 = new byte[12];
        secureRandom.nextBytes(bArr4);
        byte[] bytes = plainText.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, new SecretKeySpec(bArr2, "AES"), new GCMParameterSpec(UserVerificationMethods.USER_VERIFY_PATTERN, bArr4));
        cipher.updateAAD(b11);
        byte[] doFinal2 = cipher.doFinal(bytes);
        Intrinsics.checkNotNullExpressionValue(doFinal2, "doFinal(...)");
        return C3133b.a(C7705l.S(C7705l.S(b11, bArr4), doFinal2));
    }
}
