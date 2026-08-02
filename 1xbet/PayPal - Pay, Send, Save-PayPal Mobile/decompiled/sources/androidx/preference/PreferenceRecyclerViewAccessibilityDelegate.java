package androidx.preference;

@java.lang.Deprecated
/* loaded from: classes7.dex */
public class PreferenceRecyclerViewAccessibilityDelegate extends androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate {
    final androidx.core.view.AccessibilityDelegateCompat Camera2StreamConfigurationMap;
    final androidx.recyclerview.widget.RecyclerView getHighSpeedVideoFpsRanges;
    final androidx.core.view.AccessibilityDelegateCompat getHighSpeedVideoFpsRangesFor;

    public PreferenceRecyclerViewAccessibilityDelegate(androidx.recyclerview.widget.RecyclerView recyclerView) {
        super(recyclerView);
        this.Camera2StreamConfigurationMap = super.getItemDelegate();
        this.getHighSpeedVideoFpsRangesFor = new androidx.core.view.AccessibilityDelegateCompat() { // from class: androidx.preference.PreferenceRecyclerViewAccessibilityDelegate.1
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(android.view.View view, androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                androidx.preference.Preference item;
                androidx.preference.PreferenceRecyclerViewAccessibilityDelegate.this.Camera2StreamConfigurationMap.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                int childAdapterPosition = androidx.preference.PreferenceRecyclerViewAccessibilityDelegate.this.getHighSpeedVideoFpsRanges.getChildAdapterPosition(view);
                androidx.recyclerview.widget.RecyclerView.Adapter adapter = androidx.preference.PreferenceRecyclerViewAccessibilityDelegate.this.getHighSpeedVideoFpsRanges.getAdapter();
                if (!(adapter instanceof androidx.preference.PreferenceGroupAdapter) || (item = ((androidx.preference.PreferenceGroupAdapter) adapter).getItem(childAdapterPosition)) == null) {
                    return;
                }
                item.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoCompat);
            }

            @Override // androidx.core.view.AccessibilityDelegateCompat
            public boolean performAccessibilityAction(android.view.View view, int i, android.os.Bundle bundle) {
                return androidx.preference.PreferenceRecyclerViewAccessibilityDelegate.this.Camera2StreamConfigurationMap.performAccessibilityAction(view, i, bundle);
            }
        };
        this.getHighSpeedVideoFpsRanges = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate
    public androidx.core.view.AccessibilityDelegateCompat getItemDelegate() {
        return this.getHighSpeedVideoFpsRangesFor;
    }
}
