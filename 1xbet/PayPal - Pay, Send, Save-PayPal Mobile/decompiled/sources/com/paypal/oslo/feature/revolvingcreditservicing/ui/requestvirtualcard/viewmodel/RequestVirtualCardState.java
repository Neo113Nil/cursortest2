package com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0004\u0010\u0011\u0012\u0013B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0003\u0014\u0015\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/requestvirtualcard/viewmodel/RequestVirtualCardState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/requestvirtualcard/viewmodel/RequestVirtualCardState$ReadyInfo;", "p1", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/requestvirtualcard/viewmodel/RequestVirtualCardState$ReadyInfo;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "readyInfo", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/requestvirtualcard/viewmodel/RequestVirtualCardState$ReadyInfo;", "getReadyInfo", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/requestvirtualcard/viewmodel/RequestVirtualCardState$ReadyInfo;", com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY, "Loading", "Error", "ReadyInfo", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/requestvirtualcard/viewmodel/RequestVirtualCardState$Error;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/requestvirtualcard/viewmodel/RequestVirtualCardState$Loading;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/requestvirtualcard/viewmodel/RequestVirtualCardState$Ready;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class RequestVirtualCardState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardState.ReadyInfo readyInfo;

    private RequestVirtualCardState(java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardState.ReadyInfo readyInfo) {
        this.name = str;
        this.readyInfo = readyInfo;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardState.ReadyInfo getReadyInfo() {
        return this.readyInfo;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/requestvirtualcard/viewmodel/RequestVirtualCardState$Ready;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/requestvirtualcard/viewmodel/RequestVirtualCardState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/requestvirtualcard/viewmodel/RequestVirtualCardState$ReadyInfo;", "readyInfo", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/requestvirtualcard/viewmodel/RequestVirtualCardState$ReadyInfo;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Ready extends com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardState {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ready(com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardState.ReadyInfo readyInfo) {
            super(com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY, readyInfo, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readyInfo, "");
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/requestvirtualcard/viewmodel/RequestVirtualCardState$Loading;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/requestvirtualcard/viewmodel/RequestVirtualCardState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/requestvirtualcard/viewmodel/RequestVirtualCardState$ReadyInfo;", "readyInfo", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/requestvirtualcard/viewmodel/RequestVirtualCardState$ReadyInfo;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Loading extends com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardState {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loading(com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardState.ReadyInfo readyInfo) {
            super("Loading", readyInfo, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readyInfo, "");
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/requestvirtualcard/viewmodel/RequestVirtualCardState$Error;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/requestvirtualcard/viewmodel/RequestVirtualCardState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/requestvirtualcard/viewmodel/RequestVirtualCardState$ReadyInfo;", "readyInfo", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/requestvirtualcard/viewmodel/RequestVirtualCardErrorType;", "errorType", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/requestvirtualcard/viewmodel/RequestVirtualCardState$ReadyInfo;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/requestvirtualcard/viewmodel/RequestVirtualCardErrorType;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/requestvirtualcard/viewmodel/RequestVirtualCardErrorType;", "getErrorType", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/requestvirtualcard/viewmodel/RequestVirtualCardErrorType;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Error extends com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardErrorType errorType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardState.ReadyInfo readyInfo, com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardErrorType requestVirtualCardErrorType) {
            super("Error", readyInfo, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readyInfo, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestVirtualCardErrorType, "");
            this.errorType = requestVirtualCardErrorType;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardErrorType getErrorType() {
            return this.errorType;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/requestvirtualcard/viewmodel/RequestVirtualCardState$ReadyInfo;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/requestvirtualcard/uimodel/RequestVirtualCardUiModel;", "requestVirtualCardUiModel", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/requestvirtualcard/uimodel/RequestVirtualCardUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/requestvirtualcard/uimodel/RequestVirtualCardUiModel;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/requestvirtualcard/uimodel/RequestVirtualCardUiModel;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/requestvirtualcard/viewmodel/RequestVirtualCardState$ReadyInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/requestvirtualcard/uimodel/RequestVirtualCardUiModel;", "getRequestVirtualCardUiModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ReadyInfo {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.uimodel.RequestVirtualCardUiModel requestVirtualCardUiModel;

        public ReadyInfo(com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.uimodel.RequestVirtualCardUiModel requestVirtualCardUiModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestVirtualCardUiModel, "");
            this.requestVirtualCardUiModel = requestVirtualCardUiModel;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.uimodel.RequestVirtualCardUiModel getRequestVirtualCardUiModel() {
            return this.requestVirtualCardUiModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.uimodel.RequestVirtualCardUiModel requestVirtualCardUiModel = this.requestVirtualCardUiModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ReadyInfo(requestVirtualCardUiModel=");
            sb.append(requestVirtualCardUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.requestVirtualCardUiModel.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardState.ReadyInfo) && kotlin.jvm.internal.Intrinsics.areEqual(this.requestVirtualCardUiModel, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardState.ReadyInfo) other).requestVirtualCardUiModel);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardState.ReadyInfo copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.uimodel.RequestVirtualCardUiModel requestVirtualCardUiModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestVirtualCardUiModel, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardState.ReadyInfo(requestVirtualCardUiModel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.uimodel.RequestVirtualCardUiModel getRequestVirtualCardUiModel() {
            return this.requestVirtualCardUiModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardState.ReadyInfo copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardState.ReadyInfo readyInfo, com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.uimodel.RequestVirtualCardUiModel requestVirtualCardUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                requestVirtualCardUiModel = readyInfo.requestVirtualCardUiModel;
            }
            return readyInfo.copy(requestVirtualCardUiModel);
        }
    }

    public /* synthetic */ RequestVirtualCardState(java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardState.ReadyInfo readyInfo, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, readyInfo);
    }
}
