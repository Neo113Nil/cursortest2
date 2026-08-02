package androidx.camera.camera2.pipe;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000  2\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0002\u001f J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005H¦@¢\u0006\u0002\u0010\u0006J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0005H&J\u001a\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0013\u0010\rJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0010J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u00162\u0006\u0010\n\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u0017\u0010\rJ\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u00162\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006!À\u0006\u0003"}, d2 = {"Landroidx/camera/camera2/pipe/Frame;", "Landroidx/camera/camera2/pipe/FrameReference;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "awaitFrameInfo", "Landroidx/camera/camera2/pipe/FrameInfo;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFrameInfo", "awaitImage", "Landroidx/camera/camera2/pipe/media/OutputImage;", "streamId", "Landroidx/camera/camera2/pipe/StreamId;", "awaitImage-NYG5g8E", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getImage", "getImage-aKI5c8E", "(I)Landroidx/camera/camera2/pipe/media/OutputImage;", "outputId", "Landroidx/camera/camera2/pipe/OutputId;", "awaitImage-A9nWXxg", "getImage-iYJqvbA", "awaitImages", "", "awaitImages-NYG5g8E", "getImages", "getImages-aKI5c8E", "(I)Ljava/util/List;", "addListener", "", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroidx/camera/camera2/pipe/Frame$Listener;", "Listener", "Companion", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface Frame extends androidx.camera.camera2.pipe.FrameReference, java.lang.AutoCloseable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.pipe.Frame.Companion INSTANCE = androidx.camera.camera2.pipe.Frame.Companion.getHighSpeedVideoFpsRanges;

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0006H&¢\u0006\u0004\b\u0011\u0010\u000bJ\u000f\u0010\u0012\u001a\u00020\u0006H&¢\u0006\u0004\b\u0012\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/Frame$Listener;", "", "Landroidx/camera/camera2/pipe/FrameNumber;", "frameNumber", "Landroidx/camera/camera2/pipe/CameraTimestamp;", "frameTimestamp", "", "onFrameStarted-cfZT-5Y", "(JJ)V", "onFrameStarted", "onFrameInfoAvailable", "()V", "Landroidx/camera/camera2/pipe/StreamId;", "streamId", "onImageAvailable-aKI5c8E", "(I)V", "onImageAvailable", "onImagesAvailable", "onFrameComplete"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Listener {
        void onFrameComplete();

        void onFrameInfoAvailable();

        /* renamed from: onFrameStarted-cfZT-5Y, reason: not valid java name */
        void m482onFrameStartedcfZT5Y(long frameNumber, long frameTimestamp);

        /* renamed from: onImageAvailable-aKI5c8E, reason: not valid java name */
        default void m483onImageAvailableaKI5c8E(int streamId) {
        }

        void onImagesAvailable();
    }

    /* renamed from: awaitImage-NYG5g8E$suspendImpl, reason: not valid java name */
    static /* synthetic */ java.lang.Object m465awaitImageNYG5g8E$suspendImpl(androidx.camera.camera2.pipe.Frame frame, int i, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.media.OutputImage> continuation) {
        return null;
    }

    void addListener(androidx.camera.camera2.pipe.Frame.Listener listener);

    java.lang.Object awaitFrameInfo(kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.FrameInfo> continuation);

    androidx.camera.camera2.pipe.FrameInfo getFrameInfo();

    /* renamed from: getImage-aKI5c8E, reason: not valid java name */
    default androidx.camera.camera2.pipe.media.OutputImage mo470getImageaKI5c8E(int streamId) {
        return null;
    }

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        /* renamed from: imageStatus-BWjvHWQ, reason: not valid java name */
        public static int m481imageStatusBWjvHWQ(androidx.camera.camera2.pipe.Frame frame, int i) {
            return androidx.camera.camera2.pipe.Frame.super.mo509imageStatusBWjvHWQ(i);
        }

        @java.lang.Deprecated
        /* renamed from: awaitImage-NYG5g8E, reason: not valid java name */
        public static java.lang.Object m476awaitImageNYG5g8E(androidx.camera.camera2.pipe.Frame frame, int i, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.media.OutputImage> continuation) {
            return androidx.camera.camera2.pipe.Frame.super.mo468awaitImageNYG5g8E(i, continuation);
        }

        @java.lang.Deprecated
        /* renamed from: getImage-aKI5c8E, reason: not valid java name */
        public static androidx.camera.camera2.pipe.media.OutputImage m478getImageaKI5c8E(androidx.camera.camera2.pipe.Frame frame, int i) {
            return androidx.camera.camera2.pipe.Frame.super.mo470getImageaKI5c8E(i);
        }

        @java.lang.Deprecated
        /* renamed from: awaitImage-A9nWXxg, reason: not valid java name */
        public static java.lang.Object m475awaitImageA9nWXxg(androidx.camera.camera2.pipe.Frame frame, int i, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.media.OutputImage> continuation) {
            return androidx.camera.camera2.pipe.Frame.super.mo467awaitImageA9nWXxg(i, continuation);
        }

        @java.lang.Deprecated
        /* renamed from: getImage-iYJqvbA, reason: not valid java name */
        public static androidx.camera.camera2.pipe.media.OutputImage m479getImageiYJqvbA(androidx.camera.camera2.pipe.Frame frame, int i) {
            return androidx.camera.camera2.pipe.Frame.super.mo471getImageiYJqvbA(i);
        }

        @java.lang.Deprecated
        /* renamed from: awaitImages-NYG5g8E, reason: not valid java name */
        public static java.lang.Object m477awaitImagesNYG5g8E(androidx.camera.camera2.pipe.Frame frame, int i, kotlin.coroutines.Continuation<? super java.util.List<? extends androidx.camera.camera2.pipe.media.OutputImage>> continuation) {
            return androidx.camera.camera2.pipe.Frame.super.mo469awaitImagesNYG5g8E(i, continuation);
        }

        @java.lang.Deprecated
        /* renamed from: getImages-aKI5c8E, reason: not valid java name */
        public static java.util.List<androidx.camera.camera2.pipe.media.OutputImage> m480getImagesaKI5c8E(androidx.camera.camera2.pipe.Frame frame, int i) {
            return androidx.camera.camera2.pipe.Frame.super.mo472getImagesaKI5c8E(i);
        }
    }

    /* renamed from: awaitImage-A9nWXxg$suspendImpl, reason: not valid java name */
    static /* synthetic */ java.lang.Object m464awaitImageA9nWXxg$suspendImpl(androidx.camera.camera2.pipe.Frame frame, int i, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.media.OutputImage> continuation) {
        throw new kotlin.NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    /* renamed from: getImage-iYJqvbA, reason: not valid java name */
    default androidx.camera.camera2.pipe.media.OutputImage mo471getImageiYJqvbA(int outputId) {
        throw new kotlin.NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    /* renamed from: awaitImages-NYG5g8E$suspendImpl, reason: not valid java name */
    static /* synthetic */ java.lang.Object m466awaitImagesNYG5g8E$suspendImpl(androidx.camera.camera2.pipe.Frame frame, int i, kotlin.coroutines.Continuation<? super java.util.List<? extends androidx.camera.camera2.pipe.media.OutputImage>> continuation) {
        throw new kotlin.NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    /* renamed from: getImages-aKI5c8E, reason: not valid java name */
    default java.util.List<androidx.camera.camera2.pipe.media.OutputImage> mo472getImagesaKI5c8E(int streamId) {
        throw new kotlin.NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\n\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\n\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\tJ1\u0010\u0013\u001a\u00020\u0011*\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00110\u0010H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J7\u0010\u0017\u001a\u00020\u0011*\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00110\u0015H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\u0015\u0010\u001c\u001a\u00020\u0019*\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\u001d\u001a\u00020\u0007*\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/Frame$Companion;", "", "<init>", "()V", "Landroidx/camera/camera2/pipe/FrameReference;", "Landroidx/camera/camera2/pipe/StreamId;", "streamId", "", "isImageAvailable-vKMW96A", "(Landroidx/camera/camera2/pipe/FrameReference;I)Z", "isImageAvailable", "Landroidx/camera/camera2/pipe/OutputId;", "outputId", "isImageAvailable-og7wgUk", "", "Landroidx/camera/camera2/pipe/Frame;", "Lkotlin/Function1;", "", "action", "useEach", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function2;", "", "useEachIndexed", "(Ljava/util/List;Lkotlin/jvm/functions/Function2;)V", "Landroidx/camera/camera2/pipe/Request;", "getRequest", "(Landroidx/camera/camera2/pipe/Frame;)Landroidx/camera/camera2/pipe/Request;", "request", "isFrameInfoAvailable", "(Landroidx/camera/camera2/pipe/FrameReference;)Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ androidx.camera.camera2.pipe.Frame.Companion getHighSpeedVideoFpsRanges = new androidx.camera.camera2.pipe.Frame.Companion();

        private Companion() {
        }

        public final androidx.camera.camera2.pipe.Request getRequest(androidx.camera.camera2.pipe.Frame frame) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frame, "");
            return frame.getRequestMetadata().getRequest();
        }

        public final boolean isFrameInfoAvailable(androidx.camera.camera2.pipe.FrameReference frameReference) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frameReference, "");
            return androidx.camera.camera2.pipe.OutputStatus.m546equalsimpl0(frameReference.mo506getFrameInfoStatusU7r42EA(), androidx.camera.camera2.pipe.OutputStatus.INSTANCE.m550getAVAILABLEU7r42EA());
        }

        /* renamed from: isImageAvailable-vKMW96A, reason: not valid java name */
        public final boolean m474isImageAvailablevKMW96A(androidx.camera.camera2.pipe.FrameReference frameReference, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frameReference, "");
            return androidx.camera.camera2.pipe.OutputStatus.m546equalsimpl0(frameReference.mo510imageStatusOo2lJfM(i), androidx.camera.camera2.pipe.OutputStatus.INSTANCE.m550getAVAILABLEU7r42EA());
        }

        /* renamed from: isImageAvailable-og7wgUk, reason: not valid java name */
        public final boolean m473isImageAvailableog7wgUk(androidx.camera.camera2.pipe.FrameReference frameReference, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frameReference, "");
            return androidx.camera.camera2.pipe.OutputStatus.m546equalsimpl0(frameReference.mo509imageStatusBWjvHWQ(i), androidx.camera.camera2.pipe.OutputStatus.INSTANCE.m550getAVAILABLEU7r42EA());
        }

        public final void useEach(java.util.List<? extends androidx.camera.camera2.pipe.Frame> list, kotlin.jvm.functions.Function1<? super androidx.camera.camera2.pipe.Frame, kotlin.Unit> function1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
            androidx.camera.camera2.pipe.core.AutoCloseables autoCloseables = androidx.camera.camera2.pipe.core.AutoCloseables.INSTANCE;
            int i = 0;
            while (i < list.size()) {
                try {
                    androidx.camera.camera2.pipe.Frame frame = list.get(i);
                    i++;
                    try {
                        function1.invoke(frame);
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        kotlin.jdk7.AutoCloseableKt.closeFinally(frame, null);
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

        public final void useEachIndexed(java.util.List<? extends androidx.camera.camera2.pipe.Frame> list, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super androidx.camera.camera2.pipe.Frame, kotlin.Unit> function2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
            androidx.camera.camera2.pipe.core.AutoCloseables autoCloseables = androidx.camera.camera2.pipe.core.AutoCloseables.INSTANCE;
            int i = 0;
            while (i < list.size()) {
                try {
                    androidx.camera.camera2.pipe.Frame frame = list.get(i);
                    int i2 = i + 1;
                    try {
                        function2.invoke(java.lang.Integer.valueOf(i), frame);
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        try {
                            kotlin.jdk7.AutoCloseableKt.closeFinally(frame, null);
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
    }

    /* renamed from: awaitImages-NYG5g8E, reason: not valid java name */
    default java.lang.Object mo469awaitImagesNYG5g8E(int i, kotlin.coroutines.Continuation<? super java.util.List<? extends androidx.camera.camera2.pipe.media.OutputImage>> continuation) {
        return m466awaitImagesNYG5g8E$suspendImpl(this, i, continuation);
    }

    /* renamed from: awaitImage-NYG5g8E, reason: not valid java name */
    default java.lang.Object mo468awaitImageNYG5g8E(int i, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.media.OutputImage> continuation) {
        return m465awaitImageNYG5g8E$suspendImpl(this, i, continuation);
    }

    /* renamed from: awaitImage-A9nWXxg, reason: not valid java name */
    default java.lang.Object mo467awaitImageA9nWXxg(int i, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.media.OutputImage> continuation) {
        return m464awaitImageA9nWXxg$suspendImpl(this, i, continuation);
    }
}
