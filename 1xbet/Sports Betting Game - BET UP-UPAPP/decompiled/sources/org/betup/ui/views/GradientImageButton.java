package org.betup.ui.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.betup.R;
import org.betup.utils.DimensionsUtil;
import org.betup.utils.TouchHelper;

/* loaded from: classes4.dex */
public class GradientImageButton extends LinearLayout implements View.OnTouchListener {
    private boolean active;
    private ImageView icon;
    private int iconRes;
    private int outlineColor;
    private int outlineWidth;
    private String text;
    private int textColor;
    private GradientTextView title;

    public GradientImageButton(Context context) {
        super(context);
        init(null);
    }

    public GradientImageButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public GradientImageButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    public void setIconResource(int iconRes) {
        if (iconRes != 0) {
            this.iconRes = iconRes;
            this.icon.setVisibility(0);
            this.icon.setImageResource(iconRes);
            return;
        }
        this.icon.setVisibility(8);
    }

    public void setTitle(String text) {
        this.text = text;
        this.title.setText(text);
    }

    public boolean isActive() {
        return this.active;
    }

    public void setActive(boolean active) {
        this.active = active;
        if (active) {
            setAlpha(1.0f);
        } else {
            setAlpha(0.5f);
        }
    }

    protected void init(AttributeSet attrs) {
        this.active = true;
        this.textColor = -1;
        this.outlineColor = -16777216;
        this.outlineWidth = DimensionsUtil.getPixelsFromDp(getContext(), 2);
        this.iconRes = 0;
        if (attrs != null) {
            TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attrs, R.styleable.GradientImageButton, 0, 0);
            this.text = obtainStyledAttributes.getString(1);
            this.textColor = obtainStyledAttributes.getColor(2, this.textColor);
            this.outlineColor = obtainStyledAttributes.getColor(3, this.outlineColor);
            this.outlineWidth = obtainStyledAttributes.getDimensionPixelSize(4, this.outlineWidth);
            this.iconRes = obtainStyledAttributes.getResourceId(0, this.iconRes);
        }
        setOrientation(0);
        View inflate = ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.gradient_image_button, (ViewGroup) this, false);
        addView(inflate);
        this.icon = (ImageView) inflate.findViewById(R.id.icon);
        this.title = (GradientTextView) inflate.findViewById(R.id.title);
        setIconResource(this.iconRes);
        this.title.setMainColor(this.textColor);
        this.title.setCenterColor(this.textColor);
        this.title.setGradientWidth(0);
        this.title.setOutlineColor(this.outlineColor);
        this.title.setOutlineWidth(this.outlineWidth);
        this.title.setText(this.text);
        setOnTouchListener(this);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View v, MotionEvent event) {
        if (!isActive()) {
            return false;
        }
        int action = event.getAction();
        if (action == 0) {
            setAlpha(0.7f);
        } else if (action == 1) {
            setAlpha(1.0f);
            if (TouchHelper.isTouchWithinBounds(event, v)) {
                performClick();
            }
        } else if (action == 3) {
            setAlpha(1.0f);
        }
        return true;
    }
}
