package com.adobe.marketing.mobile.services.ui;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0005H&¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/adobe/marketing/mobile/services/ui/PresentationUtilityProvider;", "", "Landroid/app/Application;", "getApplication", "()Landroid/app/Application;", "", "cacheName", "key", "Ljava/io/InputStream;", "getCachedContent", "(Ljava/lang/String;Ljava/lang/String;)Ljava/io/InputStream;", "Landroid/app/Activity;", "getCurrentActivity", "()Landroid/app/Activity;", "uri", "", "openUri", "(Ljava/lang/String;)Z"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public interface PresentationUtilityProvider {
    android.app.Application getApplication();

    java.io.InputStream getCachedContent(java.lang.String cacheName, java.lang.String key);

    android.app.Activity getCurrentActivity();

    boolean openUri(java.lang.String uri);
}
