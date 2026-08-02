package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B5\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0016J\r\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u0016J\r\u0010\u001a\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u0016J\u000f\u0010\u001b\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001b\u0010\u0016J\u000f\u0010\u001c\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001c\u0010\u0016J\u000f\u0010\u001d\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\u0016J\u000f\u0010\u001e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001e\u0010\u0016R\"\u0010\u0005\u001a\u00020\u00048\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010\u0007\u001a\u00020\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R.\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R.\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010.\u001a\u0004\u0018\u00010\b8\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R$\u00105\u001a\u0004\u0018\u0001048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R$\u0010<\u001a\u0004\u0018\u00010;8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010B\u001a\u00020\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010H\u001a\u00020\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bH\u0010C\u001a\u0004\bI\u0010E\"\u0004\bJ\u0010GR$\u0010K\u001a\u0004\u0018\u00010\u00108\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR$\u0010Q\u001a\u0004\u0018\u00010\u00108\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bQ\u0010L\u001a\u0004\bR\u0010N\"\u0004\bS\u0010PR&\u0010T\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f0\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bT\u0010)\u001a\u0004\bU\u0010+"}, d2 = {"Landroidx/compose/ui/layout/OnVisibilityChangedNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/ObserverModifierNode;", "Landroidx/compose/ui/node/UnplacedAwareModifierNode;", "", "minDurationMs", "", "minFractionVisible", "Landroidx/compose/ui/layout/LayoutBoundsHolder;", "viewportBounds", "Lkotlin/Function1;", "", "", com.sun.jna.Callback.METHOD_NAME, "<init>", "(JFLandroidx/compose/ui/layout/LayoutBoundsHolder;Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/spatial/RelativeLayoutBounds;", "bounds", "viewport", "checkVisibility", "(FLandroidx/compose/ui/spatial/RelativeLayoutBounds;Landroidx/compose/ui/spatial/RelativeLayoutBounds;)V", "triggerCallback", "()V", "forceUpdate", "fireExitIfNeeded", "onReset", "updateViewport", "onAttach", "onDetach", "onObservedReadsChanged", "onUnplaced", "J", "getMinDurationMs", "()J", "setMinDurationMs", "(J)V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getMinFractionVisible", "()F", "setMinFractionVisible", "(F)V", "Lkotlin/jvm/functions/Function1;", "getCallback", "()Lkotlin/jvm/functions/Function1;", "setCallback", "(Lkotlin/jvm/functions/Function1;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Landroidx/compose/ui/layout/LayoutBoundsHolder;", "getViewportBounds", "()Landroidx/compose/ui/layout/LayoutBoundsHolder;", "setViewportBounds", "(Landroidx/compose/ui/layout/LayoutBoundsHolder;)V", "Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;", "handle", "Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;", "getHandle", "()Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;", "setHandle", "(Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;)V", "Lkotlinx/coroutines/Job;", "job", "Lkotlinx/coroutines/Job;", "getJob", "()Lkotlinx/coroutines/Job;", "setJob", "(Lkotlinx/coroutines/Job;)V", "lastResult", "Z", "getLastResult", "()Z", "setLastResult", "(Z)V", "lastReportedResult", "getLastReportedResult", "setLastReportedResult", "lastBounds", "Landroidx/compose/ui/spatial/RelativeLayoutBounds;", "getLastBounds", "()Landroidx/compose/ui/spatial/RelativeLayoutBounds;", "setLastBounds", "(Landroidx/compose/ui/spatial/RelativeLayoutBounds;)V", "lastViewport", "getLastViewport", "setLastViewport", "rectChanged", "getRectChanged"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OnVisibilityChangedNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.ObserverModifierNode, androidx.compose.ui.node.UnplacedAwareModifierNode {
    public static final int $stable = 8;
    private kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> callback;
    private androidx.compose.ui.node.DelegatableNode.RegistrationHandle handle;
    private kotlinx.coroutines.Job job;
    private androidx.compose.ui.spatial.RelativeLayoutBounds lastBounds;
    private boolean lastReportedResult;
    private boolean lastResult;
    private androidx.compose.ui.spatial.RelativeLayoutBounds lastViewport;
    private long minDurationMs;
    private float minFractionVisible;
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.spatial.RelativeLayoutBounds, kotlin.Unit> rectChanged = new kotlin.jvm.functions.Function1<androidx.compose.ui.spatial.RelativeLayoutBounds, kotlin.Unit>() { // from class: androidx.compose.ui.layout.OnVisibilityChangedNode$rectChanged$1
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.spatial.RelativeLayoutBounds relativeLayoutBounds) {
            getHighSpeedVideoFpsRangesFor(relativeLayoutBounds);
            return kotlin.Unit.INSTANCE;
        }

        public final void getHighSpeedVideoFpsRangesFor(androidx.compose.ui.spatial.RelativeLayoutBounds relativeLayoutBounds) {
            androidx.compose.ui.layout.OnVisibilityChangedNode onVisibilityChangedNode = androidx.compose.ui.layout.OnVisibilityChangedNode.this;
            androidx.compose.ui.layout.LayoutBoundsHolder viewportBounds = onVisibilityChangedNode.getViewportBounds();
            onVisibilityChangedNode.setLastViewport(viewportBounds != null ? viewportBounds.getBounds() : null);
            androidx.compose.ui.layout.OnVisibilityChangedNode onVisibilityChangedNode2 = androidx.compose.ui.layout.OnVisibilityChangedNode.this;
            onVisibilityChangedNode2.checkVisibility(onVisibilityChangedNode2.getMinFractionVisible(), relativeLayoutBounds, androidx.compose.ui.layout.OnVisibilityChangedNode.this.getLastViewport());
        }

        {
            super(1);
        }
    };
    private androidx.compose.ui.layout.LayoutBoundsHolder viewportBounds;

    public OnVisibilityChangedNode(long j, float f, androidx.compose.ui.layout.LayoutBoundsHolder layoutBoundsHolder, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1) {
        this.minDurationMs = j;
        this.minFractionVisible = f;
        this.callback = function1;
        this.viewportBounds = layoutBoundsHolder;
    }

    public final long getMinDurationMs() {
        return this.minDurationMs;
    }

    public final void setMinDurationMs(long j) {
        this.minDurationMs = j;
    }

    public final float getMinFractionVisible() {
        return this.minFractionVisible;
    }

    public final void setMinFractionVisible(float f) {
        this.minFractionVisible = f;
    }

    public final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> getCallback() {
        return this.callback;
    }

    public final void setCallback(kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1) {
        this.callback = function1;
    }

    public final androidx.compose.ui.layout.LayoutBoundsHolder getViewportBounds() {
        return this.viewportBounds;
    }

    public final void setViewportBounds(androidx.compose.ui.layout.LayoutBoundsHolder layoutBoundsHolder) {
        this.viewportBounds = layoutBoundsHolder;
        updateViewport();
    }

    public final androidx.compose.ui.node.DelegatableNode.RegistrationHandle getHandle() {
        return this.handle;
    }

    public final void setHandle(androidx.compose.ui.node.DelegatableNode.RegistrationHandle registrationHandle) {
        this.handle = registrationHandle;
    }

    public final kotlinx.coroutines.Job getJob() {
        return this.job;
    }

    public final void setJob(kotlinx.coroutines.Job job) {
        this.job = job;
    }

    public final boolean getLastResult() {
        return this.lastResult;
    }

    public final void setLastResult(boolean z) {
        this.lastResult = z;
    }

    public final boolean getLastReportedResult() {
        return this.lastReportedResult;
    }

    public final void setLastReportedResult(boolean z) {
        this.lastReportedResult = z;
    }

    public final androidx.compose.ui.spatial.RelativeLayoutBounds getLastBounds() {
        return this.lastBounds;
    }

    public final void setLastBounds(androidx.compose.ui.spatial.RelativeLayoutBounds relativeLayoutBounds) {
        this.lastBounds = relativeLayoutBounds;
    }

    public final androidx.compose.ui.spatial.RelativeLayoutBounds getLastViewport() {
        return this.lastViewport;
    }

    public final void setLastViewport(androidx.compose.ui.spatial.RelativeLayoutBounds relativeLayoutBounds) {
        this.lastViewport = relativeLayoutBounds;
    }

    public final kotlin.jvm.functions.Function1<androidx.compose.ui.spatial.RelativeLayoutBounds, kotlin.Unit> getRectChanged() {
        return this.rectChanged;
    }

    public final void checkVisibility(float minFractionVisible, androidx.compose.ui.spatial.RelativeLayoutBounds bounds, androidx.compose.ui.spatial.RelativeLayoutBounds viewport) {
        float fractionVisibleInWindow;
        kotlinx.coroutines.Job launch$default;
        this.lastBounds = bounds;
        if (viewport != null || this.viewportBounds == null) {
            if (viewport != null) {
                fractionVisibleInWindow = bounds.fractionVisibleIn(viewport);
            } else {
                fractionVisibleInWindow = bounds.fractionVisibleInWindow();
            }
            boolean z = fractionVisibleInWindow > minFractionVisible || fractionVisibleInWindow == 1.0f;
            if (z != this.lastResult) {
                this.lastResult = z;
                kotlinx.coroutines.Job job = this.job;
                if (job != null) {
                    kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                }
                this.job = null;
                if (z != this.lastReportedResult) {
                    if (z && this.minDurationMs > 0) {
                        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new androidx.compose.ui.layout.OnVisibilityChangedNode$checkVisibility$1(this, null), 3, null);
                        this.job = launch$default;
                    } else {
                        triggerCallback();
                    }
                }
            }
        }
    }

    public final void triggerCallback() {
        kotlinx.coroutines.Job job = this.job;
        if (job != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        this.job = null;
        this.callback.invoke(java.lang.Boolean.valueOf(this.lastResult));
        this.lastReportedResult = this.lastResult;
    }

    public final void forceUpdate() {
        androidx.compose.ui.spatial.RelativeLayoutBounds relativeLayoutBounds = this.lastBounds;
        if (relativeLayoutBounds != null) {
            checkVisibility(this.minFractionVisible, relativeLayoutBounds, this.lastViewport);
        }
    }

    public final void fireExitIfNeeded() {
        kotlinx.coroutines.Job job = this.job;
        if (job != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        this.job = null;
        this.lastResult = false;
        if (this.lastReportedResult) {
            triggerCallback();
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onReset() {
        fireExitIfNeeded();
        kotlinx.coroutines.Job job = this.job;
        if (job != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        this.job = null;
        this.lastResult = false;
        this.lastBounds = null;
        this.lastViewport = null;
    }

    public final void updateViewport() {
        if (this.viewportBounds == null) {
            if (this.lastViewport != null) {
                this.lastViewport = null;
                forceUpdate();
                return;
            }
            return;
        }
        androidx.compose.ui.node.ObserverModifierNodeKt.observeReads(this, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.layout.OnVisibilityChangedNode$updateViewport$1
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ kotlin.Unit invoke() {
                getHighSpeedVideoSizes();
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoSizes() {
                androidx.compose.ui.layout.LayoutBoundsHolder viewportBounds = androidx.compose.ui.layout.OnVisibilityChangedNode.this.getViewportBounds();
                androidx.compose.ui.spatial.RelativeLayoutBounds bounds = viewportBounds != null ? viewportBounds.getBounds() : null;
                if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.layout.OnVisibilityChangedNode.this.getLastViewport(), bounds)) {
                    return;
                }
                androidx.compose.ui.layout.OnVisibilityChangedNode.this.setLastViewport(bounds);
                androidx.compose.ui.layout.OnVisibilityChangedNode.this.forceUpdate();
            }

            {
                super(0);
            }
        });
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        androidx.compose.ui.node.DelegatableNode.RegistrationHandle registrationHandle = this.handle;
        if (registrationHandle != null) {
            registrationHandle.unregister();
        }
        this.handle = androidx.compose.ui.layout.OnLayoutRectChangedModifierKt.registerOnLayoutRectChanged(this, 0L, 0L, this.rectChanged);
        updateViewport();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        androidx.compose.ui.node.DelegatableNode.RegistrationHandle registrationHandle = this.handle;
        if (registrationHandle != null) {
            registrationHandle.unregister();
        }
        fireExitIfNeeded();
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public final void onObservedReadsChanged() {
        updateViewport();
    }

    @Override // androidx.compose.ui.node.UnplacedAwareModifierNode
    public final void onUnplaced() {
        fireExitIfNeeded();
    }
}
