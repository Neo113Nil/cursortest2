package com.paypal.oslo.feature.mosaic.ui.legacy.mvi;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/ui/legacy/mvi/MosaicLegacyFlowUiState;", "Lcom/paypal/oslo/core/mvi/UiState;", "<init>", "()V", "Loading", "AdroitWebFlow", "MosaicWebFlow", "NativeFlow", "Lcom/paypal/oslo/feature/mosaic/ui/legacy/mvi/MosaicLegacyFlowUiState$AdroitWebFlow;", "Lcom/paypal/oslo/feature/mosaic/ui/legacy/mvi/MosaicLegacyFlowUiState$Loading;", "Lcom/paypal/oslo/feature/mosaic/ui/legacy/mvi/MosaicLegacyFlowUiState$MosaicWebFlow;", "Lcom/paypal/oslo/feature/mosaic/ui/legacy/mvi/MosaicLegacyFlowUiState$NativeFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class MosaicLegacyFlowUiState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;

    private MosaicLegacyFlowUiState() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\f8\u0017X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/ui/legacy/mvi/MosaicLegacyFlowUiState$Loading;", "Lcom/paypal/oslo/feature/mosaic/ui/legacy/mvi/MosaicLegacyFlowUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "name", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowUiState.Loading INSTANCE = new com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowUiState.Loading();
        private static final java.lang.String name = "MosaicLegacyFlowUiState.Loading";

        public final int hashCode() {
            return 1213396638;
        }

        private Loading() {
            super(null);
        }

        @Override // com.paypal.oslo.core.mvi.UiState
        public final java.lang.String getName() {
            return name;
        }

        public final java.lang.String toString() {
            return "Loading";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowUiState.Loading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\f8\u0017X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/ui/legacy/mvi/MosaicLegacyFlowUiState$AdroitWebFlow;", "Lcom/paypal/oslo/feature/mosaic/ui/legacy/mvi/MosaicLegacyFlowUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "name", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AdroitWebFlow extends com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowUiState.AdroitWebFlow INSTANCE = new com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowUiState.AdroitWebFlow();
        private static final java.lang.String name = "MosaicLegacyFlowUiState.AdroitWebFlow";

        public final int hashCode() {
            return -961370823;
        }

        private AdroitWebFlow() {
            super(null);
        }

        @Override // com.paypal.oslo.core.mvi.UiState
        public final java.lang.String getName() {
            return name;
        }

        public final java.lang.String toString() {
            return "AdroitWebFlow";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowUiState.AdroitWebFlow)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007R\u001a\u0010\u0015\u001a\u00020\u00028\u0017X\u0097D¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/ui/legacy/mvi/MosaicLegacyFlowUiState$MosaicWebFlow;", "Lcom/paypal/oslo/feature/mosaic/ui/legacy/mvi/MosaicLegacyFlowUiState;", "", "qualifiedIntentId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/mosaic/ui/legacy/mvi/MosaicLegacyFlowUiState$MosaicWebFlow;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getQualifiedIntentId", "name", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MosaicWebFlow extends com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowUiState {
        public static final int $stable = 0;
        private final java.lang.String name;
        private final java.lang.String qualifiedIntentId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MosaicWebFlow(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.qualifiedIntentId = str;
            this.name = "MosaicLegacyFlowUiState.MosaicWebFlow";
        }

        public final java.lang.String getQualifiedIntentId() {
            return this.qualifiedIntentId;
        }

        @Override // com.paypal.oslo.core.mvi.UiState
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.qualifiedIntentId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MosaicWebFlow(qualifiedIntentId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.qualifiedIntentId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowUiState.MosaicWebFlow) && kotlin.jvm.internal.Intrinsics.areEqual(this.qualifiedIntentId, ((com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowUiState.MosaicWebFlow) other).qualifiedIntentId);
        }

        public final com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowUiState.MosaicWebFlow copy(java.lang.String qualifiedIntentId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qualifiedIntentId, "");
            return new com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowUiState.MosaicWebFlow(qualifiedIntentId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getQualifiedIntentId() {
            return this.qualifiedIntentId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowUiState.MosaicWebFlow copy$default(com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowUiState.MosaicWebFlow mosaicWebFlow, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = mosaicWebFlow.qualifiedIntentId;
            }
            return mosaicWebFlow.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\f8\u0017X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/ui/legacy/mvi/MosaicLegacyFlowUiState$NativeFlow;", "Lcom/paypal/oslo/feature/mosaic/ui/legacy/mvi/MosaicLegacyFlowUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "name", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NativeFlow extends com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowUiState.NativeFlow INSTANCE = new com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowUiState.NativeFlow();
        private static final java.lang.String name = "MosaicLegacyFlowUiState.NativeFlow";

        public final int hashCode() {
            return 255211843;
        }

        private NativeFlow() {
            super(null);
        }

        @Override // com.paypal.oslo.core.mvi.UiState
        public final java.lang.String getName() {
            return name;
        }

        public final java.lang.String toString() {
            return "NativeFlow";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowUiState.NativeFlow)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ MosaicLegacyFlowUiState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
