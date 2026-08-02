package com.google.crypto.tink.internal;

/* loaded from: classes4.dex */
public final class MutableKeyDerivationRegistry {
    private static final com.google.crypto.tink.internal.MutableKeyDerivationRegistry globalInstance = new com.google.crypto.tink.internal.MutableKeyDerivationRegistry();
    private final java.util.Map<java.lang.Class<? extends com.google.crypto.tink.Parameters>, com.google.crypto.tink.internal.MutableKeyDerivationRegistry.InsecureKeyCreator<? extends com.google.crypto.tink.Parameters>> creators = new java.util.HashMap();

    public interface InsecureKeyCreator<ParametersT extends com.google.crypto.tink.Parameters> {
        com.google.crypto.tink.Key createKeyFromRandomness(ParametersT parameterst, java.io.InputStream inputStream, @javax.annotation.Nullable java.lang.Integer num, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException;
    }

    public static com.google.crypto.tink.internal.MutableKeyDerivationRegistry globalInstance() {
        return globalInstance;
    }

    public final <ParametersT extends com.google.crypto.tink.Parameters> void add(com.google.crypto.tink.internal.MutableKeyDerivationRegistry.InsecureKeyCreator<ParametersT> insecureKeyCreator, java.lang.Class<ParametersT> cls) throws java.security.GeneralSecurityException {
        synchronized (this) {
            com.google.crypto.tink.internal.MutableKeyDerivationRegistry.InsecureKeyCreator<? extends com.google.crypto.tink.Parameters> insecureKeyCreator2 = this.creators.get(cls);
            if (insecureKeyCreator2 != null && !insecureKeyCreator2.equals(insecureKeyCreator)) {
                throw new java.security.GeneralSecurityException("Different key creator for parameters class already inserted");
            }
            this.creators.put(cls, insecureKeyCreator);
        }
    }

    public final com.google.crypto.tink.Key createKeyFromRandomness(com.google.crypto.tink.Parameters parameters, java.io.InputStream inputStream, @javax.annotation.Nullable java.lang.Integer num, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        return createKeyFromRandomnessTyped(parameters, inputStream, num, secretKeyAccess);
    }

    private <ParametersT extends com.google.crypto.tink.Parameters> com.google.crypto.tink.Key createKeyFromRandomnessTyped(ParametersT parameterst, java.io.InputStream inputStream, @javax.annotation.Nullable java.lang.Integer num, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.Key createKeyFromRandomness;
        synchronized (this) {
            com.google.crypto.tink.internal.MutableKeyDerivationRegistry.InsecureKeyCreator<? extends com.google.crypto.tink.Parameters> insecureKeyCreator = this.creators.get(parameterst.getClass());
            if (insecureKeyCreator == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot use key derivation to derive key for parameters ");
                sb.append(parameterst);
                sb.append(": no key creator for this class was registered.");
                throw new java.security.GeneralSecurityException(sb.toString());
            }
            createKeyFromRandomness = insecureKeyCreator.createKeyFromRandomness(parameterst, inputStream, num, secretKeyAccess);
        }
        return createKeyFromRandomness;
    }
}
