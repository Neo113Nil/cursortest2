package g1;

import G4.l;
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

/* renamed from: g1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1971e extends l {
    public static Class f = null;

    /* renamed from: g, reason: collision with root package name */
    public static Constructor f17082g = null;

    /* renamed from: h, reason: collision with root package name */
    public static Method f17083h = null;
    public static Method i = null;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f17084j = false;

    public static boolean S(Object obj, String str, int i5, boolean z3) {
        T();
        try {
            try {
                return ((Boolean) f17083h.invoke(obj, str, Integer.valueOf(i5), Boolean.valueOf(z3))).booleanValue();
            } catch (InvocationTargetException e3) {
                e = e3;
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InvocationTargetException e5) {
            e = e5;
        }
    }

    public static void T() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f17084j) {
            return;
        }
        f17084j = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e3) {
            Log.e("TypefaceCompatApi21Impl", e3.getClass().getName(), e3);
            method = null;
            cls = null;
            method2 = null;
        }
        f17082g = constructor;
        f = cls;
        f17083h = method2;
        i = method;
    }

    @Override // G4.l
    public Typeface q(Context context, f1.e eVar, Resources resources, int i5) {
        T();
        try {
            Object newInstance = f17082g.newInstance(null);
            for (f1.f fVar : eVar.f16946a) {
                File z3 = N4.b.z(context);
                if (z3 == null) {
                    return null;
                }
                try {
                    if (!N4.b.o(z3, resources, fVar.f)) {
                        return null;
                    }
                    if (!S(newInstance, z3.getPath(), fVar.f16948b, fVar.f16949c)) {
                        return null;
                    }
                    z3.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    z3.delete();
                }
            }
            T();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) f, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) i.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e3) {
                throw new RuntimeException(e3);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e5) {
            throw new RuntimeException(e5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // G4.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Typeface r(Context context, k1.i[] iVarArr, int i5) {
        File file;
        File z3;
        Typeface createFromFile;
        String readlink;
        if (iVarArr.length >= 1) {
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(l.x(iVarArr, i5).f17572a, "r", null);
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
                                Typeface createFromFile2 = Typeface.createFromFile(file);
                                openFileDescriptor.close();
                                return createFromFile2;
                            }
                            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                            z3 = N4.b.z(context);
                            if (z3 != null) {
                                try {
                                } catch (RuntimeException unused2) {
                                } catch (Throwable th) {
                                    z3.delete();
                                    throw th;
                                }
                                if (N4.b.p(z3, fileInputStream)) {
                                    createFromFile = Typeface.createFromFile(z3.getPath());
                                    z3.delete();
                                    fileInputStream.close();
                                    openFileDescriptor.close();
                                    return createFromFile;
                                }
                                z3.delete();
                            }
                            createFromFile = null;
                            fileInputStream.close();
                            openFileDescriptor.close();
                            return createFromFile;
                        }
                        z3 = N4.b.z(context);
                        if (z3 != null) {
                        }
                        createFromFile = null;
                        fileInputStream.close();
                        openFileDescriptor.close();
                        return createFromFile;
                    } finally {
                    }
                    file = null;
                    if (file != null) {
                        Typeface createFromFile22 = Typeface.createFromFile(file);
                        openFileDescriptor.close();
                        return createFromFile22;
                    }
                    FileInputStream fileInputStream2 = new FileInputStream(openFileDescriptor.getFileDescriptor());
                } else if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                    return null;
                }
            } catch (IOException unused3) {
            }
        }
        return null;
    }
}
