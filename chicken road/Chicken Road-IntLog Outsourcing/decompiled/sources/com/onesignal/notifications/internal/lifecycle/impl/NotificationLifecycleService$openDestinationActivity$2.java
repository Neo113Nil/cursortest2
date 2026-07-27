package com.onesignal.notifications.internal.lifecycle.impl;

import D4.InterfaceC0022w;
import android.app.Activity;
import android.content.Intent;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1445p;

@e(c = "com.onesignal.notifications.internal.lifecycle.impl.NotificationLifecycleService$openDestinationActivity$2", f = "NotificationLifecycleService.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class NotificationLifecycleService$openDestinationActivity$2 extends h implements InterfaceC1445p {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ Intent $intent;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationLifecycleService$openDestinationActivity$2(Activity activity, Intent intent, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.$activity = activity;
        this.$intent = intent;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        return new NotificationLifecycleService$openDestinationActivity$2(this.$activity, this.$intent, interfaceC1218d);
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(InterfaceC0022w interfaceC0022w, InterfaceC1218d interfaceC1218d) {
        return ((NotificationLifecycleService$openDestinationActivity$2) create(interfaceC0022w, interfaceC1218d)).invokeSuspend(v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        g.y(obj);
        this.$activity.startActivity(this.$intent);
        return v.f5689a;
    }
}
