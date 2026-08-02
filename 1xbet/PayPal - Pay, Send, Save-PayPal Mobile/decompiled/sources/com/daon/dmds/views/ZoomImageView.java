package com.daon.dmds.views;

/* loaded from: classes7.dex */
public class ZoomImageView extends androidx.appcompat.widget.AppCompatImageView {
    android.graphics.Paint getHighResolutionOutputSizeshNQ4ISI;
    android.content.Context getHighSpeedVideoFpsRanges;
    android.graphics.Bitmap getHighSpeedVideoFpsRangesFor;

    public ZoomImageView(android.content.Context context) {
        super(context);
        this.getHighSpeedVideoFpsRanges = context;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.getHighResolutionOutputSizeshNQ4ISI = paint;
        paint.setStrokeWidth(2.0f);
        this.getHighResolutionOutputSizeshNQ4ISI.setColor(android.graphics.Color.parseColor("#FF0000"));
    }

    public android.graphics.Bitmap getCroppedBitmap(android.graphics.Bitmap bitmap, int i) {
        if (i == 0) {
            return null;
        }
        if (bitmap.getWidth() != i || bitmap.getHeight() != i) {
            float min = java.lang.Math.min(bitmap.getWidth(), bitmap.getHeight()) / i;
            bitmap = android.graphics.Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() / min), (int) (bitmap.getHeight() / min), false);
        }
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(i, i, android.graphics.Bitmap.Config.ARGB_8888);
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        android.graphics.Paint paint = new android.graphics.Paint();
        android.graphics.Rect rect = new android.graphics.Rect(0, 0, i, i);
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(androidx.core.content.ContextCompat.getColor(this.getHighSpeedVideoFpsRanges, com.daon.dmds.R.color.cropped_bitmap_color));
        float f = i / 2.0f;
        float f2 = 0.7f + f;
        canvas.drawCircle(f2, f2, f + 0.1f, paint);
        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return createBitmap;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        if (this.getHighSpeedVideoFpsRangesFor == null || getWidth() == 0 || getHeight() == 0) {
            return;
        }
        android.graphics.Bitmap copy = this.getHighSpeedVideoFpsRangesFor.copy(android.graphics.Bitmap.Config.ARGB_8888, true);
        int width = getWidth();
        int height = getHeight();
        canvas.drawBitmap(getCroppedBitmap(copy, width), 0.0f, 0.0f, (android.graphics.Paint) null);
        this.getHighResolutionOutputSizeshNQ4ISI.setStrokeWidth(7.0f);
        this.getHighResolutionOutputSizeshNQ4ISI.setColor(android.graphics.Color.parseColor("#000000"));
        float f = width / 2.0f;
        float f2 = height / 2.0f;
        canvas.drawLine(f - 35.0f, f2, f + 35.0f, f2, this.getHighResolutionOutputSizeshNQ4ISI);
        canvas.drawLine(f, f2 - 35.0f, f, f2 + 35.0f, this.getHighResolutionOutputSizeshNQ4ISI);
        this.getHighResolutionOutputSizeshNQ4ISI.setStrokeWidth(5.0f);
        this.getHighResolutionOutputSizeshNQ4ISI.setColor(android.graphics.Color.parseColor("#FFFFFF"));
        canvas.drawLine(f - 33.0f, f2, f + 33.0f, f2, this.getHighResolutionOutputSizeshNQ4ISI);
        canvas.drawLine(f, f2 - 33.0f, f, f2 + 33.0f, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public void setCurrentBitmap(android.graphics.Bitmap bitmap) {
        this.getHighSpeedVideoFpsRangesFor = bitmap;
        invalidate();
    }

    public ZoomImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.getHighSpeedVideoFpsRanges = context;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.getHighResolutionOutputSizeshNQ4ISI = paint;
        paint.setStrokeWidth(2.0f);
        this.getHighResolutionOutputSizeshNQ4ISI.setColor(android.graphics.Color.parseColor("#FF0000"));
    }

    public ZoomImageView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.getHighSpeedVideoFpsRanges = context;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.getHighResolutionOutputSizeshNQ4ISI = paint;
        paint.setStrokeWidth(2.0f);
        this.getHighResolutionOutputSizeshNQ4ISI.setColor(android.graphics.Color.parseColor("#FF0000"));
    }
}
