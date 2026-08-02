package androidx.constraintlayout.compose;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u001b\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!"}, d2 = {"Landroidx/constraintlayout/compose/DimensionSymbol;", "", "Landroidx/compose/ui/unit/Dp;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "symbol", "debugName", "<init>", "(Landroidx/compose/ui/unit/Dp;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/constraintlayout/core/parser/CLElement;", "asCLElement", "()Landroidx/constraintlayout/core/parser/CLElement;", "", "isUndefined", "()Z", "dp", "", "update-0680j_4", "(F)V", "update", "(Ljava/lang/String;)V", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "Landroidx/compose/ui/unit/Dp;", "getHighSpeedVideoSizes"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DimensionSymbol {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private androidx.compose.ui.unit.Dp getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private java.lang.String Camera2StreamConfigurationMap;

    private DimensionSymbol(androidx.compose.ui.unit.Dp dp, java.lang.String str, java.lang.String str2) {
        this.getHighSpeedVideoSizes = dp;
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoFpsRangesFor = str2;
    }

    /* renamed from: update-0680j_4, reason: not valid java name */
    public final void m8950update0680j_4(float dp) {
        this.getHighSpeedVideoSizes = androidx.compose.ui.unit.Dp.m8599boximpl(dp);
        this.Camera2StreamConfigurationMap = null;
    }

    public final void update(java.lang.String symbol) {
        this.getHighSpeedVideoSizes = null;
        this.Camera2StreamConfigurationMap = symbol;
    }

    public final boolean isUndefined() {
        return this.getHighSpeedVideoSizes == null && this.Camera2StreamConfigurationMap == null;
    }

    public final androidx.constraintlayout.core.parser.CLElement asCLElement() {
        androidx.compose.ui.unit.Dp dp = this.getHighSpeedVideoSizes;
        if (dp != null) {
            return new androidx.constraintlayout.core.parser.CLNumber(dp.m8615unboximpl());
        }
        java.lang.String str = this.Camera2StreamConfigurationMap;
        if (str != null) {
            return androidx.constraintlayout.core.parser.CLString.from(str);
        }
        return androidx.constraintlayout.core.parser.CLString.from("wrap");
    }

    public /* synthetic */ DimensionSymbol(androidx.compose.ui.unit.Dp dp, java.lang.String str, java.lang.String str2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(dp, str, str2);
    }
}
