package J;

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
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static Uri a(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return e.d(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
        } catch (IllegalAccessException e7) {
            Log.e("IconCompat", "Unable to get icon uri", e7);
            return null;
        } catch (NoSuchMethodException e8) {
            Log.e("IconCompat", "Unable to get icon uri", e8);
            return null;
        } catch (InvocationTargetException e9) {
            Log.e("IconCompat", "Unable to get icon uri", e9);
            return null;
        }
    }

    public static Drawable b(Icon icon, Context context) {
        return icon.loadDrawable(context);
    }

    public static Icon c(IconCompat iconCompat, Context context) {
        Icon iconCreateWithBitmap;
        String strB;
        InputStream inputStreamOpenInputStream;
        switch (iconCompat.f9056a) {
            case -1:
                return (Icon) iconCompat.f9057b;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f9057b);
                break;
            case 2:
                int i7 = iconCompat.f9056a;
                if (i7 == -1) {
                    int i8 = Build.VERSION.SDK_INT;
                    Object obj = iconCompat.f9057b;
                    if (i8 >= 28) {
                        strB = e.b(obj);
                    } else {
                        strB = null;
                        try {
                            strB = (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
                        } catch (IllegalAccessException e7) {
                            Log.e("IconCompat", "Unable to get icon package", e7);
                        } catch (NoSuchMethodException e8) {
                            Log.e("IconCompat", "Unable to get icon package", e8);
                        } catch (InvocationTargetException e9) {
                            Log.e("IconCompat", "Unable to get icon package", e9);
                        }
                    }
                } else {
                    if (i7 != 2) {
                        throw new IllegalStateException("called getResPackage() on " + iconCompat);
                    }
                    String str = iconCompat.j;
                    strB = (str == null || TextUtils.isEmpty(str)) ? ((String) iconCompat.f9057b).split(":", -1)[0] : iconCompat.j;
                }
                iconCreateWithBitmap = Icon.createWithResource(strB, iconCompat.f9060e);
                break;
            case 3:
                iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompat.f9057b, iconCompat.f9060e, iconCompat.f9061f);
                break;
            case 4:
                iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompat.f9057b);
                break;
            case 5:
                iconCreateWithBitmap = Build.VERSION.SDK_INT < 26 ? Icon.createWithBitmap(IconCompat.c((Bitmap) iconCompat.f9057b, false)) : d.b((Bitmap) iconCompat.f9057b);
                break;
            case 6:
                int i9 = Build.VERSION.SDK_INT;
                if (i9 >= 30) {
                    iconCreateWithBitmap = f.a(iconCompat.g());
                } else {
                    if (context == null) {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.g());
                    }
                    Uri uriG = iconCompat.g();
                    String scheme = uriG.getScheme();
                    if ("content".equals(scheme) || "file".equals(scheme)) {
                        try {
                            inputStreamOpenInputStream = context.getContentResolver().openInputStream(uriG);
                        } catch (Exception e10) {
                            Log.w("IconCompat", "Unable to load image from URI: " + uriG, e10);
                            inputStreamOpenInputStream = null;
                        }
                    } else {
                        try {
                            inputStreamOpenInputStream = new FileInputStream(new File((String) iconCompat.f9057b));
                        } catch (FileNotFoundException e11) {
                            Log.w("IconCompat", "Unable to load image from path: " + uriG, e11);
                            inputStreamOpenInputStream = null;
                        }
                    }
                    if (inputStreamOpenInputStream == null) {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.g());
                    }
                    if (i9 < 26) {
                        iconCreateWithBitmap = Icon.createWithBitmap(IconCompat.c(BitmapFactory.decodeStream(inputStreamOpenInputStream), false));
                    } else {
                        iconCreateWithBitmap = d.b(BitmapFactory.decodeStream(inputStreamOpenInputStream));
                    }
                }
                break;
        }
        ColorStateList colorStateList = iconCompat.f9062g;
        if (colorStateList != null) {
            iconCreateWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = iconCompat.f9063h;
        if (mode != IconCompat.f9055k) {
            iconCreateWithBitmap.setTintMode(mode);
        }
        return iconCreateWithBitmap;
    }
}
