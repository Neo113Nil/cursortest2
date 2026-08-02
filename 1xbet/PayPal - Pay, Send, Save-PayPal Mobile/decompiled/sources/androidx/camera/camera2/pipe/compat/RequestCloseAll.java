package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/camera/camera2/pipe/compat/RequestCloseAll;", "Landroidx/camera/camera2/pipe/compat/CameraRequest;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/CompletableDeferred;", "", "deferred", "Lkotlinx/coroutines/CompletableDeferred;", "getDeferred", "()Lkotlinx/coroutines/CompletableDeferred;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RequestCloseAll extends androidx.camera.camera2.pipe.compat.CameraRequest {
    private final kotlinx.coroutines.CompletableDeferred<kotlin.Unit> deferred;

    public RequestCloseAll() {
        super(null);
        this.deferred = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
    }

    public final kotlinx.coroutines.CompletableDeferred<kotlin.Unit> getDeferred() {
        return this.deferred;
    }

    public final java.lang.String toString() {
        return "RequestCloseAll";
    }
}
