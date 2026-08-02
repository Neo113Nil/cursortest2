package com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0010\u0010\u0011\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJD\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0012J\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b \u0010\rR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b#\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/models/DonationSummaryUiData;", "", "", "formattedDonationAmount", "", "donationAmountUsd", "charityName", "", "totalPoints", "charityLogoUrl", "<init>", "(Ljava/lang/String;DLjava/lang/String;ILjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()D", "component3", "component4", "()I", "component5", "copy", "(Ljava/lang/String;DLjava/lang/String;ILjava/lang/String;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/models/DonationSummaryUiData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getFormattedDonationAmount", "D", "getDonationAmountUsd", "getCharityName", com.visa.cbp.getEncExpo.warmup, "getTotalPoints", "getCharityLogoUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class DonationSummaryUiData {
    public static final int $stable = 0;
    private final java.lang.String charityLogoUrl;
    private final java.lang.String charityName;
    private final double donationAmountUsd;
    private final java.lang.String formattedDonationAmount;
    private final int totalPoints;

    public DonationSummaryUiData(java.lang.String str, double d, java.lang.String str2, int i, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.formattedDonationAmount = str;
        this.donationAmountUsd = d;
        this.charityName = str2;
        this.totalPoints = i;
        this.charityLogoUrl = str3;
    }

    public /* synthetic */ DonationSummaryUiData(java.lang.String str, double d, java.lang.String str2, int i, java.lang.String str3, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, d, str2, i, (i2 & 16) != 0 ? null : str3);
    }

    public final java.lang.String getFormattedDonationAmount() {
        return this.formattedDonationAmount;
    }

    public final double getDonationAmountUsd() {
        return this.donationAmountUsd;
    }

    public final java.lang.String getCharityName() {
        return this.charityName;
    }

    public final int getTotalPoints() {
        return this.totalPoints;
    }

    public final java.lang.String getCharityLogoUrl() {
        return this.charityLogoUrl;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.formattedDonationAmount;
        double d = this.donationAmountUsd;
        java.lang.String str2 = this.charityName;
        int i = this.totalPoints;
        java.lang.String str3 = this.charityLogoUrl;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DonationSummaryUiData(formattedDonationAmount=");
        sb.append(str);
        sb.append(", donationAmountUsd=");
        sb.append(d);
        sb.append(", charityName=");
        sb.append(str2);
        sb.append(", totalPoints=");
        sb.append(i);
        sb.append(", charityLogoUrl=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.formattedDonationAmount.hashCode();
        int hashCode2 = java.lang.Double.hashCode(this.donationAmountUsd);
        int hashCode3 = this.charityName.hashCode();
        int hashCode4 = java.lang.Integer.hashCode(this.totalPoints);
        java.lang.String str = this.charityLogoUrl;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.DonationSummaryUiData)) {
            return false;
        }
        com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.DonationSummaryUiData donationSummaryUiData = (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.DonationSummaryUiData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.formattedDonationAmount, donationSummaryUiData.formattedDonationAmount) && java.lang.Double.compare(this.donationAmountUsd, donationSummaryUiData.donationAmountUsd) == 0 && kotlin.jvm.internal.Intrinsics.areEqual(this.charityName, donationSummaryUiData.charityName) && this.totalPoints == donationSummaryUiData.totalPoints && kotlin.jvm.internal.Intrinsics.areEqual(this.charityLogoUrl, donationSummaryUiData.charityLogoUrl);
    }

    public final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.DonationSummaryUiData copy(java.lang.String formattedDonationAmount, double donationAmountUsd, java.lang.String charityName, int totalPoints, java.lang.String charityLogoUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedDonationAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charityName, "");
        return new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.DonationSummaryUiData(formattedDonationAmount, donationAmountUsd, charityName, totalPoints, charityLogoUrl);
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getCharityLogoUrl() {
        return this.charityLogoUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final int getTotalPoints() {
        return this.totalPoints;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getCharityName() {
        return this.charityName;
    }

    /* renamed from: component2, reason: from getter */
    public final double getDonationAmountUsd() {
        return this.donationAmountUsd;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getFormattedDonationAmount() {
        return this.formattedDonationAmount;
    }

    public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.DonationSummaryUiData copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.DonationSummaryUiData donationSummaryUiData, java.lang.String str, double d, java.lang.String str2, int i, java.lang.String str3, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = donationSummaryUiData.formattedDonationAmount;
        }
        if ((i2 & 2) != 0) {
            d = donationSummaryUiData.donationAmountUsd;
        }
        double d2 = d;
        if ((i2 & 4) != 0) {
            str2 = donationSummaryUiData.charityName;
        }
        java.lang.String str4 = str2;
        if ((i2 & 8) != 0) {
            i = donationSummaryUiData.totalPoints;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            str3 = donationSummaryUiData.charityLogoUrl;
        }
        return donationSummaryUiData.copy(str, d2, str4, i3, str3);
    }
}
