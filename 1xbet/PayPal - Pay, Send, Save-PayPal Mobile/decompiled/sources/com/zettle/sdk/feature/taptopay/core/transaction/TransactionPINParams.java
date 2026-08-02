package com.zettle.sdk.feature.taptopay.core.transaction;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b(\b\u0086\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJj\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\t2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b%\u0010\u001cJ\u0010\u0010&\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b&\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010\u0015R\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b*\u0010\u001cR\u001a\u0010\u000e\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b,\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b-\u0010\u0015R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b\n\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u0017R\u001a\u0010\u000f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010)\u001a\u0004\b0\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u0013R\u001a\u0010\r\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b3\u0010\u001c"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionPINParams;", "", "Landroid/text/SpannableString;", "spannableFormattedAmount", "", "formattedAmount", "", "panToken", "currency", "", "isCurrencyDisplayBack", "", "drawableBtnOKColor", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "fallbackMode", "placeholdercount", "<init>", "(Landroid/text/SpannableString;Ljava/lang/String;[BLjava/lang/String;ZIIZI)V", "component1", "()Landroid/text/SpannableString;", "component2", "()Ljava/lang/String;", "component3", "()[B", "component4", "component5", "()Z", "component6", "()I", "component7", "component8", "component9", "copy", "(Landroid/text/SpannableString;Ljava/lang/String;[BLjava/lang/String;ZIIZI)Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionPINParams;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getCurrency", com.visa.cbp.getEncExpo.warmup, "getDrawableBtnOKColor", "Z", "getFallbackMode", "getFormattedAmount", "[B", "getPanToken", "getPlaceholdercount", "Landroid/text/SpannableString;", "getSpannableFormattedAmount", "getTimeout"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class TransactionPINParams {
    private final java.lang.String currency;
    private final int drawableBtnOKColor;
    private final boolean fallbackMode;
    private final java.lang.String formattedAmount;
    private final boolean isCurrencyDisplayBack;
    private final byte[] panToken;
    private final int placeholdercount;
    private final android.text.SpannableString spannableFormattedAmount;
    private final int timeout;

    public TransactionPINParams(android.text.SpannableString spannableString, java.lang.String str, byte[] bArr, java.lang.String str2, boolean z, int i, int i2, boolean z2, int i3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spannableString, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.spannableFormattedAmount = spannableString;
        this.formattedAmount = str;
        this.panToken = bArr;
        this.currency = str2;
        this.isCurrencyDisplayBack = z;
        this.drawableBtnOKColor = i;
        this.timeout = i2;
        this.fallbackMode = z2;
        this.placeholdercount = i3;
    }

    public /* synthetic */ TransactionPINParams(android.text.SpannableString spannableString, java.lang.String str, byte[] bArr, java.lang.String str2, boolean z, int i, int i2, boolean z2, int i3, int i4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(spannableString, (i4 & 2) != 0 ? "" : str, bArr, (i4 & 8) != 0 ? "" : str2, (i4 & 16) != 0 ? false : z, (i4 & 32) != 0 ? -16764793 : i, (i4 & 64) != 0 ? 30 : i2, (i4 & 128) != 0 ? true : z2, (i4 & 256) != 0 ? 0 : i3);
    }

    public final android.text.SpannableString getSpannableFormattedAmount() {
        return this.spannableFormattedAmount;
    }

    public final java.lang.String getFormattedAmount() {
        return this.formattedAmount;
    }

    public final byte[] getPanToken() {
        return this.panToken;
    }

    public final java.lang.String getCurrency() {
        return this.currency;
    }

    public final boolean isCurrencyDisplayBack() {
        return this.isCurrencyDisplayBack;
    }

    public final int getDrawableBtnOKColor() {
        return this.drawableBtnOKColor;
    }

    public final int getTimeout() {
        return this.timeout;
    }

    public final boolean getFallbackMode() {
        return this.fallbackMode;
    }

    public final int getPlaceholdercount() {
        return this.placeholdercount;
    }

    public final java.lang.String toString() {
        android.text.SpannableString spannableString = this.spannableFormattedAmount;
        java.lang.String str = this.formattedAmount;
        java.lang.String arrays = java.util.Arrays.toString(this.panToken);
        java.lang.String str2 = this.currency;
        boolean z = this.isCurrencyDisplayBack;
        int i = this.drawableBtnOKColor;
        int i2 = this.timeout;
        boolean z2 = this.fallbackMode;
        int i3 = this.placeholdercount;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TransactionPINParams(spannableFormattedAmount=");
        sb.append((java.lang.Object) spannableString);
        sb.append(", formattedAmount=");
        sb.append(str);
        sb.append(", panToken=");
        sb.append(arrays);
        sb.append(", currency=");
        sb.append(str2);
        sb.append(", isCurrencyDisplayBack=");
        sb.append(z);
        sb.append(", drawableBtnOKColor=");
        sb.append(i);
        sb.append(", timeout=");
        sb.append(i2);
        sb.append(", fallbackMode=");
        sb.append(z2);
        sb.append(", placeholdercount=");
        sb.append(i3);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.spannableFormattedAmount.hashCode();
        int hashCode2 = this.formattedAmount.hashCode();
        int hashCode3 = java.util.Arrays.hashCode(this.panToken);
        int hashCode4 = this.currency.hashCode();
        boolean z = this.isCurrencyDisplayBack;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode5 = java.lang.Integer.hashCode(this.drawableBtnOKColor);
        int hashCode6 = java.lang.Integer.hashCode(this.timeout);
        boolean z2 = this.fallbackMode;
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i) * 31) + hashCode5) * 31) + hashCode6) * 31) + (z2 ? 1 : z2 ? 1 : 0)) * 31) + java.lang.Integer.hashCode(this.placeholdercount);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionPINParams)) {
            return false;
        }
        com.zettle.sdk.feature.taptopay.core.transaction.TransactionPINParams transactionPINParams = (com.zettle.sdk.feature.taptopay.core.transaction.TransactionPINParams) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.spannableFormattedAmount, transactionPINParams.spannableFormattedAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedAmount, transactionPINParams.formattedAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.panToken, transactionPINParams.panToken) && kotlin.jvm.internal.Intrinsics.areEqual(this.currency, transactionPINParams.currency) && this.isCurrencyDisplayBack == transactionPINParams.isCurrencyDisplayBack && this.drawableBtnOKColor == transactionPINParams.drawableBtnOKColor && this.timeout == transactionPINParams.timeout && this.fallbackMode == transactionPINParams.fallbackMode && this.placeholdercount == transactionPINParams.placeholdercount;
    }

    public final com.zettle.sdk.feature.taptopay.core.transaction.TransactionPINParams copy(android.text.SpannableString spannableFormattedAmount, java.lang.String formattedAmount, byte[] panToken, java.lang.String currency, boolean isCurrencyDisplayBack, int drawableBtnOKColor, int timeout, boolean fallbackMode, int placeholdercount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spannableFormattedAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(panToken, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currency, "");
        return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionPINParams(spannableFormattedAmount, formattedAmount, panToken, currency, isCurrencyDisplayBack, drawableBtnOKColor, timeout, fallbackMode, placeholdercount);
    }

    /* renamed from: component9, reason: from getter */
    public final int getPlaceholdercount() {
        return this.placeholdercount;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getFallbackMode() {
        return this.fallbackMode;
    }

    /* renamed from: component7, reason: from getter */
    public final int getTimeout() {
        return this.timeout;
    }

    /* renamed from: component6, reason: from getter */
    public final int getDrawableBtnOKColor() {
        return this.drawableBtnOKColor;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsCurrencyDisplayBack() {
        return this.isCurrencyDisplayBack;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getCurrency() {
        return this.currency;
    }

    /* renamed from: component3, reason: from getter */
    public final byte[] getPanToken() {
        return this.panToken;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getFormattedAmount() {
        return this.formattedAmount;
    }

    /* renamed from: component1, reason: from getter */
    public final android.text.SpannableString getSpannableFormattedAmount() {
        return this.spannableFormattedAmount;
    }
}
