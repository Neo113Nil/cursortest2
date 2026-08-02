package com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoUiState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Loading", "Success", "Error", "Decline", "Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoUiState$Decline;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoUiState$Error;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoUiState$Loading;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoUiState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class AdditionalInfoUiState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    private AdditionalInfoUiState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoUiState$Loading;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiState.Loading INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiState.Loading();

        public final int hashCode() {
            return -1791286915;
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
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiState.Loading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoUiState$Success;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoUiState;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoUiModel;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoUiModel;)Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoUiState$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoUiModel;", "getData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiModel data;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiModel additionalInfoUiModel) {
            super("Success", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(additionalInfoUiModel, "");
            this.data = additionalInfoUiModel;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiModel getData() {
            return this.data;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiModel additionalInfoUiModel = this.data;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(data=");
            sb.append(additionalInfoUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.data.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiState.Success) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, ((com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiState.Success) other).data);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiState.Success copy(com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiModel data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiState.Success(data);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiModel getData() {
            return this.data;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiState.Success copy$default(com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiState.Success success, com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiModel additionalInfoUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                additionalInfoUiModel = success.data;
            }
            return success.copy(additionalInfoUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoUiState$Error;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoUiState;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "errorContent", "Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoUiModel;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoUiModel;)Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoUiState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "getErrorContent", "Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoUiModel;", "getData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiModel data;
        private final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel errorContent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel, com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiModel additionalInfoUiModel) {
            super("Error", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fullscreenErrorUiModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(additionalInfoUiModel, "");
            this.errorContent = fullscreenErrorUiModel;
            this.data = additionalInfoUiModel;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel getErrorContent() {
            return this.errorContent;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiModel getData() {
            return this.data;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel = this.errorContent;
            com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiModel additionalInfoUiModel = this.data;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(errorContent=");
            sb.append(fullscreenErrorUiModel);
            sb.append(", data=");
            sb.append(additionalInfoUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.errorContent.hashCode() * 31) + this.data.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiState.Error)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiState.Error error = (com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiState.Error) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.errorContent, error.errorContent) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, error.data);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiState.Error copy(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel errorContent, com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiModel data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorContent, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiState.Error(errorContent, data);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiModel getData() {
            return this.data;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel getErrorContent() {
            return this.errorContent;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiState.Error copy$default(com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiState.Error error, com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel, com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiModel additionalInfoUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                fullscreenErrorUiModel = error.errorContent;
            }
            if ((i & 2) != 0) {
                additionalInfoUiModel = error.data;
            }
            return error.copy(fullscreenErrorUiModel, additionalInfoUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoUiState$Decline;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoUiState;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "declineContent", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;)Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoUiState$Decline;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "getDeclineContent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Decline extends com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel declineContent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Decline(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel) {
            super("Decline", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fullscreenErrorUiModel, "");
            this.declineContent = fullscreenErrorUiModel;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel getDeclineContent() {
            return this.declineContent;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel = this.declineContent;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Decline(declineContent=");
            sb.append(fullscreenErrorUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.declineContent.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiState.Decline) && kotlin.jvm.internal.Intrinsics.areEqual(this.declineContent, ((com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiState.Decline) other).declineContent);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiState.Decline copy(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel declineContent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(declineContent, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiState.Decline(declineContent);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel getDeclineContent() {
            return this.declineContent;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiState.Decline copy$default(com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiState.Decline decline, com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                fullscreenErrorUiModel = decline.declineContent;
            }
            return decline.copy(fullscreenErrorUiModel);
        }
    }

    public /* synthetic */ AdditionalInfoUiState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
