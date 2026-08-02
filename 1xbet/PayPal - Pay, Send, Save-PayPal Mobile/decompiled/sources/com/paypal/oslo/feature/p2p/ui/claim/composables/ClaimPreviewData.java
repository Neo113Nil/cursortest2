package com.paypal.oslo.feature.p2p.ui.claim.composables;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000fJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000fJ\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000fJ\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000fJ\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u000fJp\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b%\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b&\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b'\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b(\u0010\u000fR\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b)\u0010\u000fR\u001a\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b*\u0010\u000fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b+\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/claim/composables/ClaimPreviewData;", "", "", "amount", "currencySymbol", "currencyCode", "senderName", "senderProfilePhotoUrl", com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.NOTE, "receiverEmail", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.ExpiryDate, "initials", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/ui/claim/composables/ClaimPreviewData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAmount", "getCurrencySymbol", "getCurrencyCode", "getSenderName", "getSenderProfilePhotoUrl", "getNote", "getReceiverEmail", "getExpiryDate", "getInitials"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ClaimPreviewData {
    public static final int $stable = 0;
    private final java.lang.String amount;
    private final java.lang.String currencyCode;
    private final java.lang.String currencySymbol;
    private final java.lang.String expiryDate;
    private final java.lang.String initials;
    private final java.lang.String note;
    private final java.lang.String receiverEmail;
    private final java.lang.String senderName;
    private final java.lang.String senderProfilePhotoUrl;

    public ClaimPreviewData(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str7, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str8, "");
        this.amount = str;
        this.currencySymbol = str2;
        this.currencyCode = str3;
        this.senderName = str4;
        this.senderProfilePhotoUrl = str5;
        this.note = str6;
        this.receiverEmail = str7;
        this.expiryDate = str8;
        this.initials = str9;
    }

    public /* synthetic */ ClaimPreviewData(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, (i & 256) != 0 ? null : str9);
    }

    public final java.lang.String getAmount() {
        return this.amount;
    }

    public final java.lang.String getCurrencySymbol() {
        return this.currencySymbol;
    }

    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    public final java.lang.String getSenderName() {
        return this.senderName;
    }

    public final java.lang.String getSenderProfilePhotoUrl() {
        return this.senderProfilePhotoUrl;
    }

    public final java.lang.String getNote() {
        return this.note;
    }

    public final java.lang.String getReceiverEmail() {
        return this.receiverEmail;
    }

    public final java.lang.String getExpiryDate() {
        return this.expiryDate;
    }

    public final java.lang.String getInitials() {
        return this.initials;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.amount;
        java.lang.String str2 = this.currencySymbol;
        java.lang.String str3 = this.currencyCode;
        java.lang.String str4 = this.senderName;
        java.lang.String str5 = this.senderProfilePhotoUrl;
        java.lang.String str6 = this.note;
        java.lang.String str7 = this.receiverEmail;
        java.lang.String str8 = this.expiryDate;
        java.lang.String str9 = this.initials;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ClaimPreviewData(amount=");
        sb.append(str);
        sb.append(", currencySymbol=");
        sb.append(str2);
        sb.append(", currencyCode=");
        sb.append(str3);
        sb.append(", senderName=");
        sb.append(str4);
        sb.append(", senderProfilePhotoUrl=");
        sb.append(str5);
        sb.append(", note=");
        sb.append(str6);
        sb.append(", receiverEmail=");
        sb.append(str7);
        sb.append(", expiryDate=");
        sb.append(str8);
        sb.append(", initials=");
        sb.append(str9);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.amount.hashCode();
        int hashCode2 = this.currencySymbol.hashCode();
        int hashCode3 = this.currencyCode.hashCode();
        int hashCode4 = this.senderName.hashCode();
        java.lang.String str = this.senderProfilePhotoUrl;
        int hashCode5 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.note;
        int hashCode6 = str2 == null ? 0 : str2.hashCode();
        int hashCode7 = this.receiverEmail.hashCode();
        int hashCode8 = this.expiryDate.hashCode();
        java.lang.String str3 = this.initials;
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.p2p.ui.claim.composables.ClaimPreviewData)) {
            return false;
        }
        com.paypal.oslo.feature.p2p.ui.claim.composables.ClaimPreviewData claimPreviewData = (com.paypal.oslo.feature.p2p.ui.claim.composables.ClaimPreviewData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.amount, claimPreviewData.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencySymbol, claimPreviewData.currencySymbol) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, claimPreviewData.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.senderName, claimPreviewData.senderName) && kotlin.jvm.internal.Intrinsics.areEqual(this.senderProfilePhotoUrl, claimPreviewData.senderProfilePhotoUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.note, claimPreviewData.note) && kotlin.jvm.internal.Intrinsics.areEqual(this.receiverEmail, claimPreviewData.receiverEmail) && kotlin.jvm.internal.Intrinsics.areEqual(this.expiryDate, claimPreviewData.expiryDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.initials, claimPreviewData.initials);
    }

    public final com.paypal.oslo.feature.p2p.ui.claim.composables.ClaimPreviewData copy(java.lang.String amount, java.lang.String currencySymbol, java.lang.String currencyCode, java.lang.String senderName, java.lang.String senderProfilePhotoUrl, java.lang.String note, java.lang.String receiverEmail, java.lang.String expiryDate, java.lang.String initials) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencySymbol, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(senderName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(receiverEmail, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(expiryDate, "");
        return new com.paypal.oslo.feature.p2p.ui.claim.composables.ClaimPreviewData(amount, currencySymbol, currencyCode, senderName, senderProfilePhotoUrl, note, receiverEmail, expiryDate, initials);
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.String getInitials() {
        return this.initials;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getExpiryDate() {
        return this.expiryDate;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getReceiverEmail() {
        return this.receiverEmail;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getNote() {
        return this.note;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getSenderProfilePhotoUrl() {
        return this.senderProfilePhotoUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getSenderName() {
        return this.senderName;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCurrencySymbol() {
        return this.currencySymbol;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAmount() {
        return this.amount;
    }
}
