package com.paypal.oslo.feature.moneymovement.api.ui.transferperiod;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0002\u0017\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/ui/transferperiod/TransferPeriodAccordionData;", "", "Lcom/paypal/oslo/feature/moneymovement/api/ui/transferperiod/TransferPeriodAccordionData$State;", "state", "<init>", "(Lcom/paypal/oslo/feature/moneymovement/api/ui/transferperiod/TransferPeriodAccordionData$State;)V", "component1", "()Lcom/paypal/oslo/feature/moneymovement/api/ui/transferperiod/TransferPeriodAccordionData$State;", "copy", "(Lcom/paypal/oslo/feature/moneymovement/api/ui/transferperiod/TransferPeriodAccordionData$State;)Lcom/paypal/oslo/feature/moneymovement/api/ui/transferperiod/TransferPeriodAccordionData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/moneymovement/api/ui/transferperiod/TransferPeriodAccordionData$State;", "getState", "Companion", "State"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class TransferPeriodAccordionData {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriodAccordionData.Companion INSTANCE = new com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriodAccordionData.Companion(null);
    private final com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriodAccordionData.State state;

    public TransferPeriodAccordionData(com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriodAccordionData.State state) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        this.state = state;
    }

    public final com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriodAccordionData.State getState() {
        return this.state;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/ui/transferperiod/TransferPeriodAccordionData$State;", "", "Loading", com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY, "Lcom/paypal/oslo/feature/moneymovement/api/ui/transferperiod/TransferPeriodAccordionData$State$Loading;", "Lcom/paypal/oslo/feature/moneymovement/api/ui/transferperiod/TransferPeriodAccordionData$State$Ready;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface State {

        @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0003\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/ui/transferperiod/TransferPeriodAccordionData$State$Loading;", "Lcom/paypal/oslo/feature/moneymovement/api/ui/transferperiod/TransferPeriodAccordionData$State;", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.IS_EXPANDED, "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/moneymovement/api/ui/transferperiod/TransferPeriodAccordionData$State$Loading;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Loading implements com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriodAccordionData.State {
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
                return (other instanceof com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriodAccordionData.State.Loading) && this.isExpanded == ((com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriodAccordionData.State.Loading) other).isExpanded;
            }

            public final com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriodAccordionData.State.Loading copy(boolean isExpanded) {
                return new com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriodAccordionData.State.Loading(isExpanded);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getIsExpanded() {
                return this.isExpanded;
            }

            public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriodAccordionData.State.Loading copy$default(com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriodAccordionData.State.Loading loading, boolean z, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    z = loading.isExpanded;
                }
                return loading.copy(z);
            }

            public Loading() {
                this(false, 1, null);
            }
        }

        @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J@\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b\b\u0010\u0011R\u001a\u0010\t\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010\u0011R\u0013\u0010'\u001a\u0004\u0018\u00010\u00038G¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010)\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b(\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/ui/transferperiod/TransferPeriodAccordionData$State$Ready;", "Lcom/paypal/oslo/feature/moneymovement/api/ui/transferperiod/TransferPeriodAccordionData$State;", "", "Lcom/paypal/oslo/feature/moneymovement/api/ui/transferperiod/TransferPeriod;", "periods", "Lcom/paypal/oslo/feature/moneymovement/api/ui/transferperiod/TransferSpeed;", "selectedSpeed", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.IS_EXPANDED, "enabled", "<init>", "(Ljava/util/List;Lcom/paypal/oslo/feature/moneymovement/api/ui/transferperiod/TransferSpeed;ZZ)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/paypal/oslo/feature/moneymovement/api/ui/transferperiod/TransferSpeed;", "component3", "()Z", "component4", "copy", "(Ljava/util/List;Lcom/paypal/oslo/feature/moneymovement/api/ui/transferperiod/TransferSpeed;ZZ)Lcom/paypal/oslo/feature/moneymovement/api/ui/transferperiod/TransferPeriodAccordionData$State$Ready;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getPeriods", "Lcom/paypal/oslo/feature/moneymovement/api/ui/transferperiod/TransferSpeed;", "getSelectedSpeed", "Z", "getEnabled", "getSelectedPeriod", "()Lcom/paypal/oslo/feature/moneymovement/api/ui/transferperiod/TransferPeriod;", "selectedPeriod", "getHasSelection", "hasSelection"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Ready implements com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriodAccordionData.State {
            public static final int $stable = 0;
            private final boolean enabled;
            private final boolean isExpanded;
            private final java.util.List<com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriod> periods;
            private final com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed selectedSpeed;

            public Ready(java.util.List<com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriod> list, com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed transferSpeed, boolean z, boolean z2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
                this.periods = list;
                this.selectedSpeed = transferSpeed;
                this.isExpanded = z;
                this.enabled = z2;
            }

            public /* synthetic */ Ready(java.util.List list, com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed transferSpeed, boolean z, boolean z2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(list, (i & 2) != 0 ? null : transferSpeed, (i & 4) != 0 ? false : z, (i & 8) != 0 ? true : z2);
            }

            public final java.util.List<com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriod> getPeriods() {
                return this.periods;
            }

            public final com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed getSelectedSpeed() {
                return this.selectedSpeed;
            }

            public final boolean isExpanded() {
                return this.isExpanded;
            }

            public final boolean getEnabled() {
                return this.enabled;
            }

            public final com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriod getSelectedPeriod() {
                java.lang.Object obj;
                java.util.Iterator<T> it = this.periods.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriod) obj).getTransferSpeed() == this.selectedSpeed) {
                        break;
                    }
                }
                return (com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriod) obj;
            }

            public final boolean getHasSelection() {
                return this.selectedSpeed != null;
            }

            public final java.lang.String toString() {
                java.util.List<com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriod> list = this.periods;
                com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed transferSpeed = this.selectedSpeed;
                boolean z = this.isExpanded;
                boolean z2 = this.enabled;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Ready(periods=");
                sb.append(list);
                sb.append(", selectedSpeed=");
                sb.append(transferSpeed);
                sb.append(", isExpanded=");
                sb.append(z);
                sb.append(", enabled=");
                sb.append(z2);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = this.periods.hashCode();
                com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed transferSpeed = this.selectedSpeed;
                return (((((hashCode * 31) + (transferSpeed == null ? 0 : transferSpeed.hashCode())) * 31) + java.lang.Boolean.hashCode(this.isExpanded)) * 31) + java.lang.Boolean.hashCode(this.enabled);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriodAccordionData.State.Ready)) {
                    return false;
                }
                com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriodAccordionData.State.Ready ready = (com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriodAccordionData.State.Ready) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.periods, ready.periods) && this.selectedSpeed == ready.selectedSpeed && this.isExpanded == ready.isExpanded && this.enabled == ready.enabled;
            }

            public final com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriodAccordionData.State.Ready copy(java.util.List<com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriod> periods, com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed selectedSpeed, boolean isExpanded, boolean enabled) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(periods, "");
                return new com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriodAccordionData.State.Ready(periods, selectedSpeed, isExpanded, enabled);
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
            public final com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed getSelectedSpeed() {
                return this.selectedSpeed;
            }

            public final java.util.List<com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriod> component1() {
                return this.periods;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriodAccordionData.State.Ready copy$default(com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriodAccordionData.State.Ready ready, java.util.List list, com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed transferSpeed, boolean z, boolean z2, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    list = ready.periods;
                }
                if ((i & 2) != 0) {
                    transferSpeed = ready.selectedSpeed;
                }
                if ((i & 4) != 0) {
                    z = ready.isExpanded;
                }
                if ((i & 8) != 0) {
                    z2 = ready.enabled;
                }
                return ready.copy(list, transferSpeed, z, z2);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ;\u0010\u000f\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/ui/transferperiod/TransferPeriodAccordionData$Companion;", "", "<init>", "()V", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.IS_EXPANDED, "Lcom/paypal/oslo/feature/moneymovement/api/ui/transferperiod/TransferPeriodAccordionData;", "loading", "(Z)Lcom/paypal/oslo/feature/moneymovement/api/ui/transferperiod/TransferPeriodAccordionData;", "", "Lcom/paypal/oslo/feature/moneymovement/api/ui/transferperiod/TransferPeriod;", "periods", "Lcom/paypal/oslo/feature/moneymovement/api/ui/transferperiod/TransferSpeed;", "selectedSpeed", "enabled", "fromDomain", "(Ljava/util/List;Lcom/paypal/oslo/feature/moneymovement/api/ui/transferperiod/TransferSpeed;ZZ)Lcom/paypal/oslo/feature/moneymovement/api/ui/transferperiod/TransferPeriodAccordionData;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriodAccordionData loading$default(com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriodAccordionData.Companion companion, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return companion.loading(z);
        }

        public final com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriodAccordionData loading(boolean isExpanded) {
            return new com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriodAccordionData(new com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriodAccordionData.State.Loading(isExpanded));
        }

        public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriodAccordionData fromDomain$default(com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriodAccordionData.Companion companion, java.util.List list, com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed transferSpeed, boolean z, boolean z2, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                transferSpeed = null;
            }
            if ((i & 4) != 0) {
                z = false;
            }
            if ((i & 8) != 0) {
                z2 = true;
            }
            return companion.fromDomain(list, transferSpeed, z, z2);
        }

        public final com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriodAccordionData fromDomain(java.util.List<com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriod> periods, com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed selectedSpeed, boolean isExpanded, boolean enabled) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(periods, "");
            return new com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriodAccordionData(new com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriodAccordionData.State.Ready(periods, selectedSpeed, isExpanded, enabled));
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriodAccordionData.State state = this.state;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TransferPeriodAccordionData(state=");
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
        return (other instanceof com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriodAccordionData) && kotlin.jvm.internal.Intrinsics.areEqual(this.state, ((com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriodAccordionData) other).state);
    }

    public final com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriodAccordionData copy(com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriodAccordionData.State state) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        return new com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriodAccordionData(state);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriodAccordionData.State getState() {
        return this.state;
    }

    public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriodAccordionData copy$default(com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriodAccordionData transferPeriodAccordionData, com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriodAccordionData.State state, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            state = transferPeriodAccordionData.state;
        }
        return transferPeriodAccordionData.copy(state);
    }
}
