package com.onesignal.notifications.internal;

import com.onesignal.notifications.IPermissionObserver;
import f4.v;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class NotificationsManager$setPermissionStatusAndFire$1 extends j implements InterfaceC1441l {
    final /* synthetic */ boolean $isEnabled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsManager$setPermissionStatusAndFire$1(boolean z) {
        super(1);
        this.$isEnabled = z;
    }

    @Override // t4.InterfaceC1441l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((IPermissionObserver) obj);
        return v.f5689a;
    }

    public final void invoke(IPermissionObserver it) {
        i.e(it, "it");
        it.onNotificationPermissionChange(this.$isEnabled);
    }
}
