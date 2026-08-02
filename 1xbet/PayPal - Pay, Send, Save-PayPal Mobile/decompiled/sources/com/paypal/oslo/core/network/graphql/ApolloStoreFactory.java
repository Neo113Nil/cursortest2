package com.paypal.oslo.core.network.graphql;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u001f\b\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/ApolloStoreFactory;", "", "Ljavax/inject/Provider;", "Lcom/paypal/oslo/core/network/graphql/ApolloDbPassphraseProvider;", "passphraseProvider", "Lcom/paypal/oslo/core/network/graphql/SqlCipherLibraryLoader;", "sqlCipherLibraryLoader", "<init>", "(Ljavax/inject/Provider;Lcom/paypal/oslo/core/network/graphql/SqlCipherLibraryLoader;)V", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/core/network/graphql/config/GraphQlConfig;", "config", "Lcom/apollographql/apollo/cache/normalized/ApolloStore;", "createOrNull", "(Landroid/content/Context;Lcom/paypal/oslo/core/network/graphql/config/GraphQlConfig;)Lcom/apollographql/apollo/cache/normalized/ApolloStore;", "create$graphql_release", "Ljava/io/File;", "p0", "", "getHighSpeedVideoFpsRangesFor", "(Ljava/io/File;)Z", "getHighResolutionOutputSizeshNQ4ISI", "Ljavax/inject/Provider;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/network/graphql/SqlCipherLibraryLoader;", "getHighSpeedVideoSizes", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ApolloStoreFactory {
    private static final com.paypal.oslo.core.network.graphql.ApolloStoreFactory.Companion Companion = new com.paypal.oslo.core.network.graphql.ApolloStoreFactory.Companion(null);

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final javax.inject.Provider<com.paypal.oslo.core.network.graphql.ApolloDbPassphraseProvider> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.network.graphql.SqlCipherLibraryLoader getHighSpeedVideoSizes;

    @javax.inject.Inject
    public ApolloStoreFactory(javax.inject.Provider<com.paypal.oslo.core.network.graphql.ApolloDbPassphraseProvider> provider, com.paypal.oslo.core.network.graphql.SqlCipherLibraryLoader sqlCipherLibraryLoader) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sqlCipherLibraryLoader, "");
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoSizes = sqlCipherLibraryLoader;
    }

    public final com.apollographql.apollo.cache.normalized.ApolloStore createOrNull(android.content.Context context, com.paypal.oslo.core.network.graphql.config.GraphQlConfig config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        com.paypal.oslo.core.network.graphql.config.GraphQlCacheType cacheType = config.getCacheType();
        if (cacheType instanceof com.paypal.oslo.core.network.graphql.config.GraphQlCacheType.DbCache) {
            this.getHighSpeedVideoSizes.load();
            com.paypal.oslo.core.network.graphql.config.GraphQlCacheType.DbCache dbCache = (com.paypal.oslo.core.network.graphql.config.GraphQlCacheType.DbCache) cacheType;
            java.lang.String dbName = dbCache.getDbName();
            java.io.File databasePath = context.getDatabasePath(dbName);
            if (databasePath.exists()) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(databasePath);
                if (getHighSpeedVideoFpsRangesFor(databasePath)) {
                    context.deleteDatabase(dbName);
                }
            }
            return com.apollographql.apollo.cache.normalized.ApolloStoreKt.ApolloStore$default(new com.apollographql.apollo.cache.normalized.api.MemoryCacheFactory(0, 0L, 3, null).chain(new com.apollographql.apollo.cache.normalized.sql.SqlNormalizedCacheFactory(context, dbCache.getDbName(), new net.zetetic.database.sqlcipher.SupportOpenHelperFactory(this.getHighSpeedVideoFpsRanges.get().getPassphrase()), null, false, null, 56, null)), null, null, 6, null);
        }
        if (cacheType instanceof com.paypal.oslo.core.network.graphql.config.GraphQlCacheType.MemoryCache) {
            return com.apollographql.apollo.cache.normalized.ApolloStoreKt.ApolloStore$default(new com.apollographql.apollo.cache.normalized.api.MemoryCacheFactory(0, 0L, 3, null), null, null, 6, null);
        }
        if (cacheType instanceof com.paypal.oslo.core.network.graphql.config.GraphQlCacheType.NoCache) {
            return null;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public final com.apollographql.apollo.cache.normalized.ApolloStore create$graphql_release(android.content.Context context, com.paypal.oslo.core.network.graphql.config.GraphQlConfig config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        com.apollographql.apollo.cache.normalized.ApolloStore createOrNull = createOrNull(context, config);
        if (createOrNull != null) {
            return createOrNull;
        }
        throw new java.lang.IllegalStateException("Cannot create ApolloStore with NoCache configuration. Use createOrNull() instead.".toString());
    }

    private static boolean getHighSpeedVideoFpsRangesFor(java.io.File p0) {
        boolean z;
        try {
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(p0);
            try {
                byte[] bArr = new byte[16];
                if (fileInputStream.read(bArr) == 16) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(new java.lang.String(bArr, kotlin.text.Charsets.US_ASCII), "SQLite format 3\u0000")) {
                        z = true;
                        kotlin.io.CloseableKt.closeFinally(fileInputStream, null);
                        return z;
                    }
                }
                z = false;
                kotlin.io.CloseableKt.closeFinally(fileInputStream, null);
                return z;
            } finally {
            }
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/ApolloStoreFactory$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
