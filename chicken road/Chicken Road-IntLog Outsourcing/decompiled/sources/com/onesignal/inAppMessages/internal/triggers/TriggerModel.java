package com.onesignal.inAppMessages.internal.triggers;

import com.onesignal.common.modeling.Model;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class TriggerModel extends Model {
    public TriggerModel() {
        super(null, null, 3, null);
    }

    public final String getKey() {
        return getStringProperty("key", TriggerModel$key$1.INSTANCE);
    }

    public final Object getValue() {
        return getAnyProperty("value", TriggerModel$value$1.INSTANCE);
    }

    public final void setKey(String value) {
        i.e(value, "value");
        Model.setStringProperty$default(this, "key", value, null, false, 12, null);
    }

    public final void setValue(Object value) {
        i.e(value, "value");
        Model.setAnyProperty$default(this, "value", value, null, true, 4, null);
    }
}
