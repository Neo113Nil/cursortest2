package com.paypal.oslo.feature.bnplservicing.ui.changefi;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0005\n\u000b\f\r\u000eB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiUiEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "DismissChangeFiHalfSheet", "NavigateToAddFundingInstrument", "NavigateBackWithNewFiAdded", "NavigateToUpdatePaymentMethodSuccess", "OpenAgreementLink", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiUiEffect$DismissChangeFiHalfSheet;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiUiEffect$NavigateBackWithNewFiAdded;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiUiEffect$NavigateToAddFundingInstrument;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiUiEffect$NavigateToUpdatePaymentMethodSuccess;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiUiEffect$OpenAgreementLink;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class ChangeFiUiEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012JB\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\u0010R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiUiEffect$DismissChangeFiHalfSheet;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiUiEffect;", "", "newFiAdded", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/FundingInstrumentUiModel;", "selectedFundingInstrument", "paymentUpdated", "", "updatedFundingInstruments", "<init>", "(Ljava/lang/Boolean;Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/FundingInstrumentUiModel;ZLjava/util/List;)V", "component1", "()Ljava/lang/Boolean;", "component2", "()Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/FundingInstrumentUiModel;", "component3", "()Z", "component4", "()Ljava/util/List;", "copy", "(Ljava/lang/Boolean;Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/FundingInstrumentUiModel;ZLjava/util/List;)Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiUiEffect$DismissChangeFiHalfSheet;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "getNewFiAdded", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/FundingInstrumentUiModel;", "getSelectedFundingInstrument", "Z", "getPaymentUpdated", "Ljava/util/List;", "getUpdatedFundingInstruments"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DismissChangeFiHalfSheet extends com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiEffect {
        public static final int $stable = 8;
        private final java.lang.Boolean newFiAdded;
        private final boolean paymentUpdated;
        private final com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel selectedFundingInstrument;
        private final java.util.List<com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel> updatedFundingInstruments;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DismissChangeFiHalfSheet(java.lang.Boolean bool, com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel fundingInstrumentUiModel, boolean z, java.util.List<com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel> list) {
            super("DismissChangeFiHalfSheet", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.newFiAdded = bool;
            this.selectedFundingInstrument = fundingInstrumentUiModel;
            this.paymentUpdated = z;
            this.updatedFundingInstruments = list;
        }

        public /* synthetic */ DismissChangeFiHalfSheet(java.lang.Boolean bool, com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel fundingInstrumentUiModel, boolean z, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? java.lang.Boolean.FALSE : bool, (i & 2) != 0 ? null : fundingInstrumentUiModel, (i & 4) != 0 ? false : z, (i & 8) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
        }

        public final java.lang.Boolean getNewFiAdded() {
            return this.newFiAdded;
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel getSelectedFundingInstrument() {
            return this.selectedFundingInstrument;
        }

        public final boolean getPaymentUpdated() {
            return this.paymentUpdated;
        }

        public final java.util.List<com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel> getUpdatedFundingInstruments() {
            return this.updatedFundingInstruments;
        }

        public final java.lang.String toString() {
            java.lang.Boolean bool = this.newFiAdded;
            com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel fundingInstrumentUiModel = this.selectedFundingInstrument;
            boolean z = this.paymentUpdated;
            java.util.List<com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel> list = this.updatedFundingInstruments;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DismissChangeFiHalfSheet(newFiAdded=");
            sb.append(bool);
            sb.append(", selectedFundingInstrument=");
            sb.append(fundingInstrumentUiModel);
            sb.append(", paymentUpdated=");
            sb.append(z);
            sb.append(", updatedFundingInstruments=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Boolean bool = this.newFiAdded;
            int hashCode = bool == null ? 0 : bool.hashCode();
            com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel fundingInstrumentUiModel = this.selectedFundingInstrument;
            return (((((hashCode * 31) + (fundingInstrumentUiModel != null ? fundingInstrumentUiModel.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.paymentUpdated)) * 31) + this.updatedFundingInstruments.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiEffect.DismissChangeFiHalfSheet)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiEffect.DismissChangeFiHalfSheet dismissChangeFiHalfSheet = (com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiEffect.DismissChangeFiHalfSheet) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.newFiAdded, dismissChangeFiHalfSheet.newFiAdded) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedFundingInstrument, dismissChangeFiHalfSheet.selectedFundingInstrument) && this.paymentUpdated == dismissChangeFiHalfSheet.paymentUpdated && kotlin.jvm.internal.Intrinsics.areEqual(this.updatedFundingInstruments, dismissChangeFiHalfSheet.updatedFundingInstruments);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiEffect.DismissChangeFiHalfSheet copy(java.lang.Boolean newFiAdded, com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel selectedFundingInstrument, boolean paymentUpdated, java.util.List<com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel> updatedFundingInstruments) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updatedFundingInstruments, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiEffect.DismissChangeFiHalfSheet(newFiAdded, selectedFundingInstrument, paymentUpdated, updatedFundingInstruments);
        }

        public final java.util.List<com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel> component4() {
            return this.updatedFundingInstruments;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getPaymentUpdated() {
            return this.paymentUpdated;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel getSelectedFundingInstrument() {
            return this.selectedFundingInstrument;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Boolean getNewFiAdded() {
            return this.newFiAdded;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiEffect.DismissChangeFiHalfSheet copy$default(com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiEffect.DismissChangeFiHalfSheet dismissChangeFiHalfSheet, java.lang.Boolean bool, com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel fundingInstrumentUiModel, boolean z, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bool = dismissChangeFiHalfSheet.newFiAdded;
            }
            if ((i & 2) != 0) {
                fundingInstrumentUiModel = dismissChangeFiHalfSheet.selectedFundingInstrument;
            }
            if ((i & 4) != 0) {
                z = dismissChangeFiHalfSheet.paymentUpdated;
            }
            if ((i & 8) != 0) {
                list = dismissChangeFiHalfSheet.updatedFundingInstruments;
            }
            return dismissChangeFiHalfSheet.copy(bool, fundingInstrumentUiModel, z, list);
        }

        public DismissChangeFiHalfSheet() {
            this(null, null, false, null, 15, null);
        }
    }

    private ChangeFiUiEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiUiEffect$NavigateToAddFundingInstrument;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiUiEffect;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/AddFundingInstrumentType;", "type", "", "newFiAdded", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/AddFundingInstrumentType;Ljava/lang/Boolean;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/AddFundingInstrumentType;", "component2", "()Ljava/lang/Boolean;", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/AddFundingInstrumentType;Ljava/lang/Boolean;)Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiUiEffect$NavigateToAddFundingInstrument;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/AddFundingInstrumentType;", "getType", "Ljava/lang/Boolean;", "getNewFiAdded"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToAddFundingInstrument extends com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiEffect {
        public static final int $stable = 0;
        private final java.lang.Boolean newFiAdded;
        private final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToAddFundingInstrument(com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType addFundingInstrumentType, java.lang.Boolean bool) {
            super("NavigateToAddFundingInstrument", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addFundingInstrumentType, "");
            this.type = addFundingInstrumentType;
            this.newFiAdded = bool;
        }

        public final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType getType() {
            return this.type;
        }

        public /* synthetic */ NavigateToAddFundingInstrument(com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType addFundingInstrumentType, java.lang.Boolean bool, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(addFundingInstrumentType, (i & 2) != 0 ? java.lang.Boolean.FALSE : bool);
        }

        public final java.lang.Boolean getNewFiAdded() {
            return this.newFiAdded;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType addFundingInstrumentType = this.type;
            java.lang.Boolean bool = this.newFiAdded;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToAddFundingInstrument(type=");
            sb.append(addFundingInstrumentType);
            sb.append(", newFiAdded=");
            sb.append(bool);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.type.hashCode();
            java.lang.Boolean bool = this.newFiAdded;
            return (hashCode * 31) + (bool == null ? 0 : bool.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiEffect.NavigateToAddFundingInstrument)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiEffect.NavigateToAddFundingInstrument navigateToAddFundingInstrument = (com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiEffect.NavigateToAddFundingInstrument) other;
            return this.type == navigateToAddFundingInstrument.type && kotlin.jvm.internal.Intrinsics.areEqual(this.newFiAdded, navigateToAddFundingInstrument.newFiAdded);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiEffect.NavigateToAddFundingInstrument copy(com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType type, java.lang.Boolean newFiAdded) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiEffect.NavigateToAddFundingInstrument(type, newFiAdded);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Boolean getNewFiAdded() {
            return this.newFiAdded;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType getType() {
            return this.type;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiEffect.NavigateToAddFundingInstrument copy$default(com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiEffect.NavigateToAddFundingInstrument navigateToAddFundingInstrument, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType addFundingInstrumentType, java.lang.Boolean bool, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                addFundingInstrumentType = navigateToAddFundingInstrument.type;
            }
            if ((i & 2) != 0) {
                bool = navigateToAddFundingInstrument.newFiAdded;
            }
            return navigateToAddFundingInstrument.copy(addFundingInstrumentType, bool);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiUiEffect$NavigateBackWithNewFiAdded;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiUiEffect;", "", "newFiAdded", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiUiEffect$NavigateBackWithNewFiAdded;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getNewFiAdded"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBackWithNewFiAdded extends com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiEffect {
        public static final int $stable = 0;
        private final boolean newFiAdded;

        public NavigateBackWithNewFiAdded(boolean z) {
            super("NavigateBackWithNewFiAdded", null);
            this.newFiAdded = z;
        }

        public final boolean getNewFiAdded() {
            return this.newFiAdded;
        }

        public final java.lang.String toString() {
            boolean z = this.newFiAdded;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateBackWithNewFiAdded(newFiAdded=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(this.newFiAdded);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiEffect.NavigateBackWithNewFiAdded) && this.newFiAdded == ((com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiEffect.NavigateBackWithNewFiAdded) other).newFiAdded;
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiEffect.NavigateBackWithNewFiAdded copy(boolean newFiAdded) {
            return new com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiEffect.NavigateBackWithNewFiAdded(newFiAdded);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getNewFiAdded() {
            return this.newFiAdded;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiEffect.NavigateBackWithNewFiAdded copy$default(com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiEffect.NavigateBackWithNewFiAdded navigateBackWithNewFiAdded, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = navigateBackWithNewFiAdded.newFiAdded;
            }
            return navigateBackWithNewFiAdded.copy(z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiUiEffect$NavigateToUpdatePaymentMethodSuccess;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiUiEffect;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/UpdatePaymentSuccessUiModel;", "uiModel", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/UpdatePaymentSuccessUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/UpdatePaymentSuccessUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/UpdatePaymentSuccessUiModel;)Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiUiEffect$NavigateToUpdatePaymentMethodSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/UpdatePaymentSuccessUiModel;", "getUiModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToUpdatePaymentMethodSuccess extends com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiEffect {
        public static final int $stable;
        private final com.paypal.oslo.feature.bnplservicing.ui.changefi.UpdatePaymentSuccessUiModel uiModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToUpdatePaymentMethodSuccess(com.paypal.oslo.feature.bnplservicing.ui.changefi.UpdatePaymentSuccessUiModel updatePaymentSuccessUiModel) {
            super("NavigateToUpdatePaymentMethodSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updatePaymentSuccessUiModel, "");
            this.uiModel = updatePaymentSuccessUiModel;
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.changefi.UpdatePaymentSuccessUiModel getUiModel() {
            return this.uiModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplservicing.ui.changefi.UpdatePaymentSuccessUiModel updatePaymentSuccessUiModel = this.uiModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToUpdatePaymentMethodSuccess(uiModel=");
            sb.append(updatePaymentSuccessUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.uiModel.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiEffect.NavigateToUpdatePaymentMethodSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, ((com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiEffect.NavigateToUpdatePaymentMethodSuccess) other).uiModel);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiEffect.NavigateToUpdatePaymentMethodSuccess copy(com.paypal.oslo.feature.bnplservicing.ui.changefi.UpdatePaymentSuccessUiModel uiModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiEffect.NavigateToUpdatePaymentMethodSuccess(uiModel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.ui.changefi.UpdatePaymentSuccessUiModel getUiModel() {
            return this.uiModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiEffect.NavigateToUpdatePaymentMethodSuccess copy$default(com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiEffect.NavigateToUpdatePaymentMethodSuccess navigateToUpdatePaymentMethodSuccess, com.paypal.oslo.feature.bnplservicing.ui.changefi.UpdatePaymentSuccessUiModel updatePaymentSuccessUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                updatePaymentSuccessUiModel = navigateToUpdatePaymentMethodSuccess.uiModel;
            }
            return navigateToUpdatePaymentMethodSuccess.copy(updatePaymentSuccessUiModel);
        }

        static {
            int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            $stable = i | i | com.paypal.oslo.core.commonui.utils.RefText.$stable;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiUiEffect$OpenAgreementLink;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiUiEffect;", "", "url", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiUiEffect$OpenAgreementLink;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OpenAgreementLink extends com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiEffect {
        public static final int $stable = 0;
        private final java.lang.String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenAgreementLink(java.lang.String str) {
            super("OpenAgreementLink", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.url = str;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OpenAgreementLink(url=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiEffect.OpenAgreementLink) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, ((com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiEffect.OpenAgreementLink) other).url);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiEffect.OpenAgreementLink copy(java.lang.String url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiEffect.OpenAgreementLink(url);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiEffect.OpenAgreementLink copy$default(com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiEffect.OpenAgreementLink openAgreementLink, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = openAgreementLink.url;
            }
            return openAgreementLink.copy(str);
        }
    }

    public /* synthetic */ ChangeFiUiEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
