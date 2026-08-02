package com.nimbusds.jose.shaded.gson.internal;

/* loaded from: classes4.dex */
public class ReflectionAccessFilterHelper {
    private ReflectionAccessFilterHelper() {
    }

    public static boolean isJavaType(java.lang.Class<?> cls) {
        return isJavaType(cls.getName());
    }

    private static boolean isJavaType(java.lang.String str) {
        return str.startsWith("java.") || str.startsWith("javax.");
    }

    public static boolean isAndroidType(java.lang.Class<?> cls) {
        return isAndroidType(cls.getName());
    }

    private static boolean isAndroidType(java.lang.String str) {
        return str.startsWith("android.") || str.startsWith("androidx.") || isJavaType(str);
    }

    public static boolean isAnyPlatformType(java.lang.Class<?> cls) {
        java.lang.String name2 = cls.getName();
        return isAndroidType(name2) || name2.startsWith("kotlin.") || name2.startsWith("kotlinx.") || name2.startsWith("scala.");
    }

    public static com.nimbusds.jose.shaded.gson.ReflectionAccessFilter.FilterResult getFilterResult(java.util.List<com.nimbusds.jose.shaded.gson.ReflectionAccessFilter> list, java.lang.Class<?> cls) {
        java.util.Iterator<com.nimbusds.jose.shaded.gson.ReflectionAccessFilter> it = list.iterator();
        while (it.hasNext()) {
            com.nimbusds.jose.shaded.gson.ReflectionAccessFilter.FilterResult check = it.next().check(cls);
            if (check != com.nimbusds.jose.shaded.gson.ReflectionAccessFilter.FilterResult.INDECISIVE) {
                return check;
            }
        }
        return com.nimbusds.jose.shaded.gson.ReflectionAccessFilter.FilterResult.ALLOW;
    }

    public static boolean canAccess(java.lang.reflect.AccessibleObject accessibleObject, java.lang.Object obj) {
        return com.nimbusds.jose.shaded.gson.internal.ReflectionAccessFilterHelper.AccessChecker.INSTANCE.canAccess(accessibleObject, obj);
    }

    static abstract class AccessChecker {
        public static final com.nimbusds.jose.shaded.gson.internal.ReflectionAccessFilterHelper.AccessChecker INSTANCE;

        public abstract boolean canAccess(java.lang.reflect.AccessibleObject accessibleObject, java.lang.Object obj);

        private AccessChecker() {
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
        static {
            com.nimbusds.jose.shaded.gson.internal.ReflectionAccessFilterHelper.AccessChecker accessChecker;
            if (com.nimbusds.jose.shaded.gson.internal.JavaVersion.isJava9OrLater()) {
                try {
                    final java.lang.reflect.Method declaredMethod = java.lang.reflect.AccessibleObject.class.getDeclaredMethod("canAccess", java.lang.Object.class);
                    accessChecker = new com.nimbusds.jose.shaded.gson.internal.ReflectionAccessFilterHelper.AccessChecker() { // from class: com.nimbusds.jose.shaded.gson.internal.ReflectionAccessFilterHelper.AccessChecker.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super();
                        }

                        @Override // com.nimbusds.jose.shaded.gson.internal.ReflectionAccessFilterHelper.AccessChecker
                        public boolean canAccess(java.lang.reflect.AccessibleObject accessibleObject, java.lang.Object obj) {
                            try {
                                return ((java.lang.Boolean) declaredMethod.invoke(accessibleObject, obj)).booleanValue();
                            } catch (java.lang.Exception e) {
                                throw new java.lang.RuntimeException("Failed invoking canAccess", e);
                            }
                        }
                    };
                } catch (java.lang.NoSuchMethodException unused) {
                }
                if (accessChecker == null) {
                    accessChecker = new com.nimbusds.jose.shaded.gson.internal.ReflectionAccessFilterHelper.AccessChecker() { // from class: com.nimbusds.jose.shaded.gson.internal.ReflectionAccessFilterHelper.AccessChecker.2
                        @Override // com.nimbusds.jose.shaded.gson.internal.ReflectionAccessFilterHelper.AccessChecker
                        public boolean canAccess(java.lang.reflect.AccessibleObject accessibleObject, java.lang.Object obj) {
                            return true;
                        }
                    };
                }
                INSTANCE = accessChecker;
            }
            accessChecker = null;
            if (accessChecker == null) {
            }
            INSTANCE = accessChecker;
        }
    }
}
