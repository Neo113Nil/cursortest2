package androidx.camera.camera2.pipe;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H¦\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/CameraBackends;", "", "", "shutdown", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/camera/camera2/pipe/CameraBackendId;", "backendId", "Landroidx/camera/camera2/pipe/CameraBackend;", "get-SG3A4s8", "(Ljava/lang/String;)Landroidx/camera/camera2/pipe/CameraBackend;", "get", "getDefault", "()Landroidx/camera/camera2/pipe/CameraBackend;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT, "", "getAllIds", "()Ljava/util/Set;", "allIds", "getActiveIds", "activeIds"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface CameraBackends {
    /* renamed from: get-SG3A4s8, reason: not valid java name */
    androidx.camera.camera2.pipe.CameraBackend mo239getSG3A4s8(java.lang.String backendId);

    java.util.Set<androidx.camera.camera2.pipe.CameraBackendId> getActiveIds();

    java.util.Set<androidx.camera.camera2.pipe.CameraBackendId> getAllIds();

    androidx.camera.camera2.pipe.CameraBackend getDefault();

    java.lang.Object shutdown(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}
