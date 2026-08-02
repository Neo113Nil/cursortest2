package org.bouncycastle.jcajce.provider.config;

/* loaded from: classes17.dex */
public interface ProviderConfiguration {
    java.util.Set getAcceptableNamedCurves();

    java.util.Map getAdditionalECParameters();

    javax.crypto.spec.DHParameterSpec getDHDefaultParameters(int i);

    java.security.spec.DSAParameterSpec getDSADefaultParameters(int i);

    org.bouncycastle.jce.spec.ECParameterSpec getEcImplicitlyCa();
}
