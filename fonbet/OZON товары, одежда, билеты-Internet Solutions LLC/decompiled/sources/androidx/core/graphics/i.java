package androidx.core.graphics;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.content.res.e;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import v2.C10195j;

/* loaded from: classes8.dex */
public class i extends h {

    /* renamed from: f, reason: collision with root package name */
    protected final Class<?> f42165f;

    /* renamed from: g, reason: collision with root package name */
    protected final Constructor<?> f42166g;

    /* renamed from: h, reason: collision with root package name */
    protected final Method f42167h;

    /* renamed from: i, reason: collision with root package name */
    protected final Method f42168i;

    /* renamed from: j, reason: collision with root package name */
    protected final Method f42169j;

    /* renamed from: k, reason: collision with root package name */
    protected final Method f42170k;

    /* renamed from: l, reason: collision with root package name */
    protected final Method f42171l;

    public i() {
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
            method2 = l(cls);
            Class cls2 = Integer.TYPE;
            method3 = cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
            method4 = cls.getMethod("freeze", new Class[0]);
            method = cls.getMethod("abortCreation", new Class[0]);
            method5 = m(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e11) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e11.getClass().getName()), e11);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f42165f = cls;
        this.f42166g = constructor;
        this.f42167h = method2;
        this.f42168i = method3;
        this.f42169j = method4;
        this.f42170k = method;
        this.f42171l = method5;
    }

    private void g(Object obj) {
        try {
            this.f42170k.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    private boolean h(Context context, Object obj, String str, int i11, int i12, int i13, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f42167h.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean j(Object obj) {
        try {
            return ((Boolean) this.f42169j.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private Object k() {
        try {
            return this.f42166g.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    protected static Method l(Class cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    @Override // androidx.core.graphics.h, androidx.core.graphics.l
    public final Typeface a(Context context, e.c cVar, Resources resources, int i11) {
        Method method = this.f42167h;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.a(context, cVar, resources, i11);
        }
        Object k11 = k();
        if (k11 != null) {
            e.d[] a11 = cVar.a();
            int length = a11.length;
            int i12 = 0;
            while (i12 < length) {
                e.d dVar = a11[i12];
                String a12 = dVar.a();
                int c11 = dVar.c();
                int e11 = dVar.e();
                boolean f7 = dVar.f();
                Context context2 = context;
                if (!h(context2, k11, a12, c11, e11, f7 ? 1 : 0, FontVariationAxis.fromFontVariationSettings(dVar.d()))) {
                    g(k11);
                    return null;
                }
                i12++;
                context = context2;
            }
            if (j(k11)) {
                return i(k11);
            }
        }
        return null;
    }

    @Override // androidx.core.graphics.l
    public final Typeface b(Context context, @NonNull C10195j.b[] bVarArr, int i11) {
        Typeface i12;
        boolean z11;
        if (bVarArr.length >= 1) {
            Method method = this.f42167h;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            if (method != null) {
                HashMap hashMap = new HashMap();
                for (C10195j.b bVar : bVarArr) {
                    if (bVar.a() == 0) {
                        Uri c11 = bVar.c();
                        if (!hashMap.containsKey(c11)) {
                            hashMap.put(c11, m.e(context, c11));
                        }
                    }
                }
                Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
                Object k11 = k();
                if (k11 != null) {
                    int length = bVarArr.length;
                    int i13 = 0;
                    boolean z12 = false;
                    while (i13 < length) {
                        C10195j.b bVar2 = bVarArr[i13];
                        ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(bVar2.c());
                        if (byteBuffer != null) {
                            try {
                                z11 = ((Boolean) this.f42168i.invoke(k11, byteBuffer, Integer.valueOf(bVar2.b()), null, Integer.valueOf(bVar2.d()), Integer.valueOf(bVar2.e() ? 1 : 0))).booleanValue();
                            } catch (IllegalAccessException | InvocationTargetException unused) {
                                z11 = false;
                            }
                            if (!z11) {
                                g(k11);
                                return null;
                            }
                            z12 = true;
                        }
                        i13++;
                        z12 = z12;
                    }
                    if (!z12) {
                        g(k11);
                        return null;
                    }
                    if (j(k11) && (i12 = i(k11)) != null) {
                        return Typeface.create(i12, i11);
                    }
                }
            } else {
                C10195j.b d11 = d(i11, bVarArr);
                try {
                    ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(d11.c(), "r", null);
                    if (openFileDescriptor != null) {
                        try {
                            Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(d11.d()).setItalic(d11.e()).build();
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

    @Override // androidx.core.graphics.l
    public final Typeface c(Context context, Resources resources, int i11, String str, int i12) {
        Method method = this.f42167h;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.c(context, resources, i11, str, i12);
        }
        Object k11 = k();
        if (k11 != null) {
            if (!h(context, k11, str, 0, -1, -1, null)) {
                g(k11);
                return null;
            }
            if (j(k11)) {
                return i(k11);
            }
        }
        return null;
    }

    protected Typeface i(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f42165f, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f42171l.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    protected Method m(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance(cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
