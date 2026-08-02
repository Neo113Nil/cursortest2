package androidx.camera.view;

/* loaded from: classes6.dex */
class PendingValue<T> {
    androidx.core.util.Pair<androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void>, T> getHighSpeedVideoSizes;

    PendingValue() {
    }

    final void Camera2StreamConfigurationMap(androidx.arch.core.util.Function<T, com.google.common.util.concurrent.ListenableFuture<java.lang.Void>> function) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        androidx.core.util.Pair<androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void>, T> pair = this.getHighSpeedVideoSizes;
        if (pair != null) {
            androidx.camera.core.impl.utils.futures.Futures.propagate(function.apply(pair.second), (androidx.concurrent.futures.CallbackToFutureAdapter.Completer) java.util.Objects.requireNonNull(this.getHighSpeedVideoSizes.first));
            this.getHighSpeedVideoSizes = null;
        }
    }
}
