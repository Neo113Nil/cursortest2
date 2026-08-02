package com.google.android.material.sidesheet;

/* loaded from: classes8.dex */
abstract class SheetDialog<C extends com.google.android.material.sidesheet.SheetCallback> extends androidx.appcompat.app.AppCompatDialog {
    private static final int COORDINATOR_LAYOUT_ID = com.google.android.material.R.id.coordinator;
    private static final int TOUCH_OUTSIDE_ID = com.google.android.material.R.id.touch_outside;
    private com.google.android.material.motion.MaterialBackOrchestrator backOrchestrator;
    private com.google.android.material.sidesheet.Sheet<C> behavior;
    boolean cancelable;
    private boolean canceledOnTouchOutside;
    private boolean canceledOnTouchOutsideSet;
    private android.widget.FrameLayout container;
    boolean dismissWithAnimation;
    private android.widget.FrameLayout sheet;

    abstract void addSheetCancelOnHideCallback(com.google.android.material.sidesheet.Sheet<C> sheet);

    abstract com.google.android.material.sidesheet.Sheet<C> getBehaviorFromSheet(android.widget.FrameLayout frameLayout);

    abstract int getDialogId();

    abstract int getLayoutResId();

    abstract int getStateOnStart();

    SheetDialog(android.content.Context context, int i, int i2, int i3) {
        super(context, getThemeResId(context, i, i2, i3));
        this.cancelable = true;
        this.canceledOnTouchOutside = true;
        supportRequestWindowFeature(1);
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.view.ComponentDialog, android.app.Dialog
    public void setContentView(int i) {
        super.setContentView(wrapInSheet(i, null, null));
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.view.ComponentDialog, android.app.Dialog
    public void setContentView(android.view.View view) {
        super.setContentView(wrapInSheet(0, view, null));
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.view.ComponentDialog, android.app.Dialog
    public void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        super.setContentView(wrapInSheet(0, view, layoutParams));
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.view.ComponentDialog, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.view.Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.cancelable != z) {
            this.cancelable = z;
        }
        if (getWindow() != null) {
            updateListeningForBackCallbacks();
        }
    }

    private void updateListeningForBackCallbacks() {
        com.google.android.material.motion.MaterialBackOrchestrator materialBackOrchestrator = this.backOrchestrator;
        if (materialBackOrchestrator == null) {
            return;
        }
        if (this.cancelable) {
            materialBackOrchestrator.startListeningForBackCallbacks();
        } else {
            materialBackOrchestrator.stopListeningForBackCallbacks();
        }
    }

    @Override // androidx.view.ComponentDialog, android.app.Dialog
    public void onStart() {
        super.onStart();
        com.google.android.material.sidesheet.Sheet<C> sheet = this.behavior;
        if (sheet == null || sheet.getState() != 5) {
            return;
        }
        this.behavior.setState(getStateOnStart());
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        maybeUpdateWindowAnimationsBasedOnLayoutDirection();
        updateListeningForBackCallbacks();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.google.android.material.motion.MaterialBackOrchestrator materialBackOrchestrator = this.backOrchestrator;
        if (materialBackOrchestrator != null) {
            materialBackOrchestrator.stopListeningForBackCallbacks();
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        com.google.android.material.sidesheet.Sheet<C> behavior = getBehavior();
        if (!this.dismissWithAnimation || behavior.getState() == 5) {
            super.cancel();
        } else {
            behavior.setState(5);
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.cancelable) {
            this.cancelable = true;
        }
        this.canceledOnTouchOutside = z;
        this.canceledOnTouchOutsideSet = true;
    }

    public void setDismissWithSheetAnimationEnabled(boolean z) {
        this.dismissWithAnimation = z;
    }

    public boolean isDismissWithSheetAnimationEnabled() {
        return this.dismissWithAnimation;
    }

    private void ensureContainerAndBehavior() {
        if (this.container == null) {
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) android.view.View.inflate(getContext(), getLayoutResId(), null);
            this.container = frameLayout;
            android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) frameLayout.findViewById(getDialogId());
            this.sheet = frameLayout2;
            com.google.android.material.sidesheet.Sheet<C> behaviorFromSheet = getBehaviorFromSheet(frameLayout2);
            this.behavior = behaviorFromSheet;
            addSheetCancelOnHideCallback(behaviorFromSheet);
            this.backOrchestrator = new com.google.android.material.motion.MaterialBackOrchestrator(this.behavior, this.sheet);
        }
    }

    private android.widget.FrameLayout getContainer() {
        if (this.container == null) {
            ensureContainerAndBehavior();
        }
        return this.container;
    }

