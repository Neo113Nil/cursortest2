package com.paypal.oslo.feature.mosaic.ui.webview.mvi;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/ui/webview/mvi/ComplianceWebViewUiEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "DataLoaded", "BackPressed", "CloseClicked", "ProcessCompleted", "Lcom/paypal/oslo/feature/mosaic/ui/webview/mvi/ComplianceWebViewUiEvent$BackPressed;", "Lcom/paypal/oslo/feature/mosaic/ui/webview/mvi/ComplianceWebViewUiEvent$CloseClicked;", "Lcom/paypal/oslo/feature/mosaic/ui/webview/mvi/ComplianceWebViewUiEvent$DataLoaded;", "Lcom/paypal/oslo/feature/mosaic/ui/webview/mvi/ComplianceWebViewUiEvent$ProcessCompleted;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class ComplianceWebViewUiEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private ComplianceWebViewUiEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/ui/webview/mvi/ComplianceWebViewUiEvent$DataLoaded;", "Lcom/paypal/oslo/feature/mosaic/ui/webview/mvi/ComplianceWebViewUiEvent;", "Lcom/paypal/oslo/feature/mosaic/ui/webview/mvi/ComplianceWebViewUIModel;", "uiModel", "<init>", "(Lcom/paypal/oslo/feature/mosaic/ui/webview/mvi/ComplianceWebViewUIModel;)V", "component1", "()Lcom/paypal/oslo/feature/mosaic/ui/webview/mvi/ComplianceWebViewUIModel;", "copy", "(Lcom/paypal/oslo/feature/mosaic/ui/webview/mvi/ComplianceWebViewUIModel;)Lcom/paypal/oslo/feature/mosaic/ui/webview/mvi/ComplianceWebViewUiEvent$DataLoaded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/mosaic/ui/webview/mvi/ComplianceWebViewUIModel;", "getUiModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DataLoaded extends com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUIModel uiModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DataLoaded(com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUIModel complianceWebViewUIModel) {
            super("DataLoaded", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(complianceWebViewUIModel, "");
            this.uiModel = complianceWebViewUIModel;
        }

        public final com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUIModel getUiModel() {
            return this.uiModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUIModel complianceWebViewUIModel = this.uiModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DataLoaded(uiModel=");
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
            return (other instanceof com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiEvent.DataLoaded) && kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, ((com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiEvent.DataLoaded) other).uiModel);
        }

        public final com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiEvent.DataLoaded copy(com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUIModel uiModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            return new com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiEvent.DataLoaded(uiModel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUIModel getUiModel() {
            return this.uiModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiEvent.DataLoaded copy$default(com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiEvent.DataLoaded dataLoaded, com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUIModel complianceWebViewUIModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                complianceWebViewUIModel = dataLoaded.uiModel;
            }
            return dataLoaded.copy(complianceWebViewUIModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/ui/webview/mvi/ComplianceWebViewUiEvent$BackPressed;", "Lcom/paypal/oslo/feature/mosaic/ui/webview/mvi/ComplianceWebViewUiEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BackPressed extends com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiEvent.BackPressed INSTANCE = new com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiEvent.BackPressed();

        public final int hashCode() {
            return 2003063455;
        }

        private BackPressed() {
            super("BackPressed", null);
        }

        public final java.lang.String toString() {
            return "BackPressed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiEvent.BackPressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/ui/webview/mvi/ComplianceWebViewUiEvent$CloseClicked;", "Lcom/paypal/oslo/feature/mosaic/ui/webview/mvi/ComplianceWebViewUiEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CloseClicked extends com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiEvent.CloseClicked INSTANCE = new com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiEvent.CloseClicked();

        public final int hashCode() {
            return -758007253;
        }

        private CloseClicked() {
            super("CloseClicked", null);
        }

        public final java.lang.String toString() {
            return "CloseClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiEvent.CloseClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/ui/webview/mvi/ComplianceWebViewUiEvent$ProcessCompleted;", "Lcom/paypal/oslo/feature/mosaic/ui/webview/mvi/ComplianceWebViewUiEvent;", "Lcom/paypal/oslo/feature/mosaic/api/navigation/result/MosaicLegacyNavResult;", "mosaicWebNavResult", "<init>", "(Lcom/paypal/oslo/feature/mosaic/api/navigation/result/MosaicLegacyNavResult;)V", "component1", "()Lcom/paypal/oslo/feature/mosaic/api/navigation/result/MosaicLegacyNavResult;", "copy", "(Lcom/paypal/oslo/feature/mosaic/api/navigation/result/MosaicLegacyNavResult;)Lcom/paypal/oslo/feature/mosaic/ui/webview/mvi/ComplianceWebViewUiEvent$ProcessCompleted;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/mosaic/api/navigation/result/MosaicLegacyNavResult;", "getMosaicWebNavResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ProcessCompleted extends com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiEvent {
        public static final int $stable = com.paypal.oslo.feature.mosaic.api.navigation.result.MosaicLegacyNavResult.$stable;
        private final com.paypal.oslo.feature.mosaic.api.navigation.result.MosaicLegacyNavResult mosaicWebNavResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProcessCompleted(com.paypal.oslo.feature.mosaic.api.navigation.result.MosaicLegacyNavResult mosaicLegacyNavResult) {
            super("ProcessCompleted", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mosaicLegacyNavResult, "");
            this.mosaicWebNavResult = mosaicLegacyNavResult;
        }

        public final com.paypal.oslo.feature.mosaic.api.navigation.result.MosaicLegacyNavResult getMosaicWebNavResult() {
            return this.mosaicWebNavResult;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.mosaic.api.navigation.result.MosaicLegacyNavResult mosaicLegacyNavResult = this.mosaicWebNavResult;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ProcessCompleted(mosaicWebNavResult=");
            sb.append(mosaicLegacyNavResult);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.mosaicWebNavResult.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiEvent.ProcessCompleted) && kotlin.jvm.internal.Intrinsics.areEqual(this.mosaicWebNavResult, ((com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiEvent.ProcessCompleted) other).mosaicWebNavResult);
        }

        public final com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiEvent.ProcessCompleted copy(com.paypal.oslo.feature.mosaic.api.navigation.result.MosaicLegacyNavResult mosaicWebNavResult) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mosaicWebNavResult, "");
            return new com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiEvent.ProcessCompleted(mosaicWebNavResult);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.mosaic.api.navigation.result.MosaicLegacyNavResult getMosaicWebNavResult() {
            return this.mosaicWebNavResult;
        }

        public static /* synthetic */ com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiEvent.ProcessCompleted copy$default(com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiEvent.ProcessCompleted processCompleted, com.paypal.oslo.feature.mosaic.api.navigation.result.MosaicLegacyNavResult mosaicLegacyNavResult, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                mosaicLegacyNavResult = processCompleted.mosaicWebNavResult;
            }
            return processCompleted.copy(mosaicLegacyNavResult);
        }
    }

    public /* synthetic */ ComplianceWebViewUiEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
