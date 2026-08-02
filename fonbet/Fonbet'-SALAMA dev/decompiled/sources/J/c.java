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

/* loaded from: classes.dex */
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

    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Icon c(IconCompat iconCompat, Context context) {
        Icon createWithBitmap;
        String str;
        InputStream openInputStream;
        switch (iconCompat.f9056a) {
            case -1:
                return (Icon) iconCompat.f9057b;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                createWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f9057b);
                break;
            case 2:
                int i7 = iconCompat.f9056a;
                if (i7 == -1) {
                    int i8 = Build.VERSION.SDK_INT;
                    Object obj = iconCompat.f9057b;
                    if (i8 >= 28) {
                        str = e.b(obj);
                    } else {
                        str = null;
                        try {
                            str = (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
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
                    String str2 = iconCompat.j;
                    str = (str2 == null || TextUtils.isEmpty(str2)) ? ((String) iconCompat.f9057b).split(":", -1)[0] : iconCompat.j;
                }
                createWithBitmap = Icon.createWithResource(str, iconCompat.f9060e);
                break;
            case 3:
                createWithBitmap = Icon.createWithData((byte[]) iconCompat.f9057b, iconCompat.f9060e, iconCompat.f9061f);
                break;
            case 4:
                createWithBitmap = Icon.createWithContentUri((String) iconCompat.f9057b);
                break;
            case 5:
                if (Build.VERSION.SDK_INT < 26) {
                    createWithBitmap = Icon.createWithBitmap(IconCompat.c((Bitmap) iconCompat.f9057b, false));
                    break;
                } else {
                    createWithBitmap = d.b((Bitmap) iconCompat.f9057b);
                    break;
                }
            case 6:
                int i9 = Build.VERSION.SDK_INT;
                if (i9 >= 30) {
                    createWithBitmap = f.a(iconCompat.g());
                    break;
                } else {
                    if (context == null) {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.g());
                    }
                    Uri g3 = iconCompat.g();
                    String scheme = g3.getScheme();
                    if ("content".equals(scheme) || "file".equals(scheme)) {
                        try {
                            openInputStream = context.getContentResolver().openInputStream(g3);
                        } catch (Exception e10) {
                            Log.w("IconCompat", "Unable to load image from URI: " + g3, e10);
                            openInputStream = null;
                            if (openInputStream == null) {
                            }
                        }
                    } else {
                        try {
                            openInputStream = new FileInputStream(new File((String) iconCompat.f9057b));
                        } catch (FileNotFoundException e11) {
                            Log.w("IconCompat", "Unable to load image from path: " + g3, e11);
                            openInputStream = null;
                            if (openInputStream == null) {
                            }
                        }
                    }
                    if (openInputStream == null) {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.g());
                    }
                    if (i9 < 26) {
                        createWithBitmap = Icon.createWithBitmap(IconCompat.c(BitmapFactory.decodeStream(openInputStream), false));
                        break;
                    } else {
                        createWithBitmap = d.b(BitmapFactory.decodeStream(openInputStream));
                        break;
                    }
                }
                break;
        }
        ColorStateList colorStateList = iconCompat.f9062g;
        if (colorStateList != null) {
            createWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = iconCompat.f9063h;
        if (mode != IconCompat.f9055k) {
            createWithBitmap.setTintMode(mode);
        }
        return createWithBitmap;
    }
}
