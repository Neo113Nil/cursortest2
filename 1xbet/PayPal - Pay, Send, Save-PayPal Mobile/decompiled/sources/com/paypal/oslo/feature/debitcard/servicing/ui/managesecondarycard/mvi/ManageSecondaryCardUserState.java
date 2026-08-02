package com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managesecondarycard/mvi/ManageSecondaryCardUserState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Initial", "Loading", "Success", "Error", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managesecondarycard/mvi/ManageSecondaryCardUserState$Error;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managesecondarycard/mvi/ManageSecondaryCardUserState$Initial;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managesecondarycard/mvi/ManageSecondaryCardUserState$Loading;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managesecondarycard/mvi/ManageSecondaryCardUserState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class ManageSecondaryCardUserState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    private ManageSecondaryCardUserState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managesecondarycard/mvi/ManageSecondaryCardUserState$Initial;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managesecondarycard/mvi/ManageSecondaryCardUserState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initial extends com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState.Initial INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState.Initial();

        public final int hashCode() {
            return -1721717611;
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
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState.Initial)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managesecondarycard/mvi/ManageSecondaryCardUserState$Loading;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managesecondarycard/mvi/ManageSecondaryCardUserState;", "", "retryCount", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managesecondarycard/mvi/ManageSecondaryCardUserState$Loading;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getRetryCount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState {
        public static final int $stable = 0;
        private final int retryCount;

        public Loading(int i) {
            super("Loading", null);
            this.retryCount = i;
        }

        public /* synthetic */ Loading(int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i);
        }

        public final int getRetryCount() {
            return this.retryCount;
        }

        public final java.lang.String toString() {
            int i = this.retryCount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Loading(retryCount=");
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
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState.Loading) && this.retryCount == ((com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState.Loading) other).retryCount;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState.Loading copy(int retryCount) {
            return new com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState.Loading(retryCount);
        }

        /* renamed from: component1, reason: from getter */
        public final int getRetryCount() {
            return this.retryCount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState.Loading copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState.Loading loading, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = loading.retryCount;
            }
            return loading.copy(i);
        }

        public Loading() {
            this(0, 1, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b$\u0010%Jp\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011HÆ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020\u00062\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b,\u0010#J\u0010\u0010.\u001a\u00020-HÖ\u0001¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b\u0007\u0010\u001aR\u001a\u0010\b\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b\b\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b6\u0010\u001dR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00107\u001a\u0004\b8\u0010\u001fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00109\u001a\u0004\b:\u0010!R\u001a\u0010\u0010\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010;\u001a\u0004\b<\u0010#R\u001a\u0010\u0012\u001a\u00020\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010=\u001a\u0004\b>\u0010%"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managesecondarycard/mvi/ManageSecondaryCardUserState$Success;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managesecondarycard/mvi/ManageSecondaryCardUserState;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;", "debitInstrument", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "", "isOperationInProgress", "isOperationErrorVisible", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "operationErrorType", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/ErrorInfo;", "operationErrorInfo", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementOperationRetryType;", "operationRetryType", "", "retryCount", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/LoadCardDetailsContext$PostLoadAction;", "postLoadAction", "<init>", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;ZZLcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/ErrorInfo;Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementOperationRetryType;ILcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/LoadCardDetailsContext$PostLoadAction;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;", "component2", "()Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "component3", "()Z", "component4", "component5", "()Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "component6", "()Lcom/paypal/oslo/feature/debitcard/shared/domain/model/ErrorInfo;", "component7", "()Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementOperationRetryType;", "component8", "()I", "component9", "()Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/LoadCardDetailsContext$PostLoadAction;", "copy", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;ZZLcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/ErrorInfo;Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementOperationRetryType;ILcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/LoadCardDetailsContext$PostLoadAction;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managesecondarycard/mvi/ManageSecondaryCardUserState$Success;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;", "getDebitInstrument", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "getProductName", "Z", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "getOperationErrorType", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/ErrorInfo;", "getOperationErrorInfo", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementOperationRetryType;", "getOperationRetryType", com.visa.cbp.getEncExpo.warmup, "getRetryCount", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/LoadCardDetailsContext$PostLoadAction;", "getPostLoadAction"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument;
        private final boolean isOperationErrorVisible;
        private final boolean isOperationInProgress;
        private final com.paypal.oslo.feature.debitcard.shared.domain.model.ErrorInfo operationErrorInfo;
        private final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType operationErrorType;
        private final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementOperationRetryType operationRetryType;
        private final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction postLoadAction;
        private final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName;
        private final int retryCount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, boolean z, boolean z2, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, com.paypal.oslo.feature.debitcard.shared.domain.model.ErrorInfo errorInfo, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementOperationRetryType debitCardManagementOperationRetryType, int i, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction postLoadAction) {
            super("Success", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrument, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardProductName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postLoadAction, "");
            this.debitInstrument = debitInstrument;
            this.productName = debitCardProductName;
            this.isOperationInProgress = z;
            this.isOperationErrorVisible = z2;
            this.operationErrorType = debitErrorType;
            this.operationErrorInfo = errorInfo;
            this.operationRetryType = debitCardManagementOperationRetryType;
            this.retryCount = i;
            this.postLoadAction = postLoadAction;
        }

        public final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument getDebitInstrument() {
            return this.debitInstrument;
        }

        public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
            return this.productName;
        }

        public final boolean isOperationInProgress() {
            return this.isOperationInProgress;
        }

        public final boolean isOperationErrorVisible() {
            return this.isOperationErrorVisible;
        }

        public final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType getOperationErrorType() {
            return this.operationErrorType;
        }

        public final com.paypal.oslo.feature.debitcard.shared.domain.model.ErrorInfo getOperationErrorInfo() {
            return this.operationErrorInfo;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementOperationRetryType getOperationRetryType() {
            return this.operationRetryType;
        }

        public final int getRetryCount() {
            return this.retryCount;
        }

        public /* synthetic */ Success(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, boolean z, boolean z2, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, com.paypal.oslo.feature.debitcard.shared.domain.model.ErrorInfo errorInfo, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementOperationRetryType debitCardManagementOperationRetryType, int i, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction postLoadAction, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(debitInstrument, debitCardProductName, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? false : z2, (i2 & 16) != 0 ? null : debitErrorType, (i2 & 32) != 0 ? null : errorInfo, (i2 & 64) != 0 ? null : debitCardManagementOperationRetryType, (i2 & 128) != 0 ? 0 : i, (i2 & 256) != 0 ? com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction.None.INSTANCE : postLoadAction);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction getPostLoadAction() {
            return this.postLoadAction;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument = this.debitInstrument;
            com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName = this.productName;
            boolean z = this.isOperationInProgress;
            boolean z2 = this.isOperationErrorVisible;
            com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType = this.operationErrorType;
            com.paypal.oslo.feature.debitcard.shared.domain.model.ErrorInfo errorInfo = this.operationErrorInfo;
            com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementOperationRetryType debitCardManagementOperationRetryType = this.operationRetryType;
            int i = this.retryCount;
            com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction postLoadAction = this.postLoadAction;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(debitInstrument=");
            sb.append(debitInstrument);
            sb.append(", productName=");
            sb.append(debitCardProductName);
            sb.append(", isOperationInProgress=");
            sb.append(z);
            sb.append(", isOperationErrorVisible=");
            sb.append(z2);
            sb.append(", operationErrorType=");
            sb.append(debitErrorType);
            sb.append(", operationErrorInfo=");
            sb.append(errorInfo);
            sb.append(", operationRetryType=");
            sb.append(debitCardManagementOperationRetryType);
            sb.append(", retryCount=");
            sb.append(i);
            sb.append(", postLoadAction=");
            sb.append(postLoadAction);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.debitInstrument.hashCode();
            int hashCode2 = this.productName.hashCode();
            int hashCode3 = java.lang.Boolean.hashCode(this.isOperationInProgress);
            int hashCode4 = java.lang.Boolean.hashCode(this.isOperationErrorVisible);
            com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType = this.operationErrorType;
            int hashCode5 = debitErrorType == null ? 0 : debitErrorType.hashCode();
            com.paypal.oslo.feature.debitcard.shared.domain.model.ErrorInfo errorInfo = this.operationErrorInfo;
            int hashCode6 = errorInfo == null ? 0 : errorInfo.hashCode();
            com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementOperationRetryType debitCardManagementOperationRetryType = this.operationRetryType;
            return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (debitCardManagementOperationRetryType != null ? debitCardManagementOperationRetryType.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.retryCount)) * 31) + this.postLoadAction.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState.Success)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState.Success success = (com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState.Success) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.debitInstrument, success.debitInstrument) && this.productName == success.productName && this.isOperationInProgress == success.isOperationInProgress && this.isOperationErrorVisible == success.isOperationErrorVisible && this.operationErrorType == success.operationErrorType && kotlin.jvm.internal.Intrinsics.areEqual(this.operationErrorInfo, success.operationErrorInfo) && this.operationRetryType == success.operationRetryType && this.retryCount == success.retryCount && kotlin.jvm.internal.Intrinsics.areEqual(this.postLoadAction, success.postLoadAction);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState.Success copy(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName, boolean isOperationInProgress, boolean isOperationErrorVisible, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType operationErrorType, com.paypal.oslo.feature.debitcard.shared.domain.model.ErrorInfo operationErrorInfo, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementOperationRetryType operationRetryType, int retryCount, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction postLoadAction) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrument, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postLoadAction, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState.Success(debitInstrument, productName, isOperationInProgress, isOperationErrorVisible, operationErrorType, operationErrorInfo, operationRetryType, retryCount, postLoadAction);
        }

        /* renamed from: component9, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction getPostLoadAction() {
            return this.postLoadAction;
        }

        /* renamed from: component8, reason: from getter */
        public final int getRetryCount() {
            return this.retryCount;
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementOperationRetryType getOperationRetryType() {
            return this.operationRetryType;
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.shared.domain.model.ErrorInfo getOperationErrorInfo() {
            return this.operationErrorInfo;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType getOperationErrorType() {
            return this.operationErrorType;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsOperationErrorVisible() {
            return this.isOperationErrorVisible;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsOperationInProgress() {
            return this.isOperationInProgress;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
            return this.productName;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument getDebitInstrument() {
            return this.debitInstrument;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\rJ\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managesecondarycard/mvi/ManageSecondaryCardUserState$Error;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managesecondarycard/mvi/ManageSecondaryCardUserState;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "errorType", "", "retryCount", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/ErrorInfo;", "errorInfo", "<init>", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;ILcom/paypal/oslo/feature/debitcard/shared/domain/model/ErrorInfo;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "component2", "()I", "component3", "()Lcom/paypal/oslo/feature/debitcard/shared/domain/model/ErrorInfo;", "copy", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;ILcom/paypal/oslo/feature/debitcard/shared/domain/model/ErrorInfo;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managesecondarycard/mvi/ManageSecondaryCardUserState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "getErrorType", com.visa.cbp.getEncExpo.warmup, "getRetryCount", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/ErrorInfo;", "getErrorInfo"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState {
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
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState.Error)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState.Error error = (com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState.Error) other;
            return this.errorType == error.errorType && this.retryCount == error.retryCount && kotlin.jvm.internal.Intrinsics.areEqual(this.errorInfo, error.errorInfo);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState.Error copy(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType, int retryCount, com.paypal.oslo.feature.debitcard.shared.domain.model.ErrorInfo errorInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorInfo, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState.Error(errorType, retryCount, errorInfo);
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

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState.Error copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState.Error error, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, int i, com.paypal.oslo.feature.debitcard.shared.domain.model.ErrorInfo errorInfo, int i2, java.lang.Object obj) {
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

    public /* synthetic */ ManageSecondaryCardUserState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
