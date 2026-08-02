package androidx.recyclerview.widget;

/* loaded from: classes7.dex */
final class GapWorker implements java.lang.Runnable {
    static final java.lang.ThreadLocal<androidx.recyclerview.widget.GapWorker> Camera2StreamConfigurationMap = new java.lang.ThreadLocal<>();
    static java.util.Comparator<androidx.recyclerview.widget.GapWorker.Task> getHighSpeedVideoFpsRangesFor = new java.util.Comparator<androidx.recyclerview.widget.GapWorker.Task>() { // from class: androidx.recyclerview.widget.GapWorker.1
        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(androidx.recyclerview.widget.GapWorker.Task task, androidx.recyclerview.widget.GapWorker.Task task2) {
            androidx.recyclerview.widget.GapWorker.Task task3 = task;
            androidx.recyclerview.widget.GapWorker.Task task4 = task2;
            if ((task3.Camera2StreamConfigurationMap == null) != (task4.Camera2StreamConfigurationMap == null)) {
                return task3.Camera2StreamConfigurationMap == null ? 1 : -1;
            }
            if (task3.getHighSpeedVideoFpsRanges != task4.getHighSpeedVideoFpsRanges) {
                return task3.getHighSpeedVideoFpsRanges ? -1 : 1;
            }
            int i = task4.getHighSpeedVideoSizes - task3.getHighSpeedVideoSizes;
            if (i != 0) {
                return i;
            }
            int i2 = task3.getHighSpeedVideoFpsRangesFor - task4.getHighSpeedVideoFpsRangesFor;
            if (i2 != 0) {
                return i2;
            }
            return 0;
        }
    };
    long getHighResolutionOutputSizeshNQ4ISI;
    long getHighSpeedVideoSizes;
    java.util.ArrayList<androidx.recyclerview.widget.RecyclerView> getHighSpeedVideoFpsRanges = new java.util.ArrayList<>();
    private java.util.ArrayList<androidx.recyclerview.widget.GapWorker.Task> getInputFormats = new java.util.ArrayList<>();

    GapWorker() {
    }

    static class Task {
        public androidx.recyclerview.widget.RecyclerView Camera2StreamConfigurationMap;
        public int getHighResolutionOutputSizeshNQ4ISI;
        public boolean getHighSpeedVideoFpsRanges;
        public int getHighSpeedVideoFpsRangesFor;
        public int getHighSpeedVideoSizes;

        Task() {
        }

        public final void getHighSpeedVideoFpsRangesFor() {
            this.getHighSpeedVideoFpsRanges = false;
            this.getHighSpeedVideoSizes = 0;
            this.getHighSpeedVideoFpsRangesFor = 0;
            this.Camera2StreamConfigurationMap = null;
            this.getHighResolutionOutputSizeshNQ4ISI = 0;
        }
    }

    static class LayoutPrefetchRegistryImpl implements androidx.recyclerview.widget.RecyclerView.LayoutManager.LayoutPrefetchRegistry {
        int Camera2StreamConfigurationMap;
        int getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRanges;
        int[] getHighSpeedVideoFpsRangesFor;

        LayoutPrefetchRegistryImpl() {
        }

        final void Camera2StreamConfigurationMap(int i, int i2) {
            this.Camera2StreamConfigurationMap = i;
            this.getHighResolutionOutputSizeshNQ4ISI = i2;
        }

