package com.paypal.oslo.feature.cryptocurrency.domain.model.funding;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0005\u000e\u000f\u0010\u0011\u0012B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\r\u001a\u00020\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0005\u0013\u0014\u0015\u0016\u0017"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/model/funding/FundingSource;", "", "<init>", "()V", "", "getId", "()Ljava/lang/String;", "id", "getFundingOptionId", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FUNDING_OPTION_ID, "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/funding/InstrumentMetadata;", "getInstrumentMetadata", "()Lcom/paypal/oslo/feature/cryptocurrency/domain/model/funding/InstrumentMetadata;", "instrumentMetadata", com.discover.mpos.sdk.core.ConstantsKt.BALANCE_OUTCOME_QUALIFIER, "Bank", com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardTestTag.CARD, com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.OPERATION_NAME, com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentConstants.SECTION_CRYPTO, "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/funding/FundingSource$Balance;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/funding/FundingSource$Bank;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/funding/FundingSource$Card;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/funding/FundingSource$Crypto;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/funding/FundingSource$PaymentToken;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class FundingSource {
    public static final int $stable = 0;

    public abstract java.lang.String getFundingOptionId();

    public abstract java.lang.String getId();

    public abstract com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentMetadata getInstrumentMetadata();

    private FundingSource() {
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J:\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/model/funding/FundingSource$Balance;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/funding/FundingSource;", "", "id", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FUNDING_OPTION_ID, "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/funding/InstrumentMetadata;", "instrumentMetadata", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/common/Money;", "amount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/cryptocurrency/domain/model/funding/InstrumentMetadata;Lcom/paypal/oslo/feature/cryptocurrency/domain/model/common/Money;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/cryptocurrency/domain/model/funding/InstrumentMetadata;", "component4", "()Lcom/paypal/oslo/feature/cryptocurrency/domain/model/common/Money;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/cryptocurrency/domain/model/funding/InstrumentMetadata;Lcom/paypal/oslo/feature/cryptocurrency/domain/model/common/Money;)Lcom/paypal/oslo/feature/cryptocurrency/domain/model/funding/FundingSource$Balance;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getFundingOptionId", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/funding/InstrumentMetadata;", "getInstrumentMetadata", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/common/Money;", "getAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Balance extends com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money amount;
        private final java.lang.String fundingOptionId;
        private final java.lang.String id;
        private final com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentMetadata instrumentMetadata;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Balance(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentMetadata instrumentMetadata, com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money money) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrumentMetadata, "");
            this.id = str;
            this.fundingOptionId = str2;
            this.instrumentMetadata = instrumentMetadata;
            this.amount = money;
        }

        @Override // com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource
        public final java.lang.String getId() {
            return this.id;
        }

        @Override // com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource
        public final java.lang.String getFundingOptionId() {
            return this.fundingOptionId;
        }

        @Override // com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource
        public final com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentMetadata getInstrumentMetadata() {
            return this.instrumentMetadata;
        }

        public final com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money getAmount() {
            return this.amount;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.fundingOptionId;
            com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentMetadata instrumentMetadata = this.instrumentMetadata;
            com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money money = this.amount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Balance(id=");
            sb.append(str);
            sb.append(", fundingOptionId=");
            sb.append(str2);
            sb.append(", instrumentMetadata=");
            sb.append(instrumentMetadata);
            sb.append(", amount=");
            sb.append(money);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            int hashCode2 = this.fundingOptionId.hashCode();
            int hashCode3 = this.instrumentMetadata.hashCode();
            com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money money = this.amount;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (money == null ? 0 : money.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource.Balance)) {
                return false;
            }
            com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource.Balance balance = (com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource.Balance) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, balance.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingOptionId, balance.fundingOptionId) && kotlin.jvm.internal.Intrinsics.areEqual(this.instrumentMetadata, balance.instrumentMetadata) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, balance.amount);
        }

        public final com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource.Balance copy(java.lang.String id, java.lang.String fundingOptionId, com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentMetadata instrumentMetadata, com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money amount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingOptionId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrumentMetadata, "");
            return new com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource.Balance(id, fundingOptionId, instrumentMetadata, amount);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money getAmount() {
            return this.amount;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentMetadata getInstrumentMetadata() {
            return this.instrumentMetadata;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getFundingOptionId() {
            return this.fundingOptionId;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource.Balance copy$default(com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource.Balance balance, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentMetadata instrumentMetadata, com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money money, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = balance.id;
            }
            if ((i & 2) != 0) {
                str2 = balance.fundingOptionId;
            }
            if ((i & 4) != 0) {
                instrumentMetadata = balance.instrumentMetadata;
            }
            if ((i & 8) != 0) {
                money = balance.amount;
            }
            return balance.copy(str, str2, instrumentMetadata, money);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b \u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/model/funding/FundingSource$Bank;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/funding/FundingSource;", "", "id", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FUNDING_OPTION_ID, "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/funding/InstrumentMetadata;", "instrumentMetadata", "lastDigits", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/cryptocurrency/domain/model/funding/InstrumentMetadata;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/cryptocurrency/domain/model/funding/InstrumentMetadata;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/cryptocurrency/domain/model/funding/InstrumentMetadata;Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/domain/model/funding/FundingSource$Bank;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getFundingOptionId", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/funding/InstrumentMetadata;", "getInstrumentMetadata", "getLastDigits"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Bank extends com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource {
        public static final int $stable = 0;
        private final java.lang.String fundingOptionId;
        private final java.lang.String id;
        private final com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentMetadata instrumentMetadata;
        private final java.lang.String lastDigits;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Bank(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentMetadata instrumentMetadata, java.lang.String str3) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrumentMetadata, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            this.id = str;
            this.fundingOptionId = str2;
            this.instrumentMetadata = instrumentMetadata;
            this.lastDigits = str3;
        }

        @Override // com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource
        public final java.lang.String getId() {
            return this.id;
        }

        @Override // com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource
        public final java.lang.String getFundingOptionId() {
            return this.fundingOptionId;
        }

        @Override // com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource
        public final com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentMetadata getInstrumentMetadata() {
            return this.instrumentMetadata;
        }

        public final java.lang.String getLastDigits() {
            return this.lastDigits;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.fundingOptionId;
            com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentMetadata instrumentMetadata = this.instrumentMetadata;
            java.lang.String str3 = this.lastDigits;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Bank(id=");
            sb.append(str);
            sb.append(", fundingOptionId=");
            sb.append(str2);
            sb.append(", instrumentMetadata=");
            sb.append(instrumentMetadata);
            sb.append(", lastDigits=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((this.id.hashCode() * 31) + this.fundingOptionId.hashCode()) * 31) + this.instrumentMetadata.hashCode()) * 31) + this.lastDigits.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource.Bank)) {
                return false;
            }
            com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource.Bank bank = (com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource.Bank) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, bank.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingOptionId, bank.fundingOptionId) && kotlin.jvm.internal.Intrinsics.areEqual(this.instrumentMetadata, bank.instrumentMetadata) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastDigits, bank.lastDigits);
        }

        public final com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource.Bank copy(java.lang.String id, java.lang.String fundingOptionId, com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentMetadata instrumentMetadata, java.lang.String lastDigits) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingOptionId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrumentMetadata, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastDigits, "");
            return new com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource.Bank(id, fundingOptionId, instrumentMetadata, lastDigits);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getLastDigits() {
            return this.lastDigits;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentMetadata getInstrumentMetadata() {
            return this.instrumentMetadata;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getFundingOptionId() {
            return this.fundingOptionId;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource.Bank copy$default(com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource.Bank bank, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentMetadata instrumentMetadata, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = bank.id;
            }
            if ((i & 2) != 0) {
                str2 = bank.fundingOptionId;
            }
            if ((i & 4) != 0) {
                instrumentMetadata = bank.instrumentMetadata;
            }
            if ((i & 8) != 0) {
                str3 = bank.lastDigits;
            }
            return bank.copy(str, str2, instrumentMetadata, str3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0012J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0012J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0012J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJn\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b.\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b/\u0010\u0012R\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b0\u0010\u0012R\u001a\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b1\u0010\u0012R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b3\u0010\u001bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00104\u001a\u0004\b5\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/model/funding/FundingSource$Card;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/funding/FundingSource;", "", "id", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FUNDING_OPTION_ID, "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/funding/InstrumentMetadata;", "instrumentMetadata", "lastNChars", "type", "brand", "currencyCode", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/common/Money;", "balance", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/funding/CardIssuer;", "issuer", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/cryptocurrency/domain/model/funding/InstrumentMetadata;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/cryptocurrency/domain/model/common/Money;Lcom/paypal/oslo/feature/cryptocurrency/domain/model/funding/CardIssuer;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/cryptocurrency/domain/model/funding/InstrumentMetadata;", "component4", "component5", "component6", "component7", "component8", "()Lcom/paypal/oslo/feature/cryptocurrency/domain/model/common/Money;", "component9", "()Lcom/paypal/oslo/feature/cryptocurrency/domain/model/funding/CardIssuer;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/cryptocurrency/domain/model/funding/InstrumentMetadata;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/cryptocurrency/domain/model/common/Money;Lcom/paypal/oslo/feature/cryptocurrency/domain/model/funding/CardIssuer;)Lcom/paypal/oslo/feature/cryptocurrency/domain/model/funding/FundingSource$Card;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getFundingOptionId", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/funding/InstrumentMetadata;", "getInstrumentMetadata", "getLastNChars", "getType", "getBrand", "getCurrencyCode", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/common/Money;", "getBalance", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/funding/CardIssuer;", "getIssuer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Card extends com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money balance;
        private final java.lang.String brand;
        private final java.lang.String currencyCode;
        private final java.lang.String fundingOptionId;
        private final java.lang.String id;
        private final com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentMetadata instrumentMetadata;
        private final com.paypal.oslo.feature.cryptocurrency.domain.model.funding.CardIssuer issuer;
        private final java.lang.String lastNChars;
        private final java.lang.String type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Card(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentMetadata instrumentMetadata, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money money, com.paypal.oslo.feature.cryptocurrency.domain.model.funding.CardIssuer cardIssuer) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrumentMetadata, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
            this.id = str;
            this.fundingOptionId = str2;
            this.instrumentMetadata = instrumentMetadata;
            this.lastNChars = str3;
            this.type = str4;
            this.brand = str5;
            this.currencyCode = str6;
            this.balance = money;
            this.issuer = cardIssuer;
        }

        public /* synthetic */ Card(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentMetadata instrumentMetadata, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money money, com.paypal.oslo.feature.cryptocurrency.domain.model.funding.CardIssuer cardIssuer, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, instrumentMetadata, str3, str4, str5, str6, (i & 128) != 0 ? null : money, (i & 256) != 0 ? null : cardIssuer);
        }

        @Override // com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource
        public final java.lang.String getId() {
            return this.id;
        }

        @Override // com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource
        public final java.lang.String getFundingOptionId() {
            return this.fundingOptionId;
        }

        @Override // com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource
        public final com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentMetadata getInstrumentMetadata() {
            return this.instrumentMetadata;
        }

        public final java.lang.String getLastNChars() {
            return this.lastNChars;
        }

        public final java.lang.String getType() {
            return this.type;
        }

        public final java.lang.String getBrand() {
            return this.brand;
        }

        public final java.lang.String getCurrencyCode() {
            return this.currencyCode;
        }

        public final com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money getBalance() {
            return this.balance;
        }

        public final com.paypal.oslo.feature.cryptocurrency.domain.model.funding.CardIssuer getIssuer() {
            return this.issuer;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.fundingOptionId;
            com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentMetadata instrumentMetadata = this.instrumentMetadata;
            java.lang.String str3 = this.lastNChars;
            java.lang.String str4 = this.type;
            java.lang.String str5 = this.brand;
            java.lang.String str6 = this.currencyCode;
            com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money money = this.balance;
            com.paypal.oslo.feature.cryptocurrency.domain.model.funding.CardIssuer cardIssuer = this.issuer;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Card(id=");
            sb.append(str);
            sb.append(", fundingOptionId=");
            sb.append(str2);
            sb.append(", instrumentMetadata=");
            sb.append(instrumentMetadata);
            sb.append(", lastNChars=");
            sb.append(str3);
            sb.append(", type=");
            sb.append(str4);
            sb.append(", brand=");
            sb.append(str5);
            sb.append(", currencyCode=");
            sb.append(str6);
            sb.append(", balance=");
            sb.append(money);
            sb.append(", issuer=");
            sb.append(cardIssuer);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            int hashCode2 = this.fundingOptionId.hashCode();
            int hashCode3 = this.instrumentMetadata.hashCode();
            int hashCode4 = this.lastNChars.hashCode();
            int hashCode5 = this.type.hashCode();
            int hashCode6 = this.brand.hashCode();
            int hashCode7 = this.currencyCode.hashCode();
            com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money money = this.balance;
            int hashCode8 = money == null ? 0 : money.hashCode();
            com.paypal.oslo.feature.cryptocurrency.domain.model.funding.CardIssuer cardIssuer = this.issuer;
            return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + (cardIssuer != null ? cardIssuer.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource.Card)) {
                return false;
            }
            com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource.Card card = (com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource.Card) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, card.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingOptionId, card.fundingOptionId) && kotlin.jvm.internal.Intrinsics.areEqual(this.instrumentMetadata, card.instrumentMetadata) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastNChars, card.lastNChars) && kotlin.jvm.internal.Intrinsics.areEqual(this.type, card.type) && kotlin.jvm.internal.Intrinsics.areEqual(this.brand, card.brand) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, card.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.balance, card.balance) && kotlin.jvm.internal.Intrinsics.areEqual(this.issuer, card.issuer);
        }

        public final com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource.Card copy(java.lang.String id, java.lang.String fundingOptionId, com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentMetadata instrumentMetadata, java.lang.String lastNChars, java.lang.String type, java.lang.String brand, java.lang.String currencyCode, com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money balance, com.paypal.oslo.feature.cryptocurrency.domain.model.funding.CardIssuer issuer) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingOptionId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrumentMetadata, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastNChars, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(brand, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            return new com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource.Card(id, fundingOptionId, instrumentMetadata, lastNChars, type, brand, currencyCode, balance, issuer);
        }

        /* renamed from: component9, reason: from getter */
        public final com.paypal.oslo.feature.cryptocurrency.domain.model.funding.CardIssuer getIssuer() {
            return this.issuer;
        }

        /* renamed from: component8, reason: from getter */
        public final com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money getBalance() {
            return this.balance;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.String getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getBrand() {
            return this.brand;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getType() {
            return this.type;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getLastNChars() {
            return this.lastNChars;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentMetadata getInstrumentMetadata() {
            return this.instrumentMetadata;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getFundingOptionId() {
            return this.fundingOptionId;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/model/funding/FundingSource$PaymentToken;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/funding/FundingSource;", "", "id", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FUNDING_OPTION_ID, "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/funding/InstrumentMetadata;", "instrumentMetadata", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/cryptocurrency/domain/model/funding/InstrumentMetadata;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/cryptocurrency/domain/model/funding/InstrumentMetadata;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/cryptocurrency/domain/model/funding/InstrumentMetadata;)Lcom/paypal/oslo/feature/cryptocurrency/domain/model/funding/FundingSource$PaymentToken;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getFundingOptionId", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/funding/InstrumentMetadata;", "getInstrumentMetadata"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PaymentToken extends com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource {
        public static final int $stable = 0;
        private final java.lang.String fundingOptionId;
        private final java.lang.String id;
        private final com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentMetadata instrumentMetadata;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaymentToken(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentMetadata instrumentMetadata) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrumentMetadata, "");
            this.id = str;
            this.fundingOptionId = str2;
            this.instrumentMetadata = instrumentMetadata;
        }

        @Override // com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource
        public final java.lang.String getId() {
            return this.id;
        }

        @Override // com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource
        public final java.lang.String getFundingOptionId() {
            return this.fundingOptionId;
        }

        @Override // com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource
        public final com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentMetadata getInstrumentMetadata() {
            return this.instrumentMetadata;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.fundingOptionId;
            com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentMetadata instrumentMetadata = this.instrumentMetadata;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentToken(id=");
            sb.append(str);
            sb.append(", fundingOptionId=");
            sb.append(str2);
            sb.append(", instrumentMetadata=");
            sb.append(instrumentMetadata);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.id.hashCode() * 31) + this.fundingOptionId.hashCode()) * 31) + this.instrumentMetadata.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource.PaymentToken)) {
                return false;
            }
            com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource.PaymentToken paymentToken = (com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource.PaymentToken) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, paymentToken.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingOptionId, paymentToken.fundingOptionId) && kotlin.jvm.internal.Intrinsics.areEqual(this.instrumentMetadata, paymentToken.instrumentMetadata);
        }

        public final com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource.PaymentToken copy(java.lang.String id, java.lang.String fundingOptionId, com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentMetadata instrumentMetadata) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingOptionId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrumentMetadata, "");
            return new com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource.PaymentToken(id, fundingOptionId, instrumentMetadata);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentMetadata getInstrumentMetadata() {
            return this.instrumentMetadata;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getFundingOptionId() {
            return this.fundingOptionId;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource.PaymentToken copy$default(com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource.PaymentToken paymentToken, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentMetadata instrumentMetadata, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = paymentToken.id;
            }
            if ((i & 2) != 0) {
                str2 = paymentToken.fundingOptionId;
            }
            if ((i & 4) != 0) {
                instrumentMetadata = paymentToken.instrumentMetadata;
            }
            return paymentToken.copy(str, str2, instrumentMetadata);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000eJ\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000eJN\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010\u0013R\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b(\u0010\u000eR\u001a\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b)\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/model/funding/FundingSource$Crypto;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/funding/FundingSource;", "", "id", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FUNDING_OPTION_ID, "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/funding/InstrumentMetadata;", "instrumentMetadata", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/common/Money;", "amount", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "quantity", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/cryptocurrency/domain/model/funding/InstrumentMetadata;Lcom/paypal/oslo/feature/cryptocurrency/domain/model/common/Money;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/cryptocurrency/domain/model/funding/InstrumentMetadata;", "component4", "()Lcom/paypal/oslo/feature/cryptocurrency/domain/model/common/Money;", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/cryptocurrency/domain/model/funding/InstrumentMetadata;Lcom/paypal/oslo/feature/cryptocurrency/domain/model/common/Money;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/domain/model/funding/FundingSource$Crypto;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getFundingOptionId", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/funding/InstrumentMetadata;", "getInstrumentMetadata", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/common/Money;", "getAmount", "getAssetSymbol", "getQuantity"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Crypto extends com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money amount;
        private final java.lang.String assetSymbol;
        private final java.lang.String fundingOptionId;
        private final java.lang.String id;
        private final com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentMetadata instrumentMetadata;
        private final java.lang.String quantity;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Crypto(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentMetadata instrumentMetadata, com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money money, java.lang.String str3, java.lang.String str4) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrumentMetadata, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            this.id = str;
            this.fundingOptionId = str2;
            this.instrumentMetadata = instrumentMetadata;
            this.amount = money;
            this.assetSymbol = str3;
            this.quantity = str4;
        }

        @Override // com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource
        public final java.lang.String getId() {
            return this.id;
        }

        @Override // com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource
        public final java.lang.String getFundingOptionId() {
            return this.fundingOptionId;
        }

        @Override // com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource
        public final com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentMetadata getInstrumentMetadata() {
            return this.instrumentMetadata;
        }

        public final com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money getAmount() {
            return this.amount;
        }

        public final java.lang.String getAssetSymbol() {
            return this.assetSymbol;
        }

        public final java.lang.String getQuantity() {
            return this.quantity;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.fundingOptionId;
            com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentMetadata instrumentMetadata = this.instrumentMetadata;
            com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money money = this.amount;
            java.lang.String str3 = this.assetSymbol;
            java.lang.String str4 = this.quantity;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Crypto(id=");
            sb.append(str);
            sb.append(", fundingOptionId=");
            sb.append(str2);
            sb.append(", instrumentMetadata=");
            sb.append(instrumentMetadata);
            sb.append(", amount=");
            sb.append(money);
            sb.append(", assetSymbol=");
            sb.append(str3);
            sb.append(", quantity=");
            sb.append(str4);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            int hashCode2 = this.fundingOptionId.hashCode();
            int hashCode3 = this.instrumentMetadata.hashCode();
            com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money money = this.amount;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (money == null ? 0 : money.hashCode())) * 31) + this.assetSymbol.hashCode()) * 31) + this.quantity.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource.Crypto)) {
                return false;
            }
            com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource.Crypto crypto = (com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource.Crypto) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, crypto.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingOptionId, crypto.fundingOptionId) && kotlin.jvm.internal.Intrinsics.areEqual(this.instrumentMetadata, crypto.instrumentMetadata) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, crypto.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.assetSymbol, crypto.assetSymbol) && kotlin.jvm.internal.Intrinsics.areEqual(this.quantity, crypto.quantity);
        }

        public final com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource.Crypto copy(java.lang.String id, java.lang.String fundingOptionId, com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentMetadata instrumentMetadata, com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money amount, java.lang.String assetSymbol, java.lang.String quantity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingOptionId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrumentMetadata, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetSymbol, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quantity, "");
            return new com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource.Crypto(id, fundingOptionId, instrumentMetadata, amount, assetSymbol, quantity);
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getQuantity() {
            return this.quantity;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getAssetSymbol() {
            return this.assetSymbol;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money getAmount() {
            return this.amount;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentMetadata getInstrumentMetadata() {
            return this.instrumentMetadata;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getFundingOptionId() {
            return this.fundingOptionId;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource.Crypto copy$default(com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource.Crypto crypto, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentMetadata instrumentMetadata, com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money money, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = crypto.id;
            }
            if ((i & 2) != 0) {
                str2 = crypto.fundingOptionId;
            }
            java.lang.String str5 = str2;
            if ((i & 4) != 0) {
                instrumentMetadata = crypto.instrumentMetadata;
            }
            com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentMetadata instrumentMetadata2 = instrumentMetadata;
            if ((i & 8) != 0) {
                money = crypto.amount;
            }
            com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money money2 = money;
            if ((i & 16) != 0) {
                str3 = crypto.assetSymbol;
            }
            java.lang.String str6 = str3;
            if ((i & 32) != 0) {
                str4 = crypto.quantity;
            }
            return crypto.copy(str, str5, instrumentMetadata2, money2, str6, str4);
        }
    }

    public /* synthetic */ FundingSource(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
