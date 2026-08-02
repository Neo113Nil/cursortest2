package com.knotapi.knot.models;

/* loaded from: classes9.dex */
public class ErrorView {
    java.lang.String bg;
    java.lang.String color;
    java.lang.String content;
    java.lang.String displayedAt;
    java.lang.String logoLink;

    /* renamed from: name, reason: collision with root package name */
    java.lang.String f3952name;
    java.lang.String title;

    public ErrorView(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
        this.f3952name = str;
        this.title = str2;
        this.content = str3;
        this.logoLink = str4;
        this.bg = str5;
        this.color = str6;
        this.displayedAt = str7;
    }

    public java.lang.String getContent() {
        return this.content;
    }

    public java.lang.String getDisplayedAt() {
        return this.displayedAt;
    }

    public java.lang.String getLogoLink() {
        return this.logoLink;
    }

    public java.lang.String getName() {
        return this.f3952name;
    }

    public java.lang.String getThemeBackground() {
        return this.bg;
    }

    public java.lang.String getThemeTextColor() {
        return this.color;
    }

    public java.lang.String getTitle() {
        return this.title;
    }

    public void setContent(java.lang.String str) {
        this.content = str;
    }

    public void setDisplayedAt(java.lang.String str) {
        this.displayedAt = str;
    }

    public void setLogoLink(java.lang.String str) {
        this.logoLink = str;
    }

    public void setName(java.lang.String str) {
        this.f3952name = str;
    }

    public void setThemeBackground(java.lang.String str) {
        this.bg = str;
    }

    public void setThemeTextColor(java.lang.String str) {
        this.color = str;
    }

    public void setTitle(java.lang.String str) {
        this.title = str;
    }
}
