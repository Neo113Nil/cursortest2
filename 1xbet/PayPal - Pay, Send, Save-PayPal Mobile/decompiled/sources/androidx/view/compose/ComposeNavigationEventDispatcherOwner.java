package androidx.view.compose;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\n\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Landroidx/navigationevent/compose/ComposeNavigationEventDispatcherOwner;", "Landroidx/navigationevent/NavigationEventDispatcherOwner;", "Landroidx/navigationevent/NavigationEventDispatcher;", "p0", "<init>", "(Landroidx/navigationevent/NavigationEventDispatcher;)V", "Camera2StreamConfigurationMap", "Landroidx/navigationevent/NavigationEventDispatcher;", "getNavigationEventDispatcher", "()Landroidx/navigationevent/NavigationEventDispatcher;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class ComposeNavigationEventDispatcherOwner implements androidx.view.NavigationEventDispatcherOwner {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.view.NavigationEventDispatcher getHighSpeedVideoFpsRanges;

    public ComposeNavigationEventDispatcherOwner(androidx.view.NavigationEventDispatcher navigationEventDispatcher) {
        this.getHighSpeedVideoFpsRanges = navigationEventDispatcher;
    }

    @Override // androidx.view.NavigationEventDispatcherOwner
    /* renamed from: getNavigationEventDispatcher, reason: from getter */
    public final androidx.view.NavigationEventDispatcher getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }
}
