package com.paypal.oslo.feature.consumerprivacy.ui.state;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/ui/state/AccountVisibilityUiState;", "Lcom/paypal/oslo/core/mvi/UiState;", "Loading", "Content", "PartialError", "Error", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/AccountVisibilityUiState$Content;", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/AccountVisibilityUiState$Error;", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/AccountVisibilityUiState$Loading;", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/AccountVisibilityUiState$PartialError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface AccountVisibilityUiState extends com.paypal.oslo.core.mvi.UiState {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\f8\u0017X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/ui/state/AccountVisibilityUiState$Loading;", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/AccountVisibilityUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "name", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading implements com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState.Loading INSTANCE = new com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState.Loading();
        private static final java.lang.String name = "AccountVisibilityUiState.Loading";

        public final int hashCode() {
            return -1586516810;
        }

        private Loading() {
        }

        @Override // com.paypal.oslo.core.mvi.UiState
        public final java.lang.String getName() {
            return name;
        }

        public final java.lang.String toString() {
            return "Loading";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState.Loading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u0005\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001a\u0010!\u001a\u00020\u00198\u0017X\u0097D¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/ui/state/AccountVisibilityUiState$Content;", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/AccountVisibilityUiState;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/model/AccountVisibilityData;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "isMutating", "Lcom/paypal/oslo/feature/consumerprivacy/ui/components/PrivacyBannerState;", "banner", "<init>", "(Lcom/paypal/oslo/feature/consumerprivacy/domain/model/AccountVisibilityData;ZLcom/paypal/oslo/feature/consumerprivacy/ui/components/PrivacyBannerState;)V", "component1", "()Lcom/paypal/oslo/feature/consumerprivacy/domain/model/AccountVisibilityData;", "component2", "()Z", "component3", "()Lcom/paypal/oslo/feature/consumerprivacy/ui/components/PrivacyBannerState;", "copy", "(Lcom/paypal/oslo/feature/consumerprivacy/domain/model/AccountVisibilityData;ZLcom/paypal/oslo/feature/consumerprivacy/ui/components/PrivacyBannerState;)Lcom/paypal/oslo/feature/consumerprivacy/ui/state/AccountVisibilityUiState$Content;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/model/AccountVisibilityData;", "getData", "Z", "Lcom/paypal/oslo/feature/consumerprivacy/ui/components/PrivacyBannerState;", "getBanner", "name", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Content implements com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState banner;
        private final com.paypal.oslo.feature.consumerprivacy.domain.model.AccountVisibilityData data;
        private final boolean isMutating;
        private final java.lang.String name;

        public Content(com.paypal.oslo.feature.consumerprivacy.domain.model.AccountVisibilityData accountVisibilityData, boolean z, com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState privacyBannerState) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountVisibilityData, "");
            this.data = accountVisibilityData;
            this.isMutating = z;
            this.banner = privacyBannerState;
            this.name = "AccountVisibilityUiState.Content";
        }

        public /* synthetic */ Content(com.paypal.oslo.feature.consumerprivacy.domain.model.AccountVisibilityData accountVisibilityData, boolean z, com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState privacyBannerState, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(accountVisibilityData, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : privacyBannerState);
        }

        public final com.paypal.oslo.feature.consumerprivacy.domain.model.AccountVisibilityData getData() {
            return this.data;
        }

        public final boolean isMutating() {
            return this.isMutating;
        }

        public final com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState getBanner() {
            return this.banner;
        }

        @Override // com.paypal.oslo.core.mvi.UiState
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.consumerprivacy.domain.model.AccountVisibilityData accountVisibilityData = this.data;
            boolean z = this.isMutating;
            com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState privacyBannerState = this.banner;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Content(data=");
            sb.append(accountVisibilityData);
            sb.append(", isMutating=");
            sb.append(z);
            sb.append(", banner=");
            sb.append(privacyBannerState);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.data.hashCode();
            int hashCode2 = java.lang.Boolean.hashCode(this.isMutating);
            com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState privacyBannerState = this.banner;
            return (((hashCode * 31) + hashCode2) * 31) + (privacyBannerState == null ? 0 : privacyBannerState.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState.Content)) {
                return false;
            }
            com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState.Content content = (com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState.Content) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.data, content.data) && this.isMutating == content.isMutating && kotlin.jvm.internal.Intrinsics.areEqual(this.banner, content.banner);
        }

        public final com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState.Content copy(com.paypal.oslo.feature.consumerprivacy.domain.model.AccountVisibilityData data, boolean isMutating, com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState banner) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            return new com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState.Content(data, isMutating, banner);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState getBanner() {
            return this.banner;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsMutating() {
            return this.isMutating;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.consumerprivacy.domain.model.AccountVisibilityData getData() {
            return this.data;
        }

        public static /* synthetic */ com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState.Content copy$default(com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState.Content content, com.paypal.oslo.feature.consumerprivacy.domain.model.AccountVisibilityData accountVisibilityData, boolean z, com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState privacyBannerState, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                accountVisibilityData = content.data;
            }
            if ((i & 2) != 0) {
                z = content.isMutating;
            }
            if ((i & 4) != 0) {
                privacyBannerState = content.banner;
            }
            return content.copy(accountVisibilityData, z, privacyBannerState);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u001b\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/ui/state/AccountVisibilityUiState$PartialError;", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/AccountVisibilityUiState;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/model/AccountVisibilityData;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "errorMessage", "<init>", "(Lcom/paypal/oslo/feature/consumerprivacy/domain/model/AccountVisibilityData;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/consumerprivacy/domain/model/AccountVisibilityData;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/consumerprivacy/domain/model/AccountVisibilityData;Ljava/lang/String;)Lcom/paypal/oslo/feature/consumerprivacy/ui/state/AccountVisibilityUiState$PartialError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/consumerprivacy/domain/model/AccountVisibilityData;", "getData", "Ljava/lang/String;", "getErrorMessage", "name", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PartialError implements com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.consumerprivacy.domain.model.AccountVisibilityData data;
        private final java.lang.String errorMessage;
        private final java.lang.String name;

        public PartialError(com.paypal.oslo.feature.consumerprivacy.domain.model.AccountVisibilityData accountVisibilityData, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountVisibilityData, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.data = accountVisibilityData;
            this.errorMessage = str;
            this.name = "AccountVisibilityUiState.PartialError";
        }

        public final com.paypal.oslo.feature.consumerprivacy.domain.model.AccountVisibilityData getData() {
            return this.data;
        }

        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        @Override // com.paypal.oslo.core.mvi.UiState
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.consumerprivacy.domain.model.AccountVisibilityData accountVisibilityData = this.data;
            java.lang.String str = this.errorMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PartialError(data=");
            sb.append(accountVisibilityData);
            sb.append(", errorMessage=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.data.hashCode() * 31) + this.errorMessage.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState.PartialError)) {
                return false;
            }
            com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState.PartialError partialError = (com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState.PartialError) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.data, partialError.data) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, partialError.errorMessage);
        }

        public final com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState.PartialError copy(com.paypal.oslo.feature.consumerprivacy.domain.model.AccountVisibilityData data, java.lang.String errorMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
            return new com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState.PartialError(data, errorMessage);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.consumerprivacy.domain.model.AccountVisibilityData getData() {
            return this.data;
        }

        public static /* synthetic */ com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState.PartialError copy$default(com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState.PartialError partialError, com.paypal.oslo.feature.consumerprivacy.domain.model.AccountVisibilityData accountVisibilityData, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                accountVisibilityData = partialError.data;
            }
            if ((i & 2) != 0) {
                str = partialError.errorMessage;
            }
            return partialError.copy(accountVisibilityData, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007R\u001a\u0010\u0015\u001a\u00020\u00028\u0017X\u0097D¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/ui/state/AccountVisibilityUiState$Error;", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/AccountVisibilityUiState;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/consumerprivacy/ui/state/AccountVisibilityUiState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage", "name", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error implements com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState {
        public static final int $stable = 0;
        private final java.lang.String message;
        private final java.lang.String name;

        public Error(java.lang.String str) {
            this.message = str;
            this.name = "AccountVisibilityUiState.Error";
        }

        public /* synthetic */ Error(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        @Override // com.paypal.oslo.core.mvi.UiState
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.message;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState.Error) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState.Error) other).message);
        }

        public final com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState.Error copy(java.lang.String message) {
            return new com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState.Error(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState.Error copy$default(com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState.Error error, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = error.message;
            }
            return error.copy(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Error() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }
}
