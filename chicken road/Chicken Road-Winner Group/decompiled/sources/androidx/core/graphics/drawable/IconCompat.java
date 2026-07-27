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
import x.b;
import x.d;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f2108k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public Object f2110b;

    /* renamed from: j, reason: collision with root package name */
    public String f2117j;

    /* renamed from: a, reason: collision with root package name */
    public int f2109a = -1;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f2111c = null;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f2112d = null;

    /* renamed from: e, reason: collision with root package name */
    public int f2113e = 0;
    public int f = 0;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f2114g = null;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f2115h = f2108k;

    /* renamed from: i, reason: collision with root package name */
    public String f2116i = null;

    public static Bitmap a(Bitmap bitmap, boolean z3) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f = min;
        float f3 = 0.5f * f;
        float f4 = 0.9166667f * f3;
        if (z3) {
            float f5 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f5, 0.0f, f * 0.020833334f, 1023410176);
            canvas.drawCircle(f3, f3, f4, paint);
            paint.setShadowLayer(f5, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f3, f3, f4, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f3, f3, f4, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public static IconCompat b(int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat();
        iconCompat.f2111c = null;
        iconCompat.f2112d = null;
        iconCompat.f = 0;
        iconCompat.f2114g = null;
        iconCompat.f2115h = f2108k;
        iconCompat.f2116i = null;
        iconCompat.f2109a = 2;
        iconCompat.f2113e = i3;
        iconCompat.f2110b = "";
        iconCompat.f2117j = "";
        return iconCompat;
    }

    public final int c() {
        int i3 = this.f2109a;
        if (i3 != -1) {
            if (i3 == 2) {
                return this.f2113e;
            }
            throw new IllegalStateException("called getResId() on " + this);
        }
        int i4 = Build.VERSION.SDK_INT;
        Object obj = this.f2110b;
        if (i4 >= 28) {
            return d.a(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
        } catch (IllegalAccessException e3) {
            Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        } catch (NoSuchMethodException e4) {
            Log.e("IconCompat", "Unable to get icon resource", e4);
            return 0;
        } catch (InvocationTargetException e5) {
            Log.e("IconCompat", "Unable to get icon resource", e5);
            return 0;
        }
    }

    public final Uri d() {
        int i3 = this.f2109a;
        if (i3 == -1) {
            return b.a(this.f2110b);
        }
        if (i3 == 4 || i3 == 6) {
            return Uri.parse((String) this.f2110b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public final String toString() {
        String str;
        if (this.f2109a == -1) {
            return String.valueOf(this.f2110b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f2109a) {
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
        switch (this.f2109a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f2110b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f2110b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f2117j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(c())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f2113e);
                if (this.f != 0) {
                    sb.append(" off=");
                    sb.append(this.f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f2110b);
                break;
        }
        if (this.f2114g != null) {
            sb.append(" tint=");
            sb.append(this.f2114g);
        }
        if (this.f2115h != f2108k) {
            sb.append(" mode=");
            sb.append(this.f2115h);
        }
        sb.append(")");
        return sb.toString();
    }
}
