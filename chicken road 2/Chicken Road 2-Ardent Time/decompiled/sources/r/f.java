package r;

/* loaded from: classes.dex */
public final class f extends a.AbstractC0059a {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.Class f8337a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.reflect.Constructor f8338b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.reflect.Method f8339c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.reflect.Method f8340d;

    static {
        java.lang.Class<?> cls;
        java.lang.reflect.Method method;
        java.lang.reflect.Method method2;
        java.lang.reflect.Constructor<?> constructor = null;
        try {
            cls = java.lang.Class.forName("android.graphics.FontFamily");
            java.lang.reflect.Constructor<?> constructor2 = cls.getConstructor(null);
            java.lang.Class cls2 = java.lang.Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", java.nio.ByteBuffer.class, cls2, java.util.List.class, cls2, java.lang.Boolean.TYPE);
            method = android.graphics.Typeface.class.getMethod("createFromFamiliesWithDefault", java.lang.reflect.Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException e2) {
            android.util.Log.e("TypefaceCompatApi24Impl", e2.getClass().getName(), e2);
            cls = null;
            method = null;
            method2 = null;
        }
        f8338b = constructor;
        f8337a = cls;
        f8339c = method2;
        f8340d = method;
    }

    public static boolean J(java.lang.Object obj, java.nio.ByteBuffer byteBuffer, int i2, int i3, boolean z2) {
        try {
            return ((java.lang.Boolean) f8339c.invoke(obj, byteBuffer, java.lang.Integer.valueOf(i2), null, java.lang.Integer.valueOf(i3), java.lang.Boolean.valueOf(z2))).booleanValue();
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused) {
            return false;
        }
    }

    public static android.graphics.Typeface K(java.lang.Object obj) {
        try {
            java.lang.Object newInstance = java.lang.reflect.Array.newInstance((java.lang.Class<?>) f8337a, 1);
            java.lang.reflect.Array.set(newInstance, 0, obj);
            return (android.graphics.Typeface) f8340d.invoke(null, newInstance);
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b A[SYNTHETIC] */
    @Override // a.AbstractC0059a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final android.graphics.Typeface j(android.content.Context context, q.C0978c c0978c, android.content.res.Resources resources, int i2) {
        java.lang.Object obj;
        java.nio.MappedByteBuffer mappedByteBuffer;
        java.io.FileInputStream fileInputStream;
        try {
            obj = f8338b.newInstance(null);
        } catch (java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.reflect.InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        for (q.C0979d c0979d : c0978c.f8312a) {
            int i3 = c0979d.f8318f;
            java.io.File n2 = u0.AbstractC0995a.n(context);
            if (n2 != null) {
                try {
                    if (u0.AbstractC0995a.g(n2, resources, i3)) {
                        try {
                            fileInputStream = new java.io.FileInputStream(n2);
                        } catch (java.io.IOException unused2) {
                            mappedByteBuffer = null;
                        }
                        try {
                            java.nio.channels.FileChannel channel = fileInputStream.getChannel();
                            mappedByteBuffer = channel.map(java.nio.channels.FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                            fileInputStream.close();
                            if (mappedByteBuffer != null) {
                                return null;
                            }
                            if (!J(obj, mappedByteBuffer, c0979d.f8317e, c0979d.f8314b, c0979d.f8315c)) {
                                return null;
                            }
                        } finally {
                        }
                    }
                } finally {
                    n2.delete();
                }
            }
            mappedByteBuffer = null;
            if (mappedByteBuffer != null) {
            }
        }
        return K(obj);
    }

    @Override // a.AbstractC0059a
    public final android.graphics.Typeface k(android.content.Context context, v.g[] gVarArr, int i2) {
        java.lang.Object obj;
        try {
            obj = f8338b.newInstance(null);
        } catch (java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.reflect.InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        l.k kVar = new l.k();
        for (v.g gVar : gVarArr) {
            android.net.Uri uri = gVar.f8375a;
            java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) kVar.getOrDefault(uri, null);
            if (byteBuffer == null) {
                byteBuffer = u0.AbstractC0995a.t(context, uri);
                kVar.put(uri, byteBuffer);
            }
            if (byteBuffer == null) {
                return null;
            }
            if (!J(obj, byteBuffer, gVar.f8376b, gVar.f8377c, gVar.f8378d)) {
                return null;
            }
        }
        android.graphics.Typeface K2 = K(obj);
        if (K2 == null) {
            return null;
        }
        return android.graphics.Typeface.create(K2, i2);
    }
}
