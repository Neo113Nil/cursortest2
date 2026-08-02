package com.paypal.oslo.feature.inappcheckout.domain.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJB\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001e\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001f\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/model/CardDetails;", "", "", "firstName", "lastName", "cardNumber", "expirationDate", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Cvv, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/domain/model/CardDetails;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFirstName", "getLastName", "getCardNumber", "getExpirationDate", "getCvv"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CardDetails {
    public static final int $stable = 0;
    private final java.lang.String cardNumber;
    private final java.lang.String cvv;
    private final java.lang.String expirationDate;
    private final java.lang.String firstName;
    private final java.lang.String lastName;

    public CardDetails(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        this.firstName = str;
        this.lastName = str2;
        this.cardNumber = str3;
        this.expirationDate = str4;
        this.cvv = str5;
    }

    public /* synthetic */ CardDetails(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5);
    }

    public final java.lang.String getFirstName() {
        return this.firstName;
    }

    public final java.lang.String getLastName() {
        return this.lastName;
    }

    public final java.lang.String getCardNumber() {
        return this.cardNumber;
    }

    public final java.lang.String getExpirationDate() {
        return this.expirationDate;
    }

    public final java.lang.String getCvv() {
        return this.cvv;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.firstName;
        java.lang.String str2 = this.lastName;
        java.lang.String str3 = this.cardNumber;
        java.lang.String str4 = this.expirationDate;
        java.lang.String str5 = this.cvv;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CardDetails(firstName=");
        sb.append(str);
        sb.append(", lastName=");
        sb.append(str2);
        sb.append(", cardNumber=");
        sb.append(str3);
        sb.append(", expirationDate=");
        sb.append(str4);
        sb.append(", cvv=");
        sb.append(str5);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((this.firstName.hashCode() * 31) + this.lastName.hashCode()) * 31) + this.cardNumber.hashCode()) * 31) + this.expirationDate.hashCode()) * 31) + this.cvv.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.inappcheckout.domain.model.CardDetails)) {
            return false;
        }
        com.paypal.oslo.feature.inappcheckout.domain.model.CardDetails cardDetails = (com.paypal.oslo.feature.inappcheckout.domain.model.CardDetails) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.firstName, cardDetails.firstName) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastName, cardDetails.lastName) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardNumber, cardDetails.cardNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.expirationDate, cardDetails.expirationDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.cvv, cardDetails.cvv);
    }

    public final com.paypal.oslo.feature.inappcheckout.domain.model.CardDetails copy(java.lang.String firstName, java.lang.String lastName, java.lang.String cardNumber, java.lang.String expirationDate, java.lang.String cvv) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firstName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardNumber, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(expirationDate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cvv, "");
        return new com.paypal.oslo.feature.inappcheckout.domain.model.CardDetails(firstName, lastName, cardNumber, expirationDate, cvv);
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getCvv() {
        return this.cvv;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getExpirationDate() {
        return this.expirationDate;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getCardNumber() {
        return this.cardNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getLastName() {
        return this.lastName;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getFirstName() {
        return this.firstName;
    }

    public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.model.CardDetails copy$default(com.paypal.oslo.feature.inappcheckout.domain.model.CardDetails cardDetails, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = cardDetails.firstName;
        }
        if ((i & 2) != 0) {
            str2 = cardDetails.lastName;
        }
        java.lang.String str6 = str2;
        if ((i & 4) != 0) {
            str3 = cardDetails.cardNumber;
        }
        java.lang.String str7 = str3;
        if ((i & 8) != 0) {
            str4 = cardDetails.expirationDate;
        }
        java.lang.String str8 = str4;
        if ((i & 16) != 0) {
            str5 = cardDetails.cvv;
        }
        return cardDetails.copy(str, str6, str7, str8, str5);
    }

    public CardDetails() {
        this(null, null, null, null, null, 31, null);
    }
}
