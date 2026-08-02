package com.paypal.oslo.feature.bnplacquisition.ui.reviewterms;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0005\n\u000b\f\r\u000eB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Initial", "Loading", "Success", "Error", "Decline", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiState$Decline;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiState$Error;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiState$Initial;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiState$Loading;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class ReviewTermsUiState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    private ReviewTermsUiState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiState$Initial;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initial extends com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiState.Initial INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiState.Initial();

        public final int hashCode() {
            return -261312541;
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
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiState.Initial)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u0005\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiState$Loading;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiState;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiModel;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "isAgreed", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiModel;Z)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiModel;", "component2", "()Z", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiModel;Z)Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiState$Loading;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiModel;", "getData", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiModel data;
        private final boolean isAgreed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loading(com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiModel reviewTermsUiModel, boolean z) {
            super("Loading", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewTermsUiModel, "");
            this.data = reviewTermsUiModel;
            this.isAgreed = z;
        }

        public /* synthetic */ Loading(com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiModel reviewTermsUiModel, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(reviewTermsUiModel, (i & 2) != 0 ? false : z);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiModel getData() {
            return this.data;
        }

        public final boolean isAgreed() {
            return this.isAgreed;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiModel reviewTermsUiModel = this.data;
            boolean z = this.isAgreed;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Loading(data=");
            sb.append(reviewTermsUiModel);
            sb.append(", isAgreed=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.data.hashCode() * 31) + java.lang.Boolean.hashCode(this.isAgreed);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiState.Loading)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiState.Loading loading = (com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiState.Loading) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.data, loading.data) && this.isAgreed == loading.isAgreed;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiState.Loading copy(com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiModel data, boolean isAgreed) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiState.Loading(data, isAgreed);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsAgreed() {
            return this.isAgreed;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiModel getData() {
            return this.data;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiState.Loading copy$default(com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiState.Loading loading, com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiModel reviewTermsUiModel, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                reviewTermsUiModel = loading.data;
            }
            if ((i & 2) != 0) {
                z = loading.isAgreed;
            }
            return loading.copy(reviewTermsUiModel, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u0005\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiState$Success;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiState;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiModel;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "isAgreed", "showError", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiModel;ZZ)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiModel;", "component2", "()Z", "component3", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiModel;ZZ)Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiState$Success;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiModel;", "getData", "Z", "getShowError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiModel data;
        private final boolean isAgreed;
        private final boolean showError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiModel reviewTermsUiModel, boolean z, boolean z2) {
            super("Success", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewTermsUiModel, "");
            this.data = reviewTermsUiModel;
            this.isAgreed = z;
            this.showError = z2;
        }

        public /* synthetic */ Success(com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiModel reviewTermsUiModel, boolean z, boolean z2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(reviewTermsUiModel, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiModel getData() {
            return this.data;
        }

        public final boolean isAgreed() {
            return this.isAgreed;
        }

        public final boolean getShowError() {
            return this.showError;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiModel reviewTermsUiModel = this.data;
            boolean z = this.isAgreed;
            boolean z2 = this.showError;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(data=");
            sb.append(reviewTermsUiModel);
            sb.append(", isAgreed=");
            sb.append(z);
            sb.append(", showError=");
            sb.append(z2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.data.hashCode() * 31) + java.lang.Boolean.hashCode(this.isAgreed)) * 31) + java.lang.Boolean.hashCode(this.showError);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiState.Success)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiState.Success success = (com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiState.Success) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.data, success.data) && this.isAgreed == success.isAgreed && this.showError == success.showError;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiState.Success copy(com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiModel data, boolean isAgreed, boolean showError) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiState.Success(data, isAgreed, showError);
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShowError() {
            return this.showError;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsAgreed() {
            return this.isAgreed;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiModel getData() {
            return this.data;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiState.Success copy$default(com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiState.Success success, com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiModel reviewTermsUiModel, boolean z, boolean z2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                reviewTermsUiModel = success.data;
            }
            if ((i & 2) != 0) {
                z = success.isAgreed;
            }
            if ((i & 4) != 0) {
                z2 = success.showError;
            }
            return success.copy(reviewTermsUiModel, z, z2);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b\u0007\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiState$Error;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiState;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "errorContent", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiModel;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "isAgreed", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiModel;Z)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiModel;", "component3", "()Z", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiModel;Z)Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiState$Error;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "getErrorContent", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiModel;", "getData", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiModel data;
        private final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel errorContent;
        private final boolean isAgreed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel, com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiModel reviewTermsUiModel, boolean z) {
            super("Error", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fullscreenErrorUiModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewTermsUiModel, "");
            this.errorContent = fullscreenErrorUiModel;
            this.data = reviewTermsUiModel;
            this.isAgreed = z;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel getErrorContent() {
            return this.errorContent;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiModel getData() {
            return this.data;
        }

        public final boolean isAgreed() {
            return this.isAgreed;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel = this.errorContent;
            com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiModel reviewTermsUiModel = this.data;
            boolean z = this.isAgreed;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(errorContent=");
            sb.append(fullscreenErrorUiModel);
            sb.append(", data=");
            sb.append(reviewTermsUiModel);
            sb.append(", isAgreed=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.errorContent.hashCode() * 31) + this.data.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isAgreed);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiState.Error)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiState.Error error = (com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiState.Error) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.errorContent, error.errorContent) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, error.data) && this.isAgreed == error.isAgreed;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiState.Error copy(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel errorContent, com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiModel data, boolean isAgreed) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorContent, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiState.Error(errorContent, data, isAgreed);
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsAgreed() {
            return this.isAgreed;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiModel getData() {
            return this.data;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel getErrorContent() {
            return this.errorContent;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiState.Error copy$default(com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiState.Error error, com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel, com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiModel reviewTermsUiModel, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                fullscreenErrorUiModel = error.errorContent;
            }
            if ((i & 2) != 0) {
                reviewTermsUiModel = error.data;
            }
            if ((i & 4) != 0) {
                z = error.isAgreed;
            }
            return error.copy(fullscreenErrorUiModel, reviewTermsUiModel, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiState$Decline;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiState;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "declineContent", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;)Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiState$Decline;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "getDeclineContent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Decline extends com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiState {
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
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiState.Decline) && kotlin.jvm.internal.Intrinsics.areEqual(this.declineContent, ((com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiState.Decline) other).declineContent);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiState.Decline copy(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel declineContent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(declineContent, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiState.Decline(declineContent);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel getDeclineContent() {
            return this.declineContent;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiState.Decline copy$default(com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiState.Decline decline, com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                fullscreenErrorUiModel = decline.declineContent;
            }
            return decline.copy(fullscreenErrorUiModel);
        }
    }

    public /* synthetic */ ReviewTermsUiState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
