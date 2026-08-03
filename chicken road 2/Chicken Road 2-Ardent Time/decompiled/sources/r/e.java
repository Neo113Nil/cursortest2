package r;

/* loaded from: classes.dex */
public class e extends a.AbstractC0059a {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.Class f8332a = null;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.reflect.Constructor f8333b = null;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.reflect.Method f8334c = null;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.reflect.Method f8335d = null;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f8336e = false;

    public static boolean J(java.lang.String str, boolean z2, int i2, java.lang.Object obj) {
        K();
        try {
            return ((java.lang.Boolean) f8334c.invoke(obj, str, java.lang.Integer.valueOf(i2), java.lang.Boolean.valueOf(z2))).booleanValue();
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e2) {
            throw new java.lang.RuntimeException(e2);
        }
    }

    public static void K() {
        java.lang.reflect.Method method;
        java.lang.Class<?> cls;
        java.lang.reflect.Method method2;
        if (f8336e) {
            return;
        }
        f8336e = true;
        java.lang.reflect.Constructor<?> constructor = null;
        try {
            cls = java.lang.Class.forName("android.graphics.FontFamily");
            java.lang.reflect.Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", java.lang.String.class, java.lang.Integer.TYPE, java.lang.Boolean.TYPE);
            method = android.graphics.Typeface.class.getMethod("createFromFamiliesWithDefault", java.lang.reflect.Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException e2) {
            android.util.Log.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
            method = null;
            cls = null;
            method2 = null;
        }
        f8333b = constructor;
        f8332a = cls;
        f8334c = method2;
        f8335d = method;
    }

    @Override // a.AbstractC0059a
    public android.graphics.Typeface j(android.content.Context context, q.C0978c c0978c, android.content.res.Resources resources, int i2) {
        K();
        try {
            java.lang.Object newInstance = f8333b.newInstance(null);
            for (q.C0979d c0979d : c0978c.f8312a) {
                java.io.File n2 = u0.AbstractC0995a.n(context);
                if (n2 == null) {
                    return null;
                }
                try {
                    if (!u0.AbstractC0995a.g(n2, resources, c0979d.f8318f)) {
                        return null;
                    }
                    if (!J(n2.getPath(), c0979d.f8315c, c0979d.f8314b, newInstance)) {
                        return null;
                    }
                    n2.delete();
                } catch (java.lang.RuntimeException unused) {
                    return null;
                } finally {
                    n2.delete();
                }
            }
            K();
            try {
                java.lang.Object newInstance2 = java.lang.reflect.Array.newInstance((java.lang.Class<?>) f8332a, 1);
                java.lang.reflect.Array.set(newInstance2, 0, newInstance);
                return (android.graphics.Typeface) f8335d.invoke(null, newInstance2);
            } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e2) {
                throw new java.lang.RuntimeException(e2);
            }
        } catch (java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.reflect.InvocationTargetException e3) {
            throw new java.lang.RuntimeException(e3);
        }
    }

    @Override // a.AbstractC0059a
    public android.graphics.Typeface k(android.content.Context context, v.g[] gVarArr, int i2) {
        java.io.File file;
        java.lang.String readlink;
        if (gVarArr.length < 1) {
            return null;
        }
        try {
            android.os.ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(o(gVarArr, i2).f8375a, "r", null);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                try {
                    readlink = android.system.Os.readlink("/proc/self/fd/" + openFileDescriptor.getFd());
                } catch (android.system.ErrnoException unused) {
                }
                try {
                    if (android.system.OsConstants.S_ISREG(android.system.Os.stat(readlink).st_mode)) {
                        file = new java.io.File(readlink);
                        if (file != null && file.canRead()) {
                            android.graphics.Typeface createFromFile = android.graphics.Typeface.createFromFile(file);
                            openFileDescriptor.close();
                            return createFromFile;
                        }
                        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(openFileDescriptor.getFileDescriptor());
                        android.graphics.Typeface l2 = l(context, fileInputStream);
                        fileInputStream.close();
                        openFileDescriptor.close();
                        return l2;
                    }
                    android.graphics.Typeface l22 = l(context, fileInputStream);
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return l22;
                } finally {
                }
                file = null;
                if (file != null) {
                    android.graphics.Typeface createFromFile2 = android.graphics.Typeface.createFromFile(file);
                    openFileDescriptor.close();
                    return createFromFile2;
                }
                java.io.FileInputStream fileInputStream2 = new java.io.FileInputStream(openFileDescriptor.getFileDescriptor());
            } finally {
            }
        } catch (java.io.IOException unused2) {
            return null;
        }
    }
}
