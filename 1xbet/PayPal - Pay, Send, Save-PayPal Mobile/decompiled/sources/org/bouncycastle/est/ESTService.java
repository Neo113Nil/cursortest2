package org.bouncycastle.est;

/* loaded from: classes17.dex */
public class ESTService {
    protected static final java.lang.String CACERTS = "/cacerts";
    protected static final java.lang.String CSRATTRS = "/csrattrs";
    protected static final java.lang.String FULLCMC = "/fullcmc";
    protected static final java.lang.String SERVERGEN = "/serverkeygen";
    protected static final java.lang.String SIMPLE_ENROLL = "/simpleenroll";
    protected static final java.lang.String SIMPLE_REENROLL = "/simplereenroll";
    private static final java.util.regex.Pattern getHighSpeedVideoFpsRangesFor;
    protected static final java.util.Set<java.lang.String> illegalParts;
    private final org.bouncycastle.est.ESTClientProvider Camera2StreamConfigurationMap;
    private final java.lang.String getHighSpeedVideoSizes;

    ESTService(java.lang.String str, java.lang.String str2, org.bouncycastle.est.ESTClientProvider eSTClientProvider) {
        java.lang.StringBuilder sb;
        java.lang.String highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(str);
        if (str2 != null) {
            while (str2.endsWith(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR) && str2.length() > 0) {
                str2 = str2.substring(0, str2.length() - 1);
            }
            while (str2.startsWith(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR) && str2.length() > 0) {
                str2 = str2.substring(1);
            }
            if (str2.length() == 0) {
                throw new java.lang.IllegalArgumentException("Label set but after trimming '/' is not zero length string.");
            }
            if (!getHighSpeedVideoFpsRangesFor.matcher(str2).matches()) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Server path ");
                sb2.append(str2);
                sb2.append(" contains invalid characters");
                throw new java.lang.IllegalArgumentException(sb2.toString());
            }
            if (illegalParts.contains(str2)) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Label ");
                sb3.append(str2);
                sb3.append(" is a reserved path segment.");
                throw new java.lang.IllegalArgumentException(sb3.toString());
            }
            sb = new java.lang.StringBuilder("https://");
            sb.append(highSpeedVideoFpsRanges);
            sb.append("/.well-known/est/");
        } else {
            sb = new java.lang.StringBuilder("https://");
            sb.append(highSpeedVideoFpsRanges);
            str2 = "/.well-known/est";
        }
        sb.append(str2);
        this.getHighSpeedVideoSizes = sb.toString();
        this.Camera2StreamConfigurationMap = eSTClientProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0149 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public org.bouncycastle.est.CACertsResponse getCACerts() throws org.bouncycastle.est.ESTException {
        org.bouncycastle.est.ESTResponse eSTResponse;
        org.bouncycastle.est.ESTException th;
        org.bouncycastle.util.Store<org.bouncycastle.cert.X509CertificateHolder> store;
        org.bouncycastle.util.Store<org.bouncycastle.cert.X509CRLHolder> store2;
        java.lang.String str;
        try {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.getHighSpeedVideoSizes);
            sb.append(CACERTS);
            java.net.URL url = new java.net.URL(sb.toString());
            org.bouncycastle.est.ESTClient makeClient = this.Camera2StreamConfigurationMap.makeClient();
            org.bouncycastle.est.ESTRequest build = new org.bouncycastle.est.ESTRequestBuilder("GET", url).withClient(makeClient).build();
            eSTResponse = makeClient.doRequest(build);
            try {
                if (eSTResponse.getStatusCode() == 200) {
                    org.bouncycastle.est.HttpUtil.Headers headers = eSTResponse.getHeaders();
                    java.lang.String highResolutionOutputSizeshNQ4ISI = headers.getHighResolutionOutputSizeshNQ4ISI("Content-Type");
                    java.lang.String[] strArr = highResolutionOutputSizeshNQ4ISI == null ? null : headers.get(highResolutionOutputSizeshNQ4ISI);
                    java.lang.String str2 = (strArr == null || strArr.length <= 0) ? null : strArr[0];
                    if (str2 == null || !str2.startsWith("application/pkcs7-mime")) {
                        if (str2 != null) {
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(" got ");
                            sb2.append(str2);
                            str = sb2.toString();
                        } else {
                            str = " but was not present.";
                        }
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Response : ");
                        sb3.append(url.toString());
                        sb3.append("Expecting application/pkcs7-mime ");
                        sb3.append(str);
                        throw new org.bouncycastle.est.ESTException(sb3.toString(), null, eSTResponse.getStatusCode(), eSTResponse.getInputStream());
                    }
                    try {
                        if (eSTResponse.getContentLength() != null && eSTResponse.getContentLength().longValue() > 0) {
                            org.bouncycastle.cmc.SimplePKIResponse simplePKIResponse = new org.bouncycastle.cmc.SimplePKIResponse(org.bouncycastle.asn1.cms.ContentInfo.getInstance((org.bouncycastle.asn1.ASN1Sequence) new org.bouncycastle.asn1.ASN1InputStream(eSTResponse.getInputStream()).readObject()));
                            store = simplePKIResponse.getCertificates();
                            store2 = simplePKIResponse.getCRLs();
                            org.bouncycastle.est.CACertsResponse cACertsResponse = new org.bouncycastle.est.CACertsResponse(store, store2, build, eSTResponse.getSource(), this.Camera2StreamConfigurationMap.isTrusted());
                            if (eSTResponse != null) {
                                try {
                                    eSTResponse.close();
                                } catch (java.lang.Exception e) {
                                    e = e;
                                }
                            }
                            e = null;
                            if (e != null) {
                                return cACertsResponse;
                            }
                            if (e instanceof org.bouncycastle.est.ESTException) {
                                throw ((org.bouncycastle.est.ESTException) e);
                            }
                            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Get CACerts: ");
                            sb4.append(url.toString());
                            throw new org.bouncycastle.est.ESTException(sb4.toString(), e, eSTResponse.getStatusCode(), null);
                        }
                    } catch (java.lang.Throwable th2) {
                        java.lang.StringBuilder sb5 = new java.lang.StringBuilder("Decoding CACerts: ");
                        sb5.append(url.toString());
                        sb5.append(" ");
                        sb5.append(th2.getMessage());
                        throw new org.bouncycastle.est.ESTException(sb5.toString(), th2, eSTResponse.getStatusCode(), eSTResponse.getInputStream());
                    }
                } else if (eSTResponse.getStatusCode() != 204) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Get CACerts: ");
                    sb6.append(url.toString());
                    throw new org.bouncycastle.est.ESTException(sb6.toString(), null, eSTResponse.getStatusCode(), eSTResponse.getInputStream());
                }
                store = null;
                store2 = null;
                org.bouncycastle.est.CACertsResponse cACertsResponse2 = new org.bouncycastle.est.CACertsResponse(store, store2, build, eSTResponse.getSource(), this.Camera2StreamConfigurationMap.isTrusted());
                if (eSTResponse != null) {
                }
                e = null;
                if (e != null) {
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
                try {
                    if (th instanceof org.bouncycastle.est.ESTException) {
                        throw th;
                    }
                    throw new org.bouncycastle.est.ESTException(th.getMessage(), th);
                } catch (java.lang.Throwable th4) {
                    if (eSTResponse != null) {
                        try {
                            eSTResponse.close();
                        } catch (java.lang.Exception unused) {
                        }
                    }
                    throw th4;
                }
            }
        } catch (java.lang.Throwable th5) {
            eSTResponse = null;
            th = th5;
        }
    }

    public org.bouncycastle.est.EnrollmentResponse simpleEnrollPoP(boolean z, final org.bouncycastle.pkcs.PKCS10CertificationRequestBuilder pKCS10CertificationRequestBuilder, final org.bouncycastle.operator.ContentSigner contentSigner, org.bouncycastle.est.ESTAuth eSTAuth) throws java.io.IOException {
        if (!this.Camera2StreamConfigurationMap.isTrusted()) {
            throw new java.lang.IllegalStateException("No trust anchors.");
        }
        org.bouncycastle.est.ESTResponse eSTResponse = null;
        try {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.getHighSpeedVideoSizes);
            sb.append(z ? SIMPLE_REENROLL : SIMPLE_ENROLL);
            java.net.URL url = new java.net.URL(sb.toString());
            org.bouncycastle.est.ESTClient makeClient = this.Camera2StreamConfigurationMap.makeClient();
            org.bouncycastle.est.ESTRequestBuilder withConnectionListener = new org.bouncycastle.est.ESTRequestBuilder("POST", url).withClient(makeClient).withConnectionListener(new org.bouncycastle.est.ESTSourceConnectionListener() { // from class: org.bouncycastle.est.ESTService.1
                @Override // org.bouncycastle.est.ESTSourceConnectionListener
                public org.bouncycastle.est.ESTRequest onConnection(org.bouncycastle.est.Source source, org.bouncycastle.est.ESTRequest eSTRequest) throws java.io.IOException {
                    if (source instanceof org.bouncycastle.est.TLSUniqueProvider) {
                        org.bouncycastle.est.TLSUniqueProvider tLSUniqueProvider = (org.bouncycastle.est.TLSUniqueProvider) source;
                        if (tLSUniqueProvider.isTLSUniqueAvailable()) {
                            org.bouncycastle.pkcs.PKCS10CertificationRequestBuilder pKCS10CertificationRequestBuilder2 = new org.bouncycastle.pkcs.PKCS10CertificationRequestBuilder(pKCS10CertificationRequestBuilder);
                            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                            pKCS10CertificationRequestBuilder2.setAttribute(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pkcs_9_at_challengePassword, new org.bouncycastle.asn1.DERPrintableString(org.bouncycastle.util.encoders.Base64.toBase64String(tLSUniqueProvider.getTLSUnique())));
                            byteArrayOutputStream.write(org.bouncycastle.est.ESTService.getHighSpeedVideoFpsRangesFor(pKCS10CertificationRequestBuilder2.build(contentSigner).getEncoded()).getBytes());
                            byteArrayOutputStream.flush();
                            org.bouncycastle.est.ESTRequestBuilder withData = new org.bouncycastle.est.ESTRequestBuilder(eSTRequest).withData(byteArrayOutputStream.toByteArray());
                            withData.setHeader("Content-Type", "application/pkcs10");
                            withData.setHeader("Content-Transfer-Encoding", "base64");
                            withData.setHeader("Content-Length", java.lang.Long.toString(byteArrayOutputStream.size()));
                            return withData.build();
                        }
                    }
                    throw new java.io.IOException("Source does not supply TLS unique.");
                }
            });
            if (eSTAuth != null) {
                eSTAuth.applyAuth(withConnectionListener);
            }
            eSTResponse = makeClient.doRequest(withConnectionListener.build());
            return handleEnrollResponse(eSTResponse);
        } catch (java.lang.Throwable th) {
            try {
                if (th instanceof org.bouncycastle.est.ESTException) {
                    throw th;
                }
                throw new org.bouncycastle.est.ESTException(th.getMessage(), th);
            } finally {
                if (eSTResponse != null) {
                    eSTResponse.close();
                }
            }
        }
    }

    public org.bouncycastle.est.EnrollmentResponse simpleEnroll(boolean z, org.bouncycastle.pkcs.PKCS10CertificationRequest pKCS10CertificationRequest, org.bouncycastle.est.ESTAuth eSTAuth) throws java.io.IOException {
        if (!this.Camera2StreamConfigurationMap.isTrusted()) {
            throw new java.lang.IllegalStateException("No trust anchors.");
        }
        org.bouncycastle.est.ESTResponse eSTResponse = null;
        try {
            byte[] bytes = getHighSpeedVideoFpsRangesFor(pKCS10CertificationRequest.getEncoded()).getBytes();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.getHighSpeedVideoSizes);
            sb.append(z ? SIMPLE_REENROLL : SIMPLE_ENROLL);
            java.net.URL url = new java.net.URL(sb.toString());
            org.bouncycastle.est.ESTClient makeClient = this.Camera2StreamConfigurationMap.makeClient();
            org.bouncycastle.est.ESTRequestBuilder withClient = new org.bouncycastle.est.ESTRequestBuilder("POST", url).withData(bytes).withClient(makeClient);
            withClient.addHeader("Content-Type", "application/pkcs10");
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("");
            sb2.append(bytes.length);
            withClient.addHeader("Content-Length", sb2.toString());
            withClient.addHeader("Content-Transfer-Encoding", "base64");
            if (eSTAuth != null) {
                eSTAuth.applyAuth(withClient);
            }
            eSTResponse = makeClient.doRequest(withClient.build());
            return handleEnrollResponse(eSTResponse);
        } catch (java.lang.Throwable th) {
            try {
                if (th instanceof org.bouncycastle.est.ESTException) {
                    throw th;
                }
                throw new org.bouncycastle.est.ESTException(th.getMessage(), th);
            } finally {
                if (eSTResponse != null) {
                    eSTResponse.close();
                }
            }
        }
    }

    public org.bouncycastle.est.EnrollmentResponse simpleEnroll(org.bouncycastle.est.EnrollmentResponse enrollmentResponse) throws java.lang.Exception {
        if (!this.Camera2StreamConfigurationMap.isTrusted()) {
            throw new java.lang.IllegalStateException("No trust anchors.");
        }
        org.bouncycastle.est.ESTResponse eSTResponse = null;
        try {
            org.bouncycastle.est.ESTClient makeClient = this.Camera2StreamConfigurationMap.makeClient();
            eSTResponse = makeClient.doRequest(new org.bouncycastle.est.ESTRequestBuilder(enrollmentResponse.getRequestToRetry()).withClient(makeClient).build());
            return handleEnrollResponse(eSTResponse);
        } catch (java.lang.Throwable th) {
            try {
                if (th instanceof org.bouncycastle.est.ESTException) {
                    throw th;
                }
                throw new org.bouncycastle.est.ESTException(th.getMessage(), th);
            } finally {
                if (eSTResponse != null) {
                    eSTResponse.close();
                }
            }
        }
    }

    protected org.bouncycastle.est.EnrollmentResponse handleEnrollResponse(org.bouncycastle.est.ESTResponse eSTResponse) throws java.io.IOException {
        long time;
        org.bouncycastle.est.ESTRequest originalRequest = eSTResponse.getOriginalRequest();
        if (eSTResponse.getStatusCode() != 202) {
            if (eSTResponse.getStatusCode() == 200) {
                try {
                    return new org.bouncycastle.est.EnrollmentResponse(new org.bouncycastle.cmc.SimplePKIResponse(org.bouncycastle.asn1.cms.ContentInfo.getInstance(new org.bouncycastle.asn1.ASN1InputStream(eSTResponse.getInputStream()).readObject())).getCertificates(), -1L, null, eSTResponse.getSource());
                } catch (org.bouncycastle.cmc.CMCException e) {
                    throw new org.bouncycastle.est.ESTException(e.getMessage(), e.getCause());
                }
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Simple Enroll: ");
            sb.append(originalRequest.getURL().toString());
            throw new org.bouncycastle.est.ESTException(sb.toString(), null, eSTResponse.getStatusCode(), eSTResponse.getInputStream());
        }
        java.lang.String header = eSTResponse.getHeader("Retry-After");
        if (header == null) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Got Status 202 but not Retry-After header from: ");
            sb2.append(originalRequest.getURL().toString());
            throw new org.bouncycastle.est.ESTException(sb2.toString());
        }
        try {
            try {
                time = java.lang.System.currentTimeMillis() + (java.lang.Long.parseLong(header) * 1000);
            } catch (java.lang.Exception e2) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Unable to parse Retry-After header:");
                sb3.append(originalRequest.getURL().toString());
                sb3.append(" ");
                sb3.append(e2.getMessage());
                throw new org.bouncycastle.est.ESTException(sb3.toString(), null, eSTResponse.getStatusCode(), eSTResponse.getInputStream());
            }
        } catch (java.lang.NumberFormatException unused) {
            java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", java.util.Locale.US);
            simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone("GMT"));
            time = simpleDateFormat.parse(header).getTime();
        }
        return new org.bouncycastle.est.EnrollmentResponse(null, time, originalRequest, eSTResponse.getSource());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public org.bouncycastle.est.CSRRequestResponse getCSRAttributes() throws org.bouncycastle.est.ESTException {
        org.bouncycastle.est.ESTResponse eSTResponse;
        org.bouncycastle.est.ESTException th;
        org.bouncycastle.est.CSRAttributesResponse cSRAttributesResponse;
        if (!this.Camera2StreamConfigurationMap.isTrusted()) {
            throw new java.lang.IllegalStateException("No trust anchors.");
        }
        try {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.getHighSpeedVideoSizes);
            sb.append(CSRATTRS);
            java.net.URL url = new java.net.URL(sb.toString());
            org.bouncycastle.est.ESTClient makeClient = this.Camera2StreamConfigurationMap.makeClient();
            org.bouncycastle.est.ESTRequest build = new org.bouncycastle.est.ESTRequestBuilder("GET", url).withClient(makeClient).build();
            eSTResponse = makeClient.doRequest(build);
            try {
                int statusCode = eSTResponse.getStatusCode();
                if (statusCode == 200) {
                    try {
                        if (eSTResponse.getContentLength() != null && eSTResponse.getContentLength().longValue() > 0) {
                            cSRAttributesResponse = new org.bouncycastle.est.CSRAttributesResponse(org.bouncycastle.asn1.est.CsrAttrs.getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(new org.bouncycastle.asn1.ASN1InputStream(eSTResponse.getInputStream()).readObject())));
                            if (eSTResponse != null) {
                                try {
                                    eSTResponse.close();
                                } catch (java.lang.Exception e) {
                                    e = e;
                                }
                            }
                            e = null;
                            if (e != null) {
                                return new org.bouncycastle.est.CSRRequestResponse(cSRAttributesResponse, eSTResponse.getSource());
                            }
                            if (e instanceof org.bouncycastle.est.ESTException) {
                                throw ((org.bouncycastle.est.ESTException) e);
                            }
                            throw new org.bouncycastle.est.ESTException(e.getMessage(), e, eSTResponse.getStatusCode(), null);
                        }
                    } catch (java.lang.Throwable th2) {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Decoding CACerts: ");
                        sb2.append(url.toString());
                        sb2.append(" ");
                        sb2.append(th2.getMessage());
                        throw new org.bouncycastle.est.ESTException(sb2.toString(), th2, eSTResponse.getStatusCode(), eSTResponse.getInputStream());
                    }
                } else if (statusCode != 204 && statusCode != 404) {
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder("CSR Attribute request: ");
                    sb3.append(build.getURL().toString());
                    throw new org.bouncycastle.est.ESTException(sb3.toString(), null, eSTResponse.getStatusCode(), eSTResponse.getInputStream());
                }
                cSRAttributesResponse = null;
                if (eSTResponse != null) {
                }
                e = null;
                if (e != null) {
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
                try {
                    if (th instanceof org.bouncycastle.est.ESTException) {
                        throw th;
                    }
                    throw new org.bouncycastle.est.ESTException(th.getMessage(), th);
                } catch (java.lang.Throwable th4) {
                    if (eSTResponse != null) {
                        try {
                            eSTResponse.close();
                        } catch (java.lang.Exception unused) {
                        }
                    }
                    throw th4;
                }
            }
        } catch (java.lang.Throwable th5) {
            eSTResponse = null;
            th = th5;
        }
    }

    private static java.lang.String getHighSpeedVideoFpsRanges(java.lang.String str) {
        while (str.endsWith(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR) && str.length() > 0) {
            try {
                str = str.substring(0, str.length() - 1);
            } catch (java.lang.Exception e) {
                if (e instanceof java.lang.IllegalArgumentException) {
                    throw ((java.lang.IllegalArgumentException) e);
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Scheme and host is invalid: ");
                sb.append(e.getMessage());
                throw new java.lang.IllegalArgumentException(sb.toString(), e);
            }
        }
        if (str.contains("://")) {
            throw new java.lang.IllegalArgumentException("Server contains scheme, must only be <dnsname/ipaddress>:port, https:// will be added arbitrarily.");
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("https://");
        sb2.append(str);
        java.net.URL url = new java.net.URL(sb2.toString());
        if (url.getPath().length() != 0 && !url.getPath().equals(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR)) {
            throw new java.lang.IllegalArgumentException("Server contains path, must only be <dnsname/ipaddress>:port, a path of '/.well-known/est/<label>' will be added arbitrarily.");
        }
        return str;
    }

    public static org.bouncycastle.cert.X509CertificateHolder[] storeToArray(org.bouncycastle.util.Store<org.bouncycastle.cert.X509CertificateHolder> store, org.bouncycastle.util.Selector<org.bouncycastle.cert.X509CertificateHolder> selector) {
        java.util.Collection<org.bouncycastle.cert.X509CertificateHolder> matches = store.getMatches(selector);
        return (org.bouncycastle.cert.X509CertificateHolder[]) matches.toArray(new org.bouncycastle.cert.X509CertificateHolder[matches.size()]);
    }

    public static org.bouncycastle.cert.X509CertificateHolder[] storeToArray(org.bouncycastle.util.Store<org.bouncycastle.cert.X509CertificateHolder> store) {
        return storeToArray(store, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String getHighSpeedVideoFpsRangesFor(byte[] bArr) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        java.io.PrintWriter printWriter = new java.io.PrintWriter(stringWriter);
        int i = 0;
        do {
            int i2 = i + 48;
            if (i2 < bArr.length) {
                printWriter.print(org.bouncycastle.util.encoders.Base64.toBase64String(bArr, i, 48));
                i = i2;
            } else {
                printWriter.print(org.bouncycastle.util.encoders.Base64.toBase64String(bArr, i, bArr.length - i));
                i = bArr.length;
            }
            printWriter.print('\n');
        } while (i < bArr.length);
        printWriter.flush();
        return stringWriter.toString();
    }

    static {
        java.util.HashSet hashSet = new java.util.HashSet();
        illegalParts = hashSet;
        hashSet.add("cacerts");
        hashSet.add("simpleenroll");
        hashSet.add("simplereenroll");
        hashSet.add("fullcmc");
        hashSet.add("serverkeygen");
        hashSet.add("csrattrs");
        getHighSpeedVideoFpsRangesFor = java.util.regex.Pattern.compile("^[0-9a-zA-Z_\\-.~!$&'()*+,;:=]+");
    }
}
