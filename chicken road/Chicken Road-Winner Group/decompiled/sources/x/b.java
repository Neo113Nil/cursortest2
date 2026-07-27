package x;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public abstract class b {
    public static Uri a(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return d.d(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
        } catch (IllegalAccessException e3) {
            Log.e("IconCompat", "Unable to get icon uri", e3);
            return null;
        } catch (NoSuchMethodException e4) {
            Log.e("IconCompat", "Unable to get icon uri", e4);
            return null;
        } catch (InvocationTargetException e5) {
            Log.e("IconCompat", "Unable to get icon uri", e5);
            return null;
        }
    }

    public static Drawable b(Icon icon, Context context) {
        return icon.loadDrawable(context);
    }

    public static Icon c(IconCompat iconCompat, Context context) {
        Icon createWithBitmap;
        int i3 = iconCompat.f2109a;
        String str = null;
        r2 = null;
        InputStream openInputStream = null;
        str = null;
        str = null;
        switch (i3) {
            case -1:
                return (Icon) iconCompat.f2110b;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                createWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f2110b);
                break;
            case 2:
                if (i3 == -1) {
                    int i4 = Build.VERSION.SDK_INT;
                    Object obj = iconCompat.f2110b;
                    if (i4 >= 28) {
                        str = d.b(obj);
                    } else {
                        try {
                            str = (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
                        } catch (IllegalAccessException e3) {
                            Log.e("IconCompat", "Unable to get icon package", e3);
                        } catch (NoSuchMethodException e4) {
                            Log.e("IconCompat", "Unable to get icon package", e4);
                        } catch (InvocationTargetException e5) {
                            Log.e("IconCompat", "Unable to get icon package", e5);
                        }
                    }
                } else {
                    if (i3 != 2) {
                        throw new IllegalStateException("called getResPackage() on " + iconCompat);
                    }
                    String str2 = iconCompat.f2117j;
                    str = (str2 == null || TextUtils.isEmpty(str2)) ? ((String) iconCompat.f2110b).split(StringUtils.PROCESS_POSTFIX_DELIMITER, -1)[0] : iconCompat.f2117j;
                }
                createWithBitmap = Icon.createWithResource(str, iconCompat.f2113e);
                break;
            case 3:
                createWithBitmap = Icon.createWithData((byte[]) iconCompat.f2110b, iconCompat.f2113e, iconCompat.f);
                break;
            case 4:
                createWithBitmap = Icon.createWithContentUri((String) iconCompat.f2110b);
                break;
            case 5:
                if (Build.VERSION.SDK_INT < 26) {
                    createWithBitmap = Icon.createWithBitmap(IconCompat.a((Bitmap) iconCompat.f2110b, false));
                    break;
                } else {
                    createWithBitmap = c.b((Bitmap) iconCompat.f2110b);
                    break;
                }
            case 6:
                if (Build.VERSION.SDK_INT >= 30) {
                    createWithBitmap = e.a(iconCompat.d());
                    break;
                } else {
                    if (context == null) {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.d());
                    }
                    Uri d3 = iconCompat.d();
                    String scheme = d3.getScheme();
                    if ("content".equals(scheme) || "file".equals(scheme)) {
                        try {
                            openInputStream = context.getContentResolver().openInputStream(d3);
                        } catch (Exception e6) {
                            Log.w("IconCompat", "Unable to load image from URI: " + d3, e6);
                        }
                    } else {
                        try {
                            openInputStream = new FileInputStream(new File((String) iconCompat.f2110b));
                        } catch (FileNotFoundException e7) {
                            Log.w("IconCompat", "Unable to load image from path: " + d3, e7);
                        }
                    }
                    if (openInputStream == null) {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.d());
                    }
                    if (Build.VERSION.SDK_INT < 26) {
                        createWithBitmap = Icon.createWithBitmap(IconCompat.a(BitmapFactory.decodeStream(openInputStream), false));
                        break;
                    } else {
                        createWithBitmap = c.b(BitmapFactory.decodeStream(openInputStream));
                        break;
                    }
                }
        }
        ColorStateList colorStateList = iconCompat.f2114g;
        if (colorStateList != null) {
            createWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = iconCompat.f2115h;
        if (mode != IconCompat.f2108k) {
            createWithBitmap.setTintMode(mode);
        }
        return createWithBitmap;
    }
}
