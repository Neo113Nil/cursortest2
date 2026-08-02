package androidx.camera.camera2.pipe;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 \u00132\u00060\u0001j\u0002`\u0002:\u0001\u0013J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fH¦@¢\u0006\u0002\u0010\rJ\n\u0010\u000e\u001a\u0004\u0018\u00010\fH&J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H&R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/FrameCapture;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "request", "Landroidx/camera/camera2/pipe/Request;", "getRequest", "()Landroidx/camera/camera2/pipe/Request;", "status", "Landroidx/camera/camera2/pipe/OutputStatus;", "getStatus-U7r42EA", "()I", "awaitFrame", "Landroidx/camera/camera2/pipe/Frame;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFrame", "addListener", "", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroidx/camera/camera2/pipe/Frame$Listener;", "Companion", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface FrameCapture extends java.lang.AutoCloseable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.pipe.FrameCapture.Companion INSTANCE = androidx.camera.camera2.pipe.FrameCapture.Companion.Camera2StreamConfigurationMap;

    void addListener(androidx.camera.camera2.pipe.Frame.Listener listener);

    java.lang.Object awaitFrame(kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.Frame> continuation);

    androidx.camera.camera2.pipe.Frame getFrame();

    androidx.camera.camera2.pipe.Request getRequest();

    /* renamed from: getStatus-U7r42EA, reason: not valid java name */
    int mo484getStatusU7r42EA();

    @kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\t\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ7\u0010\r\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00050\u00042\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\u000bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ0\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000f*\u00020\u00052\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00028\u00000\u0006H\u0086H¢\u0006\u0004\b\u0011\u0010\u0012J0\u0010\u0013\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00050\u00042\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00070\u0006H\u0086H¢\u0006\u0004\b\u0013\u0010\u0014J6\u0010\u0015\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00050\u00042\u001a\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00070\u000bH\u0086H¢\u0006\u0004\b\u0015\u0010\u0016Jg\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001c0\u0004\"\u0004\b\u0000\u0010\u000f*\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0018\u001a\u00020\u001721\b\u0004\u0010\b\u001a+\b\u0001\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0019¢\u0006\u0002\b\u001bH\u0086H¢\u0006\u0004\b\u001d\u0010\u001eJm\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001c0\u0004\"\u0004\b\u0000\u0010\u000f*\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0018\u001a\u00020\u001727\b\u0004\u0010\b\u001a1\b\u0001\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001f¢\u0006\u0002\b\u001bH\u0086H¢\u0006\u0004\b \u0010!\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/FrameCapture$Companion;", "", "<init>", "()V", "", "Landroidx/camera/camera2/pipe/FrameCapture;", "Lkotlin/Function1;", "", "action", "useEach", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function2;", "", "useEachIndexed", "(Ljava/util/List;Lkotlin/jvm/functions/Function2;)V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Landroidx/camera/camera2/pipe/Frame;", "useFrame", "(Landroidx/camera/camera2/pipe/FrameCapture;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "useEachFrame", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "useEachFrameIndexed", "(Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/CoroutineScope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "Lkotlin/Function3;", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "Lkotlinx/coroutines/Deferred;", "useEachFrameAsync", "(Ljava/util/List;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function4;", "useEachFrameIndexedAsync", "(Ljava/util/List;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ androidx.camera.camera2.pipe.FrameCapture.Companion Camera2StreamConfigurationMap = new androidx.camera.camera2.pipe.FrameCapture.Companion();

        private Companion() {
        }

        public final void useEach(java.util.List<? extends androidx.camera.camera2.pipe.FrameCapture> list, kotlin.jvm.functions.Function1<? super androidx.camera.camera2.pipe.FrameCapture, kotlin.Unit> function1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
            androidx.camera.camera2.pipe.core.AutoCloseables autoCloseables = androidx.camera.camera2.pipe.core.AutoCloseables.INSTANCE;
            int i = 0;
            while (i < list.size()) {
                try {
                    androidx.camera.camera2.pipe.FrameCapture frameCapture = list.get(i);
                    i++;
                    try {
                        function1.invoke(frameCapture);
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        kotlin.jdk7.AutoCloseableKt.closeFinally(frameCapture, null);
                    } finally {
                    }
                } catch (java.lang.Throwable th) {
                    try {
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        while (i < list.size()) {
                            try {
                                androidx.media3.muxer.AacWriter$$ExternalSyntheticBackport0.m9182m((java.lang.Object) list.get(i));
                            } catch (java.lang.Throwable th3) {
                                kotlin.ExceptionsKt.addSuppressed(th, th3);
                            }
                            i++;
                        }
                        throw th2;
                    }
                }
            }
            while (i < list.size()) {
                try {
                    androidx.media3.muxer.AacWriter$$ExternalSyntheticBackport0.m9182m((java.lang.Object) list.get(i));
                } catch (java.lang.Throwable unused) {
                }
                i++;
            }
        }

        public final void useEachIndexed(java.util.List<? extends androidx.camera.camera2.pipe.FrameCapture> list, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super androidx.camera.camera2.pipe.FrameCapture, kotlin.Unit> function2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
            androidx.camera.camera2.pipe.core.AutoCloseables autoCloseables = androidx.camera.camera2.pipe.core.AutoCloseables.INSTANCE;
            int i = 0;
            while (i < list.size()) {
                try {
                    androidx.camera.camera2.pipe.FrameCapture frameCapture = list.get(i);
                    int i2 = i + 1;
                    try {
                        function2.invoke(java.lang.Integer.valueOf(i), frameCapture);
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        try {
                            kotlin.jdk7.AutoCloseableKt.closeFinally(frameCapture, null);
                            i = i2;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            i = i2;
                            try {
                                throw th;
                            } finally {
                                while (i < list.size()) {
                                    try {
                                        androidx.media3.muxer.AacWriter$$ExternalSyntheticBackport0.m9182m((java.lang.Object) list.get(i));
                                    } catch (java.lang.Throwable th2) {
                                        kotlin.ExceptionsKt.addSuppressed(th, th2);
                                    }
                                    i++;
                                }
                            }
                        }
                    } finally {
                    }
                } catch (java.lang.Throwable th3) {
                    th = th3;
                }
            }
            while (i < list.size()) {
                try {
                    androidx.media3.muxer.AacWriter$$ExternalSyntheticBackport0.m9182m((java.lang.Object) list.get(i));
                } catch (java.lang.Throwable unused) {
                }
                i++;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:42:0x0044  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final <R> java.lang.Object useFrame(androidx.camera.camera2.pipe.FrameCapture frameCapture, kotlin.jvm.functions.Function1<? super androidx.camera.camera2.pipe.Frame, ? extends R> function1, kotlin.coroutines.Continuation<? super R> continuation) {
            androidx.camera.camera2.pipe.FrameCapture$Companion$useFrame$1 frameCapture$Companion$useFrame$1;
            int i;
            java.lang.AutoCloseable autoCloseable;
            java.lang.Throwable th;
            java.lang.Object awaitFrame;
            java.lang.AutoCloseable autoCloseable2;
            androidx.camera.camera2.pipe.FrameCapture frameCapture2;
            try {
                try {
                    if (continuation instanceof androidx.camera.camera2.pipe.FrameCapture$Companion$useFrame$1) {
                        frameCapture$Companion$useFrame$1 = (androidx.camera.camera2.pipe.FrameCapture$Companion$useFrame$1) continuation;
                        if ((frameCapture$Companion$useFrame$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                            frameCapture$Companion$useFrame$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                            java.lang.Object obj = frameCapture$Companion$useFrame$1.getHighSpeedVideoFpsRanges;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = frameCapture$Companion$useFrame$1.getHighSpeedVideoFpsRangesFor;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj);
                                androidx.camera.camera2.pipe.FrameCapture frameCapture3 = frameCapture;
                                try {
                                    androidx.camera.camera2.pipe.FrameCapture frameCapture4 = frameCapture3;
                                    frameCapture$Companion$useFrame$1.getHighSpeedVideoSizes = function1;
                                    frameCapture$Companion$useFrame$1.Camera2StreamConfigurationMap = frameCapture3;
                                    frameCapture$Companion$useFrame$1.getHighResolutionOutputSizeshNQ4ISI = frameCapture4;
                                    frameCapture$Companion$useFrame$1.getHighSpeedVideoFpsRangesFor = 1;
                                    awaitFrame = frameCapture4.awaitFrame(frameCapture$Companion$useFrame$1);
                                    if (awaitFrame == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    autoCloseable2 = frameCapture3;
                                    frameCapture2 = frameCapture4;
                                } catch (java.lang.Throwable th2) {
                                    autoCloseable = frameCapture3;
                                    th = th2;
                                    throw th;
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                frameCapture2 = (androidx.camera.camera2.pipe.FrameCapture) frameCapture$Companion$useFrame$1.getHighResolutionOutputSizeshNQ4ISI;
                                autoCloseable = (java.lang.AutoCloseable) frameCapture$Companion$useFrame$1.Camera2StreamConfigurationMap;
                                kotlin.jvm.functions.Function1<? super androidx.camera.camera2.pipe.Frame, ? extends R> function12 = (kotlin.jvm.functions.Function1) frameCapture$Companion$useFrame$1.getHighSpeedVideoSizes;
                                try {
                                    kotlin.ResultKt.throwOnFailure(obj);
                                    autoCloseable2 = autoCloseable;
                                    function1 = function12;
                                    awaitFrame = obj;
                                } catch (java.lang.Throwable th3) {
                                    th = th3;
                                    try {
                                        throw th;
                                    } catch (java.lang.Throwable th4) {
                                        kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable, th);
                                        throw th4;
                                    }
                                }
                            }
                            java.lang.AutoCloseable autoCloseable3 = (java.lang.AutoCloseable) awaitFrame;
                            frameCapture2.close();
                            R invoke = function1.invoke((androidx.camera.camera2.pipe.Frame) autoCloseable3);
                            kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable3, null);
                            kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable2, null);
                            return invoke;
                        }
                    }
                    frameCapture2.close();
                    R invoke2 = function1.invoke((androidx.camera.camera2.pipe.Frame) autoCloseable3);
                    kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable3, null);
                    kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable2, null);
                    return invoke2;
                } finally {
                }
                java.lang.AutoCloseable autoCloseable32 = (java.lang.AutoCloseable) awaitFrame;
            } catch (java.lang.Throwable th5) {
                th = th5;
                autoCloseable = autoCloseable2;
                throw th;
            }
            frameCapture$Companion$useFrame$1 = new androidx.camera.camera2.pipe.FrameCapture$Companion$useFrame$1(this, continuation);
            java.lang.Object obj2 = frameCapture$Companion$useFrame$1.getHighSpeedVideoFpsRanges;
            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = frameCapture$Companion$useFrame$1.getHighSpeedVideoFpsRangesFor;
            if (i != 0) {
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0060 A[Catch: all -> 0x00cf, TRY_LEAVE, TryCatch #10 {all -> 0x00cf, blocks: (B:23:0x0058, B:25:0x0060), top: B:22:0x0058 }] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00b4 A[LOOP:0: B:43:0x00b4->B:49:0x00b4, LOOP_START] */
        /* JADX WARN: Removed duplicated region for block: B:88:0x004d  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0083 -> B:13:0x0086). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object useEachFrame(java.util.List<? extends androidx.camera.camera2.pipe.FrameCapture> list, kotlin.jvm.functions.Function1<? super androidx.camera.camera2.pipe.Frame, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            androidx.camera.camera2.pipe.FrameCapture$Companion$useEachFrame$1 frameCapture$Companion$useEachFrame$1;
            int i;
            kotlin.jvm.internal.Ref.IntRef intRef;
            java.util.List<? extends androidx.camera.camera2.pipe.FrameCapture> list2;
            java.lang.Throwable th;
            if (continuation instanceof androidx.camera.camera2.pipe.FrameCapture$Companion$useEachFrame$1) {
                frameCapture$Companion$useEachFrame$1 = (androidx.camera.camera2.pipe.FrameCapture$Companion$useEachFrame$1) continuation;
                if ((frameCapture$Companion$useEachFrame$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                    frameCapture$Companion$useEachFrame$1.getOutputFormats -= 2147483648;
                    java.lang.Object obj = frameCapture$Companion$useEachFrame$1.getInputSizeshNQ4ISI;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = frameCapture$Companion$useEachFrame$1.getOutputFormats;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        androidx.camera.camera2.pipe.core.AutoCloseables autoCloseables = androidx.camera.camera2.pipe.core.AutoCloseables.INSTANCE;
                        intRef = new kotlin.jvm.internal.Ref.IntRef();
                        if (intRef.element < list2.size()) {
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        androidx.camera.camera2.pipe.FrameCapture frameCapture = (androidx.camera.camera2.pipe.FrameCapture) frameCapture$Companion$useEachFrame$1.getHighResolutionOutputSizeshNQ4ISI;
                        java.lang.AutoCloseable autoCloseable = (java.lang.AutoCloseable) frameCapture$Companion$useEachFrame$1.getHighSpeedVideoFpsRangesFor;
                        intRef = (kotlin.jvm.internal.Ref.IntRef) frameCapture$Companion$useEachFrame$1.Camera2StreamConfigurationMap;
                        list2 = (java.util.List) frameCapture$Companion$useEachFrame$1.getHighSpeedVideoFpsRanges;
                        kotlin.jvm.functions.Function1<? super androidx.camera.camera2.pipe.Frame, kotlin.Unit> function12 = (kotlin.jvm.functions.Function1) frameCapture$Companion$useEachFrame$1.getHighSpeedVideoSizes;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            androidx.camera.camera2.pipe.FrameCapture frameCapture2 = autoCloseable;
                            function1 = function12;
                            java.lang.Object awaitFrame = obj;
                            try {
                                try {
                                    try {
                                        try {
                                            frameCapture.close();
                                            function1.invoke((androidx.camera.camera2.pipe.Frame) r5);
                                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                            kotlin.jdk7.AutoCloseableKt.closeFinally(frameCapture2, null);
                                            if (intRef.element < list2.size()) {
                                                frameCapture2 = list2.get(intRef.element);
                                                try {
                                                    intRef.element++;
                                                    androidx.camera.camera2.pipe.FrameCapture frameCapture3 = frameCapture2;
                                                    frameCapture$Companion$useEachFrame$1.getHighSpeedVideoSizes = function1;
                                                    frameCapture$Companion$useEachFrame$1.getHighSpeedVideoFpsRanges = list2;
                                                    frameCapture$Companion$useEachFrame$1.Camera2StreamConfigurationMap = intRef;
                                                    frameCapture$Companion$useEachFrame$1.getHighSpeedVideoFpsRangesFor = frameCapture2;
                                                    frameCapture$Companion$useEachFrame$1.getHighResolutionOutputSizeshNQ4ISI = frameCapture3;
                                                    frameCapture$Companion$useEachFrame$1.getOutputFormats = 1;
                                                    awaitFrame = frameCapture3.awaitFrame(frameCapture$Companion$useEachFrame$1);
                                                    if (awaitFrame == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                    list2 = list2;
                                                    frameCapture = frameCapture3;
                                                    java.lang.AutoCloseable autoCloseable2 = (java.lang.AutoCloseable) awaitFrame;
                                                    frameCapture.close();
                                                    function1.invoke((androidx.camera.camera2.pipe.Frame) autoCloseable2);
                                                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                                                    kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable2, null);
                                                    kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                                                    kotlin.jdk7.AutoCloseableKt.closeFinally(frameCapture2, null);
                                                    list = list2;
                                                    if (intRef.element < list2.size()) {
                                                        while (intRef.element < list2.size()) {
                                                            try {
                                                                int i2 = intRef.element;
                                                                intRef.element = i2 + 1;
                                                                androidx.media3.muxer.AacWriter$$ExternalSyntheticBackport0.m9182m((java.lang.Object) list2.get(i2));
                                                            } catch (java.lang.Throwable unused) {
                                                            }
                                                        }
                                                        return kotlin.Unit.INSTANCE;
                                                    }
                                                } catch (java.lang.Throwable th2) {
                                                    list2 = list2;
                                                    th = th2;
                                                    autoCloseable = frameCapture2;
                                                    try {
                                                        throw th;
                                                    } finally {
                                                    }
                                                }
                                            }
                                        } finally {
                                        }
                                        java.lang.AutoCloseable autoCloseable22 = (java.lang.AutoCloseable) awaitFrame;
                                    } catch (java.lang.Throwable th3) {
                                        th = th3;
                                        autoCloseable = frameCapture2;
                                        throw th;
                                    }
                                } catch (java.lang.Throwable th4) {
                                    th = th4;
                                    try {
                                        throw th;
                                    } finally {
                                        while (intRef.element < list2.size()) {
                                            try {
                                                int i3 = intRef.element;
                                                intRef.element = i3 + 1;
                                                androidx.media3.muxer.AacWriter$$ExternalSyntheticBackport0.m9182m((java.lang.Object) list2.get(i3));
                                            } catch (java.lang.Throwable th5) {
                                                kotlin.ExceptionsKt.addSuppressed(th, th5);
                                            }
                                        }
                                    }
                                }
                                kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable22, null);
                                kotlin.Unit unit32 = kotlin.Unit.INSTANCE;
                            } catch (java.lang.Throwable th6) {
                                list2 = list2;
                                th = th6;
                                throw th;
                            }
                            list = list2;
                        } catch (java.lang.Throwable th7) {
                            th = th7;
                            throw th;
                        }
                    }
                }
            }
            frameCapture$Companion$useEachFrame$1 = new androidx.camera.camera2.pipe.FrameCapture$Companion$useEachFrame$1(this, continuation);
            java.lang.Object obj2 = frameCapture$Companion$useEachFrame$1.getInputSizeshNQ4ISI;
            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = frameCapture$Companion$useEachFrame$1.getOutputFormats;
            if (i != 0) {
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x005e A[Catch: all -> 0x00d5, TRY_LEAVE, TryCatch #4 {all -> 0x00d5, blocks: (B:21:0x0056, B:23:0x005e), top: B:20:0x0056 }] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00ba A[LOOP:0: B:40:0x00ba->B:46:0x00ba, LOOP_START] */
        /* JADX WARN: Removed duplicated region for block: B:82:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0085 -> B:12:0x008b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object useEachFrameIndexed(java.util.List<? extends androidx.camera.camera2.pipe.FrameCapture> list, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super androidx.camera.camera2.pipe.Frame, kotlin.Unit> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            androidx.camera.camera2.pipe.FrameCapture$Companion$useEachFrameIndexed$1 frameCapture$Companion$useEachFrameIndexed$1;
            int i;
            kotlin.jvm.internal.Ref.IntRef intRef;
            java.util.List<? extends androidx.camera.camera2.pipe.FrameCapture> list2;
            if (continuation instanceof androidx.camera.camera2.pipe.FrameCapture$Companion$useEachFrameIndexed$1) {
                frameCapture$Companion$useEachFrameIndexed$1 = (androidx.camera.camera2.pipe.FrameCapture$Companion$useEachFrameIndexed$1) continuation;
                if ((frameCapture$Companion$useEachFrameIndexed$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                    frameCapture$Companion$useEachFrameIndexed$1.getInputFormats -= 2147483648;
                    java.lang.Object obj = frameCapture$Companion$useEachFrameIndexed$1.getOutputFormats;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = frameCapture$Companion$useEachFrameIndexed$1.getInputFormats;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        androidx.camera.camera2.pipe.core.AutoCloseables autoCloseables = androidx.camera.camera2.pipe.core.AutoCloseables.INSTANCE;
                        intRef = new kotlin.jvm.internal.Ref.IntRef();
                        if (intRef.element < list2.size()) {
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = frameCapture$Companion$useEachFrameIndexed$1.getHighSpeedVideoFpsRangesFor;
                        androidx.camera.camera2.pipe.FrameCapture frameCapture = (androidx.camera.camera2.pipe.FrameCapture) frameCapture$Companion$useEachFrameIndexed$1.getHighSpeedVideoSizesFor;
                        androidx.camera.camera2.pipe.FrameCapture frameCapture2 = (java.lang.AutoCloseable) frameCapture$Companion$useEachFrameIndexed$1.getHighSpeedVideoFpsRanges;
                        intRef = (kotlin.jvm.internal.Ref.IntRef) frameCapture$Companion$useEachFrameIndexed$1.getHighSpeedVideoSizes;
                        list2 = (java.util.List) frameCapture$Companion$useEachFrameIndexed$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super androidx.camera.camera2.pipe.Frame, kotlin.Unit> function22 = (kotlin.jvm.functions.Function2) frameCapture$Companion$useEachFrameIndexed$1.Camera2StreamConfigurationMap;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            java.lang.AutoCloseable autoCloseable = (java.lang.AutoCloseable) obj;
                            try {
                                try {
                                    try {
                                        frameCapture.close();
                                        function22.invoke(kotlin.coroutines.jvm.internal.Boxing.boxInt(i2), (androidx.camera.camera2.pipe.Frame) autoCloseable);
                                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                        kotlin.jdk7.AutoCloseableKt.closeFinally(frameCapture2, null);
                                        if (intRef.element < list2.size()) {
                                            frameCapture2 = list2.get(intRef.element);
                                            try {
                                                int i3 = intRef.element;
                                                intRef.element = i3 + 1;
                                                androidx.camera.camera2.pipe.FrameCapture frameCapture3 = frameCapture2;
                                                frameCapture$Companion$useEachFrameIndexed$1.Camera2StreamConfigurationMap = function2;
                                                frameCapture$Companion$useEachFrameIndexed$1.getHighResolutionOutputSizeshNQ4ISI = list2;
                                                frameCapture$Companion$useEachFrameIndexed$1.getHighSpeedVideoSizes = intRef;
                                                frameCapture$Companion$useEachFrameIndexed$1.getHighSpeedVideoFpsRanges = frameCapture2;
                                                frameCapture$Companion$useEachFrameIndexed$1.getHighSpeedVideoSizesFor = frameCapture3;
                                                frameCapture$Companion$useEachFrameIndexed$1.getHighSpeedVideoFpsRangesFor = i3;
                                                frameCapture$Companion$useEachFrameIndexed$1.getInputFormats = 1;
                                                java.lang.Object awaitFrame = frameCapture3.awaitFrame(frameCapture$Companion$useEachFrameIndexed$1);
                                                if (awaitFrame == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                list2 = list2;
                                                i2 = i3;
                                                obj = awaitFrame;
                                                function22 = function2;
                                                frameCapture = frameCapture3;
                                                java.lang.AutoCloseable autoCloseable2 = (java.lang.AutoCloseable) obj;
                                                frameCapture.close();
                                                function22.invoke(kotlin.coroutines.jvm.internal.Boxing.boxInt(i2), (androidx.camera.camera2.pipe.Frame) autoCloseable2);
                                                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                                                kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable2, null);
                                                kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                                                kotlin.jdk7.AutoCloseableKt.closeFinally(frameCapture2, null);
                                                list = list2;
                                                function2 = function22;
                                                if (intRef.element < list2.size()) {
                                                    while (intRef.element < list2.size()) {
                                                        try {
                                                            int i4 = intRef.element;
                                                            intRef.element = i4 + 1;
                                                            androidx.media3.muxer.AacWriter$$ExternalSyntheticBackport0.m9182m((java.lang.Object) list2.get(i4));
                                                        } catch (java.lang.Throwable unused) {
                                                        }
                                                    }
                                                    return kotlin.Unit.INSTANCE;
                                                }
                                            } catch (java.lang.Throwable th) {
                                                list2 = list2;
                                                th = th;
                                                try {
                                                    throw th;
                                                } finally {
                                                }
                                            }
                                        }
                                    } catch (java.lang.Throwable th2) {
                                        list2 = list2;
                                        th = th2;
                                        try {
                                            throw th;
                                        } finally {
                                            while (intRef.element < list2.size()) {
                                                try {
                                                    int i5 = intRef.element;
                                                    intRef.element = i5 + 1;
                                                    androidx.media3.muxer.AacWriter$$ExternalSyntheticBackport0.m9182m((java.lang.Object) list2.get(i5));
                                                } catch (java.lang.Throwable th3) {
                                                    kotlin.ExceptionsKt.addSuppressed(th, th3);
                                                }
                                            }
                                        }
                                    }
                                    list = list2;
                                    function2 = function22;
                                } catch (java.lang.Throwable th4) {
                                    th = th4;
                                    throw th;
                                }
                                kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable2, null);
                                kotlin.Unit unit32 = kotlin.Unit.INSTANCE;
                            } finally {
                            }
                        } catch (java.lang.Throwable th5) {
                            th = th5;
                            throw th;
                        }
                    }
                }
            }
            frameCapture$Companion$useEachFrameIndexed$1 = new androidx.camera.camera2.pipe.FrameCapture$Companion$useEachFrameIndexed$1(this, continuation);
            java.lang.Object obj2 = frameCapture$Companion$useEachFrameIndexed$1.getOutputFormats;
            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = frameCapture$Companion$useEachFrameIndexed$1.getInputFormats;
            if (i != 0) {
            }
        }

        public final <R> java.lang.Object useEachFrameIndexedAsync(java.util.List<? extends androidx.camera.camera2.pipe.FrameCapture> list, kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.jvm.functions.Function4<? super kotlinx.coroutines.CoroutineScope, ? super java.lang.Integer, ? super androidx.camera.camera2.pipe.Frame, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function4, kotlin.coroutines.Continuation<? super java.util.List<? extends kotlinx.coroutines.Deferred<? extends R>>> continuation) {
            kotlinx.coroutines.Deferred async$default;
            androidx.camera.camera2.pipe.core.AutoCloseables autoCloseables = androidx.camera.camera2.pipe.core.AutoCloseables.INSTANCE;
            java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                async$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(coroutineScope, null, kotlinx.coroutines.CoroutineStart.UNDISPATCHED, new androidx.camera.camera2.pipe.FrameCapture$Companion$useEachFrameIndexedAsync$$inlined$useEachIndexedAsync$1(list.get(i), i, null, function4), 1, null);
                arrayList.add(async$default);
            }
            return arrayList;
        }

        public final <R> java.lang.Object useEachFrameAsync(java.util.List<? extends androidx.camera.camera2.pipe.FrameCapture> list, kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.CoroutineScope, ? super androidx.camera.camera2.pipe.Frame, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function3, kotlin.coroutines.Continuation<? super java.util.List<? extends kotlinx.coroutines.Deferred<? extends R>>> continuation) {
            kotlinx.coroutines.Deferred async$default;
            androidx.camera.camera2.pipe.core.AutoCloseables autoCloseables = androidx.camera.camera2.pipe.core.AutoCloseables.INSTANCE;
            java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                async$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(coroutineScope, null, kotlinx.coroutines.CoroutineStart.UNDISPATCHED, new androidx.camera.camera2.pipe.FrameCapture$Companion$useEachFrameAsync$$inlined$useEachFrameIndexedAsync$1(list.get(i), i, null, function3), 1, null);
                arrayList.add(async$default);
            }
            return arrayList;
        }
    }
}
