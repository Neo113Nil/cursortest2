package com.onesignal.inAppMessages.internal.lifecycle.impl;

import com.onesignal.inAppMessages.internal.InAppMessage;
import com.onesignal.inAppMessages.internal.lifecycle.IInAppLifecycleEventHandler;
import f4.v;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class IAMLifecycleService$messageWillDisplay$1 extends j implements InterfaceC1441l {
    final /* synthetic */ InAppMessage $message;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IAMLifecycleService$messageWillDisplay$1(InAppMessage inAppMessage) {
        super(1);
        this.$message = inAppMessage;
    }

    @Override // t4.InterfaceC1441l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((IInAppLifecycleEventHandler) obj);
        return v.f5689a;
    }

    public final void invoke(IInAppLifecycleEventHandler it) {
        i.e(it, "it");
        it.onMessageWillDisplay(this.$message);
    }
}
