package com.onesignal.inAppMessages.internal;

import com.onesignal.inAppMessages.internal.display.IInAppDisplayer;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1441l;

@e(c = "com.onesignal.inAppMessages.internal.InAppMessagesManager$paused$1", f = "InAppMessagesManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class InAppMessagesManager$paused$1 extends h implements InterfaceC1441l {
    int label;
    final /* synthetic */ InAppMessagesManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessagesManager$paused$1(InAppMessagesManager inAppMessagesManager, InterfaceC1218d interfaceC1218d) {
        super(1, interfaceC1218d);
        this.this$0 = inAppMessagesManager;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(InterfaceC1218d interfaceC1218d) {
        return new InAppMessagesManager$paused$1(this.this$0, interfaceC1218d);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        IInAppDisplayer iInAppDisplayer;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        g.y(obj);
        iInAppDisplayer = this.this$0._displayer;
        iInAppDisplayer.dismissCurrentInAppMessage();
        return v.f5689a;
    }

    @Override // t4.InterfaceC1441l
    public final Object invoke(InterfaceC1218d interfaceC1218d) {
        return ((InAppMessagesManager$paused$1) create(interfaceC1218d)).invokeSuspend(v.f5689a);
    }
}
