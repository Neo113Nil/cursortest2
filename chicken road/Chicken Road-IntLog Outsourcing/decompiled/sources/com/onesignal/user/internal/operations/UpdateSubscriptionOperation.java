package com.onesignal.user.internal.operations;

import com.onesignal.common.IDManager;
import com.onesignal.common.modeling.Model;
import com.onesignal.common.modeling.ModelChangeTags;
import com.onesignal.core.internal.operations.GroupComparisonType;
import com.onesignal.core.internal.operations.Operation;
import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import com.onesignal.user.internal.operations.impl.executors.SubscriptionOperationExecutor;
import com.onesignal.user.internal.subscriptions.SubscriptionStatus;
import com.onesignal.user.internal.subscriptions.SubscriptionType;
import java.util.Map;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class UpdateSubscriptionOperation extends Operation {
    private final GroupComparisonType groupComparisonType;

    public UpdateSubscriptionOperation() {
        super(SubscriptionOperationExecutor.UPDATE_SUBSCRIPTION);
        this.groupComparisonType = GroupComparisonType.ALTER;
    }

    private final void setAddress(String str) {
        Model.setStringProperty$default(this, "address", str, null, false, 12, null);
    }

    private final void setAppId(String str) {
        Model.setStringProperty$default(this, "appId", str, null, false, 12, null);
    }

    private final void setEnabled(boolean z) {
        Model.setBooleanProperty$default(this, "enabled", z, null, false, 12, null);
    }

    private final void setOnesignalId(String str) {
        Model.setStringProperty$default(this, "onesignalId", str, null, false, 12, null);
    }

    private final void setStatus(SubscriptionStatus subscriptionStatus) {
        setOptAnyProperty("status", subscriptionStatus != null ? subscriptionStatus.toString() : null, ModelChangeTags.NORMAL, false);
    }

    private final void setSubscriptionId(String str) {
        Model.setStringProperty$default(this, "subscriptionId", str, null, false, 12, null);
    }

    private final void setType(SubscriptionType subscriptionType) {
        setOptAnyProperty(WebViewManager.EVENT_TYPE_KEY, subscriptionType != null ? subscriptionType.toString() : null, ModelChangeTags.NORMAL, false);
    }

    public final String getAddress() {
        return Model.getStringProperty$default(this, "address", null, 2, null);
    }

    public final String getAppId() {
        return Model.getStringProperty$default(this, "appId", null, 2, null);
    }

    @Override // com.onesignal.core.internal.operations.Operation
    public String getApplyToRecordId() {
        return getSubscriptionId();
    }

    @Override // com.onesignal.core.internal.operations.Operation
    public boolean getCanStartExecute() {
        IDManager iDManager = IDManager.INSTANCE;
        return (iDManager.isLocalId(getOnesignalId()) || iDManager.isLocalId(getSubscriptionId())) ? false : true;
    }

    @Override // com.onesignal.core.internal.operations.Operation
    public String getCreateComparisonKey() {
        return getAppId() + ".User." + getOnesignalId();
    }

    public final boolean getEnabled() {
        return Model.getBooleanProperty$default(this, "enabled", null, 2, null);
    }

    @Override // com.onesignal.core.internal.operations.Operation
    public GroupComparisonType getGroupComparisonType() {
        return this.groupComparisonType;
    }

    @Override // com.onesignal.core.internal.operations.Operation
    public String getModifyComparisonKey() {
        return getAppId() + ".User." + getOnesignalId() + ".Subscription." + getSubscriptionId();
    }

    public final String getOnesignalId() {
        return Model.getStringProperty$default(this, "onesignalId", null, 2, null);
    }

    public final SubscriptionStatus getStatus() {
        Object optAnyProperty$default = Model.getOptAnyProperty$default(this, "status", null, 2, null);
        Enum valueOf = optAnyProperty$default != null ? optAnyProperty$default instanceof SubscriptionStatus ? (Enum) optAnyProperty$default : optAnyProperty$default instanceof String ? SubscriptionStatus.valueOf((String) optAnyProperty$default) : (SubscriptionStatus) optAnyProperty$default : null;
        if (valueOf != null) {
            return (SubscriptionStatus) valueOf;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.onesignal.user.internal.subscriptions.SubscriptionStatus");
    }

    public final String getSubscriptionId() {
        return Model.getStringProperty$default(this, "subscriptionId", null, 2, null);
    }

    public final SubscriptionType getType() {
        Object optAnyProperty$default = Model.getOptAnyProperty$default(this, WebViewManager.EVENT_TYPE_KEY, null, 2, null);
        Enum valueOf = optAnyProperty$default != null ? optAnyProperty$default instanceof SubscriptionType ? (Enum) optAnyProperty$default : optAnyProperty$default instanceof String ? SubscriptionType.valueOf((String) optAnyProperty$default) : (SubscriptionType) optAnyProperty$default : null;
        if (valueOf != null) {
            return (SubscriptionType) valueOf;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.onesignal.user.internal.subscriptions.SubscriptionType");
    }

    @Override // com.onesignal.core.internal.operations.Operation
    public void translateIds(Map<String, String> map) {
        i.e(map, "map");
        if (map.containsKey(getOnesignalId())) {
            String str = map.get(getOnesignalId());
            i.b(str);
            setOnesignalId(str);
        }
        if (map.containsKey(getSubscriptionId())) {
            String str2 = map.get(getSubscriptionId());
            i.b(str2);
            setSubscriptionId(str2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UpdateSubscriptionOperation(String appId, String onesignalId, String str, String subscriptionId, SubscriptionType type, boolean z, String address, SubscriptionStatus status) {
        this();
        i.e(appId, "appId");
        i.e(onesignalId, "onesignalId");
        i.e(subscriptionId, "subscriptionId");
        i.e(type, "type");
        i.e(address, "address");
        i.e(status, "status");
        setAppId(appId);
        setOnesignalId(onesignalId);
        setExternalId$com_onesignal_core(str);
        setSubscriptionId(subscriptionId);
        setType(type);
        setEnabled(z);
        setAddress(address);
        setStatus(status);
    }
}
