package com.onesignal.notifications.internal.restoration.impl;

import D4.AbstractC0024y;
import android.service.notification.StatusBarNotification;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.notifications.internal.badges.IBadgeCountUpdater;
import com.onesignal.notifications.internal.common.NotificationHelper;
import com.onesignal.notifications.internal.data.INotificationRepository;
import com.onesignal.notifications.internal.generation.INotificationGenerationWorkManager;
import com.onesignal.notifications.internal.restoration.INotificationRestoreProcessor;
import e5.g;
import f4.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class NotificationRestoreProcessor implements INotificationRestoreProcessor {
    public static final Companion Companion = new Companion(null);
    public static final int DEFAULT_TTL_IF_NOT_IN_PAYLOAD = 259200;
    private static final int DELAY_BETWEEN_NOTIFICATION_RESTORES_MS = 200;
    private final IApplicationService _applicationService;
    private final IBadgeCountUpdater _badgeCountUpdater;
    private final INotificationRepository _dataController;
    private final INotificationGenerationWorkManager _workManager;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    public NotificationRestoreProcessor(IApplicationService _applicationService, INotificationGenerationWorkManager _workManager, INotificationRepository _dataController, IBadgeCountUpdater _badgeCountUpdater) {
        i.e(_applicationService, "_applicationService");
        i.e(_workManager, "_workManager");
        i.e(_dataController, "_dataController");
        i.e(_badgeCountUpdater, "_badgeCountUpdater");
        this._applicationService = _applicationService;
        this._workManager = _workManager;
        this._dataController = _dataController;
        this._badgeCountUpdater = _badgeCountUpdater;
    }

    private final List<Integer> getVisibleNotifications() {
        StatusBarNotification[] activeNotifications = NotificationHelper.INSTANCE.getActiveNotifications(this._applicationService.getAppContext());
        if (activeNotifications.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (StatusBarNotification statusBarNotification : activeNotifications) {
            arrayList.add(Integer.valueOf(statusBarNotification.getId()));
        }
        return arrayList;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(11:5|6|7|(1:(1:(8:11|12|13|(3:16|(2:18|19)(1:21)|14)|22|23|24|25)(2:27|28))(2:29|30))(3:32|33|(1:35)(1:36))|31|13|(1:14)|22|23|24|25))|39|6|7|(0)(0)|31|13|(1:14)|22|23|24|25) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0032, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0088, code lost:
    
        com.onesignal.debug.internal.logging.Logging.warn("Error restoring notification records! ", r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006d A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:12:0x002e, B:14:0x0067, B:16:0x006d, B:23:0x0082, B:30:0x0040, B:31:0x005f, B:33:0x004d), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // com.onesignal.notifications.internal.restoration.INotificationRestoreProcessor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object process(InterfaceC1218d interfaceC1218d) {
        NotificationRestoreProcessor$process$1 notificationRestoreProcessor$process$1;
        int i2;
        NotificationRestoreProcessor notificationRestoreProcessor;
        NotificationRestoreProcessor notificationRestoreProcessor2;
        Iterator it;
        if (interfaceC1218d instanceof NotificationRestoreProcessor$process$1) {
            notificationRestoreProcessor$process$1 = (NotificationRestoreProcessor$process$1) interfaceC1218d;
            int i3 = notificationRestoreProcessor$process$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                notificationRestoreProcessor$process$1.label = i3 - Integer.MIN_VALUE;
                Object obj = notificationRestoreProcessor$process$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = notificationRestoreProcessor$process$1.label;
                if (i2 != 0) {
                    g.y(obj);
                    Logging.info$default("Restoring notifications", null, 2, null);
                    List<Integer> visibleNotifications = getVisibleNotifications();
                    INotificationRepository iNotificationRepository = this._dataController;
                    notificationRestoreProcessor$process$1.L$0 = this;
                    notificationRestoreProcessor$process$1.label = 1;
                    obj = iNotificationRepository.listNotificationsForOutstanding(visibleNotifications, notificationRestoreProcessor$process$1);
                    if (obj == enumC1260a) {
                        return enumC1260a;
                    }
                    notificationRestoreProcessor = this;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = (Iterator) notificationRestoreProcessor$process$1.L$1;
                        notificationRestoreProcessor2 = (NotificationRestoreProcessor) notificationRestoreProcessor$process$1.L$0;
                        g.y(obj);
                        while (it.hasNext()) {
                            INotificationRepository.NotificationData notificationData = (INotificationRepository.NotificationData) it.next();
                            notificationRestoreProcessor$process$1.L$0 = notificationRestoreProcessor2;
                            notificationRestoreProcessor$process$1.L$1 = it;
                            notificationRestoreProcessor$process$1.label = 2;
                            if (notificationRestoreProcessor2.processNotification(notificationData, DELAY_BETWEEN_NOTIFICATION_RESTORES_MS, notificationRestoreProcessor$process$1) == enumC1260a) {
                                return enumC1260a;
                            }
                        }
                        notificationRestoreProcessor2._badgeCountUpdater.update();
                        return v.f5689a;
                    }
                    notificationRestoreProcessor = (NotificationRestoreProcessor) notificationRestoreProcessor$process$1.L$0;
                    g.y(obj);
                }
                notificationRestoreProcessor2 = notificationRestoreProcessor;
                it = ((List) obj).iterator();
                while (it.hasNext()) {
                }
                notificationRestoreProcessor2._badgeCountUpdater.update();
                return v.f5689a;
            }
        }
        notificationRestoreProcessor$process$1 = new NotificationRestoreProcessor$process$1(this, interfaceC1218d);
        Object obj2 = notificationRestoreProcessor$process$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = notificationRestoreProcessor$process$1.label;
        if (i2 != 0) {
        }
        notificationRestoreProcessor2 = notificationRestoreProcessor;
        it = ((List) obj2).iterator();
        while (it.hasNext()) {
        }
        notificationRestoreProcessor2._badgeCountUpdater.update();
        return v.f5689a;
    }

    @Override // com.onesignal.notifications.internal.restoration.INotificationRestoreProcessor
    public Object processNotification(INotificationRepository.NotificationData notificationData, int i2, InterfaceC1218d interfaceC1218d) {
        Object d6;
        this._workManager.beginEnqueueingWork(this._applicationService.getAppContext(), notificationData.getId(), notificationData.getAndroidId(), new JSONObject(notificationData.getFullData()), notificationData.getCreatedAt(), true, false);
        return (i2 <= 0 || (d6 = AbstractC0024y.d((long) i2, interfaceC1218d)) != EnumC1260a.f11058a) ? v.f5689a : d6;
    }
}
