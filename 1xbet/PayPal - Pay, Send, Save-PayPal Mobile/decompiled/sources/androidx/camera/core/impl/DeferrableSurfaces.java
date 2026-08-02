package androidx.camera.core.impl;

/* loaded from: classes6.dex */
public final class DeferrableSurfaces {
    private DeferrableSurfaces() {
    }

    public static com.google.common.util.concurrent.ListenableFuture<java.util.List<android.view.Surface>> surfaceListWithTimeout(final java.util.Collection<androidx.camera.core.impl.DeferrableSurface> collection, final boolean z, long j, final java.util.concurrent.Executor executor, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<androidx.camera.core.impl.DeferrableSurface> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(it.next().getSurface()));
        }
        final com.google.common.util.concurrent.ListenableFuture makeTimeoutFuture = androidx.camera.core.impl.utils.futures.Futures.makeTimeoutFuture(j, scheduledExecutorService, androidx.camera.core.impl.utils.futures.Futures.successfulAsList(arrayList));
        return androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.impl.DeferrableSurfaces$$ExternalSyntheticLambda1
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final java.lang.Object attachCompleter(androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) {
                return androidx.camera.core.impl.DeferrableSurfaces.Camera2StreamConfigurationMap(com.google.common.util.concurrent.ListenableFuture.this, executor, z, collection, completer);
            }
        });
    }

    static /* synthetic */ java.lang.Object Camera2StreamConfigurationMap(final com.google.common.util.concurrent.ListenableFuture listenableFuture, java.util.concurrent.Executor executor, final boolean z, java.util.Collection collection, final androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) throws java.lang.Exception {
        completer.addCancellationListener(new java.lang.Runnable() { // from class: androidx.camera.core.impl.DeferrableSurfaces$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.google.common.util.concurrent.ListenableFuture.this.cancel(true);
            }
        }, executor);
        androidx.camera.core.impl.utils.futures.Futures.addCallback(listenableFuture, new androidx.camera.core.impl.utils.futures.FutureCallback<java.util.List<android.view.Surface>>() { // from class: androidx.camera.core.impl.DeferrableSurfaces.1
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public /* synthetic */ void onSuccess(java.util.List<android.view.Surface> list) {
                java.util.List<android.view.Surface> list2 = list;
                androidx.core.util.Preconditions.checkNotNull(list2);
                java.util.ArrayList arrayList = new java.util.ArrayList(list2);
                if (z) {
                    arrayList.removeAll(java.util.Collections.singleton(null));
                }
                completer.set(arrayList);
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(java.lang.Throwable th) {
                if (th instanceof java.util.concurrent.TimeoutException) {
                    completer.setException(th);
                } else {
                    completer.set(java.util.Collections.emptyList());
                }
            }
        }, executor);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("surfaceList[");
        sb.append(collection);
        sb.append("]");
        return sb.toString();
    }

    public static boolean tryIncrementAll(java.util.List<androidx.camera.core.impl.DeferrableSurface> list) {
        try {
            incrementAll(list);
            return true;
        } catch (androidx.camera.core.impl.DeferrableSurface.SurfaceClosedException unused) {
            return false;
        }
    }

    public static void incrementAll(java.util.List<androidx.camera.core.impl.DeferrableSurface> list) throws androidx.camera.core.impl.DeferrableSurface.SurfaceClosedException {
        if (list.isEmpty()) {
            return;
        }
        int i = 0;
        do {
            try {
                list.get(i).incrementUseCount();
                i++;
            } catch (androidx.camera.core.impl.DeferrableSurface.SurfaceClosedException e) {
                for (int i2 = i - 1; i2 >= 0; i2--) {
                    list.get(i2).decrementUseCount();
                }
                throw e;
            }
        } while (i < list.size());
    }

    public static void decrementAll(java.util.List<androidx.camera.core.impl.DeferrableSurface> list) {
        java.util.Iterator<androidx.camera.core.impl.DeferrableSurface> it = list.iterator();
        while (it.hasNext()) {
            it.next().decrementUseCount();
        }
    }
}
