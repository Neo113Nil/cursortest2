package com.adobe.marketing.mobile.services.ui.common;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0003R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\r8\u0007¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/adobe/marketing/mobile/services/ui/common/PresentationStateManager;", "", "<init>", "()V", "", "onDetached", "onHidden", "onShown", "Landroidx/compose/runtime/MutableState;", "Lcom/adobe/marketing/mobile/services/ui/Presentable$State;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/runtime/MutableState;", "Camera2StreamConfigurationMap", "Landroidx/compose/runtime/State;", "presentableState", "Landroidx/compose/runtime/State;", "getPresentableState", "()Landroidx/compose/runtime/State;", "Landroidx/compose/animation/core/MutableTransitionState;", "", "visibilityState", "Landroidx/compose/animation/core/MutableTransitionState;", "getVisibilityState", "()Landroidx/compose/animation/core/MutableTransitionState;"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class PresentationStateManager {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState<com.adobe.marketing.mobile.services.ui.Presentable.State> Camera2StreamConfigurationMap;
    private final androidx.compose.runtime.State<com.adobe.marketing.mobile.services.ui.Presentable.State> presentableState;
    private final androidx.compose.animation.core.MutableTransitionState<java.lang.Boolean> visibilityState;

    public PresentationStateManager() {
        androidx.compose.runtime.MutableState<com.adobe.marketing.mobile.services.ui.Presentable.State> mutableStateOf$default = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(com.adobe.marketing.mobile.services.ui.Presentable.State.DETACHED, null, 2, null);
        this.Camera2StreamConfigurationMap = mutableStateOf$default;
        this.presentableState = mutableStateOf$default;
        this.visibilityState = new androidx.compose.animation.core.MutableTransitionState<>(java.lang.Boolean.FALSE);
    }

    public final androidx.compose.runtime.State<com.adobe.marketing.mobile.services.ui.Presentable.State> getPresentableState() {
        return this.presentableState;
    }

    public final androidx.compose.animation.core.MutableTransitionState<java.lang.Boolean> getVisibilityState() {
        return this.visibilityState;
    }

    public final void onShown() {
        this.Camera2StreamConfigurationMap.setValue(com.adobe.marketing.mobile.services.ui.Presentable.State.VISIBLE);
        this.visibilityState.setTargetState$animation_core(java.lang.Boolean.TRUE);
    }

    public final void onHidden() {
        this.Camera2StreamConfigurationMap.setValue(com.adobe.marketing.mobile.services.ui.Presentable.State.HIDDEN);
        this.visibilityState.setTargetState$animation_core(java.lang.Boolean.FALSE);
    }

    public final void onDetached() {
        this.Camera2StreamConfigurationMap.setValue(com.adobe.marketing.mobile.services.ui.Presentable.State.DETACHED);
        this.visibilityState.setTargetState$animation_core(java.lang.Boolean.FALSE);
    }
}
