package androidx.view;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00028\u0000H$¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00038\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\"\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000f8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00158\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u00158\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b\u001f\u0010\tR\u001a\u0010 \u001a\u00020\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010\u001e\u0012\u0004\b!\u0010\t"}, d2 = {"Landroidx/lifecycle/ComputableLiveData;", "T", "", "Ljava/util/concurrent/Executor;", "executor", "<init>", "(Ljava/util/concurrent/Executor;)V", "", "invalidate", "()V", "compute", "()Ljava/lang/Object;", "Ljava/util/concurrent/Executor;", "getExecutor$lifecycle_livedata", "()Ljava/util/concurrent/Executor;", "Landroidx/lifecycle/LiveData;", "getHighSpeedVideoFpsRangesFor", "Landroidx/lifecycle/LiveData;", "liveData", "getLiveData", "()Landroidx/lifecycle/LiveData;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "invalid", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getInvalid$lifecycle_livedata", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "computing", "getComputing$lifecycle_livedata", "Ljava/lang/Runnable;", "refreshRunnable", "Ljava/lang/Runnable;", "getRefreshRunnable$lifecycle_livedata$annotations", "invalidationRunnable", "getInvalidationRunnable$lifecycle_livedata$annotations"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class ComputableLiveData<T> {
    private final java.util.concurrent.atomic.AtomicBoolean computing;
    private final java.util.concurrent.Executor executor;
    private final androidx.view.LiveData<T> getHighSpeedVideoFpsRangesFor;
    private final java.util.concurrent.atomic.AtomicBoolean invalid;
    public final java.lang.Runnable invalidationRunnable;
    private final androidx.view.LiveData<T> liveData;
    public final java.lang.Runnable refreshRunnable;

    public static /* synthetic */ void getInvalidationRunnable$lifecycle_livedata$annotations() {
    }

    public static /* synthetic */ void getRefreshRunnable$lifecycle_livedata$annotations() {
    }

    protected abstract T compute();

    public ComputableLiveData(java.util.concurrent.Executor executor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        this.executor = executor;
        androidx.view.LiveData<T> liveData = new androidx.view.LiveData<T>(this) { // from class: androidx.lifecycle.ComputableLiveData$_liveData$1
            final /* synthetic */ androidx.view.ComputableLiveData<T> getHighSpeedVideoSizes;

            {
                this.getHighSpeedVideoSizes = this;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.view.LiveData
            public final void onActive() {
                this.getHighSpeedVideoSizes.getExecutor().execute(this.getHighSpeedVideoSizes.refreshRunnable);
            }
        };
        this.getHighSpeedVideoFpsRangesFor = liveData;
        this.liveData = liveData;
        this.invalid = new java.util.concurrent.atomic.AtomicBoolean(true);
        this.computing = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.refreshRunnable = new java.lang.Runnable() { // from class: androidx.lifecycle.ComputableLiveData$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                androidx.view.ComputableLiveData.m9159$r8$lambda$3YPDTAMNTCGTz9DkpLbjudOC6w(androidx.view.ComputableLiveData.this);
            }
        };
        this.invalidationRunnable = new java.lang.Runnable() { // from class: androidx.lifecycle.ComputableLiveData$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                androidx.view.ComputableLiveData.m9160$r8$lambda$XOqFMu6PZ3VOK6RxhAtBHvr7Js(androidx.view.ComputableLiveData.this);
            }
        };
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ComputableLiveData(java.util.concurrent.Executor executor, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(executor);
        if ((i & 1) != 0) {
            executor = androidx.arch.core.executor.ArchTaskExecutor.getIOThreadExecutor();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(executor, "");
        }
    }

    /* renamed from: getExecutor$lifecycle_livedata, reason: from getter */
    public final java.util.concurrent.Executor getExecutor() {
        return this.executor;
    }

    public androidx.view.LiveData<T> getLiveData() {
        return this.liveData;
    }

    /* renamed from: getInvalid$lifecycle_livedata, reason: from getter */
    public final java.util.concurrent.atomic.AtomicBoolean getInvalid() {
        return this.invalid;
    }

    /* renamed from: getComputing$lifecycle_livedata, reason: from getter */
    public final java.util.concurrent.atomic.AtomicBoolean getComputing() {
        return this.computing;
    }

    public void invalidate() {
        androidx.arch.core.executor.ArchTaskExecutor.getInstance().executeOnMainThread(this.invalidationRunnable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: $r8$lambda$3YPDTAMNTCGT-z9DkpLbjudOC6w, reason: not valid java name */
    public static /* synthetic */ void m9159$r8$lambda$3YPDTAMNTCGTz9DkpLbjudOC6w(androidx.view.ComputableLiveData computableLiveData) {
        do {
            if (!computableLiveData.computing.compareAndSet(false, true)) {
                return;
            }
            java.lang.Object obj = null;
            boolean z = false;
            while (computableLiveData.invalid.compareAndSet(true, false)) {
                try {
                    obj = computableLiveData.compute();
                    z = true;
                } finally {
                    computableLiveData.computing.set(false);
                }
            }
            if (z) {
                computableLiveData.getLiveData().postValue(obj);
            }
            if (!z) {
                return;
            }
        } while (computableLiveData.invalid.get());
    }

    /* renamed from: $r8$lambda$XOqFMu6PZ3VOK6RxhAtBHvr7J-s, reason: not valid java name */
    public static /* synthetic */ void m9160$r8$lambda$XOqFMu6PZ3VOK6RxhAtBHvr7Js(androidx.view.ComputableLiveData computableLiveData) {
        boolean hasActiveObservers = computableLiveData.getLiveData().hasActiveObservers();
        if (computableLiveData.invalid.compareAndSet(false, true) && hasActiveObservers) {
            computableLiveData.executor.execute(computableLiveData.refreshRunnable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ComputableLiveData() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
