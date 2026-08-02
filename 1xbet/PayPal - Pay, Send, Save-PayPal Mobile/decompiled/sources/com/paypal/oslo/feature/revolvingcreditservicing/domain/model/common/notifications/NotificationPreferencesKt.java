package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a#\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a)\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/notifications/NotificationPreferences;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/notifications/NotificationPreferenceId;", "preferenceId", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/notifications/NotificationChannel;", "getChannels", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/notifications/NotificationPreferences;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/notifications/NotificationPreferenceId;)Ljava/util/List;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/notifications/NotificationDataItem;", "(Ljava/util/List;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/notifications/NotificationPreferenceId;)Ljava/util/List;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class NotificationPreferencesKt {
    public static final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationChannel> getChannels(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationPreferences notificationPreferences, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationPreferenceId notificationPreferenceId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notificationPreferenceId, "");
        return getChannels(notificationPreferences != null ? notificationPreferences.getNotificationPreferences() : null, notificationPreferenceId);
    }

    public static final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationChannel> getChannels(java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationDataItem> list, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationPreferenceId notificationPreferenceId) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notificationPreferenceId, "");
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationChannel> list2 = null;
        if (list != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : list) {
                if (obj2 instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationPreferenceItem) {
                    arrayList.add(obj2);
                }
            }
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationPreferenceItem) obj).getId() == notificationPreferenceId) {
                    break;
                }
            }
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationPreferenceItem notificationPreferenceItem = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationPreferenceItem) obj;
            if (notificationPreferenceItem != null) {
                list2 = notificationPreferenceItem.getDefaultChannels();
            }
        }
        return list2 == null ? kotlin.collections.CollectionsKt.emptyList() : list2;
    }
}
