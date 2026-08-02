package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u000b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lkotlinx/coroutines/ChildHandleNode;", "Lkotlinx/coroutines/JobNode;", "Lkotlinx/coroutines/ChildHandle;", "Lkotlinx/coroutines/ChildJob;", "p0", "<init>", "(Lkotlinx/coroutines/ChildJob;)V", "", "", "invoke", "(Ljava/lang/Throwable;)V", "", "childCancelled", "(Ljava/lang/Throwable;)Z", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/ChildJob;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/Job;", "getParent", "()Lkotlinx/coroutines/Job;", "Camera2StreamConfigurationMap", "getOnCancelling", "()Z", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class ChildHandleNode extends kotlinx.coroutines.JobNode implements kotlinx.coroutines.ChildHandle {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    public final kotlinx.coroutines.ChildJob getHighSpeedVideoSizes;

    @Override // kotlinx.coroutines.JobNode
    public final boolean getOnCancelling() {
        return true;
    }

    public ChildHandleNode(kotlinx.coroutines.ChildJob childJob) {
        this.getHighSpeedVideoSizes = childJob;
    }

    @Override // kotlinx.coroutines.ChildHandle
    public final kotlinx.coroutines.Job getParent() {
        return getJob();
    }

    @Override // kotlinx.coroutines.JobNode
    public final void invoke(java.lang.Throwable p0) {
        this.getHighSpeedVideoSizes.parentCancelled(getJob());
    }

    @Override // kotlinx.coroutines.ChildHandle
    public final boolean childCancelled(java.lang.Throwable p0) {
        return getJob().childCancelled(p0);
    }
}
