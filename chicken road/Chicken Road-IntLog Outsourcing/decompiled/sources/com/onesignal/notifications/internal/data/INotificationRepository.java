package com.onesignal.notifications.internal.data;

import java.util.List;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public interface INotificationRepository {

    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object listNotificationsForOutstanding$default(INotificationRepository iNotificationRepository, List list, InterfaceC1218d interfaceC1218d, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listNotificationsForOutstanding");
            }
            if ((i2 & 1) != 0) {
                list = null;
            }
            return iNotificationRepository.listNotificationsForOutstanding(list, interfaceC1218d);
        }

        public static /* synthetic */ Object markAsConsumed$default(INotificationRepository iNotificationRepository, int i2, boolean z, String str, boolean z5, InterfaceC1218d interfaceC1218d, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: markAsConsumed");
            }
            if ((i3 & 4) != 0) {
                str = null;
            }
            String str2 = str;
            if ((i3 & 8) != 0) {
                z5 = true;
            }
            return iNotificationRepository.markAsConsumed(i2, z, str2, z5, interfaceC1218d);
        }
    }

    public static final class NotificationData {
        private final int androidId;
        private final long createdAt;
        private final String fullData;
        private final String id;
        private final String message;
        private final String title;

        public NotificationData(int i2, String id, String fullData, long j2, String str, String str2) {
            i.e(id, "id");
            i.e(fullData, "fullData");
            this.androidId = i2;
            this.id = id;
            this.fullData = fullData;
            this.createdAt = j2;
            this.title = str;
            this.message = str2;
        }

        public final int getAndroidId() {
            return this.androidId;
        }

        public final long getCreatedAt() {
            return this.createdAt;
        }

        public final String getFullData() {
            return this.fullData;
        }

        public final String getId() {
            return this.id;
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getTitle() {
            return this.title;
        }
    }

    Object clearOldestOverLimitFallback(int i2, int i3, InterfaceC1218d interfaceC1218d);

    Object createNotification(String str, String str2, String str3, boolean z, boolean z5, int i2, String str4, String str5, long j2, String str6, InterfaceC1218d interfaceC1218d);

    Object createSummaryNotification(int i2, String str, InterfaceC1218d interfaceC1218d);

    Object deleteExpiredNotifications(InterfaceC1218d interfaceC1218d);

    Object doesNotificationExist(String str, InterfaceC1218d interfaceC1218d);

    Object getAndroidIdForGroup(String str, boolean z, InterfaceC1218d interfaceC1218d);

    Object getAndroidIdFromCollapseKey(String str, InterfaceC1218d interfaceC1218d);

    Object getGroupId(int i2, InterfaceC1218d interfaceC1218d);

    Object listNotificationsForGroup(String str, InterfaceC1218d interfaceC1218d);

    Object listNotificationsForOutstanding(List<Integer> list, InterfaceC1218d interfaceC1218d);

    Object markAsConsumed(int i2, boolean z, String str, boolean z5, InterfaceC1218d interfaceC1218d);

    Object markAsDismissed(int i2, InterfaceC1218d interfaceC1218d);

    Object markAsDismissedForGroup(String str, InterfaceC1218d interfaceC1218d);

    Object markAsDismissedForOutstanding(InterfaceC1218d interfaceC1218d);
}
