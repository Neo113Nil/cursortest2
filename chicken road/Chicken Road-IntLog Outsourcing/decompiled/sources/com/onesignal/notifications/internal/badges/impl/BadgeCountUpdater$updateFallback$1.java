package com.onesignal.notifications.internal.badges.impl;

import com.onesignal.core.internal.database.ICursor;
import f4.v;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.r;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class BadgeCountUpdater$updateFallback$1 extends j implements InterfaceC1441l {
    final /* synthetic */ r $notificationCount;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadgeCountUpdater$updateFallback$1(r rVar) {
        super(1);
        this.$notificationCount = rVar;
    }

    @Override // t4.InterfaceC1441l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ICursor) obj);
        return v.f5689a;
    }

    public final void invoke(ICursor it) {
        i.e(it, "it");
        this.$notificationCount.f10740a = it.getCount();
    }
}
