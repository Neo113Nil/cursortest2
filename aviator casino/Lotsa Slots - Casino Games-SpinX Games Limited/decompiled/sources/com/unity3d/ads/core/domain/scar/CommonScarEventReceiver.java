package com.unity3d.ads.core.domain.scar;

/* compiled from: CommonScarEventReceiver.kt */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0016J9\u0010\u0012\u001a\u00020\u00112\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00142\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00142\u0012\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00180\u0017\"\u00020\u0018H\u0016¢\u0006\u0002\u0010\u0019R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/unity3d/ads/core/domain/scar/CommonScarEventReceiver;", "Lcom/unity3d/services/core/webview/bridge/IEventSender;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlinx/coroutines/CoroutineScope;)V", "_gmaEventFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/unity3d/ads/core/domain/scar/GmaEventData;", "_versionFlow", "", "gmaEventFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "getGmaEventFlow", "()Lkotlinx/coroutines/flow/SharedFlow;", "versionFlow", "getVersionFlow", "canSend", "", "sendEvent", "eventCategory", "", "eventId", "params", "", "", "(Ljava/lang/Enum;Ljava/lang/Enum;[Ljava/lang/Object;)Z", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CommonScarEventReceiver implements com.unity3d.services.core.webview.bridge.IEventSender {
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.unity3d.ads.core.domain.scar.GmaEventData> _gmaEventFlow;
    private final kotlinx.coroutines.flow.MutableSharedFlow<java.lang.String> _versionFlow;
    private final kotlinx.coroutines.flow.SharedFlow<com.unity3d.ads.core.domain.scar.GmaEventData> gmaEventFlow;
    private final kotlinx.coroutines.CoroutineScope scope;
    private final kotlinx.coroutines.flow.SharedFlow<java.lang.String> versionFlow;

    @Override // com.unity3d.services.core.webview.bridge.IEventSender
    public boolean canSend() {
        return true;
    }

    public CommonScarEventReceiver(kotlinx.coroutines.CoroutineScope scope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "scope");
        this.scope = scope;
        kotlinx.coroutines.flow.MutableSharedFlow<java.lang.String> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._versionFlow = MutableSharedFlow$default;
        this.versionFlow = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow$default);
        kotlinx.coroutines.flow.MutableSharedFlow<com.unity3d.ads.core.domain.scar.GmaEventData> MutableSharedFlow$default2 = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._gmaEventFlow = MutableSharedFlow$default2;
        this.gmaEventFlow = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow$default2);
    }

    public final kotlinx.coroutines.flow.SharedFlow<java.lang.String> getVersionFlow() {
        return this.versionFlow;
    }

    public final kotlinx.coroutines.flow.SharedFlow<com.unity3d.ads.core.domain.scar.GmaEventData> getGmaEventFlow() {
        return this.gmaEventFlow;
    }

    @Override // com.unity3d.services.core.webview.bridge.IEventSender
    public boolean sendEvent(java.lang.Enum<?> eventCategory, java.lang.Enum<?> eventId, java.lang.Object... params) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventCategory, "eventCategory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventId, "eventId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "params");
        if (!kotlin.collections.CollectionsKt.contains(kotlin.collections.SetsKt.setOf((java.lang.Object[]) new com.unity3d.services.core.webview.WebViewEventCategory[]{com.unity3d.services.core.webview.WebViewEventCategory.INIT_GMA, com.unity3d.services.core.webview.WebViewEventCategory.GMA, com.unity3d.services.core.webview.WebViewEventCategory.BANNER}), eventCategory)) {
            return false;
        }
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new com.unity3d.ads.core.domain.scar.CommonScarEventReceiver$sendEvent$1(eventId, params, this, null), 3, null);
        return true;
    }
}
