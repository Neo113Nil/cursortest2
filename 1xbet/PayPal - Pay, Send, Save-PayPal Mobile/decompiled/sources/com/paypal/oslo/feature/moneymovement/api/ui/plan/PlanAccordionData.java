package com.paypal.oslo.feature.moneymovement.api.ui.plan;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0002\u0017\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/ui/plan/PlanAccordionData;", "", "Lcom/paypal/oslo/feature/moneymovement/api/ui/plan/PlanAccordionData$State;", "state", "<init>", "(Lcom/paypal/oslo/feature/moneymovement/api/ui/plan/PlanAccordionData$State;)V", "component1", "()Lcom/paypal/oslo/feature/moneymovement/api/ui/plan/PlanAccordionData$State;", "copy", "(Lcom/paypal/oslo/feature/moneymovement/api/ui/plan/PlanAccordionData$State;)Lcom/paypal/oslo/feature/moneymovement/api/ui/plan/PlanAccordionData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/moneymovement/api/ui/plan/PlanAccordionData$State;", "getState", "Companion", "State"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PlanAccordionData {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData.Companion INSTANCE = new com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData.Companion(null);
    private final com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData.State state;

    public PlanAccordionData(com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData.State state) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        this.state = state;
    }

    public final com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData.State getState() {
        return this.state;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/ui/plan/PlanAccordionData$State;", "", "Loading", com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY, "Lcom/paypal/oslo/feature/moneymovement/api/ui/plan/PlanAccordionData$State$Loading;", "Lcom/paypal/oslo/feature/moneymovement/api/ui/plan/PlanAccordionData$State$Ready;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface State {

        @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0003\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/ui/plan/PlanAccordionData$State$Loading;", "Lcom/paypal/oslo/feature/moneymovement/api/ui/plan/PlanAccordionData$State;", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.IS_EXPANDED, "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/moneymovement/api/ui/plan/PlanAccordionData$State$Loading;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Loading implements com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData.State {
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
                return (other instanceof com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData.State.Loading) && this.isExpanded == ((com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData.State.Loading) other).isExpanded;
            }

            public final com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData.State.Loading copy(boolean isExpanded) {
                return new com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData.State.Loading(isExpanded);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getIsExpanded() {
                return this.isExpanded;
            }

            public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData.State.Loading copy$default(com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData.State.Loading loading, boolean z, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    z = loading.isExpanded;
                }
                return loading.copy(z);
            }

            public Loading() {
                this(false, 1, null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0018\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0012J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJj\u0010\u001d\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b&\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b\b\u0010\u0016R\u001a\u0010\t\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010\u0016R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b-\u0010\u0012R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010.\u001a\u0004\b/\u0010\u001aR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00100\u001a\u0004\b1\u0010\u001cR\u0013\u00104\u001a\u0004\u0018\u00010\u00038G¢\u0006\u0006\u001a\u0004\b2\u00103"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/ui/plan/PlanAccordionData$State$Ready;", "Lcom/paypal/oslo/feature/moneymovement/api/ui/plan/PlanAccordionData$State;", "", "Lcom/paypal/oslo/feature/moneymovement/api/domain/PaymentPlan;", "plans", "", "selectedPlanId", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.IS_EXPANDED, "enabled", "unavailablePlans", "Lcom/paypal/oslo/feature/moneymovement/api/ui/plan/BannerData;", "banner", "Lcom/paypal/oslo/feature/moneymovement/api/ui/plan/ContextualAlertData;", "contextualAlert", "<init>", "(Ljava/util/List;Ljava/lang/String;ZZLjava/util/List;Lcom/paypal/oslo/feature/moneymovement/api/ui/plan/BannerData;Lcom/paypal/oslo/feature/moneymovement/api/ui/plan/ContextualAlertData;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "()Z", "component4", "component5", "component6", "()Lcom/paypal/oslo/feature/moneymovement/api/ui/plan/BannerData;", "component7", "()Lcom/paypal/oslo/feature/moneymovement/api/ui/plan/ContextualAlertData;", "copy", "(Ljava/util/List;Ljava/lang/String;ZZLjava/util/List;Lcom/paypal/oslo/feature/moneymovement/api/ui/plan/BannerData;Lcom/paypal/oslo/feature/moneymovement/api/ui/plan/ContextualAlertData;)Lcom/paypal/oslo/feature/moneymovement/api/ui/plan/PlanAccordionData$State$Ready;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/List;", "getPlans", "Ljava/lang/String;", "getSelectedPlanId", "Z", "getEnabled", "getUnavailablePlans", "Lcom/paypal/oslo/feature/moneymovement/api/ui/plan/BannerData;", "getBanner", "Lcom/paypal/oslo/feature/moneymovement/api/ui/plan/ContextualAlertData;", "getContextualAlert", "getSelectedPlan", "()Lcom/paypal/oslo/feature/moneymovement/api/domain/PaymentPlan;", "selectedPlan"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Ready implements com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData.State {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.moneymovement.api.ui.plan.BannerData banner;
            private final com.paypal.oslo.feature.moneymovement.api.ui.plan.ContextualAlertData contextualAlert;
            private final boolean enabled;
            private final boolean isExpanded;
            private final java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.PaymentPlan> plans;
            private final java.lang.String selectedPlanId;
            private final java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.PaymentPlan> unavailablePlans;

            public Ready(java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.PaymentPlan> list, java.lang.String str, boolean z, boolean z2, java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.PaymentPlan> list2, com.paypal.oslo.feature.moneymovement.api.ui.plan.BannerData bannerData, com.paypal.oslo.feature.moneymovement.api.ui.plan.ContextualAlertData contextualAlertData) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
                this.plans = list;
                this.selectedPlanId = str;
                this.isExpanded = z;
                this.enabled = z2;
                this.unavailablePlans = list2;
                this.banner = bannerData;
                this.contextualAlert = contextualAlertData;
            }

            public /* synthetic */ Ready(java.util.List list, java.lang.String str, boolean z, boolean z2, java.util.List list2, com.paypal.oslo.feature.moneymovement.api.ui.plan.BannerData bannerData, com.paypal.oslo.feature.moneymovement.api.ui.plan.ContextualAlertData contextualAlertData, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? false : z, (i & 8) != 0 ? true : z2, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? null : bannerData, (i & 64) == 0 ? contextualAlertData : null);
            }

            public final java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.PaymentPlan> getPlans() {
                return this.plans;
            }

            public final java.lang.String getSelectedPlanId() {
                return this.selectedPlanId;
            }

            public final boolean isExpanded() {
                return this.isExpanded;
            }

            public final boolean getEnabled() {
                return this.enabled;
            }

            public final java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.PaymentPlan> getUnavailablePlans() {
                return this.unavailablePlans;
            }

            public final com.paypal.oslo.feature.moneymovement.api.ui.plan.BannerData getBanner() {
                return this.banner;
            }

            public final com.paypal.oslo.feature.moneymovement.api.ui.plan.ContextualAlertData getContextualAlert() {
                return this.contextualAlert;
            }

            public final com.paypal.oslo.feature.moneymovement.api.domain.PaymentPlan getSelectedPlan() {
                java.lang.Object obj;
                java.util.Iterator<T> it = this.plans.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.moneymovement.api.domain.PaymentPlan) obj).getId(), this.selectedPlanId)) {
                        break;
                    }
                }
                return (com.paypal.oslo.feature.moneymovement.api.domain.PaymentPlan) obj;
            }

            public final java.lang.String toString() {
                java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.PaymentPlan> list = this.plans;
                java.lang.String str = this.selectedPlanId;
                boolean z = this.isExpanded;
                boolean z2 = this.enabled;
                java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.PaymentPlan> list2 = this.unavailablePlans;
                com.paypal.oslo.feature.moneymovement.api.ui.plan.BannerData bannerData = this.banner;
                com.paypal.oslo.feature.moneymovement.api.ui.plan.ContextualAlertData contextualAlertData = this.contextualAlert;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Ready(plans=");
                sb.append(list);
                sb.append(", selectedPlanId=");
                sb.append(str);
                sb.append(", isExpanded=");
                sb.append(z);
                sb.append(", enabled=");
                sb.append(z2);
                sb.append(", unavailablePlans=");
                sb.append(list2);
                sb.append(", banner=");
                sb.append(bannerData);
                sb.append(", contextualAlert=");
                sb.append(contextualAlertData);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = this.plans.hashCode();
                java.lang.String str = this.selectedPlanId;
                int hashCode2 = str == null ? 0 : str.hashCode();
                int hashCode3 = java.lang.Boolean.hashCode(this.isExpanded);
                int hashCode4 = java.lang.Boolean.hashCode(this.enabled);
                java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.PaymentPlan> list = this.unavailablePlans;
                int hashCode5 = list == null ? 0 : list.hashCode();
                com.paypal.oslo.feature.moneymovement.api.ui.plan.BannerData bannerData = this.banner;
                int hashCode6 = bannerData == null ? 0 : bannerData.hashCode();
                com.paypal.oslo.feature.moneymovement.api.ui.plan.ContextualAlertData contextualAlertData = this.contextualAlert;
                return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (contextualAlertData != null ? contextualAlertData.hashCode() : 0);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData.State.Ready)) {
                    return false;
                }
                com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData.State.Ready ready = (com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData.State.Ready) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.plans, ready.plans) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedPlanId, ready.selectedPlanId) && this.isExpanded == ready.isExpanded && this.enabled == ready.enabled && kotlin.jvm.internal.Intrinsics.areEqual(this.unavailablePlans, ready.unavailablePlans) && kotlin.jvm.internal.Intrinsics.areEqual(this.banner, ready.banner) && kotlin.jvm.internal.Intrinsics.areEqual(this.contextualAlert, ready.contextualAlert);
            }

            public final com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData.State.Ready copy(java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.PaymentPlan> plans, java.lang.String selectedPlanId, boolean isExpanded, boolean enabled, java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.PaymentPlan> unavailablePlans, com.paypal.oslo.feature.moneymovement.api.ui.plan.BannerData banner, com.paypal.oslo.feature.moneymovement.api.ui.plan.ContextualAlertData contextualAlert) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(plans, "");
                return new com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData.State.Ready(plans, selectedPlanId, isExpanded, enabled, unavailablePlans, banner, contextualAlert);
            }

            /* renamed from: component7, reason: from getter */
            public final com.paypal.oslo.feature.moneymovement.api.ui.plan.ContextualAlertData getContextualAlert() {
                return this.contextualAlert;
            }

            /* renamed from: component6, reason: from getter */
            public final com.paypal.oslo.feature.moneymovement.api.ui.plan.BannerData getBanner() {
                return this.banner;
            }

            public final java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.PaymentPlan> component5() {
                return this.unavailablePlans;
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
            public final java.lang.String getSelectedPlanId() {
                return this.selectedPlanId;
            }

            public final java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.PaymentPlan> component1() {
                return this.plans;
            }

            public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData.State.Ready copy$default(com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData.State.Ready ready, java.util.List list, java.lang.String str, boolean z, boolean z2, java.util.List list2, com.paypal.oslo.feature.moneymovement.api.ui.plan.BannerData bannerData, com.paypal.oslo.feature.moneymovement.api.ui.plan.ContextualAlertData contextualAlertData, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    list = ready.plans;
                }
                if ((i & 2) != 0) {
                    str = ready.selectedPlanId;
                }
                java.lang.String str2 = str;
                if ((i & 4) != 0) {
                    z = ready.isExpanded;
                }
                boolean z3 = z;
                if ((i & 8) != 0) {
                    z2 = ready.enabled;
                }
                boolean z4 = z2;
                if ((i & 16) != 0) {
                    list2 = ready.unavailablePlans;
                }
                java.util.List list3 = list2;
                if ((i & 32) != 0) {
                    bannerData = ready.banner;
                }
                com.paypal.oslo.feature.moneymovement.api.ui.plan.BannerData bannerData2 = bannerData;
                if ((i & 64) != 0) {
                    contextualAlertData = ready.contextualAlert;
                }
                return ready.copy(list, str2, z3, z4, list3, bannerData2, contextualAlertData);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJe\u0010\u0014\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/ui/plan/PlanAccordionData$Companion;", "", "<init>", "()V", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.IS_EXPANDED, "Lcom/paypal/oslo/feature/moneymovement/api/ui/plan/PlanAccordionData;", "loading", "(Z)Lcom/paypal/oslo/feature/moneymovement/api/ui/plan/PlanAccordionData;", "", "Lcom/paypal/oslo/feature/moneymovement/api/domain/PaymentPlan;", "plans", "", "selectedPlanId", "unavailablePlans", "Lcom/paypal/oslo/feature/moneymovement/api/ui/plan/BannerData;", "banner", "loadingIsExpanded", "Lcom/paypal/oslo/feature/moneymovement/api/ui/plan/ContextualAlertData;", "contextualAlert", "fromDomain", "(Ljava/util/List;Ljava/lang/String;ZLjava/util/List;Lcom/paypal/oslo/feature/moneymovement/api/ui/plan/BannerData;ZLcom/paypal/oslo/feature/moneymovement/api/ui/plan/ContextualAlertData;)Lcom/paypal/oslo/feature/moneymovement/api/ui/plan/PlanAccordionData;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData loading$default(com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData.Companion companion, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return companion.loading(z);
        }

        public final com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData loading(boolean isExpanded) {
            return new com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData(new com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData.State.Loading(isExpanded));
        }

        public final com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData fromDomain(java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.PaymentPlan> plans, java.lang.String selectedPlanId, boolean isExpanded, java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.PaymentPlan> unavailablePlans, com.paypal.oslo.feature.moneymovement.api.ui.plan.BannerData banner, boolean loadingIsExpanded, com.paypal.oslo.feature.moneymovement.api.ui.plan.ContextualAlertData contextualAlert) {
            java.lang.String str;
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(plans, "");
            if (selectedPlanId == null) {
                java.util.Iterator<T> it = plans.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((com.paypal.oslo.feature.moneymovement.api.domain.PaymentPlan) obj).isDefault()) {
                        break;
                    }
                }
                com.paypal.oslo.feature.moneymovement.api.domain.PaymentPlan paymentPlan = (com.paypal.oslo.feature.moneymovement.api.domain.PaymentPlan) obj;
                str = paymentPlan != null ? paymentPlan.getId() : null;
            } else {
                str = selectedPlanId;
            }
            return new com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData(new com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData.State.Ready(plans, str, isExpanded || loadingIsExpanded, false, unavailablePlans, banner, contextualAlert, 8, null));
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData.State state = this.state;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PlanAccordionData(state=");
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
        return (other instanceof com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData) && kotlin.jvm.internal.Intrinsics.areEqual(this.state, ((com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData) other).state);
    }

    public final com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData copy(com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData.State state) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        return new com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData(state);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData.State getState() {
        return this.state;
    }

    public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData copy$default(com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData planAccordionData, com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData.State state, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            state = planAccordionData.state;
        }
        return planAccordionData.copy(state);
    }
}
