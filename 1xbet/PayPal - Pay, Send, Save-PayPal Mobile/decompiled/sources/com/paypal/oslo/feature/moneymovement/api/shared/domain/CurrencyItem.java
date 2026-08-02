package com.paypal.oslo.feature.moneymovement.api.shared.domain;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u0000 $2\u00020\u0001:\u0003%&$B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000bJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ2\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyItem;", "", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyType;", "type", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyItem$FiatInfo;", "fiat", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyItem$CryptoInfo;", "crypto", "<init>", "(Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyType;Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyItem$FiatInfo;Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyItem$CryptoInfo;)V", "requireFiat", "()Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyItem$FiatInfo;", "requireCrypto", "()Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyItem$CryptoInfo;", "component1", "()Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyType;", "component2", "component3", "copy", "(Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyType;Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyItem$FiatInfo;Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyItem$CryptoInfo;)Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyItem;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyType;", "getType", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyItem$FiatInfo;", "getFiat", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyItem$CryptoInfo;", "getCrypto", "Companion", "FiatInfo", "CryptoInfo"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CurrencyItem {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem.Companion INSTANCE = new com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem.Companion(null);
    private final com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem.CryptoInfo crypto;
    private final com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem.FiatInfo fiat;
    private final com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType type;

    public CurrencyItem(com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType currencyType, com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem.FiatInfo fiatInfo, com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem.CryptoInfo cryptoInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyType, "");
        this.type = currencyType;
        this.fiat = fiatInfo;
        this.crypto = cryptoInfo;
        int i = com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem.WhenMappings.$EnumSwitchMapping$0[currencyType.ordinal()];
        if (i == 1) {
            if (fiatInfo == null) {
                throw new java.lang.IllegalArgumentException("fiat must not be null when type is CASH".toString());
            }
        } else {
            if (i != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            if (cryptoInfo == null) {
                throw new java.lang.IllegalArgumentException("crypto must not be null when type is CRYPTO".toString());
            }
        }
    }

    public /* synthetic */ CurrencyItem(com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType currencyType, com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem.FiatInfo fiatInfo, com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem.CryptoInfo cryptoInfo, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(currencyType, (i & 2) != 0 ? null : fiatInfo, (i & 4) != 0 ? null : cryptoInfo);
    }

    public final com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType getType() {
        return this.type;
    }

    public final com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem.FiatInfo getFiat() {
        return this.fiat;
    }

    public final com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem.CryptoInfo getCrypto() {
        return this.crypto;
    }

    public final com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem.FiatInfo requireFiat() {
        com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem.FiatInfo fiatInfo = this.fiat;
        if (fiatInfo != null) {
            return fiatInfo;
        }
        throw new java.lang.IllegalArgumentException("Required value was null.".toString());
    }

    public final com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem.CryptoInfo requireCrypto() {
        com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem.CryptoInfo cryptoInfo = this.crypto;
        if (cryptoInfo != null) {
            return cryptoInfo;
        }
        throw new java.lang.IllegalArgumentException("Required value was null.".toString());
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJX\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\rR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\"\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b#\u0010\rR\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b$\u0010\rR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b%\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyItem$FiatInfo;", "", "", "id", "currencyCode", "countryName", "amount", "formattedAmount", "displayCurrencyName", "countryCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyItem$FiatInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getCurrencyCode", "getCountryName", "getAmount", "getFormattedAmount", "getDisplayCurrencyName", "getCountryCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FiatInfo {
        public static final int $stable = 0;
        private final java.lang.String amount;
        private final java.lang.String countryCode;
        private final java.lang.String countryName;
        private final java.lang.String currencyCode;
        private final java.lang.String displayCurrencyName;
        private final java.lang.String formattedAmount;
        private final java.lang.String id;

        public FiatInfo(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
            this.id = str;
            this.currencyCode = str2;
            this.countryName = str3;
            this.amount = str4;
            this.formattedAmount = str5;
            this.displayCurrencyName = str6;
            this.countryCode = str7;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.lang.String getCountryName() {
            return this.countryName;
        }

        public final java.lang.String getAmount() {
            return this.amount;
        }

        public final java.lang.String getFormattedAmount() {
            return this.formattedAmount;
        }

        public /* synthetic */ FiatInfo(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? null : str7);
        }

        public final java.lang.String getDisplayCurrencyName() {
            return this.displayCurrencyName;
        }

        public final java.lang.String getCountryCode() {
            return this.countryCode;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.currencyCode;
            java.lang.String str3 = this.countryName;
            java.lang.String str4 = this.amount;
            java.lang.String str5 = this.formattedAmount;
            java.lang.String str6 = this.displayCurrencyName;
            java.lang.String str7 = this.countryCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FiatInfo(id=");
            sb.append(str);
            sb.append(", currencyCode=");
            sb.append(str2);
            sb.append(", countryName=");
            sb.append(str3);
            sb.append(", amount=");
            sb.append(str4);
            sb.append(", formattedAmount=");
            sb.append(str5);
            sb.append(", displayCurrencyName=");
            sb.append(str6);
            sb.append(", countryCode=");
            sb.append(str7);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            int hashCode2 = this.currencyCode.hashCode();
            int hashCode3 = this.countryName.hashCode();
            int hashCode4 = this.amount.hashCode();
            int hashCode5 = this.formattedAmount.hashCode();
            int hashCode6 = this.displayCurrencyName.hashCode();
            java.lang.String str = this.countryCode;
            return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem.FiatInfo)) {
                return false;
            }
            com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem.FiatInfo fiatInfo = (com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem.FiatInfo) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, fiatInfo.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, fiatInfo.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.countryName, fiatInfo.countryName) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, fiatInfo.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedAmount, fiatInfo.formattedAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.displayCurrencyName, fiatInfo.displayCurrencyName) && kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, fiatInfo.countryCode);
        }

        public final com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem.FiatInfo copy(java.lang.String id, java.lang.String currencyCode, java.lang.String countryName, java.lang.String amount, java.lang.String formattedAmount, java.lang.String displayCurrencyName, java.lang.String countryCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayCurrencyName, "");
            return new com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem.FiatInfo(id, currencyCode, countryName, amount, formattedAmount, displayCurrencyName, countryCode);
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.String getCountryCode() {
            return this.countryCode;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getDisplayCurrencyName() {
            return this.displayCurrencyName;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getFormattedAmount() {
            return this.formattedAmount;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getAmount() {
            return this.amount;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getCountryName() {
            return this.countryName;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem.FiatInfo copy$default(com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem.FiatInfo fiatInfo, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = fiatInfo.id;
            }
            if ((i & 2) != 0) {
                str2 = fiatInfo.currencyCode;
            }
            java.lang.String str8 = str2;
            if ((i & 4) != 0) {
                str3 = fiatInfo.countryName;
            }
            java.lang.String str9 = str3;
            if ((i & 8) != 0) {
                str4 = fiatInfo.amount;
            }
            java.lang.String str10 = str4;
            if ((i & 16) != 0) {
                str5 = fiatInfo.formattedAmount;
            }
            java.lang.String str11 = str5;
            if ((i & 32) != 0) {
                str6 = fiatInfo.displayCurrencyName;
            }
            java.lang.String str12 = str6;
            if ((i & 64) != 0) {
                str7 = fiatInfo.countryCode;
            }
            return fiatInfo.copy(str, str8, str9, str10, str11, str12, str7);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyItem$CryptoInfo;", "", "", "id", "name", "symbol", "code", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyItem$CryptoInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getName", "getSymbol", "getCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CryptoInfo {
        public static final int $stable = 0;
        private final java.lang.String code;
        private final java.lang.String id;
        private final java.lang.String name;
        private final java.lang.String symbol;

        public CryptoInfo(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            this.id = str;
            this.name = str2;
            this.symbol = str3;
            this.code = str4;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String getSymbol() {
            return this.symbol;
        }

        public final java.lang.String getCode() {
            return this.code;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.name;
            java.lang.String str3 = this.symbol;
            java.lang.String str4 = this.code;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CryptoInfo(id=");
            sb.append(str);
            sb.append(", name=");
            sb.append(str2);
            sb.append(", symbol=");
            sb.append(str3);
            sb.append(", code=");
            sb.append(str4);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.symbol.hashCode()) * 31) + this.code.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem.CryptoInfo)) {
                return false;
            }
            com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem.CryptoInfo cryptoInfo = (com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem.CryptoInfo) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, cryptoInfo.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, cryptoInfo.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.symbol, cryptoInfo.symbol) && kotlin.jvm.internal.Intrinsics.areEqual(this.code, cryptoInfo.code);
        }

        public final com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem.CryptoInfo copy(java.lang.String id, java.lang.String name2, java.lang.String symbol, java.lang.String code) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(symbol, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(code, "");
            return new com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem.CryptoInfo(id, name2, symbol, code);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getCode() {
            return this.code;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getSymbol() {
            return this.symbol;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem.CryptoInfo copy$default(com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem.CryptoInfo cryptoInfo, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = cryptoInfo.id;
            }
            if ((i & 2) != 0) {
                str2 = cryptoInfo.name;
            }
            if ((i & 4) != 0) {
                str3 = cryptoInfo.symbol;
            }
            if ((i & 8) != 0) {
                str4 = cryptoInfo.code;
            }
            return cryptoInfo.copy(str, str2, str3, str4);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JK\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyItem$Companion;", "", "<init>", "()V", "", "id", "currencyCode", "countryName", "amount", "formattedAmount", "displayCurrencyName", "countryCode", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyItem;", "fiat", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyItem;", "name", "symbol", "code", "crypto", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyItem;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem fiat(java.lang.String id, java.lang.String currencyCode, java.lang.String countryName, java.lang.String amount, java.lang.String formattedAmount, java.lang.String displayCurrencyName, java.lang.String countryCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayCurrencyName, "");
            return new com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem(com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType.CASH, new com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem.FiatInfo(id, currencyCode, countryName, amount, formattedAmount, displayCurrencyName, countryCode), null, 4, null);
        }

        public final com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem crypto(java.lang.String id, java.lang.String name2, java.lang.String symbol, java.lang.String code) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(symbol, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(code, "");
            return new com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem(com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType.CRYPTO, null, new com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem.CryptoInfo(id, name2, symbol, code), 2, null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType currencyType = this.type;
        com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem.FiatInfo fiatInfo = this.fiat;
        com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem.CryptoInfo cryptoInfo = this.crypto;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CurrencyItem(type=");
        sb.append(currencyType);
        sb.append(", fiat=");
        sb.append(fiatInfo);
        sb.append(", crypto=");
        sb.append(cryptoInfo);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode();
        com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem.FiatInfo fiatInfo = this.fiat;
        int hashCode2 = fiatInfo == null ? 0 : fiatInfo.hashCode();
        com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem.CryptoInfo cryptoInfo = this.crypto;
        return (((hashCode * 31) + hashCode2) * 31) + (cryptoInfo != null ? cryptoInfo.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem)) {
            return false;
        }
        com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem currencyItem = (com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem) other;
        return this.type == currencyItem.type && kotlin.jvm.internal.Intrinsics.areEqual(this.fiat, currencyItem.fiat) && kotlin.jvm.internal.Intrinsics.areEqual(this.crypto, currencyItem.crypto);
    }

    public final com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem copy(com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType type, com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem.FiatInfo fiat, com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem.CryptoInfo crypto) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return new com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem(type, fiat, crypto);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem.CryptoInfo getCrypto() {
        return this.crypto;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem.FiatInfo getFiat() {
        return this.fiat;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType getType() {
        return this.type;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
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

    public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem copy$default(com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem currencyItem, com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType currencyType, com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem.FiatInfo fiatInfo, com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem.CryptoInfo cryptoInfo, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            currencyType = currencyItem.type;
        }
        if ((i & 2) != 0) {
            fiatInfo = currencyItem.fiat;
        }
        if ((i & 4) != 0) {
            cryptoInfo = currencyItem.crypto;
        }
        return currencyItem.copy(currencyType, fiatInfo, cryptoInfo);
    }
}
