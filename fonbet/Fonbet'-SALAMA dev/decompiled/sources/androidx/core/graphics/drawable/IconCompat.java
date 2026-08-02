package androidx.core.graphics.drawable;

import J.c;
import J.e;
import android.content.res.ColorStateList;
import android.content.res.Resources;
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

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f9055k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a, reason: collision with root package name */
    public int f9056a;

    /* renamed from: b, reason: collision with root package name */
    public Object f9057b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f9058c;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f9059d;

    /* renamed from: e, reason: collision with root package name */
    public int f9060e;

    /* renamed from: f, reason: collision with root package name */
    public int f9061f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f9062g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f9063h;

    /* renamed from: i, reason: collision with root package name */
    public String f9064i;
    public String j;

    public IconCompat() {
        this.f9056a = -1;
        this.f9058c = null;
        this.f9059d = null;
        this.f9060e = 0;
        this.f9061f = 0;
        this.f9062g = null;
        this.f9063h = f9055k;
        this.f9064i = null;
    }

    public static Bitmap c(Bitmap bitmap, boolean z4) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f7 = min;
        float f8 = 0.5f * f7;
        float f9 = 0.9166667f * f8;
        if (z4) {
            float f10 = 0.010416667f * f7;
            paint.setColor(0);
            paint.setShadowLayer(f10, 0.0f, f7 * 0.020833334f, 1023410176);
            canvas.drawCircle(f8, f8, f9, paint);
            paint.setShadowLayer(f10, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f8, f8, f9, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f8, f8, f9, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public static IconCompat d(Resources resources, String str, int i7) {
        str.getClass();
        if (i7 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f9060e = i7;
        if (resources != null) {
            try {
                iconCompat.f9057b = resources.getResourceName(i7);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f9057b = str;
        }
        iconCompat.j = str;
        return iconCompat;
    }

    public final int e() {
        int i7 = this.f9056a;
        if (i7 != -1) {
            if (i7 == 2) {
                return this.f9060e;
            }
            throw new IllegalStateException("called getResId() on " + this);
        }
        int i8 = Build.VERSION.SDK_INT;
        Object obj = this.f9057b;
        if (i8 >= 28) {
            return e.a(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e7) {
            Log.e("IconCompat", "Unable to get icon resource", e7);
            return 0;
        } catch (NoSuchMethodException e8) {
            Log.e("IconCompat", "Unable to get icon resource", e8);
            return 0;
        } catch (InvocationTargetException e9) {
            Log.e("IconCompat", "Unable to get icon resource", e9);
            return 0;
        }
    }

    public final int f() {
        int i7 = this.f9056a;
        if (i7 != -1) {
            return i7;
        }
        int i8 = Build.VERSION.SDK_INT;
        Object obj = this.f9057b;
        if (i8 >= 28) {
            return e.c(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e7) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e7);
            return -1;
        } catch (NoSuchMethodException e8) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e8);
            return -1;
        } catch (InvocationTargetException e9) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e9);
            return -1;
        }
    }

    public final Uri g() {
        int i7 = this.f9056a;
        if (i7 == -1) {
            return c.a(this.f9057b);
        }
        if (i7 == 4 || i7 == 6) {
            return Uri.parse((String) this.f9057b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public final String toString() {
        String str;
        if (this.f9056a == -1) {
            return String.valueOf(this.f9057b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f9056a) {
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
        switch (this.f9056a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f9057b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f9057b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(e())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f9060e);
                if (this.f9061f != 0) {
                    sb.append(" off=");
                    sb.append(this.f9061f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f9057b);
                break;
        }
        if (this.f9062g != null) {
            sb.append(" tint=");
            sb.append(this.f9062g);
        }
        if (this.f9063h != f9055k) {
            sb.append(" mode=");
            sb.append(this.f9063h);
        }
        sb.append(")");
        return sb.toString();
    }

    public IconCompat(int i7) {
        this.f9058c = null;
        this.f9059d = null;
        this.f9060e = 0;
        this.f9061f = 0;
        this.f9062g = null;
        this.f9063h = f9055k;
        this.f9064i = null;
        this.f9056a = i7;
    }
}
