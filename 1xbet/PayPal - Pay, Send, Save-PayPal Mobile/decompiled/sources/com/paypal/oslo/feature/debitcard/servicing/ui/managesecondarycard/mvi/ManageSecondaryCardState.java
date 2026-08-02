package com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managesecondarycard/mvi/ManageSecondaryCardState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Initial", "Loading", "Success", "Error", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managesecondarycard/mvi/ManageSecondaryCardState$Error;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managesecondarycard/mvi/ManageSecondaryCardState$Initial;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managesecondarycard/mvi/ManageSecondaryCardState$Loading;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managesecondarycard/mvi/ManageSecondaryCardState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class ManageSecondaryCardState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    private ManageSecondaryCardState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managesecondarycard/mvi/ManageSecondaryCardState$Initial;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managesecondarycard/mvi/ManageSecondaryCardState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initial extends com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardState.Initial INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardState.Initial();

        public final int hashCode() {
            return -704021728;
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
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardState.Initial)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managesecondarycard/mvi/ManageSecondaryCardState$Loading;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managesecondarycard/mvi/ManageSecondaryCardState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardState.Loading INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardState.Loading();

        public final int hashCode() {
            return 1979254040;
        }

        private Loading() {
            super("Loading", null);
        }

        public final java.lang.String toString() {
            return "Loading";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardState.Loading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000eJ\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managesecondarycard/mvi/ManageSecondaryCardState$Success;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managesecondarycard/mvi/ManageSecondaryCardState;", "", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;", "instruments", "", "maxAdditionalCardsAllowed", "", "canAddMoreCardholders", "<init>", "(Ljava/util/List;IZ)V", "component1", "()Ljava/util/List;", "component2", "()I", "component3", "()Z", "copy", "(Ljava/util/List;IZ)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managesecondarycard/mvi/ManageSecondaryCardState$Success;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getInstruments", com.visa.cbp.getEncExpo.warmup, "getMaxAdditionalCardsAllowed", "Z", "getCanAddMoreCardholders"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardState {
        public static final int $stable = 8;
        private final boolean canAddMoreCardholders;
        private final java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument> instruments;
        private final int maxAdditionalCardsAllowed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument> list, int i, boolean z) {
            super("Success", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.instruments = list;
            this.maxAdditionalCardsAllowed = i;
            this.canAddMoreCardholders = z;
        }

        public final java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument> getInstruments() {
            return this.instruments;
        }

        public final int getMaxAdditionalCardsAllowed() {
            return this.maxAdditionalCardsAllowed;
        }

        public final boolean getCanAddMoreCardholders() {
            return this.canAddMoreCardholders;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument> list = this.instruments;
            int i = this.maxAdditionalCardsAllowed;
            boolean z = this.canAddMoreCardholders;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(instruments=");
            sb.append(list);
            sb.append(", maxAdditionalCardsAllowed=");
            sb.append(i);
            sb.append(", canAddMoreCardholders=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.instruments.hashCode() * 31) + java.lang.Integer.hashCode(this.maxAdditionalCardsAllowed)) * 31) + java.lang.Boolean.hashCode(this.canAddMoreCardholders);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardState.Success)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardState.Success success = (com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardState.Success) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.instruments, success.instruments) && this.maxAdditionalCardsAllowed == success.maxAdditionalCardsAllowed && this.canAddMoreCardholders == success.canAddMoreCardholders;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardState.Success copy(java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument> instruments, int maxAdditionalCardsAllowed, boolean canAddMoreCardholders) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instruments, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardState.Success(instruments, maxAdditionalCardsAllowed, canAddMoreCardholders);
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getCanAddMoreCardholders() {
            return this.canAddMoreCardholders;
        }

        /* renamed from: component2, reason: from getter */
        public final int getMaxAdditionalCardsAllowed() {
            return this.maxAdditionalCardsAllowed;
        }

        public final java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument> component1() {
            return this.instruments;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardState.Success copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardState.Success success, java.util.List list, int i, boolean z, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                list = success.instruments;
            }
            if ((i2 & 2) != 0) {
                i = success.maxAdditionalCardsAllowed;
            }
            if ((i2 & 4) != 0) {
                z = success.canAddMoreCardholders;
            }
            return success.copy(list, i, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\rJ\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managesecondarycard/mvi/ManageSecondaryCardState$Error;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managesecondarycard/mvi/ManageSecondaryCardState;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "errorType", "", "retryCount", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/ErrorInfo;", "errorInfo", "<init>", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;ILcom/paypal/oslo/feature/debitcard/shared/domain/model/ErrorInfo;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "component2", "()I", "component3", "()Lcom/paypal/oslo/feature/debitcard/shared/domain/model/ErrorInfo;", "copy", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;ILcom/paypal/oslo/feature/debitcard/shared/domain/model/ErrorInfo;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managesecondarycard/mvi/ManageSecondaryCardState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "getErrorType", com.visa.cbp.getEncExpo.warmup, "getRetryCount", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/ErrorInfo;", "getErrorInfo"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.debitcard.shared.domain.model.ErrorInfo errorInfo;
        private final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType;
        private final int retryCount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, int i, com.paypal.oslo.feature.debitcard.shared.domain.model.ErrorInfo errorInfo) {
            super("Error", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitErrorType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorInfo, "");
            this.errorType = debitErrorType;
            this.retryCount = i;
            this.errorInfo = errorInfo;
        }

        public final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType getErrorType() {
            return this.errorType;
        }

        public final int getRetryCount() {
            return this.retryCount;
        }

        public /* synthetic */ Error(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, int i, com.paypal.oslo.feature.debitcard.shared.domain.model.ErrorInfo errorInfo, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(debitErrorType, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? new com.paypal.oslo.feature.debitcard.shared.domain.model.ErrorInfo(null, null, 3, null) : errorInfo);
        }

        public final com.paypal.oslo.feature.debitcard.shared.domain.model.ErrorInfo getErrorInfo() {
            return this.errorInfo;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType = this.errorType;
            int i = this.retryCount;
            com.paypal.oslo.feature.debitcard.shared.domain.model.ErrorInfo errorInfo = this.errorInfo;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(errorType=");
            sb.append(debitErrorType);
            sb.append(", retryCount=");
            sb.append(i);
            sb.append(", errorInfo=");
            sb.append(errorInfo);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.errorType.hashCode() * 31) + java.lang.Integer.hashCode(this.retryCount)) * 31) + this.errorInfo.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardState.Error)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardState.Error error = (com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardState.Error) other;
            return this.errorType == error.errorType && this.retryCount == error.retryCount && kotlin.jvm.internal.Intrinsics.areEqual(this.errorInfo, error.errorInfo);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardState.Error copy(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType, int retryCount, com.paypal.oslo.feature.debitcard.shared.domain.model.ErrorInfo errorInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorInfo, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardState.Error(errorType, retryCount, errorInfo);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.shared.domain.model.ErrorInfo getErrorInfo() {
            return this.errorInfo;
        }

        /* renamed from: component2, reason: from getter */
        public final int getRetryCount() {
            return this.retryCount;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType getErrorType() {
            return this.errorType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardState.Error copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardState.Error error, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, int i, com.paypal.oslo.feature.debitcard.shared.domain.model.ErrorInfo errorInfo, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                debitErrorType = error.errorType;
            }
            if ((i2 & 2) != 0) {
                i = error.retryCount;
            }
            if ((i2 & 4) != 0) {
                errorInfo = error.errorInfo;
            }
            return error.copy(debitErrorType, i, errorInfo);
        }
    }

    public /* synthetic */ ManageSecondaryCardState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
