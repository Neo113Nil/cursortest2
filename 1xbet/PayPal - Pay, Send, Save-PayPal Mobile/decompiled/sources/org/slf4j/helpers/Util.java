package org.slf4j.helpers;

/* loaded from: classes18.dex */
public final class Util {
    private static boolean Camera2StreamConfigurationMap = false;
    private static org.slf4j.helpers.Util.ClassContextSecurityManager getHighSpeedVideoFpsRangesFor;

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

    static final class ClassContextSecurityManager extends java.lang.SecurityManager {
        private ClassContextSecurityManager() {
        }

        /* synthetic */ ClassContextSecurityManager(byte b) {
            this();
        }

        @Override // java.lang.SecurityManager
        protected final java.lang.Class<?>[] getClassContext() {
            return super.getClassContext();
        }
    }

    private static org.slf4j.helpers.Util.ClassContextSecurityManager getHighSpeedVideoFpsRangesFor() {
        try {
            return new org.slf4j.helpers.Util.ClassContextSecurityManager((byte) 0);
        } catch (java.lang.SecurityException unused) {
            return null;
        }
    }

    public static final void report(java.lang.String str, java.lang.Throwable th) {
        java.lang.System.err.println(str);
        java.lang.System.err.println("Reported exception:");
        th.printStackTrace();
    }

    public static final void report(java.lang.String str) {
        java.lang.System.err.println("SLF4J: ".concat(java.lang.String.valueOf(str)));
    }

    public static java.lang.Class<?> getCallingClass() {
        int i;
        org.slf4j.helpers.Util.ClassContextSecurityManager classContextSecurityManager = getHighSpeedVideoFpsRangesFor;
        if (classContextSecurityManager == null) {
            if (Camera2StreamConfigurationMap) {
                classContextSecurityManager = null;
            } else {
                classContextSecurityManager = getHighSpeedVideoFpsRangesFor();
                getHighSpeedVideoFpsRangesFor = classContextSecurityManager;
                Camera2StreamConfigurationMap = true;
            }
        }
        if (classContextSecurityManager == null) {
            return null;
        }
        java.lang.Class<?>[] classContext = classContextSecurityManager.getClassContext();
        java.lang.String name2 = org.slf4j.helpers.Util.class.getName();
        int i2 = 0;
        while (i2 < classContext.length && !name2.equals(classContext[i2].getName())) {
            i2++;
        }
        if (i2 >= classContext.length || (i = i2 + 2) >= classContext.length) {
            throw new java.lang.IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
        }
        return classContext[i];
    }
}
