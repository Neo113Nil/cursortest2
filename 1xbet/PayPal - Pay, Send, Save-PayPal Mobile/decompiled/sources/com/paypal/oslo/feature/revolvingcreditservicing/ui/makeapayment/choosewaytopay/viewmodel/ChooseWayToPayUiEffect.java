package com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayUiEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "NavigateBack", "NavigateLinkBank", "ShowDontSeeBankBottomSheet", "SelectFundingInstrument", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayUiEffect$NavigateBack;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayUiEffect$NavigateLinkBank;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayUiEffect$SelectFundingInstrument;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayUiEffect$ShowDontSeeBankBottomSheet;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class ChooseWayToPayUiEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayUiEffect$NavigateBack;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBack extends com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayUiEffect.NavigateBack INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayUiEffect.NavigateBack();

        public final int hashCode() {
            return 1739714234;
        }

        private NavigateBack() {
            super("NavigateBack", null);
        }

        public final java.lang.String toString() {
            return "NavigateBack";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayUiEffect.NavigateBack)) {
                return false;
            }
            return true;
        }
    }

    private ChooseWayToPayUiEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayUiEffect$NavigateLinkBank;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateLinkBank extends com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayUiEffect.NavigateLinkBank INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayUiEffect.NavigateLinkBank();

        public final int hashCode() {
            return 338322857;
        }

        private NavigateLinkBank() {
            super("NavigateLinkBank", null);
        }

        public final java.lang.String toString() {
            return "NavigateLinkBank";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayUiEffect.NavigateLinkBank)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayUiEffect$ShowDontSeeBankBottomSheet;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowDontSeeBankBottomSheet extends com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayUiEffect.ShowDontSeeBankBottomSheet INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayUiEffect.ShowDontSeeBankBottomSheet();

        public final int hashCode() {
            return -687664299;
        }

        private ShowDontSeeBankBottomSheet() {
            super("ShowDontSeeBankBottomSheet", null);
        }

        public final java.lang.String toString() {
            return "ShowDontSeeBankBottomSheet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayUiEffect.ShowDontSeeBankBottomSheet)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J>\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u0003\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u0011R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayUiEffect$SelectFundingInstrument;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayUiEffect;", "", "isFundingInstrumentChanging", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/FundingInstrument;", "selectedFundingInstrument", "", "creditAccountId", "", "fundingInstruments", "<init>", "(ZLcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/FundingInstrument;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Z", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/FundingInstrument;", "component3", "()Ljava/lang/String;", "component4", "()Ljava/util/List;", "copy", "(ZLcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/FundingInstrument;Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayUiEffect$SelectFundingInstrument;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Z", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/FundingInstrument;", "getSelectedFundingInstrument", "Ljava/lang/String;", "getCreditAccountId", "Ljava/util/List;", "getFundingInstruments"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SelectFundingInstrument extends com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayUiEffect {
        public static final int $stable = 8;
        private final java.lang.String creditAccountId;
        private final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> fundingInstruments;
        private final boolean isFundingInstrumentChanging;
        private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument selectedFundingInstrument;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public SelectFundingInstrument(boolean z, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument, java.lang.String str, java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> list) {
            super("SelectFundingInstrument", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrument, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.isFundingInstrumentChanging = z;
            this.selectedFundingInstrument = fundingInstrument;
            this.creditAccountId = str;
            this.fundingInstruments = list;
        }

        public final boolean isFundingInstrumentChanging() {
            return this.isFundingInstrumentChanging;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument getSelectedFundingInstrument() {
            return this.selectedFundingInstrument;
        }

        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        public /* synthetic */ SelectFundingInstrument(boolean z, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument, java.lang.String str, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, fundingInstrument, str, (i & 8) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
        }

        public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> getFundingInstruments() {
            return this.fundingInstruments;
        }

        public final java.lang.String toString() {
            boolean z = this.isFundingInstrumentChanging;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument = this.selectedFundingInstrument;
            java.lang.String str = this.creditAccountId;
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> list = this.fundingInstruments;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SelectFundingInstrument(isFundingInstrumentChanging=");
            sb.append(z);
            sb.append(", selectedFundingInstrument=");
            sb.append(fundingInstrument);
            sb.append(", creditAccountId=");
            sb.append(str);
            sb.append(", fundingInstruments=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((java.lang.Boolean.hashCode(this.isFundingInstrumentChanging) * 31) + this.selectedFundingInstrument.hashCode()) * 31) + this.creditAccountId.hashCode()) * 31) + this.fundingInstruments.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayUiEffect.SelectFundingInstrument)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayUiEffect.SelectFundingInstrument selectFundingInstrument = (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayUiEffect.SelectFundingInstrument) other;
            return this.isFundingInstrumentChanging == selectFundingInstrument.isFundingInstrumentChanging && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedFundingInstrument, selectFundingInstrument.selectedFundingInstrument) && kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, selectFundingInstrument.creditAccountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingInstruments, selectFundingInstrument.fundingInstruments);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayUiEffect.SelectFundingInstrument copy(boolean isFundingInstrumentChanging, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument selectedFundingInstrument, java.lang.String creditAccountId, java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> fundingInstruments) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedFundingInstrument, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAccountId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstruments, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayUiEffect.SelectFundingInstrument(isFundingInstrumentChanging, selectedFundingInstrument, creditAccountId, fundingInstruments);
        }

        public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> component4() {
            return this.fundingInstruments;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument getSelectedFundingInstrument() {
            return this.selectedFundingInstrument;
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsFundingInstrumentChanging() {
            return this.isFundingInstrumentChanging;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayUiEffect.SelectFundingInstrument copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayUiEffect.SelectFundingInstrument selectFundingInstrument, boolean z, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = selectFundingInstrument.isFundingInstrumentChanging;
            }
            if ((i & 2) != 0) {
                fundingInstrument = selectFundingInstrument.selectedFundingInstrument;
            }
            if ((i & 4) != 0) {
                str = selectFundingInstrument.creditAccountId;
            }
            if ((i & 8) != 0) {
                list = selectFundingInstrument.fundingInstruments;
            }
            return selectFundingInstrument.copy(z, fundingInstrument, str, list);
        }
    }

    public /* synthetic */ ChooseWayToPayUiEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
