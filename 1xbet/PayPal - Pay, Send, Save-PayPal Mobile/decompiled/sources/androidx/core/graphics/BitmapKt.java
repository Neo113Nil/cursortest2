package androidx.core.graphics;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a-\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a$\u0010\u000b\u001a\u00020\b*\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0086\n¢\u0006\u0004\b\u000b\u0010\f\u001a,\u0010\u000e\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0086\n¢\u0006\u0004\b\u000e\u0010\u000f\u001a.\u0010\u0014\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0086\b¢\u0006\u0004\b\u0014\u0010\u0015\u001a*\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0086\b¢\u0006\u0004\b\u0018\u0010\u0019\u001a>\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u00122\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0086\b¢\u0006\u0004\b\u0018\u0010\u001d\u001a\u001c\u0010 \u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001eH\u0086\n¢\u0006\u0004\b \u0010!\u001a\u001c\u0010 \u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u001f\u001a\u00020\"H\u0086\n¢\u0006\u0004\b \u0010#"}, d2 = {"Landroid/graphics/Bitmap;", "Lkotlin/Function1;", "Landroid/graphics/Canvas;", "", "Lkotlin/ExtensionFunctionType;", "block", "applyCanvas", "(Landroid/graphics/Bitmap;Lkotlin/jvm/functions/Function1;)Landroid/graphics/Bitmap;", "", "x", "y", "get", "(Landroid/graphics/Bitmap;II)I", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "set", "(Landroid/graphics/Bitmap;III)V", "width", "height", "", com.paypal.oslo.feature.activity.analytics.ActivityAnalyticsConstants.Ledger.FILTER, "scale", "(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;", "Landroid/graphics/Bitmap$Config;", "config", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "hasAlpha", "Landroid/graphics/ColorSpace;", "colorSpace", "(IILandroid/graphics/Bitmap$Config;ZLandroid/graphics/ColorSpace;)Landroid/graphics/Bitmap;", "Landroid/graphics/Point;", "p", "contains", "(Landroid/graphics/Bitmap;Landroid/graphics/Point;)Z", "Landroid/graphics/PointF;", "(Landroid/graphics/Bitmap;Landroid/graphics/PointF;)Z"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BitmapKt {
    public static final android.graphics.Bitmap applyCanvas(android.graphics.Bitmap bitmap, kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.Unit> function1) {
        function1.invoke(new android.graphics.Canvas(bitmap));
        return bitmap;
    }

    public static final int get(android.graphics.Bitmap bitmap, int i, int i2) {
        return bitmap.getPixel(i, i2);
    }

    public static final void set(android.graphics.Bitmap bitmap, int i, int i2, int i3) {
        bitmap.setPixel(i, i2, i3);
    }

    public static final android.graphics.Bitmap scale(android.graphics.Bitmap bitmap, int i, int i2, boolean z) {
        return android.graphics.Bitmap.createScaledBitmap(bitmap, i, i2, z);
    }

    public static /* synthetic */ android.graphics.Bitmap scale$default(android.graphics.Bitmap bitmap, int i, int i2, boolean z, int i3, java.lang.Object obj) {
        if ((i3 & 4) != 0) {
            z = true;
        }
        return android.graphics.Bitmap.createScaledBitmap(bitmap, i, i2, z);
    }

    public static /* synthetic */ android.graphics.Bitmap createBitmap$default(int i, int i2, android.graphics.Bitmap.Config config, int i3, java.lang.Object obj) {
        if ((i3 & 4) != 0) {
            config = android.graphics.Bitmap.Config.ARGB_8888;
        }
        return android.graphics.Bitmap.createBitmap(i, i2, config);
    }

    public static final android.graphics.Bitmap createBitmap(int i, int i2, android.graphics.Bitmap.Config config) {
        return android.graphics.Bitmap.createBitmap(i, i2, config);
    }

    public static /* synthetic */ android.graphics.Bitmap createBitmap$default(int i, int i2, android.graphics.Bitmap.Config config, boolean z, android.graphics.ColorSpace colorSpace, int i3, java.lang.Object obj) {
        if ((i3 & 4) != 0) {
            config = android.graphics.Bitmap.Config.ARGB_8888;
        }
        if ((i3 & 8) != 0) {
            z = true;
        }
        if ((i3 & 16) != 0) {
            colorSpace = android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.SRGB);
        }
        return android.graphics.Bitmap.createBitmap(i, i2, config, z, colorSpace);
    }

    public static final android.graphics.Bitmap createBitmap(int i, int i2, android.graphics.Bitmap.Config config, boolean z, android.graphics.ColorSpace colorSpace) {
        return android.graphics.Bitmap.createBitmap(i, i2, config, z, colorSpace);
    }

    public static final boolean contains(android.graphics.Bitmap bitmap, android.graphics.Point point) {
        int width = bitmap.getWidth();
        int i = point.x;
        return i >= 0 && i < width && point.y >= 0 && point.y < bitmap.getHeight();
    }

    public static final boolean contains(android.graphics.Bitmap bitmap, android.graphics.PointF pointF) {
        return pointF.x >= 0.0f && pointF.x < ((float) bitmap.getWidth()) && pointF.y >= 0.0f && pointF.y < ((float) bitmap.getHeight());
    }
}
