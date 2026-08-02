package com.paypal.oslo.feature.cryptocurrency.ui.details.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012JH\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\fJ\u0010\u0010\u001a\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001f\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b \u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/CryptoAssetDescriptionUiState;", "", "", "descriptionResId", "exchangeRateDisclaimerResId", "regulatoryDisclaimerResId", "ppdDisclosureResId", "", "descriptionLinkUrl", "<init>", "(ILjava/lang/Integer;ILjava/lang/Integer;Ljava/lang/String;)V", "component1", "()I", "component2", "()Ljava/lang/Integer;", "component3", "component4", "component5", "()Ljava/lang/String;", "copy", "(ILjava/lang/Integer;ILjava/lang/Integer;Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/CryptoAssetDescriptionUiState;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", com.visa.cbp.getEncExpo.warmup, "getDescriptionResId", "Ljava/lang/Integer;", "getExchangeRateDisclaimerResId", "getRegulatoryDisclaimerResId", "getPpdDisclosureResId", "Ljava/lang/String;", "getDescriptionLinkUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CryptoAssetDescriptionUiState {
    public static final int $stable = 0;
    private final java.lang.String descriptionLinkUrl;
    private final int descriptionResId;
    private final java.lang.Integer exchangeRateDisclaimerResId;
    private final java.lang.Integer ppdDisclosureResId;
    private final int regulatoryDisclaimerResId;

    public CryptoAssetDescriptionUiState(int i, java.lang.Integer num, int i2, java.lang.Integer num2, java.lang.String str) {
        this.descriptionResId = i;
        this.exchangeRateDisclaimerResId = num;
        this.regulatoryDisclaimerResId = i2;
        this.ppdDisclosureResId = num2;
        this.descriptionLinkUrl = str;
    }

    public /* synthetic */ CryptoAssetDescriptionUiState(int i, java.lang.Integer num, int i2, java.lang.Integer num2, java.lang.String str, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, num, i2, num2, (i3 & 16) != 0 ? null : str);
    }

    public final int getDescriptionResId() {
        return this.descriptionResId;
    }

    public final java.lang.Integer getExchangeRateDisclaimerResId() {
        return this.exchangeRateDisclaimerResId;
    }

    public final int getRegulatoryDisclaimerResId() {
        return this.regulatoryDisclaimerResId;
    }

    public final java.lang.Integer getPpdDisclosureResId() {
        return this.ppdDisclosureResId;
    }

    public final java.lang.String getDescriptionLinkUrl() {
        return this.descriptionLinkUrl;
    }

    public final java.lang.String toString() {
        int i = this.descriptionResId;
        java.lang.Integer num = this.exchangeRateDisclaimerResId;
        int i2 = this.regulatoryDisclaimerResId;
        java.lang.Integer num2 = this.ppdDisclosureResId;
        java.lang.String str = this.descriptionLinkUrl;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CryptoAssetDescriptionUiState(descriptionResId=");
        sb.append(i);
        sb.append(", exchangeRateDisclaimerResId=");
        sb.append(num);
        sb.append(", regulatoryDisclaimerResId=");
        sb.append(i2);
        sb.append(", ppdDisclosureResId=");
        sb.append(num2);
        sb.append(", descriptionLinkUrl=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.descriptionResId);
        java.lang.Integer num = this.exchangeRateDisclaimerResId;
        int hashCode2 = num == null ? 0 : num.hashCode();
        int hashCode3 = java.lang.Integer.hashCode(this.regulatoryDisclaimerResId);
        java.lang.Integer num2 = this.ppdDisclosureResId;
        int hashCode4 = num2 == null ? 0 : num2.hashCode();
        java.lang.String str = this.descriptionLinkUrl;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str != null ? str.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.details.model.CryptoAssetDescriptionUiState)) {
            return false;
        }
        com.paypal.oslo.feature.cryptocurrency.ui.details.model.CryptoAssetDescriptionUiState cryptoAssetDescriptionUiState = (com.paypal.oslo.feature.cryptocurrency.ui.details.model.CryptoAssetDescriptionUiState) other;
        return this.descriptionResId == cryptoAssetDescriptionUiState.descriptionResId && kotlin.jvm.internal.Intrinsics.areEqual(this.exchangeRateDisclaimerResId, cryptoAssetDescriptionUiState.exchangeRateDisclaimerResId) && this.regulatoryDisclaimerResId == cryptoAssetDescriptionUiState.regulatoryDisclaimerResId && kotlin.jvm.internal.Intrinsics.areEqual(this.ppdDisclosureResId, cryptoAssetDescriptionUiState.ppdDisclosureResId) && kotlin.jvm.internal.Intrinsics.areEqual(this.descriptionLinkUrl, cryptoAssetDescriptionUiState.descriptionLinkUrl);
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.details.model.CryptoAssetDescriptionUiState copy(int descriptionResId, java.lang.Integer exchangeRateDisclaimerResId, int regulatoryDisclaimerResId, java.lang.Integer ppdDisclosureResId, java.lang.String descriptionLinkUrl) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.details.model.CryptoAssetDescriptionUiState(descriptionResId, exchangeRateDisclaimerResId, regulatoryDisclaimerResId, ppdDisclosureResId, descriptionLinkUrl);
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getDescriptionLinkUrl() {
        return this.descriptionLinkUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.Integer getPpdDisclosureResId() {
        return this.ppdDisclosureResId;
    }

    /* renamed from: component3, reason: from getter */
    public final int getRegulatoryDisclaimerResId() {
        return this.regulatoryDisclaimerResId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Integer getExchangeRateDisclaimerResId() {
        return this.exchangeRateDisclaimerResId;
    }

    /* renamed from: component1, reason: from getter */
    public final int getDescriptionResId() {
        return this.descriptionResId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.details.model.CryptoAssetDescriptionUiState copy$default(com.paypal.oslo.feature.cryptocurrency.ui.details.model.CryptoAssetDescriptionUiState cryptoAssetDescriptionUiState, int i, java.lang.Integer num, int i2, java.lang.Integer num2, java.lang.String str, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = cryptoAssetDescriptionUiState.descriptionResId;
        }
        if ((i3 & 2) != 0) {
            num = cryptoAssetDescriptionUiState.exchangeRateDisclaimerResId;
        }
        java.lang.Integer num3 = num;
        if ((i3 & 4) != 0) {
            i2 = cryptoAssetDescriptionUiState.regulatoryDisclaimerResId;
        }
        int i4 = i2;
        if ((i3 & 8) != 0) {
            num2 = cryptoAssetDescriptionUiState.ppdDisclosureResId;
        }
        java.lang.Integer num4 = num2;
        if ((i3 & 16) != 0) {
            str = cryptoAssetDescriptionUiState.descriptionLinkUrl;
        }
        return cryptoAssetDescriptionUiState.copy(i, num3, i4, num4, str);
    }
}
