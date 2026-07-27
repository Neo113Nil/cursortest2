package com.onesignal.notifications.internal.data.impl;

import B0.o;
import D4.AbstractC0024y;
import D4.E;
import K4.c;
import android.content.ContentValues;
import android.content.Context;
import b2.AbstractC0279e;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.database.IDatabaseProvider;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.core.internal.time.ITime;
import com.onesignal.notifications.internal.badges.IBadgeCountUpdater;
import com.onesignal.notifications.internal.common.NotificationHelper;
import com.onesignal.notifications.internal.data.INotificationQueryHelper;
import com.onesignal.notifications.internal.data.INotificationRepository;
import e5.g;
import f4.v;
import java.util.ArrayList;
import java.util.List;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;
import l4.EnumC1260a;

/* loaded from: classes.dex */
public final class NotificationRepository implements INotificationRepository {
    private static final long NOTIFICATION_CACHE_DATA_LIFETIME = 604800;
    private final IApplicationService _applicationService;
    private final IBadgeCountUpdater _badgeCountUpdater;
    private final IDatabaseProvider _databaseProvider;
    private final INotificationQueryHelper _queryHelper;
    private final ITime _time;
    public static final Companion Companion = new Companion(null);
    private static final String[] COLUMNS_FOR_LIST_NOTIFICATIONS = {OneSignalDbContract.NotificationTable.COLUMN_NAME_TITLE, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE, "notification_id", OneSignalDbContract.NotificationTable.COLUMN_NAME_ANDROID_NOTIFICATION_ID, OneSignalDbContract.NotificationTable.COLUMN_NAME_FULL_DATA, OneSignalDbContract.NotificationTable.COLUMN_NAME_CREATED_TIME};

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final String[] getCOLUMNS_FOR_LIST_NOTIFICATIONS() {
            return NotificationRepository.COLUMNS_FOR_LIST_NOTIFICATIONS;
        }

