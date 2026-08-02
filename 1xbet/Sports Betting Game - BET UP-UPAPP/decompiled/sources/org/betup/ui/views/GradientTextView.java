package org.betup.ui.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.res.ResourcesCompat;
import org.betup.R;
import org.betup.utils.DimensionsUtil;
import org.betup.utils.FontManager;

/* loaded from: classes4.dex */
public class GradientTextView extends AppCompatTextView {
    private int centerColor;
    private LinearGradient currentGradient;
    private int gradientWidth;
    private int mainColor;
    private int outlineColor;
    private int outlineWidth;
    private String typeface;

    public GradientTextView(Context context) {
        super(context);
        init(null);
    }

    public GradientTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public GradientTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    protected void init(AttributeSet attrs) {
        if (attrs != null) {
            TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attrs, R.styleable.GradientTextView, 0, 0);
            this.centerColor = obtainStyledAttributes.getColor(0, -7829368);
            this.mainColor = obtainStyledAttributes.getColor(2, -1);
            this.outlineColor = obtainStyledAttributes.getColor(3, -16777216);
            this.outlineWidth = obtainStyledAttributes.getDimensionPixelSize(4, DimensionsUtil.getPixelsFromDp(getContext(), 1));
            this.gradientWidth = obtainStyledAttributes.getDimensionPixelSize(1, DimensionsUtil.getPixelsFromDp(getContext(), 4));
            this.typeface = obtainStyledAttributes.getString(5);
        }
        if (isInEditMode() || this.typeface == null) {
            return;
        }
        Typeface font = ResourcesCompat.getFont(getContext(), R.font.open_sans_bold);
        if (font != null) {
            setTypeface(font);
        } else {
            setTypeface(FontManager.getInstance().getFont(this.typeface));
        }
    }

    public int getCenterColor() {
        return this.centerColor;
    }

    public void setCenterColor(int centerColor) {
        this.centerColor = centerColor;
    }

    public int getMainColor() {
        return this.mainColor;
    }

    public void setMainColor(int mainColor) {
        this.mainColor = mainColor;
    }

    public int getOutlineColor() {
        return this.outlineColor;
    }

    public void setOutlineColor(int outlineColor) {
        this.outlineColor = outlineColor;
    }

    public int getOutlineWidth() {
        return this.outlineWidth;
    }

    public void setOutlineWidth(int outlineWidth) {
        this.outlineWidth = outlineWidth;
    }

    public int getGradientWidth() {
        return this.gradientWidth;
    }

    public void setGradientWidth(int gradientWidth) {
        this.gradientWidth = gradientWidth;
    }

    public void update() {
        float width = getWidth() / 2;
        float height = (getHeight() / 2) - this.gradientWidth;
        float width2 = getWidth() / 2;
        float height2 = (getHeight() / 2) + this.gradientWidth;
        int i = this.mainColor;
        this.currentGradient = new LinearGradient(width, height, width2, height2, new int[]{i, this.centerColor, i}, (float[]) null, Shader.TileMode.CLAMP);
        invalidate();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        if (changed) {
            float width = getWidth() / 2;
            float height = (getHeight() / 2) - this.gradientWidth;
            float width2 = getWidth() / 2;
            float height2 = (getHeight() / 2) + this.gradientWidth;
            int i = this.mainColor;
            this.currentGradient = new LinearGradient(width, height, width2, height2, new int[]{i, this.centerColor, i}, (float[]) null, Shader.TileMode.CLAMP);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        setTextColor(-1);
        setShadowLayer(this.outlineWidth, 0.0f, 0.0f, this.outlineColor);
        getPaint().setShader(null);
        for (int i = 0; i < 5; i++) {
            super.onDraw(canvas);
        }
        setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        getPaint().setShader(this.currentGradient);
        super.onDraw(canvas);
    }
}
