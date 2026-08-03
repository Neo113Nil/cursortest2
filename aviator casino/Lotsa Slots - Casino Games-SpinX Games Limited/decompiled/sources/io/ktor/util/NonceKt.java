package io.ktor.util;

/* compiled from: Nonce.kt */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011\"\u0014\u0010\u0013\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011\" \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00148\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\"\u001a\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b\u001f\u0010\u0002¨\u0006 "}, d2 = {"", "ensureNonceGeneratorRunning", "()V", "Ljava/security/SecureRandom;", "lookupSecureRandom", "()Ljava/security/SecureRandom;", "", "name", "getInstanceOrNull", "(Ljava/lang/String;)Ljava/security/SecureRandom;", io.ktor.util.NonceKt.SHA1PRNG, "Ljava/lang/String;", "", "SECURE_RANDOM_PROVIDERS", "Ljava/util/List;", "", "SECURE_RESEED_PERIOD", "I", "SECURE_NONCE_COUNT", "INSECURE_NONCE_COUNT_FACTOR", "Lkotlinx/coroutines/channels/Channel;", "seedChannel", "Lkotlinx/coroutines/channels/Channel;", "getSeedChannel", "()Lkotlinx/coroutines/channels/Channel;", "Lkotlinx/coroutines/CoroutineName;", "NonceGeneratorCoroutineName", "Lkotlinx/coroutines/CoroutineName;", "Lkotlinx/coroutines/Job;", "nonceGeneratorJob", "Lkotlinx/coroutines/Job;", "getNonceGeneratorJob$annotations", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NonceKt {
    private static final int INSECURE_NONCE_COUNT_FACTOR = 4;
    private static final kotlinx.coroutines.CoroutineName NonceGeneratorCoroutineName;
    private static final int SECURE_NONCE_COUNT = 8;
    private static final int SECURE_RESEED_PERIOD = 30000;
    private static final java.lang.String SHA1PRNG = "SHA1PRNG";
    private static final kotlinx.coroutines.Job nonceGeneratorJob;
    private static final java.util.List<java.lang.String> SECURE_RANDOM_PROVIDERS = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"NativePRNGNonBlocking", "WINDOWS-PRNG", "DRBG"});
    private static final kotlinx.coroutines.channels.Channel<java.lang.String> seedChannel = kotlinx.coroutines.channels.ChannelKt.Channel$default(1024, null, null, 6, null);

    private static /* synthetic */ void getNonceGeneratorJob$annotations() {
    }

    static {
        kotlinx.coroutines.CoroutineName coroutineName = new kotlinx.coroutines.CoroutineName("nonce-generator");
        NonceGeneratorCoroutineName = coroutineName;
        nonceGeneratorJob = kotlinx.coroutines.BuildersKt.launch(kotlinx.coroutines.GlobalScope.INSTANCE, kotlinx.coroutines.Dispatchers.getIO().plus(kotlinx.coroutines.NonCancellable.INSTANCE).plus(coroutineName), kotlinx.coroutines.CoroutineStart.LAZY, new io.ktor.util.NonceKt$nonceGeneratorJob$1(null));
    }

    public static final kotlinx.coroutines.channels.Channel<java.lang.String> getSeedChannel() {
        return seedChannel;
    }

    public static final void ensureNonceGeneratorRunning() {
        nonceGeneratorJob.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.security.SecureRandom lookupSecureRandom() {
        java.security.SecureRandom instanceOrNull;
        java.lang.String property = java.lang.System.getProperty("io.ktor.random.secure.random.provider");
        if (property != null && (instanceOrNull = getInstanceOrNull(property)) != null) {
            return instanceOrNull;
        }
        java.util.Iterator<java.lang.String> it = SECURE_RANDOM_PROVIDERS.iterator();
        while (it.hasNext()) {
            java.security.SecureRandom instanceOrNull2 = getInstanceOrNull(it.next());
            if (instanceOrNull2 != null) {
                return instanceOrNull2;
            }
        }
        org.slf4j.LoggerFactory.getLogger("io.ktor.util.random").warn("None of the " + kotlin.collections.CollectionsKt.joinToString$default(SECURE_RANDOM_PROVIDERS, ", ", null, null, 0, null, null, 62, null) + " found, fallback to default");
        java.security.SecureRandom instanceOrNull$default = getInstanceOrNull$default(null, 1, null);
        if (instanceOrNull$default != null) {
            return instanceOrNull$default;
        }
        throw new java.lang.IllegalStateException("No SecureRandom implementation found".toString());
    }

    static /* synthetic */ java.security.SecureRandom getInstanceOrNull$default(java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return getInstanceOrNull(str);
    }

    private static final java.security.SecureRandom getInstanceOrNull(java.lang.String str) {
        java.security.SecureRandom secureRandom;
        try {
            if (str != null) {
                secureRandom = java.security.SecureRandom.getInstance(str);
            } else {
                secureRandom = new java.security.SecureRandom();
            }
            return secureRandom;
        } catch (java.security.NoSuchAlgorithmException unused) {
            return null;
        }
    }
}
