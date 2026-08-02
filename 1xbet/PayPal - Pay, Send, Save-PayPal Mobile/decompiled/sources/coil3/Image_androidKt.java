package coil3;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a%\u0010\n\u001a\u00020\u0000*\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a)\u0010\n\u001a\u00020\u0000*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000e\u001a\u0011\u0010\u0004\u001a\u00020\u0006*\u00020\u000f¢\u0006\u0004\b\u0004\u0010\u0010\u001a\u0019\u0010\u0004\u001a\u00020\u0006*\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0011\u001a\u0019\u0010\u0014\u001a\u00020\u000f*\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015*\n\u0010\u0016\"\u00020\u00002\u00020\u0000*\n\u0010\u0018\"\u00020\u00172\u00020\u0017"}, d2 = {"Landroid/graphics/Bitmap;", "", "shareable", "Lcoil3/BitmapImage;", "asImage", "(Landroid/graphics/Bitmap;Z)Lcoil3/BitmapImage;", "Lcoil3/Image;", "", "width", "height", "toBitmap", "(Lcoil3/Image;II)Landroid/graphics/Bitmap;", "Landroid/graphics/Bitmap$Config;", "config", "(Lcoil3/Image;IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "Landroid/graphics/drawable/Drawable;", "(Landroid/graphics/drawable/Drawable;)Lcoil3/Image;", "(Landroid/graphics/drawable/Drawable;Z)Lcoil3/Image;", "Landroid/content/res/Resources;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_RESOURCES_KEY, "asDrawable", "(Lcoil3/Image;Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/graphics/Canvas;", "getHighSpeedVideoFpsRanges"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Image_androidKt {
    public static /* synthetic */ void Bitmap$annotations() {
    }

    public static /* synthetic */ coil3.BitmapImage asImage$default(android.graphics.Bitmap bitmap, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return asImage(bitmap, z);
    }

    public static final coil3.BitmapImage asImage(android.graphics.Bitmap bitmap, boolean z) {
        return new coil3.BitmapImage(bitmap, z);
    }

    public static final android.graphics.Bitmap toBitmap(coil3.Image image, int i, int i2) {
        android.graphics.Bitmap.Config config = image instanceof coil3.BitmapImage ? ((coil3.BitmapImage) image).getBitmap().getConfig() : null;
        if (config == null) {
            config = android.graphics.Bitmap.Config.ARGB_8888;
        }
        return toBitmap(image, i, i2, config);
    }

    public static final android.graphics.Bitmap toBitmap(coil3.Image image, int i, int i2, android.graphics.Bitmap.Config config) {
        if (image instanceof coil3.BitmapImage) {
            coil3.BitmapImage bitmapImage = (coil3.BitmapImage) image;
            if (bitmapImage.getBitmap().getWidth() == i && bitmapImage.getBitmap().getHeight() == i2 && bitmapImage.getBitmap().getConfig() == config) {
                return bitmapImage.getBitmap();
            }
        }
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(i, i2, config);
        image.draw(new android.graphics.Canvas(createBitmap));
        return createBitmap;
    }

    public static /* synthetic */ android.graphics.Bitmap toBitmap$default(coil3.Image image, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = image.getWidth();
        }
        if ((i3 & 2) != 0) {
            i2 = image.getHeight();
        }
        return toBitmap(image, i, i2);
    }

    public static final coil3.Image asImage(android.graphics.drawable.Drawable drawable) {
        if (drawable instanceof android.graphics.drawable.BitmapDrawable) {
            return asImage$default(((android.graphics.drawable.BitmapDrawable) drawable).getBitmap(), false, 1, null);
        }
        return new coil3.DrawableImage(drawable, false);
    }

    public static final coil3.Image asImage(android.graphics.drawable.Drawable drawable, boolean z) {
        if (drawable instanceof android.graphics.drawable.BitmapDrawable) {
            return asImage(((android.graphics.drawable.BitmapDrawable) drawable).getBitmap(), z);
        }
        return new coil3.DrawableImage(drawable, z);
    }

    public static final android.graphics.drawable.Drawable asDrawable(coil3.Image image, android.content.res.Resources resources) {
        if (image instanceof coil3.DrawableImage) {
            return ((coil3.DrawableImage) image).getDrawable();
        }
        if (!(image instanceof coil3.BitmapImage)) {
            return new coil3.ImageDrawable(image);
        }
        return new android.graphics.drawable.BitmapDrawable(resources, ((coil3.BitmapImage) image).getBitmap());
    }

    public static final android.graphics.Bitmap toBitmap(coil3.Image image, int i) {
        return toBitmap$default(image, i, 0, 2, null);
    }

    public static final android.graphics.Bitmap toBitmap(coil3.Image image) {
        return toBitmap$default(image, 0, 0, 3, null);
    }

    public static final coil3.BitmapImage asImage(android.graphics.Bitmap bitmap) {
        return asImage$default(bitmap, false, 1, null);
    }
}
