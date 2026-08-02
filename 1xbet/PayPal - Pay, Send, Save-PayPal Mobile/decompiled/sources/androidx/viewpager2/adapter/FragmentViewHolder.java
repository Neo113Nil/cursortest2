package androidx.viewpager2.adapter;

/* loaded from: classes7.dex */
public final class FragmentViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    private FragmentViewHolder(android.widget.FrameLayout frameLayout) {
        super(frameLayout);
    }

    static androidx.viewpager2.adapter.FragmentViewHolder getHighSpeedVideoFpsRangesFor(android.view.ViewGroup viewGroup) {
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(android.view.View.generateViewId());
        frameLayout.setSaveEnabled(false);
        return new androidx.viewpager2.adapter.FragmentViewHolder(frameLayout);
    }
}
