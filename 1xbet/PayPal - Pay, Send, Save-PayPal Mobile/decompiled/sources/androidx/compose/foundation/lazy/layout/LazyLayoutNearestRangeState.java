package androidx.compose.foundation.lazy.layout;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0000\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR+\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00028W@SX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0016\u0010\u000f\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\r"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "Landroidx/compose/runtime/State;", "Lkotlin/ranges/IntRange;", "", "firstVisibleItem", "slidingWindowSize", "extraItemCount", "<init>", "(III)V", "", "update", "(I)V", "getHighResolutionOutputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "<set-?>", "value$delegate", "Landroidx/compose/runtime/MutableState;", "getValue", "()Lkotlin/ranges/IntRange;", "setValue", "(Lkotlin/ranges/IntRange;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LazyLayoutNearestRangeState implements androidx.compose.runtime.State<kotlin.ranges.IntRange> {
    public static final int $stable = 0;
    private static final androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState.Companion Companion = new androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState.Companion(null);

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private int getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final int Camera2StreamConfigurationMap;

    /* renamed from: value$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState value;

    public LazyLayoutNearestRangeState(int i, int i2, int i3) {
        this.getHighSpeedVideoFpsRanges = i2;
        this.Camera2StreamConfigurationMap = i3;
        this.value = androidx.compose.runtime.SnapshotStateKt.mutableStateOf(androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState.Companion.getHighSpeedVideoFpsRangesFor(i, i2, i3), androidx.compose.runtime.SnapshotStateKt.structuralEqualityPolicy());
        this.getHighSpeedVideoSizes = i;
    }

    private void setValue(kotlin.ranges.IntRange intRange) {
        this.value.setValue(intRange);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.State
    public final kotlin.ranges.IntRange getValue() {
        return (kotlin.ranges.IntRange) this.value.getValue();
    }

    public final void update(int firstVisibleItem) {
        if (firstVisibleItem != this.getHighSpeedVideoSizes) {
            this.getHighSpeedVideoSizes = firstVisibleItem;
            setValue(androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState.Companion.getHighSpeedVideoFpsRangesFor(firstVisibleItem, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState$Companion;", "", "<init>", "()V", "", "p0", "p1", "p2", "Lkotlin/ranges/IntRange;", "getHighSpeedVideoFpsRangesFor", "(III)Lkotlin/ranges/IntRange;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static kotlin.ranges.IntRange getHighSpeedVideoFpsRangesFor(int p0, int p1, int p2) {
            int i = (p0 / p1) * p1;
            return kotlin.ranges.RangesKt.until(java.lang.Math.max(i - p2, 0), i + p1 + p2);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
