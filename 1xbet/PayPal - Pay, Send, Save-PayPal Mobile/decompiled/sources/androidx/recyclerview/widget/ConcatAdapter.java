package androidx.recyclerview.widget;

/* loaded from: classes.dex */
public final class ConcatAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private final androidx.recyclerview.widget.ConcatAdapterController Camera2StreamConfigurationMap;

    @java.lang.SafeVarargs
    public ConcatAdapter(androidx.recyclerview.widget.RecyclerView.Adapter<? extends androidx.recyclerview.widget.RecyclerView.ViewHolder>... adapterArr) {
        this(androidx.recyclerview.widget.ConcatAdapter.Config.DEFAULT, adapterArr);
    }

    @java.lang.SafeVarargs
    public ConcatAdapter(androidx.recyclerview.widget.ConcatAdapter.Config config, androidx.recyclerview.widget.RecyclerView.Adapter<? extends androidx.recyclerview.widget.RecyclerView.ViewHolder>... adapterArr) {
        this(config, (java.util.List<? extends androidx.recyclerview.widget.RecyclerView.Adapter<? extends androidx.recyclerview.widget.RecyclerView.ViewHolder>>) java.util.Arrays.asList(adapterArr));
    }

    public ConcatAdapter(java.util.List<? extends androidx.recyclerview.widget.RecyclerView.Adapter<? extends androidx.recyclerview.widget.RecyclerView.ViewHolder>> list) {
        this(androidx.recyclerview.widget.ConcatAdapter.Config.DEFAULT, list);
    }

    public ConcatAdapter(androidx.recyclerview.widget.ConcatAdapter.Config config, java.util.List<? extends androidx.recyclerview.widget.RecyclerView.Adapter<? extends androidx.recyclerview.widget.RecyclerView.ViewHolder>> list) {
        this.Camera2StreamConfigurationMap = new androidx.recyclerview.widget.ConcatAdapterController(this, config);
        java.util.Iterator<? extends androidx.recyclerview.widget.RecyclerView.Adapter<? extends androidx.recyclerview.widget.RecyclerView.ViewHolder>> it = list.iterator();
        while (it.hasNext()) {
            addAdapter(it.next());
        }
        super.setHasStableIds(this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap != androidx.recyclerview.widget.ConcatAdapter.Config.StableIdMode.NO_STABLE_IDS);
    }

    public final boolean addAdapter(androidx.recyclerview.widget.RecyclerView.Adapter<? extends androidx.recyclerview.widget.RecyclerView.ViewHolder> adapter) {
        androidx.recyclerview.widget.ConcatAdapterController concatAdapterController = this.Camera2StreamConfigurationMap;
        return concatAdapterController.getHighSpeedVideoFpsRangesFor(concatAdapterController.getInputFormats.size(), adapter);
    }

    public final boolean addAdapter(int i, androidx.recyclerview.widget.RecyclerView.Adapter<? extends androidx.recyclerview.widget.RecyclerView.ViewHolder> adapter) {
        return this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(i, adapter);
    }

    public final boolean removeAdapter(androidx.recyclerview.widget.RecyclerView.Adapter<? extends androidx.recyclerview.widget.RecyclerView.ViewHolder> adapter) {
        androidx.recyclerview.widget.ConcatAdapterController concatAdapterController = this.Camera2StreamConfigurationMap;
        int Camera2StreamConfigurationMap = concatAdapterController.Camera2StreamConfigurationMap(adapter);
        if (Camera2StreamConfigurationMap == -1) {
            return false;
        }
        androidx.recyclerview.widget.NestedAdapterWrapper nestedAdapterWrapper = concatAdapterController.getInputFormats.get(Camera2StreamConfigurationMap);
        int highResolutionOutputSizeshNQ4ISI = concatAdapterController.getHighResolutionOutputSizeshNQ4ISI(nestedAdapterWrapper);
        concatAdapterController.getInputFormats.remove(Camera2StreamConfigurationMap);
        concatAdapterController.getHighSpeedVideoFpsRangesFor.notifyItemRangeRemoved(highResolutionOutputSizeshNQ4ISI, nestedAdapterWrapper.getHighResolutionOutputSizeshNQ4ISI);
        java.util.Iterator<java.lang.ref.WeakReference<androidx.recyclerview.widget.RecyclerView>> it = concatAdapterController.getHighSpeedVideoSizes.iterator();
        while (it.hasNext()) {
            androidx.recyclerview.widget.RecyclerView recyclerView = it.next().get();
            if (recyclerView != null) {
                adapter.onDetachedFromRecyclerView(recyclerView);
            }
        }
        nestedAdapterWrapper.getHighSpeedVideoFpsRangesFor.unregisterAdapterDataObserver(nestedAdapterWrapper.Camera2StreamConfigurationMap);
        nestedAdapterWrapper.getInputSizeshNQ4ISI.dispose();
        androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy highSpeedVideoFpsRanges = concatAdapterController.getHighSpeedVideoFpsRanges();
        if (highSpeedVideoFpsRanges == concatAdapterController.getHighSpeedVideoFpsRangesFor.getStateRestorationPolicy()) {
            return true;
        }
        super.setStateRestorationPolicy(highSpeedVideoFpsRanges);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        androidx.recyclerview.widget.ConcatAdapterController concatAdapterController = this.Camera2StreamConfigurationMap;
        androidx.recyclerview.widget.ConcatAdapterController.WrapperAndLocalPosition highSpeedVideoFpsRanges = concatAdapterController.getHighSpeedVideoFpsRanges(i);
        androidx.recyclerview.widget.NestedAdapterWrapper nestedAdapterWrapper = highSpeedVideoFpsRanges.getHighSpeedVideoSizes;
        int localToGlobal = nestedAdapterWrapper.getInputSizeshNQ4ISI.localToGlobal(nestedAdapterWrapper.getHighSpeedVideoFpsRangesFor.getItemViewType(highSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI));
        highSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges = false;
        highSpeedVideoFpsRanges.getHighSpeedVideoSizes = null;
        highSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI = -1;
        concatAdapterController.getHighSpeedVideoFpsRanges = highSpeedVideoFpsRanges;
        return localToGlobal;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup viewGroup, int i) {
        androidx.recyclerview.widget.NestedAdapterWrapper wrapperForGlobalType = this.Camera2StreamConfigurationMap.getInputSizeshNQ4ISI.getWrapperForGlobalType(i);
        return wrapperForGlobalType.getHighSpeedVideoFpsRangesFor.onCreateViewHolder(viewGroup, wrapperForGlobalType.getInputSizeshNQ4ISI.globalToLocal(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int i) {
        androidx.recyclerview.widget.ConcatAdapterController concatAdapterController = this.Camera2StreamConfigurationMap;
        androidx.recyclerview.widget.ConcatAdapterController.WrapperAndLocalPosition highSpeedVideoFpsRanges = concatAdapterController.getHighSpeedVideoFpsRanges(i);
        concatAdapterController.getHighResolutionOutputSizeshNQ4ISI.put(viewHolder, highSpeedVideoFpsRanges.getHighSpeedVideoSizes);
        androidx.recyclerview.widget.NestedAdapterWrapper nestedAdapterWrapper = highSpeedVideoFpsRanges.getHighSpeedVideoSizes;
        nestedAdapterWrapper.getHighSpeedVideoFpsRangesFor.bindViewHolder(viewHolder, highSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI);
        highSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges = false;
        highSpeedVideoFpsRanges.getHighSpeedVideoSizes = null;
        highSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI = -1;
        concatAdapterController.getHighSpeedVideoFpsRanges = highSpeedVideoFpsRanges;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void setHasStableIds(boolean z) {
        throw new java.lang.UnsupportedOperationException("Calling setHasStableIds is not allowed on the ConcatAdapter. Use the Config object passed in the constructor to control this behavior");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void setStateRestorationPolicy(androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicy) {
        throw new java.lang.UnsupportedOperationException("Calling setStateRestorationPolicy is not allowed on the ConcatAdapter. This value is inferred from added adapters");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        androidx.recyclerview.widget.ConcatAdapterController concatAdapterController = this.Camera2StreamConfigurationMap;
        androidx.recyclerview.widget.ConcatAdapterController.WrapperAndLocalPosition highSpeedVideoFpsRanges = concatAdapterController.getHighSpeedVideoFpsRanges(i);
        androidx.recyclerview.widget.NestedAdapterWrapper nestedAdapterWrapper = highSpeedVideoFpsRanges.getHighSpeedVideoSizes;
        long localToGlobal = nestedAdapterWrapper.getHighSpeedVideoFpsRanges.localToGlobal(nestedAdapterWrapper.getHighSpeedVideoFpsRangesFor.getItemId(highSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI));
        highSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges = false;
        highSpeedVideoFpsRanges.getHighSpeedVideoSizes = null;
        highSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI = -1;
        concatAdapterController.getHighSpeedVideoFpsRanges = highSpeedVideoFpsRanges;
        return localToGlobal;
    }

    final void getHighSpeedVideoFpsRanges(androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicy) {
        super.setStateRestorationPolicy(stateRestorationPolicy);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        java.util.Iterator<androidx.recyclerview.widget.NestedAdapterWrapper> it = this.Camera2StreamConfigurationMap.getInputFormats.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().getHighResolutionOutputSizeshNQ4ISI;
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final boolean onFailedToRecycleView(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        androidx.recyclerview.widget.ConcatAdapterController concatAdapterController = this.Camera2StreamConfigurationMap;
        androidx.recyclerview.widget.NestedAdapterWrapper nestedAdapterWrapper = concatAdapterController.getHighResolutionOutputSizeshNQ4ISI.get(viewHolder);
        if (nestedAdapterWrapper == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot find wrapper for ");
            sb.append(viewHolder);
            sb.append(", seems like it is not bound by this adapter: ");
            sb.append(concatAdapterController);
            throw new java.lang.IllegalStateException(sb.toString());
        }
        boolean onFailedToRecycleView = nestedAdapterWrapper.getHighSpeedVideoFpsRangesFor.onFailedToRecycleView(viewHolder);
        concatAdapterController.getHighResolutionOutputSizeshNQ4ISI.remove(viewHolder);
        return onFailedToRecycleView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes(viewHolder).getHighSpeedVideoFpsRangesFor.onViewAttachedToWindow(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes(viewHolder).getHighSpeedVideoFpsRangesFor.onViewDetachedFromWindow(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        androidx.recyclerview.widget.ConcatAdapterController concatAdapterController = this.Camera2StreamConfigurationMap;
        androidx.recyclerview.widget.NestedAdapterWrapper nestedAdapterWrapper = concatAdapterController.getHighResolutionOutputSizeshNQ4ISI.get(viewHolder);
        if (nestedAdapterWrapper == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot find wrapper for ");
            sb.append(viewHolder);
            sb.append(", seems like it is not bound by this adapter: ");
            sb.append(concatAdapterController);
            throw new java.lang.IllegalStateException(sb.toString());
        }
        nestedAdapterWrapper.getHighSpeedVideoFpsRangesFor.onViewRecycled(viewHolder);
        concatAdapterController.getHighResolutionOutputSizeshNQ4ISI.remove(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onAttachedToRecyclerView(androidx.recyclerview.widget.RecyclerView recyclerView) {
        androidx.recyclerview.widget.ConcatAdapterController concatAdapterController = this.Camera2StreamConfigurationMap;
        java.util.Iterator<java.lang.ref.WeakReference<androidx.recyclerview.widget.RecyclerView>> it = concatAdapterController.getHighSpeedVideoSizes.iterator();
        while (it.hasNext()) {
            if (it.next().get() == recyclerView) {
                return;
            }
        }
        concatAdapterController.getHighSpeedVideoSizes.add(new java.lang.ref.WeakReference<>(recyclerView));
        java.util.Iterator<androidx.recyclerview.widget.NestedAdapterWrapper> it2 = concatAdapterController.getInputFormats.iterator();
        while (it2.hasNext()) {
            it2.next().getHighSpeedVideoFpsRangesFor.onAttachedToRecyclerView(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onDetachedFromRecyclerView(androidx.recyclerview.widget.RecyclerView recyclerView) {
        androidx.recyclerview.widget.ConcatAdapterController concatAdapterController = this.Camera2StreamConfigurationMap;
        int size = concatAdapterController.getHighSpeedVideoSizes.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            java.lang.ref.WeakReference<androidx.recyclerview.widget.RecyclerView> weakReference = concatAdapterController.getHighSpeedVideoSizes.get(size);
            if (weakReference.get() == null) {
                concatAdapterController.getHighSpeedVideoSizes.remove(size);
            } else if (weakReference.get() == recyclerView) {
                concatAdapterController.getHighSpeedVideoSizes.remove(size);
                break;
            }
            size--;
        }
        java.util.Iterator<androidx.recyclerview.widget.NestedAdapterWrapper> it = concatAdapterController.getInputFormats.iterator();
        while (it.hasNext()) {
            it.next().getHighSpeedVideoFpsRangesFor.onDetachedFromRecyclerView(recyclerView);
        }
    }

    public final java.util.List<? extends androidx.recyclerview.widget.RecyclerView.Adapter<? extends androidx.recyclerview.widget.RecyclerView.ViewHolder>> getAdapters() {
        java.util.List list;
        androidx.recyclerview.widget.ConcatAdapterController concatAdapterController = this.Camera2StreamConfigurationMap;
        if (concatAdapterController.getInputFormats.isEmpty()) {
            list = java.util.Collections.emptyList();
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList(concatAdapterController.getInputFormats.size());
            java.util.Iterator<androidx.recyclerview.widget.NestedAdapterWrapper> it = concatAdapterController.getInputFormats.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getHighSpeedVideoFpsRangesFor);
            }
            list = arrayList;
        }
        return java.util.Collections.unmodifiableList(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int findRelativeAdapterPositionIn(androidx.recyclerview.widget.RecyclerView.Adapter<? extends androidx.recyclerview.widget.RecyclerView.ViewHolder> adapter, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int i) {
        androidx.recyclerview.widget.ConcatAdapterController concatAdapterController = this.Camera2StreamConfigurationMap;
        androidx.recyclerview.widget.NestedAdapterWrapper nestedAdapterWrapper = concatAdapterController.getHighResolutionOutputSizeshNQ4ISI.get(viewHolder);
        if (nestedAdapterWrapper == null) {
            return -1;
        }
        int highResolutionOutputSizeshNQ4ISI = i - concatAdapterController.getHighResolutionOutputSizeshNQ4ISI(nestedAdapterWrapper);
        int itemCount = nestedAdapterWrapper.getHighSpeedVideoFpsRangesFor.getItemCount();
        if (highResolutionOutputSizeshNQ4ISI < 0 || highResolutionOutputSizeshNQ4ISI >= itemCount) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Detected inconsistent adapter updates. The local position of the view holder maps to ");
            sb.append(highResolutionOutputSizeshNQ4ISI);
            sb.append(" which is out of bounds for the adapter with size ");
            sb.append(itemCount);
            sb.append(".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:");
            sb.append(viewHolder);
            sb.append("adapter:");
            sb.append(adapter);
            throw new java.lang.IllegalStateException(sb.toString());
        }
        return nestedAdapterWrapper.getHighSpeedVideoFpsRangesFor.findRelativeAdapterPositionIn(adapter, viewHolder, highResolutionOutputSizeshNQ4ISI);
    }

    public final android.util.Pair<androidx.recyclerview.widget.RecyclerView.Adapter<? extends androidx.recyclerview.widget.RecyclerView.ViewHolder>, java.lang.Integer> getWrappedAdapterAndPosition(int i) {
        androidx.recyclerview.widget.ConcatAdapterController concatAdapterController = this.Camera2StreamConfigurationMap;
        androidx.recyclerview.widget.ConcatAdapterController.WrapperAndLocalPosition highSpeedVideoFpsRanges = concatAdapterController.getHighSpeedVideoFpsRanges(i);
        android.util.Pair<androidx.recyclerview.widget.RecyclerView.Adapter<? extends androidx.recyclerview.widget.RecyclerView.ViewHolder>, java.lang.Integer> pair = new android.util.Pair<>(highSpeedVideoFpsRanges.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor, java.lang.Integer.valueOf(highSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI));
        highSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges = false;
        highSpeedVideoFpsRanges.getHighSpeedVideoSizes = null;
        highSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI = -1;
        concatAdapterController.getHighSpeedVideoFpsRanges = highSpeedVideoFpsRanges;
        return pair;
    }

    /* loaded from: classes7.dex */
    public static final class Config {
        public static final androidx.recyclerview.widget.ConcatAdapter.Config DEFAULT = new androidx.recyclerview.widget.ConcatAdapter.Config(true, androidx.recyclerview.widget.ConcatAdapter.Config.StableIdMode.NO_STABLE_IDS);
        public final boolean isolateViewTypes;
        public final androidx.recyclerview.widget.ConcatAdapter.Config.StableIdMode stableIdMode;

        public enum StableIdMode {
            NO_STABLE_IDS,
            ISOLATED_STABLE_IDS,
            SHARED_STABLE_IDS
        }

        Config(boolean z, androidx.recyclerview.widget.ConcatAdapter.Config.StableIdMode stableIdMode) {
            this.isolateViewTypes = z;
            this.stableIdMode = stableIdMode;
        }

        public static final class Builder {
            private boolean getHighSpeedVideoFpsRanges = androidx.recyclerview.widget.ConcatAdapter.Config.DEFAULT.isolateViewTypes;
            private androidx.recyclerview.widget.ConcatAdapter.Config.StableIdMode Camera2StreamConfigurationMap = androidx.recyclerview.widget.ConcatAdapter.Config.DEFAULT.stableIdMode;

            public final androidx.recyclerview.widget.ConcatAdapter.Config.Builder setIsolateViewTypes(boolean z) {
                this.getHighSpeedVideoFpsRanges = z;
                return this;
            }

            public final androidx.recyclerview.widget.ConcatAdapter.Config.Builder setStableIdMode(androidx.recyclerview.widget.ConcatAdapter.Config.StableIdMode stableIdMode) {
                this.Camera2StreamConfigurationMap = stableIdMode;
                return this;
            }

            public final androidx.recyclerview.widget.ConcatAdapter.Config build() {
                return new androidx.recyclerview.widget.ConcatAdapter.Config(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap);
            }
        }
    }
}
