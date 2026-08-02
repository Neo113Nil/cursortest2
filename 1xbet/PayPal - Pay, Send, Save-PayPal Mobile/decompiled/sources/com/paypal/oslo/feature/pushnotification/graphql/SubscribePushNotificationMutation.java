package com.paypal.oslo.feature.pushnotification.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003*+)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/graphql/SubscribePushNotificationMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/pushnotification/graphql/SubscribePushNotificationMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/SubscribeToPushNotificationsInput;", "subscribeToPushNotificationsInput", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/SubscribeToPushNotificationsInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/SubscribeToPushNotificationsInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/SubscribeToPushNotificationsInput;)Lcom/paypal/oslo/feature/pushnotification/graphql/SubscribePushNotificationMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/SubscribeToPushNotificationsInput;", "getSubscribeToPushNotificationsInput", "Companion", "Data", "SubscribeToPushNotifications"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SubscribePushNotificationMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.pushnotification.graphql.SubscribePushNotificationMutation.Data> {
    public static final java.lang.String OPERATION_ID = "d419be95e406b5282bf373345ea0a7bcc1f741ed95929152d35993cf00286166";
    public static final java.lang.String OPERATION_NAME = "SubscribePushNotification";
    private final com.paypal.oslo.api.graphql.schema.type.SubscribeToPushNotificationsInput subscribeToPushNotificationsInput;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.pushnotification.graphql.SubscribePushNotificationMutation.Companion INSTANCE = new com.paypal.oslo.feature.pushnotification.graphql.SubscribePushNotificationMutation.Companion(null);
    public static final int $stable = 8;

    public SubscribePushNotificationMutation(com.paypal.oslo.api.graphql.schema.type.SubscribeToPushNotificationsInput subscribeToPushNotificationsInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subscribeToPushNotificationsInput, "");
        this.subscribeToPushNotificationsInput = subscribeToPushNotificationsInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.SubscribeToPushNotificationsInput getSubscribeToPushNotificationsInput() {
        return this.subscribeToPushNotificationsInput;
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
    public final void serializeVariables(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, boolean withDefaultValues) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        com.paypal.oslo.feature.pushnotification.graphql.adapter.SubscribePushNotificationMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.pushnotification.graphql.SubscribePushNotificationMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.pushnotification.graphql.adapter.SubscribePushNotificationMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.pushnotification.graphql.selections.SubscribePushNotificationMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/graphql/SubscribePushNotificationMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/pushnotification/graphql/SubscribePushNotificationMutation$SubscribeToPushNotifications;", "subscribeToPushNotifications", "<init>", "(Lcom/paypal/oslo/feature/pushnotification/graphql/SubscribePushNotificationMutation$SubscribeToPushNotifications;)V", "component1", "()Lcom/paypal/oslo/feature/pushnotification/graphql/SubscribePushNotificationMutation$SubscribeToPushNotifications;", "copy", "(Lcom/paypal/oslo/feature/pushnotification/graphql/SubscribePushNotificationMutation$SubscribeToPushNotifications;)Lcom/paypal/oslo/feature/pushnotification/graphql/SubscribePushNotificationMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/pushnotification/graphql/SubscribePushNotificationMutation$SubscribeToPushNotifications;", "getSubscribeToPushNotifications"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.pushnotification.graphql.SubscribePushNotificationMutation.SubscribeToPushNotifications subscribeToPushNotifications;

        public Data(com.paypal.oslo.feature.pushnotification.graphql.SubscribePushNotificationMutation.SubscribeToPushNotifications subscribeToPushNotifications) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subscribeToPushNotifications, "");
            this.subscribeToPushNotifications = subscribeToPushNotifications;
        }

        public final com.paypal.oslo.feature.pushnotification.graphql.SubscribePushNotificationMutation.SubscribeToPushNotifications getSubscribeToPushNotifications() {
            return this.subscribeToPushNotifications;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.pushnotification.graphql.SubscribePushNotificationMutation.SubscribeToPushNotifications subscribeToPushNotifications = this.subscribeToPushNotifications;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(subscribeToPushNotifications=");
            sb.append(subscribeToPushNotifications);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.subscribeToPushNotifications.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.pushnotification.graphql.SubscribePushNotificationMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.subscribeToPushNotifications, ((com.paypal.oslo.feature.pushnotification.graphql.SubscribePushNotificationMutation.Data) other).subscribeToPushNotifications);
        }

        public final com.paypal.oslo.feature.pushnotification.graphql.SubscribePushNotificationMutation.Data copy(com.paypal.oslo.feature.pushnotification.graphql.SubscribePushNotificationMutation.SubscribeToPushNotifications subscribeToPushNotifications) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subscribeToPushNotifications, "");
            return new com.paypal.oslo.feature.pushnotification.graphql.SubscribePushNotificationMutation.Data(subscribeToPushNotifications);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.pushnotification.graphql.SubscribePushNotificationMutation.SubscribeToPushNotifications getSubscribeToPushNotifications() {
            return this.subscribeToPushNotifications;
        }

        public static /* synthetic */ com.paypal.oslo.feature.pushnotification.graphql.SubscribePushNotificationMutation.Data copy$default(com.paypal.oslo.feature.pushnotification.graphql.SubscribePushNotificationMutation.Data data, com.paypal.oslo.feature.pushnotification.graphql.SubscribePushNotificationMutation.SubscribeToPushNotifications subscribeToPushNotifications, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                subscribeToPushNotifications = data.subscribeToPushNotifications;
            }
            return data.copy(subscribeToPushNotifications);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/graphql/SubscribePushNotificationMutation$SubscribeToPushNotifications;", "", "Lcom/paypal/oslo/api/graphql/schema/type/PushNotificationsSubscriptionStatus;", "status", "", "cloudId", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/PushNotificationsSubscriptionStatus;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/PushNotificationsSubscriptionStatus;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/PushNotificationsSubscriptionStatus;Ljava/lang/String;)Lcom/paypal/oslo/feature/pushnotification/graphql/SubscribePushNotificationMutation$SubscribeToPushNotifications;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/PushNotificationsSubscriptionStatus;", "getStatus", "Ljava/lang/String;", "getCloudId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SubscribeToPushNotifications {
        public static final int $stable = 0;
        private final java.lang.String cloudId;
        private final com.paypal.oslo.api.graphql.schema.type.PushNotificationsSubscriptionStatus status;

        public SubscribeToPushNotifications(com.paypal.oslo.api.graphql.schema.type.PushNotificationsSubscriptionStatus pushNotificationsSubscriptionStatus, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushNotificationsSubscriptionStatus, "");
            this.status = pushNotificationsSubscriptionStatus;
            this.cloudId = str;
        }

        public final com.paypal.oslo.api.graphql.schema.type.PushNotificationsSubscriptionStatus getStatus() {
            return this.status;
        }

        public final java.lang.String getCloudId() {
            return this.cloudId;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.PushNotificationsSubscriptionStatus pushNotificationsSubscriptionStatus = this.status;
            java.lang.String str = this.cloudId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SubscribeToPushNotifications(status=");
            sb.append(pushNotificationsSubscriptionStatus);
            sb.append(", cloudId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.status.hashCode();
            java.lang.String str = this.cloudId;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.pushnotification.graphql.SubscribePushNotificationMutation.SubscribeToPushNotifications)) {
                return false;
            }
            com.paypal.oslo.feature.pushnotification.graphql.SubscribePushNotificationMutation.SubscribeToPushNotifications subscribeToPushNotifications = (com.paypal.oslo.feature.pushnotification.graphql.SubscribePushNotificationMutation.SubscribeToPushNotifications) other;
            return this.status == subscribeToPushNotifications.status && kotlin.jvm.internal.Intrinsics.areEqual(this.cloudId, subscribeToPushNotifications.cloudId);
        }

        public final com.paypal.oslo.feature.pushnotification.graphql.SubscribePushNotificationMutation.SubscribeToPushNotifications copy(com.paypal.oslo.api.graphql.schema.type.PushNotificationsSubscriptionStatus status, java.lang.String cloudId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            return new com.paypal.oslo.feature.pushnotification.graphql.SubscribePushNotificationMutation.SubscribeToPushNotifications(status, cloudId);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCloudId() {
            return this.cloudId;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.PushNotificationsSubscriptionStatus getStatus() {
            return this.status;
        }

        public static /* synthetic */ com.paypal.oslo.feature.pushnotification.graphql.SubscribePushNotificationMutation.SubscribeToPushNotifications copy$default(com.paypal.oslo.feature.pushnotification.graphql.SubscribePushNotificationMutation.SubscribeToPushNotifications subscribeToPushNotifications, com.paypal.oslo.api.graphql.schema.type.PushNotificationsSubscriptionStatus pushNotificationsSubscriptionStatus, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                pushNotificationsSubscriptionStatus = subscribeToPushNotifications.status;
            }
            if ((i & 2) != 0) {
                str = subscribeToPushNotifications.cloudId;
            }
            return subscribeToPushNotifications.copy(pushNotificationsSubscriptionStatus, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/graphql/SubscribePushNotificationMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation SubscribePushNotification($subscribeToPushNotificationsInput: SubscribeToPushNotificationsInput!) { subscribeToPushNotifications(input: $subscribeToPushNotificationsInput) { status cloudId } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.SubscribeToPushNotificationsInput subscribeToPushNotificationsInput = this.subscribeToPushNotificationsInput;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SubscribePushNotificationMutation(subscribeToPushNotificationsInput=");
        sb.append(subscribeToPushNotificationsInput);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.subscribeToPushNotificationsInput.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.pushnotification.graphql.SubscribePushNotificationMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.subscribeToPushNotificationsInput, ((com.paypal.oslo.feature.pushnotification.graphql.SubscribePushNotificationMutation) other).subscribeToPushNotificationsInput);
    }

    public final com.paypal.oslo.feature.pushnotification.graphql.SubscribePushNotificationMutation copy(com.paypal.oslo.api.graphql.schema.type.SubscribeToPushNotificationsInput subscribeToPushNotificationsInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subscribeToPushNotificationsInput, "");
        return new com.paypal.oslo.feature.pushnotification.graphql.SubscribePushNotificationMutation(subscribeToPushNotificationsInput);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.SubscribeToPushNotificationsInput getSubscribeToPushNotificationsInput() {
        return this.subscribeToPushNotificationsInput;
    }

    public static /* synthetic */ com.paypal.oslo.feature.pushnotification.graphql.SubscribePushNotificationMutation copy$default(com.paypal.oslo.feature.pushnotification.graphql.SubscribePushNotificationMutation subscribePushNotificationMutation, com.paypal.oslo.api.graphql.schema.type.SubscribeToPushNotificationsInput subscribeToPushNotificationsInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            subscribeToPushNotificationsInput = subscribePushNotificationMutation.subscribeToPushNotificationsInput;
        }
        return subscribePushNotificationMutation.copy(subscribeToPushNotificationsInput);
    }
}
