package com.miteksystems.misnap.workflow.util;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/miteksystems/misnap/workflow/util/DrawableUtil;", "", "<init>", "()V", "Landroid/graphics/drawable/Drawable;", "drawable", "", "width", "height", "Landroid/graphics/Bitmap;", "drawableToBitmap", "(Landroid/graphics/drawable/Drawable;II)Landroid/graphics/Bitmap;", "", "rotationDegrees", "getRotatedDrawable", "(Landroid/graphics/drawable/Drawable;F)Landroid/graphics/drawable/Drawable;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DrawableUtil {
    public static final com.miteksystems.misnap.workflow.util.DrawableUtil INSTANCE = new com.miteksystems.misnap.workflow.util.DrawableUtil();

    @kotlin.jvm.JvmStatic
    public static final android.graphics.drawable.Drawable getRotatedDrawable(android.graphics.drawable.Drawable drawable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawable, "");
        return getRotatedDrawable$default(drawable, 0.0f, 2, null);
    }

    @kotlin.jvm.JvmStatic
    public static final android.graphics.drawable.Drawable getRotatedDrawable(android.graphics.drawable.Drawable drawable, float rotationDegrees) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawable, "");
        return new com.miteksystems.misnap.workflow.util.DrawableUtil.a(drawable, rotationDegrees, new android.graphics.drawable.Drawable[]{drawable});
    }

    @kotlin.Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\r¨\u0006\u0012"}, d2 = {"com/miteksystems/misnap/workflow/util/DrawableUtil$a", "Landroid/graphics/drawable/LayerDrawable;", "Landroid/graphics/Canvas;", "canvas", "", "draw", "", "getIntrinsicWidth", "getIntrinsicHeight", "", "a", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getXScale", "()F", "xScale", util.h.xy.cb.b.f1091, "getYScale", "yScale", "workflow_release"}, k = 1, mv = {1, 8, 0})
    public static final class a extends android.graphics.drawable.LayerDrawable {
        private final float Camera2StreamConfigurationMap;
        final /* synthetic */ android.graphics.drawable.Drawable getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ float getHighSpeedVideoFpsRanges;
        private final float getHighSpeedVideoSizes;

        @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
        public final int getIntrinsicWidth() {
            return this.getHighResolutionOutputSizeshNQ4ISI.getIntrinsicHeight();
        }

        @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
        public final int getIntrinsicHeight() {
            return this.getHighResolutionOutputSizeshNQ4ISI.getIntrinsicWidth();
        }

        @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
        public final void draw(android.graphics.Canvas canvas) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(canvas, "");
            android.graphics.drawable.Drawable drawable = this.getHighResolutionOutputSizeshNQ4ISI;
            if ((drawable instanceof android.graphics.drawable.ColorDrawable) || (drawable instanceof android.graphics.drawable.GradientDrawable)) {
                super.draw(canvas);
                return;
            }
            canvas.save();
            float width = this.getHighResolutionOutputSizeshNQ4ISI.getBounds().width();
            float height = this.getHighResolutionOutputSizeshNQ4ISI.getBounds().height();
            canvas.scale(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes);
            canvas.rotate(this.getHighSpeedVideoFpsRanges, width / 2.0f, height / 2.0f);
            float f = (width - (this.getHighSpeedVideoSizes * width)) / 2.0f;
            float f2 = (height - (this.Camera2StreamConfigurationMap * height)) / 2.0f;
            if (this.getHighSpeedVideoFpsRanges >= 0.0f) {
                canvas.translate(f, -f2);
            } else {
                canvas.translate(-f, f2);
            }
            super.draw(canvas);
            canvas.restore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(android.graphics.drawable.Drawable drawable, float f, android.graphics.drawable.Drawable[] drawableArr) {
            super(drawableArr);
            this.getHighResolutionOutputSizeshNQ4ISI = drawable;
            this.getHighSpeedVideoFpsRanges = f;
            this.getHighSpeedVideoSizes = drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
            this.Camera2StreamConfigurationMap = drawable.getIntrinsicHeight() / drawable.getIntrinsicWidth();
        }
    }

    public static /* synthetic */ android.graphics.drawable.Drawable getRotatedDrawable$default(android.graphics.drawable.Drawable drawable, float f, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            f = -90.0f;
        }
        return getRotatedDrawable(drawable, f);
    }

    public static /* synthetic */ android.graphics.Bitmap drawableToBitmap$default(android.graphics.drawable.Drawable drawable, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = drawable.getIntrinsicHeight();
        }
        if ((i3 & 4) != 0) {
            i2 = drawable.getIntrinsicHeight();
        }
        return drawableToBitmap(drawable, i, i2);
    }

    @kotlin.jvm.JvmStatic
    public static final android.graphics.Bitmap drawableToBitmap(android.graphics.drawable.Drawable drawable, int width, int height) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawable, "");
        if (width == 0 || height == 0) {
            return null;
        }
        if (drawable instanceof android.graphics.drawable.BitmapDrawable) {
            android.graphics.drawable.BitmapDrawable bitmapDrawable = (android.graphics.drawable.BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap().getWidth() == width && bitmapDrawable.getBitmap().getHeight() == height) {
                return bitmapDrawable.getBitmap();
            }
        }
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(width, height, android.graphics.Bitmap.Config.ARGB_8888);
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        drawable.setBounds(new android.graphics.Rect(0, 0, width, height));
        drawable.draw(canvas);
        return createBitmap;
    }

    private DrawableUtil() {
    }
}
