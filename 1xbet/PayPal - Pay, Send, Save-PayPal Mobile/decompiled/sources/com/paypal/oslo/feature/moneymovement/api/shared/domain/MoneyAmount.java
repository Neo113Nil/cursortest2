package com.paypal.oslo.feature.moneymovement.api.shared.domain;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u0000 $2\u00020\u0001:\u0003%&$B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000bJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ2\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;", "", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyType;", "type", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount$FiatDetails;", "fiat", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount$CryptoDetails;", "crypto", "<init>", "(Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyType;Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount$FiatDetails;Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount$CryptoDetails;)V", "requireFiat", "()Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount$FiatDetails;", "requireCrypto", "()Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount$CryptoDetails;", "component1", "()Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyType;", "component2", "component3", "copy", "(Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyType;Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount$FiatDetails;Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount$CryptoDetails;)Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyType;", "getType", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount$FiatDetails;", "getFiat", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount$CryptoDetails;", "getCrypto", "Companion", "FiatDetails", "CryptoDetails"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class MoneyAmount {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.Companion INSTANCE = new com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.Companion(null);
    private final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.CryptoDetails crypto;
    private final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.FiatDetails fiat;
    private final com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType type;

    public MoneyAmount(com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType currencyType, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.FiatDetails fiatDetails, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.CryptoDetails cryptoDetails) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyType, "");
        this.type = currencyType;
        this.fiat = fiatDetails;
        this.crypto = cryptoDetails;
        int i = com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.WhenMappings.$EnumSwitchMapping$0[currencyType.ordinal()];
        if (i == 1) {
            if (fiatDetails == null) {
                throw new java.lang.IllegalArgumentException("fiat must not be null when type is CASH".toString());
            }
        } else {
            if (i != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            if (cryptoDetails == null) {
                throw new java.lang.IllegalArgumentException("crypto must not be null when type is CRYPTO".toString());
            }
        }
    }

    public /* synthetic */ MoneyAmount(com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType currencyType, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.FiatDetails fiatDetails, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.CryptoDetails cryptoDetails, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(currencyType, (i & 2) != 0 ? null : fiatDetails, (i & 4) != 0 ? null : cryptoDetails);
    }

    public final com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType getType() {
        return this.type;
    }

    public final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.FiatDetails getFiat() {
        return this.fiat;
    }

    public final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.CryptoDetails getCrypto() {
        return this.crypto;
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount$FiatDetails;", "", "", "currencyCode", "quantity", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount$FiatDetails;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCurrencyCode", "getQuantity"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class FiatDetails {
        public static final int $stable = 0;
        private final java.lang.String currencyCode;
        private final java.lang.String quantity;

        public FiatDetails(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.currencyCode = str;
            this.quantity = str2;
        }

        public final java.lang.String getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.lang.String getQuantity() {
            return this.quantity;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.currencyCode;
            java.lang.String str2 = this.quantity;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FiatDetails(currencyCode=");
            sb.append(str);
            sb.append(", quantity=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.currencyCode.hashCode() * 31) + this.quantity.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.FiatDetails)) {
                return false;
            }
            com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.FiatDetails fiatDetails = (com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.FiatDetails) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, fiatDetails.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.quantity, fiatDetails.quantity);
        }

        public final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.FiatDetails copy(java.lang.String currencyCode, java.lang.String quantity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quantity, "");
            return new com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.FiatDetails(currencyCode, quantity);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getQuantity() {
            return this.quantity;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.FiatDetails copy$default(com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.FiatDetails fiatDetails, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = fiatDetails.currencyCode;
            }
            if ((i & 2) != 0) {
                str2 = fiatDetails.quantity;
            }
            return fiatDetails.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJH\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001e\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b!\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount$CryptoDetails;", "", "", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "quantity", "quantityInSubunits", "", "decimals", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/lang/Integer;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount$CryptoDetails;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAssetSymbol", "getQuantity", "getQuantityInSubunits", "Ljava/lang/Integer;", "getDecimals", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class CryptoDetails {
        public static final int $stable = 0;
        private final java.lang.String assetSymbol;
        private final java.lang.Integer decimals;
        private final java.lang.String name;
        private final java.lang.String quantity;
        private final java.lang.String quantityInSubunits;

        public CryptoDetails(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num, java.lang.String str4) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.assetSymbol = str;
            this.quantity = str2;
            this.quantityInSubunits = str3;
            this.decimals = num;
            this.name = str4;
        }

        public /* synthetic */ CryptoDetails(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str4);
        }

        public final java.lang.String getAssetSymbol() {
            return this.assetSymbol;
        }

        public final java.lang.String getQuantity() {
            return this.quantity;
        }

        public final java.lang.String getQuantityInSubunits() {
            return this.quantityInSubunits;
        }

        public final java.lang.Integer getDecimals() {
            return this.decimals;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.assetSymbol;
            java.lang.String str2 = this.quantity;
            java.lang.String str3 = this.quantityInSubunits;
            java.lang.Integer num = this.decimals;
            java.lang.String str4 = this.name;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CryptoDetails(assetSymbol=");
            sb.append(str);
            sb.append(", quantity=");
            sb.append(str2);
            sb.append(", quantityInSubunits=");
            sb.append(str3);
            sb.append(", decimals=");
            sb.append(num);
            sb.append(", name=");
            sb.append(str4);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.assetSymbol.hashCode();
            int hashCode2 = this.quantity.hashCode();
            java.lang.String str = this.quantityInSubunits;
            int hashCode3 = str == null ? 0 : str.hashCode();
            java.lang.Integer num = this.decimals;
            int hashCode4 = num == null ? 0 : num.hashCode();
            java.lang.String str2 = this.name;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.CryptoDetails)) {
                return false;
            }
            com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.CryptoDetails cryptoDetails = (com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.CryptoDetails) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.assetSymbol, cryptoDetails.assetSymbol) && kotlin.jvm.internal.Intrinsics.areEqual(this.quantity, cryptoDetails.quantity) && kotlin.jvm.internal.Intrinsics.areEqual(this.quantityInSubunits, cryptoDetails.quantityInSubunits) && kotlin.jvm.internal.Intrinsics.areEqual(this.decimals, cryptoDetails.decimals) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, cryptoDetails.name);
        }

        public final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.CryptoDetails copy(java.lang.String assetSymbol, java.lang.String quantity, java.lang.String quantityInSubunits, java.lang.Integer decimals, java.lang.String name2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetSymbol, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quantity, "");
            return new com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.CryptoDetails(assetSymbol, quantity, quantityInSubunits, decimals, name2);
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Integer getDecimals() {
            return this.decimals;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getQuantityInSubunits() {
            return this.quantityInSubunits;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getQuantity() {
            return this.quantity;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAssetSymbol() {
            return this.assetSymbol;
        }

        public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.CryptoDetails copy$default(com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.CryptoDetails cryptoDetails, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num, java.lang.String str4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = cryptoDetails.assetSymbol;
            }
            if ((i & 2) != 0) {
                str2 = cryptoDetails.quantity;
            }
            java.lang.String str5 = str2;
            if ((i & 4) != 0) {
                str3 = cryptoDetails.quantityInSubunits;
            }
            java.lang.String str6 = str3;
            if ((i & 8) != 0) {
                num = cryptoDetails.decimals;
            }
            java.lang.Integer num2 = num;
            if ((i & 16) != 0) {
                str4 = cryptoDetails.name;
            }
            return cryptoDetails.copy(str, str5, str6, num2, str4);
        }
    }

    public final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.FiatDetails requireFiat() {
        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.FiatDetails fiatDetails = this.fiat;
        if (fiatDetails != null) {
            return fiatDetails;
        }
        throw new java.lang.IllegalArgumentException("Expected type CASH but was ".concat(java.lang.String.valueOf(this.type)).toString());
    }

    public final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.CryptoDetails requireCrypto() {
        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.CryptoDetails cryptoDetails = this.crypto;
        if (cryptoDetails != null) {
            return cryptoDetails;
        }
        throw new java.lang.IllegalArgumentException("Expected type CRYPTO but was ".concat(java.lang.String.valueOf(this.type)).toString());
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJA\u0010\u000f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount$Companion;", "", "<init>", "()V", "", "currencyCode", "quantity", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;", "fiat", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "quantityInSubunits", "", "decimals", "name", "crypto", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount fiat(java.lang.String currencyCode, java.lang.String quantity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quantity, "");
            return new com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount(com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType.CASH, new com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.FiatDetails(currencyCode, quantity), null, 4, null);
        }

        public final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount crypto(java.lang.String assetSymbol, java.lang.String quantity, java.lang.String quantityInSubunits, java.lang.Integer decimals, java.lang.String name2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetSymbol, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quantity, "");
            return new com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount(com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType.CRYPTO, null, new com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.CryptoDetails(assetSymbol, quantity, quantityInSubunits, decimals, name2), 2, null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType currencyType = this.type;
        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.FiatDetails fiatDetails = this.fiat;
        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.CryptoDetails cryptoDetails = this.crypto;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MoneyAmount(type=");
        sb.append(currencyType);
        sb.append(", fiat=");
        sb.append(fiatDetails);
        sb.append(", crypto=");
        sb.append(cryptoDetails);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode();
        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.FiatDetails fiatDetails = this.fiat;
        int hashCode2 = fiatDetails == null ? 0 : fiatDetails.hashCode();
        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.CryptoDetails cryptoDetails = this.crypto;
        return (((hashCode * 31) + hashCode2) * 31) + (cryptoDetails != null ? cryptoDetails.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount)) {
            return false;
        }
        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount = (com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount) other;
        return this.type == moneyAmount.type && kotlin.jvm.internal.Intrinsics.areEqual(this.fiat, moneyAmount.fiat) && kotlin.jvm.internal.Intrinsics.areEqual(this.crypto, moneyAmount.crypto);
    }

    public final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount copy(com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType type, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.FiatDetails fiat, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.CryptoDetails crypto) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return new com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount(type, fiat, crypto);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.CryptoDetails getCrypto() {
        return this.crypto;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.FiatDetails getFiat() {
        return this.fiat;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType getType() {
        return this.type;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType.values().length];
            try {
                iArr[com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType.CASH.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType.CRYPTO.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount copy$default(com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount, com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType currencyType, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.FiatDetails fiatDetails, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.CryptoDetails cryptoDetails, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            currencyType = moneyAmount.type;
        }
        if ((i & 2) != 0) {
            fiatDetails = moneyAmount.fiat;
        }
        if ((i & 4) != 0) {
            cryptoDetails = moneyAmount.crypto;
        }
        return moneyAmount.copy(currencyType, fiatDetails, cryptoDetails);
    }
}
