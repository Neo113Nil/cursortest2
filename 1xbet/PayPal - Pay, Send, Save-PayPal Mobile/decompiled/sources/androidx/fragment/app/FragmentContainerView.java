package androidx.fragment.app;

@kotlin.Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001LB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\nB!\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0004\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001dH\u0014¢\u0006\u0004\b\u001f\u0010 J'\u0010$\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!H\u0014¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u000eH\u0016¢\u0006\u0004\b'\u0010\u0012J\u0019\u0010*\u001a\u00028\u0000\"\n\b\u0000\u0010)*\u0004\u0018\u00010(¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b,\u0010\u001cJ\u000f\u0010-\u001a\u00020\u0010H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u000eH\u0016¢\u0006\u0004\b/\u0010\u0012J\u0017\u00100\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u000eH\u0016¢\u0006\u0004\b2\u0010\u0012J\u001f\u00105\u001a\u00020\u00102\u0006\u00103\u001a\u00020\b2\u0006\u00104\u001a\u00020\bH\u0016¢\u0006\u0004\b5\u00106J\u001f\u00107\u001a\u00020\u00102\u0006\u00103\u001a\u00020\b2\u0006\u00104\u001a\u00020\bH\u0016¢\u0006\u0004\b7\u00106J\u0017\u00109\u001a\u00020\u00102\u0006\u00108\u001a\u00020#H\u0000¢\u0006\u0004\b9\u0010:J\u0019\u0010=\u001a\u00020\u00102\b\u0010<\u001a\u0004\u0018\u00010;H\u0016¢\u0006\u0004\b=\u0010>J\u0019\u0010A\u001a\u00020\u00102\b\u0010@\u001a\u0004\u0018\u00010?H\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010C\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u000eH\u0016¢\u0006\u0004\bC\u0010\u0012R\u0018\u0010F\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010HR\u0016\u0010I\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020\u000e0G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010H"}, d2 = {"Landroidx/fragment/app/FragmentContainerView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroidx/fragment/app/FragmentManager;", "fm", "(Landroid/content/Context;Landroid/util/AttributeSet;Landroidx/fragment/app/FragmentManager;)V", "Landroid/view/View;", "p0", "", "getHighSpeedVideoFpsRangesFor", "(Landroid/view/View;)V", "child", "index", "Landroid/view/ViewGroup$LayoutParams;", "params", "addView", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V", "Landroid/view/WindowInsets;", "insets", "dispatchApplyWindowInsets", "(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "", "drawingTime", "", "drawChild", "(Landroid/graphics/Canvas;Landroid/view/View;J)Z", "view", "endViewTransition", "Landroidx/fragment/app/Fragment;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getFragment", "()Landroidx/fragment/app/Fragment;", "onApplyWindowInsets", "removeAllViewsInLayout", "()V", "removeView", "removeViewAt", "(I)V", "removeViewInLayout", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "removeViews", "(II)V", "removeViewsInLayout", "drawDisappearingViewsFirst", "setDrawDisappearingViewsLast", "(Z)V", "Landroid/animation/LayoutTransition;", "transition", "setLayoutTransition", "(Landroid/animation/LayoutTransition;)V", "Landroid/view/View$OnApplyWindowInsetsListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnApplyWindowInsetsListener", "(Landroid/view/View$OnApplyWindowInsetsListener;)V", "startViewTransition", "Camera2StreamConfigurationMap", "Landroid/view/View$OnApplyWindowInsetsListener;", "getHighSpeedVideoFpsRanges", "", "Ljava/util/List;", "getHighSpeedVideoSizes", "Z", "getHighResolutionOutputSizeshNQ4ISI", "Api20Impl"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FragmentContainerView extends android.widget.FrameLayout {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private android.view.View.OnApplyWindowInsetsListener getHighSpeedVideoFpsRanges;
    private final java.util.List<android.view.View> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.List<android.view.View> getHighSpeedVideoFpsRangesFor;
    private boolean getHighSpeedVideoSizes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList();
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList();
        this.getHighSpeedVideoSizes = true;
    }

    public /* synthetic */ FragmentContainerView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList();
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList();
        this.getHighSpeedVideoSizes = true;
        if (attributeSet != null) {
            java.lang.String classAttribute = attributeSet.getClassAttribute();
            int[] iArr = androidx.fragment.R.styleable.FragmentContainerView;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(iArr, "");
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            if (classAttribute != null) {
                str = com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.CLASS;
            } else {
                classAttribute = obtainStyledAttributes.getString(androidx.fragment.R.styleable.FragmentContainerView_android_name);
                str = "android:name";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FragmentContainerView must be within a FragmentActivity to use ");
            sb.append(str);
            sb.append("=\"");
            sb.append(classAttribute);
            sb.append('\"');
            throw new java.lang.UnsupportedOperationException(sb.toString());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(android.content.Context context, android.util.AttributeSet attributeSet, androidx.fragment.app.FragmentManager fragmentManager) {
        super(context, attributeSet);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributeSet, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentManager, "");
        this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList();
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList();
        this.getHighSpeedVideoSizes = true;
        java.lang.String classAttribute = attributeSet.getClassAttribute();
        int[] iArr = androidx.fragment.R.styleable.FragmentContainerView;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(iArr, "");
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(androidx.fragment.R.styleable.FragmentContainerView_android_name) : classAttribute;
        java.lang.String string = obtainStyledAttributes.getString(androidx.fragment.R.styleable.FragmentContainerView_android_tag);
        obtainStyledAttributes.recycle();
        int id = getId();
        androidx.fragment.app.Fragment findFragmentById = fragmentManager.findFragmentById(id);
        if (classAttribute != null && findFragmentById == null) {
            if (id == -1) {
                java.lang.String concat = string != null ? " with tag ".concat(java.lang.String.valueOf(string)) : "";
                java.lang.StringBuilder sb = new java.lang.StringBuilder("FragmentContainerView must have an android:id to add Fragment ");
                sb.append(classAttribute);
                sb.append(concat);
                throw new java.lang.IllegalStateException(sb.toString());
            }
            androidx.fragment.app.Fragment instantiate = fragmentManager.getFragmentFactory().instantiate(context.getClassLoader(), classAttribute);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(instantiate, "");
            instantiate.mFragmentId = id;
            instantiate.mContainerId = id;
            instantiate.mTag = string;
            instantiate.mFragmentManager = fragmentManager;
            instantiate.mHost = fragmentManager.getHost();
            instantiate.onInflate(context, attributeSet, (android.os.Bundle) null);
            fragmentManager.beginTransaction().setReorderingAllowed(true).add(this, instantiate, string).commitNowAllowingStateLoss();
        }
        fragmentManager.onContainerAvailable(this);
    }

    @Override // android.view.ViewGroup
    public final void setLayoutTransition(android.animation.LayoutTransition transition) {
        throw new java.lang.UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public final void setOnApplyWindowInsetsListener(android.view.View.OnApplyWindowInsetsListener listener) {
        this.getHighSpeedVideoFpsRanges = listener;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final android.view.WindowInsets dispatchApplyWindowInsets(android.view.WindowInsets insets) {
        androidx.core.view.WindowInsetsCompat onApplyWindowInsets;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(insets, "");
        androidx.core.view.WindowInsetsCompat windowInsetsCompat = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(insets);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(windowInsetsCompat, "");
        if (this.getHighSpeedVideoFpsRanges != null) {
            androidx.fragment.app.FragmentContainerView.Api20Impl api20Impl = androidx.fragment.app.FragmentContainerView.Api20Impl.INSTANCE;
            android.view.View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.getHighSpeedVideoFpsRanges;
            kotlin.jvm.internal.Intrinsics.checkNotNull(onApplyWindowInsetsListener);
            onApplyWindowInsets = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(api20Impl.onApplyWindowInsets(onApplyWindowInsetsListener, this, insets));
        } else {
            onApplyWindowInsets = androidx.core.view.ViewCompat.onApplyWindowInsets(this, windowInsetsCompat);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(onApplyWindowInsets, "");
        if (!onApplyWindowInsets.isConsumed()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                androidx.core.view.ViewCompat.dispatchApplyWindowInsets(getChildAt(i), onApplyWindowInsets);
            }
        }
        return insets;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(canvas, "");
        if (this.getHighSpeedVideoSizes) {
            java.util.Iterator<T> it = this.getHighSpeedVideoFpsRangesFor.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (android.view.View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    protected final boolean drawChild(android.graphics.Canvas canvas, android.view.View child, long drawingTime) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(canvas, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(child, "");
        if (this.getHighSpeedVideoSizes && !this.getHighSpeedVideoFpsRangesFor.isEmpty() && this.getHighSpeedVideoFpsRangesFor.contains(child)) {
            return false;
        }
        return super.drawChild(canvas, child, drawingTime);
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        if (view.getParent() == this) {
            this.getHighResolutionOutputSizeshNQ4ISI.add(view);
        }
        super.startViewTransition(view);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        this.getHighResolutionOutputSizeshNQ4ISI.remove(view);
        if (this.getHighSpeedVideoFpsRangesFor.remove(view)) {
            this.getHighSpeedVideoSizes = true;
        }
        super.endViewTransition(view);
    }

    public final void setDrawDisappearingViewsLast(boolean drawDisappearingViewsFirst) {
        this.getHighSpeedVideoSizes = drawDisappearingViewsFirst;
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View child, int index, android.view.ViewGroup.LayoutParams params) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(child, "");
        if (androidx.fragment.app.FragmentManager.getHighSpeedVideoSizes(child) == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Views added to a FragmentContainerView must be associated with a Fragment. View ");
            sb.append(child);
            sb.append(" is not associated with a Fragment.");
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        super.addView(child, index, params);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int index) {
        android.view.View childAt = getChildAt(index);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(childAt, "");
        getHighSpeedVideoFpsRangesFor(childAt);
        super.removeViewAt(index);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        getHighSpeedVideoFpsRangesFor(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        getHighSpeedVideoFpsRangesFor(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int start, int count) {
        for (int i = start; i < start + count; i++) {
            android.view.View childAt = getChildAt(i);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(childAt, "");
            getHighSpeedVideoFpsRangesFor(childAt);
        }
        super.removeViews(start, count);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int start, int count) {
        for (int i = start; i < start + count; i++) {
            android.view.View childAt = getChildAt(i);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(childAt, "");
            getHighSpeedVideoFpsRangesFor(childAt);
        }
        super.removeViewsInLayout(start, count);
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            android.view.View childAt = getChildAt(childCount);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(childAt, "");
            getHighSpeedVideoFpsRangesFor(childAt);
        }
        super.removeAllViewsInLayout();
    }

    private final void getHighSpeedVideoFpsRangesFor(android.view.View p0) {
        if (this.getHighResolutionOutputSizeshNQ4ISI.contains(p0)) {
            this.getHighSpeedVideoFpsRangesFor.add(p0);
        }
    }

    public final <F extends androidx.fragment.app.Fragment> F getFragment() {
        return (F) androidx.fragment.app.FragmentManager.findFragmentManager(this).findFragmentById(getId());
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/fragment/app/FragmentContainerView$Api20Impl;", "", "<init>", "()V", "Landroid/view/View$OnApplyWindowInsetsListener;", "onApplyWindowInsetsListener", "Landroid/view/View;", "v", "Landroid/view/WindowInsets;", "insets", "onApplyWindowInsets", "(Landroid/view/View$OnApplyWindowInsetsListener;Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Api20Impl {
        public static final androidx.fragment.app.FragmentContainerView.Api20Impl INSTANCE = new androidx.fragment.app.FragmentContainerView.Api20Impl();

        private Api20Impl() {
        }

        public final android.view.WindowInsets onApplyWindowInsets(android.view.View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, android.view.View v, android.view.WindowInsets insets) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onApplyWindowInsetsListener, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(v, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(insets, "");
            android.view.WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(v, insets);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(onApplyWindowInsets, "");
            return onApplyWindowInsets;
        }
    }

    @Override // android.view.View
    public final android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets insets) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(insets, "");
        return insets;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
    }
}
