package org.bouncycastle.est.jcajce;

/* loaded from: classes17.dex */
class DefaultESTClient implements org.bouncycastle.est.ESTClient {
    private static final java.nio.charset.Charset getHighSpeedVideoFpsRanges = java.nio.charset.Charset.forName("UTF-8");
    private static byte[] getHighSpeedVideoSizes = {13, 10};
    private final org.bouncycastle.est.ESTClientSourceProvider getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ad, code lost:
    
        if (r0 == 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00af, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b7, code lost:
    
        throw new org.bouncycastle.est.ESTException("Too many redirects..");
     */
    @Override // org.bouncycastle.est.ESTClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public org.bouncycastle.est.ESTResponse doRequest(org.bouncycastle.est.ESTRequest eSTRequest) throws java.io.IOException {
        org.bouncycastle.est.ESTRequest eSTRequest2;
        org.bouncycastle.est.ESTRequestBuilder withURL;
        int i = 15;
        while (true) {
            org.bouncycastle.est.ESTResponse highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(eSTRequest);
            if (highResolutionOutputSizeshNQ4ISI.getStatusCode() < 300 || highResolutionOutputSizeshNQ4ISI.getStatusCode() > 399) {
                eSTRequest2 = null;
            } else {
                switch (highResolutionOutputSizeshNQ4ISI.getStatusCode()) {
                    case 301:
                    case 302:
                    case 303:
                    case 306:
                    case 307:
                        java.lang.String header = highResolutionOutputSizeshNQ4ISI.getHeader("Location");
                        if (!"".equals(header)) {
                            org.bouncycastle.est.ESTRequestBuilder eSTRequestBuilder = new org.bouncycastle.est.ESTRequestBuilder(highResolutionOutputSizeshNQ4ISI.getOriginalRequest());
                            if (header.startsWith("http")) {
                                withURL = eSTRequestBuilder.withURL(new java.net.URL(header));
                            } else {
                                java.net.URL url = highResolutionOutputSizeshNQ4ISI.getOriginalRequest().getURL();
                                withURL = eSTRequestBuilder.withURL(new java.net.URL(url.getProtocol(), url.getHost(), url.getPort(), header));
                            }
                            eSTRequest2 = withURL.build();
                            break;
                        } else {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Redirect status type: ");
                            sb.append(highResolutionOutputSizeshNQ4ISI.getStatusCode());
                            sb.append(" but no location header");
                            throw new org.bouncycastle.est.ESTException(sb.toString());
                        }
                    case 304:
                    case 305:
                    default:
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Client does not handle http status code: ");
                        sb2.append(highResolutionOutputSizeshNQ4ISI.getStatusCode());
                        throw new org.bouncycastle.est.ESTException(sb2.toString());
                }
            }
            if (eSTRequest2 != null) {
                highResolutionOutputSizeshNQ4ISI.close();
            }
            if (eSTRequest2 != null && i - 1 > 0) {
                eSTRequest = eSTRequest2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0066 A[Catch: all -> 0x015f, TRY_LEAVE, TryCatch #0 {all -> 0x015f, blocks: (B:3:0x0003, B:5:0x001f, B:6:0x0027, B:8:0x0035, B:11:0x003e, B:12:0x004c, B:14:0x0066, B:15:0x0071, B:17:0x0087, B:18:0x008c, B:20:0x0097, B:21:0x00b6, B:22:0x00f4, B:24:0x00fa, B:25:0x0107, B:27:0x010a, B:30:0x0135, B:32:0x0149, B:38:0x0159, B:40:0x00b2, B:42:0x0043), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0087 A[Catch: all -> 0x015f, TryCatch #0 {all -> 0x015f, blocks: (B:3:0x0003, B:5:0x001f, B:6:0x0027, B:8:0x0035, B:11:0x003e, B:12:0x004c, B:14:0x0066, B:15:0x0071, B:17:0x0087, B:18:0x008c, B:20:0x0097, B:21:0x00b6, B:22:0x00f4, B:24:0x00fa, B:25:0x0107, B:27:0x010a, B:30:0x0135, B:32:0x0149, B:38:0x0159, B:40:0x00b2, B:42:0x0043), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0097 A[Catch: all -> 0x015f, TryCatch #0 {all -> 0x015f, blocks: (B:3:0x0003, B:5:0x001f, B:6:0x0027, B:8:0x0035, B:11:0x003e, B:12:0x004c, B:14:0x0066, B:15:0x0071, B:17:0x0087, B:18:0x008c, B:20:0x0097, B:21:0x00b6, B:22:0x00f4, B:24:0x00fa, B:25:0x0107, B:27:0x010a, B:30:0x0135, B:32:0x0149, B:38:0x0159, B:40:0x00b2, B:42:0x0043), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00fa A[Catch: all -> 0x015f, TryCatch #0 {all -> 0x015f, blocks: (B:3:0x0003, B:5:0x001f, B:6:0x0027, B:8:0x0035, B:11:0x003e, B:12:0x004c, B:14:0x0066, B:15:0x0071, B:17:0x0087, B:18:0x008c, B:20:0x0097, B:21:0x00b6, B:22:0x00f4, B:24:0x00fa, B:25:0x0107, B:27:0x010a, B:30:0x0135, B:32:0x0149, B:38:0x0159, B:40:0x00b2, B:42:0x0043), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0149 A[Catch: all -> 0x015f, TRY_LEAVE, TryCatch #0 {all -> 0x015f, blocks: (B:3:0x0003, B:5:0x001f, B:6:0x0027, B:8:0x0035, B:11:0x003e, B:12:0x004c, B:14:0x0066, B:15:0x0071, B:17:0x0087, B:18:0x008c, B:20:0x0097, B:21:0x00b6, B:22:0x00f4, B:24:0x00fa, B:25:0x0107, B:27:0x010a, B:30:0x0135, B:32:0x0149, B:38:0x0159, B:40:0x00b2, B:42:0x0043), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0159 A[Catch: all -> 0x015f, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x015f, blocks: (B:3:0x0003, B:5:0x001f, B:6:0x0027, B:8:0x0035, B:11:0x003e, B:12:0x004c, B:14:0x0066, B:15:0x0071, B:17:0x0087, B:18:0x008c, B:20:0x0097, B:21:0x00b6, B:22:0x00f4, B:24:0x00fa, B:25:0x0107, B:27:0x010a, B:30:0x0135, B:32:0x0149, B:38:0x0159, B:40:0x00b2, B:42:0x0043), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b2 A[Catch: all -> 0x015f, TryCatch #0 {all -> 0x015f, blocks: (B:3:0x0003, B:5:0x001f, B:6:0x0027, B:8:0x0035, B:11:0x003e, B:12:0x004c, B:14:0x0066, B:15:0x0071, B:17:0x0087, B:18:0x008c, B:20:0x0097, B:21:0x00b6, B:22:0x00f4, B:24:0x00fa, B:25:0x0107, B:27:0x010a, B:30:0x0135, B:32:0x0149, B:38:0x0159, B:40:0x00b2, B:42:0x0043), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private org.bouncycastle.est.ESTResponse getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.est.ESTRequest eSTRequest) throws java.io.IOException {
        java.io.OutputStream printingOutputStream;
        org.bouncycastle.est.ESTRequest build;
        org.bouncycastle.est.Source source = null;
        try {
            org.bouncycastle.est.Source makeSource = this.getHighSpeedVideoFpsRangesFor.makeSource(eSTRequest.getURL().getHost(), eSTRequest.getURL().getPort());
            if (eSTRequest.getListener() != null) {
                eSTRequest = eSTRequest.getListener().onConnection(makeSource, eSTRequest);
            }
            java.util.Set<java.lang.String> asKeySet = org.bouncycastle.util.Properties.asKeySet("org.bouncycastle.debug.est");
            if (!asKeySet.contains("output") && !asKeySet.contains("all")) {
                printingOutputStream = makeSource.getOutputStream();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(eSTRequest.getURL().getPath());
                sb.append(eSTRequest.getURL().getQuery() == null ? eSTRequest.getURL().getQuery() : "");
                java.lang.String obj = sb.toString();
                org.bouncycastle.est.ESTRequestBuilder eSTRequestBuilder = new org.bouncycastle.est.ESTRequestBuilder(eSTRequest);
                if (!eSTRequest.getHeaders().containsKey(com.google.common.net.HttpHeaders.CONNECTION)) {
                    eSTRequestBuilder.addHeader(com.google.common.net.HttpHeaders.CONNECTION, "close");
                }
                java.net.URL url = eSTRequest.getURL();
                eSTRequestBuilder.setHeader(com.google.common.net.HttpHeaders.HOST, url.getPort() < 0 ? java.lang.String.format("%s:%d", url.getHost(), java.lang.Integer.valueOf(url.getPort())) : url.getHost());
                build = eSTRequestBuilder.build();
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(build.getMethod());
                sb2.append(" ");
                sb2.append(obj);
                sb2.append(" HTTP/1.1");
                printingOutputStream.write(sb2.toString().getBytes());
                printingOutputStream.write(getHighSpeedVideoSizes);
                for (java.util.Map.Entry<java.lang.String, java.lang.String[]> entry : build.getHeaders().entrySet()) {
                    java.lang.String[] value = entry.getValue();
                    for (int i = 0; i != value.length; i++) {
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                        sb3.append(entry.getKey());
                        sb3.append(": ");
                        sb3.append(value[i]);
                        printingOutputStream.write(sb3.toString().getBytes());
                        printingOutputStream.write(getHighSpeedVideoSizes);
                    }
                }
                printingOutputStream.write(getHighSpeedVideoSizes);
                printingOutputStream.flush();
                build.writeData(printingOutputStream);
                printingOutputStream.flush();
                if (build.getHijacker() != null) {
                    return new org.bouncycastle.est.ESTResponse(build, makeSource);
                }
                org.bouncycastle.est.ESTResponse hijack = build.getHijacker().hijack(build, makeSource);
                if (makeSource != null && hijack == null) {
                    makeSource.close();
                }
                return hijack;
            }
            printingOutputStream = new org.bouncycastle.est.jcajce.DefaultESTClient.PrintingOutputStream(makeSource.getOutputStream());
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            sb4.append(eSTRequest.getURL().getPath());
            sb4.append(eSTRequest.getURL().getQuery() == null ? eSTRequest.getURL().getQuery() : "");
            java.lang.String obj2 = sb4.toString();
            org.bouncycastle.est.ESTRequestBuilder eSTRequestBuilder2 = new org.bouncycastle.est.ESTRequestBuilder(eSTRequest);
            if (!eSTRequest.getHeaders().containsKey(com.google.common.net.HttpHeaders.CONNECTION)) {
            }
            java.net.URL url2 = eSTRequest.getURL();
            eSTRequestBuilder2.setHeader(com.google.common.net.HttpHeaders.HOST, url2.getPort() < 0 ? java.lang.String.format("%s:%d", url2.getHost(), java.lang.Integer.valueOf(url2.getPort())) : url2.getHost());
            build = eSTRequestBuilder2.build();
            java.lang.StringBuilder sb22 = new java.lang.StringBuilder();
            sb22.append(build.getMethod());
            sb22.append(" ");
            sb22.append(obj2);
            sb22.append(" HTTP/1.1");
            printingOutputStream.write(sb22.toString().getBytes());
            printingOutputStream.write(getHighSpeedVideoSizes);
            while (r0.hasNext()) {
            }
            printingOutputStream.write(getHighSpeedVideoSizes);
            printingOutputStream.flush();
            build.writeData(printingOutputStream);
            printingOutputStream.flush();
            if (build.getHijacker() != null) {
            }
        } catch (java.lang.Throwable th) {
            if (0 != 0) {
                source.close();
            }
            throw th;
        }
    }

    class PrintingOutputStream extends java.io.OutputStream {
        private final java.io.OutputStream getHighSpeedVideoFpsRangesFor;

        @Override // java.io.OutputStream
        public void write(int i) throws java.io.IOException {
            java.lang.System.out.print(java.lang.String.valueOf((char) i));
            this.getHighSpeedVideoFpsRangesFor.write(i);
        }

        public PrintingOutputStream(java.io.OutputStream outputStream) {
            this.getHighSpeedVideoFpsRangesFor = outputStream;
        }
    }

    public DefaultESTClient(org.bouncycastle.est.ESTClientSourceProvider eSTClientSourceProvider) {
        this.getHighSpeedVideoFpsRangesFor = eSTClientSourceProvider;
    }
}
