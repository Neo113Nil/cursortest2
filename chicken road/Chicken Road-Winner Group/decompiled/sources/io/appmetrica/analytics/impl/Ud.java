package io.appmetrica.analytics.impl;

import d2.C0279i;

/* loaded from: classes.dex */
public final /* synthetic */ class Ud extends kotlin.jvm.internal.i implements o2.l {
    public Ud(Object obj) {
        super(1, obj, Vd.class, "markCrashCompletedAndDeleteCompletedCrashes", "markCrashCompletedAndDeleteCompletedCrashes(Ljava/lang/String;)V", 0);
    }

    @Override // o2.l
    public final Object invoke(Object obj) {
        Vd vd = (Vd) this.receiver;
        vd.f6752a.markCrashCompleted((String) obj);
        vd.f6752a.deleteCompletedCrashes();
        return C0279i.f4852a;
    }
}
