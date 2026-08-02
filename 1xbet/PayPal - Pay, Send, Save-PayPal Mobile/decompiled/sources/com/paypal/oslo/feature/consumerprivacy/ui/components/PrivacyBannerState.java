package com.paypal.oslo.feature.consumerprivacy.ui.components;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bR\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\t\n\u000bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/ui/components/PrivacyBannerState;", "", "", "getMessageResId", "()I", "messageResId", "Success", "Error", com.google.common.net.HttpHeaders.WARNING, "Lcom/paypal/oslo/feature/consumerprivacy/ui/components/PrivacyBannerState$Error;", "Lcom/paypal/oslo/feature/consumerprivacy/ui/components/PrivacyBannerState$Success;", "Lcom/paypal/oslo/feature/consumerprivacy/ui/components/PrivacyBannerState$Warning;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface PrivacyBannerState {
    int getMessageResId();

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\tJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/ui/components/PrivacyBannerState$Success;", "Lcom/paypal/oslo/feature/consumerprivacy/ui/components/PrivacyBannerState;", "", "messageResId", "Lcom/paypal/oslo/feature/consumerprivacy/ui/components/BannerLinkConfig;", "linkConfig", "<init>", "(ILcom/paypal/oslo/feature/consumerprivacy/ui/components/BannerLinkConfig;)V", "component1", "()I", "component2", "()Lcom/paypal/oslo/feature/consumerprivacy/ui/components/BannerLinkConfig;", "copy", "(ILcom/paypal/oslo/feature/consumerprivacy/ui/components/BannerLinkConfig;)Lcom/paypal/oslo/feature/consumerprivacy/ui/components/PrivacyBannerState$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getMessageResId", "Lcom/paypal/oslo/feature/consumerprivacy/ui/components/BannerLinkConfig;", "getLinkConfig"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success implements com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.consumerprivacy.ui.components.BannerLinkConfig linkConfig;
        private final int messageResId;

        public Success(int i, com.paypal.oslo.feature.consumerprivacy.ui.components.BannerLinkConfig bannerLinkConfig) {
            this.messageResId = i;
            this.linkConfig = bannerLinkConfig;
        }

        public /* synthetic */ Success(int i, com.paypal.oslo.feature.consumerprivacy.ui.components.BannerLinkConfig bannerLinkConfig, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? null : bannerLinkConfig);
        }

        @Override // com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState
        public final int getMessageResId() {
            return this.messageResId;
        }

        public final com.paypal.oslo.feature.consumerprivacy.ui.components.BannerLinkConfig getLinkConfig() {
            return this.linkConfig;
        }

        public final java.lang.String toString() {
            int i = this.messageResId;
            com.paypal.oslo.feature.consumerprivacy.ui.components.BannerLinkConfig bannerLinkConfig = this.linkConfig;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(messageResId=");
            sb.append(i);
            sb.append(", linkConfig=");
            sb.append(bannerLinkConfig);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = java.lang.Integer.hashCode(this.messageResId);
            com.paypal.oslo.feature.consumerprivacy.ui.components.BannerLinkConfig bannerLinkConfig = this.linkConfig;
            return (hashCode * 31) + (bannerLinkConfig == null ? 0 : bannerLinkConfig.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Success)) {
                return false;
            }
            com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Success success = (com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Success) other;
            return this.messageResId == success.messageResId && kotlin.jvm.internal.Intrinsics.areEqual(this.linkConfig, success.linkConfig);
        }

        public final com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Success copy(int messageResId, com.paypal.oslo.feature.consumerprivacy.ui.components.BannerLinkConfig linkConfig) {
            return new com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Success(messageResId, linkConfig);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.consumerprivacy.ui.components.BannerLinkConfig getLinkConfig() {
            return this.linkConfig;
        }

        /* renamed from: component1, reason: from getter */
        public final int getMessageResId() {
            return this.messageResId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Success copy$default(com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Success success, int i, com.paypal.oslo.feature.consumerprivacy.ui.components.BannerLinkConfig bannerLinkConfig, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = success.messageResId;
            }
            if ((i2 & 2) != 0) {
                bannerLinkConfig = success.linkConfig;
            }
            return success.copy(i, bannerLinkConfig);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\tJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/ui/components/PrivacyBannerState$Error;", "Lcom/paypal/oslo/feature/consumerprivacy/ui/components/PrivacyBannerState;", "", "messageResId", "Lcom/paypal/oslo/feature/consumerprivacy/ui/components/BannerLinkConfig;", "linkConfig", "<init>", "(ILcom/paypal/oslo/feature/consumerprivacy/ui/components/BannerLinkConfig;)V", "component1", "()I", "component2", "()Lcom/paypal/oslo/feature/consumerprivacy/ui/components/BannerLinkConfig;", "copy", "(ILcom/paypal/oslo/feature/consumerprivacy/ui/components/BannerLinkConfig;)Lcom/paypal/oslo/feature/consumerprivacy/ui/components/PrivacyBannerState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getMessageResId", "Lcom/paypal/oslo/feature/consumerprivacy/ui/components/BannerLinkConfig;", "getLinkConfig"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error implements com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.consumerprivacy.ui.components.BannerLinkConfig linkConfig;
        private final int messageResId;

        public Error(int i, com.paypal.oslo.feature.consumerprivacy.ui.components.BannerLinkConfig bannerLinkConfig) {
            this.messageResId = i;
            this.linkConfig = bannerLinkConfig;
        }

        public /* synthetic */ Error(int i, com.paypal.oslo.feature.consumerprivacy.ui.components.BannerLinkConfig bannerLinkConfig, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? null : bannerLinkConfig);
        }

        @Override // com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState
        public final int getMessageResId() {
            return this.messageResId;
        }

        public final com.paypal.oslo.feature.consumerprivacy.ui.components.BannerLinkConfig getLinkConfig() {
            return this.linkConfig;
        }

        public final java.lang.String toString() {
            int i = this.messageResId;
            com.paypal.oslo.feature.consumerprivacy.ui.components.BannerLinkConfig bannerLinkConfig = this.linkConfig;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(messageResId=");
            sb.append(i);
            sb.append(", linkConfig=");
            sb.append(bannerLinkConfig);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = java.lang.Integer.hashCode(this.messageResId);
            com.paypal.oslo.feature.consumerprivacy.ui.components.BannerLinkConfig bannerLinkConfig = this.linkConfig;
            return (hashCode * 31) + (bannerLinkConfig == null ? 0 : bannerLinkConfig.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Error)) {
                return false;
            }
            com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Error error = (com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Error) other;
            return this.messageResId == error.messageResId && kotlin.jvm.internal.Intrinsics.areEqual(this.linkConfig, error.linkConfig);
        }

        public final com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Error copy(int messageResId, com.paypal.oslo.feature.consumerprivacy.ui.components.BannerLinkConfig linkConfig) {
            return new com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Error(messageResId, linkConfig);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.consumerprivacy.ui.components.BannerLinkConfig getLinkConfig() {
            return this.linkConfig;
        }

        /* renamed from: component1, reason: from getter */
        public final int getMessageResId() {
            return this.messageResId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Error copy$default(com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Error error, int i, com.paypal.oslo.feature.consumerprivacy.ui.components.BannerLinkConfig bannerLinkConfig, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = error.messageResId;
            }
            if ((i2 & 2) != 0) {
                bannerLinkConfig = error.linkConfig;
            }
            return error.copy(i, bannerLinkConfig);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\tJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/ui/components/PrivacyBannerState$Warning;", "Lcom/paypal/oslo/feature/consumerprivacy/ui/components/PrivacyBannerState;", "", "messageResId", "Lcom/paypal/oslo/feature/consumerprivacy/ui/components/BannerLinkConfig;", "linkConfig", "<init>", "(ILcom/paypal/oslo/feature/consumerprivacy/ui/components/BannerLinkConfig;)V", "component1", "()I", "component2", "()Lcom/paypal/oslo/feature/consumerprivacy/ui/components/BannerLinkConfig;", "copy", "(ILcom/paypal/oslo/feature/consumerprivacy/ui/components/BannerLinkConfig;)Lcom/paypal/oslo/feature/consumerprivacy/ui/components/PrivacyBannerState$Warning;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getMessageResId", "Lcom/paypal/oslo/feature/consumerprivacy/ui/components/BannerLinkConfig;", "getLinkConfig"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Warning implements com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.consumerprivacy.ui.components.BannerLinkConfig linkConfig;
        private final int messageResId;

        public Warning(int i, com.paypal.oslo.feature.consumerprivacy.ui.components.BannerLinkConfig bannerLinkConfig) {
            this.messageResId = i;
            this.linkConfig = bannerLinkConfig;
        }

        public /* synthetic */ Warning(int i, com.paypal.oslo.feature.consumerprivacy.ui.components.BannerLinkConfig bannerLinkConfig, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? null : bannerLinkConfig);
        }

        @Override // com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState
        public final int getMessageResId() {
            return this.messageResId;
        }

        public final com.paypal.oslo.feature.consumerprivacy.ui.components.BannerLinkConfig getLinkConfig() {
            return this.linkConfig;
        }

        public final java.lang.String toString() {
            int i = this.messageResId;
            com.paypal.oslo.feature.consumerprivacy.ui.components.BannerLinkConfig bannerLinkConfig = this.linkConfig;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Warning(messageResId=");
            sb.append(i);
            sb.append(", linkConfig=");
            sb.append(bannerLinkConfig);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = java.lang.Integer.hashCode(this.messageResId);
            com.paypal.oslo.feature.consumerprivacy.ui.components.BannerLinkConfig bannerLinkConfig = this.linkConfig;
            return (hashCode * 31) + (bannerLinkConfig == null ? 0 : bannerLinkConfig.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Warning)) {
                return false;
            }
            com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Warning warning = (com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Warning) other;
            return this.messageResId == warning.messageResId && kotlin.jvm.internal.Intrinsics.areEqual(this.linkConfig, warning.linkConfig);
        }

        public final com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Warning copy(int messageResId, com.paypal.oslo.feature.consumerprivacy.ui.components.BannerLinkConfig linkConfig) {
            return new com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Warning(messageResId, linkConfig);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.consumerprivacy.ui.components.BannerLinkConfig getLinkConfig() {
            return this.linkConfig;
        }

        /* renamed from: component1, reason: from getter */
        public final int getMessageResId() {
            return this.messageResId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Warning copy$default(com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Warning warning, int i, com.paypal.oslo.feature.consumerprivacy.ui.components.BannerLinkConfig bannerLinkConfig, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = warning.messageResId;
            }
            if ((i2 & 2) != 0) {
                bannerLinkConfig = warning.linkConfig;
            }
            return warning.copy(i, bannerLinkConfig);
        }
    }
}
