package com.onesignal.user.internal.operations;

import com.onesignal.common.IDManager;
import com.onesignal.common.modeling.Model;
import com.onesignal.core.internal.operations.GroupComparisonType;
import com.onesignal.core.internal.operations.Operation;
import com.onesignal.user.internal.operations.impl.executors.LoginUserOperationExecutor;
import java.util.Map;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class LoginUserOperation extends Operation {
    private final GroupComparisonType groupComparisonType;
    private final String modifyComparisonKey;

    public LoginUserOperation() {
        super(LoginUserOperationExecutor.LOGIN_USER);
        this.modifyComparisonKey = "";
        this.groupComparisonType = GroupComparisonType.CREATE;
    }

    private final void setAppId(String str) {
        Model.setStringProperty$default(this, "appId", str, null, false, 12, null);
    }

    private final void setOnesignalId(String str) {
        Model.setStringProperty$default(this, "onesignalId", str, null, false, 12, null);
    }

    public final String getAppId() {
        return Model.getStringProperty$default(this, "appId", null, 2, null);
    }

    @Override // com.onesignal.core.internal.operations.Operation
    public String getApplyToRecordId() {
        String existingOnesignalId = getExistingOnesignalId();
        return existingOnesignalId == null ? getOnesignalId() : existingOnesignalId;
    }

    @Override // com.onesignal.core.internal.operations.Operation
    public boolean getCanStartExecute() {
        if (getExistingOnesignalId() != null) {
            IDManager iDManager = IDManager.INSTANCE;
            String existingOnesignalId = getExistingOnesignalId();
            i.b(existingOnesignalId);
            if (iDManager.isLocalId(existingOnesignalId)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.onesignal.core.internal.operations.Operation
    public String getCreateComparisonKey() {
        return getAppId() + ".User." + getOnesignalId();
    }

    public final String getExistingOnesignalId() {
        return Model.getOptStringProperty$default(this, "existingOnesignalId", null, 2, null);
    }

    @Override // com.onesignal.core.internal.operations.Operation
    public GroupComparisonType getGroupComparisonType() {
        return this.groupComparisonType;
    }

    @Override // com.onesignal.core.internal.operations.Operation
    public String getModifyComparisonKey() {
        return this.modifyComparisonKey;
    }

    public final String getOnesignalId() {
        return Model.getStringProperty$default(this, "onesignalId", null, 2, null);
    }

    public final void setExistingOnesignalId$com_onesignal_core(String str) {
        Model.setOptStringProperty$default(this, "existingOnesignalId", str, null, false, 12, null);
    }

    @Override // com.onesignal.core.internal.operations.Operation
    public void translateIds(Map<String, String> map) {
        i.e(map, "map");
        if (map.containsKey(getExistingOnesignalId())) {
            String str = map.get(getExistingOnesignalId());
            i.b(str);
            setExistingOnesignalId$com_onesignal_core(str);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoginUserOperation(String appId, String onesignalId, String str, String str2) {
        this();
        i.e(appId, "appId");
        i.e(onesignalId, "onesignalId");
        setAppId(appId);
        setOnesignalId(onesignalId);
        setExternalId$com_onesignal_core(str);
        setExistingOnesignalId$com_onesignal_core(str2);
    }

    public /* synthetic */ LoginUserOperation(String str, String str2, String str3, String str4, int i2, e eVar) {
        this(str, str2, str3, (i2 & 8) != 0 ? null : str4);
    }
}
