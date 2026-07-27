package com.onesignal.debug.internal.crash;

import D4.InterfaceC0022w;
import com.onesignal.debug.internal.crash.OtelAnrDetector;
import com.onesignal.otel.IOtelCrashReporter;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1445p;

@e(c = "com.onesignal.debug.internal.crash.OtelAnrDetector$reportAnr$1", f = "OtelAnrDetector.kt", l = {176}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class OtelAnrDetector$reportAnr$1 extends h implements InterfaceC1445p {
    final /* synthetic */ OtelAnrDetector.ApplicationNotRespondingException $anrException;
    final /* synthetic */ Thread $mainThread;
    int label;
    final /* synthetic */ OtelAnrDetector this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OtelAnrDetector$reportAnr$1(OtelAnrDetector otelAnrDetector, Thread thread, OtelAnrDetector.ApplicationNotRespondingException applicationNotRespondingException, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.this$0 = otelAnrDetector;
        this.$mainThread = thread;
        this.$anrException = applicationNotRespondingException;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        return new OtelAnrDetector$reportAnr$1(this.this$0, this.$mainThread, this.$anrException, interfaceC1218d);
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(InterfaceC0022w interfaceC0022w, InterfaceC1218d interfaceC1218d) {
        return ((OtelAnrDetector$reportAnr$1) create(interfaceC0022w, interfaceC1218d)).invokeSuspend(v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        IOtelCrashReporter iOtelCrashReporter;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.label;
        if (i2 == 0) {
            g.y(obj);
            iOtelCrashReporter = this.this$0.crashReporter;
            Thread thread = this.$mainThread;
            OtelAnrDetector.ApplicationNotRespondingException applicationNotRespondingException = this.$anrException;
            this.label = 1;
            if (iOtelCrashReporter.saveCrash(thread, applicationNotRespondingException, this) == enumC1260a) {
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
