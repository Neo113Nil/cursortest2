package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001a3\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\u0007\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\t"}, d2 = {"Landroidx/compose/ui/Modifier;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lkotlin/ranges/ClosedFloatingPointRange;", "valueRange", "", "steps", "progressSemantics", "(Landroidx/compose/ui/Modifier;FLkotlin/ranges/ClosedFloatingPointRange;I)Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ProgressSemanticsKt {
    public static /* synthetic */ androidx.compose.ui.Modifier progressSemantics$default(androidx.compose.ui.Modifier modifier, float f, kotlin.ranges.ClosedFloatingPointRange closedFloatingPointRange, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            closedFloatingPointRange = kotlin.ranges.RangesKt.rangeTo(0.0f, 1.0f);
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return progressSemantics(modifier, f, closedFloatingPointRange, i);
    }

    public static final androidx.compose.ui.Modifier progressSemantics(androidx.compose.ui.Modifier modifier, final float f, final kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange, final int i) {
        return androidx.compose.ui.semantics.SemanticsModifierKt.semantics(modifier, true, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.ProgressSemanticsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highSpeedVideoSizes;
                highSpeedVideoSizes = androidx.compose.foundation.ProgressSemanticsKt.getHighSpeedVideoSizes(f, closedFloatingPointRange, i, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                return highSpeedVideoSizes;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(float f, kotlin.ranges.ClosedFloatingPointRange closedFloatingPointRange, int i, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new androidx.compose.ui.semantics.ProgressBarRangeInfo(((java.lang.Number) kotlin.ranges.RangesKt.coerceIn(java.lang.Float.valueOf(f), (kotlin.ranges.ClosedFloatingPointRange<java.lang.Float>) closedFloatingPointRange)).floatValue(), closedFloatingPointRange, i));
        return kotlin.Unit.INSTANCE;
    }

    public static final androidx.compose.ui.Modifier progressSemantics(androidx.compose.ui.Modifier modifier) {
        return androidx.compose.ui.semantics.SemanticsModifierKt.semantics(modifier, true, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.ProgressSemanticsKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highSpeedVideoSizes;
                highSpeedVideoSizes = androidx.compose.foundation.ProgressSemanticsKt.getHighSpeedVideoSizes((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                return highSpeedVideoSizes;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, androidx.compose.ui.semantics.ProgressBarRangeInfo.INSTANCE.getIndeterminate());
        return kotlin.Unit.INSTANCE;
    }
}
