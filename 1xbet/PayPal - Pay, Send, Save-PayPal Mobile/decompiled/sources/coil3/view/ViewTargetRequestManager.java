package coil3.view;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u0005J\u0017\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u0005R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010 \u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010%R\u0016\u0010\u001e\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010&"}, d2 = {"Lcoil3/request/ViewTargetRequestManager;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "Lcoil3/request/ViewTargetDisposable;", "disposable", "", "isDisposed", "(Lcoil3/request/ViewTargetDisposable;)Z", "Lkotlinx/coroutines/Deferred;", "Lcoil3/request/ImageResult;", "job", "getDisposable", "(Lkotlinx/coroutines/Deferred;)Lcoil3/request/ViewTargetDisposable;", "", "dispose", "()V", "getResult", "()Lcoil3/request/ImageResult;", "Lcoil3/request/ViewTargetRequestDelegate;", "request", "setRequest", "(Lcoil3/request/ViewTargetRequestDelegate;)V", "v", "onViewAttachedToWindow", "onViewDetachedFromWindow", "getHighSpeedVideoFpsRangesFor", "Landroid/view/View;", "getHighSpeedVideoFpsRanges", "Lcoil3/request/ViewTargetDisposable;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/Job;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/Job;", "getHighResolutionOutputSizeshNQ4ISI", "Lcoil3/request/ViewTargetRequestDelegate;", "Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ViewTargetRequestManager implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private coil3.view.ViewTargetRequestDelegate getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private boolean getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private coil3.view.ViewTargetDisposable Camera2StreamConfigurationMap;
    private final android.view.View getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private kotlinx.coroutines.Job getHighResolutionOutputSizeshNQ4ISI;

    public ViewTargetRequestManager(android.view.View view) {
        this.getHighSpeedVideoFpsRangesFor = view;
    }

    public final boolean isDisposed(coil3.view.ViewTargetDisposable disposable) {
        boolean z;
        synchronized (this) {
            z = disposable != this.Camera2StreamConfigurationMap;
        }
        return z;
    }

    public final coil3.view.ViewTargetDisposable getDisposable(kotlinx.coroutines.Deferred<? extends coil3.view.ImageResult> job) {
        synchronized (this) {
            coil3.view.ViewTargetDisposable viewTargetDisposable = this.Camera2StreamConfigurationMap;
            if (viewTargetDisposable != null && coil3.content.Utils_androidKt.isMainThread() && this.getHighSpeedVideoFpsRanges) {
                this.getHighSpeedVideoFpsRanges = false;
                viewTargetDisposable.setJob(job);
                return viewTargetDisposable;
            }
            kotlinx.coroutines.Job job2 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (job2 != null) {
                kotlinx.coroutines.Job.DefaultImpls.cancel$default(job2, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
            }
            this.getHighResolutionOutputSizeshNQ4ISI = null;
            coil3.view.ViewTargetDisposable viewTargetDisposable2 = new coil3.view.ViewTargetDisposable(this.getHighSpeedVideoFpsRangesFor, job);
            this.Camera2StreamConfigurationMap = viewTargetDisposable2;
            return viewTargetDisposable2;
        }
    }

    public final void dispose() {
        kotlinx.coroutines.Job launch$default;
        synchronized (this) {
            kotlinx.coroutines.Job job = this.getHighResolutionOutputSizeshNQ4ISI;
            if (job != null) {
                kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
            }
            launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, kotlinx.coroutines.Dispatchers.getMain().getImmediate(), null, new coil3.view.ViewTargetRequestManager$dispose$1(this, null), 2, null);
            this.getHighResolutionOutputSizeshNQ4ISI = launch$default;
            this.Camera2StreamConfigurationMap = null;
        }
    }

    public final coil3.view.ImageResult getResult() {
        coil3.view.ImageResult imageResult;
        kotlinx.coroutines.Deferred<coil3.view.ImageResult> job;
        synchronized (this) {
            coil3.view.ViewTargetDisposable viewTargetDisposable = this.Camera2StreamConfigurationMap;
            imageResult = (viewTargetDisposable == null || (job = viewTargetDisposable.getJob()) == null) ? null : (coil3.view.ImageResult) coil3.content.CoroutinesKt.getCompletedOrNull(job);
        }
        return imageResult;
    }

    public final void setRequest(coil3.view.ViewTargetRequestDelegate request) {
        coil3.view.ViewTargetRequestDelegate viewTargetRequestDelegate = this.getHighSpeedVideoSizes;
        if (viewTargetRequestDelegate != null) {
            viewTargetRequestDelegate.dispose();
        }
        this.getHighSpeedVideoSizes = request;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View v) {
        coil3.view.ViewTargetRequestDelegate viewTargetRequestDelegate = this.getHighSpeedVideoSizes;
        if (viewTargetRequestDelegate == null) {
            return;
        }
        this.getHighSpeedVideoFpsRanges = true;
        viewTargetRequestDelegate.restart();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View v) {
        coil3.view.ViewTargetRequestDelegate viewTargetRequestDelegate = this.getHighSpeedVideoSizes;
        if (viewTargetRequestDelegate != null) {
            viewTargetRequestDelegate.dispose();
        }
    }
}
