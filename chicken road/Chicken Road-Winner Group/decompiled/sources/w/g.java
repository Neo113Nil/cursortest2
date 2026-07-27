package w;

import A.j;
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
import v.C1213c;
import v.C1214d;

/* loaded from: classes.dex */
public class g extends e {

    /* renamed from: m, reason: collision with root package name */
    public final Class f10449m;

    /* renamed from: n, reason: collision with root package name */
    public final Constructor f10450n;

    /* renamed from: o, reason: collision with root package name */
    public final Method f10451o;

    /* renamed from: p, reason: collision with root package name */
    public final Method f10452p;

    /* renamed from: q, reason: collision with root package name */
    public final Method f10453q;

    /* renamed from: r, reason: collision with root package name */
    public final Method f10454r;

    /* renamed from: s, reason: collision with root package name */
    public final Method f10455s;

    public g() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = a0(cls);
            Class cls2 = Integer.TYPE;
            method3 = cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
            method4 = cls.getMethod("freeze", new Class[0]);
            method = cls.getMethod("abortCreation", new Class[0]);
            method5 = b0(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e3) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e3.getClass().getName()), e3);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f10449m = cls;
        this.f10450n = constructor;
        this.f10451o = method2;
        this.f10452p = method3;
        this.f10453q = method4;
        this.f10454r = method;
        this.f10455s = method5;
    }

    public static Method a0(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public final void V(Object obj) {
        try {
            this.f10454r.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean W(Context context, Object obj, String str, int i3, int i4, int i5, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f10451o.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface X(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f10449m, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f10455s.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean Y(Object obj) {
        try {
            return ((Boolean) this.f10453q.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final Object Z() {
        try {
            return this.f10450n.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method b0(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // w.e, F2.b
    public final Typeface l(Context context, C1213c c1213c, Resources resources, int i3) {
        Method method = this.f10451o;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.l(context, c1213c, resources, i3);
        }
        Object Z2 = Z();
        if (Z2 != null) {
            C1214d[] c1214dArr = c1213c.f10395a;
            int length = c1214dArr.length;
            int i4 = 0;
            while (i4 < length) {
                C1214d c1214d = c1214dArr[i4];
                String str = c1214d.f10396a;
                FontVariationAxis[] fromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(c1214d.f10399d);
                Context context2 = context;
                if (!W(context2, Z2, str, c1214d.f10400e, c1214d.f10397b, c1214d.f10398c ? 1 : 0, fromFontVariationSettings)) {
                    V(Z2);
                    return null;
                }
                i4++;
                context = context2;
            }
            if (Y(Z2)) {
                return X(Z2);
            }
        }
        return null;
    }

    @Override // w.e, F2.b
    public final Typeface m(Context context, j[] jVarArr, int i3) {
        Typeface X2;
        boolean z3;
        if (jVarArr.length >= 1) {
            Method method = this.f10451o;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            if (method != null) {
                HashMap hashMap = new HashMap();
                for (j jVar : jVarArr) {
                    if (jVar.f28e == 0) {
                        Uri uri = jVar.f24a;
                        if (!hashMap.containsKey(uri)) {
                            hashMap.put(uri, X0.a.B(context, uri));
                        }
                    }
                }
                Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
                Object Z2 = Z();
                if (Z2 != null) {
                    int length = jVarArr.length;
                    int i4 = 0;
                    boolean z4 = false;
                    while (i4 < length) {
                        j jVar2 = jVarArr[i4];
                        ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(jVar2.f24a);
                        if (byteBuffer != null) {
                            try {
                                z3 = ((Boolean) this.f10452p.invoke(Z2, byteBuffer, Integer.valueOf(jVar2.f25b), null, Integer.valueOf(jVar2.f26c), Integer.valueOf(jVar2.f27d ? 1 : 0))).booleanValue();
                            } catch (IllegalAccessException | InvocationTargetException unused) {
                                z3 = false;
                            }
                            if (!z3) {
                                V(Z2);
                                return null;
                            }
                            z4 = true;
                        }
                        i4++;
                        z4 = z4;
                    }
                    if (!z4) {
                        V(Z2);
                        return null;
                    }
                    if (Y(Z2) && (X2 = X(Z2)) != null) {
                        return Typeface.create(X2, i3);
                    }
                }
            } else {
                j r3 = r(jVarArr, i3);
                try {
                    ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(r3.f24a, "r", null);
                    if (openFileDescriptor != null) {
                        try {
                            Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(r3.f26c).setItalic(r3.f27d).build();
                            openFileDescriptor.close();
                            return build;
                        } finally {
                        }
                    }
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                        return null;
                    }
                } catch (IOException unused2) {
                }
            }
        }
        return null;
    }

    @Override // F2.b
    public final Typeface o(Context context, Resources resources, int i3, String str, int i4) {
        Method method = this.f10451o;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.o(context, resources, i3, str, i4);
        }
        Object Z2 = Z();
        if (Z2 != null) {
            if (!W(context, Z2, str, 0, -1, -1, null)) {
                V(Z2);
                return null;
            }
            if (Y(Z2)) {
                return X(Z2);
            }
        }
        return null;
    }
}
