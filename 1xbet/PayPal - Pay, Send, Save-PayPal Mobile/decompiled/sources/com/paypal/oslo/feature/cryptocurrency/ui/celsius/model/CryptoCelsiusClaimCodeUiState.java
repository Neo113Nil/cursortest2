package com.paypal.oslo.feature.cryptocurrency.ui.celsius.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B\u007f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0016J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0016J\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0016J\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0016J\u0010\u0010\u001f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0016J\u0088\u0001\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u00052\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b.\u0010\u0016R\u001a\u0010\b\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b\b\u0010\u0016R\u001a\u0010\t\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b/\u0010\u0016R\u001a\u0010\n\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b0\u0010\u0016R\u001a\u0010\u000b\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b1\u0010\u0016R\u001a\u0010\f\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010,\u001a\u0004\b2\u0010\u0016R\u001a\u0010\r\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b3\u0010\u0016R\u001a\u0010\u000e\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010,\u001a\u0004\b4\u0010\u0016R\u001a\u0010\u000f\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b5\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/celsius/model/CryptoCelsiusClaimCodeUiState;", "", "", "claimCode", "dateOfBirth", "", "showClaimCodeCoachTip", "showDateOfBirthCoachTip", "isProcessing", "showVerifyBuy", "showVerifySell", "showVerifyCryptoPro", "hasClaimCodeError", "hasDateOfBirthError", "hasCodeInvalidatedError", "hasInternalDeclineError", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZZZZZZZZZ)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;ZZZZZZZZZZ)Lcom/paypal/oslo/feature/cryptocurrency/ui/celsius/model/CryptoCelsiusClaimCodeUiState;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getClaimCode", "getDateOfBirth", "Z", "getShowClaimCodeCoachTip", "getShowDateOfBirthCoachTip", "getShowVerifyBuy", "getShowVerifySell", "getShowVerifyCryptoPro", "getHasClaimCodeError", "getHasDateOfBirthError", "getHasCodeInvalidatedError", "getHasInternalDeclineError"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CryptoCelsiusClaimCodeUiState {
    public static final int $stable = 0;
    private final java.lang.String claimCode;
    private final java.lang.String dateOfBirth;
    private final boolean hasClaimCodeError;
    private final boolean hasCodeInvalidatedError;
    private final boolean hasDateOfBirthError;
    private final boolean hasInternalDeclineError;
    private final boolean isProcessing;
    private final boolean showClaimCodeCoachTip;
    private final boolean showDateOfBirthCoachTip;
    private final boolean showVerifyBuy;
    private final boolean showVerifyCryptoPro;
    private final boolean showVerifySell;

    public CryptoCelsiusClaimCodeUiState(java.lang.String str, java.lang.String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.claimCode = str;
        this.dateOfBirth = str2;
        this.showClaimCodeCoachTip = z;
        this.showDateOfBirthCoachTip = z2;
        this.isProcessing = z3;
        this.showVerifyBuy = z4;
        this.showVerifySell = z5;
        this.showVerifyCryptoPro = z6;
        this.hasClaimCodeError = z7;
        this.hasDateOfBirthError = z8;
        this.hasCodeInvalidatedError = z9;
        this.hasInternalDeclineError = z10;
    }

    public /* synthetic */ CryptoCelsiusClaimCodeUiState(java.lang.String str, java.lang.String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) == 0 ? str2 : "", (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? false : z4, (i & 64) != 0 ? false : z5, (i & 128) != 0 ? false : z6, (i & 256) != 0 ? false : z7, (i & 512) != 0 ? false : z8, (i & 1024) != 0 ? false : z9, (i & 2048) == 0 ? z10 : false);
    }

    public final java.lang.String getClaimCode() {
        return this.claimCode;
    }

    public final java.lang.String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public final boolean getShowClaimCodeCoachTip() {
        return this.showClaimCodeCoachTip;
    }

    public final boolean getShowDateOfBirthCoachTip() {
        return this.showDateOfBirthCoachTip;
    }

    public final boolean isProcessing() {
        return this.isProcessing;
    }

    public final boolean getShowVerifyBuy() {
        return this.showVerifyBuy;
    }

    public final boolean getShowVerifySell() {
        return this.showVerifySell;
    }

    public final boolean getShowVerifyCryptoPro() {
        return this.showVerifyCryptoPro;
    }

    public final boolean getHasClaimCodeError() {
        return this.hasClaimCodeError;
    }

    public final boolean getHasDateOfBirthError() {
        return this.hasDateOfBirthError;
    }

    public final boolean getHasCodeInvalidatedError() {
        return this.hasCodeInvalidatedError;
    }

    public final boolean getHasInternalDeclineError() {
        return this.hasInternalDeclineError;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.claimCode;
        java.lang.String str2 = this.dateOfBirth;
        boolean z = this.showClaimCodeCoachTip;
        boolean z2 = this.showDateOfBirthCoachTip;
        boolean z3 = this.isProcessing;
        boolean z4 = this.showVerifyBuy;
        boolean z5 = this.showVerifySell;
        boolean z6 = this.showVerifyCryptoPro;
        boolean z7 = this.hasClaimCodeError;
        boolean z8 = this.hasDateOfBirthError;
        boolean z9 = this.hasCodeInvalidatedError;
        boolean z10 = this.hasInternalDeclineError;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CryptoCelsiusClaimCodeUiState(claimCode=");
        sb.append(str);
        sb.append(", dateOfBirth=");
        sb.append(str2);
        sb.append(", showClaimCodeCoachTip=");
        sb.append(z);
        sb.append(", showDateOfBirthCoachTip=");
        sb.append(z2);
        sb.append(", isProcessing=");
        sb.append(z3);
        sb.append(", showVerifyBuy=");
        sb.append(z4);
        sb.append(", showVerifySell=");
        sb.append(z5);
        sb.append(", showVerifyCryptoPro=");
        sb.append(z6);
        sb.append(", hasClaimCodeError=");
        sb.append(z7);
        sb.append(", hasDateOfBirthError=");
        sb.append(z8);
        sb.append(", hasCodeInvalidatedError=");
        sb.append(z9);
        sb.append(", hasInternalDeclineError=");
        sb.append(z10);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((((((((((((((this.claimCode.hashCode() * 31) + this.dateOfBirth.hashCode()) * 31) + java.lang.Boolean.hashCode(this.showClaimCodeCoachTip)) * 31) + java.lang.Boolean.hashCode(this.showDateOfBirthCoachTip)) * 31) + java.lang.Boolean.hashCode(this.isProcessing)) * 31) + java.lang.Boolean.hashCode(this.showVerifyBuy)) * 31) + java.lang.Boolean.hashCode(this.showVerifySell)) * 31) + java.lang.Boolean.hashCode(this.showVerifyCryptoPro)) * 31) + java.lang.Boolean.hashCode(this.hasClaimCodeError)) * 31) + java.lang.Boolean.hashCode(this.hasDateOfBirthError)) * 31) + java.lang.Boolean.hashCode(this.hasCodeInvalidatedError)) * 31) + java.lang.Boolean.hashCode(this.hasInternalDeclineError);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeUiState)) {
            return false;
        }
        com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeUiState cryptoCelsiusClaimCodeUiState = (com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeUiState) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.claimCode, cryptoCelsiusClaimCodeUiState.claimCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.dateOfBirth, cryptoCelsiusClaimCodeUiState.dateOfBirth) && this.showClaimCodeCoachTip == cryptoCelsiusClaimCodeUiState.showClaimCodeCoachTip && this.showDateOfBirthCoachTip == cryptoCelsiusClaimCodeUiState.showDateOfBirthCoachTip && this.isProcessing == cryptoCelsiusClaimCodeUiState.isProcessing && this.showVerifyBuy == cryptoCelsiusClaimCodeUiState.showVerifyBuy && this.showVerifySell == cryptoCelsiusClaimCodeUiState.showVerifySell && this.showVerifyCryptoPro == cryptoCelsiusClaimCodeUiState.showVerifyCryptoPro && this.hasClaimCodeError == cryptoCelsiusClaimCodeUiState.hasClaimCodeError && this.hasDateOfBirthError == cryptoCelsiusClaimCodeUiState.hasDateOfBirthError && this.hasCodeInvalidatedError == cryptoCelsiusClaimCodeUiState.hasCodeInvalidatedError && this.hasInternalDeclineError == cryptoCelsiusClaimCodeUiState.hasInternalDeclineError;
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeUiState copy(java.lang.String claimCode, java.lang.String dateOfBirth, boolean showClaimCodeCoachTip, boolean showDateOfBirthCoachTip, boolean isProcessing, boolean showVerifyBuy, boolean showVerifySell, boolean showVerifyCryptoPro, boolean hasClaimCodeError, boolean hasDateOfBirthError, boolean hasCodeInvalidatedError, boolean hasInternalDeclineError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(claimCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateOfBirth, "");
        return new com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeUiState(claimCode, dateOfBirth, showClaimCodeCoachTip, showDateOfBirthCoachTip, isProcessing, showVerifyBuy, showVerifySell, showVerifyCryptoPro, hasClaimCodeError, hasDateOfBirthError, hasCodeInvalidatedError, hasInternalDeclineError);
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getHasClaimCodeError() {
        return this.hasClaimCodeError;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getShowVerifyCryptoPro() {
        return this.showVerifyCryptoPro;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getShowVerifySell() {
        return this.showVerifySell;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getShowVerifyBuy() {
        return this.showVerifyBuy;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsProcessing() {
        return this.isProcessing;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowDateOfBirthCoachTip() {
        return this.showDateOfBirthCoachTip;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShowClaimCodeCoachTip() {
        return this.showClaimCodeCoachTip;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getDateOfBirth() {
        return this.dateOfBirth;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getHasInternalDeclineError() {
        return this.hasInternalDeclineError;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getHasCodeInvalidatedError() {
        return this.hasCodeInvalidatedError;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getHasDateOfBirthError() {
        return this.hasDateOfBirthError;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getClaimCode() {
        return this.claimCode;
    }

    public CryptoCelsiusClaimCodeUiState() {
        this(null, null, false, false, false, false, false, false, false, false, false, false, my.com.softspace.ssfasstapsdk.SSFasstapSDK.CardScheme.ALL, null);
    }
}
