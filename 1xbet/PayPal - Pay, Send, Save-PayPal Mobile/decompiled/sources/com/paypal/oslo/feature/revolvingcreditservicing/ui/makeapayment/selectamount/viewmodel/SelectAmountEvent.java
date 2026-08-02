package com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u000b\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u000b\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "OnViewCreated", "OnDataFetched", "OnErrorFetchingData", "OnTryAgainClicked", "OnOptionChanged", "OnCustomAmountChanged", "OnRemainingStatementBalanceLinkClicked", "OnAutopayClicked", "OnBackClicked", "OnNextClicked", "OnViewPaymentsClicked", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountEvent$OnAutopayClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountEvent$OnBackClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountEvent$OnCustomAmountChanged;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountEvent$OnDataFetched;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountEvent$OnErrorFetchingData;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountEvent$OnNextClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountEvent$OnOptionChanged;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountEvent$OnRemainingStatementBalanceLinkClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountEvent$OnTryAgainClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountEvent$OnViewCreated;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountEvent$OnViewPaymentsClicked;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class SelectAmountEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private SelectAmountEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J0\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountEvent$OnViewCreated;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "creditProductIdentifier", "", "creditAccountId", "", "maxRepayableAmountIsInvalid", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Ljava/lang/String;Z)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "component2", "()Ljava/lang/String;", "component3", "()Z", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Ljava/lang/String;Z)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountEvent$OnViewCreated;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "getCreditProductIdentifier", "Ljava/lang/String;", "getCreditAccountId", "Z", "getMaxRepayableAmountIsInvalid"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnViewCreated extends com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        private final java.lang.String creditAccountId;
        private final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier;
        private final boolean maxRepayableAmountIsInvalid;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnViewCreated(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, java.lang.String str, boolean z) {
            super("OnViewCreated", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
            this.creditProductIdentifier = creditProductIdentifier;
            this.creditAccountId = str;
            this.maxRepayableAmountIsInvalid = z;
        }

        public /* synthetic */ OnViewCreated(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, java.lang.String str, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(creditProductIdentifier, str, (i & 4) != 0 ? false : z);
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCreditProductIdentifier() {
            return this.creditProductIdentifier;
        }

        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        public final boolean getMaxRepayableAmountIsInvalid() {
            return this.maxRepayableAmountIsInvalid;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier = this.creditProductIdentifier;
            java.lang.String str = this.creditAccountId;
            boolean z = this.maxRepayableAmountIsInvalid;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnViewCreated(creditProductIdentifier=");
            sb.append(creditProductIdentifier);
            sb.append(", creditAccountId=");
            sb.append(str);
            sb.append(", maxRepayableAmountIsInvalid=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.creditProductIdentifier.hashCode();
            java.lang.String str = this.creditAccountId;
            return (((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Boolean.hashCode(this.maxRepayableAmountIsInvalid);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnViewCreated)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnViewCreated onViewCreated = (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnViewCreated) other;
            return this.creditProductIdentifier == onViewCreated.creditProductIdentifier && kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, onViewCreated.creditAccountId) && this.maxRepayableAmountIsInvalid == onViewCreated.maxRepayableAmountIsInvalid;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnViewCreated copy(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, java.lang.String creditAccountId, boolean maxRepayableAmountIsInvalid) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnViewCreated(creditProductIdentifier, creditAccountId, maxRepayableAmountIsInvalid);
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getMaxRepayableAmountIsInvalid() {
            return this.maxRepayableAmountIsInvalid;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCreditProductIdentifier() {
            return this.creditProductIdentifier;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnViewCreated copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnViewCreated onViewCreated, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                creditProductIdentifier = onViewCreated.creditProductIdentifier;
            }
            if ((i & 2) != 0) {
                str = onViewCreated.creditAccountId;
            }
            if ((i & 4) != 0) {
                z = onViewCreated.maxRepayableAmountIsInvalid;
            }
            return onViewCreated.copy(creditProductIdentifier, str, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019JJ\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b!\u0010\u0015J\u0010\u0010\"\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\"\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010\u0011R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010\u0013R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b(\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010\u0017R\u001a\u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010+\u001a\u0004\b,\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountEvent$OnDataFetched;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/uimodel/SelectAmountScreenUiModel;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/FundingInstrument;", "fundingInstruments", "", "maxDaysInFuture", "Ljava/time/LocalDate;", "dueDate", "", "creditAccountId", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/uimodel/SelectAmountScreenUiModel;Ljava/util/List;ILjava/time/LocalDate;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/uimodel/SelectAmountScreenUiModel;", "component2", "()Ljava/util/List;", "component3", "()I", "component4", "()Ljava/time/LocalDate;", "component5", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/uimodel/SelectAmountScreenUiModel;Ljava/util/List;ILjava/time/LocalDate;Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountEvent$OnDataFetched;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/uimodel/SelectAmountScreenUiModel;", "getData", "Ljava/util/List;", "getFundingInstruments", com.visa.cbp.getEncExpo.warmup, "getMaxDaysInFuture", "Ljava/time/LocalDate;", "getDueDate", "Ljava/lang/String;", "getCreditAccountId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnDataFetched extends com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 8;
        private final java.lang.String creditAccountId;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.uimodel.SelectAmountScreenUiModel data;
        private final java.time.LocalDate dueDate;
        private final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> fundingInstruments;
        private final int maxDaysInFuture;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OnDataFetched(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.uimodel.SelectAmountScreenUiModel selectAmountScreenUiModel, java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> list, int i, java.time.LocalDate localDate, java.lang.String str) {
            super("OnDataFetched", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectAmountScreenUiModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.data = selectAmountScreenUiModel;
            this.fundingInstruments = list;
            this.maxDaysInFuture = i;
            this.dueDate = localDate;
            this.creditAccountId = str;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.uimodel.SelectAmountScreenUiModel getData() {
            return this.data;
        }

        public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> getFundingInstruments() {
            return this.fundingInstruments;
        }

        public final int getMaxDaysInFuture() {
            return this.maxDaysInFuture;
        }

        public final java.time.LocalDate getDueDate() {
            return this.dueDate;
        }

        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.uimodel.SelectAmountScreenUiModel selectAmountScreenUiModel = this.data;
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> list = this.fundingInstruments;
            int i = this.maxDaysInFuture;
            java.time.LocalDate localDate = this.dueDate;
            java.lang.String str = this.creditAccountId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnDataFetched(data=");
            sb.append(selectAmountScreenUiModel);
            sb.append(", fundingInstruments=");
            sb.append(list);
            sb.append(", maxDaysInFuture=");
            sb.append(i);
            sb.append(", dueDate=");
            sb.append(localDate);
            sb.append(", creditAccountId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.data.hashCode();
            int hashCode2 = this.fundingInstruments.hashCode();
            int hashCode3 = java.lang.Integer.hashCode(this.maxDaysInFuture);
            java.time.LocalDate localDate = this.dueDate;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (localDate == null ? 0 : localDate.hashCode())) * 31) + this.creditAccountId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnDataFetched)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnDataFetched onDataFetched = (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnDataFetched) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.data, onDataFetched.data) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingInstruments, onDataFetched.fundingInstruments) && this.maxDaysInFuture == onDataFetched.maxDaysInFuture && kotlin.jvm.internal.Intrinsics.areEqual(this.dueDate, onDataFetched.dueDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, onDataFetched.creditAccountId);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnDataFetched copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.uimodel.SelectAmountScreenUiModel data, java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> fundingInstruments, int maxDaysInFuture, java.time.LocalDate dueDate, java.lang.String creditAccountId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstruments, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAccountId, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnDataFetched(data, fundingInstruments, maxDaysInFuture, dueDate, creditAccountId);
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        /* renamed from: component4, reason: from getter */
        public final java.time.LocalDate getDueDate() {
            return this.dueDate;
        }

        /* renamed from: component3, reason: from getter */
        public final int getMaxDaysInFuture() {
            return this.maxDaysInFuture;
        }

        public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> component2() {
            return this.fundingInstruments;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.uimodel.SelectAmountScreenUiModel getData() {
            return this.data;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnDataFetched copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnDataFetched onDataFetched, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.uimodel.SelectAmountScreenUiModel selectAmountScreenUiModel, java.util.List list, int i, java.time.LocalDate localDate, java.lang.String str, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                selectAmountScreenUiModel = onDataFetched.data;
            }
            if ((i2 & 2) != 0) {
                list = onDataFetched.fundingInstruments;
            }
            java.util.List list2 = list;
            if ((i2 & 4) != 0) {
                i = onDataFetched.maxDaysInFuture;
            }
            int i3 = i;
            if ((i2 & 8) != 0) {
                localDate = onDataFetched.dueDate;
            }
            java.time.LocalDate localDate2 = localDate;
            if ((i2 & 16) != 0) {
                str = onDataFetched.creditAccountId;
            }
            return onDataFetched.copy(selectAmountScreenUiModel, list2, i3, localDate2, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountEvent$OnErrorFetchingData;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/error/ErrorUiModel;", "errorUiModel", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/error/ErrorUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/error/ErrorUiModel;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/error/ErrorUiModel;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountEvent$OnErrorFetchingData;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/error/ErrorUiModel;", "getErrorUiModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnErrorFetchingData extends com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ErrorUiModel errorUiModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnErrorFetchingData(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ErrorUiModel errorUiModel) {
            super("OnErrorFetchingData", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorUiModel, "");
            this.errorUiModel = errorUiModel;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ErrorUiModel getErrorUiModel() {
            return this.errorUiModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ErrorUiModel errorUiModel = this.errorUiModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnErrorFetchingData(errorUiModel=");
            sb.append(errorUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.errorUiModel.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnErrorFetchingData) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorUiModel, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnErrorFetchingData) other).errorUiModel);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnErrorFetchingData copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ErrorUiModel errorUiModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorUiModel, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnErrorFetchingData(errorUiModel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ErrorUiModel getErrorUiModel() {
            return this.errorUiModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnErrorFetchingData copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnErrorFetchingData onErrorFetchingData, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ErrorUiModel errorUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                errorUiModel = onErrorFetchingData.errorUiModel;
            }
            return onErrorFetchingData.copy(errorUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountEvent$OnTryAgainClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnTryAgainClicked extends com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnTryAgainClicked INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnTryAgainClicked();

        public final int hashCode() {
            return 1515358824;
        }

        private OnTryAgainClicked() {
            super("OnTryAgainClicked", null);
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final java.lang.String toString() {
            return "OnTryAgainClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnTryAgainClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountEvent$OnOptionChanged;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/PaymentOption;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.OPTION, "Ljava/math/BigDecimal;", "amount", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/PaymentOption;Ljava/math/BigDecimal;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/PaymentOption;", "component2", "()Ljava/math/BigDecimal;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/PaymentOption;Ljava/math/BigDecimal;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountEvent$OnOptionChanged;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/PaymentOption;", "getOption", "Ljava/math/BigDecimal;", "getAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnOptionChanged extends com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent {
        public static final int $stable = 0;
        private final java.math.BigDecimal amount;
        private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption option;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnOptionChanged(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption paymentOption, java.math.BigDecimal bigDecimal) {
            super("OnOptionChanged", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentOption, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigDecimal, "");
            this.option = paymentOption;
            this.amount = bigDecimal;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption getOption() {
            return this.option;
        }

        public final java.math.BigDecimal getAmount() {
            return this.amount;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption paymentOption = this.option;
            java.math.BigDecimal bigDecimal = this.amount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnOptionChanged(option=");
            sb.append(paymentOption);
            sb.append(", amount=");
            sb.append(bigDecimal);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.option.hashCode() * 31) + this.amount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnOptionChanged)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnOptionChanged onOptionChanged = (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnOptionChanged) other;
            return this.option == onOptionChanged.option && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, onOptionChanged.amount);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnOptionChanged copy(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption option, java.math.BigDecimal amount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(option, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnOptionChanged(option, amount);
        }

        /* renamed from: component2, reason: from getter */
        public final java.math.BigDecimal getAmount() {
            return this.amount;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption getOption() {
            return this.option;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnOptionChanged copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnOptionChanged onOptionChanged, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption paymentOption, java.math.BigDecimal bigDecimal, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                paymentOption = onOptionChanged.option;
            }
            if ((i & 2) != 0) {
                bigDecimal = onOptionChanged.amount;
            }
            return onOptionChanged.copy(paymentOption, bigDecimal);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountEvent$OnCustomAmountChanged;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountEvent;", "", "customAmount", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountEvent$OnCustomAmountChanged;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCustomAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnCustomAmountChanged extends com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent {
        public static final int $stable = 0;
        private final java.lang.String customAmount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnCustomAmountChanged(java.lang.String str) {
            super("OnCustomAmountChanged", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.customAmount = str;
        }

        public final java.lang.String getCustomAmount() {
            return this.customAmount;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.customAmount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnCustomAmountChanged(customAmount=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.customAmount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnCustomAmountChanged) && kotlin.jvm.internal.Intrinsics.areEqual(this.customAmount, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnCustomAmountChanged) other).customAmount);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnCustomAmountChanged copy(java.lang.String customAmount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customAmount, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnCustomAmountChanged(customAmount);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCustomAmount() {
            return this.customAmount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnCustomAmountChanged copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnCustomAmountChanged onCustomAmountChanged, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onCustomAmountChanged.customAmount;
            }
            return onCustomAmountChanged.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountEvent$OnRemainingStatementBalanceLinkClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnRemainingStatementBalanceLinkClicked extends com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnRemainingStatementBalanceLinkClicked INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnRemainingStatementBalanceLinkClicked();

        public final int hashCode() {
            return -1038923356;
        }

        private OnRemainingStatementBalanceLinkClicked() {
            super("OnRemainingStatementBalanceLinkClicked", null);
        }

        public final java.lang.String toString() {
            return "OnRemainingStatementBalanceLinkClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnRemainingStatementBalanceLinkClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountEvent$OnAutopayClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnAutopayClicked extends com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnAutopayClicked INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnAutopayClicked();

        public final int hashCode() {
            return 1047185448;
        }

        private OnAutopayClicked() {
            super("OnAutopayClicked", null);
        }

        public final java.lang.String toString() {
            return "OnAutopayClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnAutopayClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountEvent$OnBackClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnBackClicked extends com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnBackClicked INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnBackClicked();

        public final int hashCode() {
            return -849997658;
        }

        private OnBackClicked() {
            super("OnBackClicked", null);
        }

        public final java.lang.String toString() {
            return "OnBackClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnBackClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountEvent$OnNextClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnNextClicked extends com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnNextClicked INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnNextClicked();

        public final int hashCode() {
            return 1773921562;
        }

        private OnNextClicked() {
            super("OnNextClicked", null);
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final java.lang.String toString() {
            return "OnNextClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnNextClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountEvent$OnViewPaymentsClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnViewPaymentsClicked extends com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnViewPaymentsClicked INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnViewPaymentsClicked();

        public final int hashCode() {
            return -1684634565;
        }

        private OnViewPaymentsClicked() {
            super("OnViewPaymentsClicked", null);
        }

        public final java.lang.String toString() {
            return "OnViewPaymentsClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnViewPaymentsClicked)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ SelectAmountEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
