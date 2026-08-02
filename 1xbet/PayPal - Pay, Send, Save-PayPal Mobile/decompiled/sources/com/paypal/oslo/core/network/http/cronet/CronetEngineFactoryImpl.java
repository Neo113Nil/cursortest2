package com.paypal.oslo.core.network.http.cronet;

@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 -2\u00020\u0001:\u0001-B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u0016H\u0000¢\u0006\u0004\b \u0010!J'\u0010$\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\"2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b$\u0010%J\u001f\u0010(\u001a\u00020\"2\u0006\u0010&\u001a\u00020\"2\u0006\u0010'\u001a\u00020\u0016H\u0002¢\u0006\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+"}, d2 = {"Lcom/paypal/oslo/core/network/http/cronet/CronetEngineFactoryImpl;", "Lcom/paypal/oslo/core/network/http/cronet/CronetEngineFactory;", "Lcom/paypal/oslo/core/network/http/cronet/CronetBuilderProvider;", "builderProvider", "<init>", "(Lcom/paypal/oslo/core/network/http/cronet/CronetBuilderProvider;)V", "Landroid/content/Context;", "context", "", "enableSslPinning", "verifySslCert", "Lcom/paypal/oslo/core/network/http/config/CacheType;", "cacheType", "Lorg/chromium/net/CronetEngine;", "createEngine", "(Landroid/content/Context;ZZLcom/paypal/oslo/core/network/http/config/CacheType;)Lorg/chromium/net/CronetEngine;", "Lorg/chromium/net/CronetEngine$Builder;", "builder", "", "configureSslPinning$http_release", "(Lorg/chromium/net/CronetEngine$Builder;)V", "", "", "pins", "", "", "convertPinsToBytes$http_release", "(Ljava/util/Collection;)Ljava/util/Set;", "Ljava/util/Date;", "createPinExpiryDate$http_release", "()Ljava/util/Date;", "okHttpPattern", "convertOkHttpPatternToCronetPattern$http_release", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/io/File;", "deviceCacheDir", "configureCache$http_release", "(Lorg/chromium/net/CronetEngine$Builder;Ljava/io/File;Lcom/paypal/oslo/core/network/http/config/CacheType;)V", "p0", "p1", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/network/http/cronet/CronetBuilderProvider;", "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CronetEngineFactoryImpl implements com.paypal.oslo.core.network.http.cronet.CronetEngineFactory {
    private static final com.paypal.oslo.core.network.http.cronet.CronetEngineFactoryImpl.Companion Companion = new com.paypal.oslo.core.network.http.cronet.CronetEngineFactoryImpl.Companion(null);

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.network.http.cronet.CronetBuilderProvider Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public CronetEngineFactoryImpl(com.paypal.oslo.core.network.http.cronet.CronetBuilderProvider cronetBuilderProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cronetBuilderProvider, "");
        this.Camera2StreamConfigurationMap = cronetBuilderProvider;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/core/network/http/cronet/CronetEngineFactoryImpl$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.paypal.oslo.core.network.http.cronet.CronetEngineFactory
    public final org.chromium.net.CronetEngine createEngine(android.content.Context context, boolean enableSslPinning, boolean verifySslCert, com.paypal.oslo.core.network.http.config.CacheType cacheType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheType, "");
        if (!verifySslCert) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.network.http.LoggerKt.log, "Cronet does not support disabling SSL verification. Falling back to OkHttpClient which can disable SSL verification.", null, null, 6, null);
            return null;
        }
        try {
            org.chromium.net.CronetEngine.Builder createBuilder = this.Camera2StreamConfigurationMap.createBuilder(context);
            if (enableSslPinning) {
                configureSslPinning$http_release(createBuilder);
            }
            java.io.File cacheDir = context.getCacheDir();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cacheDir, "");
            configureCache$http_release(createBuilder, cacheDir, cacheType);
            return createBuilder.build();
        } catch (java.lang.Exception e) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.core.network.http.LoggerKt.log, "Failed to create Cronet engine, falling back to standard OkHttpClient", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("enableSslPinning", java.lang.Boolean.valueOf(enableSslPinning)), kotlin.TuplesKt.to("verifySslCert", java.lang.Boolean.valueOf(verifySslCert)), kotlin.TuplesKt.to("exceptionClass", e.getClass().getName()), kotlin.TuplesKt.to("exceptionMessage", e.getMessage())), null, e, 4, null);
            return null;
        }
    }

    public final void configureSslPinning$http_release(org.chromium.net.CronetEngine.Builder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        java.util.Set<byte[]> convertPinsToBytes$http_release = convertPinsToBytes$http_release(com.paypal.oslo.core.network.http.CertificatePins.INSTANCE.getALL_PINS());
        java.util.Date createPinExpiryDate$http_release = createPinExpiryDate$http_release();
        java.util.Iterator<T> it = com.paypal.oslo.core.network.http.CertificatePins.INSTANCE.getALL_DOMAINS().iterator();
        while (it.hasNext()) {
            java.lang.String convertOkHttpPatternToCronetPattern$http_release = convertOkHttpPatternToCronetPattern$http_release((java.lang.String) it.next());
            builder.addPublicKeyPins(convertOkHttpPatternToCronetPattern$http_release, convertPinsToBytes$http_release, true, createPinExpiryDate$http_release);
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.network.http.LoggerKt.log, "Added SSL pins to Cronet", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("domain", convertOkHttpPatternToCronetPattern$http_release), kotlin.TuplesKt.to("pinCount", java.lang.Integer.valueOf(convertPinsToBytes$http_release.size())), kotlin.TuplesKt.to("includeSubdomains", java.lang.Boolean.TRUE)), null, 4, null);
        }
        builder.enablePublicKeyPinningBypassForLocalTrustAnchors(false);
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.network.http.LoggerKt.log, "SSL certificate pinning configured for Cronet engine", null, null, 6, null);
    }

    public final java.util.Set<byte[]> convertPinsToBytes$http_release(java.util.Collection<java.lang.String> pins) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pins, "");
        java.util.Collection<java.lang.String> collection = pins;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(collection, 10));
        java.util.Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(android.util.Base64.decode(kotlin.text.StringsKt.removePrefix((java.lang.String) it.next(), (java.lang.CharSequence) "sha256/"), 0));
        }
        return kotlin.collections.CollectionsKt.toSet(arrayList);
    }

    public final java.util.Date createPinExpiryDate$http_release() {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(2030, 0, 1);
        java.util.Date time = calendar.getTime();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(time, "");
        return time;
    }

    public final java.lang.String convertOkHttpPatternToCronetPattern$http_release(java.lang.String okHttpPattern) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(okHttpPattern, "");
        return kotlin.text.StringsKt.removePrefix(okHttpPattern, (java.lang.CharSequence) "**.");
    }

    public final void configureCache$http_release(org.chromium.net.CronetEngine.Builder builder, java.io.File deviceCacheDir, com.paypal.oslo.core.network.http.config.CacheType cacheType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceCacheDir, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheType, "");
        if (android.os.Build.VERSION.SDK_INT < 29) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.network.http.LoggerKt.log, "Cronet HTTP caching disabled (requires API 29+)", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("currentApiLevel", java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT))), null, 4, null);
            return;
        }
        if (cacheType instanceof com.paypal.oslo.core.network.http.config.CacheType.InMemoryCache) {
            com.paypal.oslo.core.network.http.config.CacheType.InMemoryCache inMemoryCache = (com.paypal.oslo.core.network.http.config.CacheType.InMemoryCache) cacheType;
            builder.enableHttpCache(1, inMemoryCache.getCacheSizeBytes());
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.network.http.LoggerKt.log, "Cronet in-memory HTTP cache enabled", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("cacheType", "InMemoryCache"), kotlin.TuplesKt.to("cacheSizeBytes", java.lang.Long.valueOf(inMemoryCache.getCacheSizeBytes()))), null, 4, null);
            return;
        }
        if (cacheType instanceof com.paypal.oslo.core.network.http.config.CacheType.FileCache) {
            com.paypal.oslo.core.network.http.config.CacheType.FileCache fileCache = (com.paypal.oslo.core.network.http.config.CacheType.FileCache) cacheType;
            java.lang.String cacheDir = fileCache.getCacheDir();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(cacheDir);
            sb.append("_cronet");
            java.lang.String obj = sb.toString();
            builder.setStoragePath(getHighResolutionOutputSizeshNQ4ISI(deviceCacheDir, obj).getAbsolutePath()).enableHttpCache(3, fileCache.getCacheSizeBytes());
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.network.http.LoggerKt.log, "Cronet HTTP file cache enabled", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("cacheType", "FileCache"), kotlin.TuplesKt.to("cacheDir", obj), kotlin.TuplesKt.to("cacheSizeBytes", java.lang.Long.valueOf(fileCache.getCacheSizeBytes()))), null, 4, null);
            return;
        }
        if (cacheType instanceof com.paypal.oslo.core.network.http.config.CacheType.FileCacheNoHttp) {
            com.paypal.oslo.core.network.http.config.CacheType.FileCacheNoHttp fileCacheNoHttp = (com.paypal.oslo.core.network.http.config.CacheType.FileCacheNoHttp) cacheType;
            java.lang.String cacheDir2 = fileCacheNoHttp.getCacheDir();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(cacheDir2);
            sb2.append("_cronet");
            java.lang.String obj2 = sb2.toString();
            builder.setStoragePath(getHighResolutionOutputSizeshNQ4ISI(deviceCacheDir, obj2).getAbsolutePath()).enableHttpCache(2, fileCacheNoHttp.getCacheSizeBytes());
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.network.http.LoggerKt.log, "Cronet file cache enabled (no HTTP data)", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("cacheType", "FileCacheNoHttp"), kotlin.TuplesKt.to("cacheDir", obj2), kotlin.TuplesKt.to("cacheSizeBytes", java.lang.Long.valueOf(fileCacheNoHttp.getCacheSizeBytes()))), null, 4, null);
            return;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(cacheType, com.paypal.oslo.core.network.http.config.CacheType.NoCache.INSTANCE)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.network.http.LoggerKt.log, "Cronet HTTP caching disabled (NoCache configured)", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("cacheType", "NoCache")), null, 4, null);
    }

    private static java.io.File getHighResolutionOutputSizeshNQ4ISI(java.io.File p0, java.lang.String p1) {
        java.io.File file = new java.io.File(p0, p1);
        if (!file.exists() && !file.mkdirs()) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.network.http.LoggerKt.log, "Failed to create Cronet cache directory", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("path", file.getAbsolutePath())), null, 4, null);
        }
        return file;
    }
}
