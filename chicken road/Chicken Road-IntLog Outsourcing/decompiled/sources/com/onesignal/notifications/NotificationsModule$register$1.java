package com.onesignal.notifications;

import com.onesignal.common.services.IServiceProvider;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.time.ITime;
import com.onesignal.notifications.internal.analytics.IAnalyticsTracker;
import com.onesignal.notifications.internal.analytics.impl.FirebaseAnalyticsTracker;
import com.onesignal.notifications.internal.analytics.impl.NoAnalyticsTracker;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class NotificationsModule$register$1 extends j implements InterfaceC1441l {
    public static final NotificationsModule$register$1 INSTANCE = new NotificationsModule$register$1();

    public NotificationsModule$register$1() {
        super(1);
    }

    @Override // t4.InterfaceC1441l
    public final IAnalyticsTracker invoke(IServiceProvider it) {
        i.e(it, "it");
        return FirebaseAnalyticsTracker.Companion.canTrack() ? new FirebaseAnalyticsTracker((IApplicationService) it.getService(IApplicationService.class), (ConfigModelStore) it.getService(ConfigModelStore.class), (ITime) it.getService(ITime.class)) : new NoAnalyticsTracker();
    }
}
