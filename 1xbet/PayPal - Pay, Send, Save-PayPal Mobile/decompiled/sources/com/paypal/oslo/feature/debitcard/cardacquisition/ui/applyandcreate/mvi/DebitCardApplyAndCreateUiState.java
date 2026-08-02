package com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/applyandcreate/mvi/DebitCardApplyAndCreateUiState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Initial", "Provisioning", "Success", "Error", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/applyandcreate/mvi/DebitCardApplyAndCreateUiState$Error;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/applyandcreate/mvi/DebitCardApplyAndCreateUiState$Initial;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/applyandcreate/mvi/DebitCardApplyAndCreateUiState$Provisioning;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/applyandcreate/mvi/DebitCardApplyAndCreateUiState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class DebitCardApplyAndCreateUiState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    private DebitCardApplyAndCreateUiState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/applyandcreate/mvi/DebitCardApplyAndCreateUiState$Initial;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/applyandcreate/mvi/DebitCardApplyAndCreateUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initial extends com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState.Initial INSTANCE = new com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState.Initial();

        public final int hashCode() {
            return 1213096419;
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
            if (!(other instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState.Initial)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/applyandcreate/mvi/DebitCardApplyAndCreateUiState$Provisioning;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/applyandcreate/mvi/DebitCardApplyAndCreateUiState;", "", "retryCount", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/applyandcreate/mvi/DebitCardApplyAndCreateUiState$Provisioning;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getRetryCount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Provisioning extends com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState {
        public static final int $stable = 0;
        private final int retryCount;

        public Provisioning(int i) {
            super("Provisioning", null);
            this.retryCount = i;
        }

        public /* synthetic */ Provisioning(int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i);
        }

        public final int getRetryCount() {
            return this.retryCount;
        }

        public final java.lang.String toString() {
            int i = this.retryCount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Provisioning(retryCount=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Integer.hashCode(this.retryCount);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState.Provisioning) && this.retryCount == ((com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState.Provisioning) other).retryCount;
        }

        public final com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState.Provisioning copy(int retryCount) {
            return new com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState.Provisioning(retryCount);
        }

        /* renamed from: component1, reason: from getter */
        public final int getRetryCount() {
            return this.retryCount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState.Provisioning copy$default(com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState.Provisioning provisioning, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = provisioning.retryCount;
            }
            return provisioning.copy(i);
        }

        public Provisioning() {
            this(0, 1, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/applyandcreate/mvi/DebitCardApplyAndCreateUiState$Success;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/applyandcreate/mvi/DebitCardApplyAndCreateUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState.Success INSTANCE = new com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState.Success();

        public final int hashCode() {
            return 1692551842;
        }

        private Success() {
            super("Success", null);
        }

        public final java.lang.String toString() {
            return "Success";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState.Success)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J<\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0011J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/applyandcreate/mvi/DebitCardApplyAndCreateUiState$Error;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/applyandcreate/mvi/DebitCardApplyAndCreateUiState;", "", "errorCode", "errorMessage", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "errorType", "", "retryCount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "component4", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;I)Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/applyandcreate/mvi/DebitCardApplyAndCreateUiState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getErrorCode", "getErrorMessage", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "getErrorType", com.visa.cbp.getEncExpo.warmup, "getRetryCount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState {
        public static final int $stable = 0;
        private final java.lang.String errorCode;
        private final java.lang.String errorMessage;
        private final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType;
        private final int retryCount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, int i) {
            super("Error", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.errorCode = str;
            this.errorMessage = str2;
            this.errorType = debitErrorType;
            this.retryCount = i;
        }

        public /* synthetic */ Error(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : debitErrorType, (i2 & 8) != 0 ? 0 : i);
        }

        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType getErrorType() {
            return this.errorType;
        }

        public final int getRetryCount() {
            return this.retryCount;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.errorCode;
            java.lang.String str2 = this.errorMessage;
            com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType = this.errorType;
            int i = this.retryCount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(errorCode=");
            sb.append(str);
            sb.append(", errorMessage=");
            sb.append(str2);
            sb.append(", errorType=");
            sb.append(debitErrorType);
            sb.append(", retryCount=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.errorCode.hashCode();
            java.lang.String str = this.errorMessage;
            int hashCode2 = str == null ? 0 : str.hashCode();
            com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType = this.errorType;
            return (((((hashCode * 31) + hashCode2) * 31) + (debitErrorType != null ? debitErrorType.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.retryCount);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState.Error)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState.Error error = (com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState.Error) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, error.errorCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, error.errorMessage) && this.errorType == error.errorType && this.retryCount == error.retryCount;
        }

        public final com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState.Error copy(java.lang.String errorCode, java.lang.String errorMessage, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType, int retryCount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
            return new com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState.Error(errorCode, errorMessage, errorType, retryCount);
        }

        /* renamed from: component4, reason: from getter */
        public final int getRetryCount() {
            return this.retryCount;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType getErrorType() {
            return this.errorType;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState.Error copy$default(com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState.Error error, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                str = error.errorCode;
            }
            if ((i2 & 2) != 0) {
                str2 = error.errorMessage;
            }
            if ((i2 & 4) != 0) {
                debitErrorType = error.errorType;
            }
            if ((i2 & 8) != 0) {
                i = error.retryCount;
            }
            return error.copy(str, str2, debitErrorType, i);
        }
    }

    public /* synthetic */ DebitCardApplyAndCreateUiState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
