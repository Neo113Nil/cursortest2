package com.paypal.oslo.feature.moneymovement.api.ui.purpose;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0002\u0017\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeAccordionData;", "", "Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeAccordionData$State;", "state", "<init>", "(Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeAccordionData$State;)V", "component1", "()Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeAccordionData$State;", "copy", "(Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeAccordionData$State;)Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeAccordionData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeAccordionData$State;", "getState", "Companion", "State"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PurposeAccordionData {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeAccordionData.Companion INSTANCE = new com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeAccordionData.Companion(null);
    private final com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeAccordionData.State state;

    public PurposeAccordionData(com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeAccordionData.State state) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        this.state = state;
    }

    public final com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeAccordionData.State getState() {
        return this.state;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeAccordionData$State;", "", "Loading", com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY, "Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeAccordionData$State$Loading;", "Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeAccordionData$State$Ready;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface State {

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeAccordionData$State$Loading;", "Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeAccordionData$State;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Loading implements com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeAccordionData.State {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeAccordionData.State.Loading INSTANCE = new com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeAccordionData.State.Loading();

            public final int hashCode() {
                return -1372406933;
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
                if (!(other instanceof com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeAccordionData.State.Loading)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J@\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b\u0007\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0010R\u0011\u0010%\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b$\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeAccordionData$State$Ready;", "Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeAccordionData$State;", "", "Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeCode;", "supportedCodes", "selectedCode", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.IS_EXPANDED, "enabled", "<init>", "(Ljava/util/List;Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeCode;ZZ)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeCode;", "component3", "()Z", "component4", "copy", "(Ljava/util/List;Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeCode;ZZ)Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeAccordionData$State$Ready;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getSupportedCodes", "Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeCode;", "getSelectedCode", "Z", "getEnabled", "getHasSelection", "hasSelection"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Ready implements com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeAccordionData.State {
            public static final int $stable = 0;
            private final boolean enabled;
            private final boolean isExpanded;
            private final com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCode selectedCode;
            private final java.util.List<com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCode> supportedCodes;

            /* JADX WARN: Multi-variable type inference failed */
            public Ready(java.util.List<? extends com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCode> list, com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCode purposeCode, boolean z, boolean z2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
                this.supportedCodes = list;
                this.selectedCode = purposeCode;
                this.isExpanded = z;
                this.enabled = z2;
            }

            public /* synthetic */ Ready(java.util.List list, com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCode purposeCode, boolean z, boolean z2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(list, (i & 2) != 0 ? null : purposeCode, (i & 4) != 0 ? false : z, (i & 8) != 0 ? true : z2);
            }

            public final java.util.List<com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCode> getSupportedCodes() {
                return this.supportedCodes;
            }

            public final com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCode getSelectedCode() {
                return this.selectedCode;
            }

            public final boolean isExpanded() {
                return this.isExpanded;
            }

            public final boolean getEnabled() {
                return this.enabled;
            }

            public final boolean getHasSelection() {
                return this.selectedCode != null;
            }

            public final java.lang.String toString() {
                java.util.List<com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCode> list = this.supportedCodes;
                com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCode purposeCode = this.selectedCode;
                boolean z = this.isExpanded;
                boolean z2 = this.enabled;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Ready(supportedCodes=");
                sb.append(list);
                sb.append(", selectedCode=");
                sb.append(purposeCode);
                sb.append(", isExpanded=");
                sb.append(z);
                sb.append(", enabled=");
                sb.append(z2);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = this.supportedCodes.hashCode();
                com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCode purposeCode = this.selectedCode;
                return (((((hashCode * 31) + (purposeCode == null ? 0 : purposeCode.hashCode())) * 31) + java.lang.Boolean.hashCode(this.isExpanded)) * 31) + java.lang.Boolean.hashCode(this.enabled);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeAccordionData.State.Ready)) {
                    return false;
                }
                com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeAccordionData.State.Ready ready = (com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeAccordionData.State.Ready) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.supportedCodes, ready.supportedCodes) && this.selectedCode == ready.selectedCode && this.isExpanded == ready.isExpanded && this.enabled == ready.enabled;
            }

            public final com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeAccordionData.State.Ready copy(java.util.List<? extends com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCode> supportedCodes, com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCode selectedCode, boolean isExpanded, boolean enabled) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportedCodes, "");
                return new com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeAccordionData.State.Ready(supportedCodes, selectedCode, isExpanded, enabled);
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
            public final com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCode getSelectedCode() {
                return this.selectedCode;
            }

            public final java.util.List<com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCode> component1() {
                return this.supportedCodes;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeAccordionData.State.Ready copy$default(com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeAccordionData.State.Ready ready, java.util.List list, com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCode purposeCode, boolean z, boolean z2, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    list = ready.supportedCodes;
                }
                if ((i & 2) != 0) {
                    purposeCode = ready.selectedCode;
                }
                if ((i & 4) != 0) {
                    z = ready.isExpanded;
                }
                if ((i & 8) != 0) {
                    z2 = ready.enabled;
                }
                return ready.copy(list, purposeCode, z, z2);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J;\u0010\u000e\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeAccordionData$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeAccordionData;", "loading", "()Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeAccordionData;", "", "Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeCode;", "supportedCodes", "selectedCode", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.IS_EXPANDED, "enabled", "fromDomain", "(Ljava/util/List;Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeCode;ZZ)Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeAccordionData;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeAccordionData loading() {
            return new com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeAccordionData(com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeAccordionData.State.Loading.INSTANCE);
        }

        public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeAccordionData fromDomain$default(com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeAccordionData.Companion companion, java.util.List list, com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCode purposeCode, boolean z, boolean z2, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                purposeCode = null;
            }
            if ((i & 4) != 0) {
                z = false;
            }
            if ((i & 8) != 0) {
                z2 = true;
            }
            return companion.fromDomain(list, purposeCode, z, z2);
        }

        public final com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeAccordionData fromDomain(java.util.List<? extends com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCode> supportedCodes, com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCode selectedCode, boolean isExpanded, boolean enabled) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportedCodes, "");
            return new com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeAccordionData(new com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeAccordionData.State.Ready(supportedCodes, selectedCode, isExpanded, enabled));
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeAccordionData.State state = this.state;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PurposeAccordionData(state=");
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
        return (other instanceof com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeAccordionData) && kotlin.jvm.internal.Intrinsics.areEqual(this.state, ((com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeAccordionData) other).state);
    }

    public final com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeAccordionData copy(com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeAccordionData.State state) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        return new com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeAccordionData(state);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeAccordionData.State getState() {
        return this.state;
    }

    public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeAccordionData copy$default(com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeAccordionData purposeAccordionData, com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeAccordionData.State state, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            state = purposeAccordionData.state;
        }
        return purposeAccordionData.copy(state);
    }
}
