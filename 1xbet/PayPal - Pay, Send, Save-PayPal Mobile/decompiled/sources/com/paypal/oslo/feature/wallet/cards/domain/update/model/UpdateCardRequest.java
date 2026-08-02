package com.paypal.oslo.feature.wallet.cards.domain.update.model;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000fJ\u0010\u0010\u0016\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J`\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b$\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b%\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b(\u0010\u000fR\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/update/model/UpdateCardRequest;", "", "", "cardId", "expirationMonth", "expirationYear", "cardVerificationValue", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/BillingAddress;", "billingAddress", "nickName", "", "clearNickName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/BillingAddress;Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/BillingAddress;", "component6", "component7", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/BillingAddress;Ljava/lang/String;Z)Lcom/paypal/oslo/feature/wallet/cards/domain/update/model/UpdateCardRequest;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCardId", "getExpirationMonth", "getExpirationYear", "getCardVerificationValue", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/BillingAddress;", "getBillingAddress", "getNickName", "Z", "getClearNickName"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class UpdateCardRequest {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress billingAddress;
    private final java.lang.String cardId;
    private final java.lang.String cardVerificationValue;
    private final boolean clearNickName;
    private final java.lang.String expirationMonth;
    private final java.lang.String expirationYear;
    private final java.lang.String nickName;

    public UpdateCardRequest(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress billingAddress, java.lang.String str5, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.cardId = str;
        this.expirationMonth = str2;
        this.expirationYear = str3;
        this.cardVerificationValue = str4;
        this.billingAddress = billingAddress;
        this.nickName = str5;
        this.clearNickName = z;
    }

    public /* synthetic */ UpdateCardRequest(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress billingAddress, java.lang.String str5, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : billingAddress, (i & 32) == 0 ? str5 : null, (i & 64) != 0 ? false : z);
    }

    public final java.lang.String getCardId() {
        return this.cardId;
    }

    public final java.lang.String getExpirationMonth() {
        return this.expirationMonth;
    }

    public final java.lang.String getExpirationYear() {
        return this.expirationYear;
    }

    public final java.lang.String getCardVerificationValue() {
        return this.cardVerificationValue;
    }

    public final com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress getBillingAddress() {
        return this.billingAddress;
    }

    public final java.lang.String getNickName() {
        return this.nickName;
    }

    public final boolean getClearNickName() {
        return this.clearNickName;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.cardId;
        java.lang.String str2 = this.expirationMonth;
        java.lang.String str3 = this.expirationYear;
        java.lang.String str4 = this.cardVerificationValue;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress billingAddress = this.billingAddress;
        java.lang.String str5 = this.nickName;
        boolean z = this.clearNickName;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateCardRequest(cardId=");
        sb.append(str);
        sb.append(", expirationMonth=");
        sb.append(str2);
        sb.append(", expirationYear=");
        sb.append(str3);
        sb.append(", cardVerificationValue=");
        sb.append(str4);
        sb.append(", billingAddress=");
        sb.append(billingAddress);
        sb.append(", nickName=");
        sb.append(str5);
        sb.append(", clearNickName=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.cardId.hashCode();
        java.lang.String str = this.expirationMonth;
        int hashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.expirationYear;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.cardVerificationValue;
        int hashCode4 = str3 == null ? 0 : str3.hashCode();
        com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress billingAddress = this.billingAddress;
        int hashCode5 = billingAddress == null ? 0 : billingAddress.hashCode();
        java.lang.String str4 = this.nickName;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (str4 != null ? str4.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.clearNickName);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.cards.domain.update.model.UpdateCardRequest)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.cards.domain.update.model.UpdateCardRequest updateCardRequest = (com.paypal.oslo.feature.wallet.cards.domain.update.model.UpdateCardRequest) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.cardId, updateCardRequest.cardId) && kotlin.jvm.internal.Intrinsics.areEqual(this.expirationMonth, updateCardRequest.expirationMonth) && kotlin.jvm.internal.Intrinsics.areEqual(this.expirationYear, updateCardRequest.expirationYear) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardVerificationValue, updateCardRequest.cardVerificationValue) && kotlin.jvm.internal.Intrinsics.areEqual(this.billingAddress, updateCardRequest.billingAddress) && kotlin.jvm.internal.Intrinsics.areEqual(this.nickName, updateCardRequest.nickName) && this.clearNickName == updateCardRequest.clearNickName;
    }

    public final com.paypal.oslo.feature.wallet.cards.domain.update.model.UpdateCardRequest copy(java.lang.String cardId, java.lang.String expirationMonth, java.lang.String expirationYear, java.lang.String cardVerificationValue, com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress billingAddress, java.lang.String nickName, boolean clearNickName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardId, "");
        return new com.paypal.oslo.feature.wallet.cards.domain.update.model.UpdateCardRequest(cardId, expirationMonth, expirationYear, cardVerificationValue, billingAddress, nickName, clearNickName);
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getClearNickName() {
        return this.clearNickName;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getNickName() {
        return this.nickName;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress getBillingAddress() {
        return this.billingAddress;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getCardVerificationValue() {
        return this.cardVerificationValue;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getExpirationYear() {
        return this.expirationYear;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getExpirationMonth() {
        return this.expirationMonth;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCardId() {
        return this.cardId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.cards.domain.update.model.UpdateCardRequest copy$default(com.paypal.oslo.feature.wallet.cards.domain.update.model.UpdateCardRequest updateCardRequest, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress billingAddress, java.lang.String str5, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = updateCardRequest.cardId;
        }
        if ((i & 2) != 0) {
            str2 = updateCardRequest.expirationMonth;
        }
        java.lang.String str6 = str2;
        if ((i & 4) != 0) {
            str3 = updateCardRequest.expirationYear;
        }
        java.lang.String str7 = str3;
        if ((i & 8) != 0) {
            str4 = updateCardRequest.cardVerificationValue;
        }
        java.lang.String str8 = str4;
        if ((i & 16) != 0) {
            billingAddress = updateCardRequest.billingAddress;
        }
        com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress billingAddress2 = billingAddress;
        if ((i & 32) != 0) {
            str5 = updateCardRequest.nickName;
        }
        java.lang.String str9 = str5;
        if ((i & 64) != 0) {
            z = updateCardRequest.clearNickName;
        }
        return updateCardRequest.copy(str, str6, str7, str8, billingAddress2, str9, z);
    }
}
