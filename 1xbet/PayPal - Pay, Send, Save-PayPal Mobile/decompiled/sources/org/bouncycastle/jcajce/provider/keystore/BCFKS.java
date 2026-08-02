package org.bouncycastle.jcajce.provider.keystore;

/* loaded from: classes17.dex */
public class BCFKS {

    public static class Mappings extends org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("KeyStore.BCFKS", "org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi$Std");
            configurableProvider.addAlgorithm("KeyStore.BCFKS-DEF", "org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi$Def");
            configurableProvider.addAlgorithm("KeyStore.FIPS", "org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi$StdCompat");
            configurableProvider.addAlgorithm("KeyStore.FIPS-DEF", "org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi$DefCompat");
            configurableProvider.addAlgorithm("KeyStore.IBCFKS", "org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi$StdShared");
            configurableProvider.addAlgorithm("KeyStore.IBCFKS-DEF", "org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi$DefShared");
            configurableProvider.addAlgorithm("KeyStore.IFIPS", "org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi$StdSharedCompat");
            configurableProvider.addAlgorithm("KeyStore.IFIPS-DEF", "org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi$DefSharedCompat");
        }
    }
}
