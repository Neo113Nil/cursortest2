package com.paypal.oslo.feature.notificationcenter.graphql;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005!\"#$ B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/notificationcenter/graphql/GetNotificationCenterNotificationsQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/notificationcenter/graphql/GetNotificationCenterNotificationsQuery$Data;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "Companion", "Data", "Notifications", "Section", "Notification"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GetNotificationCenterNotificationsQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Data> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Companion INSTANCE = new com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Companion(null);
    public static final java.lang.String OPERATION_ID = "5c734fc354b85a2279dec7e31a72ae8aefae18c9ce550e6a0233e92a1c233c7d";
    public static final java.lang.String OPERATION_NAME = "GetNotificationCenterNotifications";

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
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.notificationcenter.graphql.adapter.GetNotificationCenterNotificationsQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.notificationcenter.graphql.selections.GetNotificationCenterNotificationsQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/notificationcenter/graphql/GetNotificationCenterNotificationsQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/notificationcenter/graphql/GetNotificationCenterNotificationsQuery$Notifications;", "notifications", "<init>", "(Lcom/paypal/oslo/feature/notificationcenter/graphql/GetNotificationCenterNotificationsQuery$Notifications;)V", "component1", "()Lcom/paypal/oslo/feature/notificationcenter/graphql/GetNotificationCenterNotificationsQuery$Notifications;", "copy", "(Lcom/paypal/oslo/feature/notificationcenter/graphql/GetNotificationCenterNotificationsQuery$Notifications;)Lcom/paypal/oslo/feature/notificationcenter/graphql/GetNotificationCenterNotificationsQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/notificationcenter/graphql/GetNotificationCenterNotificationsQuery$Notifications;", "getNotifications"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Notifications notifications;

        public Data(com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Notifications notifications) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notifications, "");
            this.notifications = notifications;
        }

        public final com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Notifications getNotifications() {
            return this.notifications;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Notifications notifications = this.notifications;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(notifications=");
            sb.append(notifications);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.notifications.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.notifications, ((com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Data) other).notifications);
        }

        public final com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Data copy(com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Notifications notifications) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notifications, "");
            return new com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Data(notifications);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Notifications getNotifications() {
            return this.notifications;
        }

        public static /* synthetic */ com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Data copy$default(com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Data data, com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Notifications notifications, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                notifications = data.notifications;
            }
            return data.copy(notifications);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ0\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001a\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/notificationcenter/graphql/GetNotificationCenterNotificationsQuery$Notifications;", "", "", "Lcom/paypal/oslo/feature/notificationcenter/graphql/GetNotificationCenterNotificationsQuery$Section;", "sections", "Lcom/paypal/oslo/feature/notificationcenter/graphql/GetNotificationCenterNotificationsQuery$Notification;", "notifications", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Lcom/paypal/oslo/feature/notificationcenter/graphql/GetNotificationCenterNotificationsQuery$Notifications;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getSections", "getNotifications"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Notifications {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Notification> notifications;
        private final java.util.List<com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Section> sections;

        public Notifications(java.util.List<com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Section> list, java.util.List<com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Notification> list2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            this.sections = list;
            this.notifications = list2;
        }

        public final java.util.List<com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Section> getSections() {
            return this.sections;
        }

        public final java.util.List<com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Notification> getNotifications() {
            return this.notifications;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Section> list = this.sections;
            java.util.List<com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Notification> list2 = this.notifications;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Notifications(sections=");
            sb.append(list);
            sb.append(", notifications=");
            sb.append(list2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.sections.hashCode() * 31) + this.notifications.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Notifications)) {
                return false;
            }
            com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Notifications notifications = (com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Notifications) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.sections, notifications.sections) && kotlin.jvm.internal.Intrinsics.areEqual(this.notifications, notifications.notifications);
        }

        public final com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Notifications copy(java.util.List<com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Section> sections, java.util.List<com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Notification> notifications) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sections, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notifications, "");
            return new com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Notifications(sections, notifications);
        }

        public final java.util.List<com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Notification> component2() {
            return this.notifications;
        }

        public final java.util.List<com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Section> component1() {
            return this.sections;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Notifications copy$default(com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Notifications notifications, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = notifications.sections;
            }
            if ((i & 2) != 0) {
                list2 = notifications.notifications;
            }
            return notifications.copy(list, list2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/notificationcenter/graphql/GetNotificationCenterNotificationsQuery$Section;", "", "", "tag", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/notificationcenter/graphql/GetNotificationCenterNotificationsQuery$Section;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTag", "getTitle"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Section {
        public static final int $stable = 0;
        private final java.lang.String tag;
        private final java.lang.String title;

        public Section(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.tag = str;
            this.title = str2;
        }

        public final java.lang.String getTag() {
            return this.tag;
        }

        public final java.lang.String getTitle() {
            return this.title;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.tag;
            java.lang.String str2 = this.title;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Section(tag=");
            sb.append(str);
            sb.append(", title=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.tag.hashCode() * 31) + this.title.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Section)) {
                return false;
            }
            com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Section section = (com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Section) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.tag, section.tag) && kotlin.jvm.internal.Intrinsics.areEqual(this.title, section.title);
        }

        public final com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Section copy(java.lang.String tag, java.lang.String title) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
            return new com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Section(tag, title);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getTitle() {
            return this.title;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getTag() {
            return this.tag;
        }

        public static /* synthetic */ com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Section copy$default(com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Section section, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = section.tag;
            }
            if ((i & 2) != 0) {
                str2 = section.title;
            }
            return section.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\u0001\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0015J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0015J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0015J\u0010\u0010\u001f\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u0015J\u009c\u0001\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\r\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b.\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b1\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b2\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b3\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b4\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b5\u0010\u0015R\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b6\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b8\u0010\u001dR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b9\u0010\u0015R\u001a\u0010\r\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010:\u001a\u0004\b;\u0010 R\u001a\u0010\u000f\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010<\u001a\u0004\b=\u0010\"R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010:\u001a\u0004\b>\u0010 R\u001a\u0010\u0011\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010/\u001a\u0004\b?\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/notificationcenter/graphql/GetNotificationCenterNotificationsQuery$Notification;", "", "", "sectionTag", "campaignId", "contentId", "notificationId", "name", "title", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "Lcom/paypal/oslo/api/graphql/schema/type/NotificationIconType;", "iconType", "iconIdentifier", "deepLink", "Lcom/paypal/oslo/api/graphql/schema/type/NotificationStatus;", "status", "createdTime", "trackingToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/NotificationIconType;Ljava/lang/String;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/NotificationStatus;Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "()Lcom/paypal/oslo/api/graphql/schema/type/NotificationIconType;", "component9", "component10", "()Ljava/lang/Object;", "component11", "()Lcom/paypal/oslo/api/graphql/schema/type/NotificationStatus;", "component12", "component13", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/NotificationIconType;Ljava/lang/String;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/NotificationStatus;Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/notificationcenter/graphql/GetNotificationCenterNotificationsQuery$Notification;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getSectionTag", "getCampaignId", "getContentId", "getNotificationId", "getName", "getTitle", "getBody", "Lcom/paypal/oslo/api/graphql/schema/type/NotificationIconType;", "getIconType", "getIconIdentifier", "Ljava/lang/Object;", "getDeepLink", "Lcom/paypal/oslo/api/graphql/schema/type/NotificationStatus;", "getStatus", "getCreatedTime", "getTrackingToken"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Notification {
        public static final int $stable = 8;
        private final java.lang.String body;
        private final java.lang.String campaignId;
        private final java.lang.String contentId;
        private final java.lang.Object createdTime;
        private final java.lang.Object deepLink;
        private final java.lang.String iconIdentifier;
        private final com.paypal.oslo.api.graphql.schema.type.NotificationIconType iconType;
        private final java.lang.String name;
        private final java.lang.String notificationId;
        private final java.lang.String sectionTag;
        private final com.paypal.oslo.api.graphql.schema.type.NotificationStatus status;
        private final java.lang.String title;
        private final java.lang.String trackingToken;

        public Notification(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, com.paypal.oslo.api.graphql.schema.type.NotificationIconType notificationIconType, java.lang.String str8, java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.NotificationStatus notificationStatus, java.lang.Object obj2, java.lang.String str9) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str7, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notificationStatus, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str9, "");
            this.sectionTag = str;
            this.campaignId = str2;
            this.contentId = str3;
            this.notificationId = str4;
            this.name = str5;
            this.title = str6;
            this.body = str7;
            this.iconType = notificationIconType;
            this.iconIdentifier = str8;
            this.deepLink = obj;
            this.status = notificationStatus;
            this.createdTime = obj2;
            this.trackingToken = str9;
        }

        public final java.lang.String getSectionTag() {
            return this.sectionTag;
        }

        public final java.lang.String getCampaignId() {
            return this.campaignId;
        }

        public final java.lang.String getContentId() {
            return this.contentId;
        }

        public final java.lang.String getNotificationId() {
            return this.notificationId;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String getTitle() {
            return this.title;
        }

        public final java.lang.String getBody() {
            return this.body;
        }

        public final com.paypal.oslo.api.graphql.schema.type.NotificationIconType getIconType() {
            return this.iconType;
        }

        public final java.lang.String getIconIdentifier() {
            return this.iconIdentifier;
        }

        public final java.lang.Object getDeepLink() {
            return this.deepLink;
        }

        public final com.paypal.oslo.api.graphql.schema.type.NotificationStatus getStatus() {
            return this.status;
        }

        public final java.lang.Object getCreatedTime() {
            return this.createdTime;
        }

        public final java.lang.String getTrackingToken() {
            return this.trackingToken;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.sectionTag;
            java.lang.String str2 = this.campaignId;
            java.lang.String str3 = this.contentId;
            java.lang.String str4 = this.notificationId;
            java.lang.String str5 = this.name;
            java.lang.String str6 = this.title;
            java.lang.String str7 = this.body;
            com.paypal.oslo.api.graphql.schema.type.NotificationIconType notificationIconType = this.iconType;
            java.lang.String str8 = this.iconIdentifier;
            java.lang.Object obj = this.deepLink;
            com.paypal.oslo.api.graphql.schema.type.NotificationStatus notificationStatus = this.status;
            java.lang.Object obj2 = this.createdTime;
            java.lang.String str9 = this.trackingToken;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Notification(sectionTag=");
            sb.append(str);
            sb.append(", campaignId=");
            sb.append(str2);
            sb.append(", contentId=");
            sb.append(str3);
            sb.append(", notificationId=");
            sb.append(str4);
            sb.append(", name=");
            sb.append(str5);
            sb.append(", title=");
            sb.append(str6);
            sb.append(", body=");
            sb.append(str7);
            sb.append(", iconType=");
            sb.append(notificationIconType);
            sb.append(", iconIdentifier=");
            sb.append(str8);
            sb.append(", deepLink=");
            sb.append(obj);
            sb.append(", status=");
            sb.append(notificationStatus);
            sb.append(", createdTime=");
            sb.append(obj2);
            sb.append(", trackingToken=");
            sb.append(str9);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.sectionTag.hashCode();
            java.lang.String str = this.campaignId;
            int hashCode2 = str == null ? 0 : str.hashCode();
            int hashCode3 = this.contentId.hashCode();
            java.lang.String str2 = this.notificationId;
            int hashCode4 = str2 == null ? 0 : str2.hashCode();
            int hashCode5 = this.name.hashCode();
            int hashCode6 = this.title.hashCode();
            int hashCode7 = this.body.hashCode();
            com.paypal.oslo.api.graphql.schema.type.NotificationIconType notificationIconType = this.iconType;
            int hashCode8 = notificationIconType == null ? 0 : notificationIconType.hashCode();
            java.lang.String str3 = this.iconIdentifier;
            int hashCode9 = str3 == null ? 0 : str3.hashCode();
            int hashCode10 = this.deepLink.hashCode();
            int hashCode11 = this.status.hashCode();
            java.lang.Object obj = this.createdTime;
            return (((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + (obj != null ? obj.hashCode() : 0)) * 31) + this.trackingToken.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Notification)) {
                return false;
            }
            com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Notification notification = (com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Notification) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.sectionTag, notification.sectionTag) && kotlin.jvm.internal.Intrinsics.areEqual(this.campaignId, notification.campaignId) && kotlin.jvm.internal.Intrinsics.areEqual(this.contentId, notification.contentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.notificationId, notification.notificationId) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, notification.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.title, notification.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.body, notification.body) && this.iconType == notification.iconType && kotlin.jvm.internal.Intrinsics.areEqual(this.iconIdentifier, notification.iconIdentifier) && kotlin.jvm.internal.Intrinsics.areEqual(this.deepLink, notification.deepLink) && this.status == notification.status && kotlin.jvm.internal.Intrinsics.areEqual(this.createdTime, notification.createdTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.trackingToken, notification.trackingToken);
        }

        public final com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Notification copy(java.lang.String sectionTag, java.lang.String campaignId, java.lang.String contentId, java.lang.String notificationId, java.lang.String name2, java.lang.String title, java.lang.String body, com.paypal.oslo.api.graphql.schema.type.NotificationIconType iconType, java.lang.String iconIdentifier, java.lang.Object deepLink, com.paypal.oslo.api.graphql.schema.type.NotificationStatus status, java.lang.Object createdTime, java.lang.String trackingToken) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sectionTag, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deepLink, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trackingToken, "");
            return new com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Notification(sectionTag, campaignId, contentId, notificationId, name2, title, body, iconType, iconIdentifier, deepLink, status, createdTime, trackingToken);
        }

        /* renamed from: component9, reason: from getter */
        public final java.lang.String getIconIdentifier() {
            return this.iconIdentifier;
        }

        /* renamed from: component8, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.NotificationIconType getIconType() {
            return this.iconType;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.String getBody() {
            return this.body;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getTitle() {
            return this.title;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getNotificationId() {
            return this.notificationId;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getContentId() {
            return this.contentId;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCampaignId() {
            return this.campaignId;
        }

        /* renamed from: component13, reason: from getter */
        public final java.lang.String getTrackingToken() {
            return this.trackingToken;
        }

        /* renamed from: component12, reason: from getter */
        public final java.lang.Object getCreatedTime() {
            return this.createdTime;
        }

        /* renamed from: component11, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.NotificationStatus getStatus() {
            return this.status;
        }

        /* renamed from: component10, reason: from getter */
        public final java.lang.Object getDeepLink() {
            return this.deepLink;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getSectionTag() {
            return this.sectionTag;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/notificationcenter/graphql/GetNotificationCenterNotificationsQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetNotificationCenterNotifications { notifications { sections { tag title } notifications { sectionTag campaignId contentId notificationId name title body iconType iconIdentifier deepLink status createdTime trackingToken } } }";
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
