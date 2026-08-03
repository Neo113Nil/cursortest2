package coil.request;

/* compiled from: Disposable.kt */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcoil/request/ViewTargetDisposable;", "Lcoil/request/Disposable;", com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "job", "Lkotlinx/coroutines/Deferred;", "Lcoil/request/ImageResult;", "<init>", "(Landroid/view/View;Lkotlinx/coroutines/Deferred;)V", "getJob", "()Lkotlinx/coroutines/Deferred;", "setJob", "(Lkotlinx/coroutines/Deferred;)V", "isDisposed", "", "()Z", "dispose", "", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ViewTargetDisposable implements coil.request.Disposable {
    private volatile kotlinx.coroutines.Deferred<? extends coil.request.ImageResult> job;
    private final android.view.View view;

    public ViewTargetDisposable(android.view.View view, kotlinx.coroutines.Deferred<? extends coil.request.ImageResult> deferred) {
        this.view = view;
        this.job = deferred;
    }

    @Override // coil.request.Disposable
    public kotlinx.coroutines.Deferred<coil.request.ImageResult> getJob() {
        return this.job;
    }

    public void setJob(kotlinx.coroutines.Deferred<? extends coil.request.ImageResult> deferred) {
        this.job = deferred;
    }

    @Override // coil.request.Disposable
    public boolean isDisposed() {
        return coil.util.Utils.getRequestManager(this.view).isDisposed(this);
    }

    @Override // coil.request.Disposable
    public void dispose() {
        if (isDisposed()) {
            return;
        }
        coil.util.Utils.getRequestManager(this.view).dispose();
    }
}
