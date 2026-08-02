package com.paypal.oslo.feature.debitcard.servicing.domain.showcard.model;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000fJ\u0010\u0010\u0014\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JV\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b%\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b&\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b'\u0010\u000fR\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010\u0015R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b+\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/domain/showcard/model/DebitCardDetails;", "", "", "instrumentId", "cardNumber", "lastNChars", "cardVerificationCode", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.ExpiryDate, "Lcom/paypal/oslo/feature/debitcard/servicing/domain/showcard/model/DebitCardScheme;", "scheme", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentLifecycleState;", "status", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/servicing/domain/showcard/model/DebitCardScheme;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentLifecycleState;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Lcom/paypal/oslo/feature/debitcard/servicing/domain/showcard/model/DebitCardScheme;", "component7", "()Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentLifecycleState;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/servicing/domain/showcard/model/DebitCardScheme;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentLifecycleState;)Lcom/paypal/oslo/feature/debitcard/servicing/domain/showcard/model/DebitCardDetails;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getInstrumentId", "getCardNumber", "getLastNChars", "getCardVerificationCode", "getExpiryDate", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/showcard/model/DebitCardScheme;", "getScheme", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentLifecycleState;", "getStatus"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DebitCardDetails {
    public static final int $stable = 0;
    private final java.lang.String cardNumber;
    private final java.lang.String cardVerificationCode;
    private final java.lang.String expiryDate;
    private final java.lang.String instrumentId;
    private final java.lang.String lastNChars;
    private final com.paypal.oslo.feature.debitcard.servicing.domain.showcard.model.DebitCardScheme scheme;
    private final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState status;

    public DebitCardDetails(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.paypal.oslo.feature.debitcard.servicing.domain.showcard.model.DebitCardScheme debitCardScheme, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState debitInstrumentLifecycleState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardScheme, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentLifecycleState, "");
        this.instrumentId = str;
        this.cardNumber = str2;
        this.lastNChars = str3;
        this.cardVerificationCode = str4;
        this.expiryDate = str5;
        this.scheme = debitCardScheme;
        this.status = debitInstrumentLifecycleState;
    }

    public final java.lang.String getInstrumentId() {
        return this.instrumentId;
    }

    public final java.lang.String getCardNumber() {
        return this.cardNumber;
    }

    public final java.lang.String getLastNChars() {
        return this.lastNChars;
    }

    public final java.lang.String getCardVerificationCode() {
        return this.cardVerificationCode;
    }

    public final java.lang.String getExpiryDate() {
        return this.expiryDate;
    }

    public final com.paypal.oslo.feature.debitcard.servicing.domain.showcard.model.DebitCardScheme getScheme() {
        return this.scheme;
    }

    public final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState getStatus() {
        return this.status;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.instrumentId;
        java.lang.String str2 = this.cardNumber;
        java.lang.String str3 = this.lastNChars;
        java.lang.String str4 = this.cardVerificationCode;
        java.lang.String str5 = this.expiryDate;
        com.paypal.oslo.feature.debitcard.servicing.domain.showcard.model.DebitCardScheme debitCardScheme = this.scheme;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState debitInstrumentLifecycleState = this.status;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DebitCardDetails(instrumentId=");
        sb.append(str);
        sb.append(", cardNumber=");
        sb.append(str2);
        sb.append(", lastNChars=");
        sb.append(str3);
        sb.append(", cardVerificationCode=");
        sb.append(str4);
        sb.append(", expiryDate=");
        sb.append(str5);
        sb.append(", scheme=");
        sb.append(debitCardScheme);
        sb.append(", status=");
        sb.append(debitInstrumentLifecycleState);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((((this.instrumentId.hashCode() * 31) + this.cardNumber.hashCode()) * 31) + this.lastNChars.hashCode()) * 31) + this.cardVerificationCode.hashCode()) * 31) + this.expiryDate.hashCode()) * 31) + this.scheme.hashCode()) * 31) + this.status.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.domain.showcard.model.DebitCardDetails)) {
            return false;
        }
        com.paypal.oslo.feature.debitcard.servicing.domain.showcard.model.DebitCardDetails debitCardDetails = (com.paypal.oslo.feature.debitcard.servicing.domain.showcard.model.DebitCardDetails) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.instrumentId, debitCardDetails.instrumentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardNumber, debitCardDetails.cardNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastNChars, debitCardDetails.lastNChars) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardVerificationCode, debitCardDetails.cardVerificationCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.expiryDate, debitCardDetails.expiryDate) && this.scheme == debitCardDetails.scheme && this.status == debitCardDetails.status;
    }

    public final com.paypal.oslo.feature.debitcard.servicing.domain.showcard.model.DebitCardDetails copy(java.lang.String instrumentId, java.lang.String cardNumber, java.lang.String lastNChars, java.lang.String cardVerificationCode, java.lang.String expiryDate, com.paypal.oslo.feature.debitcard.servicing.domain.showcard.model.DebitCardScheme scheme, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState status) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrumentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardNumber, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastNChars, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardVerificationCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(expiryDate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scheme, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        return new com.paypal.oslo.feature.debitcard.servicing.domain.showcard.model.DebitCardDetails(instrumentId, cardNumber, lastNChars, cardVerificationCode, expiryDate, scheme, status);
    }

    /* renamed from: component7, reason: from getter */
    public final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState getStatus() {
        return this.status;
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.oslo.feature.debitcard.servicing.domain.showcard.model.DebitCardScheme getScheme() {
        return this.scheme;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getExpiryDate() {
        return this.expiryDate;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getCardVerificationCode() {
        return this.cardVerificationCode;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getLastNChars() {
        return this.lastNChars;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCardNumber() {
        return this.cardNumber;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getInstrumentId() {
        return this.instrumentId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.domain.showcard.model.DebitCardDetails copy$default(com.paypal.oslo.feature.debitcard.servicing.domain.showcard.model.DebitCardDetails debitCardDetails, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.paypal.oslo.feature.debitcard.servicing.domain.showcard.model.DebitCardScheme debitCardScheme, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState debitInstrumentLifecycleState, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = debitCardDetails.instrumentId;
        }
        if ((i & 2) != 0) {
            str2 = debitCardDetails.cardNumber;
        }
        java.lang.String str6 = str2;
        if ((i & 4) != 0) {
            str3 = debitCardDetails.lastNChars;
        }
        java.lang.String str7 = str3;
        if ((i & 8) != 0) {
            str4 = debitCardDetails.cardVerificationCode;
        }
        java.lang.String str8 = str4;
        if ((i & 16) != 0) {
            str5 = debitCardDetails.expiryDate;
        }
        java.lang.String str9 = str5;
        if ((i & 32) != 0) {
            debitCardScheme = debitCardDetails.scheme;
        }
        com.paypal.oslo.feature.debitcard.servicing.domain.showcard.model.DebitCardScheme debitCardScheme2 = debitCardScheme;
        if ((i & 64) != 0) {
            debitInstrumentLifecycleState = debitCardDetails.status;
        }
        return debitCardDetails.copy(str, str6, str7, str8, str9, debitCardScheme2, debitInstrumentLifecycleState);
    }
}
