package coil3.content;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0080\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\b\" \u0010\u000e\u001a\u00020\t*\u0004\u0018\u00010\u00068AX\u0080\u0004¢\u0006\f\u0012\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\"\u0018\u0010\u0011\u001a\u00020\t*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u0018\u0010\u0013\u001a\u00020\u0012*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\"\u001b\u0010\u0015\u001a\u00020\u0012*\u00020\u00068G¢\u0006\f\u0012\u0004\b\u0017\u0010\r\u001a\u0004\b\u0015\u0010\u0016\"\u0018\u0010\u001a\u001a\u00020\u0006*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Landroid/graphics/Bitmap;", "Landroid/content/Context;", "context", "Landroid/graphics/drawable/BitmapDrawable;", "toDrawable", "(Landroid/graphics/Bitmap;Landroid/content/Context;)Landroid/graphics/drawable/BitmapDrawable;", "Landroid/graphics/Bitmap$Config;", "toSoftware", "(Landroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap$Config;", "", "getBytesPerPixel", "(Landroid/graphics/Bitmap$Config;)I", "getBytesPerPixel$annotations", "(Landroid/graphics/Bitmap$Config;)V", "bytesPerPixel", "getAllocationByteCountCompat", "(Landroid/graphics/Bitmap;)I", "allocationByteCountCompat", "", "isImmutable", "(Landroid/graphics/Bitmap;)Z", "isHardware", "(Landroid/graphics/Bitmap$Config;)Z", "isHardware$annotations", "getSafeConfig", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap$Config;", "safeConfig"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: coil3.util.BitmapsKt, reason: from Kotlin metadata */
/* loaded from: classes.dex */
public final class Bitmap {
    public static /* synthetic */ void getBytesPerPixel$annotations(android.graphics.Bitmap.Config config) {
    }

    public static /* synthetic */ void isHardware$annotations(android.graphics.Bitmap.Config config) {
    }

    public static final int getBytesPerPixel(android.graphics.Bitmap.Config config) {
        if (config == android.graphics.Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == android.graphics.Bitmap.Config.RGB_565 || config == android.graphics.Bitmap.Config.ARGB_4444) {
            return 2;
        }
        return config == android.graphics.Bitmap.Config.RGBA_F16 ? 8 : 4;
    }

    public static final int getAllocationByteCountCompat(android.graphics.Bitmap bitmap) {
        if (bitmap.isRecycled()) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            android.graphics.Bitmap.Config config = bitmap.getConfig();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot obtain size for recycled bitmap: ");
            sb.append(bitmap);
            sb.append(" [");
            sb.append(width);
            sb.append(" x ");
            sb.append(height);
            sb.append("] + ");
            sb.append(config);
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        try {
            return bitmap.getAllocationByteCount();
        } catch (java.lang.Exception unused) {
            return bitmap.getWidth() * bitmap.getHeight() * getBytesPerPixel(bitmap.getConfig());
        }
    }

    public static final boolean isImmutable(android.graphics.Bitmap bitmap) {
        return !bitmap.isMutable();
    }

    public static final boolean isHardware(android.graphics.Bitmap.Config config) {
        return config == android.graphics.Bitmap.Config.HARDWARE;
    }

    public static final android.graphics.Bitmap.Config getSafeConfig(android.graphics.Bitmap bitmap) {
        android.graphics.Bitmap.Config config = bitmap.getConfig();
        return config == null ? android.graphics.Bitmap.Config.ARGB_8888 : config;
    }

    public static final android.graphics.drawable.BitmapDrawable toDrawable(android.graphics.Bitmap bitmap, android.content.Context context) {
        return new android.graphics.drawable.BitmapDrawable(context.getResources(), bitmap);
    }

    public static final android.graphics.Bitmap.Config toSoftware(android.graphics.Bitmap.Config config) {
        return (config == null || isHardware(config)) ? android.graphics.Bitmap.Config.ARGB_8888 : config;
    }
}
