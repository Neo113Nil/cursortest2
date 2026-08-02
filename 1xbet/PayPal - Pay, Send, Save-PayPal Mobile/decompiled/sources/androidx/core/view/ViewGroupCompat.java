package androidx.core.view;

/* loaded from: classes3.dex */
public final class ViewGroupCompat {
    public static final int LAYOUT_MODE_CLIP_BOUNDS = 0;
    public static final int LAYOUT_MODE_OPTICAL_BOUNDS = 1;
    private static final android.view.WindowInsets getHighSpeedVideoFpsRangesFor = androidx.core.view.WindowInsetsCompat.CONSUMED.toWindowInsets();
    static boolean getHighResolutionOutputSizeshNQ4ISI = false;

    private ViewGroupCompat() {
    }

    @androidx.annotation.ReplaceWith(expression = "group.onRequestSendAccessibilityEvent(child, event)")
    @java.lang.Deprecated
    public static boolean onRequestSendAccessibilityEvent(android.view.ViewGroup viewGroup, android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return viewGroup.onRequestSendAccessibilityEvent(view, accessibilityEvent);
    }

    @androidx.annotation.ReplaceWith(expression = "group.setMotionEventSplittingEnabled(split)")
    @java.lang.Deprecated
    public static void setMotionEventSplittingEnabled(android.view.ViewGroup viewGroup, boolean z) {
        viewGroup.setMotionEventSplittingEnabled(z);
    }

    @androidx.annotation.ReplaceWith(expression = "group.getLayoutMode()")
    @java.lang.Deprecated
    public static int getLayoutMode(android.view.ViewGroup viewGroup) {
        return viewGroup.getLayoutMode();
    }

    @androidx.annotation.ReplaceWith(expression = "group.setLayoutMode(mode)")
    @java.lang.Deprecated
    public static void setLayoutMode(android.view.ViewGroup viewGroup, int i) {
        viewGroup.setLayoutMode(i);
    }

    public static void setTransitionGroup(android.view.ViewGroup viewGroup, boolean z) {
        viewGroup.setTransitionGroup(z);
    }

    public static boolean isTransitionGroup(android.view.ViewGroup viewGroup) {
        return viewGroup.isTransitionGroup();
    }

    public static int getNestedScrollAxes(android.view.ViewGroup viewGroup) {
        return viewGroup.getNestedScrollAxes();
    }

    public static void installCompatInsetsDispatch(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            return;
        }
        android.view.View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = new android.view.View.OnApplyWindowInsetsListener() { // from class: androidx.core.view.ViewGroupCompat$$ExternalSyntheticLambda1
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final android.view.WindowInsets onApplyWindowInsets(android.view.View view2, android.view.WindowInsets windowInsets) {
                return androidx.core.view.ViewGroupCompat.getHighSpeedVideoSizes(view2, windowInsets);
            }
        };
        view.setTag(androidx.core.R.id.tag_compat_insets_dispatch, onApplyWindowInsetsListener);
        view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListener);
        getHighResolutionOutputSizeshNQ4ISI = true;
    }

    static /* synthetic */ android.view.WindowInsets getHighSpeedVideoSizes(android.view.View view, android.view.WindowInsets windowInsets) {
        getHighSpeedVideoFpsRangesFor(view, windowInsets);
        return getHighSpeedVideoFpsRangesFor;
    }

    static android.view.WindowInsets getHighSpeedVideoFpsRangesFor(android.view.View view, android.view.WindowInsets windowInsets) {
        final android.view.View.OnApplyWindowInsetsListener onApplyWindowInsetsListener;
        java.lang.Object tag = view.getTag(androidx.core.R.id.tag_on_apply_window_listener);
        java.lang.Object tag2 = view.getTag(androidx.core.R.id.tag_window_insets_animation_callback);
        if (tag instanceof android.view.View.OnApplyWindowInsetsListener) {
            onApplyWindowInsetsListener = (android.view.View.OnApplyWindowInsetsListener) tag;
        } else {
            onApplyWindowInsetsListener = tag2 instanceof android.view.View.OnApplyWindowInsetsListener ? (android.view.View.OnApplyWindowInsetsListener) tag2 : null;
        }
        final android.view.WindowInsets[] windowInsetsArr = {getHighSpeedVideoFpsRangesFor};
        view.setOnApplyWindowInsetsListener(new android.view.View.OnApplyWindowInsetsListener() { // from class: androidx.core.view.ViewGroupCompat$$ExternalSyntheticLambda0
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final android.view.WindowInsets onApplyWindowInsets(android.view.View view2, android.view.WindowInsets windowInsets2) {
                return androidx.core.view.ViewGroupCompat.getHighSpeedVideoSizes(windowInsetsArr, onApplyWindowInsetsListener, view2, windowInsets2);
            }
        });
        view.dispatchApplyWindowInsets(windowInsets);
        java.lang.Object tag3 = view.getTag(androidx.core.R.id.tag_compat_insets_dispatch);
        if (tag3 instanceof android.view.View.OnApplyWindowInsetsListener) {
            onApplyWindowInsetsListener = (android.view.View.OnApplyWindowInsetsListener) tag3;
        }
        view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListener);
        android.view.WindowInsets windowInsets2 = windowInsetsArr[0];
        if (windowInsets2 != null && !windowInsets2.isConsumed() && (view instanceof android.view.ViewGroup)) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                getHighSpeedVideoFpsRangesFor(viewGroup.getChildAt(i), windowInsetsArr[0]);
            }
        }
        android.view.WindowInsets windowInsets3 = windowInsetsArr[0];
        return windowInsets3 != null ? windowInsets3 : getHighSpeedVideoFpsRangesFor;
    }

    static /* synthetic */ android.view.WindowInsets getHighSpeedVideoSizes(android.view.WindowInsets[] windowInsetsArr, android.view.View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, android.view.View view, android.view.WindowInsets windowInsets) {
        android.view.WindowInsets onApplyWindowInsets;
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        } else {
            onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
        }
        windowInsetsArr[0] = onApplyWindowInsets;
        return getHighSpeedVideoFpsRangesFor;
    }
}
