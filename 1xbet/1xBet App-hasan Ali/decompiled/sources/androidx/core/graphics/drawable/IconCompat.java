package androidx.core.graphics.drawable;

import D0.c;
import D0.d;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import d1.i;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f6957k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a, reason: collision with root package name */
    public int f6958a;

    /* renamed from: b, reason: collision with root package name */
    public Object f6959b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f6960c;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f6961d;

    /* renamed from: e, reason: collision with root package name */
    public int f6962e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f6963g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f6964h;
    public String i;

    /* renamed from: j, reason: collision with root package name */
    public String f6965j;

    public IconCompat() {
        this.f6958a = -1;
        this.f6960c = null;
        this.f6961d = null;
        this.f6962e = 0;
        this.f = 0;
        this.f6963g = null;
        this.f6964h = f6957k;
        this.i = null;
    }

    public static Bitmap a(Bitmap bitmap, boolean z3) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f = min;
        float f5 = 0.5f * f;
        float f6 = 0.9166667f * f5;
        if (z3) {
            float f7 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f7, 0.0f, f * 0.020833334f, 1023410176);
            canvas.drawCircle(f5, f5, f6, paint);
            paint.setShadowLayer(f7, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f5, f5, f6, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f5, f5, f6, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public static IconCompat b(int i) {
        if (i == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f6962e = i;
        iconCompat.f6959b = "";
        iconCompat.f6965j = "";
        return iconCompat;
    }

    public final int c() {
        int i = this.f6958a;
        if (i != -1) {
            if (i == 2) {
                return this.f6962e;
            }
            throw new IllegalStateException("called getResId() on " + this);
        }
        Object obj = this.f6959b;
        if (Build.VERSION.SDK_INT >= 28) {
            return i.e(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e3) {
            Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        } catch (NoSuchMethodException e5) {
            Log.e("IconCompat", "Unable to get icon resource", e5);
            return 0;
        } catch (InvocationTargetException e6) {
            Log.e("IconCompat", "Unable to get icon resource", e6);
            return 0;
        }
    }

    public final int d() {
        int i = this.f6958a;
        if (i != -1) {
            return i;
        }
        Object obj = this.f6959b;
        if (Build.VERSION.SDK_INT >= 28) {
            return i.m(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e3) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e3);
            return -1;
        } catch (NoSuchMethodException e5) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e5);
            return -1;
        } catch (InvocationTargetException e6) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e6);
            return -1;
        }
    }

    public final Uri e() {
        int i = this.f6958a;
        if (i != -1) {
            if (i == 4 || i == 6) {
                return Uri.parse((String) this.f6959b);
            }
            throw new IllegalStateException("called getUri() on " + this);
        }
        Object obj = this.f6959b;
        if (Build.VERSION.SDK_INT >= 28) {
            return i.n(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
        } catch (IllegalAccessException e3) {
            Log.e("IconCompat", "Unable to get icon uri", e3);
            return null;
        } catch (NoSuchMethodException e5) {
            Log.e("IconCompat", "Unable to get icon uri", e5);
            return null;
        } catch (InvocationTargetException e6) {
            Log.e("IconCompat", "Unable to get icon uri", e6);
            return null;
        }
    }

    public final Icon f(Context context) {
        Icon createWithBitmap;
        int i = this.f6958a;
        String str = null;
        r2 = null;
        InputStream openInputStream = null;
        str = null;
        str = null;
        switch (i) {
            case -1:
                return (Icon) this.f6959b;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                createWithBitmap = Icon.createWithBitmap((Bitmap) this.f6959b);
                break;
            case 2:
                if (i == -1) {
                    Object obj = this.f6959b;
                    if (Build.VERSION.SDK_INT >= 28) {
                        str = i.f(obj);
                    } else {
                        try {
                            str = (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
                        } catch (IllegalAccessException e3) {
                            Log.e("IconCompat", "Unable to get icon package", e3);
                        } catch (NoSuchMethodException e5) {
                            Log.e("IconCompat", "Unable to get icon package", e5);
                        } catch (InvocationTargetException e6) {
                            Log.e("IconCompat", "Unable to get icon package", e6);
                        }
                    }
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("called getResPackage() on " + this);
                    }
                    String str2 = this.f6965j;
                    str = (str2 == null || TextUtils.isEmpty(str2)) ? ((String) this.f6959b).split(":", -1)[0] : this.f6965j;
                }
                createWithBitmap = Icon.createWithResource(str, this.f6962e);
                break;
            case 3:
                createWithBitmap = Icon.createWithData((byte[]) this.f6959b, this.f6962e, this.f);
                break;
            case 4:
                createWithBitmap = Icon.createWithContentUri((String) this.f6959b);
                break;
            case 5:
                if (Build.VERSION.SDK_INT < 26) {
                    createWithBitmap = Icon.createWithBitmap(a((Bitmap) this.f6959b, false));
                    break;
                } else {
                    createWithBitmap = c.b((Bitmap) this.f6959b);
                    break;
                }
            case 6:
                if (Build.VERSION.SDK_INT >= 30) {
                    createWithBitmap = d.a(e());
                    break;
                } else {
                    if (context == null) {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + e());
                    }
                    Uri e7 = e();
                    String scheme = e7.getScheme();
                    if ("content".equals(scheme) || "file".equals(scheme)) {
                        try {
                            openInputStream = context.getContentResolver().openInputStream(e7);
                        } catch (Exception e8) {
                            Log.w("IconCompat", "Unable to load image from URI: " + e7, e8);
                        }
                    } else {
                        try {
                            openInputStream = new FileInputStream(new File((String) this.f6959b));
                        } catch (FileNotFoundException e9) {
                            Log.w("IconCompat", "Unable to load image from path: " + e7, e9);
                        }
                    }
                    if (openInputStream == null) {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + e());
                    }
                    if (Build.VERSION.SDK_INT < 26) {
                        createWithBitmap = Icon.createWithBitmap(a(BitmapFactory.decodeStream(openInputStream), false));
                        break;
                    } else {
                        createWithBitmap = c.b(BitmapFactory.decodeStream(openInputStream));
                        break;
                    }
                }
        }
        ColorStateList colorStateList = this.f6963g;
        if (colorStateList != null) {
            createWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.f6964h;
        if (mode != f6957k) {
            createWithBitmap.setTintMode(mode);
        }
        return createWithBitmap;
    }

    public final String toString() {
        String str;
        if (this.f6958a == -1) {
            return String.valueOf(this.f6959b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f6958a) {
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
        switch (this.f6958a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f6959b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f6959b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f6965j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(c())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f6962e);
                if (this.f != 0) {
                    sb.append(" off=");
                    sb.append(this.f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f6959b);
                break;
        }
        if (this.f6963g != null) {
            sb.append(" tint=");
            sb.append(this.f6963g);
        }
        if (this.f6964h != f6957k) {
            sb.append(" mode=");
            sb.append(this.f6964h);
        }
        sb.append(")");
        return sb.toString();
    }

    public IconCompat(int i) {
        this.f6960c = null;
        this.f6961d = null;
        this.f6962e = 0;
        this.f = 0;
        this.f6963g = null;
        this.f6964h = f6957k;
        this.i = null;
        this.f6958a = i;
    }
}
