package androidx.core.widget;

/* loaded from: classes3.dex */
public class ImageViewCompat {
    public static android.content.res.ColorStateList getImageTintList(android.widget.ImageView imageView) {
        return imageView.getImageTintList();
    }

    public static void setImageTintList(android.widget.ImageView imageView, android.content.res.ColorStateList colorStateList) {
        imageView.setImageTintList(colorStateList);
    }

    public static android.graphics.PorterDuff.Mode getImageTintMode(android.widget.ImageView imageView) {
        return imageView.getImageTintMode();
    }

    public static void setImageTintMode(android.widget.ImageView imageView, android.graphics.PorterDuff.Mode mode) {
        imageView.setImageTintMode(mode);
    }

    private ImageViewCompat() {
    }
}
