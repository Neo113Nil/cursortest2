package org.bouncycastle.jcajce.provider.symmetric;

/* loaded from: classes17.dex */
abstract class SymmetricAlgorithmProvider extends org.bouncycastle.jcajce.provider.util.AlgorithmProvider {
    protected void addPoly1305Algorithm(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        configurableProvider.addAlgorithm("Mac.POLY1305-".concat(java.lang.String.valueOf(str)), str2);
        configurableProvider.addAlgorithm("Alg.Alias.Mac.POLY1305".concat(java.lang.String.valueOf(str)), "POLY1305-".concat(java.lang.String.valueOf(str)));
        configurableProvider.addAlgorithm("KeyGenerator.POLY1305-".concat(java.lang.String.valueOf(str)), str3);
        configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.POLY1305".concat(java.lang.String.valueOf(str)), "POLY1305-".concat(java.lang.String.valueOf(str)));
    }

    protected void addGMacAlgorithm(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Mac.");
        sb.append(str);
        sb.append("-GMAC");
        configurableProvider.addAlgorithm(sb.toString(), str2);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Alg.Alias.Mac.");
        sb2.append(str);
        sb2.append("GMAC");
        java.lang.String obj = sb2.toString();
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        sb3.append(str);
        sb3.append("-GMAC");
        configurableProvider.addAlgorithm(obj, sb3.toString());
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("KeyGenerator.");
        sb4.append(str);
        sb4.append("-GMAC");
        configurableProvider.addAlgorithm(sb4.toString(), str3);
        java.lang.StringBuilder sb5 = new java.lang.StringBuilder("Alg.Alias.KeyGenerator.");
        sb5.append(str);
        sb5.append("GMAC");
        java.lang.String obj2 = sb5.toString();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append("-GMAC");
        configurableProvider.addAlgorithm(obj2, sb6.toString());
    }

    protected void addCMacAlgorithm(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Mac.");
        sb.append(str);
        sb.append("-CMAC");
        configurableProvider.addAlgorithm(sb.toString(), str2);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Alg.Alias.Mac.");
        sb2.append(str);
        sb2.append("CMAC");
        java.lang.String obj = sb2.toString();
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        sb3.append(str);
        sb3.append("-CMAC");
        configurableProvider.addAlgorithm(obj, sb3.toString());
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("KeyGenerator.");
        sb4.append(str);
        sb4.append("-CMAC");
        configurableProvider.addAlgorithm(sb4.toString(), str3);
        java.lang.StringBuilder sb5 = new java.lang.StringBuilder("Alg.Alias.KeyGenerator.");
        sb5.append(str);
        sb5.append("CMAC");
        java.lang.String obj2 = sb5.toString();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append("-CMAC");
        configurableProvider.addAlgorithm(obj2, sb6.toString());
    }

    SymmetricAlgorithmProvider() {
    }
}
