package io.ktor.util;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\"\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\" \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011\"\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"", "ensureNonceGeneratorRunning", "()V", "", "p0", "Ljava/security/SecureRandom;", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/String;)Ljava/security/SecureRandom;", "", "Camera2StreamConfigurationMap", "Ljava/util/List;", "Lkotlinx/coroutines/channels/Channel;", "seedChannel", "Lkotlinx/coroutines/channels/Channel;", "getSeedChannel", "()Lkotlinx/coroutines/channels/Channel;", "Lkotlinx/coroutines/CoroutineName;", "Lkotlinx/coroutines/CoroutineName;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/Job;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/Job;", "getHighSpeedVideoFpsRanges"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class NonceKt {
    private static final kotlinx.coroutines.Job getHighResolutionOutputSizeshNQ4ISI;
    private static final kotlinx.coroutines.CoroutineName getHighSpeedVideoFpsRangesFor;
    private static final java.util.List<java.lang.String> Camera2StreamConfigurationMap = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"NativePRNGNonBlocking", "WINDOWS-PRNG", "DRBG"});
    private static final kotlinx.coroutines.channels.Channel<java.lang.String> seedChannel = kotlinx.coroutines.channels.ChannelKt.Channel$default(1024, null, null, 6, null);

    static {
        kotlinx.coroutines.CoroutineName coroutineName = new kotlinx.coroutines.CoroutineName("nonce-generator");
        getHighSpeedVideoFpsRangesFor = coroutineName;
        getHighResolutionOutputSizeshNQ4ISI = kotlinx.coroutines.BuildersKt.launch(kotlinx.coroutines.GlobalScope.INSTANCE, kotlinx.coroutines.Dispatchers.getIO().plus(kotlinx.coroutines.NonCancellable.INSTANCE).plus(coroutineName), kotlinx.coroutines.CoroutineStart.LAZY, new io.ktor.util.NonceKt$nonceGeneratorJob$1(null));
    }

    public static final kotlinx.coroutines.channels.Channel<java.lang.String> getSeedChannel() {
        return seedChannel;
    }

    public static final void ensureNonceGeneratorRunning() {
        getHighResolutionOutputSizeshNQ4ISI.start();
    }

    private static final java.security.SecureRandom getHighSpeedVideoFpsRangesFor(java.lang.String str) {
        try {
            if (str != null) {
                return java.security.SecureRandom.getInstance(str);
            }
            return new java.security.SecureRandom();
        } catch (java.security.NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static final /* synthetic */ java.security.SecureRandom access$lookupSecureRandom() {
        java.security.SecureRandom highSpeedVideoFpsRangesFor;
        java.lang.String property = java.lang.System.getProperty("io.ktor.random.secure.random.provider");
        if (property != null && (highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(property)) != null) {
            return highSpeedVideoFpsRangesFor;
        }
        java.util.Iterator<java.lang.String> it = Camera2StreamConfigurationMap.iterator();
        while (it.hasNext()) {
            java.security.SecureRandom highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(it.next());
            if (highSpeedVideoFpsRangesFor2 != null) {
                return highSpeedVideoFpsRangesFor2;
            }
        }
        org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger("io.ktor.util.random");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("None of the ");
        sb.append(kotlin.collections.CollectionsKt.joinToString$default(Camera2StreamConfigurationMap, ", ", null, null, 0, null, null, 62, null));
        sb.append(" found, fallback to default");
        logger.warn(sb.toString());
        java.security.SecureRandom highSpeedVideoFpsRangesFor3 = getHighSpeedVideoFpsRangesFor(null);
        if (highSpeedVideoFpsRangesFor3 != null) {
            return highSpeedVideoFpsRangesFor3;
        }
        throw new java.lang.IllegalStateException("No SecureRandom implementation found".toString());
    }
}
