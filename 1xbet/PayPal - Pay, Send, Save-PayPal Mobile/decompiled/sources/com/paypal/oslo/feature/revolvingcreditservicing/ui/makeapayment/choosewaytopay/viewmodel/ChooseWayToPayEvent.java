package com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\b\n\u000b\f\r\u000e\u000f\u0010\u0011B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\b\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "OnViewCreated", "OnInitialReadyInfo", "OnLinkBankClick", "OnDontSeeBankClick", "OnTryAgainClick", "OnBankAdded", "OnBackPressed", "OnFundingInstrumentPressed", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayEvent$OnBackPressed;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayEvent$OnBankAdded;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayEvent$OnDontSeeBankClick;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayEvent$OnFundingInstrumentPressed;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayEvent$OnInitialReadyInfo;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayEvent$OnLinkBankClick;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayEvent$OnTryAgainClick;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayEvent$OnViewCreated;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class ChooseWayToPayEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J@\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0014R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b\b\u0010\u0012R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayEvent$OnViewCreated;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/FundingInstrument;", "fundingInstruments", "selectedFundingInstrument", "", "isFundingInstrumentChanging", "", "creditAccountId", "<init>", "(Ljava/util/List;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/FundingInstrument;ZLjava/lang/String;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/FundingInstrument;", "component3", "()Z", "component4", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/FundingInstrument;ZLjava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayEvent$OnViewCreated;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/List;", "getFundingInstruments", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/FundingInstrument;", "getSelectedFundingInstrument", "Z", "Ljava/lang/String;", "getCreditAccountId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnViewCreated extends com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 8;
        private final java.lang.String creditAccountId;
        private final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> fundingInstruments;
        private final boolean isFundingInstrumentChanging;
        private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument selectedFundingInstrument;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OnViewCreated(java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> list, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument, boolean z, java.lang.String str) {
            super("OnViewCreated", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.fundingInstruments = list;
            this.selectedFundingInstrument = fundingInstrument;
            this.isFundingInstrumentChanging = z;
            this.creditAccountId = str;
        }

        public /* synthetic */ OnViewCreated(java.util.List list, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument, boolean z, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? null : fundingInstrument, (i & 4) != 0 ? false : z, str);
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> getFundingInstruments() {
            return this.fundingInstruments;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument getSelectedFundingInstrument() {
            return this.selectedFundingInstrument;
        }

        public final boolean isFundingInstrumentChanging() {
            return this.isFundingInstrumentChanging;
        }

        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> list = this.fundingInstruments;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument = this.selectedFundingInstrument;
            boolean z = this.isFundingInstrumentChanging;
            java.lang.String str = this.creditAccountId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnViewCreated(fundingInstruments=");
            sb.append(list);
            sb.append(", selectedFundingInstrument=");
            sb.append(fundingInstrument);
            sb.append(", isFundingInstrumentChanging=");
            sb.append(z);
            sb.append(", creditAccountId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.fundingInstruments.hashCode();
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument = this.selectedFundingInstrument;
            return (((((hashCode * 31) + (fundingInstrument == null ? 0 : fundingInstrument.hashCode())) * 31) + java.lang.Boolean.hashCode(this.isFundingInstrumentChanging)) * 31) + this.creditAccountId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent.OnViewCreated)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent.OnViewCreated onViewCreated = (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent.OnViewCreated) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.fundingInstruments, onViewCreated.fundingInstruments) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedFundingInstrument, onViewCreated.selectedFundingInstrument) && this.isFundingInstrumentChanging == onViewCreated.isFundingInstrumentChanging && kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, onViewCreated.creditAccountId);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent.OnViewCreated copy(java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> fundingInstruments, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument selectedFundingInstrument, boolean isFundingInstrumentChanging, java.lang.String creditAccountId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstruments, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAccountId, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent.OnViewCreated(fundingInstruments, selectedFundingInstrument, isFundingInstrumentChanging, creditAccountId);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsFundingInstrumentChanging() {
            return this.isFundingInstrumentChanging;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument getSelectedFundingInstrument() {
            return this.selectedFundingInstrument;
        }

        public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> component1() {
            return this.fundingInstruments;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent.OnViewCreated copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent.OnViewCreated onViewCreated, java.util.List list, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument, boolean z, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = onViewCreated.fundingInstruments;
            }
            if ((i & 2) != 0) {
                fundingInstrument = onViewCreated.selectedFundingInstrument;
            }
            if ((i & 4) != 0) {
                z = onViewCreated.isFundingInstrumentChanging;
            }
            if ((i & 8) != 0) {
                str = onViewCreated.creditAccountId;
            }
            return onViewCreated.copy(list, fundingInstrument, z, str);
        }
    }

    private ChooseWayToPayEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayEvent$OnInitialReadyInfo;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayState$ReadyInfo;", "readyInfo", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayState$ReadyInfo;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayState$ReadyInfo;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayState$ReadyInfo;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayEvent$OnInitialReadyInfo;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayState$ReadyInfo;", "getReadyInfo"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnInitialReadyInfo extends com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayState.ReadyInfo readyInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnInitialReadyInfo(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayState.ReadyInfo readyInfo) {
            super("OnInitialReadyInfo", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readyInfo, "");
            this.readyInfo = readyInfo;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayState.ReadyInfo getReadyInfo() {
            return this.readyInfo;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayState.ReadyInfo readyInfo = this.readyInfo;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnInitialReadyInfo(readyInfo=");
            sb.append(readyInfo);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.readyInfo.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent.OnInitialReadyInfo) && kotlin.jvm.internal.Intrinsics.areEqual(this.readyInfo, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent.OnInitialReadyInfo) other).readyInfo);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent.OnInitialReadyInfo copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayState.ReadyInfo readyInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readyInfo, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent.OnInitialReadyInfo(readyInfo);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayState.ReadyInfo getReadyInfo() {
            return this.readyInfo;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent.OnInitialReadyInfo copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent.OnInitialReadyInfo onInitialReadyInfo, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayState.ReadyInfo readyInfo, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                readyInfo = onInitialReadyInfo.readyInfo;
            }
            return onInitialReadyInfo.copy(readyInfo);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayEvent$OnLinkBankClick;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnLinkBankClick extends com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent.OnLinkBankClick INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent.OnLinkBankClick();

        public final int hashCode() {
            return 1244931416;
        }

        private OnLinkBankClick() {
            super("OnLinkBankClick", null);
        }

        public final java.lang.String toString() {
            return "OnLinkBankClick";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent.OnLinkBankClick)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayEvent$OnDontSeeBankClick;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnDontSeeBankClick extends com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent.OnDontSeeBankClick INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent.OnDontSeeBankClick();

        public final int hashCode() {
            return -1272770940;
        }

        private OnDontSeeBankClick() {
            super("OnDontSeeBankClick", null);
        }

        public final java.lang.String toString() {
            return "OnDontSeeBankClick";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent.OnDontSeeBankClick)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayEvent$OnTryAgainClick;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnTryAgainClick extends com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent.OnTryAgainClick INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent.OnTryAgainClick();

        public final int hashCode() {
            return -1076513367;
        }

        private OnTryAgainClick() {
            super("OnTryAgainClick", null);
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final java.lang.String toString() {
            return "OnTryAgainClick";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent.OnTryAgainClick)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ \u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayEvent$OnBankAdded;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/FundingInstrument;", "fundingInstruments", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayEvent$OnBankAdded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getFundingInstruments"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnBankAdded extends com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> fundingInstruments;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OnBankAdded(java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> list) {
            super("OnBankAdded", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.fundingInstruments = list;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> getFundingInstruments() {
            return this.fundingInstruments;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> list = this.fundingInstruments;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnBankAdded(fundingInstruments=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.fundingInstruments.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent.OnBankAdded) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingInstruments, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent.OnBankAdded) other).fundingInstruments);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent.OnBankAdded copy(java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> fundingInstruments) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstruments, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent.OnBankAdded(fundingInstruments);
        }

        public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> component1() {
            return this.fundingInstruments;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent.OnBankAdded copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent.OnBankAdded onBankAdded, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = onBankAdded.fundingInstruments;
            }
            return onBankAdded.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayEvent$OnBackPressed;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnBackPressed extends com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent.OnBackPressed INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent.OnBackPressed();

        public final int hashCode() {
            return -1271304639;
        }

        private OnBackPressed() {
            super("OnBackPressed", null);
        }

        public final java.lang.String toString() {
            return "OnBackPressed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent.OnBackPressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayEvent$OnFundingInstrumentPressed;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/fundinginstrument/FundingInstrumentUiModel;", "fundingInstrument", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/fundinginstrument/FundingInstrumentUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/fundinginstrument/FundingInstrumentUiModel;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/fundinginstrument/FundingInstrumentUiModel;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayEvent$OnFundingInstrumentPressed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/fundinginstrument/FundingInstrumentUiModel;", "getFundingInstrument"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnFundingInstrumentPressed extends com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel fundingInstrument;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnFundingInstrumentPressed(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel fundingInstrumentUiModel) {
            super("OnFundingInstrumentPressed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentUiModel, "");
            this.fundingInstrument = fundingInstrumentUiModel;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel getFundingInstrument() {
            return this.fundingInstrument;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel fundingInstrumentUiModel = this.fundingInstrument;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnFundingInstrumentPressed(fundingInstrument=");
            sb.append(fundingInstrumentUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.fundingInstrument.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent.OnFundingInstrumentPressed) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingInstrument, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent.OnFundingInstrumentPressed) other).fundingInstrument);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent.OnFundingInstrumentPressed copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel fundingInstrument) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrument, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent.OnFundingInstrumentPressed(fundingInstrument);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel getFundingInstrument() {
            return this.fundingInstrument;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent.OnFundingInstrumentPressed copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent.OnFundingInstrumentPressed onFundingInstrumentPressed, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel fundingInstrumentUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                fundingInstrumentUiModel = onFundingInstrumentPressed.fundingInstrument;
            }
            return onFundingInstrumentPressed.copy(fundingInstrumentUiModel);
        }
    }

    public /* synthetic */ ChooseWayToPayEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
