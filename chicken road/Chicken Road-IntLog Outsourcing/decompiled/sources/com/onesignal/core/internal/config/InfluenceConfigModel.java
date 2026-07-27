package com.onesignal.core.internal.config;

import com.onesignal.common.modeling.Model;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class InfluenceConfigModel extends Model {
    public static final Companion Companion = new Companion(null);
    public static final int DEFAULT_INDIRECT_ATTRIBUTION_WINDOW = 1440;
    public static final int DEFAULT_NOTIFICATION_LIMIT = 10;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfluenceConfigModel(Model parentModel, String parentProperty) {
        super(parentModel, parentProperty);
        i.e(parentModel, "parentModel");
        i.e(parentProperty, "parentProperty");
    }

    public final int getIamLimit() {
        return getIntProperty("iamLimit", InfluenceConfigModel$iamLimit$1.INSTANCE);
    }

    public final int getIndirectIAMAttributionWindow() {
        return getIntProperty("indirectIAMAttributionWindow", InfluenceConfigModel$indirectIAMAttributionWindow$1.INSTANCE);
    }

    public final int getIndirectNotificationAttributionWindow() {
        return getIntProperty("indirectNotificationAttributionWindow", InfluenceConfigModel$indirectNotificationAttributionWindow$1.INSTANCE);
    }

    public final int getNotificationLimit() {
        return getIntProperty("notificationLimit", InfluenceConfigModel$notificationLimit$1.INSTANCE);
    }

    public final boolean isDirectEnabled() {
        return getBooleanProperty("isDirectEnabled", InfluenceConfigModel$isDirectEnabled$1.INSTANCE);
    }

    public final boolean isIndirectEnabled() {
        return getBooleanProperty("isIndirectEnabled", InfluenceConfigModel$isIndirectEnabled$1.INSTANCE);
    }

    public final boolean isUnattributedEnabled() {
        return getBooleanProperty("isUnattributedEnabled", InfluenceConfigModel$isUnattributedEnabled$1.INSTANCE);
    }

    public final void setDirectEnabled(boolean z) {
        Model.setBooleanProperty$default(this, "isDirectEnabled", z, null, false, 12, null);
    }

    public final void setIamLimit(int i2) {
        Model.setIntProperty$default(this, "iamLimit", i2, null, false, 12, null);
    }

    public final void setIndirectEnabled(boolean z) {
        Model.setBooleanProperty$default(this, "isIndirectEnabled", z, null, false, 12, null);
    }

    public final void setIndirectIAMAttributionWindow(int i2) {
        Model.setIntProperty$default(this, "indirectIAMAttributionWindow", i2, null, false, 12, null);
    }

    public final void setIndirectNotificationAttributionWindow(int i2) {
        Model.setIntProperty$default(this, "indirectNotificationAttributionWindow", i2, null, false, 12, null);
    }

    public final void setNotificationLimit(int i2) {
        Model.setIntProperty$default(this, "notificationLimit", i2, null, false, 12, null);
    }

    public final void setUnattributedEnabled(boolean z) {
        Model.setBooleanProperty$default(this, "isUnattributedEnabled", z, null, false, 12, null);
    }
}
