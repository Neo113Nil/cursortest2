package io.ktor.util;

/* compiled from: CryptoJvm.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aD\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u00022\u0006\u0010\u0001\u001a\u00020\u00002!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\b\u0010\t\u001a3\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0015\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\r\u0010\u0014\u001a\u00020\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u000f\u0010\u0017\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0016\u0010\u0015¨\u0006\u0018"}, d2 = {"", "algorithm", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "value", "salt", "", "getDigestFunction", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;", "text", "getDigest$CryptoKt__CryptoJvmKt", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)[B", "getDigest", "bytes", "sha1", "([B)[B", "Lio/ktor/util/Digest;", io.ktor.http.auth.AuthScheme.Digest, "(Ljava/lang/String;)Lio/ktor/util/Digest;", "generateNonce", "()Ljava/lang/String;", "generateNonceBlocking$CryptoKt__CryptoJvmKt", "generateNonceBlocking", "ktor-utils"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "io/ktor/util/CryptoKt")
/* loaded from: classes6.dex */
final /* synthetic */ class CryptoKt__CryptoJvmKt {
    public static final kotlin.jvm.functions.Function1<java.lang.String, byte[]> getDigestFunction(final java.lang.String algorithm, final kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.String> salt) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(salt, "salt");
        return new kotlin.jvm.functions.Function1() { // from class: io.ktor.util.CryptoKt__CryptoJvmKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                byte[] digestFunction$lambda$0$CryptoKt__CryptoJvmKt;
                digestFunction$lambda$0$CryptoKt__CryptoJvmKt = io.ktor.util.CryptoKt__CryptoJvmKt.getDigestFunction$lambda$0$CryptoKt__CryptoJvmKt(algorithm, salt, (java.lang.String) obj);
                return digestFunction$lambda$0$CryptoKt__CryptoJvmKt;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final byte[] getDigestFunction$lambda$0$CryptoKt__CryptoJvmKt(java.lang.String str, kotlin.jvm.functions.Function1 function1, java.lang.String e) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "e");
        return getDigest$CryptoKt__CryptoJvmKt(e, str, function1);
    }

    private static final byte[] getDigest$CryptoKt__CryptoJvmKt(java.lang.String str, java.lang.String str2, kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.String> function1) {
        java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance(str2);
        byte[] bytes = function1.invoke(str).getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        messageDigest.update(bytes);
        byte[] bytes2 = str.getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
        byte[] digest = messageDigest.digest(bytes2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(digest, "with(...)");
        return digest;
    }

    public static final byte[] sha1(byte[] bytes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bytes, "bytes");
        byte[] digest = java.security.MessageDigest.getInstance("SHA1").digest(bytes);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(digest, "digest(...)");
        return digest;
    }

    public static final io.ktor.util.Digest Digest(java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance(name);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(messageDigest, "getInstance(...)");
        return io.ktor.util.DigestImpl.m10743boximpl(io.ktor.util.DigestImpl.m10745constructorimpl(messageDigest));
    }

    public static final java.lang.String generateNonce() {
        java.lang.String str = (java.lang.String) kotlinx.coroutines.channels.ChannelResult.m12323getOrNullimpl(io.ktor.util.NonceKt.getSeedChannel().mo12311tryReceivePtdJZtk());
        return str != null ? str : generateNonceBlocking$CryptoKt__CryptoJvmKt();
    }

    private static final java.lang.String generateNonceBlocking$CryptoKt__CryptoJvmKt() {
        java.lang.Object runBlocking$default;
        io.ktor.util.NonceKt.ensureNonceGeneratorRunning();
        runBlocking$default = kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new io.ktor.util.CryptoKt__CryptoJvmKt$generateNonceBlocking$1(null), 1, null);
        return (java.lang.String) runBlocking$default;
    }
}
