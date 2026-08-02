package com.knotapi.knot.models;

/* loaded from: classes9.dex */
public class MerchantWebViewData {
    private int botId;
    private java.lang.String cookies;
    private java.lang.String eventType;
    private java.util.Map<java.lang.String, java.lang.String> interactionMap;
    private java.lang.String localStorage;
    private java.lang.String message;
    private java.lang.String screenName;
    private java.lang.String sessionStorage;

    public static class Builder {
        private final com.knotapi.knot.models.MerchantWebViewData data = new com.knotapi.knot.models.MerchantWebViewData();

        public com.knotapi.knot.models.MerchantWebViewData build() {
            return this.data;
        }

        public com.knotapi.knot.models.MerchantWebViewData.Builder setBotId(int i) {
            this.data.botId = i;
            return this;
        }

        public com.knotapi.knot.models.MerchantWebViewData.Builder setCookies(java.lang.String str) {
            this.data.cookies = str;
            return this;
        }

        public com.knotapi.knot.models.MerchantWebViewData.Builder setEventType(java.lang.String str) {
            this.data.eventType = str;
            return this;
        }

        public com.knotapi.knot.models.MerchantWebViewData.Builder setInteractionMap(java.util.Map<java.lang.String, java.lang.String> map) {
            this.data.interactionMap = map != null ? new java.util.HashMap(map) : null;
            return this;
        }

        public com.knotapi.knot.models.MerchantWebViewData.Builder setLocalStorage(java.lang.String str) {
            this.data.localStorage = str;
            return this;
        }

        public com.knotapi.knot.models.MerchantWebViewData.Builder setMessage(java.lang.String str) {
            this.data.message = str;
            return this;
        }

        public com.knotapi.knot.models.MerchantWebViewData.Builder setScreenName(java.lang.String str) {
            this.data.screenName = str;
            return this;
        }

        public com.knotapi.knot.models.MerchantWebViewData.Builder setSessionStorage(java.lang.String str) {
            this.data.sessionStorage = str;
            return this;
        }
    }

    public int getBotId() {
        return this.botId;
    }

    public java.lang.String getCookies() {
        return this.cookies;
    }

    public java.lang.String getEventType() {
        return this.eventType;
    }

    public java.util.Map<java.lang.String, java.lang.String> getInteractionMap() {
        return this.interactionMap;
    }

    public java.lang.String getLocalStorage() {
        return this.localStorage;
    }

    public java.lang.String getMessage() {
        return this.message;
    }

    public java.lang.String getScreenName() {
        return this.screenName;
    }

    public java.lang.String getSessionStorage() {
        return this.sessionStorage;
    }

    private MerchantWebViewData() {
        this.message = "";
        this.screenName = "";
        this.cookies = "{}";
        this.eventType = "";
    }
}
