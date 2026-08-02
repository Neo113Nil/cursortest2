package org.betup.ui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

/* loaded from: classes4.dex */
public class StaticViewPager extends ViewPager {
    private boolean enabledSwipe;

    public StaticViewPager(Context context) {
        super(context);
    }

    public StaticViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent event) {
        if (this.enabledSwipe) {
            return super.onInterceptTouchEvent(event);
        }
        return false;
    }

    public boolean isEnabledSwipe() {
        return this.enabledSwipe;
    }

    public void setEnabledSwipe(boolean enabledSwipe) {
        this.enabledSwipe = enabledSwipe;
    }
}
