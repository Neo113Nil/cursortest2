package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lkotlinx/coroutines/DisposeOnCompletion;", "Lkotlinx/coroutines/JobNode;", "Lkotlinx/coroutines/DisposableHandle;", "p0", "<init>", "(Lkotlinx/coroutines/DisposableHandle;)V", "", "", "invoke", "(Ljava/lang/Throwable;)V", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/DisposableHandle;", "getHighSpeedVideoSizes", "", "getOnCancelling", "()Z", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class DisposeOnCompletion extends kotlinx.coroutines.JobNode {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.DisposableHandle getHighSpeedVideoSizes;

    @Override // kotlinx.coroutines.JobNode
    public final boolean getOnCancelling() {
        return false;
    }

    public DisposeOnCompletion(kotlinx.coroutines.DisposableHandle disposableHandle) {
        this.getHighSpeedVideoSizes = disposableHandle;
    }

    @Override // kotlinx.coroutines.JobNode
    public final void invoke(java.lang.Throwable p0) {
        this.getHighSpeedVideoSizes.dispose();
    }
}
