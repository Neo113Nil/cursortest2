package coil3.view;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR(\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0017@\u0017X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcoil3/request/ViewTargetDisposable;", "Lcoil3/request/Disposable;", "Landroid/view/View;", "view", "Lkotlinx/coroutines/Deferred;", "Lcoil3/request/ImageResult;", "job", "<init>", "(Landroid/view/View;Lkotlinx/coroutines/Deferred;)V", "", "dispose", "()V", "Camera2StreamConfigurationMap", "Landroid/view/View;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/Deferred;", "getJob", "()Lkotlinx/coroutines/Deferred;", "setJob", "(Lkotlinx/coroutines/Deferred;)V", "", "isDisposed", "()Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ViewTargetDisposable implements coil3.view.Disposable {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final android.view.View getHighResolutionOutputSizeshNQ4ISI;
    private volatile kotlinx.coroutines.Deferred<? extends coil3.view.ImageResult> job;

    public ViewTargetDisposable(android.view.View view, kotlinx.coroutines.Deferred<? extends coil3.view.ImageResult> deferred) {
        this.getHighResolutionOutputSizeshNQ4ISI = view;
        this.job = deferred;
    }

    @Override // coil3.view.Disposable
    public final kotlinx.coroutines.Deferred<coil3.view.ImageResult> getJob() {
        return this.job;
    }

    public final void setJob(kotlinx.coroutines.Deferred<? extends coil3.view.ImageResult> deferred) {
        this.job = deferred;
    }

    @Override // coil3.view.Disposable
    public final boolean isDisposed() {
        return coil3.view.C0300ViewTargetRequestManagerKt.getRequestManager(this.getHighResolutionOutputSizeshNQ4ISI).isDisposed(this);
    }

    @Override // coil3.view.Disposable
    public final void dispose() {
        if (isDisposed()) {
            return;
        }
        coil3.view.C0300ViewTargetRequestManagerKt.getRequestManager(this.getHighResolutionOutputSizeshNQ4ISI).dispose();
    }
}