        private Companion() {
        }
    }

    public NotificationRepository(IApplicationService _applicationService, INotificationQueryHelper _queryHelper, IDatabaseProvider _databaseProvider, ITime _time, IBadgeCountUpdater _badgeCountUpdater) {
        i.e(_applicationService, "_applicationService");
        i.e(_queryHelper, "_queryHelper");
        i.e(_databaseProvider, "_databaseProvider");
        i.e(_time, "_time");
        i.e(_badgeCountUpdater, "_badgeCountUpdater");
        this._applicationService = _applicationService;
        this._queryHelper = _queryHelper;
        this._databaseProvider = _databaseProvider;
        this._time = _time;
        this._badgeCountUpdater = _badgeCountUpdater;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean internalMarkAsDismissed(int i2) {
        Context appContext = this._applicationService.getAppContext();
        String g6 = o.g(i2, "android_notification_id = ", " AND opened = 0 AND dismissed = 0");
        ContentValues contentValues = new ContentValues();
        contentValues.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_DISMISSED, (Integer) 1);
        boolean z = this._databaseProvider.getOs().update(OneSignalDbContract.NotificationTable.TABLE_NAME, contentValues, g6, null) > 0;
        this._badgeCountUpdater.update();
        NotificationHelper.INSTANCE.getNotificationManager(appContext).cancel(i2);
        return z;
    }

    @Override // com.onesignal.notifications.internal.data.INotificationRepository
    public Object clearOldestOverLimitFallback(int i2, int i3, InterfaceC1218d interfaceC1218d) {
        Object w3 = AbstractC0024y.w(E.f461c, new NotificationRepository$clearOldestOverLimitFallback$2(i3, this, i2, null), interfaceC1218d);
        return w3 == EnumC1260a.f11058a ? w3 : v.f5689a;
    }

    @Override // com.onesignal.notifications.internal.data.INotificationRepository
    public Object createNotification(String str, String str2, String str3, boolean z, boolean z5, int i2, String str4, String str5, long j2, String str6, InterfaceC1218d interfaceC1218d) {
        Object w3 = AbstractC0024y.w(E.f461c, new NotificationRepository$createNotification$2(str, z, i2, this, str2, str3, z5, str4, str5, j2, str6, null), interfaceC1218d);
        return w3 == EnumC1260a.f11058a ? w3 : v.f5689a;
    }

    @Override // com.onesignal.notifications.internal.data.INotificationRepository
    public Object createSummaryNotification(int i2, String str, InterfaceC1218d interfaceC1218d) {
        Object w3 = AbstractC0024y.w(E.f461c, new NotificationRepository$createSummaryNotification$2(i2, str, this, null), interfaceC1218d);
        return w3 == EnumC1260a.f11058a ? w3 : v.f5689a;
    }

    @Override // com.onesignal.notifications.internal.data.INotificationRepository
    public Object deleteExpiredNotifications(InterfaceC1218d interfaceC1218d) {
        Object w3 = AbstractC0024y.w(E.f461c, new NotificationRepository$deleteExpiredNotifications$2(this, null), interfaceC1218d);
        return w3 == EnumC1260a.f11058a ? w3 : v.f5689a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.onesignal.notifications.internal.data.INotificationRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object doesNotificationExist(String str, InterfaceC1218d interfaceC1218d) {
        NotificationRepository$doesNotificationExist$1 notificationRepository$doesNotificationExist$1;
        int i2;
        q qVar;
        if (interfaceC1218d instanceof NotificationRepository$doesNotificationExist$1) {
            notificationRepository$doesNotificationExist$1 = (NotificationRepository$doesNotificationExist$1) interfaceC1218d;
            int i3 = notificationRepository$doesNotificationExist$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                notificationRepository$doesNotificationExist$1.label = i3 - Integer.MIN_VALUE;
                Object obj = notificationRepository$doesNotificationExist$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = notificationRepository$doesNotificationExist$1.label;
                if (i2 != 0) {
                    g.y(obj);
                    if (str == null || "".equals(str)) {
                        return Boolean.FALSE;
                    }
                    q qVar2 = new q();
                    c cVar = E.f461c;
                    NotificationRepository$doesNotificationExist$2 notificationRepository$doesNotificationExist$2 = new NotificationRepository$doesNotificationExist$2(str, this, qVar2, null);
                    notificationRepository$doesNotificationExist$1.L$0 = qVar2;
                    notificationRepository$doesNotificationExist$1.label = 1;
                    if (AbstractC0024y.w(cVar, notificationRepository$doesNotificationExist$2, notificationRepository$doesNotificationExist$1) == enumC1260a) {
                        return enumC1260a;
                    }
                    qVar = qVar2;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    qVar = (q) notificationRepository$doesNotificationExist$1.L$0;
                    g.y(obj);
                }
                return Boolean.valueOf(qVar.f10739a);
            }
        }
        notificationRepository$doesNotificationExist$1 = new NotificationRepository$doesNotificationExist$1(this, interfaceC1218d);
        Object obj2 = notificationRepository$doesNotificationExist$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = notificationRepository$doesNotificationExist$1.label;
        if (i2 != 0) {
        }
        return Boolean.valueOf(qVar.f10739a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.onesignal.notifications.internal.data.INotificationRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getAndroidIdForGroup(String str, boolean z, InterfaceC1218d interfaceC1218d) {
        NotificationRepository$getAndroidIdForGroup$1 notificationRepository$getAndroidIdForGroup$1;
        int i2;
        s sVar;
        if (interfaceC1218d instanceof NotificationRepository$getAndroidIdForGroup$1) {
            notificationRepository$getAndroidIdForGroup$1 = (NotificationRepository$getAndroidIdForGroup$1) interfaceC1218d;
            int i3 = notificationRepository$getAndroidIdForGroup$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                notificationRepository$getAndroidIdForGroup$1.label = i3 - Integer.MIN_VALUE;
                Object obj = notificationRepository$getAndroidIdForGroup$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = notificationRepository$getAndroidIdForGroup$1.label;
                if (i2 != 0) {
                    g.y(obj);
                    s sVar2 = new s();
                    boolean a6 = i.a(str, NotificationHelper.GROUPLESS_SUMMARY_KEY);
                    s sVar3 = new s();
                    sVar3.f10741a = a6 ? "group_id IS NULL" : "group_id = ?";
                    sVar3.f10741a = AbstractC0279e.h(new StringBuilder(), (String) sVar3.f10741a, " AND dismissed = 0 AND opened = 0 AND ");
                    StringBuilder sb = new StringBuilder();
                    sb.append((String) sVar3.f10741a);
                    sb.append(z ? "is_summary = 1" : "is_summary = 0");
                    sVar3.f10741a = sb.toString();
                    String[] strArr = a6 ? null : new String[]{str};
                    c cVar = E.f461c;
                    NotificationRepository$getAndroidIdForGroup$2 notificationRepository$getAndroidIdForGroup$2 = new NotificationRepository$getAndroidIdForGroup$2(this, sVar3, strArr, sVar2, null);
                    notificationRepository$getAndroidIdForGroup$1.L$0 = sVar2;
                    notificationRepository$getAndroidIdForGroup$1.label = 1;
                    if (AbstractC0024y.w(cVar, notificationRepository$getAndroidIdForGroup$2, notificationRepository$getAndroidIdForGroup$1) == enumC1260a) {
                        return enumC1260a;
                    }
                    sVar = sVar2;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sVar = (s) notificationRepository$getAndroidIdForGroup$1.L$0;
                    g.y(obj);
                }
                return sVar.f10741a;
            }
        }
        notificationRepository$getAndroidIdForGroup$1 = new NotificationRepository$getAndroidIdForGroup$1(this, interfaceC1218d);
        Object obj2 = notificationRepository$getAndroidIdForGroup$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = notificationRepository$getAndroidIdForGroup$1.label;
        if (i2 != 0) {
        }
        return sVar.f10741a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.onesignal.notifications.internal.data.INotificationRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getAndroidIdFromCollapseKey(String str, InterfaceC1218d interfaceC1218d) {
        NotificationRepository$getAndroidIdFromCollapseKey$1 notificationRepository$getAndroidIdFromCollapseKey$1;
        int i2;
        s sVar;
        if (interfaceC1218d instanceof NotificationRepository$getAndroidIdFromCollapseKey$1) {
            notificationRepository$getAndroidIdFromCollapseKey$1 = (NotificationRepository$getAndroidIdFromCollapseKey$1) interfaceC1218d;
            int i3 = notificationRepository$getAndroidIdFromCollapseKey$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                notificationRepository$getAndroidIdFromCollapseKey$1.label = i3 - Integer.MIN_VALUE;
                Object obj = notificationRepository$getAndroidIdFromCollapseKey$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = notificationRepository$getAndroidIdFromCollapseKey$1.label;
                if (i2 != 0) {
                    g.y(obj);
                    s sVar2 = new s();
                    c cVar = E.f461c;
                    NotificationRepository$getAndroidIdFromCollapseKey$2 notificationRepository$getAndroidIdFromCollapseKey$2 = new NotificationRepository$getAndroidIdFromCollapseKey$2(this, str, sVar2, null);
                    notificationRepository$getAndroidIdFromCollapseKey$1.L$0 = sVar2;
                    notificationRepository$getAndroidIdFromCollapseKey$1.label = 1;
                    if (AbstractC0024y.w(cVar, notificationRepository$getAndroidIdFromCollapseKey$2, notificationRepository$getAndroidIdFromCollapseKey$1) == enumC1260a) {
                        return enumC1260a;
                    }
                    sVar = sVar2;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sVar = (s) notificationRepository$getAndroidIdFromCollapseKey$1.L$0;
                    g.y(obj);
                }
                return sVar.f10741a;
            }
        }
        notificationRepository$getAndroidIdFromCollapseKey$1 = new NotificationRepository$getAndroidIdFromCollapseKey$1(this, interfaceC1218d);
        Object obj2 = notificationRepository$getAndroidIdFromCollapseKey$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = notificationRepository$getAndroidIdFromCollapseKey$1.label;
        if (i2 != 0) {
        }
        return sVar.f10741a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.onesignal.notifications.internal.data.INotificationRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getGroupId(int i2, InterfaceC1218d interfaceC1218d) {
        NotificationRepository$getGroupId$1 notificationRepository$getGroupId$1;
        int i3;
        s sVar;
        if (interfaceC1218d instanceof NotificationRepository$getGroupId$1) {
            notificationRepository$getGroupId$1 = (NotificationRepository$getGroupId$1) interfaceC1218d;
            int i6 = notificationRepository$getGroupId$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                notificationRepository$getGroupId$1.label = i6 - Integer.MIN_VALUE;
                Object obj = notificationRepository$getGroupId$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i3 = notificationRepository$getGroupId$1.label;
                if (i3 != 0) {
                    g.y(obj);
                    s sVar2 = new s();
                    c cVar = E.f461c;
                    NotificationRepository$getGroupId$2 notificationRepository$getGroupId$2 = new NotificationRepository$getGroupId$2(this, i2, sVar2, null);
                    notificationRepository$getGroupId$1.L$0 = sVar2;
                    notificationRepository$getGroupId$1.label = 1;
                    if (AbstractC0024y.w(cVar, notificationRepository$getGroupId$2, notificationRepository$getGroupId$1) == enumC1260a) {
                        return enumC1260a;
                    }
                    sVar = sVar2;
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sVar = (s) notificationRepository$getGroupId$1.L$0;
                    g.y(obj);
                }
                return sVar.f10741a;
            }
        }
        notificationRepository$getGroupId$1 = new NotificationRepository$getGroupId$1(this, interfaceC1218d);
        Object obj2 = notificationRepository$getGroupId$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i3 = notificationRepository$getGroupId$1.label;
        if (i3 != 0) {
        }
        return sVar.f10741a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.onesignal.notifications.internal.data.INotificationRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object listNotificationsForGroup(String str, InterfaceC1218d interfaceC1218d) {
        NotificationRepository$listNotificationsForGroup$1 notificationRepository$listNotificationsForGroup$1;
        int i2;
        if (interfaceC1218d instanceof NotificationRepository$listNotificationsForGroup$1) {
            notificationRepository$listNotificationsForGroup$1 = (NotificationRepository$listNotificationsForGroup$1) interfaceC1218d;
            int i3 = notificationRepository$listNotificationsForGroup$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                notificationRepository$listNotificationsForGroup$1.label = i3 - Integer.MIN_VALUE;
                Object obj = notificationRepository$listNotificationsForGroup$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = notificationRepository$listNotificationsForGroup$1.label;
                if (i2 == 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    List list = (List) notificationRepository$listNotificationsForGroup$1.L$0;
                    g.y(obj);
                    return list;
                }
                g.y(obj);
                ArrayList arrayList = new ArrayList();
                c cVar = E.f461c;
                NotificationRepository$listNotificationsForGroup$2 notificationRepository$listNotificationsForGroup$2 = new NotificationRepository$listNotificationsForGroup$2(str, this, arrayList, null);
                notificationRepository$listNotificationsForGroup$1.L$0 = arrayList;
                notificationRepository$listNotificationsForGroup$1.label = 1;
                return AbstractC0024y.w(cVar, notificationRepository$listNotificationsForGroup$2, notificationRepository$listNotificationsForGroup$1) == enumC1260a ? enumC1260a : arrayList;
            }
        }
        notificationRepository$listNotificationsForGroup$1 = new NotificationRepository$listNotificationsForGroup$1(this, interfaceC1218d);
        Object obj2 = notificationRepository$listNotificationsForGroup$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = notificationRepository$listNotificationsForGroup$1.label;
        if (i2 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.onesignal.notifications.internal.data.INotificationRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object listNotificationsForOutstanding(List<Integer> list, InterfaceC1218d interfaceC1218d) {
        NotificationRepository$listNotificationsForOutstanding$1 notificationRepository$listNotificationsForOutstanding$1;
        int i2;
        if (interfaceC1218d instanceof NotificationRepository$listNotificationsForOutstanding$1) {
            notificationRepository$listNotificationsForOutstanding$1 = (NotificationRepository$listNotificationsForOutstanding$1) interfaceC1218d;
            int i3 = notificationRepository$listNotificationsForOutstanding$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                notificationRepository$listNotificationsForOutstanding$1.label = i3 - Integer.MIN_VALUE;
                Object obj = notificationRepository$listNotificationsForOutstanding$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = notificationRepository$listNotificationsForOutstanding$1.label;
                if (i2 == 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    List list2 = (List) notificationRepository$listNotificationsForOutstanding$1.L$0;
                    g.y(obj);
                    return list2;
                }
                g.y(obj);
                ArrayList arrayList = new ArrayList();
                c cVar = E.f461c;
                NotificationRepository$listNotificationsForOutstanding$2 notificationRepository$listNotificationsForOutstanding$2 = new NotificationRepository$listNotificationsForOutstanding$2(this, list, arrayList, null);
                notificationRepository$listNotificationsForOutstanding$1.L$0 = arrayList;
                notificationRepository$listNotificationsForOutstanding$1.label = 1;
                return AbstractC0024y.w(cVar, notificationRepository$listNotificationsForOutstanding$2, notificationRepository$listNotificationsForOutstanding$1) == enumC1260a ? enumC1260a : arrayList;
            }
        }
        notificationRepository$listNotificationsForOutstanding$1 = new NotificationRepository$listNotificationsForOutstanding$1(this, interfaceC1218d);
        Object obj2 = notificationRepository$listNotificationsForOutstanding$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = notificationRepository$listNotificationsForOutstanding$1.label;
        if (i2 == 0) {
        }
    }

    @Override // com.onesignal.notifications.internal.data.INotificationRepository
    public Object markAsConsumed(int i2, boolean z, String str, boolean z5, InterfaceC1218d interfaceC1218d) {
        Object w3 = AbstractC0024y.w(E.f461c, new NotificationRepository$markAsConsumed$2(str, z, z5, this, i2, null), interfaceC1218d);
        return w3 == EnumC1260a.f11058a ? w3 : v.f5689a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.onesignal.notifications.internal.data.INotificationRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object markAsDismissed(int i2, InterfaceC1218d interfaceC1218d) {
        NotificationRepository$markAsDismissed$1 notificationRepository$markAsDismissed$1;
        int i3;
        q qVar;
        if (interfaceC1218d instanceof NotificationRepository$markAsDismissed$1) {
            notificationRepository$markAsDismissed$1 = (NotificationRepository$markAsDismissed$1) interfaceC1218d;
            int i6 = notificationRepository$markAsDismissed$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                notificationRepository$markAsDismissed$1.label = i6 - Integer.MIN_VALUE;
                Object obj = notificationRepository$markAsDismissed$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i3 = notificationRepository$markAsDismissed$1.label;
                if (i3 != 0) {
                    g.y(obj);
                    q qVar2 = new q();
                    c cVar = E.f461c;
                    NotificationRepository$markAsDismissed$2 notificationRepository$markAsDismissed$2 = new NotificationRepository$markAsDismissed$2(qVar2, this, i2, null);
                    notificationRepository$markAsDismissed$1.L$0 = qVar2;
                    notificationRepository$markAsDismissed$1.label = 1;
                    if (AbstractC0024y.w(cVar, notificationRepository$markAsDismissed$2, notificationRepository$markAsDismissed$1) == enumC1260a) {
                        return enumC1260a;
                    }
                    qVar = qVar2;
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    qVar = (q) notificationRepository$markAsDismissed$1.L$0;
                    g.y(obj);
                }
                return Boolean.valueOf(qVar.f10739a);
            }
        }
        notificationRepository$markAsDismissed$1 = new NotificationRepository$markAsDismissed$1(this, interfaceC1218d);
        Object obj2 = notificationRepository$markAsDismissed$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i3 = notificationRepository$markAsDismissed$1.label;
        if (i3 != 0) {
        }
        return Boolean.valueOf(qVar.f10739a);
    }

    @Override // com.onesignal.notifications.internal.data.INotificationRepository
    public Object markAsDismissedForGroup(String str, InterfaceC1218d interfaceC1218d) {
        Object w3 = AbstractC0024y.w(E.f461c, new NotificationRepository$markAsDismissedForGroup$2(this, str, null), interfaceC1218d);
        return w3 == EnumC1260a.f11058a ? w3 : v.f5689a;
    }

    @Override // com.onesignal.notifications.internal.data.INotificationRepository
    public Object markAsDismissedForOutstanding(InterfaceC1218d interfaceC1218d) {
        Object w3 = AbstractC0024y.w(E.f461c, new NotificationRepository$markAsDismissedForOutstanding$2(this, null), interfaceC1218d);
        return w3 == EnumC1260a.f11058a ? w3 : v.f5689a;
    }
}
