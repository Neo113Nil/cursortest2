package com.helpshift.proactive;

/* loaded from: classes5.dex */
public class ProactiveActionHandler {
    public static com.helpshift.proactive.HelpshiftProactiveAPIConfigCollector configCollector;

    public static void handleProactiveAction(android.content.Context context, com.helpshift.config.HSConfigManager hSConfigManager, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str2, java.lang.String str3) {
        java.util.Map<java.lang.String, java.lang.Object> jsonStringToMap = com.helpshift.util.JsonUtils.jsonStringToMap(str);
        switch (com.helpshift.proactive.ProactiveActionHandler.AnonymousClass1.$SwitchMap$com$helpshift$proactive$ProactiveActions[com.helpshift.proactive.ProactiveActions.fromValue(str2).ordinal()]) {
            case 1:
            case 2:
                handleShowConversation(context, hSConfigManager, jsonStringToMap, map);
                break;
            case 3:
                handleShowFAQ(context, hSConfigManager, jsonStringToMap, map);
                break;
            case 4:
                if (com.helpshift.util.Utils.isEmpty(str3)) {
                    handleShowFAQ(context, hSConfigManager, jsonStringToMap, map);
                    break;
                } else {
                    handleShowFAQSection(context, hSConfigManager, str3, jsonStringToMap, map);
                    break;
                }
            case 5:
                if (com.helpshift.util.Utils.isEmpty(str3)) {
                    handleShowFAQ(context, hSConfigManager, jsonStringToMap, map);
                    break;
                } else {
                    handleShowSingleFAQ(context, hSConfigManager, str3, jsonStringToMap, map);
                    break;
                }
            case 6:
                handleDeepLink(context, hSConfigManager, str3, jsonStringToMap, map);
                break;
            case 7:
                com.helpshift.util.ApplicationUtil.startLauncherActivity(context);
                break;
        }
    }

    /* renamed from: com.helpshift.proactive.ProactiveActionHandler$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$helpshift$proactive$ProactiveActions;

        static {
            int[] iArr = new int[com.helpshift.proactive.ProactiveActions.values().length];
            $SwitchMap$com$helpshift$proactive$ProactiveActions = iArr;
            try {
                iArr[com.helpshift.proactive.ProactiveActions.UNKNOWN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$helpshift$proactive$ProactiveActions[com.helpshift.proactive.ProactiveActions.CHAT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$helpshift$proactive$ProactiveActions[com.helpshift.proactive.ProactiveActions.FAQS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$helpshift$proactive$ProactiveActions[com.helpshift.proactive.ProactiveActions.FAQ_SECTION.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$helpshift$proactive$ProactiveActions[com.helpshift.proactive.ProactiveActions.SINGLE_FAQ.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$helpshift$proactive$ProactiveActions[com.helpshift.proactive.ProactiveActions.DEEPLINK.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$helpshift$proactive$ProactiveActions[com.helpshift.proactive.ProactiveActions.OPEN_APP.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }

    public static void handleShowConversation(android.content.Context context, com.helpshift.config.HSConfigManager hSConfigManager, java.util.Map<java.lang.String, java.lang.Object> map, java.util.Map<java.lang.String, java.lang.String> map2) {
        com.helpshift.internal.HelpshiftAPIInternalHandler.showConversationInternal(context, resolveConfig(hSConfigManager, map, map2), true);
    }

    public static void handleShowFAQ(android.content.Context context, com.helpshift.config.HSConfigManager hSConfigManager, java.util.Map<java.lang.String, java.lang.Object> map, java.util.Map<java.lang.String, java.lang.String> map2) {
        com.helpshift.internal.HelpshiftAPIInternalHandler.showFAQsInternal(context, resolveConfig(hSConfigManager, map, map2), true);
    }

    public static void handleShowFAQSection(android.content.Context context, com.helpshift.config.HSConfigManager hSConfigManager, java.lang.String str, java.util.Map<java.lang.String, java.lang.Object> map, java.util.Map<java.lang.String, java.lang.String> map2) {
        com.helpshift.internal.HelpshiftAPIInternalHandler.showFAQSectionInternal(context, str, resolveConfig(hSConfigManager, map, map2), true);
    }

    public static void handleShowSingleFAQ(android.content.Context context, com.helpshift.config.HSConfigManager hSConfigManager, java.lang.String str, java.util.Map<java.lang.String, java.lang.Object> map, java.util.Map<java.lang.String, java.lang.String> map2) {
        com.helpshift.internal.HelpshiftAPIInternalHandler.showSingleFAQInternal(context, str, resolveConfig(hSConfigManager, map, map2), true);
    }

    public static void handleDeepLink(android.content.Context context, com.helpshift.config.HSConfigManager hSConfigManager, java.lang.String str, java.util.Map<java.lang.String, java.lang.Object> map, java.util.Map<java.lang.String, java.lang.String> map2) {
        java.util.Map<java.lang.String, java.lang.Object> resolveConfig = resolveConfig(hSConfigManager, map, map2);
        if (com.helpshift.util.Utils.isEmpty(str)) {
            return;
        }
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str));
        intent.addCategory("android.intent.category.BROWSABLE");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.putExtra(com.helpshift.proactive.InAppViewConstants.CONFIG, new java.util.HashMap(resolveConfig));
        context.startActivity(intent);
    }

    private static java.util.Map<java.lang.String, java.lang.Object> resolveConfig(com.helpshift.config.HSConfigManager hSConfigManager, java.util.Map<java.lang.String, java.lang.Object> map, java.util.Map<java.lang.String, java.lang.String> map2) {
        java.util.Map<java.lang.String, java.lang.Object> proactiveLocalConfig = com.helpshift.internal.HelpshiftAPIInternalHandler.getProactiveLocalConfig(configCollector);
        if (!com.helpshift.util.Utils.isEmpty(proactiveLocalConfig) && hSConfigManager != null) {
            proactiveLocalConfig.put("source", "api");
            hSConfigManager.saveLocalProactiveConfig(proactiveLocalConfig);
        }
        map.put("proactiveNotificationAnalyticsData", map2);
        return map;
    }
}
