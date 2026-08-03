package androidx.compose.foundation.gestures;

/* compiled from: Scrollable.kt */
@kotlin.Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005BK\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0015J\u0010\u00102\u001a\u0002032\u0006\u00104\u001a\u000205H\u0016J\b\u00106\u001a\u000203H\u0016J\u001a\u00107\u001a\u00020\r2\u0006\u00108\u001a\u000209H\u0016ø\u0001\u0000¢\u0006\u0004\b:\u0010;J\b\u0010<\u001a\u000203H\u0016J\u001a\u0010=\u001a\u00020\r2\u0006\u00108\u001a\u000209H\u0016ø\u0001\u0000¢\u0006\u0004\b>\u0010;JL\u0010?\u001a\u0002032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\b\u0010@\u001a\u000203H\u0002R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u001e\u001a\u00020\u001f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\"\u001a\u00020#¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010&\u001a\u00020'¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010*\u001a\u00020+¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010.\u001a\u00020/¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006A"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollableNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/ObserverModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "Landroidx/compose/ui/input/key/KeyInputModifierNode;", "state", "Landroidx/compose/foundation/gestures/ScrollableState;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "overscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "enabled", "", "reverseDirection", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "bringIntoViewSpec", "Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "(Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/OverscrollEffect;ZZLandroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/gestures/BringIntoViewSpec;)V", "contentInViewNode", "Landroidx/compose/foundation/gestures/ContentInViewNode;", "getContentInViewNode", "()Landroidx/compose/foundation/gestures/ContentInViewNode;", "defaultFlingBehavior", "Landroidx/compose/foundation/gestures/DefaultFlingBehavior;", "getDefaultFlingBehavior", "()Landroidx/compose/foundation/gestures/DefaultFlingBehavior;", "nestedScrollConnection", "Landroidx/compose/foundation/gestures/ScrollableNestedScrollConnection;", "getNestedScrollConnection", "()Landroidx/compose/foundation/gestures/ScrollableNestedScrollConnection;", "nestedScrollDispatcher", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "getNestedScrollDispatcher", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "scrollableContainer", "Landroidx/compose/foundation/gestures/ModifierLocalScrollableContainerProvider;", "getScrollableContainer", "()Landroidx/compose/foundation/gestures/ModifierLocalScrollableContainerProvider;", "scrollableGesturesNode", "Landroidx/compose/foundation/gestures/ScrollableGesturesNode;", "getScrollableGesturesNode", "()Landroidx/compose/foundation/gestures/ScrollableGesturesNode;", "scrollingLogic", "Landroidx/compose/foundation/gestures/ScrollingLogic;", "getScrollingLogic", "()Landroidx/compose/foundation/gestures/ScrollingLogic;", "applyFocusProperties", "", "focusProperties", "Landroidx/compose/ui/focus/FocusProperties;", "onAttach", "onKeyEvent", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "Landroidx/compose/ui/input/key/KeyEvent;", "onKeyEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "onObservedReadsChanged", "onPreKeyEvent", "onPreKeyEvent-ZmokQxo", "update", "updateDefaultFlingBehavior", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ScrollableNode extends androidx.compose.ui.node.DelegatingNode implements androidx.compose.ui.node.ObserverModifierNode, androidx.compose.ui.node.CompositionLocalConsumerModifierNode, androidx.compose.ui.focus.FocusPropertiesModifierNode, androidx.compose.ui.input.key.KeyInputModifierNode {
    private final androidx.compose.foundation.gestures.ContentInViewNode contentInViewNode;
    private final androidx.compose.foundation.gestures.DefaultFlingBehavior defaultFlingBehavior;
    private boolean enabled;
    private androidx.compose.foundation.gestures.FlingBehavior flingBehavior;
    private androidx.compose.foundation.interaction.MutableInteractionSource interactionSource;
    private final androidx.compose.foundation.gestures.ScrollableNestedScrollConnection nestedScrollConnection;
    private final androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher nestedScrollDispatcher;
    private androidx.compose.foundation.gestures.Orientation orientation;
    private androidx.compose.foundation.OverscrollEffect overscrollEffect;
    private boolean reverseDirection;
    private final androidx.compose.foundation.gestures.ModifierLocalScrollableContainerProvider scrollableContainer;
    private final androidx.compose.foundation.gestures.ScrollableGesturesNode scrollableGesturesNode;
    private final androidx.compose.foundation.gestures.ScrollingLogic scrollingLogic;
    private androidx.compose.foundation.gestures.ScrollableState state;

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* renamed from: onPreKeyEvent-ZmokQxo */
    public boolean mo182onPreKeyEventZmokQxo(android.view.KeyEvent event) {
        return false;
    }

    public ScrollableNode(androidx.compose.foundation.gestures.ScrollableState scrollableState, androidx.compose.foundation.gestures.Orientation orientation, androidx.compose.foundation.OverscrollEffect overscrollEffect, boolean z, boolean z2, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.foundation.gestures.BringIntoViewSpec bringIntoViewSpec) {
        androidx.compose.foundation.gestures.ScrollableKt$UnityDensity$1 scrollableKt$UnityDensity$1;
        this.state = scrollableState;
        this.orientation = orientation;
        this.overscrollEffect = overscrollEffect;
        this.enabled = z;
        this.reverseDirection = z2;
        this.flingBehavior = flingBehavior;
        this.interactionSource = mutableInteractionSource;
        androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher nestedScrollDispatcher = new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher();
        this.nestedScrollDispatcher = nestedScrollDispatcher;
        scrollableKt$UnityDensity$1 = androidx.compose.foundation.gestures.ScrollableKt.UnityDensity;
        androidx.compose.foundation.gestures.DefaultFlingBehavior defaultFlingBehavior = new androidx.compose.foundation.gestures.DefaultFlingBehavior(androidx.compose.animation.SplineBasedDecayKt.splineBasedDecay(scrollableKt$UnityDensity$1), null, 2, null);
        this.defaultFlingBehavior = defaultFlingBehavior;
        androidx.compose.foundation.gestures.ScrollableState scrollableState2 = this.state;
        androidx.compose.foundation.gestures.Orientation orientation2 = this.orientation;
        androidx.compose.foundation.OverscrollEffect overscrollEffect2 = this.overscrollEffect;
        boolean z3 = this.reverseDirection;
        androidx.compose.foundation.gestures.FlingBehavior flingBehavior2 = this.flingBehavior;
        androidx.compose.foundation.gestures.ScrollingLogic scrollingLogic = new androidx.compose.foundation.gestures.ScrollingLogic(scrollableState2, orientation2, overscrollEffect2, z3, flingBehavior2 == null ? defaultFlingBehavior : flingBehavior2, nestedScrollDispatcher);
        this.scrollingLogic = scrollingLogic;
        androidx.compose.foundation.gestures.ScrollableNestedScrollConnection scrollableNestedScrollConnection = new androidx.compose.foundation.gestures.ScrollableNestedScrollConnection(scrollingLogic, this.enabled);
        this.nestedScrollConnection = scrollableNestedScrollConnection;
        androidx.compose.foundation.gestures.ContentInViewNode contentInViewNode = (androidx.compose.foundation.gestures.ContentInViewNode) delegate(new androidx.compose.foundation.gestures.ContentInViewNode(this.orientation, this.state, this.reverseDirection, bringIntoViewSpec));
        this.contentInViewNode = contentInViewNode;
        this.scrollableContainer = (androidx.compose.foundation.gestures.ModifierLocalScrollableContainerProvider) delegate(new androidx.compose.foundation.gestures.ModifierLocalScrollableContainerProvider(this.enabled));
        delegate(androidx.compose.ui.input.nestedscroll.NestedScrollNodeKt.nestedScrollModifierNode(scrollableNestedScrollConnection, nestedScrollDispatcher));
        delegate(androidx.compose.ui.focus.FocusTargetModifierNodeKt.FocusTargetModifierNode());
        delegate(new androidx.compose.foundation.relocation.BringIntoViewResponderNode(contentInViewNode));
        delegate(new androidx.compose.foundation.FocusedBoundsObserverNode(new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.LayoutCoordinates, kotlin.Unit>() { // from class: androidx.compose.foundation.gestures.ScrollableNode.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
                invoke2(layoutCoordinates);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
                androidx.compose.foundation.gestures.ScrollableNode.this.getContentInViewNode().onFocusBoundsChanged(layoutCoordinates);
            }
        }));
        this.scrollableGesturesNode = (androidx.compose.foundation.gestures.ScrollableGesturesNode) delegate(new androidx.compose.foundation.gestures.ScrollableGesturesNode(scrollingLogic, this.orientation, this.enabled, nestedScrollDispatcher, this.interactionSource));
    }

    public final androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher getNestedScrollDispatcher() {
        return this.nestedScrollDispatcher;
    }

    public final androidx.compose.foundation.gestures.DefaultFlingBehavior getDefaultFlingBehavior() {
        return this.defaultFlingBehavior;
    }

    public final androidx.compose.foundation.gestures.ScrollingLogic getScrollingLogic() {
        return this.scrollingLogic;
    }

    public final androidx.compose.foundation.gestures.ScrollableNestedScrollConnection getNestedScrollConnection() {
        return this.nestedScrollConnection;
    }

    public final androidx.compose.foundation.gestures.ContentInViewNode getContentInViewNode() {
        return this.contentInViewNode;
    }

    public final androidx.compose.foundation.gestures.ModifierLocalScrollableContainerProvider getScrollableContainer() {
        return this.scrollableContainer;
    }

    public final androidx.compose.foundation.gestures.ScrollableGesturesNode getScrollableGesturesNode() {
        return this.scrollableGesturesNode;
    }

    public final void update(androidx.compose.foundation.gestures.ScrollableState state, androidx.compose.foundation.gestures.Orientation orientation, androidx.compose.foundation.OverscrollEffect overscrollEffect, boolean enabled, boolean reverseDirection, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, androidx.compose.foundation.interaction.MutableInteractionSource interactionSource, androidx.compose.foundation.gestures.BringIntoViewSpec bringIntoViewSpec) {
        if (this.enabled != enabled) {
            this.nestedScrollConnection.setEnabled(enabled);
            this.scrollableContainer.setEnabled(enabled);
        }
        this.scrollingLogic.update(state, orientation, overscrollEffect, reverseDirection, flingBehavior == null ? this.defaultFlingBehavior : flingBehavior, this.nestedScrollDispatcher);
        this.scrollableGesturesNode.update(orientation, enabled, interactionSource);
        this.contentInViewNode.update(orientation, state, reverseDirection, bringIntoViewSpec);
        this.state = state;
        this.orientation = orientation;
        this.overscrollEffect = overscrollEffect;
        this.enabled = enabled;
        this.reverseDirection = reverseDirection;
        this.flingBehavior = flingBehavior;
        this.interactionSource = interactionSource;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        updateDefaultFlingBehavior();
        androidx.compose.ui.node.ObserverModifierNodeKt.observeReads(this, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.foundation.gestures.ScrollableNode$onAttach$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(androidx.compose.foundation.gestures.ScrollableNode.this, androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
            }
        });
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        updateDefaultFlingBehavior();
    }

    private final void updateDefaultFlingBehavior() {
        this.defaultFlingBehavior.setFlingDecay(androidx.compose.animation.SplineBasedDecayKt.splineBasedDecay((androidx.compose.ui.unit.Density) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(this, androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity())));
    }

    @Override // androidx.compose.ui.focus.FocusPropertiesModifierNode
    public void applyFocusProperties(androidx.compose.ui.focus.FocusProperties focusProperties) {
        focusProperties.setCanFocus(false);
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* renamed from: onKeyEvent-ZmokQxo */
    public boolean mo180onKeyEventZmokQxo(android.view.KeyEvent event) {
        long Offset;
        if (!this.enabled || ((!androidx.compose.ui.input.key.Key.m2826equalsimpl0(androidx.compose.ui.input.key.KeyEvent_androidKt.m3134getKeyZmokQxo(event), androidx.compose.ui.input.key.Key.INSTANCE.m3014getPageDownEK5gGoQ()) && !androidx.compose.ui.input.key.Key.m2826equalsimpl0(androidx.compose.ui.input.key.KeyEvent_androidKt.m3134getKeyZmokQxo(event), androidx.compose.ui.input.key.Key.INSTANCE.m3015getPageUpEK5gGoQ())) || !androidx.compose.ui.input.key.KeyEventType.m3127equalsimpl0(androidx.compose.ui.input.key.KeyEvent_androidKt.m3135getTypeZmokQxo(event), androidx.compose.ui.input.key.KeyEventType.INSTANCE.m3131getKeyDownCS__XNY()) || androidx.compose.ui.input.key.KeyEvent_androidKt.m3138isCtrlPressedZmokQxo(event))) {
            return false;
        }
        androidx.compose.foundation.gestures.ScrollingLogic scrollingLogic = this.scrollingLogic;
        if (this.orientation == androidx.compose.foundation.gestures.Orientation.Vertical) {
            int m4651getHeightimpl = androidx.compose.ui.unit.IntSize.m4651getHeightimpl(this.contentInViewNode.getViewportSize());
            Offset = androidx.compose.ui.geometry.OffsetKt.Offset(0.0f, androidx.compose.ui.input.key.Key.m2826equalsimpl0(androidx.compose.ui.input.key.KeyEvent_androidKt.m3134getKeyZmokQxo(event), androidx.compose.ui.input.key.Key.INSTANCE.m3015getPageUpEK5gGoQ()) ? m4651getHeightimpl : -m4651getHeightimpl);
        } else {
            int m4652getWidthimpl = androidx.compose.ui.unit.IntSize.m4652getWidthimpl(this.contentInViewNode.getViewportSize());
            Offset = androidx.compose.ui.geometry.OffsetKt.Offset(androidx.compose.ui.input.key.Key.m2826equalsimpl0(androidx.compose.ui.input.key.KeyEvent_androidKt.m3134getKeyZmokQxo(event), androidx.compose.ui.input.key.Key.INSTANCE.m3015getPageUpEK5gGoQ()) ? m4652getWidthimpl : -m4652getWidthimpl, 0.0f);
        }
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1$1(scrollingLogic, Offset, null), 3, null);
        return true;
    }
}
