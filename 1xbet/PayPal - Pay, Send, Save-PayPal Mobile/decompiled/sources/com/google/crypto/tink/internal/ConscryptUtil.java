package com.google.crypto.tink.internal;

/* loaded from: classes4.dex */
public final class ConscryptUtil {
    private static final java.lang.String[] conscryptProviderNames = {com.google.android.gms.security.ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL", "Conscrypt"};

    @javax.annotation.Nullable
    public static java.security.Provider providerOrNull() {
        for (java.lang.String str : conscryptProviderNames) {
            java.security.Provider provider = java.security.Security.getProvider(str);
            if (provider != null) {
                return provider;
            }
        }
        return null;
    }

    @javax.annotation.Nullable
    public static java.security.Provider providerWithReflectionOrNull() {
        try {
            return (java.security.Provider) java.lang.Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
        } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.IllegalArgumentException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
            return null;
        }
    }

    public static final boolean isConscryptProvider(java.security.Provider provider) {
        java.lang.String name2 = provider.getName();
        return name2.equals(com.google.android.gms.security.ProviderInstaller.PROVIDER_NAME) || name2.equals("AndroidOpenSSL") || name2.equals("Conscrypt");
    }

    private ConscryptUtil() {
    }
}
