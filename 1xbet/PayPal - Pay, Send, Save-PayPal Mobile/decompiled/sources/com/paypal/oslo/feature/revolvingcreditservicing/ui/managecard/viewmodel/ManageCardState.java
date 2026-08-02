package com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\b\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015B\u0013\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0011\u0010\r\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0007\u0016\u0017\u0018\u0019\u001a\u001b\u001c"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "", "getCardLockStatusChanged", "()Z", "cardLockStatusChanged", "Initial", "FetchAccountSummary", "InitializingUiModel", com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY, "TogglingCardLockStatus", "Error", "FetchingCardDetails", "ReadyInfo", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardState$Error;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardState$FetchAccountSummary;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardState$FetchingCardDetails;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardState$Initial;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardState$InitializingUiModel;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardState$Ready;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardState$TogglingCardLockStatus;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class ManageCardState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    private ManageCardState(java.lang.String str) {
        this.name = str;
    }

    public /* synthetic */ ManageCardState(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "ManageCardState" : str, null);
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardState$Initial;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initial extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.Initial INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.Initial();

        public final int hashCode() {
            return 1447510873;
        }

        private Initial() {
            super("Initial", null);
        }

        public final java.lang.String toString() {
            return "Initial";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.Initial)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardState$FetchAccountSummary;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.ObservabilityMiddleware.KEY_CPI, "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardState$FetchAccountSummary;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "getCpi"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FetchAccountSummary extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier cpi;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FetchAccountSummary(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier) {
            super("FetchAccountSummary", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
            this.cpi = creditProductIdentifier;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCpi() {
            return this.cpi;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier = this.cpi;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FetchAccountSummary(cpi=");
            sb.append(creditProductIdentifier);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.cpi.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.FetchAccountSummary) && this.cpi == ((com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.FetchAccountSummary) other).cpi;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.FetchAccountSummary copy(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier cpi) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cpi, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.FetchAccountSummary(cpi);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCpi() {
            return this.cpi;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.FetchAccountSummary copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.FetchAccountSummary fetchAccountSummary, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                creditProductIdentifier = fetchAccountSummary.cpi;
            }
            return fetchAccountSummary.copy(creditProductIdentifier);
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardState$InitializingUiModel;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.ObservabilityMiddleware.KEY_CPI, "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/ManageCardDetails;", "manageCardDetails", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/ManageCardDetails;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/ManageCardDetails;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/ManageCardDetails;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardState$InitializingUiModel;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "getCpi", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/ManageCardDetails;", "getManageCardDetails"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InitializingUiModel extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier cpi;
        private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails manageCardDetails;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InitializingUiModel(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails manageCardDetails) {
            super("InitializingUiModel", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manageCardDetails, "");
            this.cpi = creditProductIdentifier;
            this.manageCardDetails = manageCardDetails;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCpi() {
            return this.cpi;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails getManageCardDetails() {
            return this.manageCardDetails;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier = this.cpi;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails manageCardDetails = this.manageCardDetails;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("InitializingUiModel(cpi=");
            sb.append(creditProductIdentifier);
            sb.append(", manageCardDetails=");
            sb.append(manageCardDetails);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.cpi.hashCode() * 31) + this.manageCardDetails.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.InitializingUiModel)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.InitializingUiModel initializingUiModel = (com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.InitializingUiModel) other;
            return this.cpi == initializingUiModel.cpi && kotlin.jvm.internal.Intrinsics.areEqual(this.manageCardDetails, initializingUiModel.manageCardDetails);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.InitializingUiModel copy(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier cpi, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails manageCardDetails) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cpi, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manageCardDetails, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.InitializingUiModel(cpi, manageCardDetails);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails getManageCardDetails() {
            return this.manageCardDetails;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCpi() {
            return this.cpi;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.InitializingUiModel copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.InitializingUiModel initializingUiModel, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails manageCardDetails, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                creditProductIdentifier = initializingUiModel.cpi;
            }
            if ((i & 2) != 0) {
                manageCardDetails = initializingUiModel.manageCardDetails;
            }
            return initializingUiModel.copy(creditProductIdentifier, manageCardDetails);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardState$Ready;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardState$ReadyInfo;", "readyInfo", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardState$ReadyInfo;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardState$ReadyInfo;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardState$ReadyInfo;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardState$Ready;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardState$ReadyInfo;", "getReadyInfo"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Ready extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.ReadyInfo readyInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ready(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.ReadyInfo readyInfo) {
            super(com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readyInfo, "");
            this.readyInfo = readyInfo;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.ReadyInfo getReadyInfo() {
            return this.readyInfo;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.ReadyInfo readyInfo = this.readyInfo;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Ready(readyInfo=");
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
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.Ready) && kotlin.jvm.internal.Intrinsics.areEqual(this.readyInfo, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.Ready) other).readyInfo);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.Ready copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.ReadyInfo readyInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readyInfo, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.Ready(readyInfo);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.ReadyInfo getReadyInfo() {
            return this.readyInfo;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.Ready copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.Ready ready, com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.ReadyInfo readyInfo, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                readyInfo = ready.readyInfo;
            }
            return ready.copy(readyInfo);
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardState$TogglingCardLockStatus;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardState$ReadyInfo;", "readyInfo", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/CardLockState;", "targetLockState", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardState$ReadyInfo;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/CardLockState;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardState$ReadyInfo;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/CardLockState;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardState$ReadyInfo;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/CardLockState;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardState$TogglingCardLockStatus;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardState$ReadyInfo;", "getReadyInfo", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/CardLockState;", "getTargetLockState"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TogglingCardLockStatus extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.ReadyInfo readyInfo;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardLockState targetLockState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TogglingCardLockStatus(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.ReadyInfo readyInfo, com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardLockState cardLockState) {
            super("TogglingCardLockStatus", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readyInfo, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardLockState, "");
            this.readyInfo = readyInfo;
            this.targetLockState = cardLockState;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.ReadyInfo getReadyInfo() {
            return this.readyInfo;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardLockState getTargetLockState() {
            return this.targetLockState;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.ReadyInfo readyInfo = this.readyInfo;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardLockState cardLockState = this.targetLockState;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TogglingCardLockStatus(readyInfo=");
            sb.append(readyInfo);
            sb.append(", targetLockState=");
            sb.append(cardLockState);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.readyInfo.hashCode() * 31) + this.targetLockState.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.TogglingCardLockStatus)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.TogglingCardLockStatus togglingCardLockStatus = (com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.TogglingCardLockStatus) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.readyInfo, togglingCardLockStatus.readyInfo) && this.targetLockState == togglingCardLockStatus.targetLockState;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.TogglingCardLockStatus copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.ReadyInfo readyInfo, com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardLockState targetLockState) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readyInfo, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(targetLockState, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.TogglingCardLockStatus(readyInfo, targetLockState);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardLockState getTargetLockState() {
            return this.targetLockState;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.ReadyInfo getReadyInfo() {
            return this.readyInfo;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.TogglingCardLockStatus copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.TogglingCardLockStatus togglingCardLockStatus, com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.ReadyInfo readyInfo, com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardLockState cardLockState, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                readyInfo = togglingCardLockStatus.readyInfo;
            }
            if ((i & 2) != 0) {
                cardLockState = togglingCardLockStatus.targetLockState;
            }
            return togglingCardLockStatus.copy(readyInfo, cardLockState);
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J2\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardState$Error;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardState$ReadyInfo;", "readyInfo", "", "enrollingInPaper", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/StatementDeliveryError;", "error", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardState$ReadyInfo;ZLcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/StatementDeliveryError;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardState$ReadyInfo;", "component2", "()Z", "component3", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/StatementDeliveryError;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardState$ReadyInfo;ZLcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/StatementDeliveryError;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardState$Error;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardState$ReadyInfo;", "getReadyInfo", "Z", "getEnrollingInPaper", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/StatementDeliveryError;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 8;
        private final boolean enrollingInPaper;
        private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.StatementDeliveryError error;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.ReadyInfo readyInfo;

        public Error(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.ReadyInfo readyInfo, boolean z, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.StatementDeliveryError statementDeliveryError) {
            super("Error", null);
            this.readyInfo = readyInfo;
            this.enrollingInPaper = z;
            this.error = statementDeliveryError;
        }

        public /* synthetic */ Error(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.ReadyInfo readyInfo, boolean z, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.StatementDeliveryError statementDeliveryError, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : readyInfo, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : statementDeliveryError);
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.ReadyInfo getReadyInfo() {
            return this.readyInfo;
        }

        public final boolean getEnrollingInPaper() {
            return this.enrollingInPaper;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.StatementDeliveryError getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.ReadyInfo readyInfo = this.readyInfo;
            boolean z = this.enrollingInPaper;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.StatementDeliveryError statementDeliveryError = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(readyInfo=");
            sb.append(readyInfo);
            sb.append(", enrollingInPaper=");
            sb.append(z);
            sb.append(", error=");
            sb.append(statementDeliveryError);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.ReadyInfo readyInfo = this.readyInfo;
            int hashCode = readyInfo == null ? 0 : readyInfo.hashCode();
            int hashCode2 = java.lang.Boolean.hashCode(this.enrollingInPaper);
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.StatementDeliveryError statementDeliveryError = this.error;
            return (((hashCode * 31) + hashCode2) * 31) + (statementDeliveryError != null ? statementDeliveryError.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.Error)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.Error error = (com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.Error) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.readyInfo, error.readyInfo) && this.enrollingInPaper == error.enrollingInPaper && kotlin.jvm.internal.Intrinsics.areEqual(this.error, error.error);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.Error copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.ReadyInfo readyInfo, boolean enrollingInPaper, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.StatementDeliveryError error) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.Error(readyInfo, enrollingInPaper, error);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.StatementDeliveryError getError() {
            return this.error;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getEnrollingInPaper() {
            return this.enrollingInPaper;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.ReadyInfo getReadyInfo() {
            return this.readyInfo;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.Error copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.Error error, com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.ReadyInfo readyInfo, boolean z, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.StatementDeliveryError statementDeliveryError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                readyInfo = error.readyInfo;
            }
            if ((i & 2) != 0) {
                z = error.enrollingInPaper;
            }
            if ((i & 4) != 0) {
                statementDeliveryError = error.error;
            }
            return error.copy(readyInfo, z, statementDeliveryError);
        }

        public Error() {
            this(null, false, null, 7, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardState$FetchingCardDetails;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardState$ReadyInfo;", "readyInfo", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardState$ReadyInfo;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardState$ReadyInfo;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardState$ReadyInfo;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardState$FetchingCardDetails;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardState$ReadyInfo;", "getReadyInfo"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FetchingCardDetails extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.ReadyInfo readyInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FetchingCardDetails(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.ReadyInfo readyInfo) {
            super("FetchingCardDetails", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readyInfo, "");
            this.readyInfo = readyInfo;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.ReadyInfo getReadyInfo() {
            return this.readyInfo;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.ReadyInfo readyInfo = this.readyInfo;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FetchingCardDetails(readyInfo=");
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
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.FetchingCardDetails) && kotlin.jvm.internal.Intrinsics.areEqual(this.readyInfo, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.FetchingCardDetails) other).readyInfo);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.FetchingCardDetails copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.ReadyInfo readyInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readyInfo, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.FetchingCardDetails(readyInfo);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.ReadyInfo getReadyInfo() {
            return this.readyInfo;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.FetchingCardDetails copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.FetchingCardDetails fetchingCardDetails, com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.ReadyInfo readyInfo, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                readyInfo = fetchingCardDetails.readyInfo;
            }
            return fetchingCardDetails.copy(readyInfo);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\fHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010\u001eJ\u0012\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b#\u0010\u001eJ\u0012\u0010$\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b&\u0010!J\u0012\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b'\u0010%J\u0012\u0010(\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b(\u0010)J\u009c\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0011\u001a\u00020\f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010-\u001a\u00020\f2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u00100\u001a\u00020/HÖ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b2\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b6\u0010\u001aR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b8\u0010\u001cR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\b:\u0010\u001eR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00109\u001a\u0004\b;\u0010\u001eR\u001a\u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010<\u001a\u0004\b=\u0010!R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00109\u001a\u0004\b>\u0010\u001eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00109\u001a\u0004\b?\u0010\u001eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010@\u001a\u0004\bA\u0010%R\u001a\u0010\u0011\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010<\u001a\u0004\b\u0011\u0010!R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010@\u001a\u0004\bB\u0010%R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010C\u001a\u0004\bD\u0010)R\u0011\u0010F\u001a\u00020\f8G¢\u0006\u0006\u001a\u0004\bE\u0010!R\u0011\u0010J\u001a\u00020G8G¢\u0006\u0006\u001a\u0004\bH\u0010I"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardState$ReadyInfo;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/ManageCardDetailUiModel;", "manageCardDetailUiModel", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.ObservabilityMiddleware.KEY_CPI, "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/ManageCardActionUiModel;", "managementSections", "", "creditAccountId", "creditInstrumentId", "", "cardLockStatusChanged", "eSignConsentUrl", "benefitsUrl", "lastFailedStatementDeliveryEnrollment", "isUpdatingStatementDelivery", "enrollingInPaper", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/StatementDeliveryError;", "statementDeliveryError", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/ManageCardDetailUiModel;Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/Boolean;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/StatementDeliveryError;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/ManageCardDetailUiModel;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "component3", "()Ljava/util/List;", "component4", "()Ljava/lang/String;", "component5", "component6", "()Z", "component7", "component8", "component9", "()Ljava/lang/Boolean;", "component10", "component11", "component12", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/StatementDeliveryError;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/ManageCardDetailUiModel;Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/Boolean;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/StatementDeliveryError;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardState$ReadyInfo;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/ManageCardDetailUiModel;", "getManageCardDetailUiModel", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "getCpi", "Ljava/util/List;", "getManagementSections", "Ljava/lang/String;", "getCreditAccountId", "getCreditInstrumentId", "Z", "getCardLockStatusChanged", "getESignConsentUrl", "getBenefitsUrl", "Ljava/lang/Boolean;", "getLastFailedStatementDeliveryEnrollment", "getEnrollingInPaper", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/StatementDeliveryError;", "getStatementDeliveryError", "getCardIsLocked", "cardIsLocked", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/components/BottomSheetMode;", "getStatementDeliverySheetMode", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/components/BottomSheetMode;", "statementDeliverySheetMode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ReadyInfo {
        public static final int $stable = 8;
        private final java.lang.String benefitsUrl;
        private final boolean cardLockStatusChanged;
        private final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier cpi;
        private final java.lang.String creditAccountId;
        private final java.lang.String creditInstrumentId;
        private final java.lang.String eSignConsentUrl;
        private final java.lang.Boolean enrollingInPaper;
        private final boolean isUpdatingStatementDelivery;
        private final java.lang.Boolean lastFailedStatementDeliveryEnrollment;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardDetailUiModel manageCardDetailUiModel;
        private final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel> managementSections;
        private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.StatementDeliveryError statementDeliveryError;

        /* JADX WARN: Multi-variable type inference failed */
        public ReadyInfo(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardDetailUiModel manageCardDetailUiModel, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel> list, java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, java.lang.String str4, java.lang.Boolean bool, boolean z2, java.lang.Boolean bool2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.StatementDeliveryError statementDeliveryError) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manageCardDetailUiModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.manageCardDetailUiModel = manageCardDetailUiModel;
            this.cpi = creditProductIdentifier;
            this.managementSections = list;
            this.creditAccountId = str;
            this.creditInstrumentId = str2;
            this.cardLockStatusChanged = z;
            this.eSignConsentUrl = str3;
            this.benefitsUrl = str4;
            this.lastFailedStatementDeliveryEnrollment = bool;
            this.isUpdatingStatementDelivery = z2;
            this.enrollingInPaper = bool2;
            this.statementDeliveryError = statementDeliveryError;
        }

        public /* synthetic */ ReadyInfo(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardDetailUiModel manageCardDetailUiModel, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, java.util.List list, java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, java.lang.String str4, java.lang.Boolean bool, boolean z2, java.lang.Boolean bool2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.StatementDeliveryError statementDeliveryError, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(manageCardDetailUiModel, creditProductIdentifier, list, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? false : z, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : bool, (i & 512) != 0 ? false : z2, (i & 1024) != 0 ? null : bool2, (i & 2048) != 0 ? null : statementDeliveryError);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardDetailUiModel getManageCardDetailUiModel() {
            return this.manageCardDetailUiModel;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCpi() {
            return this.cpi;
        }

        public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel> getManagementSections() {
            return this.managementSections;
        }

        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        public final java.lang.String getCreditInstrumentId() {
            return this.creditInstrumentId;
        }

        public final boolean getCardLockStatusChanged() {
            return this.cardLockStatusChanged;
        }

        public final java.lang.String getESignConsentUrl() {
            return this.eSignConsentUrl;
        }

        public final java.lang.String getBenefitsUrl() {
            return this.benefitsUrl;
        }

        public final java.lang.Boolean getLastFailedStatementDeliveryEnrollment() {
            return this.lastFailedStatementDeliveryEnrollment;
        }

        public final boolean isUpdatingStatementDelivery() {
            return this.isUpdatingStatementDelivery;
        }

        public final java.lang.Boolean getEnrollingInPaper() {
            return this.enrollingInPaper;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.StatementDeliveryError getStatementDeliveryError() {
            return this.statementDeliveryError;
        }

        public final boolean getCardIsLocked() {
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel> list = this.managementSections;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (obj instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.LockCard) {
                    arrayList.add(obj);
                }
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.LockCard lockCard = (com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.LockCard) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) arrayList);
            return lockCard != null && lockCard.isLocked();
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetMode getStatementDeliverySheetMode() {
            return this.statementDeliveryError != null ? com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetMode.ERROR : this.isUpdatingStatementDelivery ? com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetMode.LOADING : com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetMode.NORMAL;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardDetailUiModel manageCardDetailUiModel = this.manageCardDetailUiModel;
            com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier = this.cpi;
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel> list = this.managementSections;
            java.lang.String str = this.creditAccountId;
            java.lang.String str2 = this.creditInstrumentId;
            boolean z = this.cardLockStatusChanged;
            java.lang.String str3 = this.eSignConsentUrl;
            java.lang.String str4 = this.benefitsUrl;
            java.lang.Boolean bool = this.lastFailedStatementDeliveryEnrollment;
            boolean z2 = this.isUpdatingStatementDelivery;
            java.lang.Boolean bool2 = this.enrollingInPaper;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.StatementDeliveryError statementDeliveryError = this.statementDeliveryError;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ReadyInfo(manageCardDetailUiModel=");
            sb.append(manageCardDetailUiModel);
            sb.append(", cpi=");
            sb.append(creditProductIdentifier);
            sb.append(", managementSections=");
            sb.append(list);
            sb.append(", creditAccountId=");
            sb.append(str);
            sb.append(", creditInstrumentId=");
            sb.append(str2);
            sb.append(", cardLockStatusChanged=");
            sb.append(z);
            sb.append(", eSignConsentUrl=");
            sb.append(str3);
            sb.append(", benefitsUrl=");
            sb.append(str4);
            sb.append(", lastFailedStatementDeliveryEnrollment=");
            sb.append(bool);
            sb.append(", isUpdatingStatementDelivery=");
            sb.append(z2);
            sb.append(", enrollingInPaper=");
            sb.append(bool2);
            sb.append(", statementDeliveryError=");
            sb.append(statementDeliveryError);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.manageCardDetailUiModel.hashCode();
            int hashCode2 = this.cpi.hashCode();
            int hashCode3 = this.managementSections.hashCode();
            java.lang.String str = this.creditAccountId;
            int hashCode4 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.creditInstrumentId;
            int hashCode5 = str2 == null ? 0 : str2.hashCode();
            int hashCode6 = java.lang.Boolean.hashCode(this.cardLockStatusChanged);
            java.lang.String str3 = this.eSignConsentUrl;
            int hashCode7 = str3 == null ? 0 : str3.hashCode();
            java.lang.String str4 = this.benefitsUrl;
            int hashCode8 = str4 == null ? 0 : str4.hashCode();
            java.lang.Boolean bool = this.lastFailedStatementDeliveryEnrollment;
            int hashCode9 = bool == null ? 0 : bool.hashCode();
            int hashCode10 = java.lang.Boolean.hashCode(this.isUpdatingStatementDelivery);
            java.lang.Boolean bool2 = this.enrollingInPaper;
            int hashCode11 = bool2 == null ? 0 : bool2.hashCode();
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.StatementDeliveryError statementDeliveryError = this.statementDeliveryError;
            return (((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + (statementDeliveryError != null ? statementDeliveryError.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.ReadyInfo)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.ReadyInfo readyInfo = (com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.ReadyInfo) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.manageCardDetailUiModel, readyInfo.manageCardDetailUiModel) && this.cpi == readyInfo.cpi && kotlin.jvm.internal.Intrinsics.areEqual(this.managementSections, readyInfo.managementSections) && kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, readyInfo.creditAccountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.creditInstrumentId, readyInfo.creditInstrumentId) && this.cardLockStatusChanged == readyInfo.cardLockStatusChanged && kotlin.jvm.internal.Intrinsics.areEqual(this.eSignConsentUrl, readyInfo.eSignConsentUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.benefitsUrl, readyInfo.benefitsUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastFailedStatementDeliveryEnrollment, readyInfo.lastFailedStatementDeliveryEnrollment) && this.isUpdatingStatementDelivery == readyInfo.isUpdatingStatementDelivery && kotlin.jvm.internal.Intrinsics.areEqual(this.enrollingInPaper, readyInfo.enrollingInPaper) && kotlin.jvm.internal.Intrinsics.areEqual(this.statementDeliveryError, readyInfo.statementDeliveryError);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.ReadyInfo copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardDetailUiModel manageCardDetailUiModel, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier cpi, java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel> managementSections, java.lang.String creditAccountId, java.lang.String creditInstrumentId, boolean cardLockStatusChanged, java.lang.String eSignConsentUrl, java.lang.String benefitsUrl, java.lang.Boolean lastFailedStatementDeliveryEnrollment, boolean isUpdatingStatementDelivery, java.lang.Boolean enrollingInPaper, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.StatementDeliveryError statementDeliveryError) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manageCardDetailUiModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cpi, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(managementSections, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.ReadyInfo(manageCardDetailUiModel, cpi, managementSections, creditAccountId, creditInstrumentId, cardLockStatusChanged, eSignConsentUrl, benefitsUrl, lastFailedStatementDeliveryEnrollment, isUpdatingStatementDelivery, enrollingInPaper, statementDeliveryError);
        }

        /* renamed from: component9, reason: from getter */
        public final java.lang.Boolean getLastFailedStatementDeliveryEnrollment() {
            return this.lastFailedStatementDeliveryEnrollment;
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.String getBenefitsUrl() {
            return this.benefitsUrl;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.String getESignConsentUrl() {
            return this.eSignConsentUrl;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getCardLockStatusChanged() {
            return this.cardLockStatusChanged;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getCreditInstrumentId() {
            return this.creditInstrumentId;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel> component3() {
            return this.managementSections;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCpi() {
            return this.cpi;
        }

        /* renamed from: component12, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.StatementDeliveryError getStatementDeliveryError() {
            return this.statementDeliveryError;
        }

        /* renamed from: component11, reason: from getter */
        public final java.lang.Boolean getEnrollingInPaper() {
            return this.enrollingInPaper;
        }

        /* renamed from: component10, reason: from getter */
        public final boolean getIsUpdatingStatementDelivery() {
            return this.isUpdatingStatementDelivery;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardDetailUiModel getManageCardDetailUiModel() {
            return this.manageCardDetailUiModel;
        }
    }

    public final boolean getCardLockStatusChanged() {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.ReadyInfo readyInfo;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.Ready ready = this instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.Ready ? (com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.Ready) this : null;
        return (ready == null || (readyInfo = ready.getReadyInfo()) == null || !readyInfo.getCardLockStatusChanged()) ? false : true;
    }

    public /* synthetic */ ManageCardState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
