package androidx.recyclerview.widget;

/* loaded from: classes.dex */
public final class AdapterListUpdateCallback implements androidx.recyclerview.widget.ListUpdateCallback {
    private final androidx.recyclerview.widget.RecyclerView.Adapter getHighSpeedVideoFpsRanges;

    public AdapterListUpdateCallback(androidx.recyclerview.widget.RecyclerView.Adapter adapter) {
        this.getHighSpeedVideoFpsRanges = adapter;
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public final void onInserted(int i, int i2) {
        this.getHighSpeedVideoFpsRanges.notifyItemRangeInserted(i, i2);
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public final void onRemoved(int i, int i2) {
        this.getHighSpeedVideoFpsRanges.notifyItemRangeRemoved(i, i2);
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public final void onMoved(int i, int i2) {
        this.getHighSpeedVideoFpsRanges.notifyItemMoved(i, i2);
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public final void onChanged(int i, int i2, java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges.notifyItemRangeChanged(i, i2, obj);
    }
}
