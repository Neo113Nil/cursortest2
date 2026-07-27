package com.inmobi.media;

import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes6.dex */
public final class Mq {

    /* renamed from: a, reason: collision with root package name */
    public final Job f6728a;
    public final MutableStateFlow b;

    public Mq(long j, CoroutineScope scope, ViewGroup observableView, Y9 y9) {
        Job launch$default;
        Intrinsics.checkNotNullParameter(scope, "coroutineScope");
        Intrinsics.checkNotNullParameter(observableView, "observableView");
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.b = MutableStateFlow;
        if (y9 != null) {
            ((Z9) y9).a("WindowLifecycleHandler", "WindowLifecycleHandler init - observableView: " + observableView + ", isAttachedToWindow: " + observableView.isAttachedToWindow());
        }
        StateFlow stateIn = FlowKt.stateIn(FlowKt.flowOn(FlowKt.callbackFlow(new Oq(observableView, null)), Dispatchers.getMain()), scope, SharingStarted.INSTANCE.getEagerly(), Boolean.valueOf(observableView.isAttachedToWindow()));
        C3697f2 collector = new C3697f2(j, observableView, y9, scope, MutableStateFlow);
        Intrinsics.checkNotNullParameter(stateIn, "<this>");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(collector, "collector");
        launch$default = BuildersKt__Builders_commonKt.launch$default(scope, null, null, new C3955o5(stateIn, collector, null), 3, null);
        this.f6728a = launch$default;
    }
}
