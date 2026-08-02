package org.bouncycastle.cms;

/* loaded from: classes17.dex */
class CMSEnvelopedHelper {

    static class CMSDigestAuthenticatedSecureReadable implements org.bouncycastle.cms.CMSSecureReadable {
        org.bouncycastle.operator.DigestCalculator Camera2StreamConfigurationMap;
        private final org.bouncycastle.asn1.ASN1ObjectIdentifier getHighResolutionOutputSizeshNQ4ISI;
        private org.bouncycastle.cms.CMSReadable getHighSpeedVideoSizes;

        @Override // org.bouncycastle.cms.CMSSecureReadable
        public final java.io.InputStream getHighSpeedVideoFpsRanges() throws java.io.IOException, org.bouncycastle.cms.CMSException {
            return new java.io.FilterInputStream(this.getHighSpeedVideoSizes.getInputStream()) { // from class: org.bouncycastle.cms.CMSEnvelopedHelper.CMSDigestAuthenticatedSecureReadable.1
                @Override // java.io.FilterInputStream, java.io.InputStream
                public int read(byte[] bArr, int i, int i2) throws java.io.IOException {
                    int read = this.in.read(bArr, i, i2);
                    if (read >= 0) {
                        org.bouncycastle.cms.CMSEnvelopedHelper.CMSDigestAuthenticatedSecureReadable.this.Camera2StreamConfigurationMap.getOutputStream().write(bArr, i, read);
                    }
                    return read;
                }

                @Override // java.io.FilterInputStream, java.io.InputStream
                public int read() throws java.io.IOException {
                    int read = this.in.read();
                    if (read >= 0) {
                        org.bouncycastle.cms.CMSEnvelopedHelper.CMSDigestAuthenticatedSecureReadable.this.Camera2StreamConfigurationMap.getOutputStream().write(read);
                    }
                    return read;
                }
            };
        }

        @Override // org.bouncycastle.cms.CMSSecureReadable
        public final org.bouncycastle.asn1.ASN1ObjectIdentifier Camera2StreamConfigurationMap() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public CMSDigestAuthenticatedSecureReadable(org.bouncycastle.operator.DigestCalculator digestCalculator, org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.cms.CMSReadable cMSReadable) {
            this.Camera2StreamConfigurationMap = digestCalculator;
            this.getHighResolutionOutputSizeshNQ4ISI = aSN1ObjectIdentifier;
            this.getHighSpeedVideoSizes = cMSReadable;
        }
    }

    static class CMSAuthenticatedSecureReadable implements org.bouncycastle.cms.CMSSecureReadable {
        private final org.bouncycastle.asn1.ASN1ObjectIdentifier Camera2StreamConfigurationMap;
        private org.bouncycastle.cms.CMSReadable getHighSpeedVideoFpsRanges;
        private org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoFpsRangesFor;

        @Override // org.bouncycastle.cms.CMSSecureReadable
        public final java.io.InputStream getHighSpeedVideoFpsRanges() throws java.io.IOException, org.bouncycastle.cms.CMSException {
            return this.getHighSpeedVideoFpsRanges.getInputStream();
        }

        @Override // org.bouncycastle.cms.CMSSecureReadable
        public final org.bouncycastle.asn1.ASN1ObjectIdentifier Camera2StreamConfigurationMap() {
            return this.Camera2StreamConfigurationMap;
        }

        CMSAuthenticatedSecureReadable(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.cms.CMSReadable cMSReadable) {
            this.getHighSpeedVideoFpsRangesFor = algorithmIdentifier;
            this.Camera2StreamConfigurationMap = aSN1ObjectIdentifier;
            this.getHighSpeedVideoFpsRanges = cMSReadable;
        }
    }

    static class CMSEnvelopedSecureReadable implements org.bouncycastle.cms.CMSSecureReadable {
        private org.bouncycastle.asn1.x509.AlgorithmIdentifier Camera2StreamConfigurationMap;
        private final org.bouncycastle.asn1.ASN1ObjectIdentifier getHighSpeedVideoFpsRangesFor;
        private org.bouncycastle.cms.CMSReadable getHighSpeedVideoSizes;

        @Override // org.bouncycastle.cms.CMSSecureReadable
        public final java.io.InputStream getHighSpeedVideoFpsRanges() throws java.io.IOException, org.bouncycastle.cms.CMSException {
            return this.getHighSpeedVideoSizes.getInputStream();
        }

        @Override // org.bouncycastle.cms.CMSSecureReadable
        public final org.bouncycastle.asn1.ASN1ObjectIdentifier Camera2StreamConfigurationMap() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        CMSEnvelopedSecureReadable(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.cms.CMSReadable cMSReadable) {
            this.Camera2StreamConfigurationMap = algorithmIdentifier;
            this.getHighSpeedVideoFpsRangesFor = aSN1ObjectIdentifier;
            this.getHighSpeedVideoSizes = cMSReadable;
        }
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(java.util.List list, org.bouncycastle.asn1.cms.RecipientInfo recipientInfo, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.cms.CMSSecureReadable cMSSecureReadable, org.bouncycastle.cms.AuthAttributesProvider authAttributesProvider) {
        org.bouncycastle.asn1.ASN1Encodable info = recipientInfo.getInfo();
        if (info instanceof org.bouncycastle.asn1.cms.KeyTransRecipientInfo) {
            list.add(new org.bouncycastle.cms.KeyTransRecipientInformation((org.bouncycastle.asn1.cms.KeyTransRecipientInfo) info, algorithmIdentifier, cMSSecureReadable, authAttributesProvider));
            return;
        }
        if (info instanceof org.bouncycastle.asn1.cms.KEKRecipientInfo) {
            list.add(new org.bouncycastle.cms.KEKRecipientInformation((org.bouncycastle.asn1.cms.KEKRecipientInfo) info, algorithmIdentifier, cMSSecureReadable, authAttributesProvider));
        } else if (info instanceof org.bouncycastle.asn1.cms.KeyAgreeRecipientInfo) {
            org.bouncycastle.cms.KeyAgreeRecipientInformation.Camera2StreamConfigurationMap(list, (org.bouncycastle.asn1.cms.KeyAgreeRecipientInfo) info, algorithmIdentifier, cMSSecureReadable, authAttributesProvider);
        } else if (info instanceof org.bouncycastle.asn1.cms.PasswordRecipientInfo) {
            list.add(new org.bouncycastle.cms.PasswordRecipientInformation((org.bouncycastle.asn1.cms.PasswordRecipientInfo) info, algorithmIdentifier, cMSSecureReadable, authAttributesProvider));
        }
    }

    static org.bouncycastle.cms.RecipientInformationStore getHighSpeedVideoFpsRangesFor(org.bouncycastle.asn1.ASN1Set aSN1Set, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.cms.CMSSecureReadable cMSSecureReadable, org.bouncycastle.cms.AuthAttributesProvider authAttributesProvider) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i != aSN1Set.size(); i++) {
            getHighResolutionOutputSizeshNQ4ISI(arrayList, org.bouncycastle.asn1.cms.RecipientInfo.getInstance(aSN1Set.getObjectAt(i)), algorithmIdentifier, cMSSecureReadable, authAttributesProvider);
        }
        return new org.bouncycastle.cms.RecipientInformationStore(arrayList);
    }

    static org.bouncycastle.cms.RecipientInformationStore getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.ASN1Set aSN1Set, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.cms.CMSSecureReadable cMSSecureReadable) {
        return getHighSpeedVideoFpsRangesFor(aSN1Set, algorithmIdentifier, cMSSecureReadable, null);
    }

    CMSEnvelopedHelper() {
    }
}
