package com.datadog.android.sessionreplay.internal.processor;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJL\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\fR\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b \u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b!\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\"\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b#\u0010\fR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b$\u0010\f"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/processor/WireframeBounds;", "", "", com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT, com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_RIGHT, com.dyneti.android.dyscan.DyScanHelperTextPosition.TOP, com.dyneti.android.dyscan.DyScanHelperTextPosition.BOTTOM, "width", "height", "<init>", "(JJJJJJ)V", "component1", "()J", "component2", "component3", "component4", "component5", "component6", "copy", "(JJJJJJ)Lcom/datadog/android/sessionreplay/internal/processor/WireframeBounds;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "getBottom", "getHeight", "getLeft", "getRight", "getTop", "getWidth"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class WireframeBounds {
    private final long bottom;
    private final long height;
    private final long left;
    private final long right;
    private final long top;
    private final long width;

    public WireframeBounds(long j, long j2, long j3, long j4, long j5, long j6) {
        this.left = j;
        this.right = j2;
        this.top = j3;
        this.bottom = j4;
        this.width = j5;
        this.height = j6;
    }

    public final long getLeft() {
        return this.left;
    }

    public final long getRight() {
        return this.right;
    }

    public final long getTop() {
        return this.top;
    }

    public final long getBottom() {
        return this.bottom;
    }

    public final long getWidth() {
        return this.width;
    }

    public final long getHeight() {
        return this.height;
    }

    public final java.lang.String toString() {
        long j = this.left;
        long j2 = this.right;
        long j3 = this.top;
        long j4 = this.bottom;
        long j5 = this.width;
        long j6 = this.height;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("WireframeBounds(left=");
        sb.append(j);
        sb.append(", right=");
        sb.append(j2);
        sb.append(", top=");
        sb.append(j3);
        sb.append(", bottom=");
        sb.append(j4);
        sb.append(", width=");
        sb.append(j5);
        sb.append(", height=");
        sb.append(j6);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((java.lang.Long.hashCode(this.left) * 31) + java.lang.Long.hashCode(this.right)) * 31) + java.lang.Long.hashCode(this.top)) * 31) + java.lang.Long.hashCode(this.bottom)) * 31) + java.lang.Long.hashCode(this.width)) * 31) + java.lang.Long.hashCode(this.height);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.datadog.android.sessionreplay.internal.processor.WireframeBounds)) {
            return false;
        }
        com.datadog.android.sessionreplay.internal.processor.WireframeBounds wireframeBounds = (com.datadog.android.sessionreplay.internal.processor.WireframeBounds) other;
        return this.left == wireframeBounds.left && this.right == wireframeBounds.right && this.top == wireframeBounds.top && this.bottom == wireframeBounds.bottom && this.width == wireframeBounds.width && this.height == wireframeBounds.height;
    }

    public final com.datadog.android.sessionreplay.internal.processor.WireframeBounds copy(long left, long right, long top, long bottom, long width, long height) {
        return new com.datadog.android.sessionreplay.internal.processor.WireframeBounds(left, right, top, bottom, width, height);
    }

    /* renamed from: component6, reason: from getter */
    public final long getHeight() {
        return this.height;
    }

    /* renamed from: component5, reason: from getter */
    public final long getWidth() {
        return this.width;
    }

    /* renamed from: component4, reason: from getter */
    public final long getBottom() {
        return this.bottom;
    }

    /* renamed from: component3, reason: from getter */
    public final long getTop() {
        return this.top;
    }

    /* renamed from: component2, reason: from getter */
    public final long getRight() {
        return this.right;
    }

    /* renamed from: component1, reason: from getter */
    public final long getLeft() {
        return this.left;
    }
}
