package com.paypal.oslo.feature.notificationcenter.graphql;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003!\" B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/notificationcenter/graphql/GetCriticalAlertsQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/notificationcenter/graphql/GetCriticalAlertsQuery$Data;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "Companion", "Data", "CriticalAlert"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GetCriticalAlertsQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.notificationcenter.graphql.GetCriticalAlertsQuery.Data> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.notificationcenter.graphql.GetCriticalAlertsQuery.Companion INSTANCE = new com.paypal.oslo.feature.notificationcenter.graphql.GetCriticalAlertsQuery.Companion(null);
    public static final java.lang.String OPERATION_ID = "86ee55ca0a8312eb0c21ec4a04d9f3dea95ef4c3b7c29fe6ff1733d6404eaf95";
    public static final java.lang.String OPERATION_NAME = "GetCriticalAlerts";

    public final boolean equals(java.lang.Object other) {
        return other != null && other.getClass() == getClass();
    }

    public final int hashCode() {
        return kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(getClass()).hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final java.lang.String id() {
        return OPERATION_ID;
    }

    @Override // com.apollographql.apollo.api.Operation
    public final java.lang.String document() {
        return INSTANCE.getOPERATION_DOCUMENT();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final java.lang.String name() {
        return OPERATION_NAME;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.notificationcenter.graphql.GetCriticalAlertsQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.notificationcenter.graphql.adapter.GetCriticalAlertsQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.notificationcenter.graphql.selections.GetCriticalAlertsQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/notificationcenter/graphql/GetCriticalAlertsQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "", "Lcom/paypal/oslo/feature/notificationcenter/graphql/GetCriticalAlertsQuery$CriticalAlert;", "criticalAlerts", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/notificationcenter/graphql/GetCriticalAlertsQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getCriticalAlerts"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.notificationcenter.graphql.GetCriticalAlertsQuery.CriticalAlert> criticalAlerts;

        public Data(java.util.List<com.paypal.oslo.feature.notificationcenter.graphql.GetCriticalAlertsQuery.CriticalAlert> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.criticalAlerts = list;
        }

        public final java.util.List<com.paypal.oslo.feature.notificationcenter.graphql.GetCriticalAlertsQuery.CriticalAlert> getCriticalAlerts() {
            return this.criticalAlerts;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.notificationcenter.graphql.GetCriticalAlertsQuery.CriticalAlert> list = this.criticalAlerts;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(criticalAlerts=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.criticalAlerts.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.notificationcenter.graphql.GetCriticalAlertsQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.criticalAlerts, ((com.paypal.oslo.feature.notificationcenter.graphql.GetCriticalAlertsQuery.Data) other).criticalAlerts);
        }

        public final com.paypal.oslo.feature.notificationcenter.graphql.GetCriticalAlertsQuery.Data copy(java.util.List<com.paypal.oslo.feature.notificationcenter.graphql.GetCriticalAlertsQuery.CriticalAlert> criticalAlerts) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(criticalAlerts, "");
            return new com.paypal.oslo.feature.notificationcenter.graphql.GetCriticalAlertsQuery.Data(criticalAlerts);
        }

        public final java.util.List<com.paypal.oslo.feature.notificationcenter.graphql.GetCriticalAlertsQuery.CriticalAlert> component1() {
            return this.criticalAlerts;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.notificationcenter.graphql.GetCriticalAlertsQuery.Data copy$default(com.paypal.oslo.feature.notificationcenter.graphql.GetCriticalAlertsQuery.Data data, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = data.criticalAlerts;
            }
            return data.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0001\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0010\u0010\u0012\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\rJ\\\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\rR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b!\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b\"\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b#\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b$\u0010\rR\u001a\u0010\b\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b'\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/notificationcenter/graphql/GetCriticalAlertsQuery$CriticalAlert;", "", "", "notificationId", "campaignId", "contentId", "title", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "deepLink", "trackingToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Ljava/lang/Object;", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/notificationcenter/graphql/GetCriticalAlertsQuery$CriticalAlert;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getNotificationId", "getCampaignId", "getContentId", "getTitle", "getBody", "Ljava/lang/Object;", "getDeepLink", "getTrackingToken"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CriticalAlert {
        public static final int $stable = 8;
        private final java.lang.String body;
        private final java.lang.String campaignId;
        private final java.lang.String contentId;
        private final java.lang.Object deepLink;
        private final java.lang.String notificationId;
        private final java.lang.String title;
        private final java.lang.String trackingToken;

        public CriticalAlert(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Object obj, java.lang.String str6) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            this.notificationId = str;
            this.campaignId = str2;
            this.contentId = str3;
            this.title = str4;
            this.body = str5;
            this.deepLink = obj;
            this.trackingToken = str6;
        }

        public final java.lang.String getNotificationId() {
            return this.notificationId;
        }

        public final java.lang.String getCampaignId() {
            return this.campaignId;
        }

        public final java.lang.String getContentId() {
            return this.contentId;
        }

        public final java.lang.String getTitle() {
            return this.title;
        }

        public final java.lang.String getBody() {
            return this.body;
        }

        public final java.lang.Object getDeepLink() {
            return this.deepLink;
        }

        public final java.lang.String getTrackingToken() {
            return this.trackingToken;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.notificationId;
            java.lang.String str2 = this.campaignId;
            java.lang.String str3 = this.contentId;
            java.lang.String str4 = this.title;
            java.lang.String str5 = this.body;
            java.lang.Object obj = this.deepLink;
            java.lang.String str6 = this.trackingToken;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CriticalAlert(notificationId=");
            sb.append(str);
            sb.append(", campaignId=");
            sb.append(str2);
            sb.append(", contentId=");
            sb.append(str3);
            sb.append(", title=");
            sb.append(str4);
            sb.append(", body=");
            sb.append(str5);
            sb.append(", deepLink=");
            sb.append(obj);
            sb.append(", trackingToken=");
            sb.append(str6);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.notificationId;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.campaignId;
            int hashCode2 = str2 == null ? 0 : str2.hashCode();
            int hashCode3 = this.contentId.hashCode();
            int hashCode4 = this.title.hashCode();
            int hashCode5 = this.body.hashCode();
            int hashCode6 = this.deepLink.hashCode();
            java.lang.String str3 = this.trackingToken;
            return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.notificationcenter.graphql.GetCriticalAlertsQuery.CriticalAlert)) {
                return false;
            }
            com.paypal.oslo.feature.notificationcenter.graphql.GetCriticalAlertsQuery.CriticalAlert criticalAlert = (com.paypal.oslo.feature.notificationcenter.graphql.GetCriticalAlertsQuery.CriticalAlert) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.notificationId, criticalAlert.notificationId) && kotlin.jvm.internal.Intrinsics.areEqual(this.campaignId, criticalAlert.campaignId) && kotlin.jvm.internal.Intrinsics.areEqual(this.contentId, criticalAlert.contentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.title, criticalAlert.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.body, criticalAlert.body) && kotlin.jvm.internal.Intrinsics.areEqual(this.deepLink, criticalAlert.deepLink) && kotlin.jvm.internal.Intrinsics.areEqual(this.trackingToken, criticalAlert.trackingToken);
        }

        public final com.paypal.oslo.feature.notificationcenter.graphql.GetCriticalAlertsQuery.CriticalAlert copy(java.lang.String notificationId, java.lang.String campaignId, java.lang.String contentId, java.lang.String title, java.lang.String body, java.lang.Object deepLink, java.lang.String trackingToken) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deepLink, "");
            return new com.paypal.oslo.feature.notificationcenter.graphql.GetCriticalAlertsQuery.CriticalAlert(notificationId, campaignId, contentId, title, body, deepLink, trackingToken);
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.String getTrackingToken() {
            return this.trackingToken;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.Object getDeepLink() {
            return this.deepLink;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getBody() {
            return this.body;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getContentId() {
            return this.contentId;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCampaignId() {
            return this.campaignId;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getNotificationId() {
            return this.notificationId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.notificationcenter.graphql.GetCriticalAlertsQuery.CriticalAlert copy$default(com.paypal.oslo.feature.notificationcenter.graphql.GetCriticalAlertsQuery.CriticalAlert criticalAlert, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Object obj, java.lang.String str6, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = criticalAlert.notificationId;
            }
            if ((i & 2) != 0) {
                str2 = criticalAlert.campaignId;
            }
            java.lang.String str7 = str2;
            if ((i & 4) != 0) {
                str3 = criticalAlert.contentId;
            }
            java.lang.String str8 = str3;
            if ((i & 8) != 0) {
                str4 = criticalAlert.title;
            }
            java.lang.String str9 = str4;
            if ((i & 16) != 0) {
                str5 = criticalAlert.body;
            }
            java.lang.String str10 = str5;
            if ((i & 32) != 0) {
                obj = criticalAlert.deepLink;
            }
            java.lang.Object obj3 = obj;
            if ((i & 64) != 0) {
                str6 = criticalAlert.trackingToken;
            }
            return criticalAlert.copy(str, str7, str8, str9, str10, obj3, str6);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/notificationcenter/graphql/GetCriticalAlertsQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetCriticalAlerts { criticalAlerts { notificationId campaignId contentId title body deepLink trackingToken } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, boolean withDefaultValues) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
    }
}
