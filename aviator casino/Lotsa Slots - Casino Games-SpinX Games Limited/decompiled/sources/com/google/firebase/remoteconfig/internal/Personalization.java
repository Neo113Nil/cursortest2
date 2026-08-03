package com.google.firebase.remoteconfig.internal;

/* loaded from: classes3.dex */
public class Personalization {
    public static final java.lang.String ANALYTICS_ORIGIN_PERSONALIZATION = "fp";
    public static final java.lang.String ARM_INDEX = "armIndex";
    public static final java.lang.String CHOICE_ID = "choiceId";
    public static final java.lang.String EXTERNAL_ARM_INDEX_PARAM = "arm_index";
    public static final java.lang.String EXTERNAL_ARM_VALUE_PARAM = "arm_value";
    public static final java.lang.String EXTERNAL_EVENT = "personalization_assignment";
    public static final java.lang.String EXTERNAL_GROUP_PARAM = "group";
    public static final java.lang.String EXTERNAL_PERSONALIZATION_ID_PARAM = "personalization_id";
    public static final java.lang.String EXTERNAL_RC_PARAMETER_PARAM = "arm_key";
    public static final java.lang.String GROUP = "group";
    public static final java.lang.String INTERNAL_CHOICE_ID_PARAM = "_fpid";
    public static final java.lang.String INTERNAL_EVENT = "_fpc";
    public static final java.lang.String PERSONALIZATION_ID = "personalizationId";
    private final com.google.firebase.inject.Provider<com.google.firebase.analytics.connector.AnalyticsConnector> analyticsConnector;
    private final java.util.Map<java.lang.String, java.lang.String> loggedChoiceIds = java.util.Collections.synchronizedMap(new java.util.HashMap());

    public Personalization(com.google.firebase.inject.Provider<com.google.firebase.analytics.connector.AnalyticsConnector> provider) {
        this.analyticsConnector = provider;
    }

    public void logArmActive(java.lang.String str, com.google.firebase.remoteconfig.internal.ConfigContainer configContainer) {
        org.json.JSONObject optJSONObject;
        com.google.firebase.analytics.connector.AnalyticsConnector analyticsConnector = this.analyticsConnector.get();
        if (analyticsConnector == null) {
            return;
        }
        org.json.JSONObject personalizationMetadata = configContainer.getPersonalizationMetadata();
        if (personalizationMetadata.length() < 1) {
            return;
        }
        org.json.JSONObject configs = configContainer.getConfigs();
        if (configs.length() >= 1 && (optJSONObject = personalizationMetadata.optJSONObject(str)) != null) {
            java.lang.String optString = optJSONObject.optString(CHOICE_ID);
            if (optString.isEmpty()) {
                return;
            }
            synchronized (this.loggedChoiceIds) {
                if (optString.equals(this.loggedChoiceIds.get(str))) {
                    return;
                }
                this.loggedChoiceIds.put(str, optString);
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString(EXTERNAL_RC_PARAMETER_PARAM, str);
                bundle.putString(EXTERNAL_ARM_VALUE_PARAM, configs.optString(str));
                bundle.putString(EXTERNAL_PERSONALIZATION_ID_PARAM, optJSONObject.optString(PERSONALIZATION_ID));
                bundle.putInt(EXTERNAL_ARM_INDEX_PARAM, optJSONObject.optInt(ARM_INDEX, -1));
                bundle.putString("group", optJSONObject.optString("group"));
                analyticsConnector.logEvent(ANALYTICS_ORIGIN_PERSONALIZATION, EXTERNAL_EVENT, bundle);
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putString(INTERNAL_CHOICE_ID_PARAM, optString);
                analyticsConnector.logEvent(ANALYTICS_ORIGIN_PERSONALIZATION, INTERNAL_EVENT, bundle2);
            }
        }
    }
}
