package com.paypal.oslo.core.pushnotification.domain.notification;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\nJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\r"}, d2 = {"Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationProgress;", "", "", "current", com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MAX_KEY, "", "indeterminate", "<init>", "(IIZ)V", "component1", "()I", "component2", "component3", "()Z", "copy", "(IIZ)Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationProgress;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getCurrent", "getMax", "Z", "getIndeterminate"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class NotificationProgress {
    private final int current;
    private final boolean indeterminate;
    private final int max;

    public NotificationProgress(int i, int i2, boolean z) {
        this.current = i;
        this.max = i2;
        this.indeterminate = z;
    }

    public /* synthetic */ NotificationProgress(int i, int i2, boolean z, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i3 & 4) != 0 ? false : z);
    }

    public final int getCurrent() {
        return this.current;
    }

    public final int getMax() {
        return this.max;
    }

    public final boolean getIndeterminate() {
        return this.indeterminate;
    }

    public final java.lang.String toString() {
        int i = this.current;
        int i2 = this.max;
        boolean z = this.indeterminate;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NotificationProgress(current=");
        sb.append(i);
        sb.append(", max=");
        sb.append(i2);
        sb.append(", indeterminate=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((java.lang.Integer.hashCode(this.current) * 31) + java.lang.Integer.hashCode(this.max)) * 31) + java.lang.Boolean.hashCode(this.indeterminate);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.pushnotification.domain.notification.NotificationProgress)) {
            return false;
        }
        com.paypal.oslo.core.pushnotification.domain.notification.NotificationProgress notificationProgress = (com.paypal.oslo.core.pushnotification.domain.notification.NotificationProgress) other;
        return this.current == notificationProgress.current && this.max == notificationProgress.max && this.indeterminate == notificationProgress.indeterminate;
    }

    public final com.paypal.oslo.core.pushnotification.domain.notification.NotificationProgress copy(int current, int max, boolean indeterminate) {
        return new com.paypal.oslo.core.pushnotification.domain.notification.NotificationProgress(current, max, indeterminate);
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIndeterminate() {
        return this.indeterminate;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMax() {
        return this.max;
    }

    /* renamed from: component1, reason: from getter */
    public final int getCurrent() {
        return this.current;
    }

    public static /* synthetic */ com.paypal.oslo.core.pushnotification.domain.notification.NotificationProgress copy$default(com.paypal.oslo.core.pushnotification.domain.notification.NotificationProgress notificationProgress, int i, int i2, boolean z, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = notificationProgress.current;
        }
        if ((i3 & 2) != 0) {
            i2 = notificationProgress.max;
        }
        if ((i3 & 4) != 0) {
            z = notificationProgress.indeterminate;
        }
        return notificationProgress.copy(i, i2, z);
    }
}
