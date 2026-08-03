package com.squareup.picasso;

/* loaded from: classes5.dex */
final class PicassoDrawable extends android.graphics.drawable.BitmapDrawable {
    private static final android.graphics.Paint DEBUG_PAINT = new android.graphics.Paint();
    private static final float FADE_DURATION = 200.0f;
    int alpha;
    boolean animating;
    private final boolean debugging;
    private final float density;
    private final com.squareup.picasso.Picasso.LoadedFrom loadedFrom;
    android.graphics.drawable.Drawable placeholder;
    long startTimeMillis;

    /* JADX WARN: Multi-variable type inference failed */
    static void setBitmap(android.widget.ImageView imageView, android.content.Context context, android.graphics.Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom loadedFrom, boolean z, boolean z2) {
        android.graphics.drawable.Drawable drawable = imageView.getDrawable();
        if (drawable instanceof android.graphics.drawable.Animatable) {
            ((android.graphics.drawable.Animatable) drawable).stop();
        }
        imageView.setImageDrawable(new com.squareup.picasso.PicassoDrawable(context, bitmap, drawable, loadedFrom, z, z2));
    }

    static void setPlaceholder(android.widget.ImageView imageView, android.graphics.drawable.Drawable drawable) {
        imageView.setImageDrawable(drawable);
        if (imageView.getDrawable() instanceof android.graphics.drawable.Animatable) {
            ((android.graphics.drawable.Animatable) imageView.getDrawable()).start();
        }
    }

    PicassoDrawable(android.content.Context context, android.graphics.Bitmap bitmap, android.graphics.drawable.Drawable drawable, com.squareup.picasso.Picasso.LoadedFrom loadedFrom, boolean z, boolean z2) {
        super(context.getResources(), bitmap);
        this.alpha = 255;
        this.debugging = z2;
        this.density = context.getResources().getDisplayMetrics().density;
        this.loadedFrom = loadedFrom;
        if (loadedFrom == com.squareup.picasso.Picasso.LoadedFrom.MEMORY || z) {
            return;
        }
        this.placeholder = drawable;
        this.animating = true;
        this.startTimeMillis = android.os.SystemClock.uptimeMillis();
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        if (!this.animating) {
            super.draw(canvas);
        } else {
            float uptimeMillis = (android.os.SystemClock.uptimeMillis() - this.startTimeMillis) / 200.0f;
            if (uptimeMillis >= 1.0f) {
                this.animating = false;
                this.placeholder = null;
                super.draw(canvas);
            } else {
                android.graphics.drawable.Drawable drawable = this.placeholder;
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                super.setAlpha((int) (this.alpha * uptimeMillis));
                super.draw(canvas);
                super.setAlpha(this.alpha);
            }
        }
        if (this.debugging) {
            drawDebugIndicator(canvas);
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.alpha = i;
        android.graphics.drawable.Drawable drawable = this.placeholder;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
        super.setAlpha(i);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        android.graphics.drawable.Drawable drawable = this.placeholder;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        super.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    protected void onBoundsChange(android.graphics.Rect rect) {
        android.graphics.drawable.Drawable drawable = this.placeholder;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        super.onBoundsChange(rect);
    }

    private void drawDebugIndicator(android.graphics.Canvas canvas) {
        android.graphics.Paint paint = DEBUG_PAINT;
        paint.setColor(-1);
        canvas.drawPath(getTrianglePath(0, 0, (int) (this.density * 16.0f)), paint);
        paint.setColor(this.loadedFrom.debugColor);
        canvas.drawPath(getTrianglePath(0, 0, (int) (this.density * 15.0f)), paint);
    }

    private static android.graphics.Path getTrianglePath(int i, int i2, int i3) {
        android.graphics.Path path = new android.graphics.Path();
        float f = i;
        float f2 = i2;
        path.moveTo(f, f2);
        path.lineTo(i + i3, f2);
        path.lineTo(f, i2 + i3);
        return path;
    }
}
