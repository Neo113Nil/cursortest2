package com.onesignal.notifications.services;

import com.onesignal.OneSignal;
import com.onesignal.notifications.internal.registration.impl.IPushRegistratorCallback;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1441l;

@e(c = "com.onesignal.notifications.services.ADMMessageHandler$onRegistered$1", f = "ADMMessageHandler.kt", l = {34}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ADMMessageHandler$onRegistered$1 extends h implements InterfaceC1441l {
    final /* synthetic */ String $newRegistrationId;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ADMMessageHandler$onRegistered$1(String str, InterfaceC1218d interfaceC1218d) {
        super(1, interfaceC1218d);
        this.$newRegistrationId = str;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(InterfaceC1218d interfaceC1218d) {
        return new ADMMessageHandler$onRegistered$1(this.$newRegistrationId, interfaceC1218d);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.label;
        if (i2 == 0) {
            g.y(obj);
            IPushRegistratorCallback iPushRegistratorCallback = (IPushRegistratorCallback) OneSignal.INSTANCE.getServices().getService(IPushRegistratorCallback.class);
            String str = this.$newRegistrationId;
            this.label = 1;
            if (iPushRegistratorCallback.fireCallback(str, this) == enumC1260a) {
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
        return ((ADMMessageHandler$onRegistered$1) create(interfaceC1218d)).invokeSuspend(v.f5689a);
    }
}
