package com.paypal.oslo.core.network.http.config;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lcom/paypal/oslo/core/network/http/config/CacheType;", "", "<init>", "()V", "NoCache", "InMemoryCache", "FileCache", "FileCacheNoHttp", "Lcom/paypal/oslo/core/network/http/config/CacheType$FileCache;", "Lcom/paypal/oslo/core/network/http/config/CacheType$FileCacheNoHttp;", "Lcom/paypal/oslo/core/network/http/config/CacheType$InMemoryCache;", "Lcom/paypal/oslo/core/network/http/config/CacheType$NoCache;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class CacheType {
    private CacheType() {
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/core/network/http/config/CacheType$NoCache;", "Lcom/paypal/oslo/core/network/http/config/CacheType;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class NoCache extends com.paypal.oslo.core.network.http.config.CacheType {
        public static final com.paypal.oslo.core.network.http.config.CacheType.NoCache INSTANCE = new com.paypal.oslo.core.network.http.config.CacheType.NoCache();

        private NoCache() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/network/http/config/CacheType$InMemoryCache;", "Lcom/paypal/oslo/core/network/http/config/CacheType;", "", "cacheSizeBytes", "<init>", "(J)V", "component1", "()J", "copy", "(J)Lcom/paypal/oslo/core/network/http/config/CacheType$InMemoryCache;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "getCacheSizeBytes"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InMemoryCache extends com.paypal.oslo.core.network.http.config.CacheType {
        private final long cacheSizeBytes;

        public InMemoryCache(long j) {
            super(null);
            this.cacheSizeBytes = j;
        }

        public final long getCacheSizeBytes() {
            return this.cacheSizeBytes;
        }

        public final java.lang.String toString() {
            long j = this.cacheSizeBytes;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("InMemoryCache(cacheSizeBytes=");
            sb.append(j);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Long.hashCode(this.cacheSizeBytes);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.core.network.http.config.CacheType.InMemoryCache) && this.cacheSizeBytes == ((com.paypal.oslo.core.network.http.config.CacheType.InMemoryCache) other).cacheSizeBytes;
        }

        public final com.paypal.oslo.core.network.http.config.CacheType.InMemoryCache copy(long cacheSizeBytes) {
            return new com.paypal.oslo.core.network.http.config.CacheType.InMemoryCache(cacheSizeBytes);
        }

        /* renamed from: component1, reason: from getter */
        public final long getCacheSizeBytes() {
            return this.cacheSizeBytes;
        }

        public static /* synthetic */ com.paypal.oslo.core.network.http.config.CacheType.InMemoryCache copy$default(com.paypal.oslo.core.network.http.config.CacheType.InMemoryCache inMemoryCache, long j, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = inMemoryCache.cacheSizeBytes;
            }
            return inMemoryCache.copy(j);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/core/network/http/config/CacheType$FileCache;", "Lcom/paypal/oslo/core/network/http/config/CacheType;", "", "cacheDir", "", "cacheSizeBytes", "<init>", "(Ljava/lang/String;J)V", "component1", "()Ljava/lang/String;", "component2", "()J", "copy", "(Ljava/lang/String;J)Lcom/paypal/oslo/core/network/http/config/CacheType$FileCache;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCacheDir", "J", "getCacheSizeBytes"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FileCache extends com.paypal.oslo.core.network.http.config.CacheType {
        private final java.lang.String cacheDir;
        private final long cacheSizeBytes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FileCache(java.lang.String str, long j) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.cacheDir = str;
            this.cacheSizeBytes = j;
        }

        public final java.lang.String getCacheDir() {
            return this.cacheDir;
        }

        public final long getCacheSizeBytes() {
            return this.cacheSizeBytes;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.cacheDir;
            long j = this.cacheSizeBytes;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FileCache(cacheDir=");
            sb.append(str);
            sb.append(", cacheSizeBytes=");
            sb.append(j);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.cacheDir.hashCode() * 31) + java.lang.Long.hashCode(this.cacheSizeBytes);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.core.network.http.config.CacheType.FileCache)) {
                return false;
            }
            com.paypal.oslo.core.network.http.config.CacheType.FileCache fileCache = (com.paypal.oslo.core.network.http.config.CacheType.FileCache) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.cacheDir, fileCache.cacheDir) && this.cacheSizeBytes == fileCache.cacheSizeBytes;
        }

        public final com.paypal.oslo.core.network.http.config.CacheType.FileCache copy(java.lang.String cacheDir, long cacheSizeBytes) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheDir, "");
            return new com.paypal.oslo.core.network.http.config.CacheType.FileCache(cacheDir, cacheSizeBytes);
        }

        /* renamed from: component2, reason: from getter */
        public final long getCacheSizeBytes() {
            return this.cacheSizeBytes;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCacheDir() {
            return this.cacheDir;
        }

        public static /* synthetic */ com.paypal.oslo.core.network.http.config.CacheType.FileCache copy$default(com.paypal.oslo.core.network.http.config.CacheType.FileCache fileCache, java.lang.String str, long j, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = fileCache.cacheDir;
            }
            if ((i & 2) != 0) {
                j = fileCache.cacheSizeBytes;
            }
            return fileCache.copy(str, j);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/core/network/http/config/CacheType$FileCacheNoHttp;", "Lcom/paypal/oslo/core/network/http/config/CacheType;", "", "cacheDir", "", "cacheSizeBytes", "<init>", "(Ljava/lang/String;J)V", "component1", "()Ljava/lang/String;", "component2", "()J", "copy", "(Ljava/lang/String;J)Lcom/paypal/oslo/core/network/http/config/CacheType$FileCacheNoHttp;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCacheDir", "J", "getCacheSizeBytes"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FileCacheNoHttp extends com.paypal.oslo.core.network.http.config.CacheType {
        private final java.lang.String cacheDir;
        private final long cacheSizeBytes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FileCacheNoHttp(java.lang.String str, long j) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.cacheDir = str;
            this.cacheSizeBytes = j;
        }

        public final java.lang.String getCacheDir() {
            return this.cacheDir;
        }

        public final long getCacheSizeBytes() {
            return this.cacheSizeBytes;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.cacheDir;
            long j = this.cacheSizeBytes;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FileCacheNoHttp(cacheDir=");
            sb.append(str);
            sb.append(", cacheSizeBytes=");
            sb.append(j);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.cacheDir.hashCode() * 31) + java.lang.Long.hashCode(this.cacheSizeBytes);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.core.network.http.config.CacheType.FileCacheNoHttp)) {
                return false;
            }
            com.paypal.oslo.core.network.http.config.CacheType.FileCacheNoHttp fileCacheNoHttp = (com.paypal.oslo.core.network.http.config.CacheType.FileCacheNoHttp) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.cacheDir, fileCacheNoHttp.cacheDir) && this.cacheSizeBytes == fileCacheNoHttp.cacheSizeBytes;
        }

        public final com.paypal.oslo.core.network.http.config.CacheType.FileCacheNoHttp copy(java.lang.String cacheDir, long cacheSizeBytes) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheDir, "");
            return new com.paypal.oslo.core.network.http.config.CacheType.FileCacheNoHttp(cacheDir, cacheSizeBytes);
        }

        /* renamed from: component2, reason: from getter */
        public final long getCacheSizeBytes() {
            return this.cacheSizeBytes;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCacheDir() {
            return this.cacheDir;
        }

        public static /* synthetic */ com.paypal.oslo.core.network.http.config.CacheType.FileCacheNoHttp copy$default(com.paypal.oslo.core.network.http.config.CacheType.FileCacheNoHttp fileCacheNoHttp, java.lang.String str, long j, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = fileCacheNoHttp.cacheDir;
            }
            if ((i & 2) != 0) {
                j = fileCacheNoHttp.cacheSizeBytes;
            }
            return fileCacheNoHttp.copy(str, j);
        }
    }

    public /* synthetic */ CacheType(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
