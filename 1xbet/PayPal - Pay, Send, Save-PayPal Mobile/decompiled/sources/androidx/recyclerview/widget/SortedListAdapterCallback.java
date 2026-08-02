package androidx.recyclerview.widget;

/* loaded from: classes7.dex */
public abstract class SortedListAdapterCallback<T2> extends androidx.recyclerview.widget.SortedList.Callback<T2> {
    final androidx.recyclerview.widget.RecyclerView.Adapter<?> getHighResolutionOutputSizeshNQ4ISI;

    public SortedListAdapterCallback(androidx.recyclerview.widget.RecyclerView.Adapter<?> adapter) {
        this.getHighResolutionOutputSizeshNQ4ISI = adapter;
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onInserted(int i, int i2) {
        this.getHighResolutionOutputSizeshNQ4ISI.notifyItemRangeInserted(i, i2);
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onRemoved(int i, int i2) {
        this.getHighResolutionOutputSizeshNQ4ISI.notifyItemRangeRemoved(i, i2);
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onMoved(int i, int i2) {
        this.getHighResolutionOutputSizeshNQ4ISI.notifyItemMoved(i, i2);
    }

    @Override // androidx.recyclerview.widget.SortedList.Callback
    public void onChanged(int i, int i2) {
        this.getHighResolutionOutputSizeshNQ4ISI.notifyItemRangeChanged(i, i2);
    }

    @Override // androidx.recyclerview.widget.SortedList.Callback, androidx.recyclerview.widget.ListUpdateCallback
    public void onChanged(int i, int i2, java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI.notifyItemRangeChanged(i, i2, obj);
    }
}
