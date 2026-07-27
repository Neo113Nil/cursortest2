package com.onesignal.notifications.internal.pushtoken;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.notifications.internal.pushtoken.PushTokenManager", f = "PushTokenManager.kt", l = {31}, m = "retrievePushToken")
/* loaded from: classes.dex */
public final class PushTokenManager$retrievePushToken$1 extends AbstractC1295c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PushTokenManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushTokenManager$retrievePushToken$1(PushTokenManager pushTokenManager, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = pushTokenManager;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.retrievePushToken(this);
    }
}
