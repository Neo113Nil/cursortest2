package com.onesignal.notifications.internal.lifecycle.impl;

import com.onesignal.notifications.INotificationLifecycleListener;
import com.onesignal.notifications.INotificationWillDisplayEvent;
import f4.v;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class NotificationLifecycleService$externalNotificationWillShowInForeground$1 extends j implements InterfaceC1441l {
    final /* synthetic */ INotificationWillDisplayEvent $willDisplayEvent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationLifecycleService$externalNotificationWillShowInForeground$1(INotificationWillDisplayEvent iNotificationWillDisplayEvent) {
        super(1);
        this.$willDisplayEvent = iNotificationWillDisplayEvent;
    }

    @Override // t4.InterfaceC1441l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((INotificationLifecycleListener) obj);
        return v.f5689a;
    }

    public final void invoke(INotificationLifecycleListener it) {
        i.e(it, "it");
        it.onWillDisplay(this.$willDisplayEvent);
    }
}
