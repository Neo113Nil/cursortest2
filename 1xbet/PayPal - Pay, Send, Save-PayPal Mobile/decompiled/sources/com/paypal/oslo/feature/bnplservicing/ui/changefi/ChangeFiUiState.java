package com.paypal.oslo.feature.bnplservicing.ui.changefi;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0005\n\u000b\f\r\u000eB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiUiState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Loading", "Reset", "Success", "UpdatingPaymentMethod", "Error", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiUiState$Error;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiUiState$Loading;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiUiState$Reset;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiUiState$Success;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiUiState$UpdatingPaymentMethod;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class ChangeFiUiState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiUiState$Loading;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiUiState;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Loading extends com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiState.Loading INSTANCE = new com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiState.Loading();

        private Loading() {
            super("Loading", null);
        }
    }

    private ChangeFiUiState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiUiState$Reset;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiUiState;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Reset extends com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiState.Reset INSTANCE = new com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiState.Reset();

        private Reset() {
            super("Reset", null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiUiState$Success;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiUiState;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiHalfSheetUiModel;", "uiModel", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiHalfSheetUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiHalfSheetUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiHalfSheetUiModel;)Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiUiState$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiHalfSheetUiModel;", "getUiModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiHalfSheetUiModel uiModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiHalfSheetUiModel changeFiHalfSheetUiModel) {
            super("Success", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(changeFiHalfSheetUiModel, "");
            this.uiModel = changeFiHalfSheetUiModel;
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiHalfSheetUiModel getUiModel() {
            return this.uiModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiHalfSheetUiModel changeFiHalfSheetUiModel = this.uiModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(uiModel=");
            sb.append(changeFiHalfSheetUiModel);
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
            return (other instanceof com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiState.Success) && kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, ((com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiState.Success) other).uiModel);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiState.Success copy(com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiHalfSheetUiModel uiModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiState.Success(uiModel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiHalfSheetUiModel getUiModel() {
            return this.uiModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiState.Success copy$default(com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiState.Success success, com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiHalfSheetUiModel changeFiHalfSheetUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                changeFiHalfSheetUiModel = success.uiModel;
            }
            return success.copy(changeFiHalfSheetUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiUiState$UpdatingPaymentMethod;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiUiState;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiHalfSheetUiModel;", "uiModel", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiHalfSheetUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiHalfSheetUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiHalfSheetUiModel;)Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiUiState$UpdatingPaymentMethod;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiHalfSheetUiModel;", "getUiModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UpdatingPaymentMethod extends com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiHalfSheetUiModel uiModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdatingPaymentMethod(com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiHalfSheetUiModel changeFiHalfSheetUiModel) {
            super("UpdatingPaymentMethod", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(changeFiHalfSheetUiModel, "");
            this.uiModel = changeFiHalfSheetUiModel;
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiHalfSheetUiModel getUiModel() {
            return this.uiModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiHalfSheetUiModel changeFiHalfSheetUiModel = this.uiModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdatingPaymentMethod(uiModel=");
            sb.append(changeFiHalfSheetUiModel);
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
            return (other instanceof com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiState.UpdatingPaymentMethod) && kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, ((com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiState.UpdatingPaymentMethod) other).uiModel);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiState.UpdatingPaymentMethod copy(com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiHalfSheetUiModel uiModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiState.UpdatingPaymentMethod(uiModel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiHalfSheetUiModel getUiModel() {
            return this.uiModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiState.UpdatingPaymentMethod copy$default(com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiState.UpdatingPaymentMethod updatingPaymentMethod, com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiHalfSheetUiModel changeFiHalfSheetUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                changeFiHalfSheetUiModel = updatingPaymentMethod.uiModel;
            }
            return updatingPaymentMethod.copy(changeFiHalfSheetUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J<\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiUiState$Error;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiUiState;", "", "correlationId", "creditAccountId", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;", "creditProductIdentifier", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/FundingInstrument;", "fundingInstrument", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/FundingInstrument;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;", "component4", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/FundingInstrument;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/FundingInstrument;)Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiUiState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCorrelationId", "getCreditAccountId", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;", "getCreditProductIdentifier", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/FundingInstrument;", "getFundingInstrument"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiState {
        public static final int $stable = 8;
        private final java.lang.String correlationId;
        private final java.lang.String creditAccountId;
        private final com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier;
        private final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument) {
            super("Error", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
            this.correlationId = str;
            this.creditAccountId = str2;
            this.creditProductIdentifier = creditProductIdentifier;
            this.fundingInstrument = fundingInstrument;
        }

        public /* synthetic */ Error(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, str2, creditProductIdentifier, (i & 8) != 0 ? null : fundingInstrument);
        }

        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        public final com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier getCreditProductIdentifier() {
            return this.creditProductIdentifier;
        }

        public final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument getFundingInstrument() {
            return this.fundingInstrument;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.correlationId;
            java.lang.String str2 = this.creditAccountId;
            com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier = this.creditProductIdentifier;
            com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument = this.fundingInstrument;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(correlationId=");
            sb.append(str);
            sb.append(", creditAccountId=");
            sb.append(str2);
            sb.append(", creditProductIdentifier=");
            sb.append(creditProductIdentifier);
            sb.append(", fundingInstrument=");
            sb.append(fundingInstrument);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.correlationId;
            int hashCode = str == null ? 0 : str.hashCode();
            int hashCode2 = this.creditAccountId.hashCode();
            int hashCode3 = this.creditProductIdentifier.hashCode();
            com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument = this.fundingInstrument;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (fundingInstrument != null ? fundingInstrument.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiState.Error)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiState.Error error = (com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiState.Error) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, error.correlationId) && kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, error.creditAccountId) && this.creditProductIdentifier == error.creditProductIdentifier && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingInstrument, error.fundingInstrument);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiState.Error copy(java.lang.String correlationId, java.lang.String creditAccountId, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAccountId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiState.Error(correlationId, creditAccountId, creditProductIdentifier, fundingInstrument);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument getFundingInstrument() {
            return this.fundingInstrument;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier getCreditProductIdentifier() {
            return this.creditProductIdentifier;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiState.Error copy$default(com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiState.Error error, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = error.correlationId;
            }
            if ((i & 2) != 0) {
                str2 = error.creditAccountId;
            }
            if ((i & 4) != 0) {
                creditProductIdentifier = error.creditProductIdentifier;
            }
            if ((i & 8) != 0) {
                fundingInstrument = error.fundingInstrument;
            }
            return error.copy(str, str2, creditProductIdentifier, fundingInstrument);
        }
    }

    public /* synthetic */ ChangeFiUiState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
