package com.paypal.oslo.feature.inappcheckout.domain.model.contingency;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001:\u0001\tB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/model/contingency/ContingencyInputFactory;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/contingency/ContingencyInputFactory$HandleContingencyParams;", "parameters", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/contingency/ContingencyInput;", "create", "(Lcom/paypal/oslo/feature/inappcheckout/domain/model/contingency/ContingencyInputFactory$HandleContingencyParams;)Lcom/paypal/oslo/feature/inappcheckout/domain/model/contingency/ContingencyInput;", "HandleContingencyParams"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ContingencyInputFactory {
    public static final int $stable = 0;

    @javax.inject.Inject
    public ContingencyInputFactory() {
    }

    public final com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput create(com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInputFactory.HandleContingencyParams parameters) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameters, "");
        com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingency = parameters.getContingency();
        if (contingency instanceof com.paypal.oslo.feature.inappcheckout.domain.entity.AddCardContingency) {
            return new com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput.AddCardContingencyInput(contingency, parameters.isLoadComplete());
        }
        if (contingency instanceof com.paypal.oslo.feature.inappcheckout.domain.entity.UpdateCardContingency) {
            return new com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput.UpdateCardContingencyInput(contingency);
        }
        if (contingency instanceof com.paypal.oslo.feature.inappcheckout.domain.entity.AuthChallengeContingency) {
            return new com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput.AuthChallengeContingencyInput(contingency, parameters.getSelectedFundingInstrumentId(), parameters.getUseBalanceSelected());
        }
        if (contingency instanceof com.paypal.oslo.feature.inappcheckout.domain.entity.EConsentContingency) {
            return new com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput.EconsentContingencyInput(contingency);
        }
        if ((contingency instanceof com.paypal.oslo.feature.inappcheckout.domain.entity.CitAuthContingency) || (contingency instanceof com.paypal.oslo.feature.inappcheckout.domain.entity.ReselectFIContingency) || (contingency instanceof com.paypal.oslo.feature.inappcheckout.domain.entity.ThreeDsContingency) || (contingency instanceof com.paypal.oslo.feature.inappcheckout.domain.entity.UserConsentForBankAccountInfoContingency) || (contingency instanceof com.paypal.oslo.feature.inappcheckout.domain.entity.BankAccountBalanceRequiredContingency)) {
            return new com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput.CommonContingencyInput(contingency);
        }
        return new com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput.UnknownContingencyInput(contingency);
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J<\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b\b\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/model/contingency/ContingencyInputFactory$HandleContingencyParams;", "", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;", "contingency", "", "selectedFundingInstrumentId", "", "useBalanceSelected", "isLoadComplete", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;Ljava/lang/String;Ljava/lang/Boolean;Z)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Boolean;", "component4", "()Z", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;Ljava/lang/String;Ljava/lang/Boolean;Z)Lcom/paypal/oslo/feature/inappcheckout/domain/model/contingency/ContingencyInputFactory$HandleContingencyParams;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;", "getContingency", "Ljava/lang/String;", "getSelectedFundingInstrumentId", "Ljava/lang/Boolean;", "getUseBalanceSelected", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class HandleContingencyParams {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingency;
        private final boolean isLoadComplete;
        private final java.lang.String selectedFundingInstrumentId;
        private final java.lang.Boolean useBalanceSelected;

        public HandleContingencyParams(com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingencyEntity, java.lang.String str, java.lang.Boolean bool, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contingencyEntity, "");
            this.contingency = contingencyEntity;
            this.selectedFundingInstrumentId = str;
            this.useBalanceSelected = bool;
            this.isLoadComplete = z;
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity getContingency() {
            return this.contingency;
        }

        public final java.lang.String getSelectedFundingInstrumentId() {
            return this.selectedFundingInstrumentId;
        }

        public final java.lang.Boolean getUseBalanceSelected() {
            return this.useBalanceSelected;
        }

        public final boolean isLoadComplete() {
            return this.isLoadComplete;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingencyEntity = this.contingency;
            java.lang.String str = this.selectedFundingInstrumentId;
            java.lang.Boolean bool = this.useBalanceSelected;
            boolean z = this.isLoadComplete;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("HandleContingencyParams(contingency=");
            sb.append(contingencyEntity);
            sb.append(", selectedFundingInstrumentId=");
            sb.append(str);
            sb.append(", useBalanceSelected=");
            sb.append(bool);
            sb.append(", isLoadComplete=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.contingency.hashCode();
            java.lang.String str = this.selectedFundingInstrumentId;
            int hashCode2 = str == null ? 0 : str.hashCode();
            java.lang.Boolean bool = this.useBalanceSelected;
            return (((((hashCode * 31) + hashCode2) * 31) + (bool != null ? bool.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.isLoadComplete);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInputFactory.HandleContingencyParams)) {
                return false;
            }
            com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInputFactory.HandleContingencyParams handleContingencyParams = (com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInputFactory.HandleContingencyParams) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.contingency, handleContingencyParams.contingency) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedFundingInstrumentId, handleContingencyParams.selectedFundingInstrumentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.useBalanceSelected, handleContingencyParams.useBalanceSelected) && this.isLoadComplete == handleContingencyParams.isLoadComplete;
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInputFactory.HandleContingencyParams copy(com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingency, java.lang.String selectedFundingInstrumentId, java.lang.Boolean useBalanceSelected, boolean isLoadComplete) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contingency, "");
            return new com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInputFactory.HandleContingencyParams(contingency, selectedFundingInstrumentId, useBalanceSelected, isLoadComplete);
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsLoadComplete() {
            return this.isLoadComplete;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Boolean getUseBalanceSelected() {
            return this.useBalanceSelected;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getSelectedFundingInstrumentId() {
            return this.selectedFundingInstrumentId;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity getContingency() {
            return this.contingency;
        }

        public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInputFactory.HandleContingencyParams copy$default(com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInputFactory.HandleContingencyParams handleContingencyParams, com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingencyEntity, java.lang.String str, java.lang.Boolean bool, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                contingencyEntity = handleContingencyParams.contingency;
            }
            if ((i & 2) != 0) {
                str = handleContingencyParams.selectedFundingInstrumentId;
            }
            if ((i & 4) != 0) {
                bool = handleContingencyParams.useBalanceSelected;
            }
            if ((i & 8) != 0) {
                z = handleContingencyParams.isLoadComplete;
            }
            return handleContingencyParams.copy(contingencyEntity, str, bool, z);
        }
    }
}
