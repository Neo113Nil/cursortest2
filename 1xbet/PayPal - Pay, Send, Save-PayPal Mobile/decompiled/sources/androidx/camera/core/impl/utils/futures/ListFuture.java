package androidx.camera.core.impl.utils.futures;

/* loaded from: classes6.dex */
class ListFuture<V> implements com.google.common.util.concurrent.ListenableFuture<java.util.List<V>> {
    final java.util.concurrent.atomic.AtomicInteger Camera2StreamConfigurationMap;
    androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.util.List<V>> getHighResolutionOutputSizeshNQ4ISI;
    final boolean getHighSpeedVideoFpsRanges;
    java.util.List<V> getHighSpeedVideoFpsRangesFor;
    java.util.List<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>> getHighSpeedVideoSizes;
    private final com.google.common.util.concurrent.ListenableFuture<java.util.List<V>> getOutputMinFrameDuration = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver<java.util.List<V>>() { // from class: androidx.camera.core.impl.utils.futures.ListFuture.1
        @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
        public java.lang.Object attachCompleter(androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.util.List<V>> completer) {
            androidx.core.util.Preconditions.checkState(androidx.camera.core.impl.utils.futures.ListFuture.this.getHighResolutionOutputSizeshNQ4ISI == null, "The result can only set once!");
            androidx.camera.core.impl.utils.futures.ListFuture.this.getHighResolutionOutputSizeshNQ4ISI = completer;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ListFuture[");
            sb.append(this);
            sb.append("]");
            return sb.toString();
        }
    });

