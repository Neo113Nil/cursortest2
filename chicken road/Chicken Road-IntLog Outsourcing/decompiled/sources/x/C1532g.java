package x;

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
import w.C1501c;
import w.C1502d;

/* renamed from: x.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1532g extends C1530e {

    /* renamed from: h, reason: collision with root package name */
    public final Class f12247h;

    /* renamed from: i, reason: collision with root package name */
    public final Constructor f12248i;

    /* renamed from: j, reason: collision with root package name */
    public final Method f12249j;

    /* renamed from: k, reason: collision with root package name */
    public final Method f12250k;

    /* renamed from: l, reason: collision with root package name */
    public final Method f12251l;

    /* renamed from: m, reason: collision with root package name */
    public final Method f12252m;

    /* renamed from: n, reason: collision with root package name */
    public final Method f12253n;

    public C1532g() {
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
            method2 = M(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = N(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e3) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e3.getClass().getName()), e3);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f12247h = cls;
        this.f12248i = constructor;
        this.f12249j = method2;
        this.f12250k = method3;
        this.f12251l = method4;
        this.f12252m = method5;
        this.f12253n = method;
    }

    public static Method M(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public final void G(Object obj) {
        try {
            this.f12252m.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean H(Context context, Object obj, String str, int i2, int i3, int i6, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f12249j.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i6), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface I(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f12247h, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f12253n.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean J(Object obj) {
        try {
            return ((Boolean) this.f12251l.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean K() {
        Method method = this.f12249j;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return method != null;
    }

    public final Object L() {
        try {
            return this.f12248i.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method N(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // x.C1530e, u1.AbstractC1477a
    public final Typeface f(Context context, C1501c c1501c, Resources resources, int i2) {
        if (!K()) {
            return super.f(context, c1501c, resources, i2);
        }
        Object L5 = L();
        if (L5 == null) {
            return null;
        }
        for (C1502d c1502d : c1501c.f12097a) {
            if (!H(context, L5, c1502d.f12098a, c1502d.f12102e, c1502d.f12099b, c1502d.f12100c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c1502d.f12101d))) {
                G(L5);
                return null;
            }
        }
        if (J(L5)) {
            return I(L5);
        }
        return null;
    }

    @Override // x.C1530e, u1.AbstractC1477a
    public final Typeface g(Context context, B.i[] iVarArr, int i2) {
        Typeface I5;
        boolean z;
        if (iVarArr.length < 1) {
            return null;
        }
        if (!K()) {
            B.i o2 = o(iVarArr, i2);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(o2.f124a, "r", null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(o2.f126c).setItalic(o2.f127d).build();
                    openFileDescriptor.close();
                    return build;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap hashMap = new HashMap();
        for (B.i iVar : iVarArr) {
            if (iVar.f128e == 0) {
                Uri uri = iVar.f124a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, B0.f.G(context, uri));
                }
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        Object L5 = L();
        if (L5 == null) {
            return null;
        }
        int length = iVarArr.length;
        int i3 = 0;
        boolean z5 = false;
        while (i3 < length) {
            B.i iVar2 = iVarArr[i3];
            ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(iVar2.f124a);
            if (byteBuffer != null) {
                try {
                    z = ((Boolean) this.f12250k.invoke(L5, byteBuffer, Integer.valueOf(iVar2.f125b), null, Integer.valueOf(iVar2.f126c), Integer.valueOf(iVar2.f127d ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    z = false;
                }
                if (!z) {
                    G(L5);
                    return null;
                }
                z5 = true;
            }
            i3++;
            z5 = z5;
        }
        if (!z5) {
            G(L5);
            return null;
        }
        if (J(L5) && (I5 = I(L5)) != null) {
            return Typeface.create(I5, i2);
        }
        return null;
    }

    @Override // u1.AbstractC1477a
    public final Typeface i(Context context, Resources resources, int i2, String str, int i3) {
        if (!K()) {
            return super.i(context, resources, i2, str, i3);
        }
        Object L5 = L();
        if (L5 == null) {
            return null;
        }
        if (!H(context, L5, str, 0, -1, -1, null)) {
            G(L5);
            return null;
        }
        if (J(L5)) {
            return I(L5);
        }
        return null;
    }
}
