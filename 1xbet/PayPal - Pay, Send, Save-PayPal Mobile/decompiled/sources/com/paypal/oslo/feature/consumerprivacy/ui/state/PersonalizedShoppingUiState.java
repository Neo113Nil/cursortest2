package com.paypal.oslo.feature.consumerprivacy.ui.state;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/ui/state/PersonalizedShoppingUiState;", "Lcom/paypal/oslo/core/mvi/UiState;", "Loading", "Content", "Error", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/PersonalizedShoppingUiState$Content;", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/PersonalizedShoppingUiState$Error;", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/PersonalizedShoppingUiState$Loading;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface PersonalizedShoppingUiState extends com.paypal.oslo.core.mvi.UiState {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\f8\u0017X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/ui/state/PersonalizedShoppingUiState$Loading;", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/PersonalizedShoppingUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "name", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading implements com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState.Loading INSTANCE = new com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState.Loading();
        private static final java.lang.String name = "PersonalizedShoppingUiState.Loading";

        public final int hashCode() {
            return 1878561929;
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
            if (!(other instanceof com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState.Loading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0013J\u0010\u0010\u0018\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJZ\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b\u0005\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b\b\u0010\u0013R\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b\t\u0010\u0013R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b,\u0010\u0019R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b.\u0010\u001bR\u001a\u0010/\u001a\u00020\f8\u0017X\u0097D¢\u0006\f\n\u0004\b/\u0010-\u001a\u0004\b0\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/ui/state/PersonalizedShoppingUiState$Content;", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/PersonalizedShoppingUiState;", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/PersonalizedShoppingVariant;", "variant", "", "isShoppingPersonalizationEnabled", "Lcom/paypal/oslo/feature/consumerprivacy/ui/components/PrivacyBannerState;", "banner", "isToggleEnabled", "isMutating", "Lcom/paypal/oslo/feature/consumerprivacy/domain/model/ConsentType;", "consentType", "", "dataUsageDate", "<init>", "(Lcom/paypal/oslo/feature/consumerprivacy/ui/state/PersonalizedShoppingVariant;ZLcom/paypal/oslo/feature/consumerprivacy/ui/components/PrivacyBannerState;ZZLcom/paypal/oslo/feature/consumerprivacy/domain/model/ConsentType;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/consumerprivacy/ui/state/PersonalizedShoppingVariant;", "component2", "()Z", "component3", "()Lcom/paypal/oslo/feature/consumerprivacy/ui/components/PrivacyBannerState;", "component4", "component5", "component6", "()Lcom/paypal/oslo/feature/consumerprivacy/domain/model/ConsentType;", "component7", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/consumerprivacy/ui/state/PersonalizedShoppingVariant;ZLcom/paypal/oslo/feature/consumerprivacy/ui/components/PrivacyBannerState;ZZLcom/paypal/oslo/feature/consumerprivacy/domain/model/ConsentType;Ljava/lang/String;)Lcom/paypal/oslo/feature/consumerprivacy/ui/state/PersonalizedShoppingUiState$Content;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/PersonalizedShoppingVariant;", "getVariant", "Z", "Lcom/paypal/oslo/feature/consumerprivacy/ui/components/PrivacyBannerState;", "getBanner", "Lcom/paypal/oslo/feature/consumerprivacy/domain/model/ConsentType;", "getConsentType", "Ljava/lang/String;", "getDataUsageDate", "name", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Content implements com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState banner;
        private final com.paypal.oslo.feature.consumerprivacy.domain.model.ConsentType consentType;
        private final java.lang.String dataUsageDate;
        private final boolean isMutating;
        private final boolean isShoppingPersonalizationEnabled;
        private final boolean isToggleEnabled;
        private final java.lang.String name;
        private final com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingVariant variant;

        public Content(com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingVariant personalizedShoppingVariant, boolean z, com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState privacyBannerState, boolean z2, boolean z3, com.paypal.oslo.feature.consumerprivacy.domain.model.ConsentType consentType, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(personalizedShoppingVariant, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consentType, "");
            this.variant = personalizedShoppingVariant;
            this.isShoppingPersonalizationEnabled = z;
            this.banner = privacyBannerState;
            this.isToggleEnabled = z2;
            this.isMutating = z3;
            this.consentType = consentType;
            this.dataUsageDate = str;
            this.name = "PersonalizedShoppingUiState.Content";
        }

        public final com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingVariant getVariant() {
            return this.variant;
        }

        public final boolean isShoppingPersonalizationEnabled() {
            return this.isShoppingPersonalizationEnabled;
        }

        public final com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState getBanner() {
            return this.banner;
        }

        public final boolean isToggleEnabled() {
            return this.isToggleEnabled;
        }

        public final boolean isMutating() {
            return this.isMutating;
        }

        public /* synthetic */ Content(com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingVariant personalizedShoppingVariant, boolean z, com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState privacyBannerState, boolean z2, boolean z3, com.paypal.oslo.feature.consumerprivacy.domain.model.ConsentType consentType, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(personalizedShoppingVariant, z, (i & 4) != 0 ? null : privacyBannerState, (i & 8) != 0 ? true : z2, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? com.paypal.oslo.feature.consumerprivacy.domain.model.ConsentType.DENY : consentType, (i & 64) != 0 ? null : str);
        }

        public final com.paypal.oslo.feature.consumerprivacy.domain.model.ConsentType getConsentType() {
            return this.consentType;
        }

        public final java.lang.String getDataUsageDate() {
            return this.dataUsageDate;
        }

        @Override // com.paypal.oslo.core.mvi.UiState
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingVariant personalizedShoppingVariant = this.variant;
            boolean z = this.isShoppingPersonalizationEnabled;
            com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState privacyBannerState = this.banner;
            boolean z2 = this.isToggleEnabled;
            boolean z3 = this.isMutating;
            com.paypal.oslo.feature.consumerprivacy.domain.model.ConsentType consentType = this.consentType;
            java.lang.String str = this.dataUsageDate;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Content(variant=");
            sb.append(personalizedShoppingVariant);
            sb.append(", isShoppingPersonalizationEnabled=");
            sb.append(z);
            sb.append(", banner=");
            sb.append(privacyBannerState);
            sb.append(", isToggleEnabled=");
            sb.append(z2);
            sb.append(", isMutating=");
            sb.append(z3);
            sb.append(", consentType=");
            sb.append(consentType);
            sb.append(", dataUsageDate=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.variant.hashCode();
            int hashCode2 = java.lang.Boolean.hashCode(this.isShoppingPersonalizationEnabled);
            com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState privacyBannerState = this.banner;
            int hashCode3 = privacyBannerState == null ? 0 : privacyBannerState.hashCode();
            int hashCode4 = java.lang.Boolean.hashCode(this.isToggleEnabled);
            int hashCode5 = java.lang.Boolean.hashCode(this.isMutating);
            int hashCode6 = this.consentType.hashCode();
            java.lang.String str = this.dataUsageDate;
            return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (str != null ? str.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState.Content)) {
                return false;
            }
            com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState.Content content = (com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState.Content) other;
            return this.variant == content.variant && this.isShoppingPersonalizationEnabled == content.isShoppingPersonalizationEnabled && kotlin.jvm.internal.Intrinsics.areEqual(this.banner, content.banner) && this.isToggleEnabled == content.isToggleEnabled && this.isMutating == content.isMutating && this.consentType == content.consentType && kotlin.jvm.internal.Intrinsics.areEqual(this.dataUsageDate, content.dataUsageDate);
        }

        public final com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState.Content copy(com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingVariant variant, boolean isShoppingPersonalizationEnabled, com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState banner, boolean isToggleEnabled, boolean isMutating, com.paypal.oslo.feature.consumerprivacy.domain.model.ConsentType consentType, java.lang.String dataUsageDate) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(variant, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consentType, "");
            return new com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState.Content(variant, isShoppingPersonalizationEnabled, banner, isToggleEnabled, isMutating, consentType, dataUsageDate);
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.String getDataUsageDate() {
            return this.dataUsageDate;
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.consumerprivacy.domain.model.ConsentType getConsentType() {
            return this.consentType;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsMutating() {
            return this.isMutating;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsToggleEnabled() {
            return this.isToggleEnabled;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState getBanner() {
            return this.banner;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsShoppingPersonalizationEnabled() {
            return this.isShoppingPersonalizationEnabled;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingVariant getVariant() {
            return this.variant;
        }

        public static /* synthetic */ com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState.Content copy$default(com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState.Content content, com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingVariant personalizedShoppingVariant, boolean z, com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState privacyBannerState, boolean z2, boolean z3, com.paypal.oslo.feature.consumerprivacy.domain.model.ConsentType consentType, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                personalizedShoppingVariant = content.variant;
            }
            if ((i & 2) != 0) {
                z = content.isShoppingPersonalizationEnabled;
            }
            boolean z4 = z;
            if ((i & 4) != 0) {
                privacyBannerState = content.banner;
            }
            com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState privacyBannerState2 = privacyBannerState;
            if ((i & 8) != 0) {
                z2 = content.isToggleEnabled;
            }
            boolean z5 = z2;
            if ((i & 16) != 0) {
                z3 = content.isMutating;
            }
            boolean z6 = z3;
            if ((i & 32) != 0) {
                consentType = content.consentType;
            }
            com.paypal.oslo.feature.consumerprivacy.domain.model.ConsentType consentType2 = consentType;
            if ((i & 64) != 0) {
                str = content.dataUsageDate;
            }
            return content.copy(personalizedShoppingVariant, z4, privacyBannerState2, z5, z6, consentType2, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u001b\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/ui/state/PersonalizedShoppingUiState$Error;", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/PersonalizedShoppingUiState;", "Lcom/paypal/oslo/feature/consumerprivacy/ui/components/PrivacyBannerState$Error;", "banner", "", "message", "<init>", "(Lcom/paypal/oslo/feature/consumerprivacy/ui/components/PrivacyBannerState$Error;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/consumerprivacy/ui/components/PrivacyBannerState$Error;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/consumerprivacy/ui/components/PrivacyBannerState$Error;Ljava/lang/String;)Lcom/paypal/oslo/feature/consumerprivacy/ui/state/PersonalizedShoppingUiState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/consumerprivacy/ui/components/PrivacyBannerState$Error;", "getBanner", "Ljava/lang/String;", "getMessage", "name", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error implements com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Error banner;
        private final java.lang.String message;
        private final java.lang.String name;

        public Error(com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Error error, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            this.banner = error;
            this.message = str;
            this.name = "PersonalizedShoppingUiState.Error";
        }

        public /* synthetic */ Error(com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Error error, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(error, (i & 2) != 0 ? null : str);
        }

        public final com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Error getBanner() {
            return this.banner;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        @Override // com.paypal.oslo.core.mvi.UiState
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Error error = this.banner;
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(banner=");
            sb.append(error);
            sb.append(", message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.banner.hashCode();
            java.lang.String str = this.message;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState.Error)) {
                return false;
            }
            com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState.Error error = (com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState.Error) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.banner, error.banner) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, error.message);
        }

        public final com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState.Error copy(com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Error banner, java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(banner, "");
            return new com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState.Error(banner, message);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Error getBanner() {
            return this.banner;
        }

        public static /* synthetic */ com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState.Error copy$default(com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState.Error error, com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Error error2, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                error2 = error.banner;
            }
            if ((i & 2) != 0) {
                str = error.message;
            }
            return error.copy(error2, str);
        }
    }
}
