package org.bouncycastle.jcajce.provider.symmetric.util;

/* loaded from: classes17.dex */
public class ClassUtil {
    public static java.lang.Class loadClass(java.lang.Class cls, final java.lang.String str) {
        try {
            java.lang.ClassLoader classLoader = cls.getClassLoader();
            return classLoader != null ? classLoader.loadClass(str) : (java.lang.Class) java.security.AccessController.doPrivileged(new java.security.PrivilegedAction() { // from class: org.bouncycastle.jcajce.provider.symmetric.util.ClassUtil.1
                @Override // java.security.PrivilegedAction
                public final java.lang.Object run() {
                    try {
                        return java.lang.Class.forName(str);
                    } catch (java.lang.Exception unused) {
                        return null;
                    }
                }
            });
        } catch (java.lang.ClassNotFoundException unused) {
            return null;
        }
    }
}
