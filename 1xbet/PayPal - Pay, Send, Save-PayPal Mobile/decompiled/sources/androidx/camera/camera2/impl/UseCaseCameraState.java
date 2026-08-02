package androidx.camera.camera2.impl;

@kotlin.Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002KLB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0092\u0001\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u001a\b\u0002\u0010\n\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u001a\b\u0002\u0010\u000e\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0010H\u0086@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0018H\u0086@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0018H\u0082@¢\u0006\u0004\b\u001e\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u0018¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u001e\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001c\u00105\u001a\b\u0012\u0004\u0012\u000202018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00108\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R$\u0010;\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\u0001098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010:R$\u0010'\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0004\u0012\u00020\u0001098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010:R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00110<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010=R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00150<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010=R\u0018\u0010*\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010@R\u0018\u0010.\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010BR\u0018\u00103\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010DR\u0018\u0010$\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010FR\u0018\u0010I\u001a\u00060GR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010HR\u0014\u0010J\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010/"}, d2 = {"Landroidx/camera/camera2/impl/UseCaseCameraState;", "", "Landroidx/camera/camera2/config/UseCaseGraphContext;", "useCaseGraphContext", "Landroidx/camera/camera2/compat/workaround/TemplateParamsOverride;", "templateParamsOverride", "<init>", "(Landroidx/camera/camera2/config/UseCaseGraphContext;Landroidx/camera/camera2/compat/workaround/TemplateParamsOverride;)V", "", "Landroid/hardware/camera2/CaptureRequest$Key;", "parameters", "", "appendParameters", "Landroidx/camera/camera2/pipe/Metadata$Key;", "internalParameters", "appendInternalParameters", "", "Landroidx/camera/camera2/pipe/StreamId;", "streams", "Landroidx/camera/camera2/pipe/RequestTemplate;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.TEMPLATE, "Landroidx/camera/camera2/pipe/Request$Listener;", "listeners", "Lkotlinx/coroutines/Deferred;", "", "updateAsync-Tp9XwKQ", "(Ljava/util/Map;ZLjava/util/Map;ZLjava/util/Set;Landroidx/camera/camera2/pipe/RequestTemplate;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateAsync", "tryStartRepeating", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "close", "()V", "getValidOutputFormatsForInputhNQ4ISI", "Landroidx/camera/camera2/config/UseCaseGraphContext;", "getHighSpeedVideoSizes", "getOutputSizes", "Landroidx/camera/camera2/compat/workaround/TemplateParamsOverride;", "getHighSpeedVideoFpsRanges", "getOutputFormats", "Ljava/lang/Object;", "Lkotlinx/coroutines/CompletableDeferred;", "getOutputStallDurationlomOqCM", "Lkotlinx/coroutines/CompletableDeferred;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/atomicfu/AtomicInt;", "getOutputSizeshNQ4ISI", "Lkotlinx/atomicfu/AtomicInt;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/collections/ArrayDeque;", "Landroidx/camera/camera2/impl/UseCaseCameraState$RequestSignal;", "getOutputStallDuration", "Lkotlin/collections/ArrayDeque;", "getHighSpeedVideoSizesFor", "toString", "Z", "getInputSizeshNQ4ISI", "", "Ljava/util/Map;", "getOutputMinFrameDuration", "", "Ljava/util/Set;", "getInputFormats", "getOutputMinFrameDurationlomOqCM", "Landroidx/camera/camera2/pipe/RequestTemplate;", "Landroidx/camera/camera2/pipe/AeMode;", "Landroidx/camera/camera2/pipe/AeMode;", "Landroidx/camera/camera2/pipe/AfMode;", "Landroidx/camera/camera2/pipe/AfMode;", "Landroidx/camera/camera2/pipe/AwbMode;", "Landroidx/camera/camera2/pipe/AwbMode;", "Landroidx/camera/camera2/impl/UseCaseCameraState$RequestListener;", "Landroidx/camera/camera2/impl/UseCaseCameraState$RequestListener;", "unwrapAs", "isOutputSupportedForhNQ4ISI", "RequestSignal", "RequestListener"}, k = 1, mv = {2, 1, 0}, xi = 48)
@androidx.camera.camera2.config.UseCaseCameraScope
/* loaded from: classes6.dex */
public final class UseCaseCameraState {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private androidx.camera.camera2.pipe.RequestTemplate getOutputStallDurationlomOqCM;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.Set<androidx.camera.camera2.pipe.StreamId> getInputFormats;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.Map<android.hardware.camera2.CaptureRequest.Key<?>, java.lang.Object> getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.Set<androidx.camera.camera2.pipe.Request.Listener> getOutputMinFrameDurationlomOqCM;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.Map<androidx.camera.camera2.pipe.Metadata.Key<?>, java.lang.Object> getOutputFormats;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final kotlinx.atomicfu.AtomicInt isOutputSupportedForhNQ4ISI;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private androidx.camera.camera2.pipe.AwbMode getOutputSizes;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.camera.camera2.pipe.AfMode getOutputStallDuration;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final java.lang.Object Camera2StreamConfigurationMap;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private androidx.camera.camera2.pipe.AeMode getOutputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
    private final androidx.camera.camera2.impl.UseCaseCameraState.RequestListener unwrapAs;

