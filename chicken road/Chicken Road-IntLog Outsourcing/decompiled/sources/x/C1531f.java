package x;

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
import r.C1401k;
import u1.AbstractC1477a;
import w.C1501c;
import w.C1502d;

/* renamed from: x.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1531f extends AbstractC1477a {

    /* renamed from: c, reason: collision with root package name */
    public static final Class f12243c;

    /* renamed from: d, reason: collision with root package name */
    public static final Constructor f12244d;

    /* renamed from: e, reason: collision with root package name */
    public static final Method f12245e;

    /* renamed from: f, reason: collision with root package name */
    public static final Method f12246f;

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
        } catch (ClassNotFoundException | NoSuchMethodException e3) {
            Log.e("TypefaceCompatApi24Impl", e3.getClass().getName(), e3);
            cls = null;
            method = null;
            method2 = null;
        }
        f12244d = constructor;
        f12243c = cls;
        f12245e = method2;
        f12246f = method;
    }

    public static boolean E(Object obj, ByteBuffer byteBuffer, int i2, int i3, boolean z) {
        try {
            return ((Boolean) f12245e.invoke(obj, byteBuffer, Integer.valueOf(i2), null, Integer.valueOf(i3), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface F(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) f12243c, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f12246f.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b A[SYNTHETIC] */
    @Override // u1.AbstractC1477a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Typeface f(Context context, C1501c c1501c, Resources resources, int i2) {
        Object obj;
        MappedByteBuffer mappedByteBuffer;
        FileInputStream fileInputStream;
        try {
            obj = f12244d.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        for (C1502d c1502d : c1501c.f12097a) {
            int i3 = c1502d.f12103f;
            File x5 = B0.f.x(context);
            if (x5 != null) {
                try {
                    if (B0.f.n(x5, resources, i3)) {
                        try {
                            fileInputStream = new FileInputStream(x5);
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
                            if (!E(obj, mappedByteBuffer, c1502d.f12102e, c1502d.f12099b, c1502d.f12100c)) {
                                return null;
                            }
                        } finally {
                        }
                    }
                } finally {
                    x5.delete();
                }
            }
            mappedByteBuffer = null;
            if (mappedByteBuffer != null) {
            }
        }
        return F(obj);
    }

    @Override // u1.AbstractC1477a
    public final Typeface g(Context context, B.i[] iVarArr, int i2) {
        Object obj;
        try {
            obj = f12244d.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        C1401k c1401k = new C1401k();
        for (B.i iVar : iVarArr) {
            Uri uri = iVar.f124a;
            ByteBuffer byteBuffer = (ByteBuffer) c1401k.getOrDefault(uri, null);
            if (byteBuffer == null) {
                byteBuffer = B0.f.G(context, uri);
                c1401k.put(uri, byteBuffer);
            }
            if (byteBuffer == null) {
                return null;
            }
            if (!E(obj, byteBuffer, iVar.f125b, iVar.f126c, iVar.f127d)) {
                return null;
            }
        }
        Typeface F2 = F(obj);
        if (F2 == null) {
            return null;
        }
        return Typeface.create(F2, i2);
    }
}
