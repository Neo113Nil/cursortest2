package com.facetec.sdk;

/* loaded from: classes8.dex */
public abstract class fu {
    public static final com.facetec.sdk.fu e = d();

    public abstract <T> T a(java.lang.Class<T> cls) throws java.lang.Exception;

    private static com.facetec.sdk.fu d() {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("sun.misc.Unsafe");
            java.lang.reflect.Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            final java.lang.Object obj = declaredField.get(null);
            final java.lang.reflect.Method method = cls.getMethod("allocateInstance", java.lang.Class.class);
            return new com.facetec.sdk.fu() { // from class: com.facetec.sdk.fu.5
                @Override // com.facetec.sdk.fu
                public final <T> T a(java.lang.Class<T> cls2) throws java.lang.Exception {
                    com.facetec.sdk.fu.b(cls2);
                    return (T) method.invoke(obj, cls2);
                }
            };
        } catch (java.lang.Exception unused) {
            try {
                try {
                    java.lang.reflect.Method declaredMethod = java.io.ObjectStreamClass.class.getDeclaredMethod("getConstructorId", java.lang.Class.class);
                    declaredMethod.setAccessible(true);
                    final int intValue = ((java.lang.Integer) declaredMethod.invoke(null, java.lang.Object.class)).intValue();
                    final java.lang.reflect.Method declaredMethod2 = java.io.ObjectStreamClass.class.getDeclaredMethod("newInstance", java.lang.Class.class, java.lang.Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    return new com.facetec.sdk.fu() { // from class: com.facetec.sdk.fu.2
                        @Override // com.facetec.sdk.fu
                        public final <T> T a(java.lang.Class<T> cls2) throws java.lang.Exception {
                            com.facetec.sdk.fu.b(cls2);
                            return (T) declaredMethod2.invoke(null, cls2, java.lang.Integer.valueOf(intValue));
                        }
                    };
                } catch (java.lang.Exception unused2) {
                    return new com.facetec.sdk.fu() { // from class: com.facetec.sdk.fu.1
                        @Override // com.facetec.sdk.fu
                        public final <T> T a(java.lang.Class<T> cls2) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot allocate ");
                            sb.append(cls2);
                            sb.append(". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
                            throw new java.lang.UnsupportedOperationException(sb.toString());
                        }
                    };
                }
            } catch (java.lang.Exception unused3) {
                final java.lang.reflect.Method declaredMethod3 = java.io.ObjectInputStream.class.getDeclaredMethod("newInstance", java.lang.Class.class, java.lang.Class.class);
                declaredMethod3.setAccessible(true);
                return new com.facetec.sdk.fu() { // from class: com.facetec.sdk.fu.3
                    @Override // com.facetec.sdk.fu
                    public final <T> T a(java.lang.Class<T> cls2) throws java.lang.Exception {
                        com.facetec.sdk.fu.b(cls2);
                        return (T) declaredMethod3.invoke(null, cls2, java.lang.Object.class);
                    }
                };
            }
        }
    }

    static /* synthetic */ void b(java.lang.Class cls) {
        java.lang.String b = com.facetec.sdk.fl.b(cls);
        if (b != null) {
            throw new java.lang.AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(java.lang.String.valueOf(b)));
        }
    }
}