    /* renamed from: getOutputSizes, reason: from kotlin metadata */
    private final androidx.camera.camera2.compat.workaround.TemplateParamsOverride getHighSpeedVideoFpsRanges;

    /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.atomicfu.AtomicInt getHighSpeedVideoFpsRangesFor;

    /* renamed from: getOutputStallDuration, reason: from kotlin metadata */
    private kotlin.collections.ArrayDeque<androidx.camera.camera2.impl.UseCaseCameraState.RequestSignal> getHighSpeedVideoSizesFor;

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    private kotlinx.coroutines.CompletableDeferred<kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getValidOutputFormatsForInputhNQ4ISI, reason: from kotlin metadata */
    private final androidx.camera.camera2.config.UseCaseGraphContext getHighSpeedVideoSizes;

    /* renamed from: toString, reason: from kotlin metadata */
    private boolean getInputSizeshNQ4ISI;

    @javax.inject.Inject
    public UseCaseCameraState(androidx.camera.camera2.config.UseCaseGraphContext useCaseGraphContext, androidx.camera.camera2.compat.workaround.TemplateParamsOverride templateParamsOverride) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCaseGraphContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(templateParamsOverride, "");
        this.getHighSpeedVideoSizes = useCaseGraphContext;
        this.getHighSpeedVideoFpsRanges = templateParamsOverride;
        this.Camera2StreamConfigurationMap = new java.lang.Object();
        this.getHighSpeedVideoFpsRangesFor = kotlinx.atomicfu.AtomicFU.atomic(0);
        this.getHighSpeedVideoSizesFor = new kotlin.collections.ArrayDeque<>();
        this.getOutputMinFrameDuration = new java.util.LinkedHashMap();
        this.getOutputFormats = new java.util.LinkedHashMap();
        this.getInputFormats = new java.util.LinkedHashSet();
        this.getOutputMinFrameDurationlomOqCM = new java.util.LinkedHashSet();
        this.unwrapAs = new androidx.camera.camera2.impl.UseCaseCameraState.RequestListener();
        this.isOutputSupportedForhNQ4ISI = kotlinx.atomicfu.AtomicFU.atomic(0);
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\nJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\f"}, d2 = {"Landroidx/camera/camera2/impl/UseCaseCameraState$RequestSignal;", "", "", "requestNo", "Lkotlinx/coroutines/CompletableDeferred;", "", com.datadog.android.ndk.internal.NdkCrashLog.SIGNAL_KEY_NAME, "<init>", "(ILkotlinx/coroutines/CompletableDeferred;)V", "component1", "()I", "component2", "()Lkotlinx/coroutines/CompletableDeferred;", "copy", "(ILkotlinx/coroutines/CompletableDeferred;)Landroidx/camera/camera2/impl/UseCaseCameraState$RequestSignal;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getRequestNo", "Lkotlinx/coroutines/CompletableDeferred;", "getSignal"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RequestSignal {
        private final int requestNo;
        private final kotlinx.coroutines.CompletableDeferred<kotlin.Unit> signal;

