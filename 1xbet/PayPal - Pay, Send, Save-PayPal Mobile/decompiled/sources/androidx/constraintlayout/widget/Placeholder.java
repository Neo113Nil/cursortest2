package androidx.constraintlayout.widget;

/* loaded from: classes7.dex */
public class Placeholder extends android.view.View {
    private int getHighResolutionOutputSizeshNQ4ISI;
    private android.view.View getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoSizes;

    public Placeholder(android.content.Context context) {
        super(context);
        this.getHighSpeedVideoSizes = -1;
        this.getHighSpeedVideoFpsRanges = null;
        this.getHighResolutionOutputSizeshNQ4ISI = 4;
        getHighResolutionOutputSizeshNQ4ISI(null);
    }

    public Placeholder(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.getHighSpeedVideoSizes = -1;
        this.getHighSpeedVideoFpsRanges = null;
        this.getHighResolutionOutputSizeshNQ4ISI = 4;
        getHighResolutionOutputSizeshNQ4ISI(attributeSet);
    }

    public Placeholder(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.getHighSpeedVideoSizes = -1;
        this.getHighSpeedVideoFpsRanges = null;
        this.getHighResolutionOutputSizeshNQ4ISI = 4;
        getHighResolutionOutputSizeshNQ4ISI(attributeSet);
    }

    public Placeholder(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.getHighSpeedVideoSizes = -1;
        this.getHighSpeedVideoFpsRanges = null;
        this.getHighResolutionOutputSizeshNQ4ISI = 4;
        getHighResolutionOutputSizeshNQ4ISI(attributeSet);
    }

    private void getHighResolutionOutputSizeshNQ4ISI(android.util.AttributeSet attributeSet) {
        super.setVisibility(this.getHighResolutionOutputSizeshNQ4ISI);
        this.getHighSpeedVideoSizes = -1;
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.R.styleable.ConstraintLayout_placeholder);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_placeholder_content) {
                    this.getHighSpeedVideoSizes = obtainStyledAttributes.getResourceId(index, this.getHighSpeedVideoSizes);
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_placeholder_placeholder_emptyVisibility) {
                    this.getHighResolutionOutputSizeshNQ4ISI = obtainStyledAttributes.getInt(index, this.getHighResolutionOutputSizeshNQ4ISI);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public int getEmptyVisibility() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public void setEmptyVisibility(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    public android.view.View getContent() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
            android.graphics.Paint paint = new android.graphics.Paint();
            paint.setARGB(255, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE);
            paint.setTextAlign(android.graphics.Paint.Align.CENTER);
            paint.setTypeface(android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, 0));
            android.graphics.Rect rect = new android.graphics.Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(android.graphics.Paint.Align.LEFT);
            paint.getTextBounds(com.datadog.android.core.internal.CoreFeature.DEFAULT_APP_VERSION, 0, 1, rect);
            canvas.drawText(com.datadog.android.core.internal.CoreFeature.DEFAULT_APP_VERSION, ((width / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((height / 2.0f) + (rect.height() / 2.0f)) - rect.bottom, paint);
        }
    }

    public void updatePreLayout(androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
        if (this.getHighSpeedVideoSizes == -1 && !isInEditMode()) {
            setVisibility(this.getHighResolutionOutputSizeshNQ4ISI);
        }
        android.view.View findViewById = constraintLayout.findViewById(this.getHighSpeedVideoSizes);
        this.getHighSpeedVideoFpsRanges = findViewById;
        if (findViewById != null) {
            ((androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) findViewById.getLayoutParams()).getInputFormats = true;
            this.getHighSpeedVideoFpsRanges.setVisibility(0);
            setVisibility(0);
        }
    }

    public void setContentId(int i) {
        android.view.View findViewById;
        if (this.getHighSpeedVideoSizes != i) {
            android.view.View view = this.getHighSpeedVideoFpsRanges;
            if (view != null) {
                view.setVisibility(0);
                ((androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) this.getHighSpeedVideoFpsRanges.getLayoutParams()).getInputFormats = false;
                this.getHighSpeedVideoFpsRanges = null;
            }
            this.getHighSpeedVideoSizes = i;
            if (i == -1 || (findViewById = ((android.view.View) getParent()).findViewById(i)) == null) {
                return;
            }
            findViewById.setVisibility(8);
        }
    }

    public void updatePostMeasure(androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
        if (this.getHighSpeedVideoFpsRanges == null) {
            return;
        }
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) getLayoutParams();
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams2 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) this.getHighSpeedVideoFpsRanges.getLayoutParams();
        layoutParams2.coroutineCreation.setVisibility(0);
        if (layoutParams.coroutineCreation.getHorizontalDimensionBehaviour() != androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED) {
            layoutParams.coroutineCreation.setWidth(layoutParams2.coroutineCreation.getWidth());
        }
        if (layoutParams.coroutineCreation.getVerticalDimensionBehaviour() != androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED) {
            layoutParams.coroutineCreation.setHeight(layoutParams2.coroutineCreation.getHeight());
        }
        layoutParams2.coroutineCreation.setVisibility(8);
    }
}
