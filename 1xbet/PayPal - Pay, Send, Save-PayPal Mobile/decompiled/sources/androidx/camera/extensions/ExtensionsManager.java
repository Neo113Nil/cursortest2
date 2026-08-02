package androidx.camera.extensions;

@kotlin.Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 42\u00020\u0001:\u000254B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001e\u0010\u0019J\u0017\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b\"\u0010#J\u0015\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b'\u0010(J\u0017\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020)H\u0000¢\u0006\u0004\b,\u0010-R\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b2\u00103"}, d2 = {"Landroidx/camera/extensions/ExtensionsManager;", "", "Landroidx/camera/extensions/ExtensionsManager$ExtensionsAvailability;", "extensionsAvailability", "Landroidx/camera/core/CameraProvider;", "cameraProvider", "Landroid/content/Context;", "applicationContext", "<init>", "(Landroidx/camera/extensions/ExtensionsManager$ExtensionsAvailability;Landroidx/camera/core/CameraProvider;Landroid/content/Context;)V", "Lcom/google/common/util/concurrent/ListenableFuture;", "Ljava/lang/Void;", "shutdown", "()Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/camera/core/CameraSelector;", "cameraSelector", "", "mode", "getExtensionEnabledCameraSelector", "(Landroidx/camera/core/CameraSelector;I)Landroidx/camera/core/CameraSelector;", "Landroidx/camera/core/CameraFilter;", "getExtensionCameraFilterAndInjectCameraConfig$camera_extensions", "(I)Landroidx/camera/core/CameraFilter;", "", "isExtensionAvailable", "(Landroidx/camera/core/CameraSelector;I)Z", "Landroid/util/Range;", "", "getEstimatedCaptureLatencyRange", "(Landroidx/camera/core/CameraSelector;I)Landroid/util/Range;", "isImageAnalysisSupported", "Landroidx/camera/core/CameraControl;", "cameraControl", "Landroidx/camera/extensions/CameraExtensionsControl;", "getCameraExtensionsControl", "(Landroidx/camera/core/CameraControl;)Landroidx/camera/extensions/CameraExtensionsControl;", "Landroidx/camera/core/CameraInfo;", "cameraInfo", "Landroidx/camera/extensions/CameraExtensionsInfo;", "getCameraExtensionsInfo", "(Landroidx/camera/core/CameraInfo;)Landroidx/camera/extensions/CameraExtensionsInfo;", "Landroidx/camera/extensions/VendorExtenderFactory;", "vendorExtenderFactory", "", "setVendorExtenderFactory$camera_extensions", "(Landroidx/camera/extensions/VendorExtenderFactory;)V", "Landroidx/camera/extensions/ExtensionsManager$ExtensionsAvailability;", "getExtensionsAvailability$camera_extensions", "()Landroidx/camera/extensions/ExtensionsManager$ExtensionsAvailability;", "Landroidx/camera/extensions/ExtensionsInfo;", "getHighSpeedVideoFpsRanges", "Landroidx/camera/extensions/ExtensionsInfo;", "Companion", "ExtensionsAvailability"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ExtensionsManager {
    private static com.google.common.util.concurrent.ListenableFuture<java.lang.Void> Camera2StreamConfigurationMap;
    private static com.google.common.util.concurrent.ListenableFuture<androidx.camera.extensions.ExtensionsManager> getHighResolutionOutputSizeshNQ4ISI;
    private static androidx.camera.extensions.ExtensionsManager getHighSpeedVideoFpsRangesFor;
    private final androidx.camera.extensions.ExtensionsManager.ExtensionsAvailability extensionsAvailability;
    private final androidx.camera.extensions.ExtensionsInfo getHighSpeedVideoFpsRanges;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.extensions.ExtensionsManager.Companion INSTANCE = new androidx.camera.extensions.ExtensionsManager.Companion(null);
    private static final java.lang.Object getHighSpeedVideoSizes = new java.lang.Object();

    public ExtensionsManager(androidx.camera.extensions.ExtensionsManager.ExtensionsAvailability extensionsAvailability, androidx.camera.core.CameraProvider cameraProvider, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extensionsAvailability, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.extensionsAvailability = extensionsAvailability;
        this.getHighSpeedVideoFpsRanges = new androidx.camera.extensions.ExtensionsInfo(cameraProvider, context);
    }

    /* renamed from: getExtensionsAvailability$camera_extensions, reason: from getter */
    public final androidx.camera.extensions.ExtensionsManager.ExtensionsAvailability getExtensionsAvailability() {
        return this.extensionsAvailability;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Landroidx/camera/extensions/ExtensionsManager$ExtensionsAvailability;", "", "<init>", "(Ljava/lang/String;I)V", "LIBRARY_AVAILABLE", "LIBRARY_UNAVAILABLE_ERROR_LOADING", "LIBRARY_UNAVAILABLE_MISSING_IMPLEMENTATION", "NONE"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ExtensionsAvailability {
        private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
        private static final /* synthetic */ androidx.camera.extensions.ExtensionsManager.ExtensionsAvailability[] $VALUES;
        public static final androidx.camera.extensions.ExtensionsManager.ExtensionsAvailability LIBRARY_AVAILABLE = new androidx.camera.extensions.ExtensionsManager.ExtensionsAvailability("LIBRARY_AVAILABLE", 0);
        public static final androidx.camera.extensions.ExtensionsManager.ExtensionsAvailability LIBRARY_UNAVAILABLE_ERROR_LOADING = new androidx.camera.extensions.ExtensionsManager.ExtensionsAvailability("LIBRARY_UNAVAILABLE_ERROR_LOADING", 1);
        public static final androidx.camera.extensions.ExtensionsManager.ExtensionsAvailability LIBRARY_UNAVAILABLE_MISSING_IMPLEMENTATION = new androidx.camera.extensions.ExtensionsManager.ExtensionsAvailability("LIBRARY_UNAVAILABLE_MISSING_IMPLEMENTATION", 2);
        public static final androidx.camera.extensions.ExtensionsManager.ExtensionsAvailability NONE = new androidx.camera.extensions.ExtensionsManager.ExtensionsAvailability("NONE", 3);

        private ExtensionsAvailability(java.lang.String str, int i) {
        }

        static {
            androidx.camera.extensions.ExtensionsManager.ExtensionsAvailability[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
        }

        public static androidx.camera.extensions.ExtensionsManager.ExtensionsAvailability[] values() {
            return (androidx.camera.extensions.ExtensionsManager.ExtensionsAvailability[]) $VALUES.clone();
        }

        public static androidx.camera.extensions.ExtensionsManager.ExtensionsAvailability valueOf(java.lang.String str) {
            return (androidx.camera.extensions.ExtensionsManager.ExtensionsAvailability) java.lang.Enum.valueOf(androidx.camera.extensions.ExtensionsManager.ExtensionsAvailability.class, str);
        }

        public static kotlin.enums.EnumEntries<androidx.camera.extensions.ExtensionsManager.ExtensionsAvailability> getEntries() {
            return $ENTRIES;
        }

        private static final /* synthetic */ androidx.camera.extensions.ExtensionsManager.ExtensionsAvailability[] $values() {
            return new androidx.camera.extensions.ExtensionsManager.ExtensionsAvailability[]{LIBRARY_AVAILABLE, LIBRARY_UNAVAILABLE_ERROR_LOADING, LIBRARY_UNAVAILABLE_MISSING_IMPLEMENTATION, NONE};
        }
    }

    public final com.google.common.util.concurrent.ListenableFuture<java.lang.Void> shutdown() {
        synchronized (getHighSpeedVideoSizes) {
            com.google.common.util.concurrent.ListenableFuture<androidx.camera.extensions.ExtensionsManager> listenableFuture = getHighResolutionOutputSizeshNQ4ISI;
            if (listenableFuture == null) {
                com.google.common.util.concurrent.ListenableFuture<java.lang.Void> immediateFuture = androidx.camera.core.impl.utils.futures.Futures.immediateFuture(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(immediateFuture, "");
                return immediateFuture;
            }
            com.google.common.util.concurrent.ListenableFuture<java.lang.Void> listenableFuture2 = Camera2StreamConfigurationMap;
            if (listenableFuture2 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(listenableFuture2);
                return listenableFuture2;
            }
            try {
                kotlin.jvm.internal.Intrinsics.checkNotNull(listenableFuture);
                listenableFuture.get();
                getHighResolutionOutputSizeshNQ4ISI = null;
                androidx.camera.extensions.ExtensionsManager extensionsManager = getHighSpeedVideoFpsRangesFor;
                kotlin.jvm.internal.Intrinsics.checkNotNull(extensionsManager);
                androidx.camera.extensions.ExtensionsManager.ExtensionsAvailability extensionsAvailability = extensionsManager.extensionsAvailability;
                getHighSpeedVideoFpsRangesFor = null;
                androidx.camera.core.impl.ExtendedCameraConfigProviderStore.clear();
                com.google.common.util.concurrent.ListenableFuture<java.lang.Void> immediateFuture2 = androidx.camera.core.impl.utils.futures.Futures.immediateFuture(null);
                Camera2StreamConfigurationMap = immediateFuture2;
                kotlin.jvm.internal.Intrinsics.checkNotNull(immediateFuture2);
                return immediateFuture2;
            } catch (java.lang.InterruptedException e) {
                com.google.common.util.concurrent.ListenableFuture<java.lang.Void> immediateFailedFuture = androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(e);
                Camera2StreamConfigurationMap = immediateFailedFuture;
                kotlin.jvm.internal.Intrinsics.checkNotNull(immediateFailedFuture);
                return immediateFailedFuture;
            } catch (java.util.concurrent.ExecutionException e2) {
                com.google.common.util.concurrent.ListenableFuture<java.lang.Void> immediateFailedFuture2 = androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(e2);
                Camera2StreamConfigurationMap = immediateFailedFuture2;
                kotlin.jvm.internal.Intrinsics.checkNotNull(immediateFailedFuture2);
                return immediateFailedFuture2;
            }
        }
    }

    public final androidx.camera.core.CameraSelector getExtensionEnabledCameraSelector(androidx.camera.core.CameraSelector cameraSelector, int mode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraSelector, "");
        if (mode == 0) {
            return cameraSelector;
        }
        if (this.extensionsAvailability != androidx.camera.extensions.ExtensionsManager.ExtensionsAvailability.LIBRARY_AVAILABLE) {
            throw new java.lang.IllegalArgumentException("This device doesn't support extensions function! isExtensionAvailable should be checked first before calling getExtensionEnabledCameraSelector.".toString());
        }
        androidx.camera.extensions.ExtensionsInfo extensionsInfo = this.getHighSpeedVideoFpsRanges;
        if (!extensionsInfo.getHighSpeedVideoFpsRangesFor(cameraSelector, mode)) {
            throw new java.lang.IllegalArgumentException("No camera can be found to support the specified extensions mode! isExtensionAvailable should be checked first before calling getExtensionEnabledCameraSelector.");
        }
        java.util.Iterator<androidx.camera.core.CameraFilter> it = cameraSelector.getCameraFilterSet().iterator();
        while (it.hasNext()) {
            if (it.next() instanceof androidx.camera.extensions.ExtensionCameraFilter) {
                throw new java.lang.IllegalArgumentException("An extension is already applied to the base CameraSelector.");
            }
        }
        extensionsInfo.getHighSpeedVideoFpsRangesFor(mode);
        androidx.camera.core.CameraSelector.Builder fromSelector = androidx.camera.core.CameraSelector.Builder.fromSelector(cameraSelector);
        fromSelector.addCameraFilter(new androidx.camera.extensions.ExtensionCameraFilter(androidx.camera.extensions.ExtensionsInfo.getHighSpeedVideoFpsRanges(mode), extensionsInfo.getHighResolutionOutputSizeshNQ4ISI.createVendorExtender(mode)));
        androidx.camera.core.CameraSelector build = fromSelector.build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
        return build;
    }

    public final androidx.camera.core.CameraFilter getExtensionCameraFilterAndInjectCameraConfig$camera_extensions(int mode) {
        if (mode == 0) {
            return null;
        }
        if (this.extensionsAvailability != androidx.camera.extensions.ExtensionsManager.ExtensionsAvailability.LIBRARY_AVAILABLE) {
            throw new java.lang.IllegalArgumentException("This device doesn't support extensions function! isExtensionAvailable should be checked first before calling getExtensionEnabledCameraSelector.".toString());
        }
        this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor(mode);
        return new androidx.camera.extensions.ExtensionCameraFilter(androidx.camera.extensions.ExtensionsInfo.getHighSpeedVideoFpsRanges(mode), this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI.createVendorExtender(mode));
    }

    public final boolean isExtensionAvailable(androidx.camera.core.CameraSelector cameraSelector, int mode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraSelector, "");
        if (mode == 0) {
            return true;
        }
        if (this.extensionsAvailability != androidx.camera.extensions.ExtensionsManager.ExtensionsAvailability.LIBRARY_AVAILABLE) {
            return false;
        }
        return this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor(cameraSelector, mode);
    }

    public final android.util.Range<java.lang.Long> getEstimatedCaptureLatencyRange(androidx.camera.core.CameraSelector cameraSelector, int mode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraSelector, "");
        if (mode == 0 || this.extensionsAvailability != androidx.camera.extensions.ExtensionsManager.ExtensionsAvailability.LIBRARY_AVAILABLE) {
            return null;
        }
        return this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap(cameraSelector, mode);
    }

    public final boolean isImageAnalysisSupported(androidx.camera.core.CameraSelector cameraSelector, int mode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraSelector, "");
        if (mode == 0) {
            return true;
        }
        if (this.extensionsAvailability != androidx.camera.extensions.ExtensionsManager.ExtensionsAvailability.LIBRARY_AVAILABLE) {
            return false;
        }
        androidx.camera.extensions.ExtensionsInfo extensionsInfo = this.getHighSpeedVideoFpsRanges;
        java.util.List<androidx.camera.core.CameraInfo> filter = androidx.camera.core.CameraSelector.Builder.fromSelector(cameraSelector).addCameraFilter(new androidx.camera.extensions.ExtensionCameraFilter(androidx.camera.extensions.ExtensionsInfo.getHighSpeedVideoFpsRanges(mode), extensionsInfo.getHighResolutionOutputSizeshNQ4ISI.createVendorExtender(mode))).build().filter(extensionsInfo.Camera2StreamConfigurationMap.getAvailableCameraInfos());
        if (!filter.isEmpty()) {
            androidx.camera.core.CameraInfo cameraInfo = filter.get(0);
            androidx.camera.extensions.internal.VendorExtender createVendorExtender = extensionsInfo.getHighResolutionOutputSizeshNQ4ISI.createVendorExtender(mode);
            createVendorExtender.init(cameraInfo);
            android.util.Size[] supportedYuvAnalysisResolutions = createVendorExtender.getSupportedYuvAnalysisResolutions();
            if (supportedYuvAnalysisResolutions != null && supportedYuvAnalysisResolutions.length > 0) {
                return true;
            }
        }
        return false;
    }

    public final androidx.camera.extensions.CameraExtensionsControl getCameraExtensionsControl(androidx.camera.core.CameraControl cameraControl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraControl, "");
        return androidx.camera.extensions.CameraExtensionsControls.getHighSpeedVideoSizes(cameraControl);
    }

    public final androidx.camera.extensions.CameraExtensionsInfo getCameraExtensionsInfo(androidx.camera.core.CameraInfo cameraInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraInfo, "");
        androidx.camera.extensions.CameraExtensionsInfo highSpeedVideoFpsRanges = androidx.camera.extensions.CameraExtensionsInfos.getHighSpeedVideoFpsRanges(cameraInfo);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(highSpeedVideoFpsRanges, "");
        return highSpeedVideoFpsRanges;
    }

    public final void setVendorExtenderFactory$camera_extensions(androidx.camera.extensions.VendorExtenderFactory vendorExtenderFactory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vendorExtenderFactory, "");
        this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI = vendorExtenderFactory;
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0011\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0087@¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001a"}, d2 = {"Landroidx/camera/extensions/ExtensionsManager$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/camera/core/CameraProvider;", "cameraProvider", "Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/camera/extensions/ExtensionsManager;", "getInstanceAsync", "(Landroid/content/Context;Landroidx/camera/core/CameraProvider;)Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/camera/extensions/ExtensionsManager$ExtensionsAvailability;", "extensionsAvailability", "applicationContext", "getOrCreateExtensionsManager", "(Landroidx/camera/extensions/ExtensionsManager$ExtensionsAvailability;Landroidx/camera/core/CameraProvider;Landroid/content/Context;)Landroidx/camera/extensions/ExtensionsManager;", "getInstance", "(Landroid/content/Context;Landroidx/camera/core/CameraProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/google/common/util/concurrent/ListenableFuture;", "Camera2StreamConfigurationMap", "Ljava/lang/Void;", "Landroidx/camera/extensions/ExtensionsManager;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final com.google.common.util.concurrent.ListenableFuture<androidx.camera.extensions.ExtensionsManager> getInstanceAsync(android.content.Context context, final androidx.camera.core.CameraProvider cameraProvider) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraProvider, "");
            synchronized (androidx.camera.extensions.ExtensionsManager.getHighSpeedVideoSizes) {
                com.google.common.util.concurrent.ListenableFuture listenableFuture = androidx.camera.extensions.ExtensionsManager.Camera2StreamConfigurationMap;
                if (listenableFuture != null && !listenableFuture.isDone()) {
                    throw new java.lang.IllegalStateException("Not yet done deinitializing extensions".toString());
                }
                androidx.camera.extensions.ExtensionsManager.Companion companion = androidx.camera.extensions.ExtensionsManager.INSTANCE;
                androidx.camera.extensions.ExtensionsManager.Camera2StreamConfigurationMap = null;
                final android.content.Context persistentApplicationContext = androidx.camera.core.impl.utils.ContextUtil.getPersistentApplicationContext(context);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(persistentApplicationContext, "");
                if (android.os.Build.VERSION.SDK_INT >= 33) {
                    if (androidx.camera.extensions.ExtensionsManager.getHighResolutionOutputSizeshNQ4ISI == null) {
                        androidx.camera.extensions.ExtensionsManager.Companion companion2 = androidx.camera.extensions.ExtensionsManager.INSTANCE;
                        androidx.camera.extensions.ExtensionsManager.getHighResolutionOutputSizeshNQ4ISI = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.extensions.ExtensionsManager$Companion$$ExternalSyntheticLambda0
                            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                            public final java.lang.Object attachCompleter(androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) {
                                java.lang.Object instanceAsync$lambda$0$1;
                                instanceAsync$lambda$0$1 = androidx.camera.extensions.ExtensionsManager.Companion.getInstanceAsync$lambda$0$1(persistentApplicationContext, cameraProvider, completer);
                                return instanceAsync$lambda$0$1;
                            }
                        });
                    }
                    com.google.common.util.concurrent.ListenableFuture<androidx.camera.extensions.ExtensionsManager> listenableFuture2 = androidx.camera.extensions.ExtensionsManager.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(listenableFuture2);
                    return listenableFuture2;
                }
                com.google.common.util.concurrent.ListenableFuture<androidx.camera.extensions.ExtensionsManager> immediateFuture = androidx.camera.core.impl.utils.futures.Futures.immediateFuture(androidx.camera.extensions.ExtensionsManager.INSTANCE.getOrCreateExtensionsManager(androidx.camera.extensions.ExtensionsManager.ExtensionsAvailability.NONE, cameraProvider, persistentApplicationContext));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(immediateFuture, "");
                return immediateFuture;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final java.lang.Object getInstanceAsync$lambda$0$1(android.content.Context context, androidx.camera.core.CameraProvider cameraProvider, androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) {
            java.lang.String str;
            androidx.camera.extensions.ExtensionsManager.ExtensionsAvailability extensionsAvailability;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(completer, "");
            android.hardware.camera2.CameraManager cameraManager = (android.hardware.camera2.CameraManager) context.getSystemService(android.hardware.camera2.CameraManager.class);
            kotlin.jvm.internal.Intrinsics.checkNotNull(cameraManager);
            androidx.camera.extensions.internal.Camera2ExtensionsInfo camera2ExtensionsInfo = new androidx.camera.extensions.internal.Camera2ExtensionsInfo(cameraManager);
            java.lang.String[] cameraIdList = cameraManager.getCameraIdList();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cameraIdList, "");
            java.lang.String[] strArr = cameraIdList;
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    str = null;
                    break;
                }
                str = strArr[i];
                java.lang.String str2 = str;
                kotlin.jvm.internal.Intrinsics.checkNotNull(str2);
                java.util.List<java.lang.Integer> supportedExtensions = camera2ExtensionsInfo.getExtensionCharacteristics(str2).getSupportedExtensions();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supportedExtensions, "");
                if (!supportedExtensions.isEmpty()) {
                    break;
                }
                i++;
            }
            boolean z = str != null;
            androidx.camera.extensions.ExtensionsManager.Companion companion = androidx.camera.extensions.ExtensionsManager.INSTANCE;
            if (!z) {
                extensionsAvailability = androidx.camera.extensions.ExtensionsManager.ExtensionsAvailability.NONE;
            } else {
                extensionsAvailability = androidx.camera.extensions.ExtensionsManager.ExtensionsAvailability.LIBRARY_AVAILABLE;
            }
            completer.set(companion.getOrCreateExtensionsManager(extensionsAvailability, cameraProvider, context));
            return "Initialize extensions";
        }

        private final androidx.camera.extensions.ExtensionsManager getOrCreateExtensionsManager(androidx.camera.extensions.ExtensionsManager.ExtensionsAvailability extensionsAvailability, androidx.camera.core.CameraProvider cameraProvider, android.content.Context applicationContext) {
            androidx.camera.extensions.ExtensionsManager extensionsManager;
            synchronized (androidx.camera.extensions.ExtensionsManager.getHighSpeedVideoSizes) {
                extensionsManager = androidx.camera.extensions.ExtensionsManager.getHighSpeedVideoFpsRangesFor;
                if (extensionsManager == null) {
                    extensionsManager = new androidx.camera.extensions.ExtensionsManager(extensionsAvailability, cameraProvider, applicationContext);
                    androidx.camera.extensions.ExtensionsManager.Companion companion = androidx.camera.extensions.ExtensionsManager.INSTANCE;
                    androidx.camera.extensions.ExtensionsManager.getHighSpeedVideoFpsRangesFor = extensionsManager;
                }
            }
            return extensionsManager;
        }

        @kotlin.jvm.JvmStatic
        public final java.lang.Object getInstance(android.content.Context context, androidx.camera.core.CameraProvider cameraProvider, kotlin.coroutines.Continuation<? super androidx.camera.extensions.ExtensionsManager> continuation) {
            return androidx.concurrent.futures.ListenableFutureKt.await(getInstanceAsync(context, cameraProvider), continuation);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final com.google.common.util.concurrent.ListenableFuture<androidx.camera.extensions.ExtensionsManager> getInstanceAsync(android.content.Context context, androidx.camera.core.CameraProvider cameraProvider) {
        return INSTANCE.getInstanceAsync(context, cameraProvider);
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.Object getInstance(android.content.Context context, androidx.camera.core.CameraProvider cameraProvider, kotlin.coroutines.Continuation<? super androidx.camera.extensions.ExtensionsManager> continuation) {
        return INSTANCE.getInstance(context, cameraProvider, continuation);
    }
}
