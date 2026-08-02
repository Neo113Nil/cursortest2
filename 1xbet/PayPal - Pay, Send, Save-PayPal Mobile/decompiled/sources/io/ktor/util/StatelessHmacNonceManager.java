package io.ktor.util;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0004\b\n\u0010\u000bB5\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0004\b\n\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020!8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010#"}, d2 = {"Lio/ktor/util/StatelessHmacNonceManager;", "Lio/ktor/util/NonceManager;", "Ljavax/crypto/spec/SecretKeySpec;", "keySpec", "", "algorithm", "", "timeoutMillis", "Lkotlin/Function0;", "nonceGenerator", "<init>", "(Ljavax/crypto/spec/SecretKeySpec;Ljava/lang/String;JLkotlin/jvm/functions/Function0;)V", "", "key", "([BLjava/lang/String;JLkotlin/jvm/functions/Function0;)V", "newNonce", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "nonce", "", "verifyNonce", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljavax/crypto/spec/SecretKeySpec;", "getKeySpec", "()Ljavax/crypto/spec/SecretKeySpec;", "Ljava/lang/String;", "getAlgorithm", "()Ljava/lang/String;", "J", "getTimeoutMillis", "()J", "Lkotlin/jvm/functions/Function0;", "getNonceGenerator", "()Lkotlin/jvm/functions/Function0;", "", "getHighSpeedVideoFpsRanges", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class StatelessHmacNonceManager implements io.ktor.util.NonceManager {
    private final java.lang.String algorithm;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRangesFor;
    private final javax.crypto.spec.SecretKeySpec keySpec;
    private final kotlin.jvm.functions.Function0<java.lang.String> nonceGenerator;
    private final long timeoutMillis;

    public StatelessHmacNonceManager(javax.crypto.spec.SecretKeySpec secretKeySpec, java.lang.String str, long j, kotlin.jvm.functions.Function0<java.lang.String> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secretKeySpec, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.keySpec = secretKeySpec;
        this.algorithm = str;
        this.timeoutMillis = j;
        this.nonceGenerator = function0;
        javax.crypto.Mac mac = javax.crypto.Mac.getInstance(str);
        mac.init(secretKeySpec);
        this.getHighSpeedVideoFpsRangesFor = mac.getMacLength();
    }

    public final javax.crypto.spec.SecretKeySpec getKeySpec() {
        return this.keySpec;
    }

    public /* synthetic */ StatelessHmacNonceManager(javax.crypto.spec.SecretKeySpec secretKeySpec, java.lang.String str, long j, kotlin.jvm.functions.Function0 function0, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(secretKeySpec, (i & 2) != 0 ? org.jose4j.mac.MacUtil.HMAC_SHA256 : str, (i & 4) != 0 ? 60000L : j, (kotlin.jvm.functions.Function0<java.lang.String>) ((i & 8) != 0 ? new kotlin.jvm.functions.Function0() { // from class: io.ktor.util.StatelessHmacNonceManager$$ExternalSyntheticLambda1
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
        this(bArr, (i & 2) != 0 ? org.jose4j.mac.MacUtil.HMAC_SHA256 : str, (i & 4) != 0 ? 60000L : j, (kotlin.jvm.functions.Function0<java.lang.String>) ((i & 8) != 0 ? new kotlin.jvm.functions.Function0() { // from class: io.ktor.util.StatelessHmacNonceManager$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                java.lang.String generateNonce;
                generateNonce = io.ktor.util.CryptoKt.generateNonce();
                return generateNonce;
            }
        } : function0));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StatelessHmacNonceManager(byte[] bArr, java.lang.String str, long j, kotlin.jvm.functions.Function0<java.lang.String> function0) {
        this(new javax.crypto.spec.SecretKeySpec(bArr, str), str, j, function0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
    }

    @Override // io.ktor.util.NonceManager
    public final java.lang.Object newNonce(kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        java.lang.String invoke = this.nonceGenerator.invoke();
        java.lang.String l = java.lang.Long.toString(java.lang.System.nanoTime(), kotlin.text.CharsKt.checkRadix(16));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(l, "");
        java.lang.String padStart = kotlin.text.StringsKt.padStart(l, 16, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        javax.crypto.Mac mac = javax.crypto.Mac.getInstance(this.algorithm);
        mac.init(this.keySpec);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(invoke);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
        sb.append(padStart);
        byte[] bytes = sb.toString().getBytes(kotlin.text.Charsets.ISO_8859_1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
        mac.update(bytes);
        byte[] doFinal = mac.doFinal();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(doFinal, "");
        java.lang.String hex = io.ktor.util.CryptoKt.hex(doFinal);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(invoke);
        sb2.append('+');
        sb2.append(padStart);
        sb2.append('+');
        sb2.append(hex);
        return sb2.toString();
    }

    @Override // io.ktor.util.NonceManager
    public final java.lang.Object verifyNonce(java.lang.String str, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        java.util.List split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) str, new char[]{'+'}, false, 0, 6, (java.lang.Object) null);
        if (split$default.size() != 3) {
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
        }
        java.lang.String str2 = (java.lang.String) split$default.get(0);
        java.lang.String str3 = (java.lang.String) split$default.get(1);
        java.lang.String str4 = (java.lang.String) split$default.get(2);
        if (str2.length() >= 8 && str4.length() == this.getHighSpeedVideoFpsRangesFor * 2 && str3.length() == 16 && java.lang.Long.parseLong(str3, kotlin.text.CharsKt.checkRadix(16)) + java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(this.timeoutMillis) >= java.lang.System.nanoTime()) {
            javax.crypto.Mac mac = javax.crypto.Mac.getInstance(this.algorithm);
            mac.init(this.keySpec);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str2);
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
            sb.append(str3);
            byte[] bytes = sb.toString().getBytes(kotlin.text.Charsets.ISO_8859_1);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
            mac.update(bytes);
            byte[] doFinal = mac.doFinal();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(doFinal, "");
            java.lang.String hex = io.ktor.util.CryptoKt.hex(doFinal);
            int min = java.lang.Math.min(hex.length(), str4.length());
            int i = 0;
            for (int i2 = 0; i2 < min; i2++) {
                if (hex.charAt(i2) == str4.charAt(i2)) {
                    i++;
                }
            }
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(i == this.getHighSpeedVideoFpsRangesFor * 2);
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
    }
}
