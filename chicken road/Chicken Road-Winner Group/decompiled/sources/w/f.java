package w;

import A.j;
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
import p.C1161k;
import v.C1213c;
import v.C1214d;

/* loaded from: classes.dex */
public final class f extends F2.b {

    /* renamed from: h, reason: collision with root package name */
    public static final Class f10445h;

    /* renamed from: i, reason: collision with root package name */
    public static final Constructor f10446i;

    /* renamed from: j, reason: collision with root package name */
    public static final Method f10447j;

    /* renamed from: k, reason: collision with root package name */
    public static final Method f10448k;

    static {
        Class<?> cls;
        Constructor<?> constructor;
        Method method;
        Method method2;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            Class cls2 = Integer.TYPE;
            method = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e3) {
            Log.e("TypefaceCompatApi24Impl", e3.getClass().getName(), e3);
            cls = null;
            constructor = null;
            method = null;
            method2 = null;
        }
        f10446i = constructor;
        f10445h = cls;
        f10447j = method;
        f10448k = method2;
    }

    public static boolean T(Object obj, ByteBuffer byteBuffer, int i3, int i4, boolean z3) {
        try {
            return ((Boolean) f10447j.invoke(obj, byteBuffer, Integer.valueOf(i3), null, Integer.valueOf(i4), Boolean.valueOf(z3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface U(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) f10445h, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f10448k.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0068 A[SYNTHETIC] */
    @Override // F2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Typeface l(Context context, C1213c c1213c, Resources resources, int i3) {
        Object obj;
        MappedByteBuffer mappedByteBuffer;
        FileInputStream fileInputStream;
        try {
            obj = f10446i.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            for (C1214d c1214d : c1213c.f10395a) {
                int i4 = c1214d.f;
                File u3 = X0.a.u(context);
                if (u3 != null) {
                    try {
                        if (X0.a.l(u3, resources, i4)) {
                            try {
                                fileInputStream = new FileInputStream(u3);
                            } catch (IOException unused2) {
                                mappedByteBuffer = null;
                            }
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                                if (mappedByteBuffer == null) {
                                    if (T(obj, mappedByteBuffer, c1214d.f10400e, c1214d.f10397b, c1214d.f10398c)) {
                                    }
                                }
                            } finally {
                            }
                        }
                    } finally {
                        u3.delete();
                    }
                }
                mappedByteBuffer = null;
                if (mappedByteBuffer == null) {
                }
            }
            return U(obj);
        }
        return null;
    }

    @Override // F2.b
    public final Typeface m(Context context, j[] jVarArr, int i3) {
        Object obj;
        int i4 = 0;
        try {
            obj = f10446i.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            C1161k c1161k = new C1161k();
            int length = jVarArr.length;
            while (true) {
                if (i4 >= length) {
                    Typeface U2 = U(obj);
                    if (U2 != null) {
                        return Typeface.create(U2, i3);
                    }
                } else {
                    j jVar = jVarArr[i4];
                    Uri uri = jVar.f24a;
                    ByteBuffer byteBuffer = (ByteBuffer) c1161k.getOrDefault(uri, null);
                    if (byteBuffer == null) {
                        byteBuffer = X0.a.B(context, uri);
                        c1161k.put(uri, byteBuffer);
                    }
                    if (byteBuffer == null) {
                        break;
                    }
                    if (!T(obj, byteBuffer, jVar.f25b, jVar.f26c, jVar.f27d)) {
                        break;
                    }
                    i4++;
                }
            }
        }
        return null;
    }
}
