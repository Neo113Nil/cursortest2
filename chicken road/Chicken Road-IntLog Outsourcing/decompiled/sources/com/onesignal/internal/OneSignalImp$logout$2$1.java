package com.onesignal.internal;

import D4.InterfaceC0022w;
import com.onesignal.user.internal.LogoutHelper;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1445p;

@e(c = "com.onesignal.internal.OneSignalImp$logout$2$1", f = "OneSignalImp.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class OneSignalImp$logout$2$1 extends h implements InterfaceC1445p {
    final /* synthetic */ LogoutHelper.LogoutEnqueueContext $context;
    int label;
    final /* synthetic */ OneSignalImp this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneSignalImp$logout$2$1(OneSignalImp oneSignalImp, LogoutHelper.LogoutEnqueueContext logoutEnqueueContext, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.this$0 = oneSignalImp;
        this.$context = logoutEnqueueContext;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        return new OneSignalImp$logout$2$1(this.this$0, this.$context, interfaceC1218d);
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(InterfaceC0022w interfaceC0022w, InterfaceC1218d interfaceC1218d) {
        return ((OneSignalImp$logout$2$1) create(interfaceC0022w, interfaceC1218d)).invokeSuspend(v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        LogoutHelper logoutHelper;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        g.y(obj);
        logoutHelper = this.this$0.getLogoutHelper();
        logoutHelper.enqueueLogout$com_onesignal_core(this.$context);
        return v.f5689a;
    }
}
