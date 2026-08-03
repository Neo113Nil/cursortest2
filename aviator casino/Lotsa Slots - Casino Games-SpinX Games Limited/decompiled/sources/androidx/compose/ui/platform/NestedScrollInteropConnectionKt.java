package androidx.compose.ui.platform;

/* compiled from: NestedScrollInteropConnection.android.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0001H\u0000\u001a\u0017\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\r\u001a\"\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\f\u0010\u0014\u001a\u00020\u0001*\u00020\u0001H\u0002\u001a\f\u0010\u0015\u001a\u00020\u0001*\u00020\u0003H\u0002\u001a\u0016\u0010\u0016\u001a\u00020\u0003*\u00020\u0017H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\f\u0010\u001a\u001a\u00020\u0001*\u00020\u0001H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0018\u0010\u0002\u001a\u00020\u0003*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"ScrollingAxesThreshold", "", "scrollAxes", "", "Landroidx/compose/ui/geometry/Offset;", "getScrollAxes-k-4lQ0M", "(J)I", "composeToViewOffset", "offset", "rememberNestedScrollInteropConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "hostView", "Landroid/view/View;", "(Landroid/view/View;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "toOffset", "consumed", "", "available", "toOffset-Uv8p0NA", "([IJ)J", "ceilAwayFromZero", "reverseAxis", "toViewType", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "toViewType-GyEprt8", "(I)I", "toViewVelocity", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NestedScrollInteropConnectionKt {
    private static final float ScrollingAxesThreshold = 0.5f;

    private static final float reverseAxis(int i) {
        return i * (-1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float toViewVelocity(float f) {
        return f * (-1.0f);
    }

    private static final float ceilAwayFromZero(float f) {
        return (float) (f >= 0.0f ? java.lang.Math.ceil(f) : java.lang.Math.floor(f));
    }

    public static final int composeToViewOffset(float f) {
        return ((int) ceilAwayFromZero(f)) * (-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toOffset-Uv8p0NA, reason: not valid java name */
    public static final long m3759toOffsetUv8p0NA(int[] iArr, long j) {
        float coerceAtLeast;
        float coerceAtLeast2;
        if (androidx.compose.ui.geometry.Offset.m1871getXimpl(j) >= 0.0f) {
            coerceAtLeast = kotlin.ranges.RangesKt.coerceAtMost(reverseAxis(iArr[0]), androidx.compose.ui.geometry.Offset.m1871getXimpl(j));
        } else {
            coerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast(reverseAxis(iArr[0]), androidx.compose.ui.geometry.Offset.m1871getXimpl(j));
        }
        if (androidx.compose.ui.geometry.Offset.m1872getYimpl(j) >= 0.0f) {
            coerceAtLeast2 = kotlin.ranges.RangesKt.coerceAtMost(reverseAxis(iArr[1]), androidx.compose.ui.geometry.Offset.m1872getYimpl(j));
        } else {
            coerceAtLeast2 = kotlin.ranges.RangesKt.coerceAtLeast(reverseAxis(iArr[1]), androidx.compose.ui.geometry.Offset.m1872getYimpl(j));
        }
        return androidx.compose.ui.geometry.OffsetKt.Offset(coerceAtLeast, coerceAtLeast2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toViewType-GyEprt8, reason: not valid java name */
    public static final int m3760toViewTypeGyEprt8(int i) {
        return !androidx.compose.ui.input.nestedscroll.NestedScrollSource.m3163equalsimpl0(i, androidx.compose.ui.input.nestedscroll.NestedScrollSource.INSTANCE.m3168getDragWNlRxjI()) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getScrollAxes-k-4lQ0M, reason: not valid java name */
    public static final int m3758getScrollAxesk4lQ0M(long j) {
        int i = java.lang.Math.abs(androidx.compose.ui.geometry.Offset.m1871getXimpl(j)) >= 0.5f ? 1 : 0;
        return java.lang.Math.abs(androidx.compose.ui.geometry.Offset.m1872getYimpl(j)) >= 0.5f ? i | 2 : i;
    }

    public static final androidx.compose.ui.input.nestedscroll.NestedScrollConnection rememberNestedScrollInteropConnection(android.view.View view, androidx.compose.runtime.Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1075877987);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(rememberNestedScrollInteropConnection)234@8194L7,235@8230L66:NestedScrollInteropConnection.android.kt#itgzvw");
        if ((i2 & 1) != 0) {
            androidx.compose.runtime.ProvidableCompositionLocal<android.view.View> localView = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalView();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            java.lang.Object consume = composer.consume(localView);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
            view = (android.view.View) consume;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1075877987, i, -1, "androidx.compose.ui.platform.rememberNestedScrollInteropConnection (NestedScrollInteropConnection.android.kt:235)");
        }
        composer.startReplaceableGroup(1157296644);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean changed = composer.changed(view);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.compose.ui.platform.NestedScrollInteropConnection(view);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        androidx.compose.ui.platform.NestedScrollInteropConnection nestedScrollInteropConnection = (androidx.compose.ui.platform.NestedScrollInteropConnection) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return nestedScrollInteropConnection;
    }
}
