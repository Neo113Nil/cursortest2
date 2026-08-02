package org.bouncycastle.jcajce.provider.asymmetric.x509;

/* loaded from: classes17.dex */
public class PKIXCertPath extends java.security.cert.CertPath {
    static final java.util.List getHighSpeedVideoFpsRangesFor;
    private java.util.List getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.jcajce.util.JcaJceHelper getHighSpeedVideoSizes;

    @Override // java.security.cert.CertPath
    public java.util.Iterator getEncodings() {
        return getHighSpeedVideoFpsRangesFor.iterator();
    }

    @Override // java.security.cert.CertPath
    public byte[] getEncoded(java.lang.String str) throws java.security.cert.CertificateEncodingException {
        if (str.equalsIgnoreCase("PkiPath")) {
            org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
            java.util.List list = this.getHighResolutionOutputSizeshNQ4ISI;
            java.util.ListIterator listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                aSN1EncodableVector.add(getHighSpeedVideoFpsRangesFor((java.security.cert.X509Certificate) listIterator.previous()));
            }
            return getHighSpeedVideoFpsRanges(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector));
        }
        int i = 0;
        if (str.equalsIgnoreCase(org.bouncycastle.openssl.PEMParser.TYPE_PKCS7)) {
            org.bouncycastle.asn1.pkcs.ContentInfo contentInfo = new org.bouncycastle.asn1.pkcs.ContentInfo(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.data, null);
            org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector2 = new org.bouncycastle.asn1.ASN1EncodableVector();
            while (i != this.getHighResolutionOutputSizeshNQ4ISI.size()) {
                aSN1EncodableVector2.add(getHighSpeedVideoFpsRangesFor((java.security.cert.X509Certificate) this.getHighResolutionOutputSizeshNQ4ISI.get(i)));
                i++;
            }
            return getHighSpeedVideoFpsRanges(new org.bouncycastle.asn1.pkcs.ContentInfo(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.signedData, new org.bouncycastle.asn1.pkcs.SignedData(new org.bouncycastle.asn1.ASN1Integer(1L), new org.bouncycastle.asn1.DERSet(), contentInfo, new org.bouncycastle.asn1.DERSet(aSN1EncodableVector2), null, new org.bouncycastle.asn1.DERSet())));
        }
        if (!str.equalsIgnoreCase("PEM")) {
            throw new java.security.cert.CertificateEncodingException("unsupported encoding: ".concat(java.lang.String.valueOf(str)));
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        org.bouncycastle.util.io.pem.PemWriter pemWriter = new org.bouncycastle.util.io.pem.PemWriter(new java.io.OutputStreamWriter(byteArrayOutputStream));
        while (i != this.getHighResolutionOutputSizeshNQ4ISI.size()) {
            try {
                pemWriter.writeObject(new org.bouncycastle.util.io.pem.PemObject(org.bouncycastle.openssl.PEMParser.TYPE_CERTIFICATE, ((java.security.cert.X509Certificate) this.getHighResolutionOutputSizeshNQ4ISI.get(i)).getEncoded()));
                i++;
            } catch (java.lang.Exception unused) {
                throw new java.security.cert.CertificateEncodingException("can't encode certificate for PEM encoded path");
            }
        }
        pemWriter.close();
        return byteArrayOutputStream.toByteArray();
    }

    @Override // java.security.cert.CertPath
    public byte[] getEncoded() throws java.security.cert.CertificateEncodingException {
        java.util.Iterator<java.lang.String> encodings = getEncodings();
        if (!encodings.hasNext()) {
            return null;
        }
        java.lang.String next = encodings.next();
        if (next instanceof java.lang.String) {
            return getEncoded(next);
        }
        return null;
    }

    @Override // java.security.cert.CertPath
    public java.util.List getCertificates() {
        return java.util.Collections.unmodifiableList(new java.util.ArrayList(this.getHighResolutionOutputSizeshNQ4ISI));
    }

    private static byte[] getHighSpeedVideoFpsRanges(org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) throws java.security.cert.CertificateEncodingException {
        try {
            return aSN1Encodable.toASN1Primitive().getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER);
        } catch (java.io.IOException e) {
            throw new java.security.cert.CertificateEncodingException("Exception thrown: ".concat(java.lang.String.valueOf(e)));
        }
    }

    private static org.bouncycastle.asn1.ASN1Primitive getHighSpeedVideoFpsRangesFor(java.security.cert.X509Certificate x509Certificate) throws java.security.cert.CertificateEncodingException {
        try {
            return new org.bouncycastle.asn1.ASN1InputStream(x509Certificate.getEncoded()).readObject();
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Exception while encoding certificate: ");
            sb.append(e.toString());
            throw new java.security.cert.CertificateEncodingException(sb.toString());
        }
    }

    private static java.util.List getHighSpeedVideoSizes(java.util.List list) {
        if (list.size() >= 2) {
            javax.security.auth.x500.X500Principal issuerX500Principal = ((java.security.cert.X509Certificate) list.get(0)).getIssuerX500Principal();
            for (int i = 1; i != list.size(); i++) {
                if (!issuerX500Principal.equals(((java.security.cert.X509Certificate) list.get(i)).getSubjectX500Principal())) {
                    java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(list);
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        java.security.cert.X509Certificate x509Certificate = (java.security.cert.X509Certificate) list.get(i2);
                        javax.security.auth.x500.X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
                        int i3 = 0;
                        while (true) {
                            if (i3 == list.size()) {
                                arrayList.add(x509Certificate);
                                list.remove(i2);
                                break;
                            }
                            if (!((java.security.cert.X509Certificate) list.get(i3)).getIssuerX500Principal().equals(subjectX500Principal)) {
                                i3++;
                            }
                        }
                    }
                    if (arrayList.size() <= 1) {
                        for (int i4 = 0; i4 != arrayList.size(); i4++) {
                            javax.security.auth.x500.X500Principal issuerX500Principal2 = ((java.security.cert.X509Certificate) arrayList.get(i4)).getIssuerX500Principal();
                            int i5 = 0;
                            while (true) {
                                if (i5 < list.size()) {
                                    java.security.cert.X509Certificate x509Certificate2 = (java.security.cert.X509Certificate) list.get(i5);
                                    if (issuerX500Principal2.equals(x509Certificate2.getSubjectX500Principal())) {
                                        arrayList.add(x509Certificate2);
                                        list.remove(i5);
                                        break;
                                    }
                                    i5++;
                                }
                            }
                        }
                        if (list.size() <= 0) {
                            return arrayList;
                        }
                    }
                    return arrayList2;
                }
                issuerX500Principal = ((java.security.cert.X509Certificate) list.get(i)).getIssuerX500Principal();
            }
        }
        return list;
    }

    PKIXCertPath(java.util.List list) {
        super("X.509");
        this.getHighSpeedVideoSizes = new org.bouncycastle.jcajce.util.BCJcaJceHelper();
        this.getHighResolutionOutputSizeshNQ4ISI = getHighSpeedVideoSizes(new java.util.ArrayList(list));
    }

    PKIXCertPath(java.io.InputStream inputStream, java.lang.String str) throws java.security.cert.CertificateException {
        super("X.509");
        org.bouncycastle.jcajce.util.BCJcaJceHelper bCJcaJceHelper = new org.bouncycastle.jcajce.util.BCJcaJceHelper();
        this.getHighSpeedVideoSizes = bCJcaJceHelper;
        try {
            if (!str.equalsIgnoreCase("PkiPath")) {
                if (!str.equalsIgnoreCase(org.bouncycastle.openssl.PEMParser.TYPE_PKCS7) && !str.equalsIgnoreCase("PEM")) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("unsupported encoding: ");
                    sb.append(str);
                    throw new java.security.cert.CertificateException(sb.toString());
                }
                java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(inputStream);
                this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList();
                java.security.cert.CertificateFactory createCertificateFactory = bCJcaJceHelper.createCertificateFactory("X.509");
                while (true) {
                    java.security.cert.Certificate generateCertificate = createCertificateFactory.generateCertificate(bufferedInputStream);
                    if (generateCertificate == null) {
                        break;
                    } else {
                        this.getHighResolutionOutputSizeshNQ4ISI.add(generateCertificate);
                    }
                }
            } else {
                org.bouncycastle.asn1.ASN1Primitive readObject = new org.bouncycastle.asn1.ASN1InputStream(inputStream).readObject();
                if (!(readObject instanceof org.bouncycastle.asn1.ASN1Sequence)) {
                    throw new java.security.cert.CertificateException("input stream does not contain a ASN1 SEQUENCE while reading PkiPath encoded data to load CertPath");
                }
                java.util.Enumeration objects = ((org.bouncycastle.asn1.ASN1Sequence) readObject).getObjects();
                this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList();
                java.security.cert.CertificateFactory createCertificateFactory2 = bCJcaJceHelper.createCertificateFactory("X.509");
                while (objects.hasMoreElements()) {
                    this.getHighResolutionOutputSizeshNQ4ISI.add(0, createCertificateFactory2.generateCertificate(new java.io.ByteArrayInputStream(((org.bouncycastle.asn1.ASN1Encodable) objects.nextElement()).toASN1Primitive().getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER))));
                }
            }
            this.getHighResolutionOutputSizeshNQ4ISI = getHighSpeedVideoSizes(this.getHighResolutionOutputSizeshNQ4ISI);
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("IOException throw while decoding CertPath:\n");
            sb2.append(e.toString());
            throw new java.security.cert.CertificateException(sb2.toString());
        } catch (java.security.NoSuchProviderException e2) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("BouncyCastle provider not found while trying to get a CertificateFactory:\n");
            sb3.append(e2.toString());
            throw new java.security.cert.CertificateException(sb3.toString());
        }
    }

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("PkiPath");
        arrayList.add("PEM");
        arrayList.add(org.bouncycastle.openssl.PEMParser.TYPE_PKCS7);
        getHighSpeedVideoFpsRangesFor = java.util.Collections.unmodifiableList(arrayList);
    }
}
