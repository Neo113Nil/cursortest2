package com.adobe.marketing.mobile.util;

/* loaded from: classes7.dex */
public class URLBuilder {
    private boolean getHighSpeedVideoFpsRangesFor = true;
    private java.lang.String getHighSpeedVideoSizes = "";
    private java.lang.String getHighSpeedVideoFpsRanges = "";
    private java.lang.String getHighResolutionOutputSizeshNQ4ISI = "";

    public enum EncodeType {
        NONE(1),
        ENCODE(2);

        public final int id;

        EncodeType(int i) {
            this.id = i;
        }
    }

    public com.adobe.marketing.mobile.util.URLBuilder enableSSL(boolean z) {
        this.getHighSpeedVideoFpsRangesFor = z;
        return this;
    }

    public com.adobe.marketing.mobile.util.URLBuilder setServer(java.lang.String str) {
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        return this;
    }

    public com.adobe.marketing.mobile.util.URLBuilder addPath(java.lang.String str) {
        if (str != null && str.length() != 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.getHighSpeedVideoSizes);
            sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
            sb.append(com.adobe.marketing.mobile.util.UrlUtils.urlEncode(str));
            this.getHighSpeedVideoSizes = sb.toString();
        }
        return this;
    }

    public com.adobe.marketing.mobile.util.URLBuilder addQueryParameters(java.util.Map<java.lang.String, java.lang.String> map) {
        if (map != null && map.size() != 0) {
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
                addQueryParameter(entry.getKey(), entry.getValue());
            }
        }
        return this;
    }

    public com.adobe.marketing.mobile.util.URLBuilder addQueryParameter(java.lang.String str, java.lang.String str2) {
        if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str) || com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str2)) {
            return this;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(com.adobe.marketing.mobile.util.UrlUtils.urlEncode(str));
        sb.append("=");
        sb.append(com.adobe.marketing.mobile.util.UrlUtils.urlEncode(str2));
        return addQuery(sb.toString(), com.adobe.marketing.mobile.util.URLBuilder.EncodeType.NONE);
    }

    public com.adobe.marketing.mobile.util.URLBuilder addQuery(java.lang.String str) {
        return addQuery(str, com.adobe.marketing.mobile.util.URLBuilder.EncodeType.ENCODE);
    }

    public com.adobe.marketing.mobile.util.URLBuilder addQuery(java.lang.String str, com.adobe.marketing.mobile.util.URLBuilder.EncodeType encodeType) {
        if (str != null && str.length() != 0) {
            if (encodeType == com.adobe.marketing.mobile.util.URLBuilder.EncodeType.ENCODE) {
                str = com.adobe.marketing.mobile.util.UrlUtils.urlEncode(str);
            }
            java.lang.String str2 = this.getHighSpeedVideoFpsRanges;
            if (str2 == null || str2.length() == 0) {
                this.getHighSpeedVideoFpsRanges = str;
            } else {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(this.getHighSpeedVideoFpsRanges);
                sb.append("&");
                sb.append(str);
                this.getHighSpeedVideoFpsRanges = sb.toString();
                return this;
            }
        }
        return this;
    }

    public java.lang.String build() {
        if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(this.getHighResolutionOutputSizeshNQ4ISI)) {
            com.adobe.marketing.mobile.services.Log.error("URLBuilder", "Failed to generate the URL for (server:%s,  path:%s, query:%s)", this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges);
            return null;
        }
        java.lang.String str = this.getHighSpeedVideoFpsRanges;
        java.lang.String format = java.lang.String.format("%s://%s%s%s%s", this.getHighSpeedVideoFpsRangesFor ? "https" : "http", this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, str != null && str.length() > 0 ? com.datadog.android.core.internal.CoreFeature.DEFAULT_APP_VERSION : "", this.getHighSpeedVideoFpsRanges);
        try {
            new java.net.URL(format).toURI();
            return format;
        } catch (java.lang.Exception e) {
            com.adobe.marketing.mobile.services.Log.error(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "URLBuilder", "Failed to generate the URL for (server:%s,  path:%s, query:%s) (%s)", this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, e);
            return null;
        }
    }
}
