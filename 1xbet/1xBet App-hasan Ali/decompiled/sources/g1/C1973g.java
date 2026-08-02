package g1;

import G4.l;
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

/* renamed from: g1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1973g extends C1971e {

    /* renamed from: k, reason: collision with root package name */
    public final Class f17087k;

    /* renamed from: l, reason: collision with root package name */
    public final Constructor f17088l;

    /* renamed from: m, reason: collision with root package name */
    public final Method f17089m;

    /* renamed from: n, reason: collision with root package name */
    public final Method f17090n;

    /* renamed from: o, reason: collision with root package name */
    public final Method f17091o;

    /* renamed from: p, reason: collision with root package name */
    public final Method f17092p;

    /* renamed from: q, reason: collision with root package name */
    public final Method f17093q;

    public C1973g() {
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
            method2 = Z(cls2);
            Class<?> cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = a0(cls2);
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
        this.f17087k = cls;
        this.f17088l = constructor;
        this.f17089m = method2;
        this.f17090n = method3;
        this.f17091o = method4;
        this.f17092p = method5;
        this.f17093q = method;
    }

    public static Method Z(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public final void U(Object obj) {
        try {
            this.f17092p.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean V(Context context, Object obj, String str, int i, int i5, int i6, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f17089m.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i5), Integer.valueOf(i6), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface W(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f17087k, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f17093q.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean X(Object obj) {
        try {
            return ((Boolean) this.f17091o.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final Object Y() {
        try {
            return this.f17088l.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method a0(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // g1.C1971e, G4.l
    public final Typeface q(Context context, f1.e eVar, Resources resources, int i) {
        Method method = this.f17089m;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.q(context, eVar, resources, i);
        }
        Object Y4 = Y();
        if (Y4 != null) {
            f1.f[] fVarArr = eVar.f16946a;
            int length = fVarArr.length;
            int i5 = 0;
            while (i5 < length) {
                f1.f fVar = fVarArr[i5];
                String str = fVar.f16947a;
                FontVariationAxis[] fromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(fVar.f16950d);
                Context context2 = context;
                if (!V(context2, Y4, str, fVar.f16951e, fVar.f16948b, fVar.f16949c ? 1 : 0, fromFontVariationSettings)) {
                    U(Y4);
                    return null;
                }
                i5++;
                context = context2;
            }
            if (X(Y4)) {
                return W(Y4);
            }
        }
        return null;
    }

    @Override // g1.C1971e, G4.l
    public final Typeface r(Context context, k1.i[] iVarArr, int i) {
        Typeface W4;
        boolean z3;
        if (iVarArr.length >= 1) {
            Method method = this.f17089m;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            if (method != null) {
                HashMap hashMap = new HashMap();
                for (k1.i iVar : iVarArr) {
                    if (iVar.f == 0) {
                        Uri uri = iVar.f17572a;
                        if (!hashMap.containsKey(uri)) {
                            hashMap.put(uri, N4.b.L(context, uri));
                        }
                    }
                }
                Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
                Object Y4 = Y();
                if (Y4 != null) {
                    int length = iVarArr.length;
                    int i5 = 0;
                    boolean z5 = false;
                    while (i5 < length) {
                        k1.i iVar2 = iVarArr[i5];
                        ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(iVar2.f17572a);
                        if (byteBuffer != null) {
                            try {
                                z3 = ((Boolean) this.f17090n.invoke(Y4, byteBuffer, Integer.valueOf(iVar2.f17573b), null, Integer.valueOf(iVar2.f17574c), Integer.valueOf(iVar2.f17575d ? 1 : 0))).booleanValue();
                            } catch (IllegalAccessException | InvocationTargetException unused) {
                                z3 = false;
                            }
                            if (!z3) {
                                U(Y4);
                                return null;
                            }
                            z5 = true;
                        }
                        i5++;
                        z5 = z5;
                    }
                    if (!z5) {
                        U(Y4);
                        return null;
                    }
                    if (X(Y4) && (W4 = W(Y4)) != null) {
                        return Typeface.create(W4, i);
                    }
                }
            } else {
                k1.i x5 = l.x(iVarArr, i);
                try {
                    ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(x5.f17572a, "r", null);
                    if (openFileDescriptor != null) {
                        try {
                            Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(x5.f17574c).setItalic(x5.f17575d).build();
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

    @Override // G4.l
    public final Typeface t(Context context, Resources resources, int i, String str, int i5) {
        Method method = this.f17089m;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.t(context, resources, i, str, i5);
        }
        Object Y4 = Y();
        if (Y4 != null) {
            if (!V(context, Y4, str, 0, -1, -1, null)) {
                U(Y4);
                return null;
            }
            if (X(Y4)) {
                return W(Y4);
            }
        }
        return null;
    }
}
