package org.jose4j.lang;

/* loaded from: classes18.dex */
public class BouncyCastleProviderHelp {
    public static boolean enableBouncyCastleProvider() {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("org.bouncycastle.jce.provider.BouncyCastleProvider");
            for (java.security.Provider provider : java.security.Security.getProviders()) {
                if (cls.isInstance(provider)) {
                    return true;
                }
            }
            java.security.Security.addProvider((java.security.Provider) cls.newInstance());
            return true;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }
}
