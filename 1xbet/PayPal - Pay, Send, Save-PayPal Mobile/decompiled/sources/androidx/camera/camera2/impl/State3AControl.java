package androidx.camera.camera2.impl;

@androidx.camera.camera2.config.CameraScope
@kotlin.Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002WXB!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0010J\u001b\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\f\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\u00020\u000e2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010\u001f\u001a\u00020\u000e2\n\u0010#\u001a\u00060!j\u0002`\"H\u0002¢\u0006\u0004\b\u001f\u0010$J\r\u0010%\u001a\u00020\u000b¢\u0006\u0004\b%\u0010&J)\u0010\u001f\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\u00122\b\u0010(\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u001f\u0010)R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00102\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00106\u001a\u0002038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00109\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001f\u00108R(\u0010>\u001a\u0004\u0018\u0001072\b\u0010\f\u001a\u0004\u0018\u0001078W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R \u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0@0?8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010D\u001a\u00020C8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010A\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b/\u0010FR\u0016\u0010-\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b2\u0010FR\u0016\u0010G\u001a\u00020\u00128\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u00104\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b6\u0010IR\u0018\u0010J\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b9\u0010IR\u0011\u0010L\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\bK\u0010&R\u0011\u0010N\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\bM\u0010&R\u0011\u0010Q\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0013\u0010T\u001a\u0004\u0018\u00010\u000b8G¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0013\u0010V\u001a\u0004\u0018\u00010\u000b8G¢\u0006\u0006\u001a\u0004\bU\u0010S"}, d2 = {"Landroidx/camera/camera2/impl/State3AControl;", "Landroidx/camera/camera2/impl/UseCaseCameraControl;", "Landroidx/camera/camera2/impl/UseCaseManager$RunningUseCasesChangeListener;", "Landroidx/camera/camera2/impl/CameraProperties;", "cameraProperties", "Landroidx/camera/camera2/compat/workaround/AutoFlashAEModeDisabler;", "aeModeDisabler", "Landroidx/camera/camera2/impl/UseCaseThreads;", "threads", "<init>", "(Landroidx/camera/camera2/impl/CameraProperties;Landroidx/camera/camera2/compat/workaround/AutoFlashAEModeDisabler;Landroidx/camera/camera2/impl/UseCaseThreads;)V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lkotlinx/coroutines/Deferred;", "", "setFlashModeAsync", "(I)Lkotlinx/coroutines/Deferred;", "setTemplateAsync", "", "setTryExternalFlashAeModeAsync", "(Z)Lkotlinx/coroutines/Deferred;", "setPreferredAeModeAsync", "(Ljava/lang/Integer;)Lkotlinx/coroutines/Deferred;", "setPreferredFocusModeAsync", "reset", "()V", "", "Landroidx/camera/core/UseCase;", "runningUseCases", "onRunningUseCasesChanged", "(Ljava/util/Set;)V", "getHighSpeedVideoFpsRanges", "()Lkotlinx/coroutines/Deferred;", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "p0", "(Ljava/lang/Exception;)V", "getFinalSupportedAeMode", "()I", "p1", "p2", "(IZLjava/lang/Integer;)I", "Landroidx/camera/camera2/impl/CameraProperties;", "getCameraProperties", "()Landroidx/camera/camera2/impl/CameraProperties;", "getOutputMinFrameDuration", "Landroidx/camera/camera2/compat/workaround/AutoFlashAEModeDisabler;", "Camera2StreamConfigurationMap", "getOutputStallDurationlomOqCM", "Landroidx/camera/camera2/impl/UseCaseThreads;", "getHighSpeedVideoSizes", "", "getHighSpeedVideoSizesFor", "Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "getHighSpeedVideoFpsRangesFor", "getRequestControl", "()Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "setRequestControl", "(Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;)V", "requestControl", "", "Lkotlinx/coroutines/CompletableDeferred;", "getInputFormats", "Ljava/util/List;", "", "getOutputFormats", "J", com.visa.cbp.getEncExpo.warmup, "getInputSizeshNQ4ISI", "Z", "Ljava/lang/Integer;", "getOutputSizes", "getFlashMode", "flashMode", "getTemplate", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.TEMPLATE, "getTryExternalFlashAeMode", "()Z", "tryExternalFlashAeMode", "getPreferredAeMode", "()Ljava/lang/Integer;", "preferredAeMode", "getPreferredFocusMode", "preferredFocusMode", "StateSnapshot", "Bindings"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class State3AControl implements androidx.camera.camera2.impl.UseCaseCameraControl, androidx.camera.camera2.impl.UseCaseManager.RunningUseCasesChangeListener {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private int getInputFormats;
    private final androidx.camera.camera2.impl.CameraProperties cameraProperties;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private java.lang.Integer getHighSpeedVideoSizesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private androidx.camera.camera2.impl.UseCaseCameraRequestControl getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private java.lang.Integer getOutputSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private int getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final java.lang.Object getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final java.util.List<kotlinx.coroutines.CompletableDeferred<kotlin.Unit>> getHighSpeedVideoFpsRanges;
    private boolean getInputSizeshNQ4ISI;
    private long getOutputFormats;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final androidx.camera.camera2.compat.workaround.AutoFlashAEModeDisabler Camera2StreamConfigurationMap;

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    private final androidx.camera.camera2.impl.UseCaseThreads getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/camera/camera2/impl/State3AControl$Bindings;", "", "<init>", "()V", "Landroidx/camera/camera2/impl/State3AControl;", "state3AControl", "Landroidx/camera/camera2/impl/UseCaseCameraControl;", "provideControls", "(Landroidx/camera/camera2/impl/State3AControl;)Landroidx/camera/camera2/impl/UseCaseCameraControl;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @dagger.Module
    public static abstract class Bindings {
        @dagger.Binds
        @dagger.multibindings.IntoSet
        public abstract androidx.camera.camera2.impl.UseCaseCameraControl provideControls(androidx.camera.camera2.impl.State3AControl state3AControl);
    }

    @javax.inject.Inject
    public State3AControl(androidx.camera.camera2.impl.CameraProperties cameraProperties, androidx.camera.camera2.compat.workaround.AutoFlashAEModeDisabler autoFlashAEModeDisabler, androidx.camera.camera2.impl.UseCaseThreads useCaseThreads) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraProperties, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoFlashAEModeDisabler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCaseThreads, "");
        this.cameraProperties = cameraProperties;
        this.Camera2StreamConfigurationMap = autoFlashAEModeDisabler;
        this.getHighSpeedVideoSizes = useCaseThreads;
        this.getHighResolutionOutputSizeshNQ4ISI = new java.lang.Object();
        this.getHighSpeedVideoFpsRanges = new java.util.ArrayList();
        this.getInputFormats = 2;
        this.getOutputMinFrameDuration = 1;
    }

    public final androidx.camera.camera2.impl.CameraProperties getCameraProperties() {
        return this.cameraProperties;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    /* renamed from: getRequestControl, reason: from getter */
    public final androidx.camera.camera2.impl.UseCaseCameraRequestControl getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public final void setRequestControl(androidx.camera.camera2.impl.UseCaseCameraRequestControl useCaseCameraRequestControl) {
        this.getHighSpeedVideoFpsRangesFor = useCaseCameraRequestControl;
        getHighSpeedVideoFpsRanges();
    }

    public final int getFlashMode() {
        int i;
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            i = this.getInputFormats;
        }
        return i;
    }

    public final int getTemplate() {
        int i;
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            i = this.getOutputMinFrameDuration;
        }
        return i;
    }

    public final boolean getTryExternalFlashAeMode() {
        boolean z;
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            z = this.getInputSizeshNQ4ISI;
        }
        return z;
    }

    public final java.lang.Integer getPreferredAeMode() {
        java.lang.Integer num;
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            num = this.getHighSpeedVideoSizesFor;
        }
        return num;
    }

    public final java.lang.Integer getPreferredFocusMode() {
        java.lang.Integer num;
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            num = this.getOutputSizes;
        }
        return num;
    }

    public final kotlinx.coroutines.Deferred<kotlin.Unit> setFlashModeAsync(int value) {
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            this.getInputFormats = value;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        return getHighSpeedVideoFpsRanges();
    }

    public final kotlinx.coroutines.Deferred<kotlin.Unit> setTemplateAsync(int value) {
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            this.getOutputMinFrameDuration = value;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        return getHighSpeedVideoFpsRanges();
    }

    public final kotlinx.coroutines.Deferred<kotlin.Unit> setTryExternalFlashAeModeAsync(boolean value) {
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            this.getInputSizeshNQ4ISI = value;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        return getHighSpeedVideoFpsRanges();
    }

    public final kotlinx.coroutines.Deferred<kotlin.Unit> setPreferredAeModeAsync(java.lang.Integer value) {
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            this.getHighSpeedVideoSizesFor = value;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        return getHighSpeedVideoFpsRanges();
    }

    public final kotlinx.coroutines.Deferred<kotlin.Unit> setPreferredFocusModeAsync(java.lang.Integer value) {
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            this.getOutputSizes = value;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        return getHighSpeedVideoFpsRanges();
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public final void reset() {
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            this.getInputSizeshNQ4ISI = false;
            this.getHighSpeedVideoSizesFor = null;
            this.getOutputSizes = null;
            this.getInputFormats = 2;
            this.getOutputMinFrameDuration = 1;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        getHighSpeedVideoFpsRanges();
    }

    @Override // androidx.camera.camera2.impl.UseCaseManager.RunningUseCasesChangeListener
    public final void onRunningUseCasesChanged(java.util.Set<? extends androidx.camera.core.UseCase> runningUseCases) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runningUseCases, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoSizes.getSequentialScope(), null, null, new androidx.camera.camera2.impl.State3AControl$onRunningUseCasesChanged$$inlined$confineLaunch$1(null, kotlin.collections.CollectionsKt.toSet(runningUseCases), this), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlinx.coroutines.Deferred<kotlin.Unit> getHighSpeedVideoFpsRanges() {
        kotlinx.coroutines.CompletableDeferred<kotlin.Unit> CompletableDeferred$default = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        kotlin.jvm.internal.Ref.LongRef longRef = new kotlin.jvm.internal.Ref.LongRef();
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            this.getHighSpeedVideoFpsRanges.add(CompletableDeferred$default);
            long j = this.getOutputFormats + 1;
            this.getOutputFormats = j;
            longRef.element = j;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoSizes.getSequentialScope(), null, null, new androidx.camera.camera2.impl.State3AControl$update$$inlined$confineLaunch$1(null, this, longRef), 3, null);
        return CompletableDeferred$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(java.util.List list, androidx.camera.camera2.impl.State3AControl state3AControl, java.lang.Throwable th) {
        if (th != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                ((kotlinx.coroutines.CompletableDeferred) it.next()).completeExceptionally(th);
            }
        } else {
            java.util.Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((kotlinx.coroutines.CompletableDeferred) it2.next()).complete(kotlin.Unit.INSTANCE);
            }
        }
        synchronized (state3AControl.getHighResolutionOutputSizeshNQ4ISI) {
            state3AControl.getHighSpeedVideoFpsRanges.removeAll(list);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        return kotlin.Unit.INSTANCE;
    }

    private final void getHighSpeedVideoFpsRanges(java.lang.Exception p0) {
        java.util.List list;
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            list = kotlin.collections.CollectionsKt.toList(this.getHighSpeedVideoFpsRanges);
            this.getHighSpeedVideoFpsRanges.clear();
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((kotlinx.coroutines.CompletableDeferred) it.next()).completeExceptionally(p0);
        }
    }

    public final int getFinalSupportedAeMode() {
        int supportedAeMode;
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            supportedAeMode = androidx.camera.camera2.impl.CameraMetadataIntegrationKt.getSupportedAeMode(this.cameraProperties.getMetadata(), getHighSpeedVideoFpsRanges(this.getInputFormats, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoSizesFor));
        }
        return supportedAeMode;
    }

    private final int getHighSpeedVideoFpsRanges(int p0, boolean p1, java.lang.Integer p2) {
        int correctedAeMode;
        if (p2 != null) {
            correctedAeMode = p2.intValue();
        } else if (p0 != 0) {
            correctedAeMode = p0 != 1 ? 1 : 3;
        } else {
            correctedAeMode = this.Camera2StreamConfigurationMap.getCorrectedAeMode(2);
        }
        if (p1 && androidx.camera.camera2.impl.CameraMetadataIntegrationKt.isExternalFlashAeModeSupported(this.cameraProperties.getMetadata())) {
            androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
            if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
            }
            correctedAeMode = 5;
        }
        androidx.camera.camera2.impl.Camera2Logger camera2Logger2 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
            java.lang.String unused2 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
        }
        return correctedAeMode;
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\f\b\u0082\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u000eR\u001a\u0010\u0017\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0012\u0010\u001bR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b"}, d2 = {"Landroidx/camera/camera2/impl/State3AControl$StateSnapshot;", "", "", "p0", "p1", "", "p2", "p3", "p4", "<init>", "(IIZLjava/lang/Integer;Ljava/lang/Integer;)V", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "Z", "getHighResolutionOutputSizeshNQ4ISI", "()Z", "Camera2StreamConfigurationMap", "Ljava/lang/Integer;", "()Ljava/lang/Integer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final /* data */ class StateSnapshot {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final java.lang.Integer getHighSpeedVideoFpsRanges;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final java.lang.Integer Camera2StreamConfigurationMap;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final boolean getHighResolutionOutputSizeshNQ4ISI;
        private final int getHighSpeedVideoFpsRangesFor;
        private final int getHighSpeedVideoSizes;

        public StateSnapshot(int i, int i2, boolean z, java.lang.Integer num, java.lang.Integer num2) {
            this.getHighSpeedVideoSizes = i;
            this.getHighSpeedVideoFpsRangesFor = i2;
            this.getHighResolutionOutputSizeshNQ4ISI = z;
            this.getHighSpeedVideoFpsRanges = num;
            this.Camera2StreamConfigurationMap = num2;
        }

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from getter */
        public final int getGetHighSpeedVideoSizes() {
            return this.getHighSpeedVideoSizes;
        }

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from getter */
        public final int getGetHighSpeedVideoFpsRangesFor() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from getter */
        public final boolean getGetHighResolutionOutputSizeshNQ4ISI() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        /* renamed from: getHighSpeedVideoSizes, reason: from getter */
        public final java.lang.Integer getGetHighSpeedVideoFpsRanges() {
            return this.getHighSpeedVideoFpsRanges;
        }

        /* renamed from: Camera2StreamConfigurationMap, reason: from getter */
        public final java.lang.Integer getCamera2StreamConfigurationMap() {
            return this.Camera2StreamConfigurationMap;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("StateSnapshot(getHighSpeedVideoSizes=");
            sb.append(this.getHighSpeedVideoSizes);
            sb.append(", getHighSpeedVideoFpsRangesFor=");
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            sb.append(", getHighResolutionOutputSizeshNQ4ISI=");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            sb.append(", getHighSpeedVideoFpsRanges=");
            sb.append(this.getHighSpeedVideoFpsRanges);
            sb.append(", Camera2StreamConfigurationMap=");
            sb.append(this.Camera2StreamConfigurationMap);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = java.lang.Integer.hashCode(this.getHighSpeedVideoSizes);
            int hashCode2 = java.lang.Integer.hashCode(this.getHighSpeedVideoFpsRangesFor);
            int hashCode3 = java.lang.Boolean.hashCode(this.getHighResolutionOutputSizeshNQ4ISI);
            java.lang.Integer num = this.getHighSpeedVideoFpsRanges;
            int hashCode4 = num == null ? 0 : num.hashCode();
            java.lang.Integer num2 = this.Camera2StreamConfigurationMap;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (num2 != null ? num2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof androidx.camera.camera2.impl.State3AControl.StateSnapshot)) {
                return false;
            }
            androidx.camera.camera2.impl.State3AControl.StateSnapshot stateSnapshot = (androidx.camera.camera2.impl.State3AControl.StateSnapshot) p0;
            return this.getHighSpeedVideoSizes == stateSnapshot.getHighSpeedVideoSizes && this.getHighSpeedVideoFpsRangesFor == stateSnapshot.getHighSpeedVideoFpsRangesFor && this.getHighResolutionOutputSizeshNQ4ISI == stateSnapshot.getHighResolutionOutputSizeshNQ4ISI && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, stateSnapshot.getHighSpeedVideoFpsRanges) && kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, stateSnapshot.Camera2StreamConfigurationMap);
        }
    }

    public static final /* synthetic */ void access$applyUpdate(final androidx.camera.camera2.impl.State3AControl state3AControl, long j) {
        boolean z;
        androidx.camera.camera2.impl.State3AControl.StateSnapshot stateSnapshot;
        int i;
        final java.util.List list;
        androidx.camera.camera2.impl.UseCaseCameraRequestControl getHighResolutionOutputSizeshNQ4ISI = state3AControl.getGetHighResolutionOutputSizeshNQ4ISI();
        if (getHighResolutionOutputSizeshNQ4ISI == null) {
            state3AControl.getHighSpeedVideoFpsRanges(new androidx.camera.core.CameraControl.OperationCanceledException("Camera is not active."));
            return;
        }
        synchronized (state3AControl.getHighResolutionOutputSizeshNQ4ISI) {
            z = j == state3AControl.getOutputFormats;
        }
        if (z) {
            synchronized (state3AControl.getHighResolutionOutputSizeshNQ4ISI) {
                stateSnapshot = new androidx.camera.camera2.impl.State3AControl.StateSnapshot(state3AControl.getInputFormats, state3AControl.getOutputMinFrameDuration, state3AControl.getInputSizeshNQ4ISI, state3AControl.getHighSpeedVideoSizesFor, state3AControl.getOutputSizes);
            }
            int highSpeedVideoFpsRanges = state3AControl.getHighSpeedVideoFpsRanges(stateSnapshot.getGetHighSpeedVideoSizes(), stateSnapshot.getGetHighResolutionOutputSizeshNQ4ISI(), stateSnapshot.getGetHighSpeedVideoFpsRanges());
            java.lang.Integer camera2StreamConfigurationMap = stateSnapshot.getCamera2StreamConfigurationMap();
            if (camera2StreamConfigurationMap != null) {
                i = camera2StreamConfigurationMap.intValue();
            } else {
                int getHighSpeedVideoFpsRangesFor = stateSnapshot.getGetHighSpeedVideoFpsRangesFor();
                i = (getHighSpeedVideoFpsRangesFor == 1 || getHighSpeedVideoFpsRangesFor != 3) ? 4 : 3;
            }
            try {
                kotlinx.coroutines.Deferred submitParameters$default = androidx.camera.camera2.impl.UseCaseCameraRequestControl.submitParameters$default(getHighResolutionOutputSizeshNQ4ISI, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE, java.lang.Integer.valueOf(androidx.camera.camera2.impl.CameraMetadataIntegrationKt.getSupportedAeMode(state3AControl.cameraProperties.getMetadata(), highSpeedVideoFpsRanges))), kotlin.TuplesKt.to(android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE, java.lang.Integer.valueOf(androidx.camera.camera2.impl.CameraMetadataIntegrationKt.getSupportedAfMode(state3AControl.cameraProperties.getMetadata(), i))), kotlin.TuplesKt.to(android.hardware.camera2.CaptureRequest.CONTROL_AWB_MODE, java.lang.Integer.valueOf(androidx.camera.camera2.impl.CameraMetadataIntegrationKt.getSupportedAwbMode(state3AControl.cameraProperties.getMetadata(), 1)))), null, null, 6, null);
                synchronized (state3AControl.getHighResolutionOutputSizeshNQ4ISI) {
                    list = kotlin.collections.CollectionsKt.toList(state3AControl.getHighSpeedVideoFpsRanges);
                }
                submitParameters$default.invokeOnCompletion(new kotlin.jvm.functions.Function1() { // from class: androidx.camera.camera2.impl.State3AControl$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.Unit highSpeedVideoFpsRangesFor;
                        highSpeedVideoFpsRangesFor = androidx.camera.camera2.impl.State3AControl.getHighSpeedVideoFpsRangesFor(list, state3AControl, (java.lang.Throwable) obj);
                        return highSpeedVideoFpsRangesFor;
                    }
                });
            } catch (java.lang.Exception e) {
                state3AControl.getHighSpeedVideoFpsRanges(e);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ int access$calculateTemplateFromUseCases(androidx.camera.camera2.impl.State3AControl state3AControl, java.util.Set set) {
        androidx.camera.core.impl.CaptureConfig repeatingCaptureConfig;
        androidx.camera.core.impl.SessionConfig validSessionConfigOrNull = new androidx.camera.camera2.adapter.SessionConfigAdapter(set, false, 2, 0 == true ? 1 : 0).getValidSessionConfigOrNull();
        if (validSessionConfigOrNull == null || (repeatingCaptureConfig = validSessionConfigOrNull.getRepeatingCaptureConfig()) == null) {
            return 1;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(repeatingCaptureConfig.getTemplateType());
        java.lang.Integer num = valueOf.intValue() != -1 ? valueOf : null;
        if (num != null) {
            return num.intValue();
        }
        return 1;
    }
}
