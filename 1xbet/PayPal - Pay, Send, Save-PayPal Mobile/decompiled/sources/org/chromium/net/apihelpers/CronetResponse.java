package org.chromium.net.apihelpers;

/* loaded from: classes18.dex */
public class CronetResponse<T> {
    private final org.chromium.net.UrlResponseInfo getHighResolutionOutputSizeshNQ4ISI;
    private final T getHighSpeedVideoFpsRanges;

    CronetResponse(org.chromium.net.UrlResponseInfo urlResponseInfo, T t) {
        this.getHighResolutionOutputSizeshNQ4ISI = urlResponseInfo;
        this.getHighSpeedVideoFpsRanges = t;
    }

    public org.chromium.net.UrlResponseInfo getUrlResponseInfo() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public T getResponseBody() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof org.chromium.net.apihelpers.CronetResponse)) {
            return false;
        }
        org.chromium.net.apihelpers.CronetResponse cronetResponse = (org.chromium.net.apihelpers.CronetResponse) obj;
        return java.util.Objects.equals(this.getHighResolutionOutputSizeshNQ4ISI, cronetResponse.getHighResolutionOutputSizeshNQ4ISI) && java.util.Objects.equals(this.getHighSpeedVideoFpsRanges, cronetResponse.getHighSpeedVideoFpsRanges);
    }

    public int hashCode() {
        return java.util.Objects.hash(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges);
    }
}
