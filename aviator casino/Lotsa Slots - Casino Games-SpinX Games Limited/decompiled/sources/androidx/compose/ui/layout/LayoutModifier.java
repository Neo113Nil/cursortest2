package androidx.compose.ui.layout;

/* compiled from: LayoutModifier.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0016J\u001c\u0010\b\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0003H\u0016J&\u0010\n\u001a\u00020\u000b*\u00020\f2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH&ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001c\u0010\u0012\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0016J\u001c\u0010\u0013\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0003H\u0016ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/Modifier$Element;", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface LayoutModifier extends androidx.compose.ui.Modifier.Element {
    int maxIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i);

    int maxIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i);

    /* renamed from: measure-3p2s80s */
    androidx.compose.ui.layout.MeasureResult mo65measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j);

    int minIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i);

    int minIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i);

    /* compiled from: LayoutModifier.kt */
    /* renamed from: androidx.compose.ui.layout.LayoutModifier$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static int $default$minIntrinsicWidth(androidx.compose.ui.layout.LayoutModifier _this, androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
            return androidx.compose.ui.layout.MeasuringIntrinsics.INSTANCE.minWidth(_this, intrinsicMeasureScope, intrinsicMeasurable, i);
        }

        public static int $default$minIntrinsicHeight(androidx.compose.ui.layout.LayoutModifier _this, androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
            return androidx.compose.ui.layout.MeasuringIntrinsics.INSTANCE.minHeight(_this, intrinsicMeasureScope, intrinsicMeasurable, i);
        }

        public static int $default$maxIntrinsicWidth(androidx.compose.ui.layout.LayoutModifier _this, androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
            return androidx.compose.ui.layout.MeasuringIntrinsics.INSTANCE.maxWidth(_this, intrinsicMeasureScope, intrinsicMeasurable, i);
        }

        public static int $default$maxIntrinsicHeight(androidx.compose.ui.layout.LayoutModifier _this, androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
            return androidx.compose.ui.layout.MeasuringIntrinsics.INSTANCE.maxHeight(_this, intrinsicMeasureScope, intrinsicMeasurable, i);
        }
    }

    /* compiled from: LayoutModifier.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static boolean all(androidx.compose.ui.layout.LayoutModifier layoutModifier, kotlin.jvm.functions.Function1<? super androidx.compose.ui.Modifier.Element, java.lang.Boolean> function1) {
            return androidx.compose.ui.Modifier.Element.CC.$default$all(layoutModifier, function1);
        }

        @java.lang.Deprecated
        public static boolean any(androidx.compose.ui.layout.LayoutModifier layoutModifier, kotlin.jvm.functions.Function1<? super androidx.compose.ui.Modifier.Element, java.lang.Boolean> function1) {
            return androidx.compose.ui.Modifier.Element.CC.$default$any(layoutModifier, function1);
        }

        @java.lang.Deprecated
        public static <R> R foldIn(androidx.compose.ui.layout.LayoutModifier layoutModifier, R r, kotlin.jvm.functions.Function2<? super R, ? super androidx.compose.ui.Modifier.Element, ? extends R> function2) {
            return (R) androidx.compose.ui.Modifier.Element.CC.$default$foldIn(layoutModifier, r, function2);
        }

        @java.lang.Deprecated
        public static <R> R foldOut(androidx.compose.ui.layout.LayoutModifier layoutModifier, R r, kotlin.jvm.functions.Function2<? super androidx.compose.ui.Modifier.Element, ? super R, ? extends R> function2) {
            return (R) androidx.compose.ui.Modifier.Element.CC.$default$foldOut(layoutModifier, r, function2);
        }

        @java.lang.Deprecated
        public static androidx.compose.ui.Modifier then(androidx.compose.ui.layout.LayoutModifier layoutModifier, androidx.compose.ui.Modifier modifier) {
            return androidx.compose.ui.Modifier.CC.$default$then(layoutModifier, modifier);
        }

        @java.lang.Deprecated
        public static int minIntrinsicWidth(androidx.compose.ui.layout.LayoutModifier layoutModifier, androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
            return androidx.compose.ui.layout.LayoutModifier.CC.$default$minIntrinsicWidth(layoutModifier, intrinsicMeasureScope, intrinsicMeasurable, i);
        }

        @java.lang.Deprecated
        public static int minIntrinsicHeight(androidx.compose.ui.layout.LayoutModifier layoutModifier, androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
            return androidx.compose.ui.layout.LayoutModifier.CC.$default$minIntrinsicHeight(layoutModifier, intrinsicMeasureScope, intrinsicMeasurable, i);
        }

        @java.lang.Deprecated
        public static int maxIntrinsicWidth(androidx.compose.ui.layout.LayoutModifier layoutModifier, androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
            return androidx.compose.ui.layout.LayoutModifier.CC.$default$maxIntrinsicWidth(layoutModifier, intrinsicMeasureScope, intrinsicMeasurable, i);
        }

        @java.lang.Deprecated
        public static int maxIntrinsicHeight(androidx.compose.ui.layout.LayoutModifier layoutModifier, androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
            return androidx.compose.ui.layout.LayoutModifier.CC.$default$maxIntrinsicHeight(layoutModifier, intrinsicMeasureScope, intrinsicMeasurable, i);
        }
    }
}
