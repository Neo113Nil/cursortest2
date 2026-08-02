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
import r.l;

/* loaded from: classes.dex */
public final class h extends p3.f {

    /* renamed from: d, reason: collision with root package name */
    public static final Class f3474d;

    /* renamed from: e, reason: collision with root package name */
    public static final Constructor f3475e;

    /* renamed from: f, reason: collision with root package name */
    public static final Method f3476f;

    /* renamed from: x, reason: collision with root package name */
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
            Object newInstance = Array.newInstance((Class<?>) f3474d, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f3477x.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b A[SYNTHETIC] */
    @Override // p3.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Typeface v(Context context, H.f fVar, Resources resources, int i7) {
        Object obj;
        MappedByteBuffer mappedByteBuffer;
        FileInputStream fileInputStream;
        try {
            obj = f3475e.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        for (H.g gVar : fVar.f3158a) {
            int i8 = gVar.f3164f;
            File u4 = P6.b.u(context);
            if (u4 != null) {
                try {
                    if (P6.b.g(u4, resources, i8)) {
                        try {
                            fileInputStream = new FileInputStream(u4);
                        } catch (IOException unused2) {
                            mappedByteBuffer = null;
                        }
                        try {
                            FileChannel channel = fileInputStream.getChannel();
                            mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                            fileInputStream.close();
                            if (mappedByteBuffer != null) {
                                return null;
                            }
                            if (!m0(obj, mappedByteBuffer, gVar.f3163e, gVar.f3160b, gVar.f3161c)) {
                                return null;
                            }
                        } finally {
                        }
                    }
                } finally {
                    u4.delete();
                }
            }
            mappedByteBuffer = null;
            if (mappedByteBuffer != null) {
            }
        }
        return n0(obj);
    }

    @Override // p3.f
    public final Typeface w(Context context, M.f[] fVarArr, int i7) {
        Object obj;
        try {
            obj = f3475e.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        l lVar = new l();
        for (M.f fVar : fVarArr) {
            Uri uri = fVar.f4532a;
            ByteBuffer byteBuffer = (ByteBuffer) lVar.getOrDefault(uri, null);
            if (byteBuffer == null) {
                byteBuffer = P6.b.A(context, uri);
                lVar.put(uri, byteBuffer);
            }
            if (byteBuffer == null) {
                return null;
            }
            if (!m0(obj, byteBuffer, fVar.f4533b, fVar.f4534c, fVar.f4535d)) {
                return null;
            }
        }
        Typeface n02 = n0(obj);
        if (n02 == null) {
            return null;
        }
        return Typeface.create(n02, i7);
    }
}
