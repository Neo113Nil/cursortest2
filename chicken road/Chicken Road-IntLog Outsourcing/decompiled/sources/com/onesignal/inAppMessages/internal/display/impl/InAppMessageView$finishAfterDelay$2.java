package com.onesignal.inAppMessages.internal.display.impl;

import D4.AbstractC0024y;
import D4.InterfaceC0022w;
import android.widget.RelativeLayout;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1445p;

@e(c = "com.onesignal.inAppMessages.internal.display.impl.InAppMessageView$finishAfterDelay$2", f = "InAppMessageView.kt", l = {477, 479}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class InAppMessageView$finishAfterDelay$2 extends h implements InterfaceC1445p {
    int label;
    final /* synthetic */ InAppMessageView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessageView$finishAfterDelay$2(InAppMessageView inAppMessageView, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.this$0 = inAppMessageView;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        return new InAppMessageView$finishAfterDelay$2(this.this$0, interfaceC1218d);
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(InterfaceC0022w interfaceC0022w, InterfaceC1218d interfaceC1218d) {
        return ((InAppMessageView$finishAfterDelay$2) create(interfaceC0022w, interfaceC1218d)).invokeSuspend(v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        RelativeLayout relativeLayout;
        RelativeLayout relativeLayout2;
        Object animateAndDismissLayout;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.label;
        if (i2 == 0) {
            g.y(obj);
            this.label = 1;
            if (AbstractC0024y.d(600L, this) == enumC1260a) {
                return enumC1260a;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g.y(obj);
                return v.f5689a;
            }
            g.y(obj);
        }
        z = this.this$0.hasBackground;
        if (z) {
            relativeLayout = this.this$0.parentRelativeLayout;
            if (relativeLayout != null) {
                InAppMessageView inAppMessageView = this.this$0;
                relativeLayout2 = inAppMessageView.parentRelativeLayout;
                i.b(relativeLayout2);
                this.label = 2;
                animateAndDismissLayout = inAppMessageView.animateAndDismissLayout(relativeLayout2, this);
                if (animateAndDismissLayout == enumC1260a) {
                    return enumC1260a;
                }
                return v.f5689a;
            }
        }
        this.this$0.cleanupViewsAfterDismiss();
        return v.f5689a;
    }
}
