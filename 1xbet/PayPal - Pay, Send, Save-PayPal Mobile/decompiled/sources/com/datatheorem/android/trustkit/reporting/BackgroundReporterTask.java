package com.datatheorem.android.trustkit.reporting;

/* loaded from: classes8.dex */
class BackgroundReporterTask extends android.os.AsyncTask<java.lang.Object, java.lang.Void, java.lang.Integer> {
    private static final javax.net.ssl.SSLSocketFactory getHighSpeedVideoFpsRanges = getHighResolutionOutputSizeshNQ4ISI();

    @Override // android.os.AsyncTask
    protected /* synthetic */ java.lang.Integer doInBackground(java.lang.Object[] objArr) {
        return getHighResolutionOutputSizeshNQ4ISI(objArr);
    }

    BackgroundReporterTask() {
    }

    private static java.lang.Integer getHighResolutionOutputSizeshNQ4ISI(java.lang.Object... objArr) {
        int i;
        java.net.HttpURLConnection httpURLConnection;
        com.datatheorem.android.trustkit.reporting.PinningFailureReport pinningFailureReport = (com.datatheorem.android.trustkit.reporting.PinningFailureReport) objArr[0];
        java.net.HttpURLConnection httpURLConnection2 = null;
        java.lang.Integer num = null;
        for (1; i < objArr.length; i + 1) {
            java.net.URL url = (java.net.URL) objArr[i];
            try {
                httpURLConnection = (java.net.HttpURLConnection) url.openConnection();
                try {
                    try {
                        httpURLConnection.setRequestMethod("POST");
                        httpURLConnection.setRequestProperty("Content-Type", "application/json");
                        httpURLConnection.setDoOutput(true);
                        httpURLConnection.setChunkedStreamingMode(0);
                        if (url.getUserInfo() != null) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            sb.append("Basic ");
                            sb.append(new java.lang.String(android.util.Base64.encode(url.getUserInfo().getBytes(), 0)));
                            httpURLConnection.setRequestProperty("Authorization", sb.toString());
                        }
                        if (httpURLConnection instanceof javax.net.ssl.HttpsURLConnection) {
                            ((javax.net.ssl.HttpsURLConnection) httpURLConnection).setSSLSocketFactory(getHighSpeedVideoFpsRanges);
                        }
                        httpURLConnection.connect();
                        java.io.BufferedOutputStream bufferedOutputStream = new java.io.BufferedOutputStream(httpURLConnection.getOutputStream());
                        bufferedOutputStream.write(pinningFailureReport.getHighSpeedVideoFpsRangesFor().toString().getBytes("UTF-8"));
                        bufferedOutputStream.flush();
                        bufferedOutputStream.close();
                        num = java.lang.Integer.valueOf(httpURLConnection.getResponseCode());
                    } catch (java.io.IOException e) {
                        e = e;
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        sb2.append("Background upload - task completed with error:");
                        sb2.append(e.getMessage());
                        com.datatheorem.android.trustkit.utils.TrustKitLog.i(sb2.toString());
                        i = httpURLConnection == null ? i + 1 : 1;
                        httpURLConnection.disconnect();
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    httpURLConnection2 = httpURLConnection;
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                    }
                    throw th;
                }
            } catch (java.io.IOException e2) {
                e = e2;
                httpURLConnection = null;
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
            if (httpURLConnection == null) {
            }
            httpURLConnection.disconnect();
        }
        return num;
    }

    private static javax.net.ssl.SSLSocketFactory getHighResolutionOutputSizeshNQ4ISI() {
        try {
            javax.net.ssl.SSLContext sSLContext = javax.net.ssl.SSLContext.getInstance("TLS");
            if (sSLContext == null) {
                throw new java.lang.IllegalStateException("Should never happen");
            }
            try {
                sSLContext.init(null, new javax.net.ssl.TrustManager[]{com.datatheorem.android.trustkit.pinning.SystemTrustManager.getInstance()}, null);
                return sSLContext.getSocketFactory();
            } catch (java.security.KeyManagementException unused) {
                throw new java.lang.IllegalStateException("Should never happen");
            }
        } catch (java.security.NoSuchAlgorithmException unused2) {
            throw new java.lang.IllegalStateException("Should never happen");
        }
    }
}
