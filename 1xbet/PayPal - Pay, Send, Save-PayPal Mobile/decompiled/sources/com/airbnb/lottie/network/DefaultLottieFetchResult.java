package com.airbnb.lottie.network;

/* loaded from: classes7.dex */
public class DefaultLottieFetchResult implements com.airbnb.lottie.network.LottieFetchResult {
    private final java.net.HttpURLConnection getHighSpeedVideoSizes;

    public DefaultLottieFetchResult(java.net.HttpURLConnection httpURLConnection) {
        this.getHighSpeedVideoSizes = httpURLConnection;
    }

    @Override // com.airbnb.lottie.network.LottieFetchResult
    public boolean isSuccessful() {
        return this.getHighSpeedVideoSizes.getResponseCode() / 100 == 2;
    }

    @Override // com.airbnb.lottie.network.LottieFetchResult
    public java.io.InputStream bodyByteStream() throws java.io.IOException {
        return this.getHighSpeedVideoSizes.getInputStream();
    }

    @Override // com.airbnb.lottie.network.LottieFetchResult
    public java.lang.String contentType() {
        return this.getHighSpeedVideoSizes.getContentType();
    }

    @Override // com.airbnb.lottie.network.LottieFetchResult
    public java.lang.String error() {
        try {
            if (isSuccessful()) {
                return null;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to fetch ");
            sb.append(this.getHighSpeedVideoSizes.getURL());
            sb.append(". Failed with ");
            sb.append(this.getHighSpeedVideoSizes.getResponseCode());
            sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
            sb.append(getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes));
            return sb.toString();
        } catch (java.io.IOException | java.lang.NullPointerException e) {
            com.airbnb.lottie.utils.Logger.warning("get error failed ", e);
            return e.getMessage();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.getHighSpeedVideoSizes.disconnect();
    }

    private static java.lang.String getHighSpeedVideoFpsRanges(java.net.HttpURLConnection httpURLConnection) throws java.io.IOException {
        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(httpURLConnection.getErrorStream()));
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        while (true) {
            try {
                java.lang.String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                    sb.append('\n');
                } else {
                    try {
                        break;
                    } catch (java.lang.Exception unused) {
                    }
                }
            } finally {
                try {
                    bufferedReader.close();
                } catch (java.lang.Exception unused2) {
                }
            }
        }
        return sb.toString();
    }
}
