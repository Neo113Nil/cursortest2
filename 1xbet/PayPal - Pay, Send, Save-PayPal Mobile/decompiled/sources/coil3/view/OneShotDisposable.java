package coil3.view;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcoil3/request/OneShotDisposable;", "Lcoil3/request/Disposable;", "Lkotlinx/coroutines/Deferred;", "Lcoil3/request/ImageResult;", "job", "<init>", "(Lkotlinx/coroutines/Deferred;)V", "", "dispose", "()V", "Lkotlinx/coroutines/Deferred;", "getJob", "()Lkotlinx/coroutines/Deferred;", "", "isDisposed", "()Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OneShotDisposable implements coil3.view.Disposable {
    private final kotlinx.coroutines.Deferred<coil3.view.ImageResult> job;

    /* JADX WARN: Multi-variable type inference failed */
    public OneShotDisposable(kotlinx.coroutines.Deferred<? extends coil3.view.ImageResult> deferred) {
        this.job = deferred;
    }

    @Override // coil3.view.Disposable
    public final kotlinx.coroutines.Deferred<coil3.view.ImageResult> getJob() {
        return this.job;
    }

    @Override // coil3.view.Disposable
    public final boolean isDisposed() {
        return !getJob().isActive();
    }

    @Override // coil3.view.Disposable
    public final void dispose() {
        if (isDisposed()) {
            return;
        }
        kotlinx.coroutines.Job.DefaultImpls.cancel$default((kotlinx.coroutines.Job) getJob(), (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
    }
}
