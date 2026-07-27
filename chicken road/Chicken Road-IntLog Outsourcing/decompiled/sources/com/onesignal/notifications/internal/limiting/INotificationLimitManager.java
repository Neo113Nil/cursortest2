package com.onesignal.notifications.internal.limiting;

import k4.InterfaceC1218d;

/* loaded from: classes.dex */
public interface INotificationLimitManager {

    public static final class Constants {
        public static final Constants INSTANCE = new Constants();
        private static final int maxNumberOfNotifications = 49;

        private Constants() {
        }

        public final int getMaxNumberOfNotifications() {
            return maxNumberOfNotifications;
        }
    }

    Object clearOldestOverLimit(int i2, InterfaceC1218d interfaceC1218d);
}
