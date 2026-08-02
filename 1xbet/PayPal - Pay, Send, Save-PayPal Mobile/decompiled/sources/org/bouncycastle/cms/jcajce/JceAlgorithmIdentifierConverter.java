package org.bouncycastle.cms.jcajce;

/* loaded from: classes17.dex */
public class JceAlgorithmIdentifierConverter {
    private org.bouncycastle.cms.jcajce.EnvelopedDataHelper getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.cms.jcajce.EnvelopedDataHelper(new org.bouncycastle.cms.jcajce.DefaultJcaJceExtHelper());

    public org.bouncycastle.cms.jcajce.JceAlgorithmIdentifierConverter setProvider(java.security.Provider provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.cms.jcajce.EnvelopedDataHelper(new org.bouncycastle.cms.jcajce.ProviderJcaJceExtHelper(provider));
        return this;
    }

    public org.bouncycastle.cms.jcajce.JceAlgorithmIdentifierConverter setProvider(java.lang.String str) {
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.cms.jcajce.EnvelopedDataHelper(new org.bouncycastle.cms.jcajce.NamedJcaJceExtHelper(str));
        return this;
    }

    public java.security.AlgorithmParameters getAlgorithmParameters(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) throws org.bouncycastle.cms.CMSException {
        if (algorithmIdentifier.getParameters() == null) {
            return null;
        }
        try {
            java.security.AlgorithmParameters highSpeedVideoFpsRanges = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(algorithmIdentifier.getAlgorithm());
            org.bouncycastle.cms.jcajce.CMSUtils.getHighSpeedVideoFpsRanges(highSpeedVideoFpsRanges, algorithmIdentifier.getParameters());
            return highSpeedVideoFpsRanges;
        } catch (java.security.NoSuchAlgorithmException e) {
            throw new org.bouncycastle.cms.CMSException("can't find parameters for algorithm", e);
        } catch (java.security.NoSuchProviderException e2) {
            throw new org.bouncycastle.cms.CMSException("can't find provider for algorithm", e2);
        }
    }
}
