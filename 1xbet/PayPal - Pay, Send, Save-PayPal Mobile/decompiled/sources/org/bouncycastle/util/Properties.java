package org.bouncycastle.util;

/* loaded from: classes17.dex */
public class Properties {
    private static final java.lang.ThreadLocal getHighResolutionOutputSizeshNQ4ISI = new java.lang.ThreadLocal();

    public static boolean isOverrideSetTo(java.lang.String str, boolean z) {
        try {
            java.lang.String propertyValue = getPropertyValue(str);
            if (z) {
                return getHighSpeedVideoSizes(propertyValue);
            }
            if (propertyValue == null || propertyValue.length() != 5) {
                return false;
            }
            if (propertyValue.charAt(0) != 'f' && propertyValue.charAt(0) != 'F') {
                return false;
            }
            if (propertyValue.charAt(1) != 'a' && propertyValue.charAt(1) != 'A') {
                return false;
            }
            if (propertyValue.charAt(2) != 'l' && propertyValue.charAt(2) != 'L') {
                return false;
            }
            if (propertyValue.charAt(3) == 's' || propertyValue.charAt(3) == 'S') {
                return propertyValue.charAt(4) == 'e' || propertyValue.charAt(4) == 'E';
            }
            return false;
        } catch (java.security.AccessControlException unused) {
            return false;
        }
    }

    public static boolean setThreadOverride(java.lang.String str, boolean z) {
        boolean isOverrideSet = isOverrideSet(str);
        java.lang.ThreadLocal threadLocal = getHighResolutionOutputSizeshNQ4ISI;
        java.util.Map map = (java.util.Map) threadLocal.get();
        if (map == null) {
            map = new java.util.HashMap();
            threadLocal.set(map);
        }
        map.put(str, z ? "true" : "false");
        return isOverrideSet;
    }

    public static boolean removeThreadOverride(java.lang.String str) {
        java.lang.String str2;
        java.lang.ThreadLocal threadLocal = getHighResolutionOutputSizeshNQ4ISI;
        java.util.Map map = (java.util.Map) threadLocal.get();
        if (map == null || (str2 = (java.lang.String) map.remove(str)) == null) {
            return false;
        }
        if (map.isEmpty()) {
            threadLocal.remove();
        }
        return "true".equals(org.bouncycastle.util.Strings.toLowerCase(str2));
    }

    private static boolean getHighSpeedVideoSizes(java.lang.String str) {
        if (str == null || str.length() != 4) {
            return false;
        }
        return (str.charAt(0) == 't' || str.charAt(0) == 'T') && (str.charAt(1) == 'r' || str.charAt(1) == 'R') && ((str.charAt(2) == 'u' || str.charAt(2) == 'U') && (str.charAt(3) == 'e' || str.charAt(3) == 'E'));
    }

    public static boolean isOverrideSet(java.lang.String str) {
        try {
            return getHighSpeedVideoSizes(getPropertyValue(str));
        } catch (java.security.AccessControlException unused) {
            return false;
        }
    }

    public static java.lang.String getPropertyValue(final java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3 = (java.lang.String) java.security.AccessController.doPrivileged(new java.security.PrivilegedAction() { // from class: org.bouncycastle.util.Properties.1
            @Override // java.security.PrivilegedAction
            public final java.lang.Object run() {
                return java.security.Security.getProperty(str);
            }
        });
        if (str3 != null) {
            return str3;
        }
        java.util.Map map = (java.util.Map) getHighResolutionOutputSizeshNQ4ISI.get();
        return (map == null || (str2 = (java.lang.String) map.get(str)) == null) ? (java.lang.String) java.security.AccessController.doPrivileged(new java.security.PrivilegedAction() { // from class: org.bouncycastle.util.Properties.2
            @Override // java.security.PrivilegedAction
            public final java.lang.Object run() {
                return java.lang.System.getProperty(str);
            }
        }) : str2;
    }

    public static java.util.Set<java.lang.String> asKeySet(java.lang.String str) {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.lang.String propertyValue = getPropertyValue(str);
        if (propertyValue != null) {
            java.util.StringTokenizer stringTokenizer = new java.util.StringTokenizer(propertyValue, ",");
            while (stringTokenizer.hasMoreElements()) {
                hashSet.add(org.bouncycastle.util.Strings.toLowerCase(stringTokenizer.nextToken()).trim());
            }
        }
        return java.util.Collections.unmodifiableSet(hashSet);
    }

    public static java.math.BigInteger asBigInteger(java.lang.String str) {
        java.lang.String propertyValue = getPropertyValue(str);
        if (propertyValue != null) {
            return new java.math.BigInteger(propertyValue);
        }
        return null;
    }

    private Properties() {
    }
}
