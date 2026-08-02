package androidx.core.graphics.drawable;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u0005H\u0086\b¢\u0006\u0004\b\u0004\u0010\u0006\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u0007H\u0086\b¢\u0006\u0004\b\u0004\u0010\b"}, d2 = {"Landroid/graphics/Bitmap;", "Landroid/graphics/drawable/Icon;", "toAdaptiveIcon", "(Landroid/graphics/Bitmap;)Landroid/graphics/drawable/Icon;", "toIcon", "Landroid/net/Uri;", "(Landroid/net/Uri;)Landroid/graphics/drawable/Icon;", "", "([B)Landroid/graphics/drawable/Icon;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class IconKt {
    public static final android.graphics.drawable.Icon toAdaptiveIcon(android.graphics.Bitmap bitmap) {
        return android.graphics.drawable.Icon.createWithAdaptiveBitmap(bitmap);
    }

    public static final android.graphics.drawable.Icon toIcon(android.graphics.Bitmap bitmap) {
        return android.graphics.drawable.Icon.createWithBitmap(bitmap);
    }

    public static final android.graphics.drawable.Icon toIcon(android.net.Uri uri) {
        return android.graphics.drawable.Icon.createWithContentUri(uri);
    }

    public static final android.graphics.drawable.Icon toIcon(byte[] bArr) {
        return android.graphics.drawable.Icon.createWithData(bArr, 0, bArr.length);
    }
}
