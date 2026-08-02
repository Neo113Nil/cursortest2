package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\fH&¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u0013\u0010\u0018\u001a\u00020\n*\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u0018\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001b\u0010\u0016J\r\u0010\u001c\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u0016J\u000f\u0010\u001d\u001a\u00020\fH\u0014¢\u0006\u0004\b\u001d\u0010\u0016J\u001f\u0010 \u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006H\u0004¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\"\u0010!J7\u0010)\u001a\u00020\f2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u0006H\u0004¢\u0006\u0004\b)\u0010*J7\u0010+\u001a\u00020\f2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u0006H\u0010¢\u0006\u0004\b+\u0010*J\u0017\u0010-\u001a\u00020\f2\u0006\u0010,\u001a\u00020\u0006H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020#H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\f2\u0006\u0010/\u001a\u00020#H\u0016¢\u0006\u0004\b1\u00102J\u0019\u00105\u001a\u00020\f2\b\u00104\u001a\u0004\u0018\u000103H\u0016¢\u0006\u0004\b5\u00106J!\u00105\u001a\u00020\f2\b\u00104\u001a\u0004\u0018\u0001032\u0006\u00107\u001a\u00020\u0006H\u0016¢\u0006\u0004\b5\u00108J)\u00105\u001a\u00020\f2\b\u00104\u001a\u0004\u0018\u0001032\u0006\u00109\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u0006H\u0016¢\u0006\u0004\b5\u0010;J#\u00105\u001a\u00020\f2\b\u00104\u001a\u0004\u0018\u0001032\b\u0010=\u001a\u0004\u0018\u00010<H\u0016¢\u0006\u0004\b5\u0010>J+\u00105\u001a\u00020\f2\b\u00104\u001a\u0004\u0018\u0001032\u0006\u00107\u001a\u00020\u00062\b\u0010=\u001a\u0004\u0018\u00010<H\u0016¢\u0006\u0004\b5\u0010?J+\u0010@\u001a\u00020#2\b\u00104\u001a\u0004\u0018\u0001032\u0006\u00107\u001a\u00020\u00062\b\u0010=\u001a\u0004\u0018\u00010<H\u0014¢\u0006\u0004\b@\u0010AJ3\u0010@\u001a\u00020#2\b\u00104\u001a\u0004\u0018\u0001032\u0006\u00107\u001a\u00020\u00062\b\u0010=\u001a\u0004\u0018\u00010<2\u0006\u0010B\u001a\u00020#H\u0014¢\u0006\u0004\b@\u0010CJ\u000f\u0010D\u001a\u00020#H\u0016¢\u0006\u0004\bD\u00100R\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR(\u0010F\u001a\u0004\u0018\u00010H2\b\u0010I\u001a\u0004\u0018\u00010H8\u0002@CX\u0082\u000e¢\u0006\f\n\u0004\bJ\u0010K\"\u0004\bF\u0010LR\u0018\u0010O\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010NR(\u0010\u001b\u001a\u0004\u0018\u00010\n2\b\u0010I\u001a\u0004\u0018\u00010\n8\u0002@CX\u0083\u000e¢\u0006\f\n\u0004\bP\u0010Q\"\u0004\b\u001b\u0010\u000eR\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010R8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010SR\u0014\u0010U\u001a\u00020#8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\bT\u00100R0\u0010W\u001a\u00020#2\u0006\u0010V\u001a\u00020#8\u0007@GX\u0086\u000e¢\u0006\u0018\n\u0004\bW\u0010X\u0012\u0004\b[\u0010\u0016\u001a\u0004\bY\u00100\"\u0004\bZ\u00102R$\u0010`\u001a\u00020\\2\u0006\u0010V\u001a\u00020\\8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b]\u0010^\"\u0004\b_\u0010.R\u0016\u0010J\u001a\u00020#8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010XR\u0018\u0010b\u001a\u00020#*\u00020\n8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010aR\u0011\u0010d\u001a\u00020#8G¢\u0006\u0006\u001a\u0004\bc\u00100R\u0016\u0010e\u001a\u00020#8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bO\u0010X"}, d2 = {"Landroidx/compose/ui/platform/AbstractComposeView;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroidx/compose/runtime/CompositionContext;", "parent", "", "setParentCompositionContext", "(Landroidx/compose/runtime/CompositionContext;)V", "Landroidx/compose/ui/platform/ViewCompositionStrategy;", "strategy", "setViewCompositionStrategy", "(Landroidx/compose/ui/platform/ViewCompositionStrategy;)V", "Content", "(Landroidx/compose/runtime/Composer;I)V", "createComposition", "()V", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "(Landroidx/compose/runtime/CompositionContext;)Landroidx/compose/runtime/CompositionContext;", "()Landroidx/compose/runtime/CompositionContext;", "getHighResolutionOutputSizeshNQ4ISI", "disposeComposition", "onAttachedToWindow", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "internalOnMeasure$ui", "", "changed", com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT, com.dyneti.android.dyscan.DyScanHelperTextPosition.TOP, com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_RIGHT, com.dyneti.android.dyscan.DyScanHelperTextPosition.BOTTOM, "onLayout", "(ZIIII)V", "internalOnLayout$ui", "layoutDirection", "onRtlPropertiesChanged", "(I)V", "isTransitionGroup", "()Z", "setTransitionGroup", "(Z)V", "Landroid/view/View;", "child", "addView", "(Landroid/view/View;)V", "index", "(Landroid/view/View;I)V", "width", "height", "(Landroid/view/View;II)V", "Landroid/view/ViewGroup$LayoutParams;", "params", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V", "addViewInLayout", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)Z", "preventRequestLayout", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)Z", "shouldDelayChildPressedState", "Ljava/lang/ref/WeakReference;", "getHighSpeedVideoFpsRanges", "Ljava/lang/ref/WeakReference;", "Landroid/os/IBinder;", "p0", "getInputFormats", "Landroid/os/IBinder;", "(Landroid/os/IBinder;)V", "Landroidx/compose/runtime/Composition;", "Landroidx/compose/runtime/Composition;", "getHighSpeedVideoSizes", "getOutputFormats", "Landroidx/compose/runtime/CompositionContext;", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "getShouldCreateCompositionOnAttachedToWindow", "shouldCreateCompositionOnAttachedToWindow", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "showLayoutBounds", "Z", "getShowLayoutBounds", "setShowLayoutBounds", "getShowLayoutBounds$annotations", "Landroidx/compose/ui/platform/AutoClearFocusBehavior;", "getAutoClearFocusBehavior-4UtRPd4", "()I", "setAutoClearFocusBehavior-17tfJxM", "autoClearFocusBehavior", "(Landroidx/compose/runtime/CompositionContext;)Z", "getInputSizeshNQ4ISI", "getHasComposition", "hasComposition", "getOutputMinFrameDuration"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class AbstractComposeView extends android.view.ViewGroup {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private androidx.compose.runtime.Composition getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private boolean getInputFormats;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private java.lang.ref.WeakReference<androidx.compose.runtime.CompositionContext> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private kotlin.jvm.functions.Function0<kotlin.Unit> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private boolean getOutputMinFrameDuration;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private android.os.IBinder getHighSpeedVideoFpsRanges;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private androidx.compose.runtime.CompositionContext getHighResolutionOutputSizeshNQ4ISI;
    private boolean showLayoutBounds;

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    public abstract void Content(androidx.compose.runtime.Composer composer, int i);

    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public AbstractComposeView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        this.Camera2StreamConfigurationMap = androidx.compose.ui.platform.ViewCompositionStrategy.INSTANCE.getDefault().installFor(this);
    }

    public /* synthetic */ AbstractComposeView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void getHighSpeedVideoFpsRanges(android.os.IBinder iBinder) {
        if (this.getHighSpeedVideoFpsRanges != iBinder) {
            this.getHighSpeedVideoFpsRanges = iBinder;
            this.getHighSpeedVideoFpsRangesFor = null;
        }
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.CompositionContext compositionContext) {
        if (this.getHighResolutionOutputSizeshNQ4ISI != compositionContext) {
            this.getHighResolutionOutputSizeshNQ4ISI = compositionContext;
            if (compositionContext != null) {
                this.getHighSpeedVideoFpsRangesFor = null;
            }
            androidx.compose.runtime.Composition composition = this.getHighSpeedVideoSizes;
            if (composition != null) {
                composition.dispose();
                this.getHighSpeedVideoSizes = null;
                if (isAttachedToWindow()) {
                    getHighResolutionOutputSizeshNQ4ISI();
                }
            }
        }
    }

    public final void setParentCompositionContext(androidx.compose.runtime.CompositionContext parent) {
        getHighResolutionOutputSizeshNQ4ISI(parent);
    }

    public final void setViewCompositionStrategy(androidx.compose.ui.platform.ViewCompositionStrategy strategy) {
        kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.Camera2StreamConfigurationMap;
        if (function0 != null) {
            function0.invoke();
        }
        this.Camera2StreamConfigurationMap = strategy.installFor(this);
    }

    public final boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    public final void setShowLayoutBounds(boolean z) {
        this.showLayoutBounds = z;
        android.view.KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((androidx.compose.ui.node.Owner) childAt).setShowLayoutBounds(z);
        }
    }

    /* renamed from: getAutoClearFocusBehavior-4UtRPd4, reason: not valid java name */
    public final int m7709getAutoClearFocusBehavior4UtRPd4() {
        java.lang.Object tag = getTag(androidx.compose.ui.R.id.auto_clear_focus_behavior_tag);
        androidx.compose.ui.platform.AutoClearFocusBehavior autoClearFocusBehavior = tag instanceof androidx.compose.ui.platform.AutoClearFocusBehavior ? (androidx.compose.ui.platform.AutoClearFocusBehavior) tag : null;
        return autoClearFocusBehavior != null ? autoClearFocusBehavior.getGetHighSpeedVideoFpsRanges() : androidx.compose.ui.platform.AutoClearFocusBehavior.INSTANCE.m7728getDefault4UtRPd4();
    }

    /* renamed from: setAutoClearFocusBehavior-17tfJxM, reason: not valid java name */
    public final void m7710setAutoClearFocusBehavior17tfJxM(int i) {
        setTag(androidx.compose.ui.R.id.auto_clear_focus_behavior_tag, androidx.compose.ui.platform.AutoClearFocusBehavior.m7721boximpl(i));
    }

    public final void createComposition() {
        if (this.getHighResolutionOutputSizeshNQ4ISI == null && !isAttachedToWindow()) {
            throw new java.lang.IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.".toString());
        }
        getHighResolutionOutputSizeshNQ4ISI();
    }

    private final void getHighSpeedVideoFpsRangesFor() {
        if (this.getInputFormats) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot add views to ");
        sb.append(getClass().getSimpleName());
        sb.append("; only Compose content is supported");
        throw new java.lang.UnsupportedOperationException(sb.toString());
    }

    private static boolean getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.CompositionContext compositionContext) {
        return !(compositionContext instanceof androidx.compose.runtime.Recomposer) || ((androidx.compose.runtime.Recomposer) compositionContext).getCurrentState().getValue().compareTo(androidx.compose.runtime.Recomposer.State.ShuttingDown) > 0;
    }

    private final androidx.compose.runtime.CompositionContext Camera2StreamConfigurationMap(androidx.compose.runtime.CompositionContext compositionContext) {
        androidx.compose.runtime.CompositionContext compositionContext2 = getHighSpeedVideoFpsRangesFor(compositionContext) ? compositionContext : null;
        if (compositionContext2 != null) {
            this.getHighSpeedVideoFpsRangesFor = new java.lang.ref.WeakReference<>(compositionContext2);
        }
        return compositionContext;
    }

    private final androidx.compose.runtime.CompositionContext Camera2StreamConfigurationMap() {
        androidx.compose.runtime.CompositionContext compositionContext;
        androidx.compose.runtime.CompositionContext compositionContext2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (compositionContext2 != null) {
            return compositionContext2;
        }
        androidx.compose.ui.platform.AbstractComposeView abstractComposeView = this;
        androidx.compose.runtime.CompositionContext findViewTreeCompositionContext = androidx.compose.ui.platform.WindowRecomposer_androidKt.findViewTreeCompositionContext(abstractComposeView);
        androidx.compose.runtime.CompositionContext compositionContext3 = null;
        androidx.compose.runtime.CompositionContext Camera2StreamConfigurationMap = findViewTreeCompositionContext != null ? Camera2StreamConfigurationMap(findViewTreeCompositionContext) : null;
        if (Camera2StreamConfigurationMap != null) {
            return Camera2StreamConfigurationMap;
        }
        java.lang.ref.WeakReference<androidx.compose.runtime.CompositionContext> weakReference = this.getHighSpeedVideoFpsRangesFor;
        if (weakReference != null && (compositionContext = weakReference.get()) != null && getHighSpeedVideoFpsRangesFor(compositionContext)) {
            compositionContext3 = compositionContext;
        }
        return compositionContext3 == null ? Camera2StreamConfigurationMap(androidx.compose.ui.platform.WindowRecomposer_androidKt.getWindowRecomposer(abstractComposeView)) : compositionContext3;
    }

    private final void getHighResolutionOutputSizeshNQ4ISI() {
        if (this.getHighSpeedVideoSizes == null) {
            try {
                this.getInputFormats = true;
                this.getHighSpeedVideoSizes = androidx.compose.ui.platform.Wrapper_androidKt.setContent(this, Camera2StreamConfigurationMap(), androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-656146368, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.ui.platform.AbstractComposeView$ensureCompositionCreated$1
                    public final void getHighSpeedVideoSizes(androidx.compose.runtime.Composer composer, int i) {
                        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-656146368, i, -1, "androidx.compose.ui.platform.AbstractComposeView.ensureCompositionCreated.<anonymous> (ComposeView.android.kt:264)");
                        }
                        androidx.compose.ui.platform.AbstractComposeView.this.Content(composer, 0);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                        getHighSpeedVideoSizes(composer, num.intValue());
                        return kotlin.Unit.INSTANCE;
                    }

                    {
                        super(2);
                    }
                }));
            } finally {
                this.getInputFormats = false;
            }
        }
    }

    public final void disposeComposition() {
        androidx.compose.runtime.Composition composition = this.getHighSpeedVideoSizes;
        if (composition != null) {
            composition.dispose();
        }
        this.getHighSpeedVideoSizes = null;
        requestLayout();
    }

    public final boolean getHasComposition() {
        return this.getHighSpeedVideoSizes != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getHighSpeedVideoFpsRanges(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            getHighResolutionOutputSizeshNQ4ISI();
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        getHighResolutionOutputSizeshNQ4ISI();
        internalOnMeasure$ui(widthMeasureSpec, heightMeasureSpec);
    }

    public void internalOnMeasure$ui(int widthMeasureSpec, int heightMeasureSpec) {
        android.view.View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        childAt.measure(android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.max(0, (android.view.View.MeasureSpec.getSize(widthMeasureSpec) - getPaddingLeft()) - getPaddingRight()), android.view.View.MeasureSpec.getMode(widthMeasureSpec)), android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.max(0, (android.view.View.MeasureSpec.getSize(heightMeasureSpec) - getPaddingTop()) - getPaddingBottom()), android.view.View.MeasureSpec.getMode(heightMeasureSpec)));
        int measuredWidth = childAt.getMeasuredWidth();
        int paddingLeft = getPaddingLeft();
        setMeasuredDimension(measuredWidth + paddingLeft + getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean changed, int left, int top, int right, int bottom) {
        internalOnLayout$ui(changed, left, top, right, bottom);
    }

    public void internalOnLayout$ui(boolean changed, int left, int top, int right, int bottom) {
        android.view.View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (right - left) - getPaddingRight(), (bottom - top) - getPaddingBottom());
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int layoutDirection) {
        android.view.View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(layoutDirection);
        }
    }

    @Override // android.view.ViewGroup
    public boolean isTransitionGroup() {
        return !this.getOutputMinFrameDuration || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean isTransitionGroup) {
        super.setTransitionGroup(isTransitionGroup);
        this.getOutputMinFrameDuration = true;
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View child) {
        getHighSpeedVideoFpsRangesFor();
        super.addView(child);
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View child, int index) {
        getHighSpeedVideoFpsRangesFor();
        super.addView(child, index);
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View child, int width, int height) {
        getHighSpeedVideoFpsRangesFor();
        super.addView(child, width, height);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(android.view.View child, android.view.ViewGroup.LayoutParams params) {
        getHighSpeedVideoFpsRangesFor();
        super.addView(child, params);
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View child, int index, android.view.ViewGroup.LayoutParams params) {
        getHighSpeedVideoFpsRangesFor();
        super.addView(child, index, params);
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(android.view.View child, int index, android.view.ViewGroup.LayoutParams params) {
        getHighSpeedVideoFpsRangesFor();
        return super.addViewInLayout(child, index, params);
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(android.view.View child, int index, android.view.ViewGroup.LayoutParams params, boolean preventRequestLayout) {
        getHighSpeedVideoFpsRangesFor();
        return super.addViewInLayout(child, index, params, preventRequestLayout);
    }

    public AbstractComposeView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public AbstractComposeView(android.content.Context context) {
        this(context, null, 0, 6, null);
    }
}
