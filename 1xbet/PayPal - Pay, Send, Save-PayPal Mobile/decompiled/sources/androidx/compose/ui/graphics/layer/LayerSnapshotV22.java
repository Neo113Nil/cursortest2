package androidx.compose.ui.graphics.layer;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/graphics/layer/LayerSnapshotV22;", "Landroidx/compose/ui/graphics/layer/LayerSnapshotImpl;", "<init>", "()V", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "graphicsLayer", "Landroid/graphics/Bitmap;", "toBitmap", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LayerSnapshotV22 implements androidx.compose.ui.graphics.layer.LayerSnapshotImpl {
    public static final int $stable = 0;
    public static final androidx.compose.ui.graphics.layer.LayerSnapshotV22 INSTANCE = new androidx.compose.ui.graphics.layer.LayerSnapshotV22();

    private LayerSnapshotV22() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r10v14, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.AutoCloseable] */
    @Override // androidx.compose.ui.graphics.layer.LayerSnapshotImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object toBitmap(androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer, kotlin.coroutines.Continuation<? super android.graphics.Bitmap> continuation) {
        androidx.compose.ui.graphics.layer.LayerSnapshotV22$toBitmap$1 layerSnapshotV22$toBitmap$1;
        int i;
        android.media.ImageReader newInstance;
        java.lang.Throwable th;
        ?? r10;
        android.graphics.Bitmap highSpeedVideoFpsRanges;
        if (continuation instanceof androidx.compose.ui.graphics.layer.LayerSnapshotV22$toBitmap$1) {
            layerSnapshotV22$toBitmap$1 = (androidx.compose.ui.graphics.layer.LayerSnapshotV22$toBitmap$1) continuation;
            if ((layerSnapshotV22$toBitmap$1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                layerSnapshotV22$toBitmap$1.getOutputMinFrameDuration -= 2147483648;
                java.lang.Object obj = layerSnapshotV22$toBitmap$1.getInputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = layerSnapshotV22$toBitmap$1.getOutputMinFrameDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    long size = graphicsLayer.getSize();
                    android.os.Looper myLooper = android.os.Looper.myLooper();
                    if (myLooper == null) {
                        myLooper = android.os.Looper.getMainLooper();
                    }
                    newInstance = android.media.ImageReader.newInstance((int) (size >> 32), (int) (size & 4294967295L), 1, 1);
                    try {
                        android.media.ImageReader imageReader = newInstance;
                        layerSnapshotV22$toBitmap$1.getHighSpeedVideoSizes = graphicsLayer;
                        layerSnapshotV22$toBitmap$1.getHighSpeedVideoFpsRangesFor = myLooper;
                        layerSnapshotV22$toBitmap$1.Camera2StreamConfigurationMap = newInstance;
                        layerSnapshotV22$toBitmap$1.getHighSpeedVideoFpsRanges = imageReader;
                        layerSnapshotV22$toBitmap$1.getHighResolutionOutputSizeshNQ4ISI = layerSnapshotV22$toBitmap$1;
                        layerSnapshotV22$toBitmap$1.getOutputMinFrameDuration = 1;
                        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(layerSnapshotV22$toBitmap$1), 1);
                        cancellableContinuationImpl.initCancellability();
                        final kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
                        imageReader.setOnImageAvailableListener(new android.media.ImageReader.OnImageAvailableListener() { // from class: androidx.compose.ui.graphics.layer.LayerSnapshotV22$toBitmap$2$image$1$1
                            @Override // android.media.ImageReader.OnImageAvailableListener
                            public final void onImageAvailable(android.media.ImageReader imageReader2) {
                                kotlinx.coroutines.CancellableContinuation<android.media.Image> cancellableContinuation = cancellableContinuationImpl2;
                                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                                cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(imageReader2.acquireLatestImage()));
                            }
                        }, androidx.core.os.HandlerCompat.createAsync(myLooper));
                        android.view.Surface surface = imageReader.getSurface();
                        android.graphics.Canvas lockCanvas = androidx.compose.ui.graphics.layer.SurfaceUtils.INSTANCE.lockCanvas(surface);
                        try {
                            lockCanvas.drawColor(androidx.compose.ui.graphics.ColorKt.m6049toArgb8_81llA(androidx.compose.ui.graphics.Color.INSTANCE.m6022getBlack0d7_KjU()), android.graphics.PorterDuff.Mode.CLEAR);
                            graphicsLayer.draw$ui_graphics(androidx.compose.ui.graphics.AndroidCanvas_androidKt.Canvas(lockCanvas), null);
                            surface.unlockCanvasAndPost(lockCanvas);
                            obj = cancellableContinuationImpl.getResult();
                            if (obj == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(layerSnapshotV22$toBitmap$1);
                            }
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            r10 = newInstance;
                        } catch (java.lang.Throwable th2) {
                            surface.unlockCanvasAndPost(lockCanvas);
                            throw th2;
                        }
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r10 = (java.lang.AutoCloseable) layerSnapshotV22$toBitmap$1.Camera2StreamConfigurationMap;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        r10 = r10;
                    } catch (java.lang.Throwable th4) {
                        th = th4;
                        newInstance = r10;
                        try {
                            throw th;
                        } catch (java.lang.Throwable th5) {
                            kotlin.jdk7.AutoCloseableKt.closeFinally(newInstance, th);
                            throw th5;
                        }
                    }
                }
                highSpeedVideoFpsRanges = androidx.compose.ui.graphics.layer.LayerSnapshot_androidKt.getHighSpeedVideoFpsRanges((android.media.Image) obj);
                kotlin.jdk7.AutoCloseableKt.closeFinally(r10, null);
                return highSpeedVideoFpsRanges;
            }
        }
        layerSnapshotV22$toBitmap$1 = new androidx.compose.ui.graphics.layer.LayerSnapshotV22$toBitmap$1(this, continuation);
        java.lang.Object obj2 = layerSnapshotV22$toBitmap$1.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = layerSnapshotV22$toBitmap$1.getOutputMinFrameDuration;
        if (i != 0) {
        }
        highSpeedVideoFpsRanges = androidx.compose.ui.graphics.layer.LayerSnapshot_androidKt.getHighSpeedVideoFpsRanges((android.media.Image) obj2);
        kotlin.jdk7.AutoCloseableKt.closeFinally(r10, null);
        return highSpeedVideoFpsRanges;
    }
}
