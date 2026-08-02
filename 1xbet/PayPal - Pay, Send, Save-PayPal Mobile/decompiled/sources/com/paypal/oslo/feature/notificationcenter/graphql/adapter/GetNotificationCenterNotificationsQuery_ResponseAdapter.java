package com.paypal.oslo.feature.notificationcenter.graphql.adapter;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/notificationcenter/graphql/adapter/GetNotificationCenterNotificationsQuery_ResponseAdapter;", "", "<init>", "()V", "Data", "Notifications", "Section", "Notification"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GetNotificationCenterNotificationsQuery_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.notificationcenter.graphql.adapter.GetNotificationCenterNotificationsQuery_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.notificationcenter.graphql.adapter.GetNotificationCenterNotificationsQuery_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/notificationcenter/graphql/adapter/GetNotificationCenterNotificationsQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/notificationcenter/graphql/GetNotificationCenterNotificationsQuery$Data;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/notificationcenter/graphql/GetNotificationCenterNotificationsQuery$Data;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/notificationcenter/graphql/GetNotificationCenterNotificationsQuery$Data;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Data implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Data> {
        public static final com.paypal.oslo.feature.notificationcenter.graphql.adapter.GetNotificationCenterNotificationsQuery_ResponseAdapter.Data INSTANCE = new com.paypal.oslo.feature.notificationcenter.graphql.adapter.GetNotificationCenterNotificationsQuery_ResponseAdapter.Data();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("notifications");
        public static final int $stable = 8;

        private Data() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Data fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Notifications notifications = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                notifications = (com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Notifications) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.notificationcenter.graphql.adapter.GetNotificationCenterNotificationsQuery_ResponseAdapter.Notifications.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
            }
            if (notifications != null) {
                return new com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Data(notifications);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "notifications");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Data value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("notifications");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.notificationcenter.graphql.adapter.GetNotificationCenterNotificationsQuery_ResponseAdapter.Notifications.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getNotifications());
        }
    }

    private GetNotificationCenterNotificationsQuery_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/notificationcenter/graphql/adapter/GetNotificationCenterNotificationsQuery_ResponseAdapter$Notifications;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/notificationcenter/graphql/GetNotificationCenterNotificationsQuery$Notifications;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/notificationcenter/graphql/GetNotificationCenterNotificationsQuery$Notifications;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/notificationcenter/graphql/GetNotificationCenterNotificationsQuery$Notifications;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Notifications implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Notifications> {
        public static final com.paypal.oslo.feature.notificationcenter.graphql.adapter.GetNotificationCenterNotificationsQuery_ResponseAdapter.Notifications INSTANCE = new com.paypal.oslo.feature.notificationcenter.graphql.adapter.GetNotificationCenterNotificationsQuery_ResponseAdapter.Notifications();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"sections", "notifications"});
        public static final int $stable = 8;

        private Notifications() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Notifications fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.util.List list = null;
            java.util.List list2 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    list = com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.notificationcenter.graphql.adapter.GetNotificationCenterNotificationsQuery_ResponseAdapter.Section.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    list2 = com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.notificationcenter.graphql.adapter.GetNotificationCenterNotificationsQuery_ResponseAdapter.Notification.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                }
            }
            if (list == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "sections");
                throw new kotlin.KotlinNothingValueException();
            }
            if (list2 != null) {
                return new com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Notifications(list, list2);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "notifications");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Notifications value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("sections");
            com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.notificationcenter.graphql.adapter.GetNotificationCenterNotificationsQuery_ResponseAdapter.Section.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, (java.util.List) value.getSections());
            writer.name("notifications");
            com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.notificationcenter.graphql.adapter.GetNotificationCenterNotificationsQuery_ResponseAdapter.Notification.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, (java.util.List) value.getNotifications());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/notificationcenter/graphql/adapter/GetNotificationCenterNotificationsQuery_ResponseAdapter$Section;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/notificationcenter/graphql/GetNotificationCenterNotificationsQuery$Section;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/notificationcenter/graphql/GetNotificationCenterNotificationsQuery$Section;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/notificationcenter/graphql/GetNotificationCenterNotificationsQuery$Section;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Section implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Section> {
        public static final com.paypal.oslo.feature.notificationcenter.graphql.adapter.GetNotificationCenterNotificationsQuery_ResponseAdapter.Section INSTANCE = new com.paypal.oslo.feature.notificationcenter.graphql.adapter.GetNotificationCenterNotificationsQuery_ResponseAdapter.Section();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"tag", "title"});
        public static final int $stable = 8;

        private Section() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Section fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.lang.String str2 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    str2 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "tag");
                throw new kotlin.KotlinNothingValueException();
            }
            if (str2 != null) {
                return new com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Section(str, str2);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "title");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Section value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("tag");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getTag());
            writer.name("title");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getTitle());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/notificationcenter/graphql/adapter/GetNotificationCenterNotificationsQuery_ResponseAdapter$Notification;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/notificationcenter/graphql/GetNotificationCenterNotificationsQuery$Notification;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/notificationcenter/graphql/GetNotificationCenterNotificationsQuery$Notification;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/notificationcenter/graphql/GetNotificationCenterNotificationsQuery$Notification;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Notification implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Notification> {
        public static final com.paypal.oslo.feature.notificationcenter.graphql.adapter.GetNotificationCenterNotificationsQuery_ResponseAdapter.Notification INSTANCE = new com.paypal.oslo.feature.notificationcenter.graphql.adapter.GetNotificationCenterNotificationsQuery_ResponseAdapter.Notification();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"sectionTag", "campaignId", "contentId", "notificationId", "name", "title", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "iconType", "iconIdentifier", "deepLink", "status", "createdTime", "trackingToken"});
        public static final int $stable = 8;

        private Notification() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
        
            if (r13 == null) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
        
            if (r14 == null) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
        
            if (r16 == null) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
        
            return new com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Notification(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16);
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x00bf, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r18, "trackingToken");
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x00c9, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x00ca, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r18, "status");
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x00d4, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x00d5, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r18, "deepLink");
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x00df, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00e0, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r18, com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY);
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00ea, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00eb, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r18, "title");
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00f5, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00f6, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r18, "name");
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0100, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0101, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r18, "contentId");
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x010b, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x010c, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r18, "sectionTag");
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0116, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0024, code lost:
        
            if (r4 == null) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
        
            if (r6 == null) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0028, code lost:
        
            if (r8 == null) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
        
            if (r9 == null) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
        
            if (r10 == null) goto L34;
         */
        @Override // com.apollographql.apollo.api.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Notification fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.lang.String str2 = null;
            java.lang.String str3 = null;
            java.lang.String str4 = null;
            java.lang.String str5 = null;
            java.lang.String str6 = null;
            java.lang.String str7 = null;
            com.paypal.oslo.api.graphql.schema.type.NotificationIconType notificationIconType = null;
            java.lang.String str8 = null;
            java.lang.Object obj = null;
            com.paypal.oslo.api.graphql.schema.type.NotificationStatus notificationStatus = null;
            java.lang.Object obj2 = null;
            java.lang.String str9 = null;
            while (true) {
                switch (reader.selectName(RESPONSE_NAMES)) {
                    case 0:
                        str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        str2 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        str3 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        str4 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        str5 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        str6 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        str7 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        notificationIconType = (com.paypal.oslo.api.graphql.schema.type.NotificationIconType) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.NotificationIconType_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        str8 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 9:
                        obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 10:
                        notificationStatus = com.paypal.oslo.api.graphql.schema.type.adapter.NotificationStatus_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                        break;
                    case 11:
                        obj2 = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 12:
                        str9 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Notification value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("sectionTag");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getSectionTag());
            writer.name("campaignId");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getCampaignId());
            writer.name("contentId");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getContentId());
            writer.name("notificationId");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getNotificationId());
            writer.name("name");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getName());
            writer.name("title");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getTitle());
            writer.name(com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY);
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getBody());
            writer.name("iconType");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.NotificationIconType_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getIconType());
            writer.name("iconIdentifier");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getIconIdentifier());
            writer.name("deepLink");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getDeepLink());
            writer.name("status");
            com.paypal.oslo.api.graphql.schema.type.adapter.NotificationStatus_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getStatus());
            writer.name("createdTime");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getCreatedTime());
            writer.name("trackingToken");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getTrackingToken());
        }
    }
}
