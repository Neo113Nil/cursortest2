package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Po {

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.coroutines.Job f4905a;
    public final kotlinx.coroutines.flow.MutableStateFlow b;

    public Po(long j, kotlinx.coroutines.CoroutineScope scope, android.view.ViewGroup observableView, com.inmobi.media.InterfaceC2772t9 interfaceC2772t9) {
        kotlinx.coroutines.Job launch$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "coroutineScope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(observableView, "observableView");
        kotlinx.coroutines.flow.MutableStateFlow MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(java.lang.Boolean.FALSE);
        this.b = MutableStateFlow;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("WindowLifecycleHandler", "WindowLifecycleHandler init - observableView: " + observableView + ", isAttachedToWindow: " + observableView.isAttachedToWindow());
        }
        kotlinx.coroutines.flow.StateFlow stateIn = kotlinx.coroutines.flow.FlowKt.stateIn(kotlinx.coroutines.flow.FlowKt.flowOn(kotlinx.coroutines.flow.FlowKt.callbackFlow(new com.inmobi.media.Ro(observableView, null)), kotlinx.coroutines.Dispatchers.getMain()), scope, kotlinx.coroutines.flow.SharingStarted.INSTANCE.getEagerly(), java.lang.Boolean.valueOf(observableView.isAttachedToWindow()));
        com.inmobi.media.M1 collector = new com.inmobi.media.M1(j, observableView, interfaceC2772t9, scope, MutableStateFlow);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stateIn, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "scope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collector, "collector");
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(scope, null, null, new com.inmobi.media.R4(stateIn, collector, null), 3, null);
        this.f4905a = launch$default;
    }
}
