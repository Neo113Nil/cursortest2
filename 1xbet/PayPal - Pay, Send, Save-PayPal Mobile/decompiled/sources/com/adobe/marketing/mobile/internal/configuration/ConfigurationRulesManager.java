package com.adobe.marketing.mobile.internal.configuration;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0015\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0013R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/adobe/marketing/mobile/internal/configuration/ConfigurationRulesManager;", "", "Lcom/adobe/marketing/mobile/launch/rulesengine/LaunchRulesEngine;", "launchRulesEngine", "<init>", "(Lcom/adobe/marketing/mobile/launch/rulesengine/LaunchRulesEngine;)V", "Lcom/adobe/marketing/mobile/launch/rulesengine/download/RulesLoader;", "rulesLoader", "(Lcom/adobe/marketing/mobile/launch/rulesengine/LaunchRulesEngine;Lcom/adobe/marketing/mobile/launch/rulesengine/download/RulesLoader;)V", "Lcom/adobe/marketing/mobile/ExtensionApi;", com.visa.cbp.getTicketMetaData$6672$values.values.ReplenishRequest, "", "applyBundledRules$core_phoneRelease", "(Lcom/adobe/marketing/mobile/ExtensionApi;)Z", "extensionApi", "applyCachedRules$core_phoneRelease", "", "url", "applyDownloadedRules$core_phoneRelease", "(Ljava/lang/String;Lcom/adobe/marketing/mobile/ExtensionApi;)Z", "p0", "p1", "getHighSpeedVideoSizes", "Lcom/adobe/marketing/mobile/services/NamedCollection;", "Lcom/adobe/marketing/mobile/services/NamedCollection;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "Lcom/adobe/marketing/mobile/launch/rulesengine/LaunchRulesEngine;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/adobe/marketing/mobile/launch/rulesengine/download/RulesLoader;", "Companion"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class ConfigurationRulesManager {
    public static final java.lang.String BUNDLED_RULES_FILE_NAME = "ADBMobileConfig-rules.zip";
    public static final java.lang.String PERSISTED_RULES_URL = "config.last.rules.url";
    public static final java.lang.String RULES_CACHE_NAME = "config.rules";
    private final com.adobe.marketing.mobile.launch.rulesengine.download.RulesLoader getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.adobe.marketing.mobile.launch.rulesengine.LaunchRulesEngine Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.adobe.marketing.mobile.services.NamedCollection getHighSpeedVideoFpsRanges;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConfigurationRulesManager(com.adobe.marketing.mobile.launch.rulesengine.LaunchRulesEngine launchRulesEngine) {
        this(launchRulesEngine, new com.adobe.marketing.mobile.launch.rulesengine.download.RulesLoader(RULES_CACHE_NAME));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(launchRulesEngine, "");
    }

    public ConfigurationRulesManager(com.adobe.marketing.mobile.launch.rulesengine.LaunchRulesEngine launchRulesEngine, com.adobe.marketing.mobile.launch.rulesengine.download.RulesLoader rulesLoader) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(launchRulesEngine, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rulesLoader, "");
        this.Camera2StreamConfigurationMap = launchRulesEngine;
        this.getHighResolutionOutputSizeshNQ4ISI = rulesLoader;
        this.getHighSpeedVideoFpsRanges = com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getDataStoreService().getNamedCollection("AdobeMobile_ConfigState");
    }

    public final boolean applyCachedRules$core_phoneRelease(com.adobe.marketing.mobile.ExtensionApi extensionApi) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extensionApi, "");
        com.adobe.marketing.mobile.services.NamedCollection namedCollection = this.getHighSpeedVideoFpsRanges;
        if (namedCollection == null) {
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.configuration.ConfigurationExtension.TAG, "ConfigurationRulesManager", "Cannot load rules from AdobeMobile_ConfigState. Cannot apply cached rules", new java.lang.Object[0]);
            return false;
        }
        java.lang.String string = namedCollection.getString(PERSISTED_RULES_URL, null);
        java.lang.String str = string;
        if (str == null || kotlin.text.StringsKt.isBlank(str)) {
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.configuration.ConfigurationExtension.TAG, "ConfigurationRulesManager", "Persisted rules url is null or empty. Cannot apply cached rules", new java.lang.Object[0]);
            return false;
        }
        com.adobe.marketing.mobile.launch.rulesengine.download.RulesLoadResult loadFromCache = this.getHighResolutionOutputSizeshNQ4ISI.loadFromCache(string);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(loadFromCache, "");
        if (loadFromCache.getReason() != com.adobe.marketing.mobile.launch.rulesengine.download.RulesLoadResult.Reason.SUCCESS) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot apply cached rules - ");
            sb.append(loadFromCache.getReason());
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.configuration.ConfigurationExtension.TAG, "ConfigurationRulesManager", sb.toString(), new java.lang.Object[0]);
            return false;
        }
        com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.internal.configuration.ConfigurationExtension.TAG, "ConfigurationRulesManager", "Attempting to replace rules with cached rules", new java.lang.Object[0]);
        return getHighSpeedVideoSizes(loadFromCache.getData(), extensionApi);
    }

    public final boolean applyDownloadedRules$core_phoneRelease(final java.lang.String url, final com.adobe.marketing.mobile.ExtensionApi extensionApi) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extensionApi, "");
        com.adobe.marketing.mobile.services.NamedCollection namedCollection = this.getHighSpeedVideoFpsRanges;
        if (namedCollection == null) {
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.configuration.ConfigurationExtension.TAG, "ConfigurationRulesManager", "Cannot load rules from AdobeMobile_ConfigState. Cannot apply downloaded rules", new java.lang.Object[0]);
            return false;
        }
        namedCollection.setString(PERSISTED_RULES_URL, url);
        this.getHighResolutionOutputSizeshNQ4ISI.loadFromUrl(url, new com.adobe.marketing.mobile.AdobeCallback() { // from class: com.adobe.marketing.mobile.internal.configuration.ConfigurationRulesManager$$ExternalSyntheticLambda0
            @Override // com.adobe.marketing.mobile.AdobeCallback
            public final void call(java.lang.Object obj) {
                com.adobe.marketing.mobile.internal.configuration.ConfigurationRulesManager.$r8$lambda$dS3tBm9mAiuvxJ0V1O5OQo24VC8(url, this, extensionApi, (com.adobe.marketing.mobile.launch.rulesengine.download.RulesLoadResult) obj);
            }
        });
        return true;
    }

    public final boolean applyBundledRules$core_phoneRelease(com.adobe.marketing.mobile.ExtensionApi api) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(api, "");
        com.adobe.marketing.mobile.launch.rulesengine.download.RulesLoadResult loadFromAsset = this.getHighResolutionOutputSizeshNQ4ISI.loadFromAsset(BUNDLED_RULES_FILE_NAME);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(loadFromAsset, "");
        if (loadFromAsset.getReason() != com.adobe.marketing.mobile.launch.rulesengine.download.RulesLoadResult.Reason.SUCCESS) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot apply bundled rules - ");
            sb.append(loadFromAsset.getReason());
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.configuration.ConfigurationExtension.TAG, "ConfigurationRulesManager", sb.toString(), new java.lang.Object[0]);
            return false;
        }
        com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.internal.configuration.ConfigurationExtension.TAG, "ConfigurationRulesManager", "Attempting to replace rules with bundled rules", new java.lang.Object[0]);
        return getHighSpeedVideoSizes(loadFromAsset.getData(), api);
    }

    private final boolean getHighSpeedVideoSizes(java.lang.String p0, com.adobe.marketing.mobile.ExtensionApi p1) {
        if (p0 == null) {
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.configuration.ConfigurationExtension.TAG, "ConfigurationRulesManager", "Rules file content is null. Cannot apply new rules.", new java.lang.Object[0]);
            return false;
        }
        java.util.List<com.adobe.marketing.mobile.launch.rulesengine.LaunchRule> parse = com.adobe.marketing.mobile.launch.rulesengine.json.JSONRulesParser.parse(p0, p1);
        if (parse == null) {
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.configuration.ConfigurationExtension.TAG, "ConfigurationRulesManager", "Parsed rules are null. Cannot apply new rules.", new java.lang.Object[0]);
            return false;
        }
        com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.internal.configuration.ConfigurationExtension.TAG, "ConfigurationRulesManager", "Replacing rules.", new java.lang.Object[0]);
        this.Camera2StreamConfigurationMap.replaceRules(parse);
        return true;
    }

    public static /* synthetic */ void $r8$lambda$dS3tBm9mAiuvxJ0V1O5OQo24VC8(java.lang.String str, com.adobe.marketing.mobile.internal.configuration.ConfigurationRulesManager configurationRulesManager, com.adobe.marketing.mobile.ExtensionApi extensionApi, com.adobe.marketing.mobile.launch.rulesengine.download.RulesLoadResult rulesLoadResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configurationRulesManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extensionApi, "");
        com.adobe.marketing.mobile.launch.rulesengine.download.RulesLoadResult.Reason reason = rulesLoadResult.getReason();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(reason, "");
        com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.internal.configuration.ConfigurationExtension.TAG, "ConfigurationRulesManager", "Rule Download result: ".concat(java.lang.String.valueOf(reason)), new java.lang.Object[0]);
        if (reason != com.adobe.marketing.mobile.launch.rulesengine.download.RulesLoadResult.Reason.NOT_MODIFIED) {
            com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.internal.configuration.ConfigurationExtension.TAG, "ConfigurationRulesManager", "Attempting to replace rules with downloaded rules.", new java.lang.Object[0]);
            configurationRulesManager.getHighSpeedVideoSizes(rulesLoadResult.getData(), extensionApi);
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Rules from ");
            sb.append(str);
            sb.append(" have not been modified. Will not apply rules.");
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.configuration.ConfigurationExtension.TAG, "ConfigurationRulesManager", sb.toString(), new java.lang.Object[0]);
        }
    }
}
