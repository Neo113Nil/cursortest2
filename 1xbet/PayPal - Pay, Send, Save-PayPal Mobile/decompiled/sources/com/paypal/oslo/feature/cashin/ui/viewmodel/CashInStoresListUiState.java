package com.paypal.oslo.feature.cashin.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/feature/cashin/ui/viewmodel/CashInStoresListUiState;", "", "<init>", "()V", "Loading", "Error", "Success", "Lcom/paypal/oslo/feature/cashin/ui/viewmodel/CashInStoresListUiState$Error;", "Lcom/paypal/oslo/feature/cashin/ui/viewmodel/CashInStoresListUiState$Loading;", "Lcom/paypal/oslo/feature/cashin/ui/viewmodel/CashInStoresListUiState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class CashInStoresListUiState {
    public static final int $stable = 0;

    private CashInStoresListUiState() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cashin/ui/viewmodel/CashInStoresListUiState$Loading;", "Lcom/paypal/oslo/feature/cashin/ui/viewmodel/CashInStoresListUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListUiState.Loading INSTANCE = new com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListUiState.Loading();

        public final int hashCode() {
            return -1623747676;
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
            if (!(other instanceof com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListUiState.Loading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/cashin/ui/viewmodel/CashInStoresListUiState$Error;", "Lcom/paypal/oslo/feature/cashin/ui/viewmodel/CashInStoresListUiState;", "", "message", "", "attemptNumber", "<init>", "(Ljava/lang/String;I)V", "component1", "()Ljava/lang/String;", "component2", "()I", "copy", "(Ljava/lang/String;I)Lcom/paypal/oslo/feature/cashin/ui/viewmodel/CashInStoresListUiState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getMessage", com.visa.cbp.getEncExpo.warmup, "getAttemptNumber"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListUiState {
        public static final int $stable = 0;
        private final int attemptNumber;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(java.lang.String str, int i) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
            this.attemptNumber = i;
        }

        public /* synthetic */ Error(java.lang.String str, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i2 & 2) != 0 ? 0 : i);
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final int getAttemptNumber() {
            return this.attemptNumber;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            int i = this.attemptNumber;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(message=");
            sb.append(str);
            sb.append(", attemptNumber=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.message.hashCode() * 31) + java.lang.Integer.hashCode(this.attemptNumber);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListUiState.Error)) {
                return false;
            }
            com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListUiState.Error error = (com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListUiState.Error) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.message, error.message) && this.attemptNumber == error.attemptNumber;
        }

        public final com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListUiState.Error copy(java.lang.String message, int attemptNumber) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListUiState.Error(message, attemptNumber);
        }

        /* renamed from: component2, reason: from getter */
        public final int getAttemptNumber() {
            return this.attemptNumber;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListUiState.Error copy$default(com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListUiState.Error error, java.lang.String str, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                str = error.message;
            }
            if ((i2 & 2) != 0) {
                i = error.attemptNumber;
            }
            return error.copy(str, i);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ0\u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\tR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001a\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/cashin/ui/viewmodel/CashInStoresListUiState$Success;", "Lcom/paypal/oslo/feature/cashin/ui/viewmodel/CashInStoresListUiState;", "", "Lcom/paypal/oslo/feature/cashin/ui/viewmodel/CashInStoreUiModel;", "featuredStores", "otherStores", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Lcom/paypal/oslo/feature/cashin/ui/viewmodel/CashInStoresListUiState$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getFeaturedStores", "getOtherStores"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListUiState {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoreUiModel> featuredStores;
        private final java.util.List<com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoreUiModel> otherStores;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(java.util.List<com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoreUiModel> list, java.util.List<com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoreUiModel> list2) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            this.featuredStores = list;
            this.otherStores = list2;
        }

        public final java.util.List<com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoreUiModel> getFeaturedStores() {
            return this.featuredStores;
        }

        public final java.util.List<com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoreUiModel> getOtherStores() {
            return this.otherStores;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoreUiModel> list = this.featuredStores;
            java.util.List<com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoreUiModel> list2 = this.otherStores;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(featuredStores=");
            sb.append(list);
            sb.append(", otherStores=");
            sb.append(list2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.featuredStores.hashCode() * 31) + this.otherStores.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListUiState.Success)) {
                return false;
            }
            com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListUiState.Success success = (com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListUiState.Success) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.featuredStores, success.featuredStores) && kotlin.jvm.internal.Intrinsics.areEqual(this.otherStores, success.otherStores);
        }

        public final com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListUiState.Success copy(java.util.List<com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoreUiModel> featuredStores, java.util.List<com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoreUiModel> otherStores) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featuredStores, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(otherStores, "");
            return new com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListUiState.Success(featuredStores, otherStores);
        }

        public final java.util.List<com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoreUiModel> component2() {
            return this.otherStores;
        }

        public final java.util.List<com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoreUiModel> component1() {
            return this.featuredStores;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListUiState.Success copy$default(com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListUiState.Success success, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = success.featuredStores;
            }
            if ((i & 2) != 0) {
                list2 = success.otherStores;
            }
            return success.copy(list, list2);
        }
    }

    public /* synthetic */ CashInStoresListUiState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
