package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Z6 implements kotlinx.coroutines.flow.FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.coroutines.CoroutineScope f5079a;
    public final android.view.ViewGroup b;
    public final long c;
    public final kotlinx.coroutines.flow.MutableStateFlow d;
    public final com.inmobi.media.InterfaceC2772t9 e;
    public kotlinx.coroutines.Job f;

    public Z6(long j, android.view.ViewGroup view, com.inmobi.media.InterfaceC2772t9 interfaceC2772t9, kotlinx.coroutines.CoroutineScope coroutineScope, kotlinx.coroutines.flow.MutableStateFlow visibilityStateFlow) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(visibilityStateFlow, "visibilityStateFlow");
        this.f5079a = coroutineScope;
        this.b = view;
        this.c = j;
        this.d = visibilityStateFlow;
        this.e = interfaceC2772t9;
    }

    public final kotlin.Unit a(boolean z) {
        kotlinx.coroutines.Job launch$default;
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.e;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("WindowLifecycleHandler", "FocusStateCollector - window focus changed: " + z);
        }
        if (z) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.e;
            if (interfaceC2772t92 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t92).a("WindowLifecycleHandler", "FocusStateCollector - window gained focus, stopping polling");
            }
            com.inmobi.media.L6.a(this.f);
            this.f = null;
        } else {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = this.e;
            if (interfaceC2772t93 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t93).a("WindowLifecycleHandler", "FocusStateCollector - window lost focus, starting polling");
            }
            launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.f5079a, null, null, new com.inmobi.media.Y6(this, null), 3, null);
            this.f = launch$default;
        }
        boolean z2 = this.b.getWindowVisibility() == 0;
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t94 = this.e;
        if (interfaceC2772t94 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t94).a("WindowLifecycleHandler", "FocusStateCollector - setting visibility state: " + z2);
        }
        this.d.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z2));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return a(((java.lang.Boolean) obj).booleanValue());
    }
}
