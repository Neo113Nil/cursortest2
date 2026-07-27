package com.onesignal.inAppMessages.internal.display.impl;

import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1441l;

@e(c = "com.onesignal.inAppMessages.internal.display.impl.InAppMessageView$setUpDraggableLayout$1$onDismiss$1", f = "InAppMessageView.kt", l = {351}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class InAppMessageView$setUpDraggableLayout$1$onDismiss$1 extends h implements InterfaceC1441l {
    int label;
    final /* synthetic */ InAppMessageView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessageView$setUpDraggableLayout$1$onDismiss$1(InAppMessageView inAppMessageView, InterfaceC1218d interfaceC1218d) {
        super(1, interfaceC1218d);
        this.this$0 = inAppMessageView;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(InterfaceC1218d interfaceC1218d) {
        return new InAppMessageView$setUpDraggableLayout$1$onDismiss$1(this.this$0, interfaceC1218d);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        Object finishAfterDelay;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.label;
        if (i2 == 0) {
            g.y(obj);
            InAppMessageView inAppMessageView = this.this$0;
            this.label = 1;
            finishAfterDelay = inAppMessageView.finishAfterDelay(this);
            if (finishAfterDelay == enumC1260a) {
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
        return ((InAppMessageView$setUpDraggableLayout$1$onDismiss$1) create(interfaceC1218d)).invokeSuspend(v.f5689a);
    }
}
