package io.ktor.util;

@kotlin.Metadata(d1 = {"io/ktor/util/CryptoKt__CryptoJvmKt", "io/ktor/util/CryptoKt__CryptoKt"}, k = 4, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CryptoKt {
    public static final int NONCE_SIZE_IN_BYTES = 16;

    public static final io.ktor.util.Digest Digest(java.lang.String str) {
        return io.ktor.util.CryptoKt__CryptoJvmKt.Digest(str);
    }

    public static final java.lang.Object build(io.ktor.util.Digest digest, java.lang.String str, java.nio.charset.Charset charset, kotlin.coroutines.Continuation<? super byte[]> continuation) {
        return io.ktor.util.CryptoKt__CryptoKt.build(digest, str, charset, continuation);
    }

    public static final java.lang.Object build(io.ktor.util.Digest digest, byte[] bArr, kotlin.coroutines.Continuation<? super byte[]> continuation) {
        return io.ktor.util.CryptoKt__CryptoKt.build(digest, bArr, continuation);
    }

    public static final java.lang.String generateNonce() {
        return io.ktor.util.CryptoKt__CryptoJvmKt.generateNonce();
    }

    public static final byte[] generateNonce(int i) {
        return io.ktor.util.CryptoKt__CryptoKt.generateNonce(i);
    }

    public static final kotlin.jvm.functions.Function1<java.lang.String, byte[]> getDigestFunction(java.lang.String str, kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.String> function1) {
        return io.ktor.util.CryptoKt__CryptoJvmKt.getDigestFunction(str, function1);
    }

    public static final java.lang.String hex(byte[] bArr) {
        return io.ktor.util.CryptoKt__CryptoKt.hex(bArr);
    }

    public static final byte[] hex(java.lang.String str) {
        return io.ktor.util.CryptoKt__CryptoKt.hex(str);
    }

    public static final byte[] sha1(byte[] bArr) {
        return io.ktor.util.CryptoKt__CryptoJvmKt.sha1(bArr);
    }
}
