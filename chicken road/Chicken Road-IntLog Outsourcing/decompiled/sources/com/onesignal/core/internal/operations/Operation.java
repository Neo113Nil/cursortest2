package com.onesignal.core.internal.operations;

import com.onesignal.common.modeling.Model;
import java.util.Map;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public abstract class Operation extends Model {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Operation(String name) {
        super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        i.e(name, "name");
        setName(name);
    }

    private final void setName(String str) {
        Model.setStringProperty$default(this, "name", str, null, false, 12, null);
    }

    public abstract String getApplyToRecordId();

    public abstract boolean getCanStartExecute();

    public abstract String getCreateComparisonKey();

    public final String getExternalId() {
        return Model.getOptStringProperty$default(this, "externalId", null, 2, null);
    }

    public abstract GroupComparisonType getGroupComparisonType();

    public abstract String getModifyComparisonKey();

    public final String getName() {
        return Model.getStringProperty$default(this, "name", null, 2, null);
    }

    public boolean getRequiresJwt() {
        return true;
    }

    public final void setExternalId$com_onesignal_core(String str) {
        Model.setOptStringProperty$default(this, "externalId", str, null, false, 12, null);
    }

    public String toString() {
        String jSONObject = toJSON().toString();
        i.d(jSONObject, "toString(...)");
        return jSONObject;
    }

    public void translateIds(Map<String, String> map) {
        i.e(map, "map");
    }
}
