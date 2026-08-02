package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0002\u001a\f\u0010\u0002\u001a\u00020\u0003*\u00020\u0001H\u0002\u001a\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a\f\u0010\u0006\u001a\u00020\u0001*\u00020\u0003H\u0002\u001a\f\u0010\u0007\u001a\u00020\u0001*\u00020\u0001H\u0002\u001a/\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0011\u001a\u00020\u0003*\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001b\u0010\u0016\u001a\u00020\u0003*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0017\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 H\u0007¢\u0006\u0002\u0010!\"\u000e\u0010\u0015\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0018\u0010\u0016\u001a\u00020\u0003*\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\""}, d2 = {"ceilAwayFromZero", "", "extractIntegerPixels", "", "composeToViewOffset", "offset", "reverseAxis", "toViewVelocity", "toOffset", "Landroidx/compose/ui/geometry/Offset;", "dx", "dy", "consumed", "", com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.AVAILABLE_CONDITION_KEY, "toOffset-moWRBKg", "(II[IJ)J", "toViewType", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "toViewType-GyEprt8", "(I)I", "ScrollingAxesThreshold", "scrollAxes", "getScrollAxes-k-4lQ0M", "(J)I", "Landroidx/compose/ui/unit/Velocity;", "minFlingVelocity", "scrollAxes-sF-c-tU", "(JF)I", "rememberNestedScrollInteropConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "hostView", "Landroid/view/View;", "(Landroid/view/View;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "ui"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NestedScrollInteropConnectionKt {
    public static final /* synthetic */ float access$toViewVelocity(float f) {
        return f * (-1.0f);
    }

    public static final int composeToViewOffset(float f) {
        int ceil;
        if (androidx.compose.ui.ComposeUiFlags.isNestedScrollInteropIntegerPropagationEnabled) {
            ceil = kotlin.math.MathKt.roundToInt(f);
        } else {
            ceil = (int) (f >= 0.0f ? java.lang.Math.ceil(f) : java.lang.Math.floor(f));
        }
        return ceil * (-1);
    }

    public static final androidx.compose.ui.input.nestedscroll.NestedScrollConnection rememberNestedScrollInteropConnection(android.view.View view, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            view = (android.view.View) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalView());
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1075877987, i, -1, "androidx.compose.ui.platform.rememberNestedScrollInteropConnection (NestedScrollInteropConnection.android.kt:292)");
        }
        androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) composer.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration());
        boolean changed = composer.changed(view);
        boolean changed2 = composer.changed(viewConfiguration);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.compose.ui.platform.NestedScrollInteropConnection(view, viewConfiguration.getMinimumFlingVelocity());
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.ui.platform.NestedScrollInteropConnection nestedScrollInteropConnection = (androidx.compose.ui.platform.NestedScrollInteropConnection) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return nestedScrollInteropConnection;
    }

    /* renamed from: access$getScrollAxes-k-4lQ0M, reason: not valid java name */
    public static final /* synthetic */ int m7770access$getScrollAxesk4lQ0M(long j) {
        int i = java.lang.Math.abs(java.lang.Float.intBitsToFloat((int) (j >> 32))) >= 0.5f ? 1 : 0;
        return java.lang.Math.abs(java.lang.Float.intBitsToFloat((int) (j & 4294967295L))) >= 0.5f ? i | 2 : i;
    }

    /* renamed from: access$toOffset-moWRBKg, reason: not valid java name */
    public static final /* synthetic */ long m7771access$toOffsetmoWRBKg(int i, int i2, int[] iArr, long j) {
        float coerceAtLeast;
        float coerceAtLeast2;
        float intBitsToFloat = (!androidx.compose.ui.ComposeUiFlags.isNestedScrollInteropIntegerPropagationEnabled || java.lang.Math.abs(iArr[0]) == 0) ? 0.0f : java.lang.Float.intBitsToFloat((int) (j >> 32)) - (i * (-1.0f));
        float intBitsToFloat2 = (!androidx.compose.ui.ComposeUiFlags.isNestedScrollInteropIntegerPropagationEnabled || java.lang.Math.abs(iArr[1]) == 0) ? 0.0f : java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) - (i2 * (-1.0f));
        int i3 = (int) (j >> 32);
        if (java.lang.Float.intBitsToFloat(i3) >= 0.0f) {
            coerceAtLeast = kotlin.ranges.RangesKt.coerceAtMost((iArr[0] * (-1.0f)) + intBitsToFloat, java.lang.Float.intBitsToFloat(i3));
        } else {
            coerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast((iArr[0] * (-1.0f)) + intBitsToFloat, java.lang.Float.intBitsToFloat(i3));
        }
        int i4 = (int) (j & 4294967295L);
        if (java.lang.Float.intBitsToFloat(i4) >= 0.0f) {
            coerceAtLeast2 = kotlin.ranges.RangesKt.coerceAtMost((iArr[1] * (-1.0f)) + intBitsToFloat2, java.lang.Float.intBitsToFloat(i4));
        } else {
            coerceAtLeast2 = kotlin.ranges.RangesKt.coerceAtLeast((iArr[1] * (-1.0f)) + intBitsToFloat2, java.lang.Float.intBitsToFloat(i4));
        }
        return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(coerceAtLeast) << 32) | (java.lang.Float.floatToRawIntBits(coerceAtLeast2) & 4294967295L));
    }

    /* renamed from: access$toViewType-GyEprt8, reason: not valid java name */
    public static final /* synthetic */ int m7772access$toViewTypeGyEprt8(int i) {
        return !androidx.compose.ui.input.nestedscroll.NestedScrollSource.m7114equalsimpl0(i, androidx.compose.ui.input.nestedscroll.NestedScrollSource.INSTANCE.m7126getUserInputWNlRxjI()) ? 1 : 0;
    }
}
