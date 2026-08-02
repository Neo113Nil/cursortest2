package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\"#\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0007¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0004\u0010\u0005\" \u0010\b\u001a\u00020\u00018\u0001X\u0080\u0004¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\f\u0010\u0007\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "LocalBringIntoViewSpec", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalBringIntoViewSpec", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalBringIntoViewSpec$annotations", "()V", "PivotBringIntoViewSpec", "Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "getPivotBringIntoViewSpec", "()Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "getPivotBringIntoViewSpec$annotations"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BringIntoViewSpec_androidKt {
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.foundation.gestures.BringIntoViewSpec> LocalBringIntoViewSpec = androidx.compose.runtime.CompositionLocalKt.compositionLocalWithComputedDefaultOf(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.gestures.BringIntoViewSpec_androidKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            androidx.compose.foundation.gestures.BringIntoViewSpec highSpeedVideoSizes;
            highSpeedVideoSizes = androidx.compose.foundation.gestures.BringIntoViewSpec_androidKt.getHighSpeedVideoSizes((androidx.compose.runtime.CompositionLocalAccessorScope) obj);
            return highSpeedVideoSizes;
        }
    });
    private static final androidx.compose.foundation.gestures.BringIntoViewSpec PivotBringIntoViewSpec = new androidx.compose.foundation.gestures.BringIntoViewSpec() { // from class: androidx.compose.foundation.gestures.BringIntoViewSpec_androidKt$PivotBringIntoViewSpec$1
        private final float childFraction;
        private final float parentFraction = 0.3f;

        public final float getParentFraction() {
            return this.parentFraction;
        }

        public final float getChildFraction() {
            return this.childFraction;
        }

        @Override // androidx.compose.foundation.gestures.BringIntoViewSpec
        public final float calculateScrollDistance(float offset, float size, float containerSize) {
            float abs = java.lang.Math.abs((size + offset) - offset);
            boolean z = abs <= containerSize;
            float f = (this.parentFraction * containerSize) - (this.childFraction * abs);
            if (z && containerSize - f < abs) {
                f = containerSize - abs;
            }
            return offset - f;
        }
    };

    public static /* synthetic */ void getLocalBringIntoViewSpec$annotations() {
    }

    public static /* synthetic */ void getPivotBringIntoViewSpec$annotations() {
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.foundation.gestures.BringIntoViewSpec> getLocalBringIntoViewSpec() {
        return LocalBringIntoViewSpec;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.foundation.gestures.BringIntoViewSpec getHighSpeedVideoSizes(androidx.compose.runtime.CompositionLocalAccessorScope compositionLocalAccessorScope) {
        if (!((android.content.Context) compositionLocalAccessorScope.getCurrentValue(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext())).getPackageManager().hasSystemFeature("android.software.leanback")) {
            return androidx.compose.foundation.gestures.BringIntoViewSpec.INSTANCE.getDefaultBringIntoViewSpec$foundation();
        }
        return PivotBringIntoViewSpec;
    }

    public static final androidx.compose.foundation.gestures.BringIntoViewSpec getPivotBringIntoViewSpec() {
        return PivotBringIntoViewSpec;
    }
}
