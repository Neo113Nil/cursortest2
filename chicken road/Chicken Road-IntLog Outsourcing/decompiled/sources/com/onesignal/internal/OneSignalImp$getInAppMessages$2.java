package com.onesignal.internal;

import D4.InterfaceC0022w;
import com.onesignal.common.services.ServiceProvider;
import com.onesignal.inAppMessages.IInAppMessagesManager;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.j;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1430a;
import t4.InterfaceC1445p;

@e(c = "com.onesignal.internal.OneSignalImp$getInAppMessages$2", f = "OneSignalImp.kt", l = {768}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class OneSignalImp$getInAppMessages$2 extends h implements InterfaceC1445p {
    int label;
    final /* synthetic */ OneSignalImp this$0;

    /* renamed from: com.onesignal.internal.OneSignalImp$getInAppMessages$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends j implements InterfaceC1430a {
        final /* synthetic */ OneSignalImp this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OneSignalImp oneSignalImp) {
            super(0);
            this.this$0 = oneSignalImp;
        }

        @Override // t4.InterfaceC1430a
        public final IInAppMessagesManager invoke() {
            ServiceProvider serviceProvider;
            serviceProvider = this.this$0.services;
            return (IInAppMessagesManager) serviceProvider.getService(IInAppMessagesManager.class);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneSignalImp$getInAppMessages$2(OneSignalImp oneSignalImp, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.this$0 = oneSignalImp;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        return new OneSignalImp$getInAppMessages$2(this.this$0, interfaceC1218d);
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(InterfaceC0022w interfaceC0022w, InterfaceC1218d interfaceC1218d) {
        return ((OneSignalImp$getInAppMessages$2) create(interfaceC0022w, interfaceC1218d)).invokeSuspend(v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.label;
        if (i2 == 0) {
            g.y(obj);
            OneSignalImp oneSignalImp = this.this$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(oneSignalImp);
            this.label = 1;
            obj = oneSignalImp.suspendAndReturn(anonymousClass1, this);
            if (obj == enumC1260a) {
                return enumC1260a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.y(obj);
        }
        return obj;
    }
}
