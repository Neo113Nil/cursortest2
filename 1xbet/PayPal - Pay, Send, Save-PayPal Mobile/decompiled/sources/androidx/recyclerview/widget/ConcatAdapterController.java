package androidx.recyclerview.widget;

/* loaded from: classes7.dex */
class ConcatAdapterController implements androidx.recyclerview.widget.NestedAdapterWrapper.Callback {
    final androidx.recyclerview.widget.ConcatAdapter.Config.StableIdMode Camera2StreamConfigurationMap;
    final androidx.recyclerview.widget.ConcatAdapter getHighSpeedVideoFpsRangesFor;
    private final androidx.recyclerview.widget.StableIdStorage getHighSpeedVideoSizesFor;
    final androidx.recyclerview.widget.ViewTypeStorage getInputSizeshNQ4ISI;
    java.util.List<java.lang.ref.WeakReference<androidx.recyclerview.widget.RecyclerView>> getHighSpeedVideoSizes = new java.util.ArrayList();
    final java.util.IdentityHashMap<androidx.recyclerview.widget.RecyclerView.ViewHolder, androidx.recyclerview.widget.NestedAdapterWrapper> getHighResolutionOutputSizeshNQ4ISI = new java.util.IdentityHashMap<>();
    java.util.List<androidx.recyclerview.widget.NestedAdapterWrapper> getInputFormats = new java.util.ArrayList();
    androidx.recyclerview.widget.ConcatAdapterController.WrapperAndLocalPosition getHighSpeedVideoFpsRanges = new androidx.recyclerview.widget.ConcatAdapterController.WrapperAndLocalPosition();

    ConcatAdapterController(androidx.recyclerview.widget.ConcatAdapter concatAdapter, androidx.recyclerview.widget.ConcatAdapter.Config config) {
        this.getHighSpeedVideoFpsRangesFor = concatAdapter;
        if (config.isolateViewTypes) {
            this.getInputSizeshNQ4ISI = new androidx.recyclerview.widget.ViewTypeStorage.IsolatedViewTypeStorage();
        } else {
            this.getInputSizeshNQ4ISI = new androidx.recyclerview.widget.ViewTypeStorage.SharedIdRangeViewTypeStorage();
        }
        this.Camera2StreamConfigurationMap = config.stableIdMode;
        if (config.stableIdMode == androidx.recyclerview.widget.ConcatAdapter.Config.StableIdMode.NO_STABLE_IDS) {
            this.getHighSpeedVideoSizesFor = new androidx.recyclerview.widget.StableIdStorage.NoStableIdStorage();
        } else if (config.stableIdMode == androidx.recyclerview.widget.ConcatAdapter.Config.StableIdMode.ISOLATED_STABLE_IDS) {
            this.getHighSpeedVideoSizesFor = new androidx.recyclerview.widget.StableIdStorage.IsolatedStableIdStorage();
        } else {
            if (config.stableIdMode == androidx.recyclerview.widget.ConcatAdapter.Config.StableIdMode.SHARED_STABLE_IDS) {
                this.getHighSpeedVideoSizesFor = new androidx.recyclerview.widget.StableIdStorage.SharedPoolStableIdStorage();
                return;
            }
            throw new java.lang.IllegalArgumentException("unknown stable id mode");
        }
    }

    final int Camera2StreamConfigurationMap(androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> adapter) {
        int size = this.getInputFormats.size();
        for (int i = 0; i < size; i++) {
            if (this.getInputFormats.get(i).getHighSpeedVideoFpsRangesFor == adapter) {
                return i;
            }
        }
        return -1;
    }

