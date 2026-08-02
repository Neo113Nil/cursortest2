package com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0005\n\u000b\f\r\u000eB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fundingoptions/mvi/FundingOptionsComponentEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "FetchBalanceAmountData", "FetchFundingOptionsData", "OnFundingSourceChanged", "OnFundingOptionsDataFetched", "OnFundingOptionsDataFetchFailed", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fundingoptions/mvi/FundingOptionsComponentEvent$FetchBalanceAmountData;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fundingoptions/mvi/FundingOptionsComponentEvent$FetchFundingOptionsData;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fundingoptions/mvi/FundingOptionsComponentEvent$OnFundingOptionsDataFetchFailed;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fundingoptions/mvi/FundingOptionsComponentEvent$OnFundingOptionsDataFetched;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fundingoptions/mvi/FundingOptionsComponentEvent$OnFundingSourceChanged;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class FundingOptionsComponentEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fundingoptions/mvi/FundingOptionsComponentEvent$FetchBalanceAmountData;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fundingoptions/mvi/FundingOptionsComponentEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FetchBalanceAmountData extends com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentEvent.FetchBalanceAmountData INSTANCE = new com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentEvent.FetchBalanceAmountData();

        public final int hashCode() {
            return -1447276803;
        }

        private FetchBalanceAmountData() {
            super("FetchBalanceAmountData", null);
        }

        public final java.lang.String toString() {
            return "FetchBalanceAmountData";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentEvent.FetchBalanceAmountData)) {
                return false;
            }
            return true;
        }
    }

    private FundingOptionsComponentEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fundingoptions/mvi/FundingOptionsComponentEvent$FetchFundingOptionsData;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fundingoptions/mvi/FundingOptionsComponentEvent;", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "", "cardId", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardEvaluateFundingOptionsEntryPoint;", "entryPoint", "<init>", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardEvaluateFundingOptionsEntryPoint;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardEvaluateFundingOptionsEntryPoint;", "copy", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardEvaluateFundingOptionsEntryPoint;)Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fundingoptions/mvi/FundingOptionsComponentEvent$FetchFundingOptionsData;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "getProductName", "Ljava/lang/String;", "getCardId", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardEvaluateFundingOptionsEntryPoint;", "getEntryPoint"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FetchFundingOptionsData extends com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentEvent {
        public static final int $stable = 0;
        private final java.lang.String cardId;
        private final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardEvaluateFundingOptionsEntryPoint entryPoint;
        private final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FetchFundingOptionsData(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str, com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardEvaluateFundingOptionsEntryPoint debitCardEvaluateFundingOptionsEntryPoint) {
            super("FetchFundingOptionsData", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardProductName, "");
            this.productName = debitCardProductName;
            this.cardId = str;
            this.entryPoint = debitCardEvaluateFundingOptionsEntryPoint;
        }

        public /* synthetic */ FetchFundingOptionsData(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str, com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardEvaluateFundingOptionsEntryPoint debitCardEvaluateFundingOptionsEntryPoint, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(debitCardProductName, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : debitCardEvaluateFundingOptionsEntryPoint);
        }

        public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
            return this.productName;
        }

        public final java.lang.String getCardId() {
            return this.cardId;
        }

        public final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardEvaluateFundingOptionsEntryPoint getEntryPoint() {
            return this.entryPoint;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName = this.productName;
            java.lang.String str = this.cardId;
            com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardEvaluateFundingOptionsEntryPoint debitCardEvaluateFundingOptionsEntryPoint = this.entryPoint;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FetchFundingOptionsData(productName=");
            sb.append(debitCardProductName);
            sb.append(", cardId=");
            sb.append(str);
            sb.append(", entryPoint=");
            sb.append(debitCardEvaluateFundingOptionsEntryPoint);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.productName.hashCode();
            java.lang.String str = this.cardId;
            int hashCode2 = str == null ? 0 : str.hashCode();
            com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardEvaluateFundingOptionsEntryPoint debitCardEvaluateFundingOptionsEntryPoint = this.entryPoint;
            return (((hashCode * 31) + hashCode2) * 31) + (debitCardEvaluateFundingOptionsEntryPoint != null ? debitCardEvaluateFundingOptionsEntryPoint.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentEvent.FetchFundingOptionsData)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentEvent.FetchFundingOptionsData fetchFundingOptionsData = (com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentEvent.FetchFundingOptionsData) other;
            return this.productName == fetchFundingOptionsData.productName && kotlin.jvm.internal.Intrinsics.areEqual(this.cardId, fetchFundingOptionsData.cardId) && this.entryPoint == fetchFundingOptionsData.entryPoint;
        }

        public final com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentEvent.FetchFundingOptionsData copy(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName, java.lang.String cardId, com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardEvaluateFundingOptionsEntryPoint entryPoint) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productName, "");
            return new com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentEvent.FetchFundingOptionsData(productName, cardId, entryPoint);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardEvaluateFundingOptionsEntryPoint getEntryPoint() {
            return this.entryPoint;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCardId() {
            return this.cardId;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
            return this.productName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentEvent.FetchFundingOptionsData copy$default(com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentEvent.FetchFundingOptionsData fetchFundingOptionsData, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str, com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardEvaluateFundingOptionsEntryPoint debitCardEvaluateFundingOptionsEntryPoint, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitCardProductName = fetchFundingOptionsData.productName;
            }
            if ((i & 2) != 0) {
                str = fetchFundingOptionsData.cardId;
            }
            if ((i & 4) != 0) {
                debitCardEvaluateFundingOptionsEntryPoint = fetchFundingOptionsData.entryPoint;
            }
            return fetchFundingOptionsData.copy(debitCardProductName, str, debitCardEvaluateFundingOptionsEntryPoint);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fundingoptions/mvi/FundingOptionsComponentEvent$OnFundingSourceChanged;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fundingoptions/mvi/FundingOptionsComponentEvent;", "", "selectedFundingSourceId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fundingoptions/mvi/FundingOptionsComponentEvent$OnFundingSourceChanged;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getSelectedFundingSourceId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnFundingSourceChanged extends com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentEvent {
        public static final int $stable = 0;
        private final java.lang.String selectedFundingSourceId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnFundingSourceChanged(java.lang.String str) {
            super("OnFundingSourceChanged", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.selectedFundingSourceId = str;
        }

        public final java.lang.String getSelectedFundingSourceId() {
            return this.selectedFundingSourceId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.selectedFundingSourceId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnFundingSourceChanged(selectedFundingSourceId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.selectedFundingSourceId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentEvent.OnFundingSourceChanged) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedFundingSourceId, ((com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentEvent.OnFundingSourceChanged) other).selectedFundingSourceId);
        }

        public final com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentEvent.OnFundingSourceChanged copy(java.lang.String selectedFundingSourceId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedFundingSourceId, "");
            return new com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentEvent.OnFundingSourceChanged(selectedFundingSourceId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getSelectedFundingSourceId() {
            return this.selectedFundingSourceId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentEvent.OnFundingSourceChanged copy$default(com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentEvent.OnFundingSourceChanged onFundingSourceChanged, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onFundingSourceChanged.selectedFundingSourceId;
            }
            return onFundingSourceChanged.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fundingoptions/mvi/FundingOptionsComponentEvent$OnFundingOptionsDataFetched;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fundingoptions/mvi/FundingOptionsComponentEvent;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardFundingOptions;", "debitCardFundingOptions", "<init>", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardFundingOptions;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardFundingOptions;", "copy", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardFundingOptions;)Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fundingoptions/mvi/FundingOptionsComponentEvent$OnFundingOptionsDataFetched;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardFundingOptions;", "getDebitCardFundingOptions"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnFundingOptionsDataFetched extends com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingOptions debitCardFundingOptions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnFundingOptionsDataFetched(com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingOptions debitCardFundingOptions) {
            super("OnFundingOptionsDataFetched", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardFundingOptions, "");
            this.debitCardFundingOptions = debitCardFundingOptions;
        }

        public final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingOptions getDebitCardFundingOptions() {
            return this.debitCardFundingOptions;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingOptions debitCardFundingOptions = this.debitCardFundingOptions;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnFundingOptionsDataFetched(debitCardFundingOptions=");
            sb.append(debitCardFundingOptions);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.debitCardFundingOptions.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentEvent.OnFundingOptionsDataFetched) && kotlin.jvm.internal.Intrinsics.areEqual(this.debitCardFundingOptions, ((com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentEvent.OnFundingOptionsDataFetched) other).debitCardFundingOptions);
        }

        public final com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentEvent.OnFundingOptionsDataFetched copy(com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingOptions debitCardFundingOptions) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardFundingOptions, "");
            return new com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentEvent.OnFundingOptionsDataFetched(debitCardFundingOptions);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingOptions getDebitCardFundingOptions() {
            return this.debitCardFundingOptions;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentEvent.OnFundingOptionsDataFetched copy$default(com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentEvent.OnFundingOptionsDataFetched onFundingOptionsDataFetched, com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingOptions debitCardFundingOptions, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitCardFundingOptions = onFundingOptionsDataFetched.debitCardFundingOptions;
            }
            return onFundingOptionsDataFetched.copy(debitCardFundingOptions);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fundingoptions/mvi/FundingOptionsComponentEvent$OnFundingOptionsDataFetchFailed;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fundingoptions/mvi/FundingOptionsComponentEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnFundingOptionsDataFetchFailed extends com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentEvent.OnFundingOptionsDataFetchFailed INSTANCE = new com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentEvent.OnFundingOptionsDataFetchFailed();

        public final int hashCode() {
            return 698540660;
        }

        private OnFundingOptionsDataFetchFailed() {
            super("OnFundingOptionsDataFetchFailed", null);
        }

        public final java.lang.String toString() {
            return "OnFundingOptionsDataFetchFailed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentEvent.OnFundingOptionsDataFetchFailed)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ FundingOptionsComponentEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
