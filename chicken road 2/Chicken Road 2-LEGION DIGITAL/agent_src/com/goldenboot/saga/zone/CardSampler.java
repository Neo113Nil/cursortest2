package com.goldenboot.saga.zone;

import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.goldenboot.saga.zone.LongPressCollector;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\b'\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\fJ\u0017\u0010\u0014\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\nH'¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\fJ\r\u0010\u001d\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\fJ\u000f\u0010\u001e\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001e\u0010\fJ\u001f\u0010!\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006H\u0004¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006H\u0010¢\u0006\u0004\b#\u0010\"J7\u0010*\u001a\u00020\n2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u0006H\u0004¢\u0006\u0004\b*\u0010+J7\u0010,\u001a\u00020\n2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u0006H\u0010¢\u0006\u0004\b,\u0010+J\u0017\u0010.\u001a\u00020\n2\u0006\u0010-\u001a\u00020\u0006H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020$H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\n2\u0006\u00100\u001a\u00020$H\u0016¢\u0006\u0004\b2\u00103J\u0019\u00106\u001a\u00020\n2\b\u00105\u001a\u0004\u0018\u000104H\u0016¢\u0006\u0004\b6\u00107J!\u00106\u001a\u00020\n2\b\u00105\u001a\u0004\u0018\u0001042\u0006\u00108\u001a\u00020\u0006H\u0016¢\u0006\u0004\b6\u00109J)\u00106\u001a\u00020\n2\b\u00105\u001a\u0004\u0018\u0001042\u0006\u0010:\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u0006H\u0016¢\u0006\u0004\b6\u0010<J#\u00106\u001a\u00020\n2\b\u00105\u001a\u0004\u0018\u0001042\b\u0010>\u001a\u0004\u0018\u00010=H\u0016¢\u0006\u0004\b6\u0010?J+\u00106\u001a\u00020\n2\b\u00105\u001a\u0004\u0018\u0001042\u0006\u00108\u001a\u00020\u00062\b\u0010>\u001a\u0004\u0018\u00010=H\u0016¢\u0006\u0004\b6\u0010@J+\u0010A\u001a\u00020$2\b\u00105\u001a\u0004\u0018\u0001042\u0006\u00108\u001a\u00020\u00062\b\u0010>\u001a\u0004\u0018\u00010=H\u0014¢\u0006\u0004\bA\u0010BJ3\u0010A\u001a\u00020$2\b\u00105\u001a\u0004\u0018\u0001042\u0006\u00108\u001a\u00020\u00062\b\u0010>\u001a\u0004\u0018\u00010=2\u0006\u0010C\u001a\u00020$H\u0014¢\u0006\u0004\bA\u0010DJ\u000f\u0010E\u001a\u00020$H\u0016¢\u0006\u0004\bE\u00101R\u001e\u0010I\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR(\u0010P\u001a\u0004\u0018\u00010J2\b\u0010K\u001a\u0004\u0018\u00010J8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bL\u0010M\"\u0004\bN\u0010OR\u0018\u0010T\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR(\u0010X\u001a\u0004\u0018\u00010\r2\b\u0010K\u001a\u0004\u0018\u00010\r8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bU\u0010V\"\u0004\bW\u0010\u0015R$\u0010]\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bZ\u0010[\u0012\u0004\b\\\u0010\fR0\u0010c\u001a\u00020$2\u0006\u0010K\u001a\u00020$8\u0006@FX\u0087\u000e¢\u0006\u0018\n\u0004\b^\u0010_\u0012\u0004\bb\u0010\f\u001a\u0004\b`\u00101\"\u0004\ba\u00103R\u0016\u0010e\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010_R\u0016\u0010g\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010_R\u0018\u0010j\u001a\u00020$*\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bh\u0010iR\u0014\u0010l\u001a\u00020$8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bk\u00101R\u0011\u0010n\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\bm\u00101¨\u0006o"}, d2 = {"Lcom/goldenboot/saga/zone/CardSampler;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/goldenboot/saga/zone/DpadBuilder;", "clipOrigin", "()V", "Lcom/goldenboot/saga/zone/WorkerIndex;", "releaseHeader", "(Lcom/goldenboot/saga/zone/WorkerIndex;)Lcom/goldenboot/saga/zone/WorkerIndex;", "peekRevision", "()Lcom/goldenboot/saga/zone/WorkerIndex;", "applyTask", "parent", "setParentCompositionContext", "(Lcom/goldenboot/saga/zone/WorkerIndex;)V", "Lcom/goldenboot/saga/zone/AnimCheckpoint;", "strategy", "setViewCompositionStrategy", "(Lcom/goldenboot/saga/zone/AnimCheckpoint;)V", "detachStream", "(Lcom/goldenboot/saga/zone/NotificationFence;I)V", "flushSample", "updateTimer", "onAttachedToWindow", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "drawField", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "popBlueprint", "layoutDirection", "onRtlPropertiesChanged", "(I)V", "isTransitionGroup", "()Z", "setTransitionGroup", "(Z)V", "Landroid/view/View;", "child", "addView", "(Landroid/view/View;)V", "index", "(Landroid/view/View;I)V", "width", "height", "(Landroid/view/View;II)V", "Landroid/view/ViewGroup$LayoutParams;", "params", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V", "addViewInLayout", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)Z", "preventRequestLayout", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)Z", "shouldDelayChildPressedState", "Ljava/lang/ref/WeakReference;", "reduceScope", "Ljava/lang/ref/WeakReference;", "cachedViewTreeCompositionContext", "Landroid/os/IBinder;", "value", "notifyMessage", "Landroid/os/IBinder;", "setPreviousAttachedWindowToken", "(Landroid/os/IBinder;)V", "previousAttachedWindowToken", "Lcom/goldenboot/saga/zone/FrameHub;", "connectPatch", "Lcom/goldenboot/saga/zone/FrameHub;", "composition", "attachConfig", "Lcom/goldenboot/saga/zone/WorkerIndex;", "setParentContext", "parentContext", "Lkotlin/Function0;", "resetDelta", "Lcom/goldenboot/saga/zone/ElevationNode;", "getDisposeViewCompositionStrategy$annotations", "disposeViewCompositionStrategy", "inflateAdapter", "Z", "getShowLayoutBounds", "setShowLayoutBounds", "getShowLayoutBounds$annotations", "showLayoutBounds", "purgeNode", "creatingComposition", "drawRequest", "isTransitionGroupSet", "connectJob", "(Lcom/goldenboot/saga/zone/WorkerIndex;)Z", "isAlive", "getShouldCreateCompositionOnAttachedToWindow", "shouldCreateCompositionOnAttachedToWindow", "getHasComposition", "hasComposition", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class CardSampler extends ViewGroup {
    public static final int gatherAdapter = 8;

    /* renamed from: attachConfig, reason: from kotlin metadata */
    private WorkerIndex parentContext;

    /* renamed from: connectPatch, reason: from kotlin metadata */
    private FrameHub composition;

    /* renamed from: drawRequest, reason: from kotlin metadata */
    private boolean isTransitionGroupSet;

    /* renamed from: inflateAdapter, reason: from kotlin metadata */
    private boolean showLayoutBounds;

    /* renamed from: notifyMessage, reason: from kotlin metadata */
    private IBinder previousAttachedWindowToken;

    /* renamed from: purgeNode, reason: from kotlin metadata */
    private boolean creatingComposition;

    /* renamed from: reduceScope, reason: from kotlin metadata */
    private WeakReference<WorkerIndex> cachedViewTreeCompositionContext;

    /* renamed from: resetDelta, reason: from kotlin metadata */
    private ElevationNode disposeViewCompositionStrategy;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/goldenboot/saga/zone/DpadBuilder;", "evictLayout", "(Lcom/goldenboot/saga/zone/NotificationFence;I)V"}, k = 3, mv = {2, 0, 0})
    public static final class ActivityMutator extends Lambda implements IconExporter {
        public ActivityMutator() {
            super(2);
        }

        public final void evictLayout(NotificationFence notificationFence, int i) {
            if (!notificationFence.injectConstraint((i & 3) != 2, i & 1)) {
                notificationFence.syncScope();
                return;
            }
            if (MorphPatch.bindBody()) {
                MorphPatch.formatPosition(-656146368, i, -1, "androidx.compose.ui.platform.AbstractComposeView.ensureCompositionCreated.<anonymous> (ComposeView.android.kt:249)");
            }
            CardSampler.this.detachStream(notificationFence, 0);
            if (MorphPatch.bindBody()) {
                MorphPatch.startResource();
            }
        }

        @Override // com.goldenboot.saga.zone.IconExporter
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            evictLayout((NotificationFence) obj, ((Number) obj2).intValue());
            return DpadBuilder.evictLayout;
        }
    }

    public CardSampler(Context context) {
        this(context, null, 0, 6, null);
    }

    private final void applyTask() {
        if (this.composition == null) {
            try {
                this.creatingComposition = true;
                this.composition = androidx.compose.ui.platform.AlphaProbe.injectMetric(this, peekRevision(), IconMaker.growPayload(-656146368, true, new ActivityMutator()));
            } finally {
                this.creatingComposition = false;
            }
        }
    }

    private final void clipOrigin() {
        if (this.creatingComposition) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    private final boolean connectJob(WorkerIndex workerIndex) {
        return !(workerIndex instanceof LongPressCollector) || ((LongPressCollector.LayerUseCase) ((LongPressCollector) workerIndex).validateOffset().getValue()).compareTo(LongPressCollector.LayerUseCase.notifyMessage) > 0;
    }

    private final WorkerIndex peekRevision() {
        WorkerIndex workerIndex;
        WorkerIndex workerIndex2 = this.parentContext;
        if (workerIndex2 == null) {
            WorkerIndex detachStream = HapticShard.detachStream(this);
            WorkerIndex workerIndex3 = null;
            workerIndex2 = detachStream != null ? releaseHeader(detachStream) : null;
            if (workerIndex2 == null) {
                WeakReference<WorkerIndex> weakReference = this.cachedViewTreeCompositionContext;
                if (weakReference != null && (workerIndex = weakReference.get()) != null && connectJob(workerIndex)) {
                    workerIndex3 = workerIndex;
                }
                return workerIndex3 == null ? releaseHeader(HapticShard.updateTimer(this)) : workerIndex3;
            }
        }
        return workerIndex2;
    }

    private final WorkerIndex releaseHeader(WorkerIndex workerIndex) {
        WorkerIndex workerIndex2 = connectJob(workerIndex) ? workerIndex : null;
        if (workerIndex2 != null) {
            this.cachedViewTreeCompositionContext = new WeakReference<>(workerIndex2);
        }
        return workerIndex;
    }

    private final void setParentContext(WorkerIndex workerIndex) {
        if (this.parentContext != workerIndex) {
            this.parentContext = workerIndex;
            if (workerIndex != null) {
                this.cachedViewTreeCompositionContext = null;
            }
            FrameHub frameHub = this.composition;
            if (frameHub != null) {
                frameHub.evictLayout();
                this.composition = null;
                if (isAttachedToWindow()) {
                    applyTask();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.previousAttachedWindowToken != iBinder) {
            this.previousAttachedWindowToken = iBinder;
            this.cachedViewTreeCompositionContext = null;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View child) {
        clipOrigin();
        super.addView(child);
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(View child, int index, ViewGroup.LayoutParams params) {
        clipOrigin();
        return super.addViewInLayout(child, index, params);
    }

    public abstract void detachStream(NotificationFence notificationFence, int i);

    public void drawField(int widthMeasureSpec, int heightMeasureSpec) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(widthMeasureSpec) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(widthMeasureSpec)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(heightMeasureSpec) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(heightMeasureSpec)));
        setMeasuredDimension(childAt.getMeasuredWidth() + getPaddingLeft() + getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop() + getPaddingBottom());
    }

    public final void flushSample() {
        if (this.parentContext == null && !isAttachedToWindow()) {
            throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
        }
        applyTask();
    }

    public final boolean getHasComposition() {
        return this.composition != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    @Override // android.view.ViewGroup
    public boolean isTransitionGroup() {
        return !this.isTransitionGroupSet || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            applyTask();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean changed, int left, int top, int right, int bottom) {
        popBlueprint(changed, left, top, right, bottom);
    }

    @Override // android.view.View
    public final void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        applyTask();
        drawField(widthMeasureSpec, heightMeasureSpec);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int layoutDirection) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(layoutDirection);
        }
    }

    public void popBlueprint(boolean changed, int left, int top, int right, int bottom) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (right - left) - getPaddingRight(), (bottom - top) - getPaddingBottom());
        }
    }

    public final void setParentCompositionContext(WorkerIndex parent) {
        setParentContext(parent);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.showLayoutBounds = z;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((CarouselHelper) childAt).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean isTransitionGroup) {
        super.setTransitionGroup(isTransitionGroup);
        this.isTransitionGroupSet = true;
    }

    public final void setViewCompositionStrategy(AnimCheckpoint strategy) {
        ElevationNode elevationNode = this.disposeViewCompositionStrategy;
        if (elevationNode != null) {
            elevationNode.invoke();
        }
        this.disposeViewCompositionStrategy = strategy.evictLayout(this);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void updateTimer() {
        FrameHub frameHub = this.composition;
        if (frameHub != null) {
            frameHub.evictLayout();
        }
        this.composition = null;
        requestLayout();
    }

    public CardSampler(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ CardSampler(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index) {
        clipOrigin();
        super.addView(child, index);
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(View child, int index, ViewGroup.LayoutParams params, boolean preventRequestLayout) {
        clipOrigin();
        return super.addViewInLayout(child, index, params, preventRequestLayout);
    }

    public CardSampler(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        this.disposeViewCompositionStrategy = AnimCheckpoint.INSTANCE.evictLayout().evictLayout(this);
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int width, int height) {
        clipOrigin();
        super.addView(child, width, height);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View child, ViewGroup.LayoutParams params) {
        clipOrigin();
        super.addView(child, params);
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        clipOrigin();
        super.addView(child, index, params);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
