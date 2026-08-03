package org.slf4j.helpers;

/* loaded from: classes6.dex */
public final class Util {
    private static org.slf4j.helpers.Util.ClassContextSecurityManager SECURITY_MANAGER = null;
    private static boolean SECURITY_MANAGER_CREATION_ALREADY_ATTEMPTED = false;

    private Util() {
    }

    public static java.lang.String safeGetSystemProperty(java.lang.String str) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("null input");
        }
        try {
            return java.lang.System.getProperty(str);
        } catch (java.lang.SecurityException unused) {
            return null;
        }
    }

    public static boolean safeGetBooleanSystemProperty(java.lang.String str) {
        java.lang.String safeGetSystemProperty = safeGetSystemProperty(str);
        if (safeGetSystemProperty == null) {
            return false;
        }
        return safeGetSystemProperty.equalsIgnoreCase("true");
    }

    private static final class ClassContextSecurityManager extends java.lang.SecurityManager {
        private ClassContextSecurityManager() {
        }

        @Override // java.lang.SecurityManager
        protected java.lang.Class<?>[] getClassContext() {
            return super.getClassContext();
        }
    }

    private static org.slf4j.helpers.Util.ClassContextSecurityManager getSecurityManager() {
        org.slf4j.helpers.Util.ClassContextSecurityManager classContextSecurityManager = SECURITY_MANAGER;
        if (classContextSecurityManager != null) {
            return classContextSecurityManager;
        }
        if (SECURITY_MANAGER_CREATION_ALREADY_ATTEMPTED) {
            return null;
        }
        org.slf4j.helpers.Util.ClassContextSecurityManager safeCreateSecurityManager = safeCreateSecurityManager();
        SECURITY_MANAGER = safeCreateSecurityManager;
        SECURITY_MANAGER_CREATION_ALREADY_ATTEMPTED = true;
        return safeCreateSecurityManager;
    }

    private static org.slf4j.helpers.Util.ClassContextSecurityManager safeCreateSecurityManager() {
        try {
            return new org.slf4j.helpers.Util.ClassContextSecurityManager();
        } catch (java.lang.SecurityException unused) {
            return null;
        }
    }

    public static java.lang.Class<?> getCallingClass() {
        int i;
        org.slf4j.helpers.Util.ClassContextSecurityManager securityManager = getSecurityManager();
        if (securityManager == null) {
            return null;
        }
        java.lang.Class<?>[] classContext = securityManager.getClassContext();
        java.lang.String name = org.slf4j.helpers.Util.class.getName();
        int i2 = 0;
        while (i2 < classContext.length && !name.equals(classContext[i2].getName())) {
            i2++;
        }
        if (i2 >= classContext.length || (i = i2 + 2) >= classContext.length) {
            throw new java.lang.IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
        }
        return classContext[i];
    }

    public static final void report(java.lang.String str, java.lang.Throwable th) {
        java.lang.System.err.println(str);
        java.lang.System.err.println("Reported exception:");
        th.printStackTrace();
    }

    public static final void report(java.lang.String str) {
        java.lang.System.err.println("SLF4J: " + str);
    }
}
