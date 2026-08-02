package org.bouncycastle.tsp.cms;

/* loaded from: classes17.dex */
class MetaDataUtil {
    final org.bouncycastle.asn1.cms.MetaData getHighResolutionOutputSizeshNQ4ISI;

    final void Camera2StreamConfigurationMap(org.bouncycastle.operator.DigestCalculator digestCalculator) throws org.bouncycastle.cms.CMSException {
        org.bouncycastle.asn1.cms.MetaData metaData = this.getHighResolutionOutputSizeshNQ4ISI;
        if (metaData == null || !metaData.isHashProtected()) {
            return;
        }
        try {
            digestCalculator.getOutputStream().write(this.getHighResolutionOutputSizeshNQ4ISI.getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER));
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to initialise calculator from metaData: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cms.CMSException(sb.toString(), e);
        }
    }

    static java.lang.String getHighSpeedVideoFpsRangesFor(org.bouncycastle.asn1.ASN1String aSN1String) {
        if (aSN1String != null) {
            return aSN1String.toString();
        }
        return null;
    }

    MetaDataUtil(org.bouncycastle.asn1.cms.MetaData metaData) {
        this.getHighResolutionOutputSizeshNQ4ISI = metaData;
    }
}
