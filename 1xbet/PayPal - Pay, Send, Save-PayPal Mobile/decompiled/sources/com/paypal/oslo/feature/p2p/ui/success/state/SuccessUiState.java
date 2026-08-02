package com.paypal.oslo.feature.p2p.ui.success.state;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\r\u000e\u000f"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/success/state/SuccessUiState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Loading", "Error", "Success", "Lcom/paypal/oslo/feature/p2p/ui/success/state/SuccessUiState$Error;", "Lcom/paypal/oslo/feature/p2p/ui/success/state/SuccessUiState$Loading;", "Lcom/paypal/oslo/feature/p2p/ui/success/state/SuccessUiState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class SuccessUiState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    private SuccessUiState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/success/state/SuccessUiState$Loading;", "Lcom/paypal/oslo/feature/p2p/ui/success/state/SuccessUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.p2p.ui.success.state.SuccessUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.success.state.SuccessUiState.Loading INSTANCE = new com.paypal.oslo.feature.p2p.ui.success.state.SuccessUiState.Loading();

        public final int hashCode() {
            return -967649927;
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
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.success.state.SuccessUiState.Loading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/success/state/SuccessUiState$Error;", "Lcom/paypal/oslo/feature/p2p/ui/success/state/SuccessUiState;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/ui/success/state/SuccessUiState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.p2p.ui.success.state.SuccessUiState {
        public static final int $stable = 0;
        private final java.lang.String message;

        public Error(java.lang.String str) {
            super("Error", null);
            this.message = str;
        }

        public /* synthetic */ Error(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
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
            java.lang.String str = this.message;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.success.state.SuccessUiState.Error) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.p2p.ui.success.state.SuccessUiState.Error) other).message);
        }

        public final com.paypal.oslo.feature.p2p.ui.success.state.SuccessUiState.Error copy(java.lang.String message) {
            return new com.paypal.oslo.feature.p2p.ui.success.state.SuccessUiState.Error(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.success.state.SuccessUiState.Error copy$default(com.paypal.oslo.feature.p2p.ui.success.state.SuccessUiState.Error error, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = error.message;
            }
            return error.copy(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Error() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/success/state/SuccessUiState$Success;", "Lcom/paypal/oslo/feature/p2p/ui/success/state/SuccessUiState;", "Lcom/paypal/oslo/feature/p2p/ui/success/state/SuccessState;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Lcom/paypal/oslo/feature/p2p/ui/success/state/SuccessState;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/ui/success/state/SuccessState;", "copy", "(Lcom/paypal/oslo/feature/p2p/ui/success/state/SuccessState;)Lcom/paypal/oslo/feature/p2p/ui/success/state/SuccessUiState$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/ui/success/state/SuccessState;", "getData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.p2p.ui.success.state.SuccessUiState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.p2p.ui.success.state.SuccessState data;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(com.paypal.oslo.feature.p2p.ui.success.state.SuccessState successState) {
            super("Success", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(successState, "");
            this.data = successState;
        }

        public final com.paypal.oslo.feature.p2p.ui.success.state.SuccessState getData() {
            return this.data;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.ui.success.state.SuccessState successState = this.data;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(data=");
            sb.append(successState);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.data.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.success.state.SuccessUiState.Success) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, ((com.paypal.oslo.feature.p2p.ui.success.state.SuccessUiState.Success) other).data);
        }

        public final com.paypal.oslo.feature.p2p.ui.success.state.SuccessUiState.Success copy(com.paypal.oslo.feature.p2p.ui.success.state.SuccessState data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            return new com.paypal.oslo.feature.p2p.ui.success.state.SuccessUiState.Success(data);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.ui.success.state.SuccessState getData() {
            return this.data;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.success.state.SuccessUiState.Success copy$default(com.paypal.oslo.feature.p2p.ui.success.state.SuccessUiState.Success success, com.paypal.oslo.feature.p2p.ui.success.state.SuccessState successState, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                successState = success.data;
            }
            return success.copy(successState);
        }
    }

    public /* synthetic */ SuccessUiState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
