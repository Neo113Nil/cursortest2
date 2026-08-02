package com.knotapi.knot.models;

/* loaded from: classes9.dex */
public class PageActions {
    boolean complete;
    boolean isUrlRegex;
    java.lang.String redirectUrl;
    java.lang.String url;

    public PageActions(java.lang.String str, java.lang.String str2, boolean z, boolean z2) {
        this.url = str;
        this.redirectUrl = str2;
        this.isUrlRegex = z;
        this.complete = z2;
    }

    public boolean getComplete() {
        return this.complete;
    }

    public boolean getIsUrlRegex() {
        return this.isUrlRegex;
    }

    public java.lang.String getRedirectUrl() {
        return this.redirectUrl;
    }

    public java.lang.String getUrl() {
        return this.url;
    }

    public void setComplete(boolean z) {
        this.complete = z;
    }

    public void setIsUrlRegex(boolean z) {
        this.isUrlRegex = z;
    }

    public void setRedirectUrl(java.lang.String str) {
        this.redirectUrl = str;
    }

    public void setUrl(java.lang.String str) {
        this.url = str;
    }
}
