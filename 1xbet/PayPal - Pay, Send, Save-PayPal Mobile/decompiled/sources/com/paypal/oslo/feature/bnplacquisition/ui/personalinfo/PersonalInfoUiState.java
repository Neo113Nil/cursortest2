package com.paypal.oslo.feature.bnplacquisition.ui.personalinfo;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0007\n\u000b\f\r\u000e\u000f\u0010B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0006\u0011\u0012\u0013\u0014\u0015\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Initial", "Loading", "WithFormData", "Success", "ApiInputValidationError", "Error", "Decline", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiState$ApiInputValidationError;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiState$Decline;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiState$Error;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiState$Initial;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiState$Loading;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class PersonalInfoUiState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiState$WithFormData;", "", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiModel;", "getData", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiModel;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiState$ApiInputValidationError;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface WithFormData {
        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel getData();
    }

    private PersonalInfoUiState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiState$Initial;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initial extends com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.Initial INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.Initial();

        public final int hashCode() {
            return 149866661;
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
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.Initial)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiState$Loading;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiState;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiModel;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiModel;)Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiState$Loading;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiModel;", "getData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel data;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loading(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel personalInfoUiModel) {
            super("Loading", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(personalInfoUiModel, "");
            this.data = personalInfoUiModel;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel getData() {
            return this.data;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel personalInfoUiModel = this.data;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Loading(data=");
            sb.append(personalInfoUiModel);
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
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.Loading) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, ((com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.Loading) other).data);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.Loading copy(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.Loading(data);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel getData() {
            return this.data;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.Loading copy$default(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.Loading loading, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel personalInfoUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                personalInfoUiModel = loading.data;
            }
            return loading.copy(personalInfoUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiState$Success;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiState;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiState$WithFormData;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiModel;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiModel;)Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiState$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiModel;", "getData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState implements com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.WithFormData {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel data;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel personalInfoUiModel) {
            super("Success", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(personalInfoUiModel, "");
            this.data = personalInfoUiModel;
        }

        @Override // com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.WithFormData
        public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel getData() {
            return this.data;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel personalInfoUiModel = this.data;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(data=");
            sb.append(personalInfoUiModel);
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
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.Success) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, ((com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.Success) other).data);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.Success copy(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.Success(data);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel getData() {
            return this.data;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.Success copy$default(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.Success success, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel personalInfoUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                personalInfoUiModel = success.data;
            }
            return success.copy(personalInfoUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiState$ApiInputValidationError;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiState;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiState$WithFormData;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiModel;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiModel;)Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiState$ApiInputValidationError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiModel;", "getData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ApiInputValidationError extends com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState implements com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.WithFormData {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel data;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ApiInputValidationError(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel personalInfoUiModel) {
            super("ApiInputValidationError", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(personalInfoUiModel, "");
            this.data = personalInfoUiModel;
        }

        @Override // com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.WithFormData
        public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel getData() {
            return this.data;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel personalInfoUiModel = this.data;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ApiInputValidationError(data=");
            sb.append(personalInfoUiModel);
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
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.ApiInputValidationError) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, ((com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.ApiInputValidationError) other).data);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.ApiInputValidationError copy(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.ApiInputValidationError(data);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel getData() {
            return this.data;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.ApiInputValidationError copy$default(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.ApiInputValidationError apiInputValidationError, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel personalInfoUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                personalInfoUiModel = apiInputValidationError.data;
            }
            return apiInputValidationError.copy(personalInfoUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiState$Error;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiState;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "errorContent", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiModel;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiModel;)Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "getErrorContent", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiModel;", "getData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel data;
        private final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel errorContent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel personalInfoUiModel) {
            super("Error", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fullscreenErrorUiModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(personalInfoUiModel, "");
            this.errorContent = fullscreenErrorUiModel;
            this.data = personalInfoUiModel;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel getErrorContent() {
            return this.errorContent;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel getData() {
            return this.data;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel = this.errorContent;
            com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel personalInfoUiModel = this.data;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(errorContent=");
            sb.append(fullscreenErrorUiModel);
            sb.append(", data=");
            sb.append(personalInfoUiModel);
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
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.Error)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.Error error = (com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.Error) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.errorContent, error.errorContent) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, error.data);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.Error copy(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel errorContent, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorContent, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.Error(errorContent, data);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel getData() {
            return this.data;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel getErrorContent() {
            return this.errorContent;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.Error copy$default(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.Error error, com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel personalInfoUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                fullscreenErrorUiModel = error.errorContent;
            }
            if ((i & 2) != 0) {
                personalInfoUiModel = error.data;
            }
            return error.copy(fullscreenErrorUiModel, personalInfoUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiState$Decline;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiState;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "declineContent", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;)Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiState$Decline;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "getDeclineContent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Decline extends com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState {
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
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.Decline) && kotlin.jvm.internal.Intrinsics.areEqual(this.declineContent, ((com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.Decline) other).declineContent);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.Decline copy(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel declineContent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(declineContent, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.Decline(declineContent);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel getDeclineContent() {
            return this.declineContent;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.Decline copy$default(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.Decline decline, com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                fullscreenErrorUiModel = decline.declineContent;
            }
            return decline.copy(fullscreenErrorUiModel);
        }
    }

    public /* synthetic */ PersonalInfoUiState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
