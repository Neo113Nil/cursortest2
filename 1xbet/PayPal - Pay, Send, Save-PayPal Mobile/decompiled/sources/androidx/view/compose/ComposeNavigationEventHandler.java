package androidx.view.compose;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B%\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0012\u0010\rJ\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0013\u0010\rJ\u000f\u0010\u0014\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0014\u0010\u0010J\u000f\u0010\u0015\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0015\u0010\u0010R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00198\u0006@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u00198\u0006@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u00198\u0006@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00198\u0006@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b\u0018\u0010\u001b"}, d2 = {"Landroidx/navigationevent/compose/ComposeNavigationEventHandler;", "Landroidx/navigationevent/NavigationEventInfo;", "T", "Landroidx/navigationevent/NavigationEventHandler;", "p0", "Lkotlin/Function1;", "Landroidx/navigationevent/NavigationEventTransitionState;", "", "p1", "<init>", "(Landroidx/navigationevent/NavigationEventInfo;Lkotlin/jvm/functions/Function1;)V", "Landroidx/navigationevent/NavigationEvent;", "onForwardStarted", "(Landroidx/navigationevent/NavigationEvent;)V", "onForwardProgressed", "onForwardCancelled", "()V", "onForwardCompleted", "onBackStarted", "onBackProgressed", "onBackCancelled", "onBackCompleted", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function1;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/Function0;", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function0;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class ComposeNavigationEventHandler<T extends androidx.view.NavigationEventInfo> extends androidx.view.NavigationEventHandler<T> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<androidx.view.NavigationEventTransitionState, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    kotlin.jvm.functions.Function0<kotlin.Unit> Camera2StreamConfigurationMap;
    kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRanges;
    kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    public ComposeNavigationEventHandler(T t, kotlin.jvm.functions.Function1<? super androidx.view.NavigationEventTransitionState, kotlin.Unit> function1) {
        super(t, false, false);
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
        this.getHighSpeedVideoSizes = new kotlin.jvm.functions.Function0() { // from class: androidx.navigationevent.compose.ComposeNavigationEventHandler$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.Unit unit;
                unit = kotlin.Unit.INSTANCE;
                return unit;
            }
        };
        this.getHighSpeedVideoFpsRangesFor = new kotlin.jvm.functions.Function0() { // from class: androidx.navigationevent.compose.ComposeNavigationEventHandler$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.Unit unit;
                unit = kotlin.Unit.INSTANCE;
                return unit;
            }
        };
        this.getHighSpeedVideoFpsRanges = new kotlin.jvm.functions.Function0() { // from class: androidx.navigationevent.compose.ComposeNavigationEventHandler$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.Unit unit;
                unit = kotlin.Unit.INSTANCE;
                return unit;
            }
        };
        this.Camera2StreamConfigurationMap = new kotlin.jvm.functions.Function0() { // from class: androidx.navigationevent.compose.ComposeNavigationEventHandler$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.Unit unit;
                unit = kotlin.Unit.INSTANCE;
                return unit;
            }
        };
    }

    @Override // androidx.view.NavigationEventHandler
    public final void onForwardStarted(androidx.view.NavigationEvent p0) {
        this.getHighResolutionOutputSizeshNQ4ISI.invoke(getTransitionState());
    }

    @Override // androidx.view.NavigationEventHandler
    public final void onForwardProgressed(androidx.view.NavigationEvent p0) {
        this.getHighResolutionOutputSizeshNQ4ISI.invoke(getTransitionState());
    }

    @Override // androidx.view.NavigationEventHandler
    public final void onForwardCancelled() {
        this.getHighResolutionOutputSizeshNQ4ISI.invoke(getTransitionState());
        this.getHighSpeedVideoSizes.invoke();
    }

    @Override // androidx.view.NavigationEventHandler
    public final void onForwardCompleted() {
        this.getHighResolutionOutputSizeshNQ4ISI.invoke(getTransitionState());
        this.getHighSpeedVideoFpsRangesFor.invoke();
    }

    @Override // androidx.view.NavigationEventHandler
    public final void onBackStarted(androidx.view.NavigationEvent p0) {
        this.getHighResolutionOutputSizeshNQ4ISI.invoke(getTransitionState());
    }

    @Override // androidx.view.NavigationEventHandler
    public final void onBackProgressed(androidx.view.NavigationEvent p0) {
        this.getHighResolutionOutputSizeshNQ4ISI.invoke(getTransitionState());
    }

    @Override // androidx.view.NavigationEventHandler
    public final void onBackCancelled() {
        this.getHighResolutionOutputSizeshNQ4ISI.invoke(getTransitionState());
        this.getHighSpeedVideoFpsRanges.invoke();
    }

    @Override // androidx.view.NavigationEventHandler
    public final void onBackCompleted() {
        this.getHighResolutionOutputSizeshNQ4ISI.invoke(getTransitionState());
        this.Camera2StreamConfigurationMap.invoke();
    }
}
