package androidx.compose.ui.platform;

import S0.AbstractC3984t;
import S0.InterfaceC3967k;
import S0.InterfaceC3982s;
import S0.L0;
import U7.C4056a;
import a1.C4912a;
import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.platform.Y1;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\b'\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\fH'¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0018\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u001d\u0010\u001cJ7\u0010%\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0006H\u0004¢\u0006\u0004\b%\u0010&J7\u0010(\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0006H\u0010¢\u0006\u0004\b'\u0010&J\u0017\u0010*\u001a\u00020\f2\u0006\u0010)\u001a\u00020\u0006H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u001fH\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\f2\u0006\u0010,\u001a\u00020\u001fH\u0016¢\u0006\u0004\b.\u0010/J\u0019\u00102\u001a\u00020\f2\b\u00101\u001a\u0004\u0018\u000100H\u0016¢\u0006\u0004\b2\u00103J!\u00102\u001a\u00020\f2\b\u00101\u001a\u0004\u0018\u0001002\u0006\u00104\u001a\u00020\u0006H\u0016¢\u0006\u0004\b2\u00105J)\u00102\u001a\u00020\f2\b\u00101\u001a\u0004\u0018\u0001002\u0006\u00106\u001a\u00020\u00062\u0006\u00107\u001a\u00020\u0006H\u0016¢\u0006\u0004\b2\u00108J#\u00102\u001a\u00020\f2\b\u00101\u001a\u0004\u0018\u0001002\b\u0010:\u001a\u0004\u0018\u000109H\u0016¢\u0006\u0004\b2\u0010;J+\u00102\u001a\u00020\f2\b\u00101\u001a\u0004\u0018\u0001002\u0006\u00104\u001a\u00020\u00062\b\u0010:\u001a\u0004\u0018\u000109H\u0016¢\u0006\u0004\b2\u0010<J+\u0010=\u001a\u00020\u001f2\b\u00101\u001a\u0004\u0018\u0001002\u0006\u00104\u001a\u00020\u00062\b\u0010:\u001a\u0004\u0018\u000109H\u0014¢\u0006\u0004\b=\u0010>J3\u0010=\u001a\u00020\u001f2\b\u00101\u001a\u0004\u0018\u0001002\u0006\u00104\u001a\u00020\u00062\b\u0010:\u001a\u0004\u0018\u0001092\u0006\u0010?\u001a\u00020\u001fH\u0014¢\u0006\u0004\b=\u0010@J\u000f\u0010A\u001a\u00020\u001fH\u0016¢\u0006\u0004\bA\u0010-J\u000f\u0010B\u001a\u00020\fH\u0002¢\u0006\u0004\bB\u0010\u0016J\u0013\u0010C\u001a\u00020\n*\u00020\nH\u0002¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\nH\u0002¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\fH\u0002¢\u0006\u0004\bG\u0010\u0016R\u001e\u0010I\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR(\u0010M\u001a\u0004\u0018\u00010K2\b\u0010L\u001a\u0004\u0018\u00010K8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bM\u0010N\"\u0004\bO\u0010PR\u0018\u0010R\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR(\u0010T\u001a\u0004\u0018\u00010\n2\b\u0010L\u001a\u0004\u0018\u00010\n8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bT\u0010U\"\u0004\bV\u0010\u000eR$\u0010X\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bX\u0010Y\u0012\u0004\bZ\u0010\u0016R0\u0010[\u001a\u00020\u001f2\u0006\u0010L\u001a\u00020\u001f8F@FX\u0087\u000e¢\u0006\u0018\n\u0004\b[\u0010\\\u0012\u0004\b_\u0010\u0016\u001a\u0004\b]\u0010-\"\u0004\b^\u0010/R\u0016\u0010`\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010\\R\u0016\u0010a\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010\\R\u0014\u0010c\u001a\u00020\u001f8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bb\u0010-R\u0011\u0010e\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\bd\u0010-R\u0018\u0010f\u001a\u00020\u001f*\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bf\u0010g¨\u0006h"}, d2 = {"Landroidx/compose/ui/platform/a;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "LS0/t;", "parent", "", "setParentCompositionContext", "(LS0/t;)V", "Landroidx/compose/ui/platform/Y1;", "strategy", "setViewCompositionStrategy", "(Landroidx/compose/ui/platform/Y1;)V", "Content", "(LS0/k;I)V", "createComposition", "()V", "disposeComposition", "onAttachedToWindow", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "internalOnMeasure$ui_release", "internalOnMeasure", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "internalOnLayout$ui_release", "internalOnLayout", "layoutDirection", "onRtlPropertiesChanged", "(I)V", "isTransitionGroup", "()Z", "setTransitionGroup", "(Z)V", "Landroid/view/View;", "child", "addView", "(Landroid/view/View;)V", "index", "(Landroid/view/View;I)V", "width", "height", "(Landroid/view/View;II)V", "Landroid/view/ViewGroup$LayoutParams;", "params", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V", "addViewInLayout", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)Z", "preventRequestLayout", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)Z", "shouldDelayChildPressedState", "checkAddView", "cacheIfAlive", "(LS0/t;)LS0/t;", "resolveParentCompositionContext", "()LS0/t;", "ensureCompositionCreated", "Ljava/lang/ref/WeakReference;", "cachedViewTreeCompositionContext", "Ljava/lang/ref/WeakReference;", "Landroid/os/IBinder;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "previousAttachedWindowToken", "Landroid/os/IBinder;", "setPreviousAttachedWindowToken", "(Landroid/os/IBinder;)V", "LS0/s;", "composition", "LS0/s;", "parentContext", "LS0/t;", "setParentContext", "Lkotlin/Function0;", "disposeViewCompositionStrategy", "Lkotlin/jvm/functions/Function0;", "getDisposeViewCompositionStrategy$annotations", "showLayoutBounds", "Z", "getShowLayoutBounds", "setShowLayoutBounds", "getShowLayoutBounds$annotations", "creatingComposition", "isTransitionGroupSet", "getShouldCreateCompositionOnAttachedToWindow", "shouldCreateCompositionOnAttachedToWindow", "getHasComposition", "hasComposition", "isAlive", "(LS0/t;)Z", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5228a extends ViewGroup {
    public static final int $stable = 8;
    private WeakReference<AbstractC3984t> cachedViewTreeCompositionContext;
    private InterfaceC3982s composition;
    private boolean creatingComposition;
    private Function0<Unit> disposeViewCompositionStrategy;
    private boolean isTransitionGroupSet;
    private AbstractC3984t parentContext;
    private IBinder previousAttachedWindowToken;
    private boolean showLayoutBounds;

    /* renamed from: androidx.compose.ui.platform.a$a, reason: collision with other inner class name */
    static final class C0748a extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
        C0748a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
                interfaceC3967k2.j();
            } else {
                AbstractC5228a.this.Content(interfaceC3967k2, 0);
            }
            return Unit.f71690a;
        }
    }

    public AbstractC5228a(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    private final AbstractC3984t cacheIfAlive(AbstractC3984t abstractC3984t) {
        AbstractC3984t abstractC3984t2 = isAlive(abstractC3984t) ? abstractC3984t : null;
        if (abstractC3984t2 != null) {
            this.cachedViewTreeCompositionContext = new WeakReference<>(abstractC3984t2);
        }
        return abstractC3984t;
    }

    private final void checkAddView() {
        if (this.creatingComposition) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    private final void ensureCompositionCreated() {
        if (this.composition == null) {
            try {
                this.creatingComposition = true;
                this.composition = z2.a(this, resolveParentCompositionContext(), new C4912a(true, -656146368, new C0748a()));
            } finally {
                this.creatingComposition = false;
            }
        }
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    private final boolean isAlive(AbstractC3984t abstractC3984t) {
        return !(abstractC3984t instanceof S0.L0) || ((S0.L0) abstractC3984t).W().getValue().compareTo(L0.d.ShuttingDown) > 0;
    }

    private final AbstractC3984t resolveParentCompositionContext() {
        S0.L0 l02;
        AbstractC3984t abstractC3984t = this.parentContext;
        if (abstractC3984t == null) {
            AbstractC3984t b11 = r2.b(this);
            if (b11 == null) {
                for (ViewParent parent = getParent(); b11 == null && (parent instanceof View); parent = parent.getParent()) {
                    b11 = r2.b((View) parent);
                }
            }
            abstractC3984t = b11 != null ? cacheIfAlive(b11) : null;
            if (abstractC3984t == null) {
                WeakReference<AbstractC3984t> weakReference = this.cachedViewTreeCompositionContext;
                if (weakReference == null || (abstractC3984t = weakReference.get()) == null || !isAlive(abstractC3984t)) {
                    abstractC3984t = null;
                }
                if (abstractC3984t == null) {
                    if (!isAttachedToWindow()) {
                        A1.a.b("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
                        throw null;
                    }
                    Object parent2 = getParent();
                    View view = this;
                    while (parent2 instanceof View) {
                        View view2 = (View) parent2;
                        if (view2.getId() == 16908290) {
                            break;
                        }
                        view = view2;
                        parent2 = view2.getParent();
                    }
                    AbstractC3984t b12 = r2.b(view);
                    if (b12 == null) {
                        l02 = m2.a(view);
                    } else {
                        if (!(b12 instanceof S0.L0)) {
                            throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
                        }
                        l02 = (S0.L0) b12;
                    }
                    return cacheIfAlive(l02);
                }
            }
        }
        return abstractC3984t;
    }

    private final void setParentContext(AbstractC3984t abstractC3984t) {
        if (this.parentContext != abstractC3984t) {
            this.parentContext = abstractC3984t;
            if (abstractC3984t != null) {
                this.cachedViewTreeCompositionContext = null;
            }
            InterfaceC3982s interfaceC3982s = this.composition;
            if (interfaceC3982s != null) {
                interfaceC3982s.dispose();
                this.composition = null;
                if (isAttachedToWindow()) {
                    ensureCompositionCreated();
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

    public abstract void Content(InterfaceC3967k interfaceC3967k, int i11);

    @Override // android.view.ViewGroup
    public void addView(View child) {
        checkAddView();
        super.addView(child);
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(View child, int index, ViewGroup.LayoutParams params) {
        checkAddView();
        return super.addViewInLayout(child, index, params);
    }

    public final void createComposition() {
        if (this.parentContext == null && !isAttachedToWindow()) {
            throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
        }
        ensureCompositionCreated();
    }

    public final void disposeComposition() {
        InterfaceC3982s interfaceC3982s = this.composition;
        if (interfaceC3982s != null) {
            interfaceC3982s.dispose();
        }
        this.composition = null;
        requestLayout();
    }

    public final boolean getHasComposition() {
        return this.composition != null;
    }

    /* renamed from: getShouldCreateCompositionOnAttachedToWindow */
    protected boolean getF40614b() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    public void internalOnLayout$ui_release(boolean changed, int left, int top, int right, int bottom) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (right - left) - getPaddingRight(), (bottom - top) - getPaddingBottom());
        }
    }

    public void internalOnMeasure$ui_release(int widthMeasureSpec, int heightMeasureSpec) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(widthMeasureSpec) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(widthMeasureSpec)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(heightMeasureSpec) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(heightMeasureSpec)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup
    public boolean isTransitionGroup() {
        return !this.isTransitionGroupSet || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getF40614b()) {
            ensureCompositionCreated();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean changed, int left, int top, int right, int bottom) {
        internalOnLayout$ui_release(changed, left, top, right, bottom);
    }

    @Override // android.view.View
    protected final void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        ensureCompositionCreated();
        internalOnMeasure$ui_release(widthMeasureSpec, heightMeasureSpec);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int layoutDirection) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        childAt.setLayoutDirection(layoutDirection);
    }

    public final void setParentCompositionContext(AbstractC3984t parent) {
        setParentContext(parent);
    }

    public final void setShowLayoutBounds(boolean z11) {
        this.showLayoutBounds = z11;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((D1.x0) childAt).s(z11);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean isTransitionGroup) {
        super.setTransitionGroup(isTransitionGroup);
        this.isTransitionGroupSet = true;
    }

    public final void setViewCompositionStrategy(@NotNull Y1 strategy) {
        Function0<Unit> function0 = this.disposeViewCompositionStrategy;
        if (function0 != null) {
            function0.invoke();
        }
        this.disposeViewCompositionStrategy = strategy.a(this);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public AbstractC5228a(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ AbstractC5228a(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index) {
        checkAddView();
        super.addView(child, index);
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(View child, int index, ViewGroup.LayoutParams params, boolean preventRequestLayout) {
        checkAddView();
        return super.addViewInLayout(child, index, params, preventRequestLayout);
    }

    public AbstractC5228a(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        setClipChildren(false);
        setClipToPadding(false);
        Y1.b.ViewOnAttachStateChangeListenerC0746b viewOnAttachStateChangeListenerC0746b = new Y1.b.ViewOnAttachStateChangeListenerC0746b(this);
        addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0746b);
        C4056a c4056a = new C4056a();
        N2.a.a(this, c4056a);
        this.disposeViewCompositionStrategy = new Y1.b.a(this, viewOnAttachStateChangeListenerC0746b, c4056a);
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int width, int height) {
        checkAddView();
        super.addView(child, width, height);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View child, ViewGroup.LayoutParams params) {
        checkAddView();
        super.addView(child, params);
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        checkAddView();
        super.addView(child, index, params);
    }
}
