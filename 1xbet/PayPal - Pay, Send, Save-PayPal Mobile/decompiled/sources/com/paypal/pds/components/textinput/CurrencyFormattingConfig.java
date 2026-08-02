package com.paypal.pds.components.textinput;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JB\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\rJ\u0010\u0010\u001b\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b \u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b!\u0010\u000fR\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010\u0013"}, d2 = {"Lcom/paypal/pds/components/textinput/CurrencyFormattingConfig;", "", "", "numberOfDecimals", "", "zeroDigit", "groupingSeparator", "decimalSeparator", "", "currencySymbol", "<init>", "(ICCCLjava/lang/String;)V", "component1", "()I", "component2", "()C", "component3", "component4", "component5", "()Ljava/lang/String;", "copy", "(ICCCLjava/lang/String;)Lcom/paypal/pds/components/textinput/CurrencyFormattingConfig;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", com.visa.cbp.getEncExpo.warmup, "getNumberOfDecimals", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "getZeroDigit", "getGroupingSeparator", "getDecimalSeparator", "Ljava/lang/String;", "getCurrencySymbol"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class CurrencyFormattingConfig {
    public static final int $stable = 0;
    private final java.lang.String currencySymbol;
    private final char decimalSeparator;
    private final char groupingSeparator;
    private final int numberOfDecimals;
    private final char zeroDigit;

    public CurrencyFormattingConfig(int i, char c, char c2, char c3, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.numberOfDecimals = i;
        this.zeroDigit = c;
        this.groupingSeparator = c2;
        this.decimalSeparator = c3;
        this.currencySymbol = str;
    }

    public final int getNumberOfDecimals() {
        return this.numberOfDecimals;
    }

    public final char getZeroDigit() {
        return this.zeroDigit;
    }

    public final char getGroupingSeparator() {
        return this.groupingSeparator;
    }

    public final char getDecimalSeparator() {
        return this.decimalSeparator;
    }

    public final java.lang.String getCurrencySymbol() {
        return this.currencySymbol;
    }

    public final java.lang.String toString() {
        int i = this.numberOfDecimals;
        char c = this.zeroDigit;
        char c2 = this.groupingSeparator;
        char c3 = this.decimalSeparator;
        java.lang.String str = this.currencySymbol;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CurrencyFormattingConfig(numberOfDecimals=");
        sb.append(i);
        sb.append(", zeroDigit=");
        sb.append(c);
        sb.append(", groupingSeparator=");
        sb.append(c2);
        sb.append(", decimalSeparator=");
        sb.append(c3);
        sb.append(", currencySymbol=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((java.lang.Integer.hashCode(this.numberOfDecimals) * 31) + java.lang.Character.hashCode(this.zeroDigit)) * 31) + java.lang.Character.hashCode(this.groupingSeparator)) * 31) + java.lang.Character.hashCode(this.decimalSeparator)) * 31) + this.currencySymbol.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.pds.components.textinput.CurrencyFormattingConfig)) {
            return false;
        }
        com.paypal.pds.components.textinput.CurrencyFormattingConfig currencyFormattingConfig = (com.paypal.pds.components.textinput.CurrencyFormattingConfig) other;
        return this.numberOfDecimals == currencyFormattingConfig.numberOfDecimals && this.zeroDigit == currencyFormattingConfig.zeroDigit && this.groupingSeparator == currencyFormattingConfig.groupingSeparator && this.decimalSeparator == currencyFormattingConfig.decimalSeparator && kotlin.jvm.internal.Intrinsics.areEqual(this.currencySymbol, currencyFormattingConfig.currencySymbol);
    }

    public final com.paypal.pds.components.textinput.CurrencyFormattingConfig copy(int numberOfDecimals, char zeroDigit, char groupingSeparator, char decimalSeparator, java.lang.String currencySymbol) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencySymbol, "");
        return new com.paypal.pds.components.textinput.CurrencyFormattingConfig(numberOfDecimals, zeroDigit, groupingSeparator, decimalSeparator, currencySymbol);
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getCurrencySymbol() {
        return this.currencySymbol;
    }

    /* renamed from: component4, reason: from getter */
    public final char getDecimalSeparator() {
        return this.decimalSeparator;
    }

    /* renamed from: component3, reason: from getter */
    public final char getGroupingSeparator() {
        return this.groupingSeparator;
    }

    /* renamed from: component2, reason: from getter */
    public final char getZeroDigit() {
        return this.zeroDigit;
    }

    /* renamed from: component1, reason: from getter */
    public final int getNumberOfDecimals() {
        return this.numberOfDecimals;
    }

    public static /* synthetic */ com.paypal.pds.components.textinput.CurrencyFormattingConfig copy$default(com.paypal.pds.components.textinput.CurrencyFormattingConfig currencyFormattingConfig, int i, char c, char c2, char c3, java.lang.String str, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = currencyFormattingConfig.numberOfDecimals;
        }
        if ((i2 & 2) != 0) {
            c = currencyFormattingConfig.zeroDigit;
        }
        char c4 = c;
        if ((i2 & 4) != 0) {
            c2 = currencyFormattingConfig.groupingSeparator;
        }
        char c5 = c2;
        if ((i2 & 8) != 0) {
            c3 = currencyFormattingConfig.decimalSeparator;
        }
        char c6 = c3;
        if ((i2 & 16) != 0) {
            str = currencyFormattingConfig.currencySymbol;
        }
        return currencyFormattingConfig.copy(i, c4, c5, c6, str);
    }
}