    final boolean getHighSpeedVideoFpsRangesFor(int i, androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> adapter) {
        if (i < 0 || i > this.getInputFormats.size()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Index must be between 0 and ");
            sb.append(this.getInputFormats.size());
            sb.append(". Given:");
            sb.append(i);
            throw new java.lang.IndexOutOfBoundsException(sb.toString());
        }
        if (this.Camera2StreamConfigurationMap != androidx.recyclerview.widget.ConcatAdapter.Config.StableIdMode.NO_STABLE_IDS) {
            androidx.core.util.Preconditions.checkArgument(adapter.hasStableIds(), "All sub adapters must have stable ids when stable id mode is ISOLATED_STABLE_IDS or SHARED_STABLE_IDS");
        } else {
            adapter.hasStableIds();
        }
        int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(adapter);
        if ((Camera2StreamConfigurationMap == -1 ? null : this.getInputFormats.get(Camera2StreamConfigurationMap)) != null) {
            return false;
        }
        androidx.recyclerview.widget.NestedAdapterWrapper nestedAdapterWrapper = new androidx.recyclerview.widget.NestedAdapterWrapper(adapter, this, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoSizesFor.createStableIdLookup());
        this.getInputFormats.add(i, nestedAdapterWrapper);
        java.util.Iterator<java.lang.ref.WeakReference<androidx.recyclerview.widget.RecyclerView>> it = this.getHighSpeedVideoSizes.iterator();
        while (it.hasNext()) {
            androidx.recyclerview.widget.RecyclerView recyclerView = it.next().get();
            if (recyclerView != null) {
                adapter.onAttachedToRecyclerView(recyclerView);
            }
        }
        if (nestedAdapterWrapper.getHighResolutionOutputSizeshNQ4ISI > 0) {
            this.getHighSpeedVideoFpsRangesFor.notifyItemRangeInserted(getHighResolutionOutputSizeshNQ4ISI(nestedAdapterWrapper), nestedAdapterWrapper.getHighResolutionOutputSizeshNQ4ISI);
        }
        androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
        if (highSpeedVideoFpsRanges == this.getHighSpeedVideoFpsRangesFor.getStateRestorationPolicy()) {
            return true;
        }
        this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges(highSpeedVideoFpsRanges);
        return true;
    }

