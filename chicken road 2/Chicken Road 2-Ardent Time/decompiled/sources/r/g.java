package r;

/* loaded from: classes.dex */
public class g extends r.e {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Class f8341f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.reflect.Constructor f8342g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.reflect.Method f8343h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.reflect.Method f8344i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.reflect.Method f8345j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.reflect.Method f8346k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.reflect.Method f8347l;

    public g() {
        java.lang.reflect.Method method;
        java.lang.reflect.Constructor<?> constructor;
        java.lang.reflect.Method method2;
        java.lang.reflect.Method method3;
        java.lang.reflect.Method method4;
        java.lang.reflect.Method method5;
        java.lang.Class<?> cls = null;
        try {
            java.lang.Class<?> cls2 = java.lang.Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            method2 = R(cls2);
            java.lang.Class cls3 = java.lang.Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", java.nio.ByteBuffer.class, cls3, android.graphics.fonts.FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = S(cls2);
            cls = cls2;
        } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException e2) {
            android.util.Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e2.getClass().getName()), e2);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f8341f = cls;
        this.f8342g = constructor;
        this.f8343h = method2;
        this.f8344i = method3;
        this.f8345j = method4;
        this.f8346k = method5;
        this.f8347l = method;
    }

    public static java.lang.reflect.Method R(java.lang.Class cls) {
        java.lang.Class cls2 = java.lang.Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", android.content.res.AssetManager.class, java.lang.String.class, cls2, java.lang.Boolean.TYPE, cls2, cls2, cls2, android.graphics.fonts.FontVariationAxis[].class);
    }

    public final void L(java.lang.Object obj) {
        try {
            this.f8346k.invoke(obj, null);
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused) {
        }
    }

    public final boolean M(android.content.Context context, java.lang.Object obj, java.lang.String str, int i2, int i3, int i4, android.graphics.fonts.FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((java.lang.Boolean) this.f8343h.invoke(obj, context.getAssets(), str, 0, java.lang.Boolean.FALSE, java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i4), fontVariationAxisArr)).booleanValue();
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused) {
            return false;
        }
    }

    public android.graphics.Typeface N(java.lang.Object obj) {
        try {
            java.lang.Object newInstance = java.lang.reflect.Array.newInstance((java.lang.Class<?>) this.f8341f, 1);
            java.lang.reflect.Array.set(newInstance, 0, obj);
            return (android.graphics.Typeface) this.f8347l.invoke(null, newInstance, -1, -1);
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean O(java.lang.Object obj) {
        try {
            return ((java.lang.Boolean) this.f8345j.invoke(obj, null)).booleanValue();
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean P() {
        java.lang.reflect.Method method = this.f8343h;
        if (method == null) {
            android.util.Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return method != null;
    }

    public final java.lang.Object Q() {
        try {
            return this.f8342g.newInstance(null);
        } catch (java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.reflect.InvocationTargetException unused) {
            return null;
        }
    }

    public java.lang.reflect.Method S(java.lang.Class cls) {
        java.lang.Class<?> cls2 = java.lang.reflect.Array.newInstance((java.lang.Class<?>) cls, 1).getClass();
        java.lang.Class cls3 = java.lang.Integer.TYPE;
        java.lang.reflect.Method declaredMethod = android.graphics.Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // r.e, a.AbstractC0059a
    public final android.graphics.Typeface j(android.content.Context context, q.C0978c c0978c, android.content.res.Resources resources, int i2) {
        if (!P()) {
            return super.j(context, c0978c, resources, i2);
        }
        java.lang.Object Q2 = Q();
        if (Q2 == null) {
            return null;
        }
        for (q.C0979d c0979d : c0978c.f8312a) {
            if (!M(context, Q2, c0979d.f8313a, c0979d.f8317e, c0979d.f8314b, c0979d.f8315c ? 1 : 0, android.graphics.fonts.FontVariationAxis.fromFontVariationSettings(c0979d.f8316d))) {
                L(Q2);
                return null;
            }
        }
        if (O(Q2)) {
            return N(Q2);
        }
        return null;
    }

    @Override // r.e, a.AbstractC0059a
    public final android.graphics.Typeface k(android.content.Context context, v.g[] gVarArr, int i2) {
        android.graphics.Typeface N2;
        boolean z2;
        if (gVarArr.length < 1) {
            return null;
        }
        if (!P()) {
            v.g o2 = o(gVarArr, i2);
            try {
                android.os.ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(o2.f8375a, "r", null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    android.graphics.Typeface build = new android.graphics.Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(o2.f8377c).setItalic(o2.f8378d).build();
                    openFileDescriptor.close();
                    return build;
                } finally {
                }
            } catch (java.io.IOException unused) {
                return null;
            }
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        for (v.g gVar : gVarArr) {
            if (gVar.f8379e == 0) {
                android.net.Uri uri = gVar.f8375a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, u0.AbstractC0995a.t(context, uri));
                }
            }
        }
        java.util.Map unmodifiableMap = java.util.Collections.unmodifiableMap(hashMap);
        java.lang.Object Q2 = Q();
        if (Q2 == null) {
            return null;
        }
        int length = gVarArr.length;
        int i3 = 0;
        boolean z3 = false;
        while (i3 < length) {
            v.g gVar2 = gVarArr[i3];
            java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) unmodifiableMap.get(gVar2.f8375a);
            if (byteBuffer != null) {
                try {
                    z2 = ((java.lang.Boolean) this.f8344i.invoke(Q2, byteBuffer, java.lang.Integer.valueOf(gVar2.f8376b), null, java.lang.Integer.valueOf(gVar2.f8377c), java.lang.Integer.valueOf(gVar2.f8378d ? 1 : 0))).booleanValue();
                } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused2) {
                    z2 = false;
                }
                if (!z2) {
                    L(Q2);
                    return null;
                }
                z3 = true;
            }
            i3++;
            z3 = z3;
        }
        if (!z3) {
            L(Q2);
            return null;
        }
        if (O(Q2) && (N2 = N(Q2)) != null) {
            return android.graphics.Typeface.create(N2, i2);
        }
        return null;
    }

    @Override // a.AbstractC0059a
    public final android.graphics.Typeface m(android.content.Context context, android.content.res.Resources resources, int i2, java.lang.String str, int i3) {
        if (!P()) {
            return super.m(context, resources, i2, str, i3);
        }
        java.lang.Object Q2 = Q();
        if (Q2 == null) {
            return null;
        }
        if (!M(context, Q2, str, 0, -1, -1, null)) {
            L(Q2);
            return null;
        }
        if (O(Q2)) {
            return N(Q2);
        }
        return null;
    }
}
