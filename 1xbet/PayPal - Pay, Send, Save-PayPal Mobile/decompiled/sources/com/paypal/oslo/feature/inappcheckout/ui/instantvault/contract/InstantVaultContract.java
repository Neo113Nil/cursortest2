package com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract;", "", "<init>", "()V", "State", "Event", "Effect"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InstantVaultContract {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract();

    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001Bo\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b\"\u0010#Jx\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000f\u001a\u00020\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\f2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b,\u0010\u001dR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b4\u0010\u001bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b6\u0010\u001dR\u001a\u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00107\u001a\u0004\b8\u0010\u001fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00103\u001a\u0004\b9\u0010\u001bR\u001a\u0010\u000f\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00107\u001a\u0004\b\u000f\u0010\u001fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010:\u001a\u0004\b;\u0010#"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$State;", "", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/InitializeCheckoutEntity;", "initializeCheckoutEntity", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BuyerInfoEntity;", "buyerInfoEntity", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingSelectionEntity;", "fundingSelectionEntity", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;", "buyerInfoContingency", "", "selectedInstrumentId", "", "hasContingency", "contingency", "isButtonLoading", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "error", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/InitializeCheckoutEntity;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BuyerInfoEntity;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingSelectionEntity;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;Ljava/lang/String;ZLcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;ZLcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/InitializeCheckoutEntity;", "component2", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BuyerInfoEntity;", "component3", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingSelectionEntity;", "component4", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;", "component5", "()Ljava/lang/String;", "component6", "()Z", "component7", "component8", "component9", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/InitializeCheckoutEntity;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BuyerInfoEntity;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingSelectionEntity;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;Ljava/lang/String;ZLcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;ZLcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;)Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$State;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/InitializeCheckoutEntity;", "getInitializeCheckoutEntity", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BuyerInfoEntity;", "getBuyerInfoEntity", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingSelectionEntity;", "getFundingSelectionEntity", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;", "getBuyerInfoContingency", "Ljava/lang/String;", "getSelectedInstrumentId", "Z", "getHasContingency", "getContingency", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class State {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity buyerInfoContingency;
        private final com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity buyerInfoEntity;
        private final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingency;
        private final com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity error;
        private final com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionEntity fundingSelectionEntity;
        private final boolean hasContingency;
        private final com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeCheckoutEntity initializeCheckoutEntity;
        private final boolean isButtonLoading;
        private final java.lang.String selectedInstrumentId;

        public State(com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeCheckoutEntity initializeCheckoutEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity buyerInfoEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionEntity fundingSelectionEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingencyEntity, java.lang.String str, boolean z, com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingencyEntity2, boolean z2, com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity nativeXOErrorEntity) {
            this.initializeCheckoutEntity = initializeCheckoutEntity;
            this.buyerInfoEntity = buyerInfoEntity;
            this.fundingSelectionEntity = fundingSelectionEntity;
            this.buyerInfoContingency = contingencyEntity;
            this.selectedInstrumentId = str;
            this.hasContingency = z;
            this.contingency = contingencyEntity2;
            this.isButtonLoading = z2;
            this.error = nativeXOErrorEntity;
        }

        public /* synthetic */ State(com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeCheckoutEntity initializeCheckoutEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity buyerInfoEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionEntity fundingSelectionEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingencyEntity, java.lang.String str, boolean z, com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingencyEntity2, boolean z2, com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity nativeXOErrorEntity, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : initializeCheckoutEntity, (i & 2) != 0 ? null : buyerInfoEntity, (i & 4) != 0 ? null : fundingSelectionEntity, (i & 8) != 0 ? null : contingencyEntity, (i & 16) != 0 ? null : str, (i & 32) != 0 ? false : z, (i & 64) != 0 ? null : contingencyEntity2, (i & 128) == 0 ? z2 : false, (i & 256) == 0 ? nativeXOErrorEntity : null);
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeCheckoutEntity getInitializeCheckoutEntity() {
            return this.initializeCheckoutEntity;
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity getBuyerInfoEntity() {
            return this.buyerInfoEntity;
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionEntity getFundingSelectionEntity() {
            return this.fundingSelectionEntity;
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity getBuyerInfoContingency() {
            return this.buyerInfoContingency;
        }

        public final java.lang.String getSelectedInstrumentId() {
            return this.selectedInstrumentId;
        }

        public final boolean getHasContingency() {
            return this.hasContingency;
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity getContingency() {
            return this.contingency;
        }

        public final boolean isButtonLoading() {
            return this.isButtonLoading;
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeCheckoutEntity initializeCheckoutEntity = this.initializeCheckoutEntity;
            com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity buyerInfoEntity = this.buyerInfoEntity;
            com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionEntity fundingSelectionEntity = this.fundingSelectionEntity;
            com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingencyEntity = this.buyerInfoContingency;
            java.lang.String str = this.selectedInstrumentId;
            boolean z = this.hasContingency;
            com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingencyEntity2 = this.contingency;
            boolean z2 = this.isButtonLoading;
            com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity nativeXOErrorEntity = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("State(initializeCheckoutEntity=");
            sb.append(initializeCheckoutEntity);
            sb.append(", buyerInfoEntity=");
            sb.append(buyerInfoEntity);
            sb.append(", fundingSelectionEntity=");
            sb.append(fundingSelectionEntity);
            sb.append(", buyerInfoContingency=");
            sb.append(contingencyEntity);
            sb.append(", selectedInstrumentId=");
            sb.append(str);
            sb.append(", hasContingency=");
            sb.append(z);
            sb.append(", contingency=");
            sb.append(contingencyEntity2);
            sb.append(", isButtonLoading=");
            sb.append(z2);
            sb.append(", error=");
            sb.append(nativeXOErrorEntity);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeCheckoutEntity initializeCheckoutEntity = this.initializeCheckoutEntity;
            int hashCode = initializeCheckoutEntity == null ? 0 : initializeCheckoutEntity.hashCode();
            com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity buyerInfoEntity = this.buyerInfoEntity;
            int hashCode2 = buyerInfoEntity == null ? 0 : buyerInfoEntity.hashCode();
            com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionEntity fundingSelectionEntity = this.fundingSelectionEntity;
            int hashCode3 = fundingSelectionEntity == null ? 0 : fundingSelectionEntity.hashCode();
            com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingencyEntity = this.buyerInfoContingency;
            int hashCode4 = contingencyEntity == null ? 0 : contingencyEntity.hashCode();
            java.lang.String str = this.selectedInstrumentId;
            int hashCode5 = str == null ? 0 : str.hashCode();
            int hashCode6 = java.lang.Boolean.hashCode(this.hasContingency);
            com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingencyEntity2 = this.contingency;
            int hashCode7 = contingencyEntity2 == null ? 0 : contingencyEntity2.hashCode();
            int hashCode8 = java.lang.Boolean.hashCode(this.isButtonLoading);
            com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity nativeXOErrorEntity = this.error;
            return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + (nativeXOErrorEntity != null ? nativeXOErrorEntity.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.State)) {
                return false;
            }
            com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.State state = (com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.State) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.initializeCheckoutEntity, state.initializeCheckoutEntity) && kotlin.jvm.internal.Intrinsics.areEqual(this.buyerInfoEntity, state.buyerInfoEntity) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingSelectionEntity, state.fundingSelectionEntity) && kotlin.jvm.internal.Intrinsics.areEqual(this.buyerInfoContingency, state.buyerInfoContingency) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedInstrumentId, state.selectedInstrumentId) && this.hasContingency == state.hasContingency && kotlin.jvm.internal.Intrinsics.areEqual(this.contingency, state.contingency) && this.isButtonLoading == state.isButtonLoading && kotlin.jvm.internal.Intrinsics.areEqual(this.error, state.error);
        }

        public final com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.State copy(com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeCheckoutEntity initializeCheckoutEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity buyerInfoEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionEntity fundingSelectionEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity buyerInfoContingency, java.lang.String selectedInstrumentId, boolean hasContingency, com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingency, boolean isButtonLoading, com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity error) {
            return new com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.State(initializeCheckoutEntity, buyerInfoEntity, fundingSelectionEntity, buyerInfoContingency, selectedInstrumentId, hasContingency, contingency, isButtonLoading, error);
        }

        /* renamed from: component9, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity getError() {
            return this.error;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getIsButtonLoading() {
            return this.isButtonLoading;
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity getContingency() {
            return this.contingency;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getHasContingency() {
            return this.hasContingency;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getSelectedInstrumentId() {
            return this.selectedInstrumentId;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity getBuyerInfoContingency() {
            return this.buyerInfoContingency;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionEntity getFundingSelectionEntity() {
            return this.fundingSelectionEntity;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity getBuyerInfoEntity() {
            return this.buyerInfoEntity;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeCheckoutEntity getInitializeCheckoutEntity() {
            return this.initializeCheckoutEntity;
        }

        public State() {
            this(null, null, null, null, null, false, null, false, null, 511, null);
        }
    }

    private InstantVaultContract() {
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$Event;", "", "<init>", "()V", "OnContent", "OnAgreeAndContinue", "OnAuthorizeBACreationSuccess", "OnAuthorizeBACreationContingency", "OnAuthorizeBACreationFailure", "OnContingencyNotHandled", "OnContingencyError", "RetryLastOperation", "ReturnToMerchant", "HandleBackPress", "Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$Event$HandleBackPress;", "Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$Event$OnAgreeAndContinue;", "Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$Event$OnAuthorizeBACreationContingency;", "Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$Event$OnAuthorizeBACreationFailure;", "Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$Event$OnAuthorizeBACreationSuccess;", "Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$Event$OnContent;", "Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$Event$OnContingencyError;", "Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$Event$OnContingencyNotHandled;", "Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$Event$RetryLastOperation;", "Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$Event$ReturnToMerchant;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Event {
        public static final int $stable = 0;

        private Event() {
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$Event$OnContent;", "Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$Event;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;", "response", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;)Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$Event$OnContent;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;", "getResponse"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class OnContent extends com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse response;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnContent(com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse authenticationXOResponse) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationXOResponse, "");
                this.response = authenticationXOResponse;
            }

            public final com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse getResponse() {
                return this.response;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse authenticationXOResponse = this.response;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("OnContent(response=");
                sb.append(authenticationXOResponse);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.response.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.OnContent) && kotlin.jvm.internal.Intrinsics.areEqual(this.response, ((com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.OnContent) other).response);
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.OnContent copy(com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse response) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
                return new com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.OnContent(response);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse getResponse() {
                return this.response;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.OnContent copy$default(com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.OnContent onContent, com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse authenticationXOResponse, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    authenticationXOResponse = onContent.response;
                }
                return onContent.copy(authenticationXOResponse);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$Event$OnAgreeAndContinue;", "Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$Event;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class OnAgreeAndContinue extends com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.OnAgreeAndContinue INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.OnAgreeAndContinue();

            private OnAgreeAndContinue() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$Event$OnAuthorizeBACreationSuccess;", "Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$Event;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthorizeBACreationEntity;", "entity", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthorizeBACreationEntity;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthorizeBACreationEntity;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthorizeBACreationEntity;)Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$Event$OnAuthorizeBACreationSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthorizeBACreationEntity;", "getEntity"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class OnAuthorizeBACreationSuccess extends com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.inappcheckout.domain.entity.AuthorizeBACreationEntity entity;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnAuthorizeBACreationSuccess(com.paypal.oslo.feature.inappcheckout.domain.entity.AuthorizeBACreationEntity authorizeBACreationEntity) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authorizeBACreationEntity, "");
                this.entity = authorizeBACreationEntity;
            }

            public final com.paypal.oslo.feature.inappcheckout.domain.entity.AuthorizeBACreationEntity getEntity() {
                return this.entity;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.inappcheckout.domain.entity.AuthorizeBACreationEntity authorizeBACreationEntity = this.entity;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("OnAuthorizeBACreationSuccess(entity=");
                sb.append(authorizeBACreationEntity);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.entity.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.OnAuthorizeBACreationSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.entity, ((com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.OnAuthorizeBACreationSuccess) other).entity);
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.OnAuthorizeBACreationSuccess copy(com.paypal.oslo.feature.inappcheckout.domain.entity.AuthorizeBACreationEntity entity) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entity, "");
                return new com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.OnAuthorizeBACreationSuccess(entity);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.inappcheckout.domain.entity.AuthorizeBACreationEntity getEntity() {
                return this.entity;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.OnAuthorizeBACreationSuccess copy$default(com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.OnAuthorizeBACreationSuccess onAuthorizeBACreationSuccess, com.paypal.oslo.feature.inappcheckout.domain.entity.AuthorizeBACreationEntity authorizeBACreationEntity, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    authorizeBACreationEntity = onAuthorizeBACreationSuccess.entity;
                }
                return onAuthorizeBACreationSuccess.copy(authorizeBACreationEntity);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$Event$OnAuthorizeBACreationContingency;", "Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$Event;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;", "entity", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;)Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$Event$OnAuthorizeBACreationContingency;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;", "getEntity"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class OnAuthorizeBACreationContingency extends com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity entity;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnAuthorizeBACreationContingency(com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingencyEntity) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contingencyEntity, "");
                this.entity = contingencyEntity;
            }

            public final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity getEntity() {
                return this.entity;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingencyEntity = this.entity;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("OnAuthorizeBACreationContingency(entity=");
                sb.append(contingencyEntity);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.entity.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.OnAuthorizeBACreationContingency) && kotlin.jvm.internal.Intrinsics.areEqual(this.entity, ((com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.OnAuthorizeBACreationContingency) other).entity);
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.OnAuthorizeBACreationContingency copy(com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity entity) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entity, "");
                return new com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.OnAuthorizeBACreationContingency(entity);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity getEntity() {
                return this.entity;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.OnAuthorizeBACreationContingency copy$default(com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.OnAuthorizeBACreationContingency onAuthorizeBACreationContingency, com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingencyEntity, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    contingencyEntity = onAuthorizeBACreationContingency.entity;
                }
                return onAuthorizeBACreationContingency.copy(contingencyEntity);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$Event$OnAuthorizeBACreationFailure;", "Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$Event;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "entity", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;)Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$Event$OnAuthorizeBACreationFailure;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "getEntity"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class OnAuthorizeBACreationFailure extends com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity entity;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnAuthorizeBACreationFailure(com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity nativeXOErrorEntity) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeXOErrorEntity, "");
                this.entity = nativeXOErrorEntity;
            }

            public final com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity getEntity() {
                return this.entity;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity nativeXOErrorEntity = this.entity;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("OnAuthorizeBACreationFailure(entity=");
                sb.append(nativeXOErrorEntity);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.entity.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.OnAuthorizeBACreationFailure) && kotlin.jvm.internal.Intrinsics.areEqual(this.entity, ((com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.OnAuthorizeBACreationFailure) other).entity);
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.OnAuthorizeBACreationFailure copy(com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity entity) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entity, "");
                return new com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.OnAuthorizeBACreationFailure(entity);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity getEntity() {
                return this.entity;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.OnAuthorizeBACreationFailure copy$default(com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.OnAuthorizeBACreationFailure onAuthorizeBACreationFailure, com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity nativeXOErrorEntity, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    nativeXOErrorEntity = onAuthorizeBACreationFailure.entity;
                }
                return onAuthorizeBACreationFailure.copy(nativeXOErrorEntity);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$Event$OnContingencyNotHandled;", "Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$Event;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class OnContingencyNotHandled extends com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.OnContingencyNotHandled INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.OnContingencyNotHandled();

            private OnContingencyNotHandled() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$Event$OnContingencyError;", "Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$Event;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "error", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;)Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$Event$OnContingencyError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class OnContingencyError extends com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity error;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnContingencyError(com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity nativeXOErrorEntity) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeXOErrorEntity, "");
                this.error = nativeXOErrorEntity;
            }

            public final com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity getError() {
                return this.error;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity nativeXOErrorEntity = this.error;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("OnContingencyError(error=");
                sb.append(nativeXOErrorEntity);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.error.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.OnContingencyError) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.OnContingencyError) other).error);
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.OnContingencyError copy(com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity error) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
                return new com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.OnContingencyError(error);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity getError() {
                return this.error;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.OnContingencyError copy$default(com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.OnContingencyError onContingencyError, com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity nativeXOErrorEntity, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    nativeXOErrorEntity = onContingencyError.error;
                }
                return onContingencyError.copy(nativeXOErrorEntity);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$Event$RetryLastOperation;", "Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$Event;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class RetryLastOperation extends com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.RetryLastOperation INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.RetryLastOperation();

            private RetryLastOperation() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$Event$ReturnToMerchant;", "Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$Event;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class ReturnToMerchant extends com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.ReturnToMerchant INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.ReturnToMerchant();

            private ReturnToMerchant() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$Event$HandleBackPress;", "Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$Event;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class HandleBackPress extends com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.HandleBackPress INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.HandleBackPress();

            private HandleBackPress() {
                super(null);
            }
        }

        public /* synthetic */ Event(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$Effect;", "", "<init>", "()V", "LoadCardMetaData", "NavigateToSuccessScreen", "NavigateToEConsent", com.paypal.oslo.feature.pools.constants.PoolsConstants.EffectNames.EFFECT_NAVIGATE_TO_ERROR, "NavigateToAddCard", "NavigateToRyp", "NavigateBackToMerchant", "Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$Effect$LoadCardMetaData;", "Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$Effect$NavigateBackToMerchant;", "Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$Effect$NavigateToAddCard;", "Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$Effect$NavigateToEConsent;", "Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$Effect$NavigateToError;", "Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$Effect$NavigateToRyp;", "Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$Effect$NavigateToSuccessScreen;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Effect {
        public static final int $stable = 0;

        private Effect() {
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$Effect$LoadCardMetaData;", "Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$Effect;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class LoadCardMetaData extends com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Effect {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Effect.LoadCardMetaData INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Effect.LoadCardMetaData();

            private LoadCardMetaData() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$Effect$NavigateToSuccessScreen;", "Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$Effect;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/ThanksScreenData;", "thanksScreenData", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/model/ThanksScreenData;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/domain/model/ThanksScreenData;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/domain/model/ThanksScreenData;)Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$Effect$NavigateToSuccessScreen;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/ThanksScreenData;", "getThanksScreenData"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class NavigateToSuccessScreen extends com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Effect {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.inappcheckout.domain.model.ThanksScreenData thanksScreenData;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NavigateToSuccessScreen(com.paypal.oslo.feature.inappcheckout.domain.model.ThanksScreenData thanksScreenData) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(thanksScreenData, "");
                this.thanksScreenData = thanksScreenData;
            }

            public final com.paypal.oslo.feature.inappcheckout.domain.model.ThanksScreenData getThanksScreenData() {
                return this.thanksScreenData;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.inappcheckout.domain.model.ThanksScreenData thanksScreenData = this.thanksScreenData;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToSuccessScreen(thanksScreenData=");
                sb.append(thanksScreenData);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.thanksScreenData.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Effect.NavigateToSuccessScreen) && kotlin.jvm.internal.Intrinsics.areEqual(this.thanksScreenData, ((com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Effect.NavigateToSuccessScreen) other).thanksScreenData);
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Effect.NavigateToSuccessScreen copy(com.paypal.oslo.feature.inappcheckout.domain.model.ThanksScreenData thanksScreenData) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(thanksScreenData, "");
                return new com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Effect.NavigateToSuccessScreen(thanksScreenData);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.inappcheckout.domain.model.ThanksScreenData getThanksScreenData() {
                return this.thanksScreenData;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Effect.NavigateToSuccessScreen copy$default(com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Effect.NavigateToSuccessScreen navigateToSuccessScreen, com.paypal.oslo.feature.inappcheckout.domain.model.ThanksScreenData thanksScreenData, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    thanksScreenData = navigateToSuccessScreen.thanksScreenData;
                }
                return navigateToSuccessScreen.copy(thanksScreenData);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$Effect$NavigateToEConsent;", "Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$Effect;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;", "response", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;)Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$Effect$NavigateToEConsent;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;", "getResponse"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class NavigateToEConsent extends com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Effect {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse response;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NavigateToEConsent(com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse authenticationXOResponse) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationXOResponse, "");
                this.response = authenticationXOResponse;
            }

            public final com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse getResponse() {
                return this.response;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse authenticationXOResponse = this.response;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToEConsent(response=");
                sb.append(authenticationXOResponse);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.response.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Effect.NavigateToEConsent) && kotlin.jvm.internal.Intrinsics.areEqual(this.response, ((com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Effect.NavigateToEConsent) other).response);
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Effect.NavigateToEConsent copy(com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse response) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
                return new com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Effect.NavigateToEConsent(response);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse getResponse() {
                return this.response;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Effect.NavigateToEConsent copy$default(com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Effect.NavigateToEConsent navigateToEConsent, com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse authenticationXOResponse, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    authenticationXOResponse = navigateToEConsent.response;
                }
                return navigateToEConsent.copy(authenticationXOResponse);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$Effect$NavigateToError;", "Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$Effect;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/ErrorScreenType;", "errorScreenType", "", "returnUrl", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/model/ErrorScreenType;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/domain/model/ErrorScreenType;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/domain/model/ErrorScreenType;Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$Effect$NavigateToError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/ErrorScreenType;", "getErrorScreenType", "Ljava/lang/String;", "getReturnUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class NavigateToError extends com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Effect {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType errorScreenType;
            private final java.lang.String returnUrl;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NavigateToError(com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType errorScreenType, java.lang.String str) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorScreenType, "");
                this.errorScreenType = errorScreenType;
                this.returnUrl = str;
            }

            public /* synthetic */ NavigateToError(com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType errorScreenType, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(errorScreenType, (i & 2) != 0 ? null : str);
            }

            public final com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType getErrorScreenType() {
                return this.errorScreenType;
            }

            public final java.lang.String getReturnUrl() {
                return this.returnUrl;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType errorScreenType = this.errorScreenType;
                java.lang.String str = this.returnUrl;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToError(errorScreenType=");
                sb.append(errorScreenType);
                sb.append(", returnUrl=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = this.errorScreenType.hashCode();
                java.lang.String str = this.returnUrl;
                return (hashCode * 31) + (str == null ? 0 : str.hashCode());
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Effect.NavigateToError)) {
                    return false;
                }
                com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Effect.NavigateToError navigateToError = (com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Effect.NavigateToError) other;
                return this.errorScreenType == navigateToError.errorScreenType && kotlin.jvm.internal.Intrinsics.areEqual(this.returnUrl, navigateToError.returnUrl);
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Effect.NavigateToError copy(com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType errorScreenType, java.lang.String returnUrl) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorScreenType, "");
                return new com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Effect.NavigateToError(errorScreenType, returnUrl);
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getReturnUrl() {
                return this.returnUrl;
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType getErrorScreenType() {
                return this.errorScreenType;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Effect.NavigateToError copy$default(com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Effect.NavigateToError navigateToError, com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType errorScreenType, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    errorScreenType = navigateToError.errorScreenType;
                }
                if ((i & 2) != 0) {
                    str = navigateToError.returnUrl;
                }
                return navigateToError.copy(errorScreenType, str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$Effect$NavigateToAddCard;", "Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$Effect;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class NavigateToAddCard extends com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Effect {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Effect.NavigateToAddCard INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Effect.NavigateToAddCard();

            private NavigateToAddCard() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$Effect$NavigateToRyp;", "Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$Effect;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;", "authenticationXOResponse", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;)Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$Effect$NavigateToRyp;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;", "getAuthenticationXOResponse"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class NavigateToRyp extends com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Effect {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse authenticationXOResponse;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NavigateToRyp(com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse authenticationXOResponse) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationXOResponse, "");
                this.authenticationXOResponse = authenticationXOResponse;
            }

            public final com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse getAuthenticationXOResponse() {
                return this.authenticationXOResponse;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse authenticationXOResponse = this.authenticationXOResponse;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToRyp(authenticationXOResponse=");
                sb.append(authenticationXOResponse);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.authenticationXOResponse.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Effect.NavigateToRyp) && kotlin.jvm.internal.Intrinsics.areEqual(this.authenticationXOResponse, ((com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Effect.NavigateToRyp) other).authenticationXOResponse);
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Effect.NavigateToRyp copy(com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse authenticationXOResponse) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationXOResponse, "");
                return new com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Effect.NavigateToRyp(authenticationXOResponse);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse getAuthenticationXOResponse() {
                return this.authenticationXOResponse;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Effect.NavigateToRyp copy$default(com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Effect.NavigateToRyp navigateToRyp, com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse authenticationXOResponse, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    authenticationXOResponse = navigateToRyp.authenticationXOResponse;
                }
                return navigateToRyp.copy(authenticationXOResponse);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$Effect$NavigateBackToMerchant;", "Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$Effect;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class NavigateBackToMerchant extends com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Effect {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Effect.NavigateBackToMerchant INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Effect.NavigateBackToMerchant();

            private NavigateBackToMerchant() {
                super(null);
            }
        }

        public /* synthetic */ Effect(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
