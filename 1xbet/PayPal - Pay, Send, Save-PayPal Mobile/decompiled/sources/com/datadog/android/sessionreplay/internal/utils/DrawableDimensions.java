package com.datadog.android.sessionreplay.internal.utils;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0018\u0010\b"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/utils/DrawableDimensions;", "", "", "width", "height", "<init>", "(JJ)V", "component1", "()J", "component2", "copy", "(JJ)Lcom/datadog/android/sessionreplay/internal/utils/DrawableDimensions;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "getHeight", "getWidth"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class DrawableDimensions {
    private final long height;
    private final long width;

    public DrawableDimensions(long j, long j2) {
        this.width = j;
        this.height = j2;
    }

    public final long getWidth() {
        return this.width;
    }

    public final long getHeight() {
        return this.height;
    }

    public final java.lang.String toString() {
        long j = this.width;
        long j2 = this.height;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DrawableDimensions(width=");
        sb.append(j);
        sb.append(", height=");
        sb.append(j2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Long.hashCode(this.width) * 31) + java.lang.Long.hashCode(this.height);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.datadog.android.sessionreplay.internal.utils.DrawableDimensions)) {
            return false;
        }
        com.datadog.android.sessionreplay.internal.utils.DrawableDimensions drawableDimensions = (com.datadog.android.sessionreplay.internal.utils.DrawableDimensions) other;
        return this.width == drawableDimensions.width && this.height == drawableDimensions.height;
    }

    public final com.datadog.android.sessionreplay.internal.utils.DrawableDimensions copy(long width, long height) {
        return new com.datadog.android.sessionreplay.internal.utils.DrawableDimensions(width, height);
    }

    /* renamed from: component2, reason: from getter */
    public final long getHeight() {
        return this.height;
    }

    /* renamed from: component1, reason: from getter */
    public final long getWidth() {
        return this.width;
    }

    public static /* synthetic */ com.datadog.android.sessionreplay.internal.utils.DrawableDimensions copy$default(com.datadog.android.sessionreplay.internal.utils.DrawableDimensions drawableDimensions, long j, long j2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = drawableDimensions.width;
        }
        if ((i & 2) != 0) {
            j2 = drawableDimensions.height;
        }
        return drawableDimensions.copy(j, j2);
    }
}
