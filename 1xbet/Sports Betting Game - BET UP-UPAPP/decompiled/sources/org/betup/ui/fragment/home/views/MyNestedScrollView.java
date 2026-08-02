package org.betup.ui.fragment.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.core.widget.NestedScrollView;

/* loaded from: classes4.dex */
public class MyNestedScrollView extends NestedScrollView {
    private float lastX;
    private float lastY;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private OnScrollChangedListener mOnScrollChangedListener;
    private int slop;
    private float xDistance;
    private float yDistance;

    public interface OnScrollChangedListener {
        void onScrollChanged(NestedScrollView who, int l, int t, int oldl, int oldt);
    }

    public MyNestedScrollView(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        this.slop = ViewConfiguration.get(context).getScaledEdgeSlop();
    }

    public MyNestedScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public MyNestedScrollView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        ev.getX();
        ev.getY();
        int action = ev.getAction();
        if (action == 0) {
            this.yDistance = 0.0f;
            this.xDistance = 0.0f;
            this.lastX = ev.getX();
            this.lastY = ev.getY();
            computeScroll();
        } else if (action == 2) {
            float x = ev.getX();
            float y = ev.getY();
            this.xDistance += Math.abs(x - this.lastX);
            float abs = this.yDistance + Math.abs(y - this.lastY);
            this.yDistance = abs;
            this.lastX = x;
            this.lastY = y;
            if (this.xDistance > abs) {
                return false;
            }
        }
        return super.onInterceptTouchEvent(ev);
    }

    public void setOnScrollChangedListener(OnScrollChangedListener listener) {
        this.mOnScrollChangedListener = listener;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    protected void onScrollChanged(int l, int t, int oldl, int oldt) {
        super.onScrollChanged(l, t, oldl, oldt);
        OnScrollChangedListener onScrollChangedListener = this.mOnScrollChangedListener;
        if (onScrollChangedListener != null) {
            onScrollChangedListener.onScrollChanged(this, l, t, oldl, oldt);
        }
    }
}
