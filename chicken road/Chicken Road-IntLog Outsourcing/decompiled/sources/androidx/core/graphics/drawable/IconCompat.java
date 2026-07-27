package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;
import y.b;
import y.d;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f4307k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a, reason: collision with root package name */
    public int f4308a;

    /* renamed from: b, reason: collision with root package name */
    public Object f4309b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f4310c;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f4311d;

    /* renamed from: e, reason: collision with root package name */
    public int f4312e;

    /* renamed from: f, reason: collision with root package name */
    public int f4313f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f4314g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f4315h;

    /* renamed from: i, reason: collision with root package name */
    public String f4316i;

    /* renamed from: j, reason: collision with root package name */
    public String f4317j;

    public IconCompat() {
        this.f4308a = -1;
        this.f4310c = null;
        this.f4311d = null;
        this.f4312e = 0;
        this.f4313f = 0;
        this.f4314g = null;
        this.f4315h = f4307k;
        this.f4316i = null;
    }

    public static Bitmap a(Bitmap bitmap, boolean z) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f3 = min;
        float f6 = 0.5f * f3;
        float f7 = 0.9166667f * f6;
        if (z) {
            float f8 = 0.010416667f * f3;
            paint.setColor(0);
            paint.setShadowLayer(f8, 0.0f, f3 * 0.020833334f, 1023410176);
            canvas.drawCircle(f6, f6, f7, paint);
            paint.setShadowLayer(f8, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f6, f6, f7, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f6, f6, f7, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public static IconCompat b(int i2) {
        if (i2 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f4312e = i2;
        iconCompat.f4309b = "";
        iconCompat.f4317j = "";
        return iconCompat;
    }

    public final int c() {
        int i2 = this.f4308a;
        if (i2 != -1) {
            if (i2 == 2) {
                return this.f4312e;
            }
            throw new IllegalStateException("called getResId() on " + this);
        }
        int i3 = Build.VERSION.SDK_INT;
        Object obj = this.f4309b;
        if (i3 >= 28) {
            return d.a(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e3) {
            Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        } catch (NoSuchMethodException e6) {
            Log.e("IconCompat", "Unable to get icon resource", e6);
            return 0;
        } catch (InvocationTargetException e7) {
            Log.e("IconCompat", "Unable to get icon resource", e7);
            return 0;
        }
    }

    public final int d() {
        int i2 = this.f4308a;
        if (i2 != -1) {
            return i2;
        }
        int i3 = Build.VERSION.SDK_INT;
        Object obj = this.f4309b;
        if (i3 >= 28) {
            return d.c(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e3) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e3);
            return -1;
        } catch (NoSuchMethodException e6) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e6);
            return -1;
        } catch (InvocationTargetException e7) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e7);
            return -1;
        }
    }

    public final Uri e() {
        int i2 = this.f4308a;
        if (i2 == -1) {
            return b.a(this.f4309b);
        }
        if (i2 == 4 || i2 == 6) {
            return Uri.parse((String) this.f4309b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public final String toString() {
        String str;
        if (this.f4308a == -1) {
            return String.valueOf(this.f4309b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f4308a) {
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
        switch (this.f4308a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f4309b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f4309b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f4317j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(c())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f4312e);
                if (this.f4313f != 0) {
                    sb.append(" off=");
                    sb.append(this.f4313f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f4309b);
                break;
        }
        if (this.f4314g != null) {
            sb.append(" tint=");
            sb.append(this.f4314g);
        }
        if (this.f4315h != f4307k) {
            sb.append(" mode=");
            sb.append(this.f4315h);
        }
        sb.append(")");
        return sb.toString();
    }

    public IconCompat(int i2) {
        this.f4310c = null;
        this.f4311d = null;
        this.f4312e = 0;
        this.f4313f = 0;
        this.f4314g = null;
        this.f4315h = f4307k;
        this.f4316i = null;
        this.f4308a = i2;
    }
}
