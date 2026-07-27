package com.onesignal.core.internal.config;

import B4.k;
import K1.b;
import com.onesignal.common.modeling.Model;
import com.onesignal.user.internal.jwt.JwtRequirement;
import h4.C0485c;
import java.util.List;
import kotlin.jvm.internal.i;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ConfigModel extends Model {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[JwtRequirement.values().length];
            try {
                iArr[JwtRequirement.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[JwtRequirement.NOT_REQUIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[JwtRequirement.REQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ConfigModel() {
        super(null, null, 3, null);
    }

    @Override // com.onesignal.common.modeling.Model
    public List<?> createListForProperty(String property, JSONArray jsonArray) {
        i.e(property, "property");
        i.e(jsonArray, "jsonArray");
        if (!property.equals("sdkRemoteFeatureFlags")) {
            return null;
        }
        C0485c c0485c = new C0485c(10);
        int length = jsonArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            String optString = jsonArray.optString(i2, "");
            i.b(optString);
            if (!k.Z(optString)) {
                c0485c.add(optString);
            }
        }
        return b.D(c0485c);
    }

    @Override // com.onesignal.common.modeling.Model
    public Model createModelForProperty(String property, JSONObject jsonObject) {
        i.e(property, "property");
        i.e(jsonObject, "jsonObject");
        if (property.equals("influenceParams")) {
            InfluenceConfigModel influenceConfigModel = new InfluenceConfigModel(this, "influenceParams");
            influenceConfigModel.initializeFromJson(jsonObject);
            return influenceConfigModel;
        }
        if (property.equals("fcmParams")) {
            FCMConfigModel fCMConfigModel = new FCMConfigModel(this, "influenceParams");
            fCMConfigModel.initializeFromJson(jsonObject);
            return fCMConfigModel;
        }
        if (!property.equals("remoteLoggingParams")) {
            return null;
        }
        RemoteLoggingConfigModel remoteLoggingConfigModel = new RemoteLoggingConfigModel(this, "remoteLoggingParams");
        remoteLoggingConfigModel.initializeFromJson(jsonObject);
        return remoteLoggingConfigModel;
    }

    public final String getApiUrl() {
        return getStringProperty("apiUrl", ConfigModel$apiUrl$1.INSTANCE);
    }

    public final String getAppId() {
        return Model.getStringProperty$default(this, "appId", null, 2, null);
    }

    public final long getBackgroundFetchNotificationPermissionInterval() {
        return getLongProperty("backgroundFetchNotificationPermissionInterval", ConfigModel$backgroundFetchNotificationPermissionInterval$1.INSTANCE);
    }

    public final boolean getClearGroupOnSummaryClick() {
        return getBooleanProperty("clearGroupOnSummaryClick", ConfigModel$clearGroupOnSummaryClick$1.INSTANCE);
    }

    public final Boolean getConsentGiven() {
        return Model.getOptBooleanProperty$default(this, "consentGiven", null, 2, null);
    }

    public final Boolean getConsentRequired() {
        return Model.getOptBooleanProperty$default(this, "consentRequired", null, 2, null);
    }

    public final boolean getDisableGMSMissingPrompt() {
        return getBooleanProperty("disableGMSMissingPrompt", ConfigModel$disableGMSMissingPrompt$1.INSTANCE);
    }

    public final boolean getEnterprise() {
        return getBooleanProperty("enterprise", ConfigModel$enterprise$1.INSTANCE);
    }

    public final FCMConfigModel getFcmParams() {
        Object anyProperty = getAnyProperty("fcmParams", new ConfigModel$fcmParams$1(this));
        i.c(anyProperty, "null cannot be cast to non-null type com.onesignal.core.internal.config.FCMConfigModel");
        return (FCMConfigModel) anyProperty;
    }

    public final long getFetchIAMMinInterval() {
        return getLongProperty("fetchIAMMinInterval", ConfigModel$fetchIAMMinInterval$1.INSTANCE);
    }

    public final boolean getFirebaseAnalytics() {
        return getBooleanProperty("firebaseAnalytics", ConfigModel$firebaseAnalytics$1.INSTANCE);
    }

    public final long getForegroundFetchNotificationPermissionInterval() {
        return getLongProperty("foregroundFetchNotificationPermissionInterval", ConfigModel$foregroundFetchNotificationPermissionInterval$1.INSTANCE);
    }

    public final String getGoogleProjectNumber() {
        return Model.getOptStringProperty$default(this, "googleProjectNumber", null, 2, null);
    }

    public final int getHttpGetTimeout() {
        return getIntProperty("httpGetTimeout", ConfigModel$httpGetTimeout$1.INSTANCE);
    }

    public final int getHttpRetryAfterParseFailFallback() {
        return getIntProperty("httpRetryAfterParseFailFallback", ConfigModel$httpRetryAfterParseFailFallback$1.INSTANCE);
    }

    public final int getHttpTimeout() {
        return getIntProperty("httpTimeout", ConfigModel$httpTimeout$1.INSTANCE);
    }

    public final InfluenceConfigModel getInfluenceParams() {
        Object anyProperty = getAnyProperty("influenceParams", new ConfigModel$influenceParams$1(this));
        i.c(anyProperty, "null cannot be cast to non-null type com.onesignal.core.internal.config.InfluenceConfigModel");
        return (InfluenceConfigModel) anyProperty;
    }

    public final boolean getLocationShared() {
        return getBooleanProperty("locationShared", ConfigModel$locationShared$1.INSTANCE);
    }

    public final JSONArray getNotificationChannels() {
        String optStringProperty = getOptStringProperty("notificationChannels", ConfigModel$notificationChannels$1.INSTANCE);
        if (optStringProperty == null) {
            optStringProperty = "[]";
        }
        return new JSONArray(optStringProperty);
    }

    public final long getOpRepoDefaultFailRetryBackoff() {
        return getLongProperty("opRepoDefaultFailRetryBackoff", ConfigModel$opRepoDefaultFailRetryBackoff$1.INSTANCE);
    }

    public final long getOpRepoExecutionInterval() {
        return getLongProperty("opRepoExecutionInterval", ConfigModel$opRepoExecutionInterval$1.INSTANCE);
    }

    public final long getOpRepoPostCreateDelay() {
        return getLongProperty("opRepoPostCreateDelay", ConfigModel$opRepoPostCreateDelay$1.INSTANCE);
    }

    public final long getOpRepoPostCreateRetryUpTo() {
        return getLongProperty("opRepoPostCreateRetryUpTo", ConfigModel$opRepoPostCreateRetryUpTo$1.INSTANCE);
    }

    public final long getOpRepoPostWakeDelay() {
        return getLongProperty("opRepoPostWakeDelay", ConfigModel$opRepoPostWakeDelay$1.INSTANCE);
    }

    public final String getPushSubscriptionId() {
        return Model.getOptStringProperty$default(this, "pushSubscriptionId", null, 2, null);
    }

    public final boolean getReceiveReceiptEnabled() {
        return getBooleanProperty("receiveReceiptEnabled", ConfigModel$receiveReceiptEnabled$1.INSTANCE);
    }

    public final RemoteLoggingConfigModel getRemoteLoggingParams() {
        Object anyProperty = getAnyProperty("remoteLoggingParams", new ConfigModel$remoteLoggingParams$1(this));
        i.c(anyProperty, "null cannot be cast to non-null type com.onesignal.core.internal.config.RemoteLoggingConfigModel");
        return (RemoteLoggingConfigModel) anyProperty;
    }

    public final boolean getRestoreTTLFilter() {
        return getBooleanProperty("restoreTTLFilter", ConfigModel$restoreTTLFilter$1.INSTANCE);
    }

    public final String getSdkRemoteFeatureFlagMetadata() {
        return Model.getOptStringProperty$default(this, "sdkRemoteFeatureFlagMetadata", null, 2, null);
    }

    public final List<String> getSdkRemoteFeatureFlags() {
        return getListProperty("sdkRemoteFeatureFlags", ConfigModel$sdkRemoteFeatureFlags$1.INSTANCE);
    }

    public final long getSessionFocusTimeout() {
        return getLongProperty("sessionFocusTimeout", ConfigModel$sessionFocusTimeout$1.INSTANCE);
    }

    public final boolean getUnsubscribeWhenNotificationsDisabled() {
        return getBooleanProperty("unsubscribeWhenNotificationsDisabled", ConfigModel$unsubscribeWhenNotificationsDisabled$1.INSTANCE);
    }

    public final JwtRequirement getUseIdentityVerification$com_onesignal_core() {
        return JwtRequirement.Companion.fromBoolean(Model.getOptBooleanProperty$default(this, "useIdentityVerification", null, 2, null));
    }

    public final boolean getUserRejectedGMSUpdate() {
        return getBooleanProperty("userRejectedGMSUpdate", ConfigModel$userRejectedGMSUpdate$1.INSTANCE);
    }

    public final boolean isInitializedWithRemote() {
        return getBooleanProperty("isInitializedWithRemote", ConfigModel$isInitializedWithRemote$1.INSTANCE);
    }

    public final void setApiUrl(String value) {
        i.e(value, "value");
        Model.setStringProperty$default(this, "apiUrl", value, null, false, 12, null);
    }

    public final void setAppId(String value) {
        i.e(value, "value");
        Model.setStringProperty$default(this, "appId", value, null, false, 12, null);
    }

    public final void setBackgroundFetchNotificationPermissionInterval(long j2) {
        Model.setLongProperty$default(this, "backgroundFetchNotificationPermissionInterval", j2, null, false, 12, null);
    }

    public final void setClearGroupOnSummaryClick(boolean z) {
        Model.setBooleanProperty$default(this, "clearGroupOnSummaryClick", z, null, false, 12, null);
    }

    public final void setConsentGiven(Boolean bool) {
        Model.setOptBooleanProperty$default(this, "consentGiven", bool, null, false, 12, null);
    }

    public final void setConsentRequired(Boolean bool) {
        Model.setOptBooleanProperty$default(this, "consentRequired", bool, null, false, 12, null);
    }

    public final void setDisableGMSMissingPrompt(boolean z) {
        Model.setBooleanProperty$default(this, "disableGMSMissingPrompt", z, null, false, 12, null);
    }

    public final void setEnterprise(boolean z) {
        Model.setBooleanProperty$default(this, "enterprise", z, null, false, 12, null);
    }

    public final void setFetchIAMMinInterval(long j2) {
        Model.setLongProperty$default(this, "fetchIAMMinInterval", j2, null, false, 12, null);
    }

    public final void setFirebaseAnalytics(boolean z) {
        Model.setBooleanProperty$default(this, "firebaseAnalytics", z, null, false, 12, null);
    }

    public final void setForegroundFetchNotificationPermissionInterval(long j2) {
        Model.setLongProperty$default(this, "foregroundFetchNotificationPermissionInterval", j2, null, false, 12, null);
    }

    public final void setGoogleProjectNumber(String str) {
        Model.setOptStringProperty$default(this, "googleProjectNumber", str, null, false, 12, null);
    }

    public final void setHttpGetTimeout(int i2) {
        Model.setIntProperty$default(this, "httpGetTimeout", i2, null, false, 12, null);
    }

    public final void setHttpRetryAfterParseFailFallback(int i2) {
        Model.setIntProperty$default(this, "httpRetryAfterParseFailFallback", i2, null, false, 12, null);
    }

    public final void setHttpTimeout(int i2) {
        Model.setIntProperty$default(this, "httpTimeout", i2, null, false, 12, null);
    }

    public final void setInitializedWithRemote(boolean z) {
        Model.setBooleanProperty$default(this, "isInitializedWithRemote", z, null, false, 12, null);
    }

    public final void setLocationShared(boolean z) {
        Model.setBooleanProperty$default(this, "locationShared", z, null, false, 12, null);
    }

    public final void setNotificationChannels(JSONArray jSONArray) {
        Model.setOptStringProperty$default(this, "notificationChannels", jSONArray != null ? jSONArray.toString() : null, null, false, 12, null);
    }

    public final void setOpRepoDefaultFailRetryBackoff(long j2) {
        Model.setLongProperty$default(this, "opRepoDefaultFailRetryBackoff", j2, null, false, 12, null);
    }

    public final void setOpRepoExecutionInterval(long j2) {
        Model.setLongProperty$default(this, "opRepoExecutionInterval", j2, null, false, 12, null);
    }

    public final void setOpRepoPostCreateDelay(long j2) {
        Model.setLongProperty$default(this, "opRepoPostCreateDelay", j2, null, false, 12, null);
    }

    public final void setOpRepoPostCreateRetryUpTo(long j2) {
        Model.setLongProperty$default(this, "opRepoPostCreateRetryUpTo", j2, null, false, 12, null);
    }

    public final void setOpRepoPostWakeDelay(long j2) {
        Model.setLongProperty$default(this, "opRepoPostWakeDelay", j2, null, false, 12, null);
    }

    public final void setPushSubscriptionId(String str) {
        Model.setOptStringProperty$default(this, "pushSubscriptionId", str, null, false, 12, null);
    }

    public final void setReceiveReceiptEnabled(boolean z) {
        Model.setBooleanProperty$default(this, "receiveReceiptEnabled", z, null, false, 12, null);
    }

    public final void setRestoreTTLFilter(boolean z) {
        Model.setBooleanProperty$default(this, "restoreTTLFilter", z, null, false, 12, null);
    }

    public final void setSdkRemoteFeatureFlagMetadata(String str) {
        Model.setOptStringProperty$default(this, "sdkRemoteFeatureFlagMetadata", str, null, false, 12, null);
    }

    public final void setSdkRemoteFeatureFlags(List<String> value) {
        i.e(value, "value");
        Model.setListProperty$default(this, "sdkRemoteFeatureFlags", value, null, false, 12, null);
    }

    public final void setSessionFocusTimeout(long j2) {
        Model.setLongProperty$default(this, "sessionFocusTimeout", j2, null, false, 12, null);
    }

    public final void setUnsubscribeWhenNotificationsDisabled(boolean z) {
        Model.setBooleanProperty$default(this, "unsubscribeWhenNotificationsDisabled", z, null, false, 12, null);
    }

    public final void setUseIdentityVerification$com_onesignal_core(JwtRequirement value) {
        Boolean bool;
        i.e(value, "value");
        int i2 = WhenMappings.$EnumSwitchMapping$0[value.ordinal()];
        if (i2 == 1) {
            bool = null;
        } else if (i2 == 2) {
            bool = Boolean.FALSE;
        } else {
            if (i2 != 3) {
                throw new C1.b();
            }
            bool = Boolean.TRUE;
        }
        Model.setOptBooleanProperty$default(this, "useIdentityVerification", bool, null, false, 12, null);
    }

    public final void setUserRejectedGMSUpdate(boolean z) {
        Model.setBooleanProperty$default(this, "userRejectedGMSUpdate", z, null, false, 12, null);
    }
}
