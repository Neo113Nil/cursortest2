package org.bouncycastle.jce.provider;

/* loaded from: classes17.dex */
class OcspCache {
    private static java.util.Map<java.net.URI, java.lang.ref.WeakReference<java.util.Map<org.bouncycastle.asn1.ocsp.CertID, org.bouncycastle.asn1.ocsp.OCSPResponse>>> getHighSpeedVideoSizes = java.util.Collections.synchronizedMap(new java.util.WeakHashMap());

    static org.bouncycastle.asn1.ocsp.OCSPResponse getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.ocsp.CertID certID, org.bouncycastle.jcajce.PKIXCertRevocationCheckerParameters pKIXCertRevocationCheckerParameters, java.net.URI uri, java.security.cert.X509Certificate x509Certificate, java.util.List<java.security.cert.Extension> list, org.bouncycastle.jcajce.util.JcaJceHelper jcaJceHelper) throws java.security.cert.CertPathValidatorException {
        org.bouncycastle.asn1.ocsp.OCSPResponse oCSPResponse;
        org.bouncycastle.asn1.ocsp.OCSPResponse oCSPResponse2;
        org.bouncycastle.asn1.ASN1GeneralizedTime nextUpdate;
        java.lang.ref.WeakReference<java.util.Map<org.bouncycastle.asn1.ocsp.CertID, org.bouncycastle.asn1.ocsp.OCSPResponse>> weakReference = getHighSpeedVideoSizes.get(uri);
        java.util.Map<org.bouncycastle.asn1.ocsp.CertID, org.bouncycastle.asn1.ocsp.OCSPResponse> map = weakReference != null ? weakReference.get() : null;
        if (map != null && (oCSPResponse2 = map.get(certID)) != null) {
            org.bouncycastle.asn1.ASN1Sequence responses = org.bouncycastle.asn1.ocsp.ResponseData.getInstance(org.bouncycastle.asn1.ocsp.BasicOCSPResponse.getInstance(org.bouncycastle.asn1.ASN1OctetString.getInstance(oCSPResponse2.getResponseBytes().getResponse()).getOctets()).getTbsResponseData()).getResponses();
            for (int i = 0; i != responses.size(); i++) {
                org.bouncycastle.asn1.ocsp.SingleResponse singleResponse = org.bouncycastle.asn1.ocsp.SingleResponse.getInstance(responses.getObjectAt(i));
                if (certID.equals(singleResponse.getCertID()) && (nextUpdate = singleResponse.getNextUpdate()) != null) {
                    try {
                    } catch (java.text.ParseException unused) {
                        map.remove(certID);
                    }
                    if (pKIXCertRevocationCheckerParameters.getValidDate().after(nextUpdate.getDate())) {
                        map.remove(certID);
                        oCSPResponse2 = null;
                    }
                }
            }
            if (oCSPResponse2 != null) {
                return oCSPResponse2;
            }
        }
        try {
            java.net.URL url = uri.toURL();
            org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
            aSN1EncodableVector.add(new org.bouncycastle.asn1.ocsp.Request(certID, null));
            org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector2 = new org.bouncycastle.asn1.ASN1EncodableVector();
            byte[] bArr = null;
            for (int i2 = 0; i2 != list.size(); i2++) {
                java.security.cert.Extension extension = list.get(i2);
                byte[] value = extension.getValue();
                if (org.bouncycastle.asn1.ocsp.OCSPObjectIdentifiers.id_pkix_ocsp_nonce.getId().equals(extension.getId())) {
                    bArr = value;
                }
                aSN1EncodableVector2.add(new org.bouncycastle.asn1.x509.Extension(new org.bouncycastle.asn1.ASN1ObjectIdentifier(extension.getId()), extension.isCritical(), value));
            }
            try {
                byte[] encoded = new org.bouncycastle.asn1.ocsp.OCSPRequest(new org.bouncycastle.asn1.ocsp.TBSRequest((org.bouncycastle.asn1.x509.GeneralName) null, new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector), org.bouncycastle.asn1.x509.Extensions.getInstance(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector2))), null).getEncoded();
                java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) url.openConnection();
                httpURLConnection.setConnectTimeout(15000);
                httpURLConnection.setReadTimeout(15000);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("Content-type", "application/ocsp-request");
                httpURLConnection.setRequestProperty("Content-length", java.lang.String.valueOf(encoded.length));
                java.io.OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(encoded);
                outputStream.flush();
                java.io.InputStream inputStream = httpURLConnection.getInputStream();
                int contentLength = httpURLConnection.getContentLength();
                if (contentLength < 0) {
                    contentLength = 32768;
                }
                oCSPResponse = org.bouncycastle.asn1.ocsp.OCSPResponse.getInstance(org.bouncycastle.util.io.Streams.readAllLimited(inputStream, contentLength));
            } catch (java.io.IOException e) {
                e = e;
            }
            try {
                if (oCSPResponse.getResponseStatus().getIntValue() != 0) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append("OCSP responder failed: ");
                    sb.append(oCSPResponse.getResponseStatus().getValue());
                    throw new java.security.cert.CertPathValidatorException(sb.toString(), null, pKIXCertRevocationCheckerParameters.getCertPath(), pKIXCertRevocationCheckerParameters.getIndex());
                }
                org.bouncycastle.asn1.ocsp.ResponseBytes responseBytes = org.bouncycastle.asn1.ocsp.ResponseBytes.getInstance(oCSPResponse.getResponseBytes());
                if (responseBytes.getResponseType().equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.ocsp.OCSPObjectIdentifiers.id_pkix_ocsp_basic)) {
                    if (org.bouncycastle.jce.provider.ProvOcspRevocationChecker.getHighSpeedVideoFpsRanges(org.bouncycastle.asn1.ocsp.BasicOCSPResponse.getInstance(responseBytes.getResponse().getOctets()), pKIXCertRevocationCheckerParameters, bArr, x509Certificate, jcaJceHelper)) {
                        java.lang.ref.WeakReference<java.util.Map<org.bouncycastle.asn1.ocsp.CertID, org.bouncycastle.asn1.ocsp.OCSPResponse>> weakReference2 = getHighSpeedVideoSizes.get(uri);
                        if (weakReference2 != null) {
                            weakReference2.get().put(certID, oCSPResponse);
                        } else {
                            java.util.HashMap hashMap = new java.util.HashMap();
                            hashMap.put(certID, oCSPResponse);
                            getHighSpeedVideoSizes.put(uri, new java.lang.ref.WeakReference<>(hashMap));
                        }
                        return oCSPResponse;
                    }
                }
                throw new java.security.cert.CertPathValidatorException("OCSP response failed to validate", null, pKIXCertRevocationCheckerParameters.getCertPath(), pKIXCertRevocationCheckerParameters.getIndex());
            } catch (java.io.IOException e2) {
                e = e2;
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("configuration error: ");
                sb2.append(e.getMessage());
                throw new java.security.cert.CertPathValidatorException(sb2.toString(), e, pKIXCertRevocationCheckerParameters.getCertPath(), pKIXCertRevocationCheckerParameters.getIndex());
            }
        } catch (java.net.MalformedURLException e3) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("configuration error: ");
            sb3.append(e3.getMessage());
            throw new java.security.cert.CertPathValidatorException(sb3.toString(), e3, pKIXCertRevocationCheckerParameters.getCertPath(), pKIXCertRevocationCheckerParameters.getIndex());
        }
    }

    OcspCache() {
    }
}
