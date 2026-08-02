package androidx.camera.viewfinder.core.impl;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u0000 \u000e2\u00020\u0001:\u0005\u000e\u000f\u0010\u0011\u0012J5\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH&¢\u0006\u0004\b\f\u0010\r\u0082\u0001\u0003\u0013\u0014\u0015ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/viewfinder/core/impl/PixelCopyCompat;", "", "Landroid/view/Surface;", "source", "Landroid/graphics/Bitmap;", "dest", "Ljava/util/concurrent/Executor;", "executor", "Landroidx/core/util/Consumer;", "", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "requestImpl", "(Landroid/view/Surface;Landroid/graphics/Bitmap;Ljava/util/concurrent/Executor;Landroidx/core/util/Consumer;)V", "Companion", "PixelCopyApi24Impl", "PixelCopyApi34Impl", "PixelCopyStub", "CopyResultStatus", "Landroidx/camera/viewfinder/core/impl/PixelCopyCompat$PixelCopyApi24Impl;", "Landroidx/camera/viewfinder/core/impl/PixelCopyCompat$PixelCopyApi34Impl;", "Landroidx/camera/viewfinder/core/impl/PixelCopyCompat$PixelCopyStub;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface PixelCopyCompat {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.viewfinder.core.impl.PixelCopyCompat.Companion INSTANCE = androidx.camera.viewfinder.core.impl.PixelCopyCompat.Companion.getHighSpeedVideoFpsRangesFor;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.TYPE_USE})
    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0010\u001b\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000"}, d2 = {"Landroidx/camera/viewfinder/core/impl/PixelCopyCompat$CopyResultStatus;", ""}, k = 1, mv = {2, 1, 0}, xi = 48)
    @kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.VALUE_PARAMETER, kotlin.annotation.AnnotationTarget.TYPE})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.SOURCE)
    public @interface CopyResultStatus {
    }

    void requestImpl(android.view.Surface source, android.graphics.Bitmap dest, java.util.concurrent.Executor executor, androidx.core.util.Consumer<java.lang.Integer> listener);

    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ5\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Landroidx/camera/viewfinder/core/impl/PixelCopyCompat$Companion;", "", "<init>", "()V", "Landroid/view/Surface;", "source", "Landroid/graphics/Bitmap;", "dest", "", "timeoutMs", "", "requestSync", "(Landroid/view/Surface;Landroid/graphics/Bitmap;J)I", "Ljava/util/concurrent/Executor;", "executor", "Landroidx/core/util/Consumer;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "request", "(Landroid/view/Surface;Landroid/graphics/Bitmap;Ljava/util/concurrent/Executor;Landroidx/core/util/Consumer;)V", "Landroidx/camera/viewfinder/core/impl/PixelCopyCompat;", "Camera2StreamConfigurationMap", "Lkotlin/Lazy;", "getHighResolutionOutputSizeshNQ4ISI", "()Landroidx/camera/viewfinder/core/impl/PixelCopyCompat;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        static final /* synthetic */ androidx.camera.viewfinder.core.impl.PixelCopyCompat.Companion getHighSpeedVideoFpsRangesFor = new androidx.camera.viewfinder.core.impl.PixelCopyCompat.Companion();

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private static final kotlin.Lazy<androidx.camera.viewfinder.core.impl.PixelCopyCompat> getHighSpeedVideoFpsRanges = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: androidx.camera.viewfinder.core.impl.PixelCopyCompat$Companion$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                androidx.camera.viewfinder.core.impl.PixelCopyCompat highSpeedVideoFpsRanges;
                highSpeedVideoFpsRanges = androidx.camera.viewfinder.core.impl.PixelCopyCompat.Companion.getHighSpeedVideoFpsRanges();
                return highSpeedVideoFpsRanges;
            }
        });

        private Companion() {
        }

        public static /* synthetic */ int requestSync$default(androidx.camera.viewfinder.core.impl.PixelCopyCompat.Companion companion, android.view.Surface surface, android.graphics.Bitmap bitmap, long j, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                j = -1;
            }
            return companion.requestSync(surface, bitmap, j);
        }

        @kotlin.jvm.JvmStatic
        public final void request(android.view.Surface source, android.graphics.Bitmap dest, java.util.concurrent.Executor executor, androidx.core.util.Consumer<java.lang.Integer> listener) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
            getHighResolutionOutputSizeshNQ4ISI().requestImpl(source, dest, executor, listener);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final androidx.camera.viewfinder.core.impl.PixelCopyCompat getHighResolutionOutputSizeshNQ4ISI() {
            return getHighSpeedVideoFpsRanges.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final androidx.camera.viewfinder.core.impl.PixelCopyCompat getHighSpeedVideoFpsRanges() {
            if (android.os.Build.VERSION.SDK_INT >= 34) {
                return androidx.camera.viewfinder.core.impl.PixelCopyCompat.PixelCopyApi34Impl.INSTANCE;
            }
            return androidx.camera.viewfinder.core.impl.PixelCopyCompat.PixelCopyApi24Impl.INSTANCE;
        }

        @kotlin.jvm.JvmStatic
        public final int requestSync(android.view.Surface source, android.graphics.Bitmap dest, long timeoutMs) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
            androidx.tracing.Trace.beginSection("PixelCopyCompat.requestSync");
            try {
                final kotlinx.atomicfu.AtomicInt atomic = kotlinx.atomicfu.AtomicFU.atomic(2);
                final java.util.concurrent.Semaphore semaphore = new java.util.concurrent.Semaphore(0);
                getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI().requestImpl(source, dest, new androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$viewfinderArgs$2$1$$ExternalSyntheticLambda0(), new androidx.core.util.Consumer() { // from class: androidx.camera.viewfinder.core.impl.PixelCopyCompat$Companion$requestSync$1$2
                    @Override // androidx.core.util.Consumer
                    /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                    public final void accept(java.lang.Integer num) {
                        kotlinx.atomicfu.AtomicInt atomicInt = kotlinx.atomicfu.AtomicInt.this;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(num);
                        atomicInt.setValue(num.intValue());
                        semaphore.release();
                    }
                });
                if (timeoutMs >= 0) {
                    semaphore.tryAcquire(timeoutMs, java.util.concurrent.TimeUnit.MILLISECONDS);
                } else {
                    semaphore.acquire();
                }
                return atomic.getValue();
            } finally {
                androidx.tracing.Trace.endSection();
            }
        }

        @kotlin.jvm.JvmStatic
        public final int requestSync(android.view.Surface surface, android.graphics.Bitmap bitmap) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(surface, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "");
            return requestSync$default(this, surface, bitmap, 0L, 4, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\n\u001a\u00020\b2(\u0010\t\u001a$\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0006\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\u0006\u0012\u0004\u0012\u00020\b0\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\u0014\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\n\u001a\u00020\u00168\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00198\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001a"}, d2 = {"Landroidx/camera/viewfinder/core/impl/PixelCopyCompat$PixelCopyApi24Impl;", "Landroidx/camera/viewfinder/core/impl/PixelCopyCompat;", "<init>", "()V", "Lkotlin/Function2;", "Landroid/os/Handler;", "Lkotlin/ParameterName;", "Lkotlin/Function0;", "", "p0", "getHighSpeedVideoFpsRanges", "(Lkotlin/jvm/functions/Function2;)V", "Landroid/view/Surface;", "Landroid/graphics/Bitmap;", "p1", "Ljava/util/concurrent/Executor;", "p2", "Landroidx/core/util/Consumer;", "", "p3", "requestImpl", "(Landroid/view/Surface;Landroid/graphics/Bitmap;Ljava/util/concurrent/Executor;Landroidx/core/util/Consumer;)V", "", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/Object;", "Landroidx/camera/viewfinder/core/impl/RefCounted;", "Landroidx/camera/viewfinder/core/impl/RefCounted;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class PixelCopyApi24Impl implements androidx.camera.viewfinder.core.impl.PixelCopyCompat {

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private static androidx.camera.viewfinder.core.impl.RefCounted<android.os.Handler> Camera2StreamConfigurationMap;
        public static final androidx.camera.viewfinder.core.impl.PixelCopyCompat.PixelCopyApi24Impl INSTANCE = new androidx.camera.viewfinder.core.impl.PixelCopyCompat.PixelCopyApi24Impl();

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private static final java.lang.Object getHighSpeedVideoFpsRanges = new java.lang.Object();

        private PixelCopyApi24Impl() {
        }

        private final void getHighSpeedVideoFpsRanges(kotlin.jvm.functions.Function2<? super android.os.Handler, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit> p0) {
            kotlin.Pair pair;
            android.os.Handler acquire;
            synchronized (getHighSpeedVideoFpsRanges) {
                androidx.camera.viewfinder.core.impl.RefCounted<android.os.Handler> refCounted = Camera2StreamConfigurationMap;
                if (refCounted == null || (acquire = refCounted.acquire()) == null) {
                    final android.os.HandlerThread handlerThread = new android.os.HandlerThread("pixelCopyRequest Thread");
                    handlerThread.start();
                    android.os.Handler createAsync = androidx.core.os.HandlerCompat.createAsync(handlerThread.getLooper());
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createAsync, "");
                    androidx.camera.viewfinder.core.impl.RefCounted<android.os.Handler> refCounted2 = new androidx.camera.viewfinder.core.impl.RefCounted<>(false, new kotlin.jvm.functions.Function1() { // from class: androidx.camera.viewfinder.core.impl.PixelCopyCompat$PixelCopyApi24Impl$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            kotlin.Unit highSpeedVideoFpsRangesFor;
                            highSpeedVideoFpsRangesFor = androidx.camera.viewfinder.core.impl.PixelCopyCompat.PixelCopyApi24Impl.getHighSpeedVideoFpsRangesFor(handlerThread, (android.os.Handler) obj);
                            return highSpeedVideoFpsRangesFor;
                        }
                    });
                    refCounted2.initialize(createAsync);
                    Camera2StreamConfigurationMap = refCounted2;
                    pair = new kotlin.Pair(createAsync, refCounted2);
                } else {
                    pair = new kotlin.Pair(acquire, refCounted);
                }
            }
            android.os.Handler handler = (android.os.Handler) pair.component1();
            final androidx.camera.viewfinder.core.impl.RefCounted refCounted3 = (androidx.camera.viewfinder.core.impl.RefCounted) pair.component2();
            refCounted3.acquire();
            if (!handler.postDelayed(new java.lang.Runnable() { // from class: androidx.camera.viewfinder.core.impl.PixelCopyCompat$PixelCopyApi24Impl$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.viewfinder.core.impl.PixelCopyCompat.PixelCopyApi24Impl.getHighSpeedVideoSizes(androidx.camera.viewfinder.core.impl.RefCounted.this);
                }
            }, 500L)) {
                throw new java.lang.AssertionError("Handler thread killed unexpectedly.");
            }
            p0.invoke(handler, new androidx.camera.viewfinder.core.impl.PixelCopyCompat$PixelCopyApi24Impl$withHandlerScope$3(refCounted3));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(android.os.HandlerThread handlerThread, android.os.Handler handler) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "");
            handlerThread.quit();
            return kotlin.Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void getHighSpeedVideoSizes(androidx.camera.viewfinder.core.impl.RefCounted refCounted) {
            refCounted.release();
        }

        @Override // androidx.camera.viewfinder.core.impl.PixelCopyCompat
        public final void requestImpl(final android.view.Surface p0, final android.graphics.Bitmap p1, final java.util.concurrent.Executor p2, final androidx.core.util.Consumer<java.lang.Integer> p3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "");
            androidx.tracing.Trace.beginAsyncSection("PixelCopyApi24Impl.request", p1.hashCode());
            getHighSpeedVideoFpsRanges(new kotlin.jvm.functions.Function2() { // from class: androidx.camera.viewfinder.core.impl.PixelCopyCompat$PixelCopyApi24Impl$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    kotlin.Unit highSpeedVideoFpsRangesFor;
                    highSpeedVideoFpsRangesFor = androidx.camera.viewfinder.core.impl.PixelCopyCompat.PixelCopyApi24Impl.getHighSpeedVideoFpsRangesFor(p0, p1, p2, p3, (android.os.Handler) obj, (kotlin.jvm.functions.Function0) obj2);
                    return highSpeedVideoFpsRangesFor;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(android.view.Surface surface, final android.graphics.Bitmap bitmap, final java.util.concurrent.Executor executor, final androidx.core.util.Consumer consumer, android.os.Handler handler, final kotlin.jvm.functions.Function0 function0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
            android.view.PixelCopy.request(surface, bitmap, new android.view.PixelCopy.OnPixelCopyFinishedListener() { // from class: androidx.camera.viewfinder.core.impl.PixelCopyCompat$PixelCopyApi24Impl$$ExternalSyntheticLambda0
                @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                public final void onPixelCopyFinished(int i) {
                    androidx.camera.viewfinder.core.impl.PixelCopyCompat.PixelCopyApi24Impl.getHighSpeedVideoFpsRanges(bitmap, executor, function0, consumer, i);
                }
            }, handler);
            return kotlin.Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void getHighSpeedVideoFpsRanges(android.graphics.Bitmap bitmap, java.util.concurrent.Executor executor, kotlin.jvm.functions.Function0 function0, final androidx.core.util.Consumer consumer, final int i) {
            androidx.tracing.Trace.endAsyncSection("PixelCopyApi24Impl.request", bitmap.hashCode());
            try {
                executor.execute(new java.lang.Runnable() { // from class: androidx.camera.viewfinder.core.impl.PixelCopyCompat$PixelCopyApi24Impl$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.camera.viewfinder.core.impl.PixelCopyCompat.PixelCopyApi24Impl.getHighSpeedVideoFpsRangesFor(androidx.core.util.Consumer.this, i);
                    }
                });
            } finally {
                function0.invoke();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void getHighSpeedVideoFpsRangesFor(androidx.core.util.Consumer consumer, int i) {
            consumer.accept(java.lang.Integer.valueOf(i));
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/camera/viewfinder/core/impl/PixelCopyCompat$PixelCopyApi34Impl;", "Landroidx/camera/viewfinder/core/impl/PixelCopyCompat;", "<init>", "()V", "Landroid/view/Surface;", "p0", "Landroid/graphics/Bitmap;", "p1", "Ljava/util/concurrent/Executor;", "p2", "Landroidx/core/util/Consumer;", "", "p3", "", "requestImpl", "(Landroid/view/Surface;Landroid/graphics/Bitmap;Ljava/util/concurrent/Executor;Landroidx/core/util/Consumer;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class PixelCopyApi34Impl implements androidx.camera.viewfinder.core.impl.PixelCopyCompat {
        public static final androidx.camera.viewfinder.core.impl.PixelCopyCompat.PixelCopyApi34Impl INSTANCE = new androidx.camera.viewfinder.core.impl.PixelCopyCompat.PixelCopyApi34Impl();

        private PixelCopyApi34Impl() {
        }

        @Override // androidx.camera.viewfinder.core.impl.PixelCopyCompat
        public final void requestImpl(android.view.Surface p0, final android.graphics.Bitmap p1, java.util.concurrent.Executor p2, final androidx.core.util.Consumer<java.lang.Integer> p3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "");
            androidx.tracing.Trace.beginAsyncSection("PixelCopyApi34Impl.request", p1.hashCode());
            android.view.PixelCopy.Request build = android.view.PixelCopy.Request.Builder.ofSurface(p0).setDestinationBitmap(p1).build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
            android.view.PixelCopy.request(build, p2, new java.util.function.Consumer() { // from class: androidx.camera.viewfinder.core.impl.PixelCopyCompat$PixelCopyApi34Impl$$ExternalSyntheticLambda0
                @Override // java.util.function.Consumer
                public final void accept(java.lang.Object obj) {
                    androidx.camera.viewfinder.core.impl.PixelCopyCompat.PixelCopyApi34Impl.W_(p1, p3, (android.view.PixelCopy.Result) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void W_(android.graphics.Bitmap bitmap, androidx.core.util.Consumer consumer, android.view.PixelCopy.Result result) {
            androidx.tracing.Trace.endAsyncSection("PixelCopyApi34Impl.request", bitmap.hashCode());
            consumer.accept(java.lang.Integer.valueOf(result.getStatus()));
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/camera/viewfinder/core/impl/PixelCopyCompat$PixelCopyStub;", "Landroidx/camera/viewfinder/core/impl/PixelCopyCompat;", "<init>", "()V", "Landroid/view/Surface;", "p0", "Landroid/graphics/Bitmap;", "p1", "Ljava/util/concurrent/Executor;", "p2", "Landroidx/core/util/Consumer;", "", "p3", "", "requestImpl", "(Landroid/view/Surface;Landroid/graphics/Bitmap;Ljava/util/concurrent/Executor;Landroidx/core/util/Consumer;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class PixelCopyStub implements androidx.camera.viewfinder.core.impl.PixelCopyCompat {
        public static final androidx.camera.viewfinder.core.impl.PixelCopyCompat.PixelCopyStub INSTANCE = new androidx.camera.viewfinder.core.impl.PixelCopyCompat.PixelCopyStub();

        private PixelCopyStub() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void getHighSpeedVideoSizes(androidx.core.util.Consumer consumer) {
            consumer.accept(1);
        }

        @Override // androidx.camera.viewfinder.core.impl.PixelCopyCompat
        public final void requestImpl(android.view.Surface p0, android.graphics.Bitmap p1, java.util.concurrent.Executor p2, final androidx.core.util.Consumer<java.lang.Integer> p3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "");
            p2.execute(new java.lang.Runnable() { // from class: androidx.camera.viewfinder.core.impl.PixelCopyCompat$PixelCopyStub$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.viewfinder.core.impl.PixelCopyCompat.PixelCopyStub.getHighSpeedVideoSizes(androidx.core.util.Consumer.this);
                }
            });
        }
    }

    @kotlin.jvm.JvmStatic
    static int requestSync(android.view.Surface surface, android.graphics.Bitmap bitmap, long j) {
        return INSTANCE.requestSync(surface, bitmap, j);
    }

    @kotlin.jvm.JvmStatic
    static int requestSync(android.view.Surface surface, android.graphics.Bitmap bitmap) {
        return INSTANCE.requestSync(surface, bitmap);
    }

    @kotlin.jvm.JvmStatic
    static void request(android.view.Surface surface, android.graphics.Bitmap bitmap, java.util.concurrent.Executor executor, androidx.core.util.Consumer<java.lang.Integer> consumer) {
        INSTANCE.request(surface, bitmap, executor, consumer);
    }
}
