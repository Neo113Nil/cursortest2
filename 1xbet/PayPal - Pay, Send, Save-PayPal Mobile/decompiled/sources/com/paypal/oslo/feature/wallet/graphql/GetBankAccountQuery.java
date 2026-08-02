package com.paypal.oslo.feature.wallet.graphql;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u0001:\b'()*+,-&B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\u0007J'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0007J\u001a\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b#\u0010\u0007R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetBankAccountQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/wallet/graphql/GetBankAccountQuery$Data;", "", "id", "<init>", "(Ljava/lang/String;)V", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/graphql/GetBankAccountQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Companion", "Data", "BankAccount", "Confirmation", "Issuer", "InstitutionImage", "Status", "Authorization"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class GetBankAccountQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Data> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Companion INSTANCE = new com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Companion(null);
    public static final java.lang.String OPERATION_ID = "701e4cfb5da3a4d184046fff710e158114cd3d2483580ba499b6798330a76c21";
    public static final java.lang.String OPERATION_NAME = "GetBankAccount";
    private final java.lang.String id;

    public GetBankAccountQuery(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.id = str;
    }

    public final java.lang.String getId() {
        return this.id;
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
        com.paypal.oslo.feature.wallet.graphql.adapter.GetBankAccountQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.wallet.graphql.adapter.GetBankAccountQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.wallet.graphql.selections.GetBankAccountQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetBankAccountQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/wallet/graphql/GetBankAccountQuery$BankAccount;", "bankAccount", "<init>", "(Lcom/paypal/oslo/feature/wallet/graphql/GetBankAccountQuery$BankAccount;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/graphql/GetBankAccountQuery$BankAccount;", "copy", "(Lcom/paypal/oslo/feature/wallet/graphql/GetBankAccountQuery$BankAccount;)Lcom/paypal/oslo/feature/wallet/graphql/GetBankAccountQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/graphql/GetBankAccountQuery$BankAccount;", "getBankAccount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.BankAccount bankAccount;

        public Data(com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.BankAccount bankAccount) {
            this.bankAccount = bankAccount;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.BankAccount getBankAccount() {
            return this.bankAccount;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.BankAccount bankAccount = this.bankAccount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(bankAccount=");
            sb.append(bankAccount);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.BankAccount bankAccount = this.bankAccount;
            if (bankAccount == null) {
                return 0;
            }
            return bankAccount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.bankAccount, ((com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Data) other).bankAccount);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Data copy(com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.BankAccount bankAccount) {
            return new com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Data(bankAccount);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.BankAccount getBankAccount() {
            return this.bankAccount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Data copy$default(com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Data data, com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.BankAccount bankAccount, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bankAccount = data.bankAccount;
            }
            return data.copy(bankAccount);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0018\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b+\u0010\"J\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010\u001dJ\u0012\u0010-\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b1\u00102J®\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÆ\u0001¢\u0006\u0004\b3\u00104J\u001a\u00106\u001a\u00020\r2\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b6\u00107J\u0010\u00109\u001a\u000208HÖ\u0001¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b;\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010<\u001a\u0004\b=\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010<\u001a\u0004\b>\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010?\u001a\u0004\b@\u0010 R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010A\u001a\u0004\bB\u0010\"R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010C\u001a\u0004\bD\u0010$R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010E\u001a\u0004\bF\u0010&R\u001a\u0010\u000e\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010G\u001a\u0004\b\u000e\u0010(R\u001a\u0010\u0010\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010H\u001a\u0004\bI\u0010*R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010A\u001a\u0004\bJ\u0010\"R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010<\u001a\u0004\bK\u0010\u001dR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010L\u001a\u0004\bM\u0010.R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010N\u001a\u0004\bO\u00100R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010P\u001a\u0004\bQ\u00102"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetBankAccountQuery$BankAccount;", "", "", "id", "lastNChars", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;", "type", "", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountAvailableAction;", "availableActions", "currencyCode", "Lcom/paypal/oslo/feature/wallet/graphql/GetBankAccountQuery$Confirmation;", "confirmation", "", "isSepaCompliant", "Lcom/paypal/oslo/feature/wallet/graphql/GetBankAccountQuery$Issuer;", "issuer", "Lcom/paypal/oslo/feature/wallet/graphql/GetBankAccountQuery$InstitutionImage;", "institutionImages", "nickname", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountOnboardingEntity;", "onboardingEntity", "Lcom/paypal/oslo/feature/wallet/graphql/GetBankAccountQuery$Status;", "status", "Lcom/paypal/oslo/feature/wallet/graphql/GetBankAccountQuery$Authorization;", "authorization", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;Ljava/util/List;Ljava/lang/Object;Lcom/paypal/oslo/feature/wallet/graphql/GetBankAccountQuery$Confirmation;ZLcom/paypal/oslo/feature/wallet/graphql/GetBankAccountQuery$Issuer;Ljava/util/List;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/BankAccountOnboardingEntity;Lcom/paypal/oslo/feature/wallet/graphql/GetBankAccountQuery$Status;Lcom/paypal/oslo/feature/wallet/graphql/GetBankAccountQuery$Authorization;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;", "component4", "()Ljava/util/List;", "component5", "()Ljava/lang/Object;", "component6", "()Lcom/paypal/oslo/feature/wallet/graphql/GetBankAccountQuery$Confirmation;", "component7", "()Z", "component8", "()Lcom/paypal/oslo/feature/wallet/graphql/GetBankAccountQuery$Issuer;", "component9", "component10", "component11", "()Lcom/paypal/oslo/api/graphql/schema/type/BankAccountOnboardingEntity;", "component12", "()Lcom/paypal/oslo/feature/wallet/graphql/GetBankAccountQuery$Status;", "component13", "()Lcom/paypal/oslo/feature/wallet/graphql/GetBankAccountQuery$Authorization;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;Ljava/util/List;Ljava/lang/Object;Lcom/paypal/oslo/feature/wallet/graphql/GetBankAccountQuery$Confirmation;ZLcom/paypal/oslo/feature/wallet/graphql/GetBankAccountQuery$Issuer;Ljava/util/List;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/BankAccountOnboardingEntity;Lcom/paypal/oslo/feature/wallet/graphql/GetBankAccountQuery$Status;Lcom/paypal/oslo/feature/wallet/graphql/GetBankAccountQuery$Authorization;)Lcom/paypal/oslo/feature/wallet/graphql/GetBankAccountQuery$BankAccount;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getLastNChars", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;", "getType", "Ljava/util/List;", "getAvailableActions", "Ljava/lang/Object;", "getCurrencyCode", "Lcom/paypal/oslo/feature/wallet/graphql/GetBankAccountQuery$Confirmation;", "getConfirmation", "Z", "Lcom/paypal/oslo/feature/wallet/graphql/GetBankAccountQuery$Issuer;", "getIssuer", "getInstitutionImages", "getNickname", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountOnboardingEntity;", "getOnboardingEntity", "Lcom/paypal/oslo/feature/wallet/graphql/GetBankAccountQuery$Status;", "getStatus", "Lcom/paypal/oslo/feature/wallet/graphql/GetBankAccountQuery$Authorization;", "getAuthorization"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BankAccount {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Authorization authorization;
        private final java.util.List<com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction> availableActions;
        private final com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Confirmation confirmation;
        private final java.lang.Object currencyCode;
        private final java.lang.String id;
        private final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.InstitutionImage> institutionImages;
        private final boolean isSepaCompliant;
        private final com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Issuer issuer;
        private final java.lang.String lastNChars;
        private final java.lang.String nickname;
        private final com.paypal.oslo.api.graphql.schema.type.BankAccountOnboardingEntity onboardingEntity;
        private final com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Status status;
        private final com.paypal.oslo.api.graphql.schema.type.BankAccountType type;

        /* JADX WARN: Multi-variable type inference failed */
        public BankAccount(java.lang.String str, java.lang.String str2, com.paypal.oslo.api.graphql.schema.type.BankAccountType bankAccountType, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction> list, java.lang.Object obj, com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Confirmation confirmation, boolean z, com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Issuer issuer, java.util.List<com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.InstitutionImage> list2, java.lang.String str3, com.paypal.oslo.api.graphql.schema.type.BankAccountOnboardingEntity bankAccountOnboardingEntity, com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Status status, com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Authorization authorization) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(issuer, "");
            this.id = str;
            this.lastNChars = str2;
            this.type = bankAccountType;
            this.availableActions = list;
            this.currencyCode = obj;
            this.confirmation = confirmation;
            this.isSepaCompliant = z;
            this.issuer = issuer;
            this.institutionImages = list2;
            this.nickname = str3;
            this.onboardingEntity = bankAccountOnboardingEntity;
            this.status = status;
            this.authorization = authorization;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getLastNChars() {
            return this.lastNChars;
        }

        public final com.paypal.oslo.api.graphql.schema.type.BankAccountType getType() {
            return this.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction> getAvailableActions() {
            return this.availableActions;
        }

        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Confirmation getConfirmation() {
            return this.confirmation;
        }

        public final boolean isSepaCompliant() {
            return this.isSepaCompliant;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Issuer getIssuer() {
            return this.issuer;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.InstitutionImage> getInstitutionImages() {
            return this.institutionImages;
        }

        public final java.lang.String getNickname() {
            return this.nickname;
        }

        public final com.paypal.oslo.api.graphql.schema.type.BankAccountOnboardingEntity getOnboardingEntity() {
            return this.onboardingEntity;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Status getStatus() {
            return this.status;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Authorization getAuthorization() {
            return this.authorization;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.lastNChars;
            com.paypal.oslo.api.graphql.schema.type.BankAccountType bankAccountType = this.type;
            java.util.List<com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction> list = this.availableActions;
            java.lang.Object obj = this.currencyCode;
            com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Confirmation confirmation = this.confirmation;
            boolean z = this.isSepaCompliant;
            com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Issuer issuer = this.issuer;
            java.util.List<com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.InstitutionImage> list2 = this.institutionImages;
            java.lang.String str3 = this.nickname;
            com.paypal.oslo.api.graphql.schema.type.BankAccountOnboardingEntity bankAccountOnboardingEntity = this.onboardingEntity;
            com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Status status = this.status;
            com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Authorization authorization = this.authorization;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BankAccount(id=");
            sb.append(str);
            sb.append(", lastNChars=");
            sb.append(str2);
            sb.append(", type=");
            sb.append(bankAccountType);
            sb.append(", availableActions=");
            sb.append(list);
            sb.append(", currencyCode=");
            sb.append(obj);
            sb.append(", confirmation=");
            sb.append(confirmation);
            sb.append(", isSepaCompliant=");
            sb.append(z);
            sb.append(", issuer=");
            sb.append(issuer);
            sb.append(", institutionImages=");
            sb.append(list2);
            sb.append(", nickname=");
            sb.append(str3);
            sb.append(", onboardingEntity=");
            sb.append(bankAccountOnboardingEntity);
            sb.append(", status=");
            sb.append(status);
            sb.append(", authorization=");
            sb.append(authorization);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            int hashCode2 = this.lastNChars.hashCode();
            int hashCode3 = this.type.hashCode();
            java.util.List<com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction> list = this.availableActions;
            int hashCode4 = list == null ? 0 : list.hashCode();
            java.lang.Object obj = this.currencyCode;
            int hashCode5 = obj == null ? 0 : obj.hashCode();
            com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Confirmation confirmation = this.confirmation;
            int hashCode6 = confirmation == null ? 0 : confirmation.hashCode();
            int hashCode7 = java.lang.Boolean.hashCode(this.isSepaCompliant);
            int hashCode8 = this.issuer.hashCode();
            java.util.List<com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.InstitutionImage> list2 = this.institutionImages;
            int hashCode9 = list2 == null ? 0 : list2.hashCode();
            java.lang.String str = this.nickname;
            int hashCode10 = str == null ? 0 : str.hashCode();
            com.paypal.oslo.api.graphql.schema.type.BankAccountOnboardingEntity bankAccountOnboardingEntity = this.onboardingEntity;
            int hashCode11 = bankAccountOnboardingEntity == null ? 0 : bankAccountOnboardingEntity.hashCode();
            com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Status status = this.status;
            int hashCode12 = status == null ? 0 : status.hashCode();
            com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Authorization authorization = this.authorization;
            return (((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + (authorization != null ? authorization.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.BankAccount)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.BankAccount bankAccount = (com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.BankAccount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, bankAccount.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastNChars, bankAccount.lastNChars) && this.type == bankAccount.type && kotlin.jvm.internal.Intrinsics.areEqual(this.availableActions, bankAccount.availableActions) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, bankAccount.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.confirmation, bankAccount.confirmation) && this.isSepaCompliant == bankAccount.isSepaCompliant && kotlin.jvm.internal.Intrinsics.areEqual(this.issuer, bankAccount.issuer) && kotlin.jvm.internal.Intrinsics.areEqual(this.institutionImages, bankAccount.institutionImages) && kotlin.jvm.internal.Intrinsics.areEqual(this.nickname, bankAccount.nickname) && this.onboardingEntity == bankAccount.onboardingEntity && kotlin.jvm.internal.Intrinsics.areEqual(this.status, bankAccount.status) && kotlin.jvm.internal.Intrinsics.areEqual(this.authorization, bankAccount.authorization);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.BankAccount copy(java.lang.String id, java.lang.String lastNChars, com.paypal.oslo.api.graphql.schema.type.BankAccountType type, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction> availableActions, java.lang.Object currencyCode, com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Confirmation confirmation, boolean isSepaCompliant, com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Issuer issuer, java.util.List<com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.InstitutionImage> institutionImages, java.lang.String nickname, com.paypal.oslo.api.graphql.schema.type.BankAccountOnboardingEntity onboardingEntity, com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Status status, com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Authorization authorization) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastNChars, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(issuer, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.BankAccount(id, lastNChars, type, availableActions, currencyCode, confirmation, isSepaCompliant, issuer, institutionImages, nickname, onboardingEntity, status, authorization);
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.InstitutionImage> component9() {
            return this.institutionImages;
        }

        /* renamed from: component8, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Issuer getIssuer() {
            return this.issuer;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getIsSepaCompliant() {
            return this.isSepaCompliant;
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Confirmation getConfirmation() {
            return this.confirmation;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction> component4() {
            return this.availableActions;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.BankAccountType getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getLastNChars() {
            return this.lastNChars;
        }

        /* renamed from: component13, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Authorization getAuthorization() {
            return this.authorization;
        }

        /* renamed from: component12, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Status getStatus() {
            return this.status;
        }

        /* renamed from: component11, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.BankAccountOnboardingEntity getOnboardingEntity() {
            return this.onboardingEntity;
        }

        /* renamed from: component10, reason: from getter */
        public final java.lang.String getNickname() {
            return this.nickname;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016JJ\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b,\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetBankAccountQuery$Confirmation;", "", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountConfirmationMethod;", "method", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountRealTimePaymentsDepositStatus;", "realTimePaymentsDepositStatus", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountConfirmationStatus;", "status", "initiationTime", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountConfirmationState;", "state", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/BankAccountConfirmationMethod;Lcom/paypal/oslo/api/graphql/schema/type/BankAccountRealTimePaymentsDepositStatus;Lcom/paypal/oslo/api/graphql/schema/type/BankAccountConfirmationStatus;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/BankAccountConfirmationState;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/BankAccountConfirmationMethod;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/BankAccountRealTimePaymentsDepositStatus;", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/BankAccountConfirmationStatus;", "component4", "()Ljava/lang/Object;", "component5", "()Lcom/paypal/oslo/api/graphql/schema/type/BankAccountConfirmationState;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/BankAccountConfirmationMethod;Lcom/paypal/oslo/api/graphql/schema/type/BankAccountRealTimePaymentsDepositStatus;Lcom/paypal/oslo/api/graphql/schema/type/BankAccountConfirmationStatus;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/BankAccountConfirmationState;)Lcom/paypal/oslo/feature/wallet/graphql/GetBankAccountQuery$Confirmation;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountConfirmationMethod;", "getMethod", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountRealTimePaymentsDepositStatus;", "getRealTimePaymentsDepositStatus", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountConfirmationStatus;", "getStatus", "Ljava/lang/Object;", "getInitiationTime", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountConfirmationState;", "getState"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Confirmation {
        public static final int $stable = 8;
        private final java.lang.Object initiationTime;
        private final com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationMethod method;
        private final com.paypal.oslo.api.graphql.schema.type.BankAccountRealTimePaymentsDepositStatus realTimePaymentsDepositStatus;
        private final com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState state;
        private final com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus status;

        public Confirmation(com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationMethod bankAccountConfirmationMethod, com.paypal.oslo.api.graphql.schema.type.BankAccountRealTimePaymentsDepositStatus bankAccountRealTimePaymentsDepositStatus, com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus bankAccountConfirmationStatus, java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState bankAccountConfirmationState) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountConfirmationStatus, "");
            this.method = bankAccountConfirmationMethod;
            this.realTimePaymentsDepositStatus = bankAccountRealTimePaymentsDepositStatus;
            this.status = bankAccountConfirmationStatus;
            this.initiationTime = obj;
            this.state = bankAccountConfirmationState;
        }

        public final com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationMethod getMethod() {
            return this.method;
        }

        public final com.paypal.oslo.api.graphql.schema.type.BankAccountRealTimePaymentsDepositStatus getRealTimePaymentsDepositStatus() {
            return this.realTimePaymentsDepositStatus;
        }

        public final com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus getStatus() {
            return this.status;
        }

        public final java.lang.Object getInitiationTime() {
            return this.initiationTime;
        }

        public final com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState getState() {
            return this.state;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationMethod bankAccountConfirmationMethod = this.method;
            com.paypal.oslo.api.graphql.schema.type.BankAccountRealTimePaymentsDepositStatus bankAccountRealTimePaymentsDepositStatus = this.realTimePaymentsDepositStatus;
            com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus bankAccountConfirmationStatus = this.status;
            java.lang.Object obj = this.initiationTime;
            com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState bankAccountConfirmationState = this.state;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Confirmation(method=");
            sb.append(bankAccountConfirmationMethod);
            sb.append(", realTimePaymentsDepositStatus=");
            sb.append(bankAccountRealTimePaymentsDepositStatus);
            sb.append(", status=");
            sb.append(bankAccountConfirmationStatus);
            sb.append(", initiationTime=");
            sb.append(obj);
            sb.append(", state=");
            sb.append(bankAccountConfirmationState);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationMethod bankAccountConfirmationMethod = this.method;
            int hashCode = bankAccountConfirmationMethod == null ? 0 : bankAccountConfirmationMethod.hashCode();
            com.paypal.oslo.api.graphql.schema.type.BankAccountRealTimePaymentsDepositStatus bankAccountRealTimePaymentsDepositStatus = this.realTimePaymentsDepositStatus;
            int hashCode2 = bankAccountRealTimePaymentsDepositStatus == null ? 0 : bankAccountRealTimePaymentsDepositStatus.hashCode();
            int hashCode3 = this.status.hashCode();
            java.lang.Object obj = this.initiationTime;
            int hashCode4 = obj == null ? 0 : obj.hashCode();
            com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState bankAccountConfirmationState = this.state;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (bankAccountConfirmationState != null ? bankAccountConfirmationState.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Confirmation)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Confirmation confirmation = (com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Confirmation) other;
            return this.method == confirmation.method && this.realTimePaymentsDepositStatus == confirmation.realTimePaymentsDepositStatus && this.status == confirmation.status && kotlin.jvm.internal.Intrinsics.areEqual(this.initiationTime, confirmation.initiationTime) && this.state == confirmation.state;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Confirmation copy(com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationMethod method, com.paypal.oslo.api.graphql.schema.type.BankAccountRealTimePaymentsDepositStatus realTimePaymentsDepositStatus, com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus status, java.lang.Object initiationTime, com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState state) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Confirmation(method, realTimePaymentsDepositStatus, status, initiationTime, state);
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState getState() {
            return this.state;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Object getInitiationTime() {
            return this.initiationTime;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus getStatus() {
            return this.status;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.BankAccountRealTimePaymentsDepositStatus getRealTimePaymentsDepositStatus() {
            return this.realTimePaymentsDepositStatus;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationMethod getMethod() {
            return this.method;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Confirmation copy$default(com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Confirmation confirmation, com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationMethod bankAccountConfirmationMethod, com.paypal.oslo.api.graphql.schema.type.BankAccountRealTimePaymentsDepositStatus bankAccountRealTimePaymentsDepositStatus, com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus bankAccountConfirmationStatus, java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState bankAccountConfirmationState, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                bankAccountConfirmationMethod = confirmation.method;
            }
            if ((i & 2) != 0) {
                bankAccountRealTimePaymentsDepositStatus = confirmation.realTimePaymentsDepositStatus;
            }
            com.paypal.oslo.api.graphql.schema.type.BankAccountRealTimePaymentsDepositStatus bankAccountRealTimePaymentsDepositStatus2 = bankAccountRealTimePaymentsDepositStatus;
            if ((i & 4) != 0) {
                bankAccountConfirmationStatus = confirmation.status;
            }
            com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus bankAccountConfirmationStatus2 = bankAccountConfirmationStatus;
            if ((i & 8) != 0) {
                obj = confirmation.initiationTime;
            }
            java.lang.Object obj3 = obj;
            if ((i & 16) != 0) {
                bankAccountConfirmationState = confirmation.state;
            }
            return confirmation.copy(bankAccountConfirmationMethod, bankAccountRealTimePaymentsDepositStatus2, bankAccountConfirmationStatus2, obj3, bankAccountConfirmationState);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetBankAccountQuery$Issuer;", "", "countryCode", "", "name", "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/graphql/GetBankAccountQuery$Issuer;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCountryCode", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Issuer {
        public static final int $stable = 8;
        private final java.lang.Object countryCode;
        private final java.lang.String name;

        public Issuer(java.lang.Object obj, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.countryCode = obj;
            this.name = str;
        }

        public final java.lang.Object getCountryCode() {
            return this.countryCode;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.countryCode;
            java.lang.String str = this.name;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Issuer(countryCode=");
            sb.append(obj);
            sb.append(", name=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.countryCode.hashCode() * 31) + this.name.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Issuer)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Issuer issuer = (com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Issuer) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, issuer.countryCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, issuer.name);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Issuer copy(java.lang.Object countryCode, java.lang.String name2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Issuer(countryCode, name2);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCountryCode() {
            return this.countryCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Issuer copy$default(com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Issuer issuer, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = issuer.countryCode;
            }
            if ((i & 2) != 0) {
                str = issuer.name;
            }
            return issuer.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JJ\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u000fR\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b$\u0010\u0011R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetBankAccountQuery$InstitutionImage;", "", "url", "", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "", "width", "height", "Lcom/paypal/oslo/api/graphql/schema/type/InstitutionImageCategory;", "category", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/paypal/oslo/api/graphql/schema/type/InstitutionImageCategory;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Integer;", "component4", "component5", "()Lcom/paypal/oslo/api/graphql/schema/type/InstitutionImageCategory;", "copy", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/paypal/oslo/api/graphql/schema/type/InstitutionImageCategory;)Lcom/paypal/oslo/feature/wallet/graphql/GetBankAccountQuery$InstitutionImage;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getUrl", "Ljava/lang/String;", "getMimeType", "Ljava/lang/Integer;", "getWidth", "getHeight", "Lcom/paypal/oslo/api/graphql/schema/type/InstitutionImageCategory;", "getCategory"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InstitutionImage {
        public static final int $stable = 8;
        private final com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory category;
        private final java.lang.Integer height;
        private final java.lang.String mimeType;
        private final java.lang.Object url;
        private final java.lang.Integer width;

        public InstitutionImage(java.lang.Object obj, java.lang.String str, java.lang.Integer num, java.lang.Integer num2, com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory institutionImageCategory) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(institutionImageCategory, "");
            this.url = obj;
            this.mimeType = str;
            this.width = num;
            this.height = num2;
            this.category = institutionImageCategory;
        }

        public final java.lang.Object getUrl() {
            return this.url;
        }

        public final java.lang.String getMimeType() {
            return this.mimeType;
        }

        public final java.lang.Integer getWidth() {
            return this.width;
        }

        public final java.lang.Integer getHeight() {
            return this.height;
        }

        public final com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory getCategory() {
            return this.category;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.url;
            java.lang.String str = this.mimeType;
            java.lang.Integer num = this.width;
            java.lang.Integer num2 = this.height;
            com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory institutionImageCategory = this.category;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("InstitutionImage(url=");
            sb.append(obj);
            sb.append(", mimeType=");
            sb.append(str);
            sb.append(", width=");
            sb.append(num);
            sb.append(", height=");
            sb.append(num2);
            sb.append(", category=");
            sb.append(institutionImageCategory);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Object obj = this.url;
            int hashCode = obj == null ? 0 : obj.hashCode();
            java.lang.String str = this.mimeType;
            int hashCode2 = str == null ? 0 : str.hashCode();
            java.lang.Integer num = this.width;
            int hashCode3 = num == null ? 0 : num.hashCode();
            java.lang.Integer num2 = this.height;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (num2 != null ? num2.hashCode() : 0)) * 31) + this.category.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.InstitutionImage)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.InstitutionImage institutionImage = (com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.InstitutionImage) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.url, institutionImage.url) && kotlin.jvm.internal.Intrinsics.areEqual(this.mimeType, institutionImage.mimeType) && kotlin.jvm.internal.Intrinsics.areEqual(this.width, institutionImage.width) && kotlin.jvm.internal.Intrinsics.areEqual(this.height, institutionImage.height) && this.category == institutionImage.category;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.InstitutionImage copy(java.lang.Object url, java.lang.String mimeType, java.lang.Integer width, java.lang.Integer height, com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory category) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(category, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.InstitutionImage(url, mimeType, width, height, category);
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory getCategory() {
            return this.category;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Integer getHeight() {
            return this.height;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Integer getWidth() {
            return this.width;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getMimeType() {
            return this.mimeType;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.InstitutionImage copy$default(com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.InstitutionImage institutionImage, java.lang.Object obj, java.lang.String str, java.lang.Integer num, java.lang.Integer num2, com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory institutionImageCategory, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = institutionImage.url;
            }
            if ((i & 2) != 0) {
                str = institutionImage.mimeType;
            }
            java.lang.String str2 = str;
            if ((i & 4) != 0) {
                num = institutionImage.width;
            }
            java.lang.Integer num3 = num;
            if ((i & 8) != 0) {
                num2 = institutionImage.height;
            }
            java.lang.Integer num4 = num2;
            if ((i & 16) != 0) {
                institutionImageCategory = institutionImage.category;
            }
            return institutionImage.copy(obj, str2, num3, num4, institutionImageCategory);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetBankAccountQuery$Status;", "", "", "reason", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountStatus;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/BankAccountStatus;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/BankAccountStatus;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/BankAccountStatus;)Lcom/paypal/oslo/feature/wallet/graphql/GetBankAccountQuery$Status;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getReason", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountStatus;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Status {
        public static final int $stable = 0;
        private final java.lang.String reason;
        private final com.paypal.oslo.api.graphql.schema.type.BankAccountStatus value;

        public Status(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.BankAccountStatus bankAccountStatus) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountStatus, "");
            this.reason = str;
            this.value = bankAccountStatus;
        }

        public final java.lang.String getReason() {
            return this.reason;
        }

        public final com.paypal.oslo.api.graphql.schema.type.BankAccountStatus getValue() {
            return this.value;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.reason;
            com.paypal.oslo.api.graphql.schema.type.BankAccountStatus bankAccountStatus = this.value;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Status(reason=");
            sb.append(str);
            sb.append(", value=");
            sb.append(bankAccountStatus);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.reason;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.value.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Status)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Status status = (com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Status) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.reason, status.reason) && this.value == status.value;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Status copy(java.lang.String reason, com.paypal.oslo.api.graphql.schema.type.BankAccountStatus value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Status(reason, value);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.BankAccountStatus getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getReason() {
            return this.reason;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Status copy$default(com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Status status, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.BankAccountStatus bankAccountStatus, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = status.reason;
            }
            if ((i & 2) != 0) {
                bankAccountStatus = status.value;
            }
            return status.copy(str, bankAccountStatus);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetBankAccountQuery$Authorization;", "", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountAuthorizationMethod;", "method", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountAuthorizationStatus;", "status", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/BankAccountAuthorizationMethod;Lcom/paypal/oslo/api/graphql/schema/type/BankAccountAuthorizationStatus;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/BankAccountAuthorizationMethod;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/BankAccountAuthorizationStatus;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/BankAccountAuthorizationMethod;Lcom/paypal/oslo/api/graphql/schema/type/BankAccountAuthorizationStatus;)Lcom/paypal/oslo/feature/wallet/graphql/GetBankAccountQuery$Authorization;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountAuthorizationMethod;", "getMethod", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountAuthorizationStatus;", "getStatus"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Authorization {
        public static final int $stable = 0;
        private final com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod method;
        private final com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationStatus status;

        public Authorization(com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod bankAccountAuthorizationMethod, com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationStatus bankAccountAuthorizationStatus) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountAuthorizationStatus, "");
            this.method = bankAccountAuthorizationMethod;
            this.status = bankAccountAuthorizationStatus;
        }

        public final com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod getMethod() {
            return this.method;
        }

        public final com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationStatus getStatus() {
            return this.status;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod bankAccountAuthorizationMethod = this.method;
            com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationStatus bankAccountAuthorizationStatus = this.status;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Authorization(method=");
            sb.append(bankAccountAuthorizationMethod);
            sb.append(", status=");
            sb.append(bankAccountAuthorizationStatus);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod bankAccountAuthorizationMethod = this.method;
            return ((bankAccountAuthorizationMethod == null ? 0 : bankAccountAuthorizationMethod.hashCode()) * 31) + this.status.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Authorization)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Authorization authorization = (com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Authorization) other;
            return this.method == authorization.method && this.status == authorization.status;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Authorization copy(com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod method, com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationStatus status) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Authorization(method, status);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationStatus getStatus() {
            return this.status;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod getMethod() {
            return this.method;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Authorization copy$default(com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Authorization authorization, com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod bankAccountAuthorizationMethod, com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationStatus bankAccountAuthorizationStatus, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bankAccountAuthorizationMethod = authorization.method;
            }
            if ((i & 2) != 0) {
                bankAccountAuthorizationStatus = authorization.status;
            }
            return authorization.copy(bankAccountAuthorizationMethod, bankAccountAuthorizationStatus);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetBankAccountQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetBankAccount($id: ID!) { bankAccount(id: $id) { id lastNChars type availableActions currencyCode confirmation { method realTimePaymentsDepositStatus status initiationTime state } isSepaCompliant issuer { countryCode name } institutionImages { url mimeType width height category } nickname onboardingEntity status { reason value } authorization { method status } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetBankAccountQuery(id=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.id.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, ((com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery) other).id);
    }

    public final com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery copy(java.lang.String id) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        return new com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery(id);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery copy$default(com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery getBankAccountQuery, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = getBankAccountQuery.id;
        }
        return getBankAccountQuery.copy(str);
    }
}
