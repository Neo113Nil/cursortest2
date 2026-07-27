package com.onesignal.otel.crash;

import D4.InterfaceC0022w;
import com.onesignal.otel.IOtelCrashReporter;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1445p;

@e(c = "com.onesignal.otel.crash.OtelCrashHandler$uncaughtException$2", f = "OtelCrashHandler.kt", l = {104}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class OtelCrashHandler$uncaughtException$2 extends h implements InterfaceC1445p {
    final /* synthetic */ Thread $thread;
    final /* synthetic */ Throwable $throwable;
    int label;
    final /* synthetic */ OtelCrashHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OtelCrashHandler$uncaughtException$2(OtelCrashHandler otelCrashHandler, Thread thread, Throwable th, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.this$0 = otelCrashHandler;
        this.$thread = thread;
        this.$throwable = th;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        return new OtelCrashHandler$uncaughtException$2(this.this$0, this.$thread, this.$throwable, interfaceC1218d);
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(InterfaceC0022w interfaceC0022w, InterfaceC1218d interfaceC1218d) {
        return ((OtelCrashHandler$uncaughtException$2) create(interfaceC0022w, interfaceC1218d)).invokeSuspend(v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        IOtelCrashReporter iOtelCrashReporter;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.label;
        if (i2 == 0) {
            g.y(obj);
            iOtelCrashReporter = this.this$0.crashReporter;
            Thread thread = this.$thread;
            Throwable th = this.$throwable;
            this.label = 1;
            if (iOtelCrashReporter.saveCrash(thread, th, this) == enumC1260a) {
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
