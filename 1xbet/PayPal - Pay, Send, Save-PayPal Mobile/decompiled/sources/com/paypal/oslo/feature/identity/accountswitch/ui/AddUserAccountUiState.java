package com.paypal.oslo.feature.identity.accountswitch.ui;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/accountswitch/ui/AddUserAccountUiState;", "", "<init>", "()V", "Loading", "Success", "Lcom/paypal/oslo/feature/identity/accountswitch/ui/AddUserAccountUiState$Loading;", "Lcom/paypal/oslo/feature/identity/accountswitch/ui/AddUserAccountUiState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class AddUserAccountUiState {
    public static final int $stable = 0;

    private AddUserAccountUiState() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/accountswitch/ui/AddUserAccountUiState$Loading;", "Lcom/paypal/oslo/feature/identity/accountswitch/ui/AddUserAccountUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountUiState.Loading INSTANCE = new com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountUiState.Loading();

        public final int hashCode() {
            return 338789468;
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
            if (!(other instanceof com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountUiState.Loading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/identity/accountswitch/ui/AddUserAccountUiState$Success;", "Lcom/paypal/oslo/feature/identity/accountswitch/ui/AddUserAccountUiState;", "", "Lcom/paypal/oslo/feature/identity/accountswitch/domain/model/AddUserAccountOption;", "options", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/identity/accountswitch/ui/AddUserAccountUiState$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getOptions"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountUiState {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.identity.accountswitch.domain.model.AddUserAccountOption> options;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(java.util.List<com.paypal.oslo.feature.identity.accountswitch.domain.model.AddUserAccountOption> list) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.options = list;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.accountswitch.domain.model.AddUserAccountOption> getOptions() {
            return this.options;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.identity.accountswitch.domain.model.AddUserAccountOption> list = this.options;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(options=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.options.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountUiState.Success) && kotlin.jvm.internal.Intrinsics.areEqual(this.options, ((com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountUiState.Success) other).options);
        }

        public final com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountUiState.Success copy(java.util.List<com.paypal.oslo.feature.identity.accountswitch.domain.model.AddUserAccountOption> options) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "");
            return new com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountUiState.Success(options);
        }

        public final java.util.List<com.paypal.oslo.feature.identity.accountswitch.domain.model.AddUserAccountOption> component1() {
            return this.options;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountUiState.Success copy$default(com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountUiState.Success success, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = success.options;
            }
            return success.copy(list);
        }
    }

    public /* synthetic */ AddUserAccountUiState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
