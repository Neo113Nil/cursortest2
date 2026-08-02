package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a!\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b\u001ay\u0010\u0015\u001a\u00020\t*\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\u0019\b\u0002\u0010\u0011\u001a\u0013\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u0010\u0012\u0004\u0012\u00020\u00020\u00002\u0019\b\u0002\u0010\u0013\u001a\u0013\u0012\t\u0012\u00070\u0012¢\u0006\u0002\b\u0010\u0012\u0004\u0012\u00020\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u0016\"%\u0010\u0017\u001a\u0013\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u0010\u0012\u0004\u0012\u00020\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\"%\u0010\u001a\u001a\u0013\u0012\t\u0012\u00070\u0012¢\u0006\u0002\b\u0010\u0012\u0004\u0012\u00020\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "", "onDelta", "Landroidx/compose/foundation/gestures/Draggable2DState;", "Draggable2DState", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/foundation/gestures/Draggable2DState;", "rememberDraggable2DState", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/Draggable2DState;", "Landroidx/compose/ui/Modifier;", "state", "", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "startDragImmediately", "Lkotlin/ParameterName;", "onDragStarted", "Landroidx/compose/ui/unit/Velocity;", "onDragStopped", "reverseDirection", "draggable2D", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/Draggable2DState;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Z)Landroidx/compose/ui/Modifier;", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Draggable2DKt {
    private static final kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, kotlin.Unit> getHighSpeedVideoFpsRanges = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.gestures.Draggable2DKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            kotlin.Unit Camera2StreamConfigurationMap;
            Camera2StreamConfigurationMap = androidx.compose.foundation.gestures.Draggable2DKt.Camera2StreamConfigurationMap();
            return Camera2StreamConfigurationMap;
        }
    };
    private static final kotlin.jvm.functions.Function1<androidx.compose.ui.unit.Velocity, kotlin.Unit> getHighSpeedVideoFpsRangesFor = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.gestures.Draggable2DKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            kotlin.Unit highResolutionOutputSizeshNQ4ISI;
            highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.gestures.Draggable2DKt.getHighResolutionOutputSizeshNQ4ISI();
            return highResolutionOutputSizeshNQ4ISI;
        }
    };

    public static final androidx.compose.foundation.gestures.Draggable2DState Draggable2DState(kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function1) {
        return new androidx.compose.foundation.gestures.DefaultDraggable2DState(function1);
    }

    public static final androidx.compose.foundation.gestures.Draggable2DState rememberDraggable2DState(kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1150277615, i, -1, "androidx.compose.foundation.gestures.rememberDraggable2DState (Draggable2D.kt:106)");
        }
        final androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(function1, composer, i & 14);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = Draggable2DState(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.gestures.Draggable2DKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    kotlin.Unit highSpeedVideoFpsRangesFor;
                    highSpeedVideoFpsRangesFor = androidx.compose.foundation.gestures.Draggable2DKt.getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.State.this, (androidx.compose.ui.geometry.Offset) obj);
                    return highSpeedVideoFpsRangesFor;
                }
            });
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.foundation.gestures.Draggable2DState draggable2DState = (androidx.compose.foundation.gestures.Draggable2DState) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return draggable2DState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.State state, androidx.compose.ui.geometry.Offset offset) {
        ((kotlin.jvm.functions.Function1) state.getValue()).invoke(offset);
        return kotlin.Unit.INSTANCE;
    }

    public static final androidx.compose.ui.Modifier draggable2D(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.gestures.Draggable2DState draggable2DState, boolean z, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, boolean z2, kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.Velocity, kotlin.Unit> function12, boolean z3) {
        return modifier.then(new androidx.compose.foundation.gestures.Draggable2DElement(draggable2DState, z, mutableInteractionSource, z2, function1, function12, z3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap() {
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI() {
        return kotlin.Unit.INSTANCE;
    }
}
