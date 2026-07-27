package com.onesignal.user.internal.subscriptions;

import com.onesignal.common.modeling.Model;
import com.onesignal.common.modeling.ModelChangeTags;
import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import com.onesignal.otel.config.OtelConfigRemoteOneSignal;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class SubscriptionModel extends Model {
    public SubscriptionModel() {
        super(null, null, 3, null);
    }

    public final String getAddress() {
        return Model.getStringProperty$default(this, "address", null, 2, null);
    }

    public final String getAppVersion() {
        return getStringProperty("appVersion", SubscriptionModel$appVersion$1.INSTANCE);
    }

    public final String getCarrier() {
        return getStringProperty("carrier", SubscriptionModel$carrier$1.INSTANCE);
    }

    public final String getDeviceOS() {
        return getStringProperty("deviceOS", SubscriptionModel$deviceOS$1.INSTANCE);
    }

    public final boolean getOptedIn() {
        return Model.getBooleanProperty$default(this, "optedIn", null, 2, null);
    }

    public final String getSdk() {
        return getStringProperty(OtelConfigRemoteOneSignal.OTEL_PATH, SubscriptionModel$sdk$1.INSTANCE);
    }

    public final SubscriptionStatus getStatus() {
        if (!hasProperty("status")) {
            SubscriptionStatus subscriptionStatus = SubscriptionStatus.SUBSCRIBED;
            setOptAnyProperty("status", subscriptionStatus != null ? subscriptionStatus.toString() : null, ModelChangeTags.NORMAL, false);
        }
        Object optAnyProperty$default = Model.getOptAnyProperty$default(this, "status", null, 2, null);
        Enum valueOf = optAnyProperty$default != null ? optAnyProperty$default instanceof SubscriptionStatus ? (Enum) optAnyProperty$default : optAnyProperty$default instanceof String ? SubscriptionStatus.valueOf((String) optAnyProperty$default) : (SubscriptionStatus) optAnyProperty$default : null;
        if (valueOf != null) {
            return (SubscriptionStatus) valueOf;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.onesignal.user.internal.subscriptions.SubscriptionStatus");
    }

    public final SubscriptionType getType() {
        Object optAnyProperty$default = Model.getOptAnyProperty$default(this, WebViewManager.EVENT_TYPE_KEY, null, 2, null);
        Enum valueOf = optAnyProperty$default != null ? optAnyProperty$default instanceof SubscriptionType ? (Enum) optAnyProperty$default : optAnyProperty$default instanceof String ? SubscriptionType.valueOf((String) optAnyProperty$default) : (SubscriptionType) optAnyProperty$default : null;
        if (valueOf != null) {
            return (SubscriptionType) valueOf;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.onesignal.user.internal.subscriptions.SubscriptionType");
    }

    public final boolean isDisabledInternally() {
        return getBooleanProperty("isDisabledInternally", SubscriptionModel$isDisabledInternally$1.INSTANCE);
    }

    public final void setAddress(String value) {
        i.e(value, "value");
        Model.setStringProperty$default(this, "address", value, null, false, 12, null);
    }

    public final void setAppVersion(String value) {
        i.e(value, "value");
        Model.setStringProperty$default(this, "appVersion", value, null, false, 12, null);
    }

    public final void setCarrier(String value) {
        i.e(value, "value");
        Model.setStringProperty$default(this, "carrier", value, null, false, 12, null);
    }

    public final void setDeviceOS(String value) {
        i.e(value, "value");
        Model.setStringProperty$default(this, "deviceOS", value, null, false, 12, null);
    }

    public final void setDisabledInternally(boolean z) {
        Model.setBooleanProperty$default(this, "isDisabledInternally", z, null, false, 12, null);
    }

    public final void setOptedIn(boolean z) {
        Model.setBooleanProperty$default(this, "optedIn", z, null, false, 12, null);
    }

    public final void setSdk(String value) {
        i.e(value, "value");
        Model.setStringProperty$default(this, OtelConfigRemoteOneSignal.OTEL_PATH, value, null, false, 12, null);
    }

    public final void setStatus(SubscriptionStatus value) {
        i.e(value, "value");
        setOptAnyProperty("status", value.toString(), ModelChangeTags.NORMAL, false);
    }

    public final void setType(SubscriptionType value) {
        i.e(value, "value");
        setOptAnyProperty(WebViewManager.EVENT_TYPE_KEY, value.toString(), ModelChangeTags.NORMAL, false);
    }
}
