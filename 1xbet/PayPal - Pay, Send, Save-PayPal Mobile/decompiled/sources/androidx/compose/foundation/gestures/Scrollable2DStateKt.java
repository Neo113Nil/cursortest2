package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a!\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "consumeScrollDelta", "Landroidx/compose/foundation/gestures/Scrollable2DState;", "Scrollable2DState", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/foundation/gestures/Scrollable2DState;", "rememberScrollable2DState", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/Scrollable2DState;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Scrollable2DStateKt {
    public static final androidx.compose.foundation.gestures.Scrollable2DState Scrollable2DState(kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, androidx.compose.ui.geometry.Offset> function1) {
        return new androidx.compose.foundation.gestures.DefaultScrollable2DState(function1);
    }

    public static final androidx.compose.foundation.gestures.Scrollable2DState rememberScrollable2DState(kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, androidx.compose.ui.geometry.Offset> function1, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1315827064, i, -1, "androidx.compose.foundation.gestures.rememberScrollable2DState (Scrollable2DState.kt:122)");
        }
        final androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(function1, composer, i & 14);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = Scrollable2DState(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.gestures.Scrollable2DStateKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    androidx.compose.ui.geometry.Offset highSpeedVideoFpsRanges;
                    highSpeedVideoFpsRanges = androidx.compose.foundation.gestures.Scrollable2DStateKt.getHighSpeedVideoFpsRanges(androidx.compose.runtime.State.this, (androidx.compose.ui.geometry.Offset) obj);
                    return highSpeedVideoFpsRanges;
                }
            });
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.foundation.gestures.Scrollable2DState scrollable2DState = (androidx.compose.foundation.gestures.Scrollable2DState) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return scrollable2DState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.geometry.Offset getHighSpeedVideoFpsRanges(androidx.compose.runtime.State state, androidx.compose.ui.geometry.Offset offset) {
        return (androidx.compose.ui.geometry.Offset) ((kotlin.jvm.functions.Function1) state.getValue()).invoke(offset);
    }
}
