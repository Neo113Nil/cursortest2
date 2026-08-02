package com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0001\nB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0001\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/changeCancelModel/ChangeCancelUiState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Success", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/changeCancelModel/ChangeCancelUiState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class ChangeCancelUiState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    private ChangeCancelUiState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0003\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0004\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/changeCancelModel/ChangeCancelUiState$Success;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/changeCancelModel/ChangeCancelUiState;", "", "isPrimaryButtonLoading", "isError", "<init>", "(ZZ)V", "component1", "()Z", "component2", "copy", "(ZZ)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/changeCancelModel/ChangeCancelUiState$Success;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelUiState {
        public static final int $stable = 0;
        private final boolean isError;
        private final boolean isPrimaryButtonLoading;

        public Success(boolean z, boolean z2) {
            super("Success", null);
            this.isPrimaryButtonLoading = z;
            this.isError = z2;
        }

        public /* synthetic */ Success(boolean z, boolean z2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
        }

        public final boolean isPrimaryButtonLoading() {
            return this.isPrimaryButtonLoading;
        }

        public final boolean isError() {
            return this.isError;
        }

        public final java.lang.String toString() {
            boolean z = this.isPrimaryButtonLoading;
            boolean z2 = this.isError;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(isPrimaryButtonLoading=");
            sb.append(z);
            sb.append(", isError=");
            sb.append(z2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Boolean.hashCode(this.isPrimaryButtonLoading) * 31) + java.lang.Boolean.hashCode(this.isError);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelUiState.Success)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelUiState.Success success = (com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelUiState.Success) other;
            return this.isPrimaryButtonLoading == success.isPrimaryButtonLoading && this.isError == success.isError;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelUiState.Success copy(boolean isPrimaryButtonLoading, boolean isError) {
            return new com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelUiState.Success(isPrimaryButtonLoading, isError);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsError() {
            return this.isError;
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsPrimaryButtonLoading() {
            return this.isPrimaryButtonLoading;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelUiState.Success copy$default(com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelUiState.Success success, boolean z, boolean z2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = success.isPrimaryButtonLoading;
            }
            if ((i & 2) != 0) {
                z2 = success.isError;
            }
            return success.copy(z, z2);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Success() {
            this(r2, r2, 3, null);
            boolean z = false;
        }
    }

    public /* synthetic */ ChangeCancelUiState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
