package io.ktor.util;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a:\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0017\u0010\u0004\u001a\u0013\u0012\t\u0012\u00070\u0000¢\u0006\u0002\b\u0003\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0015\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001a\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\r\u0010\r\u001a\u00020\u0000¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"", "p0", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "p1", "", "getDigestFunction", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;", "sha1", "([B)[B", "Lio/ktor/util/Digest;", io.ktor.http.auth.AuthScheme.Digest, "(Ljava/lang/String;)Lio/ktor/util/Digest;", "generateNonce", "()Ljava/lang/String;"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "io/ktor/util/CryptoKt")
/* loaded from: classes17.dex */
final /* synthetic */ class CryptoKt__CryptoJvmKt {
    public static final kotlin.jvm.functions.Function1<java.lang.String, byte[]> getDigestFunction(final java.lang.String str, final kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.String> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        return new kotlin.jvm.functions.Function1() { // from class: io.ktor.util.CryptoKt__CryptoJvmKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return io.ktor.util.CryptoKt__CryptoJvmKt.getHighSpeedVideoSizes(str, function1, (java.lang.String) obj);
            }
        };
    }

    public static final byte[] sha1(byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        byte[] digest = java.security.MessageDigest.getInstance("SHA1").digest(bArr);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(digest, "");
        return digest;
    }

    public static final io.ktor.util.Digest Digest(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance(str);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(messageDigest, "");
        return io.ktor.util.DigestImpl.getHighSpeedVideoFpsRangesFor(io.ktor.util.DigestImpl.getHighSpeedVideoFpsRanges(messageDigest));
    }

    public static final java.lang.String generateNonce() {
        java.lang.Object runBlocking$default;
        java.lang.String str = (java.lang.String) kotlinx.coroutines.channels.ChannelResult.m24084getOrNullimpl(io.ktor.util.NonceKt.getSeedChannel().mo24073tryReceivePtdJZtk());
        if (str != null) {
            return str;
        }
        io.ktor.util.NonceKt.ensureNonceGeneratorRunning();
        runBlocking$default = kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new io.ktor.util.CryptoKt__CryptoJvmKt$generateNonceBlocking$1(null), 1, null);
        return (java.lang.String) runBlocking$default;
    }

    public static /* synthetic */ byte[] getHighSpeedVideoSizes(java.lang.String str, kotlin.jvm.functions.Function1 function1, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance(str);
        byte[] bytes = ((java.lang.String) function1.invoke(str2)).getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
        messageDigest.update(bytes);
        byte[] bytes2 = str2.getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes2, "");
        byte[] digest = messageDigest.digest(bytes2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(digest, "");
        return digest;
    }
}
