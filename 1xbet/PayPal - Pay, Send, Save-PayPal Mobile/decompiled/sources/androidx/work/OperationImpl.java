package androidx.work;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/work/OperationImpl;", "Landroidx/work/Operation;", "Landroidx/lifecycle/LiveData;", "Landroidx/work/Operation$State;", "p0", "Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/work/Operation$State$SUCCESS;", "p1", "<init>", "(Landroidx/lifecycle/LiveData;Lcom/google/common/util/concurrent/ListenableFuture;)V", "getState", "()Landroidx/lifecycle/LiveData;", "getResult", "()Lcom/google/common/util/concurrent/ListenableFuture;", "Camera2StreamConfigurationMap", "Landroidx/lifecycle/LiveData;", "getHighSpeedVideoFpsRanges", "Lcom/google/common/util/concurrent/ListenableFuture;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class OperationImpl implements androidx.work.Operation {
    private final androidx.view.LiveData<androidx.work.Operation.State> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.google.common.util.concurrent.ListenableFuture<androidx.work.Operation.State.SUCCESS> getHighSpeedVideoSizes;

    public OperationImpl(androidx.view.LiveData<androidx.work.Operation.State> liveData, com.google.common.util.concurrent.ListenableFuture<androidx.work.Operation.State.SUCCESS> listenableFuture) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(liveData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listenableFuture, "");
        this.Camera2StreamConfigurationMap = liveData;
        this.getHighSpeedVideoSizes = listenableFuture;
    }

    @Override // androidx.work.Operation
    public final androidx.view.LiveData<androidx.work.Operation.State> getState() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.work.Operation
    public final com.google.common.util.concurrent.ListenableFuture<androidx.work.Operation.State.SUCCESS> getResult() {
        return this.getHighSpeedVideoSizes;
    }
}
