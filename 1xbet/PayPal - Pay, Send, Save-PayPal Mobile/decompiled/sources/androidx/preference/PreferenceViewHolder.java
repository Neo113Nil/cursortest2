package androidx.preference;

/* loaded from: classes7.dex */
public class PreferenceViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    private boolean Camera2StreamConfigurationMap;
    private boolean getHighSpeedVideoFpsRanges;
    private final android.util.SparseArray<android.view.View> getHighSpeedVideoSizes;

    PreferenceViewHolder(android.view.View view) {
        super(view);
        android.util.SparseArray<android.view.View> sparseArray = new android.util.SparseArray<>(4);
        this.getHighSpeedVideoSizes = sparseArray;
        sparseArray.put(android.R.id.title, view.findViewById(android.R.id.title));
        sparseArray.put(android.R.id.summary, view.findViewById(android.R.id.summary));
        sparseArray.put(android.R.id.icon, view.findViewById(android.R.id.icon));
        sparseArray.put(androidx.preference.R.id.icon_frame, view.findViewById(androidx.preference.R.id.icon_frame));
        sparseArray.put(16908350, view.findViewById(16908350));
    }

    public static androidx.preference.PreferenceViewHolder createInstanceForTests(android.view.View view) {
        return new androidx.preference.PreferenceViewHolder(view);
    }

    public android.view.View findViewById(int i) {
        android.view.View view = this.getHighSpeedVideoSizes.get(i);
        if (view != null) {
            return view;
        }
        android.view.View findViewById = this.itemView.findViewById(i);
        if (findViewById != null) {
            this.getHighSpeedVideoSizes.put(i, findViewById);
        }
        return findViewById;
    }

    public boolean isDividerAllowedAbove() {
        return this.Camera2StreamConfigurationMap;
    }

    public void setDividerAllowedAbove(boolean z) {
        this.Camera2StreamConfigurationMap = z;
    }

    public boolean isDividerAllowedBelow() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public void setDividerAllowedBelow(boolean z) {
        this.getHighSpeedVideoFpsRanges = z;
    }
}
