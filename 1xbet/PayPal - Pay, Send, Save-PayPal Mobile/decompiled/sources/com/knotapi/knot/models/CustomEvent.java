package com.knotapi.knot.models;

/* loaded from: classes9.dex */
public class CustomEvent {
    private com.knotapi.knot.models.Bot bot;
    private java.lang.String botId;
    private java.util.List<com.knotapi.knot.utilities.Cookie> cookies;
    private java.lang.String localStorage;
    private java.lang.String merchantId;
    private java.lang.String sessionStorage;
    private boolean shouldStartBot;

    public CustomEvent(com.knotapi.knot.models.Bot bot) {
        this.bot = bot;
    }

    public java.lang.String getBotId() {
        return this.botId;
    }

    public java.util.List<com.knotapi.knot.utilities.Cookie> getCookies() {
        return this.cookies;
    }

    public java.lang.String getLocalStorage() {
        return this.localStorage;
    }

    public java.lang.String getMerchantId() {
        return this.merchantId;
    }

    public java.lang.String getScript() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("merchantId: ");
        sb.append(this.bot.getMerchantId());
        java.lang.String obj = sb.toString();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(obj);
        sb2.append(", botId: ");
        sb2.append(this.bot.getBotId());
        java.lang.String obj2 = sb2.toString();
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        sb3.append(obj2);
        sb3.append(", shouldStartBot: ");
        sb3.append(this.shouldStartBot);
        java.lang.String obj3 = sb3.toString();
        java.util.List<com.knotapi.knot.utilities.Cookie> list = this.cookies;
        if (list != null && list.size() > 0) {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            sb4.append(obj3);
            sb4.append(", cookies: ");
            sb4.append(com.knotapi.knot.utilities.Helper.formatCookiesForPuppeteer(this.cookies));
            obj3 = sb4.toString();
        }
        java.lang.String str = this.localStorage;
        if (str != null && !str.isEmpty()) {
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
            sb5.append(obj3);
            sb5.append(", localStorage: ");
            sb5.append(this.localStorage);
            obj3 = sb5.toString();
        }
        java.lang.String str2 = this.sessionStorage;
        if (str2 != null && !str2.isEmpty()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(obj3);
            sb6.append(", sessionStorage: ");
            sb6.append(this.sessionStorage);
            obj3 = sb6.toString();
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("(function() { window.dispatchEvent(   new CustomEvent(       \"mobileBotRun\", {        bubbles: true,        detail: { ");
        sb7.append(obj3);
        sb7.append("       }    }));})();");
        return sb7.toString();
    }

    public java.lang.String getSessionStorage() {
        return this.sessionStorage;
    }

    public boolean isShouldStartBot() {
        return this.shouldStartBot;
    }

    public void setBotId(java.lang.String str) {
        this.botId = str;
    }

    public void setCookies(java.util.List<com.knotapi.knot.utilities.Cookie> list) {
        this.cookies = list;
    }

    public void setLocalStorage(java.lang.String str) {
        this.localStorage = str;
    }

    public void setMerchantId(java.lang.String str) {
        this.merchantId = str;
    }

    public void setSessionStorage(java.lang.String str) {
        this.sessionStorage = str;
    }

    public void setShouldStartBot(boolean z) {
        this.shouldStartBot = z;
    }
}
