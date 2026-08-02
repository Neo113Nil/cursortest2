package androidx.view;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u001f\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ5\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00028\u00002\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u001a\u0010\u0017J\u000f\u0010\u001b\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u001b\u0010\rJ\u000f\u0010\u001c\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001c\u0010\rJ\u000f\u0010\u001d\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u001d\u0010\rJ\u000f\u0010\u001e\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001e\u0010\rJ\u0017\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u001f\u0010\u0017J\u0017\u0010 \u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b \u0010\u0017J\u0017\u0010!\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b!\u0010\u0017J\u0017\u0010\"\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\"\u0010\u0017J\u000f\u0010#\u001a\u00020\u000bH\u0000¢\u0006\u0004\b#\u0010\rJ\u000f\u0010$\u001a\u00020\u000bH\u0014¢\u0006\u0004\b$\u0010\rJ\u000f\u0010%\u001a\u00020\u000bH\u0000¢\u0006\u0004\b%\u0010\rJ\u000f\u0010&\u001a\u00020\u000bH\u0014¢\u0006\u0004\b&\u0010\rR$\u0010\u000e\u001a\u00028\u00002\u0006\u0010'\u001a\u00028\u00008\u0007@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000e\u0010(\u001a\u0004\b)\u0010*R0\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\u0010\u0010+\u001a\u0004\b,\u0010-R0\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\u0011\u0010+\u001a\u0004\b.\u0010-R$\u00100\u001a\u00020/2\u0006\u0010'\u001a\u00020/8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R*\u0010\u0006\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u00058G@GX\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u00105\u001a\u0004\b\u0006\u00106\"\u0004\b7\u00108R*\u0010\u0007\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u00058G@GX\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u00105\u001a\u0004\b\u0007\u00106\"\u0004\b9\u00108R$\u0010;\u001a\u0004\u0018\u00010:8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@"}, d2 = {"Landroidx/navigationevent/NavigationEventHandler;", "Landroidx/navigationevent/NavigationEventInfo;", "T", "", "initialInfo", "", "isBackEnabled", "isForwardEnabled", "<init>", "(Landroidx/navigationevent/NavigationEventInfo;ZZ)V", "(Landroidx/navigationevent/NavigationEventInfo;Z)V", "", "remove", "()V", "currentInfo", "", "backInfo", "forwardInfo", "setInfo", "(Landroidx/navigationevent/NavigationEventInfo;Ljava/util/List;Ljava/util/List;)V", "Landroidx/navigationevent/NavigationEvent;", "event", "doOnBackStarted$navigationevent", "(Landroidx/navigationevent/NavigationEvent;)V", "onBackStarted", "doOnBackProgressed$navigationevent", "onBackProgressed", "doOnBackCompleted$navigationevent", "onBackCompleted", "doOnBackCancelled$navigationevent", "onBackCancelled", "doOnForwardStarted$navigationevent", "onForwardStarted", "doOnForwardProgressed$navigationevent", "onForwardProgressed", "doOnForwardCompleted$navigationevent", "onForwardCompleted", "doOnForwardCancelled$navigationevent", "onForwardCancelled", "p0", "Landroidx/navigationevent/NavigationEventInfo;", "getCurrentInfo", "()Landroidx/navigationevent/NavigationEventInfo;", "Ljava/util/List;", "getBackInfo", "()Ljava/util/List;", "getForwardInfo", "Landroidx/navigationevent/NavigationEventTransitionState;", "transitionState", "Landroidx/navigationevent/NavigationEventTransitionState;", "getTransitionState", "()Landroidx/navigationevent/NavigationEventTransitionState;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Z", "()Z", "setBackEnabled", "(Z)V", "setForwardEnabled", "Landroidx/navigationevent/NavigationEventDispatcher;", "dispatcher", "Landroidx/navigationevent/NavigationEventDispatcher;", "getDispatcher$navigationevent", "()Landroidx/navigationevent/NavigationEventDispatcher;", "setDispatcher$navigationevent", "(Landroidx/navigationevent/NavigationEventDispatcher;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class NavigationEventHandler<T extends androidx.view.NavigationEventInfo> {
    private java.util.List<? extends T> backInfo;
    private T currentInfo;
    private androidx.view.NavigationEventDispatcher dispatcher;
    private java.util.List<? extends T> forwardInfo;
    private boolean isBackEnabled;
    private boolean isForwardEnabled;
    private androidx.view.NavigationEventTransitionState transitionState;

    protected void onBackCancelled() {
    }

    protected void onForwardCancelled() {
    }

    public NavigationEventHandler(T t, boolean z, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
        this.currentInfo = t;
        this.backInfo = kotlin.collections.CollectionsKt.emptyList();
        this.forwardInfo = kotlin.collections.CollectionsKt.emptyList();
        this.transitionState = androidx.navigationevent.NavigationEventTransitionState.Idle.INSTANCE;
        this.isBackEnabled = z;
        this.isForwardEnabled = z2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavigationEventHandler(T t, boolean z) {
        this(t, z, false);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
    }

    public final T getCurrentInfo() {
        return this.currentInfo;
    }

    public final java.util.List<T> getBackInfo() {
        return this.backInfo;
    }

    public final java.util.List<T> getForwardInfo() {
        return this.forwardInfo;
    }

    public final androidx.view.NavigationEventTransitionState getTransitionState() {
        return this.transitionState;
    }

    public final boolean isBackEnabled() {
        androidx.view.NavigationEventDispatcher navigationEventDispatcher = this.dispatcher;
        if (navigationEventDispatcher == null || navigationEventDispatcher.isEnabled()) {
            return this.isBackEnabled;
        }
        return false;
    }

    public final void setBackEnabled(boolean z) {
        androidx.view.NavigationEventProcessor sharedProcessor;
        if (this.isBackEnabled != z) {
            this.isBackEnabled = z;
            androidx.view.NavigationEventDispatcher navigationEventDispatcher = this.dispatcher;
            if (navigationEventDispatcher == null || (sharedProcessor = navigationEventDispatcher.getSharedProcessor()) == null) {
                return;
            }
            sharedProcessor.refreshEnabledHandlers();
        }
    }

    public final boolean isForwardEnabled() {
        androidx.view.NavigationEventDispatcher navigationEventDispatcher = this.dispatcher;
        if (navigationEventDispatcher == null || navigationEventDispatcher.isEnabled()) {
            return this.isForwardEnabled;
        }
        return false;
    }

    public final void setForwardEnabled(boolean z) {
        androidx.view.NavigationEventProcessor sharedProcessor;
        if (this.isForwardEnabled != z) {
            this.isForwardEnabled = z;
            androidx.view.NavigationEventDispatcher navigationEventDispatcher = this.dispatcher;
            if (navigationEventDispatcher == null || (sharedProcessor = navigationEventDispatcher.getSharedProcessor()) == null) {
                return;
            }
            sharedProcessor.refreshEnabledHandlers();
        }
    }

    /* renamed from: getDispatcher$navigationevent, reason: from getter */
    public final androidx.view.NavigationEventDispatcher getDispatcher() {
        return this.dispatcher;
    }

    public final void setDispatcher$navigationevent(androidx.view.NavigationEventDispatcher navigationEventDispatcher) {
        this.dispatcher = navigationEventDispatcher;
    }

    public final void remove() {
        androidx.view.NavigationEventDispatcher navigationEventDispatcher = this.dispatcher;
        if (navigationEventDispatcher != null) {
            navigationEventDispatcher.removeHandler$navigationevent(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setInfo$default(androidx.view.NavigationEventHandler navigationEventHandler, androidx.view.NavigationEventInfo navigationEventInfo, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setInfo");
        }
        if ((i & 2) != 0) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        if ((i & 4) != 0) {
            list2 = kotlin.collections.CollectionsKt.emptyList();
        }
        navigationEventHandler.setInfo(navigationEventInfo, list, list2);
    }

    public final void setInfo(T currentInfo, java.util.List<? extends T> backInfo, java.util.List<? extends T> forwardInfo) {
        androidx.view.NavigationEventProcessor sharedProcessor;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(forwardInfo, "");
        this.currentInfo = currentInfo;
        this.backInfo = backInfo;
        this.forwardInfo = forwardInfo;
        androidx.view.NavigationEventDispatcher navigationEventDispatcher = this.dispatcher;
        if (navigationEventDispatcher == null || (sharedProcessor = navigationEventDispatcher.getSharedProcessor()) == null) {
            return;
        }
        sharedProcessor.updateEnabledHandlerInfo$navigationevent(this);
    }

    public final void doOnBackStarted$navigationevent(androidx.view.NavigationEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.transitionState = new androidx.navigationevent.NavigationEventTransitionState.InProgress(event, -1);
        onBackStarted(event);
    }

    public final void doOnBackProgressed$navigationevent(androidx.view.NavigationEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.transitionState = new androidx.navigationevent.NavigationEventTransitionState.InProgress(event, -1);
        onBackProgressed(event);
    }

    public final void doOnBackCompleted$navigationevent() {
        this.transitionState = androidx.navigationevent.NavigationEventTransitionState.Idle.INSTANCE;
        onBackCompleted();
    }

    protected void onBackCompleted() {
        throw new java.lang.UnsupportedOperationException("A handler that receives a 'backCompleted' event must override 'onBackCompleted()' to handle the callback.");
    }

    public final void doOnBackCancelled$navigationevent() {
        this.transitionState = androidx.navigationevent.NavigationEventTransitionState.Idle.INSTANCE;
        onBackCancelled();
    }

    public final void doOnForwardStarted$navigationevent(androidx.view.NavigationEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.transitionState = new androidx.navigationevent.NavigationEventTransitionState.InProgress(event, 1);
        onForwardStarted(event);
    }

    public final void doOnForwardProgressed$navigationevent(androidx.view.NavigationEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.transitionState = new androidx.navigationevent.NavigationEventTransitionState.InProgress(event, 1);
        onForwardProgressed(event);
    }

    public final void doOnForwardCompleted$navigationevent() {
        this.transitionState = androidx.navigationevent.NavigationEventTransitionState.Idle.INSTANCE;
        onForwardCompleted();
    }

    protected void onForwardCompleted() {
        throw new java.lang.UnsupportedOperationException("A handler that receives a 'forwardCompleted' event must override 'onForwardCompleted()' to handle the callback.");
    }

    public final void doOnForwardCancelled$navigationevent() {
        this.transitionState = androidx.navigationevent.NavigationEventTransitionState.Idle.INSTANCE;
        onForwardCancelled();
    }

    public final void setInfo(T t, java.util.List<? extends T> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        setInfo$default(this, t, list, null, 4, null);
    }

    public final void setInfo(T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
        setInfo$default(this, t, null, null, 6, null);
    }

    protected void onForwardStarted(androidx.view.NavigationEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
    }

    protected void onForwardProgressed(androidx.view.NavigationEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
    }

    protected void onBackStarted(androidx.view.NavigationEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
    }

    protected void onBackProgressed(androidx.view.NavigationEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
    }
}
