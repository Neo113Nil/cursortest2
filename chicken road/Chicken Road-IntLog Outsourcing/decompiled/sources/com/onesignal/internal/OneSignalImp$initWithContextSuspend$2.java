package com.onesignal.internal;

import D4.AbstractC0024y;
import D4.C0013m;
import D4.InterfaceC0012l;
import D4.InterfaceC0022w;
import android.content.Context;
import com.onesignal.debug.LogLevel;
import com.onesignal.debug.internal.logging.Logging;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1445p;

@e(c = "com.onesignal.internal.OneSignalImp$initWithContextSuspend$2", f = "OneSignalImp.kt", l = {856}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class OneSignalImp$initWithContextSuspend$2 extends h implements InterfaceC1445p {
    final /* synthetic */ String $appId;
    final /* synthetic */ Context $context;
    int label;
    final /* synthetic */ OneSignalImp this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneSignalImp$initWithContextSuspend$2(OneSignalImp oneSignalImp, Context context, String str, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.this$0 = oneSignalImp;
        this.$context = context;
        this.$appId = str;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        return new OneSignalImp$initWithContextSuspend$2(this.this$0, this.$context, this.$appId, interfaceC1218d);
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(InterfaceC0022w interfaceC0022w, InterfaceC1218d interfaceC1218d) {
        return ((OneSignalImp$initWithContextSuspend$2) create(interfaceC0022w, interfaceC1218d)).invokeSuspend(v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        InitState initState;
        InterfaceC0012l interfaceC0012l;
        boolean z;
        boolean internalInit;
        InitState initState2;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.label;
        if (i2 == 0) {
            g.y(obj);
            obj2 = this.this$0.initLock;
            OneSignalImp oneSignalImp = this.this$0;
            synchronized (obj2) {
                try {
                    initState = oneSignalImp.initState;
                    if (initState.isSDKAccessible()) {
                        interfaceC0012l = oneSignalImp.suspendCompletion;
                        z = false;
                    } else {
                        oneSignalImp.initState = InitState.IN_PROGRESS;
                        oneSignalImp.suspendCompletion = AbstractC0024y.a();
                        oneSignalImp.initFailureException = new IllegalStateException("OneSignal initWithContext failed.");
                        interfaceC0012l = null;
                        z = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                internalInit = this.this$0.internalInit(this.$context, this.$appId);
                return Boolean.valueOf(internalInit);
            }
            Logging.log(LogLevel.DEBUG, "initWithContext: init already in progress or completed, awaiting completion");
            i.b(interfaceC0012l);
            this.label = 1;
            if (((C0013m) interfaceC0012l).W(this) == enumC1260a) {
                return enumC1260a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.y(obj);
        }
        initState2 = this.this$0.initState;
        return Boolean.valueOf(initState2 == InitState.SUCCESS);
    }
}
