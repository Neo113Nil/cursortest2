package com.paypal.oslo.feature.bnplacquisition.ui.address.add;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddUiEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "NavigateBack", "LayoutFailedToLoad", "AddressUpdated", "ScrollToFirstError", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddUiEffect$AddressUpdated;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddUiEffect$LayoutFailedToLoad;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddUiEffect$NavigateBack;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddUiEffect$ScrollToFirstError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class AddressAddUiEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private AddressAddUiEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddUiEffect$NavigateBack;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBack extends com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiEffect.NavigateBack INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiEffect.NavigateBack();

        public final int hashCode() {
            return 277298061;
        }

        private NavigateBack() {
            super("NavigateBack", null);
        }

        public final java.lang.String toString() {
            return "NavigateBack";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiEffect.NavigateBack)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddUiEffect$LayoutFailedToLoad;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LayoutFailedToLoad extends com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiEffect.LayoutFailedToLoad INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiEffect.LayoutFailedToLoad();

        public final int hashCode() {
            return -1711330627;
        }

        private LayoutFailedToLoad() {
            super("LayoutFailedToLoad", null);
        }

        public final java.lang.String toString() {
            return "LayoutFailedToLoad";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiEffect.LayoutFailedToLoad)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddUiEffect$AddressUpdated;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddUiEffect;", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "address", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/model/Address;)V", "component1", "()Lcom/paypal/oslo/core/i18n/domain/model/Address;", "copy", "(Lcom/paypal/oslo/core/i18n/domain/model/Address;)Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddUiEffect$AddressUpdated;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "getAddress"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AddressUpdated extends com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiEffect {
        public static final int $stable = 8;
        private final com.paypal.oslo.core.i18n.domain.model.Address address;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddressUpdated(com.paypal.oslo.core.i18n.domain.model.Address address) {
            super("AddressUpdated", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
            this.address = address;
        }

        public final com.paypal.oslo.core.i18n.domain.model.Address getAddress() {
            return this.address;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.i18n.domain.model.Address address = this.address;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AddressUpdated(address=");
            sb.append(address);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.address.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiEffect.AddressUpdated) && kotlin.jvm.internal.Intrinsics.areEqual(this.address, ((com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiEffect.AddressUpdated) other).address);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiEffect.AddressUpdated copy(com.paypal.oslo.core.i18n.domain.model.Address address) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiEffect.AddressUpdated(address);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.i18n.domain.model.Address getAddress() {
            return this.address;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiEffect.AddressUpdated copy$default(com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiEffect.AddressUpdated addressUpdated, com.paypal.oslo.core.i18n.domain.model.Address address, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                address = addressUpdated.address;
            }
            return addressUpdated.copy(address);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddUiEffect$ScrollToFirstError;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddUiEffect;", "", "scrollKey", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddUiEffect$ScrollToFirstError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getScrollKey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ScrollToFirstError extends com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiEffect {
        public static final int $stable = 0;
        private final java.lang.String scrollKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ScrollToFirstError(java.lang.String str) {
            super("ScrollToFirstError", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.scrollKey = str;
        }

        public final java.lang.String getScrollKey() {
            return this.scrollKey;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.scrollKey;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ScrollToFirstError(scrollKey=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.scrollKey.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiEffect.ScrollToFirstError) && kotlin.jvm.internal.Intrinsics.areEqual(this.scrollKey, ((com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiEffect.ScrollToFirstError) other).scrollKey);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiEffect.ScrollToFirstError copy(java.lang.String scrollKey) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scrollKey, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiEffect.ScrollToFirstError(scrollKey);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getScrollKey() {
            return this.scrollKey;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiEffect.ScrollToFirstError copy$default(com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiEffect.ScrollToFirstError scrollToFirstError, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = scrollToFirstError.scrollKey;
            }
            return scrollToFirstError.copy(str);
        }
    }

    public /* synthetic */ AddressAddUiEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
