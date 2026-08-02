package androidx.recyclerview.widget;

/* loaded from: classes7.dex */
class MessageThreadUtil<T> implements androidx.recyclerview.widget.ThreadUtil<T> {
    MessageThreadUtil() {
    }

    /* renamed from: androidx.recyclerview.widget.MessageThreadUtil$1, reason: invalid class name */
    class AnonymousClass1 implements androidx.recyclerview.widget.ThreadUtil.MainThreadCallback<T> {
        final /* synthetic */ androidx.recyclerview.widget.ThreadUtil.MainThreadCallback getHighResolutionOutputSizeshNQ4ISI;
        final androidx.recyclerview.widget.MessageThreadUtil.MessageQueue getHighSpeedVideoFpsRangesFor = new androidx.recyclerview.widget.MessageThreadUtil.MessageQueue();
        private final android.os.Handler getHighSpeedVideoSizes = new android.os.Handler(android.os.Looper.getMainLooper());
        private java.lang.Runnable getHighSpeedVideoFpsRanges = new java.lang.Runnable() { // from class: androidx.recyclerview.widget.MessageThreadUtil.1.1
            @Override // java.lang.Runnable
            public void run() {
                androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem highResolutionOutputSizeshNQ4ISI = androidx.recyclerview.widget.MessageThreadUtil.AnonymousClass1.this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI();
                while (highResolutionOutputSizeshNQ4ISI != null) {
                    int i = highResolutionOutputSizeshNQ4ISI.getInputFormats;
                    if (i == 1) {
                        androidx.recyclerview.widget.MessageThreadUtil.AnonymousClass1.this.getHighResolutionOutputSizeshNQ4ISI.updateItemCount(highResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor, highResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes);
                    } else if (i == 2) {
                        androidx.recyclerview.widget.MessageThreadUtil.AnonymousClass1.this.getHighResolutionOutputSizeshNQ4ISI.addTile(highResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor, (androidx.recyclerview.widget.TileList.Tile) highResolutionOutputSizeshNQ4ISI.getOutputMinFrameDuration);
                    } else if (i == 3) {
                        androidx.recyclerview.widget.MessageThreadUtil.AnonymousClass1.this.getHighResolutionOutputSizeshNQ4ISI.removeTile(highResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor, highResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes);
                    } else {
                        int i2 = highResolutionOutputSizeshNQ4ISI.getInputFormats;
                    }
                    highResolutionOutputSizeshNQ4ISI = androidx.recyclerview.widget.MessageThreadUtil.AnonymousClass1.this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI();
                }
            }
        };

