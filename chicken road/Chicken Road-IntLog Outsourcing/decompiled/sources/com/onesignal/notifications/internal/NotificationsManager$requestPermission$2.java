package com.onesignal.notifications.internal;

import D4.InterfaceC0022w;
import com.onesignal.notifications.internal.permissions.INotificationPermissionController;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1445p;

@e(c = "com.onesignal.notifications.internal.NotificationsManager$requestPermission$2", f = "NotificationsManager.kt", l = {94}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class NotificationsManager$requestPermission$2 extends h implements InterfaceC1445p {
    final /* synthetic */ boolean $fallbackToSettings;
    int label;
    final /* synthetic */ NotificationsManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsManager$requestPermission$2(NotificationsManager notificationsManager, boolean z, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.this$0 = notificationsManager;
        this.$fallbackToSettings = z;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        return new NotificationsManager$requestPermission$2(this.this$0, this.$fallbackToSettings, interfaceC1218d);
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(InterfaceC0022w interfaceC0022w, InterfaceC1218d interfaceC1218d) {
        return ((NotificationsManager$requestPermission$2) create(interfaceC0022w, interfaceC1218d)).invokeSuspend(v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        INotificationPermissionController iNotificationPermissionController;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.label;
        if (i2 == 0) {
            g.y(obj);
            iNotificationPermissionController = this.this$0._notificationPermissionController;
            boolean z = this.$fallbackToSettings;
            this.label = 1;
            obj = iNotificationPermissionController.prompt(z, this);
            if (obj == enumC1260a) {
                return enumC1260a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.y(obj);
        }
        return obj;
    }
}
