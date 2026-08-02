package com.knotapi.knot.models;

/* loaded from: classes9.dex */
public class ErrorViewActions {
    com.google.gson.JsonObject errorView;
    boolean isUrlRegex;
    java.lang.String url;

    public ErrorViewActions(java.lang.String str, boolean z, com.google.gson.JsonObject jsonObject) {
        this.url = str;
        this.isUrlRegex = z;
        this.errorView = jsonObject;
    }

    public com.google.gson.JsonObject getErrorView() {
        return this.errorView;
    }

    public boolean getIsUrlRegex() {
        return this.isUrlRegex;
    }

    public java.lang.String getUrl() {
        return this.url;
    }

    public void setErrorView(com.google.gson.JsonObject jsonObject) {
        this.errorView = jsonObject;
    }

    public void setIsUrlRegex(boolean z) {
        this.isUrlRegex = z;
    }

    public void setUrl(java.lang.String str) {
        this.url = str;
    }

    public ErrorViewActions() {
    }
}
