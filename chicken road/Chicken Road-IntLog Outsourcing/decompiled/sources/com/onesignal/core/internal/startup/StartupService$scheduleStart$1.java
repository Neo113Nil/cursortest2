package com.onesignal.core.internal.startup;

import com.onesignal.common.services.ServiceProvider;
import com.onesignal.debug.internal.logging.Logging;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1441l;

@e(c = "com.onesignal.core.internal.startup.StartupService$scheduleStart$1", f = "StartupService.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class StartupService$scheduleStart$1 extends h implements InterfaceC1441l {
    int label;
    final /* synthetic */ StartupService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartupService$scheduleStart$1(StartupService startupService, InterfaceC1218d interfaceC1218d) {
        super(1, interfaceC1218d);
        this.this$0 = startupService;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(InterfaceC1218d interfaceC1218d) {
        return new StartupService$scheduleStart$1(this.this$0, interfaceC1218d);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        ServiceProvider serviceProvider;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        g.y(obj);
        serviceProvider = this.this$0.services;
        for (IStartableService iStartableService : serviceProvider.getAllServices(IStartableService.class)) {
            try {
                iStartableService.start();
            } catch (Throwable th) {
                Logging.error("OneSignal: Startable service failed: ".concat(iStartableService.getClass().getSimpleName()), th);
            }
        }
        return v.f5689a;
    }

    @Override // t4.InterfaceC1441l
    public final Object invoke(InterfaceC1218d interfaceC1218d) {
        return ((StartupService$scheduleStart$1) create(interfaceC1218d)).invokeSuspend(v.f5689a);
    }
}
