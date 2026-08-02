package com.paypal.oslo.feature.debitcard.shared.domain.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012JD\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b\b\u0010\u0012R\u001a\u0010\t\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitSecondaryCardArt;", "", "", "cardImageUrl", "lastFourDigits", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitCardStatus;", "debitCardStatus", "", "isCardNotReceived", "showDidNotGetCardLink", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitCardStatus;ZZ)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitCardStatus;", "component4", "()Z", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitCardStatus;ZZ)Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitSecondaryCardArt;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCardImageUrl", "getLastFourDigits", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitCardStatus;", "getDebitCardStatus", "Z", "getShowDidNotGetCardLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DebitSecondaryCardArt {
    public static final int $stable = 0;
    private final java.lang.String cardImageUrl;
    private final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardStatus debitCardStatus;
    private final boolean isCardNotReceived;
    private final java.lang.String lastFourDigits;
    private final boolean showDidNotGetCardLink;

    public DebitSecondaryCardArt(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardStatus debitCardStatus, boolean z, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.cardImageUrl = str;
        this.lastFourDigits = str2;
        this.debitCardStatus = debitCardStatus;
        this.isCardNotReceived = z;
        this.showDidNotGetCardLink = z2;
    }

    public /* synthetic */ DebitSecondaryCardArt(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardStatus debitCardStatus, boolean z, boolean z2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : debitCardStatus, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2);
    }

    public final java.lang.String getCardImageUrl() {
        return this.cardImageUrl;
    }

    public final java.lang.String getLastFourDigits() {
        return this.lastFourDigits;
    }

    public final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardStatus getDebitCardStatus() {
        return this.debitCardStatus;
    }

    public final boolean isCardNotReceived() {
        return this.isCardNotReceived;
    }

    public final boolean getShowDidNotGetCardLink() {
        return this.showDidNotGetCardLink;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.cardImageUrl;
        java.lang.String str2 = this.lastFourDigits;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardStatus debitCardStatus = this.debitCardStatus;
        boolean z = this.isCardNotReceived;
        boolean z2 = this.showDidNotGetCardLink;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DebitSecondaryCardArt(cardImageUrl=");
        sb.append(str);
        sb.append(", lastFourDigits=");
        sb.append(str2);
        sb.append(", debitCardStatus=");
        sb.append(debitCardStatus);
        sb.append(", isCardNotReceived=");
        sb.append(z);
        sb.append(", showDidNotGetCardLink=");
        sb.append(z2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.cardImageUrl.hashCode();
        int hashCode2 = this.lastFourDigits.hashCode();
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardStatus debitCardStatus = this.debitCardStatus;
        return (((((((hashCode * 31) + hashCode2) * 31) + (debitCardStatus == null ? 0 : debitCardStatus.hashCode())) * 31) + java.lang.Boolean.hashCode(this.isCardNotReceived)) * 31) + java.lang.Boolean.hashCode(this.showDidNotGetCardLink);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.DebitSecondaryCardArt)) {
            return false;
        }
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitSecondaryCardArt debitSecondaryCardArt = (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitSecondaryCardArt) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.cardImageUrl, debitSecondaryCardArt.cardImageUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastFourDigits, debitSecondaryCardArt.lastFourDigits) && kotlin.jvm.internal.Intrinsics.areEqual(this.debitCardStatus, debitSecondaryCardArt.debitCardStatus) && this.isCardNotReceived == debitSecondaryCardArt.isCardNotReceived && this.showDidNotGetCardLink == debitSecondaryCardArt.showDidNotGetCardLink;
    }

    public final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitSecondaryCardArt copy(java.lang.String cardImageUrl, java.lang.String lastFourDigits, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardStatus debitCardStatus, boolean isCardNotReceived, boolean showDidNotGetCardLink) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardImageUrl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastFourDigits, "");
        return new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitSecondaryCardArt(cardImageUrl, lastFourDigits, debitCardStatus, isCardNotReceived, showDidNotGetCardLink);
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShowDidNotGetCardLink() {
        return this.showDidNotGetCardLink;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsCardNotReceived() {
        return this.isCardNotReceived;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardStatus getDebitCardStatus() {
        return this.debitCardStatus;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getLastFourDigits() {
        return this.lastFourDigits;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCardImageUrl() {
        return this.cardImageUrl;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.shared.domain.model.DebitSecondaryCardArt copy$default(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitSecondaryCardArt debitSecondaryCardArt, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardStatus debitCardStatus, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = debitSecondaryCardArt.cardImageUrl;
        }
        if ((i & 2) != 0) {
            str2 = debitSecondaryCardArt.lastFourDigits;
        }
        java.lang.String str3 = str2;
        if ((i & 4) != 0) {
            debitCardStatus = debitSecondaryCardArt.debitCardStatus;
        }
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardStatus debitCardStatus2 = debitCardStatus;
        if ((i & 8) != 0) {
            z = debitSecondaryCardArt.isCardNotReceived;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            z2 = debitSecondaryCardArt.showDidNotGetCardLink;
        }
        return debitSecondaryCardArt.copy(str, str3, debitCardStatus2, z3, z2);
    }
}
