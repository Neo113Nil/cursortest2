package com.paypal.oslo.feature.pushnotification.delivery.domain.model;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\rÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/NotificationEvent;", "", "NotificationReceived", "NotificationShown", "NotificationFailed", "NotificationClicked", "NotificationDismissed", "ValidationFailed", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/NotificationEvent$NotificationClicked;", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/NotificationEvent$NotificationDismissed;", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/NotificationEvent$NotificationFailed;", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/NotificationEvent$NotificationReceived;", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/NotificationEvent$NotificationShown;", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/NotificationEvent$ValidationFailed;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface NotificationEvent {

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ0\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/NotificationEvent$NotificationReceived;", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/NotificationEvent;", "", "type", "", "metadata", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/util/Map;)Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/NotificationEvent$NotificationReceived;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getType", "Ljava/util/Map;", "getMetadata"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NotificationReceived implements com.paypal.oslo.feature.pushnotification.delivery.domain.model.NotificationEvent {
        public static final int $stable = 8;
        private final java.util.Map<java.lang.String, java.lang.String> metadata;
        private final java.lang.String type;

        public NotificationReceived(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            this.type = str;
            this.metadata = map;
        }

        public final java.lang.String getType() {
            return this.type;
        }

        public final java.util.Map<java.lang.String, java.lang.String> getMetadata() {
            return this.metadata;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.type;
            java.util.Map<java.lang.String, java.lang.String> map = this.metadata;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NotificationReceived(type=");
            sb.append(str);
            sb.append(", metadata=");
            sb.append(map);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.type.hashCode() * 31) + this.metadata.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.pushnotification.delivery.domain.model.NotificationEvent.NotificationReceived)) {
                return false;
            }
            com.paypal.oslo.feature.pushnotification.delivery.domain.model.NotificationEvent.NotificationReceived notificationReceived = (com.paypal.oslo.feature.pushnotification.delivery.domain.model.NotificationEvent.NotificationReceived) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.type, notificationReceived.type) && kotlin.jvm.internal.Intrinsics.areEqual(this.metadata, notificationReceived.metadata);
        }

        public final com.paypal.oslo.feature.pushnotification.delivery.domain.model.NotificationEvent.NotificationReceived copy(java.lang.String type, java.util.Map<java.lang.String, java.lang.String> metadata) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metadata, "");
            return new com.paypal.oslo.feature.pushnotification.delivery.domain.model.NotificationEvent.NotificationReceived(type, metadata);
        }

        public final java.util.Map<java.lang.String, java.lang.String> component2() {
            return this.metadata;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getType() {
            return this.type;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.pushnotification.delivery.domain.model.NotificationEvent.NotificationReceived copy$default(com.paypal.oslo.feature.pushnotification.delivery.domain.model.NotificationEvent.NotificationReceived notificationReceived, java.lang.String str, java.util.Map map, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = notificationReceived.type;
            }
            if ((i & 2) != 0) {
                map = notificationReceived.metadata;
            }
            return notificationReceived.copy(str, map);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/NotificationEvent$NotificationShown;", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/NotificationEvent;", "", "notificationId", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/NotificationEvent$NotificationShown;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getNotificationId", "getType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NotificationShown implements com.paypal.oslo.feature.pushnotification.delivery.domain.model.NotificationEvent {
        public static final int $stable = 0;
        private final java.lang.String notificationId;
        private final java.lang.String type;

        public NotificationShown(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.notificationId = str;
            this.type = str2;
        }

        public final java.lang.String getNotificationId() {
            return this.notificationId;
        }

        public final java.lang.String getType() {
            return this.type;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.notificationId;
            java.lang.String str2 = this.type;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NotificationShown(notificationId=");
            sb.append(str);
            sb.append(", type=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.notificationId.hashCode() * 31) + this.type.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.pushnotification.delivery.domain.model.NotificationEvent.NotificationShown)) {
                return false;
            }
            com.paypal.oslo.feature.pushnotification.delivery.domain.model.NotificationEvent.NotificationShown notificationShown = (com.paypal.oslo.feature.pushnotification.delivery.domain.model.NotificationEvent.NotificationShown) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.notificationId, notificationShown.notificationId) && kotlin.jvm.internal.Intrinsics.areEqual(this.type, notificationShown.type);
        }

        public final com.paypal.oslo.feature.pushnotification.delivery.domain.model.NotificationEvent.NotificationShown copy(java.lang.String notificationId, java.lang.String type) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notificationId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            return new com.paypal.oslo.feature.pushnotification.delivery.domain.model.NotificationEvent.NotificationShown(notificationId, type);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getType() {
            return this.type;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getNotificationId() {
            return this.notificationId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.pushnotification.delivery.domain.model.NotificationEvent.NotificationShown copy$default(com.paypal.oslo.feature.pushnotification.delivery.domain.model.NotificationEvent.NotificationShown notificationShown, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = notificationShown.notificationId;
            }
            if ((i & 2) != 0) {
                str2 = notificationShown.type;
            }
            return notificationShown.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/NotificationEvent$NotificationFailed;", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/NotificationEvent;", "", "error", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/NotificationEvent$NotificationFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getError", "getType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NotificationFailed implements com.paypal.oslo.feature.pushnotification.delivery.domain.model.NotificationEvent {
        public static final int $stable = 0;
        private final java.lang.String error;
        private final java.lang.String type;

        public NotificationFailed(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.error = str;
            this.type = str2;
        }

        public final java.lang.String getError() {
            return this.error;
        }

        public final java.lang.String getType() {
            return this.type;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.error;
            java.lang.String str2 = this.type;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NotificationFailed(error=");
            sb.append(str);
            sb.append(", type=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.error.hashCode() * 31) + this.type.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.pushnotification.delivery.domain.model.NotificationEvent.NotificationFailed)) {
                return false;
            }
            com.paypal.oslo.feature.pushnotification.delivery.domain.model.NotificationEvent.NotificationFailed notificationFailed = (com.paypal.oslo.feature.pushnotification.delivery.domain.model.NotificationEvent.NotificationFailed) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.error, notificationFailed.error) && kotlin.jvm.internal.Intrinsics.areEqual(this.type, notificationFailed.type);
        }

        public final com.paypal.oslo.feature.pushnotification.delivery.domain.model.NotificationEvent.NotificationFailed copy(java.lang.String error, java.lang.String type) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            return new com.paypal.oslo.feature.pushnotification.delivery.domain.model.NotificationEvent.NotificationFailed(error, type);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getType() {
            return this.type;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.pushnotification.delivery.domain.model.NotificationEvent.NotificationFailed copy$default(com.paypal.oslo.feature.pushnotification.delivery.domain.model.NotificationEvent.NotificationFailed notificationFailed, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = notificationFailed.error;
            }
            if ((i & 2) != 0) {
                str2 = notificationFailed.type;
            }
            return notificationFailed.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ&\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/NotificationEvent$NotificationClicked;", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/NotificationEvent;", "", "notificationId", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.ACTION_ID, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/NotificationEvent$NotificationClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getNotificationId", "getActionId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NotificationClicked implements com.paypal.oslo.feature.pushnotification.delivery.domain.model.NotificationEvent {
        public static final int $stable = 0;
        private final java.lang.String actionId;
        private final java.lang.String notificationId;

        public NotificationClicked(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.notificationId = str;
            this.actionId = str2;
        }

        public final java.lang.String getNotificationId() {
            return this.notificationId;
        }

        public final java.lang.String getActionId() {
            return this.actionId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.notificationId;
            java.lang.String str2 = this.actionId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NotificationClicked(notificationId=");
            sb.append(str);
            sb.append(", actionId=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.notificationId.hashCode();
            java.lang.String str = this.actionId;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.pushnotification.delivery.domain.model.NotificationEvent.NotificationClicked)) {
                return false;
            }
            com.paypal.oslo.feature.pushnotification.delivery.domain.model.NotificationEvent.NotificationClicked notificationClicked = (com.paypal.oslo.feature.pushnotification.delivery.domain.model.NotificationEvent.NotificationClicked) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.notificationId, notificationClicked.notificationId) && kotlin.jvm.internal.Intrinsics.areEqual(this.actionId, notificationClicked.actionId);
        }

        public final com.paypal.oslo.feature.pushnotification.delivery.domain.model.NotificationEvent.NotificationClicked copy(java.lang.String notificationId, java.lang.String actionId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notificationId, "");
            return new com.paypal.oslo.feature.pushnotification.delivery.domain.model.NotificationEvent.NotificationClicked(notificationId, actionId);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getActionId() {
            return this.actionId;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getNotificationId() {
            return this.notificationId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.pushnotification.delivery.domain.model.NotificationEvent.NotificationClicked copy$default(com.paypal.oslo.feature.pushnotification.delivery.domain.model.NotificationEvent.NotificationClicked notificationClicked, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = notificationClicked.notificationId;
            }
            if ((i & 2) != 0) {
                str2 = notificationClicked.actionId;
            }
            return notificationClicked.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/NotificationEvent$NotificationDismissed;", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/NotificationEvent;", "", "notificationId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/NotificationEvent$NotificationDismissed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getNotificationId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NotificationDismissed implements com.paypal.oslo.feature.pushnotification.delivery.domain.model.NotificationEvent {
        public static final int $stable = 0;
        private final java.lang.String notificationId;

        public NotificationDismissed(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.notificationId = str;
        }

        public final java.lang.String getNotificationId() {
            return this.notificationId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.notificationId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NotificationDismissed(notificationId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.notificationId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.pushnotification.delivery.domain.model.NotificationEvent.NotificationDismissed) && kotlin.jvm.internal.Intrinsics.areEqual(this.notificationId, ((com.paypal.oslo.feature.pushnotification.delivery.domain.model.NotificationEvent.NotificationDismissed) other).notificationId);
        }

        public final com.paypal.oslo.feature.pushnotification.delivery.domain.model.NotificationEvent.NotificationDismissed copy(java.lang.String notificationId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notificationId, "");
            return new com.paypal.oslo.feature.pushnotification.delivery.domain.model.NotificationEvent.NotificationDismissed(notificationId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getNotificationId() {
            return this.notificationId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.pushnotification.delivery.domain.model.NotificationEvent.NotificationDismissed copy$default(com.paypal.oslo.feature.pushnotification.delivery.domain.model.NotificationEvent.NotificationDismissed notificationDismissed, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = notificationDismissed.notificationId;
            }
            return notificationDismissed.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/NotificationEvent$ValidationFailed;", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/NotificationEvent;", "", "error", "eventType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/NotificationEvent$ValidationFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getError", "getEventType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ValidationFailed implements com.paypal.oslo.feature.pushnotification.delivery.domain.model.NotificationEvent {
        public static final int $stable = 0;
        private final java.lang.String error;
        private final java.lang.String eventType;

        public ValidationFailed(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.error = str;
            this.eventType = str2;
        }

        public final java.lang.String getError() {
            return this.error;
        }

        public final java.lang.String getEventType() {
            return this.eventType;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.error;
            java.lang.String str2 = this.eventType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ValidationFailed(error=");
            sb.append(str);
            sb.append(", eventType=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.error.hashCode() * 31) + this.eventType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.pushnotification.delivery.domain.model.NotificationEvent.ValidationFailed)) {
                return false;
            }
            com.paypal.oslo.feature.pushnotification.delivery.domain.model.NotificationEvent.ValidationFailed validationFailed = (com.paypal.oslo.feature.pushnotification.delivery.domain.model.NotificationEvent.ValidationFailed) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.error, validationFailed.error) && kotlin.jvm.internal.Intrinsics.areEqual(this.eventType, validationFailed.eventType);
        }

        public final com.paypal.oslo.feature.pushnotification.delivery.domain.model.NotificationEvent.ValidationFailed copy(java.lang.String error, java.lang.String eventType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventType, "");
            return new com.paypal.oslo.feature.pushnotification.delivery.domain.model.NotificationEvent.ValidationFailed(error, eventType);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getEventType() {
            return this.eventType;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.pushnotification.delivery.domain.model.NotificationEvent.ValidationFailed copy$default(com.paypal.oslo.feature.pushnotification.delivery.domain.model.NotificationEvent.ValidationFailed validationFailed, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = validationFailed.error;
            }
            if ((i & 2) != 0) {
                str2 = validationFailed.eventType;
            }
            return validationFailed.copy(str, str2);
        }
    }
}
