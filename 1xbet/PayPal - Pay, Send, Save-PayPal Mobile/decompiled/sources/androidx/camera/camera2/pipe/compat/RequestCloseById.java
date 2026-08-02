package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\bR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/camera/camera2/pipe/compat/RequestCloseById;", "Landroidx/camera/camera2/pipe/compat/CameraRequest;", "Landroidx/camera/camera2/pipe/CameraId;", "activeCameraId", "<init>", "(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getActiveCameraId-Dz_R5H8", "Lkotlinx/coroutines/CompletableDeferred;", "", "deferred", "Lkotlinx/coroutines/CompletableDeferred;", "getDeferred", "()Lkotlinx/coroutines/CompletableDeferred;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RequestCloseById extends androidx.camera.camera2.pipe.compat.CameraRequest {
    private final java.lang.String activeCameraId;
    private final kotlinx.coroutines.CompletableDeferred<kotlin.Unit> deferred;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private RequestCloseById(java.lang.String str) {
        super(null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.activeCameraId = str;
        this.deferred = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
    }

    /* renamed from: getActiveCameraId-Dz_R5H8, reason: not valid java name and from getter */
    public final java.lang.String getActiveCameraId() {
        return this.activeCameraId;
    }

    public final kotlinx.coroutines.CompletableDeferred<kotlin.Unit> getDeferred() {
        return this.deferred;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RequestCloseById(");
        sb.append((java.lang.Object) androidx.camera.camera2.pipe.CameraId.m398toStringimpl(this.activeCameraId));
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ RequestCloseById(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
