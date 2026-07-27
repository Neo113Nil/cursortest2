package com.onesignal.core.internal.config;

import com.onesignal.common.modeling.Model;
import com.onesignal.common.modeling.ModelChangeTags;
import com.onesignal.debug.LogLevel;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class RemoteLoggingConfigModel extends Model {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteLoggingConfigModel(Model parentModel, String parentProperty) {
        super(parentModel, parentProperty);
        i.e(parentModel, "parentModel");
        i.e(parentProperty, "parentProperty");
    }

    public final LogLevel getLogLevel() {
        Object optAnyProperty$default = Model.getOptAnyProperty$default(this, "logLevel", null, 2, null);
        return (LogLevel) (optAnyProperty$default != null ? optAnyProperty$default instanceof LogLevel ? (Enum) optAnyProperty$default : optAnyProperty$default instanceof String ? LogLevel.valueOf((String) optAnyProperty$default) : (LogLevel) optAnyProperty$default : null);
    }

    public final boolean isEnabled() {
        return getBooleanProperty("isEnabled", RemoteLoggingConfigModel$isEnabled$1.INSTANCE);
    }

    public final void setEnabled(boolean z) {
        Model.setBooleanProperty$default(this, "isEnabled", z, null, false, 12, null);
    }

    public final void setLogLevel(LogLevel logLevel) {
        setOptAnyProperty("logLevel", logLevel != null ? logLevel.toString() : null, ModelChangeTags.NORMAL, false);
    }
}
