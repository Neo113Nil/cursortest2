package com.paypal.oslo.feature.p2p.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001:\u0004\u001b\u001c\u001d\u001eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentBackupFundingSourceFields;", "Lcom/apollographql/apollo/api/Fragment$Data;", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentBackupFundingSourceFields$Instrument;", "instrument", "", "__typename", "<init>", "(Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentBackupFundingSourceFields$Instrument;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentBackupFundingSourceFields$Instrument;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentBackupFundingSourceFields$Instrument;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentBackupFundingSourceFields;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentBackupFundingSourceFields$Instrument;", "getInstrument", "Ljava/lang/String;", "get__typename", "Instrument", "OnBankAccount", "OnBalance", "OnCard"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PaymentBackupFundingSourceFields implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final java.lang.String __typename;
    private final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentBackupFundingSourceFields.Instrument instrument;

    public PaymentBackupFundingSourceFields(com.paypal.oslo.feature.p2p.graphql.fragment.PaymentBackupFundingSourceFields.Instrument instrument, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrument, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.instrument = instrument;
        this.__typename = str;
    }

    public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentBackupFundingSourceFields.Instrument getInstrument() {
        return this.instrument;
    }

    public final java.lang.String get__typename() {
        return this.__typename;
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J>\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentBackupFundingSourceFields$Instrument;", "", "", "__typename", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentBackupFundingSourceFields$OnBankAccount;", "onBankAccount", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentBackupFundingSourceFields$OnBalance;", "onBalance", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentBackupFundingSourceFields$OnCard;", "onCard", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentBackupFundingSourceFields$OnBankAccount;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentBackupFundingSourceFields$OnBalance;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentBackupFundingSourceFields$OnCard;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentBackupFundingSourceFields$OnBankAccount;", "component3", "()Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentBackupFundingSourceFields$OnBalance;", "component4", "()Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentBackupFundingSourceFields$OnCard;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentBackupFundingSourceFields$OnBankAccount;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentBackupFundingSourceFields$OnBalance;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentBackupFundingSourceFields$OnCard;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentBackupFundingSourceFields$Instrument;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentBackupFundingSourceFields$OnBankAccount;", "getOnBankAccount", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentBackupFundingSourceFields$OnBalance;", "getOnBalance", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentBackupFundingSourceFields$OnCard;", "getOnCard"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Instrument {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentBackupFundingSourceFields.OnBalance onBalance;
        private final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentBackupFundingSourceFields.OnBankAccount onBankAccount;
        private final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentBackupFundingSourceFields.OnCard onCard;

        public Instrument(java.lang.String str, com.paypal.oslo.feature.p2p.graphql.fragment.PaymentBackupFundingSourceFields.OnBankAccount onBankAccount, com.paypal.oslo.feature.p2p.graphql.fragment.PaymentBackupFundingSourceFields.OnBalance onBalance, com.paypal.oslo.feature.p2p.graphql.fragment.PaymentBackupFundingSourceFields.OnCard onCard) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onBankAccount = onBankAccount;
            this.onBalance = onBalance;
            this.onCard = onCard;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentBackupFundingSourceFields.OnBankAccount getOnBankAccount() {
            return this.onBankAccount;
        }

        public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentBackupFundingSourceFields.OnBalance getOnBalance() {
            return this.onBalance;
        }

        public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentBackupFundingSourceFields.OnCard getOnCard() {
            return this.onCard;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.p2p.graphql.fragment.PaymentBackupFundingSourceFields.OnBankAccount onBankAccount = this.onBankAccount;
            com.paypal.oslo.feature.p2p.graphql.fragment.PaymentBackupFundingSourceFields.OnBalance onBalance = this.onBalance;
            com.paypal.oslo.feature.p2p.graphql.fragment.PaymentBackupFundingSourceFields.OnCard onCard = this.onCard;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Instrument(__typename=");
            sb.append(str);
            sb.append(", onBankAccount=");
            sb.append(onBankAccount);
            sb.append(", onBalance=");
            sb.append(onBalance);
            sb.append(", onCard=");
            sb.append(onCard);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.p2p.graphql.fragment.PaymentBackupFundingSourceFields.OnBankAccount onBankAccount = this.onBankAccount;
            int hashCode2 = onBankAccount == null ? 0 : onBankAccount.hashCode();
            com.paypal.oslo.feature.p2p.graphql.fragment.PaymentBackupFundingSourceFields.OnBalance onBalance = this.onBalance;
            int hashCode3 = onBalance == null ? 0 : onBalance.hashCode();
            com.paypal.oslo.feature.p2p.graphql.fragment.PaymentBackupFundingSourceFields.OnCard onCard = this.onCard;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (onCard != null ? onCard.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.fragment.PaymentBackupFundingSourceFields.Instrument)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.fragment.PaymentBackupFundingSourceFields.Instrument instrument = (com.paypal.oslo.feature.p2p.graphql.fragment.PaymentBackupFundingSourceFields.Instrument) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, instrument.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onBankAccount, instrument.onBankAccount) && kotlin.jvm.internal.Intrinsics.areEqual(this.onBalance, instrument.onBalance) && kotlin.jvm.internal.Intrinsics.areEqual(this.onCard, instrument.onCard);
        }

        public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentBackupFundingSourceFields.Instrument copy(java.lang.String __typename, com.paypal.oslo.feature.p2p.graphql.fragment.PaymentBackupFundingSourceFields.OnBankAccount onBankAccount, com.paypal.oslo.feature.p2p.graphql.fragment.PaymentBackupFundingSourceFields.OnBalance onBalance, com.paypal.oslo.feature.p2p.graphql.fragment.PaymentBackupFundingSourceFields.OnCard onCard) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.fragment.PaymentBackupFundingSourceFields.Instrument(__typename, onBankAccount, onBalance, onCard);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentBackupFundingSourceFields.OnCard getOnCard() {
            return this.onCard;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentBackupFundingSourceFields.OnBalance getOnBalance() {
            return this.onBalance;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentBackupFundingSourceFields.OnBankAccount getOnBankAccount() {
            return this.onBankAccount;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.fragment.PaymentBackupFundingSourceFields.Instrument copy$default(com.paypal.oslo.feature.p2p.graphql.fragment.PaymentBackupFundingSourceFields.Instrument instrument, java.lang.String str, com.paypal.oslo.feature.p2p.graphql.fragment.PaymentBackupFundingSourceFields.OnBankAccount onBankAccount, com.paypal.oslo.feature.p2p.graphql.fragment.PaymentBackupFundingSourceFields.OnBalance onBalance, com.paypal.oslo.feature.p2p.graphql.fragment.PaymentBackupFundingSourceFields.OnCard onCard, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = instrument.__typename;
            }
            if ((i & 2) != 0) {
                onBankAccount = instrument.onBankAccount;
            }
            if ((i & 4) != 0) {
                onBalance = instrument.onBalance;
            }
            if ((i & 8) != 0) {
                onCard = instrument.onCard;
            }
            return instrument.copy(str, onBankAccount, onBalance, onCard);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentBackupFundingSourceFields$OnBankAccount;", "", "", "__typename", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/BankAccountFields;", "bankAccountFields", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/fragment/BankAccountFields;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/p2p/graphql/fragment/BankAccountFields;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/fragment/BankAccountFields;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentBackupFundingSourceFields$OnBankAccount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/BankAccountFields;", "getBankAccountFields"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnBankAccount {
        public static final int $stable = 0;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.p2p.graphql.fragment.BankAccountFields bankAccountFields;

        public OnBankAccount(java.lang.String str, com.paypal.oslo.feature.p2p.graphql.fragment.BankAccountFields bankAccountFields) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountFields, "");
            this.__typename = str;
            this.bankAccountFields = bankAccountFields;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.p2p.graphql.fragment.BankAccountFields getBankAccountFields() {
            return this.bankAccountFields;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.p2p.graphql.fragment.BankAccountFields bankAccountFields = this.bankAccountFields;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnBankAccount(__typename=");
            sb.append(str);
            sb.append(", bankAccountFields=");
            sb.append(bankAccountFields);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.bankAccountFields.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.fragment.PaymentBackupFundingSourceFields.OnBankAccount)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.fragment.PaymentBackupFundingSourceFields.OnBankAccount onBankAccount = (com.paypal.oslo.feature.p2p.graphql.fragment.PaymentBackupFundingSourceFields.OnBankAccount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onBankAccount.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.bankAccountFields, onBankAccount.bankAccountFields);
        }

        public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentBackupFundingSourceFields.OnBankAccount copy(java.lang.String __typename, com.paypal.oslo.feature.p2p.graphql.fragment.BankAccountFields bankAccountFields) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountFields, "");
            return new com.paypal.oslo.feature.p2p.graphql.fragment.PaymentBackupFundingSourceFields.OnBankAccount(__typename, bankAccountFields);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.fragment.BankAccountFields getBankAccountFields() {
            return this.bankAccountFields;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.fragment.PaymentBackupFundingSourceFields.OnBankAccount copy$default(com.paypal.oslo.feature.p2p.graphql.fragment.PaymentBackupFundingSourceFields.OnBankAccount onBankAccount, java.lang.String str, com.paypal.oslo.feature.p2p.graphql.fragment.BankAccountFields bankAccountFields, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onBankAccount.__typename;
            }
            if ((i & 2) != 0) {
                bankAccountFields = onBankAccount.bankAccountFields;
            }
            return onBankAccount.copy(str, bankAccountFields);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentBackupFundingSourceFields$OnBalance;", "", "", "__typename", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/BalanceFields;", "balanceFields", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/fragment/BalanceFields;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/p2p/graphql/fragment/BalanceFields;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/fragment/BalanceFields;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentBackupFundingSourceFields$OnBalance;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/BalanceFields;", "getBalanceFields"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnBalance {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.p2p.graphql.fragment.BalanceFields balanceFields;

        public OnBalance(java.lang.String str, com.paypal.oslo.feature.p2p.graphql.fragment.BalanceFields balanceFields) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balanceFields, "");
            this.__typename = str;
            this.balanceFields = balanceFields;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.p2p.graphql.fragment.BalanceFields getBalanceFields() {
            return this.balanceFields;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.p2p.graphql.fragment.BalanceFields balanceFields = this.balanceFields;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnBalance(__typename=");
            sb.append(str);
            sb.append(", balanceFields=");
            sb.append(balanceFields);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.balanceFields.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.fragment.PaymentBackupFundingSourceFields.OnBalance)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.fragment.PaymentBackupFundingSourceFields.OnBalance onBalance = (com.paypal.oslo.feature.p2p.graphql.fragment.PaymentBackupFundingSourceFields.OnBalance) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onBalance.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.balanceFields, onBalance.balanceFields);
        }

        public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentBackupFundingSourceFields.OnBalance copy(java.lang.String __typename, com.paypal.oslo.feature.p2p.graphql.fragment.BalanceFields balanceFields) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balanceFields, "");
            return new com.paypal.oslo.feature.p2p.graphql.fragment.PaymentBackupFundingSourceFields.OnBalance(__typename, balanceFields);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.fragment.BalanceFields getBalanceFields() {
            return this.balanceFields;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.fragment.PaymentBackupFundingSourceFields.OnBalance copy$default(com.paypal.oslo.feature.p2p.graphql.fragment.PaymentBackupFundingSourceFields.OnBalance onBalance, java.lang.String str, com.paypal.oslo.feature.p2p.graphql.fragment.BalanceFields balanceFields, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onBalance.__typename;
            }
            if ((i & 2) != 0) {
                balanceFields = onBalance.balanceFields;
            }
            return onBalance.copy(str, balanceFields);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentBackupFundingSourceFields$OnCard;", "", "", "__typename", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/CardFields;", "cardFields", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/fragment/CardFields;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/p2p/graphql/fragment/CardFields;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/fragment/CardFields;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentBackupFundingSourceFields$OnCard;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/CardFields;", "getCardFields"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnCard {
        public static final int $stable = 0;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.p2p.graphql.fragment.CardFields cardFields;

        public OnCard(java.lang.String str, com.paypal.oslo.feature.p2p.graphql.fragment.CardFields cardFields) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardFields, "");
            this.__typename = str;
            this.cardFields = cardFields;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.p2p.graphql.fragment.CardFields getCardFields() {
            return this.cardFields;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.p2p.graphql.fragment.CardFields cardFields = this.cardFields;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnCard(__typename=");
            sb.append(str);
            sb.append(", cardFields=");
            sb.append(cardFields);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.cardFields.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.fragment.PaymentBackupFundingSourceFields.OnCard)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.fragment.PaymentBackupFundingSourceFields.OnCard onCard = (com.paypal.oslo.feature.p2p.graphql.fragment.PaymentBackupFundingSourceFields.OnCard) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onCard.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardFields, onCard.cardFields);
        }

        public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentBackupFundingSourceFields.OnCard copy(java.lang.String __typename, com.paypal.oslo.feature.p2p.graphql.fragment.CardFields cardFields) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardFields, "");
            return new com.paypal.oslo.feature.p2p.graphql.fragment.PaymentBackupFundingSourceFields.OnCard(__typename, cardFields);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.fragment.CardFields getCardFields() {
            return this.cardFields;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.fragment.PaymentBackupFundingSourceFields.OnCard copy$default(com.paypal.oslo.feature.p2p.graphql.fragment.PaymentBackupFundingSourceFields.OnCard onCard, java.lang.String str, com.paypal.oslo.feature.p2p.graphql.fragment.CardFields cardFields, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onCard.__typename;
            }
            if ((i & 2) != 0) {
                cardFields = onCard.cardFields;
            }
            return onCard.copy(str, cardFields);
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.p2p.graphql.fragment.PaymentBackupFundingSourceFields.Instrument instrument = this.instrument;
        java.lang.String str = this.__typename;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentBackupFundingSourceFields(instrument=");
        sb.append(instrument);
        sb.append(", __typename=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.instrument.hashCode() * 31) + this.__typename.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.fragment.PaymentBackupFundingSourceFields)) {
            return false;
        }
        com.paypal.oslo.feature.p2p.graphql.fragment.PaymentBackupFundingSourceFields paymentBackupFundingSourceFields = (com.paypal.oslo.feature.p2p.graphql.fragment.PaymentBackupFundingSourceFields) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.instrument, paymentBackupFundingSourceFields.instrument) && kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, paymentBackupFundingSourceFields.__typename);
    }

    public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentBackupFundingSourceFields copy(com.paypal.oslo.feature.p2p.graphql.fragment.PaymentBackupFundingSourceFields.Instrument instrument, java.lang.String __typename) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrument, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
        return new com.paypal.oslo.feature.p2p.graphql.fragment.PaymentBackupFundingSourceFields(instrument, __typename);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String get__typename() {
        return this.__typename;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentBackupFundingSourceFields.Instrument getInstrument() {
        return this.instrument;
    }

    public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.fragment.PaymentBackupFundingSourceFields copy$default(com.paypal.oslo.feature.p2p.graphql.fragment.PaymentBackupFundingSourceFields paymentBackupFundingSourceFields, com.paypal.oslo.feature.p2p.graphql.fragment.PaymentBackupFundingSourceFields.Instrument instrument, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            instrument = paymentBackupFundingSourceFields.instrument;
        }
        if ((i & 2) != 0) {
            str = paymentBackupFundingSourceFields.__typename;
        }
        return paymentBackupFundingSourceFields.copy(instrument, str);
    }
}
