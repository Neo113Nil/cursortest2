package androidx.recyclerview.widget;

/* loaded from: classes7.dex */
public class AsyncListDiffer<T> {
    private static final java.util.concurrent.Executor getOutputFormats = new androidx.recyclerview.widget.AsyncListDiffer.MainThreadExecutor();
    java.util.concurrent.Executor Camera2StreamConfigurationMap;
    final androidx.recyclerview.widget.AsyncDifferConfig<T> getHighResolutionOutputSizeshNQ4ISI;
    java.util.List<T> getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.util.List<T> getHighSpeedVideoSizes;
    private final java.util.List<androidx.recyclerview.widget.AsyncListDiffer.ListListener<T>> getHighSpeedVideoSizesFor;
    final androidx.recyclerview.widget.ListUpdateCallback getInputSizeshNQ4ISI;

    public interface ListListener<T> {
        void onCurrentListChanged(java.util.List<T> list, java.util.List<T> list2);
    }

    static class MainThreadExecutor implements java.util.concurrent.Executor {
        final android.os.Handler getHighSpeedVideoFpsRanges = new android.os.Handler(android.os.Looper.getMainLooper());

        MainThreadExecutor() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable runnable) {
            this.getHighSpeedVideoFpsRanges.post(runnable);
        }
    }

    public AsyncListDiffer(androidx.recyclerview.widget.RecyclerView.Adapter adapter, androidx.recyclerview.widget.DiffUtil.ItemCallback<T> itemCallback) {
        this(new androidx.recyclerview.widget.AdapterListUpdateCallback(adapter), new androidx.recyclerview.widget.AsyncDifferConfig.Builder(itemCallback).build());
    }

    public AsyncListDiffer(androidx.recyclerview.widget.ListUpdateCallback listUpdateCallback, androidx.recyclerview.widget.AsyncDifferConfig<T> asyncDifferConfig) {
        this.getHighSpeedVideoSizesFor = new java.util.concurrent.CopyOnWriteArrayList();
        this.getHighSpeedVideoFpsRanges = java.util.Collections.emptyList();
        this.getInputSizeshNQ4ISI = listUpdateCallback;
        this.getHighResolutionOutputSizeshNQ4ISI = asyncDifferConfig;
        if (asyncDifferConfig.getMainThreadExecutor() != null) {
            this.Camera2StreamConfigurationMap = asyncDifferConfig.getMainThreadExecutor();
        } else {
            this.Camera2StreamConfigurationMap = getOutputFormats;
        }
    }

    public java.util.List<T> getCurrentList() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public void submitList(java.util.List<T> list) {
        submitList(list, null);
    }

    public void submitList(final java.util.List<T> list, final java.lang.Runnable runnable) {
        final int i = this.getHighSpeedVideoFpsRangesFor + 1;
        this.getHighSpeedVideoFpsRangesFor = i;
        final java.util.List<T> list2 = this.getHighSpeedVideoSizes;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        java.util.List<T> list3 = this.getHighSpeedVideoFpsRanges;
        if (list == null) {
            int size = list2.size();
            this.getHighSpeedVideoSizes = null;
            this.getHighSpeedVideoFpsRanges = java.util.Collections.emptyList();
            this.getInputSizeshNQ4ISI.onRemoved(0, size);
            getHighSpeedVideoSizes(list3, runnable);
            return;
        }
        if (list2 == null) {
            this.getHighSpeedVideoSizes = list;
            this.getHighSpeedVideoFpsRanges = java.util.Collections.unmodifiableList(list);
            this.getInputSizeshNQ4ISI.onInserted(0, list.size());
            getHighSpeedVideoSizes(list3, runnable);
            return;
        }
        this.getHighResolutionOutputSizeshNQ4ISI.getBackgroundThreadExecutor().execute(new java.lang.Runnable() { // from class: androidx.recyclerview.widget.AsyncListDiffer.1
            @Override // java.lang.Runnable
            public void run() {
                final androidx.recyclerview.widget.DiffUtil.DiffResult calculateDiff = androidx.recyclerview.widget.DiffUtil.calculateDiff(new androidx.recyclerview.widget.DiffUtil.Callback() { // from class: androidx.recyclerview.widget.AsyncListDiffer.1.1
                    @Override // androidx.recyclerview.widget.DiffUtil.Callback
                    public int getOldListSize() {
                        return list2.size();
                    }

                    @Override // androidx.recyclerview.widget.DiffUtil.Callback
                    public int getNewListSize() {
                        return list.size();
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // androidx.recyclerview.widget.DiffUtil.Callback
                    public boolean areItemsTheSame(int i2, int i3) {
                        java.lang.Object obj = list2.get(i2);
                        java.lang.Object obj2 = list.get(i3);
                        if (obj == null || obj2 == null) {
                            return obj == null && obj2 == null;
                        }
                        return androidx.recyclerview.widget.AsyncListDiffer.this.getHighResolutionOutputSizeshNQ4ISI.getDiffCallback().areItemsTheSame(obj, obj2);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // androidx.recyclerview.widget.DiffUtil.Callback
                    public boolean areContentsTheSame(int i2, int i3) {
                        java.lang.Object obj = list2.get(i2);
                        java.lang.Object obj2 = list.get(i3);
                        if (obj != null && obj2 != null) {
                            return androidx.recyclerview.widget.AsyncListDiffer.this.getHighResolutionOutputSizeshNQ4ISI.getDiffCallback().areContentsTheSame(obj, obj2);
                        }
                        if (obj == null && obj2 == null) {
                            return true;
                        }
                        throw new java.lang.AssertionError();
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // androidx.recyclerview.widget.DiffUtil.Callback
                    public java.lang.Object getChangePayload(int i2, int i3) {
                        java.lang.Object obj = list2.get(i2);
                        java.lang.Object obj2 = list.get(i3);
                        if (obj != null && obj2 != null) {
                            return androidx.recyclerview.widget.AsyncListDiffer.this.getHighResolutionOutputSizeshNQ4ISI.getDiffCallback().getChangePayload(obj, obj2);
                        }
                        throw new java.lang.AssertionError();
                    }
                });
                androidx.recyclerview.widget.AsyncListDiffer.this.Camera2StreamConfigurationMap.execute(new java.lang.Runnable() { // from class: androidx.recyclerview.widget.AsyncListDiffer.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (androidx.recyclerview.widget.AsyncListDiffer.this.getHighSpeedVideoFpsRangesFor == i) {
                            androidx.recyclerview.widget.AsyncListDiffer asyncListDiffer = androidx.recyclerview.widget.AsyncListDiffer.this;
                            java.util.List<T> list4 = list;
                            androidx.recyclerview.widget.DiffUtil.DiffResult diffResult = calculateDiff;
                            java.lang.Runnable runnable2 = runnable;
                            java.util.List<T> list5 = asyncListDiffer.getHighSpeedVideoFpsRanges;
                            asyncListDiffer.getHighSpeedVideoSizes = list4;
                            asyncListDiffer.getHighSpeedVideoFpsRanges = java.util.Collections.unmodifiableList(list4);
                            diffResult.dispatchUpdatesTo(asyncListDiffer.getInputSizeshNQ4ISI);
                            asyncListDiffer.getHighSpeedVideoSizes(list5, runnable2);
                        }
                    }
                });
            }
        });
    }

    final void getHighSpeedVideoSizes(java.util.List<T> list, java.lang.Runnable runnable) {
        java.util.Iterator<androidx.recyclerview.widget.AsyncListDiffer.ListListener<T>> it = this.getHighSpeedVideoSizesFor.iterator();
        while (it.hasNext()) {
            it.next().onCurrentListChanged(list, this.getHighSpeedVideoFpsRanges);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void addListListener(androidx.recyclerview.widget.AsyncListDiffer.ListListener<T> listListener) {
        this.getHighSpeedVideoSizesFor.add(listListener);
    }

    public void removeListListener(androidx.recyclerview.widget.AsyncListDiffer.ListListener<T> listListener) {
        this.getHighSpeedVideoSizesFor.remove(listListener);
    }
}
