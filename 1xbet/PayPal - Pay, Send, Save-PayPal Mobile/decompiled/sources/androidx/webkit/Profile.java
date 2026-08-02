package androidx.webkit;

/* loaded from: classes7.dex */
public interface Profile {
    public static final java.lang.String DEFAULT_PROFILE_NAME = "Default";

    @java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.FIELD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    /* loaded from: classes3.dex */
    public @interface ExperimentalAddQuicHints {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.FIELD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    /* loaded from: classes3.dex */
    public @interface ExperimentalOriginMatchedHeader {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.FIELD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    /* loaded from: classes3.dex */
    public @interface ExperimentalPreconnect {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.FIELD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    /* loaded from: classes3.dex */
    public @interface ExperimentalUrlPrefetch {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.FIELD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    /* loaded from: classes3.dex */
    public @interface ExperimentalWarmUpRendererProcess {
    }

    default void addCustomHeader(androidx.webkit.CustomHeader customHeader) {
    }

    default void clearAllCustomHeaders() {
    }

    void clearAllOriginMatchedHeaders();

    default void clearCustomHeader(java.lang.String str) {
    }

    default void clearCustomHeader(java.lang.String str, java.lang.String str2) {
    }

    void clearOriginMatchedHeader(java.lang.String str);

    void clearPrefetchAsync(java.lang.String str, java.util.concurrent.Executor executor, androidx.webkit.OutcomeReceiverCompat<java.lang.Void, androidx.webkit.PrefetchException> outcomeReceiverCompat);

    android.webkit.CookieManager getCookieManager();

    android.webkit.GeolocationPermissions getGeolocationPermissions();

    java.lang.String getName();

    android.webkit.ServiceWorkerController getServiceWorkerController();

    android.webkit.WebStorage getWebStorage();

    default boolean hasCustomHeader(java.lang.String str) {
        return false;
    }

    boolean hasOriginMatchedHeader(java.lang.String str);

    void prefetchUrlAsync(java.lang.String str, android.os.CancellationSignal cancellationSignal, java.util.concurrent.Executor executor, androidx.webkit.OutcomeReceiverCompat<java.lang.Void, androidx.webkit.PrefetchException> outcomeReceiverCompat);

    void prefetchUrlAsync(java.lang.String str, android.os.CancellationSignal cancellationSignal, java.util.concurrent.Executor executor, androidx.webkit.SpeculativeLoadingParameters speculativeLoadingParameters, androidx.webkit.OutcomeReceiverCompat<java.lang.Void, androidx.webkit.PrefetchException> outcomeReceiverCompat);

    void setOriginMatchedHeader(java.lang.String str, java.lang.String str2, java.util.Set<java.lang.String> set);

    void setSpeculativeLoadingConfig(androidx.webkit.SpeculativeLoadingConfig speculativeLoadingConfig);

    void warmUpRendererProcess();

    default java.util.Set<androidx.webkit.CustomHeader> getCustomHeaders() {
        return java.util.Collections.emptySet();
    }

    default java.util.Set<androidx.webkit.CustomHeader> getCustomHeaders(java.lang.String str) {
        return java.util.Collections.emptySet();
    }

    default java.util.Set<androidx.webkit.CustomHeader> getCustomHeaders(java.lang.String str, java.lang.String str2) {
        return java.util.Collections.emptySet();
    }

    default void preconnect(java.lang.String str) {
        throw new java.lang.UnsupportedOperationException("Profile#preconnect is not implemented.");
    }

    default void addQuicHints(java.util.Set<java.lang.String> set) {
        throw new java.lang.UnsupportedOperationException("Profile#addQuicHints is not implemented.");
    }
}
