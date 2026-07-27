package com.onesignal.notifications.internal.limiting.impl;

import android.service.notification.StatusBarNotification;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.notifications.internal.common.NotificationHelper;
import com.onesignal.notifications.internal.data.INotificationRepository;
import com.onesignal.notifications.internal.limiting.INotificationLimitManager;
import com.onesignal.notifications.internal.summary.INotificationSummaryManager;
import e5.g;
import f4.v;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;

/* loaded from: classes.dex */
public final class NotificationLimitManager implements INotificationLimitManager {
    private final IApplicationService _applicationService;
    private final INotificationRepository _dataController;
    private final INotificationSummaryManager _notificationSummaryManager;

    public NotificationLimitManager(INotificationRepository _dataController, IApplicationService _applicationService, INotificationSummaryManager _notificationSummaryManager) {
        i.e(_dataController, "_dataController");
        i.e(_applicationService, "_applicationService");
        i.e(_notificationSummaryManager, "_notificationSummaryManager");
        this._dataController = _dataController;
        this._applicationService = _applicationService;
        this._notificationSummaryManager = _notificationSummaryManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0105, code lost:
    
        if (r4 <= 0) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00fc -> B:11:0x00fe). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0101 -> B:12:0x0103). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object clearOldestOverLimitStandard(int i2, InterfaceC1218d interfaceC1218d) {
        NotificationLimitManager$clearOldestOverLimitStandard$1 notificationLimitManager$clearOldestOverLimitStandard$1;
        int i3;
        int length;
        Iterator it;
        NotificationLimitManager notificationLimitManager;
        NotificationLimitManager notificationLimitManager2;
        Iterator it2;
        Integer num;
        Iterator it3;
        NotificationLimitManager notificationLimitManager3;
        if (interfaceC1218d instanceof NotificationLimitManager$clearOldestOverLimitStandard$1) {
            notificationLimitManager$clearOldestOverLimitStandard$1 = (NotificationLimitManager$clearOldestOverLimitStandard$1) interfaceC1218d;
            int i6 = notificationLimitManager$clearOldestOverLimitStandard$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                notificationLimitManager$clearOldestOverLimitStandard$1.label = i6 - Integer.MIN_VALUE;
                Object obj = notificationLimitManager$clearOldestOverLimitStandard$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i3 = notificationLimitManager$clearOldestOverLimitStandard$1.label;
                v vVar = v.f5689a;
                if (i3 != 0) {
                    g.y(obj);
                    StatusBarNotification[] activeNotifications = NotificationHelper.INSTANCE.getActiveNotifications(this._applicationService.getAppContext());
                    length = (activeNotifications.length - INotificationLimitManager.Constants.INSTANCE.getMaxNumberOfNotifications()) + i2;
                    if (length < 1) {
                        return vVar;
                    }
                    TreeMap treeMap = new TreeMap();
                    for (StatusBarNotification statusBarNotification : activeNotifications) {
                        if (!NotificationHelper.INSTANCE.isGroupSummary(statusBarNotification)) {
                            treeMap.put(new Long(statusBarNotification.getNotification().when), new Integer(statusBarNotification.getId()));
                        }
                    }
                    it = treeMap.entrySet().iterator();
                    notificationLimitManager = this;
                    if (it.hasNext()) {
                        Integer num2 = (Integer) ((Map.Entry) it.next()).getValue();
                        INotificationRepository iNotificationRepository = notificationLimitManager._dataController;
                        i.b(num2);
                        int intValue = num2.intValue();
                        notificationLimitManager$clearOldestOverLimitStandard$1.L$0 = notificationLimitManager;
                        notificationLimitManager$clearOldestOverLimitStandard$1.L$1 = it;
                        notificationLimitManager$clearOldestOverLimitStandard$1.L$2 = num2;
                        notificationLimitManager$clearOldestOverLimitStandard$1.I$0 = length;
                        notificationLimitManager$clearOldestOverLimitStandard$1.label = 1;
                        Object markAsDismissed = iNotificationRepository.markAsDismissed(intValue, notificationLimitManager$clearOldestOverLimitStandard$1);
                        if (markAsDismissed == enumC1260a) {
                            return enumC1260a;
                        }
                        it2 = it;
                        obj = markAsDismissed;
                        notificationLimitManager2 = notificationLimitManager;
                        num = num2;
                        if (((Boolean) obj).booleanValue()) {
                        }
                    }
                    return vVar;
                }
                if (i3 == 1) {
                    length = notificationLimitManager$clearOldestOverLimitStandard$1.I$0;
                    num = (Integer) notificationLimitManager$clearOldestOverLimitStandard$1.L$2;
                    it2 = (Iterator) notificationLimitManager$clearOldestOverLimitStandard$1.L$1;
                    notificationLimitManager2 = (NotificationLimitManager) notificationLimitManager$clearOldestOverLimitStandard$1.L$0;
                    g.y(obj);
                    if (((Boolean) obj).booleanValue()) {
                        it = it2;
                        notificationLimitManager = notificationLimitManager2;
                        length--;
                    } else {
                        INotificationSummaryManager iNotificationSummaryManager = notificationLimitManager2._notificationSummaryManager;
                        i.b(num);
                        int intValue2 = num.intValue();
                        notificationLimitManager$clearOldestOverLimitStandard$1.L$0 = notificationLimitManager2;
                        notificationLimitManager$clearOldestOverLimitStandard$1.L$1 = it2;
                        notificationLimitManager$clearOldestOverLimitStandard$1.L$2 = null;
                        notificationLimitManager$clearOldestOverLimitStandard$1.I$0 = length;
                        notificationLimitManager$clearOldestOverLimitStandard$1.label = 2;
                        if (iNotificationSummaryManager.updatePossibleDependentSummaryOnDismiss(intValue2, notificationLimitManager$clearOldestOverLimitStandard$1) == enumC1260a) {
                            return enumC1260a;
                        }
                        it3 = it2;
                        notificationLimitManager3 = notificationLimitManager2;
                        it = it3;
                        notificationLimitManager = notificationLimitManager3;
                        length--;
                    }
                } else {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    length = notificationLimitManager$clearOldestOverLimitStandard$1.I$0;
                    it3 = (Iterator) notificationLimitManager$clearOldestOverLimitStandard$1.L$1;
                    notificationLimitManager3 = (NotificationLimitManager) notificationLimitManager$clearOldestOverLimitStandard$1.L$0;
                    g.y(obj);
                    it = it3;
                    notificationLimitManager = notificationLimitManager3;
                    length--;
                }
            }
        }
        notificationLimitManager$clearOldestOverLimitStandard$1 = new NotificationLimitManager$clearOldestOverLimitStandard$1(this, interfaceC1218d);
        Object obj2 = notificationLimitManager$clearOldestOverLimitStandard$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i3 = notificationLimitManager$clearOldestOverLimitStandard$1.label;
        v vVar2 = v.f5689a;
        if (i3 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.onesignal.notifications.internal.limiting.INotificationLimitManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object clearOldestOverLimit(int i2, InterfaceC1218d interfaceC1218d) {
        NotificationLimitManager$clearOldestOverLimit$1 notificationLimitManager$clearOldestOverLimit$1;
        int i3;
        NotificationLimitManager notificationLimitManager;
        INotificationRepository iNotificationRepository;
        int maxNumberOfNotifications;
        if (interfaceC1218d instanceof NotificationLimitManager$clearOldestOverLimit$1) {
            notificationLimitManager$clearOldestOverLimit$1 = (NotificationLimitManager$clearOldestOverLimit$1) interfaceC1218d;
            int i6 = notificationLimitManager$clearOldestOverLimit$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                notificationLimitManager$clearOldestOverLimit$1.label = i6 - Integer.MIN_VALUE;
                Object obj = notificationLimitManager$clearOldestOverLimit$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i3 = notificationLimitManager$clearOldestOverLimit$1.label;
                if (i3 != 0) {
                    g.y(obj);
                    try {
                        notificationLimitManager$clearOldestOverLimit$1.L$0 = this;
                        notificationLimitManager$clearOldestOverLimit$1.I$0 = i2;
                        notificationLimitManager$clearOldestOverLimit$1.label = 1;
                        if (clearOldestOverLimitStandard(i2, notificationLimitManager$clearOldestOverLimit$1) == enumC1260a) {
                            return enumC1260a;
                        }
                    } catch (Throwable unused) {
                        notificationLimitManager = this;
                        iNotificationRepository = notificationLimitManager._dataController;
                        maxNumberOfNotifications = INotificationLimitManager.Constants.INSTANCE.getMaxNumberOfNotifications();
                        notificationLimitManager$clearOldestOverLimit$1.L$0 = null;
                        notificationLimitManager$clearOldestOverLimit$1.label = 3;
                        if (iNotificationRepository.clearOldestOverLimitFallback(i2, maxNumberOfNotifications, notificationLimitManager$clearOldestOverLimit$1) == enumC1260a) {
                        }
                        return v.f5689a;
                    }
                } else if (i3 == 1 || i3 == 2) {
                    i2 = notificationLimitManager$clearOldestOverLimit$1.I$0;
                    notificationLimitManager = (NotificationLimitManager) notificationLimitManager$clearOldestOverLimit$1.L$0;
                    try {
                        g.y(obj);
                    } catch (Throwable unused2) {
                        iNotificationRepository = notificationLimitManager._dataController;
                        maxNumberOfNotifications = INotificationLimitManager.Constants.INSTANCE.getMaxNumberOfNotifications();
                        notificationLimitManager$clearOldestOverLimit$1.L$0 = null;
                        notificationLimitManager$clearOldestOverLimit$1.label = 3;
                        if (iNotificationRepository.clearOldestOverLimitFallback(i2, maxNumberOfNotifications, notificationLimitManager$clearOldestOverLimit$1) == enumC1260a) {
                            return enumC1260a;
                        }
                        return v.f5689a;
                    }
                } else {
                    if (i3 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    g.y(obj);
                }
                return v.f5689a;
            }
        }
        notificationLimitManager$clearOldestOverLimit$1 = new NotificationLimitManager$clearOldestOverLimit$1(this, interfaceC1218d);
        Object obj2 = notificationLimitManager$clearOldestOverLimit$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i3 = notificationLimitManager$clearOldestOverLimit$1.label;
        if (i3 != 0) {
        }
        return v.f5689a;
    }
}
