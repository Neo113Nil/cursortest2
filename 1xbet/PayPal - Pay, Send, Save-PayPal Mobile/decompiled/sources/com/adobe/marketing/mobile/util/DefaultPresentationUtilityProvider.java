package com.adobe.marketing.mobile.util;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/adobe/marketing/mobile/util/DefaultPresentationUtilityProvider;", "Lcom/adobe/marketing/mobile/services/ui/PresentationUtilityProvider;", "<init>", "()V", "Landroid/app/Application;", "getApplication", "()Landroid/app/Application;", "", "cacheName", "key", "Ljava/io/InputStream;", "getCachedContent", "(Ljava/lang/String;Ljava/lang/String;)Ljava/io/InputStream;", "Landroid/app/Activity;", "getCurrentActivity", "()Landroid/app/Activity;", "uri", "", "openUri", "(Ljava/lang/String;)Z"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class DefaultPresentationUtilityProvider implements com.adobe.marketing.mobile.services.ui.PresentationUtilityProvider {
    public static final int $stable = 0;

    @Override // com.adobe.marketing.mobile.services.ui.PresentationUtilityProvider
    public final android.app.Application getApplication() {
        return com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getAppContextService().getApplication();
    }

    @Override // com.adobe.marketing.mobile.services.ui.PresentationUtilityProvider
    public final android.app.Activity getCurrentActivity() {
        return com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getAppContextService().getCurrentActivity();
    }

    @Override // com.adobe.marketing.mobile.services.ui.PresentationUtilityProvider
    public final java.io.InputStream getCachedContent(java.lang.String cacheName, java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        com.adobe.marketing.mobile.services.caching.CacheResult cacheResult = com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getCacheService().get(cacheName, key);
        if (cacheResult != null) {
            return cacheResult.getData();
        }
        return null;
    }

    @Override // com.adobe.marketing.mobile.services.ui.PresentationUtilityProvider
    public final boolean openUri(java.lang.String uri) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
        return com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getUriService().openUri(uri);
    }
}
