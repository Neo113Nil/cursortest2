package org.bouncycastle.cert;

/* loaded from: classes17.dex */
class CertUtils {
    private static java.util.Set getHighSpeedVideoSizes = java.util.Collections.unmodifiableSet(new java.util.HashSet());
    private static java.util.List getHighSpeedVideoFpsRangesFor = java.util.Collections.unmodifiableList(new java.util.ArrayList());

    static org.bouncycastle.cert.X509AttributeCertificateHolder Camera2StreamConfigurationMap(org.bouncycastle.operator.ContentSigner contentSigner, org.bouncycastle.asn1.x509.AttributeCertificateInfo attributeCertificateInfo) {
        try {
            org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier = contentSigner.getAlgorithmIdentifier();
            java.io.OutputStream outputStream = contentSigner.getOutputStream();
            attributeCertificateInfo.encodeTo(outputStream, org.bouncycastle.asn1.ASN1Encoding.DER);
            outputStream.close();
            byte[] signature = contentSigner.getSignature();
            org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
            aSN1EncodableVector.add(attributeCertificateInfo);
            aSN1EncodableVector.add(algorithmIdentifier);
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERBitString(signature));
            return new org.bouncycastle.cert.X509AttributeCertificateHolder(org.bouncycastle.asn1.x509.AttributeCertificate.getInstance(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector)));
        } catch (java.io.IOException unused) {
            throw new java.lang.IllegalStateException("cannot produce attribute certificate signature");
        }
    }

    static org.bouncycastle.cert.X509CRLHolder getHighSpeedVideoSizes(org.bouncycastle.operator.ContentSigner contentSigner, org.bouncycastle.asn1.x509.TBSCertList tBSCertList) {
        try {
            org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier = contentSigner.getAlgorithmIdentifier();
            java.io.OutputStream outputStream = contentSigner.getOutputStream();
            tBSCertList.encodeTo(outputStream, org.bouncycastle.asn1.ASN1Encoding.DER);
            outputStream.close();
            byte[] signature = contentSigner.getSignature();
            org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
            aSN1EncodableVector.add(tBSCertList);
            aSN1EncodableVector.add(algorithmIdentifier);
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERBitString(signature));
            return new org.bouncycastle.cert.X509CRLHolder(org.bouncycastle.asn1.x509.CertificateList.getInstance(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector)));
        } catch (java.io.IOException unused) {
            throw new java.lang.IllegalStateException("cannot produce certificate signature");
        }
    }

    static org.bouncycastle.cert.X509CertificateHolder getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.operator.ContentSigner contentSigner, org.bouncycastle.asn1.x509.TBSCertificate tBSCertificate) {
        try {
            org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier = contentSigner.getAlgorithmIdentifier();
            java.io.OutputStream outputStream = contentSigner.getOutputStream();
            tBSCertificate.encodeTo(outputStream, org.bouncycastle.asn1.ASN1Encoding.DER);
            outputStream.close();
            byte[] signature = contentSigner.getSignature();
            org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
            aSN1EncodableVector.add(tBSCertificate);
            aSN1EncodableVector.add(algorithmIdentifier);
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERBitString(signature));
            return new org.bouncycastle.cert.X509CertificateHolder(org.bouncycastle.asn1.x509.Certificate.getInstance(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector)));
        } catch (java.io.IOException unused) {
            throw new java.lang.IllegalStateException("cannot produce certificate signature");
        }
    }

    static java.util.Date getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1GeneralizedTime aSN1GeneralizedTime) {
        try {
            return aSN1GeneralizedTime.getDate();
        } catch (java.text.ParseException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to recover date: ");
            sb.append(e.getMessage());
            throw new java.lang.IllegalStateException(sb.toString());
        }
    }

    static org.bouncycastle.asn1.ASN1Primitive getHighSpeedVideoSizes(byte[] bArr) throws java.io.IOException {
        org.bouncycastle.asn1.ASN1Primitive fromByteArray = org.bouncycastle.asn1.ASN1Primitive.fromByteArray(bArr);
        if (fromByteArray != null) {
            return fromByteArray;
        }
        throw new java.io.IOException("no content found");
    }

    static boolean getHighSpeedVideoSizes(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier2) {
        if (!algorithmIdentifier.getAlgorithm().equals((org.bouncycastle.asn1.ASN1Primitive) algorithmIdentifier2.getAlgorithm())) {
            return false;
        }
        if (org.bouncycastle.util.Properties.isOverrideSet("org.bouncycastle.x509.allow_absent_equiv_NULL")) {
            if (algorithmIdentifier.getParameters() == null) {
                return algorithmIdentifier2.getParameters() == null || algorithmIdentifier2.getParameters().equals(org.bouncycastle.asn1.DERNull.INSTANCE);
            }
            if (algorithmIdentifier2.getParameters() == null) {
                return algorithmIdentifier.getParameters() == null || algorithmIdentifier.getParameters().equals(org.bouncycastle.asn1.DERNull.INSTANCE);
            }
        }
        if (algorithmIdentifier.getParameters() != null) {
            return algorithmIdentifier.getParameters().equals(algorithmIdentifier2.getParameters());
        }
        if (algorithmIdentifier2.getParameters() != null) {
            return algorithmIdentifier2.getParameters().equals(algorithmIdentifier.getParameters());
        }
        return true;
    }

    static java.util.Set getHighSpeedVideoFpsRangesFor(org.bouncycastle.asn1.x509.Extensions extensions) {
        return extensions == null ? getHighSpeedVideoSizes : java.util.Collections.unmodifiableSet(new java.util.HashSet(java.util.Arrays.asList(extensions.getNonCriticalExtensionOIDs())));
    }

    static java.util.List getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.x509.Extensions extensions) {
        return extensions == null ? getHighSpeedVideoFpsRangesFor : java.util.Collections.unmodifiableList(java.util.Arrays.asList(extensions.getExtensionOIDs()));
    }

    static java.util.Set getHighSpeedVideoSizes(org.bouncycastle.asn1.x509.Extensions extensions) {
        return extensions == null ? getHighSpeedVideoSizes : java.util.Collections.unmodifiableSet(new java.util.HashSet(java.util.Arrays.asList(extensions.getCriticalExtensionOIDs())));
    }

    static org.bouncycastle.asn1.x509.ExtensionsGenerator Camera2StreamConfigurationMap(org.bouncycastle.asn1.x509.ExtensionsGenerator extensionsGenerator, org.bouncycastle.asn1.x509.Extension extension) {
        org.bouncycastle.asn1.x509.Extensions generate = extensionsGenerator.generate();
        org.bouncycastle.asn1.x509.ExtensionsGenerator extensionsGenerator2 = new org.bouncycastle.asn1.x509.ExtensionsGenerator();
        java.util.Enumeration oids = generate.oids();
        boolean z = false;
        while (oids.hasMoreElements()) {
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = (org.bouncycastle.asn1.ASN1ObjectIdentifier) oids.nextElement();
            if (aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) extension.getExtnId())) {
                extensionsGenerator2.addExtension(extension);
                z = true;
            } else {
                extensionsGenerator2.addExtension(generate.getExtension(aSN1ObjectIdentifier));
            }
        }
        if (z) {
            return extensionsGenerator2;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("replace - original extension (OID = ");
        sb.append(extension.getExtnId());
        sb.append(") not found");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    static org.bouncycastle.asn1.x509.ExtensionsGenerator getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.x509.ExtensionsGenerator extensionsGenerator, org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        org.bouncycastle.asn1.x509.Extensions generate = extensionsGenerator.generate();
        org.bouncycastle.asn1.x509.ExtensionsGenerator extensionsGenerator2 = new org.bouncycastle.asn1.x509.ExtensionsGenerator();
        java.util.Enumeration oids = generate.oids();
        boolean z = false;
        while (oids.hasMoreElements()) {
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier2 = (org.bouncycastle.asn1.ASN1ObjectIdentifier) oids.nextElement();
            if (aSN1ObjectIdentifier2.equals((org.bouncycastle.asn1.ASN1Primitive) aSN1ObjectIdentifier)) {
                z = true;
            } else {
                extensionsGenerator2.addExtension(generate.getExtension(aSN1ObjectIdentifier2));
            }
        }
        if (z) {
            return extensionsGenerator2;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("remove - extension (OID = ");
        sb.append(aSN1ObjectIdentifier);
        sb.append(") not found");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    static org.bouncycastle.asn1.DERBitString getHighSpeedVideoSizes(boolean[] zArr) {
        byte[] bArr = new byte[(zArr.length + 7) / 8];
        for (int i = 0; i != zArr.length; i++) {
            int i2 = i / 8;
            bArr[i2] = (byte) (bArr[i2] | (zArr[i] ? 1 << (7 - (i % 8)) : 0));
        }
        int length = zArr.length % 8;
        return length == 0 ? new org.bouncycastle.asn1.DERBitString(bArr) : new org.bouncycastle.asn1.DERBitString(bArr, 8 - length);
    }

    static boolean[] getHighSpeedVideoFpsRanges(org.bouncycastle.asn1.ASN1BitString aSN1BitString) {
        if (aSN1BitString == null) {
            return null;
        }
        byte[] bytes = aSN1BitString.getBytes();
        int length = (bytes.length * 8) - aSN1BitString.getPadBits();
        boolean[] zArr = new boolean[length];
        for (int i = 0; i != length; i++) {
            zArr[i] = (bytes[i / 8] & (128 >>> (i % 8))) != 0;
        }
        return zArr;
    }

    static void getHighSpeedVideoFpsRanges(org.bouncycastle.asn1.x509.ExtensionsGenerator extensionsGenerator, org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) throws org.bouncycastle.cert.CertIOException {
        try {
            extensionsGenerator.addExtension(aSN1ObjectIdentifier, z, aSN1Encodable);
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("cannot encode extension: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cert.CertIOException(sb.toString(), e);
        }
    }

    CertUtils() {
    }
}
