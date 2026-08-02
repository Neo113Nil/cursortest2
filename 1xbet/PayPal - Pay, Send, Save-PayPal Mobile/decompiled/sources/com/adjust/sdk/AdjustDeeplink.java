package com.adjust.sdk;

/* loaded from: classes7.dex */
public class AdjustDeeplink {
    android.net.Uri referrer;
    android.net.Uri url;

    public AdjustDeeplink(android.net.Uri uri) {
        this.url = uri;
    }

    public android.net.Uri getReferrer() {
        return this.referrer;
    }

    public android.net.Uri getUrl() {
        return this.url;
    }

    public boolean isValid() {
        android.net.Uri uri = this.url;
        return (uri == null || uri.toString().isEmpty()) ? false : true;
    }

    public void setReferrer(android.net.Uri uri) {
        this.referrer = uri;
    }
}
