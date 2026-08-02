package com.paypal.oslo.feature.mosaic.ui.legacy.mvi;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/ui/legacy/mvi/MosaicLegacyFlowUiEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "<init>", "()V", "EligibilityLoaded", "EligibilityFailed", "Lcom/paypal/oslo/feature/mosaic/ui/legacy/mvi/MosaicLegacyFlowUiEvent$EligibilityFailed;", "Lcom/paypal/oslo/feature/mosaic/ui/legacy/mvi/MosaicLegacyFlowUiEvent$EligibilityLoaded;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class MosaicLegacyFlowUiEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;

    private MosaicLegacyFlowUiEvent() {
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007R\u001a\u0010\u0017\u001a\u00020\u00128\u0017X\u0097D¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/ui/legacy/mvi/MosaicLegacyFlowUiEvent$EligibilityLoaded;", "Lcom/paypal/oslo/feature/mosaic/ui/legacy/mvi/MosaicLegacyFlowUiEvent;", "Lcom/paypal/oslo/feature/mosaic/domain/model/MosaicEligibility;", "eligibility", "<init>", "(Lcom/paypal/oslo/feature/mosaic/domain/model/MosaicEligibility;)V", "component1", "()Lcom/paypal/oslo/feature/mosaic/domain/model/MosaicEligibility;", "copy", "(Lcom/paypal/oslo/feature/mosaic/domain/model/MosaicEligibility;)Lcom/paypal/oslo/feature/mosaic/ui/legacy/mvi/MosaicLegacyFlowUiEvent$EligibilityLoaded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/mosaic/domain/model/MosaicEligibility;", "getEligibility", "name", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EligibilityLoaded extends com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowUiEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.mosaic.domain.model.MosaicEligibility eligibility;
        private final java.lang.String name;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EligibilityLoaded(com.paypal.oslo.feature.mosaic.domain.model.MosaicEligibility mosaicEligibility) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mosaicEligibility, "");
            this.eligibility = mosaicEligibility;
            this.name = "MosaicLegacyFlowUiEvent.EligibilityLoaded";
        }

        public final com.paypal.oslo.feature.mosaic.domain.model.MosaicEligibility getEligibility() {
            return this.eligibility;
        }

        @Override // com.paypal.oslo.core.mvi.Event
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.mosaic.domain.model.MosaicEligibility mosaicEligibility = this.eligibility;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("EligibilityLoaded(eligibility=");
            sb.append(mosaicEligibility);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.eligibility.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowUiEvent.EligibilityLoaded) && kotlin.jvm.internal.Intrinsics.areEqual(this.eligibility, ((com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowUiEvent.EligibilityLoaded) other).eligibility);
        }

        public final com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowUiEvent.EligibilityLoaded copy(com.paypal.oslo.feature.mosaic.domain.model.MosaicEligibility eligibility) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eligibility, "");
            return new com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowUiEvent.EligibilityLoaded(eligibility);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.mosaic.domain.model.MosaicEligibility getEligibility() {
            return this.eligibility;
        }

        public static /* synthetic */ com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowUiEvent.EligibilityLoaded copy$default(com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowUiEvent.EligibilityLoaded eligibilityLoaded, com.paypal.oslo.feature.mosaic.domain.model.MosaicEligibility mosaicEligibility, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                mosaicEligibility = eligibilityLoaded.eligibility;
            }
            return eligibilityLoaded.copy(mosaicEligibility);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\f8\u0017X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/ui/legacy/mvi/MosaicLegacyFlowUiEvent$EligibilityFailed;", "Lcom/paypal/oslo/feature/mosaic/ui/legacy/mvi/MosaicLegacyFlowUiEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "name", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EligibilityFailed extends com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowUiEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowUiEvent.EligibilityFailed INSTANCE = new com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowUiEvent.EligibilityFailed();
        private static final java.lang.String name = "MosaicLegacyFlowUiEvent.EligibilityFailed";

        public final int hashCode() {
            return -635820331;
        }

        private EligibilityFailed() {
            super(null);
        }

        @Override // com.paypal.oslo.core.mvi.Event
        public final java.lang.String getName() {
            return name;
        }

        public final java.lang.String toString() {
            return "EligibilityFailed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowUiEvent.EligibilityFailed)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ MosaicLegacyFlowUiEvent(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
