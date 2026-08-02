package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/AnchoredDragScope;", "anchors", "Landroidx/compose/foundation/gestures/DraggableAnchors;", "Landroidx/compose/material3/DrawerValue;", "latestTarget"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.DrawerState$animateTo$3", f = "NavigationDrawer.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class DrawerState$animateTo$3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function4<androidx.compose.foundation.gestures.AnchoredDragScope, androidx.compose.foundation.gestures.DraggableAnchors<androidx.compose.material3.DrawerValue>, androidx.compose.material3.DrawerValue, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ float Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.animation.core.AnimationSpec<java.lang.Float> getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ androidx.compose.material3.DrawerState getInputSizeshNQ4ISI;
    private /* synthetic */ java.lang.Object getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final androidx.compose.foundation.gestures.AnchoredDragScope anchoredDragScope = (androidx.compose.foundation.gestures.AnchoredDragScope) this.getOutputFormats;
            float positionOf = ((androidx.compose.foundation.gestures.DraggableAnchors) this.getHighSpeedVideoFpsRangesFor).positionOf((androidx.compose.material3.DrawerValue) this.getHighSpeedVideoSizes);
            if (!java.lang.Float.isNaN(positionOf)) {
                final kotlin.jvm.internal.Ref.FloatRef floatRef = new kotlin.jvm.internal.Ref.FloatRef();
                floatRef.element = java.lang.Float.isNaN(this.getInputSizeshNQ4ISI.getCurrentOffset()) ? 0.0f : this.getInputSizeshNQ4ISI.getCurrentOffset();
                this.getOutputFormats = null;
                this.getHighSpeedVideoFpsRangesFor = null;
                this.getHighResolutionOutputSizeshNQ4ISI = 1;
                if (androidx.compose.animation.core.SuspendAnimationKt.animate(floatRef.element, positionOf, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.DrawerState$animateTo$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return androidx.compose.material3.DrawerState$animateTo$3.Camera2StreamConfigurationMap(androidx.compose.foundation.gestures.AnchoredDragScope.this, floatRef, ((java.lang.Float) obj2).floatValue(), ((java.lang.Float) obj3).floatValue());
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(androidx.compose.foundation.gestures.AnchoredDragScope anchoredDragScope, kotlin.jvm.internal.Ref.FloatRef floatRef, float f, float f2) {
        anchoredDragScope.dragTo(f, f2);
        floatRef.element = f;
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function4
    public final /* synthetic */ java.lang.Object invoke(androidx.compose.foundation.gestures.AnchoredDragScope anchoredDragScope, androidx.compose.foundation.gestures.DraggableAnchors<androidx.compose.material3.DrawerValue> draggableAnchors, androidx.compose.material3.DrawerValue drawerValue, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.material3.DrawerState$animateTo$3 drawerState$animateTo$3 = new androidx.compose.material3.DrawerState$animateTo$3(this.getInputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
        drawerState$animateTo$3.getOutputFormats = anchoredDragScope;
        drawerState$animateTo$3.getHighSpeedVideoFpsRangesFor = draggableAnchors;
        drawerState$animateTo$3.getHighSpeedVideoSizes = drawerValue;
        return drawerState$animateTo$3.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DrawerState$animateTo$3(androidx.compose.material3.DrawerState drawerState, float f, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, kotlin.coroutines.Continuation<? super androidx.compose.material3.DrawerState$animateTo$3> continuation) {
        super(4, continuation);
        this.getInputSizeshNQ4ISI = drawerState;
        this.Camera2StreamConfigurationMap = f;
        this.getHighSpeedVideoFpsRanges = animationSpec;
    }
}
