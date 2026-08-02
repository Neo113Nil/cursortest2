package io.ktor.util;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\u0005\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0005\u001a\u0015\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\b\u001a\u001c\u0010\n\u001a\u00020\u0000*\u00020\t2\u0006\u0010\u0001\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\n\u0010\u000b\u001a*\u0010\n\u001a\u00020\u0000*\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00022\f\b\u0002\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0086@¢\u0006\u0004\b\n\u0010\u000f\"\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0014\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"", "p0", "", "hex", "([B)Ljava/lang/String;", "(Ljava/lang/String;)[B", "", "generateNonce", "(I)[B", "Lio/ktor/util/Digest;", "build", "(Lio/ktor/util/Digest;[BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Camera2StreamConfigurationMap;", "p1", "(Lio/ktor/util/Digest;Ljava/lang/String;Ljava/nio/charset/Charset;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "getHighSpeedVideoSizes", "[C", "getHighSpeedVideoFpsRangesFor", "NONCE_SIZE_IN_BYTES", com.visa.cbp.getEncExpo.warmup}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "io/ktor/util/CryptoKt")
/* loaded from: classes17.dex */
final /* synthetic */ class CryptoKt__CryptoKt {
    private static final char[] getHighSpeedVideoSizes = io.ktor.util.CharsetKt.toCharArray("0123456789abcdef");

    public static final java.lang.String hex(byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        char[] cArr = new char[bArr.length * 2];
        char[] cArr2 = getHighSpeedVideoSizes;
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            byte b = bArr[i2];
            cArr[i] = cArr2[(b & 255) >> 4];
            cArr[i + 1] = cArr2[b & com.google.common.base.Ascii.SI];
            i2++;
            i += 2;
        }
        return kotlin.text.StringsKt.concatToString(cArr);
    }

    public static final byte[] hex(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (java.lang.Integer.parseInt(java.lang.String.valueOf(str.charAt(i2 + 1)), kotlin.text.CharsKt.checkRadix(16)) | (java.lang.Integer.parseInt(java.lang.String.valueOf(str.charAt(i2)), kotlin.text.CharsKt.checkRadix(16)) << 4));
        }
        return bArr;
    }

    public static final java.lang.Object build(io.ktor.util.Digest digest, byte[] bArr, kotlin.coroutines.Continuation<? super byte[]> continuation) {
        digest.plusAssign(bArr);
        return digest.build(continuation);
    }

    public static /* synthetic */ java.lang.Object build$default(io.ktor.util.Digest digest, java.lang.String str, java.nio.charset.Charset charset, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        return io.ktor.util.CryptoKt.build(digest, str, charset, continuation);
    }

    public static final java.lang.Object build(io.ktor.util.Digest digest, java.lang.String str, java.nio.charset.Charset charset, kotlin.coroutines.Continuation<? super byte[]> continuation) {
        digest.plusAssign(io.ktor.utils.io.core.StringsKt.toByteArray(str, charset));
        return digest.build(continuation);
    }

    public static final byte[] generateNonce(int i) {
        kotlinx.io.Buffer buffer = new kotlinx.io.Buffer();
        kotlinx.io.Buffer buffer2 = buffer;
        while (io.ktor.utils.io.core.BytePacketBuilderKt.getSize(buffer2) < i) {
            io.ktor.utils.io.core.StringsKt.writeText$default(buffer2, io.ktor.util.CryptoKt.generateNonce(), 0, 0, (java.nio.charset.Charset) null, 14, (java.lang.Object) null);
        }
        return kotlinx.io.SourcesKt.readByteArray(buffer, i);
    }
}
