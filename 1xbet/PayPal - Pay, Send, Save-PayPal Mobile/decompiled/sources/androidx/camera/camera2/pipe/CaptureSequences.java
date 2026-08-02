package androidx.camera.camera2.pipe;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JE\u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00052 \b\u0004\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u0006H\u0086\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJA\u0010\u0010\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u000e\u001a\u00020\u00072\u0014\b\u0004\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u000fH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/CaptureSequences;", "", "<init>", "()V", "T", "Landroidx/camera/camera2/pipe/CaptureSequence;", "Lkotlin/Function3;", "Landroidx/camera/camera2/pipe/RequestMetadata;", "", "Landroidx/camera/camera2/pipe/Request$Listener;", "fn", "", "invokeOnRequests", "(Landroidx/camera/camera2/pipe/CaptureSequence;Lkotlin/jvm/functions/Function3;)V", "request", "Lkotlin/Function1;", "invokeOnRequest", "(Landroidx/camera/camera2/pipe/CaptureSequence;Landroidx/camera/camera2/pipe/RequestMetadata;Lkotlin/jvm/functions/Function1;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CaptureSequences {
    public static final androidx.camera.camera2.pipe.CaptureSequences INSTANCE = new androidx.camera.camera2.pipe.CaptureSequences();

    private CaptureSequences() {
    }

    public final <T> void invokeOnRequests(androidx.camera.camera2.pipe.CaptureSequence<? extends T> captureSequence, kotlin.jvm.functions.Function3<? super androidx.camera.camera2.pipe.RequestMetadata, ? super java.lang.Integer, ? super androidx.camera.camera2.pipe.Request.Listener, ? extends java.lang.Object> function3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(captureSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function3, "");
        androidx.camera.camera2.pipe.core.Debug debug = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
        android.os.Trace.beginSection("InvokeInternalListeners");
        int size = captureSequence.getCaptureMetadataList().size();
        for (int i = 0; i < size; i++) {
            androidx.camera.camera2.pipe.RequestMetadata requestMetadata = captureSequence.getCaptureMetadataList().get(i);
            int size2 = captureSequence.getListeners().size();
            for (int i2 = 0; i2 < size2; i2++) {
                function3.invoke(requestMetadata, java.lang.Integer.valueOf(i), captureSequence.getListeners().get(i2));
            }
        }
        androidx.camera.camera2.pipe.core.Debug debug2 = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
        android.os.Trace.endSection();
        androidx.camera.camera2.pipe.core.Debug debug3 = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
        android.os.Trace.beginSection("InvokeRequestListeners");
        int size3 = captureSequence.getCaptureMetadataList().size();
        for (int i3 = 0; i3 < size3; i3++) {
            androidx.camera.camera2.pipe.RequestMetadata requestMetadata2 = captureSequence.getCaptureMetadataList().get(i3);
            int size4 = requestMetadata2.getRequest().getListeners().size();
            for (int i4 = 0; i4 < size4; i4++) {
                function3.invoke(requestMetadata2, java.lang.Integer.valueOf(i3), requestMetadata2.getRequest().getListeners().get(i4));
            }
        }
        androidx.camera.camera2.pipe.core.Debug debug4 = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
        android.os.Trace.endSection();
    }

    public final <T> void invokeOnRequest(androidx.camera.camera2.pipe.CaptureSequence<? extends T> captureSequence, androidx.camera.camera2.pipe.RequestMetadata requestMetadata, kotlin.jvm.functions.Function1<? super androidx.camera.camera2.pipe.Request.Listener, ? extends java.lang.Object> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(captureSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestMetadata, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.camera.camera2.pipe.core.Debug debug = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
        android.os.Trace.beginSection("InvokeInternalListeners");
        int size = captureSequence.getListeners().size();
        for (int i = 0; i < size; i++) {
            function1.invoke(captureSequence.getListeners().get(i));
        }
        androidx.camera.camera2.pipe.core.Debug debug2 = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
        android.os.Trace.endSection();
        androidx.camera.camera2.pipe.core.Debug debug3 = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
        android.os.Trace.beginSection("InvokeRequestListeners");
        int size2 = requestMetadata.getRequest().getListeners().size();
        for (int i2 = 0; i2 < size2; i2++) {
            function1.invoke(requestMetadata.getRequest().getListeners().get(i2));
        }
        androidx.camera.camera2.pipe.core.Debug debug4 = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
        android.os.Trace.endSection();
    }
}
