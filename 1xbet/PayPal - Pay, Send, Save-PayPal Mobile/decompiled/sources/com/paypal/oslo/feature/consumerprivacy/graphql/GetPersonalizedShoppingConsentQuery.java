package com.paypal.oslo.feature.consumerprivacy.graphql;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004!\"# B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetPersonalizedShoppingConsentQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetPersonalizedShoppingConsentQuery$Data;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "Companion", "Data", "PrivacySetting", "PersonalizedShopping"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GetPersonalizedShoppingConsentQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.consumerprivacy.graphql.GetPersonalizedShoppingConsentQuery.Data> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.consumerprivacy.graphql.GetPersonalizedShoppingConsentQuery.Companion INSTANCE = new com.paypal.oslo.feature.consumerprivacy.graphql.GetPersonalizedShoppingConsentQuery.Companion(null);
    public static final java.lang.String OPERATION_ID = "c7ea30f24bb9900f421ca1b9bdd1bb9b2c5b7924f396fcebcc3aec9fdaba6ac9";
    public static final java.lang.String OPERATION_NAME = "GetPersonalizedShoppingConsent";

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
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.consumerprivacy.graphql.GetPersonalizedShoppingConsentQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.consumerprivacy.graphql.adapter.GetPersonalizedShoppingConsentQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.consumerprivacy.graphql.selections.GetPersonalizedShoppingConsentQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetPersonalizedShoppingConsentQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetPersonalizedShoppingConsentQuery$PrivacySetting;", "privacySetting", "<init>", "(Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetPersonalizedShoppingConsentQuery$PrivacySetting;)V", "component1", "()Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetPersonalizedShoppingConsentQuery$PrivacySetting;", "copy", "(Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetPersonalizedShoppingConsentQuery$PrivacySetting;)Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetPersonalizedShoppingConsentQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetPersonalizedShoppingConsentQuery$PrivacySetting;", "getPrivacySetting"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.consumerprivacy.graphql.GetPersonalizedShoppingConsentQuery.PrivacySetting privacySetting;

        public Data(com.paypal.oslo.feature.consumerprivacy.graphql.GetPersonalizedShoppingConsentQuery.PrivacySetting privacySetting) {
            this.privacySetting = privacySetting;
        }

        public final com.paypal.oslo.feature.consumerprivacy.graphql.GetPersonalizedShoppingConsentQuery.PrivacySetting getPrivacySetting() {
            return this.privacySetting;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.consumerprivacy.graphql.GetPersonalizedShoppingConsentQuery.PrivacySetting privacySetting = this.privacySetting;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(privacySetting=");
            sb.append(privacySetting);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.consumerprivacy.graphql.GetPersonalizedShoppingConsentQuery.PrivacySetting privacySetting = this.privacySetting;
            if (privacySetting == null) {
                return 0;
            }
            return privacySetting.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.consumerprivacy.graphql.GetPersonalizedShoppingConsentQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.privacySetting, ((com.paypal.oslo.feature.consumerprivacy.graphql.GetPersonalizedShoppingConsentQuery.Data) other).privacySetting);
        }

        public final com.paypal.oslo.feature.consumerprivacy.graphql.GetPersonalizedShoppingConsentQuery.Data copy(com.paypal.oslo.feature.consumerprivacy.graphql.GetPersonalizedShoppingConsentQuery.PrivacySetting privacySetting) {
            return new com.paypal.oslo.feature.consumerprivacy.graphql.GetPersonalizedShoppingConsentQuery.Data(privacySetting);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.consumerprivacy.graphql.GetPersonalizedShoppingConsentQuery.PrivacySetting getPrivacySetting() {
            return this.privacySetting;
        }

        public static /* synthetic */ com.paypal.oslo.feature.consumerprivacy.graphql.GetPersonalizedShoppingConsentQuery.Data copy$default(com.paypal.oslo.feature.consumerprivacy.graphql.GetPersonalizedShoppingConsentQuery.Data data, com.paypal.oslo.feature.consumerprivacy.graphql.GetPersonalizedShoppingConsentQuery.PrivacySetting privacySetting, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                privacySetting = data.privacySetting;
            }
            return data.copy(privacySetting);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetPersonalizedShoppingConsentQuery$PrivacySetting;", "", "Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetPersonalizedShoppingConsentQuery$PersonalizedShopping;", "personalizedShopping", "<init>", "(Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetPersonalizedShoppingConsentQuery$PersonalizedShopping;)V", "component1", "()Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetPersonalizedShoppingConsentQuery$PersonalizedShopping;", "copy", "(Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetPersonalizedShoppingConsentQuery$PersonalizedShopping;)Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetPersonalizedShoppingConsentQuery$PrivacySetting;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetPersonalizedShoppingConsentQuery$PersonalizedShopping;", "getPersonalizedShopping"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PrivacySetting {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.consumerprivacy.graphql.GetPersonalizedShoppingConsentQuery.PersonalizedShopping personalizedShopping;

        public PrivacySetting(com.paypal.oslo.feature.consumerprivacy.graphql.GetPersonalizedShoppingConsentQuery.PersonalizedShopping personalizedShopping) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(personalizedShopping, "");
            this.personalizedShopping = personalizedShopping;
        }

        public final com.paypal.oslo.feature.consumerprivacy.graphql.GetPersonalizedShoppingConsentQuery.PersonalizedShopping getPersonalizedShopping() {
            return this.personalizedShopping;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.consumerprivacy.graphql.GetPersonalizedShoppingConsentQuery.PersonalizedShopping personalizedShopping = this.personalizedShopping;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PrivacySetting(personalizedShopping=");
            sb.append(personalizedShopping);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.personalizedShopping.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.consumerprivacy.graphql.GetPersonalizedShoppingConsentQuery.PrivacySetting) && kotlin.jvm.internal.Intrinsics.areEqual(this.personalizedShopping, ((com.paypal.oslo.feature.consumerprivacy.graphql.GetPersonalizedShoppingConsentQuery.PrivacySetting) other).personalizedShopping);
        }

        public final com.paypal.oslo.feature.consumerprivacy.graphql.GetPersonalizedShoppingConsentQuery.PrivacySetting copy(com.paypal.oslo.feature.consumerprivacy.graphql.GetPersonalizedShoppingConsentQuery.PersonalizedShopping personalizedShopping) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(personalizedShopping, "");
            return new com.paypal.oslo.feature.consumerprivacy.graphql.GetPersonalizedShoppingConsentQuery.PrivacySetting(personalizedShopping);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.consumerprivacy.graphql.GetPersonalizedShoppingConsentQuery.PersonalizedShopping getPersonalizedShopping() {
            return this.personalizedShopping;
        }

        public static /* synthetic */ com.paypal.oslo.feature.consumerprivacy.graphql.GetPersonalizedShoppingConsentQuery.PrivacySetting copy$default(com.paypal.oslo.feature.consumerprivacy.graphql.GetPersonalizedShoppingConsentQuery.PrivacySetting privacySetting, com.paypal.oslo.feature.consumerprivacy.graphql.GetPersonalizedShoppingConsentQuery.PersonalizedShopping personalizedShopping, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                personalizedShopping = privacySetting.personalizedShopping;
            }
            return privacySetting.copy(personalizedShopping);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J<\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b!\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetPersonalizedShoppingConsentQuery$PersonalizedShopping;", "", "", com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.TRACKING_CONSENT_KEY, "Lcom/paypal/oslo/api/graphql/schema/type/ConsentType;", "consentType", "", "subjectState", "dataUsageDate", "<init>", "(ZLcom/paypal/oslo/api/graphql/schema/type/ConsentType;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Z", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/ConsentType;", "component3", "()Ljava/lang/String;", "component4", "copy", "(ZLcom/paypal/oslo/api/graphql/schema/type/ConsentType;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetPersonalizedShoppingConsentQuery$PersonalizedShopping;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Z", "getConsent", "Lcom/paypal/oslo/api/graphql/schema/type/ConsentType;", "getConsentType", "Ljava/lang/String;", "getSubjectState", "getDataUsageDate"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PersonalizedShopping {
        public static final int $stable = 0;
        private final boolean consent;
        private final com.paypal.oslo.api.graphql.schema.type.ConsentType consentType;
        private final java.lang.String dataUsageDate;
        private final java.lang.String subjectState;

        public PersonalizedShopping(boolean z, com.paypal.oslo.api.graphql.schema.type.ConsentType consentType, java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consentType, "");
            this.consent = z;
            this.consentType = consentType;
            this.subjectState = str;
            this.dataUsageDate = str2;
        }

        public final boolean getConsent() {
            return this.consent;
        }

        public final com.paypal.oslo.api.graphql.schema.type.ConsentType getConsentType() {
            return this.consentType;
        }

        public final java.lang.String getSubjectState() {
            return this.subjectState;
        }

        public final java.lang.String getDataUsageDate() {
            return this.dataUsageDate;
        }

        public final java.lang.String toString() {
            boolean z = this.consent;
            com.paypal.oslo.api.graphql.schema.type.ConsentType consentType = this.consentType;
            java.lang.String str = this.subjectState;
            java.lang.String str2 = this.dataUsageDate;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PersonalizedShopping(consent=");
            sb.append(z);
            sb.append(", consentType=");
            sb.append(consentType);
            sb.append(", subjectState=");
            sb.append(str);
            sb.append(", dataUsageDate=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = java.lang.Boolean.hashCode(this.consent);
            int hashCode2 = this.consentType.hashCode();
            java.lang.String str = this.subjectState;
            int hashCode3 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.dataUsageDate;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.consumerprivacy.graphql.GetPersonalizedShoppingConsentQuery.PersonalizedShopping)) {
                return false;
            }
            com.paypal.oslo.feature.consumerprivacy.graphql.GetPersonalizedShoppingConsentQuery.PersonalizedShopping personalizedShopping = (com.paypal.oslo.feature.consumerprivacy.graphql.GetPersonalizedShoppingConsentQuery.PersonalizedShopping) other;
            return this.consent == personalizedShopping.consent && this.consentType == personalizedShopping.consentType && kotlin.jvm.internal.Intrinsics.areEqual(this.subjectState, personalizedShopping.subjectState) && kotlin.jvm.internal.Intrinsics.areEqual(this.dataUsageDate, personalizedShopping.dataUsageDate);
        }

        public final com.paypal.oslo.feature.consumerprivacy.graphql.GetPersonalizedShoppingConsentQuery.PersonalizedShopping copy(boolean consent, com.paypal.oslo.api.graphql.schema.type.ConsentType consentType, java.lang.String subjectState, java.lang.String dataUsageDate) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consentType, "");
            return new com.paypal.oslo.feature.consumerprivacy.graphql.GetPersonalizedShoppingConsentQuery.PersonalizedShopping(consent, consentType, subjectState, dataUsageDate);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getDataUsageDate() {
            return this.dataUsageDate;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getSubjectState() {
            return this.subjectState;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.ConsentType getConsentType() {
            return this.consentType;
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getConsent() {
            return this.consent;
        }

        public static /* synthetic */ com.paypal.oslo.feature.consumerprivacy.graphql.GetPersonalizedShoppingConsentQuery.PersonalizedShopping copy$default(com.paypal.oslo.feature.consumerprivacy.graphql.GetPersonalizedShoppingConsentQuery.PersonalizedShopping personalizedShopping, boolean z, com.paypal.oslo.api.graphql.schema.type.ConsentType consentType, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = personalizedShopping.consent;
            }
            if ((i & 2) != 0) {
                consentType = personalizedShopping.consentType;
            }
            if ((i & 4) != 0) {
                str = personalizedShopping.subjectState;
            }
            if ((i & 8) != 0) {
                str2 = personalizedShopping.dataUsageDate;
            }
            return personalizedShopping.copy(z, consentType, str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetPersonalizedShoppingConsentQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetPersonalizedShoppingConsent { privacySetting { personalizedShopping { consent consentType subjectState dataUsageDate } } }";
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
