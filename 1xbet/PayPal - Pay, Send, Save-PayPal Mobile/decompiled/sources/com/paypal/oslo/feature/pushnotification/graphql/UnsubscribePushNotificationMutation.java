package com.paypal.oslo.feature.pushnotification.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003*+)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/graphql/UnsubscribePushNotificationMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/pushnotification/graphql/UnsubscribePushNotificationMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/UnsubscribeFromPushNotificationsInput;", "unsubscribeFromPushNotificationsInput", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/UnsubscribeFromPushNotificationsInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/UnsubscribeFromPushNotificationsInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/UnsubscribeFromPushNotificationsInput;)Lcom/paypal/oslo/feature/pushnotification/graphql/UnsubscribePushNotificationMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/UnsubscribeFromPushNotificationsInput;", "getUnsubscribeFromPushNotificationsInput", "Companion", "Data", "UnsubscribeFromPushNotifications"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class UnsubscribePushNotificationMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.pushnotification.graphql.UnsubscribePushNotificationMutation.Data> {
    public static final java.lang.String OPERATION_ID = "8657650d2453ec2eb838d05a361054d81b1bd3ee5e083c095eebbe5835378ca6";
    public static final java.lang.String OPERATION_NAME = "UnsubscribePushNotification";
    private final com.paypal.oslo.api.graphql.schema.type.UnsubscribeFromPushNotificationsInput unsubscribeFromPushNotificationsInput;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.pushnotification.graphql.UnsubscribePushNotificationMutation.Companion INSTANCE = new com.paypal.oslo.feature.pushnotification.graphql.UnsubscribePushNotificationMutation.Companion(null);
    public static final int $stable = 8;

    public UnsubscribePushNotificationMutation(com.paypal.oslo.api.graphql.schema.type.UnsubscribeFromPushNotificationsInput unsubscribeFromPushNotificationsInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unsubscribeFromPushNotificationsInput, "");
        this.unsubscribeFromPushNotificationsInput = unsubscribeFromPushNotificationsInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.UnsubscribeFromPushNotificationsInput getUnsubscribeFromPushNotificationsInput() {
        return this.unsubscribeFromPushNotificationsInput;
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
        com.paypal.oslo.feature.pushnotification.graphql.adapter.UnsubscribePushNotificationMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.pushnotification.graphql.UnsubscribePushNotificationMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.pushnotification.graphql.adapter.UnsubscribePushNotificationMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.pushnotification.graphql.selections.UnsubscribePushNotificationMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/graphql/UnsubscribePushNotificationMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/pushnotification/graphql/UnsubscribePushNotificationMutation$UnsubscribeFromPushNotifications;", "unsubscribeFromPushNotifications", "<init>", "(Lcom/paypal/oslo/feature/pushnotification/graphql/UnsubscribePushNotificationMutation$UnsubscribeFromPushNotifications;)V", "component1", "()Lcom/paypal/oslo/feature/pushnotification/graphql/UnsubscribePushNotificationMutation$UnsubscribeFromPushNotifications;", "copy", "(Lcom/paypal/oslo/feature/pushnotification/graphql/UnsubscribePushNotificationMutation$UnsubscribeFromPushNotifications;)Lcom/paypal/oslo/feature/pushnotification/graphql/UnsubscribePushNotificationMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/pushnotification/graphql/UnsubscribePushNotificationMutation$UnsubscribeFromPushNotifications;", "getUnsubscribeFromPushNotifications"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.pushnotification.graphql.UnsubscribePushNotificationMutation.UnsubscribeFromPushNotifications unsubscribeFromPushNotifications;

        public Data(com.paypal.oslo.feature.pushnotification.graphql.UnsubscribePushNotificationMutation.UnsubscribeFromPushNotifications unsubscribeFromPushNotifications) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unsubscribeFromPushNotifications, "");
            this.unsubscribeFromPushNotifications = unsubscribeFromPushNotifications;
        }

        public final com.paypal.oslo.feature.pushnotification.graphql.UnsubscribePushNotificationMutation.UnsubscribeFromPushNotifications getUnsubscribeFromPushNotifications() {
            return this.unsubscribeFromPushNotifications;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.pushnotification.graphql.UnsubscribePushNotificationMutation.UnsubscribeFromPushNotifications unsubscribeFromPushNotifications = this.unsubscribeFromPushNotifications;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(unsubscribeFromPushNotifications=");
            sb.append(unsubscribeFromPushNotifications);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.unsubscribeFromPushNotifications.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.pushnotification.graphql.UnsubscribePushNotificationMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.unsubscribeFromPushNotifications, ((com.paypal.oslo.feature.pushnotification.graphql.UnsubscribePushNotificationMutation.Data) other).unsubscribeFromPushNotifications);
        }

        public final com.paypal.oslo.feature.pushnotification.graphql.UnsubscribePushNotificationMutation.Data copy(com.paypal.oslo.feature.pushnotification.graphql.UnsubscribePushNotificationMutation.UnsubscribeFromPushNotifications unsubscribeFromPushNotifications) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unsubscribeFromPushNotifications, "");
            return new com.paypal.oslo.feature.pushnotification.graphql.UnsubscribePushNotificationMutation.Data(unsubscribeFromPushNotifications);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.pushnotification.graphql.UnsubscribePushNotificationMutation.UnsubscribeFromPushNotifications getUnsubscribeFromPushNotifications() {
            return this.unsubscribeFromPushNotifications;
        }

        public static /* synthetic */ com.paypal.oslo.feature.pushnotification.graphql.UnsubscribePushNotificationMutation.Data copy$default(com.paypal.oslo.feature.pushnotification.graphql.UnsubscribePushNotificationMutation.Data data, com.paypal.oslo.feature.pushnotification.graphql.UnsubscribePushNotificationMutation.UnsubscribeFromPushNotifications unsubscribeFromPushNotifications, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                unsubscribeFromPushNotifications = data.unsubscribeFromPushNotifications;
            }
            return data.copy(unsubscribeFromPushNotifications);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/graphql/UnsubscribePushNotificationMutation$UnsubscribeFromPushNotifications;", "", "", "deviceToken", "", "success", "<init>", "(Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lcom/paypal/oslo/feature/pushnotification/graphql/UnsubscribePushNotificationMutation$UnsubscribeFromPushNotifications;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDeviceToken", "Z", "getSuccess"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UnsubscribeFromPushNotifications {
        public static final int $stable = 0;
        private final java.lang.String deviceToken;
        private final boolean success;

        public UnsubscribeFromPushNotifications(java.lang.String str, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.deviceToken = str;
            this.success = z;
        }

        public final java.lang.String getDeviceToken() {
            return this.deviceToken;
        }

        public final boolean getSuccess() {
            return this.success;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.deviceToken;
            boolean z = this.success;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UnsubscribeFromPushNotifications(deviceToken=");
            sb.append(str);
            sb.append(", success=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.deviceToken.hashCode() * 31) + java.lang.Boolean.hashCode(this.success);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.pushnotification.graphql.UnsubscribePushNotificationMutation.UnsubscribeFromPushNotifications)) {
                return false;
            }
            com.paypal.oslo.feature.pushnotification.graphql.UnsubscribePushNotificationMutation.UnsubscribeFromPushNotifications unsubscribeFromPushNotifications = (com.paypal.oslo.feature.pushnotification.graphql.UnsubscribePushNotificationMutation.UnsubscribeFromPushNotifications) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.deviceToken, unsubscribeFromPushNotifications.deviceToken) && this.success == unsubscribeFromPushNotifications.success;
        }

        public final com.paypal.oslo.feature.pushnotification.graphql.UnsubscribePushNotificationMutation.UnsubscribeFromPushNotifications copy(java.lang.String deviceToken, boolean success) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceToken, "");
            return new com.paypal.oslo.feature.pushnotification.graphql.UnsubscribePushNotificationMutation.UnsubscribeFromPushNotifications(deviceToken, success);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getSuccess() {
            return this.success;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getDeviceToken() {
            return this.deviceToken;
        }

        public static /* synthetic */ com.paypal.oslo.feature.pushnotification.graphql.UnsubscribePushNotificationMutation.UnsubscribeFromPushNotifications copy$default(com.paypal.oslo.feature.pushnotification.graphql.UnsubscribePushNotificationMutation.UnsubscribeFromPushNotifications unsubscribeFromPushNotifications, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = unsubscribeFromPushNotifications.deviceToken;
            }
            if ((i & 2) != 0) {
                z = unsubscribeFromPushNotifications.success;
            }
            return unsubscribeFromPushNotifications.copy(str, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/graphql/UnsubscribePushNotificationMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation UnsubscribePushNotification($unsubscribeFromPushNotificationsInput: UnsubscribeFromPushNotificationsInput!) { unsubscribeFromPushNotifications(input: $unsubscribeFromPushNotificationsInput) { deviceToken success } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.UnsubscribeFromPushNotificationsInput unsubscribeFromPushNotificationsInput = this.unsubscribeFromPushNotificationsInput;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UnsubscribePushNotificationMutation(unsubscribeFromPushNotificationsInput=");
        sb.append(unsubscribeFromPushNotificationsInput);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.unsubscribeFromPushNotificationsInput.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.pushnotification.graphql.UnsubscribePushNotificationMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.unsubscribeFromPushNotificationsInput, ((com.paypal.oslo.feature.pushnotification.graphql.UnsubscribePushNotificationMutation) other).unsubscribeFromPushNotificationsInput);
    }

    public final com.paypal.oslo.feature.pushnotification.graphql.UnsubscribePushNotificationMutation copy(com.paypal.oslo.api.graphql.schema.type.UnsubscribeFromPushNotificationsInput unsubscribeFromPushNotificationsInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unsubscribeFromPushNotificationsInput, "");
        return new com.paypal.oslo.feature.pushnotification.graphql.UnsubscribePushNotificationMutation(unsubscribeFromPushNotificationsInput);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.UnsubscribeFromPushNotificationsInput getUnsubscribeFromPushNotificationsInput() {
        return this.unsubscribeFromPushNotificationsInput;
    }

    public static /* synthetic */ com.paypal.oslo.feature.pushnotification.graphql.UnsubscribePushNotificationMutation copy$default(com.paypal.oslo.feature.pushnotification.graphql.UnsubscribePushNotificationMutation unsubscribePushNotificationMutation, com.paypal.oslo.api.graphql.schema.type.UnsubscribeFromPushNotificationsInput unsubscribeFromPushNotificationsInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            unsubscribeFromPushNotificationsInput = unsubscribePushNotificationMutation.unsubscribeFromPushNotificationsInput;
        }
        return unsubscribePushNotificationMutation.copy(unsubscribeFromPushNotificationsInput);
    }
}
