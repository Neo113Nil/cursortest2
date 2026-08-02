package org.bouncycastle.est;

/* loaded from: classes17.dex */
public class HttpAuth implements org.bouncycastle.est.ESTAuth {
    private static final java.util.Set<java.lang.String> getHighSpeedVideoFpsRanges;
    private static final org.bouncycastle.operator.DigestAlgorithmIdentifierFinder getHighSpeedVideoFpsRangesFor = new org.bouncycastle.operator.DefaultDigestAlgorithmIdentifierFinder();
    private final char[] Camera2StreamConfigurationMap;
    private final java.security.SecureRandom getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.operator.DigestCalculatorProvider getHighSpeedVideoSizes;
    private final java.lang.String getHighSpeedVideoSizesFor;
    private final java.lang.String getInputFormats;

    /* JADX INFO: Access modifiers changed from: private */
    public org.bouncycastle.est.ESTResponse Camera2StreamConfigurationMap(org.bouncycastle.est.ESTResponse eSTResponse) throws java.io.IOException {
        java.lang.String str;
        java.lang.String str2;
        eSTResponse.close();
        org.bouncycastle.est.ESTRequest originalRequest = eSTResponse.getOriginalRequest();
        try {
            java.util.Map<java.lang.String, java.lang.String> Camera2StreamConfigurationMap = org.bouncycastle.est.HttpUtil.Camera2StreamConfigurationMap(io.ktor.http.auth.AuthScheme.Digest, eSTResponse.getHeader(com.google.common.net.HttpHeaders.WWW_AUTHENTICATE));
            try {
                java.lang.String path = originalRequest.getURL().toURI().getPath();
                for (java.lang.String str3 : Camera2StreamConfigurationMap.keySet()) {
                    if (!getHighSpeedVideoFpsRanges.contains(str3)) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unrecognised entry in WWW-Authenticate header: '");
                        sb.append((java.lang.Object) str3);
                        sb.append("'");
                        throw new org.bouncycastle.est.ESTException(sb.toString());
                    }
                }
                java.lang.String method = originalRequest.getMethod();
                java.lang.String str4 = Camera2StreamConfigurationMap.get(io.ktor.http.auth.HttpAuthHeader.Parameters.Realm);
                java.lang.String str5 = Camera2StreamConfigurationMap.get("nonce");
                java.lang.String str6 = Camera2StreamConfigurationMap.get("opaque");
                java.lang.String str7 = "algorithm";
                java.lang.String str8 = Camera2StreamConfigurationMap.get("algorithm");
                java.lang.String str9 = "qop";
                java.lang.String str10 = Camera2StreamConfigurationMap.get("qop");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.String str11 = this.getInputFormats;
                if (str11 != null && !str11.equals(str4)) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Supplied realm '");
                    sb2.append(this.getInputFormats);
                    sb2.append("' does not match server realm '");
                    sb2.append(str4);
                    sb2.append("'");
                    throw new org.bouncycastle.est.ESTException(sb2.toString(), null, 401, null);
                }
                if (str8 == null) {
                    str8 = "MD5";
                }
                if (str8.length() == 0) {
                    throw new org.bouncycastle.est.ESTException("WWW-Authenticate no algorithm defined.");
                }
                java.lang.String upperCase = org.bouncycastle.util.Strings.toUpperCase(str8);
                if (str10 == null) {
                    throw new org.bouncycastle.est.ESTException("Qop is not defined in WWW-Authenticate header.");
                }
                if (str10.length() == 0) {
                    throw new org.bouncycastle.est.ESTException("QoP value is empty.");
                }
                java.lang.String[] split = org.bouncycastle.util.Strings.toLowerCase(str10).split(",");
                int i = 0;
                while (true) {
                    java.lang.String str12 = str7;
                    java.lang.String str13 = str9;
                    if (i == split.length) {
                        java.lang.String substring = upperCase.endsWith("-SESS") ? upperCase.substring(0, upperCase.length() - 5) : upperCase;
                        org.bouncycastle.asn1.x509.AlgorithmIdentifier find = substring.equals("SHA-512-256") ? getHighSpeedVideoFpsRangesFor.find(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512_256) : getHighSpeedVideoFpsRangesFor.find(substring);
                        if (find == null || find.getAlgorithm() == null) {
                            throw new java.io.IOException("auth digest algorithm unknown: ".concat(java.lang.String.valueOf(upperCase)));
                        }
                        org.bouncycastle.operator.DigestCalculator highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(upperCase, find);
                        java.io.OutputStream outputStream = highResolutionOutputSizeshNQ4ISI.getOutputStream();
                        byte[] bArr = new byte[10];
                        this.getHighResolutionOutputSizeshNQ4ISI.nextBytes(bArr);
                        java.lang.String hexString = org.bouncycastle.util.encoders.Hex.toHexString(bArr);
                        outputStream.write(org.bouncycastle.util.Strings.toUTF8ByteArray(this.getHighSpeedVideoSizesFor));
                        outputStream.write(org.bouncycastle.util.Strings.toUTF8ByteArray(io.ktor.sse.ServerSentEventKt.COLON));
                        outputStream.write(org.bouncycastle.util.Strings.toUTF8ByteArray(str4));
                        outputStream.write(org.bouncycastle.util.Strings.toUTF8ByteArray(io.ktor.sse.ServerSentEventKt.COLON));
                        outputStream.write(org.bouncycastle.util.Strings.toUTF8ByteArray(this.Camera2StreamConfigurationMap));
                        outputStream.close();
                        byte[] digest = highResolutionOutputSizeshNQ4ISI.getDigest();
                        if (upperCase.endsWith("-SESS")) {
                            org.bouncycastle.operator.DigestCalculator highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(upperCase, find);
                            java.io.OutputStream outputStream2 = highResolutionOutputSizeshNQ4ISI2.getOutputStream();
                            outputStream2.write(org.bouncycastle.util.Strings.toUTF8ByteArray(org.bouncycastle.util.encoders.Hex.toHexString(digest)));
                            outputStream2.write(org.bouncycastle.util.Strings.toUTF8ByteArray(io.ktor.sse.ServerSentEventKt.COLON));
                            outputStream2.write(org.bouncycastle.util.Strings.toUTF8ByteArray(str5));
                            outputStream2.write(org.bouncycastle.util.Strings.toUTF8ByteArray(io.ktor.sse.ServerSentEventKt.COLON));
                            outputStream2.write(org.bouncycastle.util.Strings.toUTF8ByteArray(hexString));
                            outputStream2.close();
                            digest = highResolutionOutputSizeshNQ4ISI2.getDigest();
                        }
                        java.lang.String hexString2 = org.bouncycastle.util.encoders.Hex.toHexString(digest);
                        org.bouncycastle.operator.DigestCalculator highResolutionOutputSizeshNQ4ISI3 = getHighResolutionOutputSizeshNQ4ISI(upperCase, find);
                        java.io.OutputStream outputStream3 = highResolutionOutputSizeshNQ4ISI3.getOutputStream();
                        if (((java.lang.String) arrayList.get(0)).equals("auth-int")) {
                            org.bouncycastle.operator.DigestCalculator highResolutionOutputSizeshNQ4ISI4 = getHighResolutionOutputSizeshNQ4ISI(upperCase, find);
                            str = str4;
                            java.io.OutputStream outputStream4 = highResolutionOutputSizeshNQ4ISI4.getOutputStream();
                            originalRequest.writeData(outputStream4);
                            outputStream4.close();
                            byte[] digest2 = highResolutionOutputSizeshNQ4ISI4.getDigest();
                            outputStream3.write(org.bouncycastle.util.Strings.toUTF8ByteArray(method));
                            outputStream3.write(org.bouncycastle.util.Strings.toUTF8ByteArray(io.ktor.sse.ServerSentEventKt.COLON));
                            outputStream3.write(org.bouncycastle.util.Strings.toUTF8ByteArray(path));
                            outputStream3.write(org.bouncycastle.util.Strings.toUTF8ByteArray(io.ktor.sse.ServerSentEventKt.COLON));
                            outputStream3.write(org.bouncycastle.util.Strings.toUTF8ByteArray(org.bouncycastle.util.encoders.Hex.toHexString(digest2)));
                            str2 = "auth";
                        } else {
                            str = str4;
                            str2 = "auth";
                            if (((java.lang.String) arrayList.get(0)).equals(str2)) {
                                outputStream3.write(org.bouncycastle.util.Strings.toUTF8ByteArray(method));
                                outputStream3.write(org.bouncycastle.util.Strings.toUTF8ByteArray(io.ktor.sse.ServerSentEventKt.COLON));
                                outputStream3.write(org.bouncycastle.util.Strings.toUTF8ByteArray(path));
                            }
                        }
                        outputStream3.close();
                        java.lang.String hexString3 = org.bouncycastle.util.encoders.Hex.toHexString(highResolutionOutputSizeshNQ4ISI3.getDigest());
                        org.bouncycastle.operator.DigestCalculator highResolutionOutputSizeshNQ4ISI5 = getHighResolutionOutputSizeshNQ4ISI(upperCase, find);
                        java.io.OutputStream outputStream5 = highResolutionOutputSizeshNQ4ISI5.getOutputStream();
                        boolean contains = arrayList.contains("missing");
                        outputStream5.write(org.bouncycastle.util.Strings.toUTF8ByteArray(hexString2));
                        outputStream5.write(org.bouncycastle.util.Strings.toUTF8ByteArray(io.ktor.sse.ServerSentEventKt.COLON));
                        outputStream5.write(org.bouncycastle.util.Strings.toUTF8ByteArray(str5));
                        outputStream5.write(org.bouncycastle.util.Strings.toUTF8ByteArray(io.ktor.sse.ServerSentEventKt.COLON));
                        if (!contains) {
                            outputStream5.write(org.bouncycastle.util.Strings.toUTF8ByteArray("00000001"));
                            outputStream5.write(org.bouncycastle.util.Strings.toUTF8ByteArray(io.ktor.sse.ServerSentEventKt.COLON));
                            outputStream5.write(org.bouncycastle.util.Strings.toUTF8ByteArray(hexString));
                            outputStream5.write(org.bouncycastle.util.Strings.toUTF8ByteArray(io.ktor.sse.ServerSentEventKt.COLON));
                            if (((java.lang.String) arrayList.get(0)).equals("auth-int")) {
                                outputStream5.write(org.bouncycastle.util.Strings.toUTF8ByteArray("auth-int"));
                            } else {
                                outputStream5.write(org.bouncycastle.util.Strings.toUTF8ByteArray(str2));
                            }
                            outputStream5.write(org.bouncycastle.util.Strings.toUTF8ByteArray(io.ktor.sse.ServerSentEventKt.COLON));
                        }
                        outputStream5.write(org.bouncycastle.util.Strings.toUTF8ByteArray(hexString3));
                        outputStream5.close();
                        java.lang.String hexString4 = org.bouncycastle.util.encoders.Hex.toHexString(highResolutionOutputSizeshNQ4ISI5.getDigest());
                        java.util.HashMap hashMap = new java.util.HashMap();
                        hashMap.put(androidx.autofill.HintConstants.AUTOFILL_HINT_USERNAME, this.getHighSpeedVideoSizesFor);
                        hashMap.put(io.ktor.http.auth.HttpAuthHeader.Parameters.Realm, str);
                        hashMap.put("nonce", str5);
                        hashMap.put("uri", path);
                        hashMap.put("response", hexString4);
                        if (!((java.lang.String) arrayList.get(0)).equals("auth-int")) {
                            if (((java.lang.String) arrayList.get(0)).equals(str2)) {
                                hashMap.put(str13, str2);
                            }
                            hashMap.put(str12, upperCase);
                            if (str6 != null || str6.length() == 0) {
                                byte[] bArr2 = new byte[20];
                                this.getHighResolutionOutputSizeshNQ4ISI.nextBytes(bArr2);
                                hashMap.put("opaque", org.bouncycastle.util.encoders.Hex.toHexString(bArr2));
                            }
                            org.bouncycastle.est.ESTRequestBuilder withHijacker = new org.bouncycastle.est.ESTRequestBuilder(originalRequest).withHijacker(null);
                            withHijacker.setHeader("Authorization", org.bouncycastle.est.HttpUtil.getHighSpeedVideoSizes(io.ktor.http.auth.AuthScheme.Digest, hashMap));
                            return originalRequest.getClient().doRequest(withHijacker.build());
                        }
                        hashMap.put(str13, "auth-int");
                        hashMap.put("nc", "00000001");
                        hashMap.put("cnonce", hexString);
                        hashMap.put(str12, upperCase);
                        if (str6 != null) {
                        }
                        byte[] bArr22 = new byte[20];
                        this.getHighResolutionOutputSizeshNQ4ISI.nextBytes(bArr22);
                        hashMap.put("opaque", org.bouncycastle.util.encoders.Hex.toHexString(bArr22));
                        org.bouncycastle.est.ESTRequestBuilder withHijacker2 = new org.bouncycastle.est.ESTRequestBuilder(originalRequest).withHijacker(null);
                        withHijacker2.setHeader("Authorization", org.bouncycastle.est.HttpUtil.getHighSpeedVideoSizes(io.ktor.http.auth.AuthScheme.Digest, hashMap));
                        return originalRequest.getClient().doRequest(withHijacker2.build());
                    }
                    if (!split[i].equals("auth") && !split[i].equals("auth-int")) {
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("QoP value unknown: '");
                        sb3.append(i);
                        sb3.append("'");
                        throw new org.bouncycastle.est.ESTException(sb3.toString());
                    }
                    java.lang.String trim = split[i].trim();
                    if (!arrayList.contains(trim)) {
                        arrayList.add(trim);
                    }
                    i++;
                    str7 = str12;
                    str9 = str13;
                }
            } catch (java.lang.Exception e) {
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder("unable to process URL in request: ");
                sb4.append(e.getMessage());
                throw new java.io.IOException(sb4.toString());
            }
        } catch (java.lang.Throwable th) {
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder("Parsing WWW-Authentication header: ");
            sb5.append(th.getMessage());
            throw new org.bouncycastle.est.ESTException(sb5.toString(), th, eSTResponse.getStatusCode(), new java.io.ByteArrayInputStream(eSTResponse.getHeader(com.google.common.net.HttpHeaders.WWW_AUTHENTICATE).getBytes()));
        }
    }

    @Override // org.bouncycastle.est.ESTAuth
    public void applyAuth(org.bouncycastle.est.ESTRequestBuilder eSTRequestBuilder) {
        eSTRequestBuilder.withHijacker(new org.bouncycastle.est.ESTHijacker() { // from class: org.bouncycastle.est.HttpAuth.1
            @Override // org.bouncycastle.est.ESTHijacker
            public org.bouncycastle.est.ESTResponse hijack(org.bouncycastle.est.ESTRequest eSTRequest, org.bouncycastle.est.Source source) throws java.io.IOException {
                org.bouncycastle.est.ESTResponse eSTResponse = new org.bouncycastle.est.ESTResponse(eSTRequest, source);
                if (eSTResponse.getStatusCode() != 401) {
                    return eSTResponse;
                }
                java.lang.String header = eSTResponse.getHeader(com.google.common.net.HttpHeaders.WWW_AUTHENTICATE);
                if (header == null) {
                    throw new org.bouncycastle.est.ESTException("Status of 401 but no WWW-Authenticate header");
                }
                java.lang.String lowerCase = org.bouncycastle.util.Strings.toLowerCase(header);
                if (lowerCase.startsWith(org.bouncycastle.cms.CMSAttributeTableGenerator.DIGEST)) {
                    return org.bouncycastle.est.HttpAuth.this.Camera2StreamConfigurationMap(eSTResponse);
                }
                if (!lowerCase.startsWith("basic")) {
                    throw new org.bouncycastle.est.ESTException("Unknown auth mode: ".concat(java.lang.String.valueOf(lowerCase)));
                }
                eSTResponse.close();
                java.util.Map<java.lang.String, java.lang.String> Camera2StreamConfigurationMap = org.bouncycastle.est.HttpUtil.Camera2StreamConfigurationMap(io.ktor.http.auth.AuthScheme.Basic, eSTResponse.getHeader(com.google.common.net.HttpHeaders.WWW_AUTHENTICATE));
                if (org.bouncycastle.est.HttpAuth.this.getInputFormats == null || org.bouncycastle.est.HttpAuth.this.getInputFormats.equals(Camera2StreamConfigurationMap.get(io.ktor.http.auth.HttpAuthHeader.Parameters.Realm))) {
                    org.bouncycastle.est.ESTRequestBuilder withHijacker = new org.bouncycastle.est.ESTRequestBuilder(eSTRequest).withHijacker(null);
                    if (org.bouncycastle.est.HttpAuth.this.getInputFormats != null && org.bouncycastle.est.HttpAuth.this.getInputFormats.length() > 0) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Basic realm=\"");
                        sb.append(org.bouncycastle.est.HttpAuth.this.getInputFormats);
                        sb.append("\"");
                        withHijacker.setHeader(com.google.common.net.HttpHeaders.WWW_AUTHENTICATE, sb.toString());
                    }
                    if (org.bouncycastle.est.HttpAuth.this.getHighSpeedVideoSizesFor.contains(io.ktor.sse.ServerSentEventKt.COLON)) {
                        throw new java.lang.IllegalArgumentException("User must not contain a ':'");
                    }
                    char[] cArr = new char[org.bouncycastle.est.HttpAuth.this.getHighSpeedVideoSizesFor.length() + 1 + org.bouncycastle.est.HttpAuth.this.Camera2StreamConfigurationMap.length];
                    java.lang.System.arraycopy(org.bouncycastle.est.HttpAuth.this.getHighSpeedVideoSizesFor.toCharArray(), 0, cArr, 0, org.bouncycastle.est.HttpAuth.this.getHighSpeedVideoSizesFor.length());
                    cArr[org.bouncycastle.est.HttpAuth.this.getHighSpeedVideoSizesFor.length()] = kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON;
                    java.lang.System.arraycopy(org.bouncycastle.est.HttpAuth.this.Camera2StreamConfigurationMap, 0, cArr, org.bouncycastle.est.HttpAuth.this.getHighSpeedVideoSizesFor.length() + 1, org.bouncycastle.est.HttpAuth.this.Camera2StreamConfigurationMap.length);
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Basic ");
                    sb2.append(org.bouncycastle.util.encoders.Base64.toBase64String(org.bouncycastle.util.Strings.toByteArray(cArr)));
                    withHijacker.setHeader("Authorization", sb2.toString());
                    org.bouncycastle.est.ESTResponse doRequest = eSTRequest.getClient().doRequest(withHijacker.build());
                    org.bouncycastle.util.Arrays.fill(cArr, (char) 0);
                    return doRequest;
                }
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Supplied realm '");
                sb3.append(org.bouncycastle.est.HttpAuth.this.getInputFormats);
                sb3.append("' does not match server realm '");
                sb3.append(Camera2StreamConfigurationMap.get(io.ktor.http.auth.HttpAuthHeader.Parameters.Realm));
                sb3.append("'");
                throw new org.bouncycastle.est.ESTException(sb3.toString(), null, 401, null);
            }
        });
    }

    private org.bouncycastle.operator.DigestCalculator getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) throws java.io.IOException {
        try {
            return this.getHighSpeedVideoSizes.get(algorithmIdentifier);
        } catch (org.bouncycastle.operator.OperatorCreationException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("cannot create digest calculator for ");
            sb.append(str);
            sb.append(": ");
            sb.append(e.getMessage());
            throw new java.io.IOException(sb.toString());
        }
    }

    public HttpAuth(java.lang.String str, char[] cArr, java.security.SecureRandom secureRandom, org.bouncycastle.operator.DigestCalculatorProvider digestCalculatorProvider) {
        this(null, str, cArr, secureRandom, digestCalculatorProvider);
    }

    public HttpAuth(java.lang.String str, char[] cArr) {
        this(null, str, cArr, null, null);
    }

    public HttpAuth(java.lang.String str, java.lang.String str2, char[] cArr, java.security.SecureRandom secureRandom, org.bouncycastle.operator.DigestCalculatorProvider digestCalculatorProvider) {
        this.getInputFormats = str;
        this.getHighSpeedVideoSizesFor = str2;
        this.Camera2StreamConfigurationMap = cArr;
        this.getHighResolutionOutputSizeshNQ4ISI = secureRandom;
        this.getHighSpeedVideoSizes = digestCalculatorProvider;
    }

    public HttpAuth(java.lang.String str, java.lang.String str2, char[] cArr) {
        this(str, str2, cArr, null, null);
    }

    static {
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add(io.ktor.http.auth.HttpAuthHeader.Parameters.Realm);
        hashSet.add("nonce");
        hashSet.add("opaque");
        hashSet.add("algorithm");
        hashSet.add("qop");
        getHighSpeedVideoFpsRanges = java.util.Collections.unmodifiableSet(hashSet);
    }
}
