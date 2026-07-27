package com.onesignal.notifications;

import com.onesignal.common.services.IServiceProvider;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.device.IDeviceService;
import com.onesignal.notifications.internal.registration.impl.GooglePlayServicesUpgradePrompt;
import com.onesignal.notifications.internal.registration.impl.PushRegistratorADM;
import com.onesignal.notifications.internal.registration.impl.PushRegistratorFCM;
import com.onesignal.notifications.internal.registration.impl.PushRegistratorHMS;
import com.onesignal.notifications.internal.registration.impl.PushRegistratorNone;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class NotificationsModule$register$2 extends j implements InterfaceC1441l {
    public static final NotificationsModule$register$2 INSTANCE = new NotificationsModule$register$2();

    public NotificationsModule$register$2() {
        super(1);
    }

    @Override // t4.InterfaceC1441l
    public final Object invoke(IServiceProvider it) {
        Object pushRegistratorHMS;
        i.e(it, "it");
        IDeviceService iDeviceService = (IDeviceService) it.getService(IDeviceService.class);
        if (iDeviceService.isFireOSDeviceType()) {
            return new PushRegistratorADM((IApplicationService) it.getService(IApplicationService.class));
        }
        if (!iDeviceService.isAndroidDeviceType()) {
            pushRegistratorHMS = new PushRegistratorHMS(iDeviceService, (IApplicationService) it.getService(IApplicationService.class));
        } else {
            if (!iDeviceService.getHasFCMLibrary()) {
                return new PushRegistratorNone();
            }
            pushRegistratorHMS = new PushRegistratorFCM((ConfigModelStore) it.getService(ConfigModelStore.class), (IApplicationService) it.getService(IApplicationService.class), (GooglePlayServicesUpgradePrompt) it.getService(GooglePlayServicesUpgradePrompt.class), iDeviceService);
        }
        return pushRegistratorHMS;
    }
}
