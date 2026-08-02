package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J#\u0010\n\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000f\u001a\u00020\r*\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0012\u001a\u00020\r*\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J#\u0010\u0013\u001a\u00020\r*\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0010J#\u0010\u0014\u001a\u00020\r*\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/Modifier$Element;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "height", "minIntrinsicWidth", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I", "width", "minIntrinsicHeight", "maxIntrinsicWidth", "maxIntrinsicHeight"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface LayoutModifier extends androidx.compose.ui.Modifier.Element {
    /* renamed from: measure-3p2s80s */
    androidx.compose.ui.layout.MeasureResult mo2052measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j);

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static boolean all(androidx.compose.ui.layout.LayoutModifier layoutModifier, kotlin.jvm.functions.Function1<? super androidx.compose.ui.Modifier.Element, java.lang.Boolean> function1) {
            return androidx.compose.ui.layout.LayoutModifier.super.all(function1);
        }

        @java.lang.Deprecated
        public static boolean any(androidx.compose.ui.layout.LayoutModifier layoutModifier, kotlin.jvm.functions.Function1<? super androidx.compose.ui.Modifier.Element, java.lang.Boolean> function1) {
            return androidx.compose.ui.layout.LayoutModifier.super.any(function1);
        }

        @java.lang.Deprecated
        public static <R> R foldIn(androidx.compose.ui.layout.LayoutModifier layoutModifier, R r, kotlin.jvm.functions.Function2<? super R, ? super androidx.compose.ui.Modifier.Element, ? extends R> function2) {
            return (R) androidx.compose.ui.layout.LayoutModifier.super.foldIn(r, function2);
        }

        @java.lang.Deprecated
        public static <R> R foldOut(androidx.compose.ui.layout.LayoutModifier layoutModifier, R r, kotlin.jvm.functions.Function2<? super androidx.compose.ui.Modifier.Element, ? super R, ? extends R> function2) {
            return (R) androidx.compose.ui.layout.LayoutModifier.super.foldOut(r, function2);
        }

        @java.lang.Deprecated
        public static androidx.compose.ui.Modifier then(androidx.compose.ui.layout.LayoutModifier layoutModifier, androidx.compose.ui.Modifier modifier) {
            return androidx.compose.ui.layout.LayoutModifier.super.then(modifier);
        }

        @java.lang.Deprecated
        public static int minIntrinsicWidth(androidx.compose.ui.layout.LayoutModifier layoutModifier, androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
            return androidx.compose.ui.layout.LayoutModifier.super.minIntrinsicWidth(intrinsicMeasureScope, intrinsicMeasurable, i);
        }

        @java.lang.Deprecated
        public static int minIntrinsicHeight(androidx.compose.ui.layout.LayoutModifier layoutModifier, androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
            return androidx.compose.ui.layout.LayoutModifier.super.minIntrinsicHeight(intrinsicMeasureScope, intrinsicMeasurable, i);
        }

        @java.lang.Deprecated
        public static int maxIntrinsicWidth(androidx.compose.ui.layout.LayoutModifier layoutModifier, androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
            return androidx.compose.ui.layout.LayoutModifier.super.maxIntrinsicWidth(intrinsicMeasureScope, intrinsicMeasurable, i);
        }

        @java.lang.Deprecated
        public static int maxIntrinsicHeight(androidx.compose.ui.layout.LayoutModifier layoutModifier, androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
            return androidx.compose.ui.layout.LayoutModifier.super.maxIntrinsicHeight(intrinsicMeasureScope, intrinsicMeasurable, i);
        }
    }

    default int minIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        androidx.compose.ui.layout.MeasuringIntrinsics measuringIntrinsics = androidx.compose.ui.layout.MeasuringIntrinsics.INSTANCE;
        return androidx.compose.ui.layout.MeasuringIntrinsics.getHighSpeedVideoFpsRanges(this, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    default int minIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        androidx.compose.ui.layout.MeasuringIntrinsics measuringIntrinsics = androidx.compose.ui.layout.MeasuringIntrinsics.INSTANCE;
        return androidx.compose.ui.layout.MeasuringIntrinsics.getHighSpeedVideoSizes(this, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    default int maxIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        androidx.compose.ui.layout.MeasuringIntrinsics measuringIntrinsics = androidx.compose.ui.layout.MeasuringIntrinsics.INSTANCE;
        return androidx.compose.ui.layout.MeasuringIntrinsics.Camera2StreamConfigurationMap(this, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    default int maxIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        androidx.compose.ui.layout.MeasuringIntrinsics measuringIntrinsics = androidx.compose.ui.layout.MeasuringIntrinsics.INSTANCE;
        return androidx.compose.ui.layout.MeasuringIntrinsics.getHighResolutionOutputSizeshNQ4ISI(this, intrinsicMeasureScope, intrinsicMeasurable, i);
    }
}
