package com.onesignal.session.internal.session.impl;

import com.onesignal.session.internal.outcomes.IOutcomeEventsController;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1441l;

@e(c = "com.onesignal.session.internal.session.impl.SessionListener$onSessionEnded$1", f = "SessionListener.kt", l = {79}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SessionListener$onSessionEnded$1 extends h implements InterfaceC1441l {
    final /* synthetic */ long $durationInSeconds;
    int label;
    final /* synthetic */ SessionListener this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionListener$onSessionEnded$1(SessionListener sessionListener, long j2, InterfaceC1218d interfaceC1218d) {
        super(1, interfaceC1218d);
        this.this$0 = sessionListener;
        this.$durationInSeconds = j2;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(InterfaceC1218d interfaceC1218d) {
        return new SessionListener$onSessionEnded$1(this.this$0, this.$durationInSeconds, interfaceC1218d);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        IOutcomeEventsController iOutcomeEventsController;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.label;
        if (i2 == 0) {
            g.y(obj);
            iOutcomeEventsController = this.this$0._outcomeEventsController;
            long j2 = this.$durationInSeconds;
            this.label = 1;
            if (iOutcomeEventsController.sendSessionEndOutcomeEvent(j2, this) == enumC1260a) {
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
        return ((SessionListener$onSessionEnded$1) create(interfaceC1218d)).invokeSuspend(v.f5689a);
    }
}
