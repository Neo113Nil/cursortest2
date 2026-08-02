package androidx.view.compose.internal;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/activity/compose/internal/BackHandlerDispatcherCompat;", "", "Landroidx/navigationevent/NavigationEventDispatcher;", "navigationEventDispatcher", "Landroidx/activity/OnBackPressedDispatcher;", "onBackPressedDispatcher", "<init>", "(Landroidx/navigationevent/NavigationEventDispatcher;Landroidx/activity/OnBackPressedDispatcher;)V", "Landroidx/activity/compose/internal/BackHandlerCompat;", "handler", "", "addHandler", "(Landroidx/activity/compose/internal/BackHandlerCompat;)V", "removeHandler", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/navigationevent/NavigationEventDispatcher;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Landroidx/activity/OnBackPressedDispatcher;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BackHandlerDispatcherCompat {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.view.NavigationEventDispatcher getHighSpeedVideoSizes;
    private final androidx.view.OnBackPressedDispatcher getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Multi-variable type inference failed */
    public BackHandlerDispatcherCompat(androidx.view.NavigationEventDispatcher navigationEventDispatcher, androidx.view.OnBackPressedDispatcher onBackPressedDispatcher) {
        this.getHighSpeedVideoSizes = navigationEventDispatcher;
        this.getHighSpeedVideoFpsRangesFor = onBackPressedDispatcher;
        if ((navigationEventDispatcher == null ? onBackPressedDispatcher : navigationEventDispatcher) == null) {
            throw new java.lang.IllegalArgumentException("At least one dispatcher (NavigationEventDispatcher or OnBackPressedDispatcher) must be non-null.".toString());
        }
    }

    public final void addHandler(androidx.view.compose.internal.BackHandlerCompat handler) {
        androidx.view.NavigationEventDispatcher navigationEventDispatcher = this.getHighSpeedVideoSizes;
        if (navigationEventDispatcher != null) {
            androidx.view.NavigationEventDispatcher.addHandler$default(navigationEventDispatcher, handler.getNavigationEventHandler(), 0, 2, null);
            return;
        }
        androidx.view.OnBackPressedDispatcher onBackPressedDispatcher = this.getHighSpeedVideoFpsRangesFor;
        if (onBackPressedDispatcher != null) {
            onBackPressedDispatcher.addCallback(handler.getOnBackPressedCallback());
            return;
        }
        throw new java.lang.IllegalStateException("Unreachable".toString());
    }

    public final void removeHandler(androidx.view.compose.internal.BackHandlerCompat handler) {
        if (this.getHighSpeedVideoSizes != null) {
            handler.getNavigationEventHandler().remove();
        } else {
            if (this.getHighSpeedVideoFpsRangesFor == null) {
                throw new java.lang.IllegalStateException("Unreachable".toString());
            }
            handler.getOnBackPressedCallback().remove();
        }
    }
}