        public RequestSignal(int i, kotlinx.coroutines.CompletableDeferred<kotlin.Unit> completableDeferred) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(completableDeferred, "");
            this.requestNo = i;
            this.signal = completableDeferred;
        }

        public final int getRequestNo() {
            return this.requestNo;
        }

        public final kotlinx.coroutines.CompletableDeferred<kotlin.Unit> getSignal() {
            return this.signal;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RequestSignal(requestNo=");
            sb.append(this.requestNo);
            sb.append(", signal=");
            sb.append(this.signal);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Integer.hashCode(this.requestNo) * 31) + this.signal.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof androidx.camera.camera2.impl.UseCaseCameraState.RequestSignal)) {
                return false;
            }
            androidx.camera.camera2.impl.UseCaseCameraState.RequestSignal requestSignal = (androidx.camera.camera2.impl.UseCaseCameraState.RequestSignal) other;
            return this.requestNo == requestSignal.requestNo && kotlin.jvm.internal.Intrinsics.areEqual(this.signal, requestSignal.signal);
        }

        public final androidx.camera.camera2.impl.UseCaseCameraState.RequestSignal copy(int requestNo, kotlinx.coroutines.CompletableDeferred<kotlin.Unit> signal) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signal, "");
            return new androidx.camera.camera2.impl.UseCaseCameraState.RequestSignal(requestNo, signal);
        }

        public final kotlinx.coroutines.CompletableDeferred<kotlin.Unit> component2() {
            return this.signal;
        }

        /* renamed from: component1, reason: from getter */
        public final int getRequestNo() {
            return this.requestNo;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ androidx.camera.camera2.impl.UseCaseCameraState.RequestSignal copy$default(androidx.camera.camera2.impl.UseCaseCameraState.RequestSignal requestSignal, int i, kotlinx.coroutines.CompletableDeferred completableDeferred, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = requestSignal.requestNo;
            }
            if ((i2 & 2) != 0) {
                completableDeferred = requestSignal.signal;
            }
            return requestSignal.copy(i, completableDeferred);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r6v4, types: [T, java.lang.Object, kotlinx.coroutines.CompletableDeferred<kotlin.Unit>] */
    /* renamed from: updateAsync-Tp9XwKQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object m143updateAsyncTp9XwKQ(java.util.Map<android.hardware.camera2.CaptureRequest.Key<?>, ? extends java.lang.Object> map, boolean z, java.util.Map<androidx.camera.camera2.pipe.Metadata.Key<?>, ? extends java.lang.Object> map2, boolean z2, java.util.Set<androidx.camera.camera2.pipe.StreamId> set, androidx.camera.camera2.pipe.RequestTemplate requestTemplate, java.util.Set<? extends androidx.camera.camera2.pipe.Request.Listener> set2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.Deferred<kotlin.Unit>> continuation) {
        androidx.camera.camera2.impl.UseCaseCameraState$updateAsync$1 useCaseCameraState$updateAsync$1;
        int i;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        if (continuation instanceof androidx.camera.camera2.impl.UseCaseCameraState$updateAsync$1) {
            useCaseCameraState$updateAsync$1 = (androidx.camera.camera2.impl.UseCaseCameraState$updateAsync$1) continuation;
            if ((useCaseCameraState$updateAsync$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                useCaseCameraState$updateAsync$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = useCaseCameraState$updateAsync$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = useCaseCameraState$updateAsync$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.internal.Ref.ObjectRef objectRef2 = new kotlin.jvm.internal.Ref.ObjectRef();
                    synchronized (this.Camera2StreamConfigurationMap) {
                        androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                            java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                            java.util.Objects.toString(map);
                            java.util.Objects.toString(map2);
                            java.util.Objects.toString(set);
                            java.util.Objects.toString(requestTemplate);
                        }
                        if (map != null) {
                            if (!z) {
                                this.getOutputMinFrameDuration.clear();
                            }
                            this.getOutputMinFrameDuration.putAll(map);
                        }
                        if (map2 != null) {
                            if (!z2) {
                                this.getOutputFormats.clear();
                            }
                            this.getOutputFormats.putAll(map2);
                        }
                        if (set != null) {
                            this.getInputFormats.clear();
                            this.getInputFormats.addAll(set);
                        }
                        if (requestTemplate != null) {
                            this.getOutputStallDurationlomOqCM = requestTemplate;
                        }
                        if (set2 != null) {
                            this.getOutputMinFrameDurationlomOqCM.clear();
                            this.getOutputMinFrameDurationlomOqCM.addAll(set2);
                        }
                        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
                            this.getHighResolutionOutputSizeshNQ4ISI = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                        }
                        if (this.getInputSizeshNQ4ISI) {
                            kotlinx.coroutines.CompletableDeferred<kotlin.Unit> completableDeferred = this.getHighResolutionOutputSizeshNQ4ISI;
                            kotlin.jvm.internal.Intrinsics.checkNotNull(completableDeferred);
                            return completableDeferred;
                        }
                        this.getInputSizeshNQ4ISI = true;
                        ?? r6 = this.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(r6);
                        objectRef2.element = r6;
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        useCaseCameraState$updateAsync$1.getHighSpeedVideoSizes = objectRef2;
                        useCaseCameraState$updateAsync$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                        if (Camera2StreamConfigurationMap(useCaseCameraState$updateAsync$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        objectRef = objectRef2;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef = (kotlin.jvm.internal.Ref.ObjectRef) useCaseCameraState$updateAsync$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return objectRef.element;
            }
        }
        useCaseCameraState$updateAsync$1 = new androidx.camera.camera2.impl.UseCaseCameraState$updateAsync$1(this, continuation);
        java.lang.Object obj2 = useCaseCameraState$updateAsync$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = useCaseCameraState$updateAsync$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        return objectRef.element;
    }

    public final java.lang.Object tryStartRepeating(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(continuation);
        return Camera2StreamConfigurationMap == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? Camera2StreamConfigurationMap : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x021a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r0v13, types: [T, kotlinx.coroutines.CompletableDeferred<kotlin.Unit>] */
    /* JADX WARN: Type inference failed for: r10v4, types: [T, kotlinx.coroutines.CompletableDeferred<kotlin.Unit>] */
    /* JADX WARN: Type inference failed for: r11v9, types: [T, androidx.camera.camera2.pipe.Request] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object Camera2StreamConfigurationMap(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.camera.camera2.impl.UseCaseCameraState$submitLatest$1 useCaseCameraState$submitLatest$1;
        int i;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        kotlin.jvm.internal.Ref.ObjectRef objectRef2;
        kotlinx.coroutines.CompletableDeferred completableDeferred;
        int incrementAndGet;
        try {
            if (continuation instanceof androidx.camera.camera2.impl.UseCaseCameraState$submitLatest$1) {
                useCaseCameraState$submitLatest$1 = (androidx.camera.camera2.impl.UseCaseCameraState$submitLatest$1) continuation;
                if ((useCaseCameraState$submitLatest$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                    useCaseCameraState$submitLatest$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                    java.lang.Object obj = useCaseCameraState$submitLatest$1.Camera2StreamConfigurationMap;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = useCaseCameraState$submitLatest$1.getHighResolutionOutputSizeshNQ4ISI;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
                        try {
                            androidx.camera.camera2.pipe.CameraGraph graph = this.getHighSpeedVideoSizes.getGraph();
                            useCaseCameraState$submitLatest$1.getHighSpeedVideoFpsRanges = objectRef;
                            useCaseCameraState$submitLatest$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                            obj = graph.acquireSession(useCaseCameraState$submitLatest$1);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            objectRef2 = objectRef;
                        } catch (java.util.concurrent.CancellationException e) {
                            e = e;
                            androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                            if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                                java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                            }
                            synchronized (this.Camera2StreamConfigurationMap) {
                                if (this.getInputSizeshNQ4ISI) {
                                    this.getInputSizeshNQ4ISI = false;
                                    objectRef.element = this.getHighResolutionOutputSizeshNQ4ISI;
                                    this.getHighResolutionOutputSizeshNQ4ISI = null;
                                }
                                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            }
                            objectRef2 = objectRef;
                            completableDeferred = (kotlinx.coroutines.CompletableDeferred) objectRef2.element;
                            if (completableDeferred != null) {
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) useCaseCameraState$submitLatest$1.getHighSpeedVideoFpsRanges;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                        } catch (java.util.concurrent.CancellationException e2) {
                            e = e2;
                            objectRef = objectRef2;
                            androidx.camera.camera2.impl.Camera2Logger camera2Logger2 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                            if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                            }
                            synchronized (this.Camera2StreamConfigurationMap) {
                            }
                        }
                    }
                    java.lang.AutoCloseable autoCloseable = (java.lang.AutoCloseable) obj;
                    androidx.camera.camera2.pipe.CameraGraph.Session session = (androidx.camera.camera2.pipe.CameraGraph.Session) autoCloseable;
                    kotlin.jvm.internal.Ref.ObjectRef objectRef3 = new kotlin.jvm.internal.Ref.ObjectRef();
                    kotlin.jvm.internal.Ref.ObjectRef objectRef4 = new kotlin.jvm.internal.Ref.ObjectRef();
                    synchronized (this.Camera2StreamConfigurationMap) {
                        if (this.getInputFormats.isEmpty()) {
                            objectRef3.element = null;
                        } else {
                            androidx.camera.camera2.pipe.RequestTemplate requestTemplate = this.getOutputStallDurationlomOqCM;
                            java.util.List list = kotlin.collections.CollectionsKt.toList(this.getInputFormats);
                            java.util.Map plus = kotlin.collections.MapsKt.plus(this.getHighSpeedVideoFpsRanges.mo79getOverrideParamsxlOpshk(this.getOutputStallDurationlomOqCM), kotlin.collections.MapsKt.toMap(this.getOutputMinFrameDuration));
                            java.util.Map mutableMap = kotlin.collections.MapsKt.toMutableMap(this.getOutputFormats);
                            mutableMap.put(androidx.camera.camera2.impl.TagsKt.getUSE_CASE_CAMERA_STATE_CUSTOM_TAG(), kotlin.coroutines.jvm.internal.Boxing.boxInt(this.getHighSpeedVideoFpsRangesFor.incrementAndGet()));
                            java.util.List mutableList = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) this.getOutputMinFrameDurationlomOqCM);
                            mutableList.add(this.unwrapAs);
                            objectRef3.element = new androidx.camera.camera2.pipe.Request(list, plus, mutableMap, mutableList, requestTemplate, null, 32, null);
                        }
                        objectRef4.element = this.getHighResolutionOutputSizeshNQ4ISI;
                        this.getInputSizeshNQ4ISI = false;
                        this.getHighResolutionOutputSizeshNQ4ISI = null;
                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    }
                    if (objectRef3.element == 0) {
                        session.stopRepeating();
                        objectRef2.element = objectRef4.element;
                    } else {
                        kotlinx.coroutines.CompletableDeferred completableDeferred2 = (kotlinx.coroutines.CompletableDeferred) objectRef4.element;
                        if (completableDeferred2 != null) {
                            synchronized (this.Camera2StreamConfigurationMap) {
                                this.getHighSpeedVideoSizesFor.add(new androidx.camera.camera2.impl.UseCaseCameraState.RequestSignal(this.getHighSpeedVideoFpsRangesFor.getValue(), completableDeferred2));
                                incrementAndGet = this.isOutputSupportedForhNQ4ISI.incrementAndGet();
                            }
                            kotlin.coroutines.jvm.internal.Boxing.boxInt(incrementAndGet);
                        }
                        androidx.camera.camera2.impl.Camera2Logger camera2Logger3 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                            java.lang.String unused2 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                            T t = objectRef3.element;
                        }
                        session.startRepeating((androidx.camera.camera2.pipe.Request) objectRef3.element);
                        java.util.Map<android.hardware.camera2.CaptureRequest.Key<?>, java.lang.Object> parameters = ((androidx.camera.camera2.pipe.Request) objectRef3.element).getParameters();
                        android.hardware.camera2.CaptureRequest.Key key = android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
                        java.lang.Object obj2 = parameters != null ? parameters.get(key) : null;
                        java.lang.Integer num = obj2 instanceof java.lang.Integer ? (java.lang.Integer) obj2 : null;
                        androidx.camera.camera2.pipe.AeMode m159fromIntOrNullkQd0u18 = num != null ? androidx.camera.camera2.pipe.AeMode.INSTANCE.m159fromIntOrNullkQd0u18(num.intValue()) : null;
                        android.hardware.camera2.CaptureRequest.Key key2 = android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key2, "");
                        java.lang.Object obj3 = parameters != null ? parameters.get(key2) : null;
                        java.lang.Integer num2 = obj3 instanceof java.lang.Integer ? (java.lang.Integer) obj3 : null;
                        androidx.camera.camera2.pipe.AfMode m177fromIntOrNullMKXwA8g = num2 != null ? androidx.camera.camera2.pipe.AfMode.INSTANCE.m177fromIntOrNullMKXwA8g(num2.intValue()) : null;
                        android.hardware.camera2.CaptureRequest.Key key3 = android.hardware.camera2.CaptureRequest.CONTROL_AWB_MODE;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key3, "");
                        java.lang.Object obj4 = parameters != null ? parameters.get(key3) : null;
                        java.lang.Integer num3 = obj4 instanceof java.lang.Integer ? (java.lang.Integer) obj4 : null;
                        androidx.camera.camera2.pipe.AwbMode m203fromIntOrNullSaEiwI = num3 != null ? androidx.camera.camera2.pipe.AwbMode.INSTANCE.m203fromIntOrNullSaEiwI(num3.intValue()) : null;
                        boolean z = (m159fromIntOrNullkQd0u18 == null || kotlin.jvm.internal.Intrinsics.areEqual(m159fromIntOrNullkQd0u18, this.getOutputSizeshNQ4ISI)) ? false : true;
                        boolean z2 = (m177fromIntOrNullMKXwA8g == null || kotlin.jvm.internal.Intrinsics.areEqual(m177fromIntOrNullMKXwA8g, this.getOutputStallDuration)) ? false : true;
                        boolean z3 = (m203fromIntOrNullSaEiwI == null || kotlin.jvm.internal.Intrinsics.areEqual(m203fromIntOrNullSaEiwI, this.getOutputSizes)) ? false : true;
                        if (z || z2 || z3) {
                            androidx.camera.camera2.impl.Camera2Logger camera2Logger4 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                            if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                                java.lang.String unused3 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                            }
                            androidx.camera.camera2.pipe.AfMode afMode = m177fromIntOrNullMKXwA8g;
                            androidx.camera.camera2.pipe.CameraControls3A.m276update3AydBZfZg$default(session, m159fromIntOrNullkQd0u18, m177fromIntOrNullMKXwA8g, m203fromIntOrNullSaEiwI, null, null, null, 56, null);
                            if (m159fromIntOrNullkQd0u18 != null) {
                                this.getOutputSizeshNQ4ISI = m159fromIntOrNullkQd0u18;
                            }
                            if (afMode != null) {
                                this.getOutputStallDuration = afMode;
                            }
                            if (m203fromIntOrNullSaEiwI != null) {
                                this.getOutputSizes = m203fromIntOrNullSaEiwI;
                            }
                        }
                    }
                    kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                    kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable, null);
                    completableDeferred = (kotlinx.coroutines.CompletableDeferred) objectRef2.element;
                    if (completableDeferred != null) {
                        kotlin.coroutines.jvm.internal.Boxing.boxBoolean(completableDeferred.complete(kotlin.Unit.INSTANCE));
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }
            androidx.camera.camera2.pipe.CameraGraph.Session session2 = (androidx.camera.camera2.pipe.CameraGraph.Session) autoCloseable;
            kotlin.jvm.internal.Ref.ObjectRef objectRef32 = new kotlin.jvm.internal.Ref.ObjectRef();
            kotlin.jvm.internal.Ref.ObjectRef objectRef42 = new kotlin.jvm.internal.Ref.ObjectRef();
            synchronized (this.Camera2StreamConfigurationMap) {
            }
        } finally {
        }
        useCaseCameraState$submitLatest$1 = new androidx.camera.camera2.impl.UseCaseCameraState$submitLatest$1(this, continuation);
        java.lang.Object obj5 = useCaseCameraState$submitLatest$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = useCaseCameraState$submitLatest$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        java.lang.AutoCloseable autoCloseable2 = (java.lang.AutoCloseable) obj5;
    }

    public final void close() {
        synchronized (this.Camera2StreamConfigurationMap) {
            if (this.getInputSizeshNQ4ISI) {
                this.getInputSizeshNQ4ISI = false;
                kotlinx.coroutines.CompletableDeferred<kotlin.Unit> completableDeferred = this.getHighResolutionOutputSizeshNQ4ISI;
                if (completableDeferred != null) {
                    completableDeferred.completeExceptionally(new java.util.concurrent.CancellationException("UseCaseCameraState closed"));
                }
                this.getHighResolutionOutputSizeshNQ4ISI = null;
            }
            while (!this.getHighSpeedVideoSizesFor.isEmpty()) {
                this.getHighSpeedVideoSizesFor.removeFirst().getSignal().completeExceptionally(new java.util.concurrent.CancellationException("UseCaseCameraState closed"));
                this.isOutputSupportedForhNQ4ISI.decrementAndGet();
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/camera/camera2/impl/UseCaseCameraState$RequestListener;", "Landroidx/camera/camera2/pipe/Request$Listener;", "<init>", "(Landroidx/camera/camera2/impl/UseCaseCameraState;)V", "Landroidx/camera/camera2/pipe/RequestMetadata;", "requestMetadata", "Landroidx/camera/camera2/pipe/FrameNumber;", "frameNumber", "Landroidx/camera/camera2/pipe/FrameInfo;", "totalCaptureResult", "", "onTotalCaptureResult-CcXjc1I", "(Landroidx/camera/camera2/pipe/RequestMetadata;JLandroidx/camera/camera2/pipe/FrameInfo;)V", "onTotalCaptureResult", "Landroidx/camera/camera2/pipe/RequestFailure;", "requestFailure", "onFailed-CcXjc1I", "(Landroidx/camera/camera2/pipe/RequestMetadata;JLandroidx/camera/camera2/pipe/RequestFailure;)V", "onFailed"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class RequestListener implements androidx.camera.camera2.pipe.Request.Listener {
        public RequestListener() {
        }

        @Override // androidx.camera.camera2.pipe.Request.Listener
        /* renamed from: onTotalCaptureResult-CcXjc1I */
        public final void mo38onTotalCaptureResultCcXjc1I(androidx.camera.camera2.pipe.RequestMetadata requestMetadata, long frameNumber, androidx.camera.camera2.pipe.FrameInfo totalCaptureResult) {
            java.lang.Integer num;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestMetadata, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalCaptureResult, "");
            if (androidx.camera.camera2.impl.UseCaseCameraState.this.isOutputSupportedForhNQ4ISI.getValue() == 0 || (num = (java.lang.Integer) requestMetadata.get(androidx.camera.camera2.impl.TagsKt.getUSE_CASE_CAMERA_STATE_CUSTOM_TAG())) == null) {
                return;
            }
            androidx.camera.camera2.impl.UseCaseCameraState useCaseCameraState = androidx.camera.camera2.impl.UseCaseCameraState.this;
            int intValue = num.intValue();
            synchronized (useCaseCameraState.Camera2StreamConfigurationMap) {
                kotlin.collections.ArrayDeque arrayDeque = useCaseCameraState.getHighSpeedVideoSizesFor;
                while (!arrayDeque.isEmpty() && ((androidx.camera.camera2.impl.UseCaseCameraState.RequestSignal) arrayDeque.first()).getRequestNo() <= intValue) {
                    ((androidx.camera.camera2.impl.UseCaseCameraState.RequestSignal) arrayDeque.first()).getSignal().complete(kotlin.Unit.INSTANCE);
                    kotlin.collections.CollectionsKt.removeFirst(arrayDeque);
                    androidx.camera.camera2.impl.UseCaseCameraState.this.isOutputSupportedForhNQ4ISI.decrementAndGet();
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
        
            if (r7 == null) goto L13;
         */
        @Override // androidx.camera.camera2.pipe.Request.Listener
        /* renamed from: onFailed-CcXjc1I */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void mo37onFailedCcXjc1I(androidx.camera.camera2.pipe.RequestMetadata requestMetadata, long frameNumber, androidx.camera.camera2.pipe.RequestFailure requestFailure) {
            java.lang.Integer num;
            java.lang.String str;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestMetadata, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestFailure, "");
            if (androidx.camera.camera2.impl.UseCaseCameraState.this.isOutputSupportedForhNQ4ISI.getValue() == 0 || (num = (java.lang.Integer) requestMetadata.get(androidx.camera.camera2.impl.TagsKt.getUSE_CASE_CAMERA_STATE_CUSTOM_TAG())) == null) {
                return;
            }
            androidx.camera.camera2.impl.UseCaseCameraState useCaseCameraState = androidx.camera.camera2.impl.UseCaseCameraState.this;
            int intValue = num.intValue();
            synchronized (useCaseCameraState.Camera2StreamConfigurationMap) {
                kotlin.collections.ArrayDeque arrayDeque = useCaseCameraState.getHighSpeedVideoSizesFor;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed in framework level");
                if (requestFailure != null) {
                    int reason = requestFailure.getReason();
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder(" with CaptureFailure.reason = ");
                    sb2.append(reason);
                    str = sb2.toString();
                }
                str = "";
                sb.append(str);
                java.lang.Throwable th = new java.lang.Throwable(sb.toString());
                while (!arrayDeque.isEmpty() && ((androidx.camera.camera2.impl.UseCaseCameraState.RequestSignal) arrayDeque.first()).getRequestNo() <= intValue) {
                    ((androidx.camera.camera2.impl.UseCaseCameraState.RequestSignal) arrayDeque.first()).getSignal().completeExceptionally(th);
                    kotlin.collections.CollectionsKt.removeFirst(arrayDeque);
                    androidx.camera.camera2.impl.UseCaseCameraState.this.isOutputSupportedForhNQ4ISI.decrementAndGet();
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
        }
    }
}
