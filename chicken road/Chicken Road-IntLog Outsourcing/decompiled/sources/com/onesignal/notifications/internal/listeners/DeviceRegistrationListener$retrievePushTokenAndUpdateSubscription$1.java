package com.onesignal.notifications.internal.listeners;

import com.onesignal.notifications.INotificationsManager;
import com.onesignal.notifications.internal.pushtoken.IPushTokenManager;
import com.onesignal.notifications.internal.pushtoken.PushTokenResponse;
import com.onesignal.user.internal.subscriptions.ISubscriptionManager;
import com.onesignal.user.internal.subscriptions.SubscriptionStatus;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1441l;

@e(c = "com.onesignal.notifications.internal.listeners.DeviceRegistrationListener$retrievePushTokenAndUpdateSubscription$1", f = "DeviceRegistrationListener.kt", l = {97}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class DeviceRegistrationListener$retrievePushTokenAndUpdateSubscription$1 extends h implements InterfaceC1441l {
    int label;
    final /* synthetic */ DeviceRegistrationListener this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceRegistrationListener$retrievePushTokenAndUpdateSubscription$1(DeviceRegistrationListener deviceRegistrationListener, InterfaceC1218d interfaceC1218d) {
        super(1, interfaceC1218d);
        this.this$0 = deviceRegistrationListener;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(InterfaceC1218d interfaceC1218d) {
        return new DeviceRegistrationListener$retrievePushTokenAndUpdateSubscription$1(this.this$0, interfaceC1218d);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        IPushTokenManager iPushTokenManager;
        INotificationsManager iNotificationsManager;
        ISubscriptionManager iSubscriptionManager;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.label;
        if (i2 == 0) {
            g.y(obj);
            iPushTokenManager = this.this$0._pushTokenManager;
            this.label = 1;
            obj = iPushTokenManager.retrievePushToken(this);
            if (obj == enumC1260a) {
                return enumC1260a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.y(obj);
        }
        PushTokenResponse pushTokenResponse = (PushTokenResponse) obj;
        iNotificationsManager = this.this$0._notificationsManager;
        boolean mo24getPermission = iNotificationsManager.mo24getPermission();
        iSubscriptionManager = this.this$0._subscriptionManager;
        iSubscriptionManager.addOrUpdatePushSubscriptionToken(pushTokenResponse.getToken(), mo24getPermission ? pushTokenResponse.getStatus() : SubscriptionStatus.NO_PERMISSION);
        return v.f5689a;
    }

    @Override // t4.InterfaceC1441l
    public final Object invoke(InterfaceC1218d interfaceC1218d) {
        return ((DeviceRegistrationListener$retrievePushTokenAndUpdateSubscription$1) create(interfaceC1218d)).invokeSuspend(v.f5689a);
    }
}
