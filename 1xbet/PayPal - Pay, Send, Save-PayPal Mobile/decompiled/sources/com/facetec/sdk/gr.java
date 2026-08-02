package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class gr {
    private static final com.facetec.sdk.gr.d b;

    static {
        com.facetec.sdk.gr.d bVar;
        byte b2 = 0;
        try {
            bVar = new com.facetec.sdk.gr.a(b2);
        } catch (java.lang.NoSuchMethodException unused) {
            bVar = new com.facetec.sdk.gr.b(b2);
        }
        b = bVar;
    }

    public static void b(java.lang.reflect.AccessibleObject accessibleObject) throws com.facetec.sdk.et {
        try {
            accessibleObject.setAccessible(true);
        } catch (java.lang.Exception e) {
            java.lang.String a2 = a(accessibleObject, false);
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed making ");
            sb.append(a2);
            sb.append(" accessible; either increase its visibility or write a custom TypeAdapter for its declaring type.");
            throw new com.facetec.sdk.et(sb.toString(), e);
        }
    }

    public static java.lang.String a(java.lang.reflect.AccessibleObject accessibleObject, boolean z) {
        java.lang.String obj;
        if (accessibleObject instanceof java.lang.reflect.Field) {
            java.lang.reflect.Field field = (java.lang.reflect.Field) accessibleObject;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("field '");
            sb.append(field.getDeclaringClass().getName());
            sb.append("#");
            sb.append(field.getName());
            sb.append("'");
            obj = sb.toString();
        } else if (accessibleObject instanceof java.lang.reflect.Method) {
            java.lang.reflect.Method method = (java.lang.reflect.Method) accessibleObject;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(method.getName());
            c(method, sb2);
            java.lang.String obj2 = sb2.toString();
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("method '");
            sb3.append(method.getDeclaringClass().getName());
            sb3.append("#");
            sb3.append(obj2);
            sb3.append("'");
            obj = sb3.toString();
        } else if (accessibleObject instanceof java.lang.reflect.Constructor) {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("constructor '");
            sb4.append(d((java.lang.reflect.Constructor) accessibleObject));
            sb4.append("'");
            obj = sb4.toString();
        } else {
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder("<unknown AccessibleObject> ");
            sb5.append(accessibleObject.toString());
            obj = sb5.toString();
        }
        if (!z || !java.lang.Character.isLowerCase(obj.charAt(0))) {
            return obj;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(java.lang.Character.toUpperCase(obj.charAt(0)));
        sb6.append(obj.substring(1));
        return sb6.toString();
    }

    public static java.lang.String d(java.lang.reflect.Constructor<?> constructor) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(constructor.getDeclaringClass().getName());
        c(constructor, sb);
        return sb.toString();
    }

    private static void c(java.lang.reflect.AccessibleObject accessibleObject, java.lang.StringBuilder sb) {
        java.lang.Class<?>[] parameterTypes;
        sb.append('(');
        if (accessibleObject instanceof java.lang.reflect.Method) {
            parameterTypes = ((java.lang.reflect.Method) accessibleObject).getParameterTypes();
        } else {
            parameterTypes = ((java.lang.reflect.Constructor) accessibleObject).getParameterTypes();
        }
        for (int i = 0; i < parameterTypes.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(parameterTypes[i].getSimpleName());
        }
        sb.append(')');
    }

    public static java.lang.String e(java.lang.reflect.Constructor<?> constructor) {
        try {
            constructor.setAccessible(true);
            return null;
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed making constructor '");
            sb.append(d(constructor));
            sb.append("' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: ");
            sb.append(e.getMessage());
            return sb.toString();
        }
    }

    public static boolean e(java.lang.Class<?> cls) {
        return b.a(cls);
    }

    public static java.lang.String[] b(java.lang.Class<?> cls) {
        return b.c(cls);
    }

    public static java.lang.reflect.Method e(java.lang.Class<?> cls, java.lang.reflect.Field field) {
        return b.d(cls, field);
    }

    public static <T> java.lang.reflect.Constructor<T> a(java.lang.Class<T> cls) {
        return b.b(cls);
    }

    public static java.lang.RuntimeException b(java.lang.IllegalAccessException illegalAccessException) {
        throw new java.lang.RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", illegalAccessException);
    }

    static abstract class d {
        abstract boolean a(java.lang.Class<?> cls);

        abstract <T> java.lang.reflect.Constructor<T> b(java.lang.Class<T> cls);

        abstract java.lang.String[] c(java.lang.Class<?> cls);

        public abstract java.lang.reflect.Method d(java.lang.Class<?> cls, java.lang.reflect.Field field);

        private d() {
        }

        /* synthetic */ d(byte b) {
            this();
        }
    }

    static final class a extends com.facetec.sdk.gr.d {

        /* renamed from: a, reason: collision with root package name */
        private final java.lang.reflect.Method f3614a;
        private final java.lang.reflect.Method b;
        private final java.lang.reflect.Method c;
        private final java.lang.reflect.Method e;

        /* synthetic */ a(byte b) throws java.lang.NoSuchMethodException {
            this();
        }

        private a() throws java.lang.NoSuchMethodException {
            super((byte) 0);
            this.c = java.lang.Class.class.getMethod("isRecord", new java.lang.Class[0]);
            java.lang.reflect.Method method = java.lang.Class.class.getMethod("getRecordComponents", new java.lang.Class[0]);
            this.e = method;
            java.lang.Class<?> componentType = method.getReturnType().getComponentType();
            this.f3614a = componentType.getMethod("getName", new java.lang.Class[0]);
            this.b = componentType.getMethod("getType", new java.lang.Class[0]);
        }

        @Override // com.facetec.sdk.gr.d
        final boolean a(java.lang.Class<?> cls) {
            try {
                return ((java.lang.Boolean) this.c.invoke(cls, new java.lang.Object[0])).booleanValue();
            } catch (java.lang.ReflectiveOperationException e) {
                throw com.facetec.sdk.gr.c(e);
            }
        }

        @Override // com.facetec.sdk.gr.d
        final java.lang.String[] c(java.lang.Class<?> cls) {
            try {
                java.lang.Object[] objArr = (java.lang.Object[]) this.e.invoke(cls, new java.lang.Object[0]);
                java.lang.String[] strArr = new java.lang.String[objArr.length];
                for (int i = 0; i < objArr.length; i++) {
                    strArr[i] = (java.lang.String) this.f3614a.invoke(objArr[i], new java.lang.Object[0]);
                }
                return strArr;
            } catch (java.lang.ReflectiveOperationException e) {
                throw com.facetec.sdk.gr.c(e);
            }
        }

        @Override // com.facetec.sdk.gr.d
        public final <T> java.lang.reflect.Constructor<T> b(java.lang.Class<T> cls) {
            try {
                java.lang.Object[] objArr = (java.lang.Object[]) this.e.invoke(cls, new java.lang.Object[0]);
                java.lang.Class<?>[] clsArr = new java.lang.Class[objArr.length];
                for (int i = 0; i < objArr.length; i++) {
                    clsArr[i] = (java.lang.Class) this.b.invoke(objArr[i], new java.lang.Object[0]);
                }
                return cls.getDeclaredConstructor(clsArr);
            } catch (java.lang.ReflectiveOperationException e) {
                throw com.facetec.sdk.gr.c(e);
            }
        }

        @Override // com.facetec.sdk.gr.d
        public final java.lang.reflect.Method d(java.lang.Class<?> cls, java.lang.reflect.Field field) {
            try {
                return cls.getMethod(field.getName(), new java.lang.Class[0]);
            } catch (java.lang.ReflectiveOperationException e) {
                throw com.facetec.sdk.gr.c(e);
            }
        }
    }

    static final class b extends com.facetec.sdk.gr.d {
        public static int b;
        public static int d;

        @Override // com.facetec.sdk.gr.d
        final boolean a(java.lang.Class<?> cls) {
            return false;
        }

        private b() {
            super((byte) 0);
        }

        /* synthetic */ b(byte b2) {
            this();
        }

        @Override // com.facetec.sdk.gr.d
        final java.lang.String[] c(java.lang.Class<?> cls) {
            throw new java.lang.UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // com.facetec.sdk.gr.d
        final <T> java.lang.reflect.Constructor<T> b(java.lang.Class<T> cls) {
            throw new java.lang.UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // com.facetec.sdk.gr.d
        public final java.lang.reflect.Method d(java.lang.Class<?> cls, java.lang.reflect.Field field) {
            throw new java.lang.UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        public static int c() {
            int i = b;
            b = i + 1;
            if (i % 7623540 != 0) {
                return d;
            }
            int myUid = android.os.Process.myUid();
            d = myUid;
            return myUid;
        }
    }

    static /* synthetic */ java.lang.RuntimeException c(java.lang.ReflectiveOperationException reflectiveOperationException) {
        throw new java.lang.RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", reflectiveOperationException);
    }
}
