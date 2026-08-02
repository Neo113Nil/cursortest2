package I;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class i extends g {

    /* renamed from: A, reason: collision with root package name */
    public final Constructor f3478A;

    /* renamed from: B, reason: collision with root package name */
    public final Method f3479B;

    /* renamed from: C, reason: collision with root package name */
    public final Method f3480C;

    /* renamed from: D, reason: collision with root package name */
    public final Method f3481D;

    /* renamed from: E, reason: collision with root package name */
    public final Method f3482E;

    /* renamed from: F, reason: collision with root package name */
    public final Method f3483F;

    /* renamed from: z, reason: collision with root package name */
    public final Class f3484z;

    public i() {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            method2 = u0(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = v0(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e7) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e7.getClass().getName()), e7);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f3484z = cls;
        this.f3478A = constructor;
        this.f3479B = method2;
        this.f3480C = method3;
        this.f3481D = method4;
        this.f3482E = method5;
        this.f3483F = method;
    }

    public static Method u0(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public final void o0(Object obj) {
        try {
            this.f3482E.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean p0(Context context, Object obj, String str, int i7, int i8, int i9, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f3479B.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface q0(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f3484z, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f3483F.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean r0(Object obj) {
        try {
            return ((Boolean) this.f3481D.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean s0() {
        Method method = this.f3479B;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return method != null;
    }

    public final Object t0() {
        try {
            return this.f3478A.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // I.g, p3.f
    public final Typeface v(Context context, H.f fVar, Resources resources, int i7) {
        if (!s0()) {
            return super.v(context, fVar, resources, i7);
        }
        Object t02 = t0();
        if (t02 == null) {
            return null;
        }
        for (H.g gVar : fVar.f3158a) {
            if (!p0(context, t02, gVar.f3159a, gVar.f3163e, gVar.f3160b, gVar.f3161c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(gVar.f3162d))) {
                o0(t02);
                return null;
            }
        }
        if (r0(t02)) {
            return q0(t02);
        }
        return null;
    }

    public Method v0(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // I.g, p3.f
    public final Typeface w(Context context, M.f[] fVarArr, int i7) {
        Typeface q02;
        boolean z4;
        if (fVarArr.length < 1) {
            return null;
        }
        if (!s0()) {
            M.f G2 = G(fVarArr, i7);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(G2.f4532a, "r", null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(G2.f4534c).setItalic(G2.f4535d).build();
                    openFileDescriptor.close();
                    return build;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap hashMap = new HashMap();
        for (M.f fVar : fVarArr) {
            if (fVar.f4536e == 0) {
                Uri uri = fVar.f4532a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, P6.b.A(context, uri));
                }
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        Object t02 = t0();
        if (t02 == null) {
            return null;
        }
        int length = fVarArr.length;
        int i8 = 0;
        boolean z7 = false;
        while (i8 < length) {
            M.f fVar2 = fVarArr[i8];
            ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(fVar2.f4532a);
            if (byteBuffer != null) {
                try {
                    z4 = ((Boolean) this.f3480C.invoke(t02, byteBuffer, Integer.valueOf(fVar2.f4533b), null, Integer.valueOf(fVar2.f4534c), Integer.valueOf(fVar2.f4535d ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    z4 = false;
                }
                if (!z4) {
                    o0(t02);
                    return null;
                }
                z7 = true;
            }
            i8++;
            z7 = z7;
        }
        if (!z7) {
            o0(t02);
            return null;
        }
        if (r0(t02) && (q02 = q0(t02)) != null) {
            return Typeface.create(q02, i7);
        }
        return null;
    }

    @Override // p3.f
    public final Typeface y(Context context, Resources resources, int i7, String str, int i8) {
        if (!s0()) {
            return super.y(context, resources, i7, str, i8);
        }
        Object t02 = t0();
        if (t02 == null) {
            return null;
        }
        if (!p0(context, t02, str, 0, -1, -1, null)) {
            o0(t02);
            return null;
        }
        if (r0(t02)) {
            return q0(t02);
        }
        return null;
    }
}
