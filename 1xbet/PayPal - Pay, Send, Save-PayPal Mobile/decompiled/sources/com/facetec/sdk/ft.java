package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class ft {

    /* renamed from: a, reason: collision with root package name */
    public static int f3579a;
    public static int e;

    public static boolean d(java.lang.Class<?> cls) {
        return d(cls.getName());
    }

    private static boolean d(java.lang.String str) {
        return str.startsWith("java.") || str.startsWith("javax.");
    }

    public static boolean a(java.lang.String str) {
        return str.startsWith("android.") || str.startsWith("androidx.") || d(str);
    }

    public static com.facetec.sdk.ez.a d(java.util.List<com.facetec.sdk.ez> list, java.lang.Class<?> cls) {
        java.util.Iterator<com.facetec.sdk.ez> it = list.iterator();
        while (it.hasNext()) {
            com.facetec.sdk.ez.a a2 = it.next().a(cls);
            if (a2 != com.facetec.sdk.ez.a.INDECISIVE) {
                return a2;
            }
        }
        return com.facetec.sdk.ez.a.ALLOW;
    }

    public static boolean e(java.lang.reflect.AccessibleObject accessibleObject, java.lang.Object obj) {
        return com.facetec.sdk.ft.c.f3580a.a(accessibleObject, obj);
    }

    static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        public static final com.facetec.sdk.ft.c f3580a;

        public abstract boolean a(java.lang.reflect.AccessibleObject accessibleObject, java.lang.Object obj);

        private c() {
        }

        /* synthetic */ c(byte b) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
        static {
            com.facetec.sdk.ft.c cVar;
            if (com.facetec.sdk.fj.c()) {
                try {
                    final java.lang.reflect.Method declaredMethod = java.lang.reflect.AccessibleObject.class.getDeclaredMethod("canAccess", java.lang.Object.class);
                    cVar = new com.facetec.sdk.ft.c() { // from class: com.facetec.sdk.ft.c.3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super((byte) 0);
                        }

                        @Override // com.facetec.sdk.ft.c
                        public final boolean a(java.lang.reflect.AccessibleObject accessibleObject, java.lang.Object obj) {
                            try {
                                return ((java.lang.Boolean) declaredMethod.invoke(accessibleObject, obj)).booleanValue();
                            } catch (java.lang.Exception e) {
                                throw new java.lang.RuntimeException("Failed invoking canAccess", e);
                            }
                        }
                    };
                } catch (java.lang.NoSuchMethodException unused) {
                }
                if (cVar == null) {
                    cVar = new com.facetec.sdk.ft.c() { // from class: com.facetec.sdk.ft.c.5
                        @Override // com.facetec.sdk.ft.c
                        public final boolean a(java.lang.reflect.AccessibleObject accessibleObject, java.lang.Object obj) {
                            return true;
                        }
                    };
                }
                f3580a = cVar;
            }
            cVar = null;
            if (cVar == null) {
            }
            f3580a = cVar;
        }
    }

    public static int c() {
        int i = f3579a;
        f3579a = i + 1;
        if (i % 9041463 != 0) {
            return e;
        }
        int nextInt = new java.util.Random().nextInt();
        e = nextInt;
        return nextInt;
    }
}
