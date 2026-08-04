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

/* JADX INFO: loaded from: classes.dex */
public class g extends p113p3.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Class f3469d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Constructor f3470e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Method f3471f = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static Method f3472x = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static boolean f3473y = false;

    public static boolean m0(Object obj, String str, int i7, boolean z4) throws NoSuchMethodException {
        n0();
        try {
            return ((Boolean) f3471f.invoke(obj, str, Integer.valueOf(i7), Boolean.valueOf(z4))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e7) {
            throw new RuntimeException(e7);
        }
    }

    public static void n0() throws NoSuchMethodException {
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

    @Override // p113p3.f
    public Typeface v(Context context, H.f fVar, Resources resources, int i7) throws NoSuchMethodException {
        n0();
        try {
            Object objNewInstance = f3470e.newInstance(null);
            for (H.g gVar : fVar.f3158a) {
                File fileU = P6.b.u(context);
                if (fileU == null) {
                    return null;
                }
                try {
                    if (!P6.b.g(fileU, resources, gVar.f3164f)) {
                        return null;
                    }
                    if (!m0(objNewInstance, fileU.getPath(), gVar.f3160b, gVar.f3161c)) {
                        return null;
                    }
                    fileU.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileU.delete();
                }
            }
            n0();
            try {
                Object objNewInstance2 = Array.newInstance((Class<?>) f3469d, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) f3472x.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e7) {
                throw new RuntimeException(e7);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e8) {
            throw new RuntimeException(e8);
        }
    }

    @Override // p113p3.f
    public Typeface w(Context context, M.f[] fVarArr, int i7) {
        File file;
        if (fVarArr.length < 1) {
            return null;
        }
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(G(fVarArr, i7).f4532a, "r", null);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return null;
            }
            try {
                try {
                    String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptorOpenFileDescriptor.getFd());
                    file = OsConstants.S_ISREG(Os.stat(str).st_mode) ? new File(str) : null;
                } catch (ErrnoException unused) {
                }
                if (file != null && file.canRead()) {
                    Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceCreateFromFile;
                }
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    Typeface typefaceX = x(context, fileInputStream);
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceX;
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (IOException unused2) {
            return null;
        }
    }
}
