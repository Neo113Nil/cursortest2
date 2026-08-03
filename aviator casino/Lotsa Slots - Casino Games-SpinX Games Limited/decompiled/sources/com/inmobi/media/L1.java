package com.inmobi.media;

/* loaded from: classes5.dex */
public final class L1 implements kotlinx.coroutines.flow.FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.M1 f4809a;

    public L1(com.inmobi.media.M1 m1) {
        this.f4809a = m1;
    }

    public final kotlin.Unit a(boolean z) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f4809a.e;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("WindowLifecycleHandler", "startObservingVisibility - Window visibility changed: " + z);
        }
        this.f4809a.c.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return a(((java.lang.Boolean) obj).booleanValue());
    }
}
