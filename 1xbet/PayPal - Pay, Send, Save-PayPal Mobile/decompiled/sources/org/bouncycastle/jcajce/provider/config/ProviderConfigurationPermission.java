package org.bouncycastle.jcajce.provider.config;

/* loaded from: classes17.dex */
public class ProviderConfigurationPermission extends java.security.BasicPermission {
    private final java.lang.String getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoSizes;

    public ProviderConfigurationPermission(java.lang.String str, java.lang.String str2) {
        super(str, str2);
        this.getHighSpeedVideoFpsRanges = str2;
        java.util.StringTokenizer stringTokenizer = new java.util.StringTokenizer(org.bouncycastle.util.Strings.toLowerCase(str2), " ,");
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            java.lang.String nextToken = stringTokenizer.nextToken();
            if (nextToken.equals("threadlocalecimplicitlyca")) {
                i |= 1;
            } else if (nextToken.equals("ecimplicitlyca")) {
                i |= 2;
            } else if (nextToken.equals("threadlocaldhdefaultparams")) {
                i |= 4;
            } else if (nextToken.equals("dhdefaultparams")) {
                i |= 8;
            } else if (nextToken.equals("acceptableeccurves")) {
                i |= 16;
            } else if (nextToken.equals("additionalecparameters")) {
                i |= 32;
            } else if (nextToken.equals("all")) {
                i = 63;
            }
        }
        if (i == 0) {
            throw new java.lang.IllegalArgumentException("unknown permissions passed to mask");
        }
        this.getHighSpeedVideoSizes = i;
    }

    @Override // java.security.BasicPermission, java.security.Permission
    public boolean implies(java.security.Permission permission) {
        if (!(permission instanceof org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission) || !getName().equals(permission.getName())) {
            return false;
        }
        int i = this.getHighSpeedVideoSizes;
        int i2 = ((org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission) permission).getHighSpeedVideoSizes;
        return (i & i2) == i2;
    }

    public int hashCode() {
        return getName().hashCode() + this.getHighSpeedVideoSizes;
    }

    @Override // java.security.BasicPermission, java.security.Permission
    public java.lang.String getActions() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission)) {
            return false;
        }
        org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission providerConfigurationPermission = (org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission) obj;
        return this.getHighSpeedVideoSizes == providerConfigurationPermission.getHighSpeedVideoSizes && getName().equals(providerConfigurationPermission.getName());
    }

    public ProviderConfigurationPermission(java.lang.String str) {
        super(str);
        this.getHighSpeedVideoFpsRanges = "all";
        this.getHighSpeedVideoSizes = 63;
    }
}
