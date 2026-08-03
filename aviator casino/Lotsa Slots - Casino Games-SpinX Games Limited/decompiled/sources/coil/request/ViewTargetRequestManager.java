package coil.request;

/* compiled from: ViewTargetRequestManager.kt */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0007J\u0014\u0010\u0010\u001a\u00020\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012J\u0006\u0010\u0014\u001a\u00020\u0015J\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013J\u0012\u0010\u0017\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u000bH\u0007J\u0010\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0003H\u0017J\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0003H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcoil/request/ViewTargetRequestManager;", "Landroid/view/View$OnAttachStateChangeListener;", com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "currentDisposable", "Lcoil/request/ViewTargetDisposable;", "pendingClear", "Lkotlinx/coroutines/Job;", "currentRequest", "Lcoil/request/ViewTargetRequestDelegate;", "isRestart", "", "isDisposed", "disposable", "getDisposable", "job", "Lkotlinx/coroutines/Deferred;", "Lcoil/request/ImageResult;", "dispose", "", "getResult", "setRequest", "request", "onViewAttachedToWindow", "v", "onViewDetachedFromWindow", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ViewTargetRequestManager implements android.view.View.OnAttachStateChangeListener {
    private coil.request.ViewTargetDisposable currentDisposable;
    private coil.request.ViewTargetRequestDelegate currentRequest;
    private boolean isRestart;
    private kotlinx.coroutines.Job pendingClear;
    private final android.view.View view;

    public ViewTargetRequestManager(android.view.View view) {
        this.view = view;
    }

    public final synchronized boolean isDisposed(coil.request.ViewTargetDisposable disposable) {
        return disposable != this.currentDisposable;
    }

    public final synchronized coil.request.ViewTargetDisposable getDisposable(kotlinx.coroutines.Deferred<? extends coil.request.ImageResult> job) {
        coil.request.ViewTargetDisposable viewTargetDisposable = this.currentDisposable;
        if (viewTargetDisposable != null && coil.util.Utils.isMainThread() && this.isRestart) {
            this.isRestart = false;
            viewTargetDisposable.setJob(job);
            return viewTargetDisposable;
        }
        kotlinx.coroutines.Job job2 = this.pendingClear;
        if (job2 != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job2, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        this.pendingClear = null;
        coil.request.ViewTargetDisposable viewTargetDisposable2 = new coil.request.ViewTargetDisposable(this.view, job);
        this.currentDisposable = viewTargetDisposable2;
        return viewTargetDisposable2;
    }

    public final synchronized void dispose() {
        kotlinx.coroutines.Job launch$default;
        kotlinx.coroutines.Job job = this.pendingClear;
        if (job != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, kotlinx.coroutines.Dispatchers.getMain().getImmediate(), null, new coil.request.ViewTargetRequestManager$dispose$1(this, null), 2, null);
        this.pendingClear = launch$default;
        this.currentDisposable = null;
    }

    public final synchronized coil.request.ImageResult getResult() {
        coil.request.ViewTargetDisposable viewTargetDisposable;
        kotlinx.coroutines.Deferred<coil.request.ImageResult> job;
        viewTargetDisposable = this.currentDisposable;
        return (viewTargetDisposable == null || (job = viewTargetDisposable.getJob()) == null) ? null : (coil.request.ImageResult) coil.util.Utils.getCompletedOrNull(job);
    }

    public final void setRequest(coil.request.ViewTargetRequestDelegate request) {
        coil.request.ViewTargetRequestDelegate viewTargetRequestDelegate = this.currentRequest;
        if (viewTargetRequestDelegate != null) {
            viewTargetRequestDelegate.dispose();
        }
        this.currentRequest = request;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View v) {
        coil.request.ViewTargetRequestDelegate viewTargetRequestDelegate = this.currentRequest;
        if (viewTargetRequestDelegate == null) {
            return;
        }
        this.isRestart = true;
        viewTargetRequestDelegate.restart();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View v) {
        coil.request.ViewTargetRequestDelegate viewTargetRequestDelegate = this.currentRequest;
        if (viewTargetRequestDelegate != null) {
            viewTargetRequestDelegate.dispose();
        }
    }
}
