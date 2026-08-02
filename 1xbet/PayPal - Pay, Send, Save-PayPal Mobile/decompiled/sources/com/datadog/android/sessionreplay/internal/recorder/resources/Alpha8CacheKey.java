package com.datadog.android.sessionreplay.internal.recorder.resources;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/recorder/resources/Alpha8CacheKey;", "", "", "width", "height", "", "signature", "<init>", "(IIJ)V", "component1", "()I", "component2", "component3", "()J", "copy", "(IIJ)Lcom/datadog/android/sessionreplay/internal/recorder/resources/Alpha8CacheKey;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getHeight", "J", "getSignature", "getWidth"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Alpha8CacheKey {
    private final int height;
    private final long signature;
    private final int width;

    public Alpha8CacheKey(int i, int i2, long j) {
        this.width = i;
        this.height = i2;
        this.signature = j;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int getHeight() {
        return this.height;
    }

    public final long getSignature() {
        return this.signature;
    }

    public final java.lang.String toString() {
        int i = this.width;
        int i2 = this.height;
        long j = this.signature;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Alpha8CacheKey(width=");
        sb.append(i);
        sb.append(", height=");
        sb.append(i2);
        sb.append(", signature=");
        sb.append(j);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((java.lang.Integer.hashCode(this.width) * 31) + java.lang.Integer.hashCode(this.height)) * 31) + java.lang.Long.hashCode(this.signature);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.datadog.android.sessionreplay.internal.recorder.resources.Alpha8CacheKey)) {
            return false;
        }
        com.datadog.android.sessionreplay.internal.recorder.resources.Alpha8CacheKey alpha8CacheKey = (com.datadog.android.sessionreplay.internal.recorder.resources.Alpha8CacheKey) other;
        return this.width == alpha8CacheKey.width && this.height == alpha8CacheKey.height && this.signature == alpha8CacheKey.signature;
    }

    public final com.datadog.android.sessionreplay.internal.recorder.resources.Alpha8CacheKey copy(int width, int height, long signature) {
        return new com.datadog.android.sessionreplay.internal.recorder.resources.Alpha8CacheKey(width, height, signature);
    }

    /* renamed from: component3, reason: from getter */
    public final long getSignature() {
        return this.signature;
    }

    /* renamed from: component2, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* renamed from: component1, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    public static /* synthetic */ com.datadog.android.sessionreplay.internal.recorder.resources.Alpha8CacheKey copy$default(com.datadog.android.sessionreplay.internal.recorder.resources.Alpha8CacheKey alpha8CacheKey, int i, int i2, long j, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = alpha8CacheKey.width;
        }
        if ((i3 & 2) != 0) {
            i2 = alpha8CacheKey.height;
        }
        if ((i3 & 4) != 0) {
            j = alpha8CacheKey.signature;
        }
        return alpha8CacheKey.copy(i, i2, j);
    }
}
