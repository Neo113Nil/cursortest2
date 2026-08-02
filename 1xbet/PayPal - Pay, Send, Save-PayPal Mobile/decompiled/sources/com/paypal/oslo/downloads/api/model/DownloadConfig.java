package com.paypal.oslo.downloads.api.model;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001Bm\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0014J\u0012\u0010 \u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b\"\u0010#Jv\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fHÆ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020\u00022\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b*\u0010\u0019J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b1\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b2\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u0010\u0019R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b6\u0010\u001bR\u001a\u0010\u000b\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b7\u0010\u001bR\u001a\u0010\f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010.\u001a\u0004\b8\u0010\u0014R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00109\u001a\u0004\b:\u0010!R\u001a\u0010\u0010\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010;\u001a\u0004\b<\u0010#"}, d2 = {"Lcom/paypal/oslo/downloads/api/model/DownloadConfig;", "", "", "showNotification", "requiresWifi", "requiresCharging", "requiresSufficientBattery", "", "maxRetries", "Lkotlin/time/Duration;", "connectionTimeout", "readTimeout", "enableResume", "Lcom/paypal/oslo/downloads/api/model/ChecksumConfig;", "checksumConfig", "Lcom/paypal/oslo/downloads/api/model/CachePolicy;", "cachePolicy", "<init>", "(ZZZZIJJZLcom/paypal/oslo/downloads/api/model/ChecksumConfig;Lcom/paypal/oslo/downloads/api/model/CachePolicy;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Z", "component2", "component3", "component4", "component5", "()I", "component6-UwyO8pc", "()J", "component6", "component7-UwyO8pc", "component7", "component8", "component9", "()Lcom/paypal/oslo/downloads/api/model/ChecksumConfig;", "component10", "()Lcom/paypal/oslo/downloads/api/model/CachePolicy;", "copy-uu1qWtI", "(ZZZZIJJZLcom/paypal/oslo/downloads/api/model/ChecksumConfig;Lcom/paypal/oslo/downloads/api/model/CachePolicy;)Lcom/paypal/oslo/downloads/api/model/DownloadConfig;", "copy", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Z", "getShowNotification", "getRequiresWifi", "getRequiresCharging", "getRequiresSufficientBattery", com.visa.cbp.getEncExpo.warmup, "getMaxRetries", "J", "getConnectionTimeout-UwyO8pc", "getReadTimeout-UwyO8pc", "getEnableResume", "Lcom/paypal/oslo/downloads/api/model/ChecksumConfig;", "getChecksumConfig", "Lcom/paypal/oslo/downloads/api/model/CachePolicy;", "getCachePolicy"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DownloadConfig {
    private final com.paypal.oslo.downloads.api.model.CachePolicy cachePolicy;
    private final com.paypal.oslo.downloads.api.model.ChecksumConfig checksumConfig;
    private final long connectionTimeout;
    private final boolean enableResume;
    private final int maxRetries;
    private final long readTimeout;
    private final boolean requiresCharging;
    private final boolean requiresSufficientBattery;
    private final boolean requiresWifi;
    private final boolean showNotification;

    private DownloadConfig(boolean z, boolean z2, boolean z3, boolean z4, int i, long j, long j2, boolean z5, com.paypal.oslo.downloads.api.model.ChecksumConfig checksumConfig, com.paypal.oslo.downloads.api.model.CachePolicy cachePolicy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cachePolicy, "");
        this.showNotification = z;
        this.requiresWifi = z2;
        this.requiresCharging = z3;
        this.requiresSufficientBattery = z4;
        this.maxRetries = i;
        this.connectionTimeout = j;
        this.readTimeout = j2;
        this.enableResume = z5;
        this.checksumConfig = checksumConfig;
        this.cachePolicy = cachePolicy;
    }

    public final boolean getShowNotification() {
        return this.showNotification;
    }

    public final boolean getRequiresWifi() {
        return this.requiresWifi;
    }

    public final boolean getRequiresCharging() {
        return this.requiresCharging;
    }

    public final boolean getRequiresSufficientBattery() {
        return this.requiresSufficientBattery;
    }

    public final int getMaxRetries() {
        return this.maxRetries;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ DownloadConfig(boolean z, boolean z2, boolean z3, boolean z4, int i, long j, long j2, boolean z5, com.paypal.oslo.downloads.api.model.ChecksumConfig checksumConfig, com.paypal.oslo.downloads.api.model.CachePolicy cachePolicy, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r3, r5, r4, r6, r7, r9, (i2 & 128) == 0 ? z5 : true, (i2 & 256) != 0 ? null : checksumConfig, (i2 & 512) != 0 ? com.paypal.oslo.downloads.api.model.CachePolicy.INSTANCE.getDEFAULT() : cachePolicy, null);
        long j3;
        long j4;
        boolean z6 = (i2 & 1) != 0 ? true : z;
        boolean z7 = (i2 & 2) != 0 ? false : z2;
        boolean z8 = (i2 & 4) != 0 ? false : z3;
        boolean z9 = (i2 & 8) == 0 ? z4 : false;
        int i3 = (i2 & 16) != 0 ? 3 : i;
        if ((i2 & 32) != 0) {
            kotlin.time.Duration.Companion companion = kotlin.time.Duration.INSTANCE;
            j3 = kotlin.time.DurationKt.toDuration(30, kotlin.time.DurationUnit.SECONDS);
        } else {
            j3 = j;
        }
        if ((i2 & 64) != 0) {
            kotlin.time.Duration.Companion companion2 = kotlin.time.Duration.INSTANCE;
            j4 = kotlin.time.DurationKt.toDuration(60, kotlin.time.DurationUnit.SECONDS);
        } else {
            j4 = j2;
        }
    }

    /* renamed from: getConnectionTimeout-UwyO8pc, reason: not valid java name */
    public final long m11723getConnectionTimeoutUwyO8pc() {
        return this.connectionTimeout;
    }

    /* renamed from: getReadTimeout-UwyO8pc, reason: not valid java name */
    public final long m11724getReadTimeoutUwyO8pc() {
        return this.readTimeout;
    }

    public final boolean getEnableResume() {
        return this.enableResume;
    }

    public final com.paypal.oslo.downloads.api.model.ChecksumConfig getChecksumConfig() {
        return this.checksumConfig;
    }

    public final com.paypal.oslo.downloads.api.model.CachePolicy getCachePolicy() {
        return this.cachePolicy;
    }

    public final java.lang.String toString() {
        boolean z = this.showNotification;
        boolean z2 = this.requiresWifi;
        boolean z3 = this.requiresCharging;
        boolean z4 = this.requiresSufficientBattery;
        int i = this.maxRetries;
        java.lang.String m23977toStringimpl = kotlin.time.Duration.m23977toStringimpl(this.connectionTimeout);
        java.lang.String m23977toStringimpl2 = kotlin.time.Duration.m23977toStringimpl(this.readTimeout);
        boolean z5 = this.enableResume;
        com.paypal.oslo.downloads.api.model.ChecksumConfig checksumConfig = this.checksumConfig;
        com.paypal.oslo.downloads.api.model.CachePolicy cachePolicy = this.cachePolicy;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DownloadConfig(showNotification=");
        sb.append(z);
        sb.append(", requiresWifi=");
        sb.append(z2);
        sb.append(", requiresCharging=");
        sb.append(z3);
        sb.append(", requiresSufficientBattery=");
        sb.append(z4);
        sb.append(", maxRetries=");
        sb.append(i);
        sb.append(", connectionTimeout=");
        sb.append(m23977toStringimpl);
        sb.append(", readTimeout=");
        sb.append(m23977toStringimpl2);
        sb.append(", enableResume=");
        sb.append(z5);
        sb.append(", checksumConfig=");
        sb.append(checksumConfig);
        sb.append(", cachePolicy=");
        sb.append(cachePolicy);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.showNotification);
        int hashCode2 = java.lang.Boolean.hashCode(this.requiresWifi);
        int hashCode3 = java.lang.Boolean.hashCode(this.requiresCharging);
        int hashCode4 = java.lang.Boolean.hashCode(this.requiresSufficientBattery);
        int hashCode5 = java.lang.Integer.hashCode(this.maxRetries);
        int m23960hashCodeimpl = kotlin.time.Duration.m23960hashCodeimpl(this.connectionTimeout);
        int m23960hashCodeimpl2 = kotlin.time.Duration.m23960hashCodeimpl(this.readTimeout);
        int hashCode6 = java.lang.Boolean.hashCode(this.enableResume);
        com.paypal.oslo.downloads.api.model.ChecksumConfig checksumConfig = this.checksumConfig;
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + m23960hashCodeimpl) * 31) + m23960hashCodeimpl2) * 31) + hashCode6) * 31) + (checksumConfig == null ? 0 : checksumConfig.hashCode())) * 31) + this.cachePolicy.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.downloads.api.model.DownloadConfig)) {
            return false;
        }
        com.paypal.oslo.downloads.api.model.DownloadConfig downloadConfig = (com.paypal.oslo.downloads.api.model.DownloadConfig) other;
        return this.showNotification == downloadConfig.showNotification && this.requiresWifi == downloadConfig.requiresWifi && this.requiresCharging == downloadConfig.requiresCharging && this.requiresSufficientBattery == downloadConfig.requiresSufficientBattery && this.maxRetries == downloadConfig.maxRetries && kotlin.time.Duration.m23947equalsimpl0(this.connectionTimeout, downloadConfig.connectionTimeout) && kotlin.time.Duration.m23947equalsimpl0(this.readTimeout, downloadConfig.readTimeout) && this.enableResume == downloadConfig.enableResume && kotlin.jvm.internal.Intrinsics.areEqual(this.checksumConfig, downloadConfig.checksumConfig) && kotlin.jvm.internal.Intrinsics.areEqual(this.cachePolicy, downloadConfig.cachePolicy);
    }

    /* renamed from: copy-uu1qWtI, reason: not valid java name */
    public final com.paypal.oslo.downloads.api.model.DownloadConfig m11722copyuu1qWtI(boolean showNotification, boolean requiresWifi, boolean requiresCharging, boolean requiresSufficientBattery, int maxRetries, long connectionTimeout, long readTimeout, boolean enableResume, com.paypal.oslo.downloads.api.model.ChecksumConfig checksumConfig, com.paypal.oslo.downloads.api.model.CachePolicy cachePolicy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cachePolicy, "");
        return new com.paypal.oslo.downloads.api.model.DownloadConfig(showNotification, requiresWifi, requiresCharging, requiresSufficientBattery, maxRetries, connectionTimeout, readTimeout, enableResume, checksumConfig, cachePolicy, null);
    }

    /* renamed from: component9, reason: from getter */
    public final com.paypal.oslo.downloads.api.model.ChecksumConfig getChecksumConfig() {
        return this.checksumConfig;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getEnableResume() {
        return this.enableResume;
    }

    /* renamed from: component7-UwyO8pc, reason: not valid java name and from getter */
    public final long getReadTimeout() {
        return this.readTimeout;
    }

    /* renamed from: component6-UwyO8pc, reason: not valid java name and from getter */
    public final long getConnectionTimeout() {
        return this.connectionTimeout;
    }

    /* renamed from: component5, reason: from getter */
    public final int getMaxRetries() {
        return this.maxRetries;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getRequiresSufficientBattery() {
        return this.requiresSufficientBattery;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getRequiresCharging() {
        return this.requiresCharging;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getRequiresWifi() {
        return this.requiresWifi;
    }

    /* renamed from: component10, reason: from getter */
    public final com.paypal.oslo.downloads.api.model.CachePolicy getCachePolicy() {
        return this.cachePolicy;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShowNotification() {
        return this.showNotification;
    }

    public /* synthetic */ DownloadConfig(boolean z, boolean z2, boolean z3, boolean z4, int i, long j, long j2, boolean z5, com.paypal.oslo.downloads.api.model.ChecksumConfig checksumConfig, com.paypal.oslo.downloads.api.model.CachePolicy cachePolicy, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, z3, z4, i, j, j2, z5, checksumConfig, cachePolicy);
    }
}
