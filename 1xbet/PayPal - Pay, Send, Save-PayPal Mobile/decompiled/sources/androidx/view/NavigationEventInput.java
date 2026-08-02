package androidx.view;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000b\u0010\u0003J\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0004¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\u001b\u0010\u0003J\u000f\u0010\u001c\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\u001c\u0010\u0003J\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0004¢\u0006\u0004\b\u001d\u0010\u0019J\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0004¢\u0006\u0004\b\u001e\u0010\u0019J\u000f\u0010\u001f\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\u001f\u0010\u0003J\u000f\u0010 \u001a\u00020\u0006H\u0004¢\u0006\u0004\b \u0010\u0003R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010\bR\u0016\u0010'\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010(\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b(\u0010&"}, d2 = {"Landroidx/navigationevent/NavigationEventInput;", "", "<init>", "()V", "Landroidx/navigationevent/NavigationEventDispatcher;", "dispatcher", "", "doOnAdded$navigationevent", "(Landroidx/navigationevent/NavigationEventDispatcher;)V", "onAdded", "doOnRemoved$navigationevent", "onRemoved", "", "hasEnabledHandlers", "doOnHasEnabledHandlersChanged$navigationevent", "(Z)V", "onHasEnabledHandlersChanged", "Landroidx/navigationevent/NavigationEventHistory;", "history", "doOnHistoryChanged$navigationevent", "(Landroidx/navigationevent/NavigationEventHistory;)V", "onHistoryChanged", "Landroidx/navigationevent/NavigationEvent;", "event", "dispatchOnBackStarted", "(Landroidx/navigationevent/NavigationEvent;)V", "dispatchOnBackProgressed", "dispatchOnBackCancelled", "dispatchOnBackCompleted", "dispatchOnForwardStarted", "dispatchOnForwardProgressed", "dispatchOnForwardCancelled", "dispatchOnForwardCompleted", "Landroidx/navigationevent/NavigationEventDispatcher;", "getDispatcher$navigationevent", "()Landroidx/navigationevent/NavigationEventDispatcher;", "setDispatcher$navigationevent", "getHighSpeedVideoFpsRangesFor", "Z", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class NavigationEventInput {
    private androidx.view.NavigationEventDispatcher dispatcher;
    private boolean getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private boolean getHighSpeedVideoSizes;

    protected void onHasEnabledHandlersChanged(boolean hasEnabledHandlers) {
    }

    protected void onRemoved() {
    }

    /* renamed from: getDispatcher$navigationevent, reason: from getter */
    public final androidx.view.NavigationEventDispatcher getDispatcher() {
        return this.dispatcher;
    }

    public final void setDispatcher$navigationevent(androidx.view.NavigationEventDispatcher navigationEventDispatcher) {
        this.dispatcher = navigationEventDispatcher;
    }

    public final void doOnAdded$navigationevent(androidx.view.NavigationEventDispatcher dispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatcher, "");
        onAdded(dispatcher);
    }

    public final void doOnRemoved$navigationevent() {
        onRemoved();
    }

    public final void doOnHasEnabledHandlersChanged$navigationevent(boolean hasEnabledHandlers) {
        onHasEnabledHandlersChanged(hasEnabledHandlers);
    }

    public final void doOnHistoryChanged$navigationevent(androidx.view.NavigationEventHistory history) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(history, "");
        onHistoryChanged(history);
    }

    protected final void dispatchOnBackStarted(androidx.view.NavigationEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        androidx.view.NavigationEventDispatcher navigationEventDispatcher = this.dispatcher;
        if (navigationEventDispatcher == null) {
            throw new java.lang.IllegalStateException("This input is not added to any dispatcher.".toString());
        }
        if (this.getHighSpeedVideoSizes) {
            return;
        }
        navigationEventDispatcher.dispatchOnStarted$navigationevent(this, -1, event);
        this.getHighSpeedVideoSizes = true;
    }

    protected final void dispatchOnBackProgressed(androidx.view.NavigationEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        androidx.view.NavigationEventDispatcher navigationEventDispatcher = this.dispatcher;
        if (navigationEventDispatcher == null) {
            throw new java.lang.IllegalStateException("This input is not added to any dispatcher.".toString());
        }
        if (this.getHighSpeedVideoSizes) {
            navigationEventDispatcher.dispatchOnProgressed$navigationevent(this, -1, event);
        }
    }

    protected final void dispatchOnBackCancelled() {
        androidx.view.NavigationEventDispatcher navigationEventDispatcher = this.dispatcher;
        if (navigationEventDispatcher == null) {
            throw new java.lang.IllegalStateException("This input is not added to any dispatcher.".toString());
        }
        if (!this.getHighSpeedVideoSizes) {
            navigationEventDispatcher.dispatchOnStarted$navigationevent(this, -1, null);
        }
        navigationEventDispatcher.dispatchOnCancelled$navigationevent(this, -1);
        this.getHighSpeedVideoSizes = false;
    }

    protected final void dispatchOnBackCompleted() {
        androidx.view.NavigationEventDispatcher navigationEventDispatcher = this.dispatcher;
        if (navigationEventDispatcher == null) {
            throw new java.lang.IllegalStateException("This input is not added to any dispatcher.".toString());
        }
        if (!this.getHighSpeedVideoSizes) {
            navigationEventDispatcher.dispatchOnStarted$navigationevent(this, -1, null);
        }
        navigationEventDispatcher.dispatchOnCompleted$navigationevent(this, -1);
        this.getHighSpeedVideoSizes = false;
    }

    protected final void dispatchOnForwardStarted(androidx.view.NavigationEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        androidx.view.NavigationEventDispatcher navigationEventDispatcher = this.dispatcher;
        if (navigationEventDispatcher == null) {
            throw new java.lang.IllegalStateException("This input is not added to any dispatcher.".toString());
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            return;
        }
        navigationEventDispatcher.dispatchOnStarted$navigationevent(this, 1, event);
        this.getHighResolutionOutputSizeshNQ4ISI = true;
    }

    protected final void dispatchOnForwardProgressed(androidx.view.NavigationEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        androidx.view.NavigationEventDispatcher navigationEventDispatcher = this.dispatcher;
        if (navigationEventDispatcher == null) {
            throw new java.lang.IllegalStateException("This input is not added to any dispatcher.".toString());
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            navigationEventDispatcher.dispatchOnProgressed$navigationevent(this, 1, event);
        }
    }

    protected final void dispatchOnForwardCancelled() {
        androidx.view.NavigationEventDispatcher navigationEventDispatcher = this.dispatcher;
        if (navigationEventDispatcher == null) {
            throw new java.lang.IllegalStateException("This input is not added to any dispatcher.".toString());
        }
        if (!this.getHighResolutionOutputSizeshNQ4ISI) {
            navigationEventDispatcher.dispatchOnStarted$navigationevent(this, 1, null);
        }
        navigationEventDispatcher.dispatchOnCancelled$navigationevent(this, 1);
        this.getHighResolutionOutputSizeshNQ4ISI = false;
    }

    protected final void dispatchOnForwardCompleted() {
        androidx.view.NavigationEventDispatcher navigationEventDispatcher = this.dispatcher;
        if (navigationEventDispatcher == null) {
            throw new java.lang.IllegalStateException("This input is not added to any dispatcher.".toString());
        }
        if (!this.getHighResolutionOutputSizeshNQ4ISI) {
            navigationEventDispatcher.dispatchOnStarted$navigationevent(this, 1, null);
        }
        navigationEventDispatcher.dispatchOnCompleted$navigationevent(this, 1);
        this.getHighResolutionOutputSizeshNQ4ISI = false;
    }

    protected void onHistoryChanged(androidx.view.NavigationEventHistory history) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(history, "");
    }

    protected void onAdded(androidx.view.NavigationEventDispatcher dispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatcher, "");
    }
}
