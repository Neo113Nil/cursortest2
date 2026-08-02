package com.paypal.oslo.feature.consumerprivacy.ui.state;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/ui/state/PersonalizedAdsUiState;", "Lcom/paypal/oslo/core/mvi/UiState;", "Loading", "Content", "Error", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/PersonalizedAdsUiState$Content;", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/PersonalizedAdsUiState$Error;", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/PersonalizedAdsUiState$Loading;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface PersonalizedAdsUiState extends com.paypal.oslo.core.mvi.UiState {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\f8\u0017X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/ui/state/PersonalizedAdsUiState$Loading;", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/PersonalizedAdsUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "name", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading implements com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedAdsUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedAdsUiState.Loading INSTANCE = new com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedAdsUiState.Loading();
        private static final java.lang.String name = "PersonalizedAdsUiState.Loading";

        public final int hashCode() {
            return 1970929525;
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
            if (!(other instanceof com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedAdsUiState.Loading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u0003\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u0006\u0010\nR\u001a\u0010\u001d\u001a\u00020\u00178\u0017X\u0097D¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/ui/state/PersonalizedAdsUiState$Content;", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/PersonalizedAdsUiState;", "", "isEnabled", "Lcom/paypal/oslo/feature/consumerprivacy/ui/components/PrivacyBannerState;", "banner", "isMutating", "<init>", "(ZLcom/paypal/oslo/feature/consumerprivacy/ui/components/PrivacyBannerState;Z)V", "component1", "()Z", "component2", "()Lcom/paypal/oslo/feature/consumerprivacy/ui/components/PrivacyBannerState;", "component3", "copy", "(ZLcom/paypal/oslo/feature/consumerprivacy/ui/components/PrivacyBannerState;Z)Lcom/paypal/oslo/feature/consumerprivacy/ui/state/PersonalizedAdsUiState$Content;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "Lcom/paypal/oslo/feature/consumerprivacy/ui/components/PrivacyBannerState;", "getBanner", "name", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Content implements com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedAdsUiState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState banner;
        private final boolean isEnabled;
        private final boolean isMutating;
        private final java.lang.String name;

        public Content(boolean z, com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState privacyBannerState, boolean z2) {
            this.isEnabled = z;
            this.banner = privacyBannerState;
            this.isMutating = z2;
            this.name = "PersonalizedAdsUiState.Content";
        }

        public /* synthetic */ Content(boolean z, com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState privacyBannerState, boolean z2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(z, (i & 2) != 0 ? null : privacyBannerState, (i & 4) != 0 ? false : z2);
        }

        public final boolean isEnabled() {
            return this.isEnabled;
        }

        public final com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState getBanner() {
            return this.banner;
        }

        public final boolean isMutating() {
            return this.isMutating;
        }

        @Override // com.paypal.oslo.core.mvi.UiState
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            boolean z = this.isEnabled;
            com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState privacyBannerState = this.banner;
            boolean z2 = this.isMutating;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Content(isEnabled=");
            sb.append(z);
            sb.append(", banner=");
            sb.append(privacyBannerState);
            sb.append(", isMutating=");
            sb.append(z2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = java.lang.Boolean.hashCode(this.isEnabled);
            com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState privacyBannerState = this.banner;
            return (((hashCode * 31) + (privacyBannerState == null ? 0 : privacyBannerState.hashCode())) * 31) + java.lang.Boolean.hashCode(this.isMutating);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedAdsUiState.Content)) {
                return false;
            }
            com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedAdsUiState.Content content = (com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedAdsUiState.Content) other;
            return this.isEnabled == content.isEnabled && kotlin.jvm.internal.Intrinsics.areEqual(this.banner, content.banner) && this.isMutating == content.isMutating;
        }

        public final com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedAdsUiState.Content copy(boolean isEnabled, com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState banner, boolean isMutating) {
            return new com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedAdsUiState.Content(isEnabled, banner, isMutating);
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsMutating() {
            return this.isMutating;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState getBanner() {
            return this.banner;
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }

        public static /* synthetic */ com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedAdsUiState.Content copy$default(com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedAdsUiState.Content content, boolean z, com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState privacyBannerState, boolean z2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = content.isEnabled;
            }
            if ((i & 2) != 0) {
                privacyBannerState = content.banner;
            }
            if ((i & 4) != 0) {
                z2 = content.isMutating;
            }
            return content.copy(z, privacyBannerState, z2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u0005\u0010\u000bR\u001a\u0010\u001b\u001a\u00020\u00158\u0017X\u0097D¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/ui/state/PersonalizedAdsUiState$Error;", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/PersonalizedAdsUiState;", "Lcom/paypal/oslo/feature/consumerprivacy/ui/components/PrivacyBannerState$Error;", "banner", "", "isEnabled", "<init>", "(Lcom/paypal/oslo/feature/consumerprivacy/ui/components/PrivacyBannerState$Error;Z)V", "component1", "()Lcom/paypal/oslo/feature/consumerprivacy/ui/components/PrivacyBannerState$Error;", "component2", "()Z", "copy", "(Lcom/paypal/oslo/feature/consumerprivacy/ui/components/PrivacyBannerState$Error;Z)Lcom/paypal/oslo/feature/consumerprivacy/ui/state/PersonalizedAdsUiState$Error;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/consumerprivacy/ui/components/PrivacyBannerState$Error;", "getBanner", "Z", "name", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error implements com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedAdsUiState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Error banner;
        private final boolean isEnabled;
        private final java.lang.String name;

        public Error(com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Error error, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            this.banner = error;
            this.isEnabled = z;
            this.name = "PersonalizedAdsUiState.Error";
        }

        public /* synthetic */ Error(com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Error error, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(error, (i & 2) != 0 ? false : z);
        }

        public final com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Error getBanner() {
            return this.banner;
        }

        public final boolean isEnabled() {
            return this.isEnabled;
        }

        @Override // com.paypal.oslo.core.mvi.UiState
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Error error = this.banner;
            boolean z = this.isEnabled;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(banner=");
            sb.append(error);
            sb.append(", isEnabled=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.banner.hashCode() * 31) + java.lang.Boolean.hashCode(this.isEnabled);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedAdsUiState.Error)) {
                return false;
            }
            com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedAdsUiState.Error error = (com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedAdsUiState.Error) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.banner, error.banner) && this.isEnabled == error.isEnabled;
        }

        public final com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedAdsUiState.Error copy(com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Error banner, boolean isEnabled) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(banner, "");
            return new com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedAdsUiState.Error(banner, isEnabled);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Error getBanner() {
            return this.banner;
        }

        public static /* synthetic */ com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedAdsUiState.Error copy$default(com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedAdsUiState.Error error, com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Error error2, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                error2 = error.banner;
            }
            if ((i & 2) != 0) {
                z = error.isEnabled;
            }
            return error.copy(error2, z);
        }
    }
}
