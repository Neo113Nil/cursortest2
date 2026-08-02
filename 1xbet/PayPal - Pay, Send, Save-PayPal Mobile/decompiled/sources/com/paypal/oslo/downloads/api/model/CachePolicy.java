package com.paypal.oslo.downloads.api.model;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u0000 '2\u00020\u0001:\u0001'B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J:\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/downloads/api/model/CachePolicy;", "", "Lcom/paypal/oslo/downloads/api/model/CacheStrategy;", "strategy", "Lkotlin/time/Duration;", "maxAge", "", "revalidate", "", "variant", "<init>", "(Lcom/paypal/oslo/downloads/api/model/CacheStrategy;JZLjava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/downloads/api/model/CacheStrategy;", "component2-UwyO8pc", "()J", "component2", "component3", "()Z", "component4", "()Ljava/lang/String;", "copy-dWUq8MI", "(Lcom/paypal/oslo/downloads/api/model/CacheStrategy;JZLjava/lang/String;)Lcom/paypal/oslo/downloads/api/model/CachePolicy;", "copy", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/downloads/api/model/CacheStrategy;", "getStrategy", "J", "getMaxAge-UwyO8pc", "Z", "getRevalidate", "Ljava/lang/String;", "getVariant", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CachePolicy {
    private final long maxAge;
    private final boolean revalidate;
    private final com.paypal.oslo.downloads.api.model.CacheStrategy strategy;
    private final java.lang.String variant;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.downloads.api.model.CachePolicy.Companion INSTANCE = new com.paypal.oslo.downloads.api.model.CachePolicy.Companion(null);
    private static final com.paypal.oslo.downloads.api.model.CachePolicy DEFAULT = new com.paypal.oslo.downloads.api.model.CachePolicy(null, 0, false, null, 15, null);
    private static final com.paypal.oslo.downloads.api.model.CachePolicy NETWORK_ONLY = new com.paypal.oslo.downloads.api.model.CachePolicy(com.paypal.oslo.downloads.api.model.CacheStrategy.NO_CACHE, 0, false, null, 14, null);
    private static final com.paypal.oslo.downloads.api.model.CachePolicy CACHE_ONLY = new com.paypal.oslo.downloads.api.model.CachePolicy(com.paypal.oslo.downloads.api.model.CacheStrategy.CACHE_ONLY, 0, false, null, 14, null);

    private CachePolicy(com.paypal.oslo.downloads.api.model.CacheStrategy cacheStrategy, long j, boolean z, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheStrategy, "");
        this.strategy = cacheStrategy;
        this.maxAge = j;
        this.revalidate = z;
        this.variant = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ CachePolicy(com.paypal.oslo.downloads.api.model.CacheStrategy cacheStrategy, long j, boolean z, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, j, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : str, null);
        com.paypal.oslo.downloads.api.model.CacheStrategy cacheStrategy2 = (i & 1) != 0 ? com.paypal.oslo.downloads.api.model.CacheStrategy.CACHE_FIRST : cacheStrategy;
        if ((i & 2) != 0) {
            kotlin.time.Duration.Companion companion = kotlin.time.Duration.INSTANCE;
            j = kotlin.time.DurationKt.toDuration(7, kotlin.time.DurationUnit.DAYS);
        }
    }

    public final com.paypal.oslo.downloads.api.model.CacheStrategy getStrategy() {
        return this.strategy;
    }

    /* renamed from: getMaxAge-UwyO8pc, reason: not valid java name */
    public final long m11718getMaxAgeUwyO8pc() {
        return this.maxAge;
    }

    public final boolean getRevalidate() {
        return this.revalidate;
    }

    public final java.lang.String getVariant() {
        return this.variant;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b"}, d2 = {"Lcom/paypal/oslo/downloads/api/model/CachePolicy$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/downloads/api/model/CachePolicy;", "DEFAULT", "Lcom/paypal/oslo/downloads/api/model/CachePolicy;", "getDEFAULT", "()Lcom/paypal/oslo/downloads/api/model/CachePolicy;", "NETWORK_ONLY", "getNETWORK_ONLY", "CACHE_ONLY", "getCACHE_ONLY"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.downloads.api.model.CachePolicy getDEFAULT() {
            return com.paypal.oslo.downloads.api.model.CachePolicy.DEFAULT;
        }

        public final com.paypal.oslo.downloads.api.model.CachePolicy getNETWORK_ONLY() {
            return com.paypal.oslo.downloads.api.model.CachePolicy.NETWORK_ONLY;
        }

        public final com.paypal.oslo.downloads.api.model.CachePolicy getCACHE_ONLY() {
            return com.paypal.oslo.downloads.api.model.CachePolicy.CACHE_ONLY;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.downloads.api.model.CacheStrategy cacheStrategy = this.strategy;
        java.lang.String m23977toStringimpl = kotlin.time.Duration.m23977toStringimpl(this.maxAge);
        boolean z = this.revalidate;
        java.lang.String str = this.variant;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CachePolicy(strategy=");
        sb.append(cacheStrategy);
        sb.append(", maxAge=");
        sb.append(m23977toStringimpl);
        sb.append(", revalidate=");
        sb.append(z);
        sb.append(", variant=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.strategy.hashCode();
        int m23960hashCodeimpl = kotlin.time.Duration.m23960hashCodeimpl(this.maxAge);
        int hashCode2 = java.lang.Boolean.hashCode(this.revalidate);
        java.lang.String str = this.variant;
        return (((((hashCode * 31) + m23960hashCodeimpl) * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.downloads.api.model.CachePolicy)) {
            return false;
        }
        com.paypal.oslo.downloads.api.model.CachePolicy cachePolicy = (com.paypal.oslo.downloads.api.model.CachePolicy) other;
        return this.strategy == cachePolicy.strategy && kotlin.time.Duration.m23947equalsimpl0(this.maxAge, cachePolicy.maxAge) && this.revalidate == cachePolicy.revalidate && kotlin.jvm.internal.Intrinsics.areEqual(this.variant, cachePolicy.variant);
    }

    /* renamed from: copy-dWUq8MI, reason: not valid java name */
    public final com.paypal.oslo.downloads.api.model.CachePolicy m11717copydWUq8MI(com.paypal.oslo.downloads.api.model.CacheStrategy strategy, long maxAge, boolean revalidate, java.lang.String variant) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strategy, "");
        return new com.paypal.oslo.downloads.api.model.CachePolicy(strategy, maxAge, revalidate, variant, null);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getVariant() {
        return this.variant;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getRevalidate() {
        return this.revalidate;
    }

    /* renamed from: component2-UwyO8pc, reason: not valid java name and from getter */
    public final long getMaxAge() {
        return this.maxAge;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.downloads.api.model.CacheStrategy getStrategy() {
        return this.strategy;
    }

    /* renamed from: copy-dWUq8MI$default, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.downloads.api.model.CachePolicy m11715copydWUq8MI$default(com.paypal.oslo.downloads.api.model.CachePolicy cachePolicy, com.paypal.oslo.downloads.api.model.CacheStrategy cacheStrategy, long j, boolean z, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            cacheStrategy = cachePolicy.strategy;
        }
        if ((i & 2) != 0) {
            j = cachePolicy.maxAge;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            z = cachePolicy.revalidate;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            str = cachePolicy.variant;
        }
        return cachePolicy.m11717copydWUq8MI(cacheStrategy, j2, z2, str);
    }

    public /* synthetic */ CachePolicy(com.paypal.oslo.downloads.api.model.CacheStrategy cacheStrategy, long j, boolean z, java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(cacheStrategy, j, z, str);
    }
}
