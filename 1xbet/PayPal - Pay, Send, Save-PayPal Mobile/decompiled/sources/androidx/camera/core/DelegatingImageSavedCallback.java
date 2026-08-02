package androidx.camera.core;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0017\u001a\f\u0012\b\u0012\u0006*\u00020\u00010\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/camera/core/DelegatingImageSavedCallback;", "Landroidx/camera/core/ImageCapture$OnImageSavedCallback;", "p0", "<init>", "(Landroidx/camera/core/ImageCapture$OnImageSavedCallback;)V", "", "onCaptureStarted", "()V", "", "onCaptureProcessProgressed", "(I)V", "Landroid/graphics/Bitmap;", "onPostviewBitmapAvailable", "(Landroid/graphics/Bitmap;)V", "Landroidx/camera/core/ImageCapture$OutputFileResults;", "onImageSaved", "(Landroidx/camera/core/ImageCapture$OutputFileResults;)V", "Landroidx/camera/core/ImageCaptureException;", "onError", "(Landroidx/camera/core/ImageCaptureException;)V", "Ljava/util/concurrent/atomic/AtomicReference;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/concurrent/atomic/AtomicReference;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DelegatingImageSavedCallback implements androidx.camera.core.ImageCapture.OnImageSavedCallback {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    final java.util.concurrent.atomic.AtomicReference<androidx.camera.core.ImageCapture.OnImageSavedCallback> getHighSpeedVideoFpsRanges;

    public DelegatingImageSavedCallback(androidx.camera.core.ImageCapture.OnImageSavedCallback onImageSavedCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onImageSavedCallback, "");
        this.getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicReference<>(onImageSavedCallback);
    }

    @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
    public final void onCaptureProcessProgressed(int p0) {
        androidx.camera.core.ImageCapture.OnImageSavedCallback onImageSavedCallback = this.getHighSpeedVideoFpsRanges.get();
        if (onImageSavedCallback != null) {
            onImageSavedCallback.onCaptureProcessProgressed(p0);
        }
    }

    @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
    public final void onCaptureStarted() {
        androidx.camera.core.ImageCapture.OnImageSavedCallback onImageSavedCallback = this.getHighSpeedVideoFpsRanges.get();
        if (onImageSavedCallback != null) {
            onImageSavedCallback.onCaptureStarted();
        }
    }

    @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
    public final void onError(androidx.camera.core.ImageCaptureException p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        androidx.camera.core.ImageCapture.OnImageSavedCallback onImageSavedCallback = this.getHighSpeedVideoFpsRanges.get();
        if (onImageSavedCallback != null) {
            onImageSavedCallback.onError(p0);
        }
    }

    @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
    public final void onImageSaved(androidx.camera.core.ImageCapture.OutputFileResults p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        androidx.camera.core.ImageCapture.OnImageSavedCallback onImageSavedCallback = this.getHighSpeedVideoFpsRanges.get();
        if (onImageSavedCallback != null) {
            onImageSavedCallback.onImageSaved(p0);
        }
    }

    @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
    public final void onPostviewBitmapAvailable(android.graphics.Bitmap p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        androidx.camera.core.ImageCapture.OnImageSavedCallback onImageSavedCallback = this.getHighSpeedVideoFpsRanges.get();
        if (onImageSavedCallback != null) {
            onImageSavedCallback.onPostviewBitmapAvailable(p0);
        }
    }
}
