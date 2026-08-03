package com.unity3d.ads.core.data.model;

/* compiled from: CacheResult.kt */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/unity3d/ads/core/data/model/CacheResult;", "", "()V", "Failure", com.inmobi.unification.sdk.InitializationStatus.SUCCESS, "Lcom/unity3d/ads/core/data/model/CacheResult$Failure;", "Lcom/unity3d/ads/core/data/model/CacheResult$Success;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class CacheResult {
    public /* synthetic */ CacheResult(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: CacheResult.kt */
    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/unity3d/ads/core/data/model/CacheResult$Success;", "Lcom/unity3d/ads/core/data/model/CacheResult;", "cachedFile", "Lcom/unity3d/ads/core/data/model/CachedFile;", "source", "Lcom/unity3d/ads/core/data/model/CacheSource;", "(Lcom/unity3d/ads/core/data/model/CachedFile;Lcom/unity3d/ads/core/data/model/CacheSource;)V", "getCachedFile", "()Lcom/unity3d/ads/core/data/model/CachedFile;", "getSource", "()Lcom/unity3d/ads/core/data/model/CacheSource;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Success extends com.unity3d.ads.core.data.model.CacheResult {
        private final com.unity3d.ads.core.data.model.CachedFile cachedFile;
        private final com.unity3d.ads.core.data.model.CacheSource source;

        public static /* synthetic */ com.unity3d.ads.core.data.model.CacheResult.Success copy$default(com.unity3d.ads.core.data.model.CacheResult.Success success, com.unity3d.ads.core.data.model.CachedFile cachedFile, com.unity3d.ads.core.data.model.CacheSource cacheSource, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cachedFile = success.cachedFile;
            }
            if ((i & 2) != 0) {
                cacheSource = success.source;
            }
            return success.copy(cachedFile, cacheSource);
        }

        /* renamed from: component1, reason: from getter */
        public final com.unity3d.ads.core.data.model.CachedFile getCachedFile() {
            return this.cachedFile;
        }

        /* renamed from: component2, reason: from getter */
        public final com.unity3d.ads.core.data.model.CacheSource getSource() {
            return this.source;
        }

        public final com.unity3d.ads.core.data.model.CacheResult.Success copy(com.unity3d.ads.core.data.model.CachedFile cachedFile, com.unity3d.ads.core.data.model.CacheSource source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cachedFile, "cachedFile");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
            return new com.unity3d.ads.core.data.model.CacheResult.Success(cachedFile, source);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.unity3d.ads.core.data.model.CacheResult.Success)) {
                return false;
            }
            com.unity3d.ads.core.data.model.CacheResult.Success success = (com.unity3d.ads.core.data.model.CacheResult.Success) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.cachedFile, success.cachedFile) && this.source == success.source;
        }

        public int hashCode() {
            return (this.cachedFile.hashCode() * 31) + this.source.hashCode();
        }

        public java.lang.String toString() {
            return "Success(cachedFile=" + this.cachedFile + ", source=" + this.source + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(com.unity3d.ads.core.data.model.CachedFile cachedFile, com.unity3d.ads.core.data.model.CacheSource source) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cachedFile, "cachedFile");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
            this.cachedFile = cachedFile;
            this.source = source;
        }

        public final com.unity3d.ads.core.data.model.CachedFile getCachedFile() {
            return this.cachedFile;
        }

        public final com.unity3d.ads.core.data.model.CacheSource getSource() {
            return this.source;
        }
    }

    private CacheResult() {
    }

    /* compiled from: CacheResult.kt */
    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/unity3d/ads/core/data/model/CacheResult$Failure;", "Lcom/unity3d/ads/core/data/model/CacheResult;", "error", "Lcom/unity3d/ads/core/data/model/CacheError;", "source", "Lcom/unity3d/ads/core/data/model/CacheSource;", "reason", "", "(Lcom/unity3d/ads/core/data/model/CacheError;Lcom/unity3d/ads/core/data/model/CacheSource;Ljava/lang/Throwable;)V", "getError", "()Lcom/unity3d/ads/core/data/model/CacheError;", "getReason", "()Ljava/lang/Throwable;", "getSource", "()Lcom/unity3d/ads/core/data/model/CacheSource;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Failure extends com.unity3d.ads.core.data.model.CacheResult {
        private final com.unity3d.ads.core.data.model.CacheError error;
        private final java.lang.Throwable reason;
        private final com.unity3d.ads.core.data.model.CacheSource source;

        public static /* synthetic */ com.unity3d.ads.core.data.model.CacheResult.Failure copy$default(com.unity3d.ads.core.data.model.CacheResult.Failure failure, com.unity3d.ads.core.data.model.CacheError cacheError, com.unity3d.ads.core.data.model.CacheSource cacheSource, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cacheError = failure.error;
            }
            if ((i & 2) != 0) {
                cacheSource = failure.source;
            }
            if ((i & 4) != 0) {
                th = failure.reason;
            }
            return failure.copy(cacheError, cacheSource, th);
        }

        /* renamed from: component1, reason: from getter */
        public final com.unity3d.ads.core.data.model.CacheError getError() {
            return this.error;
        }

        /* renamed from: component2, reason: from getter */
        public final com.unity3d.ads.core.data.model.CacheSource getSource() {
            return this.source;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Throwable getReason() {
            return this.reason;
        }

        public final com.unity3d.ads.core.data.model.CacheResult.Failure copy(com.unity3d.ads.core.data.model.CacheError error, com.unity3d.ads.core.data.model.CacheSource source, java.lang.Throwable reason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
            return new com.unity3d.ads.core.data.model.CacheResult.Failure(error, source, reason);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.unity3d.ads.core.data.model.CacheResult.Failure)) {
                return false;
            }
            com.unity3d.ads.core.data.model.CacheResult.Failure failure = (com.unity3d.ads.core.data.model.CacheResult.Failure) other;
            return this.error == failure.error && this.source == failure.source && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, failure.reason);
        }

        public int hashCode() {
            int hashCode = ((this.error.hashCode() * 31) + this.source.hashCode()) * 31;
            java.lang.Throwable th = this.reason;
            return hashCode + (th == null ? 0 : th.hashCode());
        }

        public java.lang.String toString() {
            return "Failure(error=" + this.error + ", source=" + this.source + ", reason=" + this.reason + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(com.unity3d.ads.core.data.model.CacheError error, com.unity3d.ads.core.data.model.CacheSource source, java.lang.Throwable th) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
            this.error = error;
            this.source = source;
            this.reason = th;
        }

        public /* synthetic */ Failure(com.unity3d.ads.core.data.model.CacheError cacheError, com.unity3d.ads.core.data.model.CacheSource cacheSource, java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(cacheError, (i & 2) != 0 ? com.unity3d.ads.core.data.model.CacheSource.LOCAL : cacheSource, (i & 4) != 0 ? null : th);
        }

        public final com.unity3d.ads.core.data.model.CacheError getError() {
            return this.error;
        }

        public final java.lang.Throwable getReason() {
            return this.reason;
        }

        public final com.unity3d.ads.core.data.model.CacheSource getSource() {
            return this.source;
        }
    }
}
