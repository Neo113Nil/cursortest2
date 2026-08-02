package androidx.recyclerview.widget;

/* loaded from: classes7.dex */
class NestedAdapterWrapper {
    androidx.recyclerview.widget.RecyclerView.AdapterDataObserver Camera2StreamConfigurationMap = new androidx.recyclerview.widget.RecyclerView.AdapterDataObserver() { // from class: androidx.recyclerview.widget.NestedAdapterWrapper.1
        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            androidx.recyclerview.widget.NestedAdapterWrapper nestedAdapterWrapper = androidx.recyclerview.widget.NestedAdapterWrapper.this;
            nestedAdapterWrapper.getHighResolutionOutputSizeshNQ4ISI = nestedAdapterWrapper.getHighSpeedVideoFpsRangesFor.getItemCount();
            androidx.recyclerview.widget.NestedAdapterWrapper.this.getHighSpeedVideoSizes.getHighSpeedVideoSizes();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2) {
            androidx.recyclerview.widget.NestedAdapterWrapper.this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor(androidx.recyclerview.widget.NestedAdapterWrapper.this, i, i2, null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2, java.lang.Object obj) {
            androidx.recyclerview.widget.NestedAdapterWrapper.this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor(androidx.recyclerview.widget.NestedAdapterWrapper.this, i, i2, obj);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i, int i2) {
            androidx.recyclerview.widget.NestedAdapterWrapper.this.getHighResolutionOutputSizeshNQ4ISI += i2;
            androidx.recyclerview.widget.NestedAdapterWrapper.this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges(androidx.recyclerview.widget.NestedAdapterWrapper.this, i, i2);
            if (androidx.recyclerview.widget.NestedAdapterWrapper.this.getHighResolutionOutputSizeshNQ4ISI <= 0 || androidx.recyclerview.widget.NestedAdapterWrapper.this.getHighSpeedVideoFpsRangesFor.getStateRestorationPolicy() != androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY) {
                return;
            }
            androidx.recyclerview.widget.NestedAdapterWrapper.this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i, int i2) {
            androidx.recyclerview.widget.NestedAdapterWrapper.this.getHighResolutionOutputSizeshNQ4ISI -= i2;
            androidx.recyclerview.widget.NestedAdapterWrapper.this.getHighSpeedVideoSizes.getHighSpeedVideoSizes(androidx.recyclerview.widget.NestedAdapterWrapper.this, i, i2);
            if (androidx.recyclerview.widget.NestedAdapterWrapper.this.getHighResolutionOutputSizeshNQ4ISI > 0 || androidx.recyclerview.widget.NestedAdapterWrapper.this.getHighSpeedVideoFpsRangesFor.getStateRestorationPolicy() != androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY) {
                return;
            }
            androidx.recyclerview.widget.NestedAdapterWrapper.this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i, int i2, int i3) {
            androidx.core.util.Preconditions.checkArgument(i3 == 1, "moving more than 1 item is not supported in RecyclerView");
            androidx.recyclerview.widget.NestedAdapterWrapper.this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI(androidx.recyclerview.widget.NestedAdapterWrapper.this, i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onStateRestorationPolicyChanged() {
            androidx.recyclerview.widget.NestedAdapterWrapper.this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap();
        }
    };
    int getHighResolutionOutputSizeshNQ4ISI;
    final androidx.recyclerview.widget.StableIdStorage.StableIdLookup getHighSpeedVideoFpsRanges;
    public final androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> getHighSpeedVideoFpsRangesFor;
    final androidx.recyclerview.widget.NestedAdapterWrapper.Callback getHighSpeedVideoSizes;
    final androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup getInputSizeshNQ4ISI;

    interface Callback {
        void Camera2StreamConfigurationMap();

        void getHighResolutionOutputSizeshNQ4ISI(androidx.recyclerview.widget.NestedAdapterWrapper nestedAdapterWrapper, int i, int i2);

        void getHighSpeedVideoFpsRanges(androidx.recyclerview.widget.NestedAdapterWrapper nestedAdapterWrapper, int i, int i2);

        void getHighSpeedVideoFpsRangesFor(androidx.recyclerview.widget.NestedAdapterWrapper nestedAdapterWrapper, int i, int i2, java.lang.Object obj);

        void getHighSpeedVideoSizes();

        void getHighSpeedVideoSizes(androidx.recyclerview.widget.NestedAdapterWrapper nestedAdapterWrapper, int i, int i2);
    }

    NestedAdapterWrapper(androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> adapter, androidx.recyclerview.widget.NestedAdapterWrapper.Callback callback, androidx.recyclerview.widget.ViewTypeStorage viewTypeStorage, androidx.recyclerview.widget.StableIdStorage.StableIdLookup stableIdLookup) {
        this.getHighSpeedVideoFpsRangesFor = adapter;
        this.getHighSpeedVideoSizes = callback;
        this.getInputSizeshNQ4ISI = viewTypeStorage.createViewTypeWrapper(this);
        this.getHighSpeedVideoFpsRanges = stableIdLookup;
        this.getHighResolutionOutputSizeshNQ4ISI = adapter.getItemCount();
        adapter.registerAdapterDataObserver(this.Camera2StreamConfigurationMap);
    }
}