        AnonymousClass1(androidx.recyclerview.widget.ThreadUtil.MainThreadCallback mainThreadCallback) {
            this.getHighResolutionOutputSizeshNQ4ISI = mainThreadCallback;
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
        public void updateItemCount(int i, int i2) {
            this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI(androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem.getHighSpeedVideoSizes(1, i, i2));
            this.getHighSpeedVideoSizes.post(this.getHighSpeedVideoFpsRanges);
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
        public void addTile(int i, androidx.recyclerview.widget.TileList.Tile<T> tile) {
            this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI(androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem.getHighSpeedVideoSizes(2, i, tile));
            this.getHighSpeedVideoSizes.post(this.getHighSpeedVideoFpsRanges);
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
        public void removeTile(int i, int i2) {
            this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI(androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem.getHighSpeedVideoSizes(3, i, i2));
            this.getHighSpeedVideoSizes.post(this.getHighSpeedVideoFpsRanges);
        }
    }

    @Override // androidx.recyclerview.widget.ThreadUtil
    public final androidx.recyclerview.widget.ThreadUtil.MainThreadCallback<T> getHighSpeedVideoFpsRanges(androidx.recyclerview.widget.ThreadUtil.MainThreadCallback<T> mainThreadCallback) {
        return new androidx.recyclerview.widget.MessageThreadUtil.AnonymousClass1(mainThreadCallback);
    }

    /* renamed from: androidx.recyclerview.widget.MessageThreadUtil$2, reason: invalid class name */
    class AnonymousClass2 implements androidx.recyclerview.widget.ThreadUtil.BackgroundCallback<T> {
        final /* synthetic */ androidx.recyclerview.widget.ThreadUtil.BackgroundCallback getHighResolutionOutputSizeshNQ4ISI;
        final androidx.recyclerview.widget.MessageThreadUtil.MessageQueue Camera2StreamConfigurationMap = new androidx.recyclerview.widget.MessageThreadUtil.MessageQueue();
        private final java.util.concurrent.Executor getHighSpeedVideoSizesFor = android.os.AsyncTask.THREAD_POOL_EXECUTOR;
        java.util.concurrent.atomic.AtomicBoolean getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicBoolean(false);
        private java.lang.Runnable getHighSpeedVideoFpsRanges = new java.lang.Runnable() { // from class: androidx.recyclerview.widget.MessageThreadUtil.2.1
            @Override // java.lang.Runnable
            public void run() {
                while (true) {
                    androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem highResolutionOutputSizeshNQ4ISI = androidx.recyclerview.widget.MessageThreadUtil.AnonymousClass2.this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI();
                    if (highResolutionOutputSizeshNQ4ISI != null) {
                        int i = highResolutionOutputSizeshNQ4ISI.getInputFormats;
                        if (i == 1) {
                            androidx.recyclerview.widget.MessageThreadUtil.AnonymousClass2.this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges(1);
                            androidx.recyclerview.widget.MessageThreadUtil.AnonymousClass2.this.getHighResolutionOutputSizeshNQ4ISI.refresh(highResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor);
                        } else if (i == 2) {
                            androidx.recyclerview.widget.MessageThreadUtil.AnonymousClass2.this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges(2);
                            androidx.recyclerview.widget.MessageThreadUtil.AnonymousClass2.this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges(3);
                            androidx.recyclerview.widget.MessageThreadUtil.AnonymousClass2.this.getHighResolutionOutputSizeshNQ4ISI.updateRange(highResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor, highResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes, highResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap, highResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI, highResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges);
                        } else if (i == 3) {
                            androidx.recyclerview.widget.MessageThreadUtil.AnonymousClass2.this.getHighResolutionOutputSizeshNQ4ISI.loadTile(highResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor, highResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes);
                        } else if (i == 4) {
                            androidx.recyclerview.widget.MessageThreadUtil.AnonymousClass2.this.getHighResolutionOutputSizeshNQ4ISI.recycleTile((androidx.recyclerview.widget.TileList.Tile) highResolutionOutputSizeshNQ4ISI.getOutputMinFrameDuration);
                        } else {
                            int i2 = highResolutionOutputSizeshNQ4ISI.getInputFormats;
                        }
                    } else {
                        androidx.recyclerview.widget.MessageThreadUtil.AnonymousClass2.this.getHighSpeedVideoSizes.set(false);
                        return;
                    }
                }
            }
        };

        AnonymousClass2(androidx.recyclerview.widget.ThreadUtil.BackgroundCallback backgroundCallback) {
            this.getHighResolutionOutputSizeshNQ4ISI = backgroundCallback;
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void refresh(int i) {
            getHighSpeedVideoSizes(androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem.getHighSpeedVideoSizes(1, i, (java.lang.Object) null));
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void updateRange(int i, int i2, int i3, int i4, int i5) {
            getHighSpeedVideoSizes(androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem.getHighSpeedVideoFpsRangesFor(2, i, i2, i3, i4, i5, null));
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void loadTile(int i, int i2) {
            Camera2StreamConfigurationMap(androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem.getHighSpeedVideoSizes(3, i, i2));
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void recycleTile(androidx.recyclerview.widget.TileList.Tile<T> tile) {
            Camera2StreamConfigurationMap(androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem.getHighSpeedVideoSizes(4, 0, tile));
        }

        private void Camera2StreamConfigurationMap(androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem syncQueueItem) {
            this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(syncQueueItem);
            if (this.getHighSpeedVideoSizes.compareAndSet(false, true)) {
                this.getHighSpeedVideoSizesFor.execute(this.getHighSpeedVideoFpsRanges);
            }
        }

        private void getHighSpeedVideoSizes(androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem syncQueueItem) {
            androidx.recyclerview.widget.MessageThreadUtil.MessageQueue messageQueue = this.Camera2StreamConfigurationMap;
            synchronized (messageQueue.getHighResolutionOutputSizeshNQ4ISI) {
                syncQueueItem.getOutputFormats = messageQueue.getHighSpeedVideoSizes;
                messageQueue.getHighSpeedVideoSizes = syncQueueItem;
            }
            if (this.getHighSpeedVideoSizes.compareAndSet(false, true)) {
                this.getHighSpeedVideoSizesFor.execute(this.getHighSpeedVideoFpsRanges);
            }
        }
    }

    @Override // androidx.recyclerview.widget.ThreadUtil
    public final androidx.recyclerview.widget.ThreadUtil.BackgroundCallback<T> getHighSpeedVideoFpsRanges(androidx.recyclerview.widget.ThreadUtil.BackgroundCallback<T> backgroundCallback) {
        return new androidx.recyclerview.widget.MessageThreadUtil.AnonymousClass2(backgroundCallback);
    }

    static class SyncQueueItem {
        private static androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem getHighSpeedVideoSizesFor;
        private static final java.lang.Object getInputSizeshNQ4ISI = new java.lang.Object();
        public int Camera2StreamConfigurationMap;
        public int getHighResolutionOutputSizeshNQ4ISI;
        public int getHighSpeedVideoFpsRanges;
        public int getHighSpeedVideoFpsRangesFor;
        public int getHighSpeedVideoSizes;
        public int getInputFormats;
        androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem getOutputFormats;
        public java.lang.Object getOutputMinFrameDuration;

        SyncQueueItem() {
        }

        final void getHighSpeedVideoFpsRanges() {
            this.getOutputFormats = null;
            this.getHighSpeedVideoFpsRanges = 0;
            this.getHighResolutionOutputSizeshNQ4ISI = 0;
            this.Camera2StreamConfigurationMap = 0;
            this.getHighSpeedVideoSizes = 0;
            this.getHighSpeedVideoFpsRangesFor = 0;
            this.getInputFormats = 0;
            this.getOutputMinFrameDuration = null;
            synchronized (getInputSizeshNQ4ISI) {
                androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem syncQueueItem = getHighSpeedVideoSizesFor;
                if (syncQueueItem != null) {
                    this.getOutputFormats = syncQueueItem;
                }
                getHighSpeedVideoSizesFor = this;
            }
        }

        static androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem getHighSpeedVideoFpsRangesFor(int i, int i2, int i3, int i4, int i5, int i6, java.lang.Object obj) {
            androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem syncQueueItem;
            synchronized (getInputSizeshNQ4ISI) {
                syncQueueItem = getHighSpeedVideoSizesFor;
                if (syncQueueItem == null) {
                    syncQueueItem = new androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem();
                } else {
                    getHighSpeedVideoSizesFor = syncQueueItem.getOutputFormats;
                    syncQueueItem.getOutputFormats = null;
                }
                syncQueueItem.getInputFormats = i;
                syncQueueItem.getHighSpeedVideoFpsRangesFor = i2;
                syncQueueItem.getHighSpeedVideoSizes = i3;
                syncQueueItem.Camera2StreamConfigurationMap = i4;
                syncQueueItem.getHighResolutionOutputSizeshNQ4ISI = i5;
                syncQueueItem.getHighSpeedVideoFpsRanges = i6;
                syncQueueItem.getOutputMinFrameDuration = obj;
            }
            return syncQueueItem;
        }

        static androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem getHighSpeedVideoSizes(int i, int i2, int i3) {
            return getHighSpeedVideoFpsRangesFor(i, i2, i3, 0, 0, 0, null);
        }

        static androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem getHighSpeedVideoSizes(int i, int i2, java.lang.Object obj) {
            return getHighSpeedVideoFpsRangesFor(i, i2, 0, 0, 0, 0, obj);
        }
    }

    static class MessageQueue {
        final java.lang.Object getHighResolutionOutputSizeshNQ4ISI = new java.lang.Object();
        androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem getHighSpeedVideoSizes;

        MessageQueue() {
        }

        final androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem getHighResolutionOutputSizeshNQ4ISI() {
            synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
                androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem syncQueueItem = this.getHighSpeedVideoSizes;
                if (syncQueueItem == null) {
                    return null;
                }
                this.getHighSpeedVideoSizes = syncQueueItem.getOutputFormats;
                return syncQueueItem;
            }
        }

        final void getHighResolutionOutputSizeshNQ4ISI(androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem syncQueueItem) {
            synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
                androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem syncQueueItem2 = this.getHighSpeedVideoSizes;
                if (syncQueueItem2 == null) {
                    this.getHighSpeedVideoSizes = syncQueueItem;
                    return;
                }
                while (syncQueueItem2.getOutputFormats != null) {
                    syncQueueItem2 = syncQueueItem2.getOutputFormats;
                }
                syncQueueItem2.getOutputFormats = syncQueueItem;
            }
        }

        final void getHighSpeedVideoFpsRanges(int i) {
            synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
                while (true) {
                    androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem syncQueueItem = this.getHighSpeedVideoSizes;
                    if (syncQueueItem == null || syncQueueItem.getInputFormats != i) {
                        break;
                    }
                    androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem syncQueueItem2 = this.getHighSpeedVideoSizes;
                    this.getHighSpeedVideoSizes = syncQueueItem2.getOutputFormats;
                    syncQueueItem2.getHighSpeedVideoFpsRanges();
                }
                androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem syncQueueItem3 = this.getHighSpeedVideoSizes;
                if (syncQueueItem3 != null) {
                    androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem syncQueueItem4 = syncQueueItem3.getOutputFormats;
                    while (syncQueueItem4 != null) {
                        androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem syncQueueItem5 = syncQueueItem4.getOutputFormats;
                        if (syncQueueItem4.getInputFormats == i) {
                            syncQueueItem3.getOutputFormats = syncQueueItem5;
                            syncQueueItem4.getHighSpeedVideoFpsRanges();
                        } else {
                            syncQueueItem3 = syncQueueItem4;
                        }
                        syncQueueItem4 = syncQueueItem5;
                    }
                }
            }
        }
    }
}
