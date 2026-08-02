package com.paypal.oslo.feature.notificationcenter.domain.model;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ0\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001a\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/notificationcenter/domain/model/NotificationData;", "", "", "Lcom/paypal/oslo/feature/notificationcenter/domain/model/Section;", "sections", "Lcom/paypal/oslo/feature/notificationcenter/domain/model/Notification;", "notifications", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Lcom/paypal/oslo/feature/notificationcenter/domain/model/NotificationData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getSections", "getNotifications"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class NotificationData {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.notificationcenter.domain.model.Notification> notifications;
    private final java.util.List<com.paypal.oslo.feature.notificationcenter.domain.model.Section> sections;

    public NotificationData(java.util.List<com.paypal.oslo.feature.notificationcenter.domain.model.Section> list, java.util.List<com.paypal.oslo.feature.notificationcenter.domain.model.Notification> list2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        this.sections = list;
        this.notifications = list2;
    }

    public final java.util.List<com.paypal.oslo.feature.notificationcenter.domain.model.Section> getSections() {
        return this.sections;
    }

    public final java.util.List<com.paypal.oslo.feature.notificationcenter.domain.model.Notification> getNotifications() {
        return this.notifications;
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.notificationcenter.domain.model.Section> list = this.sections;
        java.util.List<com.paypal.oslo.feature.notificationcenter.domain.model.Notification> list2 = this.notifications;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NotificationData(sections=");
        sb.append(list);
        sb.append(", notifications=");
        sb.append(list2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.sections.hashCode() * 31) + this.notifications.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.notificationcenter.domain.model.NotificationData)) {
            return false;
        }
        com.paypal.oslo.feature.notificationcenter.domain.model.NotificationData notificationData = (com.paypal.oslo.feature.notificationcenter.domain.model.NotificationData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.sections, notificationData.sections) && kotlin.jvm.internal.Intrinsics.areEqual(this.notifications, notificationData.notifications);
    }

    public final com.paypal.oslo.feature.notificationcenter.domain.model.NotificationData copy(java.util.List<com.paypal.oslo.feature.notificationcenter.domain.model.Section> sections, java.util.List<com.paypal.oslo.feature.notificationcenter.domain.model.Notification> notifications) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sections, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notifications, "");
        return new com.paypal.oslo.feature.notificationcenter.domain.model.NotificationData(sections, notifications);
    }

    public final java.util.List<com.paypal.oslo.feature.notificationcenter.domain.model.Notification> component2() {
        return this.notifications;
    }

    public final java.util.List<com.paypal.oslo.feature.notificationcenter.domain.model.Section> component1() {
        return this.sections;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.notificationcenter.domain.model.NotificationData copy$default(com.paypal.oslo.feature.notificationcenter.domain.model.NotificationData notificationData, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = notificationData.sections;
        }
        if ((i & 2) != 0) {
            list2 = notificationData.notifications;
        }
        return notificationData.copy(list, list2);
    }
}
