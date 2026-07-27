package com.onesignal.notifications.internal.lifecycle.impl;

import com.onesignal.core.internal.device.IDeviceService;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1441l;

@e(c = "com.onesignal.notifications.internal.lifecycle.impl.NotificationLifecycleService$notificationOpened$2", f = "NotificationLifecycleService.kt", l = {154}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class NotificationLifecycleService$notificationOpened$2 extends h implements InterfaceC1441l {
    final /* synthetic */ String $appId;
    final /* synthetic */ IDeviceService.DeviceType $deviceType;
    final /* synthetic */ String $notificationId;
    final /* synthetic */ String $subscriptionId;
    int label;
    final /* synthetic */ NotificationLifecycleService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationLifecycleService$notificationOpened$2(NotificationLifecycleService notificationLifecycleService, String str, String str2, String str3, IDeviceService.DeviceType deviceType, InterfaceC1218d interfaceC1218d) {
        super(1, interfaceC1218d);
        this.this$0 = notificationLifecycleService;
        this.$appId = str;
        this.$notificationId = str2;
        this.$subscriptionId = str3;
        this.$deviceType = deviceType;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(InterfaceC1218d interfaceC1218d) {
        return new NotificationLifecycleService$notificationOpened$2(this.this$0, this.$appId, this.$notificationId, this.$subscriptionId, this.$deviceType, interfaceC1218d);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        Object confirmNotificationOpened;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.label;
        if (i2 == 0) {
            g.y(obj);
            NotificationLifecycleService notificationLifecycleService = this.this$0;
            String str = this.$appId;
            String str2 = this.$notificationId;
            String str3 = this.$subscriptionId;
            IDeviceService.DeviceType deviceType = this.$deviceType;
            this.label = 1;
            confirmNotificationOpened = notificationLifecycleService.confirmNotificationOpened(str, str2, str3, deviceType, this);
            if (confirmNotificationOpened == enumC1260a) {
                return enumC1260a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.y(obj);
        }
        return v.f5689a;
    }

    @Override // t4.InterfaceC1441l
    public final Object invoke(InterfaceC1218d interfaceC1218d) {
        return ((NotificationLifecycleService$notificationOpened$2) create(interfaceC1218d)).invokeSuspend(v.f5689a);
    }
}
