package com.paypal.oslo.feature.pushnotification.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003*+)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/graphql/GetPushNotificationPreferencesQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/pushnotification/graphql/GetPushNotificationPreferencesQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/PushNotificationPreferencesInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/PushNotificationPreferencesInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/PushNotificationPreferencesInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/PushNotificationPreferencesInput;)Lcom/paypal/oslo/feature/pushnotification/graphql/GetPushNotificationPreferencesQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/PushNotificationPreferencesInput;", "getInput", "Companion", "Data", "PushNotificationPreference"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class GetPushNotificationPreferencesQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.pushnotification.graphql.GetPushNotificationPreferencesQuery.Data> {
    public static final java.lang.String OPERATION_ID = "870290c4edcc49391e2abefc8c3aac1aacde9b81c78bc8c4fed5dea9e0ec92a7";
    public static final java.lang.String OPERATION_NAME = "GetPushNotificationPreferences";
    private final com.paypal.oslo.api.graphql.schema.type.PushNotificationPreferencesInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.pushnotification.graphql.GetPushNotificationPreferencesQuery.Companion INSTANCE = new com.paypal.oslo.feature.pushnotification.graphql.GetPushNotificationPreferencesQuery.Companion(null);
    public static final int $stable = 8;

    public GetPushNotificationPreferencesQuery(com.paypal.oslo.api.graphql.schema.type.PushNotificationPreferencesInput pushNotificationPreferencesInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushNotificationPreferencesInput, "");
        this.input = pushNotificationPreferencesInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.PushNotificationPreferencesInput getInput() {
        return this.input;
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
        com.paypal.oslo.feature.pushnotification.graphql.adapter.GetPushNotificationPreferencesQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.pushnotification.graphql.GetPushNotificationPreferencesQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.pushnotification.graphql.adapter.GetPushNotificationPreferencesQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.pushnotification.graphql.selections.GetPushNotificationPreferencesQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/graphql/GetPushNotificationPreferencesQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "", "Lcom/paypal/oslo/feature/pushnotification/graphql/GetPushNotificationPreferencesQuery$PushNotificationPreference;", "pushNotificationPreferences", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/pushnotification/graphql/GetPushNotificationPreferencesQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getPushNotificationPreferences"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.pushnotification.graphql.GetPushNotificationPreferencesQuery.PushNotificationPreference> pushNotificationPreferences;

        public Data(java.util.List<com.paypal.oslo.feature.pushnotification.graphql.GetPushNotificationPreferencesQuery.PushNotificationPreference> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.pushNotificationPreferences = list;
        }

        public final java.util.List<com.paypal.oslo.feature.pushnotification.graphql.GetPushNotificationPreferencesQuery.PushNotificationPreference> getPushNotificationPreferences() {
            return this.pushNotificationPreferences;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.pushnotification.graphql.GetPushNotificationPreferencesQuery.PushNotificationPreference> list = this.pushNotificationPreferences;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(pushNotificationPreferences=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.pushNotificationPreferences.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.pushnotification.graphql.GetPushNotificationPreferencesQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.pushNotificationPreferences, ((com.paypal.oslo.feature.pushnotification.graphql.GetPushNotificationPreferencesQuery.Data) other).pushNotificationPreferences);
        }

        public final com.paypal.oslo.feature.pushnotification.graphql.GetPushNotificationPreferencesQuery.Data copy(java.util.List<com.paypal.oslo.feature.pushnotification.graphql.GetPushNotificationPreferencesQuery.PushNotificationPreference> pushNotificationPreferences) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushNotificationPreferences, "");
            return new com.paypal.oslo.feature.pushnotification.graphql.GetPushNotificationPreferencesQuery.Data(pushNotificationPreferences);
        }

        public final java.util.List<com.paypal.oslo.feature.pushnotification.graphql.GetPushNotificationPreferencesQuery.PushNotificationPreference> component1() {
            return this.pushNotificationPreferences;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.pushnotification.graphql.GetPushNotificationPreferencesQuery.Data copy$default(com.paypal.oslo.feature.pushnotification.graphql.GetPushNotificationPreferencesQuery.Data data, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = data.pushNotificationPreferences;
            }
            return data.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ<\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001e\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001f\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/graphql/GetPushNotificationPreferencesQuery$PushNotificationPreference;", "", "", "type", "Lcom/paypal/oslo/api/graphql/schema/type/NotificationPreferenceStatus;", "status", "displayText", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/NotificationPreferenceStatus;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/NotificationPreferenceStatus;", "component3", "component4", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/NotificationPreferenceStatus;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/pushnotification/graphql/GetPushNotificationPreferencesQuery$PushNotificationPreference;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getType", "Lcom/paypal/oslo/api/graphql/schema/type/NotificationPreferenceStatus;", "getStatus", "getDisplayText", "getDescription"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PushNotificationPreference {
        public static final int $stable = 0;
        private final java.lang.String description;
        private final java.lang.String displayText;
        private final com.paypal.oslo.api.graphql.schema.type.NotificationPreferenceStatus status;
        private final java.lang.String type;

        public PushNotificationPreference(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.NotificationPreferenceStatus notificationPreferenceStatus, java.lang.String str2, java.lang.String str3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notificationPreferenceStatus, "");
            this.type = str;
            this.status = notificationPreferenceStatus;
            this.displayText = str2;
            this.description = str3;
        }

        public final java.lang.String getType() {
            return this.type;
        }

        public final com.paypal.oslo.api.graphql.schema.type.NotificationPreferenceStatus getStatus() {
            return this.status;
        }

        public final java.lang.String getDisplayText() {
            return this.displayText;
        }

        public final java.lang.String getDescription() {
            return this.description;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.type;
            com.paypal.oslo.api.graphql.schema.type.NotificationPreferenceStatus notificationPreferenceStatus = this.status;
            java.lang.String str2 = this.displayText;
            java.lang.String str3 = this.description;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PushNotificationPreference(type=");
            sb.append(str);
            sb.append(", status=");
            sb.append(notificationPreferenceStatus);
            sb.append(", displayText=");
            sb.append(str2);
            sb.append(", description=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.type.hashCode();
            int hashCode2 = this.status.hashCode();
            java.lang.String str = this.displayText;
            int hashCode3 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.description;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.pushnotification.graphql.GetPushNotificationPreferencesQuery.PushNotificationPreference)) {
                return false;
            }
            com.paypal.oslo.feature.pushnotification.graphql.GetPushNotificationPreferencesQuery.PushNotificationPreference pushNotificationPreference = (com.paypal.oslo.feature.pushnotification.graphql.GetPushNotificationPreferencesQuery.PushNotificationPreference) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.type, pushNotificationPreference.type) && this.status == pushNotificationPreference.status && kotlin.jvm.internal.Intrinsics.areEqual(this.displayText, pushNotificationPreference.displayText) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, pushNotificationPreference.description);
        }

        public final com.paypal.oslo.feature.pushnotification.graphql.GetPushNotificationPreferencesQuery.PushNotificationPreference copy(java.lang.String type, com.paypal.oslo.api.graphql.schema.type.NotificationPreferenceStatus status, java.lang.String displayText, java.lang.String description) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            return new com.paypal.oslo.feature.pushnotification.graphql.GetPushNotificationPreferencesQuery.PushNotificationPreference(type, status, displayText, description);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getDescription() {
            return this.description;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getDisplayText() {
            return this.displayText;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.NotificationPreferenceStatus getStatus() {
            return this.status;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getType() {
            return this.type;
        }

        public static /* synthetic */ com.paypal.oslo.feature.pushnotification.graphql.GetPushNotificationPreferencesQuery.PushNotificationPreference copy$default(com.paypal.oslo.feature.pushnotification.graphql.GetPushNotificationPreferencesQuery.PushNotificationPreference pushNotificationPreference, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.NotificationPreferenceStatus notificationPreferenceStatus, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = pushNotificationPreference.type;
            }
            if ((i & 2) != 0) {
                notificationPreferenceStatus = pushNotificationPreference.status;
            }
            if ((i & 4) != 0) {
                str2 = pushNotificationPreference.displayText;
            }
            if ((i & 8) != 0) {
                str3 = pushNotificationPreference.description;
            }
            return pushNotificationPreference.copy(str, notificationPreferenceStatus, str2, str3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/graphql/GetPushNotificationPreferencesQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetPushNotificationPreferences($input: PushNotificationPreferencesInput!) { pushNotificationPreferences(input: $input) { type status displayText description } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.PushNotificationPreferencesInput pushNotificationPreferencesInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetPushNotificationPreferencesQuery(input=");
        sb.append(pushNotificationPreferencesInput);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.input.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.pushnotification.graphql.GetPushNotificationPreferencesQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.pushnotification.graphql.GetPushNotificationPreferencesQuery) other).input);
    }

    public final com.paypal.oslo.feature.pushnotification.graphql.GetPushNotificationPreferencesQuery copy(com.paypal.oslo.api.graphql.schema.type.PushNotificationPreferencesInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.pushnotification.graphql.GetPushNotificationPreferencesQuery(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.PushNotificationPreferencesInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.pushnotification.graphql.GetPushNotificationPreferencesQuery copy$default(com.paypal.oslo.feature.pushnotification.graphql.GetPushNotificationPreferencesQuery getPushNotificationPreferencesQuery, com.paypal.oslo.api.graphql.schema.type.PushNotificationPreferencesInput pushNotificationPreferencesInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            pushNotificationPreferencesInput = getPushNotificationPreferencesQuery.input;
        }
        return getPushNotificationPreferencesQuery.copy(pushNotificationPreferencesInput);
    }
}
