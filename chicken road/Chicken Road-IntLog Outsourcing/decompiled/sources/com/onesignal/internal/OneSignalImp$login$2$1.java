package com.onesignal.internal;

import D4.InterfaceC0022w;
import com.onesignal.user.internal.LoginHelper;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1445p;

@e(c = "com.onesignal.internal.OneSignalImp$login$2$1", f = "OneSignalImp.kt", l = {466}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class OneSignalImp$login$2$1 extends h implements InterfaceC1445p {
    final /* synthetic */ LoginHelper.LoginEnqueueContext $context;
    int label;
    final /* synthetic */ OneSignalImp this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneSignalImp$login$2$1(OneSignalImp oneSignalImp, LoginHelper.LoginEnqueueContext loginEnqueueContext, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.this$0 = oneSignalImp;
        this.$context = loginEnqueueContext;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        return new OneSignalImp$login$2$1(this.this$0, this.$context, interfaceC1218d);
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(InterfaceC0022w interfaceC0022w, InterfaceC1218d interfaceC1218d) {
        return ((OneSignalImp$login$2$1) create(interfaceC0022w, interfaceC1218d)).invokeSuspend(v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        LoginHelper loginHelper;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.label;
        if (i2 == 0) {
            g.y(obj);
            loginHelper = this.this$0.getLoginHelper();
            LoginHelper.LoginEnqueueContext loginEnqueueContext = this.$context;
            this.label = 1;
            if (loginHelper.enqueueLogin$com_onesignal_core(loginEnqueueContext, this) == enumC1260a) {
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
}
