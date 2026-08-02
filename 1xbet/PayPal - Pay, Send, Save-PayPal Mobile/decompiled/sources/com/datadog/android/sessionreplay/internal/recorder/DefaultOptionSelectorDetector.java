package com.datadog.android.sessionreplay.internal.recorder;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/recorder/DefaultOptionSelectorDetector;", "Lcom/datadog/android/sessionreplay/recorder/OptionSelectorDetector;", "<init>", "()V", "Landroid/view/ViewGroup;", "view", "", "isOptionSelector", "(Landroid/view/ViewGroup;)Z", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DefaultOptionSelectorDetector implements com.datadog.android.sessionreplay.recorder.OptionSelectorDetector {
    private static final java.util.Set<java.lang.String> getHighSpeedVideoSizes = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.String[]{"android.widget.DropDownListView", "androidx.appcompat.widget.DropDownListView", "com.google.android.material.timepicker.TimePickerView", "com.google.android.material.datepicker.MaterialCalendarGridView"});

    @Override // com.datadog.android.sessionreplay.recorder.OptionSelectorDetector
    public final boolean isOptionSelector(android.view.ViewGroup view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        java.lang.String canonicalName = view.getClass().getCanonicalName();
        return getHighSpeedVideoSizes.contains(canonicalName != null ? canonicalName : "") || androidx.appcompat.widget.AppCompatSpinner.class.isAssignableFrom(view.getClass());
    }
}
