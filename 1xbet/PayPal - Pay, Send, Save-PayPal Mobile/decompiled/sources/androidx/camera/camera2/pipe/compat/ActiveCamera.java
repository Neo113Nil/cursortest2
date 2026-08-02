package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u000eH\u0086@¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!R\u0011\u0010#\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\"\u0010\u001cR\u0018\u0010&\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020'8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010)"}, d2 = {"Landroidx/camera/camera2/pipe/compat/ActiveCamera;", "", "Landroidx/camera/camera2/pipe/compat/AndroidCameraState;", "androidCameraState", "", "Landroidx/camera/camera2/pipe/CameraId;", "allCameraIds", "Lkotlinx/coroutines/CoroutineScope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "Lkotlin/Function1;", "", "closeCallback", "<init>", "(Landroidx/camera/camera2/pipe/compat/AndroidCameraState;Ljava/util/Set;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;)V", "Landroidx/camera/camera2/pipe/core/Token;", "acquire", "()Landroidx/camera/camera2/pipe/core/Token;", "Landroidx/camera/camera2/pipe/compat/VirtualCameraState;", "virtualCameraState", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "connectTo", "(Landroidx/camera/camera2/pipe/compat/VirtualCameraState;Landroidx/camera/camera2/pipe/core/Token;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "close", "()V", "awaitClosed", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Landroidx/camera/camera2/pipe/compat/AndroidCameraState;", "Ljava/util/Set;", "getAllCameraIds$camera_camera2_pipe", "()Ljava/util/Set;", "getCameraId-Dz_R5H8", "cameraId", "Camera2StreamConfigurationMap", "Landroidx/camera/camera2/pipe/compat/VirtualCameraState;", "getHighSpeedVideoFpsRangesFor", "Landroidx/camera/camera2/pipe/core/WakeLock;", "getHighSpeedVideoSizes", "Landroidx/camera/camera2/pipe/core/WakeLock;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ActiveCamera {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private androidx.camera.camera2.pipe.compat.VirtualCameraState getHighSpeedVideoFpsRangesFor;
    private final java.util.Set<androidx.camera.camera2.pipe.CameraId> allCameraIds;
    private final androidx.camera.camera2.pipe.compat.AndroidCameraState getHighSpeedVideoFpsRanges;
    private final androidx.camera.camera2.pipe.core.WakeLock getHighSpeedVideoSizes;

    public ActiveCamera(androidx.camera.camera2.pipe.compat.AndroidCameraState androidCameraState, java.util.Set<androidx.camera.camera2.pipe.CameraId> set, kotlinx.coroutines.CoroutineScope coroutineScope, final kotlin.jvm.functions.Function1<? super androidx.camera.camera2.pipe.compat.ActiveCamera, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(androidCameraState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.getHighSpeedVideoFpsRanges = androidCameraState;
        this.allCameraIds = set;
        this.getHighSpeedVideoSizes = new androidx.camera.camera2.pipe.core.WakeLock(coroutineScope, 1000L, true, new kotlin.jvm.functions.Function0() { // from class: androidx.camera.camera2.pipe.compat.ActiveCamera$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.camera.camera2.pipe.compat.ActiveCamera.m762$r8$lambda$Pft0woi3wOq0lzMTXAHXs4ZXo(kotlin.jvm.functions.Function1.this, this);
            }
        });
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.camera.camera2.pipe.compat.ActiveCamera.AnonymousClass1(null), 3, null);
    }

    public final java.util.Set<androidx.camera.camera2.pipe.CameraId> getAllCameraIds$camera_camera2_pipe() {
        return this.allCameraIds;
    }

    /* renamed from: getCameraId-Dz_R5H8, reason: not valid java name */
    public final java.lang.String m763getCameraIdDz_R5H8() {
        return this.getHighSpeedVideoFpsRanges.getCameraId();
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.compat.ActiveCamera$1", f = "Camera2DeviceManager.kt", i = {}, l = {137}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: androidx.camera.camera2.pipe.compat.ActiveCamera$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int Camera2StreamConfigurationMap;

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Landroidx/camera/camera2/pipe/compat/CameraState;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.compat.ActiveCamera$1$1", f = "Camera2DeviceManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        /* renamed from: androidx.camera.camera2.pipe.compat.ActiveCamera$1$1, reason: invalid class name and collision with other inner class name */
        static final class C00011 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.camera.camera2.pipe.compat.CameraState, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
            /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
            int getHighResolutionOutputSizeshNQ4ISI;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                androidx.camera.camera2.pipe.compat.CameraState cameraState = (androidx.camera.camera2.pipe.compat.CameraState) this.Camera2StreamConfigurationMap;
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean((cameraState instanceof androidx.camera.camera2.pipe.compat.CameraStateClosing) || (cameraState instanceof androidx.camera.camera2.pipe.compat.CameraStateClosed));
            }

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ java.lang.Object invoke(androidx.camera.camera2.pipe.compat.CameraState cameraState, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
                return ((androidx.camera.camera2.pipe.compat.ActiveCamera.AnonymousClass1.C00011) create(cameraState, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                androidx.camera.camera2.pipe.compat.ActiveCamera.AnonymousClass1.C00011 c00011 = new androidx.camera.camera2.pipe.compat.ActiveCamera.AnonymousClass1.C00011(continuation);
                c00011.Camera2StreamConfigurationMap = obj;
                return c00011;
            }

            C00011(kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.compat.ActiveCamera.AnonymousClass1.C00011> continuation) {
                super(2, continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.Camera2StreamConfigurationMap;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.Camera2StreamConfigurationMap = 1;
                if (kotlinx.coroutines.flow.FlowKt.first(androidx.camera.camera2.pipe.compat.ActiveCamera.this.getHighSpeedVideoFpsRanges.getState(), new androidx.camera.camera2.pipe.compat.ActiveCamera.AnonymousClass1.C00011(null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            androidx.camera.camera2.pipe.compat.ActiveCamera.this.getHighSpeedVideoSizes.release();
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.camera.camera2.pipe.compat.ActiveCamera.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return androidx.camera.camera2.pipe.compat.ActiveCamera.this.new AnonymousClass1(continuation);
        }

        AnonymousClass1(kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.compat.ActiveCamera.AnonymousClass1> continuation) {
            super(2, continuation);
        }
    }

    public final androidx.camera.camera2.pipe.core.Token acquire() {
        return this.getHighSpeedVideoSizes.acquire();
    }

    public final java.lang.Object connectTo(androidx.camera.camera2.pipe.compat.VirtualCameraState virtualCameraState, androidx.camera.camera2.pipe.core.Token token, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.camera.camera2.pipe.compat.VirtualCameraState virtualCameraState2 = this.getHighSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoFpsRangesFor = virtualCameraState;
        if (virtualCameraState2 != null) {
            androidx.camera.camera2.pipe.compat.VirtualCamera.m857disconnectTPqeGZw$default(virtualCameraState2, null, 1, null);
        }
        java.lang.Object connect$camera_camera2_pipe = virtualCameraState.connect$camera_camera2_pipe(this.getHighSpeedVideoFpsRanges.getState(), token, continuation);
        return connect$camera_camera2_pipe == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? connect$camera_camera2_pipe : kotlin.Unit.INSTANCE;
    }

    public final void close() {
        this.getHighSpeedVideoSizes.release();
        this.getHighSpeedVideoFpsRanges.close();
    }

    public final java.lang.Object awaitClosed(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object awaitClosed = this.getHighSpeedVideoFpsRanges.awaitClosed(continuation);
        return awaitClosed == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitClosed : kotlin.Unit.INSTANCE;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActiveCamera(cameraId=");
        sb.append((java.lang.Object) androidx.camera.camera2.pipe.CameraId.m398toStringimpl(m763getCameraIdDz_R5H8()));
        sb.append(")@");
        java.lang.String num = java.lang.Integer.toString(super.hashCode(), kotlin.text.CharsKt.checkRadix(16));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(num, "");
        sb.append(num);
        return sb.toString();
    }

    /* renamed from: $r8$lambda$Pft0woi-3wOq-0lzMTXAHXs4ZXo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m762$r8$lambda$Pft0woi3wOq0lzMTXAHXs4ZXo(kotlin.jvm.functions.Function1 function1, androidx.camera.camera2.pipe.compat.ActiveCamera activeCamera) {
        function1.invoke(activeCamera);
        return kotlin.Unit.INSTANCE;
    }
}
