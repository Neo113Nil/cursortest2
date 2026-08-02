package com.paypal.oslo.feature.moneymovement.api.ui.paymenttype;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0002\u0017\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/ui/paymenttype/PaymentTypeAccordionData;", "", "Lcom/paypal/oslo/feature/moneymovement/api/ui/paymenttype/PaymentTypeAccordionData$State;", "state", "<init>", "(Lcom/paypal/oslo/feature/moneymovement/api/ui/paymenttype/PaymentTypeAccordionData$State;)V", "component1", "()Lcom/paypal/oslo/feature/moneymovement/api/ui/paymenttype/PaymentTypeAccordionData$State;", "copy", "(Lcom/paypal/oslo/feature/moneymovement/api/ui/paymenttype/PaymentTypeAccordionData$State;)Lcom/paypal/oslo/feature/moneymovement/api/ui/paymenttype/PaymentTypeAccordionData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/moneymovement/api/ui/paymenttype/PaymentTypeAccordionData$State;", "getState", "Companion", "State"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PaymentTypeAccordionData {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData.Companion INSTANCE = new com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData.Companion(null);
    private final com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData.State state;

    public PaymentTypeAccordionData(com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData.State state) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        this.state = state;
    }

    public final com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData.State getState() {
        return this.state;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/ui/paymenttype/PaymentTypeAccordionData$State;", "", "Loading", com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY, "Lcom/paypal/oslo/feature/moneymovement/api/ui/paymenttype/PaymentTypeAccordionData$State$Loading;", "Lcom/paypal/oslo/feature/moneymovement/api/ui/paymenttype/PaymentTypeAccordionData$State$Ready;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface State {

        @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0003\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/ui/paymenttype/PaymentTypeAccordionData$State$Loading;", "Lcom/paypal/oslo/feature/moneymovement/api/ui/paymenttype/PaymentTypeAccordionData$State;", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.IS_EXPANDED, "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/moneymovement/api/ui/paymenttype/PaymentTypeAccordionData$State$Loading;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Loading implements com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData.State {
            public static final int $stable = 0;
            private final boolean isExpanded;

            public Loading(boolean z) {
                this.isExpanded = z;
            }

            public /* synthetic */ Loading(boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? false : z);
            }

            public final boolean isExpanded() {
                return this.isExpanded;
            }

            public final java.lang.String toString() {
                boolean z = this.isExpanded;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Loading(isExpanded=");
                sb.append(z);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return java.lang.Boolean.hashCode(this.isExpanded);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData.State.Loading) && this.isExpanded == ((com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData.State.Loading) other).isExpanded;
            }

            public final com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData.State.Loading copy(boolean isExpanded) {
                return new com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData.State.Loading(isExpanded);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getIsExpanded() {
                return this.isExpanded;
            }

            public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData.State.Loading copy$default(com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData.State.Loading loading, boolean z, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    z = loading.isExpanded;
                }
                return loading.copy(z);
            }

            public Loading() {
                this(false, 1, null);
            }
        }

        @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J@\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u000fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\b\u0010\u0011R\u001a\u0010\t\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010\u0011R\u0013\u0010%\u001a\u0004\u0018\u00010\u00038G¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010'\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b&\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/ui/paymenttype/PaymentTypeAccordionData$State$Ready;", "Lcom/paypal/oslo/feature/moneymovement/api/ui/paymenttype/PaymentTypeAccordionData$State;", "", "Lcom/paypal/oslo/feature/moneymovement/api/domain/PaymentType;", "types", "", "selectedTypeId", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.IS_EXPANDED, "enabled", "<init>", "(Ljava/util/List;Ljava/lang/String;ZZ)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "()Z", "component4", "copy", "(Ljava/util/List;Ljava/lang/String;ZZ)Lcom/paypal/oslo/feature/moneymovement/api/ui/paymenttype/PaymentTypeAccordionData$State$Ready;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/List;", "getTypes", "Ljava/lang/String;", "getSelectedTypeId", "Z", "getEnabled", "getSelectedType", "()Lcom/paypal/oslo/feature/moneymovement/api/domain/PaymentType;", "selectedType", "getHasSelection", "hasSelection"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Ready implements com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData.State {
            public static final int $stable = 0;
            private final boolean enabled;
            private final boolean isExpanded;
            private final java.lang.String selectedTypeId;
            private final java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.PaymentType> types;

            public Ready(java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.PaymentType> list, java.lang.String str, boolean z, boolean z2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
                this.types = list;
                this.selectedTypeId = str;
                this.isExpanded = z;
                this.enabled = z2;
            }

            public /* synthetic */ Ready(java.util.List list, java.lang.String str, boolean z, boolean z2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? false : z, (i & 8) != 0 ? true : z2);
            }

            public final java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.PaymentType> getTypes() {
                return this.types;
            }

            public final java.lang.String getSelectedTypeId() {
                return this.selectedTypeId;
            }

            public final boolean isExpanded() {
                return this.isExpanded;
            }

            public final boolean getEnabled() {
                return this.enabled;
            }

            public final com.paypal.oslo.feature.moneymovement.api.domain.PaymentType getSelectedType() {
                java.lang.Object obj;
                java.util.Iterator<T> it = this.types.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.moneymovement.api.domain.PaymentType) obj).getId(), this.selectedTypeId)) {
                        break;
                    }
                }
                return (com.paypal.oslo.feature.moneymovement.api.domain.PaymentType) obj;
            }

            public final boolean getHasSelection() {
                return this.selectedTypeId != null;
            }

            public final java.lang.String toString() {
                java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.PaymentType> list = this.types;
                java.lang.String str = this.selectedTypeId;
                boolean z = this.isExpanded;
                boolean z2 = this.enabled;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Ready(types=");
                sb.append(list);
                sb.append(", selectedTypeId=");
                sb.append(str);
                sb.append(", isExpanded=");
                sb.append(z);
                sb.append(", enabled=");
                sb.append(z2);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = this.types.hashCode();
                java.lang.String str = this.selectedTypeId;
                return (((((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Boolean.hashCode(this.isExpanded)) * 31) + java.lang.Boolean.hashCode(this.enabled);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData.State.Ready)) {
                    return false;
                }
                com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData.State.Ready ready = (com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData.State.Ready) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.types, ready.types) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedTypeId, ready.selectedTypeId) && this.isExpanded == ready.isExpanded && this.enabled == ready.enabled;
            }

            public final com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData.State.Ready copy(java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.PaymentType> types, java.lang.String selectedTypeId, boolean isExpanded, boolean enabled) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(types, "");
                return new com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData.State.Ready(types, selectedTypeId, isExpanded, enabled);
            }

            /* renamed from: component4, reason: from getter */
            public final boolean getEnabled() {
                return this.enabled;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getIsExpanded() {
                return this.isExpanded;
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getSelectedTypeId() {
                return this.selectedTypeId;
            }

            public final java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.PaymentType> component1() {
                return this.types;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData.State.Ready copy$default(com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData.State.Ready ready, java.util.List list, java.lang.String str, boolean z, boolean z2, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    list = ready.types;
                }
                if ((i & 2) != 0) {
                    str = ready.selectedTypeId;
                }
                if ((i & 4) != 0) {
                    z = ready.isExpanded;
                }
                if ((i & 8) != 0) {
                    z2 = ready.enabled;
                }
                return ready.copy(list, str, z, z2);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ;\u0010\u000f\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0011\u001a\u00020\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/ui/paymenttype/PaymentTypeAccordionData$Companion;", "", "<init>", "()V", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.IS_EXPANDED, "Lcom/paypal/oslo/feature/moneymovement/api/ui/paymenttype/PaymentTypeAccordionData;", "loading", "(Z)Lcom/paypal/oslo/feature/moneymovement/api/ui/paymenttype/PaymentTypeAccordionData;", "", "Lcom/paypal/oslo/feature/moneymovement/api/domain/PaymentType;", "types", "", "selectedTypeId", "enabled", "fromDomainModels", "(Ljava/util/List;Ljava/lang/String;ZZ)Lcom/paypal/oslo/feature/moneymovement/api/ui/paymenttype/PaymentTypeAccordionData;", "friendsAndFamilyAndGoodsAndServices", "(Ljava/lang/String;ZZ)Lcom/paypal/oslo/feature/moneymovement/api/ui/paymenttype/PaymentTypeAccordionData;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData loading$default(com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData.Companion companion, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return companion.loading(z);
        }

        public final com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData loading(boolean isExpanded) {
            return new com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData(new com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData.State.Loading(isExpanded));
        }

        public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData fromDomainModels$default(com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData.Companion companion, java.util.List list, java.lang.String str, boolean z, boolean z2, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                z = false;
            }
            if ((i & 8) != 0) {
                z2 = true;
            }
            return companion.fromDomainModels(list, str, z, z2);
        }

        public final com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData fromDomainModels(java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.PaymentType> types, java.lang.String selectedTypeId, boolean isExpanded, boolean enabled) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(types, "");
            return new com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData(new com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData.State.Ready(types, selectedTypeId, isExpanded, enabled));
        }

        public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData friendsAndFamilyAndGoodsAndServices$default(com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData.Companion companion, java.lang.String str, boolean z, boolean z2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                z2 = true;
            }
            return companion.friendsAndFamilyAndGoodsAndServices(str, z, z2);
        }

        public final com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData friendsAndFamilyAndGoodsAndServices(java.lang.String selectedTypeId, boolean isExpanded, boolean enabled) {
            return new com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData(new com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData.State.Ready(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.moneymovement.api.domain.PaymentType[]{new com.paypal.oslo.feature.moneymovement.api.domain.PaymentType(com.paypal.oslo.feature.p2p.ui.review.mappers.PaymentTypeDomainMapper.MmpPaymentTypeIds.FRIENDS_FAMILY, com.paypal.oslo.feature.p2p.ui.review.composables.accordions.PreviewConstants.FRIENDS_AND_FAMILY, "Purchase Protection doesn't apply.", "SMILEY", null, null), new com.paypal.oslo.feature.moneymovement.api.domain.PaymentType(com.paypal.oslo.feature.p2p.ui.review.mappers.PaymentTypeDomainMapper.MmpPaymentTypeIds.GOODS_SERVICES, "Goods and services", "Get a full refund if an eligible item gets lost or damaged. Seller pays a small fee.", "STORE", null, new com.paypal.oslo.feature.moneymovement.api.domain.PaymentType.InfoLink("More on Purchase Protection", "https://www.paypal.com/us/webapps/mpp/paypal-safety-and-security"))}), selectedTypeId, isExpanded, enabled));
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData.State state = this.state;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentTypeAccordionData(state=");
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
        return (other instanceof com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData) && kotlin.jvm.internal.Intrinsics.areEqual(this.state, ((com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData) other).state);
    }

    public final com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData copy(com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData.State state) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        return new com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData(state);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData.State getState() {
        return this.state;
    }

    public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData copy$default(com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData paymentTypeAccordionData, com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData.State state, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            state = paymentTypeAccordionData.state;
        }
        return paymentTypeAccordionData.copy(state);
    }
}