    ListFuture(java.util.List<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>> list, boolean z, java.util.concurrent.Executor executor) {
        this.getHighSpeedVideoSizes = (java.util.List) androidx.core.util.Preconditions.checkNotNull(list);
        this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList(list.size());
        this.getHighSpeedVideoFpsRanges = z;
        this.Camera2StreamConfigurationMap = new java.util.concurrent.atomic.AtomicInteger(list.size());
        addListener(new java.lang.Runnable() { // from class: androidx.camera.core.impl.utils.futures.ListFuture.2
            @Override // java.lang.Runnable
            public void run() {
                androidx.camera.core.impl.utils.futures.ListFuture.this.getHighSpeedVideoFpsRangesFor = null;
                androidx.camera.core.impl.utils.futures.ListFuture.this.getHighSpeedVideoSizes = null;
            }
        }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
        if (this.getHighSpeedVideoSizes.isEmpty()) {
            this.getHighResolutionOutputSizeshNQ4ISI.set(new java.util.ArrayList(this.getHighSpeedVideoFpsRangesFor));
            return;
        }
        for (int i = 0; i < this.getHighSpeedVideoSizes.size(); i++) {
            this.getHighSpeedVideoFpsRangesFor.add(null);
        }
        java.util.List<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>> list2 = this.getHighSpeedVideoSizes;
        for (final int i2 = 0; i2 < list2.size(); i2++) {
            final com.google.common.util.concurrent.ListenableFuture<? extends V> listenableFuture = list2.get(i2);
            listenableFuture.addListener(new java.lang.Runnable() { // from class: androidx.camera.core.impl.utils.futures.ListFuture.3
                @Override // java.lang.Runnable
                public void run() {
                    androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.util.List<V>> completer;
                    java.util.ArrayList arrayList;
                    androidx.camera.core.impl.utils.futures.ListFuture listFuture = androidx.camera.core.impl.utils.futures.ListFuture.this;
                    int i3 = i2;
                    com.google.common.util.concurrent.ListenableFuture listenableFuture2 = listenableFuture;
                    java.util.List<V> list3 = listFuture.getHighSpeedVideoFpsRangesFor;
                    if (listFuture.isDone() || list3 == null) {
                        androidx.core.util.Preconditions.checkState(listFuture.getHighSpeedVideoFpsRanges, "Future was done before all dependencies completed");
                        return;
                    }
                    try {
                        try {
                            try {
                                androidx.core.util.Preconditions.checkState(listenableFuture2.isDone(), "Tried to set value from future which is not done");
                                list3.set(i3, androidx.camera.core.impl.utils.futures.Futures.getUninterruptibly(listenableFuture2));
                                int decrementAndGet = listFuture.Camera2StreamConfigurationMap.decrementAndGet();
                                androidx.core.util.Preconditions.checkState(decrementAndGet >= 0, "Less than 0 remaining futures");
                                if (decrementAndGet == 0) {
                                    java.util.List<V> list4 = listFuture.getHighSpeedVideoFpsRangesFor;
                                    if (list4 != null) {
                                        listFuture.getHighResolutionOutputSizeshNQ4ISI.set(new java.util.ArrayList(list4));
                                    } else {
                                        androidx.core.util.Preconditions.checkState(listFuture.isDone());
                                    }
                                }
                            } catch (java.lang.Error e) {
                                listFuture.getHighResolutionOutputSizeshNQ4ISI.setException(e);
                                int decrementAndGet2 = listFuture.Camera2StreamConfigurationMap.decrementAndGet();
                                androidx.core.util.Preconditions.checkState(decrementAndGet2 >= 0, "Less than 0 remaining futures");
                                if (decrementAndGet2 == 0) {
                                    java.util.List<V> list5 = listFuture.getHighSpeedVideoFpsRangesFor;
                                    if (list5 != null) {
                                        completer = listFuture.getHighResolutionOutputSizeshNQ4ISI;
                                        arrayList = new java.util.ArrayList(list5);
                                        completer.set(arrayList);
                                        return;
                                    }
                                    androidx.core.util.Preconditions.checkState(listFuture.isDone());
                                }
                            } catch (java.util.concurrent.CancellationException unused) {
                                if (listFuture.getHighSpeedVideoFpsRanges) {
                                    listFuture.cancel(false);
                                }
                                int decrementAndGet3 = listFuture.Camera2StreamConfigurationMap.decrementAndGet();
                                androidx.core.util.Preconditions.checkState(decrementAndGet3 >= 0, "Less than 0 remaining futures");
                                if (decrementAndGet3 == 0) {
                                    java.util.List<V> list6 = listFuture.getHighSpeedVideoFpsRangesFor;
                                    if (list6 != null) {
                                        completer = listFuture.getHighResolutionOutputSizeshNQ4ISI;
                                        arrayList = new java.util.ArrayList(list6);
                                        completer.set(arrayList);
                                        return;
                                    }
                                    androidx.core.util.Preconditions.checkState(listFuture.isDone());
                                }
                            }
                        } catch (java.lang.RuntimeException e2) {
                            if (listFuture.getHighSpeedVideoFpsRanges) {
                                listFuture.getHighResolutionOutputSizeshNQ4ISI.setException(e2);
                            }
                            int decrementAndGet4 = listFuture.Camera2StreamConfigurationMap.decrementAndGet();
                            androidx.core.util.Preconditions.checkState(decrementAndGet4 >= 0, "Less than 0 remaining futures");
                            if (decrementAndGet4 == 0) {
                                java.util.List<V> list7 = listFuture.getHighSpeedVideoFpsRangesFor;
                                if (list7 != null) {
                                    completer = listFuture.getHighResolutionOutputSizeshNQ4ISI;
                                    arrayList = new java.util.ArrayList(list7);
                                    completer.set(arrayList);
                                    return;
                                }
                                androidx.core.util.Preconditions.checkState(listFuture.isDone());
                            }
                        } catch (java.util.concurrent.ExecutionException e3) {
                            if (listFuture.getHighSpeedVideoFpsRanges) {
                                listFuture.getHighResolutionOutputSizeshNQ4ISI.setException(e3.getCause());
                            }
                            int decrementAndGet5 = listFuture.Camera2StreamConfigurationMap.decrementAndGet();
                            androidx.core.util.Preconditions.checkState(decrementAndGet5 >= 0, "Less than 0 remaining futures");
                            if (decrementAndGet5 == 0) {
                                java.util.List<V> list8 = listFuture.getHighSpeedVideoFpsRangesFor;
                                if (list8 != null) {
                                    completer = listFuture.getHighResolutionOutputSizeshNQ4ISI;
                                    arrayList = new java.util.ArrayList(list8);
                                    completer.set(arrayList);
                                    return;
                                }
                                androidx.core.util.Preconditions.checkState(listFuture.isDone());
                            }
                        }
                    } catch (java.lang.Throwable th) {
                        int decrementAndGet6 = listFuture.Camera2StreamConfigurationMap.decrementAndGet();
                        androidx.core.util.Preconditions.checkState(decrementAndGet6 >= 0, "Less than 0 remaining futures");
                        if (decrementAndGet6 == 0) {
                            java.util.List<V> list9 = listFuture.getHighSpeedVideoFpsRangesFor;
                            if (list9 != null) {
                                listFuture.getHighResolutionOutputSizeshNQ4ISI.set(new java.util.ArrayList(list9));
                            } else {
                                androidx.core.util.Preconditions.checkState(listFuture.isDone());
                            }
                        }
                        throw th;
                    }
                }
            }, executor);
        }
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        this.getOutputMinFrameDuration.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        java.util.List<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>> list = this.getHighSpeedVideoSizes;
        if (list != null) {
            java.util.Iterator<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>> it = list.iterator();
            while (it.hasNext()) {
                it.next().cancel(z);
            }
        }
        return this.getOutputMinFrameDuration.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.getOutputMinFrameDuration.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.getOutputMinFrameDuration.isDone();
    }

    @Override // java.util.concurrent.Future
    public /* synthetic */ java.lang.Object get() throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        java.util.List<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>> list = this.getHighSpeedVideoSizes;
        if (list != null && !isDone()) {
            loop0: for (com.google.common.util.concurrent.ListenableFuture<? extends V> listenableFuture : list) {
                while (!listenableFuture.isDone()) {
                    try {
                        listenableFuture.get();
                    } catch (java.lang.Error e) {
                        throw e;
                    } catch (java.lang.InterruptedException e2) {
                        throw e2;
                    } catch (java.lang.Throwable unused) {
                        if (this.getHighSpeedVideoFpsRanges) {
                            break loop0;
                        }
                    }
                }
            }
        }
        return this.getOutputMinFrameDuration.get();
    }

    @Override // java.util.concurrent.Future
    public /* bridge */ /* synthetic */ java.lang.Object get(long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        return this.getOutputMinFrameDuration.get(j, timeUnit);
    }
}
