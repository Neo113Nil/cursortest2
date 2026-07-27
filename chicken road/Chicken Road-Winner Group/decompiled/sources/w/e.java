package w;

import A.j;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import v.C1213c;
import v.C1214d;

/* loaded from: classes.dex */
public class e extends F2.b {

    /* renamed from: h, reason: collision with root package name */
    public static Class f10440h = null;

    /* renamed from: i, reason: collision with root package name */
    public static Constructor f10441i = null;

    /* renamed from: j, reason: collision with root package name */
    public static Method f10442j = null;

    /* renamed from: k, reason: collision with root package name */
    public static Method f10443k = null;

    /* renamed from: l, reason: collision with root package name */
    public static boolean f10444l = false;

    public static boolean T(Object obj, String str, int i3, boolean z3) {
        U();
        try {
            return ((Boolean) f10442j.invoke(obj, str, Integer.valueOf(i3), Boolean.valueOf(z3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    public static void U() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        if (f10444l) {
            return;
        }
        f10444l = true;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e3) {
            Log.e("TypefaceCompatApi21Impl", e3.getClass().getName(), e3);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f10441i = constructor;
        f10440h = cls;
        f10442j = method2;
        f10443k = method;
    }

    @Override // F2.b
    public Typeface l(Context context, C1213c c1213c, Resources resources, int i3) {
        U();
        try {
            Object newInstance = f10441i.newInstance(new Object[0]);
            for (C1214d c1214d : c1213c.f10395a) {
                File u3 = X0.a.u(context);
                if (u3 == null) {
                    return null;
                }
                try {
                    if (!X0.a.l(u3, resources, c1214d.f)) {
                        return null;
                    }
                    if (!T(newInstance, u3.getPath(), c1214d.f10397b, c1214d.f10398c)) {
                        return null;
                    }
                    u3.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    u3.delete();
                }
            }
            U();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) f10440h, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f10443k.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e3) {
                throw new RuntimeException(e3);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    @Override // F2.b
    public Typeface m(Context context, j[] jVarArr, int i3) {
        File file;
        String readlink;
        if (jVarArr.length >= 1) {
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(r(jVarArr, i3).f24a, "r", null);
                if (openFileDescriptor != null) {
                    try {
                        try {
                            readlink = Os.readlink("/proc/self/fd/" + openFileDescriptor.getFd());
                        } finally {
                        }
                    } catch (ErrnoException unused) {
                    }
                    try {
                        if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                            file = new File(readlink);
                            if (file != null && file.canRead()) {
                                Typeface createFromFile = Typeface.createFromFile(file);
                                openFileDescriptor.close();
                                return createFromFile;
                            }
                            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                            Typeface n3 = n(context, fileInputStream);
                            fileInputStream.close();
                            openFileDescriptor.close();
                            return n3;
                        }
                        Typeface n32 = n(context, fileInputStream);
                        fileInputStream.close();
                        openFileDescriptor.close();
                        return n32;
                    } finally {
                    }
                    file = null;
                    if (file != null) {
                        Typeface createFromFile2 = Typeface.createFromFile(file);
                        openFileDescriptor.close();
                        return createFromFile2;
                    }
                    FileInputStream fileInputStream2 = new FileInputStream(openFileDescriptor.getFileDescriptor());
                } else if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                    return null;
                }
            } catch (IOException unused2) {
            }
        }
        return null;
    }
}
