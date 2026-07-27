package com.onesignal.internal;

import D4.InterfaceC0022w;
import com.onesignal.debug.LogLevel;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.user.internal.LogoutHelper;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1445p;

@e(c = "com.onesignal.internal.OneSignalImp$logoutSuspend$2", f = "OneSignalImp.kt", l = {899}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class OneSignalImp$logoutSuspend$2 extends h implements InterfaceC1445p {
    int label;
    final /* synthetic */ OneSignalImp this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneSignalImp$logoutSuspend$2(OneSignalImp oneSignalImp, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.this$0 = oneSignalImp;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        return new OneSignalImp$logoutSuspend$2(this.this$0, interfaceC1218d);
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(InterfaceC0022w interfaceC0022w, InterfaceC1218d interfaceC1218d) {
        return ((OneSignalImp$logoutSuspend$2) create(interfaceC0022w, interfaceC1218d)).invokeSuspend(v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        Object suspendUntilInit;
        LogoutHelper logoutHelper;
        LogoutHelper logoutHelper2;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.label;
        if (i2 == 0) {
            g.y(obj);
            Logging.log(LogLevel.DEBUG, "logoutSuspend()");
            OneSignalImp oneSignalImp = this.this$0;
            this.label = 1;
            suspendUntilInit = oneSignalImp.suspendUntilInit("logout", this);
            if (suspendUntilInit == enumC1260a) {
                return enumC1260a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.y(obj);
        }
        logoutHelper = this.this$0.getLogoutHelper();
        LogoutHelper.LogoutEnqueueContext switchUser$com_onesignal_core = logoutHelper.switchUser$com_onesignal_core();
        v vVar = v.f5689a;
        if (switchUser$com_onesignal_core == null) {
            return vVar;
        }
        logoutHelper2 = this.this$0.getLogoutHelper();
        logoutHelper2.enqueueLogout$com_onesignal_core(switchUser$com_onesignal_core);
        return vVar;
    }
}
