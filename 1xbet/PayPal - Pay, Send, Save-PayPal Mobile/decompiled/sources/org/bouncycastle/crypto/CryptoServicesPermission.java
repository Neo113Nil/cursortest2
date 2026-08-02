package org.bouncycastle.crypto;

/* loaded from: classes17.dex */
public class CryptoServicesPermission extends java.security.Permission {
    public static final java.lang.String DEFAULT_RANDOM = "defaultRandomConfig";
    public static final java.lang.String GLOBAL_CONFIG = "globalConfig";
    public static final java.lang.String THREAD_LOCAL_CONFIG = "threadLocalConfig";
    private final java.util.Set<java.lang.String> getHighSpeedVideoFpsRanges;

    @Override // java.security.Permission
    public boolean implies(java.security.Permission permission) {
        if (!(permission instanceof org.bouncycastle.crypto.CryptoServicesPermission)) {
            return false;
        }
        org.bouncycastle.crypto.CryptoServicesPermission cryptoServicesPermission = (org.bouncycastle.crypto.CryptoServicesPermission) permission;
        return getName().equals(cryptoServicesPermission.getName()) || this.getHighSpeedVideoFpsRanges.containsAll(cryptoServicesPermission.getHighSpeedVideoFpsRanges);
    }

    public int hashCode() {
        return this.getHighSpeedVideoFpsRanges.hashCode();
    }

    @Override // java.security.Permission
    public java.lang.String getActions() {
        return this.getHighSpeedVideoFpsRanges.toString();
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof org.bouncycastle.crypto.CryptoServicesPermission) && this.getHighSpeedVideoFpsRanges.equals(((org.bouncycastle.crypto.CryptoServicesPermission) obj).getHighSpeedVideoFpsRanges);
    }

    public CryptoServicesPermission(java.lang.String str) {
        super(str);
        java.util.HashSet hashSet = new java.util.HashSet();
        this.getHighSpeedVideoFpsRanges = hashSet;
        hashSet.add(str);
    }
}
