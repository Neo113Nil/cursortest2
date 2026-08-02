package com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\r\u000e\u000f"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/ui/components/datefield/mvi/MosaicDateFieldUiState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Initial", com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY, "Error", "Lcom/paypal/oslo/feature/mosaic/ui/components/datefield/mvi/MosaicDateFieldUiState$Error;", "Lcom/paypal/oslo/feature/mosaic/ui/components/datefield/mvi/MosaicDateFieldUiState$Initial;", "Lcom/paypal/oslo/feature/mosaic/ui/components/datefield/mvi/MosaicDateFieldUiState$Ready;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class MosaicDateFieldUiState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    private MosaicDateFieldUiState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/ui/components/datefield/mvi/MosaicDateFieldUiState$Initial;", "Lcom/paypal/oslo/feature/mosaic/ui/components/datefield/mvi/MosaicDateFieldUiState;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Initial extends com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiState.Initial INSTANCE = new com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiState.Initial();

        private Initial() {
            super("Initial", null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/ui/components/datefield/mvi/MosaicDateFieldUiState$Ready;", "Lcom/paypal/oslo/feature/mosaic/ui/components/datefield/mvi/MosaicDateFieldUiState;", "Lcom/paypal/oslo/feature/mosaic/ui/components/datefield/mvi/MosaicDateFieldUiModel;", "uiModel", "<init>", "(Lcom/paypal/oslo/feature/mosaic/ui/components/datefield/mvi/MosaicDateFieldUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/mosaic/ui/components/datefield/mvi/MosaicDateFieldUiModel;", "copy", "(Lcom/paypal/oslo/feature/mosaic/ui/components/datefield/mvi/MosaicDateFieldUiModel;)Lcom/paypal/oslo/feature/mosaic/ui/components/datefield/mvi/MosaicDateFieldUiState$Ready;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/mosaic/ui/components/datefield/mvi/MosaicDateFieldUiModel;", "getUiModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Ready extends com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiModel uiModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ready(com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiModel mosaicDateFieldUiModel) {
            super(com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mosaicDateFieldUiModel, "");
            this.uiModel = mosaicDateFieldUiModel;
        }

        public final com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiModel getUiModel() {
            return this.uiModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiModel mosaicDateFieldUiModel = this.uiModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Ready(uiModel=");
            sb.append(mosaicDateFieldUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.uiModel.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiState.Ready) && kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, ((com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiState.Ready) other).uiModel);
        }

        public final com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiState.Ready copy(com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiModel uiModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            return new com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiState.Ready(uiModel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiModel getUiModel() {
            return this.uiModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiState.Ready copy$default(com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiState.Ready ready, com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiModel mosaicDateFieldUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                mosaicDateFieldUiModel = ready.uiModel;
            }
            return ready.copy(mosaicDateFieldUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/ui/components/datefield/mvi/MosaicDateFieldUiState$Error;", "Lcom/paypal/oslo/feature/mosaic/ui/components/datefield/mvi/MosaicDateFieldUiState;", "Lcom/paypal/oslo/feature/mosaic/ui/components/datefield/mvi/MosaicDateFieldUiModel;", "uiModel", "<init>", "(Lcom/paypal/oslo/feature/mosaic/ui/components/datefield/mvi/MosaicDateFieldUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/mosaic/ui/components/datefield/mvi/MosaicDateFieldUiModel;", "copy", "(Lcom/paypal/oslo/feature/mosaic/ui/components/datefield/mvi/MosaicDateFieldUiModel;)Lcom/paypal/oslo/feature/mosaic/ui/components/datefield/mvi/MosaicDateFieldUiState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/mosaic/ui/components/datefield/mvi/MosaicDateFieldUiModel;", "getUiModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiModel uiModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiModel mosaicDateFieldUiModel) {
            super("Error", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mosaicDateFieldUiModel, "");
            this.uiModel = mosaicDateFieldUiModel;
        }

        public final com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiModel getUiModel() {
            return this.uiModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiModel mosaicDateFieldUiModel = this.uiModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(uiModel=");
            sb.append(mosaicDateFieldUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.uiModel.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiState.Error) && kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, ((com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiState.Error) other).uiModel);
        }

        public final com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiState.Error copy(com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiModel uiModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            return new com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiState.Error(uiModel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiModel getUiModel() {
            return this.uiModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiState.Error copy$default(com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiState.Error error, com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiModel mosaicDateFieldUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                mosaicDateFieldUiModel = error.uiModel;
            }
            return error.copy(mosaicDateFieldUiModel);
        }
    }

    public /* synthetic */ MosaicDateFieldUiState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
