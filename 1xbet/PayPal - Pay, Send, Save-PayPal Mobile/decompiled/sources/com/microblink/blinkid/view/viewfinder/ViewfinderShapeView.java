package com.microblink.blinkid.view.viewfinder;

/* loaded from: classes10.dex */
public class ViewfinderShapeView extends android.view.View {
    private final android.graphics.Paint Camera2StreamConfigurationMap;
    private final com.microblink.blinkid.view.viewfinder.ViewfinderShapeView.ShapeType getHighResolutionOutputSizeshNQ4ISI;
    private final android.graphics.Paint getHighSpeedVideoFpsRanges;
    private final android.graphics.Paint getHighSpeedVideoFpsRangesFor;
    private final android.graphics.PorterDuffXfermode getHighSpeedVideoSizes;
    private final float getHighSpeedVideoSizesFor;
    private final android.graphics.Paint getOutputFormats;

    public enum ShapeType {
        RECTANGLE(0),
        CIRCLE(1);

        public final int value;

        ShapeType(int i) {
            this.value = i;
        }

        public static com.microblink.blinkid.view.viewfinder.ViewfinderShapeView.ShapeType fromValue(int i) {
            for (com.microblink.blinkid.view.viewfinder.ViewfinderShapeView.ShapeType shapeType : values()) {
                if (shapeType.value == i) {
                    return shapeType;
                }
            }
            return null;
        }
    }

    public ViewfinderShapeView(android.content.Context context) {
        this(context, null);
    }

    private void getHighSpeedVideoFpsRanges(com.microblink.blinkid.view.viewfinder.ViewfinderShapeView.ShapeType shapeType, android.graphics.Canvas canvas, android.graphics.Paint paint, float f, float f2, float f3) {
        int ordinal = shapeType.ordinal();
        if (ordinal == 0) {
            android.graphics.RectF rectF = new android.graphics.RectF(f3, f3, f - f3, f2 - f3);
            float f4 = this.getHighSpeedVideoSizesFor;
            canvas.drawRoundRect(rectF, f4, f4, paint);
        } else {
            if (ordinal != 1) {
                return;
            }
            canvas.drawCircle(f / 2.0f, f2 / 2.0f, (java.lang.Math.min(f, f2) / 2.0f) - f3, paint);
        }
    }

    public int getBorderColor() {
        return this.getOutputFormats.getColor();
    }

    public float getBorderWidth() {
        return this.getOutputFormats.getStrokeWidth();
    }

    public float getInnerAlpha() {
        return this.getHighSpeedVideoFpsRangesFor.getAlpha() / 255.0f;
    }

    public int getInnerColor() {
        return this.getHighSpeedVideoFpsRangesFor.getColor();
    }

    public int getOuterColor() {
        return this.getHighSpeedVideoFpsRanges.getColor();
    }

    @Override // android.view.View
    protected final void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(width, height, android.graphics.Bitmap.Config.ARGB_8888);
        android.graphics.Canvas canvas2 = new android.graphics.Canvas(createBitmap);
        canvas2.drawPaint(this.getHighSpeedVideoFpsRanges);
        this.Camera2StreamConfigurationMap.setXfermode(this.getHighSpeedVideoSizes);
        this.Camera2StreamConfigurationMap.setStyle(android.graphics.Paint.Style.FILL);
        float f = width;
        float f2 = height;
        getHighSpeedVideoFpsRanges(this.getHighResolutionOutputSizeshNQ4ISI, canvas2, this.Camera2StreamConfigurationMap, f, f2, 1.0f);
        float strokeWidth = this.getOutputFormats.getStrokeWidth();
        getHighSpeedVideoFpsRanges(this.getHighResolutionOutputSizeshNQ4ISI, canvas2, this.getHighSpeedVideoFpsRangesFor, f, f2, strokeWidth);
        getHighSpeedVideoFpsRanges(this.getHighResolutionOutputSizeshNQ4ISI, canvas2, this.getOutputFormats, f, f2, strokeWidth / 2.0f);
        this.Camera2StreamConfigurationMap.setXfermode(null);
        canvas.drawBitmap(createBitmap, 0.0f, 0.0f, this.Camera2StreamConfigurationMap);
    }

    public void setBorderColor(int i) {
        this.getOutputFormats.setColor(i);
        invalidate();
    }

    public void setBorderWidth(float f) {
        this.getOutputFormats.setStrokeWidth(f);
        invalidate();
    }

    public void setInnerAlpha(float f) {
        this.getHighSpeedVideoFpsRangesFor.setAlpha(java.lang.Math.round(f * 255.0f));
        invalidate();
    }

    public void setInnerColor(int i) {
        this.getHighSpeedVideoFpsRangesFor.setColor(i);
        invalidate();
    }

    public void setOuterColor(int i) {
        this.getHighSpeedVideoFpsRanges.setColor(i);
        invalidate();
    }

    public ViewfinderShapeView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewfinderShapeView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.getHighSpeedVideoSizes = new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR);
        this.Camera2StreamConfigurationMap = new android.graphics.Paint(1);
        android.content.res.Resources resources = getResources();
        int integer = resources.getInteger(com.microblink.blinkid.library.R.integer.mb_default_shape_type);
        int color = androidx.core.content.ContextCompat.getColor(context, com.microblink.blinkid.library.R.color.mb_default_selfie_overlay_shape_inner_color);
        int color2 = androidx.core.content.ContextCompat.getColor(context, com.microblink.blinkid.library.R.color.mb_default_selfie_overlay_shape_outer_color);
        int color3 = androidx.core.content.ContextCompat.getColor(context, com.microblink.blinkid.library.R.color.mb_default_selfie_overlay_shape_border_color);
        float dimension = resources.getDimension(com.microblink.blinkid.library.R.dimen.mb_default_selfie_overlay_shape_border_width);
        float dimension2 = resources.getDimension(com.microblink.blinkid.library.R.dimen.mb_default_selfie_overlay_shape_corner_radius);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.microblink.blinkid.library.R.styleable.ViewfinderShapeView, i, 0);
        this.getHighResolutionOutputSizeshNQ4ISI = com.microblink.blinkid.view.viewfinder.ViewfinderShapeView.ShapeType.fromValue(obtainStyledAttributes.getInteger(com.microblink.blinkid.library.R.styleable.ViewfinderShapeView_mb_shapeType, integer));
        this.getHighSpeedVideoSizesFor = obtainStyledAttributes.getDimension(com.microblink.blinkid.library.R.styleable.ViewfinderShapeView_mb_cornerRadius, dimension2);
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.getOutputFormats = paint;
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setColor(obtainStyledAttributes.getColor(com.microblink.blinkid.library.R.styleable.ViewfinderShapeView_mb_borderColor, color3));
        paint.setStrokeWidth(obtainStyledAttributes.getDimension(com.microblink.blinkid.library.R.styleable.ViewfinderShapeView_mb_borderWidth, dimension));
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        this.getHighSpeedVideoFpsRangesFor = paint2;
        android.graphics.Paint.Style style = android.graphics.Paint.Style.FILL;
        paint2.setStyle(style);
        paint2.setColor(obtainStyledAttributes.getColor(com.microblink.blinkid.library.R.styleable.ViewfinderShapeView_mb_innerColor, color));
        android.graphics.Paint paint3 = new android.graphics.Paint(1);
        this.getHighSpeedVideoFpsRanges = paint3;
        paint3.setStyle(style);
        paint3.setColor(obtainStyledAttributes.getColor(com.microblink.blinkid.library.R.styleable.ViewfinderShapeView_mb_outerColor, color2));
        obtainStyledAttributes.recycle();
    }
}
