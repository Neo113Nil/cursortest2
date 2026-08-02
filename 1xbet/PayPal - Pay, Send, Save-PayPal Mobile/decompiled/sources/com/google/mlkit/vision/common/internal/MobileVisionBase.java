package com.google.mlkit.vision.common.internal;

/* loaded from: classes.dex */
public class MobileVisionBase<DetectionResultT> implements java.io.Closeable, androidx.view.LifecycleObserver {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.common.internal.GmsLogger zzb = new com.google.android.gms.common.internal.GmsLogger("MobileVisionBase", "");
    private final java.util.concurrent.atomic.AtomicBoolean zzc = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final com.google.mlkit.common.sdkinternal.MLTask zzd;
    private final com.google.android.gms.tasks.CancellationTokenSource zze;
    private final java.util.concurrent.Executor zzf;
    private final com.google.android.gms.tasks.Task zzg;

    public MobileVisionBase(com.google.mlkit.common.sdkinternal.MLTask<DetectionResultT, com.google.mlkit.vision.common.InputImage> mLTask, java.util.concurrent.Executor executor) {
        this.zzd = mLTask;
        com.google.android.gms.tasks.CancellationTokenSource cancellationTokenSource = new com.google.android.gms.tasks.CancellationTokenSource();
        this.zze = cancellationTokenSource;
        this.zzf = executor;
        mLTask.pin();
        this.zzg = mLTask.callAfterLoad(executor, new java.util.concurrent.Callable() { // from class: com.google.mlkit.vision.common.internal.zzb
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                int i = com.google.mlkit.vision.common.internal.MobileVisionBase.zza;
                return null;
            }
        }, cancellationTokenSource.getToken()).addOnFailureListener(new com.google.android.gms.tasks.OnFailureListener() { // from class: com.google.mlkit.vision.common.internal.zzc
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(java.lang.Exception exc) {
                com.google.mlkit.vision.common.internal.MobileVisionBase.zzb.e("MobileVisionBase", "Error preloading model resource", exc);
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, com.google.mlkit.vision.barcode.BarcodeScanner
    @androidx.view.OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_DESTROY)
    public void close() {
        synchronized (this) {
            if (this.zzc.getAndSet(true)) {
                return;
            }
            this.zze.cancel();
            this.zzd.unpin(this.zzf);
        }
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> closeWithTask() {
        synchronized (this) {
            if (this.zzc.getAndSet(true)) {
                return com.google.android.gms.tasks.Tasks.forResult(null);
            }
            this.zze.cancel();
            return this.zzd.unpinWithTask(this.zzf);
        }
    }

    public com.google.android.gms.tasks.Task<DetectionResultT> process(android.graphics.Bitmap bitmap, int i) {
        return processBase(com.google.mlkit.vision.common.InputImage.fromBitmap(bitmap, i));
    }

    public com.google.android.gms.tasks.Task<DetectionResultT> processBase(final com.google.android.odml.image.MlImage mlImage) {
        synchronized (this) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(mlImage, "MlImage can not be null");
            if (this.zzc.get()) {
                return com.google.android.gms.tasks.Tasks.forException(new com.google.mlkit.common.MlKitException("This detector is already closed!", 14));
            }
            if (mlImage.getWidth() < 32 || mlImage.getHeight() < 32) {
                return com.google.android.gms.tasks.Tasks.forException(new com.google.mlkit.common.MlKitException("MlImage width and height should be at least 32!", 3));
            }
            mlImage.getInternal().acquire();
            return this.zzd.callAfterLoad(this.zzf, new java.util.concurrent.Callable() { // from class: com.google.mlkit.vision.common.internal.zzd
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    return com.google.mlkit.vision.common.internal.MobileVisionBase.this.zzb(mlImage);
                }
            }, this.zze.getToken()).addOnCompleteListener(new com.google.android.gms.tasks.OnCompleteListener() { // from class: com.google.mlkit.vision.common.internal.zze
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(com.google.android.gms.tasks.Task task) {
                    com.google.android.odml.image.MlImage mlImage2 = com.google.android.odml.image.MlImage.this;
                    int i = com.google.mlkit.vision.common.internal.MobileVisionBase.zza;
                    mlImage2.close();
                }
            });
        }
    }

    final /* synthetic */ java.lang.Object zza(com.google.mlkit.vision.common.InputImage inputImage) throws java.lang.Exception {
        com.google.android.gms.internal.mlkit_vision_common.zzlx zze = com.google.android.gms.internal.mlkit_vision_common.zzlx.zze("detectorTaskWithResource#run");
        zze.zzb();
        try {
            java.lang.Object run = this.zzd.run(inputImage);
            zze.close();
            return run;
        } catch (java.lang.Throwable th) {
            try {
                zze.close();
            } catch (java.lang.Throwable th2) {
                try {
                    java.lang.Throwable.class.getDeclaredMethod("addSuppressed", java.lang.Throwable.class).invoke(th, th2);
                } catch (java.lang.Exception unused) {
                }
            }
            throw th;
        }
    }

    final /* synthetic */ java.lang.Object zzb(com.google.android.odml.image.MlImage mlImage) throws java.lang.Exception {
        com.google.mlkit.vision.common.InputImage convertMlImagetoInputImage = com.google.mlkit.vision.common.internal.CommonConvertUtils.convertMlImagetoInputImage(mlImage);
        if (convertMlImagetoInputImage != null) {
            return this.zzd.run(convertMlImagetoInputImage);
        }
        throw new com.google.mlkit.common.MlKitException("Current type of MlImage is not supported.", 13);
    }

    public com.google.android.gms.tasks.Task<DetectionResultT> process(android.media.Image image, int i) {
        return processBase(com.google.mlkit.vision.common.InputImage.fromMediaImage(image, i));
    }

    public com.google.android.gms.tasks.Task<DetectionResultT> process(android.media.Image image, int i, android.graphics.Matrix matrix) {
        return processBase(com.google.mlkit.vision.common.InputImage.fromMediaImage(image, i, matrix));
    }

    public com.google.android.gms.tasks.Task<DetectionResultT> process(java.nio.ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
        return processBase(com.google.mlkit.vision.common.InputImage.fromByteBuffer(byteBuffer, i, i2, i3, i4));
    }

    public com.google.android.gms.tasks.Task<DetectionResultT> processBase(final com.google.mlkit.vision.common.InputImage inputImage) {
        synchronized (this) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(inputImage, "InputImage can not be null");
            if (this.zzc.get()) {
                return com.google.android.gms.tasks.Tasks.forException(new com.google.mlkit.common.MlKitException("This detector is already closed!", 14));
            }
            if (inputImage.getWidth() < 32 || inputImage.getHeight() < 32) {
                return com.google.android.gms.tasks.Tasks.forException(new com.google.mlkit.common.MlKitException("InputImage width and height should be at least 32!", 3));
            }
            return this.zzd.callAfterLoad(this.zzf, new java.util.concurrent.Callable() { // from class: com.google.mlkit.vision.common.internal.zza
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    return com.google.mlkit.vision.common.internal.MobileVisionBase.this.zza(inputImage);
                }
            }, this.zze.getToken());
        }
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> getInitTaskBase() {
        com.google.android.gms.tasks.Task<java.lang.Void> task;
        synchronized (this) {
            task = this.zzg;
        }
        return task;
    }
}
