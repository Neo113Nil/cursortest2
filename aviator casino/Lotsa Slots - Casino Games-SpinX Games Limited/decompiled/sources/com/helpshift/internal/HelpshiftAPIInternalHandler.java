package com.helpshift.internal;

/* loaded from: classes2.dex */
public class HelpshiftAPIInternalHandler {
    private static final java.lang.String TAG = "HSIntnlAPIHndlr";

    public static void showConversationInternal(final android.content.Context context, final java.util.Map<java.lang.String, java.lang.Object> map, final boolean z) {
        com.helpshift.log.HSLogger.d(TAG, "showConversation is called with config: " + map + " \n Is proactive? " + z);
        com.helpshift.core.HSContext hSContext = com.helpshift.core.HSContext.getInstance();
        hSContext.getUserManager().triggerIdentityAttributeSync();
        hSContext.getHsThreadingService().runOnUIThread(new java.lang.Runnable() { // from class: com.helpshift.internal.HelpshiftAPIInternalHandler$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.helpshift.internal.HelpshiftAPIInternalHandler.lambda$showConversationInternal$0(map, context, z);
            }
        });
    }

    static /* synthetic */ void lambda$showConversationInternal$0(java.util.Map map, android.content.Context context, boolean z) {
        saveConfig(map);
        android.content.Intent createIntent = com.helpshift.util.ActivityUtil.createIntent(context, com.helpshift.activities.HSMainActivity.class);
        createIntent.putExtra(com.helpshift.util.ConfigValues.SERVICE_MODE_KEY, com.helpshift.util.ConfigValues.WEBCHAT_SERVICE);
        createIntent.putExtra("source", "api");
        if (z) {
            createIntent.putExtra("source", com.helpshift.util.ConfigValues.SOURCE_PROACTIVE);
            createIntent.setFlags(268435456);
        }
        context.startActivity(createIntent);
    }

    public static void showFAQsInternal(final android.content.Context context, final java.util.Map<java.lang.String, java.lang.Object> map, final boolean z) {
        com.helpshift.log.HSLogger.d(TAG, "showFAQs is called with config: " + map + " \n Is proactive? " + z);
        com.helpshift.core.HSContext hSContext = com.helpshift.core.HSContext.getInstance();
        hSContext.getUserManager().triggerIdentityAttributeSync();
        hSContext.getHsThreadingService().runOnUIThread(new java.lang.Runnable() { // from class: com.helpshift.internal.HelpshiftAPIInternalHandler$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.helpshift.internal.HelpshiftAPIInternalHandler.lambda$showFAQsInternal$1(map, context, z);
            }
        });
    }

    static /* synthetic */ void lambda$showFAQsInternal$1(java.util.Map map, android.content.Context context, boolean z) {
        saveConfig(map);
        android.content.Intent createIntent = com.helpshift.util.ActivityUtil.createIntent(context, com.helpshift.activities.HSMainActivity.class);
        createIntent.putExtra(com.helpshift.util.ConfigValues.SERVICE_MODE_KEY, com.helpshift.util.ConfigValues.HELP_CENTER_SERVICE);
        createIntent.putExtra(com.helpshift.util.ConfigValues.HELPCENTER_MODE_KEY, com.helpshift.util.ConfigValues.HELPCENTER_MODE_APP_MAIN_PAGE);
        createIntent.putExtra("source", "api");
        if (z) {
            createIntent.putExtra("source", com.helpshift.util.ConfigValues.SOURCE_PROACTIVE);
            createIntent.setFlags(268435456);
        }
        context.startActivity(createIntent);
    }

    public static void showFAQSectionInternal(final android.content.Context context, final java.lang.String str, final java.util.Map<java.lang.String, java.lang.Object> map, final boolean z) {
        com.helpshift.log.HSLogger.d(TAG, "showFAQSection is called with sectionId" + str + " & config: " + map + " \n Is proactive? : " + z);
        if (com.helpshift.util.Utils.isEmpty(str)) {
            com.helpshift.log.HSLogger.e(TAG, "Invalid FAQ Section ID. Ignoring call to showFAQSection API.");
            return;
        }
        com.helpshift.core.HSContext hSContext = com.helpshift.core.HSContext.getInstance();
        hSContext.getUserManager().triggerIdentityAttributeSync();
        hSContext.getHsThreadingService().runOnUIThread(new java.lang.Runnable() { // from class: com.helpshift.internal.HelpshiftAPIInternalHandler$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                com.helpshift.internal.HelpshiftAPIInternalHandler.lambda$showFAQSectionInternal$2(map, context, str, z);
            }
        });
    }

    static /* synthetic */ void lambda$showFAQSectionInternal$2(java.util.Map map, android.content.Context context, java.lang.String str, boolean z) {
        saveConfig(map);
        android.content.Intent createIntent = com.helpshift.util.ActivityUtil.createIntent(context, com.helpshift.activities.HSMainActivity.class);
        createIntent.putExtra(com.helpshift.util.ConfigValues.SERVICE_MODE_KEY, com.helpshift.util.ConfigValues.HELP_CENTER_SERVICE);
        createIntent.putExtra(com.helpshift.util.ConfigValues.HELPCENTER_MODE_KEY, com.helpshift.util.ConfigValues.HELPCENTER_MODE_FAQ_SECTION);
        createIntent.putExtra(com.helpshift.util.ConfigValues.FAQ_SECTION_ID_KEY, str);
        createIntent.putExtra("source", "api");
        if (z) {
            createIntent.putExtra("source", com.helpshift.util.ConfigValues.SOURCE_PROACTIVE);
            createIntent.setFlags(268435456);
        }
        context.startActivity(createIntent);
    }

    public static void showSingleFAQInternal(final android.content.Context context, final java.lang.String str, final java.util.Map<java.lang.String, java.lang.Object> map, final boolean z) {
        com.helpshift.log.HSLogger.d(TAG, "showSingleFAQ() is called with publishId" + str + " & config: " + map + " \n Is proactive? : " + z);
        if (com.helpshift.util.Utils.isEmpty(str)) {
            com.helpshift.log.HSLogger.e(TAG, "Invalid FAQ ID. Ignoring call to showSingleFAQ API.");
            return;
        }
        com.helpshift.core.HSContext hSContext = com.helpshift.core.HSContext.getInstance();
        hSContext.getUserManager().triggerIdentityAttributeSync();
        hSContext.getHsThreadingService().runOnUIThread(new java.lang.Runnable() { // from class: com.helpshift.internal.HelpshiftAPIInternalHandler$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.helpshift.internal.HelpshiftAPIInternalHandler.lambda$showSingleFAQInternal$3(map, context, str, z);
            }
        });
    }

    static /* synthetic */ void lambda$showSingleFAQInternal$3(java.util.Map map, android.content.Context context, java.lang.String str, boolean z) {
        saveConfig(map);
        android.content.Intent createIntent = com.helpshift.util.ActivityUtil.createIntent(context, com.helpshift.activities.HSMainActivity.class);
        createIntent.putExtra(com.helpshift.util.ConfigValues.SERVICE_MODE_KEY, com.helpshift.util.ConfigValues.HELP_CENTER_SERVICE);
        createIntent.putExtra(com.helpshift.util.ConfigValues.HELPCENTER_MODE_KEY, com.helpshift.util.ConfigValues.HELPCENTER_MODE_SINGLE_FAQ);
        createIntent.putExtra(com.helpshift.util.ConfigValues.SINGLE_FAQ_PUBLISH_ID_KEY, str);
        createIntent.putExtra("source", "api");
        if (z) {
            createIntent.putExtra("source", com.helpshift.util.ConfigValues.SOURCE_PROACTIVE);
            createIntent.setFlags(268435456);
        }
        context.startActivity(createIntent);
    }

    private static void saveConfig(java.util.Map<java.lang.String, java.lang.Object> map) {
        com.helpshift.core.HSContext hSContext = com.helpshift.core.HSContext.getInstance();
        java.util.HashMap hashMap = map == null ? new java.util.HashMap() : new java.util.HashMap(map);
        if (hashMap.containsKey(com.helpshift.util.ConfigValues.OLD_CUSTOM_ISSUE_FIELDS) && !hashMap.containsKey(com.helpshift.util.ConfigValues.CUSTOM_ISSUE_FIELDS)) {
            hashMap.put(com.helpshift.util.ConfigValues.CUSTOM_ISSUE_FIELDS, hashMap.remove(com.helpshift.util.ConfigValues.OLD_CUSTOM_ISSUE_FIELDS));
        }
        hashMap.put(com.helpshift.util.ConfigValues.ENABLE_LOGGING, java.lang.Boolean.valueOf(hSContext.isSDKLoggingEnabled()));
        hSContext.getConfigManager().saveConfig(hashMap);
    }

    public static java.util.Map<java.lang.String, java.lang.Object> getProactiveLocalConfig(com.helpshift.proactive.HelpshiftProactiveAPIConfigCollector helpshiftProactiveAPIConfigCollector) {
        if (helpshiftProactiveAPIConfigCollector != null) {
            java.util.Map<java.lang.String, java.lang.Object> aPIConfig = helpshiftProactiveAPIConfigCollector.getAPIConfig();
            com.helpshift.log.HSLogger.d(TAG, "Collected local config for proactive: " + aPIConfig);
            return aPIConfig != null ? aPIConfig : new java.util.HashMap();
        }
        return new java.util.HashMap();
    }
}
