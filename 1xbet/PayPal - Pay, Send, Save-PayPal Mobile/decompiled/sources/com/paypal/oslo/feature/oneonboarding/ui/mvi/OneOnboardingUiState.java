package com.paypal.oslo.feature.oneonboarding.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingUiState;", "Lcom/paypal/oslo/core/mvi/UiState;", "<init>", "()V", "Initial", "Loading", "Submitting", "Content", "TerminalStatus", "Error", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingUiState$Content;", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingUiState$Error;", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingUiState$Initial;", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingUiState$Loading;", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingUiState$Submitting;", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingUiState$TerminalStatus;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class OneOnboardingUiState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;

    private OneOnboardingUiState() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\f8\u0017X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingUiState$Initial;", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "name", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initial extends com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Initial INSTANCE = new com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Initial();
        private static final java.lang.String name = "OneOnboardingUiState.Initial";

        public final int hashCode() {
            return -785175492;
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
            if (!(other instanceof com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Initial)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007R\u001a\u0010\u0017\u001a\u00020\u00128\u0017X\u0097D¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingUiState$Loading;", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingUiState;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "intentId", "<init>", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;)V", "component1", "()Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "copy", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;)Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingUiState$Loading;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "getIntentId", "name", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId;
        private final java.lang.String name;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loading(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
            this.intentId = intentId;
            this.name = "OneOnboardingUiState.Loading";
        }

        public final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId getIntentId() {
            return this.intentId;
        }

        @Override // com.paypal.oslo.core.mvi.UiState
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId = this.intentId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Loading(intentId=");
            sb.append(intentId);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.intentId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Loading) && kotlin.jvm.internal.Intrinsics.areEqual(this.intentId, ((com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Loading) other).intentId);
        }

        public final com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Loading copy(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
            return new com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Loading(intentId);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId getIntentId() {
            return this.intentId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Loading copy$default(com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Loading loading, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                intentId = loading.intentId;
            }
            return loading.copy(intentId);
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u001e\u001a\u00020\u00178\u0017X\u0097D¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingUiState$Submitting;", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingUiState;", "Lcom/paypal/oslo/feature/oneonboarding/domain/Flow;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, "", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/CollectedItem;", "collectedItems", "<init>", "(Lcom/paypal/oslo/feature/oneonboarding/domain/Flow;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/oneonboarding/domain/Flow;", "component2", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/feature/oneonboarding/domain/Flow;Ljava/util/List;)Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingUiState$Submitting;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/oneonboarding/domain/Flow;", "getFlow", "Ljava/util/List;", "getCollectedItems", "name", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Submitting extends com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem> collectedItems;
        private final com.paypal.oslo.feature.oneonboarding.domain.Flow flow;
        private final java.lang.String name;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Submitting(com.paypal.oslo.feature.oneonboarding.domain.Flow flow, java.util.List<? extends com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem> list) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flow, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.flow = flow;
            this.collectedItems = list;
            this.name = "OneOnboardingUiState.Submitting";
        }

        public final com.paypal.oslo.feature.oneonboarding.domain.Flow getFlow() {
            return this.flow;
        }

        public /* synthetic */ Submitting(com.paypal.oslo.feature.oneonboarding.domain.Flow flow, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(flow, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
        }

        public final java.util.List<com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem> getCollectedItems() {
            return this.collectedItems;
        }

        @Override // com.paypal.oslo.core.mvi.UiState
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.oneonboarding.domain.Flow flow = this.flow;
            java.util.List<com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem> list = this.collectedItems;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Submitting(flow=");
            sb.append(flow);
            sb.append(", collectedItems=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.flow.hashCode() * 31) + this.collectedItems.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Submitting)) {
                return false;
            }
            com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Submitting submitting = (com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Submitting) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.flow, submitting.flow) && kotlin.jvm.internal.Intrinsics.areEqual(this.collectedItems, submitting.collectedItems);
        }

        public final com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Submitting copy(com.paypal.oslo.feature.oneonboarding.domain.Flow flow, java.util.List<? extends com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem> collectedItems) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flow, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collectedItems, "");
            return new com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Submitting(flow, collectedItems);
        }

        public final java.util.List<com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem> component2() {
            return this.collectedItems;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.oneonboarding.domain.Flow getFlow() {
            return this.flow;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Submitting copy$default(com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Submitting submitting, com.paypal.oslo.feature.oneonboarding.domain.Flow flow, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                flow = submitting.flow;
            }
            if ((i & 2) != 0) {
                list = submitting.collectedItems;
            }
            return submitting.copy(flow, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000bJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u001b\u001a\u00020\u00148\u0017X\u0097D¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0016R\u0013\u0010!\u001a\u0004\u0018\u00010\u001e8G¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010$\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010&\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b%\u0010#R\u0011\u0010(\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b'\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingUiState$Content;", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingUiState;", "Lcom/paypal/oslo/feature/oneonboarding/domain/Flow;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, "", "currentStepIndex", "<init>", "(Lcom/paypal/oslo/feature/oneonboarding/domain/Flow;I)V", "component1", "()Lcom/paypal/oslo/feature/oneonboarding/domain/Flow;", "component2", "()I", "copy", "(Lcom/paypal/oslo/feature/oneonboarding/domain/Flow;I)Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingUiState$Content;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/oneonboarding/domain/Flow;", "getFlow", com.visa.cbp.getEncExpo.warmup, "getCurrentStepIndex", "name", "Ljava/lang/String;", "getName", "Lcom/paypal/oslo/feature/oneonboarding/domain/StepComponentConfig;", "getCurrentStep", "()Lcom/paypal/oslo/feature/oneonboarding/domain/StepComponentConfig;", "currentStep", "getHasNextStep", "()Z", "hasNextStep", "getHasPreviousStep", "hasPreviousStep", "getTotalSteps", "totalSteps"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Content extends com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState {
        public static final int $stable = 8;
        private final int currentStepIndex;
        private final com.paypal.oslo.feature.oneonboarding.domain.Flow flow;
        private final java.lang.String name;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Content(com.paypal.oslo.feature.oneonboarding.domain.Flow flow, int i) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flow, "");
            this.flow = flow;
            this.currentStepIndex = i;
            this.name = "OneOnboardingUiState.Content";
        }

        public /* synthetic */ Content(com.paypal.oslo.feature.oneonboarding.domain.Flow flow, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(flow, (i2 & 2) != 0 ? 0 : i);
        }

        public final com.paypal.oslo.feature.oneonboarding.domain.Flow getFlow() {
            return this.flow;
        }

        public final int getCurrentStepIndex() {
            return this.currentStepIndex;
        }

        @Override // com.paypal.oslo.core.mvi.UiState
        public final java.lang.String getName() {
            return this.name;
        }

        public final com.paypal.oslo.feature.oneonboarding.domain.StepComponentConfig getCurrentStep() {
            return (com.paypal.oslo.feature.oneonboarding.domain.StepComponentConfig) kotlin.collections.CollectionsKt.getOrNull(this.flow.getSteps(), this.currentStepIndex);
        }

        public final boolean getHasNextStep() {
            return this.currentStepIndex < kotlin.collections.CollectionsKt.getLastIndex(this.flow.getSteps());
        }

        public final boolean getHasPreviousStep() {
            return this.currentStepIndex > 0;
        }

        public final int getTotalSteps() {
            return this.flow.getSteps().size();
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.oneonboarding.domain.Flow flow = this.flow;
            int i = this.currentStepIndex;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Content(flow=");
            sb.append(flow);
            sb.append(", currentStepIndex=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.flow.hashCode() * 31) + java.lang.Integer.hashCode(this.currentStepIndex);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Content)) {
                return false;
            }
            com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Content content = (com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Content) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.flow, content.flow) && this.currentStepIndex == content.currentStepIndex;
        }

        public final com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Content copy(com.paypal.oslo.feature.oneonboarding.domain.Flow flow, int currentStepIndex) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flow, "");
            return new com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Content(flow, currentStepIndex);
        }

        /* renamed from: component2, reason: from getter */
        public final int getCurrentStepIndex() {
            return this.currentStepIndex;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.oneonboarding.domain.Flow getFlow() {
            return this.flow;
        }

        public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Content copy$default(com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Content content, com.paypal.oslo.feature.oneonboarding.domain.Flow flow, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                flow = content.flow;
            }
            if ((i2 & 2) != 0) {
                i = content.currentStepIndex;
            }
            return content.copy(flow, i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007R\u001a\u0010\u0017\u001a\u00020\u00128\u0017X\u0097D¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingUiState$TerminalStatus;", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingUiState;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/Status;", "status", "<init>", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/Status;)V", "component1", "()Lcom/paypal/oslo/feature/oneonboarding/api/domain/Status;", "copy", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/Status;)Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingUiState$TerminalStatus;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/Status;", "getStatus", "name", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TerminalStatus extends com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState {
        public static final int $stable = 0;
        private final java.lang.String name;
        private final com.paypal.oslo.feature.oneonboarding.api.domain.Status status;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TerminalStatus(com.paypal.oslo.feature.oneonboarding.api.domain.Status status) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            this.status = status;
            this.name = "OneOnboardingUiState.TerminalStatus";
        }

        public final com.paypal.oslo.feature.oneonboarding.api.domain.Status getStatus() {
            return this.status;
        }

        @Override // com.paypal.oslo.core.mvi.UiState
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.oneonboarding.api.domain.Status status = this.status;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TerminalStatus(status=");
            sb.append(status);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.status.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.TerminalStatus) && this.status == ((com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.TerminalStatus) other).status;
        }

        public final com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.TerminalStatus copy(com.paypal.oslo.feature.oneonboarding.api.domain.Status status) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            return new com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.TerminalStatus(status);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.oneonboarding.api.domain.Status getStatus() {
            return this.status;
        }

        public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.TerminalStatus copy$default(com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.TerminalStatus terminalStatus, com.paypal.oslo.feature.oneonboarding.api.domain.Status status, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                status = terminalStatus.status;
            }
            return terminalStatus.copy(status);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u000fR\u001a\u0010#\u001a\u00020\u001a8\u0017X\u0097D¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingUiState$Error;", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingUiState;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "intentId", "Lcom/paypal/oslo/feature/oneonboarding/domain/error/FlowStepError;", "error", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingEvent$UserIntent$RetryableUserIntent;", "retryableEvent", "<init>", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;Lcom/paypal/oslo/feature/oneonboarding/domain/error/FlowStepError;Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingEvent$UserIntent$RetryableUserIntent;)V", "component1", "()Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "component2", "()Lcom/paypal/oslo/feature/oneonboarding/domain/error/FlowStepError;", "component3", "()Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingEvent$UserIntent$RetryableUserIntent;", "copy", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;Lcom/paypal/oslo/feature/oneonboarding/domain/error/FlowStepError;Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingEvent$UserIntent$RetryableUserIntent;)Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingUiState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "getIntentId", "Lcom/paypal/oslo/feature/oneonboarding/domain/error/FlowStepError;", "getError", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingEvent$UserIntent$RetryableUserIntent;", "getRetryableEvent", "name", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError error;
        private final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId;
        private final java.lang.String name;
        private final com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.RetryableUserIntent retryableEvent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError flowStepError, com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.RetryableUserIntent retryableUserIntent) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowStepError, "");
            this.intentId = intentId;
            this.error = flowStepError;
            this.retryableEvent = retryableUserIntent;
            this.name = "OneOnboardingUiState.Error";
        }

        public /* synthetic */ Error(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError flowStepError, com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.RetryableUserIntent retryableUserIntent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(intentId, flowStepError, (i & 4) != 0 ? null : retryableUserIntent);
        }

        public final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId getIntentId() {
            return this.intentId;
        }

        public final com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError getError() {
            return this.error;
        }

        public final com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.RetryableUserIntent getRetryableEvent() {
            return this.retryableEvent;
        }

        @Override // com.paypal.oslo.core.mvi.UiState
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId = this.intentId;
            com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError flowStepError = this.error;
            com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.RetryableUserIntent retryableUserIntent = this.retryableEvent;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(intentId=");
            sb.append(intentId);
            sb.append(", error=");
            sb.append(flowStepError);
            sb.append(", retryableEvent=");
            sb.append(retryableUserIntent);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.intentId.hashCode();
            int hashCode2 = this.error.hashCode();
            com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.RetryableUserIntent retryableUserIntent = this.retryableEvent;
            return (((hashCode * 31) + hashCode2) * 31) + (retryableUserIntent == null ? 0 : retryableUserIntent.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Error)) {
                return false;
            }
            com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Error error = (com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Error) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.intentId, error.intentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, error.error) && kotlin.jvm.internal.Intrinsics.areEqual(this.retryableEvent, error.retryableEvent);
        }

        public final com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Error copy(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError error, com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.RetryableUserIntent retryableEvent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Error(intentId, error, retryableEvent);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.RetryableUserIntent getRetryableEvent() {
            return this.retryableEvent;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError getError() {
            return this.error;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId getIntentId() {
            return this.intentId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Error copy$default(com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Error error, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError flowStepError, com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.RetryableUserIntent retryableUserIntent, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                intentId = error.intentId;
            }
            if ((i & 2) != 0) {
                flowStepError = error.error;
            }
            if ((i & 4) != 0) {
                retryableUserIntent = error.retryableEvent;
            }
            return error.copy(intentId, flowStepError, retryableUserIntent);
        }
    }

    public /* synthetic */ OneOnboardingUiState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
