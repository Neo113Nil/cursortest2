package androidx.constraintlayout.compose;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bB\u001d\b\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0007\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00128\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u00128\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0014"}, d2 = {"Landroidx/constraintlayout/compose/DimensionDescription;", "Landroidx/constraintlayout/compose/Dimension$Coercible;", "Landroidx/constraintlayout/compose/Dimension$MinCoercible;", "Landroidx/constraintlayout/compose/Dimension$MaxCoercible;", "Landroidx/constraintlayout/compose/Dimension;", "Landroidx/compose/ui/unit/Dp;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "valueSymbol", "(Ljava/lang/String;)V", "p0", "p1", "(Landroidx/compose/ui/unit/Dp;Ljava/lang/String;)V", "Landroidx/constraintlayout/core/parser/CLElement;", "asCLElement$constraintlayout_compose_release", "()Landroidx/constraintlayout/core/parser/CLElement;", "Landroidx/constraintlayout/compose/DimensionSymbol;", com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MAX_KEY, "Landroidx/constraintlayout/compose/DimensionSymbol;", "getMax$constraintlayout_compose_release", "()Landroidx/constraintlayout/compose/DimensionSymbol;", com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MIN_KEY, "getMin$constraintlayout_compose_release", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DimensionDescription implements androidx.constraintlayout.compose.Dimension.Coercible, androidx.constraintlayout.compose.Dimension.MinCoercible, androidx.constraintlayout.compose.Dimension.MaxCoercible, androidx.constraintlayout.compose.Dimension {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.constraintlayout.compose.DimensionSymbol getHighSpeedVideoFpsRangesFor;
    private final androidx.constraintlayout.compose.DimensionSymbol max;
    private final androidx.constraintlayout.compose.DimensionSymbol min;

    private DimensionDescription(androidx.compose.ui.unit.Dp dp, java.lang.String str) {
        this.getHighSpeedVideoFpsRangesFor = new androidx.constraintlayout.compose.DimensionSymbol(dp, str, "base", null);
        this.min = new androidx.constraintlayout.compose.DimensionSymbol(null, null, com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MIN_KEY, null);
        this.max = new androidx.constraintlayout.compose.DimensionSymbol(null, null, com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MAX_KEY, null);
    }

    private DimensionDescription(float f) {
        this(androidx.compose.ui.unit.Dp.m8599boximpl(f), (java.lang.String) null);
    }

    public DimensionDescription(java.lang.String str) {
        this((androidx.compose.ui.unit.Dp) null, str);
    }

    /* renamed from: getMin$constraintlayout_compose_release, reason: from getter */
    public final androidx.constraintlayout.compose.DimensionSymbol getMin() {
        return this.min;
    }

    /* renamed from: getMax$constraintlayout_compose_release, reason: from getter */
    public final androidx.constraintlayout.compose.DimensionSymbol getMax() {
        return this.max;
    }

    public final androidx.constraintlayout.core.parser.CLElement asCLElement$constraintlayout_compose_release() {
        if (this.min.isUndefined() && this.max.isUndefined()) {
            return this.getHighSpeedVideoFpsRangesFor.asCLElement();
        }
        androidx.constraintlayout.core.parser.CLObject cLObject = new androidx.constraintlayout.core.parser.CLObject(new char[0]);
        if (!this.min.isUndefined()) {
            cLObject.put(com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MIN_KEY, this.min.asCLElement());
        }
        if (!this.max.isUndefined()) {
            cLObject.put(com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MAX_KEY, this.max.asCLElement());
        }
        cLObject.put(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, this.getHighSpeedVideoFpsRangesFor.asCLElement());
        return cLObject;
    }

    public /* synthetic */ DimensionDescription(float f, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(f);
    }
}
