package com.datadog.android.sessionreplay.internal.recorder;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/recorder/ComposedOptionSelectorDetector;", "Lcom/datadog/android/sessionreplay/recorder/OptionSelectorDetector;", "", "detectors", "<init>", "(Ljava/util/List;)V", "Landroid/view/ViewGroup;", "view", "", "isOptionSelector", "(Landroid/view/ViewGroup;)Z", "getHighSpeedVideoFpsRangesFor", "Ljava/util/List;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ComposedOptionSelectorDetector implements com.datadog.android.sessionreplay.recorder.OptionSelectorDetector {
    private final java.util.List<com.datadog.android.sessionreplay.recorder.OptionSelectorDetector> getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Multi-variable type inference failed */
    public ComposedOptionSelectorDetector(java.util.List<? extends com.datadog.android.sessionreplay.recorder.OptionSelectorDetector> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.getHighSpeedVideoFpsRangesFor = list;
    }

    @Override // com.datadog.android.sessionreplay.recorder.OptionSelectorDetector
    public final boolean isOptionSelector(android.view.ViewGroup view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        java.util.List<com.datadog.android.sessionreplay.recorder.OptionSelectorDetector> list = this.getHighSpeedVideoFpsRangesFor;
        if ((list instanceof java.util.Collection) && list.isEmpty()) {
            return false;
        }
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((com.datadog.android.sessionreplay.recorder.OptionSelectorDetector) it.next()).isOptionSelector(view)) {
                return true;
            }
        }
        return false;
    }
}
