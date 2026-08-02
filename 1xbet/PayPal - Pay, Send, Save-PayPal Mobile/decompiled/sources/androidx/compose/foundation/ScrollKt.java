package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a2\u0010\u0005\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\t\u001a<\u0010\u0005\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00012\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\t\u001a2\u0010\u000f\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\t\u001a<\u0010\u000f\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00012\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\t\u001aJ\u0010\u0010\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002¨\u0006\u0014"}, d2 = {"rememberScrollState", "Landroidx/compose/foundation/ScrollState;", "initial", "", "(ILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/ScrollState;", "verticalScroll", "Landroidx/compose/ui/Modifier;", "state", "enabled", "", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "reverseScrolling", "overscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "horizontalScroll", "scroll", "isScrollable", "isVertical", "useLocalOverscrollFactory", "foundation"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ScrollKt {
    public static final androidx.compose.foundation.ScrollState rememberScrollState(final int i, androidx.compose.runtime.Composer composer, int i2, int i3) {
        boolean z = true;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1464256199, i2, -1, "androidx.compose.foundation.rememberScrollState (Scroll.kt:70)");
        }
        java.lang.Object[] objArr = new java.lang.Object[0];
        androidx.compose.runtime.saveable.Saver<androidx.compose.foundation.ScrollState, ?> saver = androidx.compose.foundation.ScrollState.INSTANCE.getSaver();
        if ((((i2 & 14) ^ 6) <= 4 || !composer.changed(i)) && (i2 & 6) != 4) {
            z = false;
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.ScrollKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    androidx.compose.foundation.ScrollState highSpeedVideoFpsRangesFor;
                    highSpeedVideoFpsRangesFor = androidx.compose.foundation.ScrollKt.getHighSpeedVideoFpsRangesFor(i);
                    return highSpeedVideoFpsRangesFor;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.foundation.ScrollState scrollState = (androidx.compose.foundation.ScrollState) androidx.compose.runtime.saveable.RememberSaveableKt.m5465rememberSaveable(objArr, (androidx.compose.runtime.saveable.Saver) saver, (kotlin.jvm.functions.Function0) rememberedValue, composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return scrollState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.foundation.ScrollState getHighSpeedVideoFpsRangesFor(int i) {
        return new androidx.compose.foundation.ScrollState(i);
    }

    public static /* synthetic */ androidx.compose.ui.Modifier verticalScroll$default(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.ScrollState scrollState, boolean z, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, boolean z2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            flingBehavior = null;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        return verticalScroll(modifier, scrollState, z, flingBehavior, z2);
    }

    public static final androidx.compose.ui.Modifier verticalScroll(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.ScrollState scrollState, boolean z, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, boolean z2) {
        return getHighSpeedVideoFpsRangesFor(modifier, scrollState, z2, flingBehavior, z, true);
    }

    public static /* synthetic */ androidx.compose.ui.Modifier verticalScroll$default(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.ScrollState scrollState, androidx.compose.foundation.OverscrollEffect overscrollEffect, boolean z, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, boolean z2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            flingBehavior = null;
        }
        androidx.compose.foundation.gestures.FlingBehavior flingBehavior2 = flingBehavior;
        if ((i & 16) != 0) {
            z2 = false;
        }
        return verticalScroll(modifier, scrollState, overscrollEffect, z3, flingBehavior2, z2);
    }

    public static final androidx.compose.ui.Modifier verticalScroll(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.ScrollState scrollState, androidx.compose.foundation.OverscrollEffect overscrollEffect, boolean z, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, boolean z2) {
        return getHighResolutionOutputSizeshNQ4ISI(modifier, scrollState, z2, flingBehavior, z, true, false, overscrollEffect);
    }

    public static /* synthetic */ androidx.compose.ui.Modifier horizontalScroll$default(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.ScrollState scrollState, boolean z, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, boolean z2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            flingBehavior = null;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        return horizontalScroll(modifier, scrollState, z, flingBehavior, z2);
    }

    public static final androidx.compose.ui.Modifier horizontalScroll(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.ScrollState scrollState, boolean z, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, boolean z2) {
        return getHighSpeedVideoFpsRangesFor(modifier, scrollState, z2, flingBehavior, z, false);
    }

    public static /* synthetic */ androidx.compose.ui.Modifier horizontalScroll$default(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.ScrollState scrollState, androidx.compose.foundation.OverscrollEffect overscrollEffect, boolean z, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, boolean z2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            flingBehavior = null;
        }
        androidx.compose.foundation.gestures.FlingBehavior flingBehavior2 = flingBehavior;
        if ((i & 16) != 0) {
            z2 = false;
        }
        return horizontalScroll(modifier, scrollState, overscrollEffect, z3, flingBehavior2, z2);
    }

    public static final androidx.compose.ui.Modifier horizontalScroll(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.ScrollState scrollState, androidx.compose.foundation.OverscrollEffect overscrollEffect, boolean z, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, boolean z2) {
        return getHighResolutionOutputSizeshNQ4ISI(modifier, scrollState, z2, flingBehavior, z, false, false, overscrollEffect);
    }

    private static /* synthetic */ androidx.compose.ui.Modifier getHighSpeedVideoFpsRangesFor(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.ScrollState scrollState, boolean z, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, boolean z2, boolean z3) {
        return getHighResolutionOutputSizeshNQ4ISI(modifier, scrollState, z, flingBehavior, z2, z3, true, null);
    }

    private static final androidx.compose.ui.Modifier getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.ScrollState scrollState, boolean z, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, boolean z2, boolean z3, boolean z4, androidx.compose.foundation.OverscrollEffect overscrollEffect) {
        androidx.compose.ui.Modifier scrollableArea;
        androidx.compose.foundation.gestures.Orientation orientation = z3 ? androidx.compose.foundation.gestures.Orientation.Vertical : androidx.compose.foundation.gestures.Orientation.Horizontal;
        if (z4) {
            scrollableArea = androidx.compose.foundation.ScrollableAreaKt.scrollableArea(modifier, scrollState, orientation, (r17 & 4) != 0 ? true : z2, (r17 & 8) != 0 ? false : z, (r17 & 16) != 0 ? null : flingBehavior, (r17 & 32) != 0 ? null : scrollState.getInternalInteractionSource(), (r17 & 64) != 0 ? null : null);
        } else {
            scrollableArea = androidx.compose.foundation.ScrollableAreaKt.scrollableArea(modifier, scrollState, orientation, overscrollEffect, (r20 & 8) != 0 ? true : z2, (r20 & 16) != 0 ? false : z, (r20 & 32) != 0 ? null : flingBehavior, (r20 & 64) != 0 ? null : scrollState.getInternalInteractionSource(), (r20 & 128) != 0 ? null : null);
        }
        return scrollableArea.then(new androidx.compose.foundation.ScrollingLayoutElement(scrollState, z, z3));
    }
}
