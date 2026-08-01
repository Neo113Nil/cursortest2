package com.unity3d.ads.gatewayclient;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;

/* compiled from: RequestPolicy.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u000eHÆ\u0003Jm\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010)\u001a\u00020\u000e2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\u0003HÖ\u0001J\t\u0010,\u001a\u00020-HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006."}, d2 = {"Lcom/unity3d/ads/gatewayclient/RequestPolicy;", "", "maxDuration", "", "retryMaxInterval", "retryWaitBase", "retryJitterPct", "", "retryScalingFactor", "connectTimeout", "readTimeout", "writeTimeout", "overallTimeout", "shouldStoreLocally", "", "<init>", "(IIIFFIIIIZ)V", "getMaxDuration", "()I", "getRetryMaxInterval", "getRetryWaitBase", "getRetryJitterPct", "()F", "getRetryScalingFactor", "getConnectTimeout", "getReadTimeout", "getWriteTimeout", "getOverallTimeout", "getShouldStoreLocally", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class RequestPolicy {
    private final int connectTimeout;
    private final int maxDuration;
    private final int overallTimeout;
    private final int readTimeout;
    private final float retryJitterPct;
    private final int retryMaxInterval;
    private final float retryScalingFactor;
    private final int retryWaitBase;
    private final boolean shouldStoreLocally;
    private final int writeTimeout;

    /* renamed from: component1, reason: from getter */
    public final int getMaxDuration() {
        return this.maxDuration;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getShouldStoreLocally() {
        return this.shouldStoreLocally;
    }

    /* renamed from: component2, reason: from getter */
    public final int getRetryMaxInterval() {
        return this.retryMaxInterval;
    }

    /* renamed from: component3, reason: from getter */
    public final int getRetryWaitBase() {
        return this.retryWaitBase;
    }

    /* renamed from: component4, reason: from getter */
    public final float getRetryJitterPct() {
        return this.retryJitterPct;
    }

    /* renamed from: component5, reason: from getter */
    public final float getRetryScalingFactor() {
        return this.retryScalingFactor;
    }

    /* renamed from: component6, reason: from getter */
    public final int getConnectTimeout() {
        return this.connectTimeout;
    }

    /* renamed from: component7, reason: from getter */
    public final int getReadTimeout() {
        return this.readTimeout;
    }

    /* renamed from: component8, reason: from getter */
    public final int getWriteTimeout() {
        return this.writeTimeout;
    }

    /* renamed from: component9, reason: from getter */
    public final int getOverallTimeout() {
        return this.overallTimeout;
    }

    public final RequestPolicy copy(int maxDuration, int retryMaxInterval, int retryWaitBase, float retryJitterPct, float retryScalingFactor, int connectTimeout, int readTimeout, int writeTimeout, int overallTimeout, boolean shouldStoreLocally) {
        return new RequestPolicy(maxDuration, retryMaxInterval, retryWaitBase, retryJitterPct, retryScalingFactor, connectTimeout, readTimeout, writeTimeout, overallTimeout, shouldStoreLocally);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequestPolicy)) {
            return false;
        }
        RequestPolicy requestPolicy = (RequestPolicy) other;
        return this.maxDuration == requestPolicy.maxDuration && this.retryMaxInterval == requestPolicy.retryMaxInterval && this.retryWaitBase == requestPolicy.retryWaitBase && Float.compare(this.retryJitterPct, requestPolicy.retryJitterPct) == 0 && Float.compare(this.retryScalingFactor, requestPolicy.retryScalingFactor) == 0 && this.connectTimeout == requestPolicy.connectTimeout && this.readTimeout == requestPolicy.readTimeout && this.writeTimeout == requestPolicy.writeTimeout && this.overallTimeout == requestPolicy.overallTimeout && this.shouldStoreLocally == requestPolicy.shouldStoreLocally;
    }

    public int hashCode() {
        return (((((((((((((((((Integer.hashCode(this.maxDuration) * 31) + Integer.hashCode(this.retryMaxInterval)) * 31) + Integer.hashCode(this.retryWaitBase)) * 31) + Float.hashCode(this.retryJitterPct)) * 31) + Float.hashCode(this.retryScalingFactor)) * 31) + Integer.hashCode(this.connectTimeout)) * 31) + Integer.hashCode(this.readTimeout)) * 31) + Integer.hashCode(this.writeTimeout)) * 31) + Integer.hashCode(this.overallTimeout)) * 31) + Boolean.hashCode(this.shouldStoreLocally);
    }

    public String toString() {
        return "RequestPolicy(maxDuration=" + this.maxDuration + ", retryMaxInterval=" + this.retryMaxInterval + ", retryWaitBase=" + this.retryWaitBase + ", retryJitterPct=" + this.retryJitterPct + ", retryScalingFactor=" + this.retryScalingFactor + ", connectTimeout=" + this.connectTimeout + ", readTimeout=" + this.readTimeout + ", writeTimeout=" + this.writeTimeout + ", overallTimeout=" + this.overallTimeout + ", shouldStoreLocally=" + this.shouldStoreLocally + ')';
    }

    public RequestPolicy(int i, int i2, int i3, float f, float f2, int i4, int i5, int i6, int i7, boolean z) {
        this.maxDuration = i;
        this.retryMaxInterval = i2;
        this.retryWaitBase = i3;
        this.retryJitterPct = f;
        this.retryScalingFactor = f2;
        this.connectTimeout = i4;
        this.readTimeout = i5;
        this.writeTimeout = i6;
        this.overallTimeout = i7;
        this.shouldStoreLocally = z;
    }

    public final int getMaxDuration() {
        return this.maxDuration;
    }

    public final int getRetryMaxInterval() {
        return this.retryMaxInterval;
    }

    public final int getRetryWaitBase() {
        return this.retryWaitBase;
    }

    public final float getRetryJitterPct() {
        return this.retryJitterPct;
    }

    public final float getRetryScalingFactor() {
        return this.retryScalingFactor;
    }

    public final int getConnectTimeout() {
        return this.connectTimeout;
    }

    public final int getReadTimeout() {
        return this.readTimeout;
    }

    public final int getWriteTimeout() {
        return this.writeTimeout;
    }

    public final int getOverallTimeout() {
        return this.overallTimeout;
    }

    public final boolean getShouldStoreLocally() {
        return this.shouldStoreLocally;
    }
}
