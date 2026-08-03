package com.google.android.exoplayer2.upstream.cache;

/* loaded from: classes3.dex */
public interface CacheKeyFactory {
    public static final com.google.android.exoplayer2.upstream.cache.CacheKeyFactory DEFAULT = new com.google.android.exoplayer2.upstream.cache.CacheKeyFactory() { // from class: com.google.android.exoplayer2.upstream.cache.CacheKeyFactory$$ExternalSyntheticLambda0
        @Override // com.google.android.exoplayer2.upstream.cache.CacheKeyFactory
        public final java.lang.String buildCacheKey(com.google.android.exoplayer2.upstream.DataSpec dataSpec) {
            return com.google.android.exoplayer2.upstream.cache.CacheKeyFactory.CC.lambda$static$0(dataSpec);
        }
    };

    java.lang.String buildCacheKey(com.google.android.exoplayer2.upstream.DataSpec dataSpec);

    /* renamed from: com.google.android.exoplayer2.upstream.cache.CacheKeyFactory$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        static {
            com.google.android.exoplayer2.upstream.cache.CacheKeyFactory cacheKeyFactory = com.google.android.exoplayer2.upstream.cache.CacheKeyFactory.DEFAULT;
        }

        public static /* synthetic */ java.lang.String lambda$static$0(com.google.android.exoplayer2.upstream.DataSpec dataSpec) {
            return dataSpec.key != null ? dataSpec.key : dataSpec.uri.toString();
        }
    }
}
