package g1;

import G4.l;
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
import r.Q;

/* renamed from: g1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1972f extends l {
    public static final Class f;

    /* renamed from: g, reason: collision with root package name */
    public static final Constructor f17085g;

    /* renamed from: h, reason: collision with root package name */
    public static final Method f17086h;
    public static final Method i;

    static {
        Method method;
        Class<?> cls;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e3) {
            Log.e("TypefaceCompatApi24Impl", e3.getClass().getName(), e3);
            method = null;
            cls = null;
            method2 = null;
        }
        f17085g = constructor;
        f = cls;
        f17086h = method2;
        i = method;
    }

    public static boolean S(Object obj, ByteBuffer byteBuffer, int i5, int i6, boolean z3) {
        try {
            return ((Boolean) f17086h.invoke(obj, byteBuffer, Integer.valueOf(i5), null, Integer.valueOf(i6), Boolean.valueOf(z3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface T(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) f, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) i.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067 A[SYNTHETIC] */
    @Override // G4.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Typeface q(Context context, f1.e eVar, Resources resources, int i5) {
        Object obj;
        MappedByteBuffer mappedByteBuffer;
        FileInputStream fileInputStream;
        try {
            obj = f17085g.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            for (f1.f fVar : eVar.f16946a) {
                int i6 = fVar.f;
                File z3 = N4.b.z(context);
                if (z3 != null) {
                    try {
                        if (N4.b.o(z3, resources, i6)) {
                            try {
                                fileInputStream = new FileInputStream(z3);
                            } catch (IOException unused2) {
                                mappedByteBuffer = null;
                            }
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                                if (mappedByteBuffer == null) {
                                    if (S(obj, mappedByteBuffer, fVar.f16951e, fVar.f16948b, fVar.f16949c)) {
                                    }
                                }
                            } finally {
                            }
                        }
                    } finally {
                        z3.delete();
                    }
                }
                mappedByteBuffer = null;
                if (mappedByteBuffer == null) {
                }
            }
            return T(obj);
        }
        return null;
    }

    @Override // G4.l
    public final Typeface r(Context context, k1.i[] iVarArr, int i5) {
        Object obj;
        try {
            obj = f17085g.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            int i6 = 0;
            Q q5 = new Q(0);
            int length = iVarArr.length;
            while (true) {
                if (i6 >= length) {
                    Typeface T4 = T(obj);
                    if (T4 != null) {
                        return Typeface.create(T4, i5);
                    }
                } else {
                    k1.i iVar = iVarArr[i6];
                    Uri uri = iVar.f17572a;
                    ByteBuffer byteBuffer = (ByteBuffer) q5.get(uri);
                    if (byteBuffer == null) {
                        byteBuffer = N4.b.L(context, uri);
                        q5.put(uri, byteBuffer);
                    }
                    if (byteBuffer == null) {
                        break;
                    }
                    if (!S(obj, byteBuffer, iVar.f17573b, iVar.f17574c, iVar.f17575d)) {
                        break;
                    }
                    i6++;
                }
            }
        }
        return null;
    }
}
