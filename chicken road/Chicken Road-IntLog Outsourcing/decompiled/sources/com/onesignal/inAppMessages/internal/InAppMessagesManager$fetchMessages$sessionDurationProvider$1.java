package com.onesignal.inAppMessages.internal;

import com.onesignal.core.internal.time.ITime;
import com.onesignal.session.internal.session.ISessionService;
import kotlin.jvm.internal.j;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class InAppMessagesManager$fetchMessages$sessionDurationProvider$1 extends j implements InterfaceC1430a {
    final /* synthetic */ InAppMessagesManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessagesManager$fetchMessages$sessionDurationProvider$1(InAppMessagesManager inAppMessagesManager) {
        super(0);
        this.this$0 = inAppMessagesManager;
    }

    @Override // t4.InterfaceC1430a
    public final Long invoke() {
        ITime iTime;
        ISessionService iSessionService;
        iTime = this.this$0._time;
        long currentTimeMillis = iTime.getCurrentTimeMillis();
        iSessionService = this.this$0._sessionService;
        return Long.valueOf(currentTimeMillis - iSessionService.getStartTime());
    }
}
