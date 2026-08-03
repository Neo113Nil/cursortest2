package androidx.media3.datasource.cache;

/* loaded from: classes2.dex */
public interface CacheKeyFactory {
    public static final androidx.media3.datasource.cache.CacheKeyFactory DEFAULT = new androidx.media3.datasource.cache.CacheKeyFactory() { // from class: androidx.media3.datasource.cache.CacheKeyFactory$$ExternalSyntheticLambda0
        @Override // androidx.media3.datasource.cache.CacheKeyFactory
        public final java.lang.String buildCacheKey(androidx.media3.datasource.DataSpec dataSpec) {
            return androidx.media3.datasource.cache.CacheKeyFactory.CC.lambda$static$0(dataSpec);
        }
    };

    java.lang.String buildCacheKey(androidx.media3.datasource.DataSpec dataSpec);

    /* renamed from: androidx.media3.datasource.cache.CacheKeyFactory$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        static {
            androidx.media3.datasource.cache.CacheKeyFactory cacheKeyFactory = androidx.media3.datasource.cache.CacheKeyFactory.DEFAULT;
        }

        public static /* synthetic */ java.lang.String lambda$static$0(androidx.media3.datasource.DataSpec dataSpec) {
            return dataSpec.key != null ? dataSpec.key : dataSpec.uri.toString();
        }
    }
}
