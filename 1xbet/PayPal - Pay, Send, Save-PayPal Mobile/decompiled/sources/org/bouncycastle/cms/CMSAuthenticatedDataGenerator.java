package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public class CMSAuthenticatedDataGenerator extends org.bouncycastle.cms.CMSAuthenticatedGenerator {
    public org.bouncycastle.cms.CMSAuthenticatedData generate(org.bouncycastle.cms.CMSTypedData cMSTypedData, org.bouncycastle.operator.MacCalculator macCalculator, final org.bouncycastle.operator.DigestCalculator digestCalculator) throws org.bouncycastle.cms.CMSException {
        org.bouncycastle.asn1.cms.AuthenticatedData authenticatedData;
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
        java.util.Iterator it = this.Camera2StreamConfigurationMap.iterator();
        while (it.hasNext()) {
            aSN1EncodableVector.add(((org.bouncycastle.cms.RecipientInfoGenerator) it.next()).generate(macCalculator.getKey()));
        }
        if (digestCalculator != null) {
            try {
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                org.bouncycastle.util.io.TeeOutputStream teeOutputStream = new org.bouncycastle.util.io.TeeOutputStream(digestCalculator.getOutputStream(), byteArrayOutputStream);
                cMSTypedData.write(teeOutputStream);
                teeOutputStream.close();
                org.bouncycastle.asn1.BEROctetString bEROctetString = new org.bouncycastle.asn1.BEROctetString(byteArrayOutputStream.toByteArray());
                java.util.Map unmodifiableMap = java.util.Collections.unmodifiableMap(getBaseParameters(cMSTypedData.getContentType(), digestCalculator.getAlgorithmIdentifier(), macCalculator.getAlgorithmIdentifier(), digestCalculator.getDigest()));
                if (this.authGen == null) {
                    this.authGen = new org.bouncycastle.cms.DefaultAuthenticatedAttributeTableGenerator();
                }
                org.bouncycastle.asn1.DERSet dERSet = new org.bouncycastle.asn1.DERSet(this.authGen.getAttributes(unmodifiableMap).toASN1EncodableVector());
                try {
                    java.io.OutputStream outputStream = macCalculator.getOutputStream();
                    outputStream.write(dERSet.getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER));
                    outputStream.close();
                    authenticatedData = new org.bouncycastle.asn1.cms.AuthenticatedData(this.originatorInfo, new org.bouncycastle.asn1.DERSet(aSN1EncodableVector), macCalculator.getAlgorithmIdentifier(), digestCalculator.getAlgorithmIdentifier(), new org.bouncycastle.asn1.cms.ContentInfo(cMSTypedData.getContentType(), bEROctetString), dERSet, new org.bouncycastle.asn1.DEROctetString(macCalculator.getMac()), this.unauthGen != null ? new org.bouncycastle.asn1.BERSet(this.unauthGen.getAttributes(unmodifiableMap).toASN1EncodableVector()) : null);
                } catch (java.io.IOException e) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to perform MAC calculation: ");
                    sb.append(e.getMessage());
                    throw new org.bouncycastle.cms.CMSException(sb.toString(), e);
                }
            } catch (java.io.IOException e2) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("unable to perform digest calculation: ");
                sb2.append(e2.getMessage());
                throw new org.bouncycastle.cms.CMSException(sb2.toString(), e2);
            }
        } else {
            try {
                java.io.ByteArrayOutputStream byteArrayOutputStream2 = new java.io.ByteArrayOutputStream();
                org.bouncycastle.util.io.TeeOutputStream teeOutputStream2 = new org.bouncycastle.util.io.TeeOutputStream(byteArrayOutputStream2, macCalculator.getOutputStream());
                cMSTypedData.write(teeOutputStream2);
                teeOutputStream2.close();
                org.bouncycastle.asn1.BEROctetString bEROctetString2 = new org.bouncycastle.asn1.BEROctetString(byteArrayOutputStream2.toByteArray());
                authenticatedData = new org.bouncycastle.asn1.cms.AuthenticatedData(this.originatorInfo, new org.bouncycastle.asn1.DERSet(aSN1EncodableVector), macCalculator.getAlgorithmIdentifier(), null, new org.bouncycastle.asn1.cms.ContentInfo(cMSTypedData.getContentType(), bEROctetString2), null, new org.bouncycastle.asn1.DEROctetString(macCalculator.getMac()), this.unauthGen != null ? new org.bouncycastle.asn1.BERSet(this.unauthGen.getAttributes(java.util.Collections.EMPTY_MAP).toASN1EncodableVector()) : null);
            } catch (java.io.IOException e3) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("unable to perform MAC calculation: ");
                sb3.append(e3.getMessage());
                throw new org.bouncycastle.cms.CMSException(sb3.toString(), e3);
            }
        }
        return new org.bouncycastle.cms.CMSAuthenticatedData(new org.bouncycastle.asn1.cms.ContentInfo(org.bouncycastle.asn1.cms.CMSObjectIdentifiers.authenticatedData, authenticatedData), new org.bouncycastle.operator.DigestCalculatorProvider() { // from class: org.bouncycastle.cms.CMSAuthenticatedDataGenerator.1
            @Override // org.bouncycastle.operator.DigestCalculatorProvider
            public org.bouncycastle.operator.DigestCalculator get(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) throws org.bouncycastle.operator.OperatorCreationException {
                return digestCalculator;
            }
        });
    }

    public org.bouncycastle.cms.CMSAuthenticatedData generate(org.bouncycastle.cms.CMSTypedData cMSTypedData, org.bouncycastle.operator.MacCalculator macCalculator) throws org.bouncycastle.cms.CMSException {
        return generate(cMSTypedData, macCalculator, null);
    }
}
