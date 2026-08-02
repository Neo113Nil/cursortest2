package com.google.android.material.bottomsheet;

/* loaded from: classes8.dex */
public class BottomSheetDragHandleView extends androidx.appcompat.widget.AppCompatImageView implements android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener {
    private static final int DEF_STYLE_RES = com.google.android.material.R.style.Widget_Material3_BottomSheet_DragHandle;
    private final android.view.accessibility.AccessibilityManager accessibilityManager;
    private boolean accessibilityServiceEnabled;
    private com.google.android.material.bottomsheet.BottomSheetBehavior<?> bottomSheetBehavior;
    private final com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback bottomSheetCallback;
    private final java.lang.String clickFeedback;
    private final java.lang.String clickToCollapseActionLabel;
    private boolean clickToExpand;
    private final java.lang.String clickToExpandActionLabel;
    private boolean interactable;

    public BottomSheetDragHandleView(android.content.Context context) {
        this(context, null);
    }

    public BottomSheetDragHandleView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.bottomSheetDragHandleStyle);
    }

    public BottomSheetDragHandleView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(context, attributeSet, i, DEF_STYLE_RES), attributeSet, i);
        this.clickToExpandActionLabel = getResources().getString(com.google.android.material.R.string.bottomsheet_action_expand);
        this.clickToCollapseActionLabel = getResources().getString(com.google.android.material.R.string.bottomsheet_action_collapse);
        this.clickFeedback = getResources().getString(com.google.android.material.R.string.bottomsheet_drag_handle_clicked);
        this.bottomSheetCallback = new com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback() { // from class: com.google.android.material.bottomsheet.BottomSheetDragHandleView.1
            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public void onSlide(android.view.View view, float f) {
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public void onStateChanged(android.view.View view, int i2) {
                com.google.android.material.bottomsheet.BottomSheetDragHandleView.this.onBottomSheetStateChanged(i2);
            }
        };
        this.accessibilityManager = (android.view.accessibility.AccessibilityManager) getContext().getSystemService("accessibility");
        updateInteractableState();
        androidx.core.view.ViewCompat.setAccessibilityDelegate(this, new androidx.core.view.AccessibilityDelegateCompat() { // from class: com.google.android.material.bottomsheet.BottomSheetDragHandleView.2
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onPopulateAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
                if (accessibilityEvent.getEventType() == 1) {
                    com.google.android.material.bottomsheet.BottomSheetDragHandleView.this.expandOrCollapseBottomSheetIfPossible();
                }
            }
        });
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        setBottomSheetBehavior(findParentBottomSheetBehavior());
        android.view.accessibility.AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager != null) {
            accessibilityManager.addAccessibilityStateChangeListener(this);
            onAccessibilityStateChanged(this.accessibilityManager.isEnabled());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        android.view.accessibility.AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager != null) {
            accessibilityManager.removeAccessibilityStateChangeListener(this);
        }
        setBottomSheetBehavior(null);
        super.onDetachedFromWindow();
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public void onAccessibilityStateChanged(boolean z) {
        this.accessibilityServiceEnabled = z;
        updateInteractableState();
    }

    private void setBottomSheetBehavior(com.google.android.material.bottomsheet.BottomSheetBehavior<?> bottomSheetBehavior) {
        com.google.android.material.bottomsheet.BottomSheetBehavior<?> bottomSheetBehavior2 = this.bottomSheetBehavior;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.removeBottomSheetCallback(this.bottomSheetCallback);
            this.bottomSheetBehavior.setAccessibilityDelegateView(null);
        }
        this.bottomSheetBehavior = bottomSheetBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.setAccessibilityDelegateView(this);
            onBottomSheetStateChanged(this.bottomSheetBehavior.getState());
            this.bottomSheetBehavior.addBottomSheetCallback(this.bottomSheetCallback);
        }
        updateInteractableState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onBottomSheetStateChanged(int i) {
        if (i == 4) {
            this.clickToExpand = true;
        } else if (i == 3) {
            this.clickToExpand = false;
        }
        androidx.core.view.ViewCompat.replaceAccessibilityAction(this, androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK, this.clickToExpand ? this.clickToExpandActionLabel : this.clickToCollapseActionLabel, new androidx.core.view.accessibility.AccessibilityViewCommand() { // from class: com.google.android.material.bottomsheet.BottomSheetDragHandleView$$ExternalSyntheticLambda0
            @Override // androidx.core.view.accessibility.AccessibilityViewCommand
            public final boolean perform(android.view.View view, androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments commandArguments) {
                return com.google.android.material.bottomsheet.BottomSheetDragHandleView.this.m10216xa7b4c95f(view, commandArguments);
            }
        });
    }

    /* renamed from: lambda$onBottomSheetStateChanged$0$com-google-android-material-bottomsheet-BottomSheetDragHandleView, reason: not valid java name */
    /* synthetic */ boolean m10216xa7b4c95f(android.view.View view, androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments commandArguments) {
        return expandOrCollapseBottomSheetIfPossible();
    }

    private void updateInteractableState() {
        this.interactable = this.accessibilityServiceEnabled && this.bottomSheetBehavior != null;
        androidx.core.view.ViewCompat.setImportantForAccessibility(this, this.bottomSheetBehavior == null ? 2 : 1);
        setClickable(this.interactable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        if (r1 != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        r3 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
    
        if (r1 != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
    
        if (r6.clickToExpand == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean expandOrCollapseBottomSheetIfPossible() {
        boolean z = false;
        if (!this.interactable) {
            return false;
        }
        announceAccessibilityEvent(this.clickFeedback);
        if (!this.bottomSheetBehavior.isFitToContents() && !this.bottomSheetBehavior.shouldSkipHalfExpandedStateWhenDragging()) {
            z = true;
        }
        int state = this.bottomSheetBehavior.getState();
        int i = 6;
        if (state != 4) {
            if (state == 3) {
            }
            i = 4;
            this.bottomSheetBehavior.setState(i);
            return true;
        }
    }

    private void announceAccessibilityEvent(java.lang.String str) {
        if (this.accessibilityManager == null) {
            return;
        }
        android.view.accessibility.AccessibilityEvent obtain = android.view.accessibility.AccessibilityEvent.obtain(16384);
        obtain.getText().add(str);
        this.accessibilityManager.sendAccessibilityEvent(obtain);
    }

    private com.google.android.material.bottomsheet.BottomSheetBehavior<?> findParentBottomSheetBehavior() {
        android.view.View view = this;
        while (true) {
            view = getParentView(view);
            if (view == null) {
                return null;
            }
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) {
                androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior = ((androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
                if (behavior instanceof com.google.android.material.bottomsheet.BottomSheetBehavior) {
                    return (com.google.android.material.bottomsheet.BottomSheetBehavior) behavior;
                }
            }
        }
    }

    private static android.view.View getParentView(android.view.View view) {
        java.lang.Object parent = view.getParent();
        if (parent instanceof android.view.View) {
            return (android.view.View) parent;
        }
        return null;
    }
}
