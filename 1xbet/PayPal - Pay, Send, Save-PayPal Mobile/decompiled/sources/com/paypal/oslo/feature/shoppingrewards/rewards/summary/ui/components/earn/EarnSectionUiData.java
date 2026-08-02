package com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.earn;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/components/earn/EarnSectionUiData;", "", "ZeroState", "Content", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/components/earn/EarnSectionUiData$Content;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/components/earn/EarnSectionUiData$ZeroState;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface EarnSectionUiData {

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/components/earn/EarnSectionUiData$ZeroState;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/components/earn/EarnSectionUiData;", "", "title", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/components/earn/EarnSectionUiData$ZeroState;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTitle", "getDescription"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ZeroState implements com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.earn.EarnSectionUiData {
        public static final int $stable = 0;
        private final java.lang.String description;
        private final java.lang.String title;

        public ZeroState(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.title = str;
            this.description = str2;
        }

        public final java.lang.String getTitle() {
            return this.title;
        }

        public final java.lang.String getDescription() {
            return this.description;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.title;
            java.lang.String str2 = this.description;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ZeroState(title=");
            sb.append(str);
            sb.append(", description=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.title.hashCode() * 31) + this.description.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.earn.EarnSectionUiData.ZeroState)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.earn.EarnSectionUiData.ZeroState zeroState = (com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.earn.EarnSectionUiData.ZeroState) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.title, zeroState.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, zeroState.description);
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.earn.EarnSectionUiData.ZeroState copy(java.lang.String title, java.lang.String description) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
            return new com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.earn.EarnSectionUiData.ZeroState(title, description);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getDescription() {
            return this.description;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getTitle() {
            return this.title;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.earn.EarnSectionUiData.ZeroState copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.earn.EarnSectionUiData.ZeroState zeroState, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = zeroState.title;
            }
            if ((i & 2) != 0) {
                str2 = zeroState.description;
            }
            return zeroState.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JD\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\rR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b(\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/components/earn/EarnSectionUiData$Content;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/components/earn/EarnSectionUiData;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/components/activeoffergallery/ActiveOfferSectionUiData;", "activeOfferSectionUiData", "", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/components/inactiveoffercard/InactiveOfferCardUiData;", "inactiveOffers", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/components/referralcard/SingleCtaOfferUiData;", "singleCtaOfferUiData", "ppdcCard", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/components/activeoffergallery/ActiveOfferSectionUiData;Ljava/util/List;Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/components/referralcard/SingleCtaOfferUiData;Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/components/inactiveoffercard/InactiveOfferCardUiData;)V", "component1", "()Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/components/activeoffergallery/ActiveOfferSectionUiData;", "component2", "()Ljava/util/List;", "component3", "()Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/components/referralcard/SingleCtaOfferUiData;", "component4", "()Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/components/inactiveoffercard/InactiveOfferCardUiData;", "copy", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/components/activeoffergallery/ActiveOfferSectionUiData;Ljava/util/List;Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/components/referralcard/SingleCtaOfferUiData;Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/components/inactiveoffercard/InactiveOfferCardUiData;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/components/earn/EarnSectionUiData$Content;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/components/activeoffergallery/ActiveOfferSectionUiData;", "getActiveOfferSectionUiData", "Ljava/util/List;", "getInactiveOffers", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/components/referralcard/SingleCtaOfferUiData;", "getSingleCtaOfferUiData", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/components/inactiveoffercard/InactiveOfferCardUiData;", "getPpdcCard"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Content implements com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.earn.EarnSectionUiData {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffergallery.ActiveOfferSectionUiData activeOfferSectionUiData;
        private final java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.inactiveoffercard.InactiveOfferCardUiData> inactiveOffers;
        private final com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.inactiveoffercard.InactiveOfferCardUiData ppdcCard;
        private final com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.referralcard.SingleCtaOfferUiData singleCtaOfferUiData;

        public Content(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffergallery.ActiveOfferSectionUiData activeOfferSectionUiData, java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.inactiveoffercard.InactiveOfferCardUiData> list, com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.referralcard.SingleCtaOfferUiData singleCtaOfferUiData, com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.inactiveoffercard.InactiveOfferCardUiData inactiveOfferCardUiData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.activeOfferSectionUiData = activeOfferSectionUiData;
            this.inactiveOffers = list;
            this.singleCtaOfferUiData = singleCtaOfferUiData;
            this.ppdcCard = inactiveOfferCardUiData;
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffergallery.ActiveOfferSectionUiData getActiveOfferSectionUiData() {
            return this.activeOfferSectionUiData;
        }

        public final java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.inactiveoffercard.InactiveOfferCardUiData> getInactiveOffers() {
            return this.inactiveOffers;
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.referralcard.SingleCtaOfferUiData getSingleCtaOfferUiData() {
            return this.singleCtaOfferUiData;
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.inactiveoffercard.InactiveOfferCardUiData getPpdcCard() {
            return this.ppdcCard;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffergallery.ActiveOfferSectionUiData activeOfferSectionUiData = this.activeOfferSectionUiData;
            java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.inactiveoffercard.InactiveOfferCardUiData> list = this.inactiveOffers;
            com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.referralcard.SingleCtaOfferUiData singleCtaOfferUiData = this.singleCtaOfferUiData;
            com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.inactiveoffercard.InactiveOfferCardUiData inactiveOfferCardUiData = this.ppdcCard;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Content(activeOfferSectionUiData=");
            sb.append(activeOfferSectionUiData);
            sb.append(", inactiveOffers=");
            sb.append(list);
            sb.append(", singleCtaOfferUiData=");
            sb.append(singleCtaOfferUiData);
            sb.append(", ppdcCard=");
            sb.append(inactiveOfferCardUiData);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffergallery.ActiveOfferSectionUiData activeOfferSectionUiData = this.activeOfferSectionUiData;
            int hashCode = activeOfferSectionUiData == null ? 0 : activeOfferSectionUiData.hashCode();
            int hashCode2 = this.inactiveOffers.hashCode();
            com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.referralcard.SingleCtaOfferUiData singleCtaOfferUiData = this.singleCtaOfferUiData;
            int hashCode3 = singleCtaOfferUiData == null ? 0 : singleCtaOfferUiData.hashCode();
            com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.inactiveoffercard.InactiveOfferCardUiData inactiveOfferCardUiData = this.ppdcCard;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (inactiveOfferCardUiData != null ? inactiveOfferCardUiData.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.earn.EarnSectionUiData.Content)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.earn.EarnSectionUiData.Content content = (com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.earn.EarnSectionUiData.Content) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.activeOfferSectionUiData, content.activeOfferSectionUiData) && kotlin.jvm.internal.Intrinsics.areEqual(this.inactiveOffers, content.inactiveOffers) && kotlin.jvm.internal.Intrinsics.areEqual(this.singleCtaOfferUiData, content.singleCtaOfferUiData) && kotlin.jvm.internal.Intrinsics.areEqual(this.ppdcCard, content.ppdcCard);
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.earn.EarnSectionUiData.Content copy(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffergallery.ActiveOfferSectionUiData activeOfferSectionUiData, java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.inactiveoffercard.InactiveOfferCardUiData> inactiveOffers, com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.referralcard.SingleCtaOfferUiData singleCtaOfferUiData, com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.inactiveoffercard.InactiveOfferCardUiData ppdcCard) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inactiveOffers, "");
            return new com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.earn.EarnSectionUiData.Content(activeOfferSectionUiData, inactiveOffers, singleCtaOfferUiData, ppdcCard);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.inactiveoffercard.InactiveOfferCardUiData getPpdcCard() {
            return this.ppdcCard;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.referralcard.SingleCtaOfferUiData getSingleCtaOfferUiData() {
            return this.singleCtaOfferUiData;
        }

        public final java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.inactiveoffercard.InactiveOfferCardUiData> component2() {
            return this.inactiveOffers;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffergallery.ActiveOfferSectionUiData getActiveOfferSectionUiData() {
            return this.activeOfferSectionUiData;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.earn.EarnSectionUiData.Content copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.earn.EarnSectionUiData.Content content, com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffergallery.ActiveOfferSectionUiData activeOfferSectionUiData, java.util.List list, com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.referralcard.SingleCtaOfferUiData singleCtaOfferUiData, com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.inactiveoffercard.InactiveOfferCardUiData inactiveOfferCardUiData, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activeOfferSectionUiData = content.activeOfferSectionUiData;
            }
            if ((i & 2) != 0) {
                list = content.inactiveOffers;
            }
            if ((i & 4) != 0) {
                singleCtaOfferUiData = content.singleCtaOfferUiData;
            }
            if ((i & 8) != 0) {
                inactiveOfferCardUiData = content.ppdcCard;
            }
            return content.copy(activeOfferSectionUiData, list, singleCtaOfferUiData, inactiveOfferCardUiData);
        }
    }
}
