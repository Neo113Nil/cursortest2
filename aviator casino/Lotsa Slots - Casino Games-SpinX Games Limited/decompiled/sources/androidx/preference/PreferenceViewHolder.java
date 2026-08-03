package androidx.preference;

/* loaded from: classes2.dex */
public class PreferenceViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    private final android.util.SparseArray<android.view.View> mCachedViews;
    private boolean mDividerAllowedAbove;
    private boolean mDividerAllowedBelow;

    PreferenceViewHolder(android.view.View view) {
        super(view);
        android.util.SparseArray<android.view.View> sparseArray = new android.util.SparseArray<>(4);
        this.mCachedViews = sparseArray;
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
        android.view.View view = this.mCachedViews.get(i);
        if (view != null) {
            return view;
        }
        android.view.View findViewById = this.itemView.findViewById(i);
        if (findViewById != null) {
            this.mCachedViews.put(i, findViewById);
        }
        return findViewById;
    }

    public boolean isDividerAllowedAbove() {
        return this.mDividerAllowedAbove;
    }

    public void setDividerAllowedAbove(boolean z) {
        this.mDividerAllowedAbove = z;
    }

    public boolean isDividerAllowedBelow() {
        return this.mDividerAllowedBelow;
    }

    public void setDividerAllowedBelow(boolean z) {
        this.mDividerAllowedBelow = z;
    }
}
