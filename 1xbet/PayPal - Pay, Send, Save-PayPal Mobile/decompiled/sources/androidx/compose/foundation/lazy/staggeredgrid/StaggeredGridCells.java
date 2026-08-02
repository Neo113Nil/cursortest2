package androidx.compose.foundation.lazy.staggeredgrid;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0003\t\n\u000bJ#\u0010\u0007\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;", "", "Landroidx/compose/ui/unit/Density;", "", "availableSize", "spacing", "", "calculateCrossAxisCellSizes", "(Landroidx/compose/ui/unit/Density;II)[I", "Fixed", "Adaptive", "FixedSize"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface StaggeredGridCells {
    int[] calculateCrossAxisCellSizes(androidx.compose.ui.unit.Density density, int i, int i2);

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u00020\t*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells$Fixed;", "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;", "", com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "<init>", "(I)V", "Landroidx/compose/ui/unit/Density;", "availableSize", "spacing", "", "calculateCrossAxisCellSizes", "(Landroidx/compose/ui/unit/Density;II)[I", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "getHighSpeedVideoFpsRanges", com.visa.cbp.getEncExpo.warmup, "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Fixed implements androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells {
        public static final int $stable = 0;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final int Camera2StreamConfigurationMap;

        public Fixed(int i) {
            this.Camera2StreamConfigurationMap = i;
            if (i > 0) {
                return;
            }
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException("grid with no rows/columns");
        }

        @Override // androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
        public final int[] calculateCrossAxisCellSizes(androidx.compose.ui.unit.Density density, int i, int i2) {
            int[] highResolutionOutputSizeshNQ4ISI;
            highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridCellsKt.getHighResolutionOutputSizeshNQ4ISI(i, this.Camera2StreamConfigurationMap, i2);
            return highResolutionOutputSizeshNQ4ISI;
        }

        public final int hashCode() {
            return -this.Camera2StreamConfigurationMap;
        }

        public final boolean equals(java.lang.Object other) {
            return (other instanceof androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells.Fixed) && this.Camera2StreamConfigurationMap == ((androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells.Fixed) other).Camera2StreamConfigurationMap;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u00020\n*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells$Adaptive;", "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;", "Landroidx/compose/ui/unit/Dp;", "minSize", "<init>", "(FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/unit/Density;", "", "availableSize", "spacing", "", "calculateCrossAxisCellSizes", "(Landroidx/compose/ui/unit/Density;II)[I", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "getHighSpeedVideoFpsRangesFor", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Adaptive implements androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells {
        public static final int $stable = 0;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final float Camera2StreamConfigurationMap;

        private Adaptive(float f) {
            this.Camera2StreamConfigurationMap = f;
            if (androidx.compose.ui.unit.Dp.m8600compareTo0680j_4(f, androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f)) > 0) {
                return;
            }
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException("invalid minSize");
        }

        @Override // androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
        public final int[] calculateCrossAxisCellSizes(androidx.compose.ui.unit.Density density, int i, int i2) {
            int[] highResolutionOutputSizeshNQ4ISI;
            highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridCellsKt.getHighResolutionOutputSizeshNQ4ISI(i, java.lang.Math.max((i + i2) / (density.mo1412roundToPx0680j_4(this.Camera2StreamConfigurationMap) + i2), 1), i2);
            return highResolutionOutputSizeshNQ4ISI;
        }

        public final int hashCode() {
            return androidx.compose.ui.unit.Dp.m8607hashCodeimpl(this.Camera2StreamConfigurationMap);
        }

        public final boolean equals(java.lang.Object other) {
            return (other instanceof androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells.Adaptive) && androidx.compose.ui.unit.Dp.m8606equalsimpl0(this.Camera2StreamConfigurationMap, ((androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells.Adaptive) other).Camera2StreamConfigurationMap);
        }

        public /* synthetic */ Adaptive(float f, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(f);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u00020\n*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells$FixedSize;", "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;", "Landroidx/compose/ui/unit/Dp;", io.ktor.http.ContentDisposition.Parameters.Size, "<init>", "(FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/unit/Density;", "", "availableSize", "spacing", "", "calculateCrossAxisCellSizes", "(Landroidx/compose/ui/unit/Density;II)[I", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "getHighSpeedVideoSizes", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class FixedSize implements androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells {
        public static final int $stable = 0;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final float getHighResolutionOutputSizeshNQ4ISI;

        private FixedSize(float f) {
            this.getHighResolutionOutputSizeshNQ4ISI = f;
        }

        @Override // androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
        public final int[] calculateCrossAxisCellSizes(androidx.compose.ui.unit.Density density, int i, int i2) {
            int mo1412roundToPx0680j_4 = density.mo1412roundToPx0680j_4(this.getHighResolutionOutputSizeshNQ4ISI);
            int i3 = mo1412roundToPx0680j_4 + i2;
            int i4 = i2 + i;
            if (i3 < i4) {
                int i5 = i4 / i3;
                int[] iArr = new int[i5];
                for (int i6 = 0; i6 < i5; i6++) {
                    iArr[i6] = mo1412roundToPx0680j_4;
                }
                return iArr;
            }
            return new int[]{i};
        }

        public final int hashCode() {
            return androidx.compose.ui.unit.Dp.m8607hashCodeimpl(this.getHighResolutionOutputSizeshNQ4ISI);
        }

        public final boolean equals(java.lang.Object other) {
            return (other instanceof androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells.FixedSize) && androidx.compose.ui.unit.Dp.m8606equalsimpl0(this.getHighResolutionOutputSizeshNQ4ISI, ((androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells.FixedSize) other).getHighResolutionOutputSizeshNQ4ISI);
        }

        public /* synthetic */ FixedSize(float f, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(f);
        }
    }
}
