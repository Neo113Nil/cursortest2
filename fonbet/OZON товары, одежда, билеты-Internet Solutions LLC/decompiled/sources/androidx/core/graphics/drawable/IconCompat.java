package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;
import spay.sdk.domain.model.FraudMonInfo;

/* loaded from: classes8.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    static final PorterDuff.Mode f42130k = PorterDuff.Mode.SRC_IN;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f42131l = 0;

    /* renamed from: a, reason: collision with root package name */
    public int f42132a;

    /* renamed from: b, reason: collision with root package name */
    Object f42133b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f42134c;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f42135d;

    /* renamed from: e, reason: collision with root package name */
    public int f42136e;

    /* renamed from: f, reason: collision with root package name */
    public int f42137f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f42138g;

    /* renamed from: h, reason: collision with root package name */
    PorterDuff.Mode f42139h;

    /* renamed from: i, reason: collision with root package name */
    public String f42140i;

    /* renamed from: j, reason: collision with root package name */
    public String f42141j;

    static class a {
        static int a(@NonNull Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e11) {
                Log.e("IconCompat", "Unable to get icon resource", e11);
                return 0;
            } catch (NoSuchMethodException e12) {
                Log.e("IconCompat", "Unable to get icon resource", e12);
                return 0;
            } catch (InvocationTargetException e13) {
                Log.e("IconCompat", "Unable to get icon resource", e13);
                return 0;
            }
        }

        static String b(@NonNull Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e11) {
                Log.e("IconCompat", "Unable to get icon package", e11);
                return null;
            } catch (NoSuchMethodException e12) {
                Log.e("IconCompat", "Unable to get icon package", e12);
                return null;
            } catch (InvocationTargetException e13) {
                Log.e("IconCompat", "Unable to get icon package", e13);
                return null;
            }
        }

        static int c(@NonNull Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e11) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e11);
                return -1;
            } catch (NoSuchMethodException e12) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e12);
                return -1;
            } catch (InvocationTargetException e13) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e13);
                return -1;
            }
        }

        static Uri d(@NonNull Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e11) {
                Log.e("IconCompat", "Unable to get icon uri", e11);
                return null;
            } catch (NoSuchMethodException e12) {
                Log.e("IconCompat", "Unable to get icon uri", e12);
                return null;
            } catch (InvocationTargetException e13) {
                Log.e("IconCompat", "Unable to get icon uri", e13);
                return null;
            }
        }

        static Drawable e(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        static Icon f(IconCompat iconCompat, Context context) {
            Icon createWithBitmap;
            String str;
            switch (iconCompat.f42132a) {
                case -1:
                    return (Icon) iconCompat.f42133b;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    createWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f42133b);
                    break;
                case 2:
                    int i11 = iconCompat.f42132a;
                    if (i11 == -1) {
                        str = b(iconCompat.f42133b);
                    } else {
                        if (i11 != 2) {
                            throw new IllegalStateException("called getResPackage() on " + iconCompat);
                        }
                        String str2 = iconCompat.f42141j;
                        str = (str2 == null || TextUtils.isEmpty(str2)) ? ((String) iconCompat.f42133b).split(ProductContainerDTO.RATIO_DELIMITER, -1)[0] : iconCompat.f42141j;
                    }
                    createWithBitmap = Icon.createWithResource(str, iconCompat.f42136e);
                    break;
                case 3:
                    createWithBitmap = Icon.createWithData((byte[]) iconCompat.f42133b, iconCompat.f42136e, iconCompat.f42137f);
                    break;
                case 4:
                    createWithBitmap = Icon.createWithContentUri((String) iconCompat.f42133b);
                    break;
                case 5:
                    createWithBitmap = b.b((Bitmap) iconCompat.f42133b);
                    break;
                case 6:
                    if (Build.VERSION.SDK_INT >= 30) {
                        createWithBitmap = d.a(iconCompat.k());
                        break;
                    } else {
                        if (context == null) {
                            throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.k());
                        }
                        InputStream l11 = iconCompat.l(context);
                        if (l11 == null) {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.k());
                        }
                        createWithBitmap = b.b(BitmapFactory.decodeStream(l11));
                        break;
                    }
            }
            ColorStateList colorStateList = iconCompat.f42138g;
            if (colorStateList != null) {
                createWithBitmap.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f42139h;
            if (mode != IconCompat.f42130k) {
                createWithBitmap.setTintMode(mode);
            }
            return createWithBitmap;
        }
    }

    static class b {
        static Drawable a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        static Icon b(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    static class c {
        static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    static class d {
        static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
        this.f42132a = -1;
        this.f42134c = null;
        this.f42135d = null;
        this.f42136e = 0;
        this.f42137f = 0;
        this.f42138g = null;
        this.f42139h = f42130k;
        this.f42140i = null;
    }

    public static IconCompat b(@NonNull Icon icon) {
        icon.getClass();
        int c11 = a.c(icon);
        if (c11 == 2) {
            return f(a.b(icon), null, a.a(icon));
        }
        if (c11 == 4) {
            Uri d11 = a.d(icon);
            d11.getClass();
            String uri = d11.toString();
            uri.getClass();
            IconCompat iconCompat = new IconCompat(4);
            iconCompat.f42133b = uri;
            return iconCompat;
        }
        if (c11 != 6) {
            IconCompat iconCompat2 = new IconCompat(-1);
            iconCompat2.f42133b = icon;
            return iconCompat2;
        }
        Uri d12 = a.d(icon);
        d12.getClass();
        String uri2 = d12.toString();
        uri2.getClass();
        IconCompat iconCompat3 = new IconCompat(6);
        iconCompat3.f42133b = uri2;
        return iconCompat3;
    }

    public static IconCompat c(@NonNull Icon icon, @NonNull Context context) {
        icon.getClass();
        int c11 = a.c(icon);
        if (c11 == 2) {
            String b11 = a.b(icon);
            try {
                return f(b11, i(context, b11), a.a(icon));
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        }
        if (c11 == 4) {
            Uri d11 = a.d(icon);
            d11.getClass();
            String uri = d11.toString();
            uri.getClass();
            IconCompat iconCompat = new IconCompat(4);
            iconCompat.f42133b = uri;
            return iconCompat;
        }
        if (c11 != 6) {
            IconCompat iconCompat2 = new IconCompat(-1);
            iconCompat2.f42133b = icon;
            return iconCompat2;
        }
        Uri d12 = a.d(icon);
        d12.getClass();
        String uri2 = d12.toString();
        uri2.getClass();
        IconCompat iconCompat3 = new IconCompat(6);
        iconCompat3.f42133b = uri2;
        return iconCompat3;
    }

    @NonNull
    public static IconCompat d(@NonNull Bitmap bitmap) {
        IconCompat iconCompat = new IconCompat(5);
        iconCompat.f42133b = bitmap;
        return iconCompat;
    }

    @NonNull
    public static IconCompat e(@NonNull Bitmap bitmap) {
        bitmap.getClass();
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f42133b = bitmap;
        return iconCompat;
    }

    @NonNull
    public static IconCompat f(@NonNull String str, Resources resources, int i11) {
        str.getClass();
        if (i11 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f42136e = i11;
        if (resources != null) {
            try {
                iconCompat.f42133b = resources.getResourceName(i11);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f42133b = str;
        }
        iconCompat.f42141j = str;
        return iconCompat;
    }

    static Resources i(Context context, String str) {
        if ("android".equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        } catch (PackageManager.NameNotFoundException e11) {
            Log.e("IconCompat", "Unable to find pkg=" + str + " for icon", e11);
            return null;
        }
    }

    public final Bitmap g() {
        int i11 = this.f42132a;
        if (i11 == -1) {
            Object obj = this.f42133b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i11 == 1) {
            return (Bitmap) this.f42133b;
        }
        if (i11 != 5) {
            throw new IllegalStateException("called getBitmap() on " + this);
        }
        Bitmap bitmap = (Bitmap) this.f42133b;
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f7 = min;
        float f11 = 0.5f * f7;
        float f12 = 0.9166667f * f11;
        float f13 = 0.010416667f * f7;
        paint.setColor(0);
        paint.setShadowLayer(f13, 0.0f, f7 * 0.020833334f, 1023410176);
        canvas.drawCircle(f11, f11, f12, paint);
        paint.setShadowLayer(f13, 0.0f, 0.0f, 503316480);
        canvas.drawCircle(f11, f11, f12, paint);
        paint.clearShadowLayer();
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f11, f11, f12, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public final int h() {
        int i11 = this.f42132a;
        if (i11 == -1) {
            return a.a(this.f42133b);
        }
        if (i11 == 2) {
            return this.f42136e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public final int j() {
        int i11 = this.f42132a;
        return i11 == -1 ? a.c(this.f42133b) : i11;
    }

    @NonNull
    public final Uri k() {
        int i11 = this.f42132a;
        if (i11 == -1) {
            return a.d(this.f42133b);
        }
        if (i11 == 4 || i11 == 6) {
            return Uri.parse((String) this.f42133b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public final InputStream l(@NonNull Context context) {
        Uri k11 = k();
        String scheme = k11.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(k11);
            } catch (Exception e11) {
                Log.w("IconCompat", "Unable to load image from URI: " + k11, e11);
                return null;
            }
        }
        try {
            return new FileInputStream(new File((String) this.f42133b));
        } catch (FileNotFoundException e12) {
            Log.w("IconCompat", "Unable to load image from path: " + k11, e12);
            return null;
        }
    }

    @NonNull
    public final Bundle m() {
        Bundle bundle = new Bundle();
        switch (this.f42132a) {
            case -1:
                bundle.putParcelable("obj", (Parcelable) this.f42133b);
                break;
            case 0:
            default:
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                bundle.putParcelable("obj", (Bitmap) this.f42133b);
                break;
            case 2:
            case 4:
            case 6:
                bundle.putString("obj", (String) this.f42133b);
                break;
            case 3:
                bundle.putByteArray("obj", (byte[]) this.f42133b);
                break;
        }
        bundle.putInt("type", this.f42132a);
        bundle.putInt("int1", this.f42136e);
        bundle.putInt("int2", this.f42137f);
        bundle.putString("string1", this.f42141j);
        ColorStateList colorStateList = this.f42138g;
        if (colorStateList != null) {
            bundle.putParcelable("tint_list", colorStateList);
        }
        PorterDuff.Mode mode = this.f42139h;
        if (mode != f42130k) {
            bundle.putString("tint_mode", mode.name());
        }
        return bundle;
    }

    @NonNull
    @Deprecated
    public final Icon n() {
        return a.f(this, null);
    }

    @NonNull
    public final Icon o(Context context) {
        return a.f(this, context);
    }

    @NonNull
    public final String toString() {
        String str;
        if (this.f42132a == -1) {
            return String.valueOf(this.f42133b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        switch (this.f42132a) {
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
                str = FraudMonInfo.UNKNOWN;
                break;
        }
        sb2.append(str);
        switch (this.f42132a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f42133b).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.f42133b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.f42141j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(h())));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f42136e);
                if (this.f42137f != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f42137f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f42133b);
                break;
        }
        if (this.f42138g != null) {
            sb2.append(" tint=");
            sb2.append(this.f42138g);
        }
        if (this.f42139h != f42130k) {
            sb2.append(" mode=");
            sb2.append(this.f42139h);
        }
        sb2.append(")");
        return sb2.toString();
    }

    IconCompat(int i11) {
        this.f42134c = null;
        this.f42135d = null;
        this.f42136e = 0;
        this.f42137f = 0;
        this.f42138g = null;
        this.f42139h = f42130k;
        this.f42140i = null;
        this.f42132a = i11;
    }
}
