package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\r\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a'\u0010\n\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b\"\u0014\u0010\r\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"\u0014\u0010\u000f\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e"}, d2 = {"", "urlString", "extractPathFromUrl", "(Ljava/lang/String;)Ljava/lang/String;", "getFallbackInfoStorageKey", "()Ljava/lang/String;", "errorMsg", "", "timedOut", "hasNetwork", "isDomainFailure", "(Ljava/lang/String;ZZ)Z", "", "COOLDOWN_TIME_MS", "J", "DEFAULT_TTL_MS"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class NetworkFallbackResolverKt {
    public static final long COOLDOWN_TIME_MS = 14400000;
    public static final long DEFAULT_TTL_MS = 604800000;

    public static final boolean isDomainFailure(java.lang.String str, boolean z, boolean z2) {
        if (z2) {
            return z || str != null;
        }
        return false;
    }

    public static final java.lang.String getFallbackInfoStorageKey() {
        return "statsig.network_fallback";
    }

    public static final java.lang.String extractPathFromUrl(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        try {
            return new java.net.URL(str).getPath();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
