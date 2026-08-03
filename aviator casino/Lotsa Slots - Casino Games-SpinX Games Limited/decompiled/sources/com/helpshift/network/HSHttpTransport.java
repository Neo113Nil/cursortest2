package com.helpshift.network;

/* loaded from: classes2.dex */
public class HSHttpTransport implements com.helpshift.network.HTTPTransport {
    private static final java.lang.String TAG = "HttpTransprt";
    private final java.lang.String NETWORK_ERROR = "Network error: ";

    javax.net.ssl.HttpsURLConnection getConnection(java.lang.String str) throws java.io.IOException {
        return (javax.net.ssl.HttpsURLConnection) new java.net.URL(str).openConnection();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a2 A[Catch: all -> 0x0125, Exception -> 0x0127, SSLHandshakeException -> 0x0129, SSLPeerUnverifiedException -> 0x012b, SecurityException -> 0x012d, SocketException -> 0x0130, UnknownHostException -> 0x0133, TryCatch #8 {SecurityException -> 0x012d, SocketException -> 0x0130, UnknownHostException -> 0x0133, SSLHandshakeException -> 0x0129, SSLPeerUnverifiedException -> 0x012b, Exception -> 0x0127, all -> 0x0125, blocks: (B:14:0x0089, B:20:0x00a2, B:24:0x00b4, B:85:0x00a7, B:90:0x0086), top: B:89:0x0086 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0221 A[Catch: Exception -> 0x0225, TRY_LEAVE, TryCatch #16 {Exception -> 0x0225, blocks: (B:69:0x01fc, B:61:0x0221), top: B:68:0x01fc }] */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01fc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00a7 A[Catch: all -> 0x0125, Exception -> 0x0127, SSLHandshakeException -> 0x0129, SSLPeerUnverifiedException -> 0x012b, SecurityException -> 0x012d, SocketException -> 0x0130, UnknownHostException -> 0x0133, TryCatch #8 {SecurityException -> 0x012d, SocketException -> 0x0130, UnknownHostException -> 0x0133, SSLHandshakeException -> 0x0129, SSLPeerUnverifiedException -> 0x012b, Exception -> 0x0127, all -> 0x0125, blocks: (B:14:0x0089, B:20:0x00a2, B:24:0x00b4, B:85:0x00a7, B:90:0x0086), top: B:89:0x0086 }] */
    @Override // com.helpshift.network.HTTPTransport
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.helpshift.network.HSResponse makeRequest(com.helpshift.network.HSRequest hSRequest) {
        java.lang.Throwable th;
        boolean z;
        java.lang.Exception exc;
        javax.net.ssl.SSLPeerUnverifiedException sSLPeerUnverifiedException;
        javax.net.ssl.SSLHandshakeException sSLHandshakeException;
        java.net.UnknownHostException unknownHostException;
        java.lang.Exception exc2;
        com.helpshift.network.HSRequest.Method method;
        java.lang.String generateRandomString = com.helpshift.util.Utils.generateRandomString(6);
        javax.net.ssl.HttpsURLConnection httpsURLConnection = null;
        try {
            try {
                com.helpshift.log.HSLogger.d(TAG, "Request-ID " + generateRandomString + ", Url: " + hSRequest.getUrl() + ", Status: IN_PROGRESS");
                method = hSRequest.getMethod();
                httpsURLConnection = getConnection(hSRequest.getUrl());
                httpsURLConnection.setRequestMethod(method.name());
                httpsURLConnection.setConnectTimeout(hSRequest.getTimeout());
                for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : hSRequest.getHeaders().entrySet()) {
                    httpsURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
            try {
                try {
                    if (method != com.helpshift.network.HSRequest.Method.POST && method != com.helpshift.network.HSRequest.Method.PUT) {
                        int responseCode = httpsURLConnection.getResponseCode();
                        java.util.Map headerFields = httpsURLConnection.getHeaderFields();
                        java.lang.String contentEncoding = httpsURLConnection.getContentEncoding();
                        boolean z2 = responseCode < 200 && responseCode < 300;
                        java.lang.String readResponse = !z2 ? readResponse(contentEncoding, httpsURLConnection) : readErrorResponse(httpsURLConnection);
                        com.helpshift.log.HSLogger.d(TAG, "Request-ID " + generateRandomString + ", Network response: " + (!z2 ? com.inmobi.unification.sdk.InitializationStatus.SUCCESS : com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.c) + " \n Url: " + hSRequest.getUrl() + "\n Method: " + hSRequest.getMethod() + ", Status: " + responseCode + ", Encoding: " + contentEncoding);
                        com.helpshift.network.HSResponse hSResponse = new com.helpshift.network.HSResponse(responseCode, readResponse, headerFields);
                        if (httpsURLConnection != null) {
                            try {
                                httpsURLConnection.disconnect();
                            } catch (java.lang.Exception e) {
                                com.helpshift.log.HSLogger.e(com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.MSG_NETWORK, "Error in finally closing resources", e);
                            }
                        }
                        return hSResponse;
                    }
                    com.helpshift.network.HSResponse hSResponse2 = new com.helpshift.network.HSResponse(responseCode, readResponse, headerFields);
                    if (httpsURLConnection != null) {
                    }
                    return hSResponse2;
                } catch (java.lang.SecurityException e2) {
                    e = e2;
                    exc2 = e;
                    com.helpshift.network.exception.NetworkException networkException = com.helpshift.network.exception.NetworkException.NO_CONNECTION;
                    networkException.route = hSRequest.getUrl();
                    throw com.helpshift.network.exception.HSRootApiException.wrap(exc2, networkException, "Network error: " + exc2.getMessage());
                } catch (java.net.SocketException e3) {
                    e = e3;
                    exc2 = e;
                    com.helpshift.network.exception.NetworkException networkException2 = com.helpshift.network.exception.NetworkException.NO_CONNECTION;
                    networkException2.route = hSRequest.getUrl();
                    throw com.helpshift.network.exception.HSRootApiException.wrap(exc2, networkException2, "Network error: " + exc2.getMessage());
                } catch (java.net.UnknownHostException e4) {
                    unknownHostException = e4;
                    com.helpshift.network.exception.NetworkException networkException3 = com.helpshift.network.exception.NetworkException.UNKNOWN_HOST;
                    networkException3.route = hSRequest.getUrl();
                    throw com.helpshift.network.exception.HSRootApiException.wrap(unknownHostException, networkException3, "Network error: " + unknownHostException.getMessage());
                } catch (javax.net.ssl.SSLHandshakeException e5) {
                    sSLHandshakeException = e5;
                    com.helpshift.network.exception.NetworkException networkException4 = com.helpshift.network.exception.NetworkException.SSL_HANDSHAKE;
                    networkException4.route = hSRequest.getUrl();
                    throw com.helpshift.network.exception.HSRootApiException.wrap(sSLHandshakeException, networkException4, "Network error: " + sSLHandshakeException.getMessage());
                } catch (javax.net.ssl.SSLPeerUnverifiedException e6) {
                    sSLPeerUnverifiedException = e6;
                    com.helpshift.network.exception.NetworkException networkException5 = com.helpshift.network.exception.NetworkException.SSL_PEER_UNVERIFIED;
                    networkException5.route = hSRequest.getUrl();
                    throw com.helpshift.network.exception.HSRootApiException.wrap(sSLPeerUnverifiedException, networkException5, "Network error: " + sSLPeerUnverifiedException.getMessage());
                } catch (java.lang.Exception e7) {
                    exc = e7;
                    com.helpshift.network.exception.NetworkException networkException6 = com.helpshift.network.exception.NetworkException.GENERIC;
                    networkException6.route = hSRequest.getUrl();
                    throw com.helpshift.network.exception.HSRootApiException.wrap(exc, networkException6, "Network error: " + exc.getMessage());
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    z = true;
                    if (!z) {
                        try {
                            com.helpshift.log.HSLogger.d(TAG, "Request-ID " + generateRandomString + ", Network response: Failed, Url: " + hSRequest.getUrl() + ", Status: FAILED");
                        } catch (java.lang.Exception e8) {
                            com.helpshift.log.HSLogger.e(com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.MSG_NETWORK, "Error in finally closing resources", e8);
                            throw th;
                        }
                    }
                    if (httpsURLConnection != null) {
                        throw th;
                    }
                    httpsURLConnection.disconnect();
                    throw th;
                }
                writeToConnection(httpsURLConnection, hSRequest);
                int responseCode2 = httpsURLConnection.getResponseCode();
                java.util.Map headerFields2 = httpsURLConnection.getHeaderFields();
                java.lang.String contentEncoding2 = httpsURLConnection.getContentEncoding();
                if (responseCode2 < 200) {
                }
                java.lang.String readResponse2 = !z2 ? readResponse(contentEncoding2, httpsURLConnection) : readErrorResponse(httpsURLConnection);
                if (!z2) {
                }
                com.helpshift.log.HSLogger.d(TAG, "Request-ID " + generateRandomString + ", Network response: " + (!z2 ? com.inmobi.unification.sdk.InitializationStatus.SUCCESS : com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.c) + " \n Url: " + hSRequest.getUrl() + "\n Method: " + hSRequest.getMethod() + ", Status: " + responseCode2 + ", Encoding: " + contentEncoding2);
            } catch (java.lang.SecurityException e9) {
                e = e9;
                exc2 = e;
                com.helpshift.network.exception.NetworkException networkException22 = com.helpshift.network.exception.NetworkException.NO_CONNECTION;
                networkException22.route = hSRequest.getUrl();
                throw com.helpshift.network.exception.HSRootApiException.wrap(exc2, networkException22, "Network error: " + exc2.getMessage());
            } catch (java.net.SocketException e10) {
                e = e10;
                exc2 = e;
                com.helpshift.network.exception.NetworkException networkException222 = com.helpshift.network.exception.NetworkException.NO_CONNECTION;
                networkException222.route = hSRequest.getUrl();
                throw com.helpshift.network.exception.HSRootApiException.wrap(exc2, networkException222, "Network error: " + exc2.getMessage());
            } catch (java.net.UnknownHostException e11) {
                e = e11;
                unknownHostException = e;
                com.helpshift.network.exception.NetworkException networkException32 = com.helpshift.network.exception.NetworkException.UNKNOWN_HOST;
                networkException32.route = hSRequest.getUrl();
                throw com.helpshift.network.exception.HSRootApiException.wrap(unknownHostException, networkException32, "Network error: " + unknownHostException.getMessage());
            } catch (javax.net.ssl.SSLHandshakeException e12) {
                e = e12;
                sSLHandshakeException = e;
                com.helpshift.network.exception.NetworkException networkException42 = com.helpshift.network.exception.NetworkException.SSL_HANDSHAKE;
                networkException42.route = hSRequest.getUrl();
                throw com.helpshift.network.exception.HSRootApiException.wrap(sSLHandshakeException, networkException42, "Network error: " + sSLHandshakeException.getMessage());
            } catch (javax.net.ssl.SSLPeerUnverifiedException e13) {
                e = e13;
                sSLPeerUnverifiedException = e;
                com.helpshift.network.exception.NetworkException networkException52 = com.helpshift.network.exception.NetworkException.SSL_PEER_UNVERIFIED;
                networkException52.route = hSRequest.getUrl();
                throw com.helpshift.network.exception.HSRootApiException.wrap(sSLPeerUnverifiedException, networkException52, "Network error: " + sSLPeerUnverifiedException.getMessage());
            } catch (java.lang.Exception e14) {
                e = e14;
                exc = e;
                com.helpshift.network.exception.NetworkException networkException62 = com.helpshift.network.exception.NetworkException.GENERIC;
                networkException62.route = hSRequest.getUrl();
                throw com.helpshift.network.exception.HSRootApiException.wrap(exc, networkException62, "Network error: " + exc.getMessage());
            } catch (java.lang.Throwable th4) {
                th = th4;
                th = th;
                z = false;
                if (!z) {
                }
                if (httpsURLConnection != null) {
                }
            }
            httpsURLConnection.setDoOutput(true);
        } catch (java.lang.SecurityException e15) {
            e = e15;
            exc2 = e;
            com.helpshift.network.exception.NetworkException networkException2222 = com.helpshift.network.exception.NetworkException.NO_CONNECTION;
            networkException2222.route = hSRequest.getUrl();
            throw com.helpshift.network.exception.HSRootApiException.wrap(exc2, networkException2222, "Network error: " + exc2.getMessage());
        } catch (java.net.SocketException e16) {
            e = e16;
            exc2 = e;
            com.helpshift.network.exception.NetworkException networkException22222 = com.helpshift.network.exception.NetworkException.NO_CONNECTION;
            networkException22222.route = hSRequest.getUrl();
            throw com.helpshift.network.exception.HSRootApiException.wrap(exc2, networkException22222, "Network error: " + exc2.getMessage());
        } catch (java.net.UnknownHostException e17) {
            e = e17;
        } catch (javax.net.ssl.SSLHandshakeException e18) {
            e = e18;
        } catch (javax.net.ssl.SSLPeerUnverifiedException e19) {
            e = e19;
        } catch (java.lang.Exception e20) {
            e = e20;
        } catch (java.lang.Throwable th5) {
            th = th5;
        }
    }

    private void writeToConnection(javax.net.ssl.HttpsURLConnection httpsURLConnection, com.helpshift.network.HSRequest hSRequest) throws java.lang.Exception {
        try {
            java.io.OutputStream outputStream = httpsURLConnection.getOutputStream();
            try {
                java.io.BufferedWriter bufferedWriter = new java.io.BufferedWriter(new java.io.OutputStreamWriter(outputStream, "UTF-8"));
                try {
                    bufferedWriter.write(hSRequest.getBody());
                    bufferedWriter.flush();
                    outputStream.flush();
                    bufferedWriter.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                } finally {
                }
            } finally {
            }
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error in writing to connection", e);
            throw e;
        }
    }

    private java.lang.String readResponse(java.lang.String str, javax.net.ssl.HttpsURLConnection httpsURLConnection) throws java.lang.Exception {
        java.io.InputStream bufferedInputStream;
        try {
            if ("gzip".equalsIgnoreCase(str)) {
                bufferedInputStream = new java.util.zip.GZIPInputStream(httpsURLConnection.getInputStream());
            } else {
                bufferedInputStream = new java.io.BufferedInputStream(httpsURLConnection.getInputStream());
            }
            try {
                java.lang.String readStream = readStream(bufferedInputStream);
                bufferedInputStream.close();
                return readStream;
            } finally {
            }
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error reading network response stream", e);
            throw e;
        }
    }

    private java.lang.String readErrorResponse(javax.net.ssl.HttpsURLConnection httpsURLConnection) {
        try {
            java.io.InputStream errorStream = httpsURLConnection.getErrorStream();
            try {
                java.lang.String readStream = readStream(errorStream);
                com.helpshift.log.HSLogger.d(TAG, "Error response: " + readStream);
                if (errorStream != null) {
                    errorStream.close();
                }
                return readStream;
            } finally {
            }
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error reading the errorStream", e);
            return "";
        }
    }

    private java.lang.String readStream(java.io.InputStream inputStream) throws java.io.IOException {
        if (inputStream == null) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.io.InputStreamReader inputStreamReader = new java.io.InputStreamReader(inputStream);
        try {
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(inputStreamReader);
            while (true) {
                try {
                    java.lang.String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        sb.append(readLine);
                    } else {
                        bufferedReader.close();
                        inputStreamReader.close();
                        return sb.toString();
                    }
                } finally {
                }
            }
        } catch (java.lang.Throwable th) {
            try {
                inputStreamReader.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
