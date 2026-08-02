package com.paypal.oslo.core.pushnotification.domain.notification;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\n\u000bR\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0002\f\rÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationClick;", "", "", "getNotificationId", "()Ljava/lang/String;", "notificationId", "", "getMetadata", "()Ljava/util/Map;", "metadata", "Content", "Action", "Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationClick$Action;", "Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationClick$Content;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface NotificationClick {
    java.util.Map<java.lang.String, java.lang.String> getMetadata();

    java.lang.String getNotificationId();

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ0\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationClick$Content;", "Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationClick;", "", "notificationId", "", "metadata", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/util/Map;)Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationClick$Content;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getNotificationId", "Ljava/util/Map;", "getMetadata"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Content implements com.paypal.oslo.core.pushnotification.domain.notification.NotificationClick {
        private final java.util.Map<java.lang.String, java.lang.String> metadata;
        private final java.lang.String notificationId;

        public Content(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            this.notificationId = str;
            this.metadata = map;
        }

        @Override // com.paypal.oslo.core.pushnotification.domain.notification.NotificationClick
        public final java.lang.String getNotificationId() {
            return this.notificationId;
        }

        @Override // com.paypal.oslo.core.pushnotification.domain.notification.NotificationClick
        public final java.util.Map<java.lang.String, java.lang.String> getMetadata() {
            return this.metadata;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.notificationId;
            java.util.Map<java.lang.String, java.lang.String> map = this.metadata;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Content(notificationId=");
            sb.append(str);
            sb.append(", metadata=");
            sb.append(map);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.notificationId.hashCode() * 31) + this.metadata.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.core.pushnotification.domain.notification.NotificationClick.Content)) {
                return false;
            }
            com.paypal.oslo.core.pushnotification.domain.notification.NotificationClick.Content content = (com.paypal.oslo.core.pushnotification.domain.notification.NotificationClick.Content) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.notificationId, content.notificationId) && kotlin.jvm.internal.Intrinsics.areEqual(this.metadata, content.metadata);
        }

        public final com.paypal.oslo.core.pushnotification.domain.notification.NotificationClick.Content copy(java.lang.String notificationId, java.util.Map<java.lang.String, java.lang.String> metadata) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notificationId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metadata, "");
            return new com.paypal.oslo.core.pushnotification.domain.notification.NotificationClick.Content(notificationId, metadata);
        }

        public final java.util.Map<java.lang.String, java.lang.String> component2() {
            return this.metadata;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getNotificationId() {
            return this.notificationId;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.core.pushnotification.domain.notification.NotificationClick.Content copy$default(com.paypal.oslo.core.pushnotification.domain.notification.NotificationClick.Content content, java.lang.String str, java.util.Map map, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = content.notificationId;
            }
            if ((i & 2) != 0) {
                map = content.metadata;
            }
            return content.copy(str, map);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u001c\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJP\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001f\u0010\u000bR&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b \u0010\r"}, d2 = {"Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationClick$Action;", "Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationClick;", "", "notificationId", "", "metadata", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.ACTION_ID, "actionMetadata", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Map;", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;)Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationClick$Action;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getNotificationId", "Ljava/util/Map;", "getMetadata", "getActionId", "getActionMetadata"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Action implements com.paypal.oslo.core.pushnotification.domain.notification.NotificationClick {
        private final java.lang.String actionId;
        private final java.util.Map<java.lang.String, java.lang.String> actionMetadata;
        private final java.util.Map<java.lang.String, java.lang.String> metadata;
        private final java.lang.String notificationId;

        public Action(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str2, java.util.Map<java.lang.String, java.lang.String> map2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map2, "");
            this.notificationId = str;
            this.metadata = map;
            this.actionId = str2;
            this.actionMetadata = map2;
        }

        @Override // com.paypal.oslo.core.pushnotification.domain.notification.NotificationClick
        public final java.lang.String getNotificationId() {
            return this.notificationId;
        }

        @Override // com.paypal.oslo.core.pushnotification.domain.notification.NotificationClick
        public final java.util.Map<java.lang.String, java.lang.String> getMetadata() {
            return this.metadata;
        }

        public final java.lang.String getActionId() {
            return this.actionId;
        }

        public final java.util.Map<java.lang.String, java.lang.String> getActionMetadata() {
            return this.actionMetadata;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.notificationId;
            java.util.Map<java.lang.String, java.lang.String> map = this.metadata;
            java.lang.String str2 = this.actionId;
            java.util.Map<java.lang.String, java.lang.String> map2 = this.actionMetadata;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Action(notificationId=");
            sb.append(str);
            sb.append(", metadata=");
            sb.append(map);
            sb.append(", actionId=");
            sb.append(str2);
            sb.append(", actionMetadata=");
            sb.append(map2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((this.notificationId.hashCode() * 31) + this.metadata.hashCode()) * 31) + this.actionId.hashCode()) * 31) + this.actionMetadata.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.core.pushnotification.domain.notification.NotificationClick.Action)) {
                return false;
            }
            com.paypal.oslo.core.pushnotification.domain.notification.NotificationClick.Action action = (com.paypal.oslo.core.pushnotification.domain.notification.NotificationClick.Action) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.notificationId, action.notificationId) && kotlin.jvm.internal.Intrinsics.areEqual(this.metadata, action.metadata) && kotlin.jvm.internal.Intrinsics.areEqual(this.actionId, action.actionId) && kotlin.jvm.internal.Intrinsics.areEqual(this.actionMetadata, action.actionMetadata);
        }

        public final com.paypal.oslo.core.pushnotification.domain.notification.NotificationClick.Action copy(java.lang.String notificationId, java.util.Map<java.lang.String, java.lang.String> metadata, java.lang.String actionId, java.util.Map<java.lang.String, java.lang.String> actionMetadata) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notificationId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metadata, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionMetadata, "");
            return new com.paypal.oslo.core.pushnotification.domain.notification.NotificationClick.Action(notificationId, metadata, actionId, actionMetadata);
        }

        public final java.util.Map<java.lang.String, java.lang.String> component4() {
            return this.actionMetadata;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getActionId() {
            return this.actionId;
        }

        public final java.util.Map<java.lang.String, java.lang.String> component2() {
            return this.metadata;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getNotificationId() {
            return this.notificationId;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.core.pushnotification.domain.notification.NotificationClick.Action copy$default(com.paypal.oslo.core.pushnotification.domain.notification.NotificationClick.Action action, java.lang.String str, java.util.Map map, java.lang.String str2, java.util.Map map2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = action.notificationId;
            }
            if ((i & 2) != 0) {
                map = action.metadata;
            }
            if ((i & 4) != 0) {
                str2 = action.actionId;
            }
            if ((i & 8) != 0) {
                map2 = action.actionMetadata;
            }
            return action.copy(str, map, str2, map2);
        }
    }
}
