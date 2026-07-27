package com.onesignal.debug.internal.crash;

import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.otel.crash.OtelCrashUploader;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1441l;

@e(c = "com.onesignal.debug.internal.crash.OneSignalCrashUploaderWrapper$start$1", f = "OneSignalCrashUploaderWrapper.kt", l = {57}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class OneSignalCrashUploaderWrapper$start$1 extends h implements InterfaceC1441l {
    int label;
    final /* synthetic */ OneSignalCrashUploaderWrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneSignalCrashUploaderWrapper$start$1(OneSignalCrashUploaderWrapper oneSignalCrashUploaderWrapper, InterfaceC1218d interfaceC1218d) {
        super(1, interfaceC1218d);
        this.this$0 = oneSignalCrashUploaderWrapper;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(InterfaceC1218d interfaceC1218d) {
        return new OneSignalCrashUploaderWrapper$start$1(this.this$0, interfaceC1218d);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        OtelCrashUploader uploader;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.label;
        try {
            if (i2 == 0) {
                g.y(obj);
                uploader = this.this$0.getUploader();
                this.label = 1;
                if (uploader.start(this) == enumC1260a) {
                    return enumC1260a;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g.y(obj);
            }
        } catch (Throwable th) {
            Logging.warn("OneSignal: Crash uploader failed to start: " + th.getMessage(), th);
        }
        return v.f5689a;
    }

    @Override // t4.InterfaceC1441l
    public final Object invoke(InterfaceC1218d interfaceC1218d) {
        return ((OneSignalCrashUploaderWrapper$start$1) create(interfaceC1218d)).invokeSuspend(v.f5689a);
    }
}
