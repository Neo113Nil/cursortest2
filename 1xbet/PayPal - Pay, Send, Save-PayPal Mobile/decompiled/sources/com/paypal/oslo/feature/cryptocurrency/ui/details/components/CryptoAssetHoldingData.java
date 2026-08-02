package com.paypal.oslo.feature.cryptocurrency.ui.details.components;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001c\u0010\nR\u001b\u0010\u001f\u001a\u00020\u00118GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0011\u0010\"\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b!\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/details/components/CryptoAssetHoldingData;", "", "", "fiatBalance", "cryptoBalance", "returnPercentage", "returnDollarAmount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/ui/details/components/CryptoAssetHoldingData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFiatBalance", "getCryptoBalance", "getReturnPercentage", "getReturnDollarAmount", "isGain$delegate", "Lkotlin/Lazy;", "isGain", "()Z", "getReturnAmountWithIndicator", "returnAmountWithIndicator"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CryptoAssetHoldingData {
    public static final int $stable = 8;
    private final java.lang.String cryptoBalance;
    private final java.lang.String fiatBalance;

    /* renamed from: isGain$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy isGain;
    private final java.lang.String returnDollarAmount;
    private final java.lang.String returnPercentage;

    public CryptoAssetHoldingData(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        this.fiatBalance = str;
        this.cryptoBalance = str2;
        this.returnPercentage = str3;
        this.returnDollarAmount = str4;
        this.isGain = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.details.components.CryptoAssetHoldingData$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                boolean Camera2StreamConfigurationMap;
                Camera2StreamConfigurationMap = com.paypal.oslo.feature.cryptocurrency.ui.details.components.CryptoAssetHoldingData.Camera2StreamConfigurationMap(com.paypal.oslo.feature.cryptocurrency.ui.details.components.CryptoAssetHoldingData.this);
                return java.lang.Boolean.valueOf(Camera2StreamConfigurationMap);
            }
        });
    }

    public final java.lang.String getFiatBalance() {
        return this.fiatBalance;
    }

    public final java.lang.String getCryptoBalance() {
        return this.cryptoBalance;
    }

    public final java.lang.String getReturnPercentage() {
        return this.returnPercentage;
    }

    public final java.lang.String getReturnDollarAmount() {
        return this.returnDollarAmount;
    }

    public final boolean isGain() {
        return ((java.lang.Boolean) this.isGain.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Camera2StreamConfigurationMap(com.paypal.oslo.feature.cryptocurrency.ui.details.components.CryptoAssetHoldingData cryptoAssetHoldingData) {
        try {
            return java.lang.Double.parseDouble(kotlin.text.StringsKt.trim(kotlin.text.StringsKt.replace$default(cryptoAssetHoldingData.returnPercentage, "%", "", false, 4, (java.lang.Object) null)).toString()) >= 0.0d;
        } catch (java.lang.NumberFormatException unused) {
            return true;
        }
    }

    public final java.lang.String getReturnAmountWithIndicator() {
        java.lang.String str;
        java.lang.StringBuilder sb;
        if (isGain()) {
            str = this.returnDollarAmount;
            sb = new java.lang.StringBuilder("↑");
        } else {
            str = this.returnDollarAmount;
            sb = new java.lang.StringBuilder("↓");
        }
        sb.append(str);
        return sb.toString();
    }

    public final java.lang.String toString() {
        java.lang.String str = this.fiatBalance;
        java.lang.String str2 = this.cryptoBalance;
        java.lang.String str3 = this.returnPercentage;
        java.lang.String str4 = this.returnDollarAmount;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CryptoAssetHoldingData(fiatBalance=");
        sb.append(str);
        sb.append(", cryptoBalance=");
        sb.append(str2);
        sb.append(", returnPercentage=");
        sb.append(str3);
        sb.append(", returnDollarAmount=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.fiatBalance.hashCode() * 31) + this.cryptoBalance.hashCode()) * 31) + this.returnPercentage.hashCode()) * 31) + this.returnDollarAmount.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.details.components.CryptoAssetHoldingData)) {
            return false;
        }
        com.paypal.oslo.feature.cryptocurrency.ui.details.components.CryptoAssetHoldingData cryptoAssetHoldingData = (com.paypal.oslo.feature.cryptocurrency.ui.details.components.CryptoAssetHoldingData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.fiatBalance, cryptoAssetHoldingData.fiatBalance) && kotlin.jvm.internal.Intrinsics.areEqual(this.cryptoBalance, cryptoAssetHoldingData.cryptoBalance) && kotlin.jvm.internal.Intrinsics.areEqual(this.returnPercentage, cryptoAssetHoldingData.returnPercentage) && kotlin.jvm.internal.Intrinsics.areEqual(this.returnDollarAmount, cryptoAssetHoldingData.returnDollarAmount);
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.details.components.CryptoAssetHoldingData copy(java.lang.String fiatBalance, java.lang.String cryptoBalance, java.lang.String returnPercentage, java.lang.String returnDollarAmount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiatBalance, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoBalance, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(returnPercentage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(returnDollarAmount, "");
        return new com.paypal.oslo.feature.cryptocurrency.ui.details.components.CryptoAssetHoldingData(fiatBalance, cryptoBalance, returnPercentage, returnDollarAmount);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getReturnDollarAmount() {
        return this.returnDollarAmount;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getReturnPercentage() {
        return this.returnPercentage;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCryptoBalance() {
        return this.cryptoBalance;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getFiatBalance() {
        return this.fiatBalance;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.details.components.CryptoAssetHoldingData copy$default(com.paypal.oslo.feature.cryptocurrency.ui.details.components.CryptoAssetHoldingData cryptoAssetHoldingData, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = cryptoAssetHoldingData.fiatBalance;
        }
        if ((i & 2) != 0) {
            str2 = cryptoAssetHoldingData.cryptoBalance;
        }
        if ((i & 4) != 0) {
            str3 = cryptoAssetHoldingData.returnPercentage;
        }
        if ((i & 8) != 0) {
            str4 = cryptoAssetHoldingData.returnDollarAmount;
        }
        return cryptoAssetHoldingData.copy(str, str2, str3, str4);
    }
}
