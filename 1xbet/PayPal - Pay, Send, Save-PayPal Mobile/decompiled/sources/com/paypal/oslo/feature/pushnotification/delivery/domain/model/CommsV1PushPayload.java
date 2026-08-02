package com.paypal.oslo.feature.pushnotification.delivery.domain.model;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010$\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0019\b\u0080\b\u0018\u00002\u00020\u0001BÏ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001bJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001bJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001bJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001bJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001bJ\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001bJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001bJ\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u001bJ\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\u001bJ\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010\u001bJ\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010\u001bJ\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010\u001bJ\u001c\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0016HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0080\u0002\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0016HÆ\u0001¢\u0006\u0004\b0\u00101J\u001a\u00105\u001a\u0002042\b\u00103\u001a\u0004\u0018\u000102HÖ\u0003¢\u0006\u0004\b5\u00106J\u0010\u00108\u001a\u000207HÖ\u0001¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b:\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010;\u001a\u0004\b<\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010;\u001a\u0004\b=\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010;\u001a\u0004\b>\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010;\u001a\u0004\b?\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010;\u001a\u0004\b@\u0010\u001bR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010;\u001a\u0004\bA\u0010\u001bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010;\u001a\u0004\bB\u0010\u001bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010;\u001a\u0004\bC\u0010\u001bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010;\u001a\u0004\bD\u0010\u001bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010;\u001a\u0004\bE\u0010\u001bR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010;\u001a\u0004\bF\u0010\u001bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010;\u001a\u0004\bG\u0010\u001bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010;\u001a\u0004\bH\u0010\u001bR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010;\u001a\u0004\bI\u0010\u001bR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010;\u001a\u0004\bJ\u0010\u001bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010;\u001a\u0004\bK\u0010\u001bR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010;\u001a\u0004\bL\u0010\u001bR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010;\u001a\u0004\bM\u0010\u001bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010;\u001a\u0004\bN\u0010\u001bR&\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010O\u001a\u0004\bP\u0010/"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/CommsV1PushPayload;", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/ValidatedPayload;", "", "title", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "eventType", "encryptedCustomerId", "messageId", "campaignId", "unpTid", "templateVersion", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CONTACT_ID, "useCase", "customerId", "paypalRequestId", "nnAndroid", "nnPayloadAndroid", "mediaUrl", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ACTIONS_KEY, "customView", "minAppVersion", "osloDeeplink", "", "metadata", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/CommsV1PushPayload;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTitle", "getBody", "getEventType", "getEncryptedCustomerId", "getMessageId", "getCampaignId", "getUnpTid", "getTemplateVersion", "getContactId", "getUseCase", "getCustomerId", "getPaypalRequestId", "getNnAndroid", "getNnPayloadAndroid", "getMediaUrl", "getActions", "getCustomView", "getMinAppVersion", "getOsloDeeplink", "Ljava/util/Map;", "getMetadata"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CommsV1PushPayload implements com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidatedPayload {
    public static final int $stable = 8;
    private final java.lang.String actions;
    private final java.lang.String body;
    private final java.lang.String campaignId;
    private final java.lang.String contactId;
    private final java.lang.String customView;
    private final java.lang.String customerId;
    private final java.lang.String encryptedCustomerId;
    private final java.lang.String eventType;
    private final java.lang.String mediaUrl;
    private final java.lang.String messageId;
    private final java.util.Map<java.lang.String, java.lang.String> metadata;
    private final java.lang.String minAppVersion;
    private final java.lang.String nnAndroid;
    private final java.lang.String nnPayloadAndroid;
    private final java.lang.String osloDeeplink;
    private final java.lang.String paypalRequestId;
    private final java.lang.String templateVersion;
    private final java.lang.String title;
    private final java.lang.String unpTid;
    private final java.lang.String useCase;

    public CommsV1PushPayload(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, java.lang.String str14, java.lang.String str15, java.lang.String str16, java.lang.String str17, java.lang.String str18, java.lang.String str19, java.util.Map<java.lang.String, java.lang.String> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.title = str;
        this.body = str2;
        this.eventType = str3;
        this.encryptedCustomerId = str4;
        this.messageId = str5;
        this.campaignId = str6;
        this.unpTid = str7;
        this.templateVersion = str8;
        this.contactId = str9;
        this.useCase = str10;
        this.customerId = str11;
        this.paypalRequestId = str12;
        this.nnAndroid = str13;
        this.nnPayloadAndroid = str14;
        this.mediaUrl = str15;
        this.actions = str16;
        this.customView = str17;
        this.minAppVersion = str18;
        this.osloDeeplink = str19;
        this.metadata = map;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final java.lang.String getBody() {
        return this.body;
    }

    public final java.lang.String getEventType() {
        return this.eventType;
    }

    public final java.lang.String getEncryptedCustomerId() {
        return this.encryptedCustomerId;
    }

    public final java.lang.String getMessageId() {
        return this.messageId;
    }

    public final java.lang.String getCampaignId() {
        return this.campaignId;
    }

    public final java.lang.String getUnpTid() {
        return this.unpTid;
    }

    public final java.lang.String getTemplateVersion() {
        return this.templateVersion;
    }

    public final java.lang.String getContactId() {
        return this.contactId;
    }

    public final java.lang.String getUseCase() {
        return this.useCase;
    }

    public final java.lang.String getCustomerId() {
        return this.customerId;
    }

    public final java.lang.String getPaypalRequestId() {
        return this.paypalRequestId;
    }

    public final java.lang.String getNnAndroid() {
        return this.nnAndroid;
    }

    public final java.lang.String getNnPayloadAndroid() {
        return this.nnPayloadAndroid;
    }

    public final java.lang.String getMediaUrl() {
        return this.mediaUrl;
    }

    public final java.lang.String getActions() {
        return this.actions;
    }

    public final java.lang.String getCustomView() {
        return this.customView;
    }

    public final java.lang.String getMinAppVersion() {
        return this.minAppVersion;
    }

    public final java.lang.String getOsloDeeplink() {
        return this.osloDeeplink;
    }

    public final java.util.Map<java.lang.String, java.lang.String> getMetadata() {
        return this.metadata;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.title;
        java.lang.String str2 = this.body;
        java.lang.String str3 = this.eventType;
        java.lang.String str4 = this.encryptedCustomerId;
        java.lang.String str5 = this.messageId;
        java.lang.String str6 = this.campaignId;
        java.lang.String str7 = this.unpTid;
        java.lang.String str8 = this.templateVersion;
        java.lang.String str9 = this.contactId;
        java.lang.String str10 = this.useCase;
        java.lang.String str11 = this.customerId;
        java.lang.String str12 = this.paypalRequestId;
        java.lang.String str13 = this.nnAndroid;
        java.lang.String str14 = this.nnPayloadAndroid;
        java.lang.String str15 = this.mediaUrl;
        java.lang.String str16 = this.actions;
        java.lang.String str17 = this.customView;
        java.lang.String str18 = this.minAppVersion;
        java.lang.String str19 = this.osloDeeplink;
        java.util.Map<java.lang.String, java.lang.String> map = this.metadata;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CommsV1PushPayload(title=");
        sb.append(str);
        sb.append(", body=");
        sb.append(str2);
        sb.append(", eventType=");
        sb.append(str3);
        sb.append(", encryptedCustomerId=");
        sb.append(str4);
        sb.append(", messageId=");
        sb.append(str5);
        sb.append(", campaignId=");
        sb.append(str6);
        sb.append(", unpTid=");
        sb.append(str7);
        sb.append(", templateVersion=");
        sb.append(str8);
        sb.append(", contactId=");
        sb.append(str9);
        sb.append(", useCase=");
        sb.append(str10);
        sb.append(", customerId=");
        sb.append(str11);
        sb.append(", paypalRequestId=");
        sb.append(str12);
        sb.append(", nnAndroid=");
        sb.append(str13);
        sb.append(", nnPayloadAndroid=");
        sb.append(str14);
        sb.append(", mediaUrl=");
        sb.append(str15);
        sb.append(", actions=");
        sb.append(str16);
        sb.append(", customView=");
        sb.append(str17);
        sb.append(", minAppVersion=");
        sb.append(str18);
        sb.append(", osloDeeplink=");
        sb.append(str19);
        sb.append(", metadata=");
        sb.append(map);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode();
        int hashCode2 = this.body.hashCode();
        int hashCode3 = this.eventType.hashCode();
        int hashCode4 = this.encryptedCustomerId.hashCode();
        int hashCode5 = this.messageId.hashCode();
        java.lang.String str = this.campaignId;
        int hashCode6 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.unpTid;
        int hashCode7 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.templateVersion;
        int hashCode8 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.contactId;
        int hashCode9 = str4 == null ? 0 : str4.hashCode();
        java.lang.String str5 = this.useCase;
        int hashCode10 = str5 == null ? 0 : str5.hashCode();
        java.lang.String str6 = this.customerId;
        int hashCode11 = str6 == null ? 0 : str6.hashCode();
        java.lang.String str7 = this.paypalRequestId;
        int hashCode12 = str7 == null ? 0 : str7.hashCode();
        java.lang.String str8 = this.nnAndroid;
        int hashCode13 = str8 == null ? 0 : str8.hashCode();
        java.lang.String str9 = this.nnPayloadAndroid;
        int hashCode14 = str9 == null ? 0 : str9.hashCode();
        java.lang.String str10 = this.mediaUrl;
        int hashCode15 = str10 == null ? 0 : str10.hashCode();
        java.lang.String str11 = this.actions;
        int hashCode16 = str11 == null ? 0 : str11.hashCode();
        java.lang.String str12 = this.customView;
        int hashCode17 = str12 == null ? 0 : str12.hashCode();
        java.lang.String str13 = this.minAppVersion;
        int hashCode18 = str13 == null ? 0 : str13.hashCode();
        java.lang.String str14 = this.osloDeeplink;
        return (((((((((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + hashCode16) * 31) + hashCode17) * 31) + hashCode18) * 31) + (str14 != null ? str14.hashCode() : 0)) * 31) + this.metadata.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.pushnotification.delivery.domain.model.CommsV1PushPayload)) {
            return false;
        }
        com.paypal.oslo.feature.pushnotification.delivery.domain.model.CommsV1PushPayload commsV1PushPayload = (com.paypal.oslo.feature.pushnotification.delivery.domain.model.CommsV1PushPayload) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.title, commsV1PushPayload.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.body, commsV1PushPayload.body) && kotlin.jvm.internal.Intrinsics.areEqual(this.eventType, commsV1PushPayload.eventType) && kotlin.jvm.internal.Intrinsics.areEqual(this.encryptedCustomerId, commsV1PushPayload.encryptedCustomerId) && kotlin.jvm.internal.Intrinsics.areEqual(this.messageId, commsV1PushPayload.messageId) && kotlin.jvm.internal.Intrinsics.areEqual(this.campaignId, commsV1PushPayload.campaignId) && kotlin.jvm.internal.Intrinsics.areEqual(this.unpTid, commsV1PushPayload.unpTid) && kotlin.jvm.internal.Intrinsics.areEqual(this.templateVersion, commsV1PushPayload.templateVersion) && kotlin.jvm.internal.Intrinsics.areEqual(this.contactId, commsV1PushPayload.contactId) && kotlin.jvm.internal.Intrinsics.areEqual(this.useCase, commsV1PushPayload.useCase) && kotlin.jvm.internal.Intrinsics.areEqual(this.customerId, commsV1PushPayload.customerId) && kotlin.jvm.internal.Intrinsics.areEqual(this.paypalRequestId, commsV1PushPayload.paypalRequestId) && kotlin.jvm.internal.Intrinsics.areEqual(this.nnAndroid, commsV1PushPayload.nnAndroid) && kotlin.jvm.internal.Intrinsics.areEqual(this.nnPayloadAndroid, commsV1PushPayload.nnPayloadAndroid) && kotlin.jvm.internal.Intrinsics.areEqual(this.mediaUrl, commsV1PushPayload.mediaUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.actions, commsV1PushPayload.actions) && kotlin.jvm.internal.Intrinsics.areEqual(this.customView, commsV1PushPayload.customView) && kotlin.jvm.internal.Intrinsics.areEqual(this.minAppVersion, commsV1PushPayload.minAppVersion) && kotlin.jvm.internal.Intrinsics.areEqual(this.osloDeeplink, commsV1PushPayload.osloDeeplink) && kotlin.jvm.internal.Intrinsics.areEqual(this.metadata, commsV1PushPayload.metadata);
    }

    public final com.paypal.oslo.feature.pushnotification.delivery.domain.model.CommsV1PushPayload copy(java.lang.String title, java.lang.String body, java.lang.String eventType, java.lang.String encryptedCustomerId, java.lang.String messageId, java.lang.String campaignId, java.lang.String unpTid, java.lang.String templateVersion, java.lang.String contactId, java.lang.String useCase, java.lang.String customerId, java.lang.String paypalRequestId, java.lang.String nnAndroid, java.lang.String nnPayloadAndroid, java.lang.String mediaUrl, java.lang.String actions, java.lang.String customView, java.lang.String minAppVersion, java.lang.String osloDeeplink, java.util.Map<java.lang.String, java.lang.String> metadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encryptedCustomerId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metadata, "");
        return new com.paypal.oslo.feature.pushnotification.delivery.domain.model.CommsV1PushPayload(title, body, eventType, encryptedCustomerId, messageId, campaignId, unpTid, templateVersion, contactId, useCase, customerId, paypalRequestId, nnAndroid, nnPayloadAndroid, mediaUrl, actions, customView, minAppVersion, osloDeeplink, metadata);
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.String getContactId() {
        return this.contactId;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getTemplateVersion() {
        return this.templateVersion;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getUnpTid() {
        return this.unpTid;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getCampaignId() {
        return this.campaignId;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getMessageId() {
        return this.messageId;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getEncryptedCustomerId() {
        return this.encryptedCustomerId;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getEventType() {
        return this.eventType;
    }

    public final java.util.Map<java.lang.String, java.lang.String> component20() {
        return this.metadata;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getBody() {
        return this.body;
    }

    /* renamed from: component19, reason: from getter */
    public final java.lang.String getOsloDeeplink() {
        return this.osloDeeplink;
    }

    /* renamed from: component18, reason: from getter */
    public final java.lang.String getMinAppVersion() {
        return this.minAppVersion;
    }

    /* renamed from: component17, reason: from getter */
    public final java.lang.String getCustomView() {
        return this.customView;
    }

    /* renamed from: component16, reason: from getter */
    public final java.lang.String getActions() {
        return this.actions;
    }

    /* renamed from: component15, reason: from getter */
    public final java.lang.String getMediaUrl() {
        return this.mediaUrl;
    }

    /* renamed from: component14, reason: from getter */
    public final java.lang.String getNnPayloadAndroid() {
        return this.nnPayloadAndroid;
    }

    /* renamed from: component13, reason: from getter */
    public final java.lang.String getNnAndroid() {
        return this.nnAndroid;
    }

    /* renamed from: component12, reason: from getter */
    public final java.lang.String getPaypalRequestId() {
        return this.paypalRequestId;
    }

    /* renamed from: component11, reason: from getter */
    public final java.lang.String getCustomerId() {
        return this.customerId;
    }

    /* renamed from: component10, reason: from getter */
    public final java.lang.String getUseCase() {
        return this.useCase;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }
}
