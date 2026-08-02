package androidx.core.graphics.drawable;

/* loaded from: classes7.dex */
public final class RoundedBitmapDrawableFactory {
    public static androidx.core.graphics.drawable.RoundedBitmapDrawable create(android.content.res.Resources resources, android.graphics.Bitmap bitmap) {
        return new androidx.core.graphics.drawable.RoundedBitmapDrawable21(resources, bitmap);
    }

    public static androidx.core.graphics.drawable.RoundedBitmapDrawable create(android.content.res.Resources resources, java.lang.String str) {
        androidx.core.graphics.drawable.RoundedBitmapDrawable create = create(resources, android.graphics.BitmapFactory.decodeFile(str));
        create.getBitmap();
        return create;
    }

    public static androidx.core.graphics.drawable.RoundedBitmapDrawable create(android.content.res.Resources resources, java.io.InputStream inputStream) {
        androidx.core.graphics.drawable.RoundedBitmapDrawable create = create(resources, android.graphics.BitmapFactory.decodeStream(inputStream));
        create.getBitmap();
        return create;
    }

    private RoundedBitmapDrawableFactory() {
    }
}
