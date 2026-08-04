package I;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import p122r.l;

/* JADX INFO: loaded from: classes.dex */
public final class h extends p113p3.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Class f3474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Constructor f3475e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Method f3476f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Method f3477x;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e7) {
            Log.e("TypefaceCompatApi24Impl", e7.getClass().getName(), e7);
            cls = null;
            method = null;
            method2 = null;
        }
        f3475e = constructor;
        f3474d = cls;
        f3476f = method2;
        f3477x = method;
    }

    public static boolean m0(Object obj, ByteBuffer byteBuffer, int i7, int i8, boolean z4) {
        try {
            return ((Boolean) f3476f.invoke(obj, byteBuffer, Integer.valueOf(i7), null, Integer.valueOf(i8), Boolean.valueOf(z4))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface n0(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f3474d, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f3477x.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069 A[LOOP:0: B:9:0x0014->B:37:0x0069, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x005b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0068 A[SYNTHETIC] */
    @Override // p113p3.f
    public final Typeface v(Context context, H.f fVar, Resources resources, int i7) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        MappedByteBuffer map;
        try {
            objNewInstance = f3475e.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance == null) {
            return null;
        }
        for (H.g gVar : fVar.f3158a) {
            int i8 = gVar.f3164f;
            File fileU = P6.b.u(context);
            if (fileU != null) {
                try {
                    if (P6.b.g(fileU, resources, i8)) {
                        try {
                            FileInputStream fileInputStream = new FileInputStream(fileU);
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                                fileU.delete();
                            } catch (Throwable th) {
                                try {
                                    fileInputStream.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (IOException unused2) {
                            map = null;
                        }
                    } else {
                        fileU.delete();
                    }
                    if (map == null) {
                        return null;
                    }
                    if (!m0(objNewInstance, map, gVar.f3163e, gVar.f3160b, gVar.f3161c)) {
                        return null;
                    }
                } catch (Throwable th3) {
                    fileU.delete();
                    throw th3;
                }
            }
            map = null;
            if (map == null) {
                return null;
            }
            if (!m0(objNewInstance, map, gVar.f3163e, gVar.f3160b, gVar.f3161c)) {
                return null;
            }
        }
        return n0(objNewInstance);
    }

    @Override // p113p3.f
    public final Typeface w(Context context, M.f[] fVarArr, int i7) {
        Object objNewInstance;
        try {
            objNewInstance = f3475e.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance == null) {
            return null;
        }
        l lVar = new l();
        for (M.f fVar : fVarArr) {
            Uri uri = fVar.f4532a;
            ByteBuffer byteBufferA = (ByteBuffer) lVar.getOrDefault(uri, null);
            if (byteBufferA == null) {
                byteBufferA = P6.b.A(context, uri);
                lVar.put(uri, byteBufferA);
            }
            if (byteBufferA == null) {
                return null;
            }
            if (!m0(objNewInstance, byteBufferA, fVar.f4533b, fVar.f4534c, fVar.f4535d)) {
                return null;
            }
        }
        Typeface typefaceN0 = n0(objNewInstance);
        if (typefaceN0 == null) {
            return null;
        }
        return Typeface.create(typefaceN0, i7);
    }
}
