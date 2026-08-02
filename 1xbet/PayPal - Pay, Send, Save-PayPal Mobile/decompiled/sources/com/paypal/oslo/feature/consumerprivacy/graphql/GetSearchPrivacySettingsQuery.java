package com.paypal.oslo.feature.consumerprivacy.graphql;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0007!\"#$%& B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetSearchPrivacySettingsQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetSearchPrivacySettingsQuery$Data;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "Companion", "Data", "PrivacySetting", "SearchPrivacy", "Granular", "Simplified", "Common"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GetSearchPrivacySettingsQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Data> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Companion INSTANCE = new com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Companion(null);
    public static final java.lang.String OPERATION_ID = "289450dc21364bb21a1dd1f807241dcf5a004cd7e4a014da459c52782a8cabd6";
    public static final java.lang.String OPERATION_NAME = "GetSearchPrivacySettings";

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
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.consumerprivacy.graphql.adapter.GetSearchPrivacySettingsQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.consumerprivacy.graphql.selections.GetSearchPrivacySettingsQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetSearchPrivacySettingsQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetSearchPrivacySettingsQuery$PrivacySetting;", "privacySetting", "<init>", "(Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetSearchPrivacySettingsQuery$PrivacySetting;)V", "component1", "()Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetSearchPrivacySettingsQuery$PrivacySetting;", "copy", "(Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetSearchPrivacySettingsQuery$PrivacySetting;)Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetSearchPrivacySettingsQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetSearchPrivacySettingsQuery$PrivacySetting;", "getPrivacySetting"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.PrivacySetting privacySetting;

        public Data(com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.PrivacySetting privacySetting) {
            this.privacySetting = privacySetting;
        }

        public final com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.PrivacySetting getPrivacySetting() {
            return this.privacySetting;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.PrivacySetting privacySetting = this.privacySetting;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(privacySetting=");
            sb.append(privacySetting);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.PrivacySetting privacySetting = this.privacySetting;
            if (privacySetting == null) {
                return 0;
            }
            return privacySetting.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.privacySetting, ((com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Data) other).privacySetting);
        }

        public final com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Data copy(com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.PrivacySetting privacySetting) {
            return new com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Data(privacySetting);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.PrivacySetting getPrivacySetting() {
            return this.privacySetting;
        }

        public static /* synthetic */ com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Data copy$default(com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Data data, com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.PrivacySetting privacySetting, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                privacySetting = data.privacySetting;
            }
            return data.copy(privacySetting);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetSearchPrivacySettingsQuery$PrivacySetting;", "", "Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetSearchPrivacySettingsQuery$SearchPrivacy;", "searchPrivacy", "<init>", "(Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetSearchPrivacySettingsQuery$SearchPrivacy;)V", "component1", "()Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetSearchPrivacySettingsQuery$SearchPrivacy;", "copy", "(Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetSearchPrivacySettingsQuery$SearchPrivacy;)Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetSearchPrivacySettingsQuery$PrivacySetting;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetSearchPrivacySettingsQuery$SearchPrivacy;", "getSearchPrivacy"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PrivacySetting {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.SearchPrivacy searchPrivacy;

        public PrivacySetting(com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.SearchPrivacy searchPrivacy) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(searchPrivacy, "");
            this.searchPrivacy = searchPrivacy;
        }

        public final com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.SearchPrivacy getSearchPrivacy() {
            return this.searchPrivacy;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.SearchPrivacy searchPrivacy = this.searchPrivacy;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PrivacySetting(searchPrivacy=");
            sb.append(searchPrivacy);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.searchPrivacy.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.PrivacySetting) && kotlin.jvm.internal.Intrinsics.areEqual(this.searchPrivacy, ((com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.PrivacySetting) other).searchPrivacy);
        }

        public final com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.PrivacySetting copy(com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.SearchPrivacy searchPrivacy) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(searchPrivacy, "");
            return new com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.PrivacySetting(searchPrivacy);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.SearchPrivacy getSearchPrivacy() {
            return this.searchPrivacy;
        }

        public static /* synthetic */ com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.PrivacySetting copy$default(com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.PrivacySetting privacySetting, com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.SearchPrivacy searchPrivacy, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                searchPrivacy = privacySetting.searchPrivacy;
            }
            return privacySetting.copy(searchPrivacy);
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JH\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b,\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetSearchPrivacySettingsQuery$SearchPrivacy;", "", "Lcom/paypal/oslo/api/graphql/schema/type/SearchPolicyType;", "searchPolicy", "", "searchEligible", "Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetSearchPrivacySettingsQuery$Granular;", "granular", "Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetSearchPrivacySettingsQuery$Simplified;", "simplified", "Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetSearchPrivacySettingsQuery$Common;", "common", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/SearchPolicyType;ZLcom/paypal/oslo/feature/consumerprivacy/graphql/GetSearchPrivacySettingsQuery$Granular;Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetSearchPrivacySettingsQuery$Simplified;Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetSearchPrivacySettingsQuery$Common;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/SearchPolicyType;", "component2", "()Z", "component3", "()Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetSearchPrivacySettingsQuery$Granular;", "component4", "()Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetSearchPrivacySettingsQuery$Simplified;", "component5", "()Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetSearchPrivacySettingsQuery$Common;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/SearchPolicyType;ZLcom/paypal/oslo/feature/consumerprivacy/graphql/GetSearchPrivacySettingsQuery$Granular;Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetSearchPrivacySettingsQuery$Simplified;Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetSearchPrivacySettingsQuery$Common;)Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetSearchPrivacySettingsQuery$SearchPrivacy;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/SearchPolicyType;", "getSearchPolicy", "Z", "getSearchEligible", "Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetSearchPrivacySettingsQuery$Granular;", "getGranular", "Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetSearchPrivacySettingsQuery$Simplified;", "getSimplified", "Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetSearchPrivacySettingsQuery$Common;", "getCommon"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SearchPrivacy {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Common common;
        private final com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Granular granular;
        private final boolean searchEligible;
        private final com.paypal.oslo.api.graphql.schema.type.SearchPolicyType searchPolicy;
        private final com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Simplified simplified;

        public SearchPrivacy(com.paypal.oslo.api.graphql.schema.type.SearchPolicyType searchPolicyType, boolean z, com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Granular granular, com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Simplified simplified, com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Common common2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(searchPolicyType, "");
            this.searchPolicy = searchPolicyType;
            this.searchEligible = z;
            this.granular = granular;
            this.simplified = simplified;
            this.common = common2;
        }

        public final com.paypal.oslo.api.graphql.schema.type.SearchPolicyType getSearchPolicy() {
            return this.searchPolicy;
        }

        public final boolean getSearchEligible() {
            return this.searchEligible;
        }

        public final com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Granular getGranular() {
            return this.granular;
        }

        public final com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Simplified getSimplified() {
            return this.simplified;
        }

        public final com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Common getCommon() {
            return this.common;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.SearchPolicyType searchPolicyType = this.searchPolicy;
            boolean z = this.searchEligible;
            com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Granular granular = this.granular;
            com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Simplified simplified = this.simplified;
            com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Common common2 = this.common;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SearchPrivacy(searchPolicy=");
            sb.append(searchPolicyType);
            sb.append(", searchEligible=");
            sb.append(z);
            sb.append(", granular=");
            sb.append(granular);
            sb.append(", simplified=");
            sb.append(simplified);
            sb.append(", common=");
            sb.append(common2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.searchPolicy.hashCode();
            int hashCode2 = java.lang.Boolean.hashCode(this.searchEligible);
            com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Granular granular = this.granular;
            int hashCode3 = granular == null ? 0 : granular.hashCode();
            com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Simplified simplified = this.simplified;
            int hashCode4 = simplified == null ? 0 : simplified.hashCode();
            com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Common common2 = this.common;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (common2 != null ? common2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.SearchPrivacy)) {
                return false;
            }
            com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.SearchPrivacy searchPrivacy = (com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.SearchPrivacy) other;
            return this.searchPolicy == searchPrivacy.searchPolicy && this.searchEligible == searchPrivacy.searchEligible && kotlin.jvm.internal.Intrinsics.areEqual(this.granular, searchPrivacy.granular) && kotlin.jvm.internal.Intrinsics.areEqual(this.simplified, searchPrivacy.simplified) && kotlin.jvm.internal.Intrinsics.areEqual(this.common, searchPrivacy.common);
        }

        public final com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.SearchPrivacy copy(com.paypal.oslo.api.graphql.schema.type.SearchPolicyType searchPolicy, boolean searchEligible, com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Granular granular, com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Simplified simplified, com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Common common2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(searchPolicy, "");
            return new com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.SearchPrivacy(searchPolicy, searchEligible, granular, simplified, common2);
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Common getCommon() {
            return this.common;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Simplified getSimplified() {
            return this.simplified;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Granular getGranular() {
            return this.granular;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getSearchEligible() {
            return this.searchEligible;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.SearchPolicyType getSearchPolicy() {
            return this.searchPolicy;
        }

        public static /* synthetic */ com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.SearchPrivacy copy$default(com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.SearchPrivacy searchPrivacy, com.paypal.oslo.api.graphql.schema.type.SearchPolicyType searchPolicyType, boolean z, com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Granular granular, com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Simplified simplified, com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Common common2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                searchPolicyType = searchPrivacy.searchPolicy;
            }
            if ((i & 2) != 0) {
                z = searchPrivacy.searchEligible;
            }
            boolean z2 = z;
            if ((i & 4) != 0) {
                granular = searchPrivacy.granular;
            }
            com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Granular granular2 = granular;
            if ((i & 8) != 0) {
                simplified = searchPrivacy.simplified;
            }
            com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Simplified simplified2 = simplified;
            if ((i & 16) != 0) {
                common2 = searchPrivacy.common;
            }
            return searchPrivacy.copy(searchPolicyType, z2, granular2, simplified2, common2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000eJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000eJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000eJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000eJp\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b$\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b%\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b&\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b'\u0010\u000eR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b(\u0010\u000eR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b)\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetSearchPrivacySettingsQuery$Granular;", "", "", "allowRequestMoneyByEmail", "allowRequestMoneyByPhone", "allowRequestMoneyByName", "allowRequestMoneyByUsername", "allowSendMoneyByEmail", "allowSendMoneyByPhone", "allowSendMoneyByName", "allowSendMoneyByUsername", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/Boolean;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetSearchPrivacySettingsQuery$Granular;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "getAllowRequestMoneyByEmail", "getAllowRequestMoneyByPhone", "getAllowRequestMoneyByName", "getAllowRequestMoneyByUsername", "getAllowSendMoneyByEmail", "getAllowSendMoneyByPhone", "getAllowSendMoneyByName", "getAllowSendMoneyByUsername"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Granular {
        public static final int $stable = 0;
        private final java.lang.Boolean allowRequestMoneyByEmail;
        private final java.lang.Boolean allowRequestMoneyByName;
        private final java.lang.Boolean allowRequestMoneyByPhone;
        private final java.lang.Boolean allowRequestMoneyByUsername;
        private final java.lang.Boolean allowSendMoneyByEmail;
        private final java.lang.Boolean allowSendMoneyByName;
        private final java.lang.Boolean allowSendMoneyByPhone;
        private final java.lang.Boolean allowSendMoneyByUsername;

        public Granular(java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Boolean bool3, java.lang.Boolean bool4, java.lang.Boolean bool5, java.lang.Boolean bool6, java.lang.Boolean bool7, java.lang.Boolean bool8) {
            this.allowRequestMoneyByEmail = bool;
            this.allowRequestMoneyByPhone = bool2;
            this.allowRequestMoneyByName = bool3;
            this.allowRequestMoneyByUsername = bool4;
            this.allowSendMoneyByEmail = bool5;
            this.allowSendMoneyByPhone = bool6;
            this.allowSendMoneyByName = bool7;
            this.allowSendMoneyByUsername = bool8;
        }

        public final java.lang.Boolean getAllowRequestMoneyByEmail() {
            return this.allowRequestMoneyByEmail;
        }

        public final java.lang.Boolean getAllowRequestMoneyByPhone() {
            return this.allowRequestMoneyByPhone;
        }

        public final java.lang.Boolean getAllowRequestMoneyByName() {
            return this.allowRequestMoneyByName;
        }

        public final java.lang.Boolean getAllowRequestMoneyByUsername() {
            return this.allowRequestMoneyByUsername;
        }

        public final java.lang.Boolean getAllowSendMoneyByEmail() {
            return this.allowSendMoneyByEmail;
        }

        public final java.lang.Boolean getAllowSendMoneyByPhone() {
            return this.allowSendMoneyByPhone;
        }

        public final java.lang.Boolean getAllowSendMoneyByName() {
            return this.allowSendMoneyByName;
        }

        public final java.lang.Boolean getAllowSendMoneyByUsername() {
            return this.allowSendMoneyByUsername;
        }

        public final java.lang.String toString() {
            java.lang.Boolean bool = this.allowRequestMoneyByEmail;
            java.lang.Boolean bool2 = this.allowRequestMoneyByPhone;
            java.lang.Boolean bool3 = this.allowRequestMoneyByName;
            java.lang.Boolean bool4 = this.allowRequestMoneyByUsername;
            java.lang.Boolean bool5 = this.allowSendMoneyByEmail;
            java.lang.Boolean bool6 = this.allowSendMoneyByPhone;
            java.lang.Boolean bool7 = this.allowSendMoneyByName;
            java.lang.Boolean bool8 = this.allowSendMoneyByUsername;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Granular(allowRequestMoneyByEmail=");
            sb.append(bool);
            sb.append(", allowRequestMoneyByPhone=");
            sb.append(bool2);
            sb.append(", allowRequestMoneyByName=");
            sb.append(bool3);
            sb.append(", allowRequestMoneyByUsername=");
            sb.append(bool4);
            sb.append(", allowSendMoneyByEmail=");
            sb.append(bool5);
            sb.append(", allowSendMoneyByPhone=");
            sb.append(bool6);
            sb.append(", allowSendMoneyByName=");
            sb.append(bool7);
            sb.append(", allowSendMoneyByUsername=");
            sb.append(bool8);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Boolean bool = this.allowRequestMoneyByEmail;
            int hashCode = bool == null ? 0 : bool.hashCode();
            java.lang.Boolean bool2 = this.allowRequestMoneyByPhone;
            int hashCode2 = bool2 == null ? 0 : bool2.hashCode();
            java.lang.Boolean bool3 = this.allowRequestMoneyByName;
            int hashCode3 = bool3 == null ? 0 : bool3.hashCode();
            java.lang.Boolean bool4 = this.allowRequestMoneyByUsername;
            int hashCode4 = bool4 == null ? 0 : bool4.hashCode();
            java.lang.Boolean bool5 = this.allowSendMoneyByEmail;
            int hashCode5 = bool5 == null ? 0 : bool5.hashCode();
            java.lang.Boolean bool6 = this.allowSendMoneyByPhone;
            int hashCode6 = bool6 == null ? 0 : bool6.hashCode();
            java.lang.Boolean bool7 = this.allowSendMoneyByName;
            int hashCode7 = bool7 == null ? 0 : bool7.hashCode();
            java.lang.Boolean bool8 = this.allowSendMoneyByUsername;
            return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (bool8 != null ? bool8.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Granular)) {
                return false;
            }
            com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Granular granular = (com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Granular) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.allowRequestMoneyByEmail, granular.allowRequestMoneyByEmail) && kotlin.jvm.internal.Intrinsics.areEqual(this.allowRequestMoneyByPhone, granular.allowRequestMoneyByPhone) && kotlin.jvm.internal.Intrinsics.areEqual(this.allowRequestMoneyByName, granular.allowRequestMoneyByName) && kotlin.jvm.internal.Intrinsics.areEqual(this.allowRequestMoneyByUsername, granular.allowRequestMoneyByUsername) && kotlin.jvm.internal.Intrinsics.areEqual(this.allowSendMoneyByEmail, granular.allowSendMoneyByEmail) && kotlin.jvm.internal.Intrinsics.areEqual(this.allowSendMoneyByPhone, granular.allowSendMoneyByPhone) && kotlin.jvm.internal.Intrinsics.areEqual(this.allowSendMoneyByName, granular.allowSendMoneyByName) && kotlin.jvm.internal.Intrinsics.areEqual(this.allowSendMoneyByUsername, granular.allowSendMoneyByUsername);
        }

        public final com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Granular copy(java.lang.Boolean allowRequestMoneyByEmail, java.lang.Boolean allowRequestMoneyByPhone, java.lang.Boolean allowRequestMoneyByName, java.lang.Boolean allowRequestMoneyByUsername, java.lang.Boolean allowSendMoneyByEmail, java.lang.Boolean allowSendMoneyByPhone, java.lang.Boolean allowSendMoneyByName, java.lang.Boolean allowSendMoneyByUsername) {
            return new com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Granular(allowRequestMoneyByEmail, allowRequestMoneyByPhone, allowRequestMoneyByName, allowRequestMoneyByUsername, allowSendMoneyByEmail, allowSendMoneyByPhone, allowSendMoneyByName, allowSendMoneyByUsername);
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.Boolean getAllowSendMoneyByUsername() {
            return this.allowSendMoneyByUsername;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.Boolean getAllowSendMoneyByName() {
            return this.allowSendMoneyByName;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.Boolean getAllowSendMoneyByPhone() {
            return this.allowSendMoneyByPhone;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.Boolean getAllowSendMoneyByEmail() {
            return this.allowSendMoneyByEmail;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Boolean getAllowRequestMoneyByUsername() {
            return this.allowRequestMoneyByUsername;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Boolean getAllowRequestMoneyByName() {
            return this.allowRequestMoneyByName;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Boolean getAllowRequestMoneyByPhone() {
            return this.allowRequestMoneyByPhone;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Boolean getAllowRequestMoneyByEmail() {
            return this.allowRequestMoneyByEmail;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJX\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b!\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b$\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b%\u0010\rR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b&\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetSearchPrivacySettingsQuery$Simplified;", "", "", "allowFindByIdentifiers", "allowPaymentRequests", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentRequestsFromType;", "paymentRequestsFrom", "allowFindByName", "allowFindByUsername", "allowFindByEmailAndPhone", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/paypal/oslo/api/graphql/schema/type/PaymentRequestsFromType;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/Boolean;", "component2", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/PaymentRequestsFromType;", "component4", "component5", "component6", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/paypal/oslo/api/graphql/schema/type/PaymentRequestsFromType;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetSearchPrivacySettingsQuery$Simplified;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "getAllowFindByIdentifiers", "getAllowPaymentRequests", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentRequestsFromType;", "getPaymentRequestsFrom", "getAllowFindByName", "getAllowFindByUsername", "getAllowFindByEmailAndPhone"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Simplified {
        public static final int $stable = 0;
        private final java.lang.Boolean allowFindByEmailAndPhone;
        private final java.lang.Boolean allowFindByIdentifiers;
        private final java.lang.Boolean allowFindByName;
        private final java.lang.Boolean allowFindByUsername;
        private final java.lang.Boolean allowPaymentRequests;
        private final com.paypal.oslo.api.graphql.schema.type.PaymentRequestsFromType paymentRequestsFrom;

        public Simplified(java.lang.Boolean bool, java.lang.Boolean bool2, com.paypal.oslo.api.graphql.schema.type.PaymentRequestsFromType paymentRequestsFromType, java.lang.Boolean bool3, java.lang.Boolean bool4, java.lang.Boolean bool5) {
            this.allowFindByIdentifiers = bool;
            this.allowPaymentRequests = bool2;
            this.paymentRequestsFrom = paymentRequestsFromType;
            this.allowFindByName = bool3;
            this.allowFindByUsername = bool4;
            this.allowFindByEmailAndPhone = bool5;
        }

        public final java.lang.Boolean getAllowFindByIdentifiers() {
            return this.allowFindByIdentifiers;
        }

        public final java.lang.Boolean getAllowPaymentRequests() {
            return this.allowPaymentRequests;
        }

        public final com.paypal.oslo.api.graphql.schema.type.PaymentRequestsFromType getPaymentRequestsFrom() {
            return this.paymentRequestsFrom;
        }

        public final java.lang.Boolean getAllowFindByName() {
            return this.allowFindByName;
        }

        public final java.lang.Boolean getAllowFindByUsername() {
            return this.allowFindByUsername;
        }

        public final java.lang.Boolean getAllowFindByEmailAndPhone() {
            return this.allowFindByEmailAndPhone;
        }

        public final java.lang.String toString() {
            java.lang.Boolean bool = this.allowFindByIdentifiers;
            java.lang.Boolean bool2 = this.allowPaymentRequests;
            com.paypal.oslo.api.graphql.schema.type.PaymentRequestsFromType paymentRequestsFromType = this.paymentRequestsFrom;
            java.lang.Boolean bool3 = this.allowFindByName;
            java.lang.Boolean bool4 = this.allowFindByUsername;
            java.lang.Boolean bool5 = this.allowFindByEmailAndPhone;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Simplified(allowFindByIdentifiers=");
            sb.append(bool);
            sb.append(", allowPaymentRequests=");
            sb.append(bool2);
            sb.append(", paymentRequestsFrom=");
            sb.append(paymentRequestsFromType);
            sb.append(", allowFindByName=");
            sb.append(bool3);
            sb.append(", allowFindByUsername=");
            sb.append(bool4);
            sb.append(", allowFindByEmailAndPhone=");
            sb.append(bool5);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Boolean bool = this.allowFindByIdentifiers;
            int hashCode = bool == null ? 0 : bool.hashCode();
            java.lang.Boolean bool2 = this.allowPaymentRequests;
            int hashCode2 = bool2 == null ? 0 : bool2.hashCode();
            com.paypal.oslo.api.graphql.schema.type.PaymentRequestsFromType paymentRequestsFromType = this.paymentRequestsFrom;
            int hashCode3 = paymentRequestsFromType == null ? 0 : paymentRequestsFromType.hashCode();
            java.lang.Boolean bool3 = this.allowFindByName;
            int hashCode4 = bool3 == null ? 0 : bool3.hashCode();
            java.lang.Boolean bool4 = this.allowFindByUsername;
            int hashCode5 = bool4 == null ? 0 : bool4.hashCode();
            java.lang.Boolean bool5 = this.allowFindByEmailAndPhone;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (bool5 != null ? bool5.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Simplified)) {
                return false;
            }
            com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Simplified simplified = (com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Simplified) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.allowFindByIdentifiers, simplified.allowFindByIdentifiers) && kotlin.jvm.internal.Intrinsics.areEqual(this.allowPaymentRequests, simplified.allowPaymentRequests) && this.paymentRequestsFrom == simplified.paymentRequestsFrom && kotlin.jvm.internal.Intrinsics.areEqual(this.allowFindByName, simplified.allowFindByName) && kotlin.jvm.internal.Intrinsics.areEqual(this.allowFindByUsername, simplified.allowFindByUsername) && kotlin.jvm.internal.Intrinsics.areEqual(this.allowFindByEmailAndPhone, simplified.allowFindByEmailAndPhone);
        }

        public final com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Simplified copy(java.lang.Boolean allowFindByIdentifiers, java.lang.Boolean allowPaymentRequests, com.paypal.oslo.api.graphql.schema.type.PaymentRequestsFromType paymentRequestsFrom, java.lang.Boolean allowFindByName, java.lang.Boolean allowFindByUsername, java.lang.Boolean allowFindByEmailAndPhone) {
            return new com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Simplified(allowFindByIdentifiers, allowPaymentRequests, paymentRequestsFrom, allowFindByName, allowFindByUsername, allowFindByEmailAndPhone);
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.Boolean getAllowFindByEmailAndPhone() {
            return this.allowFindByEmailAndPhone;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.Boolean getAllowFindByUsername() {
            return this.allowFindByUsername;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Boolean getAllowFindByName() {
            return this.allowFindByName;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.PaymentRequestsFromType getPaymentRequestsFrom() {
            return this.paymentRequestsFrom;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Boolean getAllowPaymentRequests() {
            return this.allowPaymentRequests;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Boolean getAllowFindByIdentifiers() {
            return this.allowFindByIdentifiers;
        }

        public static /* synthetic */ com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Simplified copy$default(com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Simplified simplified, java.lang.Boolean bool, java.lang.Boolean bool2, com.paypal.oslo.api.graphql.schema.type.PaymentRequestsFromType paymentRequestsFromType, java.lang.Boolean bool3, java.lang.Boolean bool4, java.lang.Boolean bool5, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bool = simplified.allowFindByIdentifiers;
            }
            if ((i & 2) != 0) {
                bool2 = simplified.allowPaymentRequests;
            }
            java.lang.Boolean bool6 = bool2;
            if ((i & 4) != 0) {
                paymentRequestsFromType = simplified.paymentRequestsFrom;
            }
            com.paypal.oslo.api.graphql.schema.type.PaymentRequestsFromType paymentRequestsFromType2 = paymentRequestsFromType;
            if ((i & 8) != 0) {
                bool3 = simplified.allowFindByName;
            }
            java.lang.Boolean bool7 = bool3;
            if ((i & 16) != 0) {
                bool4 = simplified.allowFindByUsername;
            }
            java.lang.Boolean bool8 = bool4;
            if ((i & 32) != 0) {
                bool5 = simplified.allowFindByEmailAndPhone;
            }
            return simplified.copy(bool, bool6, paymentRequestsFromType2, bool7, bool8, bool5);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u001b\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetSearchPrivacySettingsQuery$Common;", "", "", "allowFindViaPayPalMe", "", "paypalMePersonalProfileId", "allowVenmoDiscovery", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/Boolean;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetSearchPrivacySettingsQuery$Common;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Boolean;", "getAllowFindViaPayPalMe", "Ljava/lang/String;", "getPaypalMePersonalProfileId", "getAllowVenmoDiscovery"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Common {
        public static final int $stable = 0;
        private final java.lang.Boolean allowFindViaPayPalMe;
        private final java.lang.Boolean allowVenmoDiscovery;
        private final java.lang.String paypalMePersonalProfileId;

        public Common(java.lang.Boolean bool, java.lang.String str, java.lang.Boolean bool2) {
            this.allowFindViaPayPalMe = bool;
            this.paypalMePersonalProfileId = str;
            this.allowVenmoDiscovery = bool2;
        }

        public final java.lang.Boolean getAllowFindViaPayPalMe() {
            return this.allowFindViaPayPalMe;
        }

        public final java.lang.String getPaypalMePersonalProfileId() {
            return this.paypalMePersonalProfileId;
        }

        public final java.lang.Boolean getAllowVenmoDiscovery() {
            return this.allowVenmoDiscovery;
        }

        public final java.lang.String toString() {
            java.lang.Boolean bool = this.allowFindViaPayPalMe;
            java.lang.String str = this.paypalMePersonalProfileId;
            java.lang.Boolean bool2 = this.allowVenmoDiscovery;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Common(allowFindViaPayPalMe=");
            sb.append(bool);
            sb.append(", paypalMePersonalProfileId=");
            sb.append(str);
            sb.append(", allowVenmoDiscovery=");
            sb.append(bool2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Boolean bool = this.allowFindViaPayPalMe;
            int hashCode = bool == null ? 0 : bool.hashCode();
            java.lang.String str = this.paypalMePersonalProfileId;
            int hashCode2 = str == null ? 0 : str.hashCode();
            java.lang.Boolean bool2 = this.allowVenmoDiscovery;
            return (((hashCode * 31) + hashCode2) * 31) + (bool2 != null ? bool2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Common)) {
                return false;
            }
            com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Common common2 = (com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Common) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.allowFindViaPayPalMe, common2.allowFindViaPayPalMe) && kotlin.jvm.internal.Intrinsics.areEqual(this.paypalMePersonalProfileId, common2.paypalMePersonalProfileId) && kotlin.jvm.internal.Intrinsics.areEqual(this.allowVenmoDiscovery, common2.allowVenmoDiscovery);
        }

        public final com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Common copy(java.lang.Boolean allowFindViaPayPalMe, java.lang.String paypalMePersonalProfileId, java.lang.Boolean allowVenmoDiscovery) {
            return new com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Common(allowFindViaPayPalMe, paypalMePersonalProfileId, allowVenmoDiscovery);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Boolean getAllowVenmoDiscovery() {
            return this.allowVenmoDiscovery;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getPaypalMePersonalProfileId() {
            return this.paypalMePersonalProfileId;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Boolean getAllowFindViaPayPalMe() {
            return this.allowFindViaPayPalMe;
        }

        public static /* synthetic */ com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Common copy$default(com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Common common2, java.lang.Boolean bool, java.lang.String str, java.lang.Boolean bool2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bool = common2.allowFindViaPayPalMe;
            }
            if ((i & 2) != 0) {
                str = common2.paypalMePersonalProfileId;
            }
            if ((i & 4) != 0) {
                bool2 = common2.allowVenmoDiscovery;
            }
            return common2.copy(bool, str, bool2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetSearchPrivacySettingsQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetSearchPrivacySettings { privacySetting { searchPrivacy { searchPolicy searchEligible granular { allowRequestMoneyByEmail allowRequestMoneyByPhone allowRequestMoneyByName allowRequestMoneyByUsername allowSendMoneyByEmail allowSendMoneyByPhone allowSendMoneyByName allowSendMoneyByUsername } simplified { allowFindByIdentifiers allowPaymentRequests paymentRequestsFrom allowFindByName allowFindByUsername allowFindByEmailAndPhone } common { allowFindViaPayPalMe paypalMePersonalProfileId allowVenmoDiscovery } } } }";
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
