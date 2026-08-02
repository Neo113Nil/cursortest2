package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/material3/internal/AnchoredDragScope;", "anchors", "Landroidx/compose/material3/internal/DraggableAnchors;", "Landroidx/compose/material3/SheetValue;", "latestTarget"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.SheetState$animateTo$2", f = "SheetDefaults.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class SheetState$animateTo$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function4<androidx.compose.material3.internal.AnchoredDragScope, androidx.compose.material3.internal.DraggableAnchors<androidx.compose.material3.SheetValue>, androidx.compose.material3.SheetValue, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ float getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    final /* synthetic */ androidx.compose.material3.SheetState getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final androidx.compose.material3.internal.AnchoredDragScope anchoredDragScope = (androidx.compose.material3.internal.AnchoredDragScope) this.getHighSpeedVideoSizesFor;
            float positionOf = ((androidx.compose.material3.internal.DraggableAnchors) this.getHighResolutionOutputSizeshNQ4ISI).positionOf((androidx.compose.material3.SheetValue) this.getHighSpeedVideoFpsRanges);
            if (!java.lang.Float.isNaN(positionOf)) {
                final kotlin.jvm.internal.Ref.FloatRef floatRef = new kotlin.jvm.internal.Ref.FloatRef();
                floatRef.element = java.lang.Float.isNaN(this.getInputSizeshNQ4ISI.getOffset$material3()) ? 0.0f : this.getInputSizeshNQ4ISI.getOffset$material3();
                this.getHighSpeedVideoSizesFor = null;
                this.getHighResolutionOutputSizeshNQ4ISI = null;
                this.getHighSpeedVideoSizes = 1;
                if (androidx.compose.animation.core.SuspendAnimationKt.animate(floatRef.element, positionOf, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.SheetState$animateTo$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return androidx.compose.material3.SheetState$animateTo$2.getHighSpeedVideoSizes(androidx.compose.material3.internal.AnchoredDragScope.this, floatRef, ((java.lang.Float) obj2).floatValue(), ((java.lang.Float) obj3).floatValue());
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

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(androidx.compose.material3.internal.AnchoredDragScope anchoredDragScope, kotlin.jvm.internal.Ref.FloatRef floatRef, float f, float f2) {
        anchoredDragScope.dragTo(f, f2);
        floatRef.element = f;
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function4
    public final /* synthetic */ java.lang.Object invoke(androidx.compose.material3.internal.AnchoredDragScope anchoredDragScope, androidx.compose.material3.internal.DraggableAnchors<androidx.compose.material3.SheetValue> draggableAnchors, androidx.compose.material3.SheetValue sheetValue, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.material3.SheetState$animateTo$2 sheetState$animateTo$2 = new androidx.compose.material3.SheetState$animateTo$2(this.getInputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
        sheetState$animateTo$2.getHighSpeedVideoSizesFor = anchoredDragScope;
        sheetState$animateTo$2.getHighResolutionOutputSizeshNQ4ISI = draggableAnchors;
        sheetState$animateTo$2.getHighSpeedVideoFpsRanges = sheetValue;
        return sheetState$animateTo$2.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SheetState$animateTo$2(androidx.compose.material3.SheetState sheetState, float f, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> finiteAnimationSpec, kotlin.coroutines.Continuation<? super androidx.compose.material3.SheetState$animateTo$2> continuation) {
        super(4, continuation);
        this.getInputSizeshNQ4ISI = sheetState;
        this.getHighSpeedVideoFpsRangesFor = f;
        this.Camera2StreamConfigurationMap = finiteAnimationSpec;
    }
}