    private android.widget.FrameLayout getSheet() {
        if (this.sheet == null) {
            ensureContainerAndBehavior();
        }
        return this.sheet;
    }

    com.google.android.material.sidesheet.Sheet<C> getBehavior() {
        if (this.behavior == null) {
            ensureContainerAndBehavior();
        }
        return this.behavior;
    }

    private android.view.View wrapInSheet(int i, android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        ensureContainerAndBehavior();
        androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout = (androidx.coordinatorlayout.widget.CoordinatorLayout) getContainer().findViewById(COORDINATOR_LAYOUT_ID);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (android.view.ViewGroup) coordinatorLayout, false);
        }
        android.widget.FrameLayout sheet = getSheet();
        sheet.removeAllViews();
        if (layoutParams == null) {
            sheet.addView(view);
        } else {
            sheet.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(TOUCH_OUTSIDE_ID).setOnClickListener(new android.view.View.OnClickListener() { // from class: com.google.android.material.sidesheet.SheetDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                com.google.android.material.sidesheet.SheetDialog.this.m10283x401f75dd(view2);
            }
        });
        androidx.core.view.ViewCompat.setAccessibilityDelegate(getSheet(), new androidx.core.view.AccessibilityDelegateCompat() { // from class: com.google.android.material.sidesheet.SheetDialog.1
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(android.view.View view2, androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfoCompat);
                if (com.google.android.material.sidesheet.SheetDialog.this.cancelable) {
                    accessibilityNodeInfoCompat.addAction(1048576);
                    accessibilityNodeInfoCompat.setDismissable(true);
                } else {
                    accessibilityNodeInfoCompat.setDismissable(false);
                }
            }

            @Override // androidx.core.view.AccessibilityDelegateCompat
            public boolean performAccessibilityAction(android.view.View view2, int i2, android.os.Bundle bundle) {
                if (i2 == 1048576 && com.google.android.material.sidesheet.SheetDialog.this.cancelable) {
                    com.google.android.material.sidesheet.SheetDialog.this.cancel();
                    return true;
                }
                return super.performAccessibilityAction(view2, i2, bundle);
            }
        });
        return this.container;
    }

    /* renamed from: lambda$wrapInSheet$0$com-google-android-material-sidesheet-SheetDialog, reason: not valid java name */
    /* synthetic */ void m10283x401f75dd(android.view.View view) {
        if (this.cancelable && isShowing() && shouldWindowCloseOnTouchOutside()) {
            cancel();
        }
    }

    public void setSheetEdge(int i) {
        android.widget.FrameLayout frameLayout = this.sheet;
        if (frameLayout == null) {
            throw new java.lang.IllegalStateException("Sheet view reference is null; sheet edge cannot be changed if the sheet view is null.");
        }
        if (androidx.core.view.ViewCompat.isLaidOut(frameLayout)) {
            throw new java.lang.IllegalStateException("Sheet view has been laid out; sheet edge cannot be changed once the sheet has been laid out.");
        }
        android.view.ViewGroup.LayoutParams layoutParams = this.sheet.getLayoutParams();
        if (layoutParams instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) {
            ((androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) layoutParams).gravity = i;
            maybeUpdateWindowAnimationsBasedOnLayoutDirection();
        }
    }

    private void maybeUpdateWindowAnimationsBasedOnLayoutDirection() {
        android.widget.FrameLayout frameLayout;
        int i;
        android.view.Window window = getWindow();
        if (window == null || (frameLayout = this.sheet) == null || !(frameLayout.getLayoutParams() instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams)) {
            return;
        }
        if (androidx.core.view.GravityCompat.getAbsoluteGravity(((androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) this.sheet.getLayoutParams()).gravity, androidx.core.view.ViewCompat.getLayoutDirection(this.sheet)) == 3) {
            i = com.google.android.material.R.style.Animation_Material3_SideSheetDialog_Left;
        } else {
            i = com.google.android.material.R.style.Animation_Material3_SideSheetDialog_Right;
        }
        window.setWindowAnimations(i);
    }

    private boolean shouldWindowCloseOnTouchOutside() {
        if (!this.canceledOnTouchOutsideSet) {
            android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{android.R.attr.windowCloseOnTouchOutside});
            this.canceledOnTouchOutside = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
            this.canceledOnTouchOutsideSet = true;
        }
        return this.canceledOnTouchOutside;
    }

    private static int getThemeResId(android.content.Context context, int i, int i2, int i3) {
        if (i != 0) {
            return i;
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        return context.getTheme().resolveAttribute(i2, typedValue, true) ? typedValue.resourceId : i3;
    }
}
