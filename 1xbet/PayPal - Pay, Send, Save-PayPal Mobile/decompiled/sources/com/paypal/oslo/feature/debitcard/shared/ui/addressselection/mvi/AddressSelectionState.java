package com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionState;", "Lcom/paypal/oslo/core/mvi/UiState;", "<init>", "()V", "Initial", "Loading", "Success", "Saving", "Error", "Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionState$Error;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionState$Initial;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionState$Loading;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionState$Saving;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class AddressSelectionState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;

    private AddressSelectionState() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\f8\u0017X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionState$Initial;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "name", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initial extends com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Initial INSTANCE = new com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Initial();
        private static final java.lang.String name = "AddressSelectionState.Initial";

        public final int hashCode() {
            return -1962447713;
        }

        private Initial() {
            super(null);
        }

        @Override // com.paypal.oslo.core.mvi.UiState
        public final java.lang.String getName() {
            return name;
        }

        public final java.lang.String toString() {
            return "Initial";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Initial)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007R\u001a\u0010\u0015\u001a\u00020\u00108\u0017X\u0097D¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionState$Loading;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionState;", "", "retryCount", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionState$Loading;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getRetryCount", "name", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState {
        public static final int $stable = 0;
        private final java.lang.String name;
        private final int retryCount;

        public Loading(int i) {
            super(null);
            this.retryCount = i;
            this.name = "AddressSelectionState.Loading";
        }

        public /* synthetic */ Loading(int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i);
        }

        public final int getRetryCount() {
            return this.retryCount;
        }

        @Override // com.paypal.oslo.core.mvi.UiState
        public final java.lang.String getName() {
            return this.name;
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
            return (other instanceof com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Loading) && this.retryCount == ((com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Loading) other).retryCount;
        }

        public final com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Loading copy(int retryCount) {
            return new com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Loading(retryCount);
        }

        /* renamed from: component1, reason: from getter */
        public final int getRetryCount() {
            return this.retryCount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Loading copy$default(com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Loading loading, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = loading.retryCount;
            }
            return loading.copy(i);
        }

        public Loading() {
            this(0, 1, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J@\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0013J\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0011R\u001a\u0010\t\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010\u0013R\u001a\u0010%\u001a\u00020\u00078\u0017X\u0097D¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionState$Success;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionState;", "", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/managecard/billingaddress/model/DebitCardAddress;", "addresses", "", "selectedIndex", "", "debitInstrumentId", "retryCount", "<init>", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;I)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/Integer;", "component3", "()Ljava/lang/String;", "component4", "()I", "copy", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;I)Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionState$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/util/List;", "getAddresses", "Ljava/lang/Integer;", "getSelectedIndex", "Ljava/lang/String;", "getDebitInstrumentId", com.visa.cbp.getEncExpo.warmup, "getRetryCount", "name", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState {
        public static final int $stable = 0;
        private final java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.managecard.billingaddress.model.DebitCardAddress> addresses;
        private final java.lang.String debitInstrumentId;
        private final java.lang.String name;
        private final int retryCount;
        private final java.lang.Integer selectedIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.managecard.billingaddress.model.DebitCardAddress> list, java.lang.Integer num, java.lang.String str, int i) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.addresses = list;
            this.selectedIndex = num;
            this.debitInstrumentId = str;
            this.retryCount = i;
            this.name = "AddressSelectionState.Success";
        }

        public final java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.managecard.billingaddress.model.DebitCardAddress> getAddresses() {
            return this.addresses;
        }

        public final java.lang.Integer getSelectedIndex() {
            return this.selectedIndex;
        }

        public /* synthetic */ Success(java.util.List list, java.lang.Integer num, java.lang.String str, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? 0 : i);
        }

        public final java.lang.String getDebitInstrumentId() {
            return this.debitInstrumentId;
        }

        public final int getRetryCount() {
            return this.retryCount;
        }

        @Override // com.paypal.oslo.core.mvi.UiState
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.managecard.billingaddress.model.DebitCardAddress> list = this.addresses;
            java.lang.Integer num = this.selectedIndex;
            java.lang.String str = this.debitInstrumentId;
            int i = this.retryCount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(addresses=");
            sb.append(list);
            sb.append(", selectedIndex=");
            sb.append(num);
            sb.append(", debitInstrumentId=");
            sb.append(str);
            sb.append(", retryCount=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.addresses.hashCode();
            java.lang.Integer num = this.selectedIndex;
            return (((((hashCode * 31) + (num == null ? 0 : num.hashCode())) * 31) + this.debitInstrumentId.hashCode()) * 31) + java.lang.Integer.hashCode(this.retryCount);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Success)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Success success = (com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Success) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.addresses, success.addresses) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedIndex, success.selectedIndex) && kotlin.jvm.internal.Intrinsics.areEqual(this.debitInstrumentId, success.debitInstrumentId) && this.retryCount == success.retryCount;
        }

        public final com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Success copy(java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.managecard.billingaddress.model.DebitCardAddress> addresses, java.lang.Integer selectedIndex, java.lang.String debitInstrumentId, int retryCount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addresses, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentId, "");
            return new com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Success(addresses, selectedIndex, debitInstrumentId, retryCount);
        }

        /* renamed from: component4, reason: from getter */
        public final int getRetryCount() {
            return this.retryCount;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getDebitInstrumentId() {
            return this.debitInstrumentId;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Integer getSelectedIndex() {
            return this.selectedIndex;
        }

        public final java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.managecard.billingaddress.model.DebitCardAddress> component1() {
            return this.addresses;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Success copy$default(com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Success success, java.util.List list, java.lang.Integer num, java.lang.String str, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                list = success.addresses;
            }
            if ((i2 & 2) != 0) {
                num = success.selectedIndex;
            }
            if ((i2 & 4) != 0) {
                str = success.debitInstrumentId;
            }
            if ((i2 & 8) != 0) {
                i = success.retryCount;
            }
            return success.copy(list, num, str, i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ>\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000fJ\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\u0011R\u001a\u0010\t\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\"\u0010\u000fR\u001a\u0010#\u001a\u00020\u00078\u0017X\u0097D¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionState$Saving;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionState;", "", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/managecard/billingaddress/model/DebitCardAddress;", "addresses", "", "selectedIndex", "", "debitInstrumentId", "retryCount", "<init>", "(Ljava/util/List;ILjava/lang/String;I)V", "component1", "()Ljava/util/List;", "component2", "()I", "component3", "()Ljava/lang/String;", "component4", "copy", "(Ljava/util/List;ILjava/lang/String;I)Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionState$Saving;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/util/List;", "getAddresses", com.visa.cbp.getEncExpo.warmup, "getSelectedIndex", "Ljava/lang/String;", "getDebitInstrumentId", "getRetryCount", "name", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Saving extends com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState {
        public static final int $stable = 0;
        private final java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.managecard.billingaddress.model.DebitCardAddress> addresses;
        private final java.lang.String debitInstrumentId;
        private final java.lang.String name;
        private final int retryCount;
        private final int selectedIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Saving(java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.managecard.billingaddress.model.DebitCardAddress> list, int i, java.lang.String str, int i2) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.addresses = list;
            this.selectedIndex = i;
            this.debitInstrumentId = str;
            this.retryCount = i2;
            this.name = "AddressSelectionState.Saving";
        }

        public /* synthetic */ Saving(java.util.List list, int i, java.lang.String str, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(list, i, str, (i3 & 8) != 0 ? 0 : i2);
        }

        public final java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.managecard.billingaddress.model.DebitCardAddress> getAddresses() {
            return this.addresses;
        }

        public final int getSelectedIndex() {
            return this.selectedIndex;
        }

        public final java.lang.String getDebitInstrumentId() {
            return this.debitInstrumentId;
        }

        public final int getRetryCount() {
            return this.retryCount;
        }

        @Override // com.paypal.oslo.core.mvi.UiState
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.managecard.billingaddress.model.DebitCardAddress> list = this.addresses;
            int i = this.selectedIndex;
            java.lang.String str = this.debitInstrumentId;
            int i2 = this.retryCount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Saving(addresses=");
            sb.append(list);
            sb.append(", selectedIndex=");
            sb.append(i);
            sb.append(", debitInstrumentId=");
            sb.append(str);
            sb.append(", retryCount=");
            sb.append(i2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((this.addresses.hashCode() * 31) + java.lang.Integer.hashCode(this.selectedIndex)) * 31) + this.debitInstrumentId.hashCode()) * 31) + java.lang.Integer.hashCode(this.retryCount);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Saving)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Saving saving = (com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Saving) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.addresses, saving.addresses) && this.selectedIndex == saving.selectedIndex && kotlin.jvm.internal.Intrinsics.areEqual(this.debitInstrumentId, saving.debitInstrumentId) && this.retryCount == saving.retryCount;
        }

        public final com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Saving copy(java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.managecard.billingaddress.model.DebitCardAddress> addresses, int selectedIndex, java.lang.String debitInstrumentId, int retryCount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addresses, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentId, "");
            return new com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Saving(addresses, selectedIndex, debitInstrumentId, retryCount);
        }

        /* renamed from: component4, reason: from getter */
        public final int getRetryCount() {
            return this.retryCount;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getDebitInstrumentId() {
            return this.debitInstrumentId;
        }

        /* renamed from: component2, reason: from getter */
        public final int getSelectedIndex() {
            return this.selectedIndex;
        }

        public final java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.managecard.billingaddress.model.DebitCardAddress> component1() {
            return this.addresses;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Saving copy$default(com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Saving saving, java.util.List list, int i, java.lang.String str, int i2, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                list = saving.addresses;
            }
            if ((i3 & 2) != 0) {
                i = saving.selectedIndex;
            }
            if ((i3 & 4) != 0) {
                str = saving.debitInstrumentId;
            }
            if ((i3 & 8) != 0) {
                i2 = saving.retryCount;
            }
            return saving.copy(list, i, str, i2);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0011J\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u0011R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010\u0013R\u001a\u0010%\u001a\u00020\u00028\u0017X\u0097D¢\u0006\f\n\u0004\b%\u0010\u001d\u001a\u0004\b&\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionState$Error;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionState;", "", "errorCode", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "errorType", "", "retryCount", "Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionRetryType;", "apiRetryType", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;ILcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionRetryType;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "component3", "()I", "component4", "()Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionRetryType;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;ILcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionRetryType;)Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getErrorCode", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "getErrorType", com.visa.cbp.getEncExpo.warmup, "getRetryCount", "Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionRetryType;", "getApiRetryType", "name", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionRetryType apiRetryType;
        private final java.lang.String errorCode;
        private final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType;
        private final java.lang.String name;
        private final int retryCount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(java.lang.String str, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, int i, com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionRetryType addressSelectionRetryType) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitErrorType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressSelectionRetryType, "");
            this.errorCode = str;
            this.errorType = debitErrorType;
            this.retryCount = i;
            this.apiRetryType = addressSelectionRetryType;
            this.name = "AddressSelectionState.Error";
        }

        public /* synthetic */ Error(java.lang.String str, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, int i, com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionRetryType addressSelectionRetryType, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, debitErrorType, (i2 & 4) != 0 ? 0 : i, addressSelectionRetryType);
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

        public final com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionRetryType getApiRetryType() {
            return this.apiRetryType;
        }

        @Override // com.paypal.oslo.core.mvi.UiState
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.errorCode;
            com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType = this.errorType;
            int i = this.retryCount;
            com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionRetryType addressSelectionRetryType = this.apiRetryType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(errorCode=");
            sb.append(str);
            sb.append(", errorType=");
            sb.append(debitErrorType);
            sb.append(", retryCount=");
            sb.append(i);
            sb.append(", apiRetryType=");
            sb.append(addressSelectionRetryType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((this.errorCode.hashCode() * 31) + this.errorType.hashCode()) * 31) + java.lang.Integer.hashCode(this.retryCount)) * 31) + this.apiRetryType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Error)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Error error = (com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Error) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, error.errorCode) && this.errorType == error.errorType && this.retryCount == error.retryCount && kotlin.jvm.internal.Intrinsics.areEqual(this.apiRetryType, error.apiRetryType);
        }

        public final com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Error copy(java.lang.String errorCode, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType, int retryCount, com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionRetryType apiRetryType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apiRetryType, "");
            return new com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Error(errorCode, errorType, retryCount, apiRetryType);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionRetryType getApiRetryType() {
            return this.apiRetryType;
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

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Error copy$default(com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Error error, java.lang.String str, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, int i, com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionRetryType addressSelectionRetryType, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                str = error.errorCode;
            }
            if ((i2 & 2) != 0) {
                debitErrorType = error.errorType;
            }
            if ((i2 & 4) != 0) {
                i = error.retryCount;
            }
            if ((i2 & 8) != 0) {
                addressSelectionRetryType = error.apiRetryType;
            }
            return error.copy(str, debitErrorType, i, addressSelectionRetryType);
        }
    }

    public /* synthetic */ AddressSelectionState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
