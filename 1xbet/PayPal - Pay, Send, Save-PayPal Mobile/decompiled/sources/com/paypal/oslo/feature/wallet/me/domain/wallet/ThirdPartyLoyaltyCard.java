package com.paypal.oslo.feature.wallet.me.domain.wallet;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001dB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/wallet/me/domain/wallet/ThirdPartyLoyaltyCard;", "", "", "id", "name", "Lcom/paypal/oslo/feature/wallet/me/domain/wallet/ThirdPartyLoyaltyCard$Logo;", "logo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/me/domain/wallet/ThirdPartyLoyaltyCard$Logo;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/wallet/me/domain/wallet/ThirdPartyLoyaltyCard$Logo;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/me/domain/wallet/ThirdPartyLoyaltyCard$Logo;)Lcom/paypal/oslo/feature/wallet/me/domain/wallet/ThirdPartyLoyaltyCard;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getName", "Lcom/paypal/oslo/feature/wallet/me/domain/wallet/ThirdPartyLoyaltyCard$Logo;", "getLogo", com.paypal.oslo.feature.cryptocurrency.ui.receive.components.ReceiveQRCodeCardTestTag.LOGO}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ThirdPartyLoyaltyCard {
    public static final int $stable = 0;
    private final java.lang.String id;
    private final com.paypal.oslo.feature.wallet.me.domain.wallet.ThirdPartyLoyaltyCard.Logo logo;
    private final java.lang.String name;

    public ThirdPartyLoyaltyCard(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.wallet.me.domain.wallet.ThirdPartyLoyaltyCard.Logo logo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.id = str;
        this.name = str2;
        this.logo = logo;
    }

    public /* synthetic */ ThirdPartyLoyaltyCard(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.wallet.me.domain.wallet.ThirdPartyLoyaltyCard.Logo logo, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : logo);
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final com.paypal.oslo.feature.wallet.me.domain.wallet.ThirdPartyLoyaltyCard.Logo getLogo() {
        return this.logo;
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ&\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/me/domain/wallet/ThirdPartyLoyaltyCard$Logo;", "", "", "url", "backgroundColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/me/domain/wallet/ThirdPartyLoyaltyCard$Logo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl", "getBackgroundColor"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Logo {
        public static final int $stable = 0;
        private final java.lang.String backgroundColor;
        private final java.lang.String url;

        public Logo(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.url = str;
            this.backgroundColor = str2;
        }

        public /* synthetic */ Logo(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2);
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final java.lang.String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            java.lang.String str2 = this.backgroundColor;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Logo(url=");
            sb.append(str);
            sb.append(", backgroundColor=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.url.hashCode();
            java.lang.String str = this.backgroundColor;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.me.domain.wallet.ThirdPartyLoyaltyCard.Logo)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.me.domain.wallet.ThirdPartyLoyaltyCard.Logo logo = (com.paypal.oslo.feature.wallet.me.domain.wallet.ThirdPartyLoyaltyCard.Logo) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.url, logo.url) && kotlin.jvm.internal.Intrinsics.areEqual(this.backgroundColor, logo.backgroundColor);
        }

        public final com.paypal.oslo.feature.wallet.me.domain.wallet.ThirdPartyLoyaltyCard.Logo copy(java.lang.String url, java.lang.String backgroundColor) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.paypal.oslo.feature.wallet.me.domain.wallet.ThirdPartyLoyaltyCard.Logo(url, backgroundColor);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.me.domain.wallet.ThirdPartyLoyaltyCard.Logo copy$default(com.paypal.oslo.feature.wallet.me.domain.wallet.ThirdPartyLoyaltyCard.Logo logo, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = logo.url;
            }
            if ((i & 2) != 0) {
                str2 = logo.backgroundColor;
            }
            return logo.copy(str, str2);
        }
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.name;
        com.paypal.oslo.feature.wallet.me.domain.wallet.ThirdPartyLoyaltyCard.Logo logo = this.logo;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ThirdPartyLoyaltyCard(id=");
        sb.append(str);
        sb.append(", name=");
        sb.append(str2);
        sb.append(", logo=");
        sb.append(logo);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = this.name.hashCode();
        com.paypal.oslo.feature.wallet.me.domain.wallet.ThirdPartyLoyaltyCard.Logo logo = this.logo;
        return (((hashCode * 31) + hashCode2) * 31) + (logo == null ? 0 : logo.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.me.domain.wallet.ThirdPartyLoyaltyCard)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.me.domain.wallet.ThirdPartyLoyaltyCard thirdPartyLoyaltyCard = (com.paypal.oslo.feature.wallet.me.domain.wallet.ThirdPartyLoyaltyCard) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, thirdPartyLoyaltyCard.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, thirdPartyLoyaltyCard.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.logo, thirdPartyLoyaltyCard.logo);
    }

    public final com.paypal.oslo.feature.wallet.me.domain.wallet.ThirdPartyLoyaltyCard copy(java.lang.String id, java.lang.String name2, com.paypal.oslo.feature.wallet.me.domain.wallet.ThirdPartyLoyaltyCard.Logo logo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return new com.paypal.oslo.feature.wallet.me.domain.wallet.ThirdPartyLoyaltyCard(id, name2, logo);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.wallet.me.domain.wallet.ThirdPartyLoyaltyCard.Logo getLogo() {
        return this.logo;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.me.domain.wallet.ThirdPartyLoyaltyCard copy$default(com.paypal.oslo.feature.wallet.me.domain.wallet.ThirdPartyLoyaltyCard thirdPartyLoyaltyCard, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.wallet.me.domain.wallet.ThirdPartyLoyaltyCard.Logo logo, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = thirdPartyLoyaltyCard.id;
        }
        if ((i & 2) != 0) {
            str2 = thirdPartyLoyaltyCard.name;
        }
        if ((i & 4) != 0) {
            logo = thirdPartyLoyaltyCard.logo;
        }
        return thirdPartyLoyaltyCard.copy(str, str2, logo);
    }
}
