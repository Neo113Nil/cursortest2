package com.paypal.oslo.feature.pushnotification.delivery.domain.model;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJF\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b!\u0010\fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/OsloNotificationAction;", "", "", "id", "label", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/OsloActionType;", "type", "deeplink", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.ACTION_ID, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/OsloActionType;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/OsloActionType;", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/OsloActionType;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/OsloNotificationAction;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getLabel", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/OsloActionType;", "getType", "getDeeplink", "getActionId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class OsloNotificationAction {
    public static final int $stable = 0;
    private final java.lang.String actionId;
    private final java.lang.String deeplink;
    private final java.lang.String id;
    private final java.lang.String label;
    private final com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloActionType type;

    public OsloNotificationAction(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloActionType osloActionType, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(osloActionType, "");
        this.id = str;
        this.label = str2;
        this.type = osloActionType;
        this.deeplink = str3;
        this.actionId = str4;
    }

    public /* synthetic */ OsloNotificationAction(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloActionType osloActionType, java.lang.String str3, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, osloActionType, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getLabel() {
        return this.label;
    }

    public final com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloActionType getType() {
        return this.type;
    }

    public final java.lang.String getDeeplink() {
        return this.deeplink;
    }

    public final java.lang.String getActionId() {
        return this.actionId;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.label;
        com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloActionType osloActionType = this.type;
        java.lang.String str3 = this.deeplink;
        java.lang.String str4 = this.actionId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OsloNotificationAction(id=");
        sb.append(str);
        sb.append(", label=");
        sb.append(str2);
        sb.append(", type=");
        sb.append(osloActionType);
        sb.append(", deeplink=");
        sb.append(str3);
        sb.append(", actionId=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = this.label.hashCode();
        int hashCode3 = this.type.hashCode();
        java.lang.String str = this.deeplink;
        int hashCode4 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.actionId;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloNotificationAction)) {
            return false;
        }
        com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloNotificationAction osloNotificationAction = (com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloNotificationAction) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, osloNotificationAction.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.label, osloNotificationAction.label) && this.type == osloNotificationAction.type && kotlin.jvm.internal.Intrinsics.areEqual(this.deeplink, osloNotificationAction.deeplink) && kotlin.jvm.internal.Intrinsics.areEqual(this.actionId, osloNotificationAction.actionId);
    }

    public final com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloNotificationAction copy(java.lang.String id, java.lang.String label, com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloActionType type, java.lang.String deeplink, java.lang.String actionId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(label, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return new com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloNotificationAction(id, label, type, deeplink, actionId);
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getActionId() {
        return this.actionId;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getDeeplink() {
        return this.deeplink;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloActionType getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getLabel() {
        return this.label;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloNotificationAction copy$default(com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloNotificationAction osloNotificationAction, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloActionType osloActionType, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = osloNotificationAction.id;
        }
        if ((i & 2) != 0) {
            str2 = osloNotificationAction.label;
        }
        java.lang.String str5 = str2;
        if ((i & 4) != 0) {
            osloActionType = osloNotificationAction.type;
        }
        com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloActionType osloActionType2 = osloActionType;
        if ((i & 8) != 0) {
            str3 = osloNotificationAction.deeplink;
        }
        java.lang.String str6 = str3;
        if ((i & 16) != 0) {
            str4 = osloNotificationAction.actionId;
        }
        return osloNotificationAction.copy(str, str5, osloActionType2, str6, str4);
    }
}
