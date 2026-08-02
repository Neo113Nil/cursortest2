package org.betup.ui.fragment.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* loaded from: classes4.dex */
public class PassiveTouchLayout extends LinearLayout {
    public PassiveTouchLayout(Context context) {
        super(context);
    }

    public PassiveTouchLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public PassiveTouchLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override // android.view.View
    public void setPressed(boolean pressed) {
        super.setPressed(pressed);
    }
}
