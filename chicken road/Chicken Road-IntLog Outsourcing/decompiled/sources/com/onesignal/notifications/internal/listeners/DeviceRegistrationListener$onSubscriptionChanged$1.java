package com.onesignal.notifications.internal.listeners;

import com.onesignal.notifications.INotificationsManager;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1441l;

@e(c = "com.onesignal.notifications.internal.listeners.DeviceRegistrationListener$onSubscriptionChanged$1", f = "DeviceRegistrationListener.kt", l = {118}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class DeviceRegistrationListener$onSubscriptionChanged$1 extends h implements InterfaceC1441l {
    int label;
    final /* synthetic */ DeviceRegistrationListener this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceRegistrationListener$onSubscriptionChanged$1(DeviceRegistrationListener deviceRegistrationListener, InterfaceC1218d interfaceC1218d) {
        super(1, interfaceC1218d);
        this.this$0 = deviceRegistrationListener;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(InterfaceC1218d interfaceC1218d) {
        return new DeviceRegistrationListener$onSubscriptionChanged$1(this.this$0, interfaceC1218d);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        INotificationsManager iNotificationsManager;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.label;
        if (i2 == 0) {
            g.y(obj);
            iNotificationsManager = this.this$0._notificationsManager;
            this.label = 1;
            if (iNotificationsManager.requestPermission(true, this) == enumC1260a) {
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
        return ((DeviceRegistrationListener$onSubscriptionChanged$1) create(interfaceC1218d)).invokeSuspend(v.f5689a);
    }
}
