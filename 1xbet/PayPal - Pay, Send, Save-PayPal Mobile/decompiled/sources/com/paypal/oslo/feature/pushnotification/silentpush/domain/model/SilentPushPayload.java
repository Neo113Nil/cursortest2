package com.paypal.oslo.feature.pushnotification.silentpush.domain.model;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0080\b\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0011J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0011J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0011J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0011J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0011J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0011J\u001c\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\fHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u008e\u0001\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\fHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b)\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b*\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b+\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b,\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b-\u0010\u0011R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b.\u0010\u0011R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b/\u0010\u0011R&\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00100\u001a\u0004\b1\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/silentpush/domain/model/SilentPushPayload;", "", "", "targetModule", "eventType", "campaignId", "messageId", "messageName", "encryptedCustomerId", "minAppVersion", "unpTid", "sentTimestamp", "", "dataPayload", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/paypal/oslo/feature/pushnotification/silentpush/domain/model/SilentPushPayload;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTargetModule", "getEventType", "getCampaignId", "getMessageId", "getMessageName", "getEncryptedCustomerId", "getMinAppVersion", "getUnpTid", "getSentTimestamp", "Ljava/util/Map;", "getDataPayload"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SilentPushPayload {
    public static final int $stable = 8;
    private final java.lang.String campaignId;
    private final java.util.Map<java.lang.String, java.lang.String> dataPayload;
    private final java.lang.String encryptedCustomerId;
    private final java.lang.String eventType;
    private final java.lang.String messageId;
    private final java.lang.String messageName;
    private final java.lang.String minAppVersion;
    private final java.lang.String sentTimestamp;
    private final java.lang.String targetModule;
    private final java.lang.String unpTid;

    public SilentPushPayload(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.util.Map<java.lang.String, java.lang.String> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.targetModule = str;
        this.eventType = str2;
        this.campaignId = str3;
        this.messageId = str4;
        this.messageName = str5;
        this.encryptedCustomerId = str6;
        this.minAppVersion = str7;
        this.unpTid = str8;
        this.sentTimestamp = str9;
        this.dataPayload = map;
    }

    public final java.lang.String getTargetModule() {
        return this.targetModule;
    }

    public final java.lang.String getEventType() {
        return this.eventType;
    }

    public final java.lang.String getCampaignId() {
        return this.campaignId;
    }

    public final java.lang.String getMessageId() {
        return this.messageId;
    }

    public final java.lang.String getMessageName() {
        return this.messageName;
    }

    public final java.lang.String getEncryptedCustomerId() {
        return this.encryptedCustomerId;
    }

    public final java.lang.String getMinAppVersion() {
        return this.minAppVersion;
    }

    public final java.lang.String getUnpTid() {
        return this.unpTid;
    }

    public final java.lang.String getSentTimestamp() {
        return this.sentTimestamp;
    }

    public final java.util.Map<java.lang.String, java.lang.String> getDataPayload() {
        return this.dataPayload;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.targetModule;
        java.lang.String str2 = this.eventType;
        java.lang.String str3 = this.campaignId;
        java.lang.String str4 = this.messageId;
        java.lang.String str5 = this.messageName;
        java.lang.String str6 = this.encryptedCustomerId;
        java.lang.String str7 = this.minAppVersion;
        java.lang.String str8 = this.unpTid;
        java.lang.String str9 = this.sentTimestamp;
        java.util.Map<java.lang.String, java.lang.String> map = this.dataPayload;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SilentPushPayload(targetModule=");
        sb.append(str);
        sb.append(", eventType=");
        sb.append(str2);
        sb.append(", campaignId=");
        sb.append(str3);
        sb.append(", messageId=");
        sb.append(str4);
        sb.append(", messageName=");
        sb.append(str5);
        sb.append(", encryptedCustomerId=");
        sb.append(str6);
        sb.append(", minAppVersion=");
        sb.append(str7);
        sb.append(", unpTid=");
        sb.append(str8);
        sb.append(", sentTimestamp=");
        sb.append(str9);
        sb.append(", dataPayload=");
        sb.append(map);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.targetModule.hashCode();
        int hashCode2 = this.eventType.hashCode();
        java.lang.String str = this.campaignId;
        int hashCode3 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.messageId;
        int hashCode4 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.messageName;
        int hashCode5 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.encryptedCustomerId;
        int hashCode6 = str4 == null ? 0 : str4.hashCode();
        java.lang.String str5 = this.minAppVersion;
        int hashCode7 = str5 == null ? 0 : str5.hashCode();
        java.lang.String str6 = this.unpTid;
        int hashCode8 = str6 == null ? 0 : str6.hashCode();
        java.lang.String str7 = this.sentTimestamp;
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + (str7 != null ? str7.hashCode() : 0)) * 31) + this.dataPayload.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.pushnotification.silentpush.domain.model.SilentPushPayload)) {
            return false;
        }
        com.paypal.oslo.feature.pushnotification.silentpush.domain.model.SilentPushPayload silentPushPayload = (com.paypal.oslo.feature.pushnotification.silentpush.domain.model.SilentPushPayload) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.targetModule, silentPushPayload.targetModule) && kotlin.jvm.internal.Intrinsics.areEqual(this.eventType, silentPushPayload.eventType) && kotlin.jvm.internal.Intrinsics.areEqual(this.campaignId, silentPushPayload.campaignId) && kotlin.jvm.internal.Intrinsics.areEqual(this.messageId, silentPushPayload.messageId) && kotlin.jvm.internal.Intrinsics.areEqual(this.messageName, silentPushPayload.messageName) && kotlin.jvm.internal.Intrinsics.areEqual(this.encryptedCustomerId, silentPushPayload.encryptedCustomerId) && kotlin.jvm.internal.Intrinsics.areEqual(this.minAppVersion, silentPushPayload.minAppVersion) && kotlin.jvm.internal.Intrinsics.areEqual(this.unpTid, silentPushPayload.unpTid) && kotlin.jvm.internal.Intrinsics.areEqual(this.sentTimestamp, silentPushPayload.sentTimestamp) && kotlin.jvm.internal.Intrinsics.areEqual(this.dataPayload, silentPushPayload.dataPayload);
    }

    public final com.paypal.oslo.feature.pushnotification.silentpush.domain.model.SilentPushPayload copy(java.lang.String targetModule, java.lang.String eventType, java.lang.String campaignId, java.lang.String messageId, java.lang.String messageName, java.lang.String encryptedCustomerId, java.lang.String minAppVersion, java.lang.String unpTid, java.lang.String sentTimestamp, java.util.Map<java.lang.String, java.lang.String> dataPayload) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(targetModule, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataPayload, "");
        return new com.paypal.oslo.feature.pushnotification.silentpush.domain.model.SilentPushPayload(targetModule, eventType, campaignId, messageId, messageName, encryptedCustomerId, minAppVersion, unpTid, sentTimestamp, dataPayload);
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.String getSentTimestamp() {
        return this.sentTimestamp;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getUnpTid() {
        return this.unpTid;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getMinAppVersion() {
        return this.minAppVersion;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getEncryptedCustomerId() {
        return this.encryptedCustomerId;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getMessageName() {
        return this.messageName;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getMessageId() {
        return this.messageId;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getCampaignId() {
        return this.campaignId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getEventType() {
        return this.eventType;
    }

    public final java.util.Map<java.lang.String, java.lang.String> component10() {
        return this.dataPayload;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTargetModule() {
        return this.targetModule;
    }
}
