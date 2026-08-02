package com.datadog.android.sessionreplay.utils;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001c\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001d\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001e\u0010\n"}, d2 = {"Lcom/datadog/android/sessionreplay/utils/GlobalBounds;", "", "", "x", "y", "width", "height", "<init>", "(JJJJ)V", "component1", "()J", "component2", "component3", "component4", "copy", "(JJJJ)Lcom/datadog/android/sessionreplay/utils/GlobalBounds;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "getHeight", "getWidth", "getX", "getY"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class GlobalBounds {
    private final long height;
    private final long width;
    private final long x;
    private final long y;

    public GlobalBounds(long j, long j2, long j3, long j4) {
        this.x = j;
        this.y = j2;
        this.width = j3;
        this.height = j4;
    }

    public final long getX() {
        return this.x;
    }

    public final long getY() {
        return this.y;
    }

    public final long getWidth() {
        return this.width;
    }

    public final long getHeight() {
        return this.height;
    }

    public final java.lang.String toString() {
        long j = this.x;
        long j2 = this.y;
        long j3 = this.width;
        long j4 = this.height;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GlobalBounds(x=");
        sb.append(j);
        sb.append(", y=");
        sb.append(j2);
        sb.append(", width=");
        sb.append(j3);
        sb.append(", height=");
        sb.append(j4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((java.lang.Long.hashCode(this.x) * 31) + java.lang.Long.hashCode(this.y)) * 31) + java.lang.Long.hashCode(this.width)) * 31) + java.lang.Long.hashCode(this.height);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.datadog.android.sessionreplay.utils.GlobalBounds)) {
            return false;
        }
        com.datadog.android.sessionreplay.utils.GlobalBounds globalBounds = (com.datadog.android.sessionreplay.utils.GlobalBounds) other;
        return this.x == globalBounds.x && this.y == globalBounds.y && this.width == globalBounds.width && this.height == globalBounds.height;
    }

    public final com.datadog.android.sessionreplay.utils.GlobalBounds copy(long x, long y, long width, long height) {
        return new com.datadog.android.sessionreplay.utils.GlobalBounds(x, y, width, height);
    }

    /* renamed from: component4, reason: from getter */
    public final long getHeight() {
        return this.height;
    }

    /* renamed from: component3, reason: from getter */
    public final long getWidth() {
        return this.width;
    }

    /* renamed from: component2, reason: from getter */
    public final long getY() {
        return this.y;
    }

    /* renamed from: component1, reason: from getter */
    public final long getX() {
        return this.x;
    }
}
