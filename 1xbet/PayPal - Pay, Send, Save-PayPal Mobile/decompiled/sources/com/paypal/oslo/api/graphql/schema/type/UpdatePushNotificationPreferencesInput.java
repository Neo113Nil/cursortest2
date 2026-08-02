package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/UpdatePushNotificationPreferencesInput;", "", "", "deviceId", "", "Lcom/paypal/oslo/api/graphql/schema/type/PushNotificationPreferenceInput;", "preferences", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/api/graphql/schema/type/UpdatePushNotificationPreferencesInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDeviceId", "Ljava/util/List;", "getPreferences"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UpdatePushNotificationPreferencesInput {
    private final java.lang.String deviceId;
    private final java.util.List<com.paypal.oslo.api.graphql.schema.type.PushNotificationPreferenceInput> preferences;

    public UpdatePushNotificationPreferencesInput(java.lang.String str, java.util.List<com.paypal.oslo.api.graphql.schema.type.PushNotificationPreferenceInput> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.deviceId = str;
        this.preferences = list;
    }

    public final java.lang.String getDeviceId() {
        return this.deviceId;
    }

    public final java.util.List<com.paypal.oslo.api.graphql.schema.type.PushNotificationPreferenceInput> getPreferences() {
        return this.preferences;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.deviceId;
        java.util.List<com.paypal.oslo.api.graphql.schema.type.PushNotificationPreferenceInput> list = this.preferences;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdatePushNotificationPreferencesInput(deviceId=");
        sb.append(str);
        sb.append(", preferences=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.deviceId.hashCode() * 31) + this.preferences.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.UpdatePushNotificationPreferencesInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.UpdatePushNotificationPreferencesInput updatePushNotificationPreferencesInput = (com.paypal.oslo.api.graphql.schema.type.UpdatePushNotificationPreferencesInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.deviceId, updatePushNotificationPreferencesInput.deviceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.preferences, updatePushNotificationPreferencesInput.preferences);
    }

    public final com.paypal.oslo.api.graphql.schema.type.UpdatePushNotificationPreferencesInput copy(java.lang.String deviceId, java.util.List<com.paypal.oslo.api.graphql.schema.type.PushNotificationPreferenceInput> preferences) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(preferences, "");
        return new com.paypal.oslo.api.graphql.schema.type.UpdatePushNotificationPreferencesInput(deviceId, preferences);
    }

    public final java.util.List<com.paypal.oslo.api.graphql.schema.type.PushNotificationPreferenceInput> component2() {
        return this.preferences;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getDeviceId() {
        return this.deviceId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.UpdatePushNotificationPreferencesInput copy$default(com.paypal.oslo.api.graphql.schema.type.UpdatePushNotificationPreferencesInput updatePushNotificationPreferencesInput, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = updatePushNotificationPreferencesInput.deviceId;
        }
        if ((i & 2) != 0) {
            list = updatePushNotificationPreferencesInput.preferences;
        }
        return updatePushNotificationPreferencesInput.copy(str, list);
    }
}
