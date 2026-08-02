package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\tJ\u0015\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/paging/RecordingCallback;", "Landroidx/paging/PagedList$Callback;", "<init>", "()V", "", com.daon.sdk.face.license.License.FEATURE_POSITION, com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "", "onChanged", "(II)V", "onInserted", "onRemoved", "other", "dispatchRecordingTo", "(Landroidx/paging/PagedList$Callback;)V", "", "getHighSpeedVideoFpsRangesFor", "Ljava/util/List;", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RecordingCallback extends androidx.paging.PagedList.Callback {
    private final java.util.List<java.lang.Integer> getHighSpeedVideoFpsRangesFor = new java.util.ArrayList();

    @Override // androidx.paging.PagedList.Callback
    public final void onChanged(int position, int count) {
        this.getHighSpeedVideoFpsRangesFor.add(0);
        this.getHighSpeedVideoFpsRangesFor.add(java.lang.Integer.valueOf(position));
        this.getHighSpeedVideoFpsRangesFor.add(java.lang.Integer.valueOf(count));
    }

    @Override // androidx.paging.PagedList.Callback
    public final void onInserted(int position, int count) {
        this.getHighSpeedVideoFpsRangesFor.add(1);
        this.getHighSpeedVideoFpsRangesFor.add(java.lang.Integer.valueOf(position));
        this.getHighSpeedVideoFpsRangesFor.add(java.lang.Integer.valueOf(count));
    }

    @Override // androidx.paging.PagedList.Callback
    public final void onRemoved(int position, int count) {
        this.getHighSpeedVideoFpsRangesFor.add(2);
        this.getHighSpeedVideoFpsRangesFor.add(java.lang.Integer.valueOf(position));
        this.getHighSpeedVideoFpsRangesFor.add(java.lang.Integer.valueOf(count));
    }

    public final void dispatchRecordingTo(androidx.paging.PagedList.Callback other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "");
        kotlin.ranges.IntProgression step = kotlin.ranges.RangesKt.step(kotlin.ranges.RangesKt.until(0, this.getHighSpeedVideoFpsRangesFor.size()), 3);
        int first = step.getFirst();
        int last = step.getLast();
        int step2 = step.getStep();
        if ((step2 > 0 && first <= last) || (step2 < 0 && last <= first)) {
            while (true) {
                int intValue = this.getHighSpeedVideoFpsRangesFor.get(first).intValue();
                if (intValue == 0) {
                    other.onChanged(this.getHighSpeedVideoFpsRangesFor.get(first + 1).intValue(), this.getHighSpeedVideoFpsRangesFor.get(first + 2).intValue());
                } else if (intValue == 1) {
                    other.onInserted(this.getHighSpeedVideoFpsRangesFor.get(first + 1).intValue(), this.getHighSpeedVideoFpsRangesFor.get(first + 2).intValue());
                } else if (intValue == 2) {
                    other.onRemoved(this.getHighSpeedVideoFpsRangesFor.get(first + 1).intValue(), this.getHighSpeedVideoFpsRangesFor.get(first + 2).intValue());
                } else {
                    throw new java.lang.IllegalStateException("Unexpected recording value");
                }
                if (first == last) {
                    break;
                } else {
                    first += step2;
                }
            }
        }
        this.getHighSpeedVideoFpsRangesFor.clear();
    }
}
