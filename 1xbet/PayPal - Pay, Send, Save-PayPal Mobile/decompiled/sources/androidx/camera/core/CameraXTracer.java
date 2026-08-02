package androidx.camera.core;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ1\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0004\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\r\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Landroidx/camera/core/CameraXTracer;", "", "<init>", "()V", "", "label", "Ljava/lang/Runnable;", "block", "", "trace", "(Ljava/lang/String;Ljava/lang/Runnable;)V", "T", "Lkotlin/Function0;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CameraXTracer {
    public static final androidx.camera.core.CameraXTracer INSTANCE = new androidx.camera.core.CameraXTracer();

    private CameraXTracer() {
    }

    public final <T> T trace(java.lang.String label, kotlin.jvm.functions.Function0<? extends T> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(label, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        androidx.tracing.Trace.beginSection("CX:".concat(java.lang.String.valueOf(label)));
        try {
            return block.invoke();
        } finally {
            androidx.tracing.Trace.endSection();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void trace(java.lang.String label, java.lang.Runnable block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(label, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        androidx.tracing.Trace.beginSection("CX:".concat(java.lang.String.valueOf(label)));
        try {
            block.run();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } finally {
            androidx.tracing.Trace.endSection();
        }
    }
}
