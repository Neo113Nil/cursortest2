package org.betup.ui.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import org.betup.R;
import org.betup.utils.TouchHelper;

/* loaded from: classes4.dex */
public class AlphaPressButton extends LinearLayout implements View.OnTouchListener {
    protected static final float ACTIVE_ALPHA = 1.0f;
    protected static final float INACTIVE_ALPHA = 0.4f;
    private boolean clickableWhenDisabled;
    private boolean isActive;

    public AlphaPressButton(Context context) {
        super(context);
        this.isActive = true;
        this.clickableWhenDisabled = true;
        init(null);
        setOnTouchListener(this);
    }

    public AlphaPressButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.isActive = true;
        this.clickableWhenDisabled = true;
        init(attrs);
        setOnTouchListener(this);
    }

    public AlphaPressButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.isActive = true;
        this.clickableWhenDisabled = true;
        init(attrs);
        setOnTouchListener(this);
    }

    public boolean isActive() {
        return this.isActive;
    }

    public void setActive(boolean active) {
        this.isActive = active;
        if (!active) {
            setAlpha(0.4f);
        } else {
            setAlpha(1.0f);
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View v, MotionEvent event) {
        int action = event.getAction();
        if (action == 0) {
            setAlpha(0.4f);
        } else if (action == 1) {
            setAlpha(this.isActive ? 1.0f : 0.4f);
            if (TouchHelper.isTouchWithinBounds(event, v) && (this.clickableWhenDisabled || this.isActive)) {
                performClick();
            }
        } else if (action == 3) {
            setAlpha(this.isActive ? 1.0f : 0.4f);
        }
        return true;
    }

    private void init(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.AlphaPressButton);
            this.clickableWhenDisabled = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }
    }
}
