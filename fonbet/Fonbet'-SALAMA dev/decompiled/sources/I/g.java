package I;

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

/* loaded from: classes.dex */
public class g extends p3.f {

    /* renamed from: d, reason: collision with root package name */
    public static Class f3469d = null;

    /* renamed from: e, reason: collision with root package name */
    public static Constructor f3470e = null;

    /* renamed from: f, reason: collision with root package name */
    public static Method f3471f = null;

    /* renamed from: x, reason: collision with root package name */
    public static Method f3472x = null;

    /* renamed from: y, reason: collision with root package name */
    public static boolean f3473y = false;

    public static boolean m0(Object obj, String str, int i7, boolean z4) {
        n0();
        try {
            return ((Boolean) f3471f.invoke(obj, str, Integer.valueOf(i7), Boolean.valueOf(z4))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e7) {
            throw new RuntimeException(e7);
        }
    }

    public static void n0() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f3473y) {
            return;
        }
        f3473y = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e7) {
            Log.e("TypefaceCompatApi21Impl", e7.getClass().getName(), e7);
            method = null;
            cls = null;
            method2 = null;
        }
        f3470e = constructor;
        f3469d = cls;
        f3471f = method2;
        f3472x = method;
    }

    @Override // p3.f
    public Typeface v(Context context, H.f fVar, Resources resources, int i7) {
        n0();
        try {
            Object newInstance = f3470e.newInstance(null);
            for (H.g gVar : fVar.f3158a) {
                File u4 = P6.b.u(context);
                if (u4 == null) {
                    return null;
                }
                try {
                    if (!P6.b.g(u4, resources, gVar.f3164f)) {
                        return null;
                    }
                    if (!m0(newInstance, u4.getPath(), gVar.f3160b, gVar.f3161c)) {
                        return null;
                    }
                    u4.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    u4.delete();
                }
            }
            n0();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) f3469d, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f3472x.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e7) {
                throw new RuntimeException(e7);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e8) {
            throw new RuntimeException(e8);
        }
    }

    @Override // p3.f
    public Typeface w(Context context, M.f[] fVarArr, int i7) {
        File file;
        String readlink;
        if (fVarArr.length < 1) {
            return null;
        }
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(G(fVarArr, i7).f4532a, "r", null);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                try {
                    readlink = Os.readlink("/proc/self/fd/" + openFileDescriptor.getFd());
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
                        Typeface x4 = x(context, fileInputStream);
                        fileInputStream.close();
                        openFileDescriptor.close();
                        return x4;
                    }
                    Typeface x42 = x(context, fileInputStream);
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return x42;
                } finally {
                }
                file = null;
                if (file != null) {
                    Typeface createFromFile2 = Typeface.createFromFile(file);
                    openFileDescriptor.close();
                    return createFromFile2;
                }
                FileInputStream fileInputStream2 = new FileInputStream(openFileDescriptor.getFileDescriptor());
            } finally {
            }
        } catch (IOException unused2) {
            return null;
        }
    }
}
