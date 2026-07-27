package com.onesignal.notifications.internal.data.impl;

import D4.InterfaceC0022w;
import android.app.NotificationManager;
import android.content.ContentValues;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.database.ICursor;
import com.onesignal.core.internal.database.IDatabase;
import com.onesignal.core.internal.database.IDatabaseProvider;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.notifications.internal.badges.IBadgeCountUpdater;
import com.onesignal.notifications.internal.common.NotificationHelper;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1441l;
import t4.InterfaceC1445p;

@e(c = "com.onesignal.notifications.internal.data.impl.NotificationRepository$markAsDismissedForGroup$2", f = "NotificationRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class NotificationRepository$markAsDismissedForGroup$2 extends h implements InterfaceC1445p {
    final /* synthetic */ String $group;
    int label;
    final /* synthetic */ NotificationRepository this$0;

    /* renamed from: com.onesignal.notifications.internal.data.impl.NotificationRepository$markAsDismissedForGroup$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends j implements InterfaceC1441l {
        final /* synthetic */ NotificationManager $notificationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(NotificationManager notificationManager) {
            super(1);
            this.$notificationManager = notificationManager;
        }

        @Override // t4.InterfaceC1441l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ICursor) obj);
            return v.f5689a;
        }

        public final void invoke(ICursor it) {
            i.e(it, "it");
            while (it.moveToNext()) {
                int i2 = it.getInt(OneSignalDbContract.NotificationTable.COLUMN_NAME_ANDROID_NOTIFICATION_ID);
                if (i2 != -1) {
                    this.$notificationManager.cancel(i2);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationRepository$markAsDismissedForGroup$2(NotificationRepository notificationRepository, String str, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.this$0 = notificationRepository;
        this.$group = str;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        return new NotificationRepository$markAsDismissedForGroup$2(this.this$0, this.$group, interfaceC1218d);
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(InterfaceC0022w interfaceC0022w, InterfaceC1218d interfaceC1218d) {
        return ((NotificationRepository$markAsDismissedForGroup$2) create(interfaceC0022w, interfaceC1218d)).invokeSuspend(v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        IApplicationService iApplicationService;
        IDatabaseProvider iDatabaseProvider;
        IDatabaseProvider iDatabaseProvider2;
        IBadgeCountUpdater iBadgeCountUpdater;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        g.y(obj);
        iApplicationService = this.this$0._applicationService;
        NotificationManager notificationManager = NotificationHelper.INSTANCE.getNotificationManager(iApplicationService.getAppContext());
        String[] strArr = {OneSignalDbContract.NotificationTable.COLUMN_NAME_ANDROID_NOTIFICATION_ID};
        String[] strArr2 = {this.$group};
        iDatabaseProvider = this.this$0._databaseProvider;
        IDatabase.DefaultImpls.query$default(iDatabaseProvider.getOs(), OneSignalDbContract.NotificationTable.TABLE_NAME, strArr, "group_id = ? AND dismissed = 0 AND opened = 0", strArr2, null, null, null, null, new AnonymousClass1(notificationManager), 240, null);
        ContentValues contentValues = new ContentValues();
        contentValues.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_DISMISSED, new Integer(1));
        iDatabaseProvider2 = this.this$0._databaseProvider;
        iDatabaseProvider2.getOs().update(OneSignalDbContract.NotificationTable.TABLE_NAME, contentValues, "group_id = ? AND opened = 0 AND dismissed = 0", strArr2);
        iBadgeCountUpdater = this.this$0._badgeCountUpdater;
        iBadgeCountUpdater.update();
        return v.f5689a;
    }
}