        final void getHighSpeedVideoFpsRangesFor(androidx.recyclerview.widget.RecyclerView recyclerView, boolean z) {
            this.getHighSpeedVideoFpsRanges = 0;
            int[] iArr = this.getHighSpeedVideoFpsRangesFor;
            if (iArr != null) {
                java.util.Arrays.fill(iArr, -1);
            }
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.mLayout;
            if (recyclerView.mAdapter == null || layoutManager == null || !layoutManager.isItemPrefetchEnabled()) {
                return;
            }
            if (z) {
                if (!recyclerView.mAdapterHelper.getHighSpeedVideoFpsRanges()) {
                    layoutManager.collectInitialPrefetchPositions(recyclerView.mAdapter.getItemCount(), this);
                }
            } else if (!recyclerView.hasPendingAdapterUpdates()) {
                layoutManager.collectAdjacentPrefetchPositions(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, recyclerView.mState, this);
            }
            if (this.getHighSpeedVideoFpsRanges > layoutManager.mPrefetchMaxCountObserved) {
                layoutManager.mPrefetchMaxCountObserved = this.getHighSpeedVideoFpsRanges;
                layoutManager.mPrefetchMaxObservedInInitialPrefetch = z;
                recyclerView.mRecycler.getHighSpeedVideoSizesFor();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager.LayoutPrefetchRegistry
        public void addPosition(int i, int i2) {
            if (i < 0) {
                throw new java.lang.IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i2 < 0) {
                throw new java.lang.IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i3 = this.getHighSpeedVideoFpsRanges;
            int i4 = i3 * 2;
            int[] iArr = this.getHighSpeedVideoFpsRangesFor;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.getHighSpeedVideoFpsRangesFor = iArr2;
                java.util.Arrays.fill(iArr2, -1);
            } else if (i4 >= iArr.length) {
                int[] iArr3 = new int[i3 * 4];
                this.getHighSpeedVideoFpsRangesFor = iArr3;
                java.lang.System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.getHighSpeedVideoFpsRangesFor;
            iArr4[i4] = i;
            iArr4[i4 + 1] = i2;
            this.getHighSpeedVideoFpsRanges++;
        }

        final boolean Camera2StreamConfigurationMap(int i) {
            if (this.getHighSpeedVideoFpsRangesFor != null) {
                int i2 = this.getHighSpeedVideoFpsRanges;
                for (int i3 = 0; i3 < i2 * 2; i3 += 2) {
                    if (this.getHighSpeedVideoFpsRangesFor[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }

        final void getHighResolutionOutputSizeshNQ4ISI() {
            int[] iArr = this.getHighSpeedVideoFpsRangesFor;
            if (iArr != null) {
                java.util.Arrays.fill(iArr, -1);
            }
            this.getHighSpeedVideoFpsRanges = 0;
        }
    }

    public final void getHighSpeedVideoSizes(androidx.recyclerview.widget.RecyclerView recyclerView) {
        if (androidx.recyclerview.widget.RecyclerView.sDebugAssertionsEnabled && this.getHighSpeedVideoFpsRanges.contains(recyclerView)) {
            throw new java.lang.IllegalStateException("RecyclerView already present in worker list!");
        }
        this.getHighSpeedVideoFpsRanges.add(recyclerView);
    }

    public final void getHighSpeedVideoFpsRanges(androidx.recyclerview.widget.RecyclerView recyclerView) {
        boolean remove = this.getHighSpeedVideoFpsRanges.remove(recyclerView);
        if (androidx.recyclerview.widget.RecyclerView.sDebugAssertionsEnabled && !remove) {
            throw new java.lang.IllegalStateException("RecyclerView removal failed!");
        }
    }

    final void Camera2StreamConfigurationMap(androidx.recyclerview.widget.RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow()) {
            if (androidx.recyclerview.widget.RecyclerView.sDebugAssertionsEnabled && !this.getHighSpeedVideoFpsRanges.contains(recyclerView)) {
                throw new java.lang.IllegalStateException("attempting to post unregistered view!");
            }
            if (this.getHighResolutionOutputSizeshNQ4ISI == 0) {
                this.getHighResolutionOutputSizeshNQ4ISI = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        recyclerView.mPrefetchRegistry.Camera2StreamConfigurationMap(i, i2);
    }

    private void getHighSpeedVideoSizes() {
        androidx.recyclerview.widget.GapWorker.Task task;
        int size = this.getHighSpeedVideoFpsRanges.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.getHighSpeedVideoFpsRanges.get(i2);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.mPrefetchRegistry.getHighSpeedVideoFpsRangesFor(recyclerView, false);
                i += recyclerView.mPrefetchRegistry.getHighSpeedVideoFpsRanges;
            }
        }
        this.getInputFormats.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            androidx.recyclerview.widget.RecyclerView recyclerView2 = this.getHighSpeedVideoFpsRanges.get(i4);
            if (recyclerView2.getWindowVisibility() == 0) {
                androidx.recyclerview.widget.GapWorker.LayoutPrefetchRegistryImpl layoutPrefetchRegistryImpl = recyclerView2.mPrefetchRegistry;
                int abs = java.lang.Math.abs(layoutPrefetchRegistryImpl.Camera2StreamConfigurationMap) + java.lang.Math.abs(layoutPrefetchRegistryImpl.getHighResolutionOutputSizeshNQ4ISI);
                for (int i5 = 0; i5 < layoutPrefetchRegistryImpl.getHighSpeedVideoFpsRanges * 2; i5 += 2) {
                    if (i3 >= this.getInputFormats.size()) {
                        task = new androidx.recyclerview.widget.GapWorker.Task();
                        this.getInputFormats.add(task);
                    } else {
                        task = this.getInputFormats.get(i3);
                    }
                    int i6 = layoutPrefetchRegistryImpl.getHighSpeedVideoFpsRangesFor[i5 + 1];
                    task.getHighSpeedVideoFpsRanges = i6 <= abs;
                    task.getHighSpeedVideoSizes = abs;
                    task.getHighSpeedVideoFpsRangesFor = i6;
                    task.Camera2StreamConfigurationMap = recyclerView2;
                    task.getHighResolutionOutputSizeshNQ4ISI = layoutPrefetchRegistryImpl.getHighSpeedVideoFpsRangesFor[i5];
                    i3++;
                }
            }
        }
        java.util.Collections.sort(this.getInputFormats, getHighSpeedVideoFpsRangesFor);
    }

    private static boolean getHighSpeedVideoSizes(androidx.recyclerview.widget.RecyclerView recyclerView, int i) {
        int highResolutionOutputSizeshNQ4ISI = recyclerView.mChildHelper.getHighResolutionOutputSizeshNQ4ISI();
        for (int i2 = 0; i2 < highResolutionOutputSizeshNQ4ISI; i2++) {
            androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.getHighSpeedVideoSizes(i2));
            if (childViewHolderInt.mPosition == i && !childViewHolderInt.isInvalid()) {
                return true;
            }
        }
        return false;
    }

    private static androidx.recyclerview.widget.RecyclerView.ViewHolder getHighSpeedVideoFpsRanges(androidx.recyclerview.widget.RecyclerView recyclerView, int i, long j) {
        if (getHighSpeedVideoSizes(recyclerView, i)) {
            return null;
        }
        androidx.recyclerview.widget.RecyclerView.Recycler recycler = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            androidx.recyclerview.widget.RecyclerView.ViewHolder highSpeedVideoSizes = recycler.getHighSpeedVideoSizes(i, false, j);
            if (highSpeedVideoSizes != null) {
                if (highSpeedVideoSizes.isBound() && !highSpeedVideoSizes.isInvalid()) {
                    recycler.recycleView(highSpeedVideoSizes.itemView);
                } else {
                    recycler.getHighSpeedVideoSizes(highSpeedVideoSizes, false);
                }
            }
            return highSpeedVideoSizes;
        } finally {
            recyclerView.onExitLayoutOrScroll(false);
        }
    }

    private void getHighSpeedVideoFpsRanges(androidx.recyclerview.widget.GapWorker.Task task, long j) {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        androidx.recyclerview.widget.RecyclerView.ViewHolder highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(task.Camera2StreamConfigurationMap, task.getHighResolutionOutputSizeshNQ4ISI, task.getHighSpeedVideoFpsRanges ? Long.MAX_VALUE : j);
        if (highSpeedVideoFpsRanges == null || highSpeedVideoFpsRanges.mNestedRecyclerView == null || !highSpeedVideoFpsRanges.isBound() || highSpeedVideoFpsRanges.isInvalid() || (recyclerView = highSpeedVideoFpsRanges.mNestedRecyclerView.get()) == null) {
            return;
        }
        if (recyclerView.mDataSetHasChangedAfterLayout && recyclerView.mChildHelper.getHighResolutionOutputSizeshNQ4ISI() != 0) {
            recyclerView.removeAndRecycleViews();
        }
        androidx.recyclerview.widget.GapWorker.LayoutPrefetchRegistryImpl layoutPrefetchRegistryImpl = recyclerView.mPrefetchRegistry;
        layoutPrefetchRegistryImpl.getHighSpeedVideoFpsRangesFor(recyclerView, true);
        if (layoutPrefetchRegistryImpl.getHighSpeedVideoFpsRanges != 0) {
            try {
                androidx.core.os.TraceCompat.beginSection("RV Nested Prefetch");
                androidx.recyclerview.widget.RecyclerView.State state = recyclerView.mState;
                androidx.recyclerview.widget.RecyclerView.Adapter adapter = recyclerView.mAdapter;
                state.getInputFormats = 1;
                state.getInputSizeshNQ4ISI = adapter.getItemCount();
                state.Camera2StreamConfigurationMap = false;
                state.isOutputSupportedForhNQ4ISI = false;
                state.getHighSpeedVideoSizesFor = false;
                for (int i = 0; i < layoutPrefetchRegistryImpl.getHighSpeedVideoFpsRanges * 2; i += 2) {
                    getHighSpeedVideoFpsRanges(recyclerView, layoutPrefetchRegistryImpl.getHighSpeedVideoFpsRangesFor[i], j);
                }
            } finally {
                androidx.core.os.TraceCompat.endSection();
            }
        }
    }

    private void Camera2StreamConfigurationMap(long j) {
        for (int i = 0; i < this.getInputFormats.size(); i++) {
            androidx.recyclerview.widget.GapWorker.Task task = this.getInputFormats.get(i);
            if (task.Camera2StreamConfigurationMap == null) {
                return;
            }
            getHighSpeedVideoFpsRanges(task, j);
            task.getHighSpeedVideoFpsRangesFor();
        }
    }

    private void getHighResolutionOutputSizeshNQ4ISI(long j) {
        getHighSpeedVideoSizes();
        Camera2StreamConfigurationMap(j);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            androidx.core.os.TraceCompat.beginSection("RV Prefetch");
            if (!this.getHighSpeedVideoFpsRanges.isEmpty()) {
                int size = this.getHighSpeedVideoFpsRanges.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    androidx.recyclerview.widget.RecyclerView recyclerView = this.getHighSpeedVideoFpsRanges.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = java.lang.Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    getHighResolutionOutputSizeshNQ4ISI(java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(j) + this.getHighSpeedVideoSizes);
                }
            }
        } finally {
            this.getHighResolutionOutputSizeshNQ4ISI = 0L;
            androidx.core.os.TraceCompat.endSection();
        }
    }
}
