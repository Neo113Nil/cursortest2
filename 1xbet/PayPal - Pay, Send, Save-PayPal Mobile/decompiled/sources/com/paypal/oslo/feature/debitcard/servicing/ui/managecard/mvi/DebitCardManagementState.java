package com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0004\u001a\u001b\u001c\u001dB7\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0015\u0010\u000fR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\u0082\u0001\u0004\u001e\u001f !"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "p1", "p2", "", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;", "p3", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Ljava/lang/String;Ljava/util/List;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "getProductName", "()Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "cardId", "getCardId", "cachedInstruments", "Ljava/util/List;", "getCachedInstruments", "()Ljava/util/List;", "Initial", "Loading", "Success", "Error", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementState$Error;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementState$Initial;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementState$Loading;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class DebitCardManagementState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument> cachedInstruments;
    private final java.lang.String cardId;
    private final java.lang.String name;
    private final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName;

    private DebitCardManagementState(java.lang.String str, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str2, java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument> list) {
        this.name = str;
        this.productName = debitCardProductName;
        this.cardId = str2;
        this.cachedInstruments = list;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    public /* synthetic */ DebitCardManagementState(java.lang.String str, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str2, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.UNKNOWN : debitCardProductName, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, null);
    }

    public com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
        return this.productName;
    }

    public java.lang.String getCardId() {
        return this.cardId;
    }

    public java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument> getCachedInstruments() {
        return this.cachedInstruments;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementState$Initial;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementState;", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "<init>", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "copy", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementState$Initial;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "getProductName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initial extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Initial(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName) {
            super("Initial", debitCardProductName, null, null, 12, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardProductName, "");
            this.productName = debitCardProductName;
        }

        public /* synthetic */ Initial(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.UNKNOWN : debitCardProductName);
        }

        @Override // com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState
        public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
            return this.productName;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName = this.productName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Initial(productName=");
            sb.append(debitCardProductName);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.productName.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState.Initial) && this.productName == ((com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState.Initial) other).productName;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState.Initial copy(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productName, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState.Initial(productName);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
            return this.productName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState.Initial copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState.Initial initial, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitCardProductName = initial.productName;
            }
            return initial.copy(debitCardProductName);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Initial() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J@\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0014J\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u0010R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0012R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementState$Loading;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementState;", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "", "cardId", "", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;", "cachedInstruments", "", "retryCount", "<init>", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Ljava/lang/String;Ljava/util/List;I)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/List;", "component4", "()I", "copy", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Ljava/lang/String;Ljava/util/List;I)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementState$Loading;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "getProductName", "Ljava/lang/String;", "getCardId", "Ljava/util/List;", "getCachedInstruments", com.visa.cbp.getEncExpo.warmup, "getRetryCount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument> cachedInstruments;
        private final java.lang.String cardId;
        private final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName;
        private final int retryCount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loading(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str, java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument> list, int i) {
            super("Loading", debitCardProductName, str, list, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardProductName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.productName = debitCardProductName;
            this.cardId = str;
            this.cachedInstruments = list;
            this.retryCount = i;
        }

        public /* synthetic */ Loading(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str, java.util.List list, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.UNKNOWN : debitCardProductName, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i2 & 8) != 0 ? 0 : i);
        }

        @Override // com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState
        public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
            return this.productName;
        }

        @Override // com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState
        public final java.lang.String getCardId() {
            return this.cardId;
        }

        @Override // com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState
        public final java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument> getCachedInstruments() {
            return this.cachedInstruments;
        }

        public final int getRetryCount() {
            return this.retryCount;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName = this.productName;
            java.lang.String str = this.cardId;
            java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument> list = this.cachedInstruments;
            int i = this.retryCount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Loading(productName=");
            sb.append(debitCardProductName);
            sb.append(", cardId=");
            sb.append(str);
            sb.append(", cachedInstruments=");
            sb.append(list);
            sb.append(", retryCount=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.productName.hashCode();
            java.lang.String str = this.cardId;
            return (((((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.cachedInstruments.hashCode()) * 31) + java.lang.Integer.hashCode(this.retryCount);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState.Loading)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState.Loading loading = (com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState.Loading) other;
            return this.productName == loading.productName && kotlin.jvm.internal.Intrinsics.areEqual(this.cardId, loading.cardId) && kotlin.jvm.internal.Intrinsics.areEqual(this.cachedInstruments, loading.cachedInstruments) && this.retryCount == loading.retryCount;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState.Loading copy(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName, java.lang.String cardId, java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument> cachedInstruments, int retryCount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cachedInstruments, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState.Loading(productName, cardId, cachedInstruments, retryCount);
        }

        /* renamed from: component4, reason: from getter */
        public final int getRetryCount() {
            return this.retryCount;
        }

        public final java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument> component3() {
            return this.cachedInstruments;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCardId() {
            return this.cardId;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
            return this.productName;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState.Loading copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState.Loading loading, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str, java.util.List list, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                debitCardProductName = loading.productName;
            }
            if ((i2 & 2) != 0) {
                str = loading.cardId;
            }
            if ((i2 & 4) != 0) {
                list = loading.cachedInstruments;
            }
            if ((i2 & 8) != 0) {
                i = loading.retryCount;
            }
            return loading.copy(debitCardProductName, str, list, i);
        }

        public Loading() {
            this(null, null, null, 0, 15, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001B{\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0012\u0010$\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0086\u0001\u0010*\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014HÆ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020\r2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b0\u0010)J\u0010\u00101\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b1\u0010\u001fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b3\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00104\u001a\u0004\b5\u0010\u001bR\u001a\u0010\b\u001a\u00020\u00078\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\b\u00106\u001a\u0004\b7\u0010\u001dR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\n\u00108\u001a\u0004\b9\u0010\u001fR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b:\u0010\u0019R\u001a\u0010\u000e\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010;\u001a\u0004\b\u000e\u0010\"R\u001a\u0010\u000f\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010;\u001a\u0004\b\u000f\u0010\"R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010<\u001a\u0004\b=\u0010%R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010>\u001a\u0004\b?\u0010'R\u001a\u0010\u0015\u001a\u00020\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010@\u001a\u0004\bA\u0010)"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementState$Success;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementState;", "", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/model/DebitCardManagementSection;", "operationSections", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/cardoperations/model/CardConnectEligibilityState;", "cardConnectEligibilityState", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "", "cardId", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;", "cachedInstruments", "", "isOperationInProgress", "isOperationErrorVisible", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "operationErrorType", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementOperationRetryType;", "operationRetryType", "", "retryCount", "<init>", "(Ljava/util/List;Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/cardoperations/model/CardConnectEligibilityState;Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Ljava/lang/String;Ljava/util/List;ZZLcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementOperationRetryType;I)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/cardoperations/model/CardConnectEligibilityState;", "component3", "()Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "component4", "()Ljava/lang/String;", "component5", "component6", "()Z", "component7", "component8", "()Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "component9", "()Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementOperationRetryType;", "component10", "()I", "copy", "(Ljava/util/List;Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/cardoperations/model/CardConnectEligibilityState;Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Ljava/lang/String;Ljava/util/List;ZZLcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementOperationRetryType;I)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementState$Success;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/util/List;", "getOperationSections", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/cardoperations/model/CardConnectEligibilityState;", "getCardConnectEligibilityState", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "getProductName", "Ljava/lang/String;", "getCardId", "getCachedInstruments", "Z", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "getOperationErrorType", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementOperationRetryType;", "getOperationRetryType", com.visa.cbp.getEncExpo.warmup, "getRetryCount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument> cachedInstruments;
        private final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardConnectEligibilityState cardConnectEligibilityState;
        private final java.lang.String cardId;
        private final boolean isOperationErrorVisible;
        private final boolean isOperationInProgress;
        private final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType operationErrorType;
        private final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementOperationRetryType operationRetryType;
        private final java.util.List<com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection> operationSections;
        private final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName;
        private final int retryCount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Success(java.util.List<? extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection> list, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardConnectEligibilityState cardConnectEligibilityState, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str, java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument> list2, boolean z, boolean z2, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementOperationRetryType debitCardManagementOperationRetryType, int i) {
            super("Success", debitCardProductName, str, list2, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardConnectEligibilityState, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardProductName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            this.operationSections = list;
            this.cardConnectEligibilityState = cardConnectEligibilityState;
            this.productName = debitCardProductName;
            this.cardId = str;
            this.cachedInstruments = list2;
            this.isOperationInProgress = z;
            this.isOperationErrorVisible = z2;
            this.operationErrorType = debitErrorType;
            this.operationRetryType = debitCardManagementOperationRetryType;
            this.retryCount = i;
        }

        public final java.util.List<com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection> getOperationSections() {
            return this.operationSections;
        }

        public /* synthetic */ Success(java.util.List list, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardConnectEligibilityState cardConnectEligibilityState, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str, java.util.List list2, boolean z, boolean z2, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementOperationRetryType debitCardManagementOperationRetryType, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i2 & 2) != 0 ? com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardConnectEligibilityState.Loading.INSTANCE : cardConnectEligibilityState, (i2 & 4) != 0 ? com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.UNKNOWN : debitCardProductName, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? false : z2, (i2 & 128) != 0 ? null : debitErrorType, (i2 & 256) == 0 ? debitCardManagementOperationRetryType : null, (i2 & 512) == 0 ? i : 0);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardConnectEligibilityState getCardConnectEligibilityState() {
            return this.cardConnectEligibilityState;
        }

        @Override // com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState
        public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
            return this.productName;
        }

        @Override // com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState
        public final java.lang.String getCardId() {
            return this.cardId;
        }

        @Override // com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState
        public final java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument> getCachedInstruments() {
            return this.cachedInstruments;
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

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementOperationRetryType getOperationRetryType() {
            return this.operationRetryType;
        }

        public final int getRetryCount() {
            return this.retryCount;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection> list = this.operationSections;
            com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardConnectEligibilityState cardConnectEligibilityState = this.cardConnectEligibilityState;
            com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName = this.productName;
            java.lang.String str = this.cardId;
            java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument> list2 = this.cachedInstruments;
            boolean z = this.isOperationInProgress;
            boolean z2 = this.isOperationErrorVisible;
            com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType = this.operationErrorType;
            com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementOperationRetryType debitCardManagementOperationRetryType = this.operationRetryType;
            int i = this.retryCount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(operationSections=");
            sb.append(list);
            sb.append(", cardConnectEligibilityState=");
            sb.append(cardConnectEligibilityState);
            sb.append(", productName=");
            sb.append(debitCardProductName);
            sb.append(", cardId=");
            sb.append(str);
            sb.append(", cachedInstruments=");
            sb.append(list2);
            sb.append(", isOperationInProgress=");
            sb.append(z);
            sb.append(", isOperationErrorVisible=");
            sb.append(z2);
            sb.append(", operationErrorType=");
            sb.append(debitErrorType);
            sb.append(", operationRetryType=");
            sb.append(debitCardManagementOperationRetryType);
            sb.append(", retryCount=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.operationSections.hashCode();
            int hashCode2 = this.cardConnectEligibilityState.hashCode();
            int hashCode3 = this.productName.hashCode();
            java.lang.String str = this.cardId;
            int hashCode4 = str == null ? 0 : str.hashCode();
            int hashCode5 = this.cachedInstruments.hashCode();
            int hashCode6 = java.lang.Boolean.hashCode(this.isOperationInProgress);
            int hashCode7 = java.lang.Boolean.hashCode(this.isOperationErrorVisible);
            com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType = this.operationErrorType;
            int hashCode8 = debitErrorType == null ? 0 : debitErrorType.hashCode();
            com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementOperationRetryType debitCardManagementOperationRetryType = this.operationRetryType;
            return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + (debitCardManagementOperationRetryType != null ? debitCardManagementOperationRetryType.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.retryCount);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState.Success)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState.Success success = (com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState.Success) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.operationSections, success.operationSections) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardConnectEligibilityState, success.cardConnectEligibilityState) && this.productName == success.productName && kotlin.jvm.internal.Intrinsics.areEqual(this.cardId, success.cardId) && kotlin.jvm.internal.Intrinsics.areEqual(this.cachedInstruments, success.cachedInstruments) && this.isOperationInProgress == success.isOperationInProgress && this.isOperationErrorVisible == success.isOperationErrorVisible && this.operationErrorType == success.operationErrorType && this.operationRetryType == success.operationRetryType && this.retryCount == success.retryCount;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState.Success copy(java.util.List<? extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection> operationSections, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardConnectEligibilityState cardConnectEligibilityState, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName, java.lang.String cardId, java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument> cachedInstruments, boolean isOperationInProgress, boolean isOperationErrorVisible, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType operationErrorType, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementOperationRetryType operationRetryType, int retryCount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operationSections, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardConnectEligibilityState, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cachedInstruments, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState.Success(operationSections, cardConnectEligibilityState, productName, cardId, cachedInstruments, isOperationInProgress, isOperationErrorVisible, operationErrorType, operationRetryType, retryCount);
        }

        /* renamed from: component9, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementOperationRetryType getOperationRetryType() {
            return this.operationRetryType;
        }

        /* renamed from: component8, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType getOperationErrorType() {
            return this.operationErrorType;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getIsOperationErrorVisible() {
            return this.isOperationErrorVisible;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getIsOperationInProgress() {
            return this.isOperationInProgress;
        }

        public final java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument> component5() {
            return this.cachedInstruments;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getCardId() {
            return this.cardId;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
            return this.productName;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardConnectEligibilityState getCardConnectEligibilityState() {
            return this.cardConnectEligibilityState;
        }

        /* renamed from: component10, reason: from getter */
        public final int getRetryCount() {
            return this.retryCount;
        }

        public final java.util.List<com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection> component1() {
            return this.operationSections;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0011J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJT\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\"\u0010\u0015J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u0015R\u001a\u0010\t\u001a\u00020\b8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b+\u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b,\u0010\u0011R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b.\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementState$Error;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementState;", "", "errorCode", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "errorType", "", "retryCount", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "cardId", "", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;", "cachedInstruments", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;ILcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "component3", "()I", "component4", "()Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "component5", "component6", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;ILcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getErrorCode", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "getErrorType", com.visa.cbp.getEncExpo.warmup, "getRetryCount", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "getProductName", "getCardId", "Ljava/util/List;", "getCachedInstruments"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument> cachedInstruments;
        private final java.lang.String cardId;
        private final java.lang.String errorCode;
        private final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType;
        private final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName;
        private final int retryCount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(java.lang.String str, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, int i, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str2, java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument> list) {
            super("Error", debitCardProductName, str2, list, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitErrorType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardProductName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.errorCode = str;
            this.errorType = debitErrorType;
            this.retryCount = i;
            this.productName = debitCardProductName;
            this.cardId = str2;
            this.cachedInstruments = list;
        }

        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        public final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType getErrorType() {
            return this.errorType;
        }

        public final int getRetryCount() {
            return this.retryCount;
        }

        public /* synthetic */ Error(java.lang.String str, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, int i, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str2, java.util.List list, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, debitErrorType, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.UNKNOWN : debitCardProductName, (i2 & 16) != 0 ? null : str2, (i2 & 32) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
        }

        @Override // com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState
        public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
            return this.productName;
        }

        @Override // com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState
        public final java.lang.String getCardId() {
            return this.cardId;
        }

        @Override // com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState
        public final java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument> getCachedInstruments() {
            return this.cachedInstruments;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.errorCode;
            com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType = this.errorType;
            int i = this.retryCount;
            com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName = this.productName;
            java.lang.String str2 = this.cardId;
            java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument> list = this.cachedInstruments;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(errorCode=");
            sb.append(str);
            sb.append(", errorType=");
            sb.append(debitErrorType);
            sb.append(", retryCount=");
            sb.append(i);
            sb.append(", productName=");
            sb.append(debitCardProductName);
            sb.append(", cardId=");
            sb.append(str2);
            sb.append(", cachedInstruments=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.errorCode.hashCode();
            int hashCode2 = this.errorType.hashCode();
            int hashCode3 = java.lang.Integer.hashCode(this.retryCount);
            int hashCode4 = this.productName.hashCode();
            java.lang.String str = this.cardId;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.cachedInstruments.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState.Error)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState.Error error = (com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState.Error) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, error.errorCode) && this.errorType == error.errorType && this.retryCount == error.retryCount && this.productName == error.productName && kotlin.jvm.internal.Intrinsics.areEqual(this.cardId, error.cardId) && kotlin.jvm.internal.Intrinsics.areEqual(this.cachedInstruments, error.cachedInstruments);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState.Error copy(java.lang.String errorCode, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType, int retryCount, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName, java.lang.String cardId, java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument> cachedInstruments) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cachedInstruments, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState.Error(errorCode, errorType, retryCount, productName, cardId, cachedInstruments);
        }

        public final java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument> component6() {
            return this.cachedInstruments;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getCardId() {
            return this.cardId;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
            return this.productName;
        }

        /* renamed from: component3, reason: from getter */
        public final int getRetryCount() {
            return this.retryCount;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType getErrorType() {
            return this.errorType;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState.Error copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState.Error error, java.lang.String str, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, int i, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str2, java.util.List list, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                str = error.errorCode;
            }
            if ((i2 & 2) != 0) {
                debitErrorType = error.errorType;
            }
            com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType2 = debitErrorType;
            if ((i2 & 4) != 0) {
                i = error.retryCount;
            }
            int i3 = i;
            if ((i2 & 8) != 0) {
                debitCardProductName = error.productName;
            }
            com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName2 = debitCardProductName;
            if ((i2 & 16) != 0) {
                str2 = error.cardId;
            }
            java.lang.String str3 = str2;
            if ((i2 & 32) != 0) {
                list = error.cachedInstruments;
            }
            return error.copy(str, debitErrorType2, i3, debitCardProductName2, str3, list);
        }
    }

    public /* synthetic */ DebitCardManagementState(java.lang.String str, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str2, java.util.List list, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, debitCardProductName, str2, list);
    }
}
