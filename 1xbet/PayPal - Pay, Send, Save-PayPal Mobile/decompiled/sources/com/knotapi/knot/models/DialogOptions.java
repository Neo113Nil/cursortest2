package com.knotapi.knot.models;

/* loaded from: classes9.dex */
public class DialogOptions {
    android.view.View.OnClickListener closeButtonListener;
    java.lang.String description;
    java.lang.String primaryButton;
    android.view.View.OnClickListener primaryButtonListener;
    java.lang.String secondaryButton;
    android.view.View.OnClickListener secondaryButtonListener;
    java.lang.String showEditText;
    java.lang.String title;
    java.lang.String logoLink = this.logoLink;
    java.lang.String logoLink = this.logoLink;

    public DialogOptions(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, android.view.View.OnClickListener onClickListener, android.view.View.OnClickListener onClickListener2, android.view.View.OnClickListener onClickListener3, java.lang.String str5) {
        this.title = str;
        this.description = str2;
        this.primaryButton = str3;
        this.secondaryButton = str4;
        this.primaryButtonListener = onClickListener;
        this.secondaryButtonListener = onClickListener2;
        this.closeButtonListener = onClickListener3;
        this.showEditText = str5;
    }

    public android.view.View.OnClickListener getCloseButtonListener() {
        return this.closeButtonListener;
    }

    public java.lang.String getDescription() {
        return this.description;
    }

    public java.lang.String getPrimaryButton() {
        return this.primaryButton;
    }

    public android.view.View.OnClickListener getPrimaryButtonListener() {
        return this.primaryButtonListener;
    }

    public java.lang.String getSecondaryButton() {
        return this.secondaryButton;
    }

    public android.view.View.OnClickListener getSecondaryButtonListener() {
        return this.secondaryButtonListener;
    }

    public java.lang.String getTitle() {
        return this.title;
    }

    public java.lang.String isShowEditText() {
        return this.showEditText;
    }

    public void setDescription(java.lang.String str) {
        this.description = str;
    }

    public void setPrimaryButton(java.lang.String str) {
        this.primaryButton = str;
    }

    public void setPrimaryButtonListener(android.view.View.OnClickListener onClickListener) {
        this.primaryButtonListener = onClickListener;
    }

    public void setSecondaryButton(java.lang.String str) {
        this.secondaryButton = str;
    }

    public void setSecondaryButtonListener(android.view.View.OnClickListener onClickListener) {
        this.secondaryButtonListener = onClickListener;
    }

    public void setTitle(java.lang.String str) {
        this.title = str;
    }
}
