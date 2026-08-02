package com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0001\nB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0001\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY, "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewState$Ready;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class AcquisitionWebViewState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    private AcquisitionWebViewState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewState$Ready;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewState;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/common/logger/Loggable;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewData;", "configData", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewData;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewData;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewData;)Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewState$Ready;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewData;", "getConfigData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Ready extends com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewState implements com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.Loggable {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewData configData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ready(com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewData acquisitionWebViewData) {
            super(com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(acquisitionWebViewData, "");
            this.configData = acquisitionWebViewData;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        @Override // com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getPiiParams() {
            return super.getPiiParams();
        }

        public final com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewData getConfigData() {
            return this.configData;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewData acquisitionWebViewData = this.configData;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Ready(configData=");
            sb.append(acquisitionWebViewData);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.configData.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewState.Ready) && kotlin.jvm.internal.Intrinsics.areEqual(this.configData, ((com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewState.Ready) other).configData);
        }

        public final com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewState.Ready copy(com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewData configData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configData, "");
            return new com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewState.Ready(configData);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewData getConfigData() {
            return this.configData;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewState.Ready copy$default(com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewState.Ready ready, com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewData acquisitionWebViewData, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                acquisitionWebViewData = ready.configData;
            }
            return ready.copy(acquisitionWebViewData);
        }
    }

    public /* synthetic */ AcquisitionWebViewState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
