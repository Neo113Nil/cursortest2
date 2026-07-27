package com.onesignal.notifications.internal.data.impl;

import D4.InterfaceC0022w;
import android.content.ContentValues;
import com.onesignal.core.internal.database.IDatabaseProvider;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.notifications.internal.badges.IBadgeCountUpdater;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import org.json.JSONException;
import t4.InterfaceC1445p;

@e(c = "com.onesignal.notifications.internal.data.impl.NotificationRepository$createNotification$2", f = "NotificationRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class NotificationRepository$createNotification$2 extends h implements InterfaceC1445p {
    final /* synthetic */ int $androidId;
    final /* synthetic */ String $body;
    final /* synthetic */ String $collapseKey;
    final /* synthetic */ long $expireTime;
    final /* synthetic */ String $groupId;
    final /* synthetic */ String $id;
    final /* synthetic */ boolean $isOpened;
    final /* synthetic */ String $jsonPayload;
    final /* synthetic */ boolean $shouldDismissIdenticals;
    final /* synthetic */ String $title;
    int label;
    final /* synthetic */ NotificationRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationRepository$createNotification$2(String str, boolean z, int i2, NotificationRepository notificationRepository, String str2, String str3, boolean z5, String str4, String str5, long j2, String str6, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.$id = str;
        this.$shouldDismissIdenticals = z;
        this.$androidId = i2;
        this.this$0 = notificationRepository;
        this.$groupId = str2;
        this.$collapseKey = str3;
        this.$isOpened = z5;
        this.$title = str4;
        this.$body = str5;
        this.$expireTime = j2;
        this.$jsonPayload = str6;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        return new NotificationRepository$createNotification$2(this.$id, this.$shouldDismissIdenticals, this.$androidId, this.this$0, this.$groupId, this.$collapseKey, this.$isOpened, this.$title, this.$body, this.$expireTime, this.$jsonPayload, interfaceC1218d);
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(InterfaceC0022w interfaceC0022w, InterfaceC1218d interfaceC1218d) {
        return ((NotificationRepository$createNotification$2) create(interfaceC0022w, interfaceC1218d)).invokeSuspend(v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        IDatabaseProvider iDatabaseProvider;
        IBadgeCountUpdater iBadgeCountUpdater;
        IDatabaseProvider iDatabaseProvider2;
        IBadgeCountUpdater iBadgeCountUpdater2;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        g.y(obj);
        Logging.debug$default("Saving Notification id=" + this.$id, null, 2, null);
        try {
            if (this.$shouldDismissIdenticals) {
                String str = "android_notification_id = " + this.$androidId;
                ContentValues contentValues = new ContentValues();
                contentValues.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_DISMISSED, new Integer(1));
                iDatabaseProvider2 = this.this$0._databaseProvider;
                iDatabaseProvider2.getOs().update(OneSignalDbContract.NotificationTable.TABLE_NAME, contentValues, str, null);
                iBadgeCountUpdater2 = this.this$0._badgeCountUpdater;
                iBadgeCountUpdater2.update();
            }
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("notification_id", this.$id);
            String str2 = this.$groupId;
            if (str2 != null) {
                contentValues2.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_GROUP_ID, str2);
            }
            String str3 = this.$collapseKey;
            if (str3 != null) {
                contentValues2.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_COLLAPSE_ID, str3);
            }
            contentValues2.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_OPENED, new Integer(this.$isOpened ? 1 : 0));
            if (!this.$isOpened) {
                contentValues2.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_ANDROID_NOTIFICATION_ID, new Integer(this.$androidId));
            }
            String str4 = this.$title;
            if (str4 != null) {
                contentValues2.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_TITLE, str4);
            }
            String str5 = this.$body;
            if (str5 != null) {
                contentValues2.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE, str5);
            }
            contentValues2.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_EXPIRE_TIME, new Long(this.$expireTime));
            contentValues2.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_FULL_DATA, this.$jsonPayload);
            iDatabaseProvider = this.this$0._databaseProvider;
            iDatabaseProvider.getOs().insertOrThrow(OneSignalDbContract.NotificationTable.TABLE_NAME, null, contentValues2);
            Logging.debug$default("Notification saved values: " + contentValues2, null, 2, null);
            if (!this.$isOpened) {
                iBadgeCountUpdater = this.this$0._badgeCountUpdater;
                iBadgeCountUpdater.update();
            }
        } catch (JSONException e3) {
            e3.printStackTrace();
        }
        return v.f5689a;
    }
}
