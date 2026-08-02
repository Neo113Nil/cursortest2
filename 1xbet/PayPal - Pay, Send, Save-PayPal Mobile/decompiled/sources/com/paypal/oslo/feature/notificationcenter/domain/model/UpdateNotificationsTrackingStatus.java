package com.paypal.oslo.feature.notificationcenter.domain.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/notificationcenter/domain/model/UpdateNotificationsTrackingStatus;", "", "Lcom/paypal/oslo/feature/notificationcenter/domain/model/NotificationStatus;", "status", "", "success", "<init>", "(Lcom/paypal/oslo/feature/notificationcenter/domain/model/NotificationStatus;Z)V", "component1", "()Lcom/paypal/oslo/feature/notificationcenter/domain/model/NotificationStatus;", "component2", "()Z", "copy", "(Lcom/paypal/oslo/feature/notificationcenter/domain/model/NotificationStatus;Z)Lcom/paypal/oslo/feature/notificationcenter/domain/model/UpdateNotificationsTrackingStatus;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/notificationcenter/domain/model/NotificationStatus;", "getStatus", "Z", "getSuccess"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class UpdateNotificationsTrackingStatus {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus status;
    private final boolean success;

    public UpdateNotificationsTrackingStatus(com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus notificationStatus, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notificationStatus, "");
        this.status = notificationStatus;
        this.success = z;
    }

    public final com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus getStatus() {
        return this.status;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus notificationStatus = this.status;
        boolean z = this.success;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateNotificationsTrackingStatus(status=");
        sb.append(notificationStatus);
        sb.append(", success=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.status.hashCode() * 31) + java.lang.Boolean.hashCode(this.success);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.notificationcenter.domain.model.UpdateNotificationsTrackingStatus)) {
            return false;
        }
        com.paypal.oslo.feature.notificationcenter.domain.model.UpdateNotificationsTrackingStatus updateNotificationsTrackingStatus = (com.paypal.oslo.feature.notificationcenter.domain.model.UpdateNotificationsTrackingStatus) other;
        return this.status == updateNotificationsTrackingStatus.status && this.success == updateNotificationsTrackingStatus.success;
    }

    public final com.paypal.oslo.feature.notificationcenter.domain.model.UpdateNotificationsTrackingStatus copy(com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus status, boolean success) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        return new com.paypal.oslo.feature.notificationcenter.domain.model.UpdateNotificationsTrackingStatus(status, success);
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus getStatus() {
        return this.status;
    }

    public static /* synthetic */ com.paypal.oslo.feature.notificationcenter.domain.model.UpdateNotificationsTrackingStatus copy$default(com.paypal.oslo.feature.notificationcenter.domain.model.UpdateNotificationsTrackingStatus updateNotificationsTrackingStatus, com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus notificationStatus, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            notificationStatus = updateNotificationsTrackingStatus.status;
        }
        if ((i & 2) != 0) {
            z = updateNotificationsTrackingStatus.success;
        }
        return updateNotificationsTrackingStatus.copy(notificationStatus, z);
    }
}
