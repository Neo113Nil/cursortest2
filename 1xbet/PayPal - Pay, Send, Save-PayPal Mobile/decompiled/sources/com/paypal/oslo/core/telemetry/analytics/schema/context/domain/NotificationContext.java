package com.paypal.oslo.core.telemetry.analytics.schema.context.domain;

@com.paypal.oslo.core.telemetry.analytics.annotations.ContextKey(key = "notification")
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ@\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0019\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001a\u0010\nR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0019\u0012\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001d\u0010\nR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0019\u0012\u0004\b \u0010\u001c\u001a\u0004\b\u001f\u0010\nR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u0019\u0012\u0004\b\"\u0010\u001c\u001a\u0004\b!\u0010\n"}, d2 = {"Lcom/paypal/oslo/core/telemetry/analytics/schema/context/domain/NotificationContext;", "Lcom/paypal/oslo/core/telemetry/analytics/context/AnalyticsContext;", "", "campaignId", "campaignName", "messageId", "messageName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/core/telemetry/analytics/schema/context/domain/NotificationContext;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCampaignId", "getCampaignId$annotations", "()V", "getCampaignName", "getCampaignName$annotations", "getMessageId", "getMessageId$annotations", "getMessageName", "getMessageName$annotations"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class NotificationContext extends com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext {
    public static final int $stable = 0;
    private final java.lang.String campaignId;
    private final java.lang.String campaignName;
    private final java.lang.String messageId;
    private final java.lang.String messageName;

    @com.paypal.oslo.core.telemetry.analytics.annotations.AttributeKey(key = "campaign_id")
    public static /* synthetic */ void getCampaignId$annotations() {
    }

    @com.paypal.oslo.core.telemetry.analytics.annotations.AttributeKey(key = "campaign_name")
    public static /* synthetic */ void getCampaignName$annotations() {
    }

    @com.paypal.oslo.core.telemetry.analytics.annotations.AttributeKey(key = com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER)
    public static /* synthetic */ void getMessageId$annotations() {
    }

    @com.paypal.oslo.core.telemetry.analytics.annotations.AttributeKey(key = "message_name")
    public static /* synthetic */ void getMessageName$annotations() {
    }

    public NotificationContext(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.campaignId = str;
        this.campaignName = str2;
        this.messageId = str3;
        this.messageName = str4;
    }

    public /* synthetic */ NotificationContext(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }

    public final java.lang.String getCampaignId() {
        return this.campaignId;
    }

    public final java.lang.String getCampaignName() {
        return this.campaignName;
    }

    public final java.lang.String getMessageId() {
        return this.messageId;
    }

    public final java.lang.String getMessageName() {
        return this.messageName;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.campaignId;
        java.lang.String str2 = this.campaignName;
        java.lang.String str3 = this.messageId;
        java.lang.String str4 = this.messageName;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NotificationContext(campaignId=");
        sb.append(str);
        sb.append(", campaignName=");
        sb.append(str2);
        sb.append(", messageId=");
        sb.append(str3);
        sb.append(", messageName=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.campaignId;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.campaignName;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.messageId;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.messageName;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.telemetry.analytics.schema.context.domain.NotificationContext)) {
            return false;
        }
        com.paypal.oslo.core.telemetry.analytics.schema.context.domain.NotificationContext notificationContext = (com.paypal.oslo.core.telemetry.analytics.schema.context.domain.NotificationContext) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.campaignId, notificationContext.campaignId) && kotlin.jvm.internal.Intrinsics.areEqual(this.campaignName, notificationContext.campaignName) && kotlin.jvm.internal.Intrinsics.areEqual(this.messageId, notificationContext.messageId) && kotlin.jvm.internal.Intrinsics.areEqual(this.messageName, notificationContext.messageName);
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.domain.NotificationContext copy(java.lang.String campaignId, java.lang.String campaignName, java.lang.String messageId, java.lang.String messageName) {
        return new com.paypal.oslo.core.telemetry.analytics.schema.context.domain.NotificationContext(campaignId, campaignName, messageId, messageName);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getMessageName() {
        return this.messageName;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getMessageId() {
        return this.messageId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCampaignName() {
        return this.campaignName;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCampaignId() {
        return this.campaignId;
    }

    public static /* synthetic */ com.paypal.oslo.core.telemetry.analytics.schema.context.domain.NotificationContext copy$default(com.paypal.oslo.core.telemetry.analytics.schema.context.domain.NotificationContext notificationContext, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = notificationContext.campaignId;
        }
        if ((i & 2) != 0) {
            str2 = notificationContext.campaignName;
        }
        if ((i & 4) != 0) {
            str3 = notificationContext.messageId;
        }
        if ((i & 8) != 0) {
            str4 = notificationContext.messageName;
        }
        return notificationContext.copy(str, str2, str3, str4);
    }

    public NotificationContext() {
        this(null, null, null, null, 15, null);
    }
}
