package com.paypal.oslo.feature.pushnotification.preferences.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001e\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/preferences/domain/model/PushNotificationPreference;", "", "", "type", "", "status", "displayText", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "component4", "copy", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/pushnotification/preferences/domain/model/PushNotificationPreference;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getType", "Z", "getStatus", "getDisplayText", "getDescription"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PushNotificationPreference {
    public static final int $stable = 0;
    private final java.lang.String description;
    private final java.lang.String displayText;
    private final boolean status;
    private final java.lang.String type;

    public PushNotificationPreference(java.lang.String str, boolean z, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.type = str;
        this.status = z;
        this.displayText = str2;
        this.description = str3;
    }

    public final java.lang.String getType() {
        return this.type;
    }

    public final boolean getStatus() {
        return this.status;
    }

    public final java.lang.String getDisplayText() {
        return this.displayText;
    }

    public final java.lang.String getDescription() {
        return this.description;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.type;
        boolean z = this.status;
        java.lang.String str2 = this.displayText;
        java.lang.String str3 = this.description;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PushNotificationPreference(type=");
        sb.append(str);
        sb.append(", status=");
        sb.append(z);
        sb.append(", displayText=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.type.hashCode() * 31) + java.lang.Boolean.hashCode(this.status)) * 31) + this.displayText.hashCode()) * 31) + this.description.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.pushnotification.preferences.domain.model.PushNotificationPreference)) {
            return false;
        }
        com.paypal.oslo.feature.pushnotification.preferences.domain.model.PushNotificationPreference pushNotificationPreference = (com.paypal.oslo.feature.pushnotification.preferences.domain.model.PushNotificationPreference) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.type, pushNotificationPreference.type) && this.status == pushNotificationPreference.status && kotlin.jvm.internal.Intrinsics.areEqual(this.displayText, pushNotificationPreference.displayText) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, pushNotificationPreference.description);
    }

    public final com.paypal.oslo.feature.pushnotification.preferences.domain.model.PushNotificationPreference copy(java.lang.String type, boolean status, java.lang.String displayText, java.lang.String description) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayText, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
        return new com.paypal.oslo.feature.pushnotification.preferences.domain.model.PushNotificationPreference(type, status, displayText, description);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getDescription() {
        return this.description;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getDisplayText() {
        return this.displayText;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getStatus() {
        return this.status;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getType() {
        return this.type;
    }

    public static /* synthetic */ com.paypal.oslo.feature.pushnotification.preferences.domain.model.PushNotificationPreference copy$default(com.paypal.oslo.feature.pushnotification.preferences.domain.model.PushNotificationPreference pushNotificationPreference, java.lang.String str, boolean z, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = pushNotificationPreference.type;
        }
        if ((i & 2) != 0) {
            z = pushNotificationPreference.status;
        }
        if ((i & 4) != 0) {
            str2 = pushNotificationPreference.displayText;
        }
        if ((i & 8) != 0) {
            str3 = pushNotificationPreference.description;
        }
        return pushNotificationPreference.copy(str, z, str2, str3);
    }
}
