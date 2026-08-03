package com.helpshift.proactive;

/* loaded from: classes5.dex */
public class GifView extends android.view.View {
    private final java.lang.String TAG;
    private float aspectRatio;
    private float[] mRadii;
    private android.graphics.Movie movie;
    private long movieStart;
    private com.helpshift.proactive.GifView.ScaleType scaleType;
    private float scaleX;
    private float scaleY;
    private android.graphics.Paint strokePaint;

    public enum ScaleType {
        CENTER_CROP,
        FIT_CENTER,
        FIT_XY
    }

    public GifView(android.content.Context context) {
        super(context);
        this.mRadii = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.movieStart = 0L;
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.scaleType = com.helpshift.proactive.GifView.ScaleType.CENTER_CROP;
        this.aspectRatio = 1.0f;
        this.TAG = "GifView";
    }

    public void setAspectRatio(float f) {
        this.aspectRatio = f;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int width = this.movie.width();
        int height = this.movie.height();
        float f = this.aspectRatio;
        int mode = android.view.View.MeasureSpec.getMode(i);
        int size = android.view.View.MeasureSpec.getSize(i);
        int mode2 = android.view.View.MeasureSpec.getMode(i2);
        int size2 = android.view.View.MeasureSpec.getSize(i2);
        if (mode == 1073741824 || mode == Integer.MIN_VALUE) {
            height = (int) (size / f);
            width = size;
        } else if (mode2 == 1073741824 || mode2 == Integer.MIN_VALUE) {
            height = size2;
        }
        setMeasuredDimension(width, height);
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        try {
            if (this.movie == null) {
                return;
            }
            float width = getWidth();
            float height = getHeight();
            float width2 = this.movie.width();
            float height2 = this.movie.height();
            int currentTimeMillis = (int) ((java.lang.System.currentTimeMillis() - this.movieStart) % java.lang.Math.max(this.movie.duration(), 1000));
            int save = canvas.save();
            com.helpshift.proactive.InAppViewUtil.clipCanvasToRoundedRect(canvas, this.mRadii, width, height);
            applyScaleAndTranslate(canvas, width, height, width2, height2);
            this.movie.setTime(currentTimeMillis);
            this.movie.draw(canvas, 0.0f, 0.0f);
            com.helpshift.proactive.InAppViewUtil.addStrokeToCanvas(canvas, this.strokePaint, width, height, 0);
            canvas.restoreToCount(save);
            postInvalidateOnAnimation();
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e("GifView", "Error in drawing canvas in GifView", e);
        }
    }

    public void setCornerRadius(float[] fArr) {
        this.mRadii = fArr;
    }

    public void setGif(java.io.File file) throws java.io.FileNotFoundException {
        this.movie = android.graphics.Movie.decodeStream(new java.io.FileInputStream(file));
    }

    private void applyScaleAndTranslate(android.graphics.Canvas canvas, float f, float f2, float f3, float f4) {
        float f5;
        float f6 = 0.0f;
        if (f3 <= 0.0f || f4 <= 0.0f || f <= 0.0f || f2 <= 0.0f) {
            return;
        }
        float f7 = f / f3;
        float f8 = f2 / f4;
        float min = java.lang.Math.min(f7, f8);
        float max = java.lang.Math.max(f7, f8);
        int i = com.helpshift.proactive.GifView.AnonymousClass1.$SwitchMap$com$helpshift$proactive$GifView$ScaleType[this.scaleType.ordinal()];
        if (i == 1) {
            f6 = (f - (f3 * min)) / 2.0f;
            f5 = (f2 - (f4 * min)) / 2.0f;
        } else if (i == 2) {
            f6 = (f - (f3 * max)) / 2.0f;
            f5 = (f2 - (f4 * max)) / 2.0f;
            min = max;
        } else {
            if (i == 3) {
                canvas.save();
                canvas.translate(0.0f, 0.0f);
                canvas.scale(f7, f8);
                return;
            }
            min = 1.0f;
            f5 = 0.0f;
        }
        canvas.translate(f6, f5);
        canvas.scale(min, min);
    }

    /* renamed from: com.helpshift.proactive.GifView$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$helpshift$proactive$GifView$ScaleType;

        static {
            int[] iArr = new int[com.helpshift.proactive.GifView.ScaleType.values().length];
            $SwitchMap$com$helpshift$proactive$GifView$ScaleType = iArr;
            try {
                iArr[com.helpshift.proactive.GifView.ScaleType.FIT_CENTER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$helpshift$proactive$GifView$ScaleType[com.helpshift.proactive.GifView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$helpshift$proactive$GifView$ScaleType[com.helpshift.proactive.GifView.ScaleType.FIT_XY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    public void setScaleType(com.helpshift.proactive.GifView.ScaleType scaleType) {
        this.scaleType = scaleType;
    }

    public void setStroke(int i, java.lang.String str) {
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.strokePaint = paint;
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        this.strokePaint.setStrokeWidth(i);
        this.strokePaint.setColor(android.graphics.Color.parseColor(str));
        invalidate();
    }
}
