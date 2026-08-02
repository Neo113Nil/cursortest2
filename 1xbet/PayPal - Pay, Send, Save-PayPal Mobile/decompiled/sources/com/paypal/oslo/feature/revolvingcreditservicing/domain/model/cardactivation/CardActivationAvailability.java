package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJD\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b!\u0010\fR\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cardactivation/CardActivationAvailability;", "", "", "creditAccountId", "lastDigits", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cardactivation/CardActivationStatus;", "cardActivationStatus", "cardArtUrl", "supportPhoneNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cardactivation/CardActivationStatus;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cardactivation/CardActivationStatus;", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cardactivation/CardActivationStatus;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cardactivation/CardActivationAvailability;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCreditAccountId", "getLastDigits", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cardactivation/CardActivationStatus;", "getCardActivationStatus", "getCardArtUrl", "getSupportPhoneNumber"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class CardActivationAvailability {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationStatus cardActivationStatus;
    private final java.lang.String cardArtUrl;
    private final java.lang.String creditAccountId;
    private final java.lang.String lastDigits;
    private final java.lang.String supportPhoneNumber;

    public CardActivationAvailability(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationStatus cardActivationStatus, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardActivationStatus, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        this.creditAccountId = str;
        this.lastDigits = str2;
        this.cardActivationStatus = cardActivationStatus;
        this.cardArtUrl = str3;
        this.supportPhoneNumber = str4;
    }

    public final java.lang.String getCreditAccountId() {
        return this.creditAccountId;
    }

    public final java.lang.String getLastDigits() {
        return this.lastDigits;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationStatus getCardActivationStatus() {
        return this.cardActivationStatus;
    }

    public final java.lang.String getCardArtUrl() {
        return this.cardArtUrl;
    }

    public /* synthetic */ CardActivationAvailability(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationStatus cardActivationStatus, java.lang.String str3, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, cardActivationStatus, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? "" : str4);
    }

    public final java.lang.String getSupportPhoneNumber() {
        return this.supportPhoneNumber;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.creditAccountId;
        java.lang.String str2 = this.lastDigits;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationStatus cardActivationStatus = this.cardActivationStatus;
        java.lang.String str3 = this.cardArtUrl;
        java.lang.String str4 = this.supportPhoneNumber;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CardActivationAvailability(creditAccountId=");
        sb.append(str);
        sb.append(", lastDigits=");
        sb.append(str2);
        sb.append(", cardActivationStatus=");
        sb.append(cardActivationStatus);
        sb.append(", cardArtUrl=");
        sb.append(str3);
        sb.append(", supportPhoneNumber=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.creditAccountId.hashCode();
        int hashCode2 = this.lastDigits.hashCode();
        int hashCode3 = this.cardActivationStatus.hashCode();
        java.lang.String str = this.cardArtUrl;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.supportPhoneNumber.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationAvailability)) {
            return false;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationAvailability cardActivationAvailability = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationAvailability) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, cardActivationAvailability.creditAccountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastDigits, cardActivationAvailability.lastDigits) && this.cardActivationStatus == cardActivationAvailability.cardActivationStatus && kotlin.jvm.internal.Intrinsics.areEqual(this.cardArtUrl, cardActivationAvailability.cardArtUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.supportPhoneNumber, cardActivationAvailability.supportPhoneNumber);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationAvailability copy(java.lang.String creditAccountId, java.lang.String lastDigits, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationStatus cardActivationStatus, java.lang.String cardArtUrl, java.lang.String supportPhoneNumber) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAccountId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastDigits, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardActivationStatus, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportPhoneNumber, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationAvailability(creditAccountId, lastDigits, cardActivationStatus, cardArtUrl, supportPhoneNumber);
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getSupportPhoneNumber() {
        return this.supportPhoneNumber;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getCardArtUrl() {
        return this.cardArtUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationStatus getCardActivationStatus() {
        return this.cardActivationStatus;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getLastDigits() {
        return this.lastDigits;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCreditAccountId() {
        return this.creditAccountId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationAvailability copy$default(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationAvailability cardActivationAvailability, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationStatus cardActivationStatus, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = cardActivationAvailability.creditAccountId;
        }
        if ((i & 2) != 0) {
            str2 = cardActivationAvailability.lastDigits;
        }
        java.lang.String str5 = str2;
        if ((i & 4) != 0) {
            cardActivationStatus = cardActivationAvailability.cardActivationStatus;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationStatus cardActivationStatus2 = cardActivationStatus;
        if ((i & 8) != 0) {
            str3 = cardActivationAvailability.cardArtUrl;
        }
        java.lang.String str6 = str3;
        if ((i & 16) != 0) {
            str4 = cardActivationAvailability.supportPhoneNumber;
        }
        return cardActivationAvailability.copy(str, str5, cardActivationStatus2, str6, str4);
    }
}
