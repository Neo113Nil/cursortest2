package com.google.android.material.appbar;

/* loaded from: classes8.dex */
abstract class HeaderBehavior<V extends android.view.View> extends com.google.android.material.appbar.ViewOffsetBehavior<V> {
    private static final int INVALID_POINTER = -1;
    private int activePointerId;
    private java.lang.Runnable flingRunnable;
    private boolean isBeingDragged;
    private int lastMotionY;
    android.widget.OverScroller scroller;
    private int touchSlop;
    private android.view.VelocityTracker velocityTracker;

    boolean canDragView(V v) {
        return false;
    }

    void onFlingFinished(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v) {
    }

    public HeaderBehavior() {
        this.activePointerId = -1;
        this.touchSlop = -1;
    }

    public HeaderBehavior(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.activePointerId = -1;
        this.touchSlop = -1;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, android.view.MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.touchSlop < 0) {
            this.touchSlop = android.view.ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.isBeingDragged) {
            int i = this.activePointerId;
            if (i == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(findPointerIndex);
            if (java.lang.Math.abs(y - this.lastMotionY) > this.touchSlop) {
                this.lastMotionY = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.activePointerId = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            boolean z = canDragView(v) && coordinatorLayout.isPointInChildBounds(v, x, y2);
            this.isBeingDragged = z;
            if (z) {
                this.lastMotionY = y2;
                this.activePointerId = motionEvent.getPointerId(0);
                ensureVelocityTracker();
                android.widget.OverScroller overScroller = this.scroller;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.scroller.abortAnimation();
                    return true;
                }
            }
        }
        android.view.VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, android.view.MotionEvent motionEvent) {
        boolean z;
        android.view.VelocityTracker velocityTracker;
        android.view.VelocityTracker velocityTracker2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            android.view.VelocityTracker velocityTracker3 = this.velocityTracker;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
                this.velocityTracker.computeCurrentVelocity(1000);
                fling(coordinatorLayout, v, -getScrollRangeForDragFling(v), 0, this.velocityTracker.getYVelocity(this.activePointerId));
                z = true;
                this.isBeingDragged = false;
                this.activePointerId = -1;
                velocityTracker = this.velocityTracker;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.velocityTracker = null;
                }
                velocityTracker2 = this.velocityTracker;
                if (velocityTracker2 != null) {
                }
                if (this.isBeingDragged) {
                }
            }
        } else {
            if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.activePointerId);
                if (findPointerIndex == -1) {
                    return false;
                }
                int y = (int) motionEvent.getY(findPointerIndex);
                int i = this.lastMotionY;
                this.lastMotionY = y;
                scroll(coordinatorLayout, v, i - y, getMaxDragOffset(v), 0);
            } else if (actionMasked != 3) {
                if (actionMasked == 6) {
                    int i2 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                    this.activePointerId = motionEvent.getPointerId(i2);
                    this.lastMotionY = (int) (motionEvent.getY(i2) + 0.5f);
                }
            }
            z = false;
            velocityTracker2 = this.velocityTracker;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            return !this.isBeingDragged || z;
        }
        z = false;
        this.isBeingDragged = false;
        this.activePointerId = -1;
        velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
        }
        velocityTracker2 = this.velocityTracker;
        if (velocityTracker2 != null) {
        }
        if (this.isBeingDragged) {
        }
    }

    int setHeaderTopBottomOffset(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, int i) {
        return setHeaderTopBottomOffset(coordinatorLayout, v, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    int setHeaderTopBottomOffset(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        int clamp;
        int topAndBottomOffset = getTopAndBottomOffset();
        if (i2 == 0 || topAndBottomOffset < i2 || topAndBottomOffset > i3 || topAndBottomOffset == (clamp = androidx.core.math.MathUtils.clamp(i, i2, i3))) {
            return 0;
        }
        setTopAndBottomOffset(clamp);
        return topAndBottomOffset - clamp;
    }

    int getTopBottomOffsetForScrollingSibling() {
        return getTopAndBottomOffset();
    }

    final int scroll(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        return setHeaderTopBottomOffset(coordinatorLayout, v, getTopBottomOffsetForScrollingSibling() - i, i2, i3);
    }

    final boolean fling(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, int i, int i2, float f) {
        java.lang.Runnable runnable = this.flingRunnable;
        if (runnable != null) {
            v.removeCallbacks(runnable);
            this.flingRunnable = null;
        }
        if (this.scroller == null) {
            this.scroller = new android.widget.OverScroller(v.getContext());
        }
        this.scroller.fling(0, getTopAndBottomOffset(), 0, java.lang.Math.round(f), 0, 0, i, i2);
        if (this.scroller.computeScrollOffset()) {
            com.google.android.material.appbar.HeaderBehavior.FlingRunnable flingRunnable = new com.google.android.material.appbar.HeaderBehavior.FlingRunnable(coordinatorLayout, v);
            this.flingRunnable = flingRunnable;
            androidx.core.view.ViewCompat.postOnAnimation(v, flingRunnable);
            return true;
        }
        onFlingFinished(coordinatorLayout, v);
        return false;
    }

    int getMaxDragOffset(V v) {
        return -v.getHeight();
    }

    int getScrollRangeForDragFling(V v) {
        return v.getHeight();
    }

    private void ensureVelocityTracker() {
        if (this.velocityTracker == null) {
            this.velocityTracker = android.view.VelocityTracker.obtain();
        }
    }

    class FlingRunnable implements java.lang.Runnable {
        private final V layout;
        private final androidx.coordinatorlayout.widget.CoordinatorLayout parent;

        FlingRunnable(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v) {
            this.parent = coordinatorLayout;
            this.layout = v;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.layout == null || com.google.android.material.appbar.HeaderBehavior.this.scroller == null) {
                return;
            }
            if (com.google.android.material.appbar.HeaderBehavior.this.scroller.computeScrollOffset()) {
                com.google.android.material.appbar.HeaderBehavior headerBehavior = com.google.android.material.appbar.HeaderBehavior.this;
                headerBehavior.setHeaderTopBottomOffset(this.parent, this.layout, headerBehavior.scroller.getCurrY());
                androidx.core.view.ViewCompat.postOnAnimation(this.layout, this);
                return;
            }
            com.google.android.material.appbar.HeaderBehavior.this.onFlingFinished(this.parent, this.layout);
        }
    }
}
