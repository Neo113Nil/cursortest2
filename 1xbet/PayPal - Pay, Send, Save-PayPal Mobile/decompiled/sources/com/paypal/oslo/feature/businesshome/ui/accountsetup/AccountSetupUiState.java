package com.paypal.oslo.feature.businesshome.ui.accountsetup;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/ui/accountsetup/AccountSetupUiState;", "", "<init>", "()V", "Loading", "Success", "Error", "Lcom/paypal/oslo/feature/businesshome/ui/accountsetup/AccountSetupUiState$Error;", "Lcom/paypal/oslo/feature/businesshome/ui/accountsetup/AccountSetupUiState$Loading;", "Lcom/paypal/oslo/feature/businesshome/ui/accountsetup/AccountSetupUiState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class AccountSetupUiState {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/ui/accountsetup/AccountSetupUiState$Loading;", "Lcom/paypal/oslo/feature/businesshome/ui/accountsetup/AccountSetupUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupUiState.Loading INSTANCE = new com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupUiState.Loading();

        public final int hashCode() {
            return -72458759;
        }

        private Loading() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Loading";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupUiState.Loading)) {
                return false;
            }
            return true;
        }
    }

    private AccountSetupUiState() {
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b\u0005\u0010\u000eR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/ui/accountsetup/AccountSetupUiState$Success;", "Lcom/paypal/oslo/feature/businesshome/ui/accountsetup/AccountSetupUiState;", "Lcom/paypal/oslo/feature/businesshome/ui/home/AccountSetupUiData;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "isPayAndGetPaidAccessGranted", "", "Lcom/paypal/oslo/feature/businesshome/ui/home/AccountSetupUiData$Step;", "payAndGetPaidSteps", "<init>", "(Lcom/paypal/oslo/feature/businesshome/ui/home/AccountSetupUiData;ZLjava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/businesshome/ui/home/AccountSetupUiData;", "component2", "()Z", "component3", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/feature/businesshome/ui/home/AccountSetupUiData;ZLjava/util/List;)Lcom/paypal/oslo/feature/businesshome/ui/accountsetup/AccountSetupUiState$Success;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/businesshome/ui/home/AccountSetupUiData;", "getData", "Z", "Ljava/util/List;", "getPayAndGetPaidSteps"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupUiState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData data;
        private final boolean isPayAndGetPaidAccessGranted;
        private final java.util.List<com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData.Step> payAndGetPaidSteps;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData accountSetupUiData, boolean z, java.util.List<com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData.Step> list) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountSetupUiData, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.data = accountSetupUiData;
            this.isPayAndGetPaidAccessGranted = z;
            this.payAndGetPaidSteps = list;
        }

        public final com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData getData() {
            return this.data;
        }

        public final boolean isPayAndGetPaidAccessGranted() {
            return this.isPayAndGetPaidAccessGranted;
        }

        public final java.util.List<com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData.Step> getPayAndGetPaidSteps() {
            return this.payAndGetPaidSteps;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData accountSetupUiData = this.data;
            boolean z = this.isPayAndGetPaidAccessGranted;
            java.util.List<com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData.Step> list = this.payAndGetPaidSteps;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(data=");
            sb.append(accountSetupUiData);
            sb.append(", isPayAndGetPaidAccessGranted=");
            sb.append(z);
            sb.append(", payAndGetPaidSteps=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.data.hashCode() * 31) + java.lang.Boolean.hashCode(this.isPayAndGetPaidAccessGranted)) * 31) + this.payAndGetPaidSteps.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupUiState.Success)) {
                return false;
            }
            com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupUiState.Success success = (com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupUiState.Success) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.data, success.data) && this.isPayAndGetPaidAccessGranted == success.isPayAndGetPaidAccessGranted && kotlin.jvm.internal.Intrinsics.areEqual(this.payAndGetPaidSteps, success.payAndGetPaidSteps);
        }

        public final com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupUiState.Success copy(com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData data, boolean isPayAndGetPaidAccessGranted, java.util.List<com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData.Step> payAndGetPaidSteps) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payAndGetPaidSteps, "");
            return new com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupUiState.Success(data, isPayAndGetPaidAccessGranted, payAndGetPaidSteps);
        }

        public final java.util.List<com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData.Step> component3() {
            return this.payAndGetPaidSteps;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsPayAndGetPaidAccessGranted() {
            return this.isPayAndGetPaidAccessGranted;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData getData() {
            return this.data;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupUiState.Success copy$default(com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupUiState.Success success, com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData accountSetupUiData, boolean z, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                accountSetupUiData = success.data;
            }
            if ((i & 2) != 0) {
                z = success.isPayAndGetPaidAccessGranted;
            }
            if ((i & 4) != 0) {
                list = success.payAndGetPaidSteps;
            }
            return success.copy(accountSetupUiData, z, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/ui/accountsetup/AccountSetupUiState$Error;", "Lcom/paypal/oslo/feature/businesshome/ui/accountsetup/AccountSetupUiState;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/businesshome/ui/accountsetup/AccountSetupUiState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupUiState {
        public static final int $stable = 0;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupUiState.Error) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupUiState.Error) other).message);
        }

        public final com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupUiState.Error copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupUiState.Error(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupUiState.Error copy$default(com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupUiState.Error error, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = error.message;
            }
            return error.copy(str);
        }
    }

    public /* synthetic */ AccountSetupUiState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
