package com.google.android.material.internal;

/* loaded from: classes8.dex */
public class ViewUtils {
    public static final int EDGE_TO_EDGE_FLAGS = 768;

    public interface OnApplyWindowInsetsListener {
        androidx.core.view.WindowInsetsCompat onApplyWindowInsets(android.view.View view, androidx.core.view.WindowInsetsCompat windowInsetsCompat, com.google.android.material.internal.ViewUtils.RelativePadding relativePadding);
    }

    private ViewUtils() {
    }

    public static void showKeyboard(android.view.View view) {
        showKeyboard(view, true);
    }

    public static void showKeyboard(android.view.View view, boolean z) {
        androidx.core.view.WindowInsetsControllerCompat windowInsetsController;
        if (z && (windowInsetsController = androidx.core.view.ViewCompat.getWindowInsetsController(view)) != null) {
            windowInsetsController.show(androidx.core.view.WindowInsetsCompat.Type.ime());
        } else {
            getInputMethodManager(view).showSoftInput(view, 1);
        }
    }

    public static void requestFocusAndShowKeyboard(android.view.View view) {
        requestFocusAndShowKeyboard(view, true);
    }

    public static void requestFocusAndShowKeyboard(final android.view.View view, final boolean z) {
        view.requestFocus();
        view.post(new java.lang.Runnable() { // from class: com.google.android.material.internal.ViewUtils$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.material.internal.ViewUtils.showKeyboard(view, z);
            }
        });
    }

    public static void hideKeyboard(android.view.View view) {
        hideKeyboard(view, true);
    }

    public static void hideKeyboard(android.view.View view, boolean z) {
        androidx.core.view.WindowInsetsControllerCompat windowInsetsController;
        if (z && (windowInsetsController = androidx.core.view.ViewCompat.getWindowInsetsController(view)) != null) {
            windowInsetsController.hide(androidx.core.view.WindowInsetsCompat.Type.ime());
            return;
        }
        android.view.inputmethod.InputMethodManager inputMethodManager = getInputMethodManager(view);
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    private static android.view.inputmethod.InputMethodManager getInputMethodManager(android.view.View view) {
        return (android.view.inputmethod.InputMethodManager) androidx.core.content.ContextCompat.getSystemService(view.getContext(), android.view.inputmethod.InputMethodManager.class);
    }

    public static void setBoundsFromRect(android.view.View view, android.graphics.Rect rect) {
        view.setLeft(rect.left);
        view.setTop(rect.top);
        view.setRight(rect.right);
        view.setBottom(rect.bottom);
    }

    public static android.graphics.Rect calculateRectFromBounds(android.view.View view) {
        return calculateRectFromBounds(view, 0);
    }

    public static android.graphics.Rect calculateRectFromBounds(android.view.View view, int i) {
        return new android.graphics.Rect(view.getLeft(), view.getTop() + i, view.getRight(), view.getBottom() + i);
    }

    public static android.graphics.Rect calculateOffsetRectFromBounds(android.view.View view, android.view.View view2) {
        int[] iArr = new int[2];
        view2.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        int i3 = i - iArr2[0];
        int i4 = i2 - iArr2[1];
        return new android.graphics.Rect(i3, i4, view2.getWidth() + i3, view2.getHeight() + i4);
    }

    public static java.util.List<android.view.View> getChildren(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                arrayList.add(viewGroup.getChildAt(i));
            }
        }
        return arrayList;
    }

    public static android.graphics.PorterDuff.Mode parseTintMode(int i, android.graphics.PorterDuff.Mode mode) {
        if (i == 3) {
            return android.graphics.PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return android.graphics.PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return android.graphics.PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return android.graphics.PorterDuff.Mode.MULTIPLY;
            case 15:
                return android.graphics.PorterDuff.Mode.SCREEN;
            case 16:
                return android.graphics.PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static boolean isLayoutRtl(android.view.View view) {
        return androidx.core.view.ViewCompat.getLayoutDirection(view) == 1;
    }

    public static float dpToPx(android.content.Context context, int i) {
        return android.util.TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static class RelativePadding {
        public int bottom;
        public int end;
        public int start;
        public int top;

        public RelativePadding(int i, int i2, int i3, int i4) {
            this.start = i;
            this.top = i2;
            this.end = i3;
            this.bottom = i4;
        }

        public RelativePadding(com.google.android.material.internal.ViewUtils.RelativePadding relativePadding) {
            this.start = relativePadding.start;
            this.top = relativePadding.top;
            this.end = relativePadding.end;
            this.bottom = relativePadding.bottom;
        }

        public void applyToView(android.view.View view) {
            androidx.core.view.ViewCompat.setPaddingRelative(view, this.start, this.top, this.end, this.bottom);
        }
    }

    public static void doOnApplyWindowInsets(android.view.View view, android.util.AttributeSet attributeSet, int i, int i2) {
        doOnApplyWindowInsets(view, attributeSet, i, i2, null);
    }

    public static void doOnApplyWindowInsets(android.view.View view, android.util.AttributeSet attributeSet, int i, int i2, final com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        android.content.res.TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, com.google.android.material.R.styleable.Insets, i, i2);
        final boolean z = obtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.Insets_paddingBottomSystemWindowInsets, false);
        final boolean z2 = obtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.Insets_paddingLeftSystemWindowInsets, false);
        final boolean z3 = obtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.Insets_paddingRightSystemWindowInsets, false);
        obtainStyledAttributes.recycle();
        doOnApplyWindowInsets(view, new com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener() { // from class: com.google.android.material.internal.ViewUtils.1
            @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
            public androidx.core.view.WindowInsetsCompat onApplyWindowInsets(android.view.View view2, androidx.core.view.WindowInsetsCompat windowInsetsCompat, com.google.android.material.internal.ViewUtils.RelativePadding relativePadding) {
                if (z) {
                    relativePadding.bottom += windowInsetsCompat.getSystemWindowInsetBottom();
                }
                boolean isLayoutRtl = com.google.android.material.internal.ViewUtils.isLayoutRtl(view2);
                if (z2) {
                    if (isLayoutRtl) {
                        relativePadding.end += windowInsetsCompat.getSystemWindowInsetLeft();
                    } else {
                        relativePadding.start += windowInsetsCompat.getSystemWindowInsetLeft();
                    }
                }
                if (z3) {
                    if (isLayoutRtl) {
                        relativePadding.start += windowInsetsCompat.getSystemWindowInsetRight();
                    } else {
                        relativePadding.end += windowInsetsCompat.getSystemWindowInsetRight();
                    }
                }
                relativePadding.applyToView(view2);
                com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener onApplyWindowInsetsListener2 = onApplyWindowInsetsListener;
                return onApplyWindowInsetsListener2 != null ? onApplyWindowInsetsListener2.onApplyWindowInsets(view2, windowInsetsCompat, relativePadding) : windowInsetsCompat;
            }
        });
    }

    public static void doOnApplyWindowInsets(android.view.View view, final com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        final com.google.android.material.internal.ViewUtils.RelativePadding relativePadding = new com.google.android.material.internal.ViewUtils.RelativePadding(androidx.core.view.ViewCompat.getPaddingStart(view), view.getPaddingTop(), androidx.core.view.ViewCompat.getPaddingEnd(view), view.getPaddingBottom());
        androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener(view, new androidx.core.view.OnApplyWindowInsetsListener() { // from class: com.google.android.material.internal.ViewUtils.2
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public androidx.core.view.WindowInsetsCompat onApplyWindowInsets(android.view.View view2, androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
                return com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener.this.onApplyWindowInsets(view2, windowInsetsCompat, new com.google.android.material.internal.ViewUtils.RelativePadding(relativePadding));
            }
        });
        requestApplyInsetsWhenAttached(view);
    }

    public static void requestApplyInsetsWhenAttached(android.view.View view) {
        if (androidx.core.view.ViewCompat.isAttachedToWindow(view)) {
            androidx.core.view.ViewCompat.requestApplyInsets(view);
        } else {
            view.addOnAttachStateChangeListener(new android.view.View.OnAttachStateChangeListener() { // from class: com.google.android.material.internal.ViewUtils.3
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(android.view.View view2) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(android.view.View view2) {
                    view2.removeOnAttachStateChangeListener(this);
                    androidx.core.view.ViewCompat.requestApplyInsets(view2);
                }
            });
        }
    }

    public static float getParentAbsoluteElevation(android.view.View view) {
        float f = 0.0f;
        for (android.view.ViewParent parent = view.getParent(); parent instanceof android.view.View; parent = parent.getParent()) {
            f += androidx.core.view.ViewCompat.getElevation((android.view.View) parent);
        }
        return f;
    }

    public static com.google.android.material.internal.ViewOverlayImpl getOverlay(android.view.View view) {
        if (view == null) {
            return null;
        }
        return new com.google.android.material.internal.ViewOverlayApi18(view);
    }

    public static android.view.ViewGroup getContentView(android.view.View view) {
        if (view == null) {
            return null;
        }
        android.view.View rootView = view.getRootView();
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) rootView.findViewById(android.R.id.content);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof android.view.ViewGroup)) {
            return null;
        }
        return (android.view.ViewGroup) rootView;
    }

    public static com.google.android.material.internal.ViewOverlayImpl getContentViewOverlay(android.view.View view) {
        return getOverlay(getContentView(view));
    }

    public static void addOnGlobalLayoutListener(android.view.View view, android.view.ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public static void removeOnGlobalLayoutListener(android.view.View view, android.view.ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            removeOnGlobalLayoutListener(view.getViewTreeObserver(), onGlobalLayoutListener);
        }
    }

    public static void removeOnGlobalLayoutListener(android.view.ViewTreeObserver viewTreeObserver, android.view.ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    public static java.lang.Integer getBackgroundColor(android.view.View view) {
        android.content.res.ColorStateList colorStateListOrNull = com.google.android.material.drawable.DrawableUtils.getColorStateListOrNull(view.getBackground());
        if (colorStateListOrNull != null) {
            return java.lang.Integer.valueOf(colorStateListOrNull.getDefaultColor());
        }
        return null;
    }
}
