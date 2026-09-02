package s;

/* loaded from: classes.dex */
public abstract class c {
    public static android.graphics.drawable.Drawable a(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2) {
        return new android.graphics.drawable.AdaptiveIconDrawable(drawable, drawable2);
    }

    public static android.graphics.drawable.Icon b(android.graphics.Bitmap bitmap) {
        return android.graphics.drawable.Icon.createWithAdaptiveBitmap(bitmap);
    }
}
