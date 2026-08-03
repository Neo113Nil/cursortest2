package androidx.core.graphics.drawable;

/* loaded from: classes.dex */
public class IconCompat extends androidx.versionedparcelable.CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    public static final android.graphics.PorterDuff.Mode f2173k = android.graphics.PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Object f2175b;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f2183j;

    /* renamed from: a, reason: collision with root package name */
    public int f2174a = -1;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f2176c = null;

    /* renamed from: d, reason: collision with root package name */
    public android.os.Parcelable f2177d = null;

    /* renamed from: e, reason: collision with root package name */
    public int f2178e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f2179f = 0;

    /* renamed from: g, reason: collision with root package name */
    public android.content.res.ColorStateList f2180g = null;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.PorterDuff.Mode f2181h = f2173k;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f2182i = null;

    public static android.graphics.Bitmap a(android.graphics.Bitmap bitmap, boolean z2) {
        int min = (int) (java.lang.Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(min, min, android.graphics.Bitmap.Config.ARGB_8888);
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        android.graphics.Paint paint = new android.graphics.Paint(3);
        float f2 = min;
        float f3 = 0.5f * f2;
        float f4 = 0.9166667f * f3;
        if (z2) {
            float f5 = 0.010416667f * f2;
            paint.setColor(0);
            paint.setShadowLayer(f5, 0.0f, f2 * 0.020833334f, 1023410176);
            canvas.drawCircle(f3, f3, f4, paint);
            paint.setShadowLayer(f5, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f3, f3, f4, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        android.graphics.Shader.TileMode tileMode = android.graphics.Shader.TileMode.CLAMP;
        android.graphics.BitmapShader bitmapShader = new android.graphics.BitmapShader(bitmap, tileMode, tileMode);
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f3, f3, f4, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public static androidx.core.graphics.drawable.IconCompat b(int i2) {
        if (i2 == 0) {
            throw new java.lang.IllegalArgumentException("Drawable resource ID must not be 0");
        }
        androidx.core.graphics.drawable.IconCompat iconCompat = new androidx.core.graphics.drawable.IconCompat();
        iconCompat.f2176c = null;
        iconCompat.f2177d = null;
        iconCompat.f2179f = 0;
        iconCompat.f2180g = null;
        iconCompat.f2181h = f2173k;
        iconCompat.f2182i = null;
        iconCompat.f2174a = 2;
        iconCompat.f2178e = i2;
        iconCompat.f2175b = "";
        iconCompat.f2183j = "";
        return iconCompat;
    }

    public final int c() {
        int i2 = this.f2174a;
        if (i2 != -1) {
            if (i2 == 2) {
                return this.f2178e;
            }
            throw new java.lang.IllegalStateException("called getResId() on " + this);
        }
        int i3 = android.os.Build.VERSION.SDK_INT;
        java.lang.Object obj = this.f2175b;
        if (i3 >= 28) {
            return s.d.a(obj);
        }
        try {
            return ((java.lang.Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (java.lang.IllegalAccessException e2) {
            android.util.Log.e("IconCompat", "Unable to get icon resource", e2);
            return 0;
        } catch (java.lang.NoSuchMethodException e3) {
            android.util.Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        } catch (java.lang.reflect.InvocationTargetException e4) {
            android.util.Log.e("IconCompat", "Unable to get icon resource", e4);
            return 0;
        }
    }

    public final android.net.Uri d() {
        int i2 = this.f2174a;
        if (i2 == -1) {
            return s.b.a(this.f2175b);
        }
        if (i2 == 4 || i2 == 6) {
            return android.net.Uri.parse((java.lang.String) this.f2175b);
        }
        throw new java.lang.IllegalStateException("called getUri() on " + this);
    }

    public final java.lang.String toString() {
        java.lang.String str;
        if (this.f2174a == -1) {
            return java.lang.String.valueOf(this.f2175b);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Icon(typ=");
        switch (this.f2174a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f2174a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((android.graphics.Bitmap) this.f2175b).getWidth());
                sb.append("x");
                sb.append(((android.graphics.Bitmap) this.f2175b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f2183j);
                sb.append(" id=");
                sb.append(java.lang.String.format("0x%08x", java.lang.Integer.valueOf(c())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f2178e);
                if (this.f2179f != 0) {
                    sb.append(" off=");
                    sb.append(this.f2179f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f2175b);
                break;
        }
        if (this.f2180g != null) {
            sb.append(" tint=");
            sb.append(this.f2180g);
        }
        if (this.f2181h != f2173k) {
            sb.append(" mode=");
            sb.append(this.f2181h);
        }
        sb.append(")");
        return sb.toString();
    }
}
