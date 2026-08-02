package com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\f\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\f\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Initialize", "Loading", "ShowCardEnrolledWidget", "ShowCardAcquisitionWidget", "Error", "Hide", "WidgetClicked", "ActionButtonClicked", "DidntGetCardLinkClicked", "EmptyStateApplyButtonClicked", "RetryButtonClicked", "RefreshData", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetEvent$ActionButtonClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetEvent$DidntGetCardLinkClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetEvent$EmptyStateApplyButtonClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetEvent$Error;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetEvent$Hide;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetEvent$Initialize;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetEvent$Loading;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetEvent$RefreshData;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetEvent$RetryButtonClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetEvent$ShowCardAcquisitionWidget;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetEvent$ShowCardEnrolledWidget;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetEvent$WidgetClicked;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class DebitCardWidgetEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private DebitCardWidgetEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetEvent$Initialize;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetEvent;", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardEntryPoint;", "entryPoint", "<init>", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardEntryPoint;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardEntryPoint;", "copy", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardEntryPoint;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetEvent$Initialize;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardEntryPoint;", "getEntryPoint"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initialize extends com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.debitcard.api.model.DebitCardEntryPoint entryPoint;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Initialize(com.paypal.oslo.feature.debitcard.api.model.DebitCardEntryPoint debitCardEntryPoint) {
            super("Initialize", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardEntryPoint, "");
            this.entryPoint = debitCardEntryPoint;
        }

        public final com.paypal.oslo.feature.debitcard.api.model.DebitCardEntryPoint getEntryPoint() {
            return this.entryPoint;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.api.model.DebitCardEntryPoint debitCardEntryPoint = this.entryPoint;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Initialize(entryPoint=");
            sb.append(debitCardEntryPoint);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.entryPoint.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.Initialize) && this.entryPoint == ((com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.Initialize) other).entryPoint;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.Initialize copy(com.paypal.oslo.feature.debitcard.api.model.DebitCardEntryPoint entryPoint) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryPoint, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.Initialize(entryPoint);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.api.model.DebitCardEntryPoint getEntryPoint() {
            return this.entryPoint;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.Initialize copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.Initialize initialize, com.paypal.oslo.feature.debitcard.api.model.DebitCardEntryPoint debitCardEntryPoint, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitCardEntryPoint = initialize.entryPoint;
            }
            return initialize.copy(debitCardEntryPoint);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetEvent$Loading;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.Loading INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.Loading();

        public final int hashCode() {
            return 1782171397;
        }

        private Loading() {
            super("Loading", null);
        }

        public final java.lang.String toString() {
            return "Loading";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.Loading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetEvent$ShowCardEnrolledWidget;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetEvent;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetState$Success;", "uiState", "<init>", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetState$Success;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetState$Success;", "copy", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetState$Success;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetEvent$ShowCardEnrolledWidget;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetState$Success;", "getUiState"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowCardEnrolledWidget extends com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.Success uiState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowCardEnrolledWidget(com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.Success success) {
            super("ShowCardEnrolledWidget", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(success, "");
            this.uiState = success;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.Success getUiState() {
            return this.uiState;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.Success success = this.uiState;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowCardEnrolledWidget(uiState=");
            sb.append(success);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.uiState.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.ShowCardEnrolledWidget) && kotlin.jvm.internal.Intrinsics.areEqual(this.uiState, ((com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.ShowCardEnrolledWidget) other).uiState);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.ShowCardEnrolledWidget copy(com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.Success uiState) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiState, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.ShowCardEnrolledWidget(uiState);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.Success getUiState() {
            return this.uiState;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.ShowCardEnrolledWidget copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.ShowCardEnrolledWidget showCardEnrolledWidget, com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.Success success, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                success = showCardEnrolledWidget.uiState;
            }
            return showCardEnrolledWidget.copy(success);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetEvent$ShowCardAcquisitionWidget;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetEvent;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/model/DebitCardWidgetEmptyStateUiModel;", "uiModel", "<init>", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/model/DebitCardWidgetEmptyStateUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/model/DebitCardWidgetEmptyStateUiModel;", "copy", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/model/DebitCardWidgetEmptyStateUiModel;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetEvent$ShowCardAcquisitionWidget;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/model/DebitCardWidgetEmptyStateUiModel;", "getUiModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowCardAcquisitionWidget extends com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.debitcard.servicing.ui.widget.model.DebitCardWidgetEmptyStateUiModel uiModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowCardAcquisitionWidget(com.paypal.oslo.feature.debitcard.servicing.ui.widget.model.DebitCardWidgetEmptyStateUiModel debitCardWidgetEmptyStateUiModel) {
            super("ShowCardAcquisitionWidget", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardWidgetEmptyStateUiModel, "");
            this.uiModel = debitCardWidgetEmptyStateUiModel;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.widget.model.DebitCardWidgetEmptyStateUiModel getUiModel() {
            return this.uiModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.servicing.ui.widget.model.DebitCardWidgetEmptyStateUiModel debitCardWidgetEmptyStateUiModel = this.uiModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowCardAcquisitionWidget(uiModel=");
            sb.append(debitCardWidgetEmptyStateUiModel);
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
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.ShowCardAcquisitionWidget) && kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, ((com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.ShowCardAcquisitionWidget) other).uiModel);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.ShowCardAcquisitionWidget copy(com.paypal.oslo.feature.debitcard.servicing.ui.widget.model.DebitCardWidgetEmptyStateUiModel uiModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.ShowCardAcquisitionWidget(uiModel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.servicing.ui.widget.model.DebitCardWidgetEmptyStateUiModel getUiModel() {
            return this.uiModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.ShowCardAcquisitionWidget copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.ShowCardAcquisitionWidget showCardAcquisitionWidget, com.paypal.oslo.feature.debitcard.servicing.ui.widget.model.DebitCardWidgetEmptyStateUiModel debitCardWidgetEmptyStateUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitCardWidgetEmptyStateUiModel = showCardAcquisitionWidget.uiModel;
            }
            return showCardAcquisitionWidget.copy(debitCardWidgetEmptyStateUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetEvent$Error;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.Error INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.Error();

        public final int hashCode() {
            return -1756457455;
        }

        private Error() {
            super("Error", null);
        }

        public final java.lang.String toString() {
            return "Error";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.Error)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetEvent$Hide;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Hide extends com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.Hide INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.Hide();

        public final int hashCode() {
            return -1580600295;
        }

        private Hide() {
            super("Hide", null);
        }

        public final java.lang.String toString() {
            return "Hide";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.Hide)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetEvent$WidgetClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class WidgetClicked extends com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.WidgetClicked INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.WidgetClicked();

        public final int hashCode() {
            return 891298892;
        }

        private WidgetClicked() {
            super("WidgetClicked", null);
        }

        public final java.lang.String toString() {
            return "WidgetClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.WidgetClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetEvent$ActionButtonClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ActionButtonClicked extends com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.ActionButtonClicked INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.ActionButtonClicked();

        public final int hashCode() {
            return -1998561720;
        }

        private ActionButtonClicked() {
            super("ActionButtonClicked", null);
        }

        public final java.lang.String toString() {
            return "ActionButtonClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.ActionButtonClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetEvent$DidntGetCardLinkClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DidntGetCardLinkClicked extends com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.DidntGetCardLinkClicked INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.DidntGetCardLinkClicked();

        public final int hashCode() {
            return 396986005;
        }

        private DidntGetCardLinkClicked() {
            super("DidntGetCardLinkClicked", null);
        }

        public final java.lang.String toString() {
            return "DidntGetCardLinkClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.DidntGetCardLinkClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetEvent$EmptyStateApplyButtonClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EmptyStateApplyButtonClicked extends com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.EmptyStateApplyButtonClicked INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.EmptyStateApplyButtonClicked();

        public final int hashCode() {
            return 722100226;
        }

        private EmptyStateApplyButtonClicked() {
            super("EmptyStateApplyButtonClicked", null);
        }

        public final java.lang.String toString() {
            return "EmptyStateApplyButtonClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.EmptyStateApplyButtonClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetEvent$RetryButtonClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RetryButtonClicked extends com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.RetryButtonClicked INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.RetryButtonClicked();

        public final int hashCode() {
            return -1179691676;
        }

        private RetryButtonClicked() {
            super("RetryButtonClicked", null);
        }

        public final java.lang.String toString() {
            return "RetryButtonClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.RetryButtonClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetEvent$RefreshData;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RefreshData extends com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.RefreshData INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.RefreshData();

        public final int hashCode() {
            return 1434905198;
        }

        private RefreshData() {
            super("RefreshData", null);
        }

        public final java.lang.String toString() {
            return "RefreshData";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.RefreshData)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ DebitCardWidgetEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
