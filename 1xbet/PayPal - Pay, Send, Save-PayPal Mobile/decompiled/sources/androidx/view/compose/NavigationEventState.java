package androidx.view.compose;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B1\b\u0000\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\b\u0010\tR+\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8G@AX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R7\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058G@AX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R+\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u00008G@AX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR7\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058G@AX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\r\u001a\u0004\b\u001e\u0010\u0015\"\u0004\b\u001f\u0010\u0017R,\u0010!\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010 8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&"}, d2 = {"Landroidx/navigationevent/compose/NavigationEventState;", "Landroidx/navigationevent/NavigationEventInfo;", "T", "", "currentInfo", "", "backInfo", "forwardInfo", "<init>", "(Landroidx/navigationevent/NavigationEventInfo;Ljava/util/List;Ljava/util/List;)V", "Landroidx/navigationevent/NavigationEventTransitionState;", "<set-?>", "transitionState$delegate", "Landroidx/compose/runtime/MutableState;", "getTransitionState", "()Landroidx/navigationevent/NavigationEventTransitionState;", "setTransitionState$navigationevent_compose", "(Landroidx/navigationevent/NavigationEventTransitionState;)V", "transitionState", "backInfo$delegate", "getBackInfo", "()Ljava/util/List;", "setBackInfo$navigationevent_compose", "(Ljava/util/List;)V", "currentInfo$delegate", "getCurrentInfo", "()Landroidx/navigationevent/NavigationEventInfo;", "setCurrentInfo$navigationevent_compose", "(Landroidx/navigationevent/NavigationEventInfo;)V", "forwardInfo$delegate", "getForwardInfo", "setForwardInfo$navigationevent_compose", "Landroidx/navigationevent/NavigationEventHandler;", "sourceHandler", "Landroidx/navigationevent/NavigationEventHandler;", "getSourceHandler$navigationevent_compose", "()Landroidx/navigationevent/NavigationEventHandler;", "setSourceHandler$navigationevent_compose", "(Landroidx/navigationevent/NavigationEventHandler;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NavigationEventState<T extends androidx.view.NavigationEventInfo> {
    public static final int $stable = 0;

    /* renamed from: backInfo$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState backInfo;

    /* renamed from: currentInfo$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState currentInfo;

    /* renamed from: forwardInfo$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState forwardInfo;
    private androidx.view.NavigationEventHandler<? extends androidx.view.NavigationEventInfo> sourceHandler;

    /* renamed from: transitionState$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState transitionState;

    public NavigationEventState(T t, java.util.List<? extends T> list, java.util.List<? extends T> list2) {
        this.transitionState = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.navigationevent.NavigationEventTransitionState.Idle.INSTANCE, null, 2, null);
        this.backInfo = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(list, null, 2, null);
        this.currentInfo = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
        this.forwardInfo = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(list2, null, 2, null);
    }

    public /* synthetic */ NavigationEventState(androidx.view.NavigationEventInfo navigationEventInfo, java.util.List list, java.util.List list2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(navigationEventInfo, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 4) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final androidx.view.NavigationEventTransitionState getTransitionState() {
        return (androidx.view.NavigationEventTransitionState) this.transitionState.getValue();
    }

    public final void setTransitionState$navigationevent_compose(androidx.view.NavigationEventTransitionState navigationEventTransitionState) {
        this.transitionState.setValue(navigationEventTransitionState);
    }

    public final java.util.List<T> getBackInfo() {
        return (java.util.List) this.backInfo.getValue();
    }

    public final void setBackInfo$navigationevent_compose(java.util.List<? extends T> list) {
        this.backInfo.setValue(list);
    }

    public final T getCurrentInfo() {
        return (T) this.currentInfo.getValue();
    }

    public final void setCurrentInfo$navigationevent_compose(T t) {
        this.currentInfo.setValue(t);
    }

    public final java.util.List<T> getForwardInfo() {
        return (java.util.List) this.forwardInfo.getValue();
    }

    public final void setForwardInfo$navigationevent_compose(java.util.List<? extends T> list) {
        this.forwardInfo.setValue(list);
    }

    public final androidx.view.NavigationEventHandler<? extends androidx.view.NavigationEventInfo> getSourceHandler$navigationevent_compose() {
        return this.sourceHandler;
    }

    public final void setSourceHandler$navigationevent_compose(androidx.view.NavigationEventHandler<? extends androidx.view.NavigationEventInfo> navigationEventHandler) {
        this.sourceHandler = navigationEventHandler;
    }
}
