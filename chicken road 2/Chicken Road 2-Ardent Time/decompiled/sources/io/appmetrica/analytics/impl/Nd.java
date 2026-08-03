package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final /* synthetic */ class Nd extends kotlin.jvm.internal.h implements s1.l {
    public Nd(java.lang.Object obj) {
        super(1, obj, io.appmetrica.analytics.impl.Od.class, "markCrashCompletedAndDeleteCompletedCrashes", "markCrashCompletedAndDeleteCompletedCrashes(Ljava/lang/String;)V", 0);
    }

    @Override // s1.l
    public final java.lang.Object invoke(java.lang.Object obj) {
        io.appmetrica.analytics.impl.Od od = (io.appmetrica.analytics.impl.Od) this.receiver;
        od.f4769a.markCrashCompleted((java.lang.String) obj);
        od.f4769a.deleteCompletedCrashes();
        return h1.C0177i.f3302a;
    }
}
