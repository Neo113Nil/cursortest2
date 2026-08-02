package com.datadog.android.rum.internal.domain.event;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001Bk\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0010J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0010J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0010J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0010J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0010J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0010Jt\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b(\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b)\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b*\u0010\u0010R\u001a\u0010\f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b+\u0010\u0010R\u001a\u0010\u000b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b,\u0010\u0010R\u001a\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b-\u0010\u0010R\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b.\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b/\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b0\u0010\u0010"}, d2 = {"Lcom/datadog/android/rum/internal/domain/event/ResourceTiming;", "", "", "dnsStart", "dnsDuration", "connectStart", "connectDuration", "sslStart", "sslDuration", "firstByteStart", "firstByteDuration", "downloadStart", "downloadDuration", "<init>", "(JJJJJJJJJJ)V", "component1", "()J", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(JJJJJJJJJJ)Lcom/datadog/android/rum/internal/domain/event/ResourceTiming;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "getConnectDuration", "getConnectStart", "getDnsDuration", "getDnsStart", "getDownloadDuration", "getDownloadStart", "getFirstByteDuration", "getFirstByteStart", "getSslDuration", "getSslStart"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ResourceTiming {
    private final long connectDuration;
    private final long connectStart;
    private final long dnsDuration;
    private final long dnsStart;
    private final long downloadDuration;
    private final long downloadStart;
    private final long firstByteDuration;
    private final long firstByteStart;
    private final long sslDuration;
    private final long sslStart;

    public ResourceTiming(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
        this.dnsStart = j;
        this.dnsDuration = j2;
        this.connectStart = j3;
        this.connectDuration = j4;
        this.sslStart = j5;
        this.sslDuration = j6;
        this.firstByteStart = j7;
        this.firstByteDuration = j8;
        this.downloadStart = j9;
        this.downloadDuration = j10;
    }

    public /* synthetic */ ResourceTiming(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? 0L : j3, (i & 8) != 0 ? 0L : j4, (i & 16) != 0 ? 0L : j5, (i & 32) != 0 ? 0L : j6, (i & 64) != 0 ? 0L : j7, (i & 128) != 0 ? 0L : j8, (i & 256) != 0 ? 0L : j9, (i & 512) == 0 ? j10 : 0L);
    }

    public final long getDnsStart() {
        return this.dnsStart;
    }

    public final long getDnsDuration() {
        return this.dnsDuration;
    }

    public final long getConnectStart() {
        return this.connectStart;
    }

    public final long getConnectDuration() {
        return this.connectDuration;
    }

    public final long getSslStart() {
        return this.sslStart;
    }

    public final long getSslDuration() {
        return this.sslDuration;
    }

    public final long getFirstByteStart() {
        return this.firstByteStart;
    }

    public final long getFirstByteDuration() {
        return this.firstByteDuration;
    }

    public final long getDownloadStart() {
        return this.downloadStart;
    }

    public final long getDownloadDuration() {
        return this.downloadDuration;
    }

    public final java.lang.String toString() {
        long j = this.dnsStart;
        long j2 = this.dnsDuration;
        long j3 = this.connectStart;
        long j4 = this.connectDuration;
        long j5 = this.sslStart;
        long j6 = this.sslDuration;
        long j7 = this.firstByteStart;
        long j8 = this.firstByteDuration;
        long j9 = this.downloadStart;
        long j10 = this.downloadDuration;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ResourceTiming(dnsStart=");
        sb.append(j);
        sb.append(", dnsDuration=");
        sb.append(j2);
        sb.append(", connectStart=");
        sb.append(j3);
        sb.append(", connectDuration=");
        sb.append(j4);
        sb.append(", sslStart=");
        sb.append(j5);
        sb.append(", sslDuration=");
        sb.append(j6);
        sb.append(", firstByteStart=");
        sb.append(j7);
        sb.append(", firstByteDuration=");
        sb.append(j8);
        sb.append(", downloadStart=");
        sb.append(j9);
        sb.append(", downloadDuration=");
        sb.append(j10);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((((((((((java.lang.Long.hashCode(this.dnsStart) * 31) + java.lang.Long.hashCode(this.dnsDuration)) * 31) + java.lang.Long.hashCode(this.connectStart)) * 31) + java.lang.Long.hashCode(this.connectDuration)) * 31) + java.lang.Long.hashCode(this.sslStart)) * 31) + java.lang.Long.hashCode(this.sslDuration)) * 31) + java.lang.Long.hashCode(this.firstByteStart)) * 31) + java.lang.Long.hashCode(this.firstByteDuration)) * 31) + java.lang.Long.hashCode(this.downloadStart)) * 31) + java.lang.Long.hashCode(this.downloadDuration);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.datadog.android.rum.internal.domain.event.ResourceTiming)) {
            return false;
        }
        com.datadog.android.rum.internal.domain.event.ResourceTiming resourceTiming = (com.datadog.android.rum.internal.domain.event.ResourceTiming) other;
        return this.dnsStart == resourceTiming.dnsStart && this.dnsDuration == resourceTiming.dnsDuration && this.connectStart == resourceTiming.connectStart && this.connectDuration == resourceTiming.connectDuration && this.sslStart == resourceTiming.sslStart && this.sslDuration == resourceTiming.sslDuration && this.firstByteStart == resourceTiming.firstByteStart && this.firstByteDuration == resourceTiming.firstByteDuration && this.downloadStart == resourceTiming.downloadStart && this.downloadDuration == resourceTiming.downloadDuration;
    }

    public final com.datadog.android.rum.internal.domain.event.ResourceTiming copy(long dnsStart, long dnsDuration, long connectStart, long connectDuration, long sslStart, long sslDuration, long firstByteStart, long firstByteDuration, long downloadStart, long downloadDuration) {
        return new com.datadog.android.rum.internal.domain.event.ResourceTiming(dnsStart, dnsDuration, connectStart, connectDuration, sslStart, sslDuration, firstByteStart, firstByteDuration, downloadStart, downloadDuration);
    }

    /* renamed from: component9, reason: from getter */
    public final long getDownloadStart() {
        return this.downloadStart;
    }

    /* renamed from: component8, reason: from getter */
    public final long getFirstByteDuration() {
        return this.firstByteDuration;
    }

    /* renamed from: component7, reason: from getter */
    public final long getFirstByteStart() {
        return this.firstByteStart;
    }

    /* renamed from: component6, reason: from getter */
    public final long getSslDuration() {
        return this.sslDuration;
    }

    /* renamed from: component5, reason: from getter */
    public final long getSslStart() {
        return this.sslStart;
    }

    /* renamed from: component4, reason: from getter */
    public final long getConnectDuration() {
        return this.connectDuration;
    }

    /* renamed from: component3, reason: from getter */
    public final long getConnectStart() {
        return this.connectStart;
    }

    /* renamed from: component2, reason: from getter */
    public final long getDnsDuration() {
        return this.dnsDuration;
    }

    /* renamed from: component10, reason: from getter */
    public final long getDownloadDuration() {
        return this.downloadDuration;
    }

    /* renamed from: component1, reason: from getter */
    public final long getDnsStart() {
        return this.dnsStart;
    }

    public ResourceTiming() {
        this(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 1023, null);
    }
}
