package io.ktor.util;

/* compiled from: StatelessHmacNonceManager.kt */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0004\b\n\u0010\u000bB5\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0004\b\n\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lio/ktor/util/StatelessHmacNonceManager;", "Lio/ktor/util/NonceManager;", "Ljavax/crypto/spec/SecretKeySpec;", "keySpec", "", "algorithm", "", "timeoutMillis", "Lkotlin/Function0;", "nonceGenerator", "<init>", "(Ljavax/crypto/spec/SecretKeySpec;Ljava/lang/String;JLkotlin/jvm/functions/Function0;)V", "", com.ironsource.X3.i.W, "([BLjava/lang/String;JLkotlin/jvm/functions/Function0;)V", "newNonce", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "nonce", "", "verifyNonce", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljavax/crypto/spec/SecretKeySpec;", "getKeySpec", "()Ljavax/crypto/spec/SecretKeySpec;", "Ljava/lang/String;", "getAlgorithm", "()Ljava/lang/String;", "J", "getTimeoutMillis", "()J", "Lkotlin/jvm/functions/Function0;", "getNonceGenerator", "()Lkotlin/jvm/functions/Function0;", "", "macLength", "I", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StatelessHmacNonceManager implements io.ktor.util.NonceManager {
    private final java.lang.String algorithm;
    private final javax.crypto.spec.SecretKeySpec keySpec;
    private final int macLength;
    private final kotlin.jvm.functions.Function0<java.lang.String> nonceGenerator;
    private final long timeoutMillis;

    public StatelessHmacNonceManager(javax.crypto.spec.SecretKeySpec keySpec, java.lang.String algorithm, long j, kotlin.jvm.functions.Function0<java.lang.String> nonceGenerator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keySpec, "keySpec");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nonceGenerator, "nonceGenerator");
        this.keySpec = keySpec;
        this.algorithm = algorithm;
        this.timeoutMillis = j;
        this.nonceGenerator = nonceGenerator;
        javax.crypto.Mac mac = javax.crypto.Mac.getInstance(algorithm);
        mac.init(keySpec);
        this.macLength = mac.getMacLength();
    }

    public final javax.crypto.spec.SecretKeySpec getKeySpec() {
        return this.keySpec;
    }

    public /* synthetic */ StatelessHmacNonceManager(javax.crypto.spec.SecretKeySpec secretKeySpec, java.lang.String str, long j, kotlin.jvm.functions.Function0 function0, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(secretKeySpec, (i & 2) != 0 ? "HmacSHA256" : str, (i & 4) != 0 ? 60000L : j, (kotlin.jvm.functions.Function0<java.lang.String>) ((i & 8) != 0 ? new kotlin.jvm.functions.Function0() { // from class: io.ktor.util.StatelessHmacNonceManager$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                java.lang.String generateNonce;
                generateNonce = io.ktor.util.CryptoKt.generateNonce();
                return generateNonce;
            }
        } : function0));
    }

    public final java.lang.String getAlgorithm() {
        return this.algorithm;
    }

    public final long getTimeoutMillis() {
        return this.timeoutMillis;
    }

    public final kotlin.jvm.functions.Function0<java.lang.String> getNonceGenerator() {
        return this.nonceGenerator;
    }

    public /* synthetic */ StatelessHmacNonceManager(byte[] bArr, java.lang.String str, long j, kotlin.jvm.functions.Function0 function0, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, (i & 2) != 0 ? "HmacSHA256" : str, (i & 4) != 0 ? 60000L : j, (kotlin.jvm.functions.Function0<java.lang.String>) ((i & 8) != 0 ? new kotlin.jvm.functions.Function0() { // from class: io.ktor.util.StatelessHmacNonceManager$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                java.lang.String generateNonce;
                generateNonce = io.ktor.util.CryptoKt.generateNonce();
                return generateNonce;
            }
        } : function0));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StatelessHmacNonceManager(byte[] key, java.lang.String algorithm, long j, kotlin.jvm.functions.Function0<java.lang.String> nonceGenerator) {
        this(new javax.crypto.spec.SecretKeySpec(key, algorithm), algorithm, j, nonceGenerator);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nonceGenerator, "nonceGenerator");
    }

    @Override // io.ktor.util.NonceManager
    public java.lang.Object newNonce(kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        java.lang.String invoke = this.nonceGenerator.invoke();
        java.lang.String l = java.lang.Long.toString(java.lang.System.nanoTime(), kotlin.text.CharsKt.checkRadix(16));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(l, "toString(...)");
        java.lang.String padStart = kotlin.text.StringsKt.padStart(l, 16, '0');
        javax.crypto.Mac mac = javax.crypto.Mac.getInstance(this.algorithm);
        mac.init(this.keySpec);
        byte[] bytes = (invoke + kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON + padStart).getBytes(kotlin.text.Charsets.ISO_8859_1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        mac.update(bytes);
        byte[] doFinal = mac.doFinal();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(doFinal, "doFinal(...)");
        return invoke + '+' + padStart + '+' + io.ktor.util.CryptoKt.hex(doFinal);
    }

    @Override // io.ktor.util.NonceManager
    public java.lang.Object verifyNonce(java.lang.String str, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        java.util.List split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) str, new char[]{'+'}, false, 0, 6, (java.lang.Object) null);
        if (split$default.size() != 3) {
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
        }
        java.lang.String str2 = (java.lang.String) split$default.get(0);
        java.lang.String str3 = (java.lang.String) split$default.get(1);
        java.lang.String str4 = (java.lang.String) split$default.get(2);
        if (str2.length() >= 8 && str4.length() == this.macLength * 2 && str3.length() == 16 && java.lang.Long.parseLong(str3, kotlin.text.CharsKt.checkRadix(16)) + java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(this.timeoutMillis) >= java.lang.System.nanoTime()) {
            javax.crypto.Mac mac = javax.crypto.Mac.getInstance(this.algorithm);
            mac.init(this.keySpec);
            byte[] bytes = (str2 + kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON + str3).getBytes(kotlin.text.Charsets.ISO_8859_1);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            mac.update(bytes);
            byte[] doFinal = mac.doFinal();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(doFinal, "doFinal(...)");
            java.lang.String hex = io.ktor.util.CryptoKt.hex(doFinal);
            int min = java.lang.Math.min(hex.length(), str4.length());
            int i = 0;
            for (int i2 = 0; i2 < min; i2++) {
                if (hex.charAt(i2) == str4.charAt(i2)) {
                    i++;
                }
            }
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(i == this.macLength * 2);
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
    }
}
