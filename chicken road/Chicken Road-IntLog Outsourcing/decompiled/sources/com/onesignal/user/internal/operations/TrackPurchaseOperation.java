package com.onesignal.user.internal.operations;

import com.onesignal.common.IDManager;
import com.onesignal.common.modeling.Model;
import com.onesignal.core.internal.operations.GroupComparisonType;
import com.onesignal.core.internal.operations.Operation;
import com.onesignal.user.internal.operations.impl.executors.UpdateUserOperationExecutor;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.i;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class TrackPurchaseOperation extends Operation {
    private final GroupComparisonType groupComparisonType;

    public TrackPurchaseOperation() {
        super(UpdateUserOperationExecutor.TRACK_PURCHASE);
        this.groupComparisonType = GroupComparisonType.ALTER;
    }

    private final void setAmountSpent(BigDecimal bigDecimal) {
        Model.setBigDecimalProperty$default(this, "amountSpent", bigDecimal, null, false, 12, null);
    }

    private final void setAppId(String str) {
        Model.setStringProperty$default(this, "appId", str, null, false, 12, null);
    }

    private final void setOnesignalId(String str) {
        Model.setStringProperty$default(this, "onesignalId", str, null, false, 12, null);
    }

    private final void setPurchases(List<PurchaseInfo> list) {
        Model.setListProperty$default(this, "purchases", list, null, false, 12, null);
    }

    private final void setTreatNewAsExisting(boolean z) {
        Model.setBooleanProperty$default(this, "treatNewAsExisting", z, null, false, 12, null);
    }

    @Override // com.onesignal.common.modeling.Model
    public List<?> createListForProperty(String property, JSONArray jsonArray) {
        i.e(property, "property");
        i.e(jsonArray, "jsonArray");
        if (!property.equals("purchases")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int length = jsonArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            PurchaseInfo purchaseInfo = new PurchaseInfo();
            JSONObject jSONObject = jsonArray.getJSONObject(i2);
            i.d(jSONObject, "getJSONObject(...)");
            purchaseInfo.initializeFromJson(jSONObject);
            arrayList.add(purchaseInfo);
        }
        return arrayList;
    }

    public final BigDecimal getAmountSpent() {
        return Model.getBigDecimalProperty$default(this, "amountSpent", null, 2, null);
    }

    public final String getAppId() {
        return Model.getStringProperty$default(this, "appId", null, 2, null);
    }

    @Override // com.onesignal.core.internal.operations.Operation
    public String getApplyToRecordId() {
        return getOnesignalId();
    }

    @Override // com.onesignal.core.internal.operations.Operation
    public boolean getCanStartExecute() {
        return !IDManager.INSTANCE.isLocalId(getOnesignalId());
    }

    @Override // com.onesignal.core.internal.operations.Operation
    public String getCreateComparisonKey() {
        return "";
    }

    @Override // com.onesignal.core.internal.operations.Operation
    public GroupComparisonType getGroupComparisonType() {
        return this.groupComparisonType;
    }

    @Override // com.onesignal.core.internal.operations.Operation
    public String getModifyComparisonKey() {
        return getAppId() + ".User." + getOnesignalId();
    }

    public final String getOnesignalId() {
        return Model.getStringProperty$default(this, "onesignalId", null, 2, null);
    }

    public final List<PurchaseInfo> getPurchases() {
        return Model.getListProperty$default(this, "purchases", null, 2, null);
    }

    public final boolean getTreatNewAsExisting() {
        return Model.getBooleanProperty$default(this, "treatNewAsExisting", null, 2, null);
    }

    @Override // com.onesignal.core.internal.operations.Operation
    public void translateIds(Map<String, String> map) {
        i.e(map, "map");
        if (map.containsKey(getOnesignalId())) {
            String str = map.get(getOnesignalId());
            i.b(str);
            setOnesignalId(str);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TrackPurchaseOperation(String appId, String onesignalId, String str, boolean z, BigDecimal amountSpent, List<PurchaseInfo> purchases) {
        this();
        i.e(appId, "appId");
        i.e(onesignalId, "onesignalId");
        i.e(amountSpent, "amountSpent");
        i.e(purchases, "purchases");
        setAppId(appId);
        setOnesignalId(onesignalId);
        setExternalId$com_onesignal_core(str);
        setTreatNewAsExisting(z);
        setAmountSpent(amountSpent);
        setPurchases(purchases);
    }
}
