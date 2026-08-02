package androidx.viewpager.widget;

/* loaded from: classes7.dex */
public class PagerTabStrip extends androidx.viewpager.widget.PagerTitleStrip {
    private int CoroutineDebuggingKt;
    private final android.graphics.Rect coroutineBoundary;
    private boolean getInputFormats;
    private int getInputSizeshNQ4ISI;
    private boolean getOutputFormats;
    private boolean getOutputMinFrameDuration;
    private int getOutputMinFrameDurationlomOqCM;
    private int getOutputSizes;
    private float getOutputSizeshNQ4ISI;
    private float getOutputStallDuration;
    private int getOutputStallDurationlomOqCM;
    private int getValidOutputFormatsForInputhNQ4ISI;
    private int isOutputSupportedFor;
    private final android.graphics.Paint isOutputSupportedForhNQ4ISI;
    private int toString;
    private int unwrapAs;

    public PagerTabStrip(android.content.Context context) {
        this(context, null);
    }

    public PagerTabStrip(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.isOutputSupportedForhNQ4ISI = paint;
        this.coroutineBoundary = new android.graphics.Rect();
        this.isOutputSupportedFor = 255;
        this.getOutputMinFrameDuration = false;
        this.getInputFormats = false;
        int i = this.getHighSpeedVideoSizesFor;
        this.getOutputSizes = i;
        paint.setColor(i);
        float f = context.getResources().getDisplayMetrics().density;
        this.getOutputStallDurationlomOqCM = (int) ((3.0f * f) + 0.5f);
        this.getOutputMinFrameDurationlomOqCM = (int) ((6.0f * f) + 0.5f);
        this.toString = (int) (64.0f * f);
        this.getValidOutputFormatsForInputhNQ4ISI = (int) ((16.0f * f) + 0.5f);
        this.getInputSizeshNQ4ISI = (int) ((1.0f * f) + 0.5f);
        this.unwrapAs = (int) ((f * 32.0f) + 0.5f);
        this.CoroutineDebuggingKt = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setTextSpacing(getTextSpacing());
        setWillNotDraw(false);
        this.getHighSpeedVideoFpsRangesFor.setFocusable(true);
        this.getHighSpeedVideoFpsRangesFor.setOnClickListener(new android.view.View.OnClickListener() { // from class: androidx.viewpager.widget.PagerTabStrip.1
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                androidx.viewpager.widget.PagerTabStrip.this.Camera2StreamConfigurationMap.setCurrentItem(androidx.viewpager.widget.PagerTabStrip.this.Camera2StreamConfigurationMap.getCurrentItem() - 1);
            }
        });
        this.getHighResolutionOutputSizeshNQ4ISI.setFocusable(true);
        this.getHighResolutionOutputSizeshNQ4ISI.setOnClickListener(new android.view.View.OnClickListener() { // from class: androidx.viewpager.widget.PagerTabStrip.2
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                androidx.viewpager.widget.PagerTabStrip.this.Camera2StreamConfigurationMap.setCurrentItem(androidx.viewpager.widget.PagerTabStrip.this.Camera2StreamConfigurationMap.getCurrentItem() + 1);
            }
        });
        if (getBackground() == null) {
            this.getOutputMinFrameDuration = true;
        }
    }

    public void setTabIndicatorColor(int i) {
        this.getOutputSizes = i;
        this.isOutputSupportedForhNQ4ISI.setColor(i);
        invalidate();
    }

    public void setTabIndicatorColorResource(int i) {
        setTabIndicatorColor(androidx.core.content.ContextCompat.getColor(getContext(), i));
    }

    public int getTabIndicatorColor() {
        return this.getOutputSizes;
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        int i5 = this.getOutputMinFrameDurationlomOqCM;
        if (i4 < i5) {
            i4 = i5;
        }
        super.setPadding(i, i2, i3, i4);
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public void setTextSpacing(int i) {
        int i2 = this.toString;
        if (i < i2) {
            i = i2;
        }
        super.setTextSpacing(i);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.getInputFormats) {
            return;
        }
        this.getOutputMinFrameDuration = drawable == null;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
        if (this.getInputFormats) {
            return;
        }
        this.getOutputMinFrameDuration = (i & (-16777216)) == 0;
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.getInputFormats) {
            return;
        }
        this.getOutputMinFrameDuration = i == 0;
    }

    public void setDrawFullUnderline(boolean z) {
        this.getOutputMinFrameDuration = z;
        this.getInputFormats = true;
        invalidate();
    }

    public boolean getDrawFullUnderline() {
        return this.getOutputMinFrameDuration;
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    final int getHighSpeedVideoSizes() {
        return java.lang.Math.max(super.getHighSpeedVideoSizes(), this.unwrapAs);
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && this.getOutputFormats) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (action == 0) {
            this.getOutputStallDuration = x;
            this.getOutputSizeshNQ4ISI = y;
            this.getOutputFormats = false;
        } else if (action != 1) {
            if (action == 2 && (java.lang.Math.abs(x - this.getOutputStallDuration) > this.CoroutineDebuggingKt || java.lang.Math.abs(y - this.getOutputSizeshNQ4ISI) > this.CoroutineDebuggingKt)) {
                this.getOutputFormats = true;
            }
        } else if (x < this.getHighSpeedVideoSizes.getLeft() - this.getValidOutputFormatsForInputhNQ4ISI) {
            this.Camera2StreamConfigurationMap.setCurrentItem(this.Camera2StreamConfigurationMap.getCurrentItem() - 1);
        } else if (x > this.getHighSpeedVideoSizes.getRight() + this.getValidOutputFormatsForInputhNQ4ISI) {
            this.Camera2StreamConfigurationMap.setCurrentItem(this.Camera2StreamConfigurationMap.getCurrentItem() + 1);
        }
        return true;
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int left = this.getHighSpeedVideoSizes.getLeft();
        int i = this.getValidOutputFormatsForInputhNQ4ISI;
        int right = this.getHighSpeedVideoSizes.getRight();
        int i2 = this.getValidOutputFormatsForInputhNQ4ISI;
        int i3 = this.getOutputStallDurationlomOqCM;
        this.isOutputSupportedForhNQ4ISI.setColor((this.isOutputSupportedFor << 24) | (this.getOutputSizes & 16777215));
        float f = height;
        canvas.drawRect(left - i, height - i3, right + i2, f, this.isOutputSupportedForhNQ4ISI);
        if (this.getOutputMinFrameDuration) {
            this.isOutputSupportedForhNQ4ISI.setColor((this.getOutputSizes & 16777215) | (-16777216));
            canvas.drawRect(getPaddingLeft(), height - this.getInputSizeshNQ4ISI, getWidth() - getPaddingRight(), f, this.isOutputSupportedForhNQ4ISI);
        }
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    final void Camera2StreamConfigurationMap(int i, float f, boolean z) {
        android.graphics.Rect rect = this.coroutineBoundary;
        int height = getHeight();
        int left = this.getHighSpeedVideoSizes.getLeft();
        int i2 = this.getValidOutputFormatsForInputhNQ4ISI;
        int right = this.getHighSpeedVideoSizes.getRight();
        int i3 = this.getValidOutputFormatsForInputhNQ4ISI;
        int i4 = height - this.getOutputStallDurationlomOqCM;
        rect.set(left - i2, i4, right + i3, height);
        super.Camera2StreamConfigurationMap(i, f, z);
        this.isOutputSupportedFor = (int) (java.lang.Math.abs(f - 0.5f) * 2.0f * 255.0f);
        rect.union(this.getHighSpeedVideoSizes.getLeft() - this.getValidOutputFormatsForInputhNQ4ISI, i4, this.getHighSpeedVideoSizes.getRight() + this.getValidOutputFormatsForInputhNQ4ISI, height);
        invalidate(rect);
    }
}