    final int getHighResolutionOutputSizeshNQ4ISI(androidx.recyclerview.widget.NestedAdapterWrapper nestedAdapterWrapper) {
        androidx.recyclerview.widget.NestedAdapterWrapper next;
        java.util.Iterator<androidx.recyclerview.widget.NestedAdapterWrapper> it = this.getInputFormats.iterator();
        int i = 0;
        while (it.hasNext() && (next = it.next()) != nestedAdapterWrapper) {
            i += next.getHighResolutionOutputSizeshNQ4ISI;
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.NestedAdapterWrapper.Callback
    public final void getHighSpeedVideoSizes() {
        this.getHighSpeedVideoFpsRangesFor.notifyDataSetChanged();
        androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
        if (highSpeedVideoFpsRanges != this.getHighSpeedVideoFpsRangesFor.getStateRestorationPolicy()) {
            this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges(highSpeedVideoFpsRanges);
        }
    }

    @Override // androidx.recyclerview.widget.NestedAdapterWrapper.Callback
    public final void getHighSpeedVideoFpsRangesFor(androidx.recyclerview.widget.NestedAdapterWrapper nestedAdapterWrapper, int i, int i2, java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor.notifyItemRangeChanged(i + getHighResolutionOutputSizeshNQ4ISI(nestedAdapterWrapper), i2, obj);
    }

    @Override // androidx.recyclerview.widget.NestedAdapterWrapper.Callback
    public final void getHighSpeedVideoFpsRanges(androidx.recyclerview.widget.NestedAdapterWrapper nestedAdapterWrapper, int i, int i2) {
        this.getHighSpeedVideoFpsRangesFor.notifyItemRangeInserted(i + getHighResolutionOutputSizeshNQ4ISI(nestedAdapterWrapper), i2);
    }

    @Override // androidx.recyclerview.widget.NestedAdapterWrapper.Callback
    public final void getHighSpeedVideoSizes(androidx.recyclerview.widget.NestedAdapterWrapper nestedAdapterWrapper, int i, int i2) {
        this.getHighSpeedVideoFpsRangesFor.notifyItemRangeRemoved(i + getHighResolutionOutputSizeshNQ4ISI(nestedAdapterWrapper), i2);
    }

    @Override // androidx.recyclerview.widget.NestedAdapterWrapper.Callback
    public final void getHighResolutionOutputSizeshNQ4ISI(androidx.recyclerview.widget.NestedAdapterWrapper nestedAdapterWrapper, int i, int i2) {
        int highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(nestedAdapterWrapper);
        this.getHighSpeedVideoFpsRangesFor.notifyItemMoved(i + highResolutionOutputSizeshNQ4ISI, i2 + highResolutionOutputSizeshNQ4ISI);
    }

    final androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy getHighSpeedVideoFpsRanges() {
        for (androidx.recyclerview.widget.NestedAdapterWrapper nestedAdapterWrapper : this.getInputFormats) {
            androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicy = nestedAdapterWrapper.getHighSpeedVideoFpsRangesFor.getStateRestorationPolicy();
            if (stateRestorationPolicy == androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.PREVENT) {
                return androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.PREVENT;
            }
            if (stateRestorationPolicy == androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY && nestedAdapterWrapper.getHighResolutionOutputSizeshNQ4ISI == 0) {
                return androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.PREVENT;
            }
        }
        return androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.ALLOW;
    }

    final androidx.recyclerview.widget.ConcatAdapterController.WrapperAndLocalPosition getHighSpeedVideoFpsRanges(int i) {
        androidx.recyclerview.widget.ConcatAdapterController.WrapperAndLocalPosition wrapperAndLocalPosition;
        if (this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges) {
            wrapperAndLocalPosition = new androidx.recyclerview.widget.ConcatAdapterController.WrapperAndLocalPosition();
        } else {
            this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges = true;
            wrapperAndLocalPosition = this.getHighSpeedVideoFpsRanges;
        }
        java.util.Iterator<androidx.recyclerview.widget.NestedAdapterWrapper> it = this.getInputFormats.iterator();
        int i2 = i;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            androidx.recyclerview.widget.NestedAdapterWrapper next = it.next();
            if (next.getHighResolutionOutputSizeshNQ4ISI > i2) {
                wrapperAndLocalPosition.getHighSpeedVideoSizes = next;
                wrapperAndLocalPosition.getHighResolutionOutputSizeshNQ4ISI = i2;
                break;
            }
            i2 -= next.getHighResolutionOutputSizeshNQ4ISI;
        }
        if (wrapperAndLocalPosition.getHighSpeedVideoSizes != null) {
            return wrapperAndLocalPosition;
        }
        throw new java.lang.IllegalArgumentException("Cannot find wrapper for ".concat(java.lang.String.valueOf(i)));
    }

    final androidx.recyclerview.widget.NestedAdapterWrapper getHighSpeedVideoSizes(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        androidx.recyclerview.widget.NestedAdapterWrapper nestedAdapterWrapper = this.getHighResolutionOutputSizeshNQ4ISI.get(viewHolder);
        if (nestedAdapterWrapper != null) {
            return nestedAdapterWrapper;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot find wrapper for ");
        sb.append(viewHolder);
        sb.append(", seems like it is not bound by this adapter: ");
        sb.append(this);
        throw new java.lang.IllegalStateException(sb.toString());
    }

    static class WrapperAndLocalPosition {
        int getHighResolutionOutputSizeshNQ4ISI;
        boolean getHighSpeedVideoFpsRanges;
        androidx.recyclerview.widget.NestedAdapterWrapper getHighSpeedVideoSizes;

        WrapperAndLocalPosition() {
        }
    }

    @Override // androidx.recyclerview.widget.NestedAdapterWrapper.Callback
    public final void Camera2StreamConfigurationMap() {
        androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
        if (highSpeedVideoFpsRanges != this.getHighSpeedVideoFpsRangesFor.getStateRestorationPolicy()) {
            this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges(highSpeedVideoFpsRanges);
        }
    }
}
