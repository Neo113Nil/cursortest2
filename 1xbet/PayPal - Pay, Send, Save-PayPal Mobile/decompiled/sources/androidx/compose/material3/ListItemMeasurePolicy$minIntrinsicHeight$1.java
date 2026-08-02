package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* synthetic */ class ListItemMeasurePolicy$minIntrinsicHeight$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2<androidx.compose.ui.layout.IntrinsicMeasurable, java.lang.Integer, java.lang.Integer> {
    public static final androidx.compose.material3.ListItemMeasurePolicy$minIntrinsicHeight$1 getHighSpeedVideoSizes = new androidx.compose.material3.ListItemMeasurePolicy$minIntrinsicHeight$1();

    public final java.lang.Integer getHighSpeedVideoFpsRanges(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        return java.lang.Integer.valueOf(intrinsicMeasurable.minIntrinsicHeight(i));
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Integer invoke(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, java.lang.Integer num) {
        return getHighSpeedVideoFpsRanges(intrinsicMeasurable, num.intValue());
    }

    ListItemMeasurePolicy$minIntrinsicHeight$1() {
        super(2, androidx.compose.ui.layout.IntrinsicMeasurable.class, "minIntrinsicHeight", "minIntrinsicHeight(I)I", 0);
    }
}
