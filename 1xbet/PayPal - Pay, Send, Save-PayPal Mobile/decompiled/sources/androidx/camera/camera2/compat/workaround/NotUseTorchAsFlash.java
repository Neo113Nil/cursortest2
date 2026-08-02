package androidx.camera.camera2.compat.workaround;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\n\u001a\u00020\t2\u001e\u0010\b\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Landroidx/camera/camera2/compat/workaround/NotUseTorchAsFlash;", "Landroidx/camera/camera2/compat/workaround/UseTorchAsFlash;", "<init>", "()V", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Landroidx/camera/camera2/pipe/FrameMetadata;", "", "frameMetadata", "", "shouldUseTorchAsFlash", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shouldDisableAePrecapture", "()Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NotUseTorchAsFlash implements androidx.camera.camera2.compat.workaround.UseTorchAsFlash {
    public static final androidx.camera.camera2.compat.workaround.NotUseTorchAsFlash INSTANCE = new androidx.camera.camera2.compat.workaround.NotUseTorchAsFlash();

    @Override // androidx.camera.camera2.compat.workaround.UseTorchAsFlash
    public final boolean shouldDisableAePrecapture() {
        return false;
    }

    private NotUseTorchAsFlash() {
    }

    @Override // androidx.camera.camera2.compat.workaround.UseTorchAsFlash
    public final java.lang.Object shouldUseTorchAsFlash(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.FrameMetadata>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
    }
}
