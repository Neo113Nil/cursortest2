package s;

/* loaded from: classes.dex */
public abstract class b {
    public static android.net.Uri a(java.lang.Object obj) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return s.d.d(obj);
        }
        try {
            return (android.net.Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
        } catch (java.lang.IllegalAccessException e2) {
            android.util.Log.e("IconCompat", "Unable to get icon uri", e2);
            return null;
        } catch (java.lang.NoSuchMethodException e3) {
            android.util.Log.e("IconCompat", "Unable to get icon uri", e3);
            return null;
        } catch (java.lang.reflect.InvocationTargetException e4) {
            android.util.Log.e("IconCompat", "Unable to get icon uri", e4);
            return null;
        }
    }

    public static android.graphics.drawable.Drawable b(android.graphics.drawable.Icon icon, android.content.Context context) {
        return icon.loadDrawable(context);
    }

    public static android.graphics.drawable.Icon c(androidx.core.graphics.drawable.IconCompat iconCompat, android.content.Context context) {
        android.graphics.drawable.Icon createWithBitmap;
        int i2 = iconCompat.f2174a;
        java.lang.String str = null;
        r2 = null;
        java.io.InputStream openInputStream = null;
        str = null;
        str = null;
        switch (i2) {
            case -1:
                return (android.graphics.drawable.Icon) iconCompat.f2175b;
            case 0:
            default:
                throw new java.lang.IllegalArgumentException("Unknown type");
            case 1:
                createWithBitmap = android.graphics.drawable.Icon.createWithBitmap((android.graphics.Bitmap) iconCompat.f2175b);
                break;
            case 2:
                if (i2 == -1) {
                    int i3 = android.os.Build.VERSION.SDK_INT;
                    java.lang.Object obj = iconCompat.f2175b;
                    if (i3 >= 28) {
                        str = s.d.b(obj);
                    } else {
                        try {
                            str = (java.lang.String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
                        } catch (java.lang.IllegalAccessException e2) {
                            android.util.Log.e("IconCompat", "Unable to get icon package", e2);
                        } catch (java.lang.NoSuchMethodException e3) {
                            android.util.Log.e("IconCompat", "Unable to get icon package", e3);
                        } catch (java.lang.reflect.InvocationTargetException e4) {
                            android.util.Log.e("IconCompat", "Unable to get icon package", e4);
                        }
                    }
                } else {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("called getResPackage() on " + iconCompat);
                    }
                    java.lang.String str2 = iconCompat.f2183j;
                    str = (str2 == null || android.text.TextUtils.isEmpty(str2)) ? ((java.lang.String) iconCompat.f2175b).split(io.appmetrica.analytics.coreutils.internal.StringUtils.PROCESS_POSTFIX_DELIMITER, -1)[0] : iconCompat.f2183j;
                }
                createWithBitmap = android.graphics.drawable.Icon.createWithResource(str, iconCompat.f2178e);
                break;
            case 3:
                createWithBitmap = android.graphics.drawable.Icon.createWithData((byte[]) iconCompat.f2175b, iconCompat.f2178e, iconCompat.f2179f);
                break;
            case 4:
                createWithBitmap = android.graphics.drawable.Icon.createWithContentUri((java.lang.String) iconCompat.f2175b);
                break;
            case 5:
                if (android.os.Build.VERSION.SDK_INT < 26) {
                    createWithBitmap = android.graphics.drawable.Icon.createWithBitmap(androidx.core.graphics.drawable.IconCompat.a((android.graphics.Bitmap) iconCompat.f2175b, false));
                    break;
                } else {
                    createWithBitmap = s.c.b((android.graphics.Bitmap) iconCompat.f2175b);
                    break;
                }
            case 6:
                if (android.os.Build.VERSION.SDK_INT >= 30) {
                    createWithBitmap = s.e.a(iconCompat.d());
                    break;
                } else {
                    if (context == null) {
                        throw new java.lang.IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.d());
                    }
                    android.net.Uri d2 = iconCompat.d();
                    java.lang.String scheme = d2.getScheme();
                    if ("content".equals(scheme) || "file".equals(scheme)) {
                        try {
                            openInputStream = context.getContentResolver().openInputStream(d2);
                        } catch (java.lang.Exception e5) {
                            android.util.Log.w("IconCompat", "Unable to load image from URI: " + d2, e5);
                        }
                    } else {
                        try {
                            openInputStream = new java.io.FileInputStream(new java.io.File((java.lang.String) iconCompat.f2175b));
                        } catch (java.io.FileNotFoundException e6) {
                            android.util.Log.w("IconCompat", "Unable to load image from path: " + d2, e6);
                        }
                    }
                    if (openInputStream == null) {
                        throw new java.lang.IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.d());
                    }
                    if (android.os.Build.VERSION.SDK_INT < 26) {
                        createWithBitmap = android.graphics.drawable.Icon.createWithBitmap(androidx.core.graphics.drawable.IconCompat.a(android.graphics.BitmapFactory.decodeStream(openInputStream), false));
                        break;
                    } else {
                        createWithBitmap = s.c.b(android.graphics.BitmapFactory.decodeStream(openInputStream));
                        break;
                    }
                }
        }
        android.content.res.ColorStateList colorStateList = iconCompat.f2180g;
        if (colorStateList != null) {
            createWithBitmap.setTintList(colorStateList);
        }
        android.graphics.PorterDuff.Mode mode = iconCompat.f2181h;
        if (mode != androidx.core.graphics.drawable.IconCompat.f2173k) {
            createWithBitmap.setTintMode(mode);
        }
        return createWithBitmap;
    }
}
