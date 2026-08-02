package com.paypal.oslo.feature.publicprofile.ui.publicprofile.state;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\r\u000e\u000f"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/state/PublicProfileUiState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Loading", "Success", "Error", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/state/PublicProfileUiState$Error;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/state/PublicProfileUiState$Loading;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/state/PublicProfileUiState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class PublicProfileUiState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    private PublicProfileUiState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/state/PublicProfileUiState$Loading;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/state/PublicProfileUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.publicprofile.ui.publicprofile.state.PublicProfileUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.publicprofile.ui.publicprofile.state.PublicProfileUiState.Loading INSTANCE = new com.paypal.oslo.feature.publicprofile.ui.publicprofile.state.PublicProfileUiState.Loading();

        public final int hashCode() {
            return 997365137;
        }

        private Loading() {
            super("PublicProfileUiState.Loading", null);
        }

        public final java.lang.String toString() {
            return "Loading";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.state.PublicProfileUiState.Loading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JD\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b\u0005\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b\u0006\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/state/PublicProfileUiState$Success;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/state/PublicProfileUiState;", "Lcom/paypal/oslo/feature/publicprofile/domain/model/PublicProfile;", "profile", "", "isTogglingFavorite", "isProcessing", "showOperationError", "", "operationErrorCode", "<init>", "(Lcom/paypal/oslo/feature/publicprofile/domain/model/PublicProfile;ZZZLjava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/publicprofile/domain/model/PublicProfile;", "component2", "()Z", "component3", "component4", "component5", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/publicprofile/domain/model/PublicProfile;ZZZLjava/lang/String;)Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/state/PublicProfileUiState$Success;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/publicprofile/domain/model/PublicProfile;", "getProfile", "Z", "getShowOperationError", "Ljava/lang/String;", "getOperationErrorCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.publicprofile.ui.publicprofile.state.PublicProfileUiState {
        public static final int $stable = 0;
        private final boolean isProcessing;
        private final boolean isTogglingFavorite;
        private final java.lang.String operationErrorCode;
        private final com.paypal.oslo.feature.publicprofile.domain.model.PublicProfile profile;
        private final boolean showOperationError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(com.paypal.oslo.feature.publicprofile.domain.model.PublicProfile publicProfile, boolean z, boolean z2, boolean z3, java.lang.String str) {
            super("PublicProfileUiState.Success", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicProfile, "");
            this.profile = publicProfile;
            this.isTogglingFavorite = z;
            this.isProcessing = z2;
            this.showOperationError = z3;
            this.operationErrorCode = str;
        }

        public /* synthetic */ Success(com.paypal.oslo.feature.publicprofile.domain.model.PublicProfile publicProfile, boolean z, boolean z2, boolean z3, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(publicProfile, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? null : str);
        }

        public final com.paypal.oslo.feature.publicprofile.domain.model.PublicProfile getProfile() {
            return this.profile;
        }

        public final boolean isTogglingFavorite() {
            return this.isTogglingFavorite;
        }

        public final boolean isProcessing() {
            return this.isProcessing;
        }

        public final boolean getShowOperationError() {
            return this.showOperationError;
        }

        public final java.lang.String getOperationErrorCode() {
            return this.operationErrorCode;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.publicprofile.domain.model.PublicProfile publicProfile = this.profile;
            boolean z = this.isTogglingFavorite;
            boolean z2 = this.isProcessing;
            boolean z3 = this.showOperationError;
            java.lang.String str = this.operationErrorCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(profile=");
            sb.append(publicProfile);
            sb.append(", isTogglingFavorite=");
            sb.append(z);
            sb.append(", isProcessing=");
            sb.append(z2);
            sb.append(", showOperationError=");
            sb.append(z3);
            sb.append(", operationErrorCode=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.profile.hashCode();
            int hashCode2 = java.lang.Boolean.hashCode(this.isTogglingFavorite);
            int hashCode3 = java.lang.Boolean.hashCode(this.isProcessing);
            int hashCode4 = java.lang.Boolean.hashCode(this.showOperationError);
            java.lang.String str = this.operationErrorCode;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.state.PublicProfileUiState.Success)) {
                return false;
            }
            com.paypal.oslo.feature.publicprofile.ui.publicprofile.state.PublicProfileUiState.Success success = (com.paypal.oslo.feature.publicprofile.ui.publicprofile.state.PublicProfileUiState.Success) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.profile, success.profile) && this.isTogglingFavorite == success.isTogglingFavorite && this.isProcessing == success.isProcessing && this.showOperationError == success.showOperationError && kotlin.jvm.internal.Intrinsics.areEqual(this.operationErrorCode, success.operationErrorCode);
        }

        public final com.paypal.oslo.feature.publicprofile.ui.publicprofile.state.PublicProfileUiState.Success copy(com.paypal.oslo.feature.publicprofile.domain.model.PublicProfile profile, boolean isTogglingFavorite, boolean isProcessing, boolean showOperationError, java.lang.String operationErrorCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(profile, "");
            return new com.paypal.oslo.feature.publicprofile.ui.publicprofile.state.PublicProfileUiState.Success(profile, isTogglingFavorite, isProcessing, showOperationError, operationErrorCode);
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getOperationErrorCode() {
            return this.operationErrorCode;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getShowOperationError() {
            return this.showOperationError;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsProcessing() {
            return this.isProcessing;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsTogglingFavorite() {
            return this.isTogglingFavorite;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.publicprofile.domain.model.PublicProfile getProfile() {
            return this.profile;
        }

        public static /* synthetic */ com.paypal.oslo.feature.publicprofile.ui.publicprofile.state.PublicProfileUiState.Success copy$default(com.paypal.oslo.feature.publicprofile.ui.publicprofile.state.PublicProfileUiState.Success success, com.paypal.oslo.feature.publicprofile.domain.model.PublicProfile publicProfile, boolean z, boolean z2, boolean z3, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                publicProfile = success.profile;
            }
            if ((i & 2) != 0) {
                z = success.isTogglingFavorite;
            }
            boolean z4 = z;
            if ((i & 4) != 0) {
                z2 = success.isProcessing;
            }
            boolean z5 = z2;
            if ((i & 8) != 0) {
                z3 = success.showOperationError;
            }
            boolean z6 = z3;
            if ((i & 16) != 0) {
                str = success.operationErrorCode;
            }
            return success.copy(publicProfile, z4, z5, z6, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/state/PublicProfileUiState$Error;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/state/PublicProfileUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.publicprofile.ui.publicprofile.state.PublicProfileUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.publicprofile.ui.publicprofile.state.PublicProfileUiState.Error INSTANCE = new com.paypal.oslo.feature.publicprofile.ui.publicprofile.state.PublicProfileUiState.Error();

        public final int hashCode() {
            return 423729053;
        }

        private Error() {
            super("PublicProfileUiState.Error", null);
        }

        public final java.lang.String toString() {
            return "Error";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.state.PublicProfileUiState.Error)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ PublicProfileUiState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
