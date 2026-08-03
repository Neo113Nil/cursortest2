package androidx.compose.foundation.gestures;

/* compiled from: Scrollable.kt */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\r\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010\u0007J\r\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\nJ\u001e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\f¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollableDefaults;", "", "()V", "bringIntoViewSpec", "Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/FlingBehavior;", "overscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/OverscrollEffect;", "reverseDirection", "", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "reverseScrolling", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ScrollableDefaults {
    public static final int $stable = 0;
    public static final androidx.compose.foundation.gestures.ScrollableDefaults INSTANCE = new androidx.compose.foundation.gestures.ScrollableDefaults();

    private ScrollableDefaults() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final androidx.compose.foundation.gestures.FlingBehavior flingBehavior(androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(1107739818);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(flingBehavior)539@21313L33,540@21362L75:Scrollable.kt#8bwon0");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1107739818, i, -1, "androidx.compose.foundation.gestures.ScrollableDefaults.flingBehavior (Scrollable.kt:538)");
        }
        androidx.compose.animation.core.DecayAnimationSpec rememberSplineBasedDecay = androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0);
        composer.startReplaceableGroup(1157296644);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean changed = composer.changed(rememberSplineBasedDecay);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.compose.foundation.gestures.DefaultFlingBehavior(rememberSplineBasedDecay, null, 2, 0 == true ? 1 : 0);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        androidx.compose.foundation.gestures.DefaultFlingBehavior defaultFlingBehavior = (androidx.compose.foundation.gestures.DefaultFlingBehavior) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultFlingBehavior;
    }

    public final androidx.compose.foundation.OverscrollEffect overscrollEffect(androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(1809802212);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(overscrollEffect)552@21682L26:Scrollable.kt#8bwon0");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1809802212, i, -1, "androidx.compose.foundation.gestures.ScrollableDefaults.overscrollEffect (Scrollable.kt:551)");
        }
        androidx.compose.foundation.OverscrollEffect rememberOverscrollEffect = androidx.compose.foundation.AndroidOverscroll_androidKt.rememberOverscrollEffect(composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberOverscrollEffect;
    }

    public final boolean reverseDirection(androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.foundation.gestures.Orientation orientation, boolean reverseScrolling) {
        return (layoutDirection != androidx.compose.ui.unit.LayoutDirection.Rtl || orientation == androidx.compose.foundation.gestures.Orientation.Vertical) ? !reverseScrolling : reverseScrolling;
    }

    public final androidx.compose.foundation.gestures.BringIntoViewSpec bringIntoViewSpec() {
        return androidx.compose.foundation.gestures.BringIntoViewSpec.INSTANCE.getDefaultBringIntoViewSpec$foundation_release();
    }
}
