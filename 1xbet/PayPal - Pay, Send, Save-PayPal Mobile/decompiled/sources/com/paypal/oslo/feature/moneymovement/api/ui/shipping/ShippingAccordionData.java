package com.paypal.oslo.feature.moneymovement.api.ui.shipping;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0002\u0017\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/ui/shipping/ShippingAccordionData;", "", "Lcom/paypal/oslo/feature/moneymovement/api/ui/shipping/ShippingAccordionData$State;", "state", "<init>", "(Lcom/paypal/oslo/feature/moneymovement/api/ui/shipping/ShippingAccordionData$State;)V", "component1", "()Lcom/paypal/oslo/feature/moneymovement/api/ui/shipping/ShippingAccordionData$State;", "copy", "(Lcom/paypal/oslo/feature/moneymovement/api/ui/shipping/ShippingAccordionData$State;)Lcom/paypal/oslo/feature/moneymovement/api/ui/shipping/ShippingAccordionData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/moneymovement/api/ui/shipping/ShippingAccordionData$State;", "getState", "Companion", "State"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ShippingAccordionData {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionData.Companion INSTANCE = new com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionData.Companion(null);
    private final com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionData.State state;

    public ShippingAccordionData(com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionData.State state) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        this.state = state;
    }

    public final com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionData.State getState() {
        return this.state;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/ui/shipping/ShippingAccordionData$State;", "", "Loading", com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY, "Lcom/paypal/oslo/feature/moneymovement/api/ui/shipping/ShippingAccordionData$State$Loading;", "Lcom/paypal/oslo/feature/moneymovement/api/ui/shipping/ShippingAccordionData$State$Ready;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface State {

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/ui/shipping/ShippingAccordionData$State$Loading;", "Lcom/paypal/oslo/feature/moneymovement/api/ui/shipping/ShippingAccordionData$State;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Loading implements com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionData.State {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionData.State.Loading INSTANCE = new com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionData.State.Loading();

            public final int hashCode() {
                return -1960852469;
            }

            private Loading() {
            }

            public final java.lang.String toString() {
                return "Loading";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionData.State.Loading)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012JJ\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010\u0012R\u001a\u0010\t\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b\t\u0010\u0012R\u001a\u0010\n\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b%\u0010\u0012R\u0013\u0010(\u001a\u0004\u0018\u00010\u00038G¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0011\u0010*\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b)\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/ui/shipping/ShippingAccordionData$State$Ready;", "Lcom/paypal/oslo/feature/moneymovement/api/ui/shipping/ShippingAccordionData$State;", "", "Lcom/paypal/oslo/feature/moneymovement/api/domain/ShippingAddress;", "addresses", "", "selectedAddressId", "", "noShippingSelected", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.IS_EXPANDED, "enabled", "<init>", "(Ljava/util/List;Ljava/lang/String;ZZZ)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "()Z", "component4", "component5", "copy", "(Ljava/util/List;Ljava/lang/String;ZZZ)Lcom/paypal/oslo/feature/moneymovement/api/ui/shipping/ShippingAccordionData$State$Ready;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/List;", "getAddresses", "Ljava/lang/String;", "getSelectedAddressId", "Z", "getNoShippingSelected", "getEnabled", "getSelectedAddress", "()Lcom/paypal/oslo/feature/moneymovement/api/domain/ShippingAddress;", "selectedAddress", "getHasSelection", "hasSelection"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Ready implements com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionData.State {
            public static final int $stable = 0;
            private final java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress> addresses;
            private final boolean enabled;
            private final boolean isExpanded;
            private final boolean noShippingSelected;
            private final java.lang.String selectedAddressId;

            public Ready(java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress> list, java.lang.String str, boolean z, boolean z2, boolean z3) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
                this.addresses = list;
                this.selectedAddressId = str;
                this.noShippingSelected = z;
                this.isExpanded = z2;
                this.enabled = z3;
            }

            public /* synthetic */ Ready(java.util.List list, java.lang.String str, boolean z, boolean z2, boolean z3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? true : z3);
            }

            public final java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress> getAddresses() {
                return this.addresses;
            }

            public final java.lang.String getSelectedAddressId() {
                return this.selectedAddressId;
            }

            public final boolean getNoShippingSelected() {
                return this.noShippingSelected;
            }

            public final boolean isExpanded() {
                return this.isExpanded;
            }

            public final boolean getEnabled() {
                return this.enabled;
            }

            public final com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress getSelectedAddress() {
                java.lang.Object obj;
                java.util.Iterator<T> it = this.addresses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress) obj).getId(), this.selectedAddressId)) {
                        break;
                    }
                }
                return (com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress) obj;
            }

            public final boolean getHasSelection() {
                return this.selectedAddressId != null || this.noShippingSelected;
            }

            public final java.lang.String toString() {
                java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress> list = this.addresses;
                java.lang.String str = this.selectedAddressId;
                boolean z = this.noShippingSelected;
                boolean z2 = this.isExpanded;
                boolean z3 = this.enabled;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Ready(addresses=");
                sb.append(list);
                sb.append(", selectedAddressId=");
                sb.append(str);
                sb.append(", noShippingSelected=");
                sb.append(z);
                sb.append(", isExpanded=");
                sb.append(z2);
                sb.append(", enabled=");
                sb.append(z3);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = this.addresses.hashCode();
                java.lang.String str = this.selectedAddressId;
                return (((((((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Boolean.hashCode(this.noShippingSelected)) * 31) + java.lang.Boolean.hashCode(this.isExpanded)) * 31) + java.lang.Boolean.hashCode(this.enabled);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionData.State.Ready)) {
                    return false;
                }
                com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionData.State.Ready ready = (com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionData.State.Ready) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.addresses, ready.addresses) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedAddressId, ready.selectedAddressId) && this.noShippingSelected == ready.noShippingSelected && this.isExpanded == ready.isExpanded && this.enabled == ready.enabled;
            }

            public final com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionData.State.Ready copy(java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress> addresses, java.lang.String selectedAddressId, boolean noShippingSelected, boolean isExpanded, boolean enabled) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addresses, "");
                return new com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionData.State.Ready(addresses, selectedAddressId, noShippingSelected, isExpanded, enabled);
            }

            /* renamed from: component5, reason: from getter */
            public final boolean getEnabled() {
                return this.enabled;
            }

            /* renamed from: component4, reason: from getter */
            public final boolean getIsExpanded() {
                return this.isExpanded;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getNoShippingSelected() {
                return this.noShippingSelected;
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getSelectedAddressId() {
                return this.selectedAddressId;
            }

            public final java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress> component1() {
                return this.addresses;
            }

            public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionData.State.Ready copy$default(com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionData.State.Ready ready, java.util.List list, java.lang.String str, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    list = ready.addresses;
                }
                if ((i & 2) != 0) {
                    str = ready.selectedAddressId;
                }
                java.lang.String str2 = str;
                if ((i & 4) != 0) {
                    z = ready.noShippingSelected;
                }
                boolean z4 = z;
                if ((i & 8) != 0) {
                    z2 = ready.isExpanded;
                }
                boolean z5 = z2;
                if ((i & 16) != 0) {
                    z3 = ready.enabled;
                }
                return ready.copy(list, str2, z4, z5, z3);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006JE\u0010\u0010\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/ui/shipping/ShippingAccordionData$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/moneymovement/api/ui/shipping/ShippingAccordionData;", "loading", "()Lcom/paypal/oslo/feature/moneymovement/api/ui/shipping/ShippingAccordionData;", "", "Lcom/paypal/oslo/feature/moneymovement/api/domain/ShippingAddress;", "addresses", "", "selectedAddressId", "", "noShippingSelected", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.IS_EXPANDED, "enabled", "fromDomainModels", "(Ljava/util/List;Ljava/lang/String;ZZZ)Lcom/paypal/oslo/feature/moneymovement/api/ui/shipping/ShippingAccordionData;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionData loading() {
            return new com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionData(com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionData.State.Loading.INSTANCE);
        }

        public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionData fromDomainModels$default(com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionData.Companion companion, java.util.List list, java.lang.String str, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            java.lang.String str2 = str;
            boolean z4 = (i & 4) != 0 ? false : z;
            boolean z5 = (i & 8) != 0 ? false : z2;
            if ((i & 16) != 0) {
                z3 = true;
            }
            return companion.fromDomainModels(list, str2, z4, z5, z3);
        }

        public final com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionData fromDomainModels(java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress> addresses, java.lang.String selectedAddressId, boolean noShippingSelected, boolean isExpanded, boolean enabled) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addresses, "");
            return new com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionData(new com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionData.State.Ready(addresses, selectedAddressId, noShippingSelected, isExpanded, enabled));
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionData.State state = this.state;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ShippingAccordionData(state=");
        sb.append(state);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.state.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionData) && kotlin.jvm.internal.Intrinsics.areEqual(this.state, ((com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionData) other).state);
    }

    public final com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionData copy(com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionData.State state) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        return new com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionData(state);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionData.State getState() {
        return this.state;
    }

    public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionData copy$default(com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionData shippingAccordionData, com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionData.State state, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            state = shippingAccordionData.state;
        }
        return shippingAccordionData.copy(state);
    }
}
