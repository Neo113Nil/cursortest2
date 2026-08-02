package com.paypal.oslo.feature.inappcheckout.ui.ryp.contract;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract;", "", "<init>", "()V", "State", "Event", "Effect"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RypContract {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract();

    @kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001BÙ\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0017\u001a\u00020\b\u0012\b\b\u0002\u0010\u0018\u001a\u00020\b\u0012\b\b\u0002\u0010\u0019\u001a\u00020\b\u0012\b\b\u0002\u0010\u001a\u001a\u00020\b\u0012\b\b\u0002\u0010\u001b\u001a\u00020\b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b(\u0010'J\u0010\u0010)\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b)\u0010'J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b.\u0010-J\u0010\u0010/\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b/\u0010'J\u0010\u00100\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b2\u0010'J\u0012\u00103\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b3\u0010%J\u0010\u00104\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b4\u0010'J\u0010\u00105\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b5\u0010'J\u0010\u00106\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b6\u0010'J\u0010\u00107\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b7\u0010'J\u0010\u00108\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b8\u0010'J\u0012\u00109\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\b9\u0010:Jâ\u0001\u0010;\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0017\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÆ\u0001¢\u0006\u0004\b;\u0010<J\u001a\u0010>\u001a\u00020\b2\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b>\u0010?J\u0010\u0010A\u001a\u00020@HÖ\u0001¢\u0006\u0004\bA\u0010BJ\u0010\u0010C\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\bC\u0010-R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010D\u001a\u0004\bE\u0010!R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010F\u001a\u0004\bG\u0010#R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010H\u001a\u0004\bI\u0010%R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010J\u001a\u0004\b\t\u0010'R\u001a\u0010\n\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010J\u001a\u0004\b\n\u0010'R\u001a\u0010\u000b\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010J\u001a\u0004\b\u000b\u0010'R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010K\u001a\u0004\bL\u0010+R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010M\u001a\u0004\bN\u0010-R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010M\u001a\u0004\bO\u0010-R\u001a\u0010\u0012\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010J\u001a\u0004\b\u0012\u0010'R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010P\u001a\u0004\bQ\u00101R\u001a\u0010\u0015\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010J\u001a\u0004\bR\u0010'R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010H\u001a\u0004\bS\u0010%R\u001a\u0010\u0017\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010J\u001a\u0004\b\u0017\u0010'R\u001a\u0010\u0018\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010J\u001a\u0004\b\u0018\u0010'R\u001a\u0010\u0019\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010J\u001a\u0004\b\u0019\u0010'R\u001a\u0010\u001a\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010J\u001a\u0004\b\u001a\u0010'R\u001a\u0010\u001b\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010J\u001a\u0004\bT\u0010'R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010U\u001a\u0004\bV\u0010:"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$State;", "", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/InitializeCheckoutEntity;", "initializeCheckoutEntity", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BuyerInfoEntity;", "buyerInfoEntity", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;", "buyerInfoContingency", "", "isLoadComplete", "isLoading", "isFiLoading", "", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingInstrument;", "fundingInstruments", "", "selectedInstrumentId", "preferredInstrumentId", "isBalanceSelected", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BalanceSubType;", "balanceSubType", "hasContingency", "contingency", "isProcessingPayment", "isPayWithAccordionExpanded", "isBalanceEligible", "isButtonLoading", "showCardSavedToast", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "error", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/InitializeCheckoutEntity;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BuyerInfoEntity;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;ZZZLjava/util/List;Ljava/lang/String;Ljava/lang/String;ZLcom/paypal/oslo/feature/inappcheckout/domain/entity/BalanceSubType;ZLcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;ZZZZZLcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/InitializeCheckoutEntity;", "component2", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BuyerInfoEntity;", "component3", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;", "component4", "()Z", "component5", "component6", "component7", "()Ljava/util/List;", "component8", "()Ljava/lang/String;", "component9", "component10", "component11", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BalanceSubType;", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/InitializeCheckoutEntity;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BuyerInfoEntity;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;ZZZLjava/util/List;Ljava/lang/String;Ljava/lang/String;ZLcom/paypal/oslo/feature/inappcheckout/domain/entity/BalanceSubType;ZLcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;ZZZZZLcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;)Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$State;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/InitializeCheckoutEntity;", "getInitializeCheckoutEntity", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BuyerInfoEntity;", "getBuyerInfoEntity", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;", "getBuyerInfoContingency", "Z", "Ljava/util/List;", "getFundingInstruments", "Ljava/lang/String;", "getSelectedInstrumentId", "getPreferredInstrumentId", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BalanceSubType;", "getBalanceSubType", "getHasContingency", "getContingency", "getShowCardSavedToast", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class State {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.inappcheckout.domain.entity.BalanceSubType balanceSubType;
        private final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity buyerInfoContingency;
        private final com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity buyerInfoEntity;
        private final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingency;
        private final com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity error;
        private final java.util.List<com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument> fundingInstruments;
        private final boolean hasContingency;
        private final com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeCheckoutEntity initializeCheckoutEntity;
        private final boolean isBalanceEligible;
        private final boolean isBalanceSelected;
        private final boolean isButtonLoading;
        private final boolean isFiLoading;
        private final boolean isLoadComplete;
        private final boolean isLoading;
        private final boolean isPayWithAccordionExpanded;
        private final boolean isProcessingPayment;
        private final java.lang.String preferredInstrumentId;
        private final java.lang.String selectedInstrumentId;
        private final boolean showCardSavedToast;

        public State(com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeCheckoutEntity initializeCheckoutEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity buyerInfoEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingencyEntity, boolean z, boolean z2, boolean z3, java.util.List<com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument> list, java.lang.String str, java.lang.String str2, boolean z4, com.paypal.oslo.feature.inappcheckout.domain.entity.BalanceSubType balanceSubType, boolean z5, com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingencyEntity2, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity nativeXOErrorEntity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balanceSubType, "");
            this.initializeCheckoutEntity = initializeCheckoutEntity;
            this.buyerInfoEntity = buyerInfoEntity;
            this.buyerInfoContingency = contingencyEntity;
            this.isLoadComplete = z;
            this.isLoading = z2;
            this.isFiLoading = z3;
            this.fundingInstruments = list;
            this.selectedInstrumentId = str;
            this.preferredInstrumentId = str2;
            this.isBalanceSelected = z4;
            this.balanceSubType = balanceSubType;
            this.hasContingency = z5;
            this.contingency = contingencyEntity2;
            this.isProcessingPayment = z6;
            this.isPayWithAccordionExpanded = z7;
            this.isBalanceEligible = z8;
            this.isButtonLoading = z9;
            this.showCardSavedToast = z10;
            this.error = nativeXOErrorEntity;
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeCheckoutEntity getInitializeCheckoutEntity() {
            return this.initializeCheckoutEntity;
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity getBuyerInfoEntity() {
            return this.buyerInfoEntity;
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity getBuyerInfoContingency() {
            return this.buyerInfoContingency;
        }

        public final boolean isLoadComplete() {
            return this.isLoadComplete;
        }

        public final boolean isLoading() {
            return this.isLoading;
        }

        public final boolean isFiLoading() {
            return this.isFiLoading;
        }

        public /* synthetic */ State(com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeCheckoutEntity initializeCheckoutEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity buyerInfoEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingencyEntity, boolean z, boolean z2, boolean z3, java.util.List list, java.lang.String str, java.lang.String str2, boolean z4, com.paypal.oslo.feature.inappcheckout.domain.entity.BalanceSubType balanceSubType, boolean z5, com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingencyEntity2, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity nativeXOErrorEntity, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : initializeCheckoutEntity, (i & 2) != 0 ? null : buyerInfoEntity, (i & 4) != 0 ? null : contingencyEntity, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? false : z3, (i & 64) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 128) != 0 ? null : str, (i & 256) != 0 ? null : str2, (i & 512) != 0 ? false : z4, (i & 1024) != 0 ? com.paypal.oslo.feature.inappcheckout.domain.entity.BalanceSubType.BALANCE : balanceSubType, (i & 2048) != 0 ? false : z5, (i & 4096) != 0 ? null : contingencyEntity2, (i & 8192) != 0 ? false : z6, (i & 16384) != 0 ? true : z7, (i & 32768) != 0 ? false : z8, (i & 65536) != 0 ? false : z9, (i & 131072) != 0 ? false : z10, (i & 262144) != 0 ? null : nativeXOErrorEntity);
        }

        public final java.util.List<com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument> getFundingInstruments() {
            return this.fundingInstruments;
        }

        public final java.lang.String getSelectedInstrumentId() {
            return this.selectedInstrumentId;
        }

        public final java.lang.String getPreferredInstrumentId() {
            return this.preferredInstrumentId;
        }

        public final boolean isBalanceSelected() {
            return this.isBalanceSelected;
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.entity.BalanceSubType getBalanceSubType() {
            return this.balanceSubType;
        }

        public final boolean getHasContingency() {
            return this.hasContingency;
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity getContingency() {
            return this.contingency;
        }

        public final boolean isProcessingPayment() {
            return this.isProcessingPayment;
        }

        public final boolean isPayWithAccordionExpanded() {
            return this.isPayWithAccordionExpanded;
        }

        public final boolean isBalanceEligible() {
            return this.isBalanceEligible;
        }

        public final boolean isButtonLoading() {
            return this.isButtonLoading;
        }

        public final boolean getShowCardSavedToast() {
            return this.showCardSavedToast;
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeCheckoutEntity initializeCheckoutEntity = this.initializeCheckoutEntity;
            com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity buyerInfoEntity = this.buyerInfoEntity;
            com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingencyEntity = this.buyerInfoContingency;
            boolean z = this.isLoadComplete;
            boolean z2 = this.isLoading;
            boolean z3 = this.isFiLoading;
            java.util.List<com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument> list = this.fundingInstruments;
            java.lang.String str = this.selectedInstrumentId;
            java.lang.String str2 = this.preferredInstrumentId;
            boolean z4 = this.isBalanceSelected;
            com.paypal.oslo.feature.inappcheckout.domain.entity.BalanceSubType balanceSubType = this.balanceSubType;
            boolean z5 = this.hasContingency;
            com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingencyEntity2 = this.contingency;
            boolean z6 = this.isProcessingPayment;
            boolean z7 = this.isPayWithAccordionExpanded;
            boolean z8 = this.isBalanceEligible;
            boolean z9 = this.isButtonLoading;
            boolean z10 = this.showCardSavedToast;
            com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity nativeXOErrorEntity = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("State(initializeCheckoutEntity=");
            sb.append(initializeCheckoutEntity);
            sb.append(", buyerInfoEntity=");
            sb.append(buyerInfoEntity);
            sb.append(", buyerInfoContingency=");
            sb.append(contingencyEntity);
            sb.append(", isLoadComplete=");
            sb.append(z);
            sb.append(", isLoading=");
            sb.append(z2);
            sb.append(", isFiLoading=");
            sb.append(z3);
            sb.append(", fundingInstruments=");
            sb.append(list);
            sb.append(", selectedInstrumentId=");
            sb.append(str);
            sb.append(", preferredInstrumentId=");
            sb.append(str2);
            sb.append(", isBalanceSelected=");
            sb.append(z4);
            sb.append(", balanceSubType=");
            sb.append(balanceSubType);
            sb.append(", hasContingency=");
            sb.append(z5);
            sb.append(", contingency=");
            sb.append(contingencyEntity2);
            sb.append(", isProcessingPayment=");
            sb.append(z6);
            sb.append(", isPayWithAccordionExpanded=");
            sb.append(z7);
            sb.append(", isBalanceEligible=");
            sb.append(z8);
            sb.append(", isButtonLoading=");
            sb.append(z9);
            sb.append(", showCardSavedToast=");
            sb.append(z10);
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
            com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingencyEntity = this.buyerInfoContingency;
            int hashCode3 = contingencyEntity == null ? 0 : contingencyEntity.hashCode();
            int hashCode4 = java.lang.Boolean.hashCode(this.isLoadComplete);
            int hashCode5 = java.lang.Boolean.hashCode(this.isLoading);
            int hashCode6 = java.lang.Boolean.hashCode(this.isFiLoading);
            int hashCode7 = this.fundingInstruments.hashCode();
            java.lang.String str = this.selectedInstrumentId;
            int hashCode8 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.preferredInstrumentId;
            int hashCode9 = str2 == null ? 0 : str2.hashCode();
            int hashCode10 = java.lang.Boolean.hashCode(this.isBalanceSelected);
            int hashCode11 = this.balanceSubType.hashCode();
            int hashCode12 = java.lang.Boolean.hashCode(this.hasContingency);
            com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingencyEntity2 = this.contingency;
            int hashCode13 = contingencyEntity2 == null ? 0 : contingencyEntity2.hashCode();
            int hashCode14 = java.lang.Boolean.hashCode(this.isProcessingPayment);
            int hashCode15 = java.lang.Boolean.hashCode(this.isPayWithAccordionExpanded);
            int hashCode16 = java.lang.Boolean.hashCode(this.isBalanceEligible);
            int hashCode17 = java.lang.Boolean.hashCode(this.isButtonLoading);
            int hashCode18 = java.lang.Boolean.hashCode(this.showCardSavedToast);
            com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity nativeXOErrorEntity = this.error;
            return (((((((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + hashCode16) * 31) + hashCode17) * 31) + hashCode18) * 31) + (nativeXOErrorEntity != null ? nativeXOErrorEntity.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.State)) {
                return false;
            }
            com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.State state = (com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.State) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.initializeCheckoutEntity, state.initializeCheckoutEntity) && kotlin.jvm.internal.Intrinsics.areEqual(this.buyerInfoEntity, state.buyerInfoEntity) && kotlin.jvm.internal.Intrinsics.areEqual(this.buyerInfoContingency, state.buyerInfoContingency) && this.isLoadComplete == state.isLoadComplete && this.isLoading == state.isLoading && this.isFiLoading == state.isFiLoading && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingInstruments, state.fundingInstruments) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedInstrumentId, state.selectedInstrumentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.preferredInstrumentId, state.preferredInstrumentId) && this.isBalanceSelected == state.isBalanceSelected && this.balanceSubType == state.balanceSubType && this.hasContingency == state.hasContingency && kotlin.jvm.internal.Intrinsics.areEqual(this.contingency, state.contingency) && this.isProcessingPayment == state.isProcessingPayment && this.isPayWithAccordionExpanded == state.isPayWithAccordionExpanded && this.isBalanceEligible == state.isBalanceEligible && this.isButtonLoading == state.isButtonLoading && this.showCardSavedToast == state.showCardSavedToast && kotlin.jvm.internal.Intrinsics.areEqual(this.error, state.error);
        }

        public final com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.State copy(com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeCheckoutEntity initializeCheckoutEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity buyerInfoEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity buyerInfoContingency, boolean isLoadComplete, boolean isLoading, boolean isFiLoading, java.util.List<com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument> fundingInstruments, java.lang.String selectedInstrumentId, java.lang.String preferredInstrumentId, boolean isBalanceSelected, com.paypal.oslo.feature.inappcheckout.domain.entity.BalanceSubType balanceSubType, boolean hasContingency, com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingency, boolean isProcessingPayment, boolean isPayWithAccordionExpanded, boolean isBalanceEligible, boolean isButtonLoading, boolean showCardSavedToast, com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstruments, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balanceSubType, "");
            return new com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.State(initializeCheckoutEntity, buyerInfoEntity, buyerInfoContingency, isLoadComplete, isLoading, isFiLoading, fundingInstruments, selectedInstrumentId, preferredInstrumentId, isBalanceSelected, balanceSubType, hasContingency, contingency, isProcessingPayment, isPayWithAccordionExpanded, isBalanceEligible, isButtonLoading, showCardSavedToast, error);
        }

        /* renamed from: component9, reason: from getter */
        public final java.lang.String getPreferredInstrumentId() {
            return this.preferredInstrumentId;
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.String getSelectedInstrumentId() {
            return this.selectedInstrumentId;
        }

        public final java.util.List<com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument> component7() {
            return this.fundingInstruments;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getIsFiLoading() {
            return this.isFiLoading;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsLoadComplete() {
            return this.isLoadComplete;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity getBuyerInfoContingency() {
            return this.buyerInfoContingency;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity getBuyerInfoEntity() {
            return this.buyerInfoEntity;
        }

        /* renamed from: component19, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity getError() {
            return this.error;
        }

        /* renamed from: component18, reason: from getter */
        public final boolean getShowCardSavedToast() {
            return this.showCardSavedToast;
        }

        /* renamed from: component17, reason: from getter */
        public final boolean getIsButtonLoading() {
            return this.isButtonLoading;
        }

        /* renamed from: component16, reason: from getter */
        public final boolean getIsBalanceEligible() {
            return this.isBalanceEligible;
        }

        /* renamed from: component15, reason: from getter */
        public final boolean getIsPayWithAccordionExpanded() {
            return this.isPayWithAccordionExpanded;
        }

        /* renamed from: component14, reason: from getter */
        public final boolean getIsProcessingPayment() {
            return this.isProcessingPayment;
        }

        /* renamed from: component13, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity getContingency() {
            return this.contingency;
        }

        /* renamed from: component12, reason: from getter */
        public final boolean getHasContingency() {
            return this.hasContingency;
        }

        /* renamed from: component11, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.domain.entity.BalanceSubType getBalanceSubType() {
            return this.balanceSubType;
        }

        /* renamed from: component10, reason: from getter */
        public final boolean getIsBalanceSelected() {
            return this.isBalanceSelected;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeCheckoutEntity getInitializeCheckoutEntity() {
            return this.initializeCheckoutEntity;
        }

        public State() {
            this(null, null, null, false, false, false, null, null, null, false, null, false, null, false, false, false, false, false, null, 524287, null);
        }
    }

    private RypContract() {
    }

    @kotlin.Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u001a\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001dB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u001a\u001e\u001f !\"#$%&'()*+,-./01234567"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event;", "", "<init>", "()V", "OnContent", "SelectPaymentInstrument", "SetBalanceSelection", "SetPayWithAccordionExpanded", "ConfirmPayment", "NavigateToAddCard", "NavigateToUpdateCard", "NavigateToAddCardOnContingencyResponse", "NavigateToEConsentOnContingencyResponse", "HandleBackPress", "NavigateToProfile", "OnAgreeAndContinue", "RetryLastOperation", "OnEConsentGiven", "OnAddOrUpdateCardResult", "OnCardSavedToastVisibilityChange", "OnRetryFiOnAddOrUpdateCardFailure", "OnAuthorizeBACreationSuccess", "OnAuthorizeBACreationContingency", "OnAuthorizeBACreationFailure", "OnContingencyNotHandled", "OnContingencyError", "ReturnToMerchant", "OnDisclaimerLinkClick", "OnDynamicLinkClick", "TrackAnalyticsEvent", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event$ConfirmPayment;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event$HandleBackPress;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event$NavigateToAddCard;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event$NavigateToAddCardOnContingencyResponse;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event$NavigateToEConsentOnContingencyResponse;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event$NavigateToProfile;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event$NavigateToUpdateCard;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event$OnAddOrUpdateCardResult;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event$OnAgreeAndContinue;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event$OnAuthorizeBACreationContingency;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event$OnAuthorizeBACreationFailure;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event$OnAuthorizeBACreationSuccess;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event$OnCardSavedToastVisibilityChange;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event$OnContent;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event$OnContingencyError;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event$OnContingencyNotHandled;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event$OnDisclaimerLinkClick;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event$OnDynamicLinkClick;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event$OnEConsentGiven;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event$OnRetryFiOnAddOrUpdateCardFailure;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event$RetryLastOperation;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event$ReturnToMerchant;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event$SelectPaymentInstrument;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event$SetBalanceSelection;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event$SetPayWithAccordionExpanded;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event$TrackAnalyticsEvent;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Event {
        public static final int $stable = 0;

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event$OnContent;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;", "response", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;)Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event$OnContent;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;", "getResponse"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class OnContent extends com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event {
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
                return (other instanceof com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnContent) && kotlin.jvm.internal.Intrinsics.areEqual(this.response, ((com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnContent) other).response);
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnContent copy(com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse response) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
                return new com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnContent(response);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse getResponse() {
                return this.response;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnContent copy$default(com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnContent onContent, com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse authenticationXOResponse, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    authenticationXOResponse = onContent.response;
                }
                return onContent.copy(authenticationXOResponse);
            }
        }

        private Event() {
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event$SelectPaymentInstrument;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event;", "", "instrumentId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event$SelectPaymentInstrument;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getInstrumentId"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class SelectPaymentInstrument extends com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event {
            public static final int $stable = 0;
            private final java.lang.String instrumentId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SelectPaymentInstrument(java.lang.String str) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.instrumentId = str;
            }

            public final java.lang.String getInstrumentId() {
                return this.instrumentId;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.instrumentId;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("SelectPaymentInstrument(instrumentId=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.instrumentId.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.SelectPaymentInstrument) && kotlin.jvm.internal.Intrinsics.areEqual(this.instrumentId, ((com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.SelectPaymentInstrument) other).instrumentId);
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.SelectPaymentInstrument copy(java.lang.String instrumentId) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrumentId, "");
                return new com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.SelectPaymentInstrument(instrumentId);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getInstrumentId() {
                return this.instrumentId;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.SelectPaymentInstrument copy$default(com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.SelectPaymentInstrument selectPaymentInstrument, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = selectPaymentInstrument.instrumentId;
                }
                return selectPaymentInstrument.copy(str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0003\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event$SetBalanceSelection;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event;", "", "isSelected", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event$SetBalanceSelection;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class SetBalanceSelection extends com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event {
            public static final int $stable = 0;
            private final boolean isSelected;

            public SetBalanceSelection(boolean z) {
                super(null);
                this.isSelected = z;
            }

            public final boolean isSelected() {
                return this.isSelected;
            }

            public final java.lang.String toString() {
                boolean z = this.isSelected;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("SetBalanceSelection(isSelected=");
                sb.append(z);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return java.lang.Boolean.hashCode(this.isSelected);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.SetBalanceSelection) && this.isSelected == ((com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.SetBalanceSelection) other).isSelected;
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.SetBalanceSelection copy(boolean isSelected) {
                return new com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.SetBalanceSelection(isSelected);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getIsSelected() {
                return this.isSelected;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.SetBalanceSelection copy$default(com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.SetBalanceSelection setBalanceSelection, boolean z, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    z = setBalanceSelection.isSelected;
                }
                return setBalanceSelection.copy(z);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0003\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event$SetPayWithAccordionExpanded;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event;", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.IS_EXPANDED, "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event$SetPayWithAccordionExpanded;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class SetPayWithAccordionExpanded extends com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event {
            public static final int $stable = 0;
            private final boolean isExpanded;

            public SetPayWithAccordionExpanded(boolean z) {
                super(null);
                this.isExpanded = z;
            }

            public final boolean isExpanded() {
                return this.isExpanded;
            }

            public final java.lang.String toString() {
                boolean z = this.isExpanded;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("SetPayWithAccordionExpanded(isExpanded=");
                sb.append(z);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return java.lang.Boolean.hashCode(this.isExpanded);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.SetPayWithAccordionExpanded) && this.isExpanded == ((com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.SetPayWithAccordionExpanded) other).isExpanded;
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.SetPayWithAccordionExpanded copy(boolean isExpanded) {
                return new com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.SetPayWithAccordionExpanded(isExpanded);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getIsExpanded() {
                return this.isExpanded;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.SetPayWithAccordionExpanded copy$default(com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.SetPayWithAccordionExpanded setPayWithAccordionExpanded, boolean z, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    z = setPayWithAccordionExpanded.isExpanded;
                }
                return setPayWithAccordionExpanded.copy(z);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event$ConfirmPayment;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class ConfirmPayment extends com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.ConfirmPayment INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.ConfirmPayment();

            private ConfirmPayment() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event$NavigateToAddCard;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class NavigateToAddCard extends com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.NavigateToAddCard INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.NavigateToAddCard();

            private NavigateToAddCard() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event$NavigateToUpdateCard;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/UpdateCardParams;", "updateCardParams", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/model/UpdateCardParams;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/domain/model/UpdateCardParams;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/domain/model/UpdateCardParams;)Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event$NavigateToUpdateCard;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/UpdateCardParams;", "getUpdateCardParams"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class NavigateToUpdateCard extends com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.inappcheckout.domain.model.UpdateCardParams updateCardParams;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NavigateToUpdateCard(com.paypal.oslo.feature.inappcheckout.domain.model.UpdateCardParams updateCardParams) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateCardParams, "");
                this.updateCardParams = updateCardParams;
            }

            public final com.paypal.oslo.feature.inappcheckout.domain.model.UpdateCardParams getUpdateCardParams() {
                return this.updateCardParams;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.inappcheckout.domain.model.UpdateCardParams updateCardParams = this.updateCardParams;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToUpdateCard(updateCardParams=");
                sb.append(updateCardParams);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.updateCardParams.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.NavigateToUpdateCard) && kotlin.jvm.internal.Intrinsics.areEqual(this.updateCardParams, ((com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.NavigateToUpdateCard) other).updateCardParams);
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.NavigateToUpdateCard copy(com.paypal.oslo.feature.inappcheckout.domain.model.UpdateCardParams updateCardParams) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateCardParams, "");
                return new com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.NavigateToUpdateCard(updateCardParams);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.inappcheckout.domain.model.UpdateCardParams getUpdateCardParams() {
                return this.updateCardParams;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.NavigateToUpdateCard copy$default(com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.NavigateToUpdateCard navigateToUpdateCard, com.paypal.oslo.feature.inappcheckout.domain.model.UpdateCardParams updateCardParams, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    updateCardParams = navigateToUpdateCard.updateCardParams;
                }
                return navigateToUpdateCard.copy(updateCardParams);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event$NavigateToAddCardOnContingencyResponse;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class NavigateToAddCardOnContingencyResponse extends com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.NavigateToAddCardOnContingencyResponse INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.NavigateToAddCardOnContingencyResponse();

            private NavigateToAddCardOnContingencyResponse() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event$NavigateToEConsentOnContingencyResponse;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class NavigateToEConsentOnContingencyResponse extends com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.NavigateToEConsentOnContingencyResponse INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.NavigateToEConsentOnContingencyResponse();

            private NavigateToEConsentOnContingencyResponse() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event$HandleBackPress;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class HandleBackPress extends com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.HandleBackPress INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.HandleBackPress();

            private HandleBackPress() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event$NavigateToProfile;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class NavigateToProfile extends com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.NavigateToProfile INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.NavigateToProfile();

            private NavigateToProfile() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event$OnAgreeAndContinue;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class OnAgreeAndContinue extends com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnAgreeAndContinue INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnAgreeAndContinue();

            private OnAgreeAndContinue() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event$RetryLastOperation;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class RetryLastOperation extends com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.RetryLastOperation INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.RetryLastOperation();

            private RetryLastOperation() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event$OnEConsentGiven;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class OnEConsentGiven extends com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnEConsentGiven INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnEConsentGiven();

            private OnEConsentGiven() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event$OnAddOrUpdateCardResult;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event;", "", "cardSavedSuccessfully", "billingAddressAdded", "<init>", "(ZZ)V", "component1", "()Z", "component2", "copy", "(ZZ)Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event$OnAddOrUpdateCardResult;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getCardSavedSuccessfully", "getBillingAddressAdded"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class OnAddOrUpdateCardResult extends com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event {
            public static final int $stable = 0;
            private final boolean billingAddressAdded;
            private final boolean cardSavedSuccessfully;

            public OnAddOrUpdateCardResult(boolean z, boolean z2) {
                super(null);
                this.cardSavedSuccessfully = z;
                this.billingAddressAdded = z2;
            }

            public final boolean getCardSavedSuccessfully() {
                return this.cardSavedSuccessfully;
            }

            public final boolean getBillingAddressAdded() {
                return this.billingAddressAdded;
            }

            public final java.lang.String toString() {
                boolean z = this.cardSavedSuccessfully;
                boolean z2 = this.billingAddressAdded;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("OnAddOrUpdateCardResult(cardSavedSuccessfully=");
                sb.append(z);
                sb.append(", billingAddressAdded=");
                sb.append(z2);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return (java.lang.Boolean.hashCode(this.cardSavedSuccessfully) * 31) + java.lang.Boolean.hashCode(this.billingAddressAdded);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnAddOrUpdateCardResult)) {
                    return false;
                }
                com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnAddOrUpdateCardResult onAddOrUpdateCardResult = (com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnAddOrUpdateCardResult) other;
                return this.cardSavedSuccessfully == onAddOrUpdateCardResult.cardSavedSuccessfully && this.billingAddressAdded == onAddOrUpdateCardResult.billingAddressAdded;
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnAddOrUpdateCardResult copy(boolean cardSavedSuccessfully, boolean billingAddressAdded) {
                return new com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnAddOrUpdateCardResult(cardSavedSuccessfully, billingAddressAdded);
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getBillingAddressAdded() {
                return this.billingAddressAdded;
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getCardSavedSuccessfully() {
                return this.cardSavedSuccessfully;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnAddOrUpdateCardResult copy$default(com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnAddOrUpdateCardResult onAddOrUpdateCardResult, boolean z, boolean z2, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    z = onAddOrUpdateCardResult.cardSavedSuccessfully;
                }
                if ((i & 2) != 0) {
                    z2 = onAddOrUpdateCardResult.billingAddressAdded;
                }
                return onAddOrUpdateCardResult.copy(z, z2);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0003\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event$OnCardSavedToastVisibilityChange;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event;", "", "isVisible", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event$OnCardSavedToastVisibilityChange;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class OnCardSavedToastVisibilityChange extends com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event {
            public static final int $stable = 0;
            private final boolean isVisible;

            public OnCardSavedToastVisibilityChange(boolean z) {
                super(null);
                this.isVisible = z;
            }

            public final boolean isVisible() {
                return this.isVisible;
            }

            public final java.lang.String toString() {
                boolean z = this.isVisible;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("OnCardSavedToastVisibilityChange(isVisible=");
                sb.append(z);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return java.lang.Boolean.hashCode(this.isVisible);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnCardSavedToastVisibilityChange) && this.isVisible == ((com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnCardSavedToastVisibilityChange) other).isVisible;
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnCardSavedToastVisibilityChange copy(boolean isVisible) {
                return new com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnCardSavedToastVisibilityChange(isVisible);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getIsVisible() {
                return this.isVisible;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnCardSavedToastVisibilityChange copy$default(com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnCardSavedToastVisibilityChange onCardSavedToastVisibilityChange, boolean z, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    z = onCardSavedToastVisibilityChange.isVisible;
                }
                return onCardSavedToastVisibilityChange.copy(z);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event$OnRetryFiOnAddOrUpdateCardFailure;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "error", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;)Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event$OnRetryFiOnAddOrUpdateCardFailure;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class OnRetryFiOnAddOrUpdateCardFailure extends com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity error;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnRetryFiOnAddOrUpdateCardFailure(com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity nativeXOErrorEntity) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeXOErrorEntity, "");
                this.error = nativeXOErrorEntity;
            }

            public final com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity getError() {
                return this.error;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity nativeXOErrorEntity = this.error;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("OnRetryFiOnAddOrUpdateCardFailure(error=");
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
                return (other instanceof com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnRetryFiOnAddOrUpdateCardFailure) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnRetryFiOnAddOrUpdateCardFailure) other).error);
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnRetryFiOnAddOrUpdateCardFailure copy(com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity error) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
                return new com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnRetryFiOnAddOrUpdateCardFailure(error);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity getError() {
                return this.error;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnRetryFiOnAddOrUpdateCardFailure copy$default(com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnRetryFiOnAddOrUpdateCardFailure onRetryFiOnAddOrUpdateCardFailure, com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity nativeXOErrorEntity, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    nativeXOErrorEntity = onRetryFiOnAddOrUpdateCardFailure.error;
                }
                return onRetryFiOnAddOrUpdateCardFailure.copy(nativeXOErrorEntity);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event$OnAuthorizeBACreationSuccess;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthorizeBACreationEntity;", "entity", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthorizeBACreationEntity;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthorizeBACreationEntity;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthorizeBACreationEntity;)Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event$OnAuthorizeBACreationSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthorizeBACreationEntity;", "getEntity"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class OnAuthorizeBACreationSuccess extends com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event {
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
                return (other instanceof com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnAuthorizeBACreationSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.entity, ((com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnAuthorizeBACreationSuccess) other).entity);
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnAuthorizeBACreationSuccess copy(com.paypal.oslo.feature.inappcheckout.domain.entity.AuthorizeBACreationEntity entity) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entity, "");
                return new com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnAuthorizeBACreationSuccess(entity);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.inappcheckout.domain.entity.AuthorizeBACreationEntity getEntity() {
                return this.entity;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnAuthorizeBACreationSuccess copy$default(com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnAuthorizeBACreationSuccess onAuthorizeBACreationSuccess, com.paypal.oslo.feature.inappcheckout.domain.entity.AuthorizeBACreationEntity authorizeBACreationEntity, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    authorizeBACreationEntity = onAuthorizeBACreationSuccess.entity;
                }
                return onAuthorizeBACreationSuccess.copy(authorizeBACreationEntity);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event$OnAuthorizeBACreationContingency;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;", "entity", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;)Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event$OnAuthorizeBACreationContingency;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;", "getEntity"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class OnAuthorizeBACreationContingency extends com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event {
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
                return (other instanceof com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnAuthorizeBACreationContingency) && kotlin.jvm.internal.Intrinsics.areEqual(this.entity, ((com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnAuthorizeBACreationContingency) other).entity);
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnAuthorizeBACreationContingency copy(com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity entity) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entity, "");
                return new com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnAuthorizeBACreationContingency(entity);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity getEntity() {
                return this.entity;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnAuthorizeBACreationContingency copy$default(com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnAuthorizeBACreationContingency onAuthorizeBACreationContingency, com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingencyEntity, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    contingencyEntity = onAuthorizeBACreationContingency.entity;
                }
                return onAuthorizeBACreationContingency.copy(contingencyEntity);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event$OnAuthorizeBACreationFailure;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "entity", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;)Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event$OnAuthorizeBACreationFailure;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "getEntity"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class OnAuthorizeBACreationFailure extends com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event {
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
                return (other instanceof com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnAuthorizeBACreationFailure) && kotlin.jvm.internal.Intrinsics.areEqual(this.entity, ((com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnAuthorizeBACreationFailure) other).entity);
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnAuthorizeBACreationFailure copy(com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity entity) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entity, "");
                return new com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnAuthorizeBACreationFailure(entity);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity getEntity() {
                return this.entity;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnAuthorizeBACreationFailure copy$default(com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnAuthorizeBACreationFailure onAuthorizeBACreationFailure, com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity nativeXOErrorEntity, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    nativeXOErrorEntity = onAuthorizeBACreationFailure.entity;
                }
                return onAuthorizeBACreationFailure.copy(nativeXOErrorEntity);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event$OnContingencyNotHandled;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class OnContingencyNotHandled extends com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnContingencyNotHandled INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnContingencyNotHandled();

            private OnContingencyNotHandled() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event$OnContingencyError;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "error", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;)Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event$OnContingencyError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class OnContingencyError extends com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event {
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
                return (other instanceof com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnContingencyError) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnContingencyError) other).error);
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnContingencyError copy(com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity error) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
                return new com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnContingencyError(error);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity getError() {
                return this.error;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnContingencyError copy$default(com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnContingencyError onContingencyError, com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity nativeXOErrorEntity, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    nativeXOErrorEntity = onContingencyError.error;
                }
                return onContingencyError.copy(nativeXOErrorEntity);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event$ReturnToMerchant;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class ReturnToMerchant extends com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.ReturnToMerchant INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.ReturnToMerchant();

            private ReturnToMerchant() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event$OnDisclaimerLinkClick;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/InAppCheckoutLink;", "link", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/model/InAppCheckoutLink;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/domain/model/InAppCheckoutLink;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/domain/model/InAppCheckoutLink;)Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event$OnDisclaimerLinkClick;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/InAppCheckoutLink;", "getLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class OnDisclaimerLinkClick extends com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.inappcheckout.domain.model.InAppCheckoutLink link;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnDisclaimerLinkClick(com.paypal.oslo.feature.inappcheckout.domain.model.InAppCheckoutLink inAppCheckoutLink) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inAppCheckoutLink, "");
                this.link = inAppCheckoutLink;
            }

            public final com.paypal.oslo.feature.inappcheckout.domain.model.InAppCheckoutLink getLink() {
                return this.link;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.inappcheckout.domain.model.InAppCheckoutLink inAppCheckoutLink = this.link;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("OnDisclaimerLinkClick(link=");
                sb.append(inAppCheckoutLink);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.link.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnDisclaimerLinkClick) && this.link == ((com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnDisclaimerLinkClick) other).link;
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnDisclaimerLinkClick copy(com.paypal.oslo.feature.inappcheckout.domain.model.InAppCheckoutLink link) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(link, "");
                return new com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnDisclaimerLinkClick(link);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.inappcheckout.domain.model.InAppCheckoutLink getLink() {
                return this.link;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnDisclaimerLinkClick copy$default(com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnDisclaimerLinkClick onDisclaimerLinkClick, com.paypal.oslo.feature.inappcheckout.domain.model.InAppCheckoutLink inAppCheckoutLink, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    inAppCheckoutLink = onDisclaimerLinkClick.link;
                }
                return onDisclaimerLinkClick.copy(inAppCheckoutLink);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event$OnDynamicLinkClick;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event;", "", "url", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event$OnDynamicLinkClick;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl", "getTitle"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class OnDynamicLinkClick extends com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event {
            public static final int $stable = 0;
            private final java.lang.String title;
            private final java.lang.String url;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnDynamicLinkClick(java.lang.String str, java.lang.String str2) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                this.url = str;
                this.title = str2;
            }

            public final java.lang.String getTitle() {
                return this.title;
            }

            public final java.lang.String getUrl() {
                return this.url;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.url;
                java.lang.String str2 = this.title;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("OnDynamicLinkClick(url=");
                sb.append(str);
                sb.append(", title=");
                sb.append(str2);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return (this.url.hashCode() * 31) + this.title.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnDynamicLinkClick)) {
                    return false;
                }
                com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnDynamicLinkClick onDynamicLinkClick = (com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnDynamicLinkClick) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.url, onDynamicLinkClick.url) && kotlin.jvm.internal.Intrinsics.areEqual(this.title, onDynamicLinkClick.title);
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnDynamicLinkClick copy(java.lang.String url, java.lang.String title) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
                return new com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnDynamicLinkClick(url, title);
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getTitle() {
                return this.title;
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getUrl() {
                return this.url;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnDynamicLinkClick copy$default(com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnDynamicLinkClick onDynamicLinkClick, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = onDynamicLinkClick.url;
                }
                if ((i & 2) != 0) {
                    str2 = onDynamicLinkClick.title;
                }
                return onDynamicLinkClick.copy(str, str2);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event$TrackAnalyticsEvent;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event;", "Lcom/paypal/oslo/feature/inappcheckout/analytics/ryp/RypAnalyticsEvent;", "event", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/analytics/ryp/RypAnalyticsEvent;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/analytics/ryp/RypAnalyticsEvent;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/analytics/ryp/RypAnalyticsEvent;)Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event$TrackAnalyticsEvent;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/analytics/ryp/RypAnalyticsEvent;", "getEvent"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class TrackAnalyticsEvent extends com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent event;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TrackAnalyticsEvent(com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent rypAnalyticsEvent) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rypAnalyticsEvent, "");
                this.event = rypAnalyticsEvent;
            }

            public final com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent getEvent() {
                return this.event;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent rypAnalyticsEvent = this.event;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("TrackAnalyticsEvent(event=");
                sb.append(rypAnalyticsEvent);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.event.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.TrackAnalyticsEvent) && kotlin.jvm.internal.Intrinsics.areEqual(this.event, ((com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.TrackAnalyticsEvent) other).event);
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.TrackAnalyticsEvent copy(com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent event) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
                return new com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.TrackAnalyticsEvent(event);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent getEvent() {
                return this.event;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.TrackAnalyticsEvent copy$default(com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.TrackAnalyticsEvent trackAnalyticsEvent, com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent rypAnalyticsEvent, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    rypAnalyticsEvent = trackAnalyticsEvent.event;
                }
                return trackAnalyticsEvent.copy(rypAnalyticsEvent);
            }
        }

        public /* synthetic */ Event(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Effect;", "", "<init>", "()V", "NavigateToAddCard", "NavigateToUpdateCard", "NavigateToSuccessScreen", "NavigateToProfile", "LoadCardMetaData", "ReloadCardFormData", "NavigateToEConsent", com.paypal.oslo.feature.pools.constants.PoolsConstants.EffectNames.EFFECT_NAVIGATE_TO_ERROR, "NavigateBackToMerchant", "NavigateToNativeInAppWebView", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Effect$LoadCardMetaData;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Effect$NavigateBackToMerchant;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Effect$NavigateToAddCard;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Effect$NavigateToEConsent;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Effect$NavigateToError;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Effect$NavigateToNativeInAppWebView;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Effect$NavigateToProfile;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Effect$NavigateToSuccessScreen;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Effect$NavigateToUpdateCard;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Effect$ReloadCardFormData;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Effect {
        public static final int $stable = 0;

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Effect$NavigateToAddCard;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Effect;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class NavigateToAddCard extends com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Effect {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Effect.NavigateToAddCard INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Effect.NavigateToAddCard();

            private NavigateToAddCard() {
                super(null);
            }
        }

        private Effect() {
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Effect$NavigateToUpdateCard;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Effect;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/UpdateCardParams;", "updateCardParams", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/model/UpdateCardParams;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/domain/model/UpdateCardParams;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/domain/model/UpdateCardParams;)Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Effect$NavigateToUpdateCard;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/UpdateCardParams;", "getUpdateCardParams"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class NavigateToUpdateCard extends com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Effect {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.inappcheckout.domain.model.UpdateCardParams updateCardParams;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NavigateToUpdateCard(com.paypal.oslo.feature.inappcheckout.domain.model.UpdateCardParams updateCardParams) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateCardParams, "");
                this.updateCardParams = updateCardParams;
            }

            public final com.paypal.oslo.feature.inappcheckout.domain.model.UpdateCardParams getUpdateCardParams() {
                return this.updateCardParams;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.inappcheckout.domain.model.UpdateCardParams updateCardParams = this.updateCardParams;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToUpdateCard(updateCardParams=");
                sb.append(updateCardParams);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.updateCardParams.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Effect.NavigateToUpdateCard) && kotlin.jvm.internal.Intrinsics.areEqual(this.updateCardParams, ((com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Effect.NavigateToUpdateCard) other).updateCardParams);
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Effect.NavigateToUpdateCard copy(com.paypal.oslo.feature.inappcheckout.domain.model.UpdateCardParams updateCardParams) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateCardParams, "");
                return new com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Effect.NavigateToUpdateCard(updateCardParams);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.inappcheckout.domain.model.UpdateCardParams getUpdateCardParams() {
                return this.updateCardParams;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Effect.NavigateToUpdateCard copy$default(com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Effect.NavigateToUpdateCard navigateToUpdateCard, com.paypal.oslo.feature.inappcheckout.domain.model.UpdateCardParams updateCardParams, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    updateCardParams = navigateToUpdateCard.updateCardParams;
                }
                return navigateToUpdateCard.copy(updateCardParams);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Effect$NavigateToSuccessScreen;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Effect;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/ThanksScreenData;", "thanksScreenData", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/model/ThanksScreenData;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/domain/model/ThanksScreenData;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/domain/model/ThanksScreenData;)Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Effect$NavigateToSuccessScreen;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/ThanksScreenData;", "getThanksScreenData"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class NavigateToSuccessScreen extends com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Effect {
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
                return (other instanceof com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Effect.NavigateToSuccessScreen) && kotlin.jvm.internal.Intrinsics.areEqual(this.thanksScreenData, ((com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Effect.NavigateToSuccessScreen) other).thanksScreenData);
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Effect.NavigateToSuccessScreen copy(com.paypal.oslo.feature.inappcheckout.domain.model.ThanksScreenData thanksScreenData) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(thanksScreenData, "");
                return new com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Effect.NavigateToSuccessScreen(thanksScreenData);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.inappcheckout.domain.model.ThanksScreenData getThanksScreenData() {
                return this.thanksScreenData;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Effect.NavigateToSuccessScreen copy$default(com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Effect.NavigateToSuccessScreen navigateToSuccessScreen, com.paypal.oslo.feature.inappcheckout.domain.model.ThanksScreenData thanksScreenData, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    thanksScreenData = navigateToSuccessScreen.thanksScreenData;
                }
                return navigateToSuccessScreen.copy(thanksScreenData);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Effect$NavigateToProfile;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Effect;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class NavigateToProfile extends com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Effect {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Effect.NavigateToProfile INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Effect.NavigateToProfile();

            private NavigateToProfile() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Effect$LoadCardMetaData;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Effect;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class LoadCardMetaData extends com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Effect {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Effect.LoadCardMetaData INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Effect.LoadCardMetaData();

            private LoadCardMetaData() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Effect$ReloadCardFormData;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Effect;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class ReloadCardFormData extends com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Effect {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Effect.ReloadCardFormData INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Effect.ReloadCardFormData();

            private ReloadCardFormData() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Effect$NavigateToEConsent;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Effect;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BuyerInfoEntity;", "entity", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BuyerInfoEntity;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BuyerInfoEntity;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BuyerInfoEntity;)Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Effect$NavigateToEConsent;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BuyerInfoEntity;", "getEntity"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class NavigateToEConsent extends com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Effect {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity entity;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NavigateToEConsent(com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity buyerInfoEntity) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buyerInfoEntity, "");
                this.entity = buyerInfoEntity;
            }

            public final com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity getEntity() {
                return this.entity;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity buyerInfoEntity = this.entity;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToEConsent(entity=");
                sb.append(buyerInfoEntity);
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
                return (other instanceof com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Effect.NavigateToEConsent) && kotlin.jvm.internal.Intrinsics.areEqual(this.entity, ((com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Effect.NavigateToEConsent) other).entity);
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Effect.NavigateToEConsent copy(com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity entity) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entity, "");
                return new com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Effect.NavigateToEConsent(entity);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity getEntity() {
                return this.entity;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Effect.NavigateToEConsent copy$default(com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Effect.NavigateToEConsent navigateToEConsent, com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity buyerInfoEntity, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    buyerInfoEntity = navigateToEConsent.entity;
                }
                return navigateToEConsent.copy(buyerInfoEntity);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Effect$NavigateToError;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Effect;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/ErrorScreenType;", "errorScreenType", "", "returnUrl", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/model/ErrorScreenType;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/domain/model/ErrorScreenType;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/domain/model/ErrorScreenType;Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Effect$NavigateToError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/ErrorScreenType;", "getErrorScreenType", "Ljava/lang/String;", "getReturnUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class NavigateToError extends com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Effect {
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
                if (!(other instanceof com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Effect.NavigateToError)) {
                    return false;
                }
                com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Effect.NavigateToError navigateToError = (com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Effect.NavigateToError) other;
                return this.errorScreenType == navigateToError.errorScreenType && kotlin.jvm.internal.Intrinsics.areEqual(this.returnUrl, navigateToError.returnUrl);
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Effect.NavigateToError copy(com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType errorScreenType, java.lang.String returnUrl) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorScreenType, "");
                return new com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Effect.NavigateToError(errorScreenType, returnUrl);
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getReturnUrl() {
                return this.returnUrl;
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType getErrorScreenType() {
                return this.errorScreenType;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Effect.NavigateToError copy$default(com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Effect.NavigateToError navigateToError, com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType errorScreenType, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    errorScreenType = navigateToError.errorScreenType;
                }
                if ((i & 2) != 0) {
                    str = navigateToError.returnUrl;
                }
                return navigateToError.copy(errorScreenType, str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Effect$NavigateBackToMerchant;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Effect;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class NavigateBackToMerchant extends com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Effect {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Effect.NavigateBackToMerchant INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Effect.NavigateBackToMerchant();

            private NavigateBackToMerchant() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Effect$NavigateToNativeInAppWebView;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Effect;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/NativeInAppWebViewData;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/model/NativeInAppWebViewData;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/domain/model/NativeInAppWebViewData;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/domain/model/NativeInAppWebViewData;)Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Effect$NavigateToNativeInAppWebView;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/NativeInAppWebViewData;", "getData"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class NavigateToNativeInAppWebView extends com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Effect {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.inappcheckout.domain.model.NativeInAppWebViewData data;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NavigateToNativeInAppWebView(com.paypal.oslo.feature.inappcheckout.domain.model.NativeInAppWebViewData nativeInAppWebViewData) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeInAppWebViewData, "");
                this.data = nativeInAppWebViewData;
            }

            public final com.paypal.oslo.feature.inappcheckout.domain.model.NativeInAppWebViewData getData() {
                return this.data;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.inappcheckout.domain.model.NativeInAppWebViewData nativeInAppWebViewData = this.data;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToNativeInAppWebView(data=");
                sb.append(nativeInAppWebViewData);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.data.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Effect.NavigateToNativeInAppWebView) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, ((com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Effect.NavigateToNativeInAppWebView) other).data);
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Effect.NavigateToNativeInAppWebView copy(com.paypal.oslo.feature.inappcheckout.domain.model.NativeInAppWebViewData data) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
                return new com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Effect.NavigateToNativeInAppWebView(data);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.inappcheckout.domain.model.NativeInAppWebViewData getData() {
                return this.data;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Effect.NavigateToNativeInAppWebView copy$default(com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Effect.NavigateToNativeInAppWebView navigateToNativeInAppWebView, com.paypal.oslo.feature.inappcheckout.domain.model.NativeInAppWebViewData nativeInAppWebViewData, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    nativeInAppWebViewData = navigateToNativeInAppWebView.data;
                }
                return navigateToNativeInAppWebView.copy(nativeInAppWebViewData);
            }
        }

        public /* synthetic */ Effect(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
