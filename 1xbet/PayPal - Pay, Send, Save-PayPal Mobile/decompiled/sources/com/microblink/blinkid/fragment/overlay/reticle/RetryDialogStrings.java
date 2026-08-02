package com.microblink.blinkid.fragment.overlay.reticle;

/* loaded from: classes10.dex */
public class RetryDialogStrings {
    public final java.lang.String message;
    public final java.lang.String retryButton;
    public final java.lang.String title;

    public RetryDialogStrings(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.title = str;
        this.message = str2;
        this.retryButton = str3;
    }

    public RetryDialogStrings(android.content.Context context, int i, int i2, int i3) {
        this.title = context.getString(i);
        this.message = context.getString(i2);
        this.retryButton = context.getString(i3);
    }
}
