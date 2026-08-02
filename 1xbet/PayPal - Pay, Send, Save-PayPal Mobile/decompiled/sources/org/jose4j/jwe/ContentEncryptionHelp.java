package org.jose4j.jwe;

/* loaded from: classes18.dex */
class ContentEncryptionHelp {
    ContentEncryptionHelp() {
    }

    static java.lang.String getHighSpeedVideoSizes(org.jose4j.jwx.Headers headers, org.jose4j.jca.ProviderContext providerContext) {
        return ((headers == null || !org.jose4j.jwe.KeyManagementAlgorithmIdentifiers.DIRECT.equals(headers.getStringHeaderValue("alg"))) ? providerContext.getGeneralProviderContext() : providerContext.getSuppliedKeyProviderContext()).getCipherProvider();
    }

    static java.lang.String getHighSpeedVideoFpsRangesFor(org.jose4j.jwx.Headers headers, org.jose4j.jca.ProviderContext providerContext) {
        return ((headers == null || !org.jose4j.jwe.KeyManagementAlgorithmIdentifiers.DIRECT.equals(headers.getStringHeaderValue("alg"))) ? providerContext.getGeneralProviderContext() : providerContext.getSuppliedKeyProviderContext()).getMacProvider();
    }
}
