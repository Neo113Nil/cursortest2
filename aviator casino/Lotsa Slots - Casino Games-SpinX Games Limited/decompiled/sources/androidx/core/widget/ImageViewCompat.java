package androidx.core.widget;

/* loaded from: classes2.dex */
public class ImageViewCompat {
    public static android.content.res.ColorStateList getImageTintList(android.widget.ImageView imageView) {
        return androidx.core.widget.ImageViewCompat.Api21Impl.getImageTintList(imageView);
    }

    public static void setImageTintList(android.widget.ImageView imageView, android.content.res.ColorStateList colorStateList) {
        android.graphics.drawable.Drawable drawable;
        androidx.core.widget.ImageViewCompat.Api21Impl.setImageTintList(imageView, colorStateList);
        if (android.os.Build.VERSION.SDK_INT != 21 || (drawable = imageView.getDrawable()) == null || androidx.core.widget.ImageViewCompat.Api21Impl.getImageTintList(imageView) == null) {
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(imageView.getDrawableState());
        }
        imageView.setImageDrawable(drawable);
    }

    public static android.graphics.PorterDuff.Mode getImageTintMode(android.widget.ImageView imageView) {
        return androidx.core.widget.ImageViewCompat.Api21Impl.getImageTintMode(imageView);
    }

    public static void setImageTintMode(android.widget.ImageView imageView, android.graphics.PorterDuff.Mode mode) {
        android.graphics.drawable.Drawable drawable;
        androidx.core.widget.ImageViewCompat.Api21Impl.setImageTintMode(imageView, mode);
        if (android.os.Build.VERSION.SDK_INT != 21 || (drawable = imageView.getDrawable()) == null || androidx.core.widget.ImageViewCompat.Api21Impl.getImageTintList(imageView) == null) {
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(imageView.getDrawableState());
        }
        imageView.setImageDrawable(drawable);
    }

    private ImageViewCompat() {
    }

    static class Api21Impl {
        private Api21Impl() {
        }

        static android.content.res.ColorStateList getImageTintList(android.widget.ImageView imageView) {
            return imageView.getImageTintList();
        }

        static void setImageTintList(android.widget.ImageView imageView, android.content.res.ColorStateList colorStateList) {
            imageView.setImageTintList(colorStateList);
        }

        static android.graphics.PorterDuff.Mode getImageTintMode(android.widget.ImageView imageView) {
            return imageView.getImageTintMode();
        }

        static void setImageTintMode(android.widget.ImageView imageView, android.graphics.PorterDuff.Mode mode) {
            imageView.setImageTintMode(mode);
        }
    }
}
