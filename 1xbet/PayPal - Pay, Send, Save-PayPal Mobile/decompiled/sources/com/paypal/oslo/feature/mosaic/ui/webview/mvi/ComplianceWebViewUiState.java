package com.paypal.oslo.feature.mosaic.ui.webview.mvi;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\f\r"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/ui/webview/mvi/ComplianceWebViewUiState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Initial", "Success", "Lcom/paypal/oslo/feature/mosaic/ui/webview/mvi/ComplianceWebViewUiState$Initial;", "Lcom/paypal/oslo/feature/mosaic/ui/webview/mvi/ComplianceWebViewUiState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class ComplianceWebViewUiState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    private ComplianceWebViewUiState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/ui/webview/mvi/ComplianceWebViewUiState$Initial;", "Lcom/paypal/oslo/feature/mosaic/ui/webview/mvi/ComplianceWebViewUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initial extends com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiState.Initial INSTANCE = new com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiState.Initial();

        public final int hashCode() {
            return -809162337;
        }

        private Initial() {
            super("Initial", null);
        }

        public final java.lang.String toString() {
            return "Initial";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiState.Initial)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/ui/webview/mvi/ComplianceWebViewUiState$Success;", "Lcom/paypal/oslo/feature/mosaic/ui/webview/mvi/ComplianceWebViewUiState;", "Lcom/paypal/oslo/feature/mosaic/ui/webview/mvi/ComplianceWebViewUIModel;", "uiModel", "<init>", "(Lcom/paypal/oslo/feature/mosaic/ui/webview/mvi/ComplianceWebViewUIModel;)V", "component1", "()Lcom/paypal/oslo/feature/mosaic/ui/webview/mvi/ComplianceWebViewUIModel;", "copy", "(Lcom/paypal/oslo/feature/mosaic/ui/webview/mvi/ComplianceWebViewUIModel;)Lcom/paypal/oslo/feature/mosaic/ui/webview/mvi/ComplianceWebViewUiState$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/mosaic/ui/webview/mvi/ComplianceWebViewUIModel;", "getUiModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUIModel uiModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUIModel complianceWebViewUIModel) {
            super("Success", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(complianceWebViewUIModel, "");
            this.uiModel = complianceWebViewUIModel;
        }

        public final com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUIModel getUiModel() {
            return this.uiModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUIModel complianceWebViewUIModel = this.uiModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(uiModel=");
            sb.append(complianceWebViewUIModel);
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
            return (other instanceof com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiState.Success) && kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, ((com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiState.Success) other).uiModel);
        }

        public final com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiState.Success copy(com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUIModel uiModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            return new com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiState.Success(uiModel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUIModel getUiModel() {
            return this.uiModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiState.Success copy$default(com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiState.Success success, com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUIModel complianceWebViewUIModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                complianceWebViewUIModel = success.uiModel;
            }
            return success.copy(complianceWebViewUIModel);
        }
    }

    public /* synthetic */ ComplianceWebViewUiState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
