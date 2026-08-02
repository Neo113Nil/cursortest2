package com.adobe.marketing.mobile.internal.configuration;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\u0003J\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/adobe/marketing/mobile/internal/configuration/AppIdManager;", "", "<init>", "()V", "", "getAppIDFromPersistence$core_phoneRelease", "()Ljava/lang/String;", "loadAppId$core_phoneRelease", "", "removeAppIdFromPersistence$core_phoneRelease", "appId", "saveAppIdToPersistence$core_phoneRelease", "(Ljava/lang/String;)V", "Lcom/adobe/marketing/mobile/services/NamedCollection;", "getHighSpeedVideoSizes", "Lcom/adobe/marketing/mobile/services/NamedCollection;", "Companion"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class AppIdManager {
    private final com.adobe.marketing.mobile.services.NamedCollection getHighSpeedVideoSizes = com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getDataStoreService().getNamedCollection("AdobeMobile_ConfigState");

    public final void saveAppIdToPersistence$core_phoneRelease(java.lang.String appId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appId, "");
        if (kotlin.text.StringsKt.isBlank(appId)) {
            com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.internal.configuration.ConfigurationExtension.TAG, "AppIdManager", "Attempting to set empty App Id into persistence.", new java.lang.Object[0]);
            return;
        }
        com.adobe.marketing.mobile.services.NamedCollection namedCollection = this.getHighSpeedVideoSizes;
        if (namedCollection != null) {
            namedCollection.setString(com.adobe.marketing.mobile.internal.configuration.ConfigurationStateManager.PERSISTED_APPID, appId);
        }
    }

    public final void removeAppIdFromPersistence$core_phoneRelease() {
        com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.internal.configuration.ConfigurationExtension.TAG, "AppIdManager", "Attempting to set empty App Id into persistence.", new java.lang.Object[0]);
        com.adobe.marketing.mobile.services.NamedCollection namedCollection = this.getHighSpeedVideoSizes;
        if (namedCollection != null) {
            namedCollection.remove(com.adobe.marketing.mobile.internal.configuration.ConfigurationStateManager.PERSISTED_APPID);
        }
    }

    public final java.lang.String loadAppId$core_phoneRelease() {
        java.lang.String appIDFromPersistence$core_phoneRelease = getAppIDFromPersistence$core_phoneRelease();
        if (appIDFromPersistence$core_phoneRelease != null) {
            com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.internal.configuration.ConfigurationExtension.TAG, "AppIdManager", "Retrieved AppId from persistence.", new java.lang.Object[0]);
        }
        if (appIDFromPersistence$core_phoneRelease == null && (appIDFromPersistence$core_phoneRelease = com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getDeviceInfoService().getPropertyFromManifest(com.adobe.marketing.mobile.internal.configuration.ConfigurationStateManager.CONFIG_MANIFEST_APPID_KEY)) != null) {
            com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.internal.configuration.ConfigurationExtension.TAG, "AppIdManager", "Retrieved AppId from manifest.", new java.lang.Object[0]);
            saveAppIdToPersistence$core_phoneRelease(appIDFromPersistence$core_phoneRelease);
        }
        return appIDFromPersistence$core_phoneRelease;
    }

    public final java.lang.String getAppIDFromPersistence$core_phoneRelease() {
        com.adobe.marketing.mobile.services.NamedCollection namedCollection = this.getHighSpeedVideoSizes;
        if (namedCollection != null) {
            return namedCollection.getString(com.adobe.marketing.mobile.internal.configuration.ConfigurationStateManager.PERSISTED_APPID, null);
        }
        return null;
    }
}
