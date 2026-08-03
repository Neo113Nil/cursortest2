package androidx.compose.ui.platform;

/* compiled from: ComposeView.android.kt */
@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\r\u0010*\u001a\u00020\u0012H'¢\u0006\u0002\u0010+J\u0012\u0010,\u001a\u00020\u00122\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\u001c\u0010,\u001a\u00020\u00122\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\u001a\u0010,\u001a\u00020\u00122\b\u0010-\u001a\u0004\u0018\u00010.2\u0006\u00101\u001a\u00020\u0007H\u0016J$\u0010,\u001a\u00020\u00122\b\u0010-\u001a\u0004\u0018\u00010.2\u0006\u00101\u001a\u00020\u00072\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\"\u0010,\u001a\u00020\u00122\b\u0010-\u001a\u0004\u0018\u00010.2\u0006\u00102\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u0007H\u0016J$\u00104\u001a\u00020\u000f2\b\u0010-\u001a\u0004\u0018\u00010.2\u0006\u00101\u001a\u00020\u00072\b\u0010/\u001a\u0004\u0018\u000100H\u0014J,\u00104\u001a\u00020\u000f2\b\u0010-\u001a\u0004\u0018\u00010.2\u0006\u00101\u001a\u00020\u00072\b\u0010/\u001a\u0004\u0018\u0001002\u0006\u00105\u001a\u00020\u000fH\u0014J\b\u00106\u001a\u00020\u0012H\u0002J\u0006\u00107\u001a\u00020\u0012J\u0006\u00108\u001a\u00020\u0012J\b\u00109\u001a\u00020\u0012H\u0002J5\u0010:\u001a\u00020\u00122\u0006\u0010;\u001a\u00020\u000f2\u0006\u0010<\u001a\u00020\u00072\u0006\u0010=\u001a\u00020\u00072\u0006\u0010>\u001a\u00020\u00072\u0006\u0010?\u001a\u00020\u0007H\u0010¢\u0006\u0002\b@J\u001d\u0010A\u001a\u00020\u00122\u0006\u0010B\u001a\u00020\u00072\u0006\u0010C\u001a\u00020\u0007H\u0010¢\u0006\u0002\bDJ\b\u0010E\u001a\u00020\u000fH\u0016J\b\u0010F\u001a\u00020\u0012H\u0014J0\u0010G\u001a\u00020\u00122\u0006\u0010;\u001a\u00020\u000f2\u0006\u0010<\u001a\u00020\u00072\u0006\u0010=\u001a\u00020\u00072\u0006\u0010>\u001a\u00020\u00072\u0006\u0010?\u001a\u00020\u0007H\u0004J\u0018\u0010H\u001a\u00020\u00122\u0006\u0010B\u001a\u00020\u00072\u0006\u0010C\u001a\u00020\u0007H\u0004J\u0010\u0010I\u001a\u00020\u00122\u0006\u0010J\u001a\u00020\u0007H\u0016J\b\u0010K\u001a\u00020\u000bH\u0002J\u0010\u0010L\u001a\u00020\u00122\b\u0010M\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010N\u001a\u00020\u00122\u0006\u0010E\u001a\u00020\u000fH\u0016J\u000e\u0010O\u001a\u00020\u00122\u0006\u0010P\u001a\u00020QJ\b\u0010R\u001a\u00020\u000fH\u0016J\f\u0010S\u001a\u00020\u000b*\u00020\u000bH\u0002R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u0082\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u001a\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000b@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\u001b\u0010\u001cR\"\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001d@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u000f8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0017R,\u0010#\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000f8F@FX\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b$\u0010\u0014\u001a\u0004\b%\u0010\u0017\"\u0004\b&\u0010'R\u0018\u0010(\u001a\u00020\u000f*\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006T"}, d2 = {"Landroidx/compose/ui/platform/AbstractComposeView;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "cachedViewTreeCompositionContext", "Ljava/lang/ref/WeakReference;", "Landroidx/compose/runtime/CompositionContext;", "composition", "Landroidx/compose/runtime/Composition;", "creatingComposition", "", "disposeViewCompositionStrategy", "Lkotlin/Function0;", "", "getDisposeViewCompositionStrategy$annotations", "()V", "hasComposition", "getHasComposition", "()Z", "isTransitionGroupSet", "value", "parentContext", "setParentContext", "(Landroidx/compose/runtime/CompositionContext;)V", "Landroid/os/IBinder;", "previousAttachedWindowToken", "setPreviousAttachedWindowToken", "(Landroid/os/IBinder;)V", "shouldCreateCompositionOnAttachedToWindow", "getShouldCreateCompositionOnAttachedToWindow", "showLayoutBounds", "getShowLayoutBounds$annotations", "getShowLayoutBounds", "setShowLayoutBounds", "(Z)V", "isAlive", "(Landroidx/compose/runtime/CompositionContext;)Z", "Content", "(Landroidx/compose/runtime/Composer;I)V", "addView", "child", "Landroid/view/View;", "params", "Landroid/view/ViewGroup$LayoutParams;", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "width", "height", "addViewInLayout", "preventRequestLayout", "checkAddView", "createComposition", "disposeComposition", "ensureCompositionCreated", "internalOnLayout", "changed", "left", "top", "right", com.helpshift.proactive.InAppViewConstants.POSITION_BOTTOM, "internalOnLayout$ui_release", "internalOnMeasure", "widthMeasureSpec", "heightMeasureSpec", "internalOnMeasure$ui_release", "isTransitionGroup", "onAttachedToWindow", "onLayout", "onMeasure", "onRtlPropertiesChanged", "layoutDirection", "resolveParentCompositionContext", "setParentCompositionContext", "parent", "setTransitionGroup", "setViewCompositionStrategy", com.ironsource.X3.f.e, "Landroidx/compose/ui/platform/ViewCompositionStrategy;", "shouldDelayChildPressedState", "cacheIfAlive", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class AbstractComposeView extends android.view.ViewGroup {
    public static final int $stable = 8;
    private java.lang.ref.WeakReference<androidx.compose.runtime.CompositionContext> cachedViewTreeCompositionContext;
    private androidx.compose.runtime.Composition composition;
    private boolean creatingComposition;
    private kotlin.jvm.functions.Function0<kotlin.Unit> disposeViewCompositionStrategy;
    private boolean isTransitionGroupSet;
    private androidx.compose.runtime.CompositionContext parentContext;
    private android.os.IBinder previousAttachedWindowToken;
    private boolean showLayoutBounds;

    public AbstractComposeView(android.content.Context context) {
        this(context, null, 0, 6, null);
    }

    public AbstractComposeView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

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

    public /* synthetic */ AbstractComposeView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public AbstractComposeView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setClipChildren(false);
        setClipToPadding(false);
        this.disposeViewCompositionStrategy = androidx.compose.ui.platform.ViewCompositionStrategy.INSTANCE.getDefault().installFor(this);
    }

    private final void setPreviousAttachedWindowToken(android.os.IBinder iBinder) {
        if (this.previousAttachedWindowToken != iBinder) {
            this.previousAttachedWindowToken = iBinder;
            this.cachedViewTreeCompositionContext = null;
        }
    }

    private final void setParentContext(androidx.compose.runtime.CompositionContext compositionContext) {
        if (this.parentContext != compositionContext) {
            this.parentContext = compositionContext;
            if (compositionContext != null) {
                this.cachedViewTreeCompositionContext = null;
            }
            androidx.compose.runtime.Composition composition = this.composition;
            if (composition != null) {
                composition.dispose();
                this.composition = null;
                if (isAttachedToWindow()) {
                    ensureCompositionCreated();
                }
            }
        }
    }

    public final void setParentCompositionContext(androidx.compose.runtime.CompositionContext parent) {
        setParentContext(parent);
    }

    public final void setViewCompositionStrategy(androidx.compose.ui.platform.ViewCompositionStrategy strategy) {
        kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.disposeViewCompositionStrategy;
        if (function0 != null) {
            function0.invoke();
        }
        this.disposeViewCompositionStrategy = strategy.installFor(this);
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

    public final void createComposition() {
        if (this.parentContext == null && !isAttachedToWindow()) {
            throw new java.lang.IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.".toString());
        }
        ensureCompositionCreated();
    }

    private final void checkAddView() {
        if (this.creatingComposition) {
            return;
        }
        throw new java.lang.UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    private final boolean isAlive(androidx.compose.runtime.CompositionContext compositionContext) {
        return !(compositionContext instanceof androidx.compose.runtime.Recomposer) || ((androidx.compose.runtime.Recomposer) compositionContext).getCurrentState().getValue().compareTo(androidx.compose.runtime.Recomposer.State.ShuttingDown) > 0;
    }

    private final androidx.compose.runtime.CompositionContext cacheIfAlive(androidx.compose.runtime.CompositionContext compositionContext) {
        androidx.compose.runtime.CompositionContext compositionContext2 = isAlive(compositionContext) ? compositionContext : null;
        if (compositionContext2 != null) {
            this.cachedViewTreeCompositionContext = new java.lang.ref.WeakReference<>(compositionContext2);
        }
        return compositionContext;
    }

    private final androidx.compose.runtime.CompositionContext resolveParentCompositionContext() {
        androidx.compose.runtime.CompositionContext compositionContext;
        androidx.compose.runtime.CompositionContext compositionContext2 = this.parentContext;
        if (compositionContext2 != null) {
            return compositionContext2;
        }
        androidx.compose.ui.platform.AbstractComposeView abstractComposeView = this;
        androidx.compose.runtime.CompositionContext findViewTreeCompositionContext = androidx.compose.ui.platform.WindowRecomposer_androidKt.findViewTreeCompositionContext(abstractComposeView);
        androidx.compose.runtime.CompositionContext compositionContext3 = null;
        androidx.compose.runtime.CompositionContext cacheIfAlive = findViewTreeCompositionContext != null ? cacheIfAlive(findViewTreeCompositionContext) : null;
        if (cacheIfAlive != null) {
            return cacheIfAlive;
        }
        java.lang.ref.WeakReference<androidx.compose.runtime.CompositionContext> weakReference = this.cachedViewTreeCompositionContext;
        if (weakReference != null && (compositionContext = weakReference.get()) != null && isAlive(compositionContext)) {
            compositionContext3 = compositionContext;
        }
        return compositionContext3 == null ? cacheIfAlive(androidx.compose.ui.platform.WindowRecomposer_androidKt.getWindowRecomposer(abstractComposeView)) : compositionContext3;
    }

    private final void ensureCompositionCreated() {
        if (this.composition == null) {
            try {
                this.creatingComposition = true;
                this.composition = androidx.compose.ui.platform.Wrapper_androidKt.setContent(this, resolveParentCompositionContext(), androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-656146368, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.ui.platform.AbstractComposeView$ensureCompositionCreated$1
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                        invoke(composer, num.intValue());
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(androidx.compose.runtime.Composer composer, int i) {
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C251@10602L9:ComposeView.android.kt#itgzvw");
                        if ((i & 11) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-656146368, i, -1, "androidx.compose.ui.platform.AbstractComposeView.ensureCompositionCreated.<anonymous> (ComposeView.android.kt:251)");
                        }
                        androidx.compose.ui.platform.AbstractComposeView.this.Content(composer, 8);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                    }
                }));
            } finally {
                this.creatingComposition = false;
            }
        }
    }

    public final void disposeComposition() {
        androidx.compose.runtime.Composition composition = this.composition;
        if (composition != null) {
            composition.dispose();
        }
        this.composition = null;
        requestLayout();
    }

    public final boolean getHasComposition() {
        return this.composition != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            ensureCompositionCreated();
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        ensureCompositionCreated();
        internalOnMeasure$ui_release(widthMeasureSpec, heightMeasureSpec);
    }

    public void internalOnMeasure$ui_release(int widthMeasureSpec, int heightMeasureSpec) {
        android.view.View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        childAt.measure(android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.max(0, (android.view.View.MeasureSpec.getSize(widthMeasureSpec) - getPaddingLeft()) - getPaddingRight()), android.view.View.MeasureSpec.getMode(widthMeasureSpec)), android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.max(0, (android.view.View.MeasureSpec.getSize(heightMeasureSpec) - getPaddingTop()) - getPaddingBottom()), android.view.View.MeasureSpec.getMode(heightMeasureSpec)));
        setMeasuredDimension(childAt.getMeasuredWidth() + getPaddingLeft() + getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean changed, int left, int top, int right, int bottom) {
        internalOnLayout$ui_release(changed, left, top, right, bottom);
    }

    public void internalOnLayout$ui_release(boolean changed, int left, int top, int right, int bottom) {
        android.view.View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (right - left) - getPaddingRight(), (bottom - top) - getPaddingBottom());
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int layoutDirection) {
        android.view.View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        childAt.setLayoutDirection(layoutDirection);
    }

    @Override // android.view.ViewGroup
    public boolean isTransitionGroup() {
        return !this.isTransitionGroupSet || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean isTransitionGroup) {
        super.setTransitionGroup(isTransitionGroup);
        this.isTransitionGroupSet = true;
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View child) {
        checkAddView();
        super.addView(child);
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View child, int index) {
        checkAddView();
        super.addView(child, index);
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View child, int width, int height) {
        checkAddView();
        super.addView(child, width, height);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(android.view.View child, android.view.ViewGroup.LayoutParams params) {
        checkAddView();
        super.addView(child, params);
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View child, int index, android.view.ViewGroup.LayoutParams params) {
        checkAddView();
        super.addView(child, index, params);
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(android.view.View child, int index, android.view.ViewGroup.LayoutParams params) {
        checkAddView();
        return super.addViewInLayout(child, index, params);
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(android.view.View child, int index, android.view.ViewGroup.LayoutParams params, boolean preventRequestLayout) {
        checkAddView();
        return super.addViewInLayout(child, index, params, preventRequestLayout);
    }
}
